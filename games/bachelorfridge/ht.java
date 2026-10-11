/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ht implements Runnable {
    java.awt.EventQueue field_x;
    private Object field_f;
    private static int field_w;
    qaa field_h;
    static String field_g;
    private Object field_p;
    static String field_i;
    qaa[] field_v;
    private qp field_d;
    private Thread field_r;
    private static String field_e;
    private static String field_o;
    boolean field_k;
    static java.lang.reflect.Method field_m;
    qaa field_n;
    private static String field_s;
    private eh field_b;
    private boolean field_j;
    private static volatile long field_u;
    private eh field_t;
    static String field_c;
    qaa field_a;
    private pq field_l;
    private boolean field_q;

    private final static qaa a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          qaa stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          qaa var8 = null;
          Exception var8_ref = null;
          if (param2 != 33) {
            if (param2 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          if (param3 != -1) {
            return (qaa) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new qaa(new File(var7, var4), "rw", 10000L);
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

    final eh a(byte param0, String param1, int param2) {
        if (param0 < 117) {
          field_o = (String) null;
        }
        return this.a(param2, false, -127, param1);
    }

    final boolean b(int param0) {
        if (!this.field_k) {
          return false;
        }
        if (param0 != 34) {
          return false;
        }
        if (this.field_j) {
          return this.field_d != null ? true : false;
        }
        return null != this.field_f ? true : false;
    }

    final eh a(java.awt.Component param0, boolean param1, int param2) {
        if (param2 <= 122) {
          this.field_q = true;
        }
        return this.a(0, param0, param1 ? 1 : 0, 0, 15);
    }

    final eh a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 87) {
          return (eh) null;
        }
        return this.a(param4 + (param0 << 16), (Object) null, param3 + (param1 << 16), 0, 6);
    }

    final eh a(java.net.URL param0, int param1) {
        int var3 = 54 % ((param1 + 56) / 36);
        return this.a(0, param0, 0, 0, 4);
    }

    final eh a(java.awt.Frame param0, boolean param1) {
        if (param1) {
          this.a(-38, -51, 84, 7, -4);
        }
        return this.a(0, param0, 0, 0, 7);
    }

    final eh c(int param0) {
        if (param0 != -1) {
          return (eh) null;
        }
        return this.a(0, (Object) null, 0, 0, 5);
    }

    final eh a(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
          this.a(-34);
        }
        return this.a(0, param0, param2, 0, 2);
    }

    private final eh a(int param0, Object param1, int param2, int param3, int param4) {
        eh var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param3 != 0) {
          this.field_l = (pq) null;
        }
        var6 = new eh();
        var6.field_d = param1;
        var6.field_c = param0;
        var6.field_a = param2;
        var6.field_b = param4;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_b) {
            this.field_b.field_g = var6;
            this.field_b = var6;
          } else {
            this.field_t = var6;
            this.field_b = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final eh a(int param0, boolean param1, int param2, String param3) {
        int var5 = 49 % ((param2 + 66) / 51);
        return this.a(0, param3, param0, 0, param1 ? 22 : 1);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_95_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          qaa var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          en var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          eh var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_q) {
                if (this.field_t != null) {
                  var8 = this.field_t;
                  this.field_t = this.field_t.field_g;
                  if (this.field_t == null) {
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
                var2_int = var8.field_b;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_d));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_a);
                    var8.field_e = var18;
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_d);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_k) {
                      throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_u > f.b((byte) 73)) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.field_a >> 24) + "." + (var8.field_a >> 16 & 255) + "." + (var8.field_a >> 8 & 255) + "." + (255 & var8.field_a);
                        var8.field_e = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var14;
                        var14.setResizable(false);
                        if (this.field_j) {
                          this.field_d.a((byte) -122, var8.field_a & 65535, var8.field_c >> 16, var8.field_a >>> 16, var14, 65535 & var8.field_c);
                        } else {
                          Class.forName("hma").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var14, new Integer(var8.field_a >>> 16), new Integer(65535 & var8.field_a), new Integer(var8.field_c >> 16), new Integer(var8.field_c & 65535)});
                        }
                        break;
                      case 12:
                        var3_ref = ht.a(field_e, (String) (var8.field_d), field_w, -1);
                        var8.field_e = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_k &&
                          var2_int == 14) {
                          var3_int = var8.field_a;
                          var4_int = var8.field_c;
                          if (this.field_j) {
                            this.field_l.a(var4_int, var3_int, 9537);
                          } else {
                            Class.forName("br").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_k &&
                          var2_int == 15) {
                          stackIn_95_0 = (var8.field_a == 0) ? 0 : 1;
                          var3_int = stackIn_95_0;
                          var13 = (java.awt.Component) (var8.field_d);
                          if (!this.field_j) {
                            Class.forName("br").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_l.a(var13, (byte) -86, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_j &&
                          var2_int == 17) {
                          var11 = (Object[]) (var8.field_d);
                          Class.forName("br").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var11[0], var11[1], new Integer(var8.field_a), new Integer(var8.field_c), var11[2]});
                        } else {
                          if (16 != var2_int) {
                            throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_i.startsWith("win")) {
                              throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var12 = (String) (var8.field_d);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var12.length() > var5; var5++) {
                              if (var4.indexOf((int) var12.charAt(var5)) == -1) {
                                throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref2;
                            throw ht.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref = ht.a("", (String) (var8.field_d), field_w, -1);
                        var8.field_e = var3_ref;
                        break;
                      case 7:
                        if (!this.field_j) {
                          Class.forName("hma").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          this.field_d.a(-31, (java.awt.Frame) (var8.field_d));
                        }
                        break;
                      case 5:
                        if (!this.field_j) {
                          var8.field_e = Class.forName("hma").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          var8.field_e = this.field_d.a(101);
                        }
                        break;
                      case 21:
                        if (f.b((byte) 73) < field_u) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_d)).getAddress();
                        break;
                    }
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_d);
                    if (this.field_k &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_d);
                    if (this.field_k &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_u > f.b((byte) 73)) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_d)).openStream());
                    break;
                  case 22:
                    if (f.b((byte) 73) < field_u) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (en) null;
                      var8.field_e = lda.a((String) (var8.field_d), var8.field_a, (byte) -113).a((byte) -70);
                    } catch (en decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (en) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (f.b((byte) 73) < field_u) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_d)), var8.field_a);
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

    final void a(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          if (param0 <= 20) {
            this.a(-108);
          }
          var2 = this;
          synchronized (var2) {
            this.field_q = true;
            this.notifyAll();
          }
          try {
            this.field_r.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_h) {
            try {
              this.field_h.a(true);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.a(true);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2_int = 0; this.field_v.length > var2_int; var2_int++) {
              if (null != this.field_v[var2_int]) {
                try {
                  this.field_v[var2_int].a(true);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_a) {
            try {
              this.field_a.a(true);
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

    final eh a(String param0, Class param1, int param2) {
        if (param2 >= -127) {
          return (eh) null;
        }
        return this.a(0, new Object[]{param1, param0}, 0, 0, 9);
    }

    final eh a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 31633) {
          field_o = (String) null;
        }
        return this.a(0, new Object[]{param1, param3, param2}, 0, param0 - 31633, 8);
    }

    ht(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        qp var7 = null;
        this.field_k = false;
        this.field_h = null;
        this.field_b = null;
        this.field_j = false;
        this.field_n = null;
        this.field_a = null;
        this.field_q = false;
        this.field_t = null;
        field_e = param1;
        field_w = param0;
        field_g = "Unknown";
        stackIn_3_1 = (param3);
        this.field_k = stackIn_3_1;
        field_c = "1.1";
        try {
          field_g = System.getProperty("java.vendor");
          field_c = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_g.toLowerCase().indexOf("microsoft") != -1) {
          this.field_j = true;
        }
        try {
          field_s = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_s = "Unknown";
        }
        field_i = field_s.toLowerCase();
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
          field_o = System.getProperty("user.home");
          if (field_o != null) {
            field_o = field_o + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_o) {
          field_o = "~/";
        }
        try {
          this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_j) {
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
        hu.a(0, field_w, field_e);
        if (this.field_k) {
          this.field_a = new qaa(hu.a(field_w, "random.dat", (String) null, 1), "rw", 25L);
          this.field_h = new qaa(hu.a("main_file_cache.dat2", 0), "rw", 314572800L);
          this.field_n = new qaa(hu.a("main_file_cache.idx255", 0), "rw", 1048576L);
          this.field_v = new qaa[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_v[var5_int] = new qaa(hu.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("cna").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_j) {
              var7 = new qp();
              this.field_d = var7;
            } else {
              this.field_f = Class.forName("hma").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_j) {
              this.field_p = Class.forName("br").newInstance();
            } else {
              this.field_l = new pq();
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

    static {
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
