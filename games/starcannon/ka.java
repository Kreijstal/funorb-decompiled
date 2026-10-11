/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ka implements Runnable {
    private Object field_m;
    static String field_o;
    private static String field_j;
    cb field_c;
    private qh field_b;
    static String field_l;
    cb field_t;
    java.awt.EventQueue field_w;
    private boolean field_g;
    cb[] field_q;
    private boolean field_f;
    private bk field_h;
    private static String field_v;
    private static String field_u;
    private bk field_x;
    private Thread field_d;
    boolean field_n;
    private static volatile long field_k;
    static String field_r;
    private uk field_i;
    private Object field_s;
    cb field_e;
    static java.lang.reflect.Method field_p;
    private static int field_a;

    private final bk a(int param0, int param1, int param2, int param3, Object param4) {
        bk var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        bk stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new bk();
        var6.field_g = param4;
        var6.field_e = param2;
        var6.field_a = param0;
        var6.field_d = param1;
        var7_ref = this;
        synchronized (var7_ref) {
          if (param3 != 16266) {
            stackIn_3_0 = (bk) null;
            return stackIn_3_0;
          }
          if (this.field_x == null) {
            this.field_h = var6;
            this.field_x = var6;
          } else {
            this.field_x.field_c = var6;
            this.field_x = var6;
          }
          this.notify();
        }
        return var6;
    }

    final bk a(byte param0, java.net.URL param1) {
        if (param0 != -10) {
          return (bk) null;
        }
        return this.a(4, 0, 0, 16266, param1);
    }

    private final static cb a(byte param0, String param1, String param2, int param3) {
        try {
          int var6 = 0;
          cb stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          cb var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param3 != 33) {
            if (param3 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
            }
          } else {
            var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new cb(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param0 <= -64) {
            return null;
          }
          var9 = (String) null;
          ka.a((byte) 123, (String) null, (String) null, -123);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final bk a(int param0, int param1, Runnable param2) {
        if (param1 < 20) {
          this.a(72);
        }
        return this.a(2, 0, param0, 16266, param2);
    }

    private final bk a(int param0, String param1, boolean param2, int param3) {
        if (param3 != 22) {
          this.field_c = (cb) null;
        }
        return this.a(!param2 ? 1 : 22, 0, param0, 16266, param1);
    }

    final bk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 2024561328) {
          return (bk) null;
        }
        return this.a(6, param0 + (param2 << 16), (param3 << 16) + param1, param4 - 2024545062, (Object) null);
    }

    final bk a(int param0, int param1, String param2) {
        int var4 = 66 % ((-55 - param1) / 35);
        return this.a(param0, param2, false, 22);
    }

    final bk a(Class param0, int param1, String param2) {
        int var4 = -95 / ((param1 + 49) / 41);
        return this.a(9, 0, 0, 16266, new Object[]{param0, param2});
    }

    final bk a(java.awt.Frame param0, int param1) {
        if (param1 != 12250) {
          String var4 = (String) null;
          ka.a((byte) 6, (String) null, (String) null, 38);
        }
        return this.a(7, 0, 0, param1 + 4016, param0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_89_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          le var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          cb var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          bk var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          Object[] var16 = null;
          Object var17 = null;
          java.awt.Component var17_ref = null;
          Object[] var18 = null;
          var17 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_f) {
                if (this.field_h != null) {
                  var8 = this.field_h;
                  this.field_h = this.field_h.field_c;
                  if (null == this.field_h) {
                    this.field_x = null;
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
                var2_int = var8.field_a;
                switch (var2_int) {
                  case 1:
                    if (field_k > dd.b(106)) {
                      throw new IOException();
                    }
                    var8.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_e);
                    break;
                  case 22:
                    if (field_k > dd.b(56)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (le) null;
                      var8.field_f = hh.a(91, var8.field_e, (String) (var8.field_g)).a((byte) -42);
                    } catch (le decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (le) (Object) decompiledCaughtException;
                      var8.field_f = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 4:
                    if (dd.b(126) < field_k) {
                      throw new IOException();
                    }
                    var8.field_f = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_g);
                    if (this.field_n &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 16:
                  default:
                    if (!this.field_n) {
                      throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (!this.field_g) {
                          var8.field_f = Class.forName("dj").getMethod("listmodes", new Class[]{}).invoke(this.field_s, new Object[]{});
                        } else {
                          var8.field_f = this.field_b.a(0);
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_n &&
                          var2_int == 14) {
                          var3_int = var8.field_e;
                          var4 = var8.field_d;
                          if (!this.field_g) {
                            Class.forName("sf").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_i.a(var4, -4, var3_int);
                          }
                          break;
                        }
                        if (this.field_n &&
                          var2_int == 15) {
                          stackIn_89_0 = (var8.field_e == 0) ? 0 : 1;
                          var3_int = stackIn_89_0;
                          var17_ref = (java.awt.Component) (var8.field_g);
                          if (this.field_g) {
                            this.field_i.a(var17_ref, 0, var3_int != 0);
                          } else {
                            Class.forName("sf").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_m, new Object[]{var17_ref, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_g &&
                          var2_int == 17) {
                          var16 = (Object[]) (var8.field_g);
                          Class.forName("sf").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_m, new Object[]{var16[0], var16[1], new Integer(var8.field_e), new Integer(var8.field_d), var16[2]});
                        } else {
                          if (var2_int != 16) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_r.startsWith("win")) {
                              throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var15 = (String) (var8.field_g);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var15.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var15.charAt(var5)) == -1) {
                                throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_f = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_f = var3_ref2;
                            throw ka.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref3 = ka.a((byte) -70, "", (String) (var8.field_g), field_a);
                        var8.field_f = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = ka.a((byte) -73, field_j, (String) (var8.field_g), field_a);
                        var8.field_f = var3_ref3;
                        break;
                      case 7:
                        if (!this.field_g) {
                          Class.forName("dj").getMethod("exit", new Class[]{}).invoke(this.field_s, new Object[]{});
                        } else {
                          this.field_b.a((java.awt.Frame) (var8.field_g), 8);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_f = var14;
                        var14.setResizable(false);
                        if (!this.field_g) {
                          Class.forName("dj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_s, new Object[]{var14, new Integer(var8.field_e >>> 16), new Integer(65535 & var8.field_e), new Integer(var8.field_d >> 16), new Integer(var8.field_d & 65535)});
                        } else {
                          this.field_b.a(var8.field_d >> 16, 65535 & var8.field_e, 65535 & var8.field_d, var14, var8.field_e >>> 16, (byte) -70);
                        }
                        break;
                      case 21:
                        if (dd.b(118) < field_k) {
                          throw new IOException();
                        }
                        var8.field_f = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                        break;
                      case 3:
                        if (field_k > dd.b(104)) {
                          throw new IOException();
                        }
                        var13 = (255 & var8.field_e >> 24) + "." + (var8.field_e >> 16 & 255) + "." + (255 & var8.field_e >> 8) + "." + (255 & var8.field_e);
                        var8.field_f = java.net.InetAddress.getByName(var13).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_f = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_g);
                    if (this.field_n &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_g));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_e);
                    var8.field_f = var9;
                    break;
                }
              }
              var8.field_b = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_b = 2;
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

    final bk a(int param0) {
        if (param0 > -123) {
          field_p = (java.lang.reflect.Method) null;
        }
        return this.a(5, 0, 0, 16266, (Object) null);
    }

    final void b(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_f = true;
            this.notifyAll();
          }
          try {
            if (param0 != 0) {
              return;
            }
            this.field_d.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_e != null) {
            try {
              this.field_e.a(param0 ^ 1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_t) {
            try {
              this.field_t.a(1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_q != null) {
            for (var2_int = 0; var2_int < this.field_q.length; var2_int++) {
              if (null != this.field_q[var2_int]) {
                try {
                  this.field_q[var2_int].a(1);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_c != null) {
            try {
              this.field_c.a(1);
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

    final bk a(Class param0, String param1, Class[] param2, int param3) {
        if (param3 != 29389) {
          return (bk) null;
        }
        return this.a(8, 0, 0, param3 - 13123, new Object[]{param0, param1, param2});
    }

    final boolean a(byte param0) {
        if (!this.field_n) {
          return false;
        }
        if (param0 != -68) {
          this.a((byte) 20);
        }
        if (!this.field_g) {
          return this.field_s != null ? true : false;
        }
        return this.field_b != null ? true : false;
    }

    ka(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        qh var7 = null;
        this.field_t = null;
        this.field_f = false;
        this.field_h = null;
        this.field_g = false;
        this.field_x = null;
        this.field_n = false;
        this.field_c = null;
        this.field_e = null;
        field_a = param0;
        field_o = "1.1";
        field_j = param1;
        field_l = "Unknown";
        stackIn_3_1 = (param3);
        this.field_n = stackIn_3_1;
        try {
          field_l = System.getProperty("java.vendor");
          field_o = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_l.toLowerCase().indexOf("microsoft")) {
          this.field_g = true;
        }
        try {
          field_u = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_u = "Unknown";
        }
        field_r = field_u.toLowerCase();
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
          if (null != field_v) {
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
          this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_g) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_p = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        e.a(field_a, field_j, -19960);
        if (this.field_n) {
          this.field_c = new cb(e.a("random.dat", (String) null, -8204, field_a), "rw", 25L);
          this.field_e = new cb(e.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_t = new cb(e.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_q = new cb[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_q[var5_int] = new cb(e.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_g) {
            try {
              Class.forName("f").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_g) {
              var7 = new qh();
              this.field_b = var7;
            } else {
              this.field_s = Class.forName("dj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_g) {
              this.field_m = Class.forName("sf").newInstance();
            } else {
              this.field_i = new uk();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_f = false;
        this.field_d = new Thread((Runnable) (this));
        this.field_d.setPriority(10);
        this.field_d.setDaemon(true);
        this.field_d.start();
    }

    static {
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
