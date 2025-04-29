
# Android Custom ListView App

An Android app demonstrating a custom ListView with images and dynamic user data using a custom adapter.

## Features

- Custom ListView using BaseAdapter
- ViewHolder pattern for performance
- Displays user data with images and text
- Clean and maintainable project structure

## Usage

The app populates a custom `ListView` using a list of `User` objects. Each row is rendered using a custom layout (`item.xml`) and adapted through `myAdapter.java`.

```java
myAdapter adapter = new myAdapter(this, userList);
listView.setAdapter(adapter);
```

## Files

- `MainActivity.java` – Launches and manages the UI
- `myAdapter.java` – Binds data to the ListView
- `User.java` – Model class for user info
- `ViewHolder.java` – Optimizes ListView performance
- `item.xml` – Layout for each list row
- `ListView_Overview.pdf` – [View explanation document](ListView_Overview.pdf)

