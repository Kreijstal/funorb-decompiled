/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private Object field_q;
    private static String field_g;
    static String field_b;
    static String field_s;
    private boolean microsoftJvm;
    private PlatformTask queueTail;
    private PlatformTask queueHead;
    boolean privilegedTasksEnabled;
    static String field_f;
    private static volatile long field_h;
    private Thread workerThread;
    BoundedRandomAccessFile[] field_d;
    BoundedRandomAccessFile field_n;
    private static String field_u;
    private Win32CursorManager field_w;
    private boolean shutdownRequested;
    private DirectDrawFullscreenManager field_c;
    private static int field_o;
    private Object field_m;
    BoundedRandomAccessFile field_t;
    java.awt.EventQueue field_k;
    private static String field_e;
    BoundedRandomAccessFile field_v;
    static java.lang.reflect.Method field_r;

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        if (param0 != 0) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(4, (byte) -93, param1, 0, 0);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, int param1) {
        int var3 = 28 % ((param1 + 7) / 57);
        return this.enqueueTask(7, (byte) -119, param0, 0, 0);
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
          if (param0 != 20269) {
            this.privilegedTasksEnabled = true;
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.close(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            try {
              this.field_v.close(0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_d != null) {
            for (var2_int = 0; var2_int < this.field_d.length; var2_int++) {
              if (null != this.field_d[var2_int]) {
                try {
                  this.field_d[var2_int].close(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.close(0);
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

    final PlatformTask requestDirectSocket(int param0, int param1, String param2) {
        int var4 = 114 % ((param1 - 34) / 51);
        return this.requestSocketConnection((byte) -93, false, param0, param2);
    }

    final PlatformTask requestThreadStart(byte param0, Runnable param1, int param2) {
        if (param0 < 31) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(2, (byte) -59, param1, 0, param2);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_80_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          BoundedRandomAccessFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          ProxyAuthenticationRequiredException var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          PlatformTask var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          java.awt.Component var12 = null;
          java.awt.Frame var13 = null;
          String var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            var2 = this;
            synchronized (var2) {
              boolean decompiledFrameCompleted0 = true;
              while (!this.shutdownRequested) {
                if (null != this.queueHead) {
                  var9 = this.queueHead;
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
                var2_int = var9.requestType;
                switch (var2_int) {
                  case 1:
                    if (field_h > ri.correctedCurrentTimeMillis(-3)) {
                      throw new IOException();
                    }
                    var9.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.objectArgument)), var9.intArgument);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var9.objectArgument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var9.intArgument);
                    var9.result = var18;
                    break;
                  case 4:
                    if (field_h > ri.correctedCurrentTimeMillis(-3)) {
                      throw new IOException();
                    }
                    var9.result = new DataInputStream(((java.net.URL) (var9.objectArgument)).openStream());
                    break;
                  case 9:
                    var17 = (Object[]) (var9.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.result = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var9.objectArgument);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_h > ri.correctedCurrentTimeMillis(-3)) {
                          throw new IOException();
                        }
                        var14 = (var9.intArgument >> 24 & 255) + "." + (255 & var9.intArgument >> 16) + "." + ((65510 & var9.intArgument) >> 8) + "." + (255 & var9.intArgument);
                        var9.result = java.net.InetAddress.getByName(var14).getHostName();
                        break;
                      case 21:
                        if (ri.correctedCurrentTimeMillis(-3) < field_h) {
                          throw new IOException();
                        }
                        var9.result = java.net.InetAddress.getByName((String) (var9.objectArgument)).getAddress();
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var9.result = var13;
                        var13.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("ff").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{var13, new Integer(var9.intArgument >>> 16), new Integer(var9.intArgument & 65535), new Integer(var9.secondaryIntArgument >> 16), new Integer(var9.secondaryIntArgument & 65535)});
                        } else {
                          this.field_c.enterFullscreen(var9.intArgument >>> 16, var13, var9.secondaryIntArgument & 65535, var9.secondaryIntArgument >> 16, var9.intArgument & 65535, -2147483648);
                        }
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_c.restoreDisplayMode((byte) 73, (java.awt.Frame) (var9.objectArgument));
                        } else {
                          Class.forName("ff").getMethod("exit", new Class[]{}).invoke(this.field_m, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile((String) (var9.objectArgument), field_g, 0, field_o);
                        var9.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var9.intArgument;
                          var4_int = var9.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_w.setCursorPosition((byte) -127, var3_int, var4_int);
                          } else {
                            Class.forName("jm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_q, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_80_0 = (var9.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_80_0;
                          var12 = (java.awt.Component) (var9.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_w.setCursorVisible((byte) -83, var12, var3_int != 0);
                          } else {
                            Class.forName("jm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_q, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var11 = (Object[]) (var9.objectArgument);
                          Class.forName("jm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_q, new Object[]{var11[0], var11[1], new Integer(var9.intArgument), new Integer(var9.secondaryIntArgument), var11[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_f.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var8 = (String) (var9.objectArgument);
                            if (!var8.startsWith("http://") &&
                              !var8.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var8.length(); var5++) {
                              if (var4.indexOf((int) var8.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var9.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile((String) (var9.objectArgument), "", 0, field_o);
                        var9.result = var3_ref;
                        break;
                      case 5:
                        if (this.microsoftJvm) {
                          var9.result = this.field_c.listDisplayModes(0);
                        } else {
                          var9.result = Class.forName("ff").getMethod("listmodes", new Class[]{}).invoke(this.field_m, new Object[]{});
                        }
                        break;
                    }
                    break;
                  case 8:
                    var10 = (Object[]) (var9.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var9.result = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 22:
                    if (field_h > ri.correctedCurrentTimeMillis(-3)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var9.result = fb.a(12, var9.intArgument, (String) (var9.objectArgument)).openSocket(-22176);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var9.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                }
              }
              var9.status = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref2 = decompiledCaughtException;
              var9.status = 2;
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

    final PlatformTask requestDeclaredField(int param0, Class param1, String param2) {
        if (param0 != 0) {
          String var5 = (String) null;
          this.requestDirectSocket(-42, 93, (String) null);
        }
        return this.enqueueTask(9, (byte) -55, new Object[]{param1, param2}, 0, 0);
    }

    private final PlatformTask requestSocketConnection(byte param0, boolean param1, int param2, String param3) {
        int var5 = -5 % ((-38 - param0) / 54);
        return this.enqueueTask(param1 ? 22 : 1, (byte) -102, param3, 0, param2);
    }

    private final PlatformTask enqueueTask(int param0, byte param1, Object param2, int param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.requestType = param0;
        var6.objectArgument = param2;
        if (param1 > -36) {
          field_o = -104;
        }
        var6.intArgument = param4;
        var6.secondaryIntArgument = param3;
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

    final PlatformTask requestFullscreenEnter(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 > -57) {
          this.shutdown(38);
        }
        return this.enqueueTask(6, (byte) -70, (Object) null, param2 + (param3 << 16), (param1 << 16) + param4);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 > -120) {
          this.queueHead = (PlatformTask) null;
        }
        if (!this.microsoftJvm) {
          return this.field_m != null ? true : false;
        }
        return this.field_c != null ? true : false;
    }

    private final static BoundedRandomAccessFile openPreferencesFile(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          if (param3 != 33) {
            if (param3 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
            }
          } else {
            var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param2; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                stackIn_13_0 = var8;
                return stackIn_13_0;
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

    final PlatformTask requestDisplayModes(int param0) {
        if (param0 != 5) {
          field_e = (String) null;
        }
        return this.enqueueTask(5, (byte) -86, (Object) null, 0, 0);
    }

    final PlatformTask requestDeclaredMethod(byte param0, Class param1, Class[] param2, String param3) {
        int var5 = 59 % ((-21 - param0) / 46);
        return this.enqueueTask(8, (byte) -38, new Object[]{param1, param3, param2}, 0, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var6 = null;
        this.microsoftJvm = false;
        this.field_n = null;
        this.queueTail = null;
        this.privilegedTasksEnabled = false;
        this.queueHead = null;
        this.field_t = null;
        this.shutdownRequested = false;
        this.field_v = null;
        field_o = param0;
        field_g = param1;
        field_b = "Unknown";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_s = "1.1";
        try {
          field_b = System.getProperty("java.vendor");
          field_s = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_b.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_e = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_e = "Unknown";
        }
        field_f = field_e.toLowerCase();
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
          if (null != field_u) {
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
          this.field_k = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_r = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        ub.a(field_g, field_o, -26761);
        if (this.privilegedTasksEnabled) {
          this.field_n = new BoundedRandomAccessFile(ub.a((String) null, -3, field_o, "random.dat"), "rw", 25L);
          this.field_t = new BoundedRandomAccessFile(ub.a("main_file_cache.dat2", (byte) 96), "rw", 314572800L);
          this.field_v = new BoundedRandomAccessFile(ub.a("main_file_cache.idx255", (byte) 127), "rw", 1048576L);
          this.field_d = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_d[var5_int] = new BoundedRandomAccessFile(ub.a("main_file_cache.idx" + var5_int, (byte) -87), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("re").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new DirectDrawFullscreenManager();
              this.field_c = var6;
            } else {
              this.field_m = Class.forName("ff").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_q = Class.forName("jm").newInstance();
            } else {
              this.field_w = new Win32CursorManager();
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
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
