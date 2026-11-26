/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    gl field_u;
    private static String field_a;
    static String field_j;
    private DirectDrawFullscreenManager field_o;
    private PlatformTask queueHead;
    gl field_g;
    gl field_v;
    private Object field_i;
    private boolean shutdownRequested;
    private static String field_e;
    private Thread workerThread;
    static java.lang.reflect.Method field_x;
    private Win32CursorManager field_l;
    private static volatile long field_w;
    static String field_s;
    private Object field_h;
    java.awt.EventQueue field_t;
    private static int field_f;
    private PlatformTask queueTail;
    static String field_c;
    private boolean microsoftJvm;
    gl[] field_p;
    private static String field_n;
    boolean privilegedTasksEnabled;

    private final PlatformTask enqueueTask(int param0, int param1, Object param2, int param3, int param4) {
        PlatformTask var6 = null;
        java.net.URL var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param0 != 0) {
          var9 = (java.net.URL) null;
          this.requestUrlStream((java.net.URL) null, (byte) 74);
        }
        var6 = new PlatformTask();
        var6.objectArgument = param2;
        var6.requestType = param3;
        var6.intArgument = param1;
        var6.secondaryIntArgument = param4;
        var7 = this;
        synchronized (var7) {
          if (this.queueTail == null) {
            this.queueHead = var6;
            this.queueTail = var6;
          } else {
            this.queueTail.next = var6;
            this.queueTail = var6;
          }
          this.notify();
        }
        return var6;
    }

    final PlatformTask requestDirectSocket(int param0, int param1, String param2) {
        if (param1 != 0) {
          this.queueTail = (PlatformTask) null;
        }
        return this.requestSocketConnection(false, param2, 1, param0);
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 28252) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param3 ^ 28252, (param1 << 16) + param4, (Object) null, 6, (param0 << 16) + param2);
    }

    final PlatformTask requestUrlStream(java.net.URL param0, byte param1) {
        if (param1 != -49) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param1 + 49, 0, param0, 4, 0);
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
            this.shutdownRequested = true;
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_u) {
            try {
              this.field_u.d(109);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_g) {
            try {
              this.field_g.d(56);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != 20647) {
            this.field_t = (java.awt.EventQueue) null;
          }
          if (this.field_p != null) {
            for (var2_int = 0; var2_int < this.field_p.length; var2_int++) {
              if (this.field_p[var2_int] != null) {
                try {
                  this.field_p[var2_int].d(21);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_v != null) {
            try {
              this.field_v.d(param0 - 20603);
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

    final PlatformTask requestDeclaredMethod(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -334290960) {
          field_s = (String) null;
        }
        return this.enqueueTask(0, 0, new Object[]{param3, param2, param0}, 8, 0);
    }

    final boolean isFullscreenAvailable(byte param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 > -70) {
          return false;
        }
        if (!this.microsoftJvm) {
          return this.field_i != null ? true : false;
        }
        return this.field_o != null ? true : false;
    }

    final PlatformTask requestFullscreenExit(byte param0, java.awt.Frame param1) {
        if (param0 != -120) {
          String var4 = (String) null;
          this.requestDirectSocket(27, -112, (String) null);
        }
        return this.enqueueTask(0, 0, param1, 7, 0);
    }

    final PlatformTask requestThreadStart(int param0, int param1, Runnable param2) {
        if (param0 != 314572800) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param1, param2, 2, 0);
    }

    private final static gl a(String param0, String param1, byte param2, int param3) {
        try {
          gl stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          String var7 = null;
          gl var8 = null;
          Exception var8_ref = null;
          if (param3 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (34 == param3) {
              var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new gl(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          var6 = -32 % ((28 - param2) / 41);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final PlatformTask requestSocketConnection(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
          this.field_o = (DirectDrawFullscreenManager) null;
        }
        return this.enqueueTask(0, param3, param1, param0 ? 22 : 1, 0);
    }

    final PlatformTask requestDeclaredField(Class param0, String param1, int param2) {
        int var4 = 16 % ((param2 + 85) / 34);
        return this.enqueueTask(0, 0, new Object[]{param0, param1}, 9, 0);
    }

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 != 31) {
          this.shutdownRequested = false;
        }
        return this.enqueueTask(0, 0, (Object) null, 5, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_65_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ProxyAuthenticationRequiredException var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          gl var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          java.awt.Component var13 = null;
          Object[] var14 = null;
          String var15 = null;
          java.awt.Frame var16 = null;
          String var17 = null;
          Object[] var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.shutdownRequested) {
                if (this.queueHead != null) {
                  var8 = this.queueHead;
                  this.queueHead = this.queueHead.next;
                  if (null == this.queueHead) {
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
                  case 22:
                    if (field_w > ji.correctedCurrentTimeMillis(127)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = a.a(var8.intArgument, (String) (var8.objectArgument), -115).b(0);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 4:
                    if (ji.correctedCurrentTimeMillis(106) < field_w) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 8:
                    var18 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_w > ji.correctedCurrentTimeMillis(126)) {
                          throw new IOException();
                        }
                        var17 = (var8.intArgument >> 24 & 255) + "." + ((var8.intArgument & 16767812) >> 16) + "." + ((var8.intArgument & 65280) >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var17).getHostName();
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var16;
                        var16.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_o.enterFullscreen(var8.intArgument >>> 16, var8.secondaryIntArgument & 65535, -121, var8.secondaryIntArgument >> 16, var8.intArgument & 65535, var16);
                        } else {
                          Class.forName("oi").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_i, new Object[]{var16, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          14 == var2_int) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("jh").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_l.setCursorPosition(var4_int, var3_int, -117);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          15 == var2_int) {
                          stackIn_65_0 = (0 == var8.intArgument) ? 0 : 1;
                          var3_int = stackIn_65_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_l.setCursorVisible(32512, var13, var3_int != 0);
                          } else {
                            Class.forName("jh").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var13, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.objectArgument);
                          Class.forName("jh").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var14[0], var14[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_c.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var15 = (String) (var8.objectArgument);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var15.length(); var5++) {
                              if (var4.indexOf((int) var15.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref3 = PlatformTaskDispatcher.a((String) (var8.objectArgument), "", (byte) -32, field_f);
                        var8.result = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = PlatformTaskDispatcher.a((String) (var8.objectArgument), field_a, (byte) 123, field_f);
                        var8.result = var3_ref3;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_o.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), (byte) 34);
                        } else {
                          Class.forName("oi").getMethod("exit", new Class[]{}).invoke(this.field_i, new Object[]{});
                        }
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("oi").getMethod("listmodes", new Class[]{}).invoke(this.field_i, new Object[]{});
                        } else {
                          var8.result = this.field_o.listDisplayModes(109);
                        }
                        break;
                      case 21:
                        if (field_w > ji.correctedCurrentTimeMillis(-81)) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var11.getContents((Object) null);
                    break;
                  case 9:
                    var10 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.intArgument);
                    var8.result = var9;
                    break;
                  case 1:
                    if (field_w > ji.correctedCurrentTimeMillis(-60)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
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

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var6 = null;
        this.shutdownRequested = false;
        this.field_v = null;
        this.queueHead = null;
        this.field_u = null;
        this.microsoftJvm = false;
        this.field_g = null;
        this.queueTail = null;
        this.privilegedTasksEnabled = false;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_j = "1.1";
        field_f = param0;
        field_a = param1;
        field_s = "Unknown";
        try {
          field_s = System.getProperty("java.vendor");
          field_j = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_s.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_e = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_e = "Unknown";
        }
        field_c = field_e.toLowerCase();
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
        if (field_n == null) {
          field_n = "~/";
        }
        try {
          this.field_t = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        ri.a(field_a, (byte) -94, field_f);
        if (this.privilegedTasksEnabled) {
          this.field_v = new gl(ri.a(-121, (String) null, field_f, "random.dat"), "rw", 25L);
          this.field_u = new gl(ri.a("main_file_cache.dat2", 1), "rw", 314572800L);
          this.field_g = new gl(ri.a("main_file_cache.idx255", 1), "rw", 1048576L);
          this.field_p = new gl[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_p[var5_int] = new gl(ri.a("main_file_cache.idx" + var5_int, 1), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("je").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new DirectDrawFullscreenManager();
              this.field_o = var6;
            } else {
              this.field_i = Class.forName("oi").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_h = Class.forName("jh").newInstance();
            } else {
              this.field_l = new Win32CursorManager();
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
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
