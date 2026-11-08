/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    BoundedRandomAccessFile field_m;
    static String field_p;
    private boolean field_v;
    boolean field_x;
    private NativeWindowCallback field_d;
    private static volatile long field_c;
    private static String field_r;
    static String field_l;
    BoundedRandomAccessFile cacheDataFile;
    private PlatformTask field_q;
    private static String field_i;
    private Object field_g;
    private PlatformTask field_h;
    private Object field_n;
    private boolean field_f;
    static java.lang.reflect.Method field_j;
    java.awt.EventQueue field_w;
    private Thread field_b;
    static String field_o;
    private static String field_a;
    private static int field_t;
    BoundedRandomAccessFile[] cacheIndexFiles;
    private DisplayModeEnumerator field_s;
    BoundedRandomAccessFile field_e;

    private final PlatformTask enqueueTask(int param0, int param1, int param2, Object param3, int param4) {
        PlatformTask var6 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.field_g = param3;
        var6.field_a = param4;
        var6.field_d = param1;
        var6.field_c = param0;
        var7 = this;
        synchronized (var7) {
          if (null != this.field_q) {
            this.field_q.field_f = var6;
            this.field_q = var6;
          } else {
            this.field_h = var6;
            this.field_q = var6;
          }
          var8 = 10 % ((param2 + 52) / 43);
          this.notify();
        }
        return var6;
    }

    final PlatformTask lookupMethod(int param0, Class[] param1, String param2, Class param3) {
        if (param0 != 0) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 8, 19, new Object[]{param3, param2, param1}, 0);
    }

    private final static BoundedRandomAccessFile openPreferencesFile(int param0, String param1, String param2, int param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param3 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
            }
          }
          if (param0 >= -98) {
            var9 = (String) null;
            PlatformTaskDispatcher.openPreferencesFile(120, (String) null, (String) null, 79);
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
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

    final void shutdown(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.field_f = true;
            this.notifyAll();
          }
          try {
            if (param0 != -1204) {
              field_j = (java.lang.reflect.Method) null;
            }
            this.field_b.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.cacheDataFile != null) {
            try {
              this.cacheDataFile.close(-5317);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_m != null) {
            try {
              this.field_m.close(param0 ^ 4215);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.cacheIndexFiles != null) {
            for (var2_int = 0; this.cacheIndexFiles.length > var2_int; var2_int++) {
              if (this.cacheIndexFiles[var2_int] != null) {
                try {
                  this.cacheIndexFiles[var2_int].close(-5317);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_e != null) {
            try {
              this.field_e.close(-5317);
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
          int stackIn_75_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          BoundedRandomAccessFile var3_ref_lj = null;
          ProxyAuthenticationException var3_ref_uf = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          Object[] var14 = null;
          String var15 = null;
          java.awt.Frame var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          java.awt.datatransfer.Clipboard var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.field_f) {
                if (this.field_h != null) {
                  var8 = this.field_h;
                  this.field_h = this.field_h.field_f;
                  if (this.field_h == null) {
                    this.field_q = null;
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
                var2_int = var8.field_d;
                switch (var2_int) {
                  case 18:
                    var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.field_e = var18.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.field_x) {
                      throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.field_e = var16;
                        var16.setResizable(false);
                        if (!this.field_v) {
                          Class.forName("FullscreenDisplayController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var16, new Integer(var8.field_a >>> 16), new Integer(65535 & var8.field_a), new Integer(var8.field_c >> 16), new Integer(65535 & var8.field_c)});
                        } else {
                          this.field_s.enterFullscreen(65535 & var8.field_a, (byte) 122, 65535 & var8.field_c, var8.field_c >> 16, var8.field_a >>> 16, var16);
                        }
                        break;
                      case 7:
                        if (this.field_v) {
                          this.field_s.restoreDisplay(8, (java.awt.Frame) (var8.field_g));
                        } else {
                          Class.forName("FullscreenDisplayController").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                        }
                        break;
                      case 16:
                      default:
                        if (this.field_x &&
                          var2_int == 14) {
                          var3 = var8.field_a;
                          var4 = var8.field_c;
                          if (!this.field_v) {
                            Class.forName("CursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3), new Integer(var4)});
                          } else {
                            this.field_d.setCursorPosition(var3, var4, (byte) 112);
                          }
                          break;
                        }
                        if (this.field_x &&
                          var2_int == 15) {
                          stackIn_75_0 = (var8.field_a == 0) ? 0 : 1;
                          var3 = stackIn_75_0;
                          var13 = (java.awt.Component) (var8.field_g);
                          if (this.field_v) {
                            this.field_d.setCursorVisible(var13, var3 != 0, false);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var13, new Boolean(var3 != 0)});
                          }
                          break;
                        }
                        if (!this.field_v &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.field_g);
                          Class.forName("CursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var14[0], var14[1], new Integer(var8.field_a), new Integer(var8.field_c), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_p.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            var15 = (String) (var8.field_g);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var15.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var15.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_e = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref_Exception;
                            throw PlatformTaskDispatcher.<RuntimeException>rethrowUnchecked(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_lj = PlatformTaskDispatcher.openPreferencesFile(-117, (String) (var8.field_g), "", field_t);
                        var8.field_e = var3_ref_lj;
                        break;
                      case 12:
                        var3_ref_lj = PlatformTaskDispatcher.openPreferencesFile(-121, (String) (var8.field_g), field_r, field_t);
                        var8.field_e = var3_ref_lj;
                        break;
                      case 5:
                        if (!this.field_v) {
                          var8.field_e = Class.forName("FullscreenDisplayController").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                        } else {
                          var8.field_e = this.field_s.enumerateDisplayModes(5003);
                        }
                        break;
                      case 21:
                        if (field_c > hm.monotonicMillis(64)) {
                          throw new IOException();
                        }
                        var8.field_e = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                        break;
                      case 3:
                        if (field_c > hm.monotonicMillis(64)) {
                          throw new IOException();
                        }
                        var12 = (var8.field_a >> 24 & 255) + "." + (255 & var8.field_a >> 16) + "." + (255 & var8.field_a >> 8) + "." + (var8.field_a & 255);
                        var8.field_e = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 9:
                    var11 = (Object[]) (var8.field_g);
                    if (this.field_x &&
                      null == ((Class) (var11[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                    break;
                  case 8:
                    var10 = (Object[]) (var8.field_g);
                    if (this.field_x &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (hm.monotonicMillis(64) < field_c) {
                      throw new IOException();
                    }
                    var8.field_e = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.field_g));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.field_a);
                    var8.field_e = var9;
                    break;
                  case 22:
                    if (hm.monotonicMillis(64) < field_c) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationException) null;
                      var8.field_e = QuickChatCategory.createProxyConnector((String) (var8.field_g), var8.field_a, (byte) 126).connect(116);
                    } catch (ProxyAuthenticationException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_uf = (ProxyAuthenticationException) (Object) decompiledCaughtException;
                      var8.field_e = var3_ref_uf.getMessage();
                      throw var3_ref_uf;
                    }
                    break;
                  case 1:
                    if (field_c > hm.monotonicMillis(64)) {
                      throw new IOException();
                    }
                    var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_a);
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

    final PlatformTask requestSocket(int param0, String param1, int param2) {
        if (param0 != 20278) {
          this.field_n = (Object) null;
        }
        return this.requestSocketInternal(false, param2, false, param1);
    }

    final PlatformTask requestExitFullscreen(java.awt.Frame param0, int param1) {
        if (param1 >= -71) {
          String var4 = (String) null;
          PlatformTaskDispatcher.openPreferencesFile(112, (String) null, (String) null, 9);
        }
        return this.enqueueTask(0, 7, -102, param0, 0);
    }

    final PlatformTask requestEnterFullscreen(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 27705) {
          String var7 = (String) null;
          PlatformTaskDispatcher.openPreferencesFile(-61, (String) null, (String) null, -124);
        }
        return this.enqueueTask(param4 + (param0 << 16), 6, param3 - 27832, (Object) null, param1 + (param2 << 16));
    }

    final boolean isFullscreenAvailable(byte param0) {
        int var2 = -64 % ((28 - param0) / 46);
        if (!this.field_x) {
          return false;
        }
        if (!this.field_v) {
          return null != this.field_g ? true : false;
        }
        return this.field_s != null ? true : false;
    }

    final PlatformTask requestDeclaredField(String param0, Class param1, byte param2) {
        int var4 = -55 / ((param2 + 22) / 54);
        return this.enqueueTask(0, 9, 123, new Object[]{param1, param0}, 0);
    }

    private final PlatformTask requestSocketInternal(boolean param0, int param1, boolean param2, String param3) {
        if (param2) {
          field_i = (String) null;
        }
        return this.enqueueTask(0, param0 ? 22 : 1, 34, param3, param1);
    }

    final PlatformTask startThread(int param0, Runnable param1, byte param2) {
        if (param2 != -123) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 2, param2 + 249, param1, param0);
    }

    final PlatformTask requestDisplayModes(boolean param0) {
        if (!param0) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 5, -110, (Object) null, 0);
    }

    final PlatformTask requestUrlStream(byte param0, java.net.URL param1) {
        if (param0 != -44) {
          this.field_n = (Object) null;
        }
        return this.enqueueTask(0, 4, 32, param1, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DisplayModeEnumerator var6 = null;
        this.field_v = false;
        this.field_h = null;
        this.cacheDataFile = null;
        this.field_q = null;
        this.field_f = false;
        this.field_x = false;
        this.field_m = null;
        this.field_e = null;
        field_o = "Unknown";
        field_l = "1.1";
        field_r = param1;
        field_t = param0;
        stackIn_3_1 = (param3);
        this.field_x = stackIn_3_1;
        try {
          field_o = System.getProperty("java.vendor");
          field_l = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.field_v = true;
        }
        try {
          field_i = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_i = "Unknown";
        }
        field_p = field_i.toLowerCase();
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
          this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_v) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        CacheFileLocator.initializeCacheEnvironment(field_r, 71, field_t);
        if (this.field_x) {
          this.field_e = new BoundedRandomAccessFile(CacheFileLocator.resolveFile((String) null, field_t, true, "random.dat"), "rw", 25L);
          this.cacheDataFile = new BoundedRandomAccessFile(CacheFileLocator.resolveCacheFile("main_file_cache.dat2", (byte) -61), "rw", 314572800L);
          this.field_m = new BoundedRandomAccessFile(CacheFileLocator.resolveCacheFile("main_file_cache.idx255", (byte) -61), "rw", 1048576L);
          this.cacheIndexFiles = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.cacheIndexFiles[var5_int] = new BoundedRandomAccessFile(CacheFileLocator.resolveCacheFile("main_file_cache.idx" + var5_int, (byte) -61), "rw", 1048576L);
          }
          if (this.field_v) {
            try {
              Class.forName("LegacyDirectSoundBackend").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.field_v) {
              this.field_g = Class.forName("FullscreenDisplayController").newInstance();
            } else {
              var6 = new DisplayModeEnumerator();
              this.field_s = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.field_v) {
              this.field_n = Class.forName("CursorController").newInstance();
            } else {
              this.field_d = new NativeWindowCallback();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.field_f = false;
        this.field_b = new Thread((Runnable) (this));
        this.field_b.setPriority(10);
        this.field_b.setDaemon(true);
        this.field_b.start();
    }

    static {
        field_c = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
