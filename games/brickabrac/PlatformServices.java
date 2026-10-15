/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformServices implements Runnable {
    static String osNameLowercase;
    private static String osName;
    private boolean microsoftJvm;
    java.awt.EventQueue eventQueue;
    private DirectDrawFullscreenController directDrawFullscreenDriver;
    private Thread thread;
    BoundedFile field_k;
    private static String userDirectory;
    boolean privilegedMode;
    private static volatile long field_f;
    private static int field_c;
    private PlatformTask taskTail;
    private Object awtFullscreenDriver;
    private PlatformTask taskHead;
    private boolean shutdownRequested;
    BoundedFile[] field_s;
    static String javaVendor;
    BoundedFile field_m;
    BoundedFile field_q;
    private static String field_t;
    private Object awtPointerDriver;
    static java.lang.reflect.Method field_x;
    static String javaVersion;
    private MicrosoftJvmCursorController microsoftCursorDriver;

    private final PlatformTask a(String param0, int param1, boolean param2, int param3) {
        if (param3 != -31592) {
          this.microsoftJvm = false;
        }
        return this.enqueue(true, 0, param0, param2 ? 22 : 1, param1);
    }

    final PlatformTask startThread(int priority, Runnable runnable, byte obfuscationGuard) {
        if (obfuscationGuard >= -68) {
          String var5 = (String) null;
          this.lookupMethod(-7, (Class) null, (Class[]) null, (String) null);
        }
        return this.enqueue(true, 0, runnable, 2, priority);
    }

    final boolean isFullscreenAvailable(int obfuscationGuard) {
        int var2 = -94 / ((obfuscationGuard - 4) / 42);
        if (!this.privilegedMode) {
          return false;
        }
        if (!this.microsoftJvm) {
          return this.awtFullscreenDriver != null ? true : false;
        }
        return null != this.directDrawFullscreenDriver ? true : false;
    }

    final PlatformTask openUrl(byte obfuscationGuard, java.net.URL url) {
        int var3 = 36 / ((obfuscationGuard - 3) / 40);
        return this.enqueue(true, 0, url, 4, 0);
    }

    final PlatformTask requestEnterFullscreen(int refreshRate, int obfuscationGuard, int height, int bitDepth, int width) {
        if (obfuscationGuard != -35) {
          this.requestEnterFullscreen(125, -72, 117, -42, -13);
        }
        return this.enqueue(true, refreshRate + (bitDepth << 16), (Object) null, 6, (width << 16) + height);
    }

    final PlatformTask requestSocketConnection(String host, byte obfuscationGuard, int port) {
        PlatformTask discarded$0 = null;
        if (obfuscationGuard != 120) {
          Object var5 = (Object) null;
          discarded$0 = this.enqueue(false, -76, (Object) null, 124, 36);
        }
        return this.a(host, port, false, -31592);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_67_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          BoundedFile var3_ref2 = null;
          ProxyAuthenticationRequiredException var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          String var9 = null;
          java.awt.Frame var10 = null;
          java.awt.Component var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.datatransfer.Clipboard var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.shutdownRequested) {
                if (this.taskHead != null) {
                  var8 = this.taskHead;
                  this.taskHead = this.taskHead.next;
                  if (null == this.taskHead) {
                    this.taskTail = null;
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
                var2_int = var8.operation;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.payload));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.argumentOne);
                    var8.result = var18;
                    break;
                  case 4:
                    if (MonotonicTime.nowMillis(false) < field_f) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.payload)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var8.payload);
                    if (this.privilegedMode &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var8.payload);
                    if (this.privilegedMode &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.payload);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedMode) {
                      throw PlatformServices.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 16:
                      default:
                        if (this.privilegedMode &&
                          var2_int == 14) {
                          var3_int = var8.argumentOne;
                          var4_int = var8.argumentTwo;
                          if (this.microsoftJvm) {
                            this.microsoftCursorDriver.movePointer(var4_int, -4, var3_int);
                          } else {
                            Class.forName("AwtPointerController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.awtPointerDriver, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedMode &&
                          15 == var2_int) {
                          stackIn_67_0 = (var8.argumentOne == 0) ? 0 : 1;
                          var3_int = stackIn_67_0;
                          var11 = (java.awt.Component) (var8.payload);
                          if (!this.microsoftJvm) {
                            Class.forName("AwtPointerController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.awtPointerDriver, new Object[]{var11, new Boolean(var3_int != 0)});
                          } else {
                            this.microsoftCursorDriver.setCursorVisible(var11, 0, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          17 == var2_int) {
                          var12 = (Object[]) (var8.payload);
                          Class.forName("AwtPointerController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.awtPointerDriver, new Object[]{var12[0], var12[1], new Integer(var8.argumentOne), new Integer(var8.argumentTwo), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformServices.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!osNameLowercase.startsWith("win")) {
                              throw PlatformServices.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.payload);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw PlatformServices.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (-1 == var4.indexOf((int) var13.charAt(var5))) {
                                throw PlatformServices.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref;
                            throw PlatformServices.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = PlatformServices.a((String) (var8.payload), field_c, "", (byte) -89);
                        var8.result = var3_ref2;
                        break;
                      case 12:
                        var3_ref2 = PlatformServices.a((String) (var8.payload), field_c, field_t, (byte) -70);
                        var8.result = var3_ref2;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.directDrawFullscreenDriver.restoreFullscreen(-3887, (java.awt.Frame) (var8.payload));
                        } else {
                          Class.forName("AwtFullscreenController").getMethod("exit", new Class[]{}).invoke(this.awtFullscreenDriver, new Object[]{});
                        }
                        break;
                      case 6:
                        var10 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var10;
                        var10.setResizable(false);
                        if (this.microsoftJvm) {
                          this.directDrawFullscreenDriver.enterFullscreen(var10, 65535 & var8.argumentOne, var8.argumentOne >>> 16, 0, var8.argumentTwo & 65535, var8.argumentTwo >> 16);
                        } else {
                          Class.forName("AwtFullscreenController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.awtFullscreenDriver, new Object[]{var10, new Integer(var8.argumentOne >>> 16), new Integer(65535 & var8.argumentOne), new Integer(var8.argumentTwo >> 16), new Integer(var8.argumentTwo & 65535)});
                        }
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("AwtFullscreenController").getMethod("listmodes", new Class[]{}).invoke(this.awtFullscreenDriver, new Object[]{});
                        } else {
                          var8.result = this.directDrawFullscreenDriver.listDisplayModes((byte) -48);
                        }
                        break;
                      case 21:
                        if (MonotonicTime.nowMillis(false) < field_f) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.payload)).getAddress();
                        break;
                      case 3:
                        if (MonotonicTime.nowMillis(false) < field_f) {
                          throw new IOException();
                        }
                        var9 = (255 & var8.argumentOne >> 24) + "." + (var8.argumentOne >> 16 & 255) + "." + ((65391 & var8.argumentOne) >> 8) + "." + (255 & var8.argumentOne);
                        var8.result = java.net.InetAddress.getByName(var9).getHostName();
                        break;
                    }
                    break;
                  case 22:
                    if (field_f > MonotonicTime.nowMillis(false)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = RankingSocketHelpers.createSocketConnector(60, var8.argumentOne, (String) (var8.payload)).connect(0);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (MonotonicTime.nowMillis(false) < field_f) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.payload)), var8.argumentOne);
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

    final PlatformTask requestDisplayModes(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.requestDisplayModes(79);
        }
        return this.enqueue(true, 0, (Object) null, 5, 0);
    }

    final PlatformTask lookupField(int obfuscationGuard, Class owner, String name) {
        int var4 = 121 / ((obfuscationGuard - 7) / 36);
        return this.enqueue(true, 0, new Object[]{owner, name}, 9, 0);
    }

    private final static BoundedFile a(String param0, int param1, String param2, byte param3) {
        try {
          int var6 = 0;
          BoundedFile stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedFile var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param1 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
            }
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
          if (param3 < -61) {
            return null;
          }
          var9 = (String) null;
          PlatformServices.a((String) null, 48, (String) null, (byte) -119);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void shutdown(boolean shutdownRequested) {
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
            stackIn_4_1 = (shutdownRequested);
            this.shutdownRequested = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.thread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_q != null) {
            try {
              this.field_q.close(83);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_m != null) {
            try {
              this.field_m.close(-119);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_s != null) {
            for (var2_int = 0; this.field_s.length > var2_int; var2_int++) {
              if (null != this.field_s[var2_int]) {
                try {
                  this.field_s[var2_int].close(56);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.close(108);
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

    final PlatformTask lookupMethod(int obfuscationGuard, Class owner, Class[] parameterTypes, String name) {
        if (obfuscationGuard != 23311) {
          return (PlatformTask) null;
        }
        return this.enqueue(true, 0, new Object[]{owner, name, parameterTypes}, 8, 0);
    }

    final PlatformTask a(int param0, java.awt.Frame param1) {
        int var3 = -2 / ((param0 - 54) / 37);
        return this.enqueue(true, 0, param1, 7, 0);
    }

    private final PlatformTask enqueue(boolean obfuscationGuard, int argumentTwo, Object payload, int operation, int argumentOne) {
        PlatformTask var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.argumentOne = argumentOne;
        var6.payload = payload;
        if (!obfuscationGuard) {
          var9 = (String) null;
          this.requestSocketConnection((String) null, (byte) -43, 124);
        }
        var6.argumentTwo = argumentTwo;
        var6.operation = operation;
        var7 = this;
        synchronized (var7) {
          if (null != this.taskTail) {
            this.taskTail.next = var6;
            this.taskTail = var6;
          } else {
            this.taskHead = var6;
            this.taskTail = var6;
          }
          this.notify();
        }
        return var6;
    }

    PlatformServices(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenController var7 = null;
        this.field_k = null;
        this.taskHead = null;
        this.taskTail = null;
        this.microsoftJvm = false;
        this.field_m = null;
        this.privilegedMode = false;
        this.field_q = null;
        this.shutdownRequested = false;
        javaVersion = "1.1";
        stackIn_3_1 = (param3);
        this.privilegedMode = stackIn_3_1;
        field_t = param1;
        javaVendor = "Unknown";
        field_c = param0;
        try {
          javaVendor = System.getProperty("java.vendor");
          javaVersion = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != javaVendor.toLowerCase().indexOf("microsoft")) {
          this.microsoftJvm = true;
        }
        try {
          osName = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          osName = "Unknown";
        }
        osNameLowercase = osName.toLowerCase();
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
        LauncherCacheFiles.initializeCache(98, field_c, field_t);
        if (this.privilegedMode) {
          this.field_k = new BoundedFile(LauncherCacheFiles.redirectCacheFile(-1, "random.dat", (String) null, field_c), "rw", 25L);
          this.field_q = new BoundedFile(LauncherCacheFiles.resolveCacheFile("main_file_cache.dat2", -1), "rw", 314572800L);
          this.field_m = new BoundedFile(LauncherCacheFiles.resolveCacheFile("main_file_cache.idx255", -1), "rw", 1048576L);
          this.field_s = new BoundedFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_s[var5_int] = new BoundedFile(LauncherCacheFiles.resolveCacheFile("main_file_cache.idx" + var5_int, -1), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("MicrosoftDirectSoundInitializer").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new DirectDrawFullscreenController();
              this.directDrawFullscreenDriver = var7;
            } else {
              this.awtFullscreenDriver = Class.forName("AwtFullscreenController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.awtPointerDriver = Class.forName("AwtPointerController").newInstance();
            } else {
              this.microsoftCursorDriver = new MicrosoftJvmCursorController();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.shutdownRequested = false;
        this.thread = new Thread((Runnable) (this));
        this.thread.setPriority(10);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    static {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
