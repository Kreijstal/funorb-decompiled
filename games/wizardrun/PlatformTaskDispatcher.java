/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    static String field_k;
    private static String field_l;
    static java.lang.reflect.Method field_q;
    private MicrosoftCursorController field_x;
    BoundedRandomAccessFile field_i;
    private boolean field_j;
    BoundedRandomAccessFile field_m;
    private Object field_t;
    java.awt.EventQueue field_a;
    private static volatile long field_d;
    private static int field_w;
    static String field_p;
    private Thread field_e;
    boolean field_s;
    private static String field_v;
    private AsyncRequest field_r;
    private Object field_h;
    private MicrosoftDisplayController field_u;
    BoundedRandomAccessFile[] field_f;
    private static String field_n;
    BoundedRandomAccessFile field_c;
    private AsyncRequest field_o;
    private boolean field_g;
    static String field_b;

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_70_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          BoundedRandomAccessFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ProxyAuthenticationException var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          String var7 = null;
          java.awt.datatransfer.Transferable var8 = null;
          AsyncRequest var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          Object[] var12 = null;
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
              while (!this.field_g) {
                if (this.field_o != null) {
                  var9 = this.field_o;
                  this.field_o = this.field_o.next;
                  if (this.field_o == null) {
                    this.field_r = null;
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
                var2_int = var9.taskType;
                switch (var2_int) {
                  case 1:
                    if (MonotonicClockHelpers.monotonicMillis((byte) 21) < field_d) {
                      throw new IOException();
                    }
                    var9.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.input)), var9.argument);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var9.input));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.argument);
                    var9.result = var18;
                    break;
                  case 4:
                    if (MonotonicClockHelpers.monotonicMillis((byte) 56) < field_d) {
                      throw new IOException();
                    }
                    var9.result = new DataInputStream(((java.net.URL) (var9.input)).openStream());
                    break;
                  case 9:
                    var17 = (Object[]) (var9.input);
                    if (this.field_s &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var9.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var8 = (java.awt.datatransfer.Transferable) (var9.input);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var8, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_s) {
                      throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (MonotonicClockHelpers.monotonicMillis((byte) 25) < field_d) {
                          throw new IOException();
                        }
                        var15 = (var9.argument >> 24 & 255) + "." + (255 & var9.argument >> 16) + "." + ((65409 & var9.argument) >> 8) + "." + (255 & var9.argument);
                        var9.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 21:
                        if (MonotonicClockHelpers.monotonicMillis((byte) 84) < field_d) {
                          throw new IOException();
                        }
                        var9.result = java.net.InetAddress.getByName((String) (var9.input)).getAddress();
                        break;
                      case 5:
                        if (this.field_j) {
                          var9.result = this.field_u.getDisplayModes(true);
                        } else {
                          var9.result = Class.forName("AwtDisplayController").getMethod("listmodes", new Class[]{}).invoke(this.field_t, new Object[]{});
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var9.result = var14;
                        var14.setResizable(false);
                        if (!this.field_j) {
                          Class.forName("AwtDisplayController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{var14, new Integer(var9.argument >>> 16), new Integer(var9.argument & 65535), new Integer(var9.secondaryArgument >> 16), new Integer(65535 & var9.secondaryArgument)});
                        } else {
                          this.field_u.enterFullscreen(var9.secondaryArgument >> 16, (byte) 122, var9.argument >>> 16, 65535 & var9.argument, var9.secondaryArgument & 65535, var14);
                        }
                        break;
                      case 7:
                        if (this.field_j) {
                          this.field_u.exitFullscreen(-2147483648, (java.awt.Frame) (var9.input));
                        } else {
                          Class.forName("AwtDisplayController").getMethod("exit", new Class[]{}).invoke(this.field_t, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile(0, field_w, (String) (var9.input), field_v);
                        var9.result = var3_ref;
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile(0, field_w, (String) (var9.input), "");
                        var9.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_s &&
                          var2_int == 14) {
                          var3_int = var9.argument;
                          var4 = var9.secondaryArgument;
                          if (this.field_j) {
                            this.field_x.setCursorPosition(var3_int, var4, (byte) 116);
                          } else {
                            Class.forName("AwtCursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_s &&
                          15 == var2_int) {
                          stackIn_70_0 = (0 == var9.argument) ? 0 : 1;
                          var3_int = stackIn_70_0;
                          var13 = (java.awt.Component) (var9.input);
                          if (!this.field_j) {
                            Class.forName("AwtCursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_x.setCursorVisible(0, var3_int != 0, var13);
                          }
                          break;
                        }
                        if (!this.field_j &&
                          var2_int == 17) {
                          var12 = (Object[]) (var9.input);
                          Class.forName("AwtCursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var12[0], var12[1], new Integer(var9.argument), new Integer(var9.secondaryArgument), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_k.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            var7 = (String) (var9.input);
                            if (!var7.startsWith("http://") &&
                              !var7.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var7.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var7.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var7 + "\"");
                            var9.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var9.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(var3_ref2);
                          }
                        }
                        break;
                    }
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.result = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var9.input);
                    if (this.field_s &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.result = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 22:
                    if (MonotonicClockHelpers.monotonicMillis((byte) 50) < field_d) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationException) null;
                      var9.result = ThrowableFormattingHelpers.createSocketConnector((String) (var9.input), var9.argument, -1).connect((byte) -128);
                    } catch (ProxyAuthenticationException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ProxyAuthenticationException) (Object) decompiledCaughtException;
                      var9.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                }
              }
              var9.status = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var9.status = 2;
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

    final AsyncRequest requestEnterFullscreen(int param0, int param1, int param2, int param3, int param4) {
        if (param1 < 93) {
          return (AsyncRequest) null;
        }
        return this.enqueueTask(false, param2 + (param0 << 16), (Object) null, param4 + (param3 << 16), 6);
    }

    final AsyncRequest requestDisplayModes(boolean param0) {
        if (param0) {
          field_w = -25;
        }
        return this.enqueueTask(false, 0, (Object) null, 0, 5);
    }

    private final static BoundedRandomAccessFile openPreferencesFile(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          if (param1 != 33) {
            if (34 == param1) {
              var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                stackIn_13_0 = var8;
                return stackIn_13_0;
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

    private final AsyncRequest requestSocketInternal(int param0, String param1, boolean param2, byte param3) {
        if (param3 < 74) {
          field_b = (String) null;
        }
        return this.enqueueTask(false, 0, param1, param0, !param2 ? 1 : 22);
    }

    final AsyncRequest requestThread(byte param0, Runnable param1, int param2) {
        if (param0 > -47) {
          return (AsyncRequest) null;
        }
        return this.enqueueTask(false, 0, param1, param2, 2);
    }

    final AsyncRequest requestUrlStream(java.net.URL param0, int param1) {
        if (param1 < 119) {
          this.field_m = (BoundedRandomAccessFile) null;
        }
        return this.enqueueTask(false, 0, param0, 0, 4);
    }

    final AsyncRequest requestField(int param0, Class param1, String param2) {
        if (param0 != -8024) {
          Class var5 = (Class) null;
          this.requestMethod((String) null, (Class[]) null, (Class) null, -89);
        }
        return this.enqueueTask(false, 0, new Object[]{param1, param2}, 0, 9);
    }

    final AsyncRequest requestMethod(String param0, Class[] param1, Class param2, int param3) {
        if (param3 != 3617) {
          field_k = (String) null;
        }
        return this.enqueueTask(false, 0, new Object[]{param2, param0, param1}, 0, 8);
    }

    final AsyncRequest requestSocket(String param0, int param1, byte param2) {
        if (param2 != -20) {
          return (AsyncRequest) null;
        }
        return this.requestSocketInternal(param1, param0, false, (byte) 85);
    }

    final AsyncRequest requestExitFullscreen(int param0, java.awt.Frame param1) {
        AsyncRequest discarded$0 = null;
        if (param0 != 7) {
          String var4 = (String) null;
          discarded$0 = this.requestSocketInternal(69, (String) null, true, (byte) 10);
        }
        return this.enqueueTask(false, 0, param1, 0, 7);
    }

    final boolean supportsFullscreen(int param0) {
        if (param0 != 169978736) {
          return false;
        }
        if (!this.field_s) {
          return false;
        }
        if (!this.field_j) {
          return this.field_t != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    final void shutdown(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          java.net.URL var4 = null;
          var2 = this;
          synchronized (var2) {
            this.field_g = true;
            this.notifyAll();
          }
          try {
            if (param0 != -3) {
              var4 = (java.net.URL) null;
              this.requestUrlStream((java.net.URL) null, 108);
            }
            this.field_e.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_m) {
            try {
              this.field_m.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_i) {
            try {
              this.field_i.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_f != null) {
            for (var2_int = 0; var2_int < this.field_f.length; var2_int++) {
              if (this.field_f[var2_int] != null) {
                try {
                  this.field_f[var2_int].close(param0 ^ 2);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_c != null) {
            try {
              this.field_c.close(param0 + 2);
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

    private final AsyncRequest enqueueTask(boolean param0, int param1, Object param2, int param3, int param4) {
        AsyncRequest var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new AsyncRequest();
        var6.argument = param3;
        var6.input = param2;
        var6.secondaryArgument = param1;
        var6.taskType = param4;
        if (param0) {
          field_d = 103L;
        }
        var7 = this;
        synchronized (var7) {
          if (null == this.field_r) {
            this.field_o = var6;
            this.field_r = var6;
          } else {
            this.field_r.next = var6;
            this.field_r = var6;
          }
          this.notify();
        }
        return var6;
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        MicrosoftDisplayController var7 = null;
        this.field_m = null;
        this.field_i = null;
        this.field_j = false;
        this.field_r = null;
        this.field_s = false;
        this.field_g = false;
        this.field_c = null;
        this.field_o = null;
        field_b = "1.1";
        stackIn_3_1 = (param3);
        this.field_s = stackIn_3_1;
        field_v = param1;
        field_p = "Unknown";
        field_w = param0;
        try {
          field_p = System.getProperty("java.vendor");
          field_b = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_p.toLowerCase().indexOf("microsoft") != -1) {
          this.field_j = true;
        }
        try {
          field_l = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_l = "Unknown";
        }
        field_k = field_l.toLowerCase();
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
          field_n = System.getProperty("user.home");
          if (null != field_n) {
            field_n = field_n + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_n) {
          field_n = "~/";
        }
        try {
          this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_j) {
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
        CacheFileLocator.initialize(field_v, field_w, (byte) 125);
        if (this.field_s) {
          this.field_c = new BoundedRandomAccessFile(CacheFileLocator.resolveRedirected("random.dat", field_w, (String) null, -93), "rw", 25L);
          this.field_m = new BoundedRandomAccessFile(CacheFileLocator.resolve("main_file_cache.dat2", (byte) 115), "rw", 314572800L);
          this.field_i = new BoundedRandomAccessFile(CacheFileLocator.resolve("main_file_cache.idx255", (byte) 115), "rw", 1048576L);
          this.field_f = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_f[var5_int] = new BoundedRandomAccessFile(CacheFileLocator.resolve("main_file_cache.idx" + var5_int, (byte) 115), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("DirectSoundBackend").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_j) {
              var7 = new MicrosoftDisplayController();
              this.field_u = var7;
            } else {
              this.field_t = Class.forName("AwtDisplayController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_j) {
              this.field_h = Class.forName("AwtCursorController").newInstance();
            } else {
              this.field_x = new MicrosoftCursorController();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_g = false;
        this.field_e = new Thread((Runnable) (this));
        this.field_e.setPriority(10);
        this.field_e.setDaemon(true);
        this.field_e.start();
    }

    static {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
