/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private static String field_n;
    private static volatile long field_l;
    an field_i;
    private Object field_x;
    private boolean field_u;
    static String field_s;
    private ue field_t;
    static String field_b;
    private static int field_v;
    an field_k;
    static String field_j;
    an field_f;
    private static String field_r;
    private ia field_c;
    private static String field_g;
    private Thread field_d;
    private Object field_m;
    private boolean field_q;
    static java.lang.reflect.Method field_h;
    boolean field_a;
    java.awt.EventQueue field_p;
    an[] field_e;
    private ia field_o;
    private ga field_w;

    final boolean b(byte param0) {
        int var2 = -48 % ((-43 - param0) / 55);
        if (!this.field_a) {
          return false;
        }
        if (!this.field_q) {
          return null != this.field_x ? true : false;
        }
        return null != this.field_w ? true : false;
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
            this.field_u = true;
            this.notifyAll();
          }
          try {
            if (param0 != -29109) {
              return;
            }
            this.field_d.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_k) {
            try {
              this.field_k.b(param0 ^ 29131);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_f != null) {
            try {
              this.field_f.b(-126);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_e) {
            for (var2_int = 0; var2_int < this.field_e.length; var2_int++) {
              if (this.field_e[var2_int] != null) {
                try {
                  this.field_e[var2_int].b(-111);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_i) {
            try {
              this.field_i.b(-114);
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
          int stackIn_52_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          pm var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          an var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          ia var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          Object[] var14 = null;
          java.awt.Frame var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_u) {
                if (null != this.field_c) {
                  var9 = this.field_c;
                  this.field_c = this.field_c.field_e;
                  if (null == this.field_c) {
                    this.field_o = null;
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
                var2_int = var9.field_g;
                switch (var2_int) {
                  case 1:
                    if (sf.a((byte) 116) < field_l) {
                      throw new IOException();
                    }
                    var9.field_a = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_d)), var9.field_f);
                    break;
                  case 22:
                    if (field_l > sf.a((byte) 99)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (pm) null;
                      var9.field_a = id.a((byte) -34, (String) (var9.field_d), var9.field_f).a(0);
                    } catch (pm decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (pm) (Object) decompiledCaughtException;
                      var9.field_a = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var9.field_d));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.field_f);
                    var9.field_a = var18;
                    break;
                  case 8:
                    var17 = (Object[]) (var9.field_d);
                    if (this.field_a &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var9.field_a = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var9.field_d);
                    if (this.field_a &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.field_a = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 16:
                  default:
                    if (!this.field_a) {
                      throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (field_l > sf.a((byte) -38)) {
                          throw new IOException();
                        }
                        var9.field_a = java.net.InetAddress.getByName((String) (var9.field_d)).getAddress();
                        break;
                      case 5:
                        if (!this.field_q) {
                          var9.field_a = Class.forName("ej").getMethod("listmodes", new Class[]{}).invoke(this.field_x, new Object[]{});
                        } else {
                          var9.field_a = this.field_w.a(0);
                        }
                        break;
                      case 6:
                        var15 = new java.awt.Frame("Jagex Full Screen");
                        var9.field_a = var15;
                        var15.setResizable(false);
                        if (this.field_q) {
                          this.field_w.a(65535 & var9.field_b, var9.field_f >>> 16, (byte) 114, var15, 65535 & var9.field_f, var9.field_b >> 16);
                        } else {
                          Class.forName("ej").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{var15, new Integer(var9.field_f >>> 16), new Integer(var9.field_f & 65535), new Integer(var9.field_b >> 16), new Integer(var9.field_b & 65535)});
                        }
                        break;
                      case 7:
                        if (!this.field_q) {
                          Class.forName("ej").getMethod("exit", new Class[]{}).invoke(this.field_x, new Object[]{});
                        } else {
                          this.field_w.a((byte) -101, (java.awt.Frame) (var9.field_d));
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_a &&
                          var2_int == 14) {
                          var3_int = var9.field_f;
                          var4 = var9.field_b;
                          if (this.field_q) {
                            this.field_t.a(false, var3_int, var4);
                          } else {
                            Class.forName("jj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_a &&
                          var2_int == 15) {
                          stackIn_52_0 = (0 == var9.field_f) ? 0 : 1;
                          var3_int = stackIn_52_0;
                          var13 = (java.awt.Component) (var9.field_d);
                          if (this.field_q) {
                            this.field_t.a(0, var13, var3_int != 0);
                          } else {
                            Class.forName("jj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_m, new Object[]{var13, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_q &&
                          17 == var2_int) {
                          var14 = (Object[]) (var9.field_d);
                          Class.forName("jj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_m, new Object[]{var14[0], var14[1], new Integer(var9.field_f), new Integer(var9.field_b), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_j.startsWith("win")) {
                              throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var8 = (String) (var9.field_d);
                            if (!var8.startsWith("http://") &&
                              !var8.startsWith("https://")) {
                              throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var8.length(); var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var8.charAt(var5))) {
                                throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_a = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var9.field_a = var3_ref2;
                            throw vf.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref3 = vf.a("", (String) (var9.field_d), field_v, 34);
                        var9.field_a = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = vf.a(field_g, (String) (var9.field_d), field_v, 34);
                        var9.field_a = var3_ref3;
                        break;
                      case 3:
                        if (field_l > sf.a((byte) 113)) {
                          throw new IOException();
                        }
                        var12 = (255 & var9.field_f >> 24) + "." + ((var9.field_f & 16776460) >> 16) + "." + ((var9.field_f & 65306) >> 8) + "." + (255 & var9.field_f);
                        var9.field_a = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var9.field_d);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.field_a = var10.getContents((Object) null);
                    break;
                  case 4:
                    if (sf.a((byte) 126) < field_l) {
                      throw new IOException();
                    }
                    var9.field_a = new DataInputStream(((java.net.URL) (var9.field_d)).openStream());
                    break;
                }
              }
              var9.field_c = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var9.field_c = 2;
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

    private final ia a(int param0, int param1, String param2, boolean param3) {
        if (param1 <= 62) {
          java.awt.Frame var6 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, false);
        }
        return this.a(param2, param0, (byte) 67, 0, param3 ? 22 : 1);
    }

    final ia a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 >= -97) {
          Runnable var7 = (Runnable) null;
          this.a((Runnable) null, (byte) -99, 23);
        }
        return this.a((Object) null, param3 + (param2 << 16), (byte) 67, (param0 << 16) + param1, 6);
    }

    private final ia a(Object param0, int param1, byte param2, int param3, int param4) {
        ia var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new ia();
        var6.field_g = param4;
        var6.field_f = param1;
        var6.field_b = param3;
        var6.field_d = param0;
        var7 = this;
        synchronized (var7) {
          if (this.field_o != null) {
            this.field_o.field_e = var6;
            this.field_o = var6;
          } else {
            this.field_c = var6;
            this.field_o = var6;
          }
          this.notify();
        }
        if (param2 == 67) {
          return var6;
        }
        return (ia) null;
    }

    final ia a(Runnable param0, byte param1, int param2) {
        if (param1 < 0) {
          return (ia) null;
        }
        return this.a(param0, param2, (byte) 67, 0, 2);
    }

    final ia a(byte param0) {
        if (param0 != -114) {
          return (ia) null;
        }
        return this.a((Object) null, 0, (byte) 67, 0, 5);
    }

    private final static an a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          an stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          an var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param3 != 34) {
            var9 = (String) null;
            vf.a((String) null, (String) null, 82, 95);
          }
          if (param2 != 33) {
            if (34 == param2) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new an(new File(var7, var4), "rw", 10000L);
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

    final ia a(java.awt.Frame param0, boolean param1) {
        if (!param1) {
          this.field_i = (an) null;
        }
        return this.a(param0, 0, (byte) 67, 0, 7);
    }

    final ia a(Class param0, String param1, int param2) {
        if (param2 != 21268) {
          this.field_k = (an) null;
        }
        return this.a(new Object[]{param0, param1}, 0, (byte) 67, 0, 9);
    }

    final ia a(String param0, int param1, byte param2) {
        if (param2 < 3) {
          this.a((byte) 66);
        }
        return this.a(param1, 67, param0, false);
    }

    final ia a(String param0, Class param1, int param2, Class[] param3) {
        if (param2 < 5) {
          return (ia) null;
        }
        return this.a(new Object[]{param1, param0, param3}, 0, (byte) 67, 0, 8);
    }

    final ia a(byte param0, java.net.URL param1) {
        if (param0 != -83) {
          return (ia) null;
        }
        return this.a(param1, 0, (byte) 67, 0, 4);
    }

    vf(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ga var6 = null;
        this.field_i = null;
        this.field_u = false;
        this.field_c = null;
        this.field_k = null;
        this.field_q = false;
        this.field_a = false;
        this.field_f = null;
        this.field_o = null;
        stackIn_3_1 = (param3);
        this.field_a = stackIn_3_1;
        field_b = "1.1";
        field_v = param0;
        field_g = param1;
        field_s = "Unknown";
        try {
          field_s = System.getProperty("java.vendor");
          field_b = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_s.toLowerCase().indexOf("microsoft")) {
          this.field_q = true;
        }
        try {
          field_n = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_n = "Unknown";
        }
        field_j = field_n.toLowerCase();
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
          if (field_r != null) {
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
          this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_q) {
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
        fk.a(true, field_g, field_v);
        if (this.field_a) {
          this.field_i = new an(fk.a((String) null, "random.dat", false, field_v), "rw", 25L);
          this.field_k = new an(fk.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_f = new an(fk.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_e = new an[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_e[var5_int] = new an(fk.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_q) {
            try {
              Class.forName("qj").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_q) {
              var6 = new ga();
              this.field_w = var6;
            } else {
              this.field_x = Class.forName("ej").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_q) {
              this.field_m = Class.forName("jj").newInstance();
            } else {
              this.field_t = new ue();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_u = false;
        this.field_d = new Thread((Runnable) (this));
        this.field_d.setPriority(10);
        this.field_d.setDaemon(true);
        this.field_d.start();
    }

    static {
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
