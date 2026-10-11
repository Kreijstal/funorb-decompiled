/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private Thread field_t;
    private Object field_v;
    static java.lang.reflect.Method field_o;
    private sb field_l;
    private ld field_b;
    private static String field_s;
    nd[] field_r;
    nd field_i;
    private boolean field_w;
    private static String field_c;
    private static String field_e;
    private static volatile long field_f;
    nd field_x;
    static String field_a;
    private mi field_m;
    java.awt.EventQueue field_p;
    static String field_n;
    static String field_j;
    private Object field_u;
    nd field_d;
    private boolean field_q;
    private mi field_k;
    private static int field_h;
    boolean field_g;

    private final mi a(int param0, int param1, int param2, Object param3, int param4) {
        mi var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new mi();
        var6.field_a = param2;
        var6.field_c = param3;
        var6.field_f = param0;
        var6.field_b = param1;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_k) {
            this.field_k.field_e = var6;
            this.field_k = var6;
          } else {
            this.field_m = var6;
            this.field_k = var6;
          }
          this.notify();
        }
        if (param4 != -27024) {
          field_n = (String) null;
        }
        return var6;
    }

    private final mi a(int param0, byte param1, String param2, boolean param3) {
        int var5 = -33 % ((param1 + 33) / 34);
        return this.a(param3 ? 22 : 1, 0, param0, param2, -27024);
    }

    final mi a(byte param0, String param1, Class param2) {
        if (param0 >= -121) {
          return (mi) null;
        }
        return this.a(9, 0, 0, new Object[]{param2, param1}, -27024);
    }

    final boolean a(byte param0) {
        if (param0 > -25) {
          this.field_b = (ld) null;
        }
        if (!this.field_g) {
          return false;
        }
        if (this.field_q) {
          return this.field_l != null ? true : false;
        }
        return this.field_v != null ? true : false;
    }

    final mi a(int param0, java.awt.Frame param1) {
        if (param0 != -3816) {
          java.net.URL var4 = (java.net.URL) null;
          this.a((java.net.URL) null, 122);
        }
        return this.a(7, 0, 0, param1, -27024);
    }

    final mi a(java.net.URL param0, int param1) {
        if (param1 > -122) {
          field_f = 125L;
        }
        return this.a(4, 0, 0, param0, -27024);
    }

    final mi a(Runnable param0, boolean param1, int param2) {
        if (!param1) {
          this.field_k = (mi) null;
        }
        return this.a(2, 0, param2, param0, -27024);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_68_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          nd var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          bj var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          mi var8 = null;
          String var9 = null;
          java.awt.Component var10 = null;
          String var11 = null;
          Object[] var12 = null;
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
              while (!this.field_w) {
                if (null != this.field_m) {
                  var8 = this.field_m;
                  this.field_m = this.field_m.field_e;
                  if (this.field_m == null) {
                    this.field_k = null;
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
                var2_int = var8.field_f;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_c));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_a);
                    var8.field_g = var18;
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_c);
                    if (this.field_g &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var8.field_c);
                    if (this.field_g &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_g = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_g) {
                      throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_g = var13;
                        var13.setResizable(false);
                        if (this.field_q) {
                          this.field_l.a(65535 & var8.field_b, var8.field_b >> 16, -16, var8.field_a >>> 16, 65535 & var8.field_a, var13);
                        } else {
                          Class.forName("hg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var13, new Integer(var8.field_a >>> 16), new Integer(65535 & var8.field_a), new Integer(var8.field_b >> 16), new Integer(var8.field_b & 65535)});
                        }
                        break;
                      case 12:
                        var3_ref = uj.a((String) (var8.field_c), field_c, field_h, (byte) 106);
                        var8.field_g = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_g &&
                          var2_int == 14) {
                          var3_int = var8.field_a;
                          var4 = var8.field_b;
                          if (this.field_q) {
                            this.field_b.a(var3_int, -86, var4);
                          } else {
                            Class.forName("jg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_g &&
                          var2_int == 15) {
                          stackIn_68_0 = (var8.field_a == 0) ? 0 : 1;
                          var3_int = stackIn_68_0;
                          var10 = (java.awt.Component) (var8.field_c);
                          if (!this.field_q) {
                            Class.forName("jg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var10, new Boolean(var3_int != 0)});
                          } else {
                            this.field_b.a(var10, var3_int != 0, 0);
                          }
                          break;
                        }
                        if (!this.field_q &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_c);
                          Class.forName("jg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var12[0], var12[1], new Integer(var8.field_a), new Integer(var8.field_b), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_a.startsWith("win")) {
                              throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.field_c);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_g = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref2;
                            throw uj.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref = uj.a((String) (var8.field_c), "", field_h, (byte) -97);
                        var8.field_g = var3_ref;
                        break;
                      case 7:
                        if (this.field_q) {
                          this.field_l.a(false, (java.awt.Frame) (var8.field_c));
                        } else {
                          Class.forName("hg").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                        }
                        break;
                      case 5:
                        if (this.field_q) {
                          var8.field_g = this.field_l.a(-27469);
                        } else {
                          var8.field_g = Class.forName("hg").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_f > ol.a(256)) {
                          throw new IOException();
                        }
                        var8.field_g = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 3:
                        if (field_f > ol.a(256)) {
                          throw new IOException();
                        }
                        var9 = (255 & var8.field_a >> 24) + "." + ((var8.field_a & 16725364) >> 16) + "." + ((var8.field_a & 65373) >> 8) + "." + (var8.field_a & 255);
                        var8.field_g = java.net.InetAddress.getByName(var9).getHostName();
                        break;
                    }
                    break;
                  case 4:
                    if (ol.a(256) < field_f) {
                      throw new IOException();
                    }
                    var8.field_g = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                    break;
                  case 22:
                    if (field_f > ol.a(256)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (bj) null;
                      var8.field_g = pg.a(var8.field_a, (String) (var8.field_c), -111).a((byte) 112);
                    } catch (bj decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (bj) (Object) decompiledCaughtException;
                      var8.field_g = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_f > ol.a(256)) {
                      throw new IOException();
                    }
                    var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_a);
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

    final mi a(String param0, byte param1, Class[] param2, Class param3) {
        if (param1 <= 40) {
          return (mi) null;
        }
        return this.a(8, 0, 0, new Object[]{param3, param0, param2}, -27024);
    }

    final mi a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -2) {
          field_h = 19;
        }
        return this.a(6, param3 + (param2 << 16), (param0 << 16) + param1, (Object) null, -27024);
    }

    private final static nd a(String param0, String param1, int param2, byte param3) {
        try {
          int var7 = 0;
          nd stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          int var5 = 0;
          String[] var6 = null;
          String var8 = null;
          nd var9 = null;
          Exception var9_ref = null;
          var5 = -67 / ((param3 + 38) / 58);
          if (param2 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param2 != 34) {
              var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
            }
          }
          var6 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            if (!(var8.length() > 0) ||
              new File(var8).exists()) {
              try {
                var9 = new nd(new File(var8, var4), "rw", 10000L);
                stackIn_13_0 = var9;
                return stackIn_13_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var9_ref = (Exception) (Object) decompiledCaughtException;
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
            this.field_w = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.field_t.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_x) {
            try {
              this.field_x.a((byte) 47);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_i) {
            try {
              this.field_i.a((byte) 47);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_r != null) {
            for (var2_int = 0; var2_int < this.field_r.length; var2_int++) {
              if (this.field_r[var2_int] != null) {
                try {
                  this.field_r[var2_int].a((byte) 47);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_d) {
            try {
              this.field_d.a((byte) 47);
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

    final mi a(int param0, String param1, int param2) {
        if (param2 != 431890200) {
          return (mi) null;
        }
        return this.a(param0, (byte) 118, param1, false);
    }

    final mi a(int param0) {
        if (param0 != 5) {
          this.field_q = true;
        }
        return this.a(5, 0, 0, (Object) null, -27024);
    }

    uj(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        sb var6 = null;
        this.field_x = null;
        this.field_i = null;
        this.field_d = null;
        this.field_w = false;
        this.field_q = false;
        this.field_k = null;
        this.field_m = null;
        this.field_g = false;
        stackIn_3_1 = (param3);
        this.field_g = stackIn_3_1;
        field_j = "Unknown";
        field_c = param1;
        field_n = "1.1";
        field_h = param0;
        try {
          field_j = System.getProperty("java.vendor");
          field_n = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_j.toLowerCase().indexOf("microsoft") != -1) {
          this.field_q = true;
        }
        try {
          field_e = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_e = "Unknown";
        }
        field_a = field_e.toLowerCase();
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
          field_s = System.getProperty("user.home");
          if (field_s != null) {
            field_s = field_s + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_s == null) {
          field_s = "~/";
        }
        try {
          this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_q) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_o = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        va.a((byte) -117, field_h, field_c);
        if (this.field_g) {
          this.field_d = new nd(va.a(field_h, -29755, (String) null, "random.dat"), "rw", 25L);
          this.field_x = new nd(va.a("main_file_cache.dat2", (byte) 40), "rw", 314572800L);
          this.field_i = new nd(va.a("main_file_cache.idx255", (byte) 40), "rw", 1048576L);
          this.field_r = new nd[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_r[var5_int] = new nd(va.a("main_file_cache.idx" + var5_int, (byte) 40), "rw", 1048576L);
          }
          if (this.field_q) {
            try {
              Class.forName("pj").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_q) {
              var6 = new sb();
              this.field_l = var6;
            } else {
              this.field_v = Class.forName("hg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_q) {
              this.field_u = Class.forName("jg").newInstance();
            } else {
              this.field_b = new ld();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_w = false;
        this.field_t = new Thread((Runnable) (this));
        this.field_t.setPriority(10);
        this.field_t.setDaemon(true);
        this.field_t.start();
    }

    static {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
