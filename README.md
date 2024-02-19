<!-- AFLoading Library Documentation -->

<h1>AFLoading Library Documentation</h1>

<p>Welcome to the documentation for AFLoading, a custom loading library for Jetpack Compose in Android applications.</p>

<!-- Table of Contents -->

<h2>Table of Contents</h2>

<ol>
  <li><a href="#introduction">Introduction</a></li>
  <li><a href="#installation">Installation</a></li>
  <li><a href="#usage">Usage</a></li>
  <li><a href="#customization">Customization</a></li>
  <li><a href="#license">License</a></li>
</ol>

<!-- Introduction -->

<h2>Introduction</h2>

<p>AFLoading provides a customizable loading indicator for Jetpack Compose, allowing you to add visually appealing loading animations to your Android applications.</p>

<!-- Installation -->

<h2>Installation</h2>

<p>To integrate AFLoading into your project, add the following dependency to your app module's build.gradle file:</p>

<pre>
  <code>implementation 'com.ahmedfarouk:afloading:1.0.0'</code>
</pre>

<!-- Usage -->

<h2>Usage</h2>

<p>To use AFLoading in your Jetpack Compose project, import the library and include it in your Composable function:</p>

<pre>
  <code>
    import com.ahmedfarouk.afloading.AFLoading

    // ...

    AFLoading() // Add this inside your Composable function to display the loading indicator
  </code>
</pre>

<!-- Customization -->
<!-- Customizing Options -->

<h3>Customizing Options</h3>

<p>AFLoading offers a range of options for fine-tuning the layout and appearance of the loading animation:</p>

<!-- Modifier -->

<h4>Modifier</h4>

<p>Allows for customizing the layout of the loading animation using the Modifier class:</p>

<pre>
  <code>
    AFLoading(
        modifier: Modifier = Modifier,
    )
  </code>
</pre>

<!-- Circle Size -->

<h4>Circle Size</h4>

<p>Sets the size of each circle in the loading animation:</p>

<pre>
  <code>
     AFLoading(
        circleSize: Dp = 20.dp,
    )
  </code>
</pre>

<!-- Space Between Circles -->

<h4>Space Between Circles</h4>

<p>Determines the spacing between circles in the loading animation:</p>

<pre>
  <code>
      AFLoading(
          spaceBetween: Dp = 10.dp,
    )
    
  </code>
</pre>

<!-- Travel Distance -->

<h4>Travel Distance</h4>

<p>Defines the vertical travel distance of each circle during the animation cycle:</p>

<pre>
  <code>
      AFLoading(
          travelDistance: Dp = 20.dp,
    )
    
  </code>
</pre>

<!-- Animation Duration -->

<h4>Animation Duration</h4>

<p>Sets the duration of the animation cycle for each circle (in milliseconds):</p>

<pre>
  <code>
    AFLoading(
          animationDuration: Int = 1200,
    )
    
  </code>
</pre>

<!-- Delay Between Circles -->

<h4>Delay Between Circles</h4>

<p>Specifies the delay between the start of animations for consecutive circles (in milliseconds):</p>

<pre>
  <code>
       AFLoading(
          delayBetweenCircles: Int = 100,
    )
    
  </code>
</pre>

<!-- Circle Colors -->

<h4>Circle Colors</h4>

<p>Allows customization of the colors for each circle:</p>

<pre>
  <code>
       AFLoading(
          color1: Color = Color.Yellow,
          color2: Color = Color.Cyan,
          color3: Color = Color.White,
    )
    
  </code>
</pre>

<!-- Repeat Mode -->

<h4>Repeat Mode</h4>

<p>Determines the repeat mode for the animation cycle (e.g., Restart, Reverse):</p>

<pre>
  <code>
      AFLoading(
           repeatMode: RepeatMode = RepeatMode.Restart,
    )
    
  </code>
</pre>

<!-- Easing Function -->

<h4>Easing Function</h4>

<p>Specifies the easing function for the animation, affecting its acceleration and deceleration:</p>

<pre>
  <code>
        AFLoading(
            easing: Easing = LinearOutSlowInEasing,
    )
   
  </code>
</pre>

<p>Utilize these parameters judiciously to achieve a polished and tailored visual experience for your loading animation.</p>
