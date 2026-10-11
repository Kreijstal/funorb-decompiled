/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk implements Runnable {
    static String field_o;
    static String field_l;
    private static int field_v;
    private pc field_x;
    private static String field_k;
    private static volatile long field_u;
    private Thread field_s;
    fs field_a;
    private fi field_d;
    fs[] field_r;
    static java.lang.reflect.Method field_e;
    private en field_b;
    private static String field_t;
    private en field_w;
    fs field_g;
    boolean field_p;
    java.awt.EventQueue field_j;
    static String field_f;
    private Object field_m;
    fs field_n;
    private Object field_h;
    boolean field_q;
    private static String field_i;
    private boolean field_c;

    final en a(java.awt.Frame param0, int param1) {
        if (param1 != 16823) {
          this.field_m = (Object) null;
        }
        return this.a(param0, 0, 0, 7, (byte) 125);
    }

    final boolean a(File param0, byte[] param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          var4 = new FileOutputStream(param0);
          var4.write(param1, 0, param1.length);
          var4.close();
          if (param2) {
            return true;
          }
          field_t = (String) null;
          return true;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
    }

    private final en a(int param0, boolean param1, String param2, int param3) {
        if (param3 < 10) {
          return (en) null;
        }
        return this.a(param2, 0, param0, !param1 ? 1 : 22, (byte) 125);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_60_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ls var3_ref = null;
          fs var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          en var8 = null;
          Object[] var9 = null;
          String var10 = null;
          java.awt.Frame var11 = null;
          java.awt.Component var12 = null;
          String var13 = null;
          Object[] var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_c) {
                if (null != this.field_w) {
                  var8 = this.field_w;
                  this.field_w = this.field_w.field_d;
                  if (this.field_w == null) {
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
                var2_int = var8.field_g;
                switch (var2_int) {
                  case 22:
                    if (field_u > kh.a(-107)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ls) null;
                      var8.field_f = dd.a((String) (var8.field_e), var8.field_c, -105).a((byte) 97);
                    } catch (ls decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ls) (Object) decompiledCaughtException;
                      var8.field_f = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_e));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_c);
                    var8.field_f = var18;
                    break;
                  case 8:
                    var17 = (Object[]) (var8.field_e);
                    if (this.field_q &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_f = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_q) {
                      throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (kh.a(-92) < field_u) {
                          throw new IOException();
                        }
                        var8.field_f = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                        break;
                      case 5:
                        if (this.field_p) {
                          var8.field_f = this.field_x.a(-116);
                        } else {
                          var8.field_f = Class.forName("il").getMethod("listmodes", new Class[]{}).invoke(this.field_m, new Object[]{});
                        }
                        break;
                      case 7:
                        if (this.field_p) {
                          this.field_x.a((java.awt.Frame) (var8.field_e), -70);
                        } else {
                          Class.forName("il").getMethod("exit", new Class[]{}).invoke(this.field_m, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref2 = rk.a((String) (var8.field_e), field_v, (byte) -97, field_t);
                        var8.field_f = var3_ref2;
                        break;
                      case 13:
                        var3_ref2 = rk.a((String) (var8.field_e), field_v, (byte) -97, "");
                        var8.field_f = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_q &&
                          var2_int == 14) {
                          var3_int = var8.field_c;
                          var4 = var8.field_b;
                          if (this.field_p) {
                            this.field_d.a(0, var3_int, var4);
                          } else {
                            Class.forName("wr").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_q &&
                          var2_int == 15) {
                          stackIn_60_0 = (var8.field_c == 0) ? 0 : 1;
                          var3_int = stackIn_60_0;
                          var12 = (java.awt.Component) (var8.field_e);
                          if (this.field_p) {
                            this.field_d.a(var3_int != 0, var12, -4);
                          } else {
                            Class.forName("wr").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_p &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.field_e);
                          Class.forName("wr").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var14[0], var14[1], new Integer(var8.field_c), new Integer(var8.field_b), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_f.startsWith("win")) {
                              throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var13 = (String) (var8.field_e);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var13.charAt(var5)) == -1) {
                                throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_f = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_f = var3_ref3;
                            throw rk.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 6:
                        var11 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_f = var11;
                        var11.setResizable(false);
                        if (!this.field_p) {
                          Class.forName("il").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{var11, new Integer(var8.field_c >>> 16), new Integer(var8.field_c & 65535), new Integer(var8.field_b >> 16), new Integer(var8.field_b & 65535)});
                        } else {
                          this.field_x.a(var8.field_c >>> 16, 17, var11, 65535 & var8.field_c, var8.field_b >> 16, 65535 & var8.field_b);
                        }
                        break;
                      case 3:
                        if (kh.a(-87) < field_u) {
                          throw new IOException();
                        }
                        var10 = (var8.field_c >> 24 & 255) + "." + ((16746416 & var8.field_c) >> 16) + "." + (255 & var8.field_c >> 8) + "." + (var8.field_c & 255);
                        var8.field_f = java.net.InetAddress.getByName(var10).getHostName();
                        break;
                    }
                    break;
                  case 9:
                    var9 = (Object[]) (var8.field_e);
                    if (this.field_q &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                    break;
                  case 4:
                    if (kh.a(-59) < field_u) {
                      throw new IOException();
                    }
                    var8.field_f = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                    break;
                  case 1:
                    if (kh.a(-101) < field_u) {
                      throw new IOException();
                    }
                    var8.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_c);
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

    final en a(int param0, int param1, Runnable param2) {
        if (param1 != 1048576) {
          java.net.URL var5 = (java.net.URL) null;
          this.a((byte) 49, (java.net.URL) null);
        }
        return this.a(param2, 0, param0, 2, (byte) 117);
    }

    final void b(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_c = true;
            if (param0 >= -99) {
              return;
            }
            this.notifyAll();
          }
          try {
            this.field_s.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_n) {
            try {
              this.field_n.a(19260);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_a) {
            try {
              this.field_a.a(19260);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_r != null) {
            for (var2_int = 0; this.field_r.length > var2_int; var2_int++) {
              if (this.field_r[var2_int] != null) {
                try {
                  this.field_r[var2_int].a(19260);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_g) {
            try {
              this.field_g.a(19260);
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

    final en a(Class param0, Class[] param1, String param2, boolean param3) {
        if (!param3) {
          return (en) null;
        }
        return this.a(new Object[]{param0, param2, param1}, 0, 0, 8, (byte) 61);
    }

    final en a(int param0) {
        if (param0 != 255) {
          String var3 = (String) null;
          this.a((Class) null, (Class[]) null, (String) null, false);
        }
        return this.a((Object) null, 0, 0, 5, (byte) 56);
    }

    private final static fs a(String param0, int param1, byte param2, String param3) {
        try {
          int var6 = 0;
          fs stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          fs var8 = null;
          Exception var8_ref = null;
          if (param2 != -97) {
            return (fs) null;
          }
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new fs(new File(var7, var4), "rw", 10000L);
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

    final boolean a(byte param0) {
        if (param0 != 84) {
          this.run();
        }
        if (!this.field_q) {
          return false;
        }
        if (this.field_p) {
          return this.field_x != null ? true : false;
        }
        return this.field_m != null ? true : false;
    }

    final en a(String param0, Class param1, int param2) {
        if (param2 != 9) {
          return (en) null;
        }
        return this.a(new Object[]{param1, param0}, 0, 0, 9, (byte) 87);
    }

    final en a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -79) {
          this.field_x = (pc) null;
        }
        return this.a((Object) null, param2 + (param4 << 16), param3 + (param0 << 16), 6, (byte) 83);
    }

    final en a(int param0, String param1, int param2) {
        if (param0 != 2) {
          this.field_d = (fi) null;
        }
        return this.a(param2, false, param1, param0 + 114);
    }

    final en a(byte param0, java.net.URL param1) {
        if (param0 < 55) {
          this.field_w = (en) null;
        }
        return this.a(param1, 0, 0, 4, (byte) 58);
    }

    private final en a(Object param0, int param1, int param2, int param3, byte param4) {
        en var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new en();
        var6.field_e = param0;
        var6.field_b = param1;
        var6.field_g = param3;
        var6.field_c = param2;
        var7 = this;
        synchronized (var7) {
          if (this.field_b == null) {
            this.field_w = var6;
            this.field_b = var6;
          } else {
            this.field_b.field_d = var6;
            this.field_b = var6;
          }
          this.notify();
        }
        if (param4 <= 54) {
          this.a(47, -115, 69, 14, 3);
        }
        return var6;
    }

    rk(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        int var8 = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        pc var10 = null;
        ThreadGroup var11 = null;
        ThreadGroup var12 = null;
        this.field_b = null;
        this.field_w = null;
        this.field_g = null;
        this.field_p = false;
        this.field_a = null;
        this.field_n = null;
        this.field_c = false;
        this.field_q = false;
        stackIn_3_1 = (param3);
        this.field_q = stackIn_3_1;
        field_l = "1.1";
        field_t = param1;
        field_o = "Unknown";
        field_v = param0;
        try {
          field_o = System.getProperty("java.vendor");
          field_l = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.field_p = true;
        }
        try {
          field_k = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_k = "Unknown";
        }
        field_f = field_k.toLowerCase();
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
          field_i = System.getProperty("user.home");
          if (null != field_i) {
            field_i = field_i + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_i) {
          field_i = "~/";
        }
        try {
          this.field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_p) {
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
        qc.a(field_t, field_v, 73);
        if (this.field_q) {
          this.field_g = new fs(qc.a("random.dat", 1, field_v, (String) null), "rw", 25L);
          this.field_n = new fs(qc.a(true, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_a = new fs(qc.a(true, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_r = new fs[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_r[var5_int] = new fs(qc.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_p) {
            try {
              Class.forName("f").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_p) {
              this.field_m = Class.forName("il").newInstance();
            } else {
              var10 = new pc();
              this.field_x = var10;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_p) {
              this.field_d = new fi();
            } else {
              this.field_h = Class.forName("wr").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        if (this.field_q &&
          !this.field_p) {
          var11 = Thread.currentThread().getThreadGroup();
          var5 = var11;
          var6 = var11.getParent();
          while (var6 != null) {
            var12 = var6;
            var5 = var12;
            var6 = var12.getParent();
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
        this.field_c = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    static {
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
