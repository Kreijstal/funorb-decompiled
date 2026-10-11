/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fia implements Runnable {
    private Object field_i;
    boolean field_c;
    private static int field_d;
    ml field_x;
    private Thread field_m;
    private static volatile long field_o;
    ml[] field_h;
    private naa field_l;
    private boolean field_f;
    private static String field_s;
    static String field_j;
    private Object field_t;
    ml field_n;
    java.awt.EventQueue field_r;
    private sp field_w;
    private qj field_g;
    static java.lang.reflect.Method field_b;
    private static String field_u;
    ml field_q;
    static String field_v;
    boolean field_p;
    static String field_e;
    private naa field_k;
    private static String field_a;

    final naa a(java.net.URL param0, int param1) {
        if (param1 < 69) {
          return (naa) null;
        }
        return this.a(0, 0, (byte) 104, param0, 4);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_84_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          wra var3_ref = null;
          ml var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          naa var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          String var11 = null;
          java.awt.Frame var12 = null;
          Object[] var13 = null;
          String var14 = null;
          java.awt.Component var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_f) {
                if (this.field_l != null) {
                  var8 = this.field_l;
                  this.field_l = this.field_l.field_g;
                  if (null == this.field_l) {
                    this.field_k = null;
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
                    if (bva.b((byte) -107) < field_o) {
                      throw new IOException();
                    }
                    var8.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_e);
                    break;
                  case 22:
                    if (field_o > bva.b((byte) -107)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (wra) null;
                      var8.field_f = hg.a((String) (var8.field_c), var8.field_e, false).a(25927);
                    } catch (wra decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (wra) (Object) decompiledCaughtException;
                      var8.field_f = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_c));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_e);
                    var8.field_f = var18;
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_c);
                    if (this.field_c &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_c) {
                      throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (!this.field_p) {
                          var8.field_f = Class.forName("pj").getMethod("listmodes", new Class[]{}).invoke(this.field_i, new Object[]{});
                        } else {
                          var8.field_f = this.field_w.a((byte) 52);
                        }
                        break;
                      case 12:
                        var3_ref2 = fia.a(-20529, field_d, (String) (var8.field_c), field_u);
                        var8.field_f = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.field_c &&
                          14 == var2_int) {
                          var3_int = var8.field_e;
                          var4 = var8.field_d;
                          if (this.field_p) {
                            this.field_g.a(0, var3_int, var4);
                          } else {
                            Class.forName("kfa").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_c &&
                          15 == var2_int) {
                          stackIn_84_0 = (var8.field_e == 0) ? 0 : 1;
                          var3_int = stackIn_84_0;
                          var15 = (java.awt.Component) (var8.field_c);
                          if (!this.field_p) {
                            Class.forName("kfa").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_t, new Object[]{var15, new Boolean(var3_int != 0)});
                          } else {
                            this.field_g.a(var3_int != 0, -54, var15);
                          }
                          break;
                        }
                        if (!this.field_p &&
                          17 == var2_int) {
                          var13 = (Object[]) (var8.field_c);
                          Class.forName("kfa").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_t, new Object[]{var13[0], var13[1], new Integer(var8.field_e), new Integer(var8.field_d), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_j.startsWith("win")) {
                              throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var14 = (String) (var8.field_c);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var14.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_f = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.field_f = var3_ref3;
                            throw fia.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = fia.a(-20529, field_d, (String) (var8.field_c), "");
                        var8.field_f = var3_ref2;
                        break;
                      case 7:
                        if (!this.field_p) {
                          Class.forName("pj").getMethod("exit", new Class[]{}).invoke(this.field_i, new Object[]{});
                        } else {
                          this.field_w.a((java.awt.Frame) (var8.field_c), (byte) -108);
                        }
                        break;
                      case 6:
                        var12 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_f = var12;
                        var12.setResizable(false);
                        if (this.field_p) {
                          this.field_w.a(var12, var8.field_e >>> 16, var8.field_d >> 16, var8.field_d & 65535, var8.field_e & 65535, true);
                        } else {
                          Class.forName("pj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_i, new Object[]{var12, new Integer(var8.field_e >>> 16), new Integer(65535 & var8.field_e), new Integer(var8.field_d >> 16), new Integer(var8.field_d & 65535)});
                        }
                        break;
                      case 21:
                        if (bva.b((byte) -107) < field_o) {
                          throw new IOException();
                        }
                        var8.field_f = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 3:
                        if (bva.b((byte) -107) < field_o) {
                          throw new IOException();
                        }
                        var11 = (255 & var8.field_e >> 24) + "." + ((16739670 & var8.field_e) >> 16) + "." + (var8.field_e >> 8 & 255) + "." + (255 & var8.field_e);
                        var8.field_f = java.net.InetAddress.getByName(var11).getHostName();
                        break;
                    }
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_f = var10.getContents((Object) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_c);
                    if (this.field_c &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_f = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_o > bva.b((byte) -107)) {
                      throw new IOException();
                    }
                    var8.field_f = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
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

    final naa a(int param0, String param1, int param2) {
        if (param0 != -24818) {
          java.awt.datatransfer.Transferable var5 = (java.awt.datatransfer.Transferable) null;
          this.a((byte) 92, (java.awt.datatransfer.Transferable) null);
        }
        return this.a(param0 + 24819, param1, false, param2);
    }

    final naa a(int param0, String param1, Class param2) {
        if (param0 != 10355) {
          String var5 = (String) null;
          fia.a(-73, 85, (String) null, (String) null);
        }
        return this.a(0, 0, (byte) 104, new Object[]{param2, param1}, 9);
    }

    private final naa a(int param0, String param1, boolean param2, int param3) {
        if (param0 != 1) {
          String var6 = (String) null;
          fia.a(-120, 43, (String) null, (String) null);
        }
        return this.a(param3, 0, (byte) 104, param1, param2 ? 22 : 1);
    }

    final naa a(int param0, Class[] param1, String param2, Class param3) {
        if (param0 != 26868) {
          this.field_i = (Object) null;
        }
        return this.a(0, 0, (byte) 104, new Object[]{param3, param2, param1}, 8);
    }

    final boolean a(byte param0) {
        if (!this.field_c) {
          return false;
        }
        if (param0 != 69) {
          this.field_r = (java.awt.EventQueue) null;
        }
        if (this.field_p) {
          return this.field_w != null ? true : false;
        }
        return null != this.field_i ? true : false;
    }

    final void b(byte param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          java.awt.Frame var4 = null;
          var2 = this;
          synchronized (var2) {
            this.field_f = true;
            this.notifyAll();
          }
          if (param0 != 59) {
            var4 = (java.awt.Frame) null;
            this.a((java.awt.Frame) null, 58);
          }
          try {
            this.field_m.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_n) {
            try {
              this.field_n.b((byte) -112);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_q) {
            try {
              this.field_q.b((byte) -77);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_h != null) {
            for (var2_int = 0; var2_int < this.field_h.length; var2_int++) {
              if (null != this.field_h[var2_int]) {
                try {
                  this.field_h[var2_int].b((byte) -101);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_x != null) {
            try {
              this.field_x.b((byte) -101);
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

    private final static ml a(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          ml stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          ml var8 = null;
          Exception var8_ref = null;
          if (33 != param1) {
            if (param1 == 34) {
              var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 != -20529) {
            return (ml) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new ml(new File(var7, var4), "rw", 10000L);
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

    final naa a(int param0) {
        if (param0 > -87) {
          return (naa) null;
        }
        return this.a(0, 0, (byte) 104, (Object) null, 5);
    }

    final naa a(java.awt.Frame param0, int param1) {
        if (param1 != 18885) {
          return (naa) null;
        }
        return this.a(0, 0, (byte) 104, param0, 7);
    }

    private final naa a(int param0, int param1, byte param2, Object param3, int param4) {
        naa var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param2 != 104) {
          return (naa) null;
        }
        var6 = new naa();
        var6.field_e = param0;
        var6.field_d = param1;
        var6.field_a = param4;
        var6.field_c = param3;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_k) {
            this.field_k.field_g = var6;
            this.field_k = var6;
          } else {
            this.field_l = var6;
            this.field_k = var6;
          }
          this.notify();
        }
        return var6;
    }

    final naa a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != 66) {
          return (naa) null;
        }
        return this.a(param2 + (param4 << 16), param1 + (param0 << 16), (byte) 104, (Object) null, 6);
    }

    final naa a(Runnable param0, int param1, int param2) {
        if (param1 != 425) {
          this.field_h = (ml[]) null;
        }
        return this.a(param2, 0, (byte) 104, param0, 2);
    }

    final boolean a(byte[] param0, File param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          var4 = new FileOutputStream(param1);
          var4.write(param0, 0, param0.length);
          if (!param2) {
            return false;
          }
          var4.close();
          return true;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
    }

    final naa a(byte param0, java.awt.datatransfer.Transferable param1) {
        if (param0 <= 56) {
          this.a(96);
        }
        return this.a(0, 0, (byte) 104, param1, 19);
    }

    final naa b(int param0) {
        if (param0 <= 104) {
          return (naa) null;
        }
        return this.a(0, 0, (byte) 104, (Object) null, 18);
    }

    fia(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        int var8 = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        sp var9 = null;
        ThreadGroup var10 = null;
        ThreadGroup var11 = null;
        this.field_c = false;
        this.field_x = null;
        this.field_l = null;
        this.field_n = null;
        this.field_f = false;
        this.field_p = false;
        this.field_k = null;
        this.field_q = null;
        field_d = param0;
        field_u = param1;
        field_e = "Unknown";
        field_v = "1.1";
        stackIn_3_1 = (param3);
        this.field_c = stackIn_3_1;
        try {
          field_e = System.getProperty("java.vendor");
          field_v = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_e.toLowerCase().indexOf("microsoft")) {
          this.field_p = true;
        }
        try {
          field_s = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_s = "Unknown";
        }
        field_j = field_s.toLowerCase();
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
          field_a = System.getProperty("user.home");
          if (field_a != null) {
            field_a = field_a + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_a) {
          field_a = "~/";
        }
        try {
          this.field_r = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        iba.a(field_d, -70, field_u);
        if (this.field_c) {
          this.field_x = new ml(iba.a((String) null, "random.dat", 0, field_d), "rw", 25L);
          this.field_n = new ml(iba.a("main_file_cache.dat2", (byte) -71), "rw", 314572800L);
          this.field_q = new ml(iba.a("main_file_cache.idx255", (byte) -123), "rw", 1048576L);
          this.field_h = new ml[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_h[var5_int] = new ml(iba.a("main_file_cache.idx" + var5_int, (byte) -108), "rw", 1048576L);
          }
          if (this.field_p) {
            try {
              Class.forName("nva").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_p) {
              this.field_i = Class.forName("pj").newInstance();
            } else {
              var9 = new sp();
              this.field_w = var9;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_p) {
              this.field_t = Class.forName("kfa").newInstance();
            } else {
              this.field_g = new qj();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        if (this.field_c &&
          !this.field_p) {
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
          for (var8 = 0; var7.length > var8; var8++) {
            if (null != var7[var8] &&
              var7[var8].getName().startsWith("AWT")) {
              var7[var8].setPriority(1);
            }
          }
        }
        this.field_f = false;
        this.field_m = new Thread((Runnable) (this));
        this.field_m.setPriority(10);
        this.field_m.setDaemon(true);
        this.field_m.start();
    }

    static {
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
