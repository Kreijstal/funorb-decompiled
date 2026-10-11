/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl implements Runnable {
    private boolean field_s;
    private static String field_a;
    private mb field_v;
    private static String field_p;
    static String field_r;
    private static int field_l;
    java.awt.EventQueue field_x;
    pf field_b;
    private w field_k;
    private boolean field_i;
    boolean field_o;
    private static volatile long field_w;
    static String field_t;
    static String field_n;
    pf[] field_c;
    private Thread field_h;
    private static String field_f;
    pf field_d;
    private il field_q;
    private Object field_u;
    pf field_m;
    private il field_j;
    private Object field_e;
    static java.lang.reflect.Method field_g;

    final il a(int param0, java.net.URL param1) {
        if (param0 <= 96) {
          return (il) null;
        }
        return this.a(0, 4, param1, 0, 0);
    }

    final il a(String param0, int param1, int param2) {
        int var4 = -60 / ((param2 + 13) / 39);
        return this.a(param0, -122, param1, false);
    }

    final boolean a(int param0) {
        if (!this.field_o) {
          return false;
        }
        if (param0 != -20) {
          return false;
        }
        if (this.field_s) {
          return null != this.field_v ? true : false;
        }
        return this.field_e != null ? true : false;
    }

    final il a(Runnable param0, int param1, byte param2) {
        int var4 = 67 % ((param2 + 62) / 51);
        return this.a(0, 2, param0, param1, 0);
    }

    final il a(byte param0) {
        if (param0 > -77) {
          this.field_u = (Object) null;
        }
        return this.a(0, 5, (Object) null, 0, 0);
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
            this.field_i = true;
            if (param0 <= 50) {
              this.a((byte) 40);
            }
            this.notifyAll();
          }
          try {
            this.field_h.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_d) {
            try {
              this.field_d.c(127);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_b) {
            try {
              this.field_b.c(-59);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_c != null) {
            for (var2_int = 0; this.field_c.length > var2_int; var2_int++) {
              if (null != this.field_c[var2_int]) {
                try {
                  this.field_c[var2_int].c(108);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_m) {
            try {
              this.field_m.c(119);
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

    final il a(Class param0, String param1, byte param2) {
        il discarded$0 = null;
        if (param2 != 14) {
          String var5 = (String) null;
          discarded$0 = this.a((String) null, 80, -32, false);
        }
        return this.a(0, 9, new Object[]{param0, param1}, 0, 0);
    }

    final il a(java.awt.Frame param0, byte param1) {
        int var3 = -63 % ((-42 - param1) / 41);
        return this.a(0, 7, param0, 0, 0);
    }

    private final static pf a(String param0, byte param1, String param2, int param3) {
        try {
          int var6 = 0;
          pf stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          pf var8 = null;
          Exception var8_ref = null;
          if (33 == param3) {
            var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
            }
          }
          if (param1 != -77) {
            return (pf) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new pf(new File(var7, var4), "rw", 10000L);
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

    final il a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
          this.field_j = (il) null;
        }
        return this.a(param2 + (param4 << 16), 6, (Object) null, (param0 << 16) + param1, 0);
    }

    final il a(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != -39) {
          field_w = 95L;
        }
        return this.a(0, 8, new Object[]{param1, param0, param2}, 0, 0);
    }

    private final il a(String param0, int param1, int param2, boolean param3) {
        if (param1 >= -120) {
          field_n = (String) null;
        }
        return this.a(0, !param3 ? 1 : 22, param0, param2, 0);
    }

    private final il a(int param0, int param1, Object param2, int param3, int param4) {
        il var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param4 != 0) {
          return (il) null;
        }
        var6 = new il();
        var6.field_e = param1;
        var6.field_d = param2;
        var6.field_a = param3;
        var6.field_f = param0;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_j) {
            this.field_j.field_c = var6;
            this.field_j = var6;
          } else {
            this.field_q = var6;
            this.field_j = var6;
          }
          this.notify();
        }
        return var6;
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_80_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          pf var3_ref2 = null;
          qk var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          il var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.Frame var12 = null;
          java.awt.Component var13 = null;
          String var14 = null;
          Object[] var15 = null;
          String var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_i) {
                if (null != this.field_q) {
                  var8 = this.field_q;
                  this.field_q = this.field_q.field_c;
                  if (null == this.field_q) {
                    this.field_j = null;
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
                var2_int = var8.field_e;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_d));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_a);
                    var8.field_g = var18;
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_g = var17.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_o) {
                      throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (la.a(false) < field_w) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.field_a >> 24) + "." + (255 & var8.field_a >> 16) + "." + ((var8.field_a & 65384) >> 8) + "." + (var8.field_a & 255);
                        var8.field_g = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 16:
                      default:
                        if (this.field_o &&
                          var2_int == 14) {
                          var3_int = var8.field_a;
                          var4_int = var8.field_f;
                          if (this.field_s) {
                            this.field_k.a(var3_int, 1, var4_int);
                          } else {
                            Class.forName("tj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_o &&
                          15 == var2_int) {
                          stackIn_80_0 = (var8.field_a == 0) ? 0 : 1;
                          var3_int = stackIn_80_0;
                          var13 = (java.awt.Component) (var8.field_d);
                          if (!this.field_s) {
                            Class.forName("tj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_k.a((byte) -126, var13, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_s &&
                          var2_int == 17) {
                          var15 = (Object[]) (var8.field_d);
                          Class.forName("tj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var15[0], var15[1], new Integer(var8.field_a), new Integer(var8.field_f), var15[2]});
                        } else {
                          if (16 != var2_int) {
                            throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_r.startsWith("win")) {
                              throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var14 = (String) (var8.field_d);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var14.length() > var5; var5++) {
                              if (var4.indexOf((int) var14.charAt(var5)) == -1) {
                                throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_g = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (Exception) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref;
                            throw bl.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = bl.a("", (byte) -77, (String) (var8.field_d), field_l);
                        var8.field_g = var3_ref2;
                        break;
                      case 12:
                        var3_ref2 = bl.a(field_p, (byte) -77, (String) (var8.field_d), field_l);
                        var8.field_g = var3_ref2;
                        break;
                      case 7:
                        if (!this.field_s) {
                          Class.forName("ve").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                        } else {
                          this.field_v.a(7537, (java.awt.Frame) (var8.field_d));
                        }
                        break;
                      case 6:
                        var12 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_g = var12;
                        var12.setResizable(false);
                        if (this.field_s) {
                          this.field_v.a(65535 & var8.field_f, var8.field_a >>> 16, var8.field_f >> 16, -16, 65535 & var8.field_a, var12);
                        } else {
                          Class.forName("ve").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var12, new Integer(var8.field_a >>> 16), new Integer(var8.field_a & 65535), new Integer(var8.field_f >> 16), new Integer(65535 & var8.field_f)});
                        }
                        break;
                      case 5:
                        if (this.field_s) {
                          var8.field_g = this.field_v.a(0);
                        } else {
                          var8.field_g = Class.forName("ve").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_w > la.a(false)) {
                          throw new IOException();
                        }
                        var8.field_g = java.net.InetAddress.getByName((String) (var8.field_d)).getAddress();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_d);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_d);
                    if (this.field_o &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_d);
                    if (this.field_o &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_w > la.a(false)) {
                      throw new IOException();
                    }
                    var8.field_g = new DataInputStream(((java.net.URL) (var8.field_d)).openStream());
                    break;
                  case 22:
                    if (la.a(false) < field_w) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (qk) null;
                      var8.field_g = el.a((String) (var8.field_d), var8.field_a, (byte) 58).a(true);
                    } catch (qk decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (qk) (Object) decompiledCaughtException;
                      var8.field_g = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_w > la.a(false)) {
                      throw new IOException();
                    }
                    var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_d)), var8.field_a);
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

    bl(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        mb var6 = null;
        this.field_s = false;
        this.field_o = false;
        this.field_b = null;
        this.field_i = false;
        this.field_d = null;
        this.field_m = null;
        this.field_q = null;
        this.field_j = null;
        field_t = "1.1";
        field_n = "Unknown";
        field_p = param1;
        field_l = param0;
        stackIn_3_1 = (param3);
        this.field_o = stackIn_3_1;
        try {
          field_n = System.getProperty("java.vendor");
          field_t = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_n.toLowerCase().indexOf("microsoft") != -1) {
          this.field_s = true;
        }
        try {
          field_a = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_a = "Unknown";
        }
        field_r = field_a.toLowerCase();
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
          field_f = System.getProperty("user.home");
          if (null != field_f) {
            field_f = field_f + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_f) {
          field_f = "~/";
        }
        try {
          this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_s) {
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
        vf.a(true, field_p, field_l);
        if (this.field_o) {
          this.field_m = new pf(vf.a(field_l, 1387, (String) null, "random.dat"), "rw", 25L);
          this.field_d = new pf(vf.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_b = new pf(vf.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_c = new pf[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_c[var5_int] = new pf(vf.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_s) {
            try {
              Class.forName("ef").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_s) {
              var6 = new mb();
              this.field_v = var6;
            } else {
              this.field_e = Class.forName("ve").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_s) {
              this.field_k = new w();
            } else {
              this.field_u = Class.forName("tj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_i = false;
        this.field_h = new Thread((Runnable) (this));
        this.field_h.setPriority(10);
        this.field_h.setDaemon(true);
        this.field_h.start();
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
