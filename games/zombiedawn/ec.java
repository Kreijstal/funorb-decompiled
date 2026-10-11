/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    qn[] field_q;
    java.awt.EventQueue field_x;
    private op field_a;
    private Object field_l;
    private boolean field_w;
    private Thread field_f;
    qn field_b;
    private go field_m;
    qn field_i;
    private static String field_r;
    private static volatile long field_j;
    private Object field_o;
    private th field_v;
    static String field_n;
    static java.lang.reflect.Method field_d;
    static String field_h;
    private boolean field_u;
    boolean field_t;
    private static String field_p;
    private op field_k;
    private static String field_s;
    static String field_g;
    qn field_e;
    private static int field_c;

    final boolean c(int param0) {
        if (!this.field_t) {
          return false;
        }
        if (param0 != 10) {
          return false;
        }
        if (this.field_u) {
          return null != this.field_m ? true : false;
        }
        return this.field_o != null ? true : false;
    }

    final op a(int param0, int param1, int param2, int param3, int param4) {
        op discarded$0 = null;
        if (param1 != 1525233840) {
          String var7 = (String) null;
          discarded$0 = this.a((String) null, -122, true, 56);
        }
        return this.a((byte) 61, (param4 << 16) + param2, 6, (param0 << 16) + param3, (Object) null);
    }

    final op a(java.awt.Frame param0, byte param1) {
        if (param1 <= 4) {
          return (op) null;
        }
        return this.a((byte) 61, 0, 7, 0, param0);
    }

    final op a(int param0, java.net.URL param1) {
        if (param0 != 7645) {
          return (op) null;
        }
        return this.a((byte) 61, 0, 4, 0, param1);
    }

    final op a(int param0) {
        if (param0 != -1) {
          return (op) null;
        }
        return this.a((byte) 61, 0, 5, 0, (Object) null);
    }

    private final op a(byte param0, int param1, int param2, int param3, Object param4) {
        op var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new op();
        if (param0 != 61) {
          this.field_x = (java.awt.EventQueue) null;
        }
        var6.field_g = param1;
        var6.field_e = param4;
        var6.field_a = param2;
        var6.field_c = param3;
        var7 = this;
        synchronized (var7) {
          if (this.field_a == null) {
            this.field_k = var6;
            this.field_a = var6;
          } else {
            this.field_a.field_b = var6;
            this.field_a = var6;
          }
          this.notify();
        }
        return var6;
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_71_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          qn var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          dg var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          op var8 = null;
          String var9 = null;
          java.awt.Frame var10 = null;
          java.awt.Component var11 = null;
          String var12 = null;
          Object[] var13 = null;
          java.awt.datatransfer.Clipboard var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_w) {
                if (null != this.field_k) {
                  var8 = this.field_k;
                  this.field_k = this.field_k.field_b;
                  if (this.field_k == null) {
                    this.field_a = null;
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
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_e));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_g);
                    var8.field_d = var18;
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_e);
                    if (this.field_t &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var8.field_e);
                    if (this.field_t &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_d = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_t) {
                      throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 7:
                        if (!this.field_u) {
                          Class.forName("bk").getMethod("exit", new Class[]{}).invoke(this.field_o, new Object[]{});
                        } else {
                          this.field_m.a((java.awt.Frame) (var8.field_e), 6411);
                        }
                        break;
                      case 13:
                        var3_ref = ec.a((String) (var8.field_e), (byte) -44, field_c, "");
                        var8.field_d = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_t &&
                          var2_int == 14) {
                          var3_int = var8.field_g;
                          var4_int = var8.field_c;
                          if (this.field_u) {
                            this.field_v.a(var4_int, var3_int, (byte) -70);
                          } else {
                            Class.forName("jn").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_l, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_t &&
                          var2_int == 15) {
                          stackIn_71_0 = (0 == var8.field_g) ? 0 : 1;
                          var3_int = stackIn_71_0;
                          var11 = (java.awt.Component) (var8.field_e);
                          if (this.field_u) {
                            this.field_v.a(var11, true, var3_int != 0);
                          } else {
                            Class.forName("jn").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_l, new Object[]{var11, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_u &&
                          17 == var2_int) {
                          var13 = (Object[]) (var8.field_e);
                          Class.forName("jn").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_l, new Object[]{var13[0], var13[1], new Integer(var8.field_g), new Integer(var8.field_c), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_n.startsWith("win")) {
                              throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var12 = (String) (var8.field_e);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var12.length() > var5; var5++) {
                              if (-1 == var4.indexOf((int) var12.charAt(var5))) {
                                throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_d = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref2;
                            throw ec.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 12:
                        var3_ref = ec.a((String) (var8.field_e), (byte) -44, field_c, field_s);
                        var8.field_d = var3_ref;
                        break;
                      case 6:
                        var10 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_d = var10;
                        var10.setResizable(false);
                        if (!this.field_u) {
                          Class.forName("bk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{var10, new Integer(var8.field_g >>> 16), new Integer(65535 & var8.field_g), new Integer(var8.field_c >> 16), new Integer(65535 & var8.field_c)});
                        } else {
                          this.field_m.a(var8.field_c >> 16, var8.field_g >>> 16, 65535 & var8.field_c, 65535 & var8.field_g, (byte) 81, var10);
                        }
                        break;
                      case 5:
                        if (!this.field_u) {
                          var8.field_d = Class.forName("bk").getMethod("listmodes", new Class[]{}).invoke(this.field_o, new Object[]{});
                        } else {
                          var8.field_d = this.field_m.a(8);
                        }
                        break;
                      case 21:
                        if (pd.a(-22826) < field_j) {
                          throw new IOException();
                        }
                        var8.field_d = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                        break;
                      case 3:
                        if (pd.a(-22826) < field_j) {
                          throw new IOException();
                        }
                        var9 = (255 & var8.field_g >> 24) + "." + (255 & var8.field_g >> 16) + "." + ((65496 & var8.field_g) >> 8) + "." + (255 & var8.field_g);
                        var8.field_d = java.net.InetAddress.getByName(var9).getHostName();
                        break;
                    }
                    break;
                  case 4:
                    if (pd.a(-22826) < field_j) {
                      throw new IOException();
                    }
                    var8.field_d = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                    break;
                  case 22:
                    if (field_j > pd.a(-22826)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (dg) null;
                      var8.field_d = ud.a((String) (var8.field_e), (byte) 68, var8.field_g).a(false);
                    } catch (dg decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (dg) (Object) decompiledCaughtException;
                      var8.field_d = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_j > pd.a(-22826)) {
                      throw new IOException();
                    }
                    var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_g);
                    break;
                }
              }
              var8.field_f = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_f = 2;
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

    final op a(int param0, String param1, int param2) {
        op discarded$0 = null;
        if (param0 != 2) {
          String var5 = (String) null;
          discarded$0 = this.a((String) null, 28, true, -32);
        }
        return this.a(param1, param2, false, -124);
    }

    final op a(byte param0, String param1, Class param2) {
        if (param0 != -113) {
          Runnable var5 = (Runnable) null;
          this.a(50, (Runnable) null, false);
        }
        return this.a((byte) 61, 0, 9, 0, new Object[]{param2, param1});
    }

    private final op a(String param0, int param1, boolean param2, int param3) {
        int var5 = 28 / ((param3 + 56) / 58);
        return this.a((byte) 61, param1, !param2 ? 1 : 22, 0, param0);
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
            this.field_w = true;
            this.notifyAll();
          }
          try {
            if (param0 != 0) {
              field_d = (java.lang.reflect.Method) null;
            }
            this.field_f.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_e != null) {
            try {
              this.field_e.c(-97);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_i) {
            try {
              this.field_i.c(param0 - 107);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_q != null) {
            for (var2_int = 0; this.field_q.length > var2_int; var2_int++) {
              if (this.field_q[var2_int] != null) {
                try {
                  this.field_q[var2_int].c(param0 - 73);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_b) {
            try {
              this.field_b.c(param0 - 79);
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

    private final static qn a(String param0, byte param1, int param2, String param3) {
        try {
          int var6 = 0;
          qn stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          qn var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param1 != -44) {
            var9 = (String) null;
            ec.a((String) null, (byte) -111, 37, (String) null);
          }
          if (33 == param2) {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param2 != 34) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new qn(new File(var7, var4), "rw", 10000L);
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

    final op a(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != 255) {
          this.field_q = (qn[]) null;
        }
        return this.a((byte) 61, 0, 8, 0, new Object[]{param1, param3, param0});
    }

    ec(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        go var6 = null;
        this.field_a = null;
        this.field_i = null;
        this.field_t = false;
        this.field_b = null;
        this.field_u = false;
        this.field_w = false;
        this.field_k = null;
        this.field_e = null;
        field_s = param1;
        stackIn_3_1 = (param3);
        this.field_t = stackIn_3_1;
        field_c = param0;
        field_g = "1.1";
        field_h = "Unknown";
        try {
          field_h = System.getProperty("java.vendor");
          field_g = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_h.toLowerCase().indexOf("microsoft") != -1) {
          this.field_u = true;
        }
        try {
          field_p = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_p = "Unknown";
        }
        field_n = field_p.toLowerCase();
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
          field_r = System.getProperty("user.home");
          if (null != field_r) {
            field_r = field_r + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_r) {
          field_r = "~/";
        }
        try {
          this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_u) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_d = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        gh.a(field_c, (byte) 127, field_s);
        if (this.field_t) {
          this.field_b = new qn(gh.a((String) null, field_c, (byte) 21, "random.dat"), "rw", 25L);
          this.field_e = new qn(gh.a(-71, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_i = new qn(gh.a(-115, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_q = new qn[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_q[var5_int] = new qn(gh.a(-97, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_u) {
            try {
              Class.forName("db").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_u) {
              this.field_o = Class.forName("bk").newInstance();
            } else {
              var6 = new go();
              this.field_m = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_u) {
              this.field_l = Class.forName("jn").newInstance();
            } else {
              this.field_v = new th();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_w = false;
        this.field_f = new Thread((Runnable) (this));
        this.field_f.setPriority(10);
        this.field_f.setDaemon(true);
        this.field_f.start();
    }

    final op a(int param0, Runnable param1, boolean param2) {
        if (!param2) {
          String var5 = (String) null;
          this.a(-51, (String) null, -36);
        }
        return this.a((byte) 61, param0, 2, 0, param1);
    }

    static {
        field_j = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
