# AndroidCleanArchitecture_Jetpack

21년 4월 중순까지 완성 할 예정 

데이터바인딩 장점

1. 앱 성능을 높인다.
2. findViewById()질을 없앨 수 있고, 코드를 간결하고 읽기 쉽게 만들어주며 유지보수성을 높인다.
3. 컴파일 시간에 에러를 인지할 수 있다.

데이터바인딩 하는 방법

1. 안스 4.1 미만 에서는 gradle.app에 android에
    dataBinding{
      enabled = true
    }
    
   4.1 이상에서는
    buildFeatures {
        dataBinding = true
    }
    
2. 해당 액티비티or프래그먼트의 레이아웃xml에서 전체 코드를 <layout></layout>으로 감싼다.

3. ConstraintLayout의 xmlns를 layout으로 옮긴다

4. 데이터바인딩 파일은 해당 layout의 이름의 첫 글자 및 underBar다음 글자를 UpperCase하고 underBar를 제거한다. 그리고 맨 뒤에 Binding을 붙인다. 결국 activity_main은 ActivityMainBinding으로    데이터바인딩 파일을 관리한다.

5. 해당 레이아웃의 액티비티 클래스에 private lateinit var binding : ActivityMainBinding 선언을 한다.

6. 레이아웃의 View는 화면구성 measuerments에 따라서 inflated되고 만들어지지만, 데이터바인딩의 경우 이러한 setContentView(R.layout.레이아웃)가 필요없다. 대신 바인딩 object로 같은 일을 수행할    수 있으며 더 효과적이고 효율적인 방도를 낼 수 있다.

7. onCreate 생명주기의 setContentView(R.layout.blabla)을 binding = DataBindingUtil.setContentView(this, R.layout.레이아웃)

8. 레이아웃xml의 각 컴포넌트의 id는 camel표기법으로 name_edit_text 이렇게 만들면 아까와 같이 nameEditText 이렇게 만들어진다.

9. 이렇게 하면 findViewById()를 안쓰고 setOnClickListener와 같은 이벤트를 binding.nameEditText.setOnClickListener로 쓸 수 있다.

10. 코틀린의 apply scoping 기능으로 dataBinding object의 반복을 없애줄 수 있다.

11. binding.apply{}로 binding. 을 쓰지않고 그냥 id만 쓸 수 있다.

Object DataBinding

1. data class를 생성하고 액티비티나 프래그먼트에 get 메소드를 생성
2. layout xml에 data variable을 만들고 name과 type(객체 경로)를 입력한다
3. 각 텍스트 및 버튼에 android:text="@{Object.name}"을 입력
4. 액티비티 및 프래그먼트에 binding.dataname(2번의 name)=getObject()를 입력하고 사용!
