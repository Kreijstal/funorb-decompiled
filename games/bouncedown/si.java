/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si implements Runnable {
    private Thread field_q;
    private static volatile long field_h;
    static java.lang.reflect.Method field_w;
    private boolean field_n;
    private cj field_s;
    static String field_d;
    private static String field_b;
    private static String field_c;
    ok field_m;
    static String field_a;
    private boolean field_t;
    private Object field_g;
    private me field_x;
    ok field_v;
    static String field_r;
    ok field_j;
    private static int field_o;
    private mk field_p;
    ok[] field_u;
    private Object field_f;
    private static String field_i;
    boolean field_l;
    java.awt.EventQueue field_e;
    private mk field_k;

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_80_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          ok var3_ref_ok = null;
          tk var3_ref_tk = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          mk var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          Object[] var13 = null;
          java.awt.Component var14 = null;
          java.awt.Frame var15 = null;
          String var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_n) {
                if (this.field_p != null) {
                  var9 = this.field_p;
                  this.field_p = this.field_p.field_a;
                  if (this.field_p == null) {
                    this.field_k = null;
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
                var2_int = var9.field_c;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var9.field_d));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.field_b);
                    var9.field_e = var18;
                    break;
                  case 4:
                    if (field_h > fa.a(76)) {
                      throw new IOException();
                    }
                    var9.field_e = new DataInputStream(((java.net.URL) (var9.field_d)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var9.field_d);
                    if (this.field_l &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 16:
                  default:
                    if (!this.field_l) {
                      throw si.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (fa.a(-20) < field_h) {
                          throw new IOException();
                        }
                        var16 = (255 & var9.field_b >> 24) + "." + (var9.field_b >> 16 & 255) + "." + (255 & var9.field_b >> 8) + "." + (255 & var9.field_b);
                        var9.field_e = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 21:
                        if (field_h > fa.a(103)) {
                          throw new IOException();
                        }
                        var9.field_e = java.net.InetAddress.getByName((String) (var9.field_d)).getAddress();
                        break;
                      case 5:
                        if (!this.field_t) {
                          var9.field_e = Class.forName("hk").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          var9.field_e = this.field_s.a(true);
                        }
                        break;
                      case 6:
                        var15 = new java.awt.Frame("Jagex Full Screen");
                        var9.field_e = var15;
                        var15.setResizable(false);
                        if (!this.field_t) {
                          Class.forName("hk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var15, new Integer(var9.field_b >>> 16), new Integer(var9.field_b & 65535), new Integer(var9.field_g >> 16), new Integer(var9.field_g & 65535)});
                        } else {
                          this.field_s.a(65535 & var9.field_g, false, var9.field_b >>> 16, var15, var9.field_b & 65535, var9.field_g >> 16);
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_l &&
                          var2_int == 14) {
                          var3 = var9.field_b;
                          var4 = var9.field_g;
                          if (!this.field_t) {
                            Class.forName("sc").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{new Integer(var3), new Integer(var4)});
                          } else {
                            this.field_x.a(var3, -121, var4);
                          }
                          break;
                        }
                        if (this.field_l &&
                          var2_int == 15) {
                          stackIn_80_0 = (var9.field_b == 0) ? 0 : 1;
                          var3 = stackIn_80_0;
                          var14 = (java.awt.Component) (var9.field_d);
                          if (this.field_t) {
                            this.field_x.a(var3 != 0, var14, 32512);
                          } else {
                            Class.forName("sc").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_g, new Object[]{var14, new Boolean(var3 != 0)});
                          }
                          break;
                        }
                        if (!this.field_t &&
                          var2_int == 17) {
                          var13 = (Object[]) (var9.field_d);
                          Class.forName("sc").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_g, new Object[]{var13[0], var13[1], new Integer(var9.field_b), new Integer(var9.field_g), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw si.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_a.startsWith("win")) {
                              throw si.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var8 = (String) (var9.field_d);
                            if (!var8.startsWith("http://") &&
                              !var8.startsWith("https://")) {
                              throw si.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var8.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var8.charAt(var5)) == -1) {
                                throw si.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var9.field_e = var3_ref_Exception;
                            throw si.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_ok = si.a(field_o, -11227, "", (String) (var9.field_d));
                        var9.field_e = var3_ref_ok;
                        break;
                      case 12:
                        var3_ref_ok = si.a(field_o, -11227, field_b, (String) (var9.field_d));
                        var9.field_e = var3_ref_ok;
                        break;
                      case 7:
                        if (!this.field_t) {
                          Class.forName("hk").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          this.field_s.a(89, (java.awt.Frame) (var9.field_d));
                        }
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var9.field_d);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.field_e = var11.getContents((Object) null);
                    break;
                  case 9:
                    var10 = (Object[]) (var9.field_d);
                    if (this.field_l &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 22:
                    if (field_h > fa.a(-90)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (tk) null;
                      var9.field_e = je.a(var9.field_b, (byte) -121, (String) (var9.field_d)).b(-19314);
                    } catch (tk decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_tk = (tk) (Object) decompiledCaughtException;
                      var9.field_e = var3_ref_tk.getMessage();
                      throw var3_ref_tk;
                    }
                    break;
                  case 1:
                    if (field_h > fa.a(110)) {
                      throw new IOException();
                    }
                    var9.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_d)), var9.field_b);
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

    private final mk a(int param0, Object param1, int param2, int param3, int param4) {
        mk var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new mk();
        var6.field_b = param2;
        var6.field_d = param1;
        var6.field_g = param4;
        if (param3 != -20766) {
          return (mk) null;
        }
        var6.field_c = param0;
        var7 = this;
        synchronized (var7) {
          if (null == this.field_k) {
            this.field_p = var6;
            this.field_k = var6;
          } else {
            this.field_k.field_a = var6;
            this.field_k = var6;
          }
          this.notify();
        }
        return var6;
    }

    final mk a(String param0, int param1, int param2) {
        if (param2 != 0) {
          this.c((byte) -24);
        }
        return this.a(false, param1, 1689798128, param0);
    }

    final mk a(int param0, byte param1, Runnable param2) {
        int var4 = -82 % ((-47 - param1) / 53);
        return this.a(2, param2, param0, -20766, 0);
    }

    final mk c(byte param0) {
        if (param0 != 5) {
          return (mk) null;
        }
        return this.a(5, (Object) null, 0, -20766, 0);
    }

    private final static ok a(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          ok stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ok var8 = null;
          Exception var8_ref = null;
          if (param0 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
          } else {
            if (param0 != 34) {
              var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new ok(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param1 != -11227) {
            return (ok) null;
          }
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final mk a(String param0, Class param1, int param2, Class[] param3) {
        if (param2 != 8532) {
          this.field_x = (me) null;
        }
        return this.a(8, new Object[]{param1, param0, param3}, 0, -20766, 0);
    }

    final mk a(java.awt.Frame param0, byte param1) {
        if (param1 != 4) {
          return (mk) null;
        }
        return this.a(7, param0, 0, -20766, 0);
    }

    final mk a(java.net.URL param0, boolean param1) {
        if (param1) {
          return (mk) null;
        }
        return this.a(4, param0, 0, -20766, 0);
    }

    private final mk a(boolean param0, int param1, int param2, String param3) {
        if (param2 != 1689798128) {
          field_w = (java.lang.reflect.Method) null;
        }
        return this.a(param0 ? 22 : 1, param3, param1, -20766, 0);
    }

    final mk a(String param0, Class param1, byte param2) {
        if (param2 != 48) {
          field_r = (String) null;
        }
        return this.a(9, new Object[]{param1, param0}, 0, -20766, 0);
    }

    final void b(byte param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            if (param0 <= 83) {
              this.field_m = (ok) null;
            }
            this.field_n = true;
            this.notifyAll();
          }
          try {
            this.field_q.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_j) {
            try {
              this.field_j.b(1337);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_m != null) {
            try {
              this.field_m.b(1337);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_u != null) {
            for (var2_int = 0; var2_int < this.field_u.length; var2_int++) {
              if (null != this.field_u[var2_int]) {
                try {
                  this.field_u[var2_int].b(1337);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_v != null) {
            try {
              this.field_v.b(1337);
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

    final mk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 314572800) {
          this.field_k = (mk) null;
        }
        return this.a(6, (Object) null, (param1 << 16) + param3, -20766, param2 + (param0 << 16));
    }

    final boolean a(byte param0) {
        if (param0 != 53) {
          this.field_g = (Object) null;
        }
        if (!this.field_l) {
          return false;
        }
        if (!this.field_t) {
          return null != this.field_f ? true : false;
        }
        return null != this.field_s ? true : false;
    }

    si(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        cj var6 = null;
        this.field_t = false;
        this.field_p = null;
        this.field_n = false;
        this.field_j = null;
        this.field_m = null;
        this.field_l = false;
        this.field_k = null;
        this.field_v = null;
        field_o = param0;
        field_b = param1;
        field_d = "1.1";
        stackIn_3_1 = (param3);
        this.field_l = stackIn_3_1;
        field_r = "Unknown";
        try {
          field_r = System.getProperty("java.vendor");
          field_d = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
          this.field_t = true;
        }
        try {
          field_c = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_c = "Unknown";
        }
        field_a = field_c.toLowerCase();
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
          field_i = System.getProperty("user.home");
          if (null != field_i) {
            field_i = field_i + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_i == null) {
          field_i = "~/";
        }
        try {
          this.field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_t) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_w = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        kd.a(-67, field_o, field_b);
        if (this.field_l) {
          this.field_v = new ok(kd.a((String) null, "random.dat", false, field_o), "rw", 25L);
          this.field_j = new ok(kd.a("main_file_cache.dat2", 7900), "rw", 314572800L);
          this.field_m = new ok(kd.a("main_file_cache.idx255", 7900), "rw", 1048576L);
          this.field_u = new ok[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_u[var5_int] = new ok(kd.a("main_file_cache.idx" + var5_int, 7900), "rw", 1048576L);
          }
          if (this.field_t) {
            try {
              Class.forName("rh").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_t) {
              var6 = new cj();
              this.field_s = var6;
            } else {
              this.field_f = Class.forName("hk").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_t) {
              this.field_x = new me();
            } else {
              this.field_g = Class.forName("sc").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_n = false;
        this.field_q = new Thread((Runnable) (this));
        this.field_q.setPriority(10);
        this.field_q.setDaemon(true);
        this.field_q.start();
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
