/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Runnable {
    static String field_b;
    private static String field_h;
    private boolean field_r;
    java.awt.EventQueue field_p;
    private io field_u;
    private Thread field_j;
    rn field_k;
    private static String field_e;
    boolean field_i;
    private static volatile long field_f;
    private static int field_c;
    private ql field_d;
    private Object field_a;
    private ql field_v;
    private boolean field_l;
    rn[] field_s;
    static String field_g;
    rn field_m;
    rn field_q;
    private static String field_t;
    private Object field_n;
    static java.lang.reflect.Method field_x;
    static String field_o;
    private in field_w;

    private final ql a(String param0, int param1, boolean param2, int param3) {
        if (param3 != -31592) {
          this.field_r = false;
        }
        return this.a(true, 0, param0, param2 ? 22 : 1, param1);
    }

    final ql a(int param0, Runnable param1, byte param2) {
        if (param2 >= -68) {
          String var5 = (String) null;
          this.a(-7, (Class) null, (Class[]) null, (String) null);
        }
        return this.a(true, 0, param1, 2, param0);
    }

    final boolean b(int param0) {
        int var2 = -94 / ((param0 - 4) / 42);
        if (!this.field_i) {
          return false;
        }
        if (!this.field_r) {
          return this.field_a != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    final ql a(byte param0, java.net.URL param1) {
        int var3 = 36 / ((param0 - 3) / 40);
        return this.a(true, 0, param1, 4, 0);
    }

    final ql a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -35) {
          this.a(125, -72, 117, -42, -13);
        }
        return this.a(true, param0 + (param3 << 16), (Object) null, 6, (param4 << 16) + param2);
    }

    final ql a(String param0, byte param1, int param2) {
        ql discarded$0 = null;
        if (param1 != 120) {
          Object var5 = (Object) null;
          discarded$0 = this.a(false, -76, (Object) null, 124, 36);
        }
        return this.a(param0, param2, false, -31592);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_67_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          rn var3_ref2 = null;
          ef var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          ql var8 = null;
          String var9 = null;
          java.awt.Frame var10 = null;
          java.awt.Component var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.datatransfer.Clipboard var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_l) {
                if (this.field_v != null) {
                  var8 = this.field_v;
                  this.field_v = this.field_v.field_a;
                  if (null == this.field_v) {
                    this.field_d = null;
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
                var2_int = var8.field_d;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_b));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_g);
                    var8.field_e = var18;
                    break;
                  case 4:
                    if (ue.a(false) < field_f) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_b);
                    if (this.field_i &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var8.field_b);
                    if (this.field_i &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_i) {
                      throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 16:
                      default:
                        if (this.field_i &&
                          var2_int == 14) {
                          var3_int = var8.field_g;
                          var4_int = var8.field_c;
                          if (this.field_r) {
                            this.field_w.a(var4_int, -4, var3_int);
                          } else {
                            Class.forName("dd").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_i &&
                          15 == var2_int) {
                          stackIn_67_0 = (var8.field_g == 0) ? 0 : 1;
                          var3_int = stackIn_67_0;
                          var11 = (java.awt.Component) (var8.field_b);
                          if (!this.field_r) {
                            Class.forName("dd").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var11, new Boolean(var3_int != 0)});
                          } else {
                            this.field_w.a(var11, 0, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_r &&
                          17 == var2_int) {
                          var12 = (Object[]) (var8.field_b);
                          Class.forName("dd").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var12[0], var12[1], new Integer(var8.field_g), new Integer(var8.field_c), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_b.startsWith("win")) {
                              throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_b);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (-1 == var4.indexOf((int) var13.charAt(var5))) {
                                throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref;
                            throw tg.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = tg.a((String) (var8.field_b), field_c, "", (byte) -89);
                        var8.field_e = var3_ref2;
                        break;
                      case 12:
                        var3_ref2 = tg.a((String) (var8.field_b), field_c, field_t, (byte) -70);
                        var8.field_e = var3_ref2;
                        break;
                      case 7:
                        if (this.field_r) {
                          this.field_u.a(-3887, (java.awt.Frame) (var8.field_b));
                        } else {
                          Class.forName("db").getMethod("exit", new Class[]{}).invoke(this.field_a, new Object[]{});
                        }
                        break;
                      case 6:
                        var10 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var10;
                        var10.setResizable(false);
                        if (this.field_r) {
                          this.field_u.a(var10, 65535 & var8.field_g, var8.field_g >>> 16, 0, var8.field_c & 65535, var8.field_c >> 16);
                        } else {
                          Class.forName("db").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_a, new Object[]{var10, new Integer(var8.field_g >>> 16), new Integer(65535 & var8.field_g), new Integer(var8.field_c >> 16), new Integer(var8.field_c & 65535)});
                        }
                        break;
                      case 5:
                        if (!this.field_r) {
                          var8.field_e = Class.forName("db").getMethod("listmodes", new Class[]{}).invoke(this.field_a, new Object[]{});
                        } else {
                          var8.field_e = this.field_u.a((byte) -48);
                        }
                        break;
                      case 21:
                        if (ue.a(false) < field_f) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                        break;
                      case 3:
                        if (ue.a(false) < field_f) {
                          throw new IOException();
                        }
                        var9 = (255 & var8.field_g >> 24) + "." + (var8.field_g >> 16 & 255) + "." + ((65391 & var8.field_g) >> 8) + "." + (255 & var8.field_g);
                        var8.field_e = java.net.InetAddress.getByName(var9).getHostName();
                        break;
                    }
                    break;
                  case 22:
                    if (field_f > ue.a(false)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ef) null;
                      var8.field_e = nd.a(60, var8.field_g, (String) (var8.field_b)).a(0);
                    } catch (ef decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ef) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (ue.a(false) < field_f) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_g);
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

    final ql a(int param0) {
        if (param0 != 0) {
          this.a(79);
        }
        return this.a(true, 0, (Object) null, 5, 0);
    }

    final ql a(int param0, Class param1, String param2) {
        int var4 = 121 / ((param0 - 7) / 36);
        return this.a(true, 0, new Object[]{param1, param2}, 9, 0);
    }

    private final static rn a(String param0, int param1, String param2, byte param3) {
        try {
          int var6 = 0;
          rn stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          rn var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param1 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_e, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new rn(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param3 < -61) {
            return null;
          }
          var9 = (String) null;
          tg.a((String) null, 48, (String) null, (byte) -119);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
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
            this.field_l = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.field_j.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_q != null) {
            try {
              this.field_q.c(83);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_m != null) {
            try {
              this.field_m.c(-119);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_s != null) {
            for (var2_int = 0; this.field_s.length > var2_int; var2_int++) {
              if (null != this.field_s[var2_int]) {
                try {
                  this.field_s[var2_int].c(56);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.c(108);
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

    final ql a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 23311) {
          return (ql) null;
        }
        return this.a(true, 0, new Object[]{param1, param3, param2}, 8, 0);
    }

    final ql a(int param0, java.awt.Frame param1) {
        int var3 = -2 / ((param0 - 54) / 37);
        return this.a(true, 0, param1, 7, 0);
    }

    private final ql a(boolean param0, int param1, Object param2, int param3, int param4) {
        ql var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new ql();
        var6.field_g = param4;
        var6.field_b = param2;
        if (!param0) {
          var9 = (String) null;
          this.a((String) null, (byte) -43, 124);
        }
        var6.field_c = param1;
        var6.field_d = param3;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_d) {
            this.field_d.field_a = var6;
            this.field_d = var6;
          } else {
            this.field_v = var6;
            this.field_d = var6;
          }
          this.notify();
        }
        return var6;
    }

    tg(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        io var7 = null;
        this.field_k = null;
        this.field_v = null;
        this.field_d = null;
        this.field_r = false;
        this.field_m = null;
        this.field_i = false;
        this.field_q = null;
        this.field_l = false;
        field_o = "1.1";
        stackIn_3_1 = (param3);
        this.field_i = stackIn_3_1;
        field_t = param1;
        field_g = "Unknown";
        field_c = param0;
        try {
          field_g = System.getProperty("java.vendor");
          field_o = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_g.toLowerCase().indexOf("microsoft")) {
          this.field_r = true;
        }
        try {
          field_h = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_h = "Unknown";
        }
        field_b = field_h.toLowerCase();
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
          field_e = System.getProperty("user.home");
          if (null != field_e) {
            field_e = field_e + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_e) {
          field_e = "~/";
        }
        try {
          this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_r) {
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
        gl.a(98, field_c, field_t);
        if (this.field_i) {
          this.field_k = new rn(gl.a(-1, "random.dat", (String) null, field_c), "rw", 25L);
          this.field_q = new rn(gl.a("main_file_cache.dat2", -1), "rw", 314572800L);
          this.field_m = new rn(gl.a("main_file_cache.idx255", -1), "rw", 1048576L);
          this.field_s = new rn[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_s[var5_int] = new rn(gl.a("main_file_cache.idx" + var5_int, -1), "rw", 1048576L);
          }
          if (this.field_r) {
            try {
              Class.forName("iq").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_r) {
              var7 = new io();
              this.field_u = var7;
            } else {
              this.field_a = Class.forName("db").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_r) {
              this.field_n = Class.forName("dd").newInstance();
            } else {
              this.field_w = new in();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_l = false;
        this.field_j = new Thread((Runnable) (this));
        this.field_j.setPriority(10);
        this.field_j.setDaemon(true);
        this.field_j.start();
    }

    static {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
