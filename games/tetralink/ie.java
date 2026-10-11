/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ie implements Runnable {
    private static int field_h;
    sa field_g;
    private Object field_d;
    static java.lang.reflect.Method field_o;
    static String field_l;
    private boolean field_c;
    private vl field_n;
    private rg field_r;
    private vl field_q;
    private boolean field_a;
    static String field_x;
    sa field_b;
    static String field_v;
    private Thread field_k;
    sa field_f;
    private be field_t;
    private static volatile long field_s;
    boolean field_e;
    sa[] field_m;
    private static String field_i;
    private static String field_u;
    private static String field_w;
    java.awt.EventQueue field_p;
    private Object field_j;

    private final vl a(String param0, int param1, int param2, boolean param3) {
        if (param1 < 52) {
          this.a(true);
        }
        return this.a(0, param0, !param3 ? 1 : 22, 19696, param2);
    }

    final vl a(String param0, int param1, Class param2) {
        if (param1 != 26298) {
          this.a(false);
        }
        return this.a(0, new Object[]{param2, param0}, 9, param1 ^ 10826, 0);
    }

    final vl a(Runnable param0, int param1, int param2) {
        int var4 = -62 % ((-2 - param1) / 53);
        return this.a(0, param0, 2, 19696, param2);
    }

    final vl a(int param0, String param1, byte param2) {
        if (param2 <= 84) {
          return (vl) null;
        }
        return this.a(param1, 63, param0, false);
    }

    final vl a(boolean param0) {
        if (param0) {
          Class var3 = (Class) null;
          this.a((String) null, -86, (Class) null);
        }
        return this.a(0, (Object) null, 5, 19696, 0);
    }

    final vl a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 0) {
          String var7 = (String) null;
          ie.a((String) null, (String) null, 18, -31);
        }
        return this.a(param1 + (param4 << 16), (Object) null, 6, 19696, (param2 << 16) + param3);
    }

    final vl a(java.awt.Frame param0, int param1) {
        if (param1 != 0) {
          return (vl) null;
        }
        return this.a(0, param0, 7, 19696, 0);
    }

    final boolean a(byte param0) {
        if (!this.field_e) {
          return false;
        }
        if (param0 >= -59) {
          return true;
        }
        if (this.field_c) {
          return this.field_r != null ? true : false;
        }
        return this.field_d != null ? true : false;
    }

    final void a(int param0) {
        try {
          int var2_int = 0;
          InterruptedException interruptedException = null;
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_a = true;
            this.notifyAll();
          }
          try {
            this.field_k.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_g) {
            try {
              this.field_g.b(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_b != null) {
            try {
              this.field_b.b(0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_m) {
            for (var2_int = 0; this.field_m.length > var2_int; var2_int++) {
              if (null != this.field_m[var2_int]) {
                try {
                  this.field_m[var2_int].b(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_f) {
            try {
              this.field_f.b(0);
            } catch (java.io.IOException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != 32632) {
            this.field_r = (rg) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static sa a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          sa stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          sa var8 = null;
          Exception var8_ref = null;
          if (33 != param3) {
            if (param3 != 34) {
              var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param2 != -1) {
            field_i = (String) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new sa(new File(var7, var4), "rw", 10000L);
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
          sa var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          bn var3_ref3 = null;
          int var4_int = 0;
          java.awt.Component var4 = null;
          String var4_ref = null;
          java.awt.datatransfer.Transferable var7 = null;
          vl var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          String var11 = null;
          Object[] var12 = null;
          java.awt.Frame var13 = null;
          String var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_a) {
                if (this.field_n != null) {
                  var8 = this.field_n;
                  this.field_n = this.field_n.field_e;
                  if (this.field_n == null) {
                    this.field_q = null;
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
                var2_int = var8.field_c;
                switch (var2_int) {
                  case 4:
                    if (field_s > k.a(0)) {
                      throw new IOException();
                    }
                    var8.field_f = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_g);
                    if (this.field_e &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_f = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_e) {
                      throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (k.a(0) < field_s) {
                          throw new IOException();
                        }
                        var14 = (var8.field_a >> 24 & 255) + "." + (255 & var8.field_a >> 16) + "." + ((var8.field_a & 65300) >> 8) + "." + (255 & var8.field_a);
                        var8.field_f = java.net.InetAddress.getByName(var14).getHostName();
                        break;
                      case 5:
                        if (!this.field_c) {
                          var8.field_f = Class.forName("sg").getMethod("listmodes", new Class[]{}).invoke(this.field_d, new Object[]{});
                        } else {
                          var8.field_f = this.field_r.a((byte) 75);
                        }
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_f = var13;
                        var13.setResizable(false);
                        if (this.field_c) {
                          this.field_r.a(90, 65535 & var8.field_a, var8.field_b >> 16, var8.field_a >>> 16, var13, var8.field_b & 65535);
                        } else {
                          Class.forName("sg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{var13, new Integer(var8.field_a >>> 16), new Integer(var8.field_a & 65535), new Integer(var8.field_b >> 16), new Integer(var8.field_b & 65535)});
                        }
                        break;
                      case 7:
                        if (this.field_c) {
                          this.field_r.a((java.awt.Frame) (var8.field_g), 8);
                        } else {
                          Class.forName("sg").getMethod("exit", new Class[]{}).invoke(this.field_d, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = ie.a((String) (var8.field_g), field_w, -1, field_h);
                        var8.field_f = var3_ref;
                        break;
                      case 13:
                        var3_ref = ie.a((String) (var8.field_g), "", -1, field_h);
                        var8.field_f = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_e &&
                          14 == var2_int) {
                          var3_int = var8.field_a;
                          var4_int = var8.field_b;
                          if (this.field_c) {
                            this.field_t.a(var3_int, 101024, var4_int);
                          } else {
                            Class.forName("aj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_e &&
                          15 == var2_int) {
                          stackIn_83_0 = (var8.field_a == 0) ? 0 : 1;
                          var3_int = stackIn_83_0;
                          var4 = (java.awt.Component) (var8.field_g);
                          if (this.field_c) {
                            this.field_t.a(var3_int != 0, var4, 101024);
                          } else {
                            Class.forName("aj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_j, new Object[]{var4, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_c &&
                          17 == var2_int) {
                          var12 = (Object[]) (var8.field_g);
                          Class.forName("aj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_j, new Object[]{var12[0], var12[1], new Integer(var8.field_a), new Integer(var8.field_b), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_l.startsWith("win")) {
                              throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.field_g);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4_ref.indexOf((int) var11.charAt(var5)) == -1) {
                                throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_f = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_f = var3_ref2;
                            throw ie.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 21:
                        if (field_s > k.a(0)) {
                          throw new IOException();
                        }
                        var8.field_f = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                        break;
                    }
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_g);
                    if (this.field_e &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_g));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_a);
                    var8.field_f = var9;
                    break;
                  case 22:
                    if (k.a(0) < field_s) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (bn) null;
                      var8.field_f = co.a(var8.field_a, (String) (var8.field_g), (byte) 118).a((byte) -127);
                    } catch (bn decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (bn) (Object) decompiledCaughtException;
                      var8.field_f = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_s > k.a(0)) {
                      throw new IOException();
                    }
                    var8.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_a);
                    break;
                }
              }
              var8.field_d = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_d = 2;
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

    private final vl a(int param0, Object param1, int param2, int param3, int param4) {
        vl var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new vl();
        var6.field_g = param1;
        var6.field_c = param2;
        var6.field_b = param0;
        if (param3 != 19696) {
          return (vl) null;
        }
        var6.field_a = param4;
        var7 = this;
        synchronized (var7) {
          if (this.field_q == null) {
            this.field_n = var6;
            this.field_q = var6;
          } else {
            this.field_q.field_e = var6;
            this.field_q = var6;
          }
          this.notify();
        }
        return var6;
    }

    final vl a(boolean param0, java.net.URL param1) {
        if (param0) {
          field_h = 53;
        }
        return this.a(0, param1, 4, 19696, 0);
    }

    final vl a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 8) {
          field_h = -19;
        }
        return this.a(0, new Object[]{param1, param3, param2}, 8, 19696, 0);
    }

    ie(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        rg var6 = null;
        this.field_c = false;
        this.field_q = null;
        this.field_b = null;
        this.field_g = null;
        this.field_a = false;
        this.field_n = null;
        this.field_e = false;
        this.field_f = null;
        field_x = "1.1";
        stackIn_3_1 = (param3);
        this.field_e = stackIn_3_1;
        field_h = param0;
        field_v = "Unknown";
        field_w = param1;
        try {
          field_v = System.getProperty("java.vendor");
          field_x = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_v.toLowerCase().indexOf("microsoft") != -1) {
          this.field_c = true;
        }
        try {
          field_u = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_u = "Unknown";
        }
        field_l = field_u.toLowerCase();
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
          this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_c) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_o = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        wi.a(field_w, 11217, field_h);
        if (this.field_e) {
          this.field_f = new sa(wi.a((String) null, false, field_h, "random.dat"), "rw", 25L);
          this.field_g = new sa(wi.a("main_file_cache.dat2", false), "rw", 314572800L);
          this.field_b = new sa(wi.a("main_file_cache.idx255", false), "rw", 1048576L);
          this.field_m = new sa[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_m[var5_int] = new sa(wi.a("main_file_cache.idx" + var5_int, false), "rw", 1048576L);
          }
          if (this.field_c) {
            try {
              Class.forName("qg").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_c) {
              var6 = new rg();
              this.field_r = var6;
            } else {
              this.field_d = Class.forName("sg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_c) {
              this.field_t = new be();
            } else {
              this.field_j = Class.forName("aj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_a = false;
        this.field_k = new Thread((Runnable) (this));
        this.field_k.setPriority(10);
        this.field_k.setDaemon(true);
        this.field_k.start();
    }

    static {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
