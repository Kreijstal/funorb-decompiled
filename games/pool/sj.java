/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj implements Runnable {
    private Object field_j;
    private Object field_p;
    private static int field_r;
    static String field_t;
    static String field_o;
    private Thread field_s;
    static java.lang.reflect.Method field_q;
    v field_b;
    private static String field_g;
    private static String field_v;
    private dc field_m;
    private static String field_d;
    private static volatile long field_h;
    private le field_c;
    java.awt.EventQueue field_a;
    private boolean field_u;
    v field_x;
    private le field_l;
    static String field_w;
    v field_e;
    private boolean field_i;
    boolean field_k;
    private ce field_f;
    v[] field_n;

    final le a(boolean param0, byte param1, java.awt.Component param2) {
        if (param1 != 106) {
          return (le) null;
        }
        return this.a(15, !param0 ? 0 : 1, false, param2, 0);
    }

    private final static v a(String param0, int param1, boolean param2, String param3) {
        try {
          int var6 = 0;
          v stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          v var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (34 != param1) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new v(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (!param2) {
            return null;
          }
          var9 = (String) null;
          sj.a((String) null, -124, false, (String) null);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final le a(int param0, int param1, Runnable param2) {
        if (param0 < 27) {
          field_h = -9L;
        }
        return this.a(2, param1, false, param2, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          lo var3_ref = null;
          v var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          le var9 = null;
          String var10 = null;
          Object[] var11 = null;
          java.awt.Component var12 = null;
          java.awt.Frame var13 = null;
          java.awt.datatransfer.Clipboard var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_u) {
                if (null != this.field_c) {
                  var9 = this.field_c;
                  this.field_c = this.field_c.field_c;
                  if (null == this.field_c) {
                    this.field_l = null;
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
                var2_int = var9.field_d;
                switch (var2_int) {
                  case 22:
                    if (rl.a((byte) -113) < field_h) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (lo) null;
                      var9.field_e = ii.a(114, (String) (var9.field_g), var9.field_a).a((byte) -108);
                    } catch (lo decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (lo) (Object) decompiledCaughtException;
                      var9.field_e = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var9.field_g));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.field_a);
                    var9.field_e = var18;
                    break;
                  case 4:
                    if (rl.a((byte) -97) < field_h) {
                      throw new IOException();
                    }
                    var9.field_e = new DataInputStream(((java.net.URL) (var9.field_g)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var9.field_g);
                    if (this.field_k &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var9.field_g);
                    if (this.field_k &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.field_e = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var9.field_g);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_k) {
                      throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (rl.a((byte) -113) < field_h) {
                          throw new IOException();
                        }
                        var9.field_e = java.net.InetAddress.getByName((String) (var9.field_g)).getAddress();
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var9.field_e = var13;
                        var13.setResizable(false);
                        if (!this.field_i) {
                          Class.forName("ak").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{var13, new Integer(var9.field_a >>> 16), new Integer(65535 & var9.field_a), new Integer(var9.field_b >> 16), new Integer(var9.field_b & 65535)});
                        } else {
                          this.field_f.a(var13, var9.field_a & 65535, 83, var9.field_a >>> 16, var9.field_b >> 16, 65535 & var9.field_b);
                        }
                        break;
                      case 13:
                        var3_ref2 = sj.a((String) (var9.field_g), field_r, false, "");
                        var9.field_e = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_k &&
                          var2_int == 14) {
                          var3_int = var9.field_a;
                          var4 = var9.field_b;
                          if (this.field_i) {
                            this.field_m.a(-12384, var4, var3_int);
                          } else {
                            Class.forName("vg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_k &&
                          var2_int == 15) {
                          stackIn_78_0 = (0 == var9.field_a) ? 0 : 1;
                          var3_int = stackIn_78_0;
                          var12 = (java.awt.Component) (var9.field_g);
                          if (this.field_i) {
                            this.field_m.a(-11888, var3_int != 0, var12);
                          } else {
                            Class.forName("vg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_i &&
                          var2_int == 17) {
                          var11 = (Object[]) (var9.field_g);
                          Class.forName("vg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var11[0], var11[1], new Integer(var9.field_a), new Integer(var9.field_b), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_w.startsWith("win")) {
                              throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var8 = (String) (var9.field_g);
                            if (!var8.startsWith("http://") &&
                              !var8.startsWith("https://")) {
                              throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var8.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var8.charAt(var5)) == -1) {
                                throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var9.field_e = var3_ref3;
                            throw sj.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 12:
                        var3_ref2 = sj.a((String) (var9.field_g), field_r, false, field_d);
                        var9.field_e = var3_ref2;
                        break;
                      case 7:
                        if (this.field_i) {
                          this.field_f.a(0, (java.awt.Frame) (var9.field_g));
                        } else {
                          Class.forName("ak").getMethod("exit", new Class[]{}).invoke(this.field_j, new Object[]{});
                        }
                        break;
                      case 5:
                        if (!this.field_i) {
                          var9.field_e = Class.forName("ak").getMethod("listmodes", new Class[]{}).invoke(this.field_j, new Object[]{});
                        } else {
                          var9.field_e = this.field_f.a(true);
                        }
                        break;
                      case 3:
                        if (rl.a((byte) -97) < field_h) {
                          throw new IOException();
                        }
                        var10 = (255 & var9.field_a >> 24) + "." + (var9.field_a >> 16 & 255) + "." + ((var9.field_a & 65341) >> 8) + "." + (255 & var9.field_a);
                        var9.field_e = java.net.InetAddress.getByName(var10).getHostName();
                        break;
                    }
                    break;
                  case 1:
                    if (rl.a((byte) -124) < field_h) {
                      throw new IOException();
                    }
                    var9.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_g)), var9.field_a);
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

    final le a(Class param0, String param1, byte param2) {
        if (param2 != -88) {
          return (le) null;
        }
        return this.a(9, 0, false, new Object[]{param0, param1}, 0);
    }

    private final le a(int param0, int param1, boolean param2, Object param3, int param4) {
        le var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new le();
        var6.field_d = param0;
        var6.field_g = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var7 = this;
        synchronized (var7) {
          if (this.field_l == null) {
            this.field_c = var6;
            this.field_l = var6;
          } else {
            this.field_l.field_c = var6;
            this.field_l = var6;
          }
          this.notify();
          if (param2) {
            this.a(-56, -20, -46, 113, (byte) -46);
          }
        }
        return var6;
    }

    final le a(java.awt.Frame param0, boolean param1) {
        if (param1) {
          this.field_l = (le) null;
        }
        return this.a(7, 0, false, param0, 0);
    }

    final le a(int param0) {
        if (param0 < 83) {
          return (le) null;
        }
        return this.a(5, 0, false, (Object) null, 0);
    }

    final le a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 85) {
          this.a(false);
        }
        return this.a(6, (param1 << 16) + param0, false, (Object) null, (param3 << 16) + param2);
    }

    final boolean a(byte param0) {
        if (param0 < 104) {
          return false;
        }
        if (!this.field_k) {
          return false;
        }
        if (!this.field_i) {
          return null != this.field_j ? true : false;
        }
        return this.field_f != null ? true : false;
    }

    final le a(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 < 12) {
          this.field_b = (v) null;
        }
        return this.a(8, 0, false, new Object[]{param1, param3, param2}, 0);
    }

    final le a(String param0, int param1, int param2) {
        if (param2 != 0) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.a(true, (byte) -21, (java.awt.Component) null);
        }
        return this.a(param1, param0, false, (byte) -123);
    }

    private final le a(int param0, String param1, boolean param2, byte param3) {
        if (param3 > -104) {
          this.field_k = false;
        }
        return this.a(param2 ? 22 : 1, param0, false, param1, 0);
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
            this.field_u = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.field_s.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_x) {
            try {
              this.field_x.c((byte) 94);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_e != null) {
            try {
              this.field_e.c((byte) 110);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            for (var2_int = 0; this.field_n.length > var2_int; var2_int++) {
              if (this.field_n[var2_int] != null) {
                try {
                  this.field_n[var2_int].c((byte) 115);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_b != null) {
            try {
              this.field_b.c((byte) 107);
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

    final le a(java.net.URL param0, int param1) {
        if (param1 != 1) {
          field_h = -125L;
        }
        return this.a(4, 0, false, param0, 0);
    }

    sj(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ce var7 = null;
        this.field_c = null;
        this.field_u = false;
        this.field_b = null;
        this.field_x = null;
        this.field_e = null;
        this.field_l = null;
        this.field_i = false;
        this.field_k = false;
        field_o = "Unknown";
        stackIn_3_1 = (param3);
        this.field_k = stackIn_3_1;
        field_r = param0;
        field_d = param1;
        field_t = "1.1";
        try {
          field_o = System.getProperty("java.vendor");
          field_t = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.field_i = true;
        }
        try {
          field_g = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_g = "Unknown";
        }
        field_w = field_g.toLowerCase();
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
          field_v = System.getProperty("user.home");
          if (field_v != null) {
            field_v = field_v + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_v == null) {
          field_v = "~/";
        }
        try {
          this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_i) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        nh.a(field_r, field_d, 25617);
        if (this.field_k) {
          this.field_b = new v(nh.a("random.dat", (String) null, field_r, (byte) 109), "rw", 25L);
          this.field_x = new v(nh.a("main_file_cache.dat2", -126), "rw", 314572800L);
          this.field_e = new v(nh.a("main_file_cache.idx255", -128), "rw", 1048576L);
          this.field_n = new v[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_n[var5_int] = new v(nh.a("main_file_cache.idx" + var5_int, -126), "rw", 1048576L);
          }
          if (this.field_i) {
            try {
              Class.forName("fi").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_i) {
              var7 = new ce();
              this.field_f = var7;
            } else {
              this.field_j = Class.forName("ak").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_i) {
              this.field_m = new dc();
            } else {
              this.field_p = Class.forName("vg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_u = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    final le a(java.awt.Component param0, int param1, int param2, int param3) {
        if (param2 >= -54) {
          return (le) null;
        }
        java.awt.Point var5 = param0.getLocationOnScreen();
        return this.a(14, param1 + var5.x, false, (Object) null, param3 + var5.y);
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
