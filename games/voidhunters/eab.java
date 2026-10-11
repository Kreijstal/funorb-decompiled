/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eab implements Runnable {
    private tlb field_e;
    static String field_s;
    boolean field_j;
    private mob field_u;
    private Thread field_p;
    au field_d;
    au field_o;
    private static int field_b;
    au field_t;
    private static String field_v;
    private mob field_f;
    private Object field_a;
    private static volatile long field_h;
    private eea field_x;
    private Object field_c;
    static java.lang.reflect.Method field_q;
    private static String field_m;
    static String field_r;
    private static String field_i;
    static String field_w;
    boolean field_k;
    au[] field_l;
    private boolean field_g;
    java.awt.EventQueue field_n;

    final mob a(int param0, int param1, Runnable param2) {
        mob discarded$0 = null;
        if (param0 != 0) {
          Object var5 = (Object) null;
          discarded$0 = this.a((byte) -95, 5, 55, 125, (Object) null);
        }
        return this.a((byte) -107, 2, param1, 0, param2);
    }

    final mob a(java.awt.Component param0, boolean param1, byte param2) {
        if (param2 > -92) {
          java.awt.datatransfer.Transferable var5 = (java.awt.datatransfer.Transferable) null;
          this.a((byte) 95, (java.awt.datatransfer.Transferable) null);
        }
        return this.a((byte) -107, 15, param1 ? 1 : 0, 0, param0);
    }

    final boolean a(int param0) {
        if (!this.field_k) {
          return false;
        }
        if (param0 != 0) {
          return true;
        }
        if (!this.field_j) {
          return this.field_c != null ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final mob a(String param0, Class param1, int param2) {
        if (param2 != -6576) {
          String var5 = (String) null;
          this.a(-99, (String) null, -92);
        }
        return this.a((byte) -107, 9, 0, 0, new Object[]{param1, param0});
    }

    private final mob a(int param0, boolean param1, byte param2, String param3) {
        if (param2 != 85) {
          return (mob) null;
        }
        return this.a((byte) -107, !param1 ? 1 : 22, param0, 0, param3);
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
            this.field_g = true;
            this.notifyAll();
          }
          try {
            this.field_p.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_d != null) {
            try {
              this.field_d.a(false);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_t != null) {
            try {
              this.field_t.a(false);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_l != null) {
            for (var2_int = 0; this.field_l.length > var2_int; var2_int++) {
              if (this.field_l[var2_int] != null) {
                try {
                  this.field_l[var2_int].a(false);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (param0 != 0) {
            this.field_d = (au) null;
          }
          if (null != this.field_o) {
            try {
              this.field_o.a(false);
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

    final mob a(Class[] param0, byte param1, Class param2, String param3) {
        if (param1 < 12) {
          Runnable var6 = (Runnable) null;
          this.a(2, 98, (Runnable) null);
        }
        return this.a((byte) -107, 8, 0, 0, new Object[]{param2, param3, param0});
    }

    private final mob a(byte param0, int param1, int param2, int param3, Object param4) {
        mob var6 = null;
        java.awt.Frame var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param0 != -107) {
          var9 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, (byte) 92);
        }
        var6 = new mob();
        var6.field_b = param4;
        var6.field_c = param1;
        var6.field_e = param3;
        var6.field_a = param2;
        var7 = this;
        synchronized (var7) {
          if (this.field_u == null) {
            this.field_f = var6;
            this.field_u = var6;
          } else {
            this.field_u.field_g = var6;
            this.field_u = var6;
          }
          this.notify();
        }
        return var6;
    }

    final mob a(java.net.URL param0, int param1) {
        if (param1 < 90) {
          return (mob) null;
        }
        return this.a((byte) -107, 4, 0, 0, param0);
    }

    final mob a(byte param0, java.awt.datatransfer.Transferable param1) {
        if (param0 != -45) {
          this.a(-33);
        }
        return this.a((byte) -107, 19, 0, 0, param1);
    }

    final mob a(int param0, String param1, int param2) {
        int var4 = -31 % ((-10 - param2) / 45);
        return this.a(param0, false, (byte) 85, param1);
    }

    final mob a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 4) {
          this.field_x = (eea) null;
        }
        return this.a((byte) -107, 6, (param3 << 16) + param0, (param2 << 16) + param4, (Object) null);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_81_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ndb var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          au var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          mob var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          Object[] var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_g) {
                if (this.field_f != null) {
                  var8 = this.field_f;
                  this.field_f = this.field_f.field_g;
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
                  var3 = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              if (decompiledFrameCompleted0) {
                return;
              }
            }
            try {
              {
                var2_int = var8.field_c;
                switch (var2_int) {
                  case 22:
                    if (wt.a(false) < field_h) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ndb) null;
                      var8.field_d = ppb.a((String) (var8.field_b), var8.field_a, (byte) -112).a(2048);
                    } catch (ndb decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ndb) (Object) decompiledCaughtException;
                      var8.field_d = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_b));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_a);
                    var8.field_d = var18;
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_b);
                    if (this.field_k &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_k) {
                      throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (wt.a(false) < field_h) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.field_a >> 24) + "." + ((var8.field_a & 16719400) >> 16) + "." + (255 & var8.field_a >> 8) + "." + (var8.field_a & 255);
                        var8.field_d = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (!this.field_j) {
                          var8.field_d = Class.forName("rk").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          var8.field_d = this.field_x.a(false);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_d = var14;
                        var14.setResizable(false);
                        if (this.field_j) {
                          this.field_x.a(-70, var14, var8.field_e >> 16, var8.field_a >>> 16, var8.field_e & 65535, var8.field_a & 65535);
                        } else {
                          Class.forName("rk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var14, new Integer(var8.field_a >>> 16), new Integer(var8.field_a & 65535), new Integer(var8.field_e >> 16), new Integer(var8.field_e & 65535)});
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_k &&
                          var2_int == 14) {
                          var3_int = var8.field_a;
                          var4 = var8.field_e;
                          if (!this.field_j) {
                            Class.forName("jg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_a, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_e.a(var4, var3_int, (byte) -122);
                          }
                          break;
                        }
                        if (this.field_k &&
                          15 == var2_int) {
                          stackIn_81_0 = (0 == var8.field_a) ? 0 : 1;
                          var3_int = stackIn_81_0;
                          var13 = (java.awt.Component) (var8.field_b);
                          if (!this.field_j) {
                            Class.forName("jg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_a, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_e.a(var13, -4, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.field_j &&
                          17 == var2_int) {
                          var11 = (Object[]) (var8.field_b);
                          Class.forName("jg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_a, new Object[]{var11[0], var11[1], new Integer(var8.field_a), new Integer(var8.field_e), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_s.startsWith("win")) {
                              throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var12 = (String) (var8.field_b);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var12.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var12.charAt(var5)) == -1) {
                                throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_d = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref2;
                            throw eab.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref3 = eab.a(field_b, "", (byte) -127, (String) (var8.field_b));
                        var8.field_d = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = eab.a(field_b, field_m, (byte) -128, (String) (var8.field_b));
                        var8.field_d = var3_ref3;
                        break;
                      case 7:
                        if (this.field_j) {
                          this.field_x.a(-76, (java.awt.Frame) (var8.field_b));
                        } else {
                          Class.forName("rk").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                        }
                        break;
                      case 21:
                        if (wt.a(false) < field_h) {
                          throw new IOException();
                        }
                        var8.field_d = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                        break;
                    }
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_d = var10.getContents((Object) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_b);
                    if (this.field_k &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_d = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_h > wt.a(false)) {
                      throw new IOException();
                    }
                    var8.field_d = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                    break;
                  case 1:
                    if (wt.a(false) < field_h) {
                      throw new IOException();
                    }
                    var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_a);
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

    private final static au a(int param0, String param1, byte param2, String param3) {
        try {
          int var6 = 0;
          au stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          au var8 = null;
          Exception var8_ref = null;
          if (param2 >= -126) {
            return (au) null;
          }
          if (param0 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
          } else {
            if (param0 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new au(new File(var7, var4), "rw", 10000L);
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

    final boolean a(byte[] param0, byte param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          var4 = new FileOutputStream(param2);
          var4.write(param0, 0, param0.length);
          if (param1 != 110) {
            field_m = (String) null;
          }
          var4.close();
          return true;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
    }

    final mob a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.Point var5 = param0.getLocationOnScreen();
        if (param3 != 14) {
          java.awt.Component var6 = (java.awt.Component) null;
          this.a((java.awt.Component) null, true, (byte) 77);
        }
        return this.a((byte) -107, 14, var5.x + param2, var5.y + param1, (Object) null);
    }

    final mob c(int param0) {
        if (param0 < 91) {
          return (mob) null;
        }
        return this.a((byte) -107, 18, 0, 0, (Object) null);
    }

    final mob a(java.awt.Frame param0, byte param1) {
        int var3 = -90 % ((param1 + 51) / 55);
        return this.a((byte) -107, 7, 0, 0, param0);
    }

    final mob d(int param0) {
        if (param0 <= 84) {
          return (mob) null;
        }
        return this.a((byte) -107, 5, 0, 0, (Object) null);
    }

    eab(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        int var8 = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        eea var10 = null;
        ThreadGroup var11 = null;
        ThreadGroup var12 = null;
        this.field_u = null;
        this.field_d = null;
        this.field_t = null;
        this.field_j = false;
        this.field_o = null;
        this.field_g = false;
        this.field_f = null;
        this.field_k = false;
        field_m = param1;
        field_r = "1.1";
        stackIn_3_1 = (param3);
        this.field_k = stackIn_3_1;
        field_b = param0;
        field_w = "Unknown";
        try {
          field_w = System.getProperty("java.vendor");
          field_r = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_w.toLowerCase().indexOf("microsoft") != -1) {
          this.field_j = true;
        }
        try {
          field_i = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_i = "Unknown";
        }
        field_s = field_i.toLowerCase();
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
          field_v = System.getProperty("user.home");
          if (field_v != null) {
            field_v = field_v + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_v == null) {
          field_v = "~/";
        }
        try {
          this.field_n = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        lfb.a(field_b, -109, field_m);
        if (this.field_k) {
          this.field_o = new au(lfb.a("random.dat", -1, (String) null, field_b), "rw", 25L);
          this.field_d = new au(lfb.a("main_file_cache.dat2", (byte) 34), "rw", 314572800L);
          this.field_t = new au(lfb.a("main_file_cache.idx255", (byte) 34), "rw", 1048576L);
          this.field_l = new au[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_l[var5_int] = new au(lfb.a("main_file_cache.idx" + var5_int, (byte) 34), "rw", 1048576L);
          }
          if (this.field_j) {
            try {
              Class.forName("dna").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_j) {
              var10 = new eea();
              this.field_x = var10;
            } else {
              this.field_c = Class.forName("rk").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_j) {
              this.field_e = new tlb();
            } else {
              this.field_a = Class.forName("jg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        if (this.field_k &&
          !this.field_j) {
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
          for (var8 = 0; var7.length > var8; var8++) {
            if (var7[var8] != null &&
              var7[var8].getName().startsWith("AWT")) {
              var7[var8].setPriority(1);
            }
          }
        }
        this.field_g = false;
        this.field_p = new Thread((Runnable) (this));
        this.field_p.setPriority(10);
        this.field_p.setDaemon(true);
        this.field_p.start();
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
