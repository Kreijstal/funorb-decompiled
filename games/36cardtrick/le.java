/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le implements Runnable {
    private static String field_s;
    private gb field_f;
    wk field_d;
    java.awt.EventQueue field_e;
    private boolean field_q;
    static String field_m;
    private l field_i;
    wk field_t;
    wk field_x;
    static String field_v;
    private Thread field_j;
    static java.lang.reflect.Method field_g;
    private static int field_u;
    boolean field_b;
    wk[] field_o;
    private static String field_r;
    private vi field_c;
    private static String field_a;
    static String field_w;
    private boolean field_n;
    private Object field_l;
    private static volatile long field_k;
    private Object field_h;
    private vi field_p;

    final vi a(java.net.URL param0, boolean param1) {
        if (!param1) {
          this.field_d = (wk) null;
        }
        return this.a(4, 0, 0, 13003, param0);
    }

    final boolean b(byte param0) {
        if (!this.field_b) {
          return false;
        }
        if (param0 >= -115) {
          java.awt.Frame var3 = (java.awt.Frame) null;
          this.a((byte) 54, (java.awt.Frame) null);
        }
        if (!this.field_q) {
          return null != this.field_l ? true : false;
        }
        return null != this.field_i ? true : false;
    }

    private final static wk a(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          wk stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          wk var8 = null;
          Exception var8_ref = null;
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 > -61) {
            return (wk) null;
          }
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new wk(new File(var7, var4), "rw", 10000L);
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

    private final vi a(int param0, int param1, int param2, int param3, Object param4) {
        vi var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param3 != 13003) {
          this.field_o = (wk[]) null;
        }
        var6 = new vi();
        var6.field_c = param0;
        var6.field_g = param4;
        var6.field_d = param2;
        var6.field_b = param1;
        var7 = this;
        synchronized (var7) {
          if (null == this.field_c) {
            this.field_p = var6;
            this.field_c = var6;
          } else {
            this.field_c.field_f = var6;
            this.field_c = var6;
          }
          this.notify();
        }
        return var6;
    }

    final vi a(byte param0) {
        if (param0 != 104) {
          return (vi) null;
        }
        return this.a(5, 0, 0, 13003, (Object) null);
    }

    final vi a(int param0, int param1, Runnable param2) {
        if (param0 != 0) {
          this.run();
        }
        return this.a(2, 0, param1, 13003, param2);
    }

    final vi a(Class param0, String param1, int param2) {
        if (param2 <= 58) {
          java.net.URL var5 = (java.net.URL) null;
          this.a((java.net.URL) null, true);
        }
        return this.a(9, 0, 0, 13003, new Object[]{param0, param1});
    }

    final vi a(byte param0, java.awt.Frame param1) {
        if (param0 >= -9) {
          return (vi) null;
        }
        return this.a(7, 0, 0, 13003, param1);
    }

    final void a(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_n = true;
            this.notifyAll();
          }
          try {
            if (param0 != 0) {
              return;
            }
            this.field_j.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_t) {
            try {
              this.field_t.a((byte) 42);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_d != null) {
            try {
              this.field_d.a((byte) 79);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_o) {
            for (var2_int = 0; this.field_o.length > var2_int; var2_int++) {
              if (this.field_o[var2_int] != null) {
                try {
                  this.field_o[var2_int].a((byte) 39);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_x) {
            try {
              this.field_x.a((byte) 14);
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

    final vi a(byte param0, Class param1, String param2, Class[] param3) {
        if (param0 != 99) {
          this.field_t = (wk) null;
        }
        return this.a(8, 0, 0, 13003, new Object[]{param1, param2, param3});
    }

    final vi a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != -30) {
          return (vi) null;
        }
        return this.a(6, (param0 << 16) + param2, param1 + (param4 << 16), 13003, (Object) null);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_77_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          wk var3_ref_wk = null;
          vc var3_ref_vc = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          vi var8 = null;
          Thread var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.Component var14 = null;
          java.awt.Frame var15 = null;
          String var16 = null;
          Object[] var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_n) {
                if (null != this.field_p) {
                  var8 = this.field_p;
                  this.field_p = this.field_p.field_f;
                  if (this.field_p == null) {
                    this.field_c = null;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
                try {
                  this.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              if (decompiledFrameCompleted0) {
                return;
              }
            }
            try {
              {
                var2_int = var8.field_c;
                switch (var2_int) {
                  case 1:
                    if (id.a(22) < field_k) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_d);
                    break;
                  case 4:
                    if (id.a(58) < field_k) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                    break;
                  case 8:
                    var18 = (Object[]) (var8.field_g);
                    if (this.field_b &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_g);
                    if (this.field_b &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 16:
                  default:
                    if (!this.field_b) {
                      throw le.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (id.a(23) < field_k) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.field_d >> 24) + "." + ((var8.field_d & 16776207) >> 16) + "." + (255 & var8.field_d >> 8) + "." + (255 & var8.field_d);
                        var8.field_e = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 5:
                        if (!this.field_q) {
                          var8.field_e = Class.forName("ka").getMethod("listmodes", new Class[]{}).invoke(this.field_l, new Object[]{});
                        } else {
                          var8.field_e = this.field_i.a(0);
                        }
                        break;
                      case 6:
                        var15 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var15;
                        var15.setResizable(false);
                        if (this.field_q) {
                          this.field_i.a(119, var8.field_d & 65535, var8.field_d >>> 16, var8.field_b >> 16, 65535 & var8.field_b, var15);
                        } else {
                          Class.forName("ka").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_l, new Object[]{var15, new Integer(var8.field_d >>> 16), new Integer(65535 & var8.field_d), new Integer(var8.field_b >> 16), new Integer(var8.field_b & 65535)});
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_b &&
                          14 == var2_int) {
                          var3 = var8.field_d;
                          var4 = var8.field_b;
                          if (!this.field_q) {
                            Class.forName("ob").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3), new Integer(var4)});
                          } else {
                            this.field_f.a(var3, var4, 32512);
                          }
                          break;
                        }
                        if (this.field_b &&
                          var2_int == 15) {
                          stackIn_77_0 = (var8.field_d == 0) ? 0 : 1;
                          var3 = stackIn_77_0;
                          var14 = (java.awt.Component) (var8.field_g);
                          if (this.field_q) {
                            this.field_f.a(var3 != 0, var14, -4);
                          } else {
                            Class.forName("ob").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var14, new Boolean(var3 != 0)});
                          }
                          break;
                        }
                        if (!this.field_q &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_g);
                          Class.forName("ob").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var12[0], var12[1], new Integer(var8.field_d), new Integer(var8.field_b), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw le.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_m.startsWith("win")) {
                              throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_g);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref_Exception;
                            throw le.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_wk = le.a(-120, field_u, (String) (var8.field_g), "");
                        var8.field_e = var3_ref_wk;
                        break;
                      case 12:
                        var3_ref_wk = le.a(-120, field_u, (String) (var8.field_g), field_a);
                        var8.field_e = var3_ref_wk;
                        break;
                      case 7:
                        if (this.field_q) {
                          this.field_i.a((java.awt.Frame) (var8.field_g), -104);
                        } else {
                          Class.forName("ka").getMethod("exit", new Class[]{}).invoke(this.field_l, new Object[]{});
                        }
                        break;
                      case 21:
                        if (id.a(123) < field_k) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var10.getContents((Object) null);
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_g));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_d);
                    var8.field_e = var9;
                    break;
                  case 22:
                    if (field_k > id.a(98)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (vc) null;
                      var8.field_e = nc.a((String) (var8.field_g), (byte) 40, var8.field_d).a(-26042);
                    } catch (vc decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_vc = (vc) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref_vc.getMessage();
                      throw var3_ref_vc;
                    }
                    break;
                }
              }
              var8.field_a = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_a = 2;
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

    final vi a(String param0, byte param1, int param2) {
        if (param1 >= -19) {
          this.a((byte) -67);
        }
        return this.a(param0, false, param2, (byte) 127);
    }

    private final vi a(String param0, boolean param1, int param2, byte param3) {
        if (param3 <= 126) {
          this.field_e = (java.awt.EventQueue) null;
        }
        return this.a(param1 ? 22 : 1, 0, param2, 13003, param0);
    }

    le(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        l var6 = null;
        this.field_t = null;
        this.field_b = false;
        this.field_d = null;
        this.field_x = null;
        this.field_q = false;
        this.field_n = false;
        this.field_c = null;
        this.field_p = null;
        field_v = "Unknown";
        stackIn_3_1 = (param3);
        this.field_b = stackIn_3_1;
        field_u = param0;
        field_w = "1.1";
        field_a = param1;
        try {
          field_v = System.getProperty("java.vendor");
          field_w = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_v.toLowerCase().indexOf("microsoft") != -1) {
          this.field_q = true;
        }
        try {
          field_r = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_r = "Unknown";
        }
        field_m = field_r.toLowerCase();
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
          field_s = System.getProperty("user.home");
          if (field_s != null) {
            field_s = field_s + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_s) {
          field_s = "~/";
        }
        try {
          this.field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_q) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        dk.a(field_a, field_u, (byte) 86);
        if (this.field_b) {
          this.field_x = new wk(dk.a((String) null, field_u, (byte) 123, "random.dat"), "rw", 25L);
          this.field_t = new wk(dk.a(false, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_d = new wk(dk.a(false, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_o = new wk[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_o[var5_int] = new wk(dk.a(false, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_q) {
            try {
              Class.forName("oi").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_q) {
              var6 = new l();
              this.field_i = var6;
            } else {
              this.field_l = Class.forName("ka").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_q) {
              this.field_f = new gb();
            } else {
              this.field_h = Class.forName("ob").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_n = false;
        this.field_j = new Thread((Runnable) (this));
        this.field_j.setPriority(10);
        this.field_j.setDaemon(true);
        this.field_j.start();
    }

    static {
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
