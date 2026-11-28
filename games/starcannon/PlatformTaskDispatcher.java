/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private Object field_m;
    static String field_o;
    private static String field_j;
    BoundedRandomAccessFile field_c;
    private DirectDrawFullscreenManager field_b;
    static String field_l;
    BoundedRandomAccessFile field_t;
    java.awt.EventQueue field_w;
    private boolean microsoftJvm;
    BoundedRandomAccessFile[] field_q;
    private boolean shutdownRequested;
    private PlatformTask queueHead;
    private static String field_v;
    private static String field_u;
    private PlatformTask queueTail;
    private Thread workerThread;
    boolean privilegedTasksEnabled;
    private static volatile long field_k;
    static String field_r;
    private Win32CursorManager field_i;
    private Object field_s;
    BoundedRandomAccessFile field_e;
    static java.lang.reflect.Method field_p;
    private static int field_a;

    private final PlatformTask enqueueTask(int param0, int param1, int param2, int param3, Object param4) {
        PlatformTask var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        PlatformTask stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new PlatformTask();
        var6.objectArgument = param4;
        var6.intArgument = param2;
        var6.requestType = param0;
        var6.secondaryIntArgument = param1;
        var7_ref = this;
        synchronized (var7_ref) {
          if (param3 != 16266) {
            stackIn_3_0 = (PlatformTask) null;
            return stackIn_3_0;
          }
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

    final PlatformTask requestUrlStream(byte param0, java.net.URL param1) {
        if (param0 != -10) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(4, 0, 0, 16266, param1);
    }

    private final static BoundedRandomAccessFile openPreferencesFile(byte param0, String param1, String param2, int param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param3 != 33) {
            if (param3 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
            }
          } else {
            var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                stackIn_12_0 = var8;
                return stackIn_12_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param0 <= -64) {
            return null;
          }
          var9 = (String) null;
          PlatformTaskDispatcher.openPreferencesFile((byte) 123, (String) null, (String) null, -123);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PlatformTask requestThreadStart(int param0, int param1, Runnable param2) {
        if (param1 < 20) {
          this.requestDisplayModes(72);
        }
        return this.enqueueTask(2, 0, param0, 16266, param2);
    }

    private final PlatformTask requestSocketConnection(int param0, String param1, boolean param2, int param3) {
        if (param3 != 22) {
          this.field_c = (BoundedRandomAccessFile) null;
        }
        return this.enqueueTask(!param2 ? 1 : 22, 0, param0, 16266, param1);
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 2024561328) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(6, param0 + (param2 << 16), (param3 << 16) + param1, param4 - 2024545062, (Object) null);
    }

    final PlatformTask requestDirectSocket(int param0, int param1, String param2) {
        int var4 = 66 % ((-55 - param1) / 35);
        return this.requestSocketConnection(param0, param2, false, 22);
    }

    final PlatformTask requestDeclaredField(Class param0, int param1, String param2) {
        int var4 = -95 / ((param1 + 49) / 41);
        return this.enqueueTask(9, 0, 0, 16266, new Object[]{param0, param2});
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, int param1) {
        if (param1 != 12250) {
          String var4 = (String) null;
          PlatformTaskDispatcher.openPreferencesFile((byte) 6, (String) null, (String) null, 38);
        }
        return this.enqueueTask(7, 0, 0, param1 + 4016, param0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_89_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          ProxyAuthenticationRequiredException var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          BoundedRandomAccessFile var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.datatransfer.Clipboard var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          Object[] var16 = null;
          Object var17 = null;
          java.awt.Component var17_ref = null;
          Object[] var18 = null;
          var17 = null;
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
                  case 1:
                    if (field_k > dd.correctedCurrentTimeMillis(106)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 22:
                    if (field_k > dd.correctedCurrentTimeMillis(56)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = hh.a(91, var8.intArgument, (String) (var8.objectArgument)).openSocket((byte) -42);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 4:
                    if (dd.correctedCurrentTimeMillis(126) < field_k) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 9:
                    var18 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("dj").getMethod("listmodes", new Class[]{}).invoke(this.field_s, new Object[]{});
                        } else {
                          var8.result = this.field_b.listDisplayModes(0);
                        }
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4 = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("sf").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_i.setCursorPosition(var4, -4, var3_int);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_89_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_89_0;
                          var17_ref = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_i.setCursorVisible(var17_ref, 0, var3_int != 0);
                          } else {
                            Class.forName("sf").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_m, new Object[]{var17_ref, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var16 = (Object[]) (var8.objectArgument);
                          Class.forName("sf").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_m, new Object[]{var16[0], var16[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var16[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_r.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var15 = (String) (var8.objectArgument);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var15.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var15.charAt(var5)) == -1) {
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
                        var3_ref3 = PlatformTaskDispatcher.openPreferencesFile((byte) -70, "", (String) (var8.objectArgument), field_a);
                        var8.result = var3_ref3;
                        break;
                      case 12:
                        var3_ref3 = PlatformTaskDispatcher.openPreferencesFile((byte) -73, field_j, (String) (var8.objectArgument), field_a);
                        var8.result = var3_ref3;
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("dj").getMethod("exit", new Class[]{}).invoke(this.field_s, new Object[]{});
                        } else {
                          this.field_b.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), 8);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("dj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_s, new Object[]{var14, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_b.enterFullscreen(var8.secondaryIntArgument >> 16, 65535 & var8.intArgument, 65535 & var8.secondaryIntArgument, var14, var8.intArgument >>> 16, (byte) -70);
                        }
                        break;
                      case 21:
                        if (dd.correctedCurrentTimeMillis(118) < field_k) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 3:
                        if (field_k > dd.correctedCurrentTimeMillis(104)) {
                          throw new IOException();
                        }
                        var13 = (255 & var8.intArgument >> 24) + "." + (var8.intArgument >> 16 & 255) + "." + (255 & var8.intArgument >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var13).getHostName();
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
                  case 8:
                    var10 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var10[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.intArgument);
                    var8.result = var9;
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

    final PlatformTask requestDisplayModes(int param0) {
        if (param0 > -123) {
          field_p = (java.lang.reflect.Method) null;
        }
        return this.enqueueTask(5, 0, 0, 16266, (Object) null);
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
            if (param0 != 0) {
              return;
            }
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_e != null) {
            try {
              this.field_e.close(param0 ^ 1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_t) {
            try {
              this.field_t.close(1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_q != null) {
            for (var2_int = 0; var2_int < this.field_q.length; var2_int++) {
              if (null != this.field_q[var2_int]) {
                try {
                  this.field_q[var2_int].close(1);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_c != null) {
            try {
              this.field_c.close(1);
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

    final PlatformTask requestDeclaredMethod(Class param0, String param1, Class[] param2, int param3) {
        if (param3 != 29389) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(8, 0, 0, param3 - 13123, new Object[]{param0, param1, param2});
    }

    final boolean isFullscreenAvailable(byte param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 != -68) {
          this.isFullscreenAvailable((byte) 20);
        }
        if (!this.microsoftJvm) {
          return this.field_s != null ? true : false;
        }
        return this.field_b != null ? true : false;
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var7 = null;
        this.field_t = null;
        this.shutdownRequested = false;
        this.queueHead = null;
        this.microsoftJvm = false;
        this.queueTail = null;
        this.privilegedTasksEnabled = false;
        this.field_c = null;
        this.field_e = null;
        field_a = param0;
        field_o = "1.1";
        field_j = param1;
        field_l = "Unknown";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_l = System.getProperty("java.vendor");
          field_o = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_l.toLowerCase().indexOf("microsoft")) {
          this.microsoftJvm = true;
        }
        try {
          field_u = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_u = "Unknown";
        }
        field_r = field_u.toLowerCase();
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
          if (null != field_v) {
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
          this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_p = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        e.a(field_a, field_j, -19960);
        if (this.privilegedTasksEnabled) {
          this.field_c = new BoundedRandomAccessFile(e.a("random.dat", (String) null, -8204, field_a), "rw", 25L);
          this.field_e = new BoundedRandomAccessFile(e.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_t = new BoundedRandomAccessFile(e.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_q = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_q[var5_int] = new BoundedRandomAccessFile(e.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("f").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new DirectDrawFullscreenManager();
              this.field_b = var7;
            } else {
              this.field_s = Class.forName("dj").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_m = Class.forName("sf").newInstance();
            } else {
              this.field_i = new Win32CursorManager();
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
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
