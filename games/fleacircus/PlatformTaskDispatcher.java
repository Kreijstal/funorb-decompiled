/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    BoundedRandomAccessFile field_t;
    BoundedRandomAccessFile field_k;
    private Win32CursorManager field_s;
    BoundedRandomAccessFile[] field_l;
    private static String field_g;
    private static String field_v;
    private PlatformTask queueTail;
    private DirectDrawFullscreenManager field_x;
    private static String field_w;
    static String field_d;
    BoundedRandomAccessFile field_q;
    boolean privilegedTasksEnabled;
    private boolean shutdownRequested;
    private static volatile long field_i;
    private Object field_o;
    static java.lang.reflect.Method field_b;
    private Thread workerThread;
    java.awt.EventQueue field_a;
    private PlatformTask queueHead;
    static String field_r;
    private boolean microsoftJvm;
    private Object field_c;
    static String field_n;
    private static int field_p;

    final PlatformTask requestDeclaredMethod(Class[] param0, String param1, Class param2, int param3) {
        if (param3 != 0) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param3 ^ -127, 8, new Object[]{param2, param1, param0}, 0);
    }

    final PlatformTask requestFullscreenEnter(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != -50) {
          this.field_a = (java.awt.EventQueue) null;
        }
        return this.enqueueTask(param2 + (param0 << 16), -108, 6, (Object) null, param4 + (param3 << 16));
    }

    final PlatformTask requestDirectSocket(int param0, byte param1, String param2) {
        if (param1 != 32) {
          return (PlatformTask) null;
        }
        return this.requestSocketConnection(param0, false, param2, 12411);
    }

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 < 107) {
          this.field_o = (Object) null;
        }
        return this.enqueueTask(0, -122, 5, (Object) null, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_58_0 = 0;
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
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          String var14 = null;
          Object[] var15 = null;
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
                    if (lj.correctedCurrentTimeMillis((byte) -125) < field_i) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 22:
                    if (lj.correctedCurrentTimeMillis((byte) -126) < field_i) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = ol.a((String) (var8.objectArgument), 89, var8.intArgument).openSocket(true);
                    } catch (ProxyAuthenticationRequiredException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (ProxyAuthenticationRequiredException) (Object) decompiledCaughtException;
                      var8.result = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 9:
                    var18 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var18[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var17.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_x.listDisplayModes(-7581);
                        } else {
                          var8.result = Class.forName("eh").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var16;
                        var16.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("eh").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var16, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_x.enterFullscreen(var8.intArgument >>> 16, 65535 & var8.intArgument, var16, var8.secondaryIntArgument & 65535, true, var8.secondaryIntArgument >> 16);
                        }
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("eh").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          this.field_x.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), 127);
                        }
                        break;
                      case 12:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile((String) (var8.objectArgument), field_p, 18933, field_w);
                        var8.result = var3_ref2;
                        break;
                      case 13:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile((String) (var8.objectArgument), field_p, 18933, "");
                        var8.result = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          14 == var2_int) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("ig").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_s.setCursorPosition(-128, var3_int, var4_int);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_58_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_58_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("ig").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_o, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_s.setCursorVisible(var13, (byte) -36, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var15 = (Object[]) (var8.objectArgument);
                          Class.forName("ig").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_o, new Object[]{var15[0], var15[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var15[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_d.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var14 = (String) (var8.objectArgument);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var14.length(); var5++) {
                              if (var4.indexOf((int) var14.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref3;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref3);
                          }
                        }
                        break;
                      case 21:
                        if (lj.correctedCurrentTimeMillis((byte) -75) < field_i) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 3:
                        if (field_i > lj.correctedCurrentTimeMillis((byte) -107)) {
                          throw new IOException();
                        }
                        var12 = (255 & var8.intArgument >> 24) + "." + ((var8.intArgument & 16723364) >> 16) + "." + ((var8.intArgument & 65409) >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var12).getHostName();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                    if (field_i > lj.correctedCurrentTimeMillis((byte) -34)) {
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
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_q != null) {
            try {
              this.field_q.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != 125) {
            return;
          }
          if (this.field_t != null) {
            try {
              this.field_t.close(-1);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_l != null) {
            for (var2_int = 0; this.field_l.length > var2_int; var2_int++) {
              if (null != this.field_l[var2_int]) {
                try {
                  this.field_l[var2_int].close(-1);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.close(-1);
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

    private final PlatformTask enqueueTask(int param0, int param1, int param2, Object param3, int param4) {
        PlatformTask var6 = null;
        java.awt.Frame var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param1 >= -72) {
          var9 = (java.awt.Frame) null;
          this.requestFullscreenExit((java.awt.Frame) null, (byte) 97);
        }
        var6 = new PlatformTask();
        var6.secondaryIntArgument = param4;
        var6.objectArgument = param3;
        var6.intArgument = param0;
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

    private final PlatformTask requestSocketConnection(int param0, boolean param1, String param2, int param3) {
        if (param3 != 12411) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param0, -125, !param1 ? 1 : 22, param2, 0);
    }

    private final static BoundedRandomAccessFile openPreferencesFile(String param0, int param1, int param2, String param3) {
        try {
          BoundedRandomAccessFile stackIn_14_0 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          String var9 = null;
          if (param1 != 33) {
            if (34 == param1) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          var6 = 0;
          if (param2 != 18933) {
            var9 = (String) null;
            PlatformTaskDispatcher.openPreferencesFile((String) null, 43, 59, (String) null);
          }
          while (var5.length > var6) {
            var7 = var5[var6];
            if (var7.length() > 0 &&
              !new File(var7).exists()) {
              var6++;
              continue;
            }
            while (true) {
              try {
                var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                stackIn_14_0 = var8;
                return stackIn_14_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = (Exception) (Object) decompiledCaughtException;
                while (true) {
                  var6++;
                  if (var5.length <= var6) {
                    decompiledRegionSelector0 = 0;
                    break;
                  }
                  var7 = var5[var6];
                  if (var7.length() > 0 &&
                    !new File(var7).exists()) {
                    continue;
                  }
                  decompiledRegionSelector0 = 1;
                  break;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                break;
              }
            }
            break;
          }
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, byte param1) {
        if (param1 != -34) {
          this.requestDisplayModes((byte) 116);
        }
        return this.enqueueTask(0, param1 - 64, 7, param0, 0);
    }

    final PlatformTask requestThreadStart(int param0, Runnable param1, int param2) {
        if (param0 != 4532) {
          Runnable var5 = (Runnable) null;
          this.requestThreadStart(-106, (Runnable) null, -56);
        }
        return this.enqueueTask(param2, -99, 2, param1, 0);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 < 95) {
          return false;
        }
        if (!this.microsoftJvm) {
          return null != this.field_c ? true : false;
        }
        return null != this.field_x ? true : false;
    }

    final PlatformTask requestUrlStream(java.net.URL param0, int param1) {
        if (param1 != -34) {
          this.field_t = (BoundedRandomAccessFile) null;
        }
        return this.enqueueTask(0, -81, 4, param0, 0);
    }

    final PlatformTask requestDeclaredField(byte param0, String param1, Class param2) {
        if (param0 < 37) {
          java.net.URL var5 = (java.net.URL) null;
          this.requestUrlStream((java.net.URL) null, 84);
        }
        return this.enqueueTask(0, -97, 9, new Object[]{param2, param1}, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var6 = null;
        this.field_t = null;
        this.field_k = null;
        this.shutdownRequested = false;
        this.queueTail = null;
        this.microsoftJvm = false;
        this.queueHead = null;
        this.privilegedTasksEnabled = false;
        this.field_q = null;
        field_n = "1.1";
        field_r = "Unknown";
        field_p = param0;
        field_w = param1;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_r = System.getProperty("java.vendor");
          field_n = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
          this.microsoftJvm = true;
        }
        try {
          field_g = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_g = "Unknown";
        }
        field_d = field_g.toLowerCase();
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
          if (field_v != null) {
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
          this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        kj.a(field_w, field_p, true);
        if (this.privilegedTasksEnabled) {
          this.field_k = new BoundedRandomAccessFile(kj.a((String) null, -2, field_p, "random.dat"), "rw", 25L);
          this.field_q = new BoundedRandomAccessFile(kj.a(20926, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_t = new BoundedRandomAccessFile(kj.a(20926, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_l = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_l[var5_int] = new BoundedRandomAccessFile(kj.a(20926, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("he").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftJvm) {
              this.field_c = Class.forName("eh").newInstance();
            } else {
              var6 = new DirectDrawFullscreenManager();
              this.field_x = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_s = new Win32CursorManager();
            } else {
              this.field_o = Class.forName("ig").newInstance();
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
        field_i = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
