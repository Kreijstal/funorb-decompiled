/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pn implements Runnable {
    static String field_p;
    sn field_m;
    boolean field_x;
    private boolean field_e;
    static String field_r;
    private static int field_t;
    private vj field_o;
    private pk field_v;
    static String field_w;
    sn field_f;
    sn[] field_a;
    private Thread field_i;
    private Object field_n;
    private static String field_k;
    private boolean field_s;
    private static String field_u;
    private static volatile long field_d;
    private wj field_h;
    private wj field_j;
    sn field_g;
    private static String field_l;
    private Object field_q;
    java.awt.EventQueue field_b;
    static java.lang.reflect.Method field_c;

    final wj a(java.awt.Frame param0, int param1) {
        if (param1 != -1463474960) {
          String var4 = (String) null;
          this.a((String) null, 76, -2);
        }
        return this.a(0, 0, 94, param0, 7);
    }

    final wj a(String param0, int param1, int param2) {
        if (param2 != 376255344) {
          field_w = (String) null;
        }
        return this.a(param1, false, false, param0);
    }

    final wj a(int param0, Class param1, String param2) {
        if (param0 != 9) {
          this.field_s = false;
        }
        return this.a(0, 0, -93, new Object[]{param1, param2}, 9);
    }

    final wj a(java.net.URL param0, int param1) {
        if (param1 <= 28) {
          field_k = (String) null;
        }
        return this.a(0, 0, -111, param0, 4);
    }

    private final static sn a(String param0, int param1, int param2, String param3) {
        try {
          sn stackIn_14_0 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          String var7 = null;
          sn var8 = null;
          Exception var8_ref = null;
          if (param2 != 33) {
            if (34 == param2) {
              var4 = "jagex_" + param0 + "_preferences" + param3 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param3 + ".dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param3 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          var6 = 0;
          if (param1 != 11677) {
            return (sn) null;
          }
          while (var6 < var5.length) {
            var7 = var5[var6];
            if (var7.length() > 0 &&
              !new File(var7).exists()) {
              var6++;
              continue;
            }
            while (true) {
              try {
                var8 = new sn(new File(var7, var4), "rw", 10000L);
                stackIn_14_0 = var8;
                return stackIn_14_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
                while (true) {
                  var6++;
                  if (var6 >= var5.length) {
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

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_93_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          sn var3_ref_sn = null;
          vg var3_ref_vg = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          wj var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          Object[] var14 = null;
          java.awt.Component var15 = null;
          java.awt.Frame var16 = null;
          String var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_s) {
                if (null != this.field_j) {
                  var8 = this.field_j;
                  this.field_j = this.field_j.field_d;
                  if (null == this.field_j) {
                    this.field_h = null;
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
                var2_int = var8.field_f;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_b));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_e);
                    var8.field_c = var18;
                    break;
                  case 16:
                  default:
                    if (!this.field_x) {
                      throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (mm.a(75) < field_d) {
                          throw new IOException();
                        }
                        var17 = (255 & var8.field_e >> 24) + "." + (255 & var8.field_e >> 16) + "." + ((65309 & var8.field_e) >> 8) + "." + (255 & var8.field_e);
                        var8.field_c = java.net.InetAddress.getByName(var17).getHostName();
                        break;
                      case 21:
                        if (mm.a(-120) < field_d) {
                          throw new IOException();
                        }
                        var8.field_c = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                        break;
                      case 5:
                        if (!this.field_e) {
                          var8.field_c = Class.forName("ga").getMethod("listmodes", new Class[]{}).invoke(this.field_n, new Object[]{});
                        } else {
                          var8.field_c = this.field_v.a(0);
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_c = var16;
                        var16.setResizable(false);
                        if (!this.field_e) {
                          Class.forName("ga").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{var16, new Integer(var8.field_e >>> 16), new Integer(var8.field_e & 65535), new Integer(var8.field_g >> 16), new Integer(65535 & var8.field_g)});
                        } else {
                          this.field_v.a(var8.field_g & 65535, var16, var8.field_e & 65535, var8.field_g >> 16, (byte) -107, var8.field_e >>> 16);
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_x &&
                          var2_int == 14) {
                          var3 = var8.field_e;
                          var4 = var8.field_g;
                          if (this.field_e) {
                            this.field_o.a(var4, var3, false);
                          } else {
                            Class.forName("th").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_q, new Object[]{new Integer(var3), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_x &&
                          var2_int == 15) {
                          stackIn_93_0 = (var8.field_e == 0) ? 0 : 1;
                          var3 = stackIn_93_0;
                          var15 = (java.awt.Component) (var8.field_b);
                          if (!this.field_e) {
                            Class.forName("th").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_q, new Object[]{var15, new Boolean(var3 != 0)});
                          } else {
                            this.field_o.a(var15, 32512, var3 != 0);
                          }
                          break;
                        }
                        if (!this.field_e &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.field_b);
                          Class.forName("th").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_q, new Object[]{var14[0], var14[1], new Integer(var8.field_e), new Integer(var8.field_g), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_w.startsWith("win")) {
                              throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_b);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var13.charAt(var5)) == -1) {
                                throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_c = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.field_c = var3_ref_Exception;
                            throw pn.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_sn = pn.a("", 11677, field_t, (String) (var8.field_b));
                        var8.field_c = var3_ref_sn;
                        break;
                      case 12:
                        var3_ref_sn = pn.a(field_k, 11677, field_t, (String) (var8.field_b));
                        var8.field_c = var3_ref_sn;
                        break;
                      case 7:
                        if (this.field_e) {
                          this.field_v.a((java.awt.Frame) (var8.field_b), (byte) 107);
                        } else {
                          Class.forName("ga").getMethod("exit", new Class[]{}).invoke(this.field_n, new Object[]{});
                        }
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_c = var11.getContents((Object) null);
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_b);
                    if (this.field_x &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_c = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_b);
                    if (this.field_x &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_c = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (mm.a(109) < field_d) {
                      throw new IOException();
                    }
                    var8.field_c = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                    break;
                  case 22:
                    if (field_d > mm.a(80)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (vg) null;
                      var8.field_c = tc.a((String) (var8.field_b), var8.field_e, 22137).a(-90);
                    } catch (vg decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_vg = (vg) (Object) decompiledCaughtException;
                      var8.field_c = var3_ref_vg.getMessage();
                      throw var3_ref_vg;
                    }
                    break;
                  case 1:
                    if (mm.a(105) < field_d) {
                      throw new IOException();
                    }
                    var8.field_c = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_e);
                    break;
                }
              }
              var8.field_a = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.field_a = 2;
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

    private final wj a(int param0, int param1, int param2, Object param3, int param4) {
        wj var6 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var8 = null;
        var6 = new wj();
        var6.field_e = param1;
        var6.field_b = param3;
        var6.field_f = param4;
        var7 = 101 % ((-43 - param2) / 45);
        var6.field_g = param0;
        var8 = this;
        synchronized (var8) {
          if (this.field_h == null) {
            this.field_j = var6;
            this.field_h = var6;
          } else {
            this.field_h.field_d = var6;
            this.field_h = var6;
          }
          this.notify();
        }
        return var6;
    }

    final boolean b(int param0) {
        if (!this.field_x) {
          return false;
        }
        if (param0 >= -26) {
          return false;
        }
        if (!this.field_e) {
          return this.field_n != null ? true : false;
        }
        return this.field_v != null ? true : false;
    }

    final wj a(int param0) {
        if (param0 != -30756) {
          return (wj) null;
        }
        return this.a(0, 0, 17, (Object) null, 5);
    }

    final wj a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 6) {
          return (wj) null;
        }
        return this.a(param1 + (param2 << 16), param0 + (param3 << 16), 127, (Object) null, 6);
    }

    final void c(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_s = true;
            this.notifyAll();
            if (param0 != 0) {
              field_t = -42;
            }
          }
          try {
            this.field_i.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_f != null) {
            try {
              this.field_f.a(true);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_g) {
            try {
              this.field_g.a(true);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_a != null) {
            for (var2_int = 0; this.field_a.length > var2_int; var2_int++) {
              if (null != this.field_a[var2_int]) {
                try {
                  this.field_a[var2_int].a(true);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_m) {
            try {
              this.field_m.a(true);
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

    final wj a(String param0, byte param1, Class param2, Class[] param3) {
        if (param1 != 52) {
          field_k = (String) null;
        }
        return this.a(0, 0, -122, new Object[]{param2, param0, param3}, 8);
    }

    final wj a(int param0, int param1, Runnable param2) {
        if (param0 != 2) {
          this.a(-125, -51, 63, 104, 101);
        }
        return this.a(0, param1, 112, param2, 2);
    }

    private final wj a(int param0, boolean param1, boolean param2, String param3) {
        if (param1) {
          String var6 = (String) null;
          this.a((String) null, -15, 36);
        }
        return this.a(0, param0, 108, param3, param2 ? 22 : 1);
    }

    pn(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        pk var6 = null;
        this.field_m = null;
        this.field_e = false;
        this.field_x = false;
        this.field_f = null;
        this.field_s = false;
        this.field_h = null;
        this.field_j = null;
        this.field_g = null;
        field_r = "1.1";
        stackIn_3_1 = (param3);
        this.field_x = stackIn_3_1;
        field_t = param0;
        field_p = "Unknown";
        field_k = param1;
        try {
          field_p = System.getProperty("java.vendor");
          field_r = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_p.toLowerCase().indexOf("microsoft") != -1) {
          this.field_e = true;
        }
        try {
          field_u = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_u = "Unknown";
        }
        field_w = field_u.toLowerCase();
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
          field_l = System.getProperty("user.home");
          if (null != field_l) {
            field_l = field_l + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_l == null) {
          field_l = "~/";
        }
        try {
          this.field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_e) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        wm.a(field_k, true, field_t);
        if (this.field_x) {
          this.field_m = new sn(wm.a((String) null, field_t, (byte) 35, "random.dat"), "rw", 25L);
          this.field_f = new sn(wm.a(8244, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_g = new sn(wm.a(8244, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_a = new sn[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_a[var5_int] = new sn(wm.a(8244, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_e) {
            try {
              Class.forName("gg").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_e) {
              this.field_n = Class.forName("ga").newInstance();
            } else {
              var6 = new pk();
              this.field_v = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_e) {
              this.field_o = new vj();
            } else {
              this.field_q = Class.forName("th").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_s = false;
        this.field_i = new Thread((Runnable) (this));
        this.field_i.setPriority(10);
        this.field_i.setDaemon(true);
        this.field_i.start();
    }

    static {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
