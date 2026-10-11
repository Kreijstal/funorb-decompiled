/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    private og field_x;
    private static volatile long field_w;
    kb field_e;
    private ca field_m;
    private static String field_t;
    static String field_c;
    private Object field_k;
    private Object field_g;
    static String field_l;
    private boolean field_j;
    kb field_n;
    private static String field_i;
    kb field_q;
    private boolean field_v;
    kb[] field_d;
    private static String field_h;
    private t field_u;
    boolean field_p;
    static String field_s;
    private og field_b;
    private static int field_r;
    java.awt.EventQueue field_a;
    static java.lang.reflect.Method field_f;
    private Thread field_o;

    final og a(boolean param0, java.net.URL param1) {
        if (!param0) {
          this.field_v = true;
        }
        return this.a(false, 4, 0, 0, param1);
    }

    private final static kb a(String param0, int param1, String param2, int param3) {
        try {
          int var6 = 0;
          kb stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          kb var8 = null;
          Exception var8_ref = null;
          if (param1 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_h, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param3 != 10000) {
            field_l = (String) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new kb(new File(var7, var4), "rw", 10000L);
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

    final og b(int param0) {
        if (param0 != -27886) {
          String var3 = (String) null;
          this.a(-93, true, (String) null);
        }
        return this.a(false, 5, 0, 0, (Object) null);
    }

    final og a(int param0, boolean param1, String param2) {
        if (!param1) {
          field_i = (String) null;
        }
        return this.a(false, param2, (byte) 46, param0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_55_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          hj var3_ref = null;
          kb var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          og var8 = null;
          Object[] var9 = null;
          String var10 = null;
          java.awt.Component var11 = null;
          String var12 = null;
          Object[] var13 = null;
          java.awt.Frame var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_v) {
                if (this.field_x != null) {
                  var8 = this.field_x;
                  this.field_x = this.field_x.field_d;
                  if (this.field_x == null) {
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
                var2_int = var8.field_f;
                switch (var2_int) {
                  case 1:
                    if (qj.b(-26572) < field_w) {
                      throw new IOException();
                    }
                    var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_c);
                    break;
                  case 22:
                    if (qj.b(-26572) < field_w) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (hj) null;
                      var8.field_g = ka.a((String) (var8.field_b), var8.field_c, 0).b((byte) -128);
                    } catch (hj decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (hj) (Object) decompiledCaughtException;
                      var8.field_g = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_b));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_c);
                    var8.field_g = var18;
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_b);
                    if (this.field_p &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_g = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_p) {
                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (field_w > qj.b(-26572)) {
                          throw new IOException();
                        }
                        var8.field_g = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_g = var14;
                        var14.setResizable(false);
                        if (!this.field_j) {
                          Class.forName("vj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var14, new Integer(var8.field_c >>> 16), new Integer(var8.field_c & 65535), new Integer(var8.field_a >> 16), new Integer(var8.field_a & 65535)});
                        } else {
                          this.field_u.a(18, var8.field_a >> 16, var8.field_c & 65535, var14, var8.field_c >>> 16, var8.field_a & 65535);
                        }
                        break;
                      case 7:
                        if (!this.field_j) {
                          Class.forName("vj").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                        } else {
                          this.field_u.a((java.awt.Frame) (var8.field_b), (byte) 6);
                        }
                        break;
                      case 12:
                        var3_ref2 = dl.a((String) (var8.field_b), field_r, field_i, 10000);
                        var8.field_g = var3_ref2;
                        break;
                      case 13:
                        var3_ref2 = dl.a((String) (var8.field_b), field_r, "", 10000);
                        var8.field_g = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_p &&
                          var2_int == 14) {
                          var3_int = var8.field_c;
                          var4 = var8.field_a;
                          if (this.field_j) {
                            this.field_m.a(26899, var4, var3_int);
                          } else {
                            Class.forName("fa").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_k, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_p &&
                          var2_int == 15) {
                          stackIn_55_0 = (var8.field_c == 0) ? 0 : 1;
                          var3_int = stackIn_55_0;
                          var11 = (java.awt.Component) (var8.field_b);
                          if (!this.field_j) {
                            Class.forName("fa").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_k, new Object[]{var11, new Boolean(var3_int != 0)});
                          } else {
                            this.field_m.a(122, var11, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_j &&
                          var2_int == 17) {
                          var13 = (Object[]) (var8.field_b);
                          Class.forName("fa").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_k, new Object[]{var13[0], var13[1], new Integer(var8.field_c), new Integer(var8.field_a), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_s.startsWith("win")) {
                              throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var12 = (String) (var8.field_b);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var12.length() > var5; var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var12.charAt(var5))) {
                                throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_g = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref3;
                            throw dl.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 5:
                        if (!this.field_j) {
                          var8.field_g = Class.forName("vj").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                        } else {
                          var8.field_g = this.field_u.a(0);
                        }
                        break;
                      case 3:
                        if (field_w > qj.b(-26572)) {
                          throw new IOException();
                        }
                        var10 = (var8.field_c >> 24 & 255) + "." + ((var8.field_c & 16726054) >> 16) + "." + ((65321 & var8.field_c) >> 8) + "." + (var8.field_c & 255);
                        var8.field_g = java.net.InetAddress.getByName(var10).getHostName();
                        break;
                    }
                    break;
                  case 9:
                    var9 = (Object[]) (var8.field_b);
                    if (this.field_p &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_g = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                    break;
                  case 4:
                    if (qj.b(-26572) < field_w) {
                      throw new IOException();
                    }
                    var8.field_g = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                    break;
                }
              }
              var8.field_e = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_e = 2;
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

    final og a(java.awt.Frame param0, int param1) {
        if (param1 != 6) {
          Class var4 = (Class) null;
          this.a(-82, (String) null, (Class[]) null, (Class) null);
        }
        return this.a(false, 7, 0, 0, param0);
    }

    final void a(int param0) {
        try {
          int var3_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref_Object = null;
          InterruptedException var2_ref_InterruptedException = null;
          IOException var2_ref_IOException = null;
          int var2 = 0;
          IOException var3 = null;
          IOException var4 = null;
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            this.field_v = true;
            this.notifyAll();
          }
          try {
            this.field_o.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_q) {
            try {
              this.field_q.c(-103);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_e != null) {
            try {
              this.field_e.c(101);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          var2 = -36 % ((param0 + 60) / 54);
          if (this.field_d != null) {
            for (var3_int = 0; var3_int < this.field_d.length; var3_int++) {
              if (null != this.field_d[var3_int]) {
                try {
                  this.field_d[var3_int].c(101);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var4 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.c(-20);
            } catch (java.io.IOException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var3 = (IOException) (Object) decompiledCaughtException;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final og a(boolean param0, String param1, byte param2, int param3) {
        if (param2 <= 8) {
          this.a((byte) -97);
        }
        return this.a(false, param0 ? 22 : 1, 0, param3, param1);
    }

    private final og a(boolean param0, int param1, int param2, int param3, Object param4) {
        og var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        og stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new og();
        var6.field_b = param4;
        var6.field_f = param1;
        var6.field_a = param2;
        var6.field_c = param3;
        var7_ref = this;
        synchronized (var7_ref) {
          if (param0) {
            stackIn_3_0 = (og) null;
            return stackIn_3_0;
          }
          if (null == this.field_b) {
            this.field_x = var6;
            this.field_b = var6;
          } else {
            this.field_b.field_d = var6;
            this.field_b = var6;
          }
          this.notify();
        }
        return var6;
    }

    final og a(byte param0, String param1, Class param2) {
        if (param0 != -95) {
          this.field_d = (kb[]) null;
        }
        return this.a(false, 9, 0, 0, new Object[]{param2, param1});
    }

    final og a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= 94) {
          this.field_j = true;
        }
        return this.a(false, 6, (param1 << 16) + param4, (param0 << 16) + param3, (Object) null);
    }

    final boolean a(byte param0) {
        if (!this.field_p) {
          return false;
        }
        if (param0 != 46) {
          this.b(53);
        }
        if (this.field_j) {
          return null != this.field_u ? true : false;
        }
        return this.field_g != null ? true : false;
    }

    final og a(int param0, String param1, Class[] param2, Class param3) {
        if (param0 != -30176) {
          field_l = (String) null;
        }
        return this.a(false, 8, 0, 0, new Object[]{param3, param1, param2});
    }

    final og a(int param0, int param1, Runnable param2) {
        if (param0 < 121) {
          field_t = (String) null;
        }
        return this.a(false, 2, 0, param1, param2);
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        t var7 = null;
        this.field_x = null;
        this.field_j = false;
        this.field_v = false;
        this.field_q = null;
        this.field_e = null;
        this.field_n = null;
        this.field_b = null;
        this.field_p = false;
        field_l = "Unknown";
        stackIn_3_1 = (param3);
        this.field_p = stackIn_3_1;
        field_r = param0;
        field_c = "1.1";
        field_i = param1;
        try {
          field_l = System.getProperty("java.vendor");
          field_c = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_l.toLowerCase().indexOf("microsoft") != -1) {
          this.field_j = true;
        }
        try {
          field_t = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_t = "Unknown";
        }
        field_s = field_t.toLowerCase();
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
          field_h = System.getProperty("user.home");
          if (field_h != null) {
            field_h = field_h + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_h) {
          field_h = "~/";
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
            field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        nd.a(field_i, field_r, true);
        if (this.field_p) {
          this.field_n = new kb(nd.a("random.dat", -3, field_r, (String) null), "rw", 25L);
          this.field_q = new kb(nd.a((byte) 67, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_e = new kb(nd.a((byte) 67, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_d = new kb[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_d[var5_int] = new kb(nd.a((byte) 67, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("te").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_j) {
              var7 = new t();
              this.field_u = var7;
            } else {
              this.field_g = Class.forName("vj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_j) {
              this.field_k = Class.forName("fa").newInstance();
            } else {
              this.field_m = new ca();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_v = false;
        this.field_o = new Thread((Runnable) (this));
        this.field_o.setPriority(10);
        this.field_o.setDaemon(true);
        this.field_o.start();
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
