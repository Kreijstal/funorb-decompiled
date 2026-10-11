/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    static String field_k;
    java.awt.EventQueue field_w;
    private ae field_r;
    private static int field_n;
    private mh field_h;
    private Object field_x;
    private static volatile long field_t;
    boolean field_a;
    hf field_i;
    private static String field_b;
    static String field_c;
    hf[] field_o;
    private Thread field_s;
    private mh field_p;
    private boolean field_j;
    private boolean field_m;
    static String field_d;
    static java.lang.reflect.Method field_f;
    private Object field_q;
    private static String field_u;
    hf field_v;
    private static String field_g;
    private fg field_e;
    hf field_l;

    final mh a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 39) {
          this.field_r = (ae) null;
        }
        return this.a(param4 + (param2 << 16), 1, (Object) null, 6, (param3 << 16) + param1);
    }

    final mh a(int param0, String param1, int param2) {
        mh discarded$0 = null;
        if (param0 <= 98) {
          String var5 = (String) null;
          discarded$0 = this.a(12, true, -60, (String) null);
        }
        return this.a(param2, false, -10742, param1);
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
            this.field_m = true;
            this.notifyAll();
          }
          try {
            this.field_s.join();
            if (param0 != 0) {
              this.a(-106);
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_i != null) {
            try {
              this.field_i.a(-72);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_l) {
            try {
              this.field_l.a(param0 - 55);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_o) {
            for (var2_int = 0; var2_int < this.field_o.length; var2_int++) {
              if (null != this.field_o[var2_int]) {
                try {
                  this.field_o[var2_int].a(param0 ^ -71);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_v != null) {
            try {
              this.field_v.a(-72);
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

    final mh a(boolean param0, String param1, Class param2) {
        if (param0) {
          return (mh) null;
        }
        return this.a(0, 1, new Object[]{param2, param1}, 9, 0);
    }

    private final mh a(int param0, boolean param1, int param2, String param3) {
        if (param2 != -10742) {
          this.field_h = (mh) null;
        }
        return this.a(0, 1, param3, param1 ? 22 : 1, param0);
    }

    final boolean b(int param0) {
        if (param0 != -86) {
          return false;
        }
        if (!this.field_a) {
          return false;
        }
        if (this.field_j) {
          return null != this.field_e ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final mh a(int param0, String param1, Class param2, Class[] param3) {
        if (param0 != -10962) {
          field_f = (java.lang.reflect.Method) null;
        }
        return this.a(0, param0 ^ -10961, new Object[]{param2, param1, param3}, 8, 0);
    }

    private final static hf a(byte param0, String param1, String param2, int param3) {
        try {
          int var6 = 0;
          hf stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          hf var8 = null;
          Exception var8_ref = null;
          if (33 == param3) {
            var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 != -32) {
            return (hf) null;
          }
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new hf(new File(var7, var4), "rw", 10000L);
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

    final mh a(int param0, java.awt.Frame param1) {
        if (param0 != 75254128) {
          return (mh) null;
        }
        return this.a(0, 1, param1, 7, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_95_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          hf var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          db var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          mh var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          Object[] var15 = null;
          Object var16 = null;
          String var16_ref = null;
          Object var17 = null;
          java.awt.Component var17_ref = null;
          Thread var18 = null;
          var16 = null;
          var17 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_m) {
                if (this.field_h != null) {
                  var8 = this.field_h;
                  this.field_h = this.field_h.field_f;
                  if (null == this.field_h) {
                    this.field_p = null;
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
                  case 1:
                    if (ik.a(4) < field_t) {
                      throw new IOException();
                    }
                    var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_g);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_e));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_g);
                    var8.field_b = var18;
                    break;
                  case 4:
                    if (field_t > ik.a(4)) {
                      throw new IOException();
                    }
                    var8.field_b = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                    break;
                  case 16:
                  default:
                    if (!this.field_a) {
                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (field_t > ik.a(4)) {
                          throw new IOException();
                        }
                        var8.field_b = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                        break;
                      case 12:
                        var3_ref = fd.a((byte) -32, field_g, (String) (var8.field_e), field_n);
                        var8.field_b = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_a &&
                          var2_int == 14) {
                          var3_int = var8.field_g;
                          var4 = var8.field_a;
                          if (this.field_j) {
                            this.field_r.a(var3_int, var4, (byte) -98);
                          } else {
                            Class.forName("il").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_q, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_a &&
                          15 == var2_int) {
                          stackIn_95_0 = (var8.field_g == 0) ? 0 : 1;
                          var3_int = stackIn_95_0;
                          var17_ref = (java.awt.Component) (var8.field_e);
                          if (this.field_j) {
                            this.field_r.a(var3_int != 0, var17_ref, (byte) 111);
                          } else {
                            Class.forName("il").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_q, new Object[]{var17_ref, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_j &&
                          var2_int == 17) {
                          var15 = (Object[]) (var8.field_e);
                          Class.forName("il").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_q, new Object[]{var15[0], var15[1], new Integer(var8.field_g), new Integer(var8.field_a), var15[2]});
                        } else {
                          if (16 != var2_int) {
                            throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_d.startsWith("win")) {
                              throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var16_ref = (String) (var8.field_e);
                            if (!var16_ref.startsWith("http://") &&
                              !var16_ref.startsWith("https://")) {
                              throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var16_ref.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var16_ref.charAt(var5)) == -1) {
                                throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16_ref + "\"");
                            var8.field_b = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref2;
                            throw fd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref = fd.a((byte) -32, "", (String) (var8.field_e), field_n);
                        var8.field_b = var3_ref;
                        break;
                      case 7:
                        if (this.field_j) {
                          this.field_e.a((java.awt.Frame) (var8.field_e), (byte) 122);
                        } else {
                          Class.forName("vc").getMethod("exit", new Class[]{}).invoke(this.field_x, new Object[]{});
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_b = var14;
                        var14.setResizable(false);
                        if (!this.field_j) {
                          Class.forName("vc").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{var14, new Integer(var8.field_g >>> 16), new Integer(var8.field_g & 65535), new Integer(var8.field_a >> 16), new Integer(var8.field_a & 65535)});
                        } else {
                          this.field_e.a(var8.field_a >> 16, false, var8.field_g >>> 16, var8.field_g & 65535, var8.field_a & 65535, var14);
                        }
                        break;
                      case 5:
                        if (!this.field_j) {
                          var8.field_b = Class.forName("vc").getMethod("listmodes", new Class[]{}).invoke(this.field_x, new Object[]{});
                        } else {
                          var8.field_b = this.field_e.a(0);
                        }
                        break;
                      case 3:
                        if (field_t > ik.a(4)) {
                          throw new IOException();
                        }
                        var13 = (var8.field_g >> 24 & 255) + "." + (255 & var8.field_g >> 16) + "." + ((var8.field_g & 65502) >> 8) + "." + (255 & var8.field_g);
                        var8.field_b = java.net.InetAddress.getByName(var13).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_b = var11.getContents((Object) null);
                    break;
                  case 9:
                    var10 = (Object[]) (var8.field_e);
                    if (this.field_a &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_e);
                    if (this.field_a &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 22:
                    if (ik.a(4) < field_t) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (db) null;
                      var8.field_b = pn.a((String) (var8.field_e), var8.field_g, 23155).a(-7);
                    } catch (db decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (db) (Object) decompiledCaughtException;
                      var8.field_b = var3_ref3.getMessage();
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

    final mh a(java.net.URL param0, byte param1) {
        int var3 = -74 % ((-9 - param1) / 45);
        return this.a(0, 1, param0, 4, 0);
    }

    final mh a(byte param0) {
        if (param0 <= 121) {
          return (mh) null;
        }
        return this.a(0, 1, (Object) null, 5, 0);
    }

    private final mh a(int param0, int param1, Object param2, int param3, int param4) {
        mh var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new mh();
        var6.field_g = param4;
        var6.field_a = param0;
        var6.field_d = param3;
        var6.field_e = param2;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_p) {
            this.field_p.field_f = var6;
            this.field_p = var6;
          } else {
            this.field_h = var6;
            this.field_p = var6;
          }
          this.notify();
          if (param1 != 1) {
            field_t = -68L;
          }
        }
        return var6;
    }

    final mh a(byte param0, int param1, Runnable param2) {
        int var4 = -20 / ((param0 - 80) / 41);
        return this.a(0, 1, param2, 2, param1);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        fg var6 = null;
        this.field_h = null;
        this.field_i = null;
        this.field_p = null;
        this.field_m = false;
        this.field_j = false;
        this.field_a = false;
        this.field_l = null;
        this.field_v = null;
        stackIn_3_1 = (param3);
        this.field_a = stackIn_3_1;
        field_n = param0;
        field_c = "1.1";
        field_g = param1;
        field_k = "Unknown";
        try {
          field_k = System.getProperty("java.vendor");
          field_c = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_k.toLowerCase().indexOf("microsoft") != -1) {
          this.field_j = true;
        }
        try {
          field_b = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_b = "Unknown";
        }
        field_d = field_b.toLowerCase();
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
          field_u = System.getProperty("user.home");
          if (field_u != null) {
            field_u = field_u + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_u == null) {
          field_u = "~/";
        }
        try {
          this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
        od.a(field_n, field_g, 7154);
        if (this.field_a) {
          this.field_v = new hf(od.a((String) null, 30869, "random.dat", field_n), "rw", 25L);
          this.field_i = new hf(od.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_l = new hf(od.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_o = new hf[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_o[var5_int] = new hf(od.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("hi").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_j) {
              this.field_x = Class.forName("vc").newInstance();
            } else {
              var6 = new fg();
              this.field_e = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_j) {
              this.field_q = Class.forName("il").newInstance();
            } else {
              this.field_r = new ae();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_m = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    static {
        field_t = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
