/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd implements Runnable {
    private boolean field_h;
    ei field_r;
    static String field_t;
    private hj field_l;
    private wo field_w;
    boolean field_e;
    ei field_m;
    private Object field_b;
    ei[] field_c;
    private static int field_k;
    private static String field_f;
    private fv field_q;
    private static String field_a;
    static String field_n;
    ei field_d;
    private Thread field_v;
    private static String field_i;
    private static volatile long field_p;
    static String field_u;
    private wo field_s;
    static java.lang.reflect.Method field_x;
    private boolean field_g;
    private Object field_o;
    java.awt.EventQueue field_j;

    final wo a(int param0, byte param1, String param2) {
        if (param1 < 37) {
          field_p = -11L;
        }
        return this.a((byte) 125, param0, false, param2);
    }

    final wo a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
          this.field_c = (ei[]) null;
        }
        return this.a((param4 << 16) + param3, (param2 << 16) + param1, (Object) null, (byte) 81, 6);
    }

    private final wo a(byte param0, int param1, boolean param2, String param3) {
        if (param0 < 121) {
          return (wo) null;
        }
        return this.a(0, param1, param3, (byte) -20, !param2 ? 1 : 22);
    }

    final wo a(java.awt.datatransfer.Transferable param0, int param1) {
        if (param1 != -26522) {
          return (wo) null;
        }
        return this.a(0, 0, param0, (byte) 102, 19);
    }

    private final static ei a(boolean param0, String param1, int param2, String param3) {
        try {
          int var6 = 0;
          ei stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ei var8 = null;
          Exception var8_ref = null;
          if (33 != param2) {
            if (34 != param2) {
              var4 = "jagex_" + param3 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ei(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param0) {
            return null;
          }
          field_x = (java.lang.reflect.Method) null;
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wo a(int param0, int param1, Runnable param2) {
        if (param1 != 0) {
          this.field_j = (java.awt.EventQueue) null;
        }
        return this.a(0, param0, param2, (byte) -26, 2);
    }

    final wo a(Class param0, int param1, Class[] param2, String param3) {
        if (param1 != 0) {
          this.b(false);
        }
        return this.a(0, 0, new Object[]{param0, param3, param2}, (byte) 124, 8);
    }

    final wo a(int param0) {
        if (param0 != 0) {
          return (wo) null;
        }
        return this.a(0, 0, (Object) null, (byte) -99, 18);
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
            this.field_g = stackIn_4_1;
            this.notifyAll();
          }
          try {
            this.field_v.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_r) {
            try {
              this.field_r.b(783);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_d != null) {
            try {
              this.field_d.b(783);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_c != null) {
            for (var2_int = 0; this.field_c.length > var2_int; var2_int++) {
              if (this.field_c[var2_int] != null) {
                try {
                  this.field_c[var2_int].b(783);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_m != null) {
            try {
              this.field_m.b(783);
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

    private final wo a(int param0, int param1, Object param2, byte param3, int param4) {
        wo var6 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var7_ref_Object = null;
        var6 = new wo();
        var6.field_d = param0;
        var6.field_b = param2;
        var6.field_e = param4;
        var6.field_c = param1;
        var7_ref_Object = this;
        synchronized (var7_ref_Object) {
          if (this.field_s == null) {
            this.field_w = var6;
            this.field_s = var6;
          } else {
            this.field_s.field_a = var6;
            this.field_s = var6;
          }
          this.notify();
        }
        var7 = -48 % ((18 - param3) / 35);
        return var6;
    }

    final wo a(byte param0, java.awt.Frame param1) {
        int var3 = -12 % ((param0 + 4) / 59);
        return this.a(0, 0, param1, (byte) 108, 7);
    }

    final wo a(java.net.URL param0, boolean param1) {
        if (param1) {
          this.b(true);
        }
        return this.a(0, 0, param0, (byte) -126, 4);
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
          ei var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ug var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          wo var8 = null;
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
              while (!this.field_g) {
                if (this.field_w != null) {
                  var8 = this.field_w;
                  this.field_w = this.field_w.field_a;
                  if (null == this.field_w) {
                    this.field_s = null;
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
                var2_int = var8.field_e;
                switch (var2_int) {
                  case 9:
                    var18 = (Object[]) (var8.field_b);
                    if (this.field_e &&
                      ((Class) (var18[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_f = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_e) {
                      throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (vi.b(-127) < field_p) {
                          throw new IOException();
                        }
                        var15 = (var8.field_c >> 24 & 255) + "." + (255 & var8.field_c >> 16) + "." + (255 & var8.field_c >> 8) + "." + (var8.field_c & 255);
                        var8.field_f = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (this.field_h) {
                          var8.field_f = this.field_q.a(0);
                        } else {
                          var8.field_f = Class.forName("wu").getMethod("listmodes", new Class[]{}).invoke(this.field_o, new Object[]{});
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_f = var14;
                        var14.setResizable(false);
                        if (!this.field_h) {
                          Class.forName("wu").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{var14, new Integer(var8.field_c >>> 16), new Integer(var8.field_c & 65535), new Integer(var8.field_d >> 16), new Integer(var8.field_d & 65535)});
                        } else {
                          this.field_q.a(65535 & var8.field_c, var8.field_d & 65535, var14, var8.field_d >> 16, var8.field_c >>> 16, false);
                        }
                        break;
                      case 7:
                        if (!this.field_h) {
                          Class.forName("wu").getMethod("exit", new Class[]{}).invoke(this.field_o, new Object[]{});
                        } else {
                          this.field_q.a(122, (java.awt.Frame) (var8.field_b));
                        }
                        break;
                      case 12:
                        var3_ref = hd.a(true, (String) (var8.field_b), field_k, field_i);
                        var8.field_f = var3_ref;
                        break;
                      case 13:
                        var3_ref = hd.a(true, (String) (var8.field_b), field_k, "");
                        var8.field_f = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_e &&
                          14 == var2_int) {
                          var3_int = var8.field_c;
                          var4 = var8.field_d;
                          if (this.field_h) {
                            this.field_l.a(var4, 74, var3_int);
                          } else {
                            Class.forName("gf").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_e &&
                          var2_int == 15) {
                          stackIn_83_0 = (var8.field_c == 0) ? 0 : 1;
                          var3_int = stackIn_83_0;
                          var13 = (java.awt.Component) (var8.field_b);
                          if (this.field_h) {
                            this.field_l.a(48, var3_int != 0, var13);
                          } else {
                            Class.forName("gf").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_b, new Object[]{var13, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_h &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_b);
                          Class.forName("gf").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_b, new Object[]{var12[0], var12[1], new Integer(var8.field_c), new Integer(var8.field_d), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_n.startsWith("win")) {
                              throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var11 = (String) (var8.field_b);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_f = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_f = var3_ref2;
                            throw hd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 21:
                        if (field_p > vi.b(46)) {
                          throw new IOException();
                        }
                        var8.field_f = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                        break;
                    }
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_b);
                    if (this.field_e &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (vi.b(89) < field_p) {
                      throw new IOException();
                    }
                    var8.field_f = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_b));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_c);
                    var8.field_f = var9;
                    break;
                  case 22:
                    if (vi.b(-118) < field_p) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ug) null;
                      var8.field_f = ti.a((String) (var8.field_b), (byte) 102, var8.field_c).a(111);
                    } catch (ug decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ug) (Object) decompiledCaughtException;
                      var8.field_f = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (vi.b(-108) < field_p) {
                      throw new IOException();
                    }
                    var8.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_c);
                    break;
                }
              }
              var8.field_g = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_g = 2;
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

    final wo b(int param0) {
        if (param0 != -20681) {
          return (wo) null;
        }
        return this.a(0, 0, (Object) null, (byte) 109, 5);
    }

    final wo a(int param0, Class param1, String param2) {
        if (param0 != -30598) {
          this.a(false);
        }
        return this.a(0, 0, new Object[]{param1, param2}, (byte) -60, 9);
    }

    final boolean b(boolean param0) {
        if (param0) {
          java.awt.datatransfer.Transferable var3 = (java.awt.datatransfer.Transferable) null;
          this.a((java.awt.datatransfer.Transferable) null, 84);
        }
        if (!this.field_e) {
          return false;
        }
        if (this.field_h) {
          return null != this.field_q ? true : false;
        }
        return this.field_o != null ? true : false;
    }

    hd(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        fv var7 = null;
        this.field_e = false;
        this.field_d = null;
        this.field_h = false;
        this.field_r = null;
        this.field_m = null;
        this.field_w = null;
        this.field_g = false;
        this.field_s = null;
        stackIn_3_1 = (param3);
        this.field_e = stackIn_3_1;
        field_t = "Unknown";
        field_u = "1.1";
        field_k = param0;
        field_i = param1;
        try {
          field_t = System.getProperty("java.vendor");
          field_u = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_t.toLowerCase().indexOf("microsoft") != -1) {
          this.field_h = true;
        }
        try {
          field_a = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_a = "Unknown";
        }
        field_n = field_a.toLowerCase();
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
          field_f = System.getProperty("user.home");
          if (null != field_f) {
            field_f = field_f + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_f) {
          field_f = "~/";
        }
        try {
          this.field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_h) {
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
        qi.a(field_k, field_i, 1);
        if (this.field_e) {
          this.field_m = new ei(qi.a("random.dat", field_k, 39, (String) null), "rw", 25L);
          this.field_r = new ei(qi.a(true, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_d = new ei(qi.a(true, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_c = new ei[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_c[var5_int] = new ei(qi.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_h) {
            try {
              Class.forName("qr").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_h) {
              this.field_o = Class.forName("wu").newInstance();
            } else {
              var7 = new fv();
              this.field_q = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_h) {
              this.field_l = new hj();
            } else {
              this.field_b = Class.forName("gf").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_g = false;
        this.field_v = new Thread((Runnable) (this));
        this.field_v.setPriority(10);
        this.field_v.setDaemon(true);
        this.field_v.start();
    }

    static {
        field_p = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
