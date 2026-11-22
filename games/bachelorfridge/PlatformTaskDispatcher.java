/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    java.awt.EventQueue field_x;
    private Object field_f;
    private static int field_w;
    BoundedRandomAccessFile field_h;
    static String field_g;
    private Object field_p;
    static String field_i;
    BoundedRandomAccessFile[] field_v;
    private MicrosoftDisplayController field_d;
    private Thread workerThread;
    private static String field_e;
    private static String field_o;
    boolean privilegedTasksEnabled;
    static java.lang.reflect.Method field_m;
    BoundedRandomAccessFile field_n;
    private static String field_s;
    private PlatformTask queueTail;
    private boolean microsoftJvm;
    private static volatile long field_u;
    private PlatformTask queueHead;
    static String field_c;
    BoundedRandomAccessFile field_a;
    private MicrosoftCursorController field_l;
    private boolean shutdownRequested;

    private final static BoundedRandomAccessFile a(String param0, String param1, int param2, int param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          if (param2 != 33) {
            if (param2 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          if (param3 != -1) {
            return (BoundedRandomAccessFile) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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

    final PlatformTask requestDirectSocket(byte param0, String param1, int param2) {
        if (param0 < 117) {
          field_o = (String) null;
        }
        return this.requestSocketConnection(param2, false, -127, param1);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 != 34) {
          return false;
        }
        if (this.microsoftJvm) {
          return this.field_d != null ? true : false;
        }
        return null != this.field_f ? true : false;
    }

    final PlatformTask requestCursorVisibility(java.awt.Component param0, boolean param1, int param2) {
        if (param2 <= 122) {
          this.shutdownRequested = true;
        }
        return this.enqueueTask(0, param0, param1 ? 1 : 0, 0, 15);
    }

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 87) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param4 + (param0 << 16), (Object) null, param3 + (param1 << 16), 0, 6);
    }

    final PlatformTask requestUrlStream(java.net.URL param0, int param1) {
        int var3 = 54 % ((param1 + 56) / 36);
        return this.enqueueTask(0, param0, 0, 0, 4);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, boolean param1) {
        if (param1) {
          this.requestFullscreenEnter(-38, -51, 84, 7, -4);
        }
        return this.enqueueTask(0, param0, 0, 0, 7);
    }

    final PlatformTask requestDisplayModes(int param0) {
        if (param0 != -1) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, (Object) null, 0, 0, 5);
    }

    final PlatformTask requestThreadStart(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
          this.shutdown(-34);
        }
        return this.enqueueTask(0, param0, param2, 0, 2);
    }

    private final PlatformTask enqueueTask(int param0, Object param1, int param2, int param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param3 != 0) {
          this.field_l = (MicrosoftCursorController) null;
        }
        var6 = new PlatformTask();
        var6.objectArgument = param1;
        var6.secondaryIntArgument = param0;
        var6.intArgument = param2;
        var6.requestType = param4;
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

    private final PlatformTask requestSocketConnection(int param0, boolean param1, int param2, String param3) {
        int var5 = 49 % ((param2 + 66) / 51);
        return this.enqueueTask(0, param3, param0, 0, param1 ? 22 : 1);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_95_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          BoundedRandomAccessFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          en var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          Object[] var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
          Thread var18 = null;
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
                  case 2:
                    var18 = new Thread((Runnable) (var8.objectArgument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.intArgument);
                    var8.result = var18;
                    break;
                  case 18:
                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var17.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (field_u > f.correctedCurrentTimeMillis((byte) 73)) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.intArgument >> 24) + "." + (var8.intArgument >> 16 & 255) + "." + (var8.intArgument >> 8 & 255) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_d.a((byte) -122, var8.intArgument & 65535, var8.secondaryIntArgument >> 16, var8.intArgument >>> 16, var14, 65535 & var8.secondaryIntArgument);
                        } else {
                          Class.forName("AwtDisplayController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var14, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.a(field_e, (String) (var8.objectArgument), field_w, -1);
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_l.a(var4_int, var3_int, 9537);
                          } else {
                            Class.forName("CursorController").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_95_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_95_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("CursorController").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_l.a(var13, (byte) -86, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var11 = (Object[]) (var8.objectArgument);
                          Class.forName("CursorController").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var11[0], var11[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var11[2]});
                        } else {
                          if (16 != var2_int) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_i.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var12 = (String) (var8.objectArgument);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var12.length() > var5; var5++) {
                              if (var4.indexOf((int) var12.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
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
                        var3_ref = PlatformTaskDispatcher.a("", (String) (var8.objectArgument), field_w, -1);
                        var8.result = var3_ref;
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("AwtDisplayController").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          this.field_d.a(-31, (java.awt.Frame) (var8.objectArgument));
                        }
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("AwtDisplayController").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        } else {
                          var8.result = this.field_d.a(101);
                        }
                        break;
                      case 21:
                        if (f.correctedCurrentTimeMillis((byte) 73) < field_u) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                    }
                    break;
                  case 9:
                    var10 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var10[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                    break;
                  case 8:
                    var9 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_u > f.correctedCurrentTimeMillis((byte) 73)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 22:
                    if (f.correctedCurrentTimeMillis((byte) 73) < field_u) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (en) null;
                      var8.result = lda.a((String) (var8.objectArgument), var8.intArgument, (byte) -113).a((byte) -70);
                    } catch (en decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (en) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (f.correctedCurrentTimeMillis((byte) 73) < field_u) {
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

    final void shutdown(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          IOException var2_ref2 = null;
          IOException var3 = null;
          if (param0 <= 20) {
            this.shutdown(-108);
          }
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
          if (null != this.field_h) {
            try {
              this.field_h.close(true);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.close(true);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2_int = 0; this.field_v.length > var2_int; var2_int++) {
              if (null != this.field_v[var2_int]) {
                try {
                  this.field_v[var2_int].close(true);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_a) {
            try {
              this.field_a.close(true);
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

    final PlatformTask requestDeclaredField(String param0, Class param1, int param2) {
        if (param2 >= -127) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, new Object[]{param1, param0}, 0, 0, 9);
    }

    final PlatformTask requestDeclaredMethod(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 31633) {
          field_o = (String) null;
        }
        return this.enqueueTask(0, new Object[]{param1, param3, param2}, 0, param0 - 31633, 8);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        MicrosoftDisplayController var7 = null;
        this.privilegedTasksEnabled = false;
        this.field_h = null;
        this.queueTail = null;
        this.microsoftJvm = false;
        this.field_n = null;
        this.field_a = null;
        this.shutdownRequested = false;
        this.queueHead = null;
        field_e = param1;
        field_w = param0;
        field_g = "Unknown";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_c = "1.1";
        try {
          field_g = System.getProperty("java.vendor");
          field_c = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_g.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_s = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_s = "Unknown";
        }
        field_i = field_s.toLowerCase();
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
          field_o = System.getProperty("user.home");
          if (field_o != null) {
            field_o = field_o + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_o) {
          field_o = "~/";
        }
        try {
          this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        hu.a(0, field_w, field_e);
        if (this.privilegedTasksEnabled) {
          this.field_a = new BoundedRandomAccessFile(hu.a(field_w, "random.dat", (String) null, 1), "rw", 25L);
          this.field_h = new BoundedRandomAccessFile(hu.a("main_file_cache.dat2", 0), "rw", 314572800L);
          this.field_n = new BoundedRandomAccessFile(hu.a("main_file_cache.idx255", 0), "rw", 1048576L);
          this.field_v = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_v[var5_int] = new BoundedRandomAccessFile(hu.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("cna").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new MicrosoftDisplayController();
              this.field_d = var7;
            } else {
              this.field_f = Class.forName("AwtDisplayController").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_p = Class.forName("CursorController").newInstance();
            } else {
              this.field_l = new MicrosoftCursorController();
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
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
