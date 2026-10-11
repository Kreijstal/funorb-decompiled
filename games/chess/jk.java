/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk implements Runnable {
    private ff field_h;
    static java.lang.reflect.Method field_m;
    eg field_n;
    private static volatile long field_f;
    private gj field_v;
    boolean field_k;
    static String field_c;
    private static String field_l;
    private nl field_w;
    private nl field_q;
    private Thread field_t;
    private Object field_g;
    private static String field_e;
    eg field_a;
    private boolean field_s;
    private static String field_j;
    private Object field_u;
    java.awt.EventQueue field_x;
    eg field_d;
    private static int field_b;
    static String field_o;
    eg[] field_r;
    static String field_i;
    private boolean field_p;

    final nl a(int param0, String param1, Class[] param2, Class param3) {
        nl discarded$0 = null;
        if (param0 != 8) {
          String var6 = (String) null;
          discarded$0 = this.a((String) null, 21, 78, false);
        }
        return this.a(param0 ^ 9, 0, new Object[]{param3, param1, param2}, 8, 0);
    }

    final nl a(int param0, boolean param1, Runnable param2) {
        if (!param1) {
          this.a(117);
        }
        return this.a(1, param0, param2, 2, 0);
    }

    final nl a(String param0, Class param1, byte param2) {
        if (param2 < 4) {
          field_m = (java.lang.reflect.Method) null;
        }
        return this.a(1, 0, new Object[]{param1, param0}, 9, 0);
    }

    final void b(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          String var4 = null;
          if (param0 != 0) {
            var4 = (String) null;
            this.a((String) null, true, -30);
          }
          var2 = this;
          synchronized (var2) {
            this.field_s = true;
            this.notifyAll();
          }
          try {
            this.field_t.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_a) {
            try {
              this.field_a.a(10992);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.a(10992);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_r) {
            for (var2_int = 0; var2_int < this.field_r.length; var2_int++) {
              if (null != this.field_r[var2_int]) {
                try {
                  this.field_r[var2_int].a(10992);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_d) {
            try {
              this.field_d.a(param0 ^ 10992);
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

    private final nl a(String param0, int param1, int param2, boolean param3) {
        if (param1 != 0) {
          this.a(97, -106, 27, 64, -97);
        }
        return this.a(param1 + 1, param2, param0, !param3 ? 1 : 22, 0);
    }

    final nl a(java.awt.Frame param0, boolean param1) {
        if (param1) {
          return (nl) null;
        }
        return this.a(1, 0, param0, 7, 0);
    }

    private final nl a(int param0, int param1, Object param2, int param3, int param4) {
        nl var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param0 != 1) {
          return (nl) null;
        }
        var6 = new nl();
        var6.field_d = param4;
        var6.field_g = param3;
        var6.field_c = param2;
        var6.field_e = param1;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_q) {
            this.field_q.field_a = var6;
            this.field_q = var6;
          } else {
            this.field_w = var6;
            this.field_q = var6;
          }
          this.notify();
        }
        return var6;
    }

    final nl a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 89) {
          return (nl) null;
        }
        return this.a(1, (param0 << 16) + param1, (Object) null, 6, param4 + (param3 << 16));
    }

    final nl a(byte param0, java.net.URL param1) {
        if (param0 != -49) {
          this.a(100, -38, -20, -23, 39);
        }
        return this.a(1, 0, param1, 4, 0);
    }

    private final static eg a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          eg stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          eg var8 = null;
          Exception var8_ref = null;
          if (param2 <= 74) {
            field_j = (String) null;
          }
          if (33 != param3) {
            if (param3 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new eg(new File(var7, var4), "rw", 10000L);
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
          int stackIn_72_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          eg var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          oa var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          nl var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          java.awt.Frame var11 = null;
          java.awt.Component var12 = null;
          String var13 = null;
          Object[] var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_s) {
                if (null != this.field_w) {
                  var8 = this.field_w;
                  this.field_w = this.field_w.field_a;
                  if (this.field_w == null) {
                    this.field_q = null;
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
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_c));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_e);
                    var8.field_b = var18;
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_b = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_k) {
                      throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_f > ud.a(2)) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.field_e >> 24) + "." + (255 & var8.field_e >> 16) + "." + ((var8.field_e & 65468) >> 8) + "." + (255 & var8.field_e);
                        var8.field_b = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 21:
                        if (field_f > ud.a(2)) {
                          throw new IOException();
                        }
                        var8.field_b = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 5:
                        if (this.field_p) {
                          var8.field_b = this.field_v.a(0);
                        } else {
                          var8.field_b = Class.forName("wd").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                        }
                        break;
                      case 13:
                        var3_ref = jk.a("", (String) (var8.field_c), 90, field_b);
                        var8.field_b = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_k &&
                          var2_int == 14) {
                          var3_int = var8.field_e;
                          var4_int = var8.field_d;
                          if (!this.field_p) {
                            Class.forName("sm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_h.a(0, var3_int, var4_int);
                          }
                          break;
                        }
                        if (this.field_k &&
                          var2_int == 15) {
                          stackIn_72_0 = (0 == var8.field_e) ? 0 : 1;
                          var3_int = stackIn_72_0;
                          var12 = (java.awt.Component) (var8.field_c);
                          if (this.field_p) {
                            this.field_h.a(29783, var3_int != 0, var12);
                          } else {
                            Class.forName("sm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_p &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.field_c);
                          Class.forName("sm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var14[0], var14[1], new Integer(var8.field_e), new Integer(var8.field_d), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_c.startsWith("win")) {
                              throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_c);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (var4.indexOf((int) var13.charAt(var5)) == -1) {
                                throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_b = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref2;
                            throw jk.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 12:
                        var3_ref = jk.a(field_j, (String) (var8.field_c), 91, field_b);
                        var8.field_b = var3_ref;
                        break;
                      case 7:
                        if (this.field_p) {
                          this.field_v.a(121, (java.awt.Frame) (var8.field_c));
                        } else {
                          Class.forName("wd").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                        }
                        break;
                      case 6:
                        var11 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_b = var11;
                        var11.setResizable(false);
                        if (this.field_p) {
                          this.field_v.a(var11, var8.field_e & 65535, 65535 & var8.field_d, 127, var8.field_e >>> 16, var8.field_d >> 16);
                        } else {
                          Class.forName("wd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var11, new Integer(var8.field_e >>> 16), new Integer(65535 & var8.field_e), new Integer(var8.field_d >> 16), new Integer(65535 & var8.field_d)});
                        }
                        break;
                    }
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_c);
                    if (this.field_k &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_c);
                    if (this.field_k &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_f > ud.a(2)) {
                      throw new IOException();
                    }
                    var8.field_b = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                    break;
                  case 22:
                    if (field_f > ud.a(2)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (oa) null;
                      var8.field_b = bl.a(0, var8.field_e, (String) (var8.field_c)).a((byte) -101);
                    } catch (oa decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (oa) (Object) decompiledCaughtException;
                      var8.field_b = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (ud.a(2) < field_f) {
                      throw new IOException();
                    }
                    var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_e);
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

    final boolean a(boolean param0) {
        if (!param0) {
          this.field_k = false;
        }
        if (!this.field_k) {
          return false;
        }
        if (this.field_p) {
          return this.field_v != null ? true : false;
        }
        return null != this.field_g ? true : false;
    }

    final nl a(String param0, boolean param1, int param2) {
        if (param1) {
          return (nl) null;
        }
        return this.a(param0, 0, param2, false);
    }

    final nl a(int param0) {
        if (param0 != -16312) {
          return (nl) null;
        }
        return this.a(1, 0, (Object) null, 5, 0);
    }

    jk(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        gj var6 = null;
        this.field_k = false;
        this.field_s = false;
        this.field_w = null;
        this.field_a = null;
        this.field_d = null;
        this.field_q = null;
        this.field_n = null;
        this.field_p = false;
        field_i = "1.1";
        stackIn_3_1 = (param3);
        this.field_k = stackIn_3_1;
        field_o = "Unknown";
        field_b = param0;
        field_j = param1;
        try {
          field_o = System.getProperty("java.vendor");
          field_i = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.field_p = true;
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
          field_l = System.getProperty("user.home");
          if (null != field_l) {
            field_l = field_l + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_l) {
          field_l = "~/";
        }
        try {
          this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_p) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        ul.a(21747, field_j, field_b);
        if (this.field_k) {
          this.field_d = new eg(ul.a((String) null, field_b, "random.dat", (byte) 86), "rw", 25L);
          this.field_a = new eg(ul.a((byte) -103, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_n = new eg(ul.a((byte) -69, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_r = new eg[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_r[var5_int] = new eg(ul.a((byte) -113, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_p) {
            try {
              Class.forName("kc").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_p) {
              this.field_g = Class.forName("wd").newInstance();
            } else {
              var6 = new gj();
              this.field_v = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_p) {
              this.field_u = Class.forName("sm").newInstance();
            } else {
              this.field_h = new ff();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_s = false;
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
