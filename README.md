# AndroidCleanArchitecture_Jetpack
ACC, Jetpack, DataBinding

데이터바인딩 장점

1. 앱 성능을 높인다.
2. findViewById()질을 없앨 수 있고, 코드를 간결하고 읽기 쉽게 만들어주며 유지보수성을 높인다.
3. 컴파일 시간에 에러를 인지할 수 있다.

데이터바인딩 하는 방법

1. 라이브러리 다운로드 : gradle.app에 android에 
    dataBinding{
      enabled = true
    }
    
2. 해당 액티비티or프래그먼트의 레이아웃xml에서 전체 코드를 <layout></layout>으로 감싼다.

3. ConstraintLayout의 xmlns를 layout으로 옮긴다

4. 데이터바인딩 파일은 해당 layout의 이름의 첫 글자 및 underBar다음 글자를 UpperCase하고 underBar를 제거한다. 그리고 맨 뒤에 Binding을 붙인다. 결국 activity_main은 ActivityMainBinding으로    데이터바인딩 파일을 관리한다.

5. 해당 레이아웃의 액티비티 클래스에 private lateinit var binding : ActivityMainBinding 선언을 한다.

6. 레이아웃의 View는 화면구성 measuerments에 따라서 inflated되고 만들어지지만, 데이터바인딩의 경우 이러한 setContentView(R.layout.레이아웃)가 필요없다. 대신 바인딩 object로 같은 일을 수행할    수 있으며 더 효과적이고 효율적인 방도를 낼 수 있다.

7. onCreate 생명주기의 setContentView(R.layout.blabla)을 binding = DataBindingUtil.setContentView(this, R.layout.레이아웃)
