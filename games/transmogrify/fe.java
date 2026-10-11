/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fe implements Runnable {
    private Thread field_l;
    static String field_c;
    static String field_k;
    static java.lang.reflect.Method field_x;
    private boolean field_r;
    private static String field_u;
    java.awt.EventQueue field_m;
    private ib field_p;
    private t field_o;
    private Object field_t;
    private static int field_g;
    private static String field_n;
    private ke field_q;
    private static volatile long field_a;
    boolean field_e;
    static String field_w;
    di field_h;
    di field_v;
    di field_b;
    di[] field_s;
    private static String field_f;
    private Object field_d;
    private ib field_j;
    private boolean field_i;

    final boolean b(int param0) {
        if (!this.field_e) {
          return false;
        }
        if (param0 != 5) {
          return false;
        }
        if (this.field_i) {
          return null != this.field_q ? true : false;
        }
        return null != this.field_d ? true : false;
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
            this.field_r = true;
            this.notifyAll();
          }
          try {
            if (param0 > -15) {
              this.a(-108, -85, -43, -56, -118);
            }
            this.field_l.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_b != null) {
            try {
              this.field_b.a(false);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_h) {
            try {
              this.field_h.a(false);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_s != null) {
            for (var2_int = 0; var2_int < this.field_s.length; var2_int++) {
              if (this.field_s[var2_int] != null) {
                try {
                  this.field_s[var2_int].a(false);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_v != null) {
            try {
              this.field_v.a(false);
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

    final ib a(Class param0, byte param1, Class[] param2, String param3) {
        if (param1 <= 51) {
          java.net.URL var6 = (java.net.URL) null;
          this.a(-46, (java.net.URL) null);
        }
        return this.a(8, 0, (byte) -75, 0, new Object[]{param0, param3, param2});
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
          jd var3_ref = null;
          di var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          ib var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          java.awt.Frame var13 = null;
          java.awt.Component var14 = null;
          String var15 = null;
          Object[] var16 = null;
          String var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_r) {
                if (null != this.field_p) {
                  var8 = this.field_p;
                  this.field_p = this.field_p.field_a;
                  if (null == this.field_p) {
                    this.field_j = null;
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
                  case 22:
                    if (lk.a(0) < field_a) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (jd) null;
                      var8.field_g = li.a(false, (String) (var8.field_f), var8.field_b).a(-70);
                    } catch (jd decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (jd) (Object) decompiledCaughtException;
                      var8.field_g = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 4:
                    if (lk.a(0) < field_a) {
                      throw new IOException();
                    }
                    var8.field_g = new DataInputStream(((java.net.URL) (var8.field_f)).openStream());
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_f);
                    if (this.field_e &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 16:
                  default:
                    if (!this.field_e) {
                      throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (lk.a(0) < field_a) {
                          throw new IOException();
                        }
                        var17 = (255 & var8.field_b >> 24) + "." + (255 & var8.field_b >> 16) + "." + (var8.field_b >> 8 & 255) + "." + (255 & var8.field_b);
                        var8.field_g = java.net.InetAddress.getByName(var17).getHostName();
                        break;
                      case 21:
                        if (lk.a(0) < field_a) {
                          throw new IOException();
                        }
                        var8.field_g = java.net.InetAddress.getByName((String) (var8.field_f)).getAddress();
                        break;
                      case 5:
                        if (this.field_i) {
                          var8.field_g = this.field_q.a((byte) 106);
                        } else {
                          var8.field_g = Class.forName("cb").getMethod("listmodes", new Class[]{}).invoke(this.field_d, new Object[]{});
                        }
                        break;
                      case 13:
                        var3_ref2 = fe.a("", (String) (var8.field_f), field_g, -7);
                        var8.field_g = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_e &&
                          var2_int == 14) {
                          var3_int = var8.field_b;
                          var4 = var8.field_e;
                          if (!this.field_i) {
                            Class.forName("na").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_o.a(var3_int, 101024, var4);
                          }
                          break;
                        }
                        if (this.field_e &&
                          15 == var2_int) {
                          stackIn_58_0 = (var8.field_b == 0) ? 0 : 1;
                          var3_int = stackIn_58_0;
                          var14 = (java.awt.Component) (var8.field_f);
                          if (!this.field_i) {
                            Class.forName("na").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_t, new Object[]{var14, new Boolean(var3_int != 0)});
                          } else {
                            this.field_o.a(var3_int != 0, 0, var14);
                          }
                          break;
                        }
                        if (!this.field_i &&
                          var2_int == 17) {
                          var16 = (Object[]) (var8.field_f);
                          Class.forName("na").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_t, new Object[]{var16[0], var16[1], new Integer(var8.field_b), new Integer(var8.field_e), var16[2]});
                        } else {
                          if (var2_int != 16) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_k.startsWith("win")) {
                              throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var15 = (String) (var8.field_f);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var15.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var15.charAt(var5)) == -1) {
                                throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_g = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref3;
                            throw fe.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 12:
                        var3_ref2 = fe.a(field_u, (String) (var8.field_f), field_g, -7);
                        var8.field_g = var3_ref2;
                        break;
                      case 7:
                        if (this.field_i) {
                          this.field_q.a(-16986, (java.awt.Frame) (var8.field_f));
                        } else {
                          Class.forName("cb").getMethod("exit", new Class[]{}).invoke(this.field_d, new Object[]{});
                        }
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_g = var13;
                        var13.setResizable(false);
                        if (this.field_i) {
                          this.field_q.a(70, var8.field_e >> 16, var8.field_e & 65535, var13, 65535 & var8.field_b, var8.field_b >>> 16);
                        } else {
                          Class.forName("cb").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{var13, new Integer(var8.field_b >>> 16), new Integer(var8.field_b & 65535), new Integer(var8.field_e >> 16), new Integer(65535 & var8.field_e)});
                        }
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_f);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_g = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_f);
                    if (this.field_e &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_f));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_b);
                    var8.field_g = var9;
                    break;
                  case 1:
                    if (lk.a(0) < field_a) {
                      throw new IOException();
                    }
                    var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_f)), var8.field_b);
                    break;
                }
              }
              var8.field_c = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_c = 2;
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

    final ib a(java.awt.Frame param0, int param1) {
        if (param1 < 44) {
          Class var4 = (Class) null;
          this.a(57, (String) null, (Class) null);
        }
        return this.a(7, 0, (byte) -92, 0, param0);
    }

    final ib a(int param0, java.net.URL param1) {
        if (param0 != -21377) {
          field_a = 73L;
        }
        return this.a(4, 0, (byte) -110, 0, param1);
    }

    final ib a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -7573) {
          this.a(127);
        }
        return this.a(6, param4 + (param1 << 16), (byte) -65, (param3 << 16) + param0, (Object) null);
    }

    final ib a(Runnable param0, int param1, int param2) {
        if (param2 != 65535) {
          return (ib) null;
        }
        return this.a(2, 0, (byte) -72, param1, param0);
    }

    final ib a(int param0) {
        ib discarded$0 = null;
        if (param0 != -1) {
          String var3 = (String) null;
          discarded$0 = this.a(115, true, 98, (String) null);
        }
        return this.a(5, 0, (byte) -79, 0, (Object) null);
    }

    private final static di a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          di stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          di var8 = null;
          Exception var8_ref = null;
          if (param2 == 33) {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          } else {
            if (param2 == 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            }
          }
          if (param3 != -7) {
            return (di) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new di(new File(var7, var4), "rw", 10000L);
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

    final ib a(int param0, String param1, Class param2) {
        if (param0 >= -107) {
          return (ib) null;
        }
        return this.a(9, 0, (byte) -62, 0, new Object[]{param2, param1});
    }

    private final ib a(int param0, int param1, byte param2, int param3, Object param4) {
        ib var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param2 > -48) {
          this.a(-23);
        }
        var6 = new ib();
        var6.field_f = param4;
        var6.field_e = param1;
        var6.field_d = param0;
        var6.field_b = param3;
        var7 = this;
        synchronized (var7) {
          if (null == this.field_j) {
            this.field_p = var6;
            this.field_j = var6;
          } else {
            this.field_j.field_a = var6;
            this.field_j = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final ib a(int param0, boolean param1, int param2, String param3) {
        if (param2 != 18832) {
          field_f = (String) null;
        }
        return this.a(param1 ? 22 : 1, 0, (byte) -118, param0, param3);
    }

    final ib a(int param0, String param1, int param2) {
        if (param0 < 9) {
          Class var5 = (Class) null;
          this.a(-86, (String) null, (Class) null);
        }
        return this.a(param2, false, 18832, param1);
    }

    fe(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ke var7 = null;
        this.field_r = false;
        this.field_p = null;
        this.field_e = false;
        this.field_v = null;
        this.field_j = null;
        this.field_h = null;
        this.field_i = false;
        this.field_b = null;
        field_g = param0;
        stackIn_3_1 = (param3);
        this.field_e = stackIn_3_1;
        field_c = "1.1";
        field_w = "Unknown";
        field_u = param1;
        try {
          field_w = System.getProperty("java.vendor");
          field_c = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_w.toLowerCase().indexOf("microsoft")) {
          this.field_i = true;
        }
        try {
          field_f = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_f = "Unknown";
        }
        field_k = field_f.toLowerCase();
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
          if (field_n != null) {
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
          this.field_m = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_i) {
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
        ed.a((byte) -4, field_u, field_g);
        if (this.field_e) {
          this.field_v = new di(ed.a(83, field_g, "random.dat", (String) null), "rw", 25L);
          this.field_b = new di(ed.a("main_file_cache.dat2", 32718), "rw", 314572800L);
          this.field_h = new di(ed.a("main_file_cache.idx255", 32718), "rw", 1048576L);
          this.field_s = new di[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_s[var5_int] = new di(ed.a("main_file_cache.idx" + var5_int, 32718), "rw", 1048576L);
          }
          if (this.field_i) {
            try {
              Class.forName("pk").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_i) {
              var7 = new ke();
              this.field_q = var7;
            } else {
              this.field_d = Class.forName("cb").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_i) {
              this.field_o = new t();
            } else {
              this.field_t = Class.forName("na").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_r = false;
        this.field_l = new Thread((Runnable) (this));
        this.field_l.setPriority(10);
        this.field_l.setDaemon(true);
        this.field_l.start();
    }

    static {
        field_a = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
