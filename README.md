



<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled is-u2f-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/frameworks-cb4ede7df6d8670c4051172e4d6bc6916b3c765fa15b4ee9b348f157fdb85114.css" integrity="sha256-y07effbYZwxAURcuTWvGkWs8dl+hW07ps0jxV/24URQ=" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-171d3f0f3e5bd93fdd10a9f389e058c1f415ee10ec550302a2b73c5aaf70ce2e.css" integrity="sha256-Fx0/Dz5b2T/dEKnzieBYwfQV7hDsVQMCorc8Wq9wzi4=" media="all" rel="stylesheet" />
    
    
    
    

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=device-width">
    
    <title>MultiImageSelector/README.md at master · yylxy/MultiImageSelector</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" href="/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="/apple-touch-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon-180x180.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="https://avatars0.githubusercontent.com/u/15137830?v=3&amp;s=400" name="twitter:image:src" /><meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="yylxy/MultiImageSelector" name="twitter:title" /><meta content="MultiImageSelector - Image selector for Android device. Support single choice and multi-choice." name="twitter:description" />
      <meta content="https://avatars0.githubusercontent.com/u/15137830?v=3&amp;s=400" property="og:image" /><meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="yylxy/MultiImageSelector" property="og:title" /><meta content="https://github.com/yylxy/MultiImageSelector" property="og:url" /><meta content="MultiImageSelector - Image selector for Android device. Support single choice and multi-choice." property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/MTUxMzc4MzA6M2JlYTAwMTNkMGVhNjczN2JkOWMzYjM3Yjk0NGVhZTk6MjBhNzZiMWQ1MzVmZTM1N2Y3MDk1OWJlNjA0YzkwZjY0ZGRmNGNhYTVlOGFhMGI4NWI4ZjljZTQ5YTJlNmJjMQ==--ebaafc0be3b8b721284664506e69b5c45e188c3f">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">
    <meta name="request-id" content="31491CE0:44F1:382D1A0:57FC58CE" data-pjax-transient>

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
<meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="31491CE0:44F1:382D1A0:57FC58CE" name="octolytics-dimension-request_id" /><meta content="15137830" name="octolytics-actor-id" /><meta content="yylxy" name="octolytics-actor-login" /><meta content="86a8d0e404b04090c8a0f62314aa2c0ee2f32cf6ef031d016293a887e0fdf4a0" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />



  <meta class="js-ga-set" name="dimension1" content="Logged In">



        <meta name="hostname" content="github.com">
    <meta name="user-login" content="yylxy">

        <meta name="expected-hostname" content="github.com">
      <meta name="js-proxy-site-detection-payload" content="NDEwMGYwYzU2OWZkZTc4OGU1ZjQzNmQ1ZmRjMWRhYTE2ZWYzODhhZjBmNDRkMzU3OTk3YTg0YTEzOWMzYWNhNnx7InJlbW90ZV9hZGRyZXNzIjoiNDkuNzMuMjguMjI0IiwicmVxdWVzdF9pZCI6IjMxNDkxQ0UwOjQ0RjE6MzgyRDFBMDo1N0ZDNThDRSIsInRpbWVzdGFtcCI6MTQ3NjE1NTYwMn0=">


      <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <meta name="html-safe-nonce" content="914c33d713943ee0b51a6eed59e02b70c3bb6dbf">
    <meta content="b058cb429569492345337d25c5a0f3ffe8cc3805" name="form-nonce" />

    <meta http-equiv="x-pjax-version" content="fc43a450baafe7df8853ee9955e65e72">
    

      
  <meta name="description" content="MultiImageSelector - Image selector for Android device. Support single choice and multi-choice.">
  <meta name="go-import" content="github.com/yylxy/MultiImageSelector git https://github.com/yylxy/MultiImageSelector.git">

  <meta content="15137830" name="octolytics-dimension-user_id" /><meta content="yylxy" name="octolytics-dimension-user_login" /><meta content="67626075" name="octolytics-dimension-repository_id" /><meta content="yylxy/MultiImageSelector" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="true" name="octolytics-dimension-repository_is_fork" /><meta content="33599546" name="octolytics-dimension-repository_parent_id" /><meta content="lovetuzitong/MultiImageSelector" name="octolytics-dimension-repository_parent_nwo" /><meta content="33599546" name="octolytics-dimension-repository_network_root_id" /><meta content="lovetuzitong/MultiImageSelector" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/yylxy/MultiImageSelector/commits/master.atom" rel="alternate" title="Recent Commits to MultiImageSelector:master" type="application/atom+xml">


      <link rel="canonical" href="https://github.com/yylxy/MultiImageSelector/blob/master/README.md" data-pjax-transient>
  </head>


  <body class="logged-in  env-production windows vis-public fork page-blob">
    <div id="js-pjax-loader-bar" class="pjax-loader-bar"><div class="progress"></div></div>
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>

    
    
    



        <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <svg aria-hidden="true" class="octicon octicon-mark-github" height="28" version="1.1" viewBox="0 0 16 16" width="28"><path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>


        <div class="header-search scoped-search site-scoped-search js-site-search" role="search">
  <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/search" class="js-site-search-form" data-scoped-search-url="/yylxy/MultiImageSelector/search" data-unscoped-search-url="/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <label class="form-control header-search-wrapper js-chromeless-input-container">
      <div class="header-search-scope">This repository</div>
      <input type="text"
        class="form-control header-search-input js-site-search-focus js-site-search-field is-clearable"
        data-hotkey="s"
        name="q"
        placeholder="Search"
        aria-label="Search this repository"
        data-unscoped-placeholder="Search GitHub"
        data-scoped-placeholder="Search"
        autocapitalize="off">
    </label>
