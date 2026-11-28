/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    BoundedRandomAccessFile field_e;
    BoundedRandomAccessFile field_f;
    private Thread workerThread;
    private boolean microsoftJvm;
    private Win32CursorManager field_h;
    boolean privilegedTasksEnabled;
    private PlatformTask queueTail;
    private static volatile long field_o;
    private PlatformTask queueHead;
    private Object field_c;
    private static String field_x;
    BoundedRandomAccessFile field_d;
    private DirectDrawFullscreenManager field_j;
    BoundedRandomAccessFile[] field_l;
    private static String field_i;
    private Object field_a;
    private static int field_b;
    private boolean shutdownRequested;
    static java.lang.reflect.Method field_w;
    private static String field_u;
    static String field_r;
    static String field_g;
    static String field_k;
    java.awt.EventQueue field_s;

    final PlatformTask requestDisplayModes(int param0) {
        if (param0 < 66) {
          field_k = (String) null;
        }
        return this.enqueueTask(5, 0, 1, 0, (Object) null);
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
            var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
          } else {
            if (param1 != 34) {
              var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          if (param0 >= -48) {
            field_w = (java.lang.reflect.Method) null;
          }
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

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 2019341456) {
          field_o = 51L;
        }
        return this.enqueueTask(6, (param4 << 16) + param1, param0 ^ 2019341457, (param3 << 16) + param2, (Object) null);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, byte param1) {
        if (param1 != -107) {
          this.privilegedTasksEnabled = true;
        }
        return this.enqueueTask(7, 0, param1 ^ -108, 0, param0);
    }

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        if (param0 != 5284) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(4, 0, 1, 0, param1);
    }

    private final PlatformTask requestSocketConnection(int param0, int param1, boolean param2, String param3) {
        if (param0 != -19897) {
          this.field_a = (Object) null;
        }
        return this.enqueueTask(!param2 ? 1 : 22, 0, 1, param1, param3);
    }

    final PlatformTask requestThreadStart(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
          this.requestDisplayModes(27);
        }
        return this.enqueueTask(2, 0, 1, param1, param0);
    }

    final PlatformTask requestDeclaredMethod(String param0, Class[] param1, int param2, Class param3) {
        if (param2 < 107) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(8, 0, 1, 0, new Object[]{param3, param0, param1});
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
            if (param0 != 0) {
              return;
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
          if (this.field_f != null) {
            try {
              this.field_f.close(105);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_d) {
            try {
              this.field_d.close(param0 ^ -30);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_l != null) {
            for (var2_int = 0; this.field_l.length > var2_int; var2_int++) {
              if (null != this.field_l[var2_int]) {
                try {
                  this.field_l[var2_int].close(-101);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (this.field_e != null) {
            try {
              this.field_e.close(-62);
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

    final PlatformTask requestDirectSocket(String param0, byte param1, int param2) {
        if (param1 != 34) {
          field_k = (String) null;
        }
        return this.requestSocketConnection(-19897, param2, false, param0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_66_0 = 0;
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
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.Frame var11 = null;
          java.awt.Component var12 = null;
          String var13 = null;
          Object[] var14 = null;
          String var15 = null;
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
                    if (field_o > ih.correctedCurrentTimeMillis((byte) -98)) {
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
                    if (ih.correctedCurrentTimeMillis((byte) -98) < field_o) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 9:
                    var17 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                    break;
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var16.getContents((Object) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (ih.correctedCurrentTimeMillis((byte) -98) < field_o) {
                          throw new IOException();
                        }
                        var15 = (var8.intArgument >> 24 & 255) + "." + ((16759916 & var8.intArgument) >> 16) + "." + ((var8.intArgument & 65314) >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("hg").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          this.field_j.restoreDisplayMode((java.awt.Frame) (var8.objectArgument), (byte) -86);
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile(-100, field_b, field_x, (String) (var8.objectArgument));
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          14 == var2_int) {
                          var3_int = var8.intArgument;
                          var4 = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_h.setCursorPosition(var4, var3_int, (byte) -25);
                          } else {
                            Class.forName("ne").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_a, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_66_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_66_0;
                          var12 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_h.setCursorVisible(var3_int != 0, var12, (byte) -66);
                          } else {
                            Class.forName("ne").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_a, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.objectArgument);
                          Class.forName("ne").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_a, new Object[]{var14[0], var14[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_k.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var13 = (String) (var8.objectArgument);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var13.length() > var5; var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.openPreferencesFile(-122, field_b, "", (String) (var8.objectArgument));
                        var8.result = var3_ref;
                        break;
                      case 6:
                        var11 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var11;
                        var11.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("hg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var11, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_j.enterFullscreen((byte) 85, var8.intArgument >>> 16, var8.secondaryIntArgument & 65535, var11, var8.secondaryIntArgument >> 16, 65535 & var8.intArgument);
                        }
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("hg").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          var8.result = this.field_j.listDisplayModes(0);
                        }
                        break;
                      case 21:
                        if (field_o > ih.correctedCurrentTimeMillis((byte) -98)) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                    }
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 8:
                    var9 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 22:
                    if (field_o > ih.correctedCurrentTimeMillis((byte) -98)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = og.a((byte) -122, (String) (var8.objectArgument), var8.intArgument).openSocket(-128);
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

    final PlatformTask requestDeclaredField(Class param0, int param1, String param2) {
        if (param1 != 0) {
          this.field_h = (Win32CursorManager) null;
        }
        return this.enqueueTask(9, 0, 1, 0, new Object[]{param0, param2});
    }

    private final PlatformTask enqueueTask(int param0, int param1, int param2, int param3, Object param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.secondaryIntArgument = param1;
        var6.requestType = param0;
        var6.intArgument = param3;
        var6.objectArgument = param4;
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
        if (param2 != 1) {
          this.field_a = (Object) null;
        }
        return var6;
    }

    final boolean isFullscreenAvailable(int param0) {
        int var2 = 89 / ((param0 - 61) / 57);
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (!this.microsoftJvm) {
          return null != this.field_c ? true : false;
        }
        return null != this.field_j ? true : false;
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DirectDrawFullscreenManager var7 = null;
        this.field_f = null;
        this.microsoftJvm = false;
        this.queueHead = null;
        this.queueTail = null;
        this.field_d = null;
        this.shutdownRequested = false;
        this.privilegedTasksEnabled = false;
        this.field_e = null;
        field_x = param1;
        field_g = "Unknown";
        field_b = param0;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_r = "1.1";
        try {
          field_g = System.getProperty("java.vendor");
          field_r = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_g.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_i = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_i = "Unknown";
        }
        field_k = field_i.toLowerCase();
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
          if (field_u != null) {
            field_u = field_u + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_u) {
          field_u = "~/";
        }
        try {
          this.field_s = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_w = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        c.a(field_b, 93, field_x);
        if (this.privilegedTasksEnabled) {
          this.field_e = new BoundedRandomAccessFile(c.a("random.dat", field_b, (String) null, (byte) -6), "rw", 25L);
          this.field_f = new BoundedRandomAccessFile(c.a("main_file_cache.dat2", 0), "rw", 314572800L);
          this.field_d = new BoundedRandomAccessFile(c.a("main_file_cache.idx255", 0), "rw", 1048576L);
          this.field_l = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_l[var5_int] = new BoundedRandomAccessFile(c.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("cb").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new DirectDrawFullscreenManager();
              this.field_j = var7;
            } else {
              this.field_c = Class.forName("hg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_a = Class.forName("ne").newInstance();
            } else {
              this.field_h = new Win32CursorManager();
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
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
