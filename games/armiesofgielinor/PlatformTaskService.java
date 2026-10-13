/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskService implements Runnable {
    private boolean microsoftJvm;
    BoundedFile cacheDataFile;
    static String javaVendor;
    private hj field_l;
    private PlatformTask queueHead;
    boolean privilegedServicesEnabled;
    BoundedFile randomDataFile;
    private Object field_b;
    BoundedFile[] cacheIndexFiles;
    private static int cacheStoreId;
    private static String userDirectory;
    private fv field_q;
    private static String osName;
    static String lowercaseOsName;
    BoundedFile masterIndexFile;
    private Thread workerThread;
    private static String cacheName;
    private static volatile long networkBlockedUntilMillis;
    static String javaVersion;
    private PlatformTask queueTail;
    static java.lang.reflect.Method field_x;
    private boolean stopRequested;
    private Object field_o;
    java.awt.EventQueue eventQueue;

    final PlatformTask openSocketAsync(int port, byte obfuscationGuard, String hostname) {
        if (obfuscationGuard < 37) {
          networkBlockedUntilMillis = -11L;
        }
        return this.a((byte) 125, port, false, hostname);
    }

    final PlatformTask enterFullscreenAsync(boolean obfuscationGuard, int height, int width, int refreshRate, int bitDepth) {
        if (!obfuscationGuard) {
          this.cacheIndexFiles = (BoundedFile[]) null;
        }
        return this.enqueueTask((bitDepth << 16) + refreshRate, (width << 16) + height, (Object) null, (byte) 81, 6);
    }

    private final PlatformTask a(byte param0, int param1, boolean param2, String param3) {
        if (param0 < 121) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param1, param3, (byte) -20, !param2 ? 1 : 22);
    }

    final PlatformTask writeClipboardAsync(java.awt.datatransfer.Transferable contents, int obfuscationGuard) {
        if (obfuscationGuard != -26522) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 0, contents, (byte) 102, 19);
    }

    private final static BoundedFile a(boolean param0, String param1, int param2, String param3) {
        try {
          int var6 = 0;
          BoundedFile stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedFile var8 = null;
          Exception var8_ref = null;
          if (33 != param2) {
            if (34 != param2) {
              var4 = "jagex_" + param3 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", userDirectory, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new BoundedFile(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param0) {
            return null;
          }
          field_x = (java.lang.reflect.Method) null;
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PlatformTask startThreadAsync(int priority, int obfuscationGuard, Runnable runnable) {
        if (obfuscationGuard != 0) {
          this.eventQueue = (java.awt.EventQueue) null;
        }
        return this.enqueueTask(0, priority, runnable, (byte) -26, 2);
    }

    final PlatformTask findDeclaredMethodAsync(Class declaringClass, int obfuscationGuard, Class[] parameterTypes, String methodName) {
        if (obfuscationGuard != 0) {
          this.supportsFullscreen(false);
        }
        return this.enqueueTask(0, 0, new Object[]{declaringClass, methodName, parameterTypes}, (byte) 124, 8);
    }

    final PlatformTask readClipboardAsync(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 0, (Object) null, (byte) -99, 18);
    }

    final void stopAndClose(boolean stopRequested) {
        try {
          int var2_int = 0;
          boolean stackIn_4_1 = false;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            stackIn_4_1 = (stopRequested);
            this.stopRequested = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.cacheDataFile) {
            try {
              this.cacheDataFile.close(783);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.masterIndexFile != null) {
            try {
              this.masterIndexFile.close(783);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.cacheIndexFiles != null) {
            for (var2_int = 0; this.cacheIndexFiles.length > var2_int; var2_int++) {
              if (this.cacheIndexFiles[var2_int] != null) {
                try {
                  this.cacheIndexFiles[var2_int].close(783);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.randomDataFile != null) {
            try {
              this.randomDataFile.close(783);
            } catch (java.io.IOException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final PlatformTask enqueueTask(int secondIntegerArgument, int integerArgument, Object objectArgument, byte obfuscationGuard, int taskType) {
        PlatformTask task = null;
        int guardRemainder = 0;
        Throwable decompiledCaughtException = null;
        Object serviceMonitor = null;
        task = new PlatformTask();
        task.secondIntegerArgument = secondIntegerArgument;
        task.objectArgument = objectArgument;
        task.taskType = taskType;
        task.integerArgument = integerArgument;
        serviceMonitor = this;
        synchronized (serviceMonitor) {
          if (this.queueTail == null) {
            this.queueHead = task;
            this.queueTail = task;
          } else {
            this.queueTail.nextTask = task;
            this.queueTail = task;
          }
          this.notify();
        }
        guardRemainder = -48 % ((18 - obfuscationGuard) / 35);
        return task;
    }

    final PlatformTask exitFullscreenAsync(byte obfuscationGuard, java.awt.Frame frame) {
        int var3 = -12 % ((obfuscationGuard + 4) / 59);
        return this.enqueueTask(0, 0, frame, (byte) 108, 7);
    }

    final PlatformTask openUrlStreamAsync(java.net.URL url, boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.supportsFullscreen(true);
        }
        return this.enqueueTask(0, 0, url, (byte) -126, 4);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_83_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          BoundedFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ug var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          String var11 = null;
          Object[] var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.stopRequested) {
                if (this.queueHead != null) {
                  var8 = this.queueHead;
                  this.queueHead = this.queueHead.nextTask;
                  if (null == this.queueHead) {
                    this.queueTail = null;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
                try {
                  this.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              if (decompiledFrameCompleted0) {
                return;
              }
            }
            try {
              {
                var2_int = var8.taskType;
                switch (var2_int) {
                  case 9:
                    var18 = (Object[]) (var8.objectArgument);
                    if (this.privilegedServicesEnabled &&
                      ((Class) (var18[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedServicesEnabled) {
                      throw PlatformTaskService.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (vi.monotonicMillis(-127) < networkBlockedUntilMillis) {
                          throw new IOException();
                        }
                        var15 = (var8.integerArgument >> 24 & 255) + "." + (255 & var8.integerArgument >> 16) + "." + (255 & var8.integerArgument >> 8) + "." + (var8.integerArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_q.a(0);
                        } else {
                          var8.result = Class.forName("wu").getMethod("listmodes", new Class[]{}).invoke(this.field_o, new Object[]{});
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("wu").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{var14, new Integer(var8.integerArgument >>> 16), new Integer(var8.integerArgument & 65535), new Integer(var8.secondIntegerArgument >> 16), new Integer(var8.secondIntegerArgument & 65535)});
                        } else {
                          this.field_q.a(65535 & var8.integerArgument, var8.secondIntegerArgument & 65535, var14, var8.secondIntegerArgument >> 16, var8.integerArgument >>> 16, false);
                        }
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("wu").getMethod("exit", new Class[]{}).invoke(this.field_o, new Object[]{});
                        } else {
                          this.field_q.a(122, (java.awt.Frame) (var8.objectArgument));
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskService.a(true, (String) (var8.objectArgument), cacheStoreId, cacheName);
                        var8.result = var3_ref;
                        break;
                      case 13:
                        var3_ref = PlatformTaskService.a(true, (String) (var8.objectArgument), cacheStoreId, "");
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedServicesEnabled &&
                          14 == var2_int) {
                          var3_int = var8.integerArgument;
                          var4 = var8.secondIntegerArgument;
                          if (this.microsoftJvm) {
                            this.field_l.a(var4, 74, var3_int);
                          } else {
                            Class.forName("gf").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.privilegedServicesEnabled &&
                          var2_int == 15) {
                          stackIn_83_0 = (var8.integerArgument == 0) ? 0 : 1;
                          var3_int = stackIn_83_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_l.a(48, var3_int != 0, var13);
                          } else {
                            Class.forName("gf").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_b, new Object[]{var13, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.objectArgument);
                          Class.forName("gf").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_b, new Object[]{var12[0], var12[1], new Integer(var8.integerArgument), new Integer(var8.secondIntegerArgument), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskService.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!lowercaseOsName.startsWith("win")) {
                              throw PlatformTaskService.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.objectArgument);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw PlatformTaskService.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                throw PlatformTaskService.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformTaskService.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 21:
                        if (networkBlockedUntilMillis > vi.monotonicMillis(46)) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                    }
                    break;
                  case 8:
                    var10 = (Object[]) (var8.objectArgument);
                    if (this.privilegedServicesEnabled &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (vi.monotonicMillis(89) < networkBlockedUntilMillis) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.integerArgument);
                    var8.result = var9;
                    break;
                  case 22:
                    if (vi.monotonicMillis(-118) < networkBlockedUntilMillis) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ug) null;
                      var8.result = ti.a((String) (var8.objectArgument), (byte) 102, var8.integerArgument).a(111);
                    } catch (ug decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ug) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (vi.monotonicMillis(-108) < networkBlockedUntilMillis) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.integerArgument);
                    break;
                }
              }
              var8.status = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.status = 2;
            }
            var2 = var8;
            synchronized (var2) {
              var8.notify();
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PlatformTask getDisplayModesAsync(int obfuscationGuard) {
        if (obfuscationGuard != -20681) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 0, (Object) null, (byte) 109, 5);
    }

    final PlatformTask findDeclaredFieldAsync(int obfuscationGuard, Class declaringClass, String fieldName) {
        if (obfuscationGuard != -30598) {
          this.stopAndClose(false);
        }
        return this.enqueueTask(0, 0, new Object[]{declaringClass, fieldName}, (byte) -60, 9);
    }

    final boolean supportsFullscreen(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          java.awt.datatransfer.Transferable var3 = (java.awt.datatransfer.Transferable) null;
          this.writeClipboardAsync((java.awt.datatransfer.Transferable) null, 84);
        }
        if (!this.privilegedServicesEnabled) {
          return false;
        }
        if (this.microsoftJvm) {
          return null != this.field_q ? true : false;
        }
        return this.field_o != null ? true : false;
    }

    PlatformTaskService(int requestedCacheStoreId, String requestedCacheName, int cacheIndexCount, boolean privilegedServicesEnabled) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        fv var7 = null;
        this.privilegedServicesEnabled = false;
        this.masterIndexFile = null;
        this.microsoftJvm = false;
        this.cacheDataFile = null;
        this.randomDataFile = null;
        this.queueHead = null;
        this.stopRequested = false;
        this.queueTail = null;
        stackIn_3_1 = (privilegedServicesEnabled);
        this.privilegedServicesEnabled = stackIn_3_1;
        javaVendor = "Unknown";
        javaVersion = "1.1";
        cacheStoreId = requestedCacheStoreId;
        cacheName = requestedCacheName;
        try {
          javaVendor = System.getProperty("java.vendor");
          javaVersion = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          osName = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          osName = "Unknown";
        }
        lowercaseOsName = osName.toLowerCase();
        try {
          System.getProperty("os.arch").toLowerCase();
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        try {
          System.getProperty("os.version").toLowerCase();
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        try {
          userDirectory = System.getProperty("user.home");
          if (null != userDirectory) {
            userDirectory = userDirectory + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == userDirectory) {
          userDirectory = "~/";
        }
        try {
          this.eventQueue = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.microsoftJvm) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        qi.a(cacheStoreId, cacheName, 1);
        if (this.privilegedServicesEnabled) {
          this.randomDataFile = new BoundedFile(qi.a("random.dat", cacheStoreId, 39, (String) null), "rw", 25L);
          this.cacheDataFile = new BoundedFile(qi.a(true, "main_file_cache.dat2"), "rw", 314572800L);
          this.masterIndexFile = new BoundedFile(qi.a(true, "main_file_cache.idx255"), "rw", 1048576L);
          this.cacheIndexFiles = new BoundedFile[cacheIndexCount];
          for (var5_int = 0; cacheIndexCount > var5_int; var5_int++) {
            this.cacheIndexFiles[var5_int] = new BoundedFile(qi.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("qr").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftJvm) {
              this.field_o = Class.forName("wu").newInstance();
            } else {
              var7 = new fv();
              this.field_q = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_l = new hj();
            } else {
              this.field_b = Class.forName("gf").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.stopRequested = false;
        this.workerThread = new Thread((Runnable) (this));
        this.workerThread.setPriority(10);
        this.workerThread.setDaemon(true);
        this.workerThread.start();
    }

    static {
        networkBlockedUntilMillis = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
