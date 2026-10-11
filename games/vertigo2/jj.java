/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj implements Runnable {
    java.awt.EventQueue field_j;
    private static int field_f;
    private fl field_w;
    boolean field_p;
    static String field_m;
    private wk field_b;
    private Object field_c;
    private boolean field_u;
    bj field_k;
    private wk field_s;
    private static volatile long field_l;
    private static String field_t;
    static String field_v;
    private boolean field_q;
    private Object field_g;
    private a field_i;
    bj[] field_n;
    static java.lang.reflect.Method field_e;
    static String field_d;
    bj field_o;
    private Thread field_a;
    private static String field_x;
    bj field_r;
    private static String field_h;

    private final static bj a(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          bj stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          bj var8 = null;
          Exception var8_ref = null;
          if (param1 != 33) {
            if (34 != param1) {
              var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_t, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new bj(new File(var7, var4), "rw", 10000L);
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

    final wk b(int param0) {
        if (param0 > -105) {
          this.field_c = (Object) null;
        }
        return this.a(0, (Object) null, 0, 5, 0);
    }

    private final wk a(int param0, Object param1, int param2, int param3, int param4) {
        wk var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param4 != 0) {
          var9 = (String) null;
          this.a(-30, (Class) null, (String) null);
        }
        var6 = new wk();
        var6.field_a = param3;
        var6.field_f = param1;
        var6.field_c = param2;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          if (this.field_b == null) {
            this.field_s = var6;
            this.field_b = var6;
          } else {
            this.field_b.field_e = var6;
            this.field_b = var6;
          }
          this.notify();
        }
        return var6;
    }

    final wk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1636602704) {
          Runnable var7 = (Runnable) null;
          this.a(-115, (Runnable) null, -90);
        }
        return this.a((param1 << 16) + param0, (Object) null, (param3 << 16) + param2, 6, 0);
    }

    final wk a(int param0, Class param1, String param2) {
        if (param0 > -50) {
          this.run();
        }
        return this.a(0, new Object[]{param1, param2}, 0, 9, 0);
    }

    private final wk a(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
          return (wk) null;
        }
        return this.a(param3, param1, 0, param0 ? 22 : 1, 0);
    }

    final wk a(boolean param0, java.awt.Frame param1) {
        if (param0) {
          return (wk) null;
        }
        return this.a(0, param1, 0, 7, 0);
    }

    final wk a(int param0, Runnable param1, int param2) {
        if (param2 != 0) {
          return (wk) null;
        }
        return this.a(param0, param1, 0, 2, 0);
    }

    final wk a(Class[] param0, int param1, Class param2, String param3) {
        if (param1 < 29) {
          this.a(38);
        }
        return this.a(0, new Object[]{param2, param3, param0}, 0, 8, 0);
    }

    final wk a(int param0, int param1, String param2) {
        if (param0 >= -79) {
          field_f = -84;
        }
        return this.a(false, param2, 1, param1);
    }

    final boolean a(int param0) {
        if (param0 >= -118) {
          this.field_n = (bj[]) null;
        }
        if (!this.field_p) {
          return false;
        }
        if (this.field_u) {
          return this.field_i != null ? true : false;
        }
        return null != this.field_c ? true : false;
    }

    final wk a(int param0, java.net.URL param1) {
        int var3 = -127 % ((48 - param0) / 60);
        return this.a(0, param1, 0, 4, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_57_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          bj var3_ref2 = null;
          rg var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          wk var8 = null;
          Thread var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.Component var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_q) {
                if (null != this.field_s) {
                  var8 = this.field_s;
                  this.field_s = this.field_s.field_e;
                  if (null == this.field_s) {
                    this.field_b = null;
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
                    if (field_l > gk.a(126)) {
                      throw new IOException();
                    }
                    var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_f)), var8.field_g);
                    break;
                  case 4:
                    if (field_l > gk.a(52)) {
                      throw new IOException();
                    }
                    var8.field_d = new DataInputStream(((java.net.URL) (var8.field_f)).openStream());
                    break;
                  case 8:
                    var18 = (Object[]) (var8.field_f);
                    if (this.field_p &&
                      ((Class) (var18[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_f);
                    if (this.field_p &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_d = var16.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_p) {
                      throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_l > gk.a(115)) {
                          throw new IOException();
                        }
                        var15 = (var8.field_g >> 24 & 255) + "." + ((16726532 & var8.field_g) >> 16) + "." + (var8.field_g >> 8 & 255) + "." + (var8.field_g & 255);
                        var8.field_d = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (!this.field_u) {
                          var8.field_d = Class.forName("pa").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          var8.field_d = this.field_i.a((byte) -99);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_d = var14;
                        var14.setResizable(false);
                        if (!this.field_u) {
                          Class.forName("pa").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var14, new Integer(var8.field_g >>> 16), new Integer(var8.field_g & 65535), new Integer(var8.field_c >> 16), new Integer(var8.field_c & 65535)});
                        } else {
                          this.field_i.a(var8.field_g >>> 16, var8.field_c & 65535, (byte) -70, var8.field_c >> 16, 65535 & var8.field_g, var14);
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_p &&
                          var2_int == 14) {
                          var3_int = var8.field_g;
                          var4_int = var8.field_c;
                          if (!this.field_u) {
                            Class.forName("pj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_w.a(var3_int, (byte) 76, var4_int);
                          }
                          break;
                        }
                        if (this.field_p &&
                          var2_int == 15) {
                          stackIn_57_0 = (var8.field_g == 0) ? 0 : 1;
                          var3_int = stackIn_57_0;
                          var11 = (java.awt.Component) (var8.field_f);
                          if (this.field_u) {
                            this.field_w.a(11333, var11, var3_int != 0);
                          } else {
                            Class.forName("pj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_g, new Object[]{var11, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_u &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_f);
                          Class.forName("pj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_g, new Object[]{var12[0], var12[1], new Integer(var8.field_g), new Integer(var8.field_c), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_v.startsWith("win")) {
                              throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_f);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var13.length() > var5; var5++) {
                              if (var4.indexOf((int) var13.charAt(var5)) == -1) {
                                throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_d = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (Exception) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref;
                            throw jj.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = jj.a(0, field_f, "", (String) (var8.field_f));
                        var8.field_d = var3_ref2;
                        break;
                      case 12:
                        var3_ref2 = jj.a(0, field_f, field_h, (String) (var8.field_f));
                        var8.field_d = var3_ref2;
                        break;
                      case 7:
                        if (this.field_u) {
                          this.field_i.a((java.awt.Frame) (var8.field_f), 0);
                        } else {
                          Class.forName("pa").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_l > gk.a(101)) {
                          throw new IOException();
                        }
                        var8.field_d = java.net.InetAddress.getByName((String) (var8.field_f)).getAddress();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_f);
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_f));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_g);
                    var8.field_d = var9;
                    break;
                  case 22:
                    if (field_l > gk.a(61)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (rg) null;
                      var8.field_d = wp.a((String) (var8.field_f), (byte) -109, var8.field_g).b(640);
                    } catch (rg decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (rg) (Object) decompiledCaughtException;
                      var8.field_d = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
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

    final void a(boolean param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_q = true;
            this.notifyAll();
          }
          try {
            if (param0) {
              return;
            }
            this.field_a.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_o) {
            try {
              this.field_o.a(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_r) {
            try {
              this.field_r.a(0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_n != null) {
            for (var2_int = 0; var2_int < this.field_n.length; var2_int++) {
              if (null != this.field_n[var2_int]) {
                try {
                  this.field_n[var2_int].a(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.a(0);
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

    jj(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        a var7 = null;
        this.field_p = false;
        this.field_s = null;
        this.field_b = null;
        this.field_q = false;
        this.field_k = null;
        this.field_o = null;
        this.field_u = false;
        this.field_r = null;
        field_f = param0;
        field_h = param1;
        field_m = "Unknown";
        field_d = "1.1";
        stackIn_3_1 = (param3);
        this.field_p = stackIn_3_1;
        try {
          field_m = System.getProperty("java.vendor");
          field_d = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_m.toLowerCase().indexOf("microsoft") != -1) {
          this.field_u = true;
        }
        try {
          field_x = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_x = "Unknown";
        }
        field_v = field_x.toLowerCase();
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
          field_t = System.getProperty("user.home");
          if (field_t != null) {
            field_t = field_t + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_t) {
          field_t = "~/";
        }
        try {
          this.field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        gq.a((byte) -110, field_h, field_f);
        if (this.field_p) {
          this.field_k = new bj(gq.a(0, field_f, "random.dat", (String) null), "rw", 25L);
          this.field_o = new bj(gq.a("main_file_cache.dat2", -122), "rw", 314572800L);
          this.field_r = new bj(gq.a("main_file_cache.idx255", -121), "rw", 1048576L);
          this.field_n = new bj[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_n[var5_int] = new bj(gq.a("main_file_cache.idx" + var5_int, -122), "rw", 1048576L);
          }
          if (this.field_u) {
            try {
              Class.forName("hf").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_u) {
              var7 = new a();
              this.field_i = var7;
            } else {
              this.field_c = Class.forName("pa").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_u) {
              this.field_w = new fl();
            } else {
              this.field_g = Class.forName("pj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_q = false;
        this.field_a = new Thread((Runnable) (this));
        this.field_a.setPriority(10);
        this.field_a.setDaemon(true);
        this.field_a.start();
    }

    static {
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
