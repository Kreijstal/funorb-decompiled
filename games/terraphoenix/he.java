/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class he implements Runnable {
    b field_q;
    static String field_j;
    private Object field_f;
    private mf field_h;
    private static String field_t;
    private static int field_e;
    private static String field_k;
    private static String field_i;
    private boolean field_n;
    private Object field_p;
    boolean field_v;
    static String field_d;
    private gk field_l;
    private Thread field_u;
    private static volatile long field_b;
    private mf field_a;
    static String field_o;
    b[] field_s;
    static java.lang.reflect.Method field_x;
    b field_m;
    private ff field_c;
    java.awt.EventQueue field_g;
    b field_r;
    private boolean field_w;

    final void c(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_w = true;
            this.notifyAll();
          }
          try {
            this.field_u.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_r) {
            try {
              this.field_r.a(115);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_q != null) {
            try {
              this.field_q.a(124);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != -7538) {
            return;
          }
          if (this.field_s != null) {
            for (var2_int = 0; this.field_s.length > var2_int; var2_int++) {
              if (this.field_s[var2_int] != null) {
                try {
                  this.field_s[var2_int].a(127);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_m) {
            try {
              this.field_m.a(114);
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

    private final mf a(int param0, int param1, int param2, int param3, Object param4) {
        mf var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new mf();
        var6.field_f = param1;
        if (param0 != 0) {
          return (mf) null;
        }
        var6.field_g = param2;
        var6.field_a = param3;
        var6.field_c = param4;
        var7 = this;
        synchronized (var7) {
          if (this.field_h == null) {
            this.field_a = var6;
            this.field_h = var6;
          } else {
            this.field_h.field_b = var6;
            this.field_h = var6;
          }
          this.notify();
        }
        return var6;
    }

    final mf a(int param0, String param1, byte param2) {
        if (param2 != 60) {
          this.a(-116);
        }
        return this.a(param1, param0, false, (byte) -2);
    }

    private final static b a(String param0, int param1, String param2, int param3) {
        try {
          int var6 = 0;
          b stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          b var8 = null;
          Exception var8_ref = null;
          if (param3 == 33) {
            var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param1; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new b(new File(var7, var4), "rw", 10000L);
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

    final mf a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          this.field_w = false;
        }
        return this.a(0, param4 + (param3 << 16), param1 + (param0 << 16), 6, (Object) null);
    }

    private final mf a(String param0, int param1, boolean param2, byte param3) {
        if (param3 >= 0) {
          this.field_r = (b) null;
        }
        return this.a(0, param1, 0, !param2 ? 1 : 22, param0);
    }

    final mf a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 < 87) {
          field_j = (String) null;
        }
        return this.a(0, 0, 0, 8, new Object[]{param1, param2, param3});
    }

    final mf a(Runnable param0, byte param1, int param2) {
        if (param1 != -21) {
          String var5 = (String) null;
          this.a(-53, (String) null, (byte) -45);
        }
        return this.a(param1 ^ -21, param2, 0, 2, param0);
    }

    final mf a(java.net.URL param0, int param1) {
        int var3 = 119 / ((17 - param1) / 54);
        return this.a(0, 0, 0, 4, param0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_62_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          b var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          wb var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          mf var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          Object[] var14 = null;
          String var15 = null;
          java.awt.Frame var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_w) {
                if (this.field_a != null) {
                  var8 = this.field_a;
                  this.field_a = this.field_a.field_b;
                  if (null == this.field_a) {
                    this.field_h = null;
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
                    if (field_b > ll.a(1000)) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_f);
                    break;
                  case 4:
                    if (ll.a(1000) < field_b) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_c);
                    if (this.field_v &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var17.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_v) {
                      throw he.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (this.field_n) {
                          var8.field_e = this.field_c.a(0);
                        } else {
                          var8.field_e = Class.forName("ti").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var16;
                        var16.setResizable(false);
                        if (!this.field_n) {
                          Class.forName("ti").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var16, new Integer(var8.field_f >>> 16), new Integer(65535 & var8.field_f), new Integer(var8.field_g >> 16), new Integer(var8.field_g & 65535)});
                        } else {
                          this.field_c.a(var8.field_f >>> 16, var16, 0, var8.field_g >> 16, 65535 & var8.field_f, var8.field_g & 65535);
                        }
                        break;
                      case 13:
                        var3_ref = he.a("", 0, (String) (var8.field_c), field_e);
                        var8.field_e = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_v &&
                          14 == var2_int) {
                          var3_int = var8.field_f;
                          var4 = var8.field_g;
                          if (!this.field_n) {
                            Class.forName("ub").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_l.a(-2, var4, var3_int);
                          }
                          break;
                        }
                        if (this.field_v &&
                          var2_int == 15) {
                          stackIn_62_0 = (var8.field_f == 0) ? 0 : 1;
                          var3_int = stackIn_62_0;
                          var13 = (java.awt.Component) (var8.field_c);
                          if (!this.field_n) {
                            Class.forName("ub").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_l.a(var3_int != 0, var13, -64);
                          }
                          break;
                        }
                        if (!this.field_n &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.field_c);
                          Class.forName("ub").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var14[0], var14[1], new Integer(var8.field_f), new Integer(var8.field_g), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw he.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_o.startsWith("win")) {
                              throw he.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var15 = (String) (var8.field_c);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw he.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var15.length() > var5; var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var15.charAt(var5))) {
                                throw he.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref2;
                            throw he.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 12:
                        var3_ref = he.a(field_t, 0, (String) (var8.field_c), field_e);
                        var8.field_e = var3_ref;
                        break;
                      case 7:
                        if (this.field_n) {
                          this.field_c.a((java.awt.Frame) (var8.field_c), 8);
                        } else {
                          Class.forName("ti").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_b > ll.a(1000)) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 3:
                        if (ll.a(1000) < field_b) {
                          throw new IOException();
                        }
                        var12 = (255 & var8.field_f >> 24) + "." + ((var8.field_f & 16731075) >> 16) + "." + ((var8.field_f & 65324) >> 8) + "." + (255 & var8.field_f);
                        var8.field_e = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_c);
                    if (this.field_v &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_c));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_f);
                    var8.field_e = var9;
                    break;
                  case 22:
                    if (ll.a(1000) < field_b) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (wb) null;
                      var8.field_e = ah.a((String) (var8.field_c), var8.field_f, -23891).b(true);
                    } catch (wb decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (wb) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
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

    final mf a(Class param0, int param1, String param2) {
        mf discarded$0 = null;
        if (param1 != -3645) {
          Object var5 = (Object) null;
          discarded$0 = this.a(-35, 55, -69, 103, (Object) null);
        }
        return this.a(0, 0, 0, 9, new Object[]{param0, param2});
    }

    final boolean b(int param0) {
        if (!this.field_v) {
          return false;
        }
        if (param0 != 2) {
          this.field_w = true;
        }
        if (!this.field_n) {
          return this.field_f != null ? true : false;
        }
        return this.field_c != null ? true : false;
    }

    final mf a(java.awt.Frame param0, int param1) {
        if (param1 >= -120) {
          String var4 = (String) null;
          this.a((Class) null, -83, (String) null);
        }
        return this.a(0, 0, 0, 7, param0);
    }

    final mf a(int param0) {
        if (param0 >= -77) {
          return (mf) null;
        }
        return this.a(0, 0, 0, 5, (Object) null);
    }

    he(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ff var7 = null;
        this.field_v = false;
        this.field_n = false;
        this.field_m = null;
        this.field_h = null;
        this.field_a = null;
        this.field_q = null;
        this.field_r = null;
        this.field_w = false;
        field_e = param0;
        field_d = "1.1";
        field_j = "Unknown";
        field_t = param1;
        stackIn_3_1 = (param3);
        this.field_v = stackIn_3_1;
        try {
          field_j = System.getProperty("java.vendor");
          field_d = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_j.toLowerCase().indexOf("microsoft") != -1) {
          this.field_n = true;
        }
        try {
          field_k = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_k = "Unknown";
        }
        field_o = field_k.toLowerCase();
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
          this.field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_n) {
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
        la.a((byte) 119, field_e, field_t);
        if (this.field_v) {
          this.field_m = new b(la.a("random.dat", (String) null, false, field_e), "rw", 25L);
          this.field_r = new b(la.a("main_file_cache.dat2", -3), "rw", 314572800L);
          this.field_q = new b(la.a("main_file_cache.idx255", -20), "rw", 1048576L);
          this.field_s = new b[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_s[var5_int] = new b(la.a("main_file_cache.idx" + var5_int, -31), "rw", 1048576L);
          }
          if (this.field_n) {
            try {
              Class.forName("lc").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_n) {
              var7 = new ff();
              this.field_c = var7;
            } else {
              this.field_f = Class.forName("ti").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_n) {
              this.field_p = Class.forName("ub").newInstance();
            } else {
              this.field_l = new gk();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_w = false;
        this.field_u = new Thread((Runnable) (this));
        this.field_u.setPriority(10);
        this.field_u.setDaemon(true);
        this.field_u.start();
    }

    static {
        field_b = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
