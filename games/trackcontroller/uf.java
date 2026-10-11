/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf implements Runnable {
    private tb field_w;
    tc field_p;
    private Thread field_u;
    static String field_e;
    private boolean field_r;
    private ul field_j;
    private static String field_a;
    private Object field_d;
    java.awt.EventQueue field_i;
    static java.lang.reflect.Method field_m;
    private static String field_h;
    boolean field_l;
    private Object field_f;
    tc[] field_q;
    private boolean field_c;
    tc field_t;
    tc field_v;
    private static int field_s;
    private static String field_x;
    static String field_g;
    static String field_b;
    private ce field_k;
    private ce field_n;
    private static volatile long field_o;

    final ce a(boolean param0, java.net.URL param1) {
        if (param0) {
          Class var4 = (Class) null;
          this.a((String) null, (Class[]) null, -97, (Class) null);
        }
        return this.a(0, 1484280784, param1, 0, 4);
    }

    final boolean b(int param0) {
        if (!this.field_l) {
          return false;
        }
        if (param0 != -4) {
          return false;
        }
        if (!this.field_c) {
          return null != this.field_d ? true : false;
        }
        return this.field_j != null ? true : false;
    }

    final ce a(int param0, int param1, String param2) {
        if (param0 <= 14) {
          String var5 = (String) null;
          this.a(-124, 6, (String) null);
        }
        return this.a(false, param1, param2, (byte) -126);
    }

    final ce a(int param0, Runnable param1, int param2) {
        if (param2 < 0) {
          return (ce) null;
        }
        return this.a(0, 1484280784, param1, param0, 2);
    }

    final ce a(String param0, Class[] param1, int param2, Class param3) {
        if (param2 != 0) {
          field_h = (String) null;
        }
        return this.a(0, 1484280784, new Object[]{param3, param0, param1}, 0, 8);
    }

    private final ce a(boolean param0, int param1, String param2, byte param3) {
        if (param3 > -124) {
          field_g = (String) null;
        }
        return this.a(0, 1484280784, param2, param1, !param0 ? 1 : 22);
    }

    final ce a(java.awt.Frame param0, int param1) {
        if (param1 > -15) {
          return (ce) null;
        }
        return this.a(0, 1484280784, param0, 0, 7);
    }

    final ce a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 54) {
          Class var7 = (Class) null;
          this.a((String) null, (Class[]) null, 110, (Class) null);
        }
        return this.a((param1 << 16) + param2, 1484280784, (Object) null, param4 + (param3 << 16), 6);
    }

    private final static tc a(String param0, int param1, int param2, String param3) {
        try {
          int var6 = 0;
          tc stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          tc var8 = null;
          Exception var8_ref = null;
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param2 <= 33) {
            field_g = (String) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new tc(new File(var7, var4), "rw", 10000L);
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

    final ce a(int param0, String param1, Class param2) {
        if (param0 != -26462) {
          this.run();
        }
        return this.a(0, 1484280784, new Object[]{param2, param1}, 0, 9);
    }

    final void a(byte param0) {
        try {
          InterruptedException interruptedException = null;
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref_Object = null;
          IOException var3 = null;
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            this.field_r = true;
            this.notifyAll();
          }
          try {
            this.field_u.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.a(-31576);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_v != null) {
            try {
              this.field_v.a(-31576);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_q != null) {
            for (var2 = 0; var2 < this.field_q.length; var2++) {
              if (this.field_q[var2] != null) {
                try {
                  this.field_q[var2].a(-31576);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_p != null) {
            try {
              this.field_p.a(-31576);
            } catch (java.io.IOException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          var2 = -30 / ((1 - param0) / 47);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final ce a(int param0, int param1, Object param2, int param3, int param4) {
        ce var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new ce();
        if (param1 != 1484280784) {
          var9 = (String) null;
          this.a(21, 107, (String) null);
        }
        var6.field_c = param2;
        var6.field_d = param0;
        var6.field_g = param4;
        var6.field_b = param3;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_n) {
            this.field_n.field_a = var6;
            this.field_n = var6;
          } else {
            this.field_k = var6;
            this.field_n = var6;
          }
          this.notify();
        }
        return var6;
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_85_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          tc var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          dj var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          ce var8 = null;
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
              while (!this.field_r) {
                if (null != this.field_k) {
                  var8 = this.field_k;
                  this.field_k = this.field_k.field_a;
                  if (this.field_k == null) {
                    this.field_n = null;
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
                  case 1:
                    if (qg.a(false) < field_o) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_b);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_c));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_b);
                    var8.field_e = var18;
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_c);
                    if (this.field_l &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var16.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_l) {
                      throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (qg.a(false) < field_o) {
                          throw new IOException();
                        }
                        var15 = (var8.field_b >> 24 & 255) + "." + (255 & var8.field_b >> 16) + "." + ((65479 & var8.field_b) >> 8) + "." + (255 & var8.field_b);
                        var8.field_e = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 21:
                        if (field_o > qg.a(false)) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var14;
                        var14.setResizable(false);
                        if (this.field_c) {
                          this.field_j.a(65535 & var8.field_b, var8.field_d >> 16, var8.field_b >>> 16, false, var14, var8.field_d & 65535);
                        } else {
                          Class.forName("eg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{var14, new Integer(var8.field_b >>> 16), new Integer(var8.field_b & 65535), new Integer(var8.field_d >> 16), new Integer(var8.field_d & 65535)});
                        }
                        break;
                      case 12:
                        var3_ref = uf.a((String) (var8.field_c), field_s, 40, field_a);
                        var8.field_e = var3_ref;
                        break;
                      case 13:
                        var3_ref = uf.a((String) (var8.field_c), field_s, 124, "");
                        var8.field_e = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_l &&
                          var2_int == 14) {
                          var3_int = var8.field_b;
                          var4_int = var8.field_d;
                          if (!this.field_c) {
                            Class.forName("wc").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_w.a(31942, var3_int, var4_int);
                          }
                          break;
                        }
                        if (this.field_l &&
                          var2_int == 15) {
                          stackIn_85_0 = (var8.field_b == 0) ? 0 : 1;
                          var3_int = stackIn_85_0;
                          var13 = (java.awt.Component) (var8.field_c);
                          if (!this.field_c) {
                            Class.forName("wc").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_f, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_w.a(var3_int != 0, var13, 5745);
                          }
                          break;
                        }
                        if (!this.field_c &&
                          var2_int == 17) {
                          var11 = (Object[]) (var8.field_c);
                          Class.forName("wc").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_f, new Object[]{var11[0], var11[1], new Integer(var8.field_b), new Integer(var8.field_d), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                          }
                          try {
                            if (!field_b.startsWith("win")) {
                              throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var12 = (String) (var8.field_c);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var12.length(); var5++) {
                              if (var4.indexOf((int) var12.charAt(var5)) == -1) {
                                throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref2;
                            throw uf.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                          }
                        }
                        break;
                      case 7:
                        if (this.field_c) {
                          this.field_j.a((byte) -2, (java.awt.Frame) (var8.field_c));
                        } else {
                          Class.forName("eg").getMethod("exit", new Class[]{}).invoke(this.field_d, new Object[]{});
                        }
                        break;
                      case 5:
                        if (this.field_c) {
                          var8.field_e = this.field_j.a(0);
                        } else {
                          var8.field_e = Class.forName("eg").getMethod("listmodes", new Class[]{}).invoke(this.field_d, new Object[]{});
                        }
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_c);
                    if (this.field_l &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (qg.a(false) < field_o) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                    break;
                  case 22:
                    if (field_o > qg.a(false)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (dj) null;
                      var8.field_e = oj.a((String) (var8.field_c), var8.field_b, 0).c(-118);
                    } catch (dj decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (dj) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
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

    final ce a(int param0) {
        if (param0 <= 33) {
          return (ce) null;
        }
        return this.a(0, 1484280784, (Object) null, 0, 5);
    }

    uf(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ul var6 = null;
        this.field_p = null;
        this.field_l = false;
        this.field_r = false;
        this.field_c = false;
        this.field_v = null;
        this.field_t = null;
        this.field_n = null;
        this.field_k = null;
        field_a = param1;
        field_g = "1.1";
        stackIn_3_1 = (param3);
        this.field_l = stackIn_3_1;
        field_e = "Unknown";
        field_s = param0;
        try {
          field_e = System.getProperty("java.vendor");
          field_g = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_e.toLowerCase().indexOf("microsoft") != -1) {
          this.field_c = true;
        }
        try {
          field_h = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_h = "Unknown";
        }
        field_b = field_h.toLowerCase();
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
          field_x = System.getProperty("user.home");
          if (null != field_x) {
            field_x = field_x + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_x) {
          field_x = "~/";
        }
        try {
          this.field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_c) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        tj.a(field_s, field_a, (byte) -119);
        if (this.field_l) {
          this.field_p = new tc(tj.a(field_s, (byte) 78, (String) null, "random.dat"), "rw", 25L);
          this.field_t = new tc(tj.a((byte) -61, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_v = new tc(tj.a((byte) -61, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_q = new tc[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_q[var5_int] = new tc(tj.a((byte) -61, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.field_c) {
            try {
              Class.forName("ph").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.field_c) {
              var6 = new ul();
              this.field_j = var6;
            } else {
              this.field_d = Class.forName("eg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_c) {
              this.field_w = new tb();
            } else {
              this.field_f = Class.forName("wc").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_r = false;
        this.field_u = new Thread((Runnable) (this));
        this.field_u.setPriority(10);
        this.field_u.setDaemon(true);
        this.field_u.start();
    }

    static {
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
