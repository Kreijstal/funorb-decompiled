/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ce implements Runnable {
    rl field_t;
    rl field_k;
    private ra field_s;
    rl[] field_l;
    private static String field_g;
    private static String field_v;
    private od field_h;
    private ac field_x;
    private static String field_w;
    static String field_d;
    rl field_q;
    boolean field_e;
    private boolean field_u;
    private static volatile long field_i;
    private Object field_o;
    static java.lang.reflect.Method field_b;
    private Thread field_f;
    java.awt.EventQueue field_a;
    private od field_m;
    static String field_r;
    private boolean field_j;
    private Object field_c;
    static String field_n;
    private static int field_p;

    final od a(Class[] param0, String param1, Class param2, int param3) {
        if (param3 != 0) {
          return (od) null;
        }
        return this.a(0, param3 ^ -127, 8, new Object[]{param2, param1, param0}, 0);
    }

    final od a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != -50) {
          this.field_a = (java.awt.EventQueue) null;
        }
        return this.a(param2 + (param0 << 16), -108, 6, (Object) null, param4 + (param3 << 16));
    }

    final od a(int param0, byte param1, String param2) {
        if (param1 != 32) {
          return (od) null;
        }
        return this.a(param0, false, param2, 12411);
    }

    final od b(byte param0) {
        if (param0 < 107) {
          this.field_o = (Object) null;
        }
        return this.a(0, -122, 5, (Object) null, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_58_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          em var3_ref = null;
          rl var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          od var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          String var14 = null;
          Object[] var15 = null;
          java.awt.Frame var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_u) {
                if (this.field_m != null) {
                  var8 = this.field_m;
                  this.field_m = this.field_m.field_c;
                  if (this.field_m == null) {
                    this.field_h = null;
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
                  case 1:
                    if (lj.a((byte) -125) < field_i) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_f)), var8.field_a);
                    break;
                  case 22:
                    if (lj.a((byte) -126) < field_i) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (em) null;
                      var8.field_e = ol.a((String) (var8.field_f), 89, var8.field_a).a(true);
                    } catch (em decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (em) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_f);
                    if (this.field_e &&
                      ((Class) (var18[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var17.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_e) {
                      throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (this.field_j) {
                          var8.field_e = this.field_x.a(-7581);
                        } else {
                          var8.field_e = Class.forName("eh").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var16;
                        var16.setResizable(false);
                        if (!this.field_j) {
                          Class.forName("eh").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var16, new Integer(var8.field_a >>> 16), new Integer(65535 & var8.field_a), new Integer(var8.field_g >> 16), new Integer(var8.field_g & 65535)});
                        } else {
                          this.field_x.a(var8.field_a >>> 16, 65535 & var8.field_a, var16, var8.field_g & 65535, true, var8.field_g >> 16);
                        }
                        break;
                      case 7:
                        if (!this.field_j) {
                          Class.forName("eh").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          this.field_x.a((java.awt.Frame) (var8.field_f), 127);
                        }
                        break;
                      case 12:
                        var3_ref2 = ce.a((String) (var8.field_f), field_p, 18933, field_w);
                        var8.field_e = var3_ref2;
                        break;
                      case 13:
                        var3_ref2 = ce.a((String) (var8.field_f), field_p, 18933, "");
                        var8.field_e = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_e &&
                          14 == var2_int) {
                          var3_int = var8.field_a;
                          var4_int = var8.field_g;
                          if (!this.field_j) {
                            Class.forName("ig").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_s.a(-128, var3_int, var4_int);
                          }
                          break;
                        }
                        if (this.field_e &&
                          var2_int == 15) {
                          stackIn_58_0 = (var8.field_a == 0) ? 0 : 1;
                          var3_int = stackIn_58_0;
                          var13 = (java.awt.Component) (var8.field_f);
                          if (!this.field_j) {
                            Class.forName("ig").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_o, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_s.a(var13, (byte) -36, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_j &&
                          var2_int == 17) {
                          var15 = (Object[]) (var8.field_f);
                          Class.forName("ig").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_o, new Object[]{var15[0], var15[1], new Integer(var8.field_a), new Integer(var8.field_g), var15[2]});
                        } else {
                          if (var2_int != 16) {
                            throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_d.startsWith("win")) {
                              throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var14 = (String) (var8.field_f);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var14.length(); var5++) {
                              if (var4.indexOf((int) var14.charAt(var5)) == -1) {
                                throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref3;
                            throw ce.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 21:
                        if (lj.a((byte) -75) < field_i) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_f)).getAddress();
                        break;
                      case 3:
                        if (field_i > lj.a((byte) -107)) {
                          throw new IOException();
                        }
                        var12 = (255 & var8.field_a >> 24) + "." + ((var8.field_a & 16723364) >> 16) + "." + ((var8.field_a & 65409) >> 8) + "." + (var8.field_a & 255);
                        var8.field_e = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_f);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_f);
                    if (this.field_e &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (field_i > lj.a((byte) -34)) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_f)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_f));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_a);
                    var8.field_e = var9;
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
            this.field_u = true;
            this.notifyAll();
          }
          try {
            this.field_f.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_q != null) {
            try {
              this.field_q.b(-1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != 125) {
            return;
          }
          if (this.field_t != null) {
            try {
              this.field_t.b(-1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_l != null) {
            for (var2_int = 0; this.field_l.length > var2_int; var2_int++) {
              if (null != this.field_l[var2_int]) {
                try {
                  this.field_l[var2_int].b(-1);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.b(-1);
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

    private final od a(int param0, int param1, int param2, Object param3, int param4) {
        od var6 = null;
        java.awt.Frame var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param1 >= -72) {
          var9 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, (byte) 97);
        }
        var6 = new od();
        var6.field_g = param4;
        var6.field_f = param3;
        var6.field_a = param0;
        var6.field_d = param2;
        var7 = this;
        synchronized (var7) {
          if (this.field_h != null) {
            this.field_h.field_c = var6;
            this.field_h = var6;
          } else {
            this.field_m = var6;
            this.field_h = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final od a(int param0, boolean param1, String param2, int param3) {
        if (param3 != 12411) {
          return (od) null;
        }
        return this.a(param0, -125, !param1 ? 1 : 22, param2, 0);
    }

    private final static rl a(String param0, int param1, int param2, String param3) {
        try {
          rl stackIn_14_0 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          String var7 = null;
          rl var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param1 != 33) {
            if (34 == param1) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          var6 = 0;
          if (param2 != 18933) {
            var9 = (String) null;
            ce.a((String) null, 43, 59, (String) null);
          }
          while (var5.length > var6) {
            var7 = var5[var6];
            if (var7.length() > 0 &&
              !new File(var7).exists()) {
              var6++;
              continue;
            }
            while (true) {
              try {
                var8 = new rl(new File(var7, var4), "rw", 10000L);
                stackIn_14_0 = var8;
                return stackIn_14_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
                while (true) {
                  var6++;
                  if (var5.length <= var6) {
                    decompiledRegionSelector0 = 0;
                    break;
                  }
                  var7 = var5[var6];
                  if (var7.length() > 0 &&
                    !new File(var7).exists()) {
                    continue;
                  }
                  decompiledRegionSelector0 = 1;
                  break;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                break;
              }
            }
            break;
          }
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final od a(java.awt.Frame param0, byte param1) {
        if (param1 != -34) {
          this.b((byte) 116);
        }
        return this.a(0, param1 - 64, 7, param0, 0);
    }

    final od a(int param0, Runnable param1, int param2) {
        if (param0 != 4532) {
          Runnable var5 = (Runnable) null;
          this.a(-106, (Runnable) null, -56);
        }
        return this.a(param2, -99, 2, param1, 0);
    }

    final boolean a(int param0) {
        if (!this.field_e) {
          return false;
        }
        if (param0 < 95) {
          return false;
        }
        if (!this.field_j) {
          return null != this.field_c ? true : false;
        }
        return null != this.field_x ? true : false;
    }

    final od a(java.net.URL param0, int param1) {
        if (param1 != -34) {
          this.field_t = (rl) null;
        }
        return this.a(0, -81, 4, param0, 0);
    }

    final od a(byte param0, String param1, Class param2) {
        if (param0 < 37) {
          java.net.URL var5 = (java.net.URL) null;
          this.a((java.net.URL) null, 84);
        }
        return this.a(0, -97, 9, new Object[]{param2, param1}, 0);
    }

    ce(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ac var6 = null;
        this.field_t = null;
        this.field_k = null;
        this.field_u = false;
        this.field_h = null;
        this.field_j = false;
        this.field_m = null;
        this.field_e = false;
        this.field_q = null;
        field_n = "1.1";
        field_r = "Unknown";
        field_p = param0;
        field_w = param1;
        stackIn_3_1 = (param3);
        this.field_e = stackIn_3_1;
        try {
          field_r = System.getProperty("java.vendor");
          field_n = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
          this.field_j = true;
        }
        try {
          field_g = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_g = "Unknown";
        }
        field_d = field_g.toLowerCase();
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
        if (!this.field_j) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        kj.a(field_w, field_p, true);
        if (this.field_e) {
          this.field_k = new rl(kj.a((String) null, -2, field_p, "random.dat"), "rw", 25L);
          this.field_q = new rl(kj.a(20926, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_t = new rl(kj.a(20926, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_l = new rl[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_l[var5_int] = new rl(kj.a(20926, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("he").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_j) {
              this.field_c = Class.forName("eh").newInstance();
            } else {
              var6 = new ac();
              this.field_x = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_j) {
              this.field_s = new ra();
            } else {
              this.field_o = Class.forName("ig").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_u = false;
        this.field_f = new Thread((Runnable) (this));
        this.field_f.setPriority(10);
        this.field_f.setDaemon(true);
        this.field_f.start();
    }

    static {
        field_i = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
