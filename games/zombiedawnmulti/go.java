/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class go implements Runnable {
    private Object field_b;
    mc field_k;
    mc field_i;
    private Object field_x;
    java.awt.EventQueue field_j;
    private di field_f;
    static java.lang.reflect.Method field_h;
    private tc field_m;
    private static String field_o;
    mc[] field_t;
    private static String field_c;
    private boolean field_w;
    static String field_l;
    static String field_q;
    private boolean field_v;
    private di field_u;
    mc field_s;
    boolean field_d;
    private cl field_p;
    private static volatile long field_g;
    private Thread field_n;
    static String field_r;
    private static int field_e;
    private static String field_a;

    final di a(int param0, Runnable param1, int param2) {
        if (param0 < 19) {
          this.field_v = true;
        }
        return this.a(2, param1, true, param2, 0);
    }

    final di a(Class[] param0, boolean param1, Class param2, String param3) {
        if (param1) {
          return (di) null;
        }
        return this.a(8, new Object[]{param2, param3, param0}, true, 0, 0);
    }

    final void b(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          java.awt.Frame var4 = null;
          if (param0 <= 123) {
            var4 = (java.awt.Frame) null;
            this.a((java.awt.Frame) null, true);
          }
          var2 = this;
          synchronized (var2) {
            this.field_w = true;
            this.notifyAll();
          }
          try {
            this.field_n.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_i) {
            try {
              this.field_i.b((byte) 38);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.b((byte) 38);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_t) {
            for (var2_int = 0; var2_int < this.field_t.length; var2_int++) {
              if (this.field_t[var2_int] != null) {
                try {
                  this.field_t[var2_int].b((byte) 38);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_s) {
            try {
              this.field_s.b((byte) 38);
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

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_88_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          mc var3_ref_mc = null;
          en var3_ref_en = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          di var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.Frame var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.Component var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_w) {
                if (this.field_f != null) {
                  var8 = this.field_f;
                  this.field_f = this.field_f.field_e;
                  if (null == this.field_f) {
                    this.field_u = null;
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
                var2_int = var8.field_g;
                switch (var2_int) {
                  case 1:
                    if (field_g > bl.a((byte) 109)) {
                      throw new IOException();
                    }
                    var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_a)), var8.field_c);
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_a);
                    if (this.field_d &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_d = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_a);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_d) {
                      throw go.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (bl.a((byte) 85) < field_g) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.field_c >> 24) + "." + ((var8.field_c & 16770086) >> 16) + "." + ((65396 & var8.field_c) >> 8) + "." + (255 & var8.field_c);
                        var8.field_d = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 7:
                        if (!this.field_v) {
                          Class.forName("te").getMethod("exit", new Class[]{}).invoke(this.field_b, new Object[]{});
                        } else {
                          this.field_m.a((java.awt.Frame) (var8.field_a), (byte) 3);
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_d &&
                          var2_int == 14) {
                          var3 = var8.field_c;
                          var4 = var8.field_b;
                          if (this.field_v) {
                            this.field_p.a(var4, -12, var3);
                          } else {
                            Class.forName("to").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{new Integer(var3), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_d &&
                          var2_int == 15) {
                          stackIn_88_0 = (var8.field_c == 0) ? 0 : 1;
                          var3 = stackIn_88_0;
                          var14 = (java.awt.Component) (var8.field_a);
                          if (this.field_v) {
                            this.field_p.a(var14, var3 != 0, -1101);
                          } else {
                            Class.forName("to").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_x, new Object[]{var14, new Boolean(var3 != 0)});
                          }
                          break;
                        }
                        if (!this.field_v &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.field_a);
                          Class.forName("to").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_x, new Object[]{var12[0], var12[1], new Integer(var8.field_c), new Integer(var8.field_b), var12[2]});
                        } else {
                          if (16 != var2_int) {
                            throw go.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_l.startsWith("win")) {
                              throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_a);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var13.length() > var5; var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_d = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref_Exception;
                            throw go.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_mc = go.a("", (String) (var8.field_a), true, field_e);
                        var8.field_d = var3_ref_mc;
                        break;
                      case 12:
                        var3_ref_mc = go.a(field_c, (String) (var8.field_a), true, field_e);
                        var8.field_d = var3_ref_mc;
                        break;
                      case 6:
                        var11 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_d = var11;
                        var11.setResizable(false);
                        if (this.field_v) {
                          this.field_m.a(65535 & var8.field_b, var8.field_c >>> 16, var8.field_c & 65535, var11, 0, var8.field_b >> 16);
                        } else {
                          Class.forName("te").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{var11, new Integer(var8.field_c >>> 16), new Integer(65535 & var8.field_c), new Integer(var8.field_b >> 16), new Integer(var8.field_b & 65535)});
                        }
                        break;
                      case 5:
                        if (!this.field_v) {
                          var8.field_d = Class.forName("te").getMethod("listmodes", new Class[]{}).invoke(this.field_b, new Object[]{});
                        } else {
                          var8.field_d = this.field_m.a(81);
                        }
                        break;
                      case 21:
                        if (bl.a((byte) 53) < field_g) {
                          throw new IOException();
                        }
                        var8.field_d = java.net.InetAddress.getByName((String) (var8.field_a)).getAddress();
                        break;
                    }
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_a);
                    if (this.field_d &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (field_g > bl.a((byte) 119)) {
                      throw new IOException();
                    }
                    var8.field_d = new DataInputStream(((java.net.URL) (var8.field_a)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_a));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_c);
                    var8.field_d = var9;
                    break;
                  case 22:
                    if (field_g > bl.a((byte) 92)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (en) null;
                      var8.field_d = wj.a((byte) 3, var8.field_c, (String) (var8.field_a)).b(4646);
                    } catch (en decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_en = (en) (Object) decompiledCaughtException;
                      var8.field_d = var3_ref_en.getMessage();
                      throw var3_ref_en;
                    }
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

    final di a(boolean param0, java.awt.Component param1, int param2) {
        if (param2 != -14697) {
          String var5 = (String) null;
          this.a((String) null, -2, (byte) -60);
        }
        return this.a(15, param1, true, param0 ? 1 : 0, 0);
    }

    private final di a(int param0, Object param1, boolean param2, int param3, int param4) {
        di var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new di();
        if (!param2) {
          field_r = (String) null;
        }
        var6.field_c = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          if (this.field_u != null) {
            this.field_u.field_e = var6;
            this.field_u = var6;
          } else {
            this.field_f = var6;
            this.field_u = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final static mc a(String param0, String param1, boolean param2, int param3) {
        try {
          int var6 = 0;
          mc stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          mc var8 = null;
          Exception var8_ref = null;
          if (param3 != 33) {
            if (param3 == 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new mc(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param2) {
            return null;
          }
          field_g = -28L;
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final di a(byte param0, String param1, Class param2) {
        int var4 = 81 / ((param0 - 7) / 59);
        return this.a(9, new Object[]{param2, param1}, true, 0, 0);
    }

    final di a(String param0, int param1, byte param2) {
        if (param2 != -120) {
          this.field_p = (cl) null;
        }
        return this.a((byte) -121, param0, param1, false);
    }

    final boolean a(int param0) {
        if (!this.field_d) {
          return false;
        }
        if (param0 >= -35) {
          this.field_p = (cl) null;
        }
        if (this.field_v) {
          return null != this.field_m ? true : false;
        }
        return null != this.field_b ? true : false;
    }

    final di c(int param0) {
        if (param0 != 0) {
          this.run();
        }
        return this.a(5, (Object) null, true, 0, 0);
    }

    final di a(java.awt.Frame param0, boolean param1) {
        if (!param1) {
          String var4 = (String) null;
          this.a((Class[]) null, true, (Class) null, (String) null);
        }
        return this.a(7, param0, true, 0, 0);
    }

    private final di a(byte param0, String param1, int param2, boolean param3) {
        int var5 = -62 / ((param0 + 53) / 58);
        return this.a(!param3 ? 1 : 22, param1, true, param2, 0);
    }

    final di a(byte param0, java.net.URL param1) {
        if (param0 != -12) {
          field_r = (String) null;
        }
        return this.a(4, param1, true, 0, 0);
    }

    final di a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 66 % ((param1 - 73) / 53);
        return this.a(6, (Object) null, true, param4 + (param0 << 16), (param3 << 16) + param2);
    }

    go(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        tc var7 = null;
        this.field_i = null;
        this.field_f = null;
        this.field_w = false;
        this.field_k = null;
        this.field_s = null;
        this.field_u = null;
        this.field_d = false;
        this.field_v = false;
        field_c = param1;
        field_e = param0;
        field_q = "1.1";
        stackIn_3_1 = (param3);
        this.field_d = stackIn_3_1;
        field_r = "Unknown";
        try {
          field_r = System.getProperty("java.vendor");
          field_q = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_r.toLowerCase().indexOf("microsoft") != -1) {
          this.field_v = true;
        }
        try {
          field_a = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_a = "Unknown";
        }
        field_l = field_a.toLowerCase();
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
          if (null != field_o) {
            field_o = field_o + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o == null) {
          field_o = "~/";
        }
        try {
          this.field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_v) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        nd.a(field_c, field_e, -7682);
        if (this.field_d) {
          this.field_s = new mc(nd.a("random.dat", -25157, (String) null, field_e), "rw", 25L);
          this.field_i = new mc(nd.a("main_file_cache.dat2", 0), "rw", 314572800L);
          this.field_k = new mc(nd.a("main_file_cache.idx255", 0), "rw", 1048576L);
          this.field_t = new mc[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_t[var5_int] = new mc(nd.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
          }
          if (this.field_v) {
            try {
              Class.forName("rd").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_v) {
              var7 = new tc();
              this.field_m = var7;
            } else {
              this.field_b = Class.forName("te").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_v) {
              this.field_x = Class.forName("to").newInstance();
            } else {
              this.field_p = new cl();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_w = false;
        this.field_n = new Thread((Runnable) (this));
        this.field_n.setPriority(10);
        this.field_n.setDaemon(true);
        this.field_n.start();
    }

    static {
        field_g = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
