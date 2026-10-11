/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md implements Runnable {
    private static volatile long field_s;
    private static int field_a;
    pl field_t;
    pl field_x;
    private eh field_g;
    boolean field_q;
    private static String field_w;
    private boolean field_o;
    private static String field_d;
    pl[] field_e;
    private static String field_j;
    private ic field_u;
    static String field_f;
    static String field_l;
    static String field_m;
    private Thread field_p;
    private pk field_k;
    static java.lang.reflect.Method field_h;
    private ic field_r;
    private boolean field_c;
    private Object field_v;
    pl field_i;
    java.awt.EventQueue field_b;
    private Object field_n;

    final ic b(byte param0) {
        if (param0 > -10) {
          this.field_v = (Object) null;
        }
        return this.a(0, 0, 5, (Object) null, (byte) 116);
    }

    final boolean a(int param0) {
        ic discarded$0 = null;
        if (param0 != 2) {
          Object var3 = (Object) null;
          discarded$0 = this.a(76, -63, -117, (Object) null, (byte) 11);
        }
        if (!this.field_q) {
          return false;
        }
        if (!this.field_o) {
          return null != this.field_v ? true : false;
        }
        return null != this.field_k ? true : false;
    }

    final void a(byte param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_c = true;
            this.notifyAll();
          }
          try {
            if (param0 != -84) {
              this.run();
            }
            this.field_p.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.a(19808);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_i != null) {
            try {
              this.field_i.a(param0 + 19892);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_e) {
            for (var2_int = 0; this.field_e.length > var2_int; var2_int++) {
              if (this.field_e[var2_int] != null) {
                try {
                  this.field_e[var2_int].a(19808);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_x != null) {
            try {
              this.field_x.a(19808);
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

    private final ic a(int param0, int param1, int param2, Object param3, byte param4) {
        ic var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new ic();
        var6.field_c = param0;
        var6.field_e = param3;
        if (param4 != 116) {
          this.b((byte) 104);
        }
        var6.field_d = param1;
        var6.field_a = param2;
        var7 = this;
        synchronized (var7) {
          if (this.field_u != null) {
            this.field_u.field_f = var6;
            this.field_u = var6;
          } else {
            this.field_r = var6;
            this.field_u = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final static pl a(int param0, String param1, String param2, byte param3) {
        try {
          int var6 = 0;
          pl stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          pl var8 = null;
          Exception var8_ref = null;
          if (param0 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param0 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
            }
          }
          if (param3 != 84) {
            field_l = (String) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new pl(new File(var7, var4), "rw", 10000L);
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

    final ic a(int param0, Class[] param1, Class param2, String param3) {
        int var5 = -103 / ((param0 - 62) / 32);
        return this.a(0, 0, 8, new Object[]{param2, param3, param1}, (byte) 116);
    }

    private final ic a(byte param0, String param1, boolean param2, int param3) {
        if (param0 != 118) {
          return (ic) null;
        }
        return this.a(param3, 0, param2 ? 22 : 1, param1, (byte) 116);
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
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          pl var3_ref_pl = null;
          pg var3_ref_pg = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          ic var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.Frame var12 = null;
          String var13 = null;
          Object[] var14 = null;
          java.awt.Component var15 = null;
          String var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_c) {
                if (null != this.field_r) {
                  var8 = this.field_r;
                  this.field_r = this.field_r.field_f;
                  if (null == this.field_r) {
                    this.field_u = null;
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
                var2_int = var8.field_a;
                switch (var2_int) {
                  case 1:
                    if (pf.a(0) < field_s) {
                      throw new IOException();
                    }
                    var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_c);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_e));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_c);
                    var8.field_b = var18;
                    break;
                  case 4:
                    if (field_s > pf.a(0)) {
                      throw new IOException();
                    }
                    var8.field_b = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_e);
                    if (this.field_q &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 16:
                  default:
                    if (!this.field_q) {
                      throw md.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (pf.a(0) < field_s) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.field_c >> 24) + "." + (255 & var8.field_c >> 16) + "." + ((var8.field_c & 65491) >> 8) + "." + (255 & var8.field_c);
                        var8.field_b = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 21:
                        if (pf.a(0) < field_s) {
                          throw new IOException();
                        }
                        var8.field_b = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                        break;
                      case 5:
                        if (this.field_o) {
                          var8.field_b = this.field_k.a((byte) 88);
                        } else {
                          var8.field_b = Class.forName("se").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_q &&
                          var2_int == 14) {
                          var3 = var8.field_c;
                          var4_int = var8.field_d;
                          if (this.field_o) {
                            this.field_g.a((byte) 121, var3, var4_int);
                          } else {
                            Class.forName("bm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_q &&
                          var2_int == 15) {
                          stackIn_83_0 = (var8.field_c == 0) ? 0 : 1;
                          var3 = stackIn_83_0;
                          var15 = (java.awt.Component) (var8.field_e);
                          if (!this.field_o) {
                            Class.forName("bm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var15, new Boolean(var3 != 0)});
                          } else {
                            this.field_g.a(var3 != 0, (byte) 90, var15);
                          }
                          break;
                        }
                        if (!this.field_o &&
                          17 == var2_int) {
                          var14 = (Object[]) (var8.field_e);
                          Class.forName("bm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var14[0], var14[1], new Integer(var8.field_c), new Integer(var8.field_d), var14[2]});
                        } else {
                          if (16 != var2_int) {
                            throw md.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_f.startsWith("win")) {
                              throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_e);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (var4.indexOf((int) var13.charAt(var5)) == -1) {
                                throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_b = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref_Exception;
                            throw md.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_pl = md.a(field_a, "", (String) (var8.field_e), (byte) 84);
                        var8.field_b = var3_ref_pl;
                        break;
                      case 12:
                        var3_ref_pl = md.a(field_a, field_j, (String) (var8.field_e), (byte) 84);
                        var8.field_b = var3_ref_pl;
                        break;
                      case 7:
                        if (!this.field_o) {
                          Class.forName("se").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                        } else {
                          this.field_k.a(106, (java.awt.Frame) (var8.field_e));
                        }
                        break;
                      case 6:
                        var12 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_b = var12;
                        var12.setResizable(false);
                        if (!this.field_o) {
                          Class.forName("se").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var12, new Integer(var8.field_c >>> 16), new Integer(var8.field_c & 65535), new Integer(var8.field_d >> 16), new Integer(var8.field_d & 65535)});
                        } else {
                          this.field_k.a(var8.field_d & 65535, 65535 & var8.field_c, var8.field_d >> 16, var8.field_c >>> 16, -16, var12);
                        }
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_b = var10.getContents((Object) null);
                    break;
                  case 9:
                    var9 = (Object[]) (var8.field_e);
                    if (this.field_q &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                    break;
                  case 22:
                    if (pf.a(0) < field_s) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (pg) null;
                      var8.field_b = bf.a((String) (var8.field_e), (byte) -84, var8.field_c).a(0);
                    } catch (pg decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_pg = (pg) (Object) decompiledCaughtException;
                      var8.field_b = var3_ref_pg.getMessage();
                      throw var3_ref_pg;
                    }
                    break;
                }
              }
              var8.field_g = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_g = 2;
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

    final ic a(boolean param0, Class param1, String param2) {
        if (param0) {
          this.b((byte) -62);
        }
        return this.a(0, 0, 9, new Object[]{param1, param2}, (byte) 116);
    }

    final ic a(String param0, int param1, int param2) {
        if (param1 != 0) {
          this.a((byte) 110);
        }
        return this.a((byte) 118, param0, false, param2);
    }

    final ic a(java.awt.Frame param0, int param1) {
        int var3 = 18 % ((-50 - param1) / 57);
        return this.a(0, 0, 7, param0, (byte) 116);
    }

    final ic a(byte param0, java.net.URL param1) {
        if (param0 <= 96) {
          this.field_b = (java.awt.EventQueue) null;
        }
        return this.a(0, 0, 4, param1, (byte) 116);
    }

    final ic a(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
          this.field_v = (Object) null;
        }
        return this.a(param1, 0, 2, param0, (byte) 116);
    }

    final ic a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          String var7 = (String) null;
          this.a(111, (Class[]) null, (Class) null, (String) null);
        }
        return this.a(param1 + (param0 << 16), param3 + (param4 << 16), 6, (Object) null, (byte) 116);
    }

    md(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        pk var7 = null;
        this.field_x = null;
        this.field_u = null;
        this.field_q = false;
        this.field_t = null;
        this.field_r = null;
        this.field_o = false;
        this.field_c = false;
        this.field_i = null;
        field_a = param0;
        field_m = "1.1";
        field_j = param1;
        field_l = "Unknown";
        stackIn_3_1 = (param3);
        this.field_q = stackIn_3_1;
        try {
          field_l = System.getProperty("java.vendor");
          field_m = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_l.toLowerCase().indexOf("microsoft") != -1) {
          this.field_o = true;
        }
        try {
          field_w = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_w = "Unknown";
        }
        field_f = field_w.toLowerCase();
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
          field_d = System.getProperty("user.home");
          if (field_d != null) {
            field_d = field_d + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_d == null) {
          field_d = "~/";
        }
        try {
          this.field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_o) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        nk.a(field_a, 0, field_j);
        if (this.field_q) {
          this.field_x = new pl(nk.a(-1, "random.dat", (String) null, field_a), "rw", 25L);
          this.field_t = new pl(nk.a("main_file_cache.dat2", -2), "rw", 314572800L);
          this.field_i = new pl(nk.a("main_file_cache.idx255", -2), "rw", 1048576L);
          this.field_e = new pl[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_e[var5_int] = new pl(nk.a("main_file_cache.idx" + var5_int, -2), "rw", 1048576L);
          }
          if (this.field_o) {
            try {
              Class.forName("oc").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_o) {
              var7 = new pk();
              this.field_k = var7;
            } else {
              this.field_v = Class.forName("se").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_o) {
              this.field_g = new eh();
            } else {
              this.field_n = Class.forName("bm").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_c = false;
        this.field_p = new Thread((Runnable) (this));
        this.field_p.setPriority(10);
        this.field_p.setDaemon(true);
        this.field_p.start();
    }

    static {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
