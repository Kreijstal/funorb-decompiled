/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private static volatile long field_s;
    private static int field_a;
    pl field_t;
    pl field_x;
    private Win32CursorManager field_g;
    boolean privilegedTasksEnabled;
    private static String field_w;
    private boolean microsoftJvm;
    private static String field_d;
    pl[] field_e;
    private static String field_j;
    private PlatformTask queueTail;
    static String field_f;
    static String field_l;
    static String field_m;
    private Thread workerThread;
    private DirectDrawFullscreenManager field_k;
    static java.lang.reflect.Method field_h;
    private PlatformTask queueHead;
    private boolean shutdownRequested;
    private Object field_v;
    pl field_i;
    java.awt.EventQueue field_b;
    private Object field_n;

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 > -10) {
          this.field_v = (Object) null;
        }
        return this.enqueueTask(0, 0, 5, (Object) null, (byte) 116);
    }

    final boolean isFullscreenAvailable(int param0) {
        PlatformTask discarded$0 = null;
        if (param0 != 2) {
          Object var3 = (Object) null;
          discarded$0 = this.enqueueTask(76, -63, -117, (Object) null, (byte) 11);
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (!this.microsoftJvm) {
          return null != this.field_v ? true : false;
        }
        return null != this.field_k ? true : false;
    }

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
            this.notifyAll();
          }
          try {
            if (param0 != -84) {
              this.run();
            }
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.a(19808);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_i != null) {
            try {
              this.field_i.a(param0 + 19892);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_e) {
            for (var2_int = 0; this.field_e.length > var2_int; var2_int++) {
              if (this.field_e[var2_int] != null) {
                try {
                  this.field_e[var2_int].a(19808);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_x != null) {
            try {
              this.field_x.a(19808);
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

    private final PlatformTask enqueueTask(int param0, int param1, int param2, Object param3, byte param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.intArgument = param0;
        var6.objectArgument = param3;
        if (param4 != 116) {
          this.requestDisplayModes((byte) 104);
        }
        var6.secondaryIntArgument = param1;
        var6.requestType = param2;
        var7 = this;
        synchronized (var7) {
          if (this.queueTail != null) {
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

    private final static pl a(int param0, String param1, String param2, byte param3) {
        try {
          int var6 = 0;
          pl stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          pl var8 = null;
          Exception var8_ref = null;
          if (param0 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param0 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
            }
          }
          if (param3 != 84) {
            field_l = (String) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                var8 = new pl(new File(var7, var4), "rw", 10000L);
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

    final PlatformTask requestDeclaredMethod(int param0, Class[] param1, Class param2, String param3) {
        int var5 = -103 / ((param0 - 62) / 32);
        return this.enqueueTask(0, 0, 8, new Object[]{param2, param3, param1}, (byte) 116);
    }

    private final PlatformTask requestSocketConnection(byte param0, String param1, boolean param2, int param3) {
        if (param0 != 118) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param3, 0, param2 ? 22 : 1, param1, (byte) 116);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_83_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3_ref_InterruptedException = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          pl var3_ref_pl = null;
          ProxyAuthenticationRequiredException var3_ref_pg = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.Frame var12 = null;
          String var13 = null;
          Object[] var14 = null;
          java.awt.Component var15 = null;
          String var16 = null;
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
                    if (pf.correctedCurrentTimeMillis(0) < field_s) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.objectArgument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.intArgument);
                    var8.result = var18;
                    break;
                  case 4:
                    if (field_s > pf.correctedCurrentTimeMillis(0)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 8:
                    var17 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (pf.correctedCurrentTimeMillis(0) < field_s) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.intArgument >> 24) + "." + (255 & var8.intArgument >> 16) + "." + ((var8.intArgument & 65491) >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 21:
                        if (pf.correctedCurrentTimeMillis(0) < field_s) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_k.listDisplayModes((byte) 88);
                        } else {
                          var8.result = Class.forName("se").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                        }
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3 = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_g.setCursorPosition((byte) 121, var3, var4_int);
                          } else {
                            Class.forName("bm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_83_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3 = stackIn_83_0;
                          var15 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("bm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var15, new Boolean(var3 != 0)});
                          } else {
                            this.field_g.setCursorVisible(var3 != 0, (byte) 90, var15);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          17 == var2_int) {
                          var14 = (Object[]) (var8.objectArgument);
                          Class.forName("bm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var14[0], var14[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var14[2]});
                        } else {
                          if (16 != var2_int) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_f.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var13 = (String) (var8.objectArgument);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var13.length(); var5++) {
                              if (var4.indexOf((int) var13.charAt(var5)) == -1) {
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
                        var3_ref_pl = PlatformTaskDispatcher.a(field_a, "", (String) (var8.objectArgument), (byte) 84);
                        var8.result = var3_ref_pl;
                        break;
                      case 12:
                        var3_ref_pl = PlatformTaskDispatcher.a(field_a, field_j, (String) (var8.objectArgument), (byte) 84);
                        var8.result = var3_ref_pl;
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("se").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                        } else {
                          this.field_k.restoreDisplayMode(106, (java.awt.Frame) (var8.objectArgument));
                        }
                        break;
                      case 6:
                        var12 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var12;
                        var12.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("se").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var12, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_k.enterFullscreen(var8.secondaryIntArgument & 65535, 65535 & var8.intArgument, var8.secondaryIntArgument >> 16, var8.intArgument >>> 16, -16, var12);
                        }
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
                  case 9:
                    var9 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                    break;
                  case 22:
                    if (pf.correctedCurrentTimeMillis(0) < field_s) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = DualLinkNode.a((String) (var8.objectArgument), (byte) -84, var8.intArgument).a(0);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref_pg = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref_pg.getMessage();
                      throw var3_ref_pg;
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

    final PlatformTask requestDeclaredField(boolean param0, Class param1, String param2) {
        if (param0) {
          this.requestDisplayModes((byte) -62);
        }
        return this.enqueueTask(0, 0, 9, new Object[]{param1, param2}, (byte) 116);
    }

    final PlatformTask requestDirectSocket(String param0, int param1, int param2) {
        if (param1 != 0) {
          this.shutdown((byte) 110);
        }
        return this.requestSocketConnection((byte) 118, param0, false, param2);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, int param1) {
        int var3 = 18 % ((-50 - param1) / 57);
        return this.enqueueTask(0, 0, 7, param0, (byte) 116);
    }

    final PlatformTask requestUrlStream(byte param0, java.net.URL param1) {
        if (param0 <= 96) {
          this.field_b = (java.awt.EventQueue) null;
        }
        return this.enqueueTask(0, 0, 4, param1, (byte) 116);
    }

    final PlatformTask requestThreadStart(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
          this.field_v = (Object) null;
        }
        return this.enqueueTask(param1, 0, 2, param0, (byte) 116);
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          String var7 = (String) null;
          this.requestDeclaredMethod(111, (Class[]) null, (Class) null, (String) null);
        }
        return this.enqueueTask(param1 + (param0 << 16), param3 + (param4 << 16), 6, (Object) null, (byte) 116);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var7 = null;
        this.field_x = null;
        this.queueTail = null;
        this.privilegedTasksEnabled = false;
        this.field_t = null;
        this.queueHead = null;
        this.microsoftJvm = false;
        this.shutdownRequested = false;
        this.field_i = null;
        field_a = param0;
        field_m = "1.1";
        field_j = param1;
        field_l = "Unknown";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_l = System.getProperty("java.vendor");
          field_m = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_l.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_w = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_w = "Unknown";
        }
        field_f = field_w.toLowerCase();
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
          field_d = System.getProperty("user.home");
          if (field_d != null) {
            field_d = field_d + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_d == null) {
          field_d = "~/";
        }
        try {
          this.field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        nk.a(field_a, 0, field_j);
        if (this.privilegedTasksEnabled) {
          this.field_x = new pl(nk.a(-1, "random.dat", (String) null, field_a), "rw", 25L);
          this.field_t = new pl(nk.a("main_file_cache.dat2", -2), "rw", 314572800L);
          this.field_i = new pl(nk.a("main_file_cache.idx255", -2), "rw", 1048576L);
          this.field_e = new pl[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_e[var5_int] = new pl(nk.a("main_file_cache.idx" + var5_int, -2), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("oc").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new DirectDrawFullscreenManager();
              this.field_k = var7;
            } else {
              this.field_v = Class.forName("se").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_g = new Win32CursorManager();
            } else {
              this.field_n = Class.forName("bm").newInstance();
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
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
