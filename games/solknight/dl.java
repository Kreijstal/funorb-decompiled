/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    static String field_a;
    sg field_b;
    sg field_c;
    private vj field_u;
    private nj field_m;
    private static String field_i;
    private boolean field_l;
    private static int field_o;
    private static String field_n;
    static String field_t;
    java.awt.EventQueue field_d;
    boolean field_h;
    private static volatile long field_p;
    sg[] field_v;
    private static String field_f;
    private Object field_r;
    static String field_x;
    private boolean field_k;
    private nj field_w;
    private tb field_g;
    static java.lang.reflect.Method field_e;
    private Object field_j;
    sg field_s;
    private Thread field_q;

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
            this.field_l = true;
            if (param0 != 29) {
              this.field_d = (java.awt.EventQueue) null;
            }
            this.notifyAll();
          }
          try {
            this.field_q.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_c) {
            try {
              this.field_c.a((byte) -5);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_s != null) {
            try {
              this.field_s.a((byte) -123);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2_int = 0; var2_int < this.field_v.length; var2_int++) {
              if (null != this.field_v[var2_int]) {
                try {
                  this.field_v[var2_int].a((byte) 53);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_b) {
            try {
              this.field_b.a((byte) -124);
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

    private final nj a(int param0, boolean param1, String param2, int param3) {
        int var5 = 22 % ((0 - param0) / 52);
        return this.a(0, param2, param3, !param1 ? 1 : 22, -19);
    }

    final nj a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 >= 0) {
          field_o = -61;
        }
        return this.a((param2 << 16) + param4, (Object) null, param1 + (param0 << 16), 6, -19);
    }

    final nj a(java.net.URL param0, byte param1) {
        if (param1 != 68) {
          return (nj) null;
        }
        return this.a(0, param0, 0, 4, -19);
    }

    final nj a(byte param0, String param1, Class[] param2, Class param3) {
        if (param0 <= 93) {
          return (nj) null;
        }
        return this.a(0, new Object[]{param3, param1, param2}, 0, 8, -19);
    }

    final nj a(int param0) {
        if (param0 != 7721) {
          this.a(65);
        }
        return this.a(0, (Object) null, 0, 5, param0 - 7740);
    }

    private final nj a(int param0, Object param1, int param2, int param3, int param4) {
        nj var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new nj();
        var6.field_a = param3;
        var6.field_d = param2;
        var6.field_f = param1;
        if (param4 != -19) {
          return (nj) null;
        }
        var6.field_b = param0;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_m) {
            this.field_m.field_g = var6;
            this.field_m = var6;
          } else {
            this.field_w = var6;
            this.field_m = var6;
          }
          this.notify();
        }
        return var6;
    }

    final nj a(String param0, int param1, int param2) {
        if (param2 != -28148) {
          return (nj) null;
        }
        return this.a(109, false, param0, param1);
    }

    final nj a(int param0, java.awt.Frame param1) {
        if (param0 <= 12) {
          return (nj) null;
        }
        return this.a(0, param1, 0, 7, -19);
    }

    private final static sg a(int param0, String param1, int param2, String param3) {
        try {
          int var6 = 0;
          sg stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          sg var8 = null;
          Exception var8_ref = null;
          if (param2 != 33) {
            if (34 != param2) {
              var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 <= 34) {
            return (sg) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new sg(new File(var7, var4), "rw", 10000L);
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

    final nj a(int param0, int param1, Runnable param2) {
        if (param1 > -2) {
          return (nj) null;
        }
        return this.a(0, param2, param0, 2, -19);
    }

    final nj a(int param0, Class param1, String param2) {
        if (param0 != 0) {
          this.b((byte) -96);
        }
        return this.a(0, new Object[]{param1, param2}, 0, 9, -19);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_73_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          sg var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          cb var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          nj var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          java.awt.Component var15 = null;
          Object[] var16 = null;
          Object var17 = null;
          String var17_ref = null;
          java.awt.datatransfer.Clipboard var18 = null;
          var17 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_l) {
                if (this.field_w != null) {
                  var8 = this.field_w;
                  this.field_w = this.field_w.field_g;
                  if (this.field_w == null) {
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
                var2_int = var8.field_a;
                switch (var2_int) {
                  case 1:
                    if (field_p > je.a(1)) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_f)), var8.field_d);
                    break;
                  case 18:
                    var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var18.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_h) {
                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (!this.field_k) {
                          var8.field_e = Class.forName("bd").getMethod("listmodes", new Class[]{}).invoke(this.field_j, new Object[]{});
                        } else {
                          var8.field_e = this.field_u.a((byte) -63);
                        }
                        break;
                      case 7:
                        if (this.field_k) {
                          this.field_u.a(-16, (java.awt.Frame) (var8.field_f));
                        } else {
                          Class.forName("bd").getMethod("exit", new Class[]{}).invoke(this.field_j, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = dl.a(92, field_i, field_o, (String) (var8.field_f));
                        var8.field_e = var3_ref;
                        break;
                      case 13:
                        var3_ref = dl.a(93, "", field_o, (String) (var8.field_f));
                        var8.field_e = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_h &&
                          var2_int == 14) {
                          var3_int = var8.field_d;
                          var4_int = var8.field_b;
                          if (this.field_k) {
                            this.field_g.a(var3_int, var4_int, 0);
                          } else {
                            Class.forName("cc").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_r, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.field_h &&
                          15 == var2_int) {
                          stackIn_73_0 = (0 == var8.field_d) ? 0 : 1;
                          var3_int = stackIn_73_0;
                          var15 = (java.awt.Component) (var8.field_f);
                          if (this.field_k) {
                            this.field_g.a(var3_int != 0, var15, (byte) -55);
                          } else {
                            Class.forName("cc").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_r, new Object[]{var15, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_k &&
                          var2_int == 17) {
                          var16 = (Object[]) (var8.field_f);
                          Class.forName("cc").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_r, new Object[]{var16[0], var16[1], new Integer(var8.field_d), new Integer(var8.field_b), var16[2]});
                        } else {
                          if (var2_int != 16) {
                            throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_t.startsWith("win")) {
                              throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var17_ref = (String) (var8.field_f);
                            if (!var17_ref.startsWith("http://") &&
                              !var17_ref.startsWith("https://")) {
                              throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var17_ref.length() > var5; var5++) {
                              if (-1 == var4.indexOf((int) var17_ref.charAt(var5))) {
                                throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var17_ref + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref2;
                            throw dl.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var14;
                        var14.setResizable(false);
                        if (this.field_k) {
                          this.field_u.a(65535 & var8.field_b, var14, var8.field_d >>> 16, -32, var8.field_b >> 16, 65535 & var8.field_d);
                        } else {
                          Class.forName("bd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{var14, new Integer(var8.field_d >>> 16), new Integer(var8.field_d & 65535), new Integer(var8.field_b >> 16), new Integer(65535 & var8.field_b)});
                        }
                        break;
                      case 21:
                        if (je.a(1) < field_p) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_f)).getAddress();
                        break;
                      case 3:
                        if (field_p > je.a(1)) {
                          throw new IOException();
                        }
                        var13 = (var8.field_d >> 24 & 255) + "." + ((16723280 & var8.field_d) >> 16) + "." + ((var8.field_d & 65382) >> 8) + "." + (var8.field_d & 255);
                        var8.field_e = java.net.InetAddress.getByName(var13).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_f);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 9:
                    var11 = (Object[]) (var8.field_f);
                    if (this.field_h &&
                      ((Class) (var11[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_f);
                    if (this.field_h &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (je.a(1) < field_p) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_f)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_f));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_d);
                    var8.field_e = var9;
                    break;
                  case 22:
                    if (je.a(1) < field_p) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (cb) null;
                      var8.field_e = rg.a((String) (var8.field_f), var8.field_d, 2525).a((byte) -93);
                    } catch (cb decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (cb) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
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

    final boolean b(byte param0) {
        if (!this.field_h) {
          return false;
        }
        int var2 = -56 % ((-65 - param0) / 48);
        if (!this.field_k) {
          return this.field_j != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        vj var6 = null;
        this.field_c = null;
        this.field_b = null;
        this.field_m = null;
        this.field_k = false;
        this.field_s = null;
        this.field_w = null;
        this.field_h = false;
        this.field_l = false;
        stackIn_3_1 = (param3);
        this.field_h = stackIn_3_1;
        field_x = "1.1";
        field_a = "Unknown";
        field_i = param1;
        field_o = param0;
        try {
          field_a = System.getProperty("java.vendor");
          field_x = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_a.toLowerCase().indexOf("microsoft") != -1) {
          this.field_k = true;
        }
        try {
          field_f = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_f = "Unknown";
        }
        field_t = field_f.toLowerCase();
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
          this.field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_k) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        nd.a(field_i, field_o, (byte) -115);
        if (this.field_h) {
          this.field_b = new sg(nd.a((String) null, "random.dat", field_o, (byte) -75), "rw", 25L);
          this.field_c = new sg(nd.a("main_file_cache.dat2", -19154), "rw", 314572800L);
          this.field_s = new sg(nd.a("main_file_cache.idx255", -19154), "rw", 1048576L);
          this.field_v = new sg[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_v[var5_int] = new sg(nd.a("main_file_cache.idx" + var5_int, -19154), "rw", 1048576L);
          }
          if (this.field_k) {
            try {
              Class.forName("tf").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_k) {
              var6 = new vj();
              this.field_u = var6;
            } else {
              this.field_j = Class.forName("bd").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_k) {
              this.field_r = Class.forName("cc").newInstance();
            } else {
              this.field_g = new tb();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_l = false;
        this.field_q = new Thread((Runnable) (this));
        this.field_q.setPriority(10);
        this.field_q.setDaemon(true);
        this.field_q.start();
    }

    static {
        field_p = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
