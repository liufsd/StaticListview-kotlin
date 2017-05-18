# StaticListview-kotlin
android static listview write by kotlin

## Features
*Easy create list for some static listview (recyclerview)
  
## Usage

 ```
    val staticListView: StaticListView = findViewById(R.id.demo_static_list) as StaticListView
        staticListView.config(Item("google", action = {
            showToast(it?.title)
        })
                , Item("github", action = {
            showToast(it?.title)
        })
                , Item("apple", action = {
            showToast(it?.title)
        })
                , Item("android", action = {
            showToast(it?.title)
        })
                , Item("kotlin", action = {
            showToast(it?.title)
        }))
        
 ```
 
 License
====================

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
