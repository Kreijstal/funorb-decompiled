/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    private boolean field_o;
    ee field_q;
    private sl field_r;
    ee field_l;
    static String field_c;
    ee[] field_v;
    private Object field_p;
    private static volatile long field_x;
    private static String field_m;
    static java.lang.reflect.Method field_i;
    private kk field_s;
    ee field_f;
    boolean field_k;
    private static String field_e;
    private kk field_n;
    private tl field_a;
    static String field_h;
    private static int field_t;
    private static String field_g;
    private boolean field_b;
    private Thread field_w;
    static String field_u;
    private Object field_j;
    java.awt.EventQueue field_d;

    private final kk a(boolean param0, String param1, int param2, int param3) {
        if (param3 != 20691) {
          field_u = (String) null;
        }
        return this.a(!param0 ? 1 : 22, param1, false, 0, param2);
    }

    final kk a(String param0, int param1, int param2) {
        if (param1 <= 47) {
          this.field_o = true;
        }
        return this.a(false, param0, param2, 20691);
    }

    final void a(byte param0) {
        try {
          InterruptedException interruptedException = null;
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref_Object = null;
          IOException var3 = null;
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            this.field_o = true;
            this.notifyAll();
          }
          try {
            this.field_w.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_l != null) {
            try {
              this.field_l.c(-1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_f) {
            try {
              this.field_f.c(-1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2 = 0; this.field_v.length > var2; var2++) {
              if (null != this.field_v[var2]) {
                try {
                  this.field_v[var2].c(-1);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_q) {
            try {
              this.field_q.c(-1);
            } catch (java.io.IOException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          var2 = 53 / ((47 - param0) / 41);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final kk a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          return (kk) null;
        }
        return this.a(6, (Object) null, param0, param2 + (param4 << 16), (param1 << 16) + param3);
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        if (!this.field_k) {
          return false;
        }
        if (!this.field_b) {
          return null != this.field_p ? true : false;
        }
        return null != this.field_r ? true : false;
    }

    final kk a(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
          return (kk) null;
        }
        return this.a(7, param1, false, 0, 0);
    }

    private final static ee a(int param0, String param1, String param2, int param3) {
        try {
          int var6 = 0;
          ee stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ee var8 = null;
          Exception var8_ref = null;
          if (param3 != -7) {
            return (ee) null;
          }
          if (param0 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
          } else {
            if (param0 == 34) {
              var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_g, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ee(new File(var7, var4), "rw", 10000L);
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

    final kk a(int param0, java.net.URL param1) {
        kk discarded$0 = null;
        if (param0 != 30085) {
          String var4 = (String) null;
          discarded$0 = this.a(true, (String) null, -77, -50);
        }
        return this.a(4, param1, false, 0, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_50_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ab var3_ref = null;
          ee var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          kk var8 = null;
          Object[] var9 = null;
          java.awt.Component var10 = null;
          String var11 = null;
          Object[] var12 = null;
          java.awt.Frame var13 = null;
          String var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_o) {
                if (null != this.field_s) {
                  var8 = this.field_s;
                  this.field_s = this.field_s.field_e;
                  if (this.field_s == null) {
                    this.field_n = null;
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
                var2_int = var8.field_g;
                switch (var2_int) {
                  case 1:
                    if (field_x > hn.a((byte) 80)) {
                      throw new IOException();
                    }
                    var8.field_c = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_a)), var8.field_b);
                    break;
                  case 22:
                    if (hn.a((byte) 80) < field_x) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ab) null;
                      var8.field_c = qj.a(27, (String) (var8.field_a), var8.field_b).a(31067);
                    } catch (ab decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ab) (Object) decompiledCaughtException;
                      var8.field_c = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_a));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_b);
                    var8.field_c = var18;
                    break;
                  case 4:
                    if (hn.a((byte) 80) < field_x) {
                      throw new IOException();
                    }
                    var8.field_c = new DataInputStream(((java.net.URL) (var8.field_a)).openStream());
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_a);
                    if (this.field_k &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_c = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_c = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_a);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_k) {
                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (hn.a((byte) 80) < field_x) {
                          throw new IOException();
                        }
                        var14 = (255 & var8.field_b >> 24) + "." + ((var8.field_b & 16770738) >> 16) + "." + ((var8.field_b & 65486) >> 8) + "." + (255 & var8.field_b);
                        var8.field_c = java.net.InetAddress.getByName(var14).getHostName();
                        break;
                      case 21:
                        if (hn.a((byte) 80) < field_x) {
                          throw new IOException();
                        }
                        var8.field_c = java.net.InetAddress.getByName((String) (var8.field_a)).getAddress();
                        break;
                      case 5:
                        if (!this.field_b) {
                          var8.field_c = Class.forName("hc").getMethod("listmodes", new Class[]{}).invoke(this.field_p, new Object[]{});
                        } else {
                          var8.field_c = this.field_r.a((byte) 113);
                        }
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_c = var13;
                        var13.setResizable(false);
                        if (this.field_b) {
                          this.field_r.a(65535 & var8.field_b, var8.field_b >>> 16, -7018, 65535 & var8.field_d, var13, var8.field_d >> 16);
                        } else {
                          Class.forName("hc").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{var13, new Integer(var8.field_b >>> 16), new Integer(var8.field_b & 65535), new Integer(var8.field_d >> 16), new Integer(65535 & var8.field_d)});
                        }
                        break;
                      case 7:
                        if (this.field_b) {
                          this.field_r.a((java.awt.Frame) (var8.field_a), -7738);
                        } else {
                          Class.forName("hc").getMethod("exit", new Class[]{}).invoke(this.field_p, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref2 = fd.a(field_t, (String) (var8.field_a), field_m, -7);
                        var8.field_c = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_k &&
                          14 == var2_int) {
                          var3_int = var8.field_b;
                          var4_int = var8.field_d;
                          if (!this.field_b) {
                            Class.forName("dm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_a.a(var4_int, -93, var3_int);
                          }
                          break;
                        }
                        if (this.field_k &&
                          15 == var2_int) {
                          stackIn_50_0 = (var8.field_b == 0) ? 0 : 1;
                          var3_int = stackIn_50_0;
                          var10 = (java.awt.Component) (var8.field_a);
                          if (this.field_b) {
                            this.field_a.a(0, var3_int != 0, var10);
                          } else {
                            Class.forName("dm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_j, new Object[]{var10, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_b &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_a);
                          Class.forName("dm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_j, new Object[]{var12[0], var12[1], new Integer(var8.field_b), new Integer(var8.field_d), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_c.startsWith("win")) {
                              throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.field_a);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4.indexOf((int) var11.charAt(var5)) == -1) {
                                throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_c = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_c = var3_ref3;
                            throw fd.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = fd.a(field_t, (String) (var8.field_a), "", -7);
                        var8.field_c = var3_ref2;
                        break;
                    }
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_a);
                    if (this.field_k &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_c = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
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

    final kk a(byte param0, Class param1, String param2) {
        if (param0 <= 91) {
          this.field_s = (kk) null;
        }
        return this.a(9, new Object[]{param1, param2}, false, 0, 0);
    }

    private final kk a(int param0, Object param1, boolean param2, int param3, int param4) {
        kk var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new kk();
        if (param2) {
          field_c = (String) null;
        }
        var6.field_d = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_n) {
            this.field_n.field_e = var6;
            this.field_n = var6;
          } else {
            this.field_s = var6;
            this.field_n = var6;
          }
          this.notify();
        }
        return var6;
    }

    final kk a(int param0, Runnable param1, int param2) {
        int var4 = -31 / ((9 - param2) / 44);
        return this.a(2, param1, false, 0, param0);
    }

    final kk a(int param0) {
        int var2 = 102 % ((-15 - param0) / 43);
        return this.a(5, (Object) null, false, 0, 0);
    }

    final kk a(Class[] param0, Class param1, String param2, int param3) {
        if (param3 < 104) {
          this.field_w = (Thread) null;
        }
        return this.a(8, new Object[]{param1, param2, param0}, false, 0, 0);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        sl var6 = null;
        this.field_o = false;
        this.field_q = null;
        this.field_n = null;
        this.field_k = false;
        this.field_b = false;
        this.field_f = null;
        this.field_l = null;
        this.field_s = null;
        field_m = param1;
        stackIn_3_1 = (param3);
        this.field_k = stackIn_3_1;
        field_u = "Unknown";
        field_t = param0;
        field_h = "1.1";
        try {
          field_u = System.getProperty("java.vendor");
          field_h = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_u.toLowerCase().indexOf("microsoft") != -1) {
          this.field_b = true;
        }
        try {
          field_e = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_e = "Unknown";
        }
        field_c = field_e.toLowerCase();
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
          field_g = System.getProperty("user.home");
          if (null != field_g) {
            field_g = field_g + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_g == null) {
          field_g = "~/";
        }
        try {
          this.field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_b) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_i = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        qd.a(-1, field_t, field_m);
        if (this.field_k) {
          this.field_q = new ee(qd.a(field_t, (String) null, "random.dat", true), "rw", 25L);
          this.field_l = new ee(qd.a("main_file_cache.dat2", -19005), "rw", 314572800L);
          this.field_f = new ee(qd.a("main_file_cache.idx255", -19005), "rw", 1048576L);
          this.field_v = new ee[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_v[var5_int] = new ee(qd.a("main_file_cache.idx" + var5_int, -19005), "rw", 1048576L);
          }
          if (this.field_b) {
            try {
              Class.forName("qe").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_b) {
              var6 = new sl();
              this.field_r = var6;
            } else {
              this.field_p = Class.forName("hc").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_b) {
              this.field_j = Class.forName("dm").newInstance();
            } else {
              this.field_a = new tl();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_o = false;
        this.field_w = new Thread((Runnable) (this));
        this.field_w.setPriority(10);
        this.field_w.setDaemon(true);
        this.field_w.start();
    }

    static {
        field_x = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
