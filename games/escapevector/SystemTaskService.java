/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SystemTaskService implements Runnable {
    private boolean field_a;
    java.awt.EventQueue field_k;
    BoundedRandomAccessFile field_b;
    private ra field_i;
    private SystemTask field_c;
    private static volatile long field_n;
    boolean field_f;
    private static String field_l;
    private boolean field_m;
    private static String field_o;
    BoundedRandomAccessFile field_j;
    BoundedRandomAccessFile[] field_u;
    private Object field_h;
    private Object field_t;
    static String field_s;
    private SystemTask field_p;
    static String field_v;
    private fb field_d;
    private static int field_q;
    BoundedRandomAccessFile field_x;
    static java.lang.reflect.Method field_r;
    private Thread field_g;
    static String field_e;
    private static String field_w;

    private final SystemTask a(int param0, byte param1, String param2, boolean param3) {
        int var5 = -14 % ((param1 - 27) / 41);
        return this.a(param0, param2, -14572, param3 ? 22 : 1, 0);
    }

    final SystemTask a(String param0, Class param1, int param2) {
        if (param2 >= -52) {
          return (SystemTask) null;
        }
        return this.a(0, new Object[]{param1, param0}, -14572, 9, 0);
    }

    final boolean c(int param0) {
        if (param0 != 0) {
          this.b(-9);
        }
        if (!this.field_f) {
          return false;
        }
        if (this.field_m) {
          return this.field_i != null ? true : false;
        }
        return this.field_t != null ? true : false;
    }

    final SystemTask a(String param0, int param1, Class param2, Class[] param3) {
        int var5 = -101 % ((param1 + 41) / 55);
        return this.a(0, new Object[]{param2, param0, param3}, -14572, 8, 0);
    }

    private final static BoundedRandomAccessFile a(boolean param0, int param1, String param2, String param3) {
        try {
          String var4 = null;
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
          } else if (param1 == 34) {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
          }
          String[] var5 = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0) {
            String var9 = (String) null;
            SystemTaskService.a(true, 124, (String) null, (String) null);
          }
          for (int var6 = 0; var5.length > var6; var6++) {
            String var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                BoundedRandomAccessFile var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                BoundedRandomAccessFile stackIn_15_0 = var8;
                return stackIn_15_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                Exception var8_ref = (Exception) (Object) decompiledCaughtException;
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

    final SystemTask a(int param0, int param1, String param2) {
        if (param1 != 4) {
          java.awt.Frame var5 = (java.awt.Frame) null;
          this.a((byte) -72, (java.awt.Frame) null);
        }
        return this.a(param0, (byte) 82, param2, false);
    }

    public final void run() {
        try {
          Throwable decompiledCaughtException = null;
          BoundedRandomAccessFile var3_ref = null;
          int var3_int = 0;
          java.awt.datatransfer.Transferable var7 = null;
          SystemTask var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            Object var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_a) {
                if (null != this.field_c) {
                  var8 = this.field_c;
                  this.field_c = this.field_c.field_g;
                  if (this.field_c == null) {
                    this.field_p = null;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
                try {
                  this.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  InterruptedException var3 = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              if (decompiledFrameCompleted0) {
                return;
              }
            }
            try {
              {
                int var2_int = var8.field_e;
                switch (var2_int) {
                  case 2:
                    var18 = new Thread((Runnable) (var8.field_d));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.field_c);
                    var8.field_b = var18;
                    break;
                  case 9:
                    var17 = (Object[]) (var8.field_d);
                    if (this.field_f &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_d);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_f) {
                      throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_n > td.b(128)) {
                          throw new IOException();
                        }
                        var15 = (var8.field_c >> 24 & 255) + "." + ((var8.field_c & 16763005) >> 16) + "." + ((65512 & var8.field_c) >> 8) + "." + (var8.field_c & 255);
                        var8.field_b = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_b = var14;
                        var14.setResizable(false);
                        if (this.field_m) {
                          this.field_i.a(var14, var8.field_c & 65535, var8.field_a & 65535, var8.field_c >>> 16, -7976, var8.field_a >> 16);
                        } else {
                          Class.forName("FullscreenDisplayController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{var14, new Integer(var8.field_c >>> 16), new Integer(65535 & var8.field_c), new Integer(var8.field_a >> 16), new Integer(65535 & var8.field_a)});
                        }
                        break;
                      case 12:
                        var3_ref = SystemTaskService.a(false, field_q, (String) (var8.field_d), field_w);
                        var8.field_b = var3_ref;
                        break;
                      case 13:
                        var3_ref = SystemTaskService.a(false, field_q, (String) (var8.field_d), "");
                        var8.field_b = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.field_f &&
                          var2_int == 14) {
                          var3_int = var8.field_c;
                          int var4 = var8.field_a;
                          if (this.field_m) {
                            this.field_d.a(var4, var3_int, -11154);
                          } else {
                            Class.forName("vf").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.field_f &&
                          var2_int == 15) {
                          int stackIn_85_0 = (0 == var8.field_c) ? 0 : 1;
                          var3_int = stackIn_85_0;
                          java.awt.Component var13 = (java.awt.Component) (var8.field_d);
                          if (this.field_m) {
                            this.field_d.a(var13, var3_int != 0, (byte) 110);
                          } else {
                            Class.forName("vf").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var13, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.field_m &&
                          var2_int == 17) {
                          Object[] var11 = (Object[]) (var8.field_d);
                          Class.forName("vf").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var11[0], var11[1], new Integer(var8.field_c), new Integer(var8.field_a), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_e.startsWith("win")) {
                              throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            String var12 = (String) (var8.field_d);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            String var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (int var5 = 0; var5 < var12.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var12.charAt(var5)) == -1) {
                                throw SystemTaskService.<RuntimeException>rethrowUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_b = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            Exception var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref2;
                            throw SystemTaskService.<RuntimeException>rethrowUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 7:
                        if (!this.field_m) {
                          Class.forName("FullscreenDisplayController").getMethod("exit", new Class[]{}).invoke(this.field_t, new Object[]{});
                        } else {
                          this.field_i.a(8, (java.awt.Frame) (var8.field_d));
                        }
                        break;
                      case 5:
                        if (this.field_m) {
                          var8.field_b = this.field_i.a(-2147483648);
                        } else {
                          var8.field_b = Class.forName("FullscreenDisplayController").getMethod("listmodes", new Class[]{}).invoke(this.field_t, new Object[]{});
                        }
                        break;
                      case 21:
                        if (td.b(128) < field_n) {
                          throw new IOException();
                        }
                        var8.field_b = java.net.InetAddress.getByName((String) (var8.field_d)).getAddress();
                        break;
                    }
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_b = var10.getContents((Object) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.field_d);
                    if (this.field_f &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_b = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_n > td.b(128)) {
                      throw new IOException();
                    }
                    var8.field_b = new DataInputStream(((java.net.URL) (var8.field_d)).openStream());
                    break;
                  case 22:
                    if (field_n > td.b(128)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (im) null;
                      var8.field_b = he.a((String) (var8.field_d), var8.field_c, (byte) 85).a(0);
                    } catch (im decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      im var3_ref3 = (im) (Object) decompiledCaughtException;
                      var8.field_b = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_n > td.b(128)) {
                      throw new IOException();
                    }
                    var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_d)), var8.field_c);
                    break;
                }
              }
              var8.field_f = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              ThreadDeath var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              Throwable var2_ref2 = decompiledCaughtException;
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

    final SystemTask a(byte param0, java.net.URL param1) {
        if (param0 != -12) {
          String var4 = (String) null;
          SystemTaskService.a(true, 121, (String) null, (String) null);
        }
        return this.a(0, param1, param0 - 14560, 4, 0);
    }

    private final SystemTask a(int param0, Object param1, int param2, int param3, int param4) {
        Throwable decompiledCaughtException = null;
        SystemTask var6 = new SystemTask();
        if (param2 != -14572) {
          this.field_i = (ra) null;
        }
        var6.field_c = param0;
        var6.field_e = param3;
        var6.field_d = param1;
        var6.field_a = param4;
        Object var7 = this;
        synchronized (var7) {
          if (null != this.field_p) {
            this.field_p.field_g = var6;
            this.field_p = var6;
          } else {
            this.field_c = var6;
            this.field_p = var6;
          }
          this.notify();
        }
        return var6;
    }

    final SystemTask a(byte param0, java.awt.Frame param1) {
        if (param0 != 45) {
          return (SystemTask) null;
        }
        return this.a(0, param1, param0 - 14617, 7, 0);
    }

    final SystemTask a(int param0) {
        if (param0 != 5) {
          field_w = (String) null;
        }
        return this.a(0, (Object) null, -14572, 5, 0);
    }

    final void b(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2_ref2 = null;
          Object var2 = this;
          synchronized (var2) {
            this.field_a = true;
            this.notifyAll();
            if (param0 != 0) {
              this.field_f = true;
            }
          }
          try {
            this.field_g.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            InterruptedException var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_b) {
            try {
              this.field_b.a(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_x) {
            try {
              this.field_x.a(param0 ^ 0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_u != null) {
            for (int var2_int = 0; this.field_u.length > var2_int; var2_int++) {
              if (this.field_u[var2_int] != null) {
                try {
                  this.field_u[var2_int].a(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  IOException var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_j != null) {
            try {
              this.field_j.a(0);
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

    final SystemTask a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -49) {
          return (SystemTask) null;
        }
        return this.a(param2 + (param4 << 16), (Object) null, -14572, 6, param3 + (param1 << 16));
    }

    final SystemTask a(boolean param0, int param1, Runnable param2) {
        if (!param0) {
          return (SystemTask) null;
        }
        return this.a(param1, param2, -14572, 2, 0);
    }

    SystemTaskService(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Throwable decompiledCaughtException = null;
        this.field_b = null;
        this.field_j = null;
        this.field_m = false;
        this.field_f = false;
        this.field_c = null;
        this.field_p = null;
        this.field_x = null;
        this.field_a = false;
        boolean stackIn_3_1 = (param3);
        this.field_f = stackIn_3_1;
        field_s = "Unknown";
        field_q = param0;
        field_v = "1.1";
        field_w = param1;
        try {
          field_s = System.getProperty("java.vendor");
          field_v = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_s.toLowerCase().indexOf("microsoft") != -1) {
          this.field_m = true;
        }
        try {
          field_l = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_l = "Unknown";
        }
        field_e = field_l.toLowerCase();
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
          field_o = System.getProperty("user.home");
          if (field_o != null) {
            field_o = field_o + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_o) {
          field_o = "~/";
        }
        try {
          this.field_k = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_m) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_r = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        CacheFileLocator.a(field_w, field_q, -109);
        if (this.field_f) {
          this.field_j = new BoundedRandomAccessFile(CacheFileLocator.a((String) null, field_q, 24173, "random.dat"), "rw", 25L);
          this.field_b = new BoundedRandomAccessFile(CacheFileLocator.a("main_file_cache.dat2", (byte) -23), "rw", 314572800L);
          this.field_x = new BoundedRandomAccessFile(CacheFileLocator.a("main_file_cache.idx255", (byte) 124), "rw", 1048576L);
          this.field_u = new BoundedRandomAccessFile[param2];
          for (int var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_u[var5_int] = new BoundedRandomAccessFile(CacheFileLocator.a("main_file_cache.idx" + var5_int, (byte) 87), "rw", 1048576L);
          }
          if (this.field_m) {
            try {
              Class.forName("LegacyDirectSoundBackend").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_m) {
              this.field_t = Class.forName("FullscreenDisplayController").newInstance();
            } else {
              ra var6 = new ra();
              this.field_i = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.field_m) {
              this.field_d = new fb();
            } else {
              this.field_h = Class.forName("vf").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_a = false;
        this.field_g = new Thread((Runnable) (this));
        this.field_g.setPriority(10);
        this.field_g.setDaemon(true);
        this.field_g.start();
    }

    static {
        field_n = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
