/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private static String userHomeDirectory;
    static java.lang.reflect.Method setFocusCycleRootMethod;
    LimitedRandomAccessFile masterCacheIndexFile;
    private PlatformTask taskQueueHead;
    java.awt.EventQueue systemEventQueue;
    static String javaVersion;
    private PlatformTask taskQueueTail;
    LimitedRandomAccessFile randomSeedFile;
    private static volatile long networkBlockedUntilMillis;
    private Object reflectiveCursorBackend;
    private DirectDrawFullscreenController microsoftFullscreenBackend;
    private static int cacheVariant;
    LimitedRandomAccessFile cacheDataFile;
    LimitedRandomAccessFile[] cacheIndexFiles;
    private Thread workerThread;
    static String osNameLowerCase;
    private boolean privilegedServicesEnabled;
    static String javaVendor;
    private Object reflectiveFullscreenBackend;
    private WindowsCursorController microsoftCursorBackend;
    private boolean useMicrosoftVmBackend;
    private boolean shutdownRequested;
    private static String gameCacheName;
    private static String osName;

    final PlatformTask requestDisplayModes(int guard) {
        if (guard != 34) {
            String unusedPreferencesSuffix = (String) null;
            PlatformTaskDispatcher.openPreferencesFile((byte) 23, 7, (String) null, (String) null);
        }
        return this.enqueueTask(1, (Object) null, 0, 5, 0);
    }

    final PlatformTask requestExitFullscreen(java.awt.Frame frame, int guard) {
        if (guard != 0) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(1, frame, 0, 7, 0);
    }

    final boolean hasFullscreenSupport(int guard) {
        if (guard != -26098) {
            return false;
        }
        if (!this.privilegedServicesEnabled) {
            return false;
        }
        if (!this.useMicrosoftVmBackend) {
            return null != this.reflectiveFullscreenBackend ? true : false;
        }
        return this.microsoftFullscreenBackend != null ? true : false;
    }

    public final void run() {
        try {
            int urlCharacterIndex = 0;
            int cursorVisibleInt = 0;
            Throwable caughtTaskThrowable = null;
            Object dispatcherOrTaskMonitor = null;
            int taskType = 0;
            ThreadDeath fatalThreadDeath = null;
            Throwable ignoredTaskFailure = null;
            InterruptedException ignoredWaitInterruption = null;
            LimitedRandomAccessFile openedPreferencesFile = null;
            int cursorXOrVisibleFlag = 0;
            Exception urlLaunchFailure = null;
            ProxyAuthenticationRequiredException proxyConnectionFailure = null;
            int cursorY = 0;
            String allowedUrlCharacters = null;
            java.awt.datatransfer.Transferable clipboardContents = null;
            String urlToLaunch = null;
            PlatformTask task = null;
            Thread startedThread = null;
            Object[] customCursorArguments = null;
            java.awt.Component cursorComponent = null;
            java.awt.Frame fullscreenFrame = null;
            String reverseLookupAddress = null;
            java.awt.datatransfer.Clipboard clipboardForWrite = null;
            java.awt.datatransfer.Clipboard clipboardForRead = null;
            Object[] fieldLookupArguments = null;
            Object[] methodLookupArguments = null;
            while (true) {
              dispatcherOrTaskMonitor = this;
              synchronized (dispatcherOrTaskMonitor) {
                {
                  boolean taskDequeueWaitRemainderEnabled = true;
                  while (!this.shutdownRequested) {
                    if (this.taskQueueHead != null) {
                      task = this.taskQueueHead;
                      this.taskQueueHead = this.taskQueueHead.next;
                      if (null == this.taskQueueHead) {
                        this.taskQueueTail = null;
                      }
                      taskDequeueWaitRemainderEnabled = false;
                      break;
                    }
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException waitInterruption) {
                      caughtTaskThrowable = waitInterruption;
                      ignoredWaitInterruption = (InterruptedException) (Object) caughtTaskThrowable;
                    }
                  }
                  if (taskDequeueWaitRemainderEnabled) {
                    return;
                  }
                }
              }
              try {
                platformTaskDispatch: {
                  taskType = task.taskType;
                  if (1 != taskType) {
                    if (taskType != 22) {
                      if (taskType != 2) {
                        if (4 == taskType) {
                          if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < networkBlockedUntilMillis) {
                            throw new IOException();
                          }
                          task.result = new DataInputStream(((java.net.URL) (task.input)).openStream());
                        } else {
                          if (taskType == 8) {
                            methodLookupArguments = (Object[]) (task.input);
                            if (this.privilegedServicesEnabled &&
                                ((Class) (methodLookupArguments[0])).getClassLoader() == null) {
                              throw new SecurityException();
                            }
                            task.result = ((Class) (methodLookupArguments[0])).getDeclaredMethod((String) (methodLookupArguments[1]), (Class[]) (methodLookupArguments[2]));
                          } else {
                            if (taskType == 9) {
                              fieldLookupArguments = (Object[]) (task.input);
                              if (this.privilegedServicesEnabled &&
                                  null == ((Class) (fieldLookupArguments[0])).getClassLoader()) {
                                throw new SecurityException();
                              }
                              task.result = ((Class) (fieldLookupArguments[0])).getDeclaredField((String) (fieldLookupArguments[1]));
                            } else {
                              if (18 == taskType) {
                                clipboardForRead = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                task.result = clipboardForRead.getContents((Object) null);
                              } else {
                                if (taskType == 19) {
                                  clipboardContents = (java.awt.datatransfer.Transferable) (task.input);
                                  clipboardForWrite = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  clipboardForWrite.setContents(clipboardContents, (java.awt.datatransfer.ClipboardOwner) null);
                                } else {
                                  if (!this.privilegedServicesEnabled) {
                                    throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                                  }
                                  if (taskType == 3) {
                                    if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < networkBlockedUntilMillis) {
                                      throw new IOException();
                                    }
                                    reverseLookupAddress = (255 & task.firstIntArgument >> 24) + "." + ((task.firstIntArgument & 16718053) >> 16) + "." + (task.firstIntArgument >> 8 & 255) + "." + (255 & task.firstIntArgument);
                                    task.result = java.net.InetAddress.getByName(reverseLookupAddress).getHostName();
                                  } else {
                                    if (taskType == 21) {
                                      if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < networkBlockedUntilMillis) {
                                        throw new IOException();
                                      }
                                      task.result = java.net.InetAddress.getByName((String) (task.input)).getAddress();
                                    } else {
                                      if (taskType != 5) {
                                        if (6 == taskType) {
                                          fullscreenFrame = new java.awt.Frame("Jagex Full Screen");
                                          task.result = fullscreenFrame;
                                          fullscreenFrame.setResizable(false);
                                          if (this.useMicrosoftVmBackend) {
                                            this.microsoftFullscreenBackend.enterFullscreen(8, task.firstIntArgument >>> 16, fullscreenFrame, task.secondIntArgument >> 16, task.firstIntArgument & 65535, task.secondIntArgument & 65535);
                                          } else {
                                            Class.forName("AwtFullscreenBridge").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.reflectiveFullscreenBackend, new Object[]{fullscreenFrame, new Integer(task.firstIntArgument >>> 16), new Integer(task.firstIntArgument & 65535), new Integer(task.secondIntArgument >> 16), new Integer(task.secondIntArgument & 65535)});
                                          }
                                        } else {
                                          if (taskType == 7) {
                                            if (this.useMicrosoftVmBackend) {
                                              this.microsoftFullscreenBackend.exitFullscreen(111, (java.awt.Frame) (task.input));
                                            } else {
                                              Class.forName("AwtFullscreenBridge").getMethod("exit", new Class[]{}).invoke(this.reflectiveFullscreenBackend, new Object[]{});
                                            }
                                          } else {
                                            if (12 == taskType) {
                                              openedPreferencesFile = PlatformTaskDispatcher.openPreferencesFile((byte) -103, cacheVariant, gameCacheName, (String) (task.input));
                                              task.result = openedPreferencesFile;
                                            } else {
                                              if (taskType == 13) {
                                                openedPreferencesFile = PlatformTaskDispatcher.openPreferencesFile((byte) 19, cacheVariant, "", (String) (task.input));
                                                task.result = openedPreferencesFile;
                                              } else {
                                                if (this.privilegedServicesEnabled &&
                                                    taskType == 14) {
                                                  cursorXOrVisibleFlag = task.firstIntArgument;
                                                  cursorY = task.secondIntArgument;
                                                  if (!this.useMicrosoftVmBackend) {
                                                    Class.forName("AwtCursorBridge").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.reflectiveCursorBackend, new Object[]{new Integer(cursorXOrVisibleFlag), new Integer(cursorY)});
                                                    break platformTaskDispatch;
                                                  }
                                                  this.microsoftCursorBackend.moveCursor(-71, cursorY, cursorXOrVisibleFlag);
                                                  break platformTaskDispatch;
                                                }
                                                if (this.privilegedServicesEnabled &&
                                                    taskType == 15) {
                                                  cursorVisibleInt = (task.firstIntArgument == 0) ? 0 : 1;
                                                  cursorXOrVisibleFlag = cursorVisibleInt;
                                                  cursorComponent = (java.awt.Component) (task.input);
                                                  if (this.useMicrosoftVmBackend) {
                                                    this.microsoftCursorBackend.setCursorVisible(12758, cursorXOrVisibleFlag != 0, cursorComponent);
                                                    break platformTaskDispatch;
                                                  }
                                                  Class.forName("AwtCursorBridge").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.reflectiveCursorBackend, new Object[]{cursorComponent, new Boolean(cursorXOrVisibleFlag != 0)});
                                                  break platformTaskDispatch;
                                                }
                                                if (!this.useMicrosoftVmBackend &&
                                                    taskType == 17) {
                                                  customCursorArguments = (Object[]) (task.input);
                                                  Class.forName("AwtCursorBridge").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.reflectiveCursorBackend, new Object[]{customCursorArguments[0], customCursorArguments[1], new Integer(task.firstIntArgument), new Integer(task.secondIntArgument), customCursorArguments[2]});
                                                } else {
                                                  if (taskType != 16) {
                                                    throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                                                  }
                                                  try {
                                                    if (!osNameLowerCase.startsWith("win")) {
                                                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                                                    }
                                                    urlToLaunch = (String) (task.input);
                                                    if (!urlToLaunch.startsWith("http://") &&
                                                        !urlToLaunch.startsWith("https://")) {
                                                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                                                    }
                                                    allowedUrlCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                    for (urlCharacterIndex = 0; urlCharacterIndex < urlToLaunch.length(); urlCharacterIndex++) {
                                                      if (-1 == allowedUrlCharacters.indexOf((int) urlToLaunch.charAt(urlCharacterIndex))) {
                                                        throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                                                      }
                                                    }
                                                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + urlToLaunch + "\"");
                                                    task.result = null;
                                                  } catch (java.lang.Exception caughtUrlLaunchFailure) {
                                                    caughtTaskThrowable = caughtUrlLaunchFailure;
                                                    urlLaunchFailure = (Exception) (Object) caughtTaskThrowable;
                                                    task.result = urlLaunchFailure;
                                                    throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(urlLaunchFailure);
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (!this.useMicrosoftVmBackend) {
                                          task.result = Class.forName("AwtFullscreenBridge").getMethod("listmodes", new Class[]{}).invoke(this.reflectiveFullscreenBackend, new Object[]{});
                                        } else {
                                          task.result = this.microsoftFullscreenBackend.listDisplayModes(8);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        startedThread = new Thread((Runnable) (task.input));
                        startedThread.setDaemon(true);
                        startedThread.start();
                        startedThread.setPriority(task.firstIntArgument);
                        task.result = startedThread;
                      }
                    } else {
                      if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < networkBlockedUntilMillis) {
                        throw new IOException();
                      }
                      try {
                          if (false) throw (ProxyAuthenticationRequiredException) null;
                        task.result = EmailAvailabilityValidator.createProxySocketConnector(-43, (String) (task.input), task.firstIntArgument).connectUsingSystemProxies(0);
                      } catch (ProxyAuthenticationRequiredException caughtProxyConnectionFailure) {
                        caughtTaskThrowable = caughtProxyConnectionFailure;
                        proxyConnectionFailure = (ProxyAuthenticationRequiredException) (Object) caughtTaskThrowable;
                        task.result = proxyConnectionFailure.getMessage();
                        throw proxyConnectionFailure;
                      }
                    }
                  } else {
                    if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < networkBlockedUntilMillis) {
                      throw new IOException();
                    }
                    task.result = new java.net.Socket(java.net.InetAddress.getByName((String) (task.input)), task.firstIntArgument);
                  }
                }
                task.status = 1;
              } catch (java.lang.ThreadDeath caughtThreadDeath) {
                caughtTaskThrowable = caughtThreadDeath;
                fatalThreadDeath = (ThreadDeath) (Object) caughtTaskThrowable;
                throw fatalThreadDeath;
              } catch (java.lang.Throwable caughtTaskFailure) {
                caughtTaskThrowable = caughtTaskFailure;
                ignoredTaskFailure = caughtTaskThrowable;
                task.status = 2;
              }
              dispatcherOrTaskMonitor = task;
              synchronized (dispatcherOrTaskMonitor) {
                task.notify();
              }
            }
        } catch (RuntimeException | Error uncheckedWorkerFailure) {
            throw uncheckedWorkerFailure;
        } catch (Throwable checkedWorkerFailure) {
            throw new RuntimeException(checkedWorkerFailure);
        }
    }

    private final PlatformTask requestSocketInternal(int guard, int port, boolean useProxy, String host) {
        if (guard != 0) {
            this.cacheDataFile = (LimitedRandomAccessFile) null;
        }
        return this.enqueueTask(1, host, port, useProxy ? 22 : 1, 0);
    }

    final PlatformTask startThread(Runnable runnable, int guard, int priority) {
        if (guard != 0) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(guard + 1, runnable, priority, 2, 0);
    }

    private final static LimitedRandomAccessFile openPreferencesFile(byte guard, int cacheVariant, String gameName, String preferenceSuffix) {
        try {
            LimitedRandomAccessFile preferencesFileAtReturn = null;
            Throwable caughtPreferencesThrowable = null;
            String preferencesFilename = null;
            String[] searchDirectories = null;
            int directoryIndex = 0;
            int guardDivisionValue = 0;
            String searchDirectory = null;
            LimitedRandomAccessFile preferencesFile = null;
            Exception ignoredOpenFailure = null;
            if (33 == cacheVariant) {
              preferencesFilename = "jagex_" + gameName + "_preferences" + preferenceSuffix + "_rc.dat";
            } else {
              if (34 != cacheVariant) {
                preferencesFilename = "jagex_" + gameName + "_preferences" + preferenceSuffix + ".dat";
              } else {
                preferencesFilename = "jagex_" + gameName + "_preferences" + preferenceSuffix + "_wip.dat";
              }
            }
            searchDirectories = new String[]{"c:/rscache/", "/rscache/", userHomeDirectory, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            guardDivisionValue = -95 % ((-46 - guard) / 35);
            directoryIndex = 0;
            while (directoryIndex < searchDirectories.length) {
              searchDirectory = searchDirectories[directoryIndex];
              if (0 < searchDirectory.length() &&
                  !new File(searchDirectory).exists()) {
                directoryIndex++;
                continue;
              }
              try {
                preferencesFile = new LimitedRandomAccessFile(new File(searchDirectory, preferencesFilename), "rw", 10000L);
                preferencesFileAtReturn = preferencesFile;
                return preferencesFileAtReturn;
              } catch (java.lang.Exception openFailure) {
                caughtPreferencesThrowable = openFailure;
                ignoredOpenFailure = (Exception) (Object) caughtPreferencesThrowable;
                directoryIndex++;
              }
            }
            return null;
        } catch (RuntimeException | Error uncheckedPreferencesFailure) {
            throw uncheckedPreferencesFailure;
        } catch (Throwable checkedPreferencesFailure) {
            throw new RuntimeException(checkedPreferencesFailure);
        }
    }

    final void shutdown(byte guard) {
        try {
            PlatformTask ignoredGuardSocketTask = null;
            Throwable caughtShutdownThrowable = null;
            Object shutdownMonitor = null;
            InterruptedException ignoredWorkerJoinInterruption = null;
            IOException ignoredCacheCloseFailure = null;
            int cacheIndex = 0;
            IOException ignoredIndexCloseFailure = null;
            String unusedGuardHost = null;
            shutdownMonitor = this;
            synchronized (shutdownMonitor) {
              this.shutdownRequested = true;
              if (guard != 13) {
                unusedGuardHost = (String) null;
                ignoredGuardSocketTask = this.requestSocketInternal(-99, 45, true, (String) null);
              }
              this.notifyAll();
            }
            try {
              this.workerThread.join();
            } catch (java.lang.InterruptedException workerJoinInterruption) {
              caughtShutdownThrowable = workerJoinInterruption;
              ignoredWorkerJoinInterruption = (InterruptedException) (Object) caughtShutdownThrowable;
            }
            if (this.cacheDataFile != null) {
              try {
                this.cacheDataFile.close((byte) -5);
              } catch (java.io.IOException dataCloseFailure) {
                caughtShutdownThrowable = dataCloseFailure;
                ignoredCacheCloseFailure = (IOException) (Object) caughtShutdownThrowable;
              }
            }
            if (null != this.masterCacheIndexFile) {
              try {
                this.masterCacheIndexFile.close((byte) -5);
              } catch (java.io.IOException masterIndexCloseFailure) {
                caughtShutdownThrowable = masterIndexCloseFailure;
                ignoredCacheCloseFailure = (IOException) (Object) caughtShutdownThrowable;
              }
            }
            if (null != this.cacheIndexFiles) {
              cacheIndex = 0;
              while (cacheIndex < this.cacheIndexFiles.length) {
                if (this.cacheIndexFiles[cacheIndex] == null) {
                  cacheIndex++;
                  continue;
                }
                try {
                  this.cacheIndexFiles[cacheIndex].close((byte) -5);
                  cacheIndex++;
                } catch (java.io.IOException indexCloseFailure) {
                  caughtShutdownThrowable = indexCloseFailure;
                  ignoredIndexCloseFailure = (IOException) (Object) caughtShutdownThrowable;
                  cacheIndex++;
                }
              }
            }
            if (null != this.randomSeedFile) {
              try {
                this.randomSeedFile.close((byte) -5);
              } catch (java.io.IOException seedCloseFailure) {
                caughtShutdownThrowable = seedCloseFailure;
                ignoredCacheCloseFailure = (IOException) (Object) caughtShutdownThrowable;
              }
            }
        } catch (RuntimeException | Error uncheckedShutdownFailure) {
            throw uncheckedShutdownFailure;
        } catch (Throwable checkedShutdownFailure) {
            throw new RuntimeException(checkedShutdownFailure);
        }
    }

    final PlatformTask requestSocket(int port, String host, boolean guard) {
        if (guard) {
            this.requestDisplayModes(82);
        }
        return this.requestSocketInternal(0, port, false, host);
    }

    final PlatformTask requestEnterFullscreen(int height, int guard, int refreshRate, int bitDepth, int width) {
        if (guard != -1743550128) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(guard ^ -1743550127, (Object) null, height + (width << 16), 6, (bitDepth << 16) + refreshRate);
    }

    final PlatformTask requestDeclaredField(Class targetClass, int guard, String fieldName) {
        if (guard != 0) {
            this.microsoftFullscreenBackend = (DirectDrawFullscreenController) null;
        }
        return this.enqueueTask(1, new Object[]{targetClass, fieldName}, 0, 9, 0);
    }

    private final PlatformTask enqueueTask(int guard, Object input, int firstIntArgument, int taskType, int secondIntArgument) {
        PlatformTask task = null;
        Throwable unusedCaughtThrowable = null;
        Object queueMonitor = null;
        task = new PlatformTask();
        task.input = input;
        task.firstIntArgument = firstIntArgument;
        task.secondIntArgument = secondIntArgument;
        if (guard != 1) {
          return (PlatformTask) null;
        }
        task.taskType = taskType;
        queueMonitor = this;
        synchronized (queueMonitor) {
          if (this.taskQueueTail == null) {
            this.taskQueueHead = task;
            this.taskQueueTail = task;
          } else {
            this.taskQueueTail.next = task;
            this.taskQueueTail = task;
          }
          this.notify();
        }
        return task;
    }

    final PlatformTask requestDeclaredMethod(String methodName, int guard, Class[] parameterTypes, Class targetClass) {
        if (guard >= -118) {
            this.reflectiveFullscreenBackend = (Object) null;
        }
        return this.enqueueTask(1, new Object[]{targetClass, methodName, parameterTypes}, 0, 8, 0);
    }

    final PlatformTask requestUrlStream(int guard, java.net.URL url) {
        if (guard != -14) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(1, url, 0, 4, 0);
    }

    PlatformTaskDispatcher(int initialCacheVariant, String gameName, int cacheIndexCount, boolean privilegedServicesEnabled) throws Exception {
        int cacheIndex = 0;
        Exception ignoredSetupException = null;
        Throwable ignoredSetupThrowable = null;
        boolean privilegedServicesFlag = false;
        Throwable caughtSetupThrowable = null;
        DirectDrawFullscreenController createdMicrosoftFullscreenBackend = null;
        this.taskQueueHead = null;
        this.randomSeedFile = null;
        this.cacheDataFile = null;
        this.taskQueueTail = null;
        this.masterCacheIndexFile = null;
        this.useMicrosoftVmBackend = false;
        this.privilegedServicesEnabled = false;
        this.shutdownRequested = false;
        gameCacheName = gameName;
        privilegedServicesFlag = !(!privilegedServicesEnabled);
        this.privilegedServicesEnabled = privilegedServicesFlag;
        javaVendor = "Unknown";
        javaVersion = "1.1";
        cacheVariant = initialCacheVariant;
        try {
          javaVendor = System.getProperty("java.vendor");
          javaVersion = System.getProperty("java.version");
        } catch (java.lang.Exception javaPropertiesFailure) {
          caughtSetupThrowable = javaPropertiesFailure;
          ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
        }
        if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
          this.useMicrosoftVmBackend = true;
        }
        try {
          osName = System.getProperty("os.name");
        } catch (java.lang.Exception osNameFailure) {
          caughtSetupThrowable = osNameFailure;
          ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
          osName = "Unknown";
        }
        osNameLowerCase = osName.toLowerCase();
        try {
          System.getProperty("os.arch").toLowerCase();
        } catch (java.lang.Exception osArchitectureFailure) {
          caughtSetupThrowable = osArchitectureFailure;
          ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
        }
        try {
          System.getProperty("os.version").toLowerCase();
        } catch (java.lang.Exception osVersionFailure) {
          caughtSetupThrowable = osVersionFailure;
          ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
        }
        try {
          userHomeDirectory = System.getProperty("user.home");
          if (userHomeDirectory != null) {
            userHomeDirectory = userHomeDirectory + "/";
          }
        } catch (java.lang.Exception homeDirectoryFailure) {
          caughtSetupThrowable = homeDirectoryFailure;
          ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
        }
        if (null == userHomeDirectory) {
          userHomeDirectory = "~/";
        }
        try {
          this.systemEventQueue = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable eventQueueFailure) {
          caughtSetupThrowable = eventQueueFailure;
          ignoredSetupThrowable = caughtSetupThrowable;
        }
        if (!this.useMicrosoftVmBackend) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception focusTraversalLookupFailure) {
            caughtSetupThrowable = focusTraversalLookupFailure;
            ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
          }
          try {
            setFocusCycleRootMethod = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception focusCycleRootLookupFailure) {
            caughtSetupThrowable = focusCycleRootLookupFailure;
            ignoredSetupException = (Exception) (Object) caughtSetupThrowable;
          }
        }
        CacheFileLocator.initializeCacheEnvironment((byte) 66, gameCacheName, cacheVariant);
        if (this.privilegedServicesEnabled) {
          this.randomSeedFile = new LimitedRandomAccessFile(CacheFileLocator.resolveRedirectedCacheFile((String) null, -27533, "random.dat", cacheVariant), "rw", 25L);
          this.cacheDataFile = new LimitedRandomAccessFile(CacheFileLocator.resolveGameCacheFile("main_file_cache.dat2", (byte) -116), "rw", 314572800L);
          this.masterCacheIndexFile = new LimitedRandomAccessFile(CacheFileLocator.resolveGameCacheFile("main_file_cache.idx255", (byte) -77), "rw", 1048576L);
          this.cacheIndexFiles = new LimitedRandomAccessFile[cacheIndexCount];
          for (cacheIndex = 0; cacheIndex < cacheIndexCount; cacheIndex++) {
            this.cacheIndexFiles[cacheIndex] = new LimitedRandomAccessFile(CacheFileLocator.resolveGameCacheFile("main_file_cache.idx" + cacheIndex, (byte) -104), "rw", 1048576L);
          }
          if (this.useMicrosoftVmBackend) {
            try {
              Class.forName("LegacyDirectSoundBridge").newInstance();
            } catch (java.lang.Throwable microsoftCompatibilitySetupFailure) {
              caughtSetupThrowable = microsoftCompatibilitySetupFailure;
              ignoredSetupThrowable = caughtSetupThrowable;
            }
          }
          try {
            if (this.useMicrosoftVmBackend) {
              createdMicrosoftFullscreenBackend = new DirectDrawFullscreenController();
              this.microsoftFullscreenBackend = createdMicrosoftFullscreenBackend;
            } else {
              this.reflectiveFullscreenBackend = Class.forName("AwtFullscreenBridge").newInstance();
            }
          } catch (java.lang.Throwable fullscreenBackendSetupFailure) {
            caughtSetupThrowable = fullscreenBackendSetupFailure;
            ignoredSetupThrowable = caughtSetupThrowable;
          }
          try {
            if (!this.useMicrosoftVmBackend) {
              this.reflectiveCursorBackend = Class.forName("AwtCursorBridge").newInstance();
            } else {
              this.microsoftCursorBackend = new WindowsCursorController();
            }
          } catch (java.lang.Throwable cursorBackendSetupFailure) {
            caughtSetupThrowable = cursorBackendSetupFailure;
            ignoredSetupThrowable = caughtSetupThrowable;
          }
        }
        this.shutdownRequested = false;
        this.workerThread = new Thread((Runnable) (this));
        this.workerThread.setPriority(10);
        this.workerThread.setDaemon(true);
        this.workerThread.start();
    }

    static {
        networkBlockedUntilMillis = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