</form></div>


      <ul class="header-nav float-left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" aria-label="Pull requests you created" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" aria-label="Issues you created" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav float-right" id="user-links">
  <li class="header-nav-item">
    
    <a href="/notifications" aria-label="You have no unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s js-socket-channel js-notification-indicator" data-channel="tenant:1:notification-changed:15137830" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
        <span class="mail-status "></span>
        <svg aria-hidden="true" class="octicon octicon-bell" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 12v1H0v-1l.73-.58c.77-.77.81-2.55 1.19-4.42C2.69 3.23 6 2 6 2c0-.55.45-1 1-1s1 .45 1 1c0 0 3.39 1.23 4.16 5 .38 1.88.42 3.66 1.19 4.42l.66.58H14zm-7 4c1.11 0 2-.89 2-2H5c0 1.11.89 2 2 2z"></path></svg>
</a>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <svg aria-hidden="true" class="octicon octicon-plus float-left" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 9H7v5H5V9H0V7h5V2h2v5h5z"></path></svg>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a class="dropdown-item" href="/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="yylxy/MultiImageSelector">This repository</span>
  </div>
    <a class="dropdown-item" href="/yylxy/MultiImageSelector/settings/collaboration" data-ga-click="Header, create new collaborator">
      New collaborator
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-sw js-menu-target" href="/yylxy"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@yylxy" class="avatar" height="20" src="https://avatars3.githubusercontent.com/u/15137830?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu dropdown-menu-sw">
        <div class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">yylxy</strong>
        </div>

        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/yylxy" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a>
        <a class="dropdown-item" href="/yylxy?tab=stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
          <a class="dropdown-item" href="/integrations" data-ga-click="Header, go to integrations, text:integrations">
            Integrations
          </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>


        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a>

        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="/x2iTUtsJHujafVS1DZyHHaZreX6vhOEWjwFw6KXE+DXd2h6FoAbB4A9A9rDLIg/yqznM3mF7J9sXIui9r4ZnA==" /></div>
          <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>


      


    <div id="start-of-content" class="accessibility-aid"></div>

      <div id="js-flash-container">
</div>


    <div role="main">
        <div itemscope itemtype="http://schema.org/SoftwareSourceCode">
    <div id="js-repo-pjax-container" data-pjax-container>
      
<div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav">
  <div class="container repohead-details-container">

    

<ul class="pagehead-actions">

  <li>
        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="/zhzbm2eFUGKGDi5MVF7G/9/oYnHzA5rRSBUuEAH8rYa9zAdEnM+3Ja65pxo0ZxtR2rQFUzq7kgcLKG89uujxQ==" /></div>      <input class="form-control" id="repository_id" name="repository_id" type="hidden" value="67626075" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/yylxy/MultiImageSelector/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
              <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg>
              Unwatch
            </span>
          </a>
          <a class="social-count js-social-count"
            href="/yylxy/MultiImageSelector/watchers"
            aria-label="1 user is watching this repository">
            1
          </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header js-navigation-enable" tabindex="-1">
              <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
                  <div class="select-menu-item-text">
                    <input id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg>
                      Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-mute" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8 2.81v10.38c0 .67-.81 1-1.28.53L3 10H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h2l3.72-3.72C7.19 1.81 8 2.14 8 2.81zm7.53 3.22l-1.06-1.06-1.97 1.97-1.97-1.97-1.06 1.06L11.44 8 9.47 9.97l1.06 1.06 1.97-1.97 1.97 1.97 1.06-1.06L13.56 8l1.97-1.97z"></path></svg>
                      Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/unstar" class="starred" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="VfXbGmLqhCHTK1H3IgSi3S/TtkZ3EObf0+7DYbtsUd0TemXfP9liAXz1Rw7ChrN7VbUVwr6U9VIkSes3a8k4Mg==" /></div>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar yylxy/MultiImageSelector"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"></path></svg>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/yylxy/MultiImageSelector/stargazers"
           aria-label="0 users starred this repository">
          0
        </a>
