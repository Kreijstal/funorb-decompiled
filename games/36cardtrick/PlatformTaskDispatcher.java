/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private static String field_s;
    private Win32CursorManager field_f;
    BoundedRandomAccessFile field_d;
    java.awt.EventQueue field_e;
    private boolean microsoftJvm;
    static String field_m;
    private DirectDrawFullscreenManager field_i;
    BoundedRandomAccessFile field_t;
    BoundedRandomAccessFile field_x;
    static String field_v;
    private Thread workerThread;
    static java.lang.reflect.Method field_g;
    private static int field_u;
    boolean privilegedTasksEnabled;
    BoundedRandomAccessFile[] field_o;
    private static String field_r;
    private PlatformTask queueTail;
    private static String field_a;
    static String field_w;
    private boolean shutdownRequested;
    private Object field_l;
    private static volatile long field_k;
    private Object field_h;
    private PlatformTask queueHead;

    final PlatformTask requestUrlStream(java.net.URL param0, boolean param1) {
        if (!param1) {
          this.field_d = (BoundedRandomAccessFile) null;
        }
        return this.enqueueTask(4, 0, 0, 13003, param0);
    }

    final boolean isFullscreenAvailable(byte param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 >= -115) {
          java.awt.Frame var3 = (java.awt.Frame) null;
          this.requestFullscreenExit((byte) 54, (java.awt.Frame) null);
        }
        if (!this.microsoftJvm) {
          return null != this.field_l ? true : false;
        }
        return null != this.field_i ? true : false;
    }

    private final static BoundedRandomAccessFile openPreferencesFile(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param1 == 34) {
              var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 > -61) {
            return (BoundedRandomAccessFile) null;
          }
          for (var6 = 0; var5.length > var6; var6++) {
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

    private final PlatformTask enqueueTask(int param0, int param1, int param2, int param3, Object param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param3 != 13003) {
          this.field_o = (BoundedRandomAccessFile[]) null;
        }
        var6 = new PlatformTask();
        var6.requestType = param0;
        var6.objectArgument = param4;
        var6.intArgument = param2;
        var6.secondaryIntArgument = param1;
        var7 = this;
        synchronized (var7) {
          if (null == this.queueTail) {
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

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 != 104) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(5, 0, 0, 13003, (Object) null);
    }

    final PlatformTask requestThreadStart(int param0, int param1, Runnable param2) {
        if (param0 != 0) {
          this.run();
        }
        return this.enqueueTask(2, 0, param1, 13003, param2);
    }

    final PlatformTask requestDeclaredField(Class param0, String param1, int param2) {
        if (param2 <= 58) {
          java.net.URL var5 = (java.net.URL) null;
          this.requestUrlStream((java.net.URL) null, true);
        }
        return this.enqueueTask(9, 0, 0, 13003, new Object[]{param0, param1});
    }

    final PlatformTask requestFullscreenExit(byte param0, java.awt.Frame param1) {
        if (param0 >= -9) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(7, 0, 0, 13003, param1);
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
          if (null != this.field_t) {
            try {
              this.field_t.close((byte) 42);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_d != null) {
            try {
              this.field_d.close((byte) 79);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_o) {
            for (var2_int = 0; this.field_o.length > var2_int; var2_int++) {
              if (this.field_o[var2_int] != null) {
                try {
                  this.field_o[var2_int].close((byte) 39);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_x) {
            try {
              this.field_x.close((byte) 14);
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

    final PlatformTask requestDeclaredMethod(byte param0, Class param1, String param2, Class[] param3) {
        if (param0 != 99) {
          this.field_t = (BoundedRandomAccessFile) null;
        }
        return this.enqueueTask(8, 0, 0, 13003, new Object[]{param1, param2, param3});
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != -30) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(6, (param0 << 16) + param2, param1 + (param4 << 16), 13003, (Object) null);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_77_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          BoundedRandomAccessFile var3_ref_wk = null;
          ProxyAuthenticationRequiredException var3_ref_vc = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.Component var14 = null;
          java.awt.Frame var15 = null;
          String var16 = null;
          Object[] var17 = null;
          Object[] var18 = null;
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
                  var3_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
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
                    if (id.correctedCurrentTimeMillis(22) < field_k) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 4:
                    if (id.correctedCurrentTimeMillis(58) < field_k) {
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
                  case 9:
                    var17 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (id.correctedCurrentTimeMillis(23) < field_k) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.intArgument >> 24) + "." + ((var8.intArgument & 16776207) >> 16) + "." + (255 & var8.intArgument >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("ka").getMethod("listmodes", new Class[]{}).invoke(this.field_l, new Object[]{});
                        } else {
                          var8.result = this.field_i.listDisplayModes(0);
                        }
                        break;
                      case 6:
                        var15 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var15;
                        var15.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_i.enterFullscreen(119, var8.intArgument & 65535, var8.intArgument >>> 16, var8.secondaryIntArgument >> 16, 65535 & var8.secondaryIntArgument, var15);
                        } else {
                          Class.forName("ka").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_l, new Object[]{var15, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        }
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          14 == var2_int) {
                          var3 = var8.intArgument;
                          var4 = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("ob").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3), new Integer(var4)});
                          } else {
                            this.field_f.setCursorPosition(var3, var4, 32512);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_77_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3 = stackIn_77_0;
                          var14 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_f.setCursorVisible(var3 != 0, var14, -4);
                          } else {
                            Class.forName("ob").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var14, new Boolean(var3 != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.objectArgument);
                          Class.forName("ob").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var12[0], var12[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_m.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var13 = (String) (var8.objectArgument);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref_Exception;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref_Exception);
                          }
                        }
                        break;
                      case 13:
                        var3_ref_wk = PlatformTaskDispatcher.openPreferencesFile(-120, field_u, (String) (var8.objectArgument), "");
                        var8.result = var3_ref_wk;
                        break;
                      case 12:
                        var3_ref_wk = PlatformTaskDispatcher.openPreferencesFile(-120, field_u, (String) (var8.objectArgument), field_a);
                        var8.result = var3_ref_wk;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_i.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), -104);
                        } else {
                          Class.forName("ka").getMethod("exit", new Class[]{}).invoke(this.field_l, new Object[]{});
                        }
                        break;
                      case 21:
                        if (id.correctedCurrentTimeMillis(123) < field_k) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 18:
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var10.getContents((Object) null);
                    break;
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.intArgument);
                    var8.result = var9;
                    break;
                  case 22:
                    if (field_k > id.correctedCurrentTimeMillis(98)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = nc.a((String) (var8.objectArgument), (byte) 40, var8.intArgument).openSocket(-26042);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_vc = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref_vc.getMessage();
                      throw var3_ref_vc;
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

    final PlatformTask requestDirectSocket(String param0, byte param1, int param2) {
        if (param1 >= -19) {
          this.requestDisplayModes((byte) -67);
        }
        return this.requestSocketConnection(param0, false, param2, (byte) 127);
    }

    private final PlatformTask requestSocketConnection(String param0, boolean param1, int param2, byte param3) {
        if (param3 <= 126) {
          this.field_e = (java.awt.EventQueue) null;
        }
        return this.enqueueTask(param1 ? 22 : 1, 0, param2, 13003, param0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var6 = null;
        this.field_t = null;
        this.privilegedTasksEnabled = false;
        this.field_d = null;
        this.field_x = null;
        this.microsoftJvm = false;
        this.shutdownRequested = false;
        this.queueTail = null;
        this.queueHead = null;
        field_v = "Unknown";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_u = param0;
        field_w = "1.1";
        field_a = param1;
        try {
          field_v = System.getProperty("java.vendor");
          field_w = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_v.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_r = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_r = "Unknown";
        }
        field_m = field_r.toLowerCase();
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
          field_s = System.getProperty("user.home");
          if (field_s != null) {
            field_s = field_s + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_s) {
          field_s = "~/";
        }
        try {
          this.field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        dk.a(field_a, field_u, (byte) 86);
        if (this.privilegedTasksEnabled) {
          this.field_x = new BoundedRandomAccessFile(dk.a((String) null, field_u, (byte) 123, "random.dat"), "rw", 25L);
          this.field_t = new BoundedRandomAccessFile(dk.a(false, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_d = new BoundedRandomAccessFile(dk.a(false, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_o = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_o[var5_int] = new BoundedRandomAccessFile(dk.a(false, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("oi").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new DirectDrawFullscreenManager();
              this.field_i = var6;
            } else {
              this.field_l = Class.forName("ka").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_f = new Win32CursorManager();
            } else {
              this.field_h = Class.forName("ob").newInstance();
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
