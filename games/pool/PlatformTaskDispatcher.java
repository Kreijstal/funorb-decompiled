/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private Object field_j;
    private Object field_p;
    private static int field_r;
    static String field_t;
    static String field_o;
    private Thread field_s;
    static java.lang.reflect.Method field_q;
    LimitedRandomAccessFile field_b;
    private static String field_g;
    private static String field_v;
    private MicrosoftCursorController field_m;
    private static String field_d;
    private static volatile long field_h;
    private AsyncRequest field_c;
    java.awt.EventQueue field_a;
    private boolean field_u;
    LimitedRandomAccessFile field_x;
    private AsyncRequest field_l;
    static String field_w;
    LimitedRandomAccessFile field_e;
    private boolean field_i;
    boolean field_k;
    private MicrosoftDisplayController field_f;
    LimitedRandomAccessFile[] field_n;

    final AsyncRequest setCursorVisible(boolean param0, byte param1, java.awt.Component param2) {
        if (param1 != 106) {
          return (AsyncRequest) null;
        }
        return this.queueRequest(15, !param0 ? 0 : 1, false, param2, 0);
    }

    private final static LimitedRandomAccessFile openPreferencesFile(String suffix, int buildChannel, boolean obfuscationGuard, String product) {
        try {
          int var6 = 0;
          LimitedRandomAccessFile stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          LimitedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (buildChannel == 33) {
            var4 = "jagex_" + product + "_preferences" + suffix + "_rc.dat";
          } else {
            if (34 != buildChannel) {
              var4 = "jagex_" + product + "_preferences" + suffix + ".dat";
            } else {
              var4 = "jagex_" + product + "_preferences" + suffix + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new LimitedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (!obfuscationGuard) {
            return null;
          }
          var9 = (String) null;
          PlatformTaskDispatcher.openPreferencesFile((String) null, -124, false, (String) null);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final AsyncRequest startThread(int param0, int param1, Runnable param2) {
        if (param0 < 27) {
          field_h = -9L;
        }
        return this.queueRequest(2, param1, false, param2, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ProxyAuthenticationRequiredException var3_ref = null;
          LimitedRandomAccessFile var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          AsyncRequest var9 = null;
          String var10 = null;
          Object[] var11 = null;
          java.awt.Component var12 = null;
          java.awt.Frame var13 = null;
          java.awt.datatransfer.Clipboard var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_u) {
                if (null != this.field_c) {
                  var9 = this.field_c;
                  this.field_c = this.field_c.field_c;
                  if (null == this.field_c) {
                    this.field_l = null;
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
                var2_int = var9.field_d;
                switch (var2_int) {
                  case 22:
                    if (MonotonicClock.monotonicTimeMillis((byte) -113) < field_h) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var9.field_e = ProxyConnectorSupport.createProxyConnector(114, (String) (var9.field_g), var9.field_a).connect((byte) -108);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var9.field_e = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var9.field_g));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.field_a);
                    var9.field_e = var18;
                    break;
                  case 4:
                    if (MonotonicClock.monotonicTimeMillis((byte) -97) < field_h) {
                      throw new IOException();
                    }
                    var9.field_e = new DataInputStream(((java.net.URL) (var9.field_g)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var9.field_g);
                    if (this.field_k &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var9.field_g);
                    if (this.field_k &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.field_e = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var9.field_g);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_k) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (MonotonicClock.monotonicTimeMillis((byte) -113) < field_h) {
                          throw new IOException();
                        }
                        var9.field_e = java.net.InetAddress.getByName((String) (var9.field_g)).getAddress();
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var9.field_e = var13;
                        var13.setResizable(false);
                        if (!this.field_i) {
                          Class.forName("AwtFullscreenController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{var13, new Integer(var9.field_a >>> 16), new Integer(65535 & var9.field_a), new Integer(var9.field_b >> 16), new Integer(var9.field_b & 65535)});
                        } else {
                          this.field_f.enterFullscreen(var13, var9.field_a & 65535, 83, var9.field_a >>> 16, var9.field_b >> 16, 65535 & var9.field_b);
                        }
                        break;
                      case 13:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile((String) (var9.field_g), field_r, false, "");
                        var9.field_e = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_k &&
                          var2_int == 14) {
                          var3_int = var9.field_a;
                          var4 = var9.field_b;
                          if (this.field_i) {
                            this.field_m.setCursorPosition(-12384, var4, var3_int);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_k &&
                          var2_int == 15) {
                          stackIn_78_0 = (0 == var9.field_a) ? 0 : 1;
                          var3_int = stackIn_78_0;
                          var12 = (java.awt.Component) (var9.field_g);
                          if (this.field_i) {
                            this.field_m.setCursorVisible(-11888, var3_int != 0, var12);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_i &&
                          var2_int == 17) {
                          var11 = (Object[]) (var9.field_g);
                          Class.forName("CursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var11[0], var11[1], new Integer(var9.field_a), new Integer(var9.field_b), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_w.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var8 = (String) (var9.field_g);
                            if (!var8.startsWith("http://") &&
                              !var8.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var8.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var8.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var9.field_e = var3_ref3;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref3);
                          }
                        }
                        break;
                      case 12:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile((String) (var9.field_g), field_r, false, field_d);
                        var9.field_e = var3_ref2;
                        break;
                      case 7:
                        if (this.field_i) {
                          this.field_f.exitFullscreen(0, (java.awt.Frame) (var9.field_g));
                        } else {
                          Class.forName("AwtFullscreenController").getMethod("exit", new Class[]{}).invoke(this.field_j, new Object[]{});
                        }
                        break;
                      case 5:
                        if (!this.field_i) {
                          var9.field_e = Class.forName("AwtFullscreenController").getMethod("listmodes", new Class[]{}).invoke(this.field_j, new Object[]{});
                        } else {
                          var9.field_e = this.field_f.listDisplayModes(true);
                        }
                        break;
                      case 3:
                        if (MonotonicClock.monotonicTimeMillis((byte) -97) < field_h) {
                          throw new IOException();
                        }
                        var10 = (255 & var9.field_a >> 24) + "." + (var9.field_a >> 16 & 255) + "." + ((var9.field_a & 65341) >> 8) + "." + (255 & var9.field_a);
                        var9.field_e = java.net.InetAddress.getByName(var10).getHostName();
                        break;
                    }
                    break;
                  case 1:
                    if (MonotonicClock.monotonicTimeMillis((byte) -124) < field_h) {
                      throw new IOException();
                    }
                    var9.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_g)), var9.field_a);
                    break;
                }
              }
              var9.field_f = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var9.field_f = 2;
            }
            var2 = var9;
            synchronized (var2) {
              var9.notify();
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final AsyncRequest getDeclaredField(Class param0, String param1, byte param2) {
        if (param2 != -88) {
          return (AsyncRequest) null;
        }
        return this.queueRequest(9, 0, false, new Object[]{param0, param1}, 0);
    }

    private final AsyncRequest queueRequest(int param0, int param1, boolean param2, Object param3, int param4) {
        AsyncRequest var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new AsyncRequest();
        var6.field_d = param0;
        var6.field_g = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var7 = this;
        synchronized (var7) {
          if (this.field_l == null) {
            this.field_c = var6;
            this.field_l = var6;
          } else {
            this.field_l.field_c = var6;
            this.field_l = var6;
          }
          this.notify();
          if (param2) {
            this.enterFullscreen(-56, -20, -46, 113, (byte) -46);
          }
        }
        return var6;
    }

    final AsyncRequest exitFullscreen(java.awt.Frame param0, boolean param1) {
        if (param1) {
          this.field_l = (AsyncRequest) null;
        }
        return this.queueRequest(7, 0, false, param0, 0);
    }

    final AsyncRequest listDisplayModes(int param0) {
        if (param0 < 83) {
          return (AsyncRequest) null;
        }
        return this.queueRequest(5, 0, false, (Object) null, 0);
    }

    final AsyncRequest enterFullscreen(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 85) {
          this.shutdown(false);
        }
        return this.queueRequest(6, (param1 << 16) + param0, false, (Object) null, (param3 << 16) + param2);
    }

    final boolean supportsFullscreen(byte obfuscationGuard) {
        if (obfuscationGuard < 104) {
          return false;
        }
        if (!this.field_k) {
          return false;
        }
        if (!this.field_i) {
          return null != this.field_j ? true : false;
        }
        return this.field_f != null ? true : false;
    }

    final AsyncRequest getDeclaredMethod(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 < 12) {
          this.field_b = (LimitedRandomAccessFile) null;
        }
        return this.queueRequest(8, 0, false, new Object[]{param1, param3, param2}, 0);
    }

    final AsyncRequest openSocket(String param0, int param1, int param2) {
        if (param2 != 0) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.setCursorVisible(true, (byte) -21, (java.awt.Component) null);
        }
        return this.queueSocketRequest(param1, param0, false, (byte) -123);
    }

    private final AsyncRequest queueSocketRequest(int param0, String param1, boolean param2, byte param3) {
        if (param3 > -104) {
          this.field_k = false;
        }
        return this.queueRequest(param2 ? 22 : 1, param0, false, param1, 0);
    }

    final void shutdown(boolean stop) {
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
            stackIn_4_1 = (stop);
            this.field_u = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.field_s.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_x) {
            try {
              this.field_x.close((byte) 94);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_e != null) {
            try {
              this.field_e.close((byte) 110);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            for (var2_int = 0; this.field_n.length > var2_int; var2_int++) {
              if (this.field_n[var2_int] != null) {
                try {
                  this.field_n[var2_int].close((byte) 115);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_b != null) {
            try {
              this.field_b.close((byte) 107);
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

    final AsyncRequest openUrlStream(java.net.URL url, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          field_h = -125L;
        }
        return this.queueRequest(4, 0, false, url, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        MicrosoftDisplayController var7 = null;
        this.field_c = null;
        this.field_u = false;
        this.field_b = null;
        this.field_x = null;
        this.field_e = null;
        this.field_l = null;
        this.field_i = false;
        this.field_k = false;
        field_o = "Unknown";
        stackIn_3_1 = (param3);
        this.field_k = stackIn_3_1;
        field_r = param0;
        field_d = param1;
        field_t = "1.1";
        try {
          field_o = System.getProperty("java.vendor");
          field_t = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.field_i = true;
        }
        try {
          field_g = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_g = "Unknown";
        }
        field_w = field_g.toLowerCase();
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
          field_v = System.getProperty("user.home");
          if (field_v != null) {
            field_v = field_v + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_v == null) {
          field_v = "~/";
        }
        try {
          this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_i) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        CacheFileLocator.initialize(field_r, field_d, 25617);
        if (this.field_k) {
          this.field_b = new LimitedRandomAccessFile(CacheFileLocator.resolveFile("random.dat", (String) null, field_r, (byte) 109), "rw", 25L);
          this.field_x = new LimitedRandomAccessFile(CacheFileLocator.resolveFile("main_file_cache.dat2", -126), "rw", 314572800L);
          this.field_e = new LimitedRandomAccessFile(CacheFileLocator.resolveFile("main_file_cache.idx255", -128), "rw", 1048576L);
          this.field_n = new LimitedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_n[var5_int] = new LimitedRandomAccessFile(CacheFileLocator.resolveFile("main_file_cache.idx" + var5_int, -126), "rw", 1048576L);
          }
          if (this.field_i) {
            try {
              Class.forName("MicrosoftDirectSoundInitializer").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_i) {
              var7 = new MicrosoftDisplayController();
              this.field_f = var7;
            } else {
              this.field_j = Class.forName("AwtFullscreenController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_i) {
              this.field_m = new MicrosoftCursorController();
            } else {
              this.field_p = Class.forName("CursorController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_u = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    final AsyncRequest setCursorPosition(java.awt.Component param0, int param1, int param2, int param3) {
        if (param2 >= -54) {
          return (AsyncRequest) null;
        }
        java.awt.Point var5 = param0.getLocationOnScreen();
        return this.queueRequest(14, param1 + var5.x, false, (Object) null, param3 + var5.y);
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