</form>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/star" class="unstarred" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="Vtlqp7pYwYnAeGGP2ojXnmFk4zpW5UZTPdPAHUUyrdEDNP9DhaFVdkc2jY60sJ7FFQCjPSIcEhRdwbjZSCwF/g==" /></div>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star yylxy/MultiImageSelector"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"></path></svg>
        Star
      </button>
        <a class="social-count js-social-count" href="/yylxy/MultiImageSelector/stargazers"
           aria-label="0 users starred this repository">
          0
        </a>
</form>  </div>

  </li>

  <li>
          <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/fork" class="btn-with-count" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="+82Tq3CukB7BGg1yNXJSKT7qf0ANTBp1YZsFOE8JwraIZ0EXjy+nrxEHIoKGF9322d7dML+CeTrgEemMAHpi2g==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of yylxy/MultiImageSelector to your account"
                aria-label="Fork your own copy of yylxy/MultiImageSelector to your account">
              <svg aria-hidden="true" class="octicon octicon-repo-forked" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
              Fork
            </button>
</form>
    <a href="/yylxy/MultiImageSelector/network" class="social-count"
       aria-label="593 users are forked this repository">
      593
    </a>
  </li>
</ul>

    <h1 class="public ">
  <svg aria-hidden="true" class="octicon octicon-repo-forked" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
  <span class="author" itemprop="author"><a href="/yylxy" class="url fn" rel="author">yylxy</a></span><!--
--><span class="path-divider">/</span><!--
--><strong itemprop="name"><a href="/yylxy/MultiImageSelector" data-pjax="#js-repo-pjax-container">MultiImageSelector</a></strong>

    <span class="fork-flag">
      <span class="text">forked from <a href="/lovetuzitong/MultiImageSelector">lovetuzitong/MultiImageSelector</a></span>
    </span>
</h1>

  </div>
  <div class="container">
    
<nav class="reponav js-repo-nav js-sidenav-container-pjax"
     itemscope
     itemtype="http://schema.org/BreadcrumbList"
     role="navigation"
     data-pjax="#js-repo-pjax-container">

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/yylxy/MultiImageSelector" aria-selected="true" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /yylxy/MultiImageSelector" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-code" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M9.5 3L8 4.5 11.5 8 8 11.5 9.5 13 14 8 9.5 3zm-5 0L0 8l4.5 5L6 11.5 2.5 8 6 4.5 4.5 3z"></path></svg>
      <span itemprop="name">Code</span>
      <meta itemprop="position" content="1">
</a>  </span>


  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/yylxy/MultiImageSelector/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /yylxy/MultiImageSelector/pulls" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-git-pull-request" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M11 11.28V5c-.03-.78-.34-1.47-.94-2.06C9.46 2.35 8.78 2.03 8 2H7V0L4 3l3 3V4h1c.27.02.48.11.69.31.21.2.3.42.31.69v6.28A1.993 1.993 0 0 0 10 15a1.993 1.993 0 0 0 1-3.72zm-1 2.92c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zM4 3c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v6.56A1.993 1.993 0 0 0 2 15a1.993 1.993 0 0 0 1-3.72V4.72c.59-.34 1-.98 1-1.72zm-.8 10c0 .66-.55 1.2-1.2 1.2-.65 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
      <span itemprop="name">Pull requests</span>
      <span class="counter">0</span>
      <meta itemprop="position" content="3">
</a>  </span>

  <a href="/yylxy/MultiImageSelector/projects" class="js-selected-navigation-item reponav-item" data-selected-links="repo_projects new_repo_project repo_project /yylxy/MultiImageSelector/projects">
    <svg class="octicon" aria-hidden="true" version="1.1" width="15" height="16" viewBox="0 0 15 16">
      <path d="M1 15h13V1H1v14zM15 1v14a1 1 0 0 1-1 1H1a1 1 0 0 1-1-1V1a1 1 0 0 1 1-1h13a1 1 0 0 1 1 1zm-4.41 11h1.82c.59 0 .59-.41.59-1V3c0-.59 0-1-.59-1h-1.82C10 2 10 2.41 10 3v8c0 .59 0 1 .59 1zm-4-2h1.82C9 10 9 9.59 9 9V3c0-.59 0-1-.59-1H6.59C6 2 6 2.41 6 3v6c0 .59 0 1 .59 1zM2 13V3c0-.59 0-1 .59-1h1.82C5 2 5 2.41 5 3v10c0 .59 0 1-.59 1H2.59C2 14 2 13.59 2 13z"></path>
    </svg>
    Projects
    <span class="counter">0</span>
