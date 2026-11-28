/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    static String field_a;
    RandomAccessCacheFile field_b;
    RandomAccessCacheFile field_c;
    private DirectDrawFullscreenManager field_u;
    private PlatformTask queueTail;
    private static String field_i;
    private boolean shutdownRequested;
    private static int field_o;
    private static String field_n;
    static String field_t;
    java.awt.EventQueue field_d;
    boolean privilegedTasksEnabled;
    private static volatile long field_p;
    RandomAccessCacheFile[] field_v;
    private static String field_f;
    private Object field_r;
    static String field_x;
    private boolean microsoftJvm;
    private PlatformTask queueHead;
    private Win32CursorManager field_g;
    static java.lang.reflect.Method field_e;
    private Object field_j;
    RandomAccessCacheFile field_s;
    private Thread workerThread;

    final void shutdown(byte param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          var2 = this;
          synchronized (var2) {
            this.shutdownRequested = true;
            if (param0 != 29) {
              this.field_d = (java.awt.EventQueue) null;
            }
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_c) {
            try {
              this.field_c.close((byte) -5);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_s != null) {
            try {
              this.field_s.close((byte) -123);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2_int = 0; var2_int < this.field_v.length; var2_int++) {
              if (null != this.field_v[var2_int]) {
                try {
                  this.field_v[var2_int].close((byte) 53);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_b) {
            try {
              this.field_b.close((byte) -124);
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

    private final PlatformTask requestSocketConnection(int param0, boolean param1, String param2, int param3) {
        int var5 = 22 % ((0 - param0) / 52);
        return this.enqueueTask(0, param2, param3, !param1 ? 1 : 22, -19);
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 >= 0) {
          field_o = -61;
        }
        return this.enqueueTask((param2 << 16) + param4, (Object) null, param1 + (param0 << 16), 6, -19);
    }

    final PlatformTask requestUrlStream(java.net.URL param0, byte param1) {
        if (param1 != 68) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param0, 0, 4, -19);
    }

    final PlatformTask requestDeclaredMethod(byte param0, String param1, Class[] param2, Class param3) {
        if (param0 <= 93) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, new Object[]{param3, param1, param2}, 0, 8, -19);
    }

    final PlatformTask requestDisplayModes(int param0) {
        if (param0 != 7721) {
          this.requestDisplayModes(65);
        }
        return this.enqueueTask(0, (Object) null, 0, 5, param0 - 7740);
    }

    private final PlatformTask enqueueTask(int param0, Object param1, int param2, int param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.requestType = param3;
        var6.intArgument = param2;
        var6.objectArgument = param1;
        if (param4 != -19) {
          return (PlatformTask) null;
        }
        var6.secondaryIntArgument = param0;
        var7 = this;
        synchronized (var7) {
          if (null != this.queueTail) {
            this.queueTail.next = var6;
            this.queueTail = var6;
          } else {
            this.queueHead = var6;
            this.queueTail = var6;
          }
          this.notify();
        }
        return var6;
    }

    final PlatformTask requestDirectSocket(String param0, int param1, int param2) {
        if (param2 != -28148) {
          return (PlatformTask) null;
        }
        return this.requestSocketConnection(109, false, param0, param1);
    }

    final PlatformTask requestFullscreenExit(int param0, java.awt.Frame param1) {
        if (param0 <= 12) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param1, 0, 7, -19);
    }

    private final static RandomAccessCacheFile openPreferencesFile(int param0, String param1, int param2, String param3) {
        try {
          int var6 = 0;
          RandomAccessCacheFile stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          RandomAccessCacheFile var8 = null;
          Exception var8_ref = null;
          if (param2 != 33) {
            if (34 != param2) {
              var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 <= 34) {
            return (RandomAccessCacheFile) null;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new RandomAccessCacheFile(new File(var7, var4), "rw", 10000L);
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

    final PlatformTask requestThreadStart(int param0, int param1, Runnable param2) {
        if (param1 > -2) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param2, param0, 2, -19);
    }

    final PlatformTask requestDeclaredField(int param0, Class param1, String param2) {
        if (param0 != 0) {
          this.isFullscreenAvailable((byte) -96);
        }
        return this.enqueueTask(0, new Object[]{param1, param2}, 0, 9, -19);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_73_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          RandomAccessCacheFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ProxyAuthenticationRequiredException var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          java.awt.Component var15 = null;
          Object[] var16 = null;
          Object var17 = null;
          String var17_ref = null;
          java.awt.datatransfer.Clipboard var18 = null;
          var17 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.shutdownRequested) {
                if (this.queueHead != null) {
                  var8 = this.queueHead;
                  this.queueHead = this.queueHead.next;
                  if (this.queueHead == null) {
                    this.queueTail = null;
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
                var2_int = var8.requestType;
                switch (var2_int) {
                  case 1:
                    if (field_p > je.correctedCurrentTimeMillis(1)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 18:
                    var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var18.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("bd").getMethod("listmodes", new Class[]{}).invoke(this.field_j, new Object[]{});
                        } else {
                          var8.result = this.field_u.listDisplayModes((byte) -63);
                        }
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_u.restoreDisplayMode(-16, (java.awt.Frame) (var8.objectArgument));
                        } else {
                          Class.forName("bd").getMethod("exit", new Class[]{}).invoke(this.field_j, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile(92, field_i, field_o, (String) (var8.objectArgument));
                        var8.result = var3_ref;
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile(93, "", field_o, (String) (var8.objectArgument));
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_g.setCursorPosition(var3_int, var4_int, 0);
                          } else {
                            Class.forName("cc").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_r, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          15 == var2_int) {
                          stackIn_73_0 = (0 == var8.intArgument) ? 0 : 1;
                          var3_int = stackIn_73_0;
                          var15 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_g.setCursorVisible(var3_int != 0, var15, (byte) -55);
                          } else {
                            Class.forName("cc").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_r, new Object[]{var15, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var16 = (Object[]) (var8.objectArgument);
                          Class.forName("cc").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_r, new Object[]{var16[0], var16[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var16[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_t.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var17_ref = (String) (var8.objectArgument);
                            if (!var17_ref.startsWith("http://") &&
                              !var17_ref.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var17_ref.length() > var5; var5++) {
                              if (-1 == var4.indexOf((int) var17_ref.charAt(var5))) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var17_ref + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_u.enterFullscreen(65535 & var8.secondaryIntArgument, var14, var8.intArgument >>> 16, -32, var8.secondaryIntArgument >> 16, 65535 & var8.intArgument);
                        } else {
                          Class.forName("bd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{var14, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 21:
                        if (je.correctedCurrentTimeMillis(1) < field_p) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 3:
                        if (field_p > je.correctedCurrentTimeMillis(1)) {
                          throw new IOException();
                        }
                        var13 = (var8.intArgument >> 24 & 255) + "." + ((16723280 & var8.intArgument) >> 16) + "." + ((var8.intArgument & 65382) >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var13).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 9:
                    var11 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var11[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                    break;
                  case 8:
                    var10 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 4:
                    if (je.correctedCurrentTimeMillis(1) < field_p) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.intArgument);
                    var8.result = var9;
                    break;
                  case 22:
                    if (je.correctedCurrentTimeMillis(1) < field_p) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = rg.a((String) (var8.objectArgument), var8.intArgument, 2525).openSocket((byte) -93);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                }
              }
              var8.status = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var8.status = 2;
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

    final boolean isFullscreenAvailable(byte param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        int var2 = -56 % ((-65 - param0) / 48);
        if (!this.microsoftJvm) {
          return this.field_j != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var6 = null;
        this.field_c = null;
        this.field_b = null;
        this.queueTail = null;
        this.microsoftJvm = false;
        this.field_s = null;
        this.queueHead = null;
        this.privilegedTasksEnabled = false;
        this.shutdownRequested = false;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_x = "1.1";
        field_a = "Unknown";
        field_i = param1;
        field_o = param0;
        try {
          field_a = System.getProperty("java.vendor");
          field_x = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_a.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_f = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_f = "Unknown";
        }
        field_t = field_f.toLowerCase();
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
          field_n = System.getProperty("user.home");
          if (field_n != null) {
            field_n = field_n + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_n) {
          field_n = "~/";
        }
        try {
          this.field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.microsoftJvm) {
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
        nd.a(field_i, field_o, (byte) -115);
        if (this.privilegedTasksEnabled) {
          this.field_b = new RandomAccessCacheFile(nd.a((String) null, "random.dat", field_o, (byte) -75), "rw", 25L);
          this.field_c = new RandomAccessCacheFile(nd.a("main_file_cache.dat2", -19154), "rw", 314572800L);
          this.field_s = new RandomAccessCacheFile(nd.a("main_file_cache.idx255", -19154), "rw", 1048576L);
          this.field_v = new RandomAccessCacheFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_v[var5_int] = new RandomAccessCacheFile(nd.a("main_file_cache.idx" + var5_int, -19154), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("tf").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new DirectDrawFullscreenManager();
              this.field_u = var6;
            } else {
              this.field_j = Class.forName("bd").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_r = Class.forName("cc").newInstance();
            } else {
              this.field_g = new Win32CursorManager();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        this.shutdownRequested = false;
        this.workerThread = new Thread((Runnable) (this));
        this.workerThread.setPriority(10);
        this.workerThread.setDaemon(true);
        this.workerThread.start();
    }

    static {
        field_p = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
