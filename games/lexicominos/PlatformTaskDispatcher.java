/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    java.awt.EventQueue field_i;
    private static String field_n;
    private PlatformTask queueHead;
    private DirectDrawFullscreenManager field_r;
    private static int field_l;
    BoundedRandomAccessFile field_t;
    static String field_v;
    BoundedRandomAccessFile field_o;
    boolean privilegedTasksEnabled;
    static java.lang.reflect.Method field_x;
    private static String field_s;
    private static String field_a;
    private Win32CursorManager field_u;
    BoundedRandomAccessFile field_w;
    private Object field_f;
    private boolean microsoftJvm;
    static String field_b;
    BoundedRandomAccessFile[] field_c;
    private boolean shutdownRequested;
    private static volatile long field_p;
    static String field_j;
    private Object field_d;
    private PlatformTask queueTail;
    private Thread workerThread;

    final PlatformTask requestFullscreenExit(int param0, java.awt.Frame param1) {
        if (param0 != 0) {
          Runnable var4 = (Runnable) null;
          this.requestThreadStart((Runnable) null, true, -106);
        }
        return this.enqueueTask(param0 ^ -402166672, 0, 0, 7, param1);
    }

    final PlatformTask requestThreadStart(Runnable param0, boolean param1, int param2) {
        if (param1) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(-402166672, 0, param2, 2, param0);
    }

    final void shutdown(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          String var4 = null;
          var2 = this;
          synchronized (var2) {
            if (param0 != -265) {
              var4 = (String) null;
              this.requestDirectSocket(55, (byte) 0, (String) null);
            }
            this.shutdownRequested = true;
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_t != null) {
            try {
              this.field_t.close(true);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_o != null) {
            try {
              this.field_o.close(true);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_c != null) {
            for (var2_int = 0; this.field_c.length > var2_int; var2_int++) {
              if (null != this.field_c[var2_int]) {
                try {
                  this.field_c[var2_int].close(true);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_w != null) {
            try {
              this.field_w.close(true);
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
          int stackIn_82_0 = 0;
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
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          Object[] var13 = null;
          String var14 = null;
          java.awt.Component var15 = null;
          java.awt.Frame var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
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
                  case 1:
                    if (rf.correctedCurrentTimeMillis(0) < field_p) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 9:
                    var18 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var18[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (rf.correctedCurrentTimeMillis(0) < field_p) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("tk").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          var8.result = this.field_r.listDisplayModes(0);
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var16;
                        var16.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_r.enterFullscreen(var16, var8.secondaryIntArgument >> 16, 13486, var8.intArgument >>> 16, 65535 & var8.intArgument, var8.secondaryIntArgument & 65535);
                        } else {
                          Class.forName("tk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var16, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_r.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), -20);
                        } else {
                          Class.forName("tk").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.a((String) (var8.objectArgument), 2, field_s, field_l);
                        var8.result = var3_ref;
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.a((String) (var8.objectArgument), 2, "", field_l);
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4 = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("CursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_u.setCursorPosition(var3_int, var4, 123);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_82_0 = (0 == var8.intArgument) ? 0 : 1;
                          var3_int = stackIn_82_0;
                          var15 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_u.setCursorVisible(var15, var3_int != 0, true);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_d, new Object[]{var15, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var13 = (Object[]) (var8.objectArgument);
                          Class.forName("CursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_d, new Object[]{var13[0], var13[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var13[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_b.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var14 = (String) (var8.objectArgument);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var14.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 3:
                        if (field_p > rf.correctedCurrentTimeMillis(0)) {
                          throw new IOException();
                        }
                        var12 = (var8.intArgument >> 24 & 255) + "." + (255 & var8.intArgument >> 16) + "." + ((var8.intArgument & 65321) >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
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
                  case 4:
                    if (field_p > rf.correctedCurrentTimeMillis(0)) {
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
                    if (rf.correctedCurrentTimeMillis(0) < field_p) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = v.a((String) (var8.objectArgument), var8.intArgument, (byte) 127).b(51);
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

    private final PlatformTask requestSocketConnection(byte param0, boolean param1, String param2, int param3) {
        if (param0 > -125) {
          field_n = (String) null;
        }
        return this.enqueueTask(-402166672, 0, param3, !param1 ? 1 : 22, param2);
    }

    final boolean isFullscreenAvailable(int param0) {
        PlatformTask discarded$0 = null;
        if (param0 != 0) {
          Object var3 = (Object) null;
          discarded$0 = this.enqueueTask(25, 83, 116, 75, (Object) null);
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (!this.microsoftJvm) {
          return null != this.field_f ? true : false;
        }
        return null != this.field_r ? true : false;
    }

    final PlatformTask requestDirectSocket(int param0, byte param1, String param2) {
        int var4 = -71 % ((71 - param1) / 46);
        return this.requestSocketConnection((byte) -126, false, param2, param0);
    }

    final PlatformTask requestDeclaredField(String param0, int param1, Class param2) {
        if (param1 != 2) {
          this.field_f = (Object) null;
        }
        return this.enqueueTask(param1 ^ -402166670, 0, 0, 9, new Object[]{param2, param0});
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 28460) {
          this.field_i = (java.awt.EventQueue) null;
        }
        return this.enqueueTask(-402166672, (param3 << 16) + param4, param2 + (param1 << 16), 6, (Object) null);
    }

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        if (param0 != -23816) {
          this.field_c = (BoundedRandomAccessFile[]) null;
        }
        return this.enqueueTask(-402166672, 0, 0, 4, param1);
    }

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 < 67) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(-402166672, 0, 0, 5, (Object) null);
    }

    final PlatformTask requestDeclaredMethod(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != 113) {
          Class[] var6 = (Class[]) null;
          this.requestDeclaredMethod((String) null, (Class) null, (Class[]) null, (byte) -43);
        }
        return this.enqueueTask(-402166672, 0, 0, 8, new Object[]{param1, param0, param2});
    }

    private final PlatformTask enqueueTask(int param0, int param1, int param2, int param3, Object param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.secondaryIntArgument = param1;
        var6.requestType = param3;
        var6.objectArgument = param4;
        var6.intArgument = param2;
        if (param0 != -402166672) {
          field_v = (String) null;
        }
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

    private final static BoundedRandomAccessFile a(String param0, int param1, String param2, int param3) {
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
            if (param3 != 34) {
              var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
          if (param1 == 2) {
            return null;
          }
          var9 = (String) null;
          PlatformTaskDispatcher.a((String) null, -113, (String) null, 96);
          return null;
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
        DirectDrawFullscreenManager var7 = null;
        this.queueHead = null;
        this.field_w = null;
        this.field_t = null;
        this.microsoftJvm = false;
        this.shutdownRequested = false;
        this.field_o = null;
        this.privilegedTasksEnabled = false;
        this.queueTail = null;
        field_j = "Unknown";
        field_v = "1.1";
        field_s = param1;
        field_l = param0;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_j = System.getProperty("java.vendor");
          field_v = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_j.toLowerCase().indexOf("microsoft")) {
          this.microsoftJvm = true;
        }
        try {
          field_a = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_a = "Unknown";
        }
        field_b = field_a.toLowerCase();
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
          this.field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
        s.a(field_l, field_s, false);
        if (this.privilegedTasksEnabled) {
          this.field_w = new BoundedRandomAccessFile(s.a("random.dat", (String) null, field_l, (byte) -45), "rw", 25L);
          this.field_t = new BoundedRandomAccessFile(s.a(true, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_o = new BoundedRandomAccessFile(s.a(true, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_c = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_c[var5_int] = new BoundedRandomAccessFile(s.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("dk").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftJvm) {
              this.field_f = Class.forName("tk").newInstance();
            } else {
              var7 = new DirectDrawFullscreenManager();
              this.field_r = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_d = Class.forName("CursorController").newInstance();
            } else {
              this.field_u = new Win32CursorManager();
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
