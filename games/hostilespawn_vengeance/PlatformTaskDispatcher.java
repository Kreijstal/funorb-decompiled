/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private boolean shutdownRequested;
    BoundedRandomAccessFile field_q;
    private DirectDrawFullscreenManager field_r;
    BoundedRandomAccessFile field_l;
    static String field_c;
    BoundedRandomAccessFile[] field_v;
    private Object field_p;
    private static volatile long field_x;
    private static String field_m;
    static java.lang.reflect.Method field_i;
    private PlatformTask queueHead;
    BoundedRandomAccessFile field_f;
    boolean privilegedTasksEnabled;
    private static String field_e;
    private PlatformTask queueTail;
    private Win32CursorManager field_a;
    static String field_h;
    private static int field_t;
    private static String field_g;
    private boolean microsoftJvm;
    private Thread workerThread;
    static String field_u;
    private Object field_j;
    java.awt.EventQueue field_d;

    private final PlatformTask requestSocketConnection(boolean param0, String param1, int param2, int param3) {
        if (param3 != 20691) {
          field_u = (String) null;
        }
        return this.enqueueTask(!param0 ? 1 : 22, param1, false, 0, param2);
    }

    final PlatformTask requestDirectSocket(String param0, int param1, int param2) {
        if (param1 <= 47) {
          this.shutdownRequested = true;
        }
        return this.requestSocketConnection(false, param0, param2, 20691);
    }

    final void shutdown(byte param0) {
        try {
          InterruptedException interruptedException = null;
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref_Object = null;
          IOException var3 = null;
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            this.shutdownRequested = true;
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_l != null) {
            try {
              this.field_l.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_f) {
            try {
              this.field_f.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2 = 0; this.field_v.length > var2; var2++) {
              if (null != this.field_v[var2]) {
                try {
                  this.field_v[var2].close(-1);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_q) {
            try {
              this.field_q.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              iOException = (IOException) (Object) decompiledCaughtException;
            }
          }
          var2 = 53 / ((47 - param0) / 41);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PlatformTask requestFullscreenEnter(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(6, (Object) null, param0, param2 + (param4 << 16), (param1 << 16) + param3);
    }

    final boolean isFullscreenAvailable(boolean param0) {
        if (!param0) {
          return false;
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (!this.microsoftJvm) {
          return null != this.field_p ? true : false;
        }
        return null != this.field_r ? true : false;
    }

    final PlatformTask requestFullscreenExit(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(7, param1, false, 0, 0);
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
          if (param3 != -7) {
            return (BoundedRandomAccessFile) null;
          }
          if (param0 == 33) {
            var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
          } else {
            if (param0 == 34) {
              var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_g, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        PlatformTask discarded$0 = null;
        if (param0 != 30085) {
          String var4 = (String) null;
          discarded$0 = this.requestSocketConnection(true, (String) null, -77, -50);
        }
        return this.enqueueTask(4, param1, false, 0, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_50_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ProxyAuthenticationRequiredException var3_ref = null;
          BoundedRandomAccessFile var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Object[] var9 = null;
          java.awt.Component var10 = null;
          String var11 = null;
          Object[] var12 = null;
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
                    if (field_x > hn.correctedCurrentTimeMillis((byte) 80)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 22:
                    if (hn.correctedCurrentTimeMillis((byte) 80) < field_x) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = qj.a(27, (String) (var8.objectArgument), var8.intArgument).openSocket(31067);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.objectArgument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.intArgument);
                    var8.result = var18;
                    break;
                  case 4:
                    if (hn.correctedCurrentTimeMillis((byte) 80) < field_x) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 9:
                    var17 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
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
                        if (hn.correctedCurrentTimeMillis((byte) 80) < field_x) {
                          throw new IOException();
                        }
                        var14 = (255 & var8.intArgument >> 24) + "." + ((var8.intArgument & 16770738) >> 16) + "." + ((var8.intArgument & 65486) >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var14).getHostName();
                        break;
                      case 21:
                        if (hn.correctedCurrentTimeMillis((byte) 80) < field_x) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("hc").getMethod("listmodes", new Class[]{}).invoke(this.field_p, new Object[]{});
                        } else {
                          var8.result = this.field_r.listDisplayModes((byte) 113);
                        }
                        break;
                      case 6:
                        var13 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var13;
                        var13.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_r.enterFullscreen(65535 & var8.intArgument, var8.intArgument >>> 16, -7018, 65535 & var8.secondaryIntArgument, var13, var8.secondaryIntArgument >> 16);
                        } else {
                          Class.forName("hc").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{var13, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_r.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), -7738);
                        } else {
                          Class.forName("hc").getMethod("exit", new Class[]{}).invoke(this.field_p, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile(field_t, (String) (var8.objectArgument), field_m, -7);
                        var8.result = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          14 == var2_int) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("dm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_a.setCursorPosition(var4_int, -93, var3_int);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          15 == var2_int) {
                          stackIn_50_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_50_0;
                          var10 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_a.setCursorVisible(0, var3_int != 0, var10);
                          } else {
                            Class.forName("dm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_j, new Object[]{var10, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.objectArgument);
                          Class.forName("dm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_j, new Object[]{var12[0], var12[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_c.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var11 = (String) (var8.objectArgument);
                            if (!var11.startsWith("http://") &&
                              !var11.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var11.length(); var5++) {
                              if (var4.indexOf((int) var11.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref3;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref3);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile(field_t, (String) (var8.objectArgument), "", -7);
                        var8.result = var3_ref2;
                        break;
                    }
                    break;
                  case 8:
                    var9 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
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

    final PlatformTask requestDeclaredField(byte param0, Class param1, String param2) {
        if (param0 <= 91) {
          this.queueHead = (PlatformTask) null;
        }
        return this.enqueueTask(9, new Object[]{param1, param2}, false, 0, 0);
    }

    private final PlatformTask enqueueTask(int param0, Object param1, boolean param2, int param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        if (param2) {
          field_c = (String) null;
        }
        var6.secondaryIntArgument = param3;
        var6.intArgument = param4;
        var6.objectArgument = param1;
        var6.requestType = param0;
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

    final PlatformTask requestThreadStart(int param0, Runnable param1, int param2) {
        int var4 = -31 / ((9 - param2) / 44);
        return this.enqueueTask(2, param1, false, 0, param0);
    }

    final PlatformTask requestDisplayModes(int param0) {
        int var2 = 102 % ((-15 - param0) / 43);
        return this.enqueueTask(5, (Object) null, false, 0, 0);
    }

    final PlatformTask requestDeclaredMethod(Class[] param0, Class param1, String param2, int param3) {
        if (param3 < 104) {
          this.workerThread = (Thread) null;
        }
        return this.enqueueTask(8, new Object[]{param1, param2, param0}, false, 0, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var6 = null;
        this.shutdownRequested = false;
        this.field_q = null;
        this.queueTail = null;
        this.privilegedTasksEnabled = false;
        this.microsoftJvm = false;
        this.field_f = null;
        this.field_l = null;
        this.queueHead = null;
        field_m = param1;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_u = "Unknown";
        field_t = param0;
        field_h = "1.1";
        try {
          field_u = System.getProperty("java.vendor");
          field_h = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_u.toLowerCase().indexOf("microsoft") != -1) {
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
          field_g = System.getProperty("user.home");
          if (null != field_g) {
            field_g = field_g + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_g == null) {
          field_g = "~/";
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
            field_i = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        qd.a(-1, field_t, field_m);
        if (this.privilegedTasksEnabled) {
          this.field_q = new BoundedRandomAccessFile(qd.a(field_t, (String) null, "random.dat", true), "rw", 25L);
          this.field_l = new BoundedRandomAccessFile(qd.a("main_file_cache.dat2", -19005), "rw", 314572800L);
          this.field_f = new BoundedRandomAccessFile(qd.a("main_file_cache.idx255", -19005), "rw", 1048576L);
          this.field_v = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_v[var5_int] = new BoundedRandomAccessFile(qd.a("main_file_cache.idx" + var5_int, -19005), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("qe").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new DirectDrawFullscreenManager();
              this.field_r = var6;
            } else {
              this.field_p = Class.forName("hc").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_j = Class.forName("dm").newInstance();
            } else {
              this.field_a = new Win32CursorManager();
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
        field_x = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