</a>
    <a href="/yylxy/MultiImageSelector/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /yylxy/MultiImageSelector/wiki">
      <svg aria-hidden="true" class="octicon octicon-book" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M3 5h4v1H3V5zm0 3h4V7H3v1zm0 2h4V9H3v1zm11-5h-4v1h4V5zm0 2h-4v1h4V7zm0 2h-4v1h4V9zm2-6v9c0 .55-.45 1-1 1H9.5l-1 1-1-1H2c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1h5.5l1 1 1-1H15c.55 0 1 .45 1 1zm-8 .5L7.5 3H2v9h6V3.5zm7-.5H9.5l-.5.5V12h6V3z"></path></svg>
      Wiki
</a>

  <a href="/yylxy/MultiImageSelector/pulse" class="js-selected-navigation-item reponav-item" data-selected-links="pulse /yylxy/MultiImageSelector/pulse">
    <svg aria-hidden="true" class="octicon octicon-pulse" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M11.5 8L8.8 5.4 6.6 8.5 5.5 1.6 2.38 8H0v2h3.6l.9-1.8.9 5.4L9 8.5l1.6 1.5H14V8z"></path></svg>
    Pulse
</a>
  <a href="/yylxy/MultiImageSelector/graphs" class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors /yylxy/MultiImageSelector/graphs">
    <svg aria-hidden="true" class="octicon octicon-graph" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M16 14v1H0V0h1v14h15zM5 13H3V8h2v5zm4 0H7V3h2v10zm4 0h-2V6h2v7z"></path></svg>
    Graphs
</a>
    <a href="/yylxy/MultiImageSelector/settings" class="js-selected-navigation-item reponav-item" data-selected-links="repo_settings repo_branch_settings hooks integration_installations /yylxy/MultiImageSelector/settings">
      <svg aria-hidden="true" class="octicon octicon-gear" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 8.77v-1.6l-1.94-.64-.45-1.09.88-1.84-1.13-1.13-1.81.91-1.09-.45-.69-1.92h-1.6l-.63 1.94-1.11.45-1.84-.88-1.13 1.13.91 1.81-.45 1.09L0 7.23v1.59l1.94.64.45 1.09-.88 1.84 1.13 1.13 1.81-.91 1.09.45.69 1.92h1.59l.63-1.94 1.11-.45 1.84.88 1.13-1.13-.92-1.81.47-1.09L14 8.75v.02zM7 11c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"></path></svg>
      Settings
</a>
</nav>

  </div>
</div>

<div class="container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    

<a href="/yylxy/MultiImageSelector/blob/bed718f773a637d6f3c6e6bd8ac316cd03404b8f/README.md" class="d-none js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:29a5255e9e5fa5d90797fe96ef65e432 -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu branch-select-menu js-menu-container js-select-menu float-left">
  <button class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    
    type="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="form-control js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Find or create a branch…" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/yylxy/MultiImageSelector/blob/master/README.md"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text">
                master
              </span>
            </a>
        </div>

          <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="2hPMYK1S6cn8ehyjDpucfgGwDjpqfWgSKe/m3xYmAk4xrtcM0MUoHeXWf+fJwwVCt5BwdFZV5j2BskV8MJg2Vg==" /></div>
          <svg aria-hidden="true" class="octicon octicon-git-branch select-menu-item-icon" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path d="M10 5c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v.3c-.02.52-.23.98-.63 1.38-.4.4-.86.61-1.38.63-.83.02-1.48.16-2 .45V4.72a1.993 1.993 0 0 0-1-3.72C.88 1 0 1.89 0 3a2 2 0 0 0 1 1.72v6.56c-.59.35-1 .99-1 1.72 0 1.11.89 2 2 2 1.11 0 2-.89 2-2 0-.53-.2-1-.53-1.36.09-.06.48-.41.59-.47.25-.11.56-.17.94-.17 1.05-.05 1.95-.45 2.75-1.25S8.95 7.77 9 6.73h-.02C9.59 6.37 10 5.73 10 5zM2 1.8c.66 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2C1.35 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2zm0 12.41c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm6-8c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
            <div class="select-menu-item-text">
              <span class="select-menu-item-heading">Create branch: <span class="js-new-item-name"></span></span>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master">
            <input type="hidden" name="path" id="path" value="README.md">
</form>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/yylxy/MultiImageSelector/tree/1.2/README.md"
              data-name="1.2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="1.2">
                1.2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/yylxy/MultiImageSelector/tree/1.1/README.md"
              data-name="1.1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="1.1">
                1.1
              </span>
            </a>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="BtnGroup float-right">
    <a href="/yylxy/MultiImageSelector/find/master"
          class="js-pjax-capture-input btn btn-sm BtnGroup-item"
          data-pjax
          data-hotkey="t">
      Find file
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm BtnGroup-item tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
  </div>
  <div class="breadcrumb js-zeroclipboard-target">
    <span class="repo-root js-repo-root"><span class="js-path-segment"><a href="/yylxy/MultiImageSelector"><span>MultiImageSelector</span></a></span></span><span class="separator">/</span><strong class="final-path">README.md</strong>
  </div>
