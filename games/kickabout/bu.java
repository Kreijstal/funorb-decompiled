/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bu implements Runnable {
    ao field_q;
    ao field_c;
    private static String field_e;
    java.awt.EventQueue field_a;
    ao field_j;
    private Thread field_s;
    boolean field_l;
    private boolean field_m;
    private gh field_k;
    private static volatile long field_w;
    ao[] field_v;
    private wu field_p;
    private Object field_g;
    static String field_r;
    static java.lang.reflect.Method field_x;
    private boolean field_f;
    static String field_h;
    private static String field_t;
    private static int field_d;
    private Object field_i;
    private static String field_b;
    private wu field_o;
    private wg field_n;
    static String field_u;

    final wu a(int param0, Class[] param1, Class param2, String param3) {
        if (param0 != -30971) {
          this.field_k = (gh) null;
        }
        return this.a(8, 0, 8128, new Object[]{param2, param3, param1}, 0);
    }

    final wu a(String param0, Class param1, int param2) {
        if (param2 != 0) {
          return (wu) null;
        }
        return this.a(9, 0, 8128, new Object[]{param1, param0}, 0);
    }

    final wu a(byte param0, int param1, int param2, java.awt.Component param3) {
        java.awt.Point var5 = param3.getLocationOnScreen();
        if (param0 <= 19) {
          field_e = (String) null;
        }
        return this.a(14, param1 + var5.y, 8128, (Object) null, var5.x + param2);
    }

    private final wu a(String param0, boolean param1, int param2, int param3) {
        if (param2 != -8) {
          return (wu) null;
        }
        return this.a(param1 ? 22 : 1, 0, 8128, param0, param3);
    }

    final wu b(boolean param0) {
        if (!param0) {
          return (wu) null;
        }
        return this.a(5, 0, 8128, (Object) null, 0);
    }

    final wu a(int param0, java.awt.Component param1, boolean param2) {
        if (param0 > -116) {
          return (wu) null;
        }
        return this.a(15, 0, 8128, param1, !param2 ? 0 : 1);
    }

    final boolean b(int param0) {
        if (!this.field_l) {
          return false;
        }
        int var2 = -103 % ((param0 - 46) / 34);
        if (this.field_f) {
          return this.field_k != null ? true : false;
        }
        return this.field_i != null ? true : false;
    }

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
          ao var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          lw var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          wu var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          java.awt.Frame var13 = null;
          java.awt.Component var14 = null;
          String var15 = null;
          Object[] var16 = null;
          String var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_m) {
                if (null != this.field_o) {
                  var8 = this.field_o;
                  this.field_o = this.field_o.field_f;
                  if (this.field_o == null) {
                    this.field_p = null;
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
                  case 1:
                    if (nj.a(-119) < field_w) {
                      throw new IOException();
                    }
                    var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_d);
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_g);
                    if (this.field_l &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 16:
                  default:
                    if (!this.field_l) {
                      throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (nj.a(-68) < field_w) {
                          throw new IOException();
                        }
                        var17 = (255 & var8.field_d >> 24) + "." + ((16767672 & var8.field_d) >> 16) + "." + ((65454 & var8.field_d) >> 8) + "." + (var8.field_d & 255);
                        var8.field_b = java.net.InetAddress.getByName(var17).getHostName();
                        break;
                      case 12:
                        var3_ref = bu.a(-127, field_d, field_e, (String) (var8.field_g));
                        var8.field_b = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_l &&
                          var2_int == 14) {
                          var3_int = var8.field_d;
                          var4_int = var8.field_e;
                          if (!this.field_f) {
                            Class.forName("fl").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_n.a(var4_int, (byte) -40, var3_int);
                          }
                          break;
                        }
                        if (this.field_l &&
                          15 == var2_int) {
                          stackIn_70_0 = (var8.field_d == 0) ? 0 : 1;
                          var3_int = stackIn_70_0;
                          var14 = (java.awt.Component) (var8.field_g);
                          if (!this.field_f) {
                            Class.forName("fl").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_g, new Object[]{var14, new Boolean(var3_int != 0)});
                          } else {
                            this.field_n.a(var14, var3_int != 0, -106);
                          }
                          break;
                        }
                        if (!this.field_f &&
                          var2_int == 17) {
                          var16 = (Object[]) (var8.field_g);
                          Class.forName("fl").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_g, new Object[]{var16[0], var16[1], new Integer(var8.field_d), new Integer(var8.field_e), var16[2]});
                        } else {
                          if (var2_int != 16) {
                            throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_h.startsWith("win")) {
                              throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var15 = (String) (var8.field_g);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var15.length() > var5; var5++) {
                              if (-1 == var4.indexOf((int) var15.charAt(var5))) {
                                throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_b = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref2;
                            throw bu.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref = bu.a(-112, field_d, "", (String) (var8.field_g));
                        var8.field_b = var3_ref;
                        break;
                      case 7:
                        if (!this.field_f) {
                          Class.forName("fe").getMethod("exit", new Class[]{}).invoke(this.field_i, new Object[]{});
                        } else {
                          this.field_k.a(0, (java.awt.Frame) (var8.field_g));
                        }
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_b = var13;
                        var13.setResizable(false);
                        if (this.field_f) {
                          this.field_k.a(var8.field_d >>> 16, 65535 & var8.field_e, var8.field_d & 65535, var13, var8.field_e >> 16, -2147483648);
                        } else {
                          Class.forName("fe").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_i, new Object[]{var13, new Integer(var8.field_d >>> 16), new Integer(65535 & var8.field_d), new Integer(var8.field_e >> 16), new Integer(var8.field_e & 65535)});
                        }
                        break;
                      case 5:
                        if (this.field_f) {
                          var8.field_b = this.field_k.a(0);
                        } else {
                          var8.field_b = Class.forName("fe").getMethod("listmodes", new Class[]{}).invoke(this.field_i, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_w > nj.a(-52)) {
                          throw new IOException();
                        }
                        var8.field_b = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
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
                    var8.field_b = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_g);
                    if (this.field_l &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (field_w > nj.a(43)) {
                      throw new IOException();
                    }
                    var8.field_b = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_g));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_d);
                    var8.field_b = var9;
                    break;
                  case 22:
                    if (field_w > nj.a(35)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (lw) null;
                      var8.field_b = ql.a((String) (var8.field_g), var8.field_d, -13067).a(1);
                    } catch (lw decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (lw) (Object) decompiledCaughtException;
                      var8.field_b = var3_ref3.getMessage();
                      throw var3_ref3;
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

    final wu a(byte param0, java.awt.datatransfer.Transferable param1) {
        if (param0 != 68) {
          this.field_g = (Object) null;
        }
        return this.a(19, 0, 8128, param1, 0);
    }

    final wu a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          return (wu) null;
        }
        return this.a(6, param1 + (param4 << 16), 8128, (Object) null, (param3 << 16) + param0);
    }

    final wu a(int param0) {
        if (param0 != 15) {
          return (wu) null;
        }
        return this.a(18, 0, 8128, (Object) null, 0);
    }

    final void a(boolean param0) {
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
            stackIn_4_1 = (param0);
            this.field_m = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.field_s.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_c) {
            try {
              this.field_c.a(-101);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_j) {
            try {
              this.field_j.a(-118);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2_int = 0; var2_int < this.field_v.length; var2_int++) {
              if (this.field_v[var2_int] != null) {
                try {
                  this.field_v[var2_int].a(-123);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_q) {
            try {
              this.field_q.a(-106);
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

    final wu a(java.net.URL param0, byte param1) {
        if (param1 > -17) {
          String var4 = (String) null;
          bu.a(92, -82, (String) null, (String) null);
        }
        return this.a(4, 0, 8128, param0, 0);
    }

    final wu a(byte param0, java.awt.Frame param1) {
        if (param0 >= -36) {
          String var4 = (String) null;
          bu.a(-21, 74, (String) null, (String) null);
        }
        return this.a(7, 0, 8128, param1, 0);
    }

    final wu a(int param0, byte param1, Runnable param2) {
        if (param1 < 109) {
          this.field_g = (Object) null;
        }
        return this.a(2, 0, 8128, param2, param0);
    }

    private final wu a(int param0, int param1, int param2, Object param3, int param4) {
        wu var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        wu stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new wu();
        var6.field_e = param1;
        var6.field_d = param4;
        var6.field_g = param3;
        var6.field_c = param0;
        var7_ref = this;
        synchronized (var7_ref) {
          if (param2 != 8128) {
            stackIn_3_0 = (wu) null;
            return stackIn_3_0;
          }
          if (null != this.field_p) {
            this.field_p.field_f = var6;
            this.field_p = var6;
          } else {
            this.field_o = var6;
            this.field_p = var6;
          }
          this.notify();
        }
        return var6;
    }

    bu(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        gh var7 = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        this.field_l = false;
        this.field_m = false;
        this.field_j = null;
        this.field_c = null;
        this.field_f = false;
        this.field_p = null;
        this.field_o = null;
        this.field_q = null;
        field_u = "Unknown";
        field_r = "1.1";
        field_e = param1;
        field_d = param0;
        stackIn_3_1 = (param3);
        this.field_l = stackIn_3_1;
        try {
          field_u = System.getProperty("java.vendor");
          field_r = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
          this.field_f = true;
        }
        try {
          field_t = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_t = "Unknown";
        }
        field_h = field_t.toLowerCase();
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
          field_b = System.getProperty("user.home");
          if (null != field_b) {
            field_b = field_b + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_b) {
          field_b = "~/";
        }
        try {
          this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_f) {
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
        bj.a(field_e, (byte) -99, field_d);
        if (this.field_l) {
          this.field_q = new ao(bj.a("random.dat", (String) null, field_d, false), "rw", 25L);
          this.field_c = new ao(bj.a("main_file_cache.dat2", 0), "rw", 314572800L);
          this.field_j = new ao(bj.a("main_file_cache.idx255", 0), "rw", 1048576L);
          this.field_v = new ao[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_v[var5_int] = new ao(bj.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
          }
          if (this.field_f) {
            try {
              Class.forName("mw").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_f) {
              this.field_i = Class.forName("fe").newInstance();
            } else {
              var7 = new gh();
              this.field_k = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_f) {
              this.field_n = new wg();
            } else {
              this.field_g = Class.forName("fl").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_m = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    private final static ao a(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          ao stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ao var8 = null;
          Exception var8_ref = null;
          if (param1 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
          } else {
            if (param1 != 34) {
              var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_b, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 > -95) {
            return (ao) null;
          }
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new ao(new File(var7, var4), "rw", 10000L);
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

    final wu a(boolean param0, String param1, int param2) {
        if (!param0) {
          field_h = (String) null;
        }
        return this.a(param1, false, -8, param2);
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
