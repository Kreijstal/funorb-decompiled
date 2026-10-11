/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static String field_k;
    private static String field_l;
    static java.lang.reflect.Method field_q;
    private al field_x;
    ri field_i;
    private boolean field_j;
    ri field_m;
    private Object field_t;
    java.awt.EventQueue field_a;
    private static volatile long field_d;
    private static int field_w;
    static String field_p;
    private Thread field_e;
    boolean field_s;
    private static String field_v;
    private jh field_r;
    private Object field_h;
    private ba field_u;
    ri[] field_f;
    private static String field_n;
    ri field_c;
    private jh field_o;
    private boolean field_g;
    static String field_b;

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_70_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ri var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          hf var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          String var7 = null;
          java.awt.datatransfer.Transferable var8 = null;
          jh var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          Object[] var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_g) {
                if (this.field_o != null) {
                  var9 = this.field_o;
                  this.field_o = this.field_o.field_c;
                  if (this.field_o == null) {
                    this.field_r = null;
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
                  case 1:
                    if (d.a((byte) 21) < field_d) {
                      throw new IOException();
                    }
                    var9.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_g)), var9.field_d);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var9.field_g));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.field_d);
                    var9.field_e = var18;
                    break;
                  case 4:
                    if (d.a((byte) 56) < field_d) {
                      throw new IOException();
                    }
                    var9.field_e = new DataInputStream(((java.net.URL) (var9.field_g)).openStream());
                    break;
                  case 9:
                    var17 = (Object[]) (var9.field_g);
                    if (this.field_s &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var8 = (java.awt.datatransfer.Transferable) (var9.field_g);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var8, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_s) {
                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (d.a((byte) 25) < field_d) {
                          throw new IOException();
                        }
                        var15 = (var9.field_d >> 24 & 255) + "." + (255 & var9.field_d >> 16) + "." + ((65409 & var9.field_d) >> 8) + "." + (255 & var9.field_d);
                        var9.field_e = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 21:
                        if (d.a((byte) 84) < field_d) {
                          throw new IOException();
                        }
                        var9.field_e = java.net.InetAddress.getByName((String) (var9.field_g)).getAddress();
                        break;
                      case 5:
                        if (this.field_j) {
                          var9.field_e = this.field_u.a(true);
                        } else {
                          var9.field_e = Class.forName("bj").getMethod("listmodes", new Class[]{}).invoke(this.field_t, new Object[]{});
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var9.field_e = var14;
                        var14.setResizable(false);
                        if (!this.field_j) {
                          Class.forName("bj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{var14, new Integer(var9.field_d >>> 16), new Integer(var9.field_d & 65535), new Integer(var9.field_f >> 16), new Integer(65535 & var9.field_f)});
                        } else {
                          this.field_u.a(var9.field_f >> 16, (byte) 122, var9.field_d >>> 16, 65535 & var9.field_d, var9.field_f & 65535, var14);
                        }
                        break;
                      case 7:
                        if (this.field_j) {
                          this.field_u.a(-2147483648, (java.awt.Frame) (var9.field_g));
                        } else {
                          Class.forName("bj").getMethod("exit", new Class[]{}).invoke(this.field_t, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = vh.a(0, field_w, (String) (var9.field_g), field_v);
                        var9.field_e = var3_ref;
                        break;
                      case 13:
                        var3_ref = vh.a(0, field_w, (String) (var9.field_g), "");
                        var9.field_e = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_s &&
                          var2_int == 14) {
                          var3_int = var9.field_d;
                          var4 = var9.field_f;
                          if (this.field_j) {
                            this.field_x.a(var3_int, var4, (byte) 116);
                          } else {
                            Class.forName("ak").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_s &&
                          15 == var2_int) {
                          stackIn_70_0 = (0 == var9.field_d) ? 0 : 1;
                          var3_int = stackIn_70_0;
                          var13 = (java.awt.Component) (var9.field_g);
                          if (!this.field_j) {
                            Class.forName("ak").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_x.a(0, var3_int != 0, var13);
                          }
                          break;
                        }
                        if (!this.field_j &&
                          var2_int == 17) {
                          var12 = (Object[]) (var9.field_g);
                          Class.forName("ak").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var12[0], var12[1], new Integer(var9.field_d), new Integer(var9.field_f), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_k.startsWith("win")) {
                              throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var7 = (String) (var9.field_g);
                            if (!var7.startsWith("http://") &&
                              !var7.startsWith("https://")) {
                              throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var7.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var7.charAt(var5)) == -1) {
                                throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var7 + "\"");
                            var9.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var9.field_e = var3_ref2;
                            throw vh.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                    }
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.field_e = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var9.field_g);
                    if (this.field_s &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 22:
                    if (d.a((byte) 50) < field_d) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (hf) null;
                      var9.field_e = mj.a((String) (var9.field_g), var9.field_d, -1).a((byte) -128);
                    } catch (hf decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (hf) (Object) decompiledCaughtException;
                      var9.field_e = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
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

    final jh a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 < 93) {
          return (jh) null;
        }
        return this.a(false, param2 + (param0 << 16), (Object) null, param4 + (param3 << 16), 6);
    }

    final jh a(boolean param0) {
        if (param0) {
          field_w = -25;
        }
        return this.a(false, 0, (Object) null, 0, 5);
    }

    private final static ri a(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          ri stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ri var8 = null;
          Exception var8_ref = null;
          if (param1 != 33) {
            if (34 == param1) {
              var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ri(new File(var7, var4), "rw", 10000L);
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

    private final jh a(int param0, String param1, boolean param2, byte param3) {
        if (param3 < 74) {
          field_b = (String) null;
        }
        return this.a(false, 0, param1, param0, !param2 ? 1 : 22);
    }

    final jh a(byte param0, Runnable param1, int param2) {
        if (param0 > -47) {
          return (jh) null;
        }
        return this.a(false, 0, param1, param2, 2);
    }

    final jh a(java.net.URL param0, int param1) {
        if (param1 < 119) {
          this.field_m = (ri) null;
        }
        return this.a(false, 0, param0, 0, 4);
    }

    final jh a(int param0, Class param1, String param2) {
        if (param0 != -8024) {
          Class var5 = (Class) null;
          this.a((String) null, (Class[]) null, (Class) null, -89);
        }
        return this.a(false, 0, new Object[]{param1, param2}, 0, 9);
    }

    final jh a(String param0, Class[] param1, Class param2, int param3) {
        if (param3 != 3617) {
          field_k = (String) null;
        }
        return this.a(false, 0, new Object[]{param2, param0, param1}, 0, 8);
    }

    final jh a(String param0, int param1, byte param2) {
        if (param2 != -20) {
          return (jh) null;
        }
        return this.a(param1, param0, false, (byte) 85);
    }

    final jh a(int param0, java.awt.Frame param1) {
        jh discarded$0 = null;
        if (param0 != 7) {
          String var4 = (String) null;
          discarded$0 = this.a(69, (String) null, true, (byte) 10);
        }
        return this.a(false, 0, param1, 0, 7);
    }

    final boolean a(int param0) {
        if (param0 != 169978736) {
          return false;
        }
        if (!this.field_s) {
          return false;
        }
        if (!this.field_j) {
          return this.field_t != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    final void b(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          java.net.URL var4 = null;
          var2 = this;
          synchronized (var2) {
            this.field_g = true;
            this.notifyAll();
          }
          try {
            if (param0 != -3) {
              var4 = (java.net.URL) null;
              this.a((java.net.URL) null, 108);
            }
            this.field_e.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_m) {
            try {
              this.field_m.a(-1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_i) {
            try {
              this.field_i.a(-1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_f != null) {
            for (var2_int = 0; var2_int < this.field_f.length; var2_int++) {
              if (this.field_f[var2_int] != null) {
                try {
                  this.field_f[var2_int].a(param0 ^ 2);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_c != null) {
            try {
              this.field_c.a(param0 + 2);
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

    private final jh a(boolean param0, int param1, Object param2, int param3, int param4) {
        jh var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new jh();
        var6.field_d = param3;
        var6.field_g = param2;
        var6.field_f = param1;
        var6.field_b = param4;
        if (param0) {
          field_d = 103L;
        }
        var7 = this;
        synchronized (var7) {
          if (null == this.field_r) {
            this.field_o = var6;
            this.field_r = var6;
          } else {
            this.field_r.field_c = var6;
            this.field_r = var6;
          }
          this.notify();
        }
        return var6;
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ba var7 = null;
        this.field_m = null;
        this.field_i = null;
        this.field_j = false;
        this.field_r = null;
        this.field_s = false;
        this.field_g = false;
        this.field_c = null;
        this.field_o = null;
        field_b = "1.1";
        stackIn_3_1 = (param3);
        this.field_s = stackIn_3_1;
        field_v = param1;
        field_p = "Unknown";
        field_w = param0;
        try {
          field_p = System.getProperty("java.vendor");
          field_b = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_p.toLowerCase().indexOf("microsoft") != -1) {
          this.field_j = true;
        }
        try {
          field_l = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_l = "Unknown";
        }
        field_k = field_l.toLowerCase();
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
          field_n = System.getProperty("user.home");
          if (null != field_n) {
            field_n = field_n + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_n) {
          field_n = "~/";
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
            field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        fd.a(field_v, field_w, (byte) 125);
        if (this.field_s) {
          this.field_c = new ri(fd.a("random.dat", field_w, (String) null, -93), "rw", 25L);
          this.field_m = new ri(fd.a("main_file_cache.dat2", (byte) 115), "rw", 314572800L);
          this.field_i = new ri(fd.a("main_file_cache.idx255", (byte) 115), "rw", 1048576L);
          this.field_f = new ri[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_f[var5_int] = new ri(fd.a("main_file_cache.idx" + var5_int, (byte) 115), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("gl").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_j) {
              var7 = new ba();
              this.field_u = var7;
            } else {
              this.field_t = Class.forName("bj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_j) {
              this.field_h = Class.forName("ak").newInstance();
            } else {
              this.field_x = new al();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_g = false;
        this.field_e = new Thread((Runnable) (this));
        this.field_e.setPriority(10);
        this.field_e.setDaemon(true);
        this.field_e.start();
    }

    static {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