</div>


  <div class="commit-tease">
      <span class="float-right">
        <a class="commit-tease-sha" href="/yylxy/MultiImageSelector/commit/bed718f773a637d6f3c6e6bd8ac316cd03404b8f" data-pjax>
          bed718f
        </a>
        <relative-time datetime="2016-06-30T03:59:23Z">Jun 30, 2016</relative-time>
      </span>
      <div>
        <img alt="@lovetuzitong" class="avatar" height="20" src="https://avatars3.githubusercontent.com/u/2021828?v=3&amp;s=40" width="20" />
        <a href="/lovetuzitong" class="user-mention" rel="contributor">lovetuzitong</a>
          <a href="/yylxy/MultiImageSelector/commit/bed718f773a637d6f3c6e6bd8ac316cd03404b8f" class="message" data-pjax="true" title="update README">update README</a>
      </div>

    <div class="commit-tease-contributors">
      <button type="button" class="btn-link muted-link contributors-toggle" data-facebox="#blob_contributors_box">
        <strong>1</strong>
         contributor
      </button>
      
    </div>

    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header" data-facebox-id="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list" data-facebox-id="facebox-description">
          <li class="facebox-user-list-item">
            <img alt="@lovetuzitong" height="24" src="https://avatars1.githubusercontent.com/u/2021828?v=3&amp;s=48" width="24" />
            <a href="/lovetuzitong">lovetuzitong</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
  <div class="file-actions">

    <div class="BtnGroup">
      <a href="/yylxy/MultiImageSelector/raw/master/README.md" class="btn btn-sm BtnGroup-item" id="raw-url">Raw</a>
        <a href="/yylxy/MultiImageSelector/blame/master/README.md" class="btn btn-sm js-update-url-with-hash BtnGroup-item">Blame</a>
      <a href="/yylxy/MultiImageSelector/commits/master/README.md" class="btn btn-sm BtnGroup-item" rel="nofollow">History</a>
    </div>

        <a class="btn-octicon tooltipped tooltipped-nw"
           href="https://windows.github.com"
           aria-label="Open this file in GitHub Desktop"
           data-ga-click="Repository, open with desktop, type:windows">
            <svg aria-hidden="true" class="octicon octicon-device-desktop" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M15 2H1c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h5.34c-.25.61-.86 1.39-2.34 2h8c-1.48-.61-2.09-1.39-2.34-2H15c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm0 9H1V3h14v8z"></path></svg>
        </a>

        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/edit/master/README.md" class="inline-form js-update-url-with-hash" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="sUFRaHUgMMHuuqMiMQTX/PkZ0Lfo9UkH4pZ2OZ/R4rdP7JCTn7DjGUec7aX+RADovPbA+siHzdgE778f7Q3Gtw==" /></div>
          <button class="btn-octicon tooltipped tooltipped-nw" type="submit"
            aria-label="Edit this file" data-hotkey="e" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-pencil" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M0 12v3h3l8-8-3-3-8 8zm3 2H1v-2h1v1h1v1zm10.3-9.3L12 6 9 3l1.3-1.3a.996.996 0 0 1 1.41 0l1.59 1.59c.39.39.39 1.02 0 1.41z"></path></svg>
          </button>
</form>        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/yylxy/MultiImageSelector/delete/master/README.md" class="inline-form" data-form-nonce="b058cb429569492345337d25c5a0f3ffe8cc3805" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="uVQFvRkgC2peJlXOQVHZ27fCdauogmaX0E4vr8vsOA3akBOjydnBolCnBtHKxmhehL51FC44NXapmqlJaqV2cQ==" /></div>
          <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Delete this file" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-trashcan" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M11 2H9c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1H2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1v9c0 .55.45 1 1 1h7c.55 0 1-.45 1-1V5c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm-1 12H3V5h1v8h1V5h1v8h1V5h1v8h1V5h1v9zm1-10H2V3h9v1z"></path></svg>
          </button>
</form>  </div>

  <div class="file-info">
      192 lines (154 sloc)
      <span class="file-info-divider"></span>
    6.09 KB
  </div>
</div>

  
  <div id="readme" class="readme blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="text"><h1><a id="user-content-multiimageselector" class="anchor" href="#multiimageselector" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>MultiImageSelector</h1>

<p>Image selector for Android device. Support single choice and multi-choice.</p>

