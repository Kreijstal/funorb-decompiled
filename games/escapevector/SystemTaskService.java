/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SystemTaskService implements Runnable {
    private boolean stopping;
    java.awt.EventQueue eventQueue;
    BoundedRandomAccessFile cacheDataFile;
    private MicrosoftDisplayController microsoftDisplayController;
    private SystemTask queueHead;
    private static volatile long networkBlockedUntilMillis;
    boolean extendedServicesEnabled;
    private static String osName;
    private boolean microsoftVm;
    private static String homeDirectory;
    BoundedRandomAccessFile randomFile;
    BoundedRandomAccessFile[] cacheIndexFiles;
    private Object cursorController;
    private Object displayController;
    static String javaVendor;
    private SystemTask queueTail;
    static String javaVersion;
    private MicrosoftCursorController microsoftCursorController;
    private static int cacheBuild;
    BoundedRandomAccessFile masterIndexFile;
    static java.lang.reflect.Method setFocusCycleRootMethod;
    private Thread thread;
    static String osNameLowerCase;
    private static String cacheName;

    private final SystemTask openSocket(int port, byte guard, String host, boolean useProxy) {
        int var5 = -14 % ((guard - 27) / 41);
        return this.enqueueTask(port, host, -14572, useProxy ? 22 : 1, 0);
    }

    final SystemTask lookupDeclaredField(String name, Class owner, int guard) {
        if (guard >= -52) {
          return (SystemTask) null;
        }
        return this.enqueueTask(0, new Object[]{owner, name}, -14572, 9, 0);
    }

    final boolean supportsFullscreen(int guard) {
        if (guard != 0) {
          this.shutdown(-9);
        }
        if (!this.extendedServicesEnabled) {
          return false;
        }
        if (this.microsoftVm) {
          return this.microsoftDisplayController != null ? true : false;
        }
        return this.displayController != null ? true : false;
    }

    final SystemTask lookupDeclaredMethod(String name, int guard, Class owner, Class[] parameterTypes) {
        int var5 = -101 % ((guard + 41) / 55);
        return this.enqueueTask(0, new Object[]{owner, name, parameterTypes}, -14572, 8, 0);
    }

    private final static BoundedRandomAccessFile openPreferencesFile(boolean guard, int cacheBuild, String suffix, String cacheName) {
        try {
          String var4 = null;
          if (cacheBuild == 33) {
            var4 = "jagex_" + cacheName + "_preferences" + suffix + "_rc.dat";
          } else if (cacheBuild == 34) {
            var4 = "jagex_" + cacheName + "_preferences" + suffix + "_wip.dat";
          } else {
            var4 = "jagex_" + cacheName + "_preferences" + suffix + ".dat";
          }
          String[] var5 = new String[]{"c:/rscache/", "/rscache/", homeDirectory, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (guard) {
            String var9 = (String) null;
            SystemTaskService.openPreferencesFile(true, 124, (String) null, (String) null);
          }
          for (int var6 = 0; var5.length > var6; var6++) {
            String var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                BoundedRandomAccessFile var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                BoundedRandomAccessFile stackIn_15_0 = var8;
                return stackIn_15_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                Exception var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final SystemTask openSocket(int port, int guard, String host) {
        if (guard != 4) {
          java.awt.Frame var5 = (java.awt.Frame) null;
          this.exitFullscreen((byte) -72, (java.awt.Frame) null);
        }
        return this.openSocket(port, (byte) 82, host, false);
    }

    public final void run() {
        try {
          Throwable decompiledCaughtException = null;
          BoundedRandomAccessFile var3_ref = null;
          int var3_int = 0;
          java.awt.datatransfer.Transferable var7 = null;
          SystemTask var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            Object var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.stopping) {
                if (null != this.queueHead) {
                  var8 = this.queueHead;
                  this.queueHead = this.queueHead.next;
                  if (this.queueHead == null) {
                    this.queueTail = null;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
                try {
                  this.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  InterruptedException var3 = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              if (decompiledFrameCompleted0) {
                return;
              }
            }
            try {
              {
                int var2_int = var8.type;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.argument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.intArgument);
                    var8.result = var18;
                    break;
                  case 9:
                    var17 = (Object[]) (var8.argument);
                    if (this.extendedServicesEnabled &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.argument);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.extendedServicesEnabled) {
                      throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (networkBlockedUntilMillis > MonotonicClockSupport.monotonicMillis(128)) {
                          throw new IOException();
                        }
                        var15 = (var8.intArgument >> 24 & 255) + "." + ((var8.intArgument & 16763005) >> 16) + "." + ((65512 & var8.intArgument) >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (this.microsoftVm) {
                          this.microsoftDisplayController.enterFullscreen(var14, var8.intArgument & 65535, var8.secondaryIntArgument & 65535, var8.intArgument >>> 16, -7976, var8.secondaryIntArgument >> 16);
                        } else {
                          Class.forName("FullscreenDisplayController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.displayController, new Object[]{var14, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 12:
                        var3_ref = SystemTaskService.openPreferencesFile(false, cacheBuild, (String) (var8.argument), cacheName);
                        var8.result = var3_ref;
                        break;
                      case 13:
                        var3_ref = SystemTaskService.openPreferencesFile(false, cacheBuild, (String) (var8.argument), "");
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.extendedServicesEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          int var4 = var8.secondaryIntArgument;
                          if (this.microsoftVm) {
                            this.microsoftCursorController.movePointer(var4, var3_int, -11154);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.cursorController, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.extendedServicesEnabled &&
                          var2_int == 15) {
                          int stackIn_85_0 = (0 == var8.intArgument) ? 0 : 1;
                          var3_int = stackIn_85_0;
                          java.awt.Component var13 = (java.awt.Component) (var8.argument);
                          if (this.microsoftVm) {
                            this.microsoftCursorController.setCursorVisible(var13, var3_int != 0, (byte) 110);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.cursorController, new Object[]{var13, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftVm &&
                          var2_int == 17) {
                          Object[] var11 = (Object[]) (var8.argument);
                          Class.forName("CursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.cursorController, new Object[]{var11[0], var11[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception(""));
                          }
                          try {
                            if (!osNameLowerCase.startsWith("win")) {
                              throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            String var12 = (String) (var8.argument);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            String var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (int var5 = 0; var5 < var12.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var12.charAt(var5)) == -1) {
                                throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            Exception var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw SystemTaskService.<RuntimeException>rethrowUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 7:
                        if (!this.microsoftVm) {
                          Class.forName("FullscreenDisplayController").getMethod("exit", new Class[]{}).invoke(this.displayController, new Object[]{});
                        } else {
                          this.microsoftDisplayController.restoreDisplay(8, (java.awt.Frame) (var8.argument));
                        }
                        break;
                      case 5:
                        if (this.microsoftVm) {
                          var8.result = this.microsoftDisplayController.enumerateModes(-2147483648);
                        } else {
                          var8.result = Class.forName("FullscreenDisplayController").getMethod("listmodes", new Class[]{}).invoke(this.displayController, new Object[]{});
                        }
                        break;
                      case 21:
                        if (MonotonicClockSupport.monotonicMillis(128) < networkBlockedUntilMillis) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.argument)).getAddress();
                        break;
                    }
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var10.getContents((Object) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.argument);
                    if (this.extendedServicesEnabled &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (networkBlockedUntilMillis > MonotonicClockSupport.monotonicMillis(128)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.argument)).openStream());
                    break;
                  case 22:
                    if (networkBlockedUntilMillis > MonotonicClockSupport.monotonicMillis(128)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationException) null;
                      var8.result = StatefulTextPainter.createProxySocketConnector((String) (var8.argument), var8.intArgument, (byte) 85).connect(0);
                    } catch (ProxyAuthenticationException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      ProxyAuthenticationException var3_ref3 = (ProxyAuthenticationException) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (networkBlockedUntilMillis > MonotonicClockSupport.monotonicMillis(128)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.argument)), var8.intArgument);
                    break;
                }
              }
              var8.status = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              ThreadDeath var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              Throwable var2_ref2 = decompiledCaughtException;
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

    final SystemTask openUrlStream(byte guard, java.net.URL url) {
        if (guard != -12) {
          String var4 = (String) null;
          SystemTaskService.openPreferencesFile(true, 121, (String) null, (String) null);
        }
        return this.enqueueTask(0, url, guard - 14560, 4, 0);
    }

    private final SystemTask enqueueTask(int intArgument, Object argument, int guard, int type, int secondaryIntArgument) {
        Throwable decompiledCaughtException = null;
        SystemTask var6 = new SystemTask();
        if (guard != -14572) {
          this.microsoftDisplayController = (MicrosoftDisplayController) null;
        }
        var6.intArgument = intArgument;
        var6.type = type;
        var6.argument = argument;
        var6.secondaryIntArgument = secondaryIntArgument;
        Object var7 = this;
        synchronized (var7) {
          if (null != this.queueTail) {
            this.queueTail.next = var6;
            this.queueTail = var6;
          } else {
            this.queueHead = var6;
            this.queueTail = var6;
          }
          this.notify();
        }
        return var6;
    }

    final SystemTask exitFullscreen(byte guard, java.awt.Frame frame) {
        if (guard != 45) {
          return (SystemTask) null;
        }
        return this.enqueueTask(0, frame, guard - 14617, 7, 0);
    }

    final SystemTask listDisplayModes(int guard) {
        if (guard != 5) {
          cacheName = (String) null;
        }
        return this.enqueueTask(0, (Object) null, -14572, 5, 0);
    }

    final void shutdown(int guard) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2_ref2 = null;
          Object var2 = this;
          synchronized (var2) {
            this.stopping = true;
            this.notifyAll();
            if (guard != 0) {
              this.extendedServicesEnabled = true;
            }
          }
          try {
            this.thread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            InterruptedException var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.cacheDataFile) {
            try {
              this.cacheDataFile.close(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.masterIndexFile) {
            try {
              this.masterIndexFile.close(guard ^ 0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.cacheIndexFiles != null) {
            for (int var2_int = 0; this.cacheIndexFiles.length > var2_int; var2_int++) {
              if (this.cacheIndexFiles[var2_int] != null) {
                try {
                  this.cacheIndexFiles[var2_int].close(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  IOException var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.randomFile != null) {
            try {
              this.randomFile.close(0);
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

    final SystemTask enterFullscreen(int guard, int bitDepth, int height, int refreshRate, int width) {
        if (guard > -49) {
          return (SystemTask) null;
        }
        return this.enqueueTask(height + (width << 16), (Object) null, -14572, 6, refreshRate + (bitDepth << 16));
    }

    final SystemTask startThread(boolean guard, int priority, Runnable runnable) {
        if (!guard) {
          return (SystemTask) null;
        }
        return this.enqueueTask(priority, runnable, -14572, 2, 0);
    }

    SystemTaskService(int initialCacheBuild, String initialCacheName, int indexCount, boolean extendedServicesEnabled) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Throwable decompiledCaughtException = null;
        this.cacheDataFile = null;
        this.randomFile = null;
        this.microsoftVm = false;
        this.extendedServicesEnabled = false;
        this.queueHead = null;
        this.queueTail = null;
        this.masterIndexFile = null;
        this.stopping = false;
        boolean stackIn_3_1 = (extendedServicesEnabled);
        this.extendedServicesEnabled = stackIn_3_1;
        javaVendor = "Unknown";
        cacheBuild = initialCacheBuild;
        javaVersion = "1.1";
        cacheName = initialCacheName;
        try {
          javaVendor = System.getProperty("java.vendor");
          javaVersion = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftVm = true;
        }
        try {
          osName = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          osName = "Unknown";
        }
        osNameLowerCase = osName.toLowerCase();
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
          homeDirectory = System.getProperty("user.home");
          if (homeDirectory != null) {
            homeDirectory = homeDirectory + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == homeDirectory) {
          homeDirectory = "~/";
        }
        try {
          this.eventQueue = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.microsoftVm) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            setFocusCycleRootMethod = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        CacheFileLocator.initialize(cacheName, cacheBuild, -109);
        if (this.extendedServicesEnabled) {
          this.randomFile = new BoundedRandomAccessFile(CacheFileLocator.resolveFile((String) null, cacheBuild, 24173, "random.dat"), "rw", 25L);
          this.cacheDataFile = new BoundedRandomAccessFile(CacheFileLocator.resolveFile("main_file_cache.dat2", (byte) -23), "rw", 314572800L);
          this.masterIndexFile = new BoundedRandomAccessFile(CacheFileLocator.resolveFile("main_file_cache.idx255", (byte) 124), "rw", 1048576L);
          this.cacheIndexFiles = new BoundedRandomAccessFile[indexCount];
          for (int var5_int = 0; indexCount > var5_int; var5_int++) {
            this.cacheIndexFiles[var5_int] = new BoundedRandomAccessFile(CacheFileLocator.resolveFile("main_file_cache.idx" + var5_int, (byte) 87), "rw", 1048576L);
          }
          if (this.microsoftVm) {
            try {
              Class.forName("LegacyDirectSoundBackend").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftVm) {
              this.displayController = Class.forName("FullscreenDisplayController").newInstance();
            } else {
              MicrosoftDisplayController var6 = new MicrosoftDisplayController();
              this.microsoftDisplayController = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftVm) {
              this.microsoftCursorController = new MicrosoftCursorController();
            } else {
              this.cursorController = Class.forName("CursorController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.stopping = false;
        this.thread = new Thread((Runnable) (this));
        this.thread.setPriority(10);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    static {
        networkBlockedUntilMillis = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
