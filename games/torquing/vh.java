/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static java.lang.reflect.Method field_j;
    private rc field_m;
    private static volatile long field_s;
    private Object field_x;
    private boolean field_l;
    private static String field_h;
    ue field_t;
    private an field_a;
    ue field_n;
    static String field_i;
    ue field_c;
    private static int field_f;
    ue[] field_w;
    boolean field_d;
    private boolean field_o;
    private rc field_g;
    private kd field_b;
    private Object field_e;
    private Thread field_k;
    private static String field_r;
    static String field_v;
    java.awt.EventQueue field_p;
    private static String field_q;
    static String field_u;

    final rc a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
          String var7 = (String) null;
          this.a((Class) null, false, (String) null);
        }
        return this.a((param1 << 16) + param2, 6, (Object) null, param3 + (param4 << 16), (byte) -116);
    }

    final rc a(int param0, java.net.URL param1) {
        if (param0 != 0) {
          field_i = (String) null;
        }
        return this.a(0, 4, param1, 0, (byte) -101);
    }

    final boolean a(byte param0) {
        if (param0 != 13) {
          this.field_l = false;
        }
        if (!this.field_d) {
          return false;
        }
        if (this.field_o) {
          return null != this.field_a ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final rc a(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -30475) {
          String var6 = (String) null;
          this.a((String) null, -80, 20);
        }
        return this.a(0, 8, new Object[]{param3, param2, param0}, 0, (byte) -119);
    }

    final void b(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          int var3_int = 0;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_l = true;
            this.notifyAll();
            var3_int = -46 % ((param0 + 47) / 50);
          }
          try {
            this.field_k.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.a((byte) 92);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.a((byte) 126);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_w != null) {
            for (var2_int = 0; this.field_w.length > var2_int; var2_int++) {
              if (this.field_w[var2_int] != null) {
                try {
                  this.field_w[var2_int].a((byte) 127);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_c != null) {
            try {
              this.field_c.a((byte) 94);
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

    final rc a(byte param0, int param1, Runnable param2) {
        if (param0 > -51) {
          return (rc) null;
        }
        return this.a(param1, 2, param2, 0, (byte) -123);
    }

    private final rc a(boolean param0, String param1, int param2, byte param3) {
        if (param3 != -96) {
          return (rc) null;
        }
        return this.a(param2, param0 ? 22 : 1, param1, 0, (byte) -128);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_79_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ko var3_ref = null;
          ue var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          rc var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.Frame var12 = null;
          Object[] var13 = null;
          String var14 = null;
          java.awt.Component var15 = null;
          String var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_l) {
                if (this.field_m != null) {
                  var8 = this.field_m;
                  this.field_m = this.field_m.field_f;
                  if (this.field_m == null) {
                    this.field_g = null;
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
                  case 22:
                    if (field_s > km.b(-1)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ko) null;
                      var8.field_d = gm.a(true, var8.field_b, (String) (var8.field_e)).a(-2049);
                    } catch (ko decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ko) (Object) decompiledCaughtException;
                      var8.field_d = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 4:
                    if (km.b(-1) < field_s) {
                      throw new IOException();
                    }
                    var8.field_d = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_e);
                    if (this.field_d &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_d) {
                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (km.b(-1) < field_s) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.field_b >> 24) + "." + (var8.field_b >> 16 & 255) + "." + ((65334 & var8.field_b) >> 8) + "." + (255 & var8.field_b);
                        var8.field_d = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 21:
                        if (km.b(-1) < field_s) {
                          throw new IOException();
                        }
                        var8.field_d = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                        break;
                      case 7:
                        if (this.field_o) {
                          this.field_a.a((byte) -102, (java.awt.Frame) (var8.field_e));
                        } else {
                          Class.forName("fl").getMethod("exit", new Class[]{}).invoke(this.field_x, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref2 = vh.a(field_r, (String) (var8.field_e), field_f, (byte) 95);
                        var8.field_d = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_d &&
                          var2_int == 14) {
                          var3_int = var8.field_b;
                          var4 = var8.field_c;
                          if (!this.field_o) {
                            Class.forName("ve").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_b.a(var4, var3_int, -85);
                          }
                          break;
                        }
                        if (this.field_d &&
                          var2_int == 15) {
                          stackIn_79_0 = (0 == var8.field_b) ? 0 : 1;
                          var3_int = stackIn_79_0;
                          var15 = (java.awt.Component) (var8.field_e);
                          if (this.field_o) {
                            this.field_b.a(var3_int != 0, (byte) 84, var15);
                          } else {
                            Class.forName("ve").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_e, new Object[]{var15, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_o &&
                          var2_int == 17) {
                          var13 = (Object[]) (var8.field_e);
                          Class.forName("ve").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_e, new Object[]{var13[0], var13[1], new Integer(var8.field_b), new Integer(var8.field_c), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_i.startsWith("win")) {
                              throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var14 = (String) (var8.field_e);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var14.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_d = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref3;
                            throw vh.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = vh.a("", (String) (var8.field_e), field_f, (byte) 101);
                        var8.field_d = var3_ref2;
                        break;
                      case 6:
                        var12 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_d = var12;
                        var12.setResizable(false);
                        if (this.field_o) {
                          this.field_a.a(var8.field_c & 65535, var8.field_b >>> 16, var12, var8.field_b & 65535, -4013, var8.field_c >> 16);
                        } else {
                          Class.forName("fl").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{var12, new Integer(var8.field_b >>> 16), new Integer(var8.field_b & 65535), new Integer(var8.field_c >> 16), new Integer(65535 & var8.field_c)});
                        }
                        break;
                      case 5:
                        if (!this.field_o) {
                          var8.field_d = Class.forName("fl").getMethod("listmodes", new Class[]{}).invoke(this.field_x, new Object[]{});
                        } else {
                          var8.field_d = this.field_a.a(3152);
                        }
                        break;
                    }
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_d = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_e);
                    if (this.field_d &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_e));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_b);
                    var8.field_d = var9;
                    break;
                  case 1:
                    if (field_s > km.b(-1)) {
                      throw new IOException();
                    }
                    var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_b);
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

    private final rc a(int param0, int param1, Object param2, int param3, byte param4) {
        rc var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        rc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new rc();
        var6.field_c = param3;
        var6.field_b = param0;
        var6.field_g = param1;
        var6.field_e = param2;
        var7_ref = this;
        synchronized (var7_ref) {
          if (null != this.field_g) {
            this.field_g.field_f = var6;
            this.field_g = var6;
          } else {
            this.field_m = var6;
            this.field_g = var6;
          }
          if (param4 > -99) {
            stackIn_6_0 = (rc) null;
            return stackIn_6_0;
          }
          this.notify();
        }
        return var6;
    }

    private final static ue a(String param0, String param1, int param2, byte param3) {
        try {
          int var6 = 0;
          ue stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ue var8 = null;
          Exception var8_ref = null;
          if (param3 < 77) {
            return (ue) null;
          }
          if (param2 != 33) {
            if (param2 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_q, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ue(new File(var7, var4), "rw", 10000L);
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

    final rc a(Class param0, boolean param1, String param2) {
        if (!param1) {
          this.run();
        }
        return this.a(0, 9, new Object[]{param0, param2}, 0, (byte) -108);
    }

    final rc a(String param0, int param1, int param2) {
        if (param2 >= -58) {
          field_q = (String) null;
        }
        return this.a(false, param0, param1, (byte) -96);
    }

    final rc a(boolean param0, java.awt.Frame param1) {
        if (param0) {
          java.net.URL var4 = (java.net.URL) null;
          this.a(3, (java.net.URL) null);
        }
        return this.a(0, 7, param1, 0, (byte) -110);
    }

    final rc a(int param0) {
        int var2 = 13 / ((param0 + 26) / 60);
        return this.a(0, 5, (Object) null, 0, (byte) -125);
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        an var7 = null;
        this.field_n = null;
        this.field_o = false;
        this.field_g = null;
        this.field_m = null;
        this.field_c = null;
        this.field_t = null;
        this.field_l = false;
        this.field_d = false;
        field_f = param0;
        stackIn_3_1 = (param3);
        this.field_d = stackIn_3_1;
        field_r = param1;
        field_v = "1.1";
        field_u = "Unknown";
        try {
          field_u = System.getProperty("java.vendor");
          field_v = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
          this.field_o = true;
        }
        try {
          field_h = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_h = "Unknown";
        }
        field_i = field_h.toLowerCase();
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
          field_q = System.getProperty("user.home");
          if (null != field_q) {
            field_q = field_q + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_q) {
          field_q = "~/";
        }
        try {
          this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        f.a((byte) 32, field_r, field_f);
        if (this.field_d) {
          this.field_c = new ue(f.a(-31192, "random.dat", (String) null, field_f), "rw", 25L);
          this.field_t = new ue(f.a(-3455, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_n = new ue(f.a(-3455, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_w = new ue[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_w[var5_int] = new ue(f.a(-3455, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_o) {
            try {
              Class.forName("ic").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_o) {
              var7 = new an();
              this.field_a = var7;
            } else {
              this.field_x = Class.forName("fl").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_o) {
              this.field_b = new kd();
            } else {
              this.field_e = Class.forName("ve").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_l = false;
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
