/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    ra[] field_p;
    private static int field_h;
    java.awt.EventQueue field_q;
    private Object field_t;
    static String field_r;
    ra field_a;
    static String field_b;
    boolean field_w;
    ra field_n;
    private Object field_o;
    ra field_k;
    private static String field_x;
    private fn field_c;
    private static volatile long field_u;
    private Thread field_j;
    static java.lang.reflect.Method field_v;
    private pb field_l;
    static String field_i;
    private boolean field_g;
    private static String field_s;
    private boolean field_e;
    private pb field_f;
    private pp field_m;
    private static String field_d;

    private final pb a(int param0, boolean param1, String param2, int param3) {
        if (param3 > -96) {
          return (pb) null;
        }
        return this.a(param0, !param1 ? 1 : 22, param2, (byte) -120, 0);
    }

    final pb a(Class[] param0, String param1, int param2, Class param3) {
        if (param2 < 72) {
          field_d = (String) null;
        }
        return this.a(0, 8, new Object[]{param3, param1, param0}, (byte) -122, 0);
    }

    final pb a(boolean param0, int param1, Runnable param2) {
        if (!param0) {
          return (pb) null;
        }
        return this.a(param1, 2, param2, (byte) -100, 0);
    }

    final pb a(int param0, int param1, String param2) {
        if (param0 != 65535) {
          this.field_e = true;
        }
        return this.a(param1, false, param2, param0 ^ -65434);
    }

    final pb a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -1194) {
          this.field_k = (ra) null;
        }
        return this.a(param1 + (param2 << 16), 6, (Object) null, (byte) 47, (param3 << 16) + param0);
    }

    final boolean a(boolean param0) {
        if (param0) {
          String var3 = (String) null;
          qb.a((String) null, -128, (String) null, true);
        }
        if (!this.field_w) {
          return false;
        }
        if (this.field_g) {
          return this.field_c != null ? true : false;
        }
        return null != this.field_t ? true : false;
    }

    final pb a(java.net.URL param0, boolean param1) {
        pb discarded$0 = null;
        if (param1) {
          String var4 = (String) null;
          discarded$0 = this.a(-90, true, (String) null, -75);
        }
        return this.a(0, 4, param0, (byte) 92, 0);
    }

    private final pb a(int param0, int param1, Object param2, byte param3, int param4) {
        pb var6 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new pb();
        var6.field_a = param4;
        var6.field_b = param2;
        var6.field_c = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          if (this.field_f != null) {
            this.field_f.field_f = var6;
            this.field_f = var6;
          } else {
            this.field_l = var6;
            this.field_f = var6;
          }
          this.notify();
          var8 = 14 / ((param3 + 38) / 62);
        }
        return var6;
    }

    private final static ra a(String param0, int param1, String param2, boolean param3) {
        try {
          int var6 = 0;
          ra stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ra var8 = null;
          Exception var8_ref = null;
          if (param1 != 33) {
            if (param1 != 34) {
              var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (!param3) {
            field_v = (java.lang.reflect.Method) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ra(new File(var7, var4), "rw", 10000L);
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
          lg var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ra var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          pb var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          String var11 = null;
          Object[] var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_e) {
                if (this.field_l != null) {
                  var8 = this.field_l;
                  this.field_l = this.field_l.field_f;
                  if (this.field_l == null) {
                    this.field_f = null;
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
                  case 22:
                    if (field_u > pr.a(14274)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (lg) null;
                      var8.field_e = ho.a(var8.field_g, -4276, (String) (var8.field_b)).b(-10463);
                    } catch (lg decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (lg) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 8:
                    var18 = (Object[]) (var8.field_b);
                    if (this.field_w &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_w) {
                      throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (pr.a(14274) < field_u) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.field_g >> 24) + "." + ((16756253 & var8.field_g) >> 16) + "." + ((var8.field_g & 65287) >> 8) + "." + (255 & var8.field_g);
                        var8.field_e = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (!this.field_g) {
                          var8.field_e = Class.forName("ic").getMethod("listmodes", new Class[]{}).invoke(this.field_t, new Object[]{});
                        } else {
                          var8.field_e = this.field_c.a(-19750);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var14;
                        var14.setResizable(false);
                        if (!this.field_g) {
                          Class.forName("ic").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{var14, new Integer(var8.field_g >>> 16), new Integer(65535 & var8.field_g), new Integer(var8.field_a >> 16), new Integer(var8.field_a & 65535)});
                        } else {
                          this.field_c.a(var14, 65535 & var8.field_a, var8.field_g >>> 16, 65535 & var8.field_g, var8.field_a >> 16, 0);
                        }
                        break;
                      case 7:
                        if (this.field_g) {
                          this.field_c.a(0, (java.awt.Frame) (var8.field_b));
                        } else {
                          Class.forName("ic").getMethod("exit", new Class[]{}).invoke(this.field_t, new Object[]{});
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_w &&
                          14 == var2_int) {
                          var3_int = var8.field_g;
                          var4 = var8.field_a;
                          if (this.field_g) {
                            this.field_m.a(var3_int, -4, var4);
                          } else {
                            Class.forName("lj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_w &&
                          var2_int == 15) {
                          stackIn_83_0 = (var8.field_g == 0) ? 0 : 1;
                          var3_int = stackIn_83_0;
                          var13 = (java.awt.Component) (var8.field_b);
                          if (!this.field_g) {
                            Class.forName("lj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_o, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_m.a(var3_int != 0, var13, 0);
                          }
                          break;
                        }
                        if (!this.field_g &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_b);
                          Class.forName("lj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_o, new Object[]{var12[0], var12[1], new Integer(var8.field_g), new Integer(var8.field_a), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_b.startsWith("win")) {
                              throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.field_b);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref2;
                            throw qb.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref3 = qb.a((String) (var8.field_b), field_h, "", true);
                        var8.field_e = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = qb.a((String) (var8.field_b), field_h, field_s, true);
                        var8.field_e = var3_ref3;
                        break;
                      case 21:
                        if (pr.a(14274) < field_u) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                        break;
                    }
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_b);
                    if (this.field_w &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 4:
                    if (field_u > pr.a(14274)) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_b));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_g);
                    var8.field_e = var9;
                    break;
                  case 1:
                    if (pr.a(14274) < field_u) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_g);
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
            this.field_e = true;
            this.notifyAll();
          }
          if (param0 < 55) {
            return;
          }
          try {
            this.field_j.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_k) {
            try {
              this.field_k.c(10);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_n != null) {
            try {
              this.field_n.c(10);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_p) {
            for (var2_int = 0; var2_int < this.field_p.length; var2_int++) {
              if (this.field_p[var2_int] != null) {
                try {
                  this.field_p[var2_int].c(10);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_a) {
            try {
              this.field_a.c(10);
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

    final pb a(java.awt.Frame param0, byte param1) {
        if (param1 <= 119) {
          this.field_k = (ra) null;
        }
        return this.a(0, 7, param0, (byte) 55, 0);
    }

    final pb a(int param0) {
        if (param0 != 12) {
          return (pb) null;
        }
        return this.a(0, 5, (Object) null, (byte) -110, 0);
    }

    final pb a(Class param0, byte param1, String param2) {
        if (param1 <= 24) {
          this.a(false);
        }
        return this.a(0, 9, new Object[]{param0, param2}, (byte) -110, 0);
    }

    qb(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        fn var7 = null;
        this.field_w = false;
        this.field_n = null;
        this.field_k = null;
        this.field_a = null;
        this.field_l = null;
        this.field_e = false;
        this.field_g = false;
        this.field_f = null;
        field_r = "Unknown";
        field_s = param1;
        field_h = param0;
        field_i = "1.1";
        stackIn_3_1 = (param3);
        this.field_w = stackIn_3_1;
        try {
          field_r = System.getProperty("java.vendor");
          field_i = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
          this.field_g = true;
        }
        try {
          field_x = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_x = "Unknown";
        }
        field_b = field_x.toLowerCase();
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
          this.field_q = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        ug.a(field_h, field_s, (byte) 116);
        if (this.field_w) {
          this.field_a = new ra(ug.a("random.dat", field_h, -18261, (String) null), "rw", 25L);
          this.field_k = new ra(ug.a("main_file_cache.dat2", false), "rw", 314572800L);
          this.field_n = new ra(ug.a("main_file_cache.idx255", false), "rw", 1048576L);
          this.field_p = new ra[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_p[var5_int] = new ra(ug.a("main_file_cache.idx" + var5_int, false), "rw", 1048576L);
          }
          if (this.field_g) {
            try {
              Class.forName("mo").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_g) {
              var7 = new fn();
              this.field_c = var7;
            } else {
              this.field_t = Class.forName("ic").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_g) {
              this.field_o = Class.forName("lj").newInstance();
            } else {
              this.field_m = new pp();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_e = false;
        this.field_j = new Thread((Runnable) (this));
        this.field_j.setPriority(10);
        this.field_j.setDaemon(true);
        this.field_j.start();
    }

    static {
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
