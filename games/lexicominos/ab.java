/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ab implements Runnable {
    java.awt.EventQueue field_i;
    private static String field_n;
    private ei field_k;
    private ai field_r;
    private static int field_l;
    ea field_t;
    static String field_v;
    ea field_o;
    boolean field_e;
    static java.lang.reflect.Method field_x;
    private static String field_s;
    private static String field_a;
    private od field_u;
    ea field_w;
    private Object field_f;
    private boolean field_g;
    static String field_b;
    ea[] field_c;
    private boolean field_h;
    private static volatile long field_p;
    static String field_j;
    private Object field_d;
    private ei field_q;
    private Thread field_m;

    final ei a(int param0, java.awt.Frame param1) {
        if (param0 != 0) {
          Runnable var4 = (Runnable) null;
          this.a((Runnable) null, true, -106);
        }
        return this.a(param0 ^ -402166672, 0, 0, 7, param1);
    }

    final ei a(Runnable param0, boolean param1, int param2) {
        if (param1) {
          return (ei) null;
        }
        return this.a(-402166672, 0, param2, 2, param0);
    }

    final void a(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          String var4 = null;
          var2 = this;
          synchronized (var2) {
            if (param0 != -265) {
              var4 = (String) null;
              this.a(55, (byte) 0, (String) null);
            }
            this.field_h = true;
            this.notifyAll();
          }
          try {
            this.field_m.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.a(true);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_o != null) {
            try {
              this.field_o.a(true);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_c != null) {
            for (var2_int = 0; this.field_c.length > var2_int; var2_int++) {
              if (null != this.field_c[var2_int]) {
                try {
                  this.field_c[var2_int].a(true);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_w != null) {
            try {
              this.field_w.a(true);
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
          int stackIn_82_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ea var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ck var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          ei var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          Object[] var13 = null;
          String var14 = null;
          java.awt.Component var15 = null;
          java.awt.Frame var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_h) {
                if (this.field_k != null) {
                  var8 = this.field_k;
                  this.field_k = this.field_k.field_f;
                  if (null == this.field_k) {
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
                var2_int = var8.field_a;
                switch (var2_int) {
                  case 1:
                    if (rf.c(0) < field_p) {
                      throw new IOException();
                    }
                    var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_d);
                    break;
                  case 9:
                    var18 = (Object[]) (var8.field_c);
                    if (this.field_e &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_e) {
                      throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (rf.c(0) < field_p) {
                          throw new IOException();
                        }
                        var8.field_g = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 5:
                        if (!this.field_g) {
                          var8.field_g = Class.forName("tk").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          var8.field_g = this.field_r.a(0);
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_g = var16;
                        var16.setResizable(false);
                        if (this.field_g) {
                          this.field_r.a(var16, var8.field_e >> 16, 13486, var8.field_d >>> 16, 65535 & var8.field_d, var8.field_e & 65535);
                        } else {
                          Class.forName("tk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var16, new Integer(var8.field_d >>> 16), new Integer(var8.field_d & 65535), new Integer(var8.field_e >> 16), new Integer(65535 & var8.field_e)});
                        }
                        break;
                      case 7:
                        if (this.field_g) {
                          this.field_r.a((java.awt.Frame) (var8.field_c), -20);
                        } else {
                          Class.forName("tk").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = ab.a((String) (var8.field_c), 2, field_s, field_l);
                        var8.field_g = var3_ref;
                        break;
                      case 13:
                        var3_ref = ab.a((String) (var8.field_c), 2, "", field_l);
                        var8.field_g = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_e &&
                          var2_int == 14) {
                          var3_int = var8.field_d;
                          var4 = var8.field_e;
                          if (!this.field_g) {
                            Class.forName("lc").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_u.a(var3_int, var4, 123);
                          }
                          break;
                        }
                        if (this.field_e &&
                          var2_int == 15) {
                          stackIn_82_0 = (0 == var8.field_d) ? 0 : 1;
                          var3_int = stackIn_82_0;
                          var15 = (java.awt.Component) (var8.field_c);
                          if (this.field_g) {
                            this.field_u.a(var15, var3_int != 0, true);
                          } else {
                            Class.forName("lc").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_d, new Object[]{var15, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_g &&
                          var2_int == 17) {
                          var13 = (Object[]) (var8.field_c);
                          Class.forName("lc").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_d, new Object[]{var13[0], var13[1], new Integer(var8.field_d), new Integer(var8.field_e), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_b.startsWith("win")) {
                              throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var14 = (String) (var8.field_c);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var14.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_g = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref2;
                            throw ab.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 3:
                        if (field_p > rf.c(0)) {
                          throw new IOException();
                        }
                        var12 = (var8.field_d >> 24 & 255) + "." + (255 & var8.field_d >> 16) + "." + ((var8.field_d & 65321) >> 8) + "." + (255 & var8.field_d);
                        var8.field_g = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_g = var11.getContents((Object) null);
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_c);
                    if (this.field_e &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (field_p > rf.c(0)) {
                      throw new IOException();
                    }
                    var8.field_g = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_c));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_d);
                    var8.field_g = var9;
                    break;
                  case 22:
                    if (rf.c(0) < field_p) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ck) null;
                      var8.field_g = v.a((String) (var8.field_c), var8.field_d, (byte) 127).b(51);
                    } catch (ck decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ck) (Object) decompiledCaughtException;
                      var8.field_g = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
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

    private final ei a(byte param0, boolean param1, String param2, int param3) {
        if (param0 > -125) {
          field_n = (String) null;
        }
        return this.a(-402166672, 0, param3, !param1 ? 1 : 22, param2);
    }

    final boolean b(int param0) {
        ei discarded$0 = null;
        if (param0 != 0) {
          Object var3 = (Object) null;
          discarded$0 = this.a(25, 83, 116, 75, (Object) null);
        }
        if (!this.field_e) {
          return false;
        }
        if (!this.field_g) {
          return null != this.field_f ? true : false;
        }
        return null != this.field_r ? true : false;
    }

    final ei a(int param0, byte param1, String param2) {
        int var4 = -71 % ((71 - param1) / 46);
        return this.a((byte) -126, false, param2, param0);
    }

    final ei a(String param0, int param1, Class param2) {
        if (param1 != 2) {
          this.field_f = (Object) null;
        }
        return this.a(param1 ^ -402166670, 0, 0, 9, new Object[]{param2, param0});
    }

    final ei a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 28460) {
          this.field_i = (java.awt.EventQueue) null;
        }
        return this.a(-402166672, (param3 << 16) + param4, param2 + (param1 << 16), 6, (Object) null);
    }

    final ei a(int param0, java.net.URL param1) {
        if (param0 != -23816) {
          this.field_c = (ea[]) null;
        }
        return this.a(-402166672, 0, 0, 4, param1);
    }

    final ei a(byte param0) {
        if (param0 < 67) {
          return (ei) null;
        }
        return this.a(-402166672, 0, 0, 5, (Object) null);
    }

    final ei a(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != 113) {
          Class[] var6 = (Class[]) null;
          this.a((String) null, (Class) null, (Class[]) null, (byte) -43);
        }
        return this.a(-402166672, 0, 0, 8, new Object[]{param1, param0, param2});
    }

    private final ei a(int param0, int param1, int param2, int param3, Object param4) {
        ei var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new ei();
        var6.field_e = param1;
        var6.field_a = param3;
        var6.field_c = param4;
        var6.field_d = param2;
        if (param0 != -402166672) {
          field_v = (String) null;
        }
        var7 = this;
        synchronized (var7) {
          if (null == this.field_q) {
            this.field_k = var6;
            this.field_q = var6;
          } else {
            this.field_q.field_f = var6;
            this.field_q = var6;
          }
          this.notify();
        }
        return var6;
    }

    private final static ea a(String param0, int param1, String param2, int param3) {
        try {
          int var6 = 0;
          ea stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ea var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param3 != 33) {
            if (param3 != 34) {
              var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ea(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param1 == 2) {
            return null;
          }
          var9 = (String) null;
          ab.a((String) null, -113, (String) null, 96);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ab(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ai var7 = null;
        this.field_k = null;
        this.field_w = null;
        this.field_t = null;
        this.field_g = false;
        this.field_h = false;
        this.field_o = null;
        this.field_e = false;
        this.field_q = null;
        field_j = "Unknown";
        field_v = "1.1";
        field_s = param1;
        field_l = param0;
        stackIn_3_1 = (param3);
        this.field_e = stackIn_3_1;
        try {
          field_j = System.getProperty("java.vendor");
          field_v = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_j.toLowerCase().indexOf("microsoft")) {
          this.field_g = true;
        }
        try {
          field_a = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_a = "Unknown";
        }
        field_b = field_a.toLowerCase();
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
        if (field_n == null) {
          field_n = "~/";
        }
        try {
          this.field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        s.a(field_l, field_s, false);
        if (this.field_e) {
          this.field_w = new ea(s.a("random.dat", (String) null, field_l, (byte) -45), "rw", 25L);
          this.field_t = new ea(s.a(true, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_o = new ea(s.a(true, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_c = new ea[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_c[var5_int] = new ea(s.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_g) {
            try {
              Class.forName("dk").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_g) {
              this.field_f = Class.forName("tk").newInstance();
            } else {
              var7 = new ai();
              this.field_r = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_g) {
              this.field_d = Class.forName("lc").newInstance();
            } else {
              this.field_u = new od();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_h = false;
        this.field_m = new Thread((Runnable) (this));
        this.field_m.setPriority(10);
        this.field_m.setDaemon(true);
        this.field_m.start();
    }

    static {
        field_p = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