<p><a href="https://jitpack.io/#lovetuzitong/MultiImageSelector"><img src="https://camo.githubusercontent.com/ff577938294cf274430442c2641a1bc893f981b7/68747470733a2f2f6a69747061636b2e696f2f762f6c6f766574757a69746f6e672f4d756c7469496d61676553656c6563746f722e737667" alt="" data-canonical-src="https://jitpack.io/v/lovetuzitong/MultiImageSelector.svg" style="max-width:100%;"></a></p>

<p><a href="/yylxy/MultiImageSelector/blob/master/README_zh.md">中文文档</a></p>

<h3><a id="user-content-art" class="anchor" href="#art" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>ART</h3>

<p><a href="/yylxy/MultiImageSelector/blob/master/art/example_1.png" target="_blank"><img src="/yylxy/MultiImageSelector/raw/master/art/example_1.png" alt="Example1" style="max-width:100%;"></a> <a href="/yylxy/MultiImageSelector/blob/master/art/select_1.png" target="_blank"><img src="/yylxy/MultiImageSelector/raw/master/art/select_1.png" alt="Select1" style="max-width:100%;"></a> <a href="/yylxy/MultiImageSelector/blob/master/art/select_2.png" target="_blank"><img src="/yylxy/MultiImageSelector/raw/master/art/select_2.png" alt="Select2" style="max-width:100%;"></a> <a href="/yylxy/MultiImageSelector/blob/master/art/select_3.png" target="_blank"><img src="/yylxy/MultiImageSelector/raw/master/art/select_3.png" alt="Select3" style="max-width:100%;"></a></p>

<hr>

<h3><a id="user-content-run-demo" class="anchor" href="#run-demo" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Run Demo</h3>

<blockquote>
<p>./gradlew installDebug</p>
</blockquote>

<h3><a id="user-content-quick-start" class="anchor" href="#quick-start" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Quick Start</h3>

<ul>
<li>Step 0
Add module <code>multi-image-selector</code> as your dependence. in your <code>build.gradle</code> :</li>
</ul>

<div class="highlight highlight-source-java"><pre>repositories {
    maven { url <span class="pl-s"><span class="pl-pds">"</span>https://jitpack.io<span class="pl-pds">"</span></span> }
}

dependencies {
    compile <span class="pl-s"><span class="pl-pds">'</span>com.github.lovetuzitong:MultiImageSelector:1.2<span class="pl-pds">'</span></span>
}</pre></div>

<ul>
<li>Step 1 
Set your <code>AndroidManifest.xml</code> as below:</li>
</ul>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">uses-permission</span> <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>android.permission.READ_EXTERNAL_STORAGE<span class="pl-pds">"</span></span> /&gt;
&lt;<span class="pl-ent">uses-permission</span> <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>android.permission.WRITE_EXTERNAL_STORAGE<span class="pl-pds">"</span></span> /&gt;

&lt;<span class="pl-ent">application</span>

    ...

    &lt;!--Image Selector Entry--&gt;
    &lt;<span class="pl-ent">activity</span>
        <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">configChanges</span>=<span class="pl-s"><span class="pl-pds">"</span>orientation|screenSize<span class="pl-pds">"</span></span>
        <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>me.nereo.multi_image_selector.MultiImageSelectorActivity<span class="pl-pds">"</span></span> /&gt;
&lt;/<span class="pl-ent">application</span>&gt;</pre></div>

<ul>
<li>Step 2
Call image selector simplest in your code, eg. ( From <code>version-1.1</code> )</li>
</ul>

<div class="highlight highlight-source-java"><pre><span class="pl-c">// Multi image selector form an Activity</span>
<span class="pl-smi">MultiImageSelector</span><span class="pl-k">.</span>create(<span class="pl-smi">Context</span>)
        .start(<span class="pl-smi">Activity</span>, <span class="pl-c1">REQUEST_IMAGE</span>);</pre></div>

<p>Detail Api.</p>

<div class="highlight highlight-source-java"><pre><span class="pl-smi">MultiImageSelector</span><span class="pl-k">.</span>create(<span class="pl-smi">Context</span>)
        .showCamera(<span class="pl-k">boolean</span>) <span class="pl-c">// show camera or not. true by default</span>
        .count(<span class="pl-k">int</span>) <span class="pl-c">// max select image size, 9 by default. used width #.multi()</span>
        .single() <span class="pl-c">// single mode</span>
        .multi() <span class="pl-c">// multi mode, default mode;</span>
        .origin(<span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span>) <span class="pl-c">// original select data set, used width #.multi()</span>
        .start(<span class="pl-smi">Activity</span><span class="pl-k">/</span><span class="pl-smi">Fragment</span>, <span class="pl-c1">REQUEST_IMAGE</span>);</pre></div>

<p>Also support traditional <code>Intent</code> :</p>

