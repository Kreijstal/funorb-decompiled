/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformService implements Runnable {
    private MicrosoftJvmCursorController microsoftCursorHelper;
    static String osNameLowercase;
    boolean microsoftJvm;
    private PlatformRequest requestTail;
    private Thread workerThread;
    BoundedRandomAccessFile cacheDataFile;
    BoundedRandomAccessFile randomFile;
    private static int buildId;
    BoundedRandomAccessFile masterIndexFile;
    private static String userHome;
    private PlatformRequest requestHead;
    private Object reflectedCursorHelper;
    private static volatile long networkBlockedUntil;
    private MicrosoftJvmFullscreenController microsoftFullscreenHelper;
    private Object reflectedFullscreenHelper;
    static java.lang.reflect.Method setFocusCycleRootMethod;
    private static String gameName;
    static String javaVersion;
    private static String osName;
    static String javaVendor;
    boolean privilegedAccess;
    BoundedRandomAccessFile[] cacheIndexFiles;
    private boolean shutdownRequested;
    java.awt.EventQueue eventQueue;

    final PlatformRequest startThread(int param0, int param1, Runnable param2) {
        PlatformRequest discarded$0 = null;
        if (param0 != 0) {
          Object var5 = (Object) null;
          discarded$0 = this.enqueueRequest((byte) -95, 5, 55, 125, (Object) null);
        }
        return this.enqueueRequest((byte) -107, 2, param1, 0, param2);
    }

    final PlatformRequest setCursorVisible(java.awt.Component param0, boolean param1, byte param2) {
        if (param2 > -92) {
          java.awt.datatransfer.Transferable var5 = (java.awt.datatransfer.Transferable) null;
          this.writeClipboard((byte) 95, (java.awt.datatransfer.Transferable) null);
        }
        return this.enqueueRequest((byte) -107, 15, param1 ? 1 : 0, 0, param0);
    }

    final boolean isFullscreenSupported(int param0) {
        if (!this.privilegedAccess) {
          return false;
        }
        if (param0 != 0) {
          return true;
        }
        if (!this.microsoftJvm) {
          return this.reflectedFullscreenHelper != null ? true : false;
        }
        return this.microsoftFullscreenHelper != null ? true : false;
    }

    final PlatformRequest lookupDeclaredField(String param0, Class param1, int param2) {
        if (param2 != -6576) {
          String var5 = (String) null;
          this.openSocket(-99, (String) null, -92);
        }
        return this.enqueueRequest((byte) -107, 9, 0, 0, new Object[]{param1, param0});
    }

    private final PlatformRequest openSocket(int param0, boolean param1, byte param2, String param3) {
        if (param2 != 85) {
          return (PlatformRequest) null;
        }
        return this.enqueueRequest((byte) -107, !param1 ? 1 : 22, param0, 0, param3);
    }

    final void shutdown(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.shutdownRequested = true;
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.cacheDataFile != null) {
            try {
              this.cacheDataFile.close(false);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.masterIndexFile != null) {
            try {
              this.masterIndexFile.close(false);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.cacheIndexFiles != null) {
            for (var2_int = 0; this.cacheIndexFiles.length > var2_int; var2_int++) {
              if (this.cacheIndexFiles[var2_int] != null) {
                try {
                  this.cacheIndexFiles[var2_int].close(false);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (param0 != 0) {
            this.cacheDataFile = (BoundedRandomAccessFile) null;
          }
          if (null != this.randomFile) {
            try {
              this.randomFile.close(false);
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

    final PlatformRequest lookupDeclaredMethod(Class[] param0, byte param1, Class param2, String param3) {
        if (param1 < 12) {
          Runnable var6 = (Runnable) null;
          this.startThread(2, 98, (Runnable) null);
        }
        return this.enqueueRequest((byte) -107, 8, 0, 0, new Object[]{param2, param3, param0});
    }

    private final PlatformRequest enqueueRequest(byte param0, int param1, int param2, int param3, Object param4) {
        PlatformRequest var6 = null;
        java.awt.Frame var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param0 != -107) {
          var9 = (java.awt.Frame) null;
          this.exitFullscreen((java.awt.Frame) null, (byte) 92);
        }
        var6 = new PlatformRequest();
        var6.objectArgument = param4;
        var6.type = param1;
        var6.secondaryIntArgument = param3;
        var6.primaryIntArgument = param2;
        var7 = this;
        synchronized (var7) {
          if (this.requestTail == null) {
            this.requestHead = var6;
            this.requestTail = var6;
          } else {
            this.requestTail.next = var6;
            this.requestTail = var6;
          }
          this.notify();
        }
        return var6;
    }

    final PlatformRequest openUrlStream(java.net.URL param0, int param1) {
        if (param1 < 90) {
          return (PlatformRequest) null;
        }
        return this.enqueueRequest((byte) -107, 4, 0, 0, param0);
    }

    final PlatformRequest writeClipboard(byte param0, java.awt.datatransfer.Transferable param1) {
        if (param0 != -45) {
          this.isFullscreenSupported(-33);
        }
        return this.enqueueRequest((byte) -107, 19, 0, 0, param1);
    }

    final PlatformRequest openSocket(int param0, String param1, int param2) {
        int var4 = -31 % ((-10 - param2) / 45);
        return this.openSocket(param0, false, (byte) 85, param1);
    }

    final PlatformRequest enterFullscreen(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 4) {
          this.microsoftFullscreenHelper = (MicrosoftJvmFullscreenController) null;
        }
        return this.enqueueRequest((byte) -107, 6, (param3 << 16) + param0, (param2 << 16) + param4, (Object) null);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_81_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ProxyAuthenticationException var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          BoundedRandomAccessFile var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformRequest var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          Object[] var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.shutdownRequested) {
                if (this.requestHead != null) {
                  var8 = this.requestHead;
                  this.requestHead = this.requestHead.next;
                  if (null == this.requestHead) {
                    this.requestTail = null;
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
                var2_int = var8.type;
                switch (var2_int) {
                  case 22:
                    if (MonotonicMillisClock.currentTimeMillis(false) < networkBlockedUntil) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationException) null;
                      var8.result = ppb.a((String) (var8.objectArgument), var8.primaryIntArgument, (byte) -112).openSocket(2048);
                    } catch (ProxyAuthenticationException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ProxyAuthenticationException) (Object) decompiledCaughtException;
                      var8.result = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.objectArgument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.primaryIntArgument);
                    var8.result = var18;
                    break;
                  case 9:
                    var17 = (Object[]) (var8.objectArgument);
                    if (this.privilegedAccess &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedAccess) {
                      throw PlatformService.<RuntimeException>rethrowUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (MonotonicMillisClock.currentTimeMillis(false) < networkBlockedUntil) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.primaryIntArgument >> 24) + "." + ((var8.primaryIntArgument & 16719400) >> 16) + "." + (255 & var8.primaryIntArgument >> 8) + "." + (var8.primaryIntArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("AwtFullscreenController").getMethod("listmodes", new Class[]{}).invoke(this.reflectedFullscreenHelper, new Object[]{});
                        } else {
                          var8.result = this.microsoftFullscreenHelper.listDisplayModes(false);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (this.microsoftJvm) {
                          this.microsoftFullscreenHelper.enterFullscreen(-70, var14, var8.secondaryIntArgument >> 16, var8.primaryIntArgument >>> 16, var8.secondaryIntArgument & 65535, var8.primaryIntArgument & 65535);
                        } else {
                          Class.forName("AwtFullscreenController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.reflectedFullscreenHelper, new Object[]{var14, new Integer(var8.primaryIntArgument >>> 16), new Integer(var8.primaryIntArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        }
                        break;
                      case 16:
                      default:
                        if (this.privilegedAccess &&
                          var2_int == 14) {
                          var3_int = var8.primaryIntArgument;
                          var4 = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("AwtRobotCursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.reflectedCursorHelper, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.microsoftCursorHelper.movePointer(var4, var3_int, (byte) -122);
                          }
                          break;
                        }
                        if (this.privilegedAccess &&
                          15 == var2_int) {
                          stackIn_81_0 = (0 == var8.primaryIntArgument) ? 0 : 1;
                          var3_int = stackIn_81_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("AwtRobotCursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.reflectedCursorHelper, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.microsoftCursorHelper.setCursorVisible(var13, -4, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          17 == var2_int) {
                          var11 = (Object[]) (var8.objectArgument);
                          Class.forName("AwtRobotCursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.reflectedCursorHelper, new Object[]{var11[0], var11[1], new Integer(var8.primaryIntArgument), new Integer(var8.secondaryIntArgument), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformService.<RuntimeException>rethrowUnchecked(new Exception(""));
                          }
                          try {
                            if (!osNameLowercase.startsWith("win")) {
                              throw PlatformService.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            var12 = (String) (var8.objectArgument);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw PlatformService.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var12.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var12.charAt(var5)) == -1) {
                                throw PlatformService.<RuntimeException>rethrowUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformService.<RuntimeException>rethrowUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref3 = PlatformService.openPreferencesFile(buildId, "", (byte) -127, (String) (var8.objectArgument));
                        var8.result = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = PlatformService.openPreferencesFile(buildId, gameName, (byte) -128, (String) (var8.objectArgument));
                        var8.result = var3_ref3;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.microsoftFullscreenHelper.exitFullscreen(-76, (java.awt.Frame) (var8.objectArgument));
                        } else {
                          Class.forName("AwtFullscreenController").getMethod("exit", new Class[]{}).invoke(this.reflectedFullscreenHelper, new Object[]{});
                        }
                        break;
                      case 21:
                        if (MonotonicMillisClock.currentTimeMillis(false) < networkBlockedUntil) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                    }
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var10.getContents((Object) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.objectArgument);
                    if (this.privilegedAccess &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (networkBlockedUntil > MonotonicMillisClock.currentTimeMillis(false)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 1:
                    if (MonotonicMillisClock.currentTimeMillis(false) < networkBlockedUntil) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.primaryIntArgument);
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

    private final static BoundedRandomAccessFile openPreferencesFile(int param0, String param1, byte param2, String param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          if (param2 >= -126) {
            return (BoundedRandomAccessFile) null;
          }
          if (param0 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
          } else {
            if (param0 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", userHome, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                stackIn_15_0 = var8;
                return stackIn_15_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
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

    final boolean writeFile(byte[] param0, byte param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          var4 = new FileOutputStream(param2);
          var4.write(param0, 0, param0.length);
          if (param1 != 110) {
            gameName = (String) null;
          }
          var4.close();
          return true;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
    }

    final PlatformRequest movePointer(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.Point var5 = param0.getLocationOnScreen();
        if (param3 != 14) {
          java.awt.Component var6 = (java.awt.Component) null;
          this.setCursorVisible((java.awt.Component) null, true, (byte) 77);
        }
        return this.enqueueRequest((byte) -107, 14, var5.x + param2, var5.y + param1, (Object) null);
    }

    final PlatformRequest readClipboard(int param0) {
        if (param0 < 91) {
          return (PlatformRequest) null;
        }
        return this.enqueueRequest((byte) -107, 18, 0, 0, (Object) null);
    }

    final PlatformRequest exitFullscreen(java.awt.Frame param0, byte param1) {
        int var3 = -90 % ((param1 + 51) / 55);
        return this.enqueueRequest((byte) -107, 7, 0, 0, param0);
    }

    final PlatformRequest listDisplayModes(int param0) {
        if (param0 <= 84) {
          return (PlatformRequest) null;
        }
        return this.enqueueRequest((byte) -107, 5, 0, 0, (Object) null);
    }

    PlatformService(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        int var8 = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        MicrosoftJvmFullscreenController var10 = null;
        ThreadGroup var11 = null;
        ThreadGroup var12 = null;
        this.requestTail = null;
        this.cacheDataFile = null;
        this.masterIndexFile = null;
        this.microsoftJvm = false;
        this.randomFile = null;
        this.shutdownRequested = false;
        this.requestHead = null;
        this.privilegedAccess = false;
        gameName = param1;
        javaVersion = "1.1";
        stackIn_3_1 = (param3);
        this.privilegedAccess = stackIn_3_1;
        buildId = param0;
        javaVendor = "Unknown";
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
          userHome = System.getProperty("user.home");
          if (userHome != null) {
            userHome = userHome + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (userHome == null) {
          userHome = "~/";
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
            setFocusCycleRootMethod = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        CacheFiles.initialize(buildId, -109, gameName);
        if (this.privilegedAccess) {
          this.randomFile = new BoundedRandomAccessFile(CacheFiles.resolveCacheFile("random.dat", -1, (String) null, buildId), "rw", 25L);
          this.cacheDataFile = new BoundedRandomAccessFile(CacheFiles.resolveCacheFile("main_file_cache.dat2", (byte) 34), "rw", 314572800L);
          this.masterIndexFile = new BoundedRandomAccessFile(CacheFiles.resolveCacheFile("main_file_cache.idx255", (byte) 34), "rw", 1048576L);
          this.cacheIndexFiles = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.cacheIndexFiles[var5_int] = new BoundedRandomAccessFile(CacheFiles.resolveCacheFile("main_file_cache.idx" + var5_int, (byte) 34), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("LegacyDirectSoundBuffers").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var10 = new MicrosoftJvmFullscreenController();
              this.microsoftFullscreenHelper = var10;
            } else {
              this.reflectedFullscreenHelper = Class.forName("AwtFullscreenController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.microsoftCursorHelper = new MicrosoftJvmCursorController();
            } else {
              this.reflectedCursorHelper = Class.forName("AwtRobotCursorController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        if (this.privilegedAccess &&
          !this.microsoftJvm) {
          var11 = Thread.currentThread().getThreadGroup();
          var5 = var11;
          var6 = var11.getParent();
          while (var6 != null) {
            var12 = var6;
            var5 = var12;
            var6 = var12.getParent();
          }
          var7 = new Thread[1000];
          var5.enumerate(var7);
          for (var8 = 0; var7.length > var8; var8++) {
            if (var7[var8] != null &&
              var7[var8].getName().startsWith("AWT")) {
              var7[var8].setPriority(1);
            }
          }
        }
        this.shutdownRequested = false;
        this.workerThread = new Thread((Runnable) (this));
        this.workerThread.setPriority(10);
        this.workerThread.setDaemon(true);
        this.workerThread.start();
    }

    static {
        networkBlockedUntil = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
