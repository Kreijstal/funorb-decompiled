/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ib implements Runnable {
    static String field_j;
    private sc field_m;
    private static volatile long field_w;
    private static String field_i;
    bg field_a;
    boolean field_f;
    bg field_h;
    private Thread field_r;
    private boolean field_l;
    private af field_o;
    bg[] field_g;
    private af field_k;
    java.awt.EventQueue field_t;
    static java.lang.reflect.Method field_c;
    bg field_u;
    private static String field_n;
    private Object field_d;
    private Object field_e;
    private static String field_v;
    private static int field_b;
    private cl field_x;
    private boolean field_q;
    static String field_s;
    static String field_p;

    private final af a(String param0, int param1, int param2, boolean param3) {
        if (param1 < 37) {
          this.field_a = (bg) null;
        }
        return this.a(0, param2, !param3 ? 1 : 22, -15563, param0);
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
            this.field_q = true;
            this.notifyAll();
          }
          if (param0 != 55) {
            return;
          }
          try {
            this.field_r.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_u) {
            try {
              this.field_u.a((byte) 20);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_h != null) {
            try {
              this.field_h.a((byte) 20);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_g != null) {
            for (var2_int = 0; var2_int < this.field_g.length; var2_int++) {
              if (null != this.field_g[var2_int]) {
                try {
                  this.field_g[var2_int].a((byte) 20);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_a != null) {
            try {
              this.field_a.a((byte) 20);
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

    final af a(String param0, Class[] param1, Class param2, byte param3) {
        if (param3 != -32) {
          this.a(37);
        }
        return this.a(0, 0, 8, -15563, new Object[]{param2, param0, param1});
    }

    private final af a(int param0, int param1, int param2, int param3, Object param4) {
        af var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new af();
        var6.field_f = param0;
        if (param3 != -15563) {
          this.run();
        }
        var6.field_c = param4;
        var6.field_a = param2;
        var6.field_g = param1;
        var7 = this;
        synchronized (var7) {
          if (this.field_o == null) {
            this.field_k = var6;
            this.field_o = var6;
          } else {
            this.field_o.field_e = var6;
            this.field_o = var6;
          }
          this.notify();
        }
        return var6;
    }

    final af a(java.net.URL param0, int param1) {
        if (param1 != 0) {
          String var4 = (String) null;
          ib.a((String) null, (String) null, 88, 91);
        }
        return this.a(0, 0, 4, param1 - 15563, param0);
    }

    final boolean a(boolean param0) {
        if (!param0) {
          Class var3 = (Class) null;
          this.a((String) null, 24, (Class) null);
        }
        if (!this.field_f) {
          return false;
        }
        if (!this.field_l) {
          return this.field_e != null ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_84_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          bg var3_ref_bg = null;
          uk var3_ref_uk = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          af var8 = null;
          Thread var9 = null;
          String var10 = null;
          String var11 = null;
          Object[] var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_q) {
                if (this.field_k != null) {
                  var8 = this.field_k;
                  this.field_k = this.field_k.field_e;
                  if (null == this.field_k) {
                    this.field_o = null;
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
                  case 4:
                    if (bb.b(-1) < field_w) {
                      throw new IOException();
                    }
                    var8.field_b = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                    break;
                  case 8:
                    var18 = (Object[]) (var8.field_c);
                    if (this.field_f &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_c);
                    if (this.field_f &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_b = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_f) {
                      throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (this.field_l) {
                          var8.field_b = this.field_x.a(-16);
                        } else {
                          var8.field_b = Class.forName("rj").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_b = var14;
                        var14.setResizable(false);
                        if (this.field_l) {
                          this.field_x.a(var8.field_f >> 16, 11468, var8.field_g >>> 16, var14, 65535 & var8.field_f, 65535 & var8.field_g);
                        } else {
                          Class.forName("rj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var14, new Integer(var8.field_g >>> 16), new Integer(var8.field_g & 65535), new Integer(var8.field_f >> 16), new Integer(65535 & var8.field_f)});
                        }
                        break;
                      case 7:
                        if (!this.field_l) {
                          Class.forName("rj").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                        } else {
                          this.field_x.a(8, (java.awt.Frame) (var8.field_c));
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_f &&
                          var2_int == 14) {
                          var3 = var8.field_g;
                          var4_int = var8.field_f;
                          if (this.field_l) {
                            this.field_m.a(var4_int, true, var3);
                          } else {
                            Class.forName("jl").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{new Integer(var3), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_f &&
                          15 == var2_int) {
                          stackIn_84_0 = (var8.field_g == 0) ? 0 : 1;
                          var3 = stackIn_84_0;
                          var13 = (java.awt.Component) (var8.field_c);
                          if (this.field_l) {
                            this.field_m.a(var3 != 0, var13, 54);
                          } else {
                            Class.forName("jl").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_d, new Object[]{var13, new Boolean(var3 != 0)});
                          }
                          break;
                        }
                        if (!this.field_l &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_c);
                          Class.forName("jl").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_d, new Object[]{var12[0], var12[1], new Integer(var8.field_g), new Integer(var8.field_f), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_s.startsWith("win")) {
                              throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.field_c);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (-1 == var4.indexOf((int) var11.charAt(var5))) {
                                throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_b = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref_Exception;
                            throw ib.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_bg = ib.a("", (String) (var8.field_c), 69, field_b);
                        var8.field_b = var3_ref_bg;
                        break;
                      case 12:
                        var3_ref_bg = ib.a(field_n, (String) (var8.field_c), 104, field_b);
                        var8.field_b = var3_ref_bg;
                        break;
                      case 21:
                        if (field_w > bb.b(-1)) {
                          throw new IOException();
                        }
                        var8.field_b = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 3:
                        if (field_w > bb.b(-1)) {
                          throw new IOException();
                        }
                        var10 = (var8.field_g >> 24 & 255) + "." + (255 & var8.field_g >> 16) + "." + ((var8.field_g & 65493) >> 8) + "." + (var8.field_g & 255);
                        var8.field_b = java.net.InetAddress.getByName(var10).getHostName();
                        break;
                    }
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_c));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_g);
                    var8.field_b = var9;
                    break;
                  case 22:
                    if (bb.b(-1) < field_w) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (uk) null;
                      var8.field_b = lh.a(var8.field_g, (String) (var8.field_c), -1).b(-64);
                    } catch (uk decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_uk = (uk) (Object) decompiledCaughtException;
                      var8.field_b = var3_ref_uk.getMessage();
                      throw var3_ref_uk;
                    }
                    break;
                  case 1:
                    if (field_w > bb.b(-1)) {
                      throw new IOException();
                    }
                    var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_g);
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

    final af a(java.awt.Frame param0, byte param1) {
        if (param1 != -95) {
          this.field_r = (Thread) null;
        }
        return this.a(0, 0, 7, -15563, param0);
    }

    final af a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          java.awt.Frame var7 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, (byte) 11);
        }
        return this.a(param0 + (param1 << 16), (param3 << 16) + param2, 6, -15563, (Object) null);
    }

    final af a(int param0) {
        if (param0 != 2) {
          return (af) null;
        }
        return this.a(0, 0, 5, -15563, (Object) null);
    }

    private final static bg a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          bg stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          bg var8 = null;
          Exception var8_ref = null;
          if (param2 < 55) {
            return (bg) null;
          }
          if (param3 == 33) {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          } else {
            if (param3 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new bg(new File(var7, var4), "rw", 10000L);
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

    final af a(String param0, int param1, Class param2) {
        af discarded$0 = null;
        if (param1 != 9) {
          Object var5 = (Object) null;
          discarded$0 = this.a(-70, -27, -21, 108, (Object) null);
        }
        return this.a(0, 0, 9, -15563, new Object[]{param2, param0});
    }

    final af a(int param0, int param1, String param2) {
        if (param0 != 0) {
          return (af) null;
        }
        return this.a(param2, 85, param1, false);
    }

    ib(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        cl var7 = null;
        this.field_h = null;
        this.field_l = false;
        this.field_f = false;
        this.field_a = null;
        this.field_u = null;
        this.field_k = null;
        this.field_o = null;
        this.field_q = false;
        field_j = "1.1";
        field_p = "Unknown";
        stackIn_3_1 = (param3);
        this.field_f = stackIn_3_1;
        field_b = param0;
        field_n = param1;
        try {
          field_p = System.getProperty("java.vendor");
          field_j = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_p.toLowerCase().indexOf("microsoft") != -1) {
          this.field_l = true;
        }
        try {
          field_v = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_v = "Unknown";
        }
        field_s = field_v.toLowerCase();
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
        if (null == field_i) {
          field_i = "~/";
        }
        try {
          this.field_t = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_l) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        me.a(field_n, field_b, -38);
        if (this.field_f) {
          this.field_a = new bg(me.a(field_b, "random.dat", false, (String) null), "rw", 25L);
          this.field_u = new bg(me.a("main_file_cache.dat2", 95), "rw", 314572800L);
          this.field_h = new bg(me.a("main_file_cache.idx255", 126), "rw", 1048576L);
          this.field_g = new bg[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_g[var5_int] = new bg(me.a("main_file_cache.idx" + var5_int, 37), "rw", 1048576L);
          }
          if (this.field_l) {
            try {
              Class.forName("df").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_l) {
              this.field_e = Class.forName("rj").newInstance();
            } else {
              var7 = new cl();
              this.field_x = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_l) {
              this.field_d = Class.forName("jl").newInstance();
            } else {
              this.field_m = new sc();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_q = false;
        this.field_r = new Thread((Runnable) (this));
        this.field_r.setPriority(10);
        this.field_r.setDaemon(true);
        this.field_r.start();
    }

    final af a(byte param0, int param1, Runnable param2) {
        if (param0 != -28) {
          field_s = (String) null;
        }
        return this.a(0, param1, 2, -15563, param2);
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