<div class="highlight highlight-source-java"><pre><span class="pl-smi">Intent</span> intent <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Intent</span>(mContext, <span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-k">.</span>class);
<span class="pl-c">// whether show camera</span>
intent<span class="pl-k">.</span>putExtra(<span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_SHOW_CAMERA</span>, <span class="pl-c1">true</span>);
<span class="pl-c">// max select image amount</span>
intent<span class="pl-k">.</span>putExtra(<span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_SELECT_COUNT</span>, <span class="pl-c1">9</span>);
<span class="pl-c">// select mode (MultiImageSelectorActivity.MODE_SINGLE OR MultiImageSelectorActivity.MODE_MULTI)</span>
intent<span class="pl-k">.</span>putExtra(<span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_SELECT_MODE</span>, <span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-c1"><span class="pl-k">.</span>MODE_MULTI</span>);
<span class="pl-c">// default select images (support array list)</span>
intent<span class="pl-k">.</span>putStringArrayListExtra(<span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_DEFAULT_SELECTED_LIST</span>, defaultDataArray);
startActivityForResult(intent, <span class="pl-c1">REQUEST_IMAGE</span>);</pre></div>

<ul>
<li>Step 3
Receive result in your <code>onActivityResult</code> Method. eg.</li>
</ul>

<div class="highlight highlight-source-java"><pre><span class="pl-k">@Override</span>
<span class="pl-k">protected</span> <span class="pl-k">void</span> onActivityResult(<span class="pl-k">int</span> requestCode, <span class="pl-k">int</span> resultCode, <span class="pl-smi">Intent</span> data) {
    <span class="pl-v">super</span><span class="pl-k">.</span>onActivityResult(requestCode, resultCode, data);
    <span class="pl-k">if</span>(requestCode <span class="pl-k">==</span> <span class="pl-c1">REQUEST_IMAGE</span>){
        <span class="pl-k">if</span>(resultCode <span class="pl-k">==</span> <span class="pl-c1">RESULT_OK</span>){
            <span class="pl-c">// Get the result list of select image paths</span>
            <span class="pl-k">List&lt;<span class="pl-smi">String</span>&gt;</span> path <span class="pl-k">=</span> data<span class="pl-k">.</span>getStringArrayListExtra(<span class="pl-smi">MultiImageSelectorActivity</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_RESULT</span>);
            <span class="pl-c">// do your logic ....</span>
        }
    }
}</pre></div>

<ul>
<li>Step 4
No more steps, just enjoy. :)</li>
</ul>

<hr>

<h3><a id="user-content-custom-activity-style" class="anchor" href="#custom-activity-style" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Custom Activity Style</h3>

<ul>
<li>Custome your own Activity</li>
</ul>

<div class="highlight highlight-source-java"><pre><span class="pl-k">class</span> <span class="pl-en">CustomerActivity</span> <span class="pl-k">extends</span> <span class="pl-e">Activity</span> <span class="pl-k">implements</span> <span class="pl-e">MultiImageSelectorFragment</span>.<span class="pl-e">Callback</span>{
    <span class="pl-k">@Override</span>
    <span class="pl-k">protected</span> <span class="pl-k">void</span> <span class="pl-en">onCreate</span>(<span class="pl-smi">Bundle</span> <span class="pl-v">savedInstanceState</span>) {
        <span class="pl-c">// customer logic here...</span>
        <span class="pl-smi">Bundle</span> bundle <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Bundle</span>();
        bundle<span class="pl-k">.</span>putInt(<span class="pl-smi">MultiImageSelectorFragment</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_SELECT_COUNT</span>, mDefaultCount);
        bundle<span class="pl-k">.</span>putInt(<span class="pl-smi">MultiImageSelectorFragment</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_SELECT_MODE</span>, mode);
        bundle<span class="pl-k">.</span>putBoolean(<span class="pl-smi">MultiImageSelectorFragment</span><span class="pl-c1"><span class="pl-k">.</span>EXTRA_SHOW_CAMERA</span>, isShow);
        <span class="pl-c">// Add fragment to your Activity</span>
        getSupportFragmentManager()<span class="pl-k">.</span>beginTransaction()
                .add(<span class="pl-smi">R</span><span class="pl-k">.</span>id<span class="pl-k">.</span>image_grid, <span class="pl-smi">Fragment</span><span class="pl-k">.</span>instantiate(<span class="pl-v">this</span>, <span class="pl-smi">MultiImageSelectorFragment</span><span class="pl-k">.</span>class<span class="pl-k">.</span>getName(), bundle))
                .commit();
    }
    <span class="pl-k">@Override</span>
    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">onSingleImageSelected</span>(<span class="pl-smi">String</span> <span class="pl-v">path</span>) {
        <span class="pl-c">// When select mode set to MODE_SINGLE, this method will received result from fragment</span>
    }

    <span class="pl-k">@Override</span>
    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">onImageSelected</span>(<span class="pl-smi">String</span> <span class="pl-v">path</span>) {
        <span class="pl-c">// You can specify your ActionBar behavior here </span>
    }

    <span class="pl-k">@Override</span>
    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">onImageUnselected</span>(<span class="pl-smi">String</span> <span class="pl-v">path</span>) {
        <span class="pl-c">// You can specify your ActionBar behavior here </span>
    }

    <span class="pl-k">@Override</span>
    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">onCameraShot</span>(<span class="pl-smi">File</span> <span class="pl-v">imageFile</span>) {
        <span class="pl-c">// When user take phone by camera, this method will be called.</span>
    }
}</pre></div>

