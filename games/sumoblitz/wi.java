/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wi implements Runnable {
    private static int field_j;
    java.awt.EventQueue field_g;
    private static volatile long field_c;
    static String field_o;
    sr field_l;
    static String field_u;
    private ep field_w;
    private static String field_s;
    private static String field_p;
    static String field_q;
    private static String field_h;
    private boolean field_m;
    private Object field_r;
    static java.lang.reflect.Method field_e;
    sr[] field_i;
    boolean field_f;
    boolean field_t;
    private jr field_k;
    sr field_n;
    private jr field_x;
    private Thread field_a;
    private Object field_v;
    sr field_d;
    private bm field_b;

    private final static sr a(String param0, boolean param1, String param2, int param3) {
        try {
          int var6 = 0;
          sr stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          sr var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (!param1) {
            var9 = (String) null;
            wi.a((String) null, true, (String) null, 127);
          }
          if (param3 != 33) {
            if (34 == param3) {
              var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new sr(new File(var7, var4), "rw", 10000L);
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

    private final jr a(Object param0, int param1, int param2, boolean param3, int param4) {
        jr var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new jr();
        var6.field_e = param1;
        var6.field_b = param4;
        var6.field_a = param0;
        var6.field_g = param2;
        var7 = this;
        synchronized (var7) {
          if (param3) {
            this.field_d = (sr) null;
          }
          if (this.field_x == null) {
            this.field_k = var6;
            this.field_x = var6;
          } else {
            this.field_x.field_f = var6;
            this.field_x = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final jr a(int param0, String param1, boolean param2, boolean param3) {
        if (!param2) {
          this.field_b = (bm) null;
        }
        return this.a(param1, 0, param0, false, param3 ? 22 : 1);
    }

    final void a(boolean param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          Runnable var4 = null;
          var2 = this;
          synchronized (var2) {
            this.field_m = true;
            this.notifyAll();
          }
          if (param0) {
            var4 = (Runnable) null;
            this.a(true, (Runnable) null, 68);
          }
          try {
            this.field_a.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_l != null) {
            try {
              this.field_l.b(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_d) {
            try {
              this.field_d.b(0);
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
          if (this.field_n != null) {
            try {
              this.field_n.b(0);
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
          int stackIn_74_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          sr var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          hh var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          jr var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          java.awt.Component var14 = null;
          Object[] var15 = null;
          Object var16 = null;
          String var16_ref = null;
          java.awt.Frame var17 = null;
          java.awt.datatransfer.Clipboard var18 = null;
          var16 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_m) {
                if (null != this.field_k) {
                  var8 = this.field_k;
                  this.field_k = this.field_k.field_f;
                  if (this.field_k == null) {
                    this.field_x = null;
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
                  case 1:
                    if (wq.a(-24) < field_c) {
                      throw new IOException();
                    }
                    var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_a)), var8.field_g);
                    break;
                  case 4:
                    if (field_c > wq.a(-94)) {
                      throw new IOException();
                    }
                    var8.field_d = new DataInputStream(((java.net.URL) (var8.field_a)).openStream());
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_a);
                    var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var18.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_f) {
                      throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 6:
                        var17 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_d = var17;
                        var17.setResizable(false);
                        if (this.field_t) {
                          this.field_w.a(var8.field_g & 65535, (byte) -123, var8.field_g >>> 16, var8.field_e & 65535, var8.field_e >> 16, var17);
                        } else {
                          Class.forName("cu").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_r, new Object[]{var17, new Integer(var8.field_g >>> 16), new Integer(var8.field_g & 65535), new Integer(var8.field_e >> 16), new Integer(65535 & var8.field_e)});
                        }
                        break;
                      case 13:
                        var3_ref = wi.a("", true, (String) (var8.field_a), field_j);
                        var8.field_d = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_f &&
                          14 == var2_int) {
                          var3_int = var8.field_g;
                          var4 = var8.field_e;
                          if (!this.field_t) {
                            Class.forName("cg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_b.a(var4, var3_int, (byte) 84);
                          }
                          break;
                        }
                        if (this.field_f &&
                          var2_int == 15) {
                          stackIn_74_0 = (var8.field_g == 0) ? 0 : 1;
                          var3_int = stackIn_74_0;
                          var14 = (java.awt.Component) (var8.field_a);
                          if (this.field_t) {
                            this.field_b.a(false, var3_int != 0, var14);
                          } else {
                            Class.forName("cg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_v, new Object[]{var14, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_t &&
                          var2_int == 17) {
                          var15 = (Object[]) (var8.field_a);
                          Class.forName("cg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_v, new Object[]{var15[0], var15[1], new Integer(var8.field_g), new Integer(var8.field_e), var15[2]});
                        } else {
                          if (16 != var2_int) {
                            throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_o.startsWith("win")) {
                              throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var16_ref = (String) (var8.field_a);
                            if (!var16_ref.startsWith("http://") &&
                              !var16_ref.startsWith("https://")) {
                              throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var16_ref.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var16_ref.charAt(var5)) == -1) {
                                throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16_ref + "\"");
                            var8.field_d = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref2;
                            throw wi.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 12:
                        var3_ref = wi.a(field_p, true, (String) (var8.field_a), field_j);
                        var8.field_d = var3_ref;
                        break;
                      case 7:
                        if (!this.field_t) {
                          Class.forName("cu").getMethod("exit", new Class[]{}).invoke(this.field_r, new Object[]{});
                        } else {
                          this.field_w.a((java.awt.Frame) (var8.field_a), 8);
                        }
                        break;
                      case 5:
                        if (this.field_t) {
                          var8.field_d = this.field_w.a((byte) -128);
                        } else {
                          var8.field_d = Class.forName("cu").getMethod("listmodes", new Class[]{}).invoke(this.field_r, new Object[]{});
                        }
                        break;
                      case 21:
                        if (wq.a(-18) < field_c) {
                          throw new IOException();
                        }
                        var8.field_d = java.net.InetAddress.getByName((String) (var8.field_a)).getAddress();
                        break;
                      case 3:
                        if (field_c > wq.a(-106)) {
                          throw new IOException();
                        }
                        var13 = (var8.field_g >> 24 & 255) + "." + (var8.field_g >> 16 & 255) + "." + ((var8.field_g & 65425) >> 8) + "." + (var8.field_g & 255);
                        var8.field_d = java.net.InetAddress.getByName(var13).getHostName();
                        break;
                    }
                    break;
                  case 18:
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_d = var12.getContents((Object) null);
                    break;
                  case 9:
                    var11 = (Object[]) (var8.field_a);
                    if (this.field_f &&
                      null == ((Class) (var11[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_a);
                    if (this.field_f &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_a));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_g);
                    var8.field_d = var9;
                    break;
                  case 22:
                    if (field_c > wq.a(-96)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (hh) null;
                      var8.field_d = rf.a((String) (var8.field_a), var8.field_g, true).b((byte) 61);
                    } catch (hh decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (hh) (Object) decompiledCaughtException;
                      var8.field_d = var3_ref3.getMessage();
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

    final boolean a(byte param0) {
        if (!this.field_f) {
          return false;
        }
        int var2 = -31 % ((param0 - 16) / 51);
        if (!this.field_t) {
          return this.field_r != null ? true : false;
        }
        return null != this.field_w ? true : false;
    }

    final jr a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 != 0) {
          this.field_i = (sr[]) null;
        }
        return this.a(new Object[]{param1, param2, param3}, 0, 0, false, 8);
    }

    final jr a(boolean param0, Runnable param1, int param2) {
        if (!param0) {
          File var5 = (File) null;
          this.a((byte[]) null, -30, (File) null);
        }
        return this.a(param1, 0, param2, !param0 ? true : false, 2);
    }

    final jr a(byte param0, String param1, int param2) {
        if (param0 < 8) {
          field_j = 62;
        }
        return this.a(param2, param1, true, false);
    }

    final boolean a(byte[] param0, int param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        Class[] var5 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4 = new FileOutputStream(param2);
          if (param1 != -31357) {
            var5 = (Class[]) null;
            this.a(-111, (Class) null, (String) null, (Class[]) null);
          }
          var4.write(param0, 0, param0.length);
          var4.close();
          return true;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
    }

    final jr a(byte param0, java.net.URL param1) {
        if (param0 <= 71) {
          return (jr) null;
        }
        return this.a(param1, 0, 0, false, 4);
    }

    final jr a(java.awt.Frame param0, int param1) {
        if (param1 != 19) {
          this.a((byte) -116);
        }
        return this.a(param0, 0, 0, false, 7);
    }

    final jr b(byte param0) {
        int var2 = -105 % ((73 - param0) / 41);
        return this.a((Object) null, 0, 0, false, 5);
    }

    final jr a(int param0, String param1, Class param2) {
        if (param0 != 0) {
          Class var5 = (Class) null;
          this.a(-2, (String) null, (Class) null);
        }
        return this.a(new Object[]{param2, param1}, 0, 0, false, 9);
    }

    final jr a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          return (jr) null;
        }
        return this.a((Object) null, param1 + (param2 << 16), param4 + (param3 << 16), false, 6);
    }

    wi(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        int var8 = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        ep var9 = null;
        ThreadGroup var10 = null;
        ThreadGroup var11 = null;
        this.field_l = null;
        this.field_m = false;
        this.field_f = false;
        this.field_t = false;
        this.field_k = null;
        this.field_x = null;
        this.field_n = null;
        this.field_d = null;
        field_u = "Unknown";
        stackIn_3_1 = (param3);
        this.field_f = stackIn_3_1;
        field_p = param1;
        field_j = param0;
        field_q = "1.1";
        try {
          field_u = System.getProperty("java.vendor");
          field_q = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_u.toLowerCase().indexOf("microsoft") != -1) {
          this.field_t = true;
        }
        try {
          field_h = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_h = "Unknown";
        }
        field_o = field_h.toLowerCase();
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
        if (null == field_s) {
          field_s = "~/";
        }
        try {
          this.field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_t) {
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
        el.a(0, field_j, field_p);
        if (this.field_f) {
          this.field_n = new sr(el.a((String) null, field_j, 95, "random.dat"), "rw", 25L);
          this.field_l = new sr(el.a("main_file_cache.dat2", (byte) -8), "rw", 314572800L);
          this.field_d = new sr(el.a("main_file_cache.idx255", (byte) -8), "rw", 1048576L);
          this.field_i = new sr[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_i[var5_int] = new sr(el.a("main_file_cache.idx" + var5_int, (byte) -8), "rw", 1048576L);
          }
          if (this.field_t) {
            try {
              Class.forName("uf").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_t) {
              this.field_r = Class.forName("cu").newInstance();
            } else {
              var9 = new ep();
              this.field_w = var9;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_t) {
              this.field_b = new bm();
            } else {
              this.field_v = Class.forName("cg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        if (this.field_f &&
          !this.field_t) {
          var10 = Thread.currentThread().getThreadGroup();
          var5 = var10;
          var6 = var10.getParent();
          while (var6 != null) {
            var11 = var6;
            var5 = var11;
            var6 = var11.getParent();
          }
          var7 = new Thread[1000];
          var5.enumerate(var7);
          for (var8 = 0; var8 < var7.length; var8++) {
            if (var7[var8] != null &&
              var7[var8].getName().startsWith("AWT")) {
              var7[var8].setPriority(1);
            }
          }
        }
        this.field_m = false;
        this.field_a = new Thread((Runnable) (this));
        this.field_a.setPriority(10);
        this.field_a.setDaemon(true);
        this.field_a.start();
    }

    static {
        field_c = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
