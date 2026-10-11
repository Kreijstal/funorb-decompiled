/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pd implements Runnable {
    static String field_q;
    private boolean field_g;
    ji field_o;
    private Thread field_t;
    private un field_h;
    private static volatile long field_f;
    ji[] field_i;
    static java.lang.reflect.Method field_v;
    static String field_k;
    java.awt.EventQueue field_w;
    static String field_x;
    private ki field_l;
    private un field_m;
    private static int field_u;
    boolean field_a;
    private static String field_d;
    private static String field_r;
    private boolean field_e;
    private static String field_n;
    private Object field_b;
    ji field_j;
    ji field_c;
    private om field_s;
    private Object field_p;

    final un a(java.awt.Frame param0, boolean param1) {
        if (param1) {
          this.field_e = false;
        }
        return this.a(7, (byte) -30, 0, param0, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_97_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ji var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          te var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          un var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          String var12 = null;
          java.awt.Frame var13 = null;
          Object[] var14 = null;
          java.awt.Component var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_e) {
                if (null != this.field_h) {
                  var9 = this.field_h;
                  this.field_h = this.field_h.field_d;
                  if (null == this.field_h) {
                    this.field_m = null;
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
                var2_int = var9.field_b;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var9.field_g));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.field_e);
                    var9.field_f = var18;
                    break;
                  case 4:
                    if (hc.a(-9986) < field_f) {
                      throw new IOException();
                    }
                    var9.field_f = new DataInputStream(((java.net.URL) (var9.field_g)).openStream());
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.field_f = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var9.field_g);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_a) {
                      throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 12:
                        var3_ref = pd.a(field_n, (String) (var9.field_g), field_u, 100150608);
                        var9.field_f = var3_ref;
                        break;
                      case 13:
                        var3_ref = pd.a("", (String) (var9.field_g), field_u, 100150608);
                        var9.field_f = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_a &&
                          var2_int == 14) {
                          var3_int = var9.field_e;
                          var4 = var9.field_c;
                          if (!this.field_g) {
                            Class.forName("uj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_l.a(-1340, var3_int, var4);
                          }
                          break;
                        }
                        if (this.field_a &&
                          15 == var2_int) {
                          stackIn_97_0 = (0 == var9.field_e) ? 0 : 1;
                          var3_int = stackIn_97_0;
                          var15 = (java.awt.Component) (var9.field_g);
                          if (!this.field_g) {
                            Class.forName("uj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_b, new Object[]{var15, new Boolean(var3_int != 0)});
                          } else {
                            this.field_l.a(var15, -110, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_g &&
                          17 == var2_int) {
                          var14 = (Object[]) (var9.field_g);
                          Class.forName("uj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_b, new Object[]{var14[0], var14[1], new Integer(var9.field_e), new Integer(var9.field_c), var14[2]});
                        } else {
                          if (16 != var2_int) {
                            throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_x.startsWith("win")) {
                              throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var8 = (String) (var9.field_g);
                            if (!var8.startsWith("http://") &&
                              !var8.startsWith("https://")) {
                              throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var8.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var8.charAt(var5)) == -1) {
                                throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_f = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var9.field_f = var3_ref2;
                            throw pd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 7:
                        if (!this.field_g) {
                          Class.forName("vk").getMethod("exit", new Class[]{}).invoke(this.field_p, new Object[]{});
                        } else {
                          this.field_s.a((byte) -54, (java.awt.Frame) (var9.field_g));
                        }
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var9.field_f = var13;
                        var13.setResizable(false);
                        if (!this.field_g) {
                          Class.forName("vk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{var13, new Integer(var9.field_e >>> 16), new Integer(var9.field_e & 65535), new Integer(var9.field_c >> 16), new Integer(var9.field_c & 65535)});
                        } else {
                          this.field_s.a(-80, var9.field_c & 65535, var13, var9.field_e >>> 16, 65535 & var9.field_e, var9.field_c >> 16);
                        }
                        break;
                      case 5:
                        if (this.field_g) {
                          var9.field_f = this.field_s.a(123);
                        } else {
                          var9.field_f = Class.forName("vk").getMethod("listmodes", new Class[]{}).invoke(this.field_p, new Object[]{});
                        }
                        break;
                      case 21:
                        if (hc.a(-9986) < field_f) {
                          throw new IOException();
                        }
                        var9.field_f = java.net.InetAddress.getByName((String) (var9.field_g)).getAddress();
                        break;
                      case 3:
                        if (field_f > hc.a(-9986)) {
                          throw new IOException();
                        }
                        var12 = (var9.field_e >> 24 & 255) + "." + ((16761372 & var9.field_e) >> 16) + "." + (255 & var9.field_e >> 8) + "." + (255 & var9.field_e);
                        var9.field_f = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 9:
                    var11 = (Object[]) (var9.field_g);
                    if (this.field_a &&
                      null == ((Class) (var11[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_f = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                    break;
                  case 8:
                    var10 = (Object[]) (var9.field_g);
                    if (this.field_a &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_f = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 22:
                    if (hc.a(-9986) < field_f) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (te) null;
                      var9.field_f = ig.a(var9.field_e, (String) (var9.field_g), -92).b(-18982);
                    } catch (te decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (te) (Object) decompiledCaughtException;
                      var9.field_f = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_f > hc.a(-9986)) {
                      throw new IOException();
                    }
                    var9.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_g)), var9.field_e);
                    break;
                }
              }
              var9.field_a = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var9.field_a = 2;
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

    final un a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1289287280) {
          this.a(50);
        }
        return this.a(6, (byte) -30, param4 + (param2 << 16), (Object) null, (param1 << 16) + param0);
    }

    final un a(int param0, Runnable param1, int param2) {
        if (param2 != 255) {
          field_d = (String) null;
        }
        return this.a(2, (byte) -30, param0, param1, 0);
    }

    final un a(Class param0, String param1, boolean param2) {
        un discarded$0 = null;
        if (!param2) {
          Object var5 = (Object) null;
          discarded$0 = this.a(-84, (byte) -3, -6, (Object) null, -93);
        }
        return this.a(9, (byte) -30, 0, new Object[]{param0, param1}, 0);
    }

    final un a(int param0, int param1, String param2) {
        if (param1 != 27402) {
          return (un) null;
        }
        return this.a(param1 - 27401, false, param2, param0);
    }

    private final static ji a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          ji stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ji var8 = null;
          Exception var8_ref = null;
          if (param3 != 100150608) {
            field_k = (String) null;
          }
          if (33 != param2) {
            if (param2 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new ji(new File(var7, var4), "rw", 10000L);
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

    private final un a(int param0, boolean param1, String param2, int param3) {
        if (param0 != 1) {
          return (un) null;
        }
        return this.a(param1 ? 22 : 1, (byte) -30, param3, param2, 0);
    }

    final un a(java.net.URL param0, boolean param1) {
        if (!param1) {
          field_n = (String) null;
        }
        return this.a(4, (byte) -30, 0, param0, 0);
    }

    final un a(Class param0, Class[] param1, boolean param2, String param3) {
        if (!param2) {
          String var6 = (String) null;
          this.a((Class) null, (Class[]) null, true, (String) null);
        }
        return this.a(8, (byte) -30, 0, new Object[]{param0, param3, param1}, 0);
    }

    private final un a(int param0, byte param1, int param2, Object param3, int param4) {
        un var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new un();
        var6.field_g = param3;
        if (param1 != -30) {
          return (un) null;
        }
        var6.field_e = param2;
        var6.field_c = param4;
        var6.field_b = param0;
        var7 = this;
        synchronized (var7) {
          if (this.field_m != null) {
            this.field_m.field_d = var6;
            this.field_m = var6;
          } else {
            this.field_h = var6;
            this.field_m = var6;
          }
          this.notify();
        }
        return var6;
    }

    final void a(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_e = true;
            this.notifyAll();
          }
          try {
            this.field_t.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (param0 != 23607) {
            return;
          }
          if (this.field_c != null) {
            try {
              this.field_c.b(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_j) {
            try {
              this.field_j.b(0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_i != null) {
            for (var2_int = 0; this.field_i.length > var2_int; var2_int++) {
              if (null != this.field_i[var2_int]) {
                try {
                  this.field_i[var2_int].b(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_o != null) {
            try {
              this.field_o.b(0);
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

    final un a(byte param0) {
        if (param0 > -106) {
          this.field_o = (ji) null;
        }
        return this.a(5, (byte) -30, 0, (Object) null, 0);
    }

    final boolean b(int param0) {
        int var2 = 71 % ((param0 + 58) / 60);
        if (!this.field_a) {
          return false;
        }
        if (this.field_g) {
          return this.field_s != null ? true : false;
        }
        return this.field_p != null ? true : false;
    }

    pd(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        om var6 = null;
        this.field_g = false;
        this.field_a = false;
        this.field_m = null;
        this.field_h = null;
        this.field_e = false;
        this.field_j = null;
        this.field_o = null;
        this.field_c = null;
        field_u = param0;
        stackIn_3_1 = (param3);
        this.field_a = stackIn_3_1;
        field_k = "1.1";
        field_q = "Unknown";
        field_n = param1;
        try {
          field_q = System.getProperty("java.vendor");
          field_k = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_q.toLowerCase().indexOf("microsoft") != -1) {
          this.field_g = true;
        }
        try {
          field_d = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_d = "Unknown";
        }
        field_x = field_d.toLowerCase();
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
          field_r = System.getProperty("user.home");
          if (null != field_r) {
            field_r = field_r + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_r) {
          field_r = "~/";
        }
        try {
          this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_g) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        ui.a((byte) 125, field_u, field_n);
        if (this.field_a) {
          this.field_o = new ji(ui.a((byte) 123, (String) null, "random.dat", field_u), "rw", 25L);
          this.field_c = new ji(ui.a("main_file_cache.dat2", (byte) -83), "rw", 314572800L);
          this.field_j = new ji(ui.a("main_file_cache.idx255", (byte) -83), "rw", 1048576L);
          this.field_i = new ji[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_i[var5_int] = new ji(ui.a("main_file_cache.idx" + var5_int, (byte) -83), "rw", 1048576L);
          }
          if (this.field_g) {
            try {
              Class.forName("jn").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_g) {
              this.field_p = Class.forName("vk").newInstance();
            } else {
              var6 = new om();
              this.field_s = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_g) {
              this.field_l = new ki();
            } else {
              this.field_b = Class.forName("uj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_e = false;
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