<ul>
<li>Take a glance of <code>MultiImageSelectorActivity.java</code></li>
</ul>

<hr>

<h3><a id="user-content-change-log" class="anchor" href="#change-log" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Change Log</h3>

<ul>
<li><p>2016-5-18</p>

<ol>
<li>Added. <code>JitPack</code> support</li>
<li>Added. Convenient way to call image selector. See <code>Step 2</code></li>
<li>Fixed. Some NPE.</li>
</ol></li>
<li><p>2016-1-19</p>

<ol>
<li>Fixed. cannot load some 0-size image</li>
<li>Added. When take a new photo, notify media scanner</li>
<li>Fixed. Can't take photo on RED-MI</li>
<li>Fixed. Performance when show Camera-Icon</li>
</ol></li>
<li><p>2015-5-5</p>

<ol>
<li>Fixed. Can't display some images. (Issue by<a href="https://github.com/sd6352051">sd6352051</a>, <a href="https://github.com/18611480882">larry</a>)</li>
<li>Fixed. <code>ListPopupWindow</code> can not fill parent</li>
<li>Added. Add checked mask.</li>
</ol></li>
<li><p>2015-4-16</p>

<ol>
<li>Fixed. Crack when rotate device. (Issue by <a href="https://github.com/Leminity">@Leminity</a>)</li>
<li>Fixed. PopupListView position error. (Issue by <a href="https://github.com/Slock">@Slock</a>)</li>
<li>Change. Demo application shortcut.</li>
<li>Change. Readme file.</li>
</ol></li>
<li><p>2015-4-9</p>

<ol>
<li>Fixed. When set <code>EXTRA_SHOW_CAMERA</code> to <code>true</code>, the first grid item onclick event were messed.</li>
<li>Add. Support initial selected image list.</li>
</ol></li>
</ul>

<hr>

<h3><a id="user-content-thanks" class="anchor" href="#thanks" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Thanks</h3>

<ul>
<li><a href="https://github.com/square/picasso">square-picasso</a> A powerful image downloading and caching library for Android </li>
</ul>

<hr>

<h3><a id="user-content-license" class="anchor" href="#license" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>License</h3>

<blockquote>
<p>The MIT License (MIT)</p>

<p>Copyright (c) 2015 Nereo</p>

<p>Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:</p>

<p>The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.</p>
</blockquote>
</article>
  </div>

</div>

<button type="button" data-facebox="#jump-to-line" data-facebox-class="linejump" data-hotkey="l" class="d-none">Jump to Line</button>
<div id="jump-to-line" style="display:none">
  <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="form-control linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

  </div>
  <div class="modal-backdrop js-touch-events"></div>
</div>


    </div>
  </div>

    </div>

        <div class="container site-footer-container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links float-right">
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact GitHub</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage" class="site-footer-mark" title="GitHub">
      <svg aria-hidden="true" class="octicon octicon-mark-github" height="24" version="1.1" viewBox="0 0 16 16" width="24"><path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2016 <span title="0.08314s from github-fe158-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



    

    <div id="ajax-error-message" class="ajax-error-message flash flash-error">
      <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"></path></svg>
      <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
      </button>
      You can't perform that action at this time.
    </div>


      
      <script crossorigin="anonymous" integrity="sha256-u8ByW3Q46gf3lKMTt8lghhPBANPkJ7NpsnoMo37E37w=" src="https://assets-cdn.github.com/assets/frameworks-bbc0725b7438ea07f794a313b7c9608613c100d3e427b369b27a0ca37ec4dfbc.js"></script>
      <script async="async" crossorigin="anonymous" integrity="sha256-PXu924XPoLit0LXTJLIDib8M+UnB8jQ2Yrvb0FeYMyA=" src="https://assets-cdn.github.com/assets/github-3d7bbddb85cfa0b8add0b5d324b20389bf0cf949c1f2343662bbdbd057983320.js"></script>
      
      
      
      
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none">
      <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"></path></svg>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
    <div class="facebox" id="facebox" style="display:none;">
  <div class="facebox-popup">
    <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
    </div>
    <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
      <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
    </button>
  </div>
</div>

  </body>
</html>

