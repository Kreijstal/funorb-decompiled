/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private boolean microsoftJvm;
    private static String field_a;
    private mb field_v;
    private static String field_p;
    static String field_r;
    private static int field_l;
    java.awt.EventQueue field_x;
    BoundedRandomAccessFile field_b;
    private w field_k;
    private boolean shutdownRequested;
    boolean privilegedTasksEnabled;
    private static volatile long field_w;
    static String field_t;
    static String field_n;
    BoundedRandomAccessFile[] field_c;
    private Thread workerThread;
    private static String field_f;
    BoundedRandomAccessFile field_d;
    private PlatformTask queueHead;
    private Object field_u;
    BoundedRandomAccessFile field_m;
    private PlatformTask queueTail;
    private Object field_e;
    static java.lang.reflect.Method field_g;

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        if (param0 <= 96) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 4, param1, 0, 0);
    }

    final PlatformTask requestDirectSocket(String param0, int param1, int param2) {
        int var4 = -60 / ((param2 + 13) / 39);
        return this.requestSocketConnection(param0, -122, param1, false);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 != -20) {
          return false;
        }
        if (this.microsoftJvm) {
          return null != this.field_v ? true : false;
        }
        return this.field_e != null ? true : false;
    }

    final PlatformTask requestThreadStart(Runnable param0, int param1, byte param2) {
        int var4 = 67 % ((param2 + 62) / 51);
        return this.enqueueTask(0, 2, param0, param1, 0);
    }

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 > -77) {
          this.field_u = (Object) null;
        }
        return this.enqueueTask(0, 5, (Object) null, 0, 0);
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
            if (param0 <= 50) {
              this.requestDisplayModes((byte) 40);
            }
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_d) {
            try {
              this.field_d.close(127);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_b) {
            try {
              this.field_b.close(-59);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_c != null) {
            for (var2_int = 0; this.field_c.length > var2_int; var2_int++) {
              if (null != this.field_c[var2_int]) {
                try {
                  this.field_c[var2_int].close(108);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_m) {
            try {
              this.field_m.close(119);
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

    final PlatformTask requestDeclaredField(Class param0, String param1, byte param2) {
        PlatformTask discarded$0 = null;
        if (param2 != 14) {
          String var5 = (String) null;
          discarded$0 = this.requestSocketConnection((String) null, 80, -32, false);
        }
        return this.enqueueTask(0, 9, new Object[]{param0, param1}, 0, 0);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, byte param1) {
        int var3 = -63 % ((-42 - param1) / 41);
        return this.enqueueTask(0, 7, param0, 0, 0);
    }

    private final static BoundedRandomAccessFile a(String param0, byte param1, String param2, int param3) {
        try {
          int var6 = 0;
          BoundedRandomAccessFile stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          BoundedRandomAccessFile var8 = null;
          Exception var8_ref = null;
          if (33 == param3) {
            var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
            }
          }
          if (param1 != -77) {
            return (BoundedRandomAccessFile) null;
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
          this.queueTail = (PlatformTask) null;
        }
        return this.enqueueTask(param2 + (param4 << 16), 6, (Object) null, (param0 << 16) + param1, 0);
    }

    final PlatformTask requestDeclaredMethod(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != -39) {
          field_w = 95L;
        }
        return this.enqueueTask(0, 8, new Object[]{param1, param0, param2}, 0, 0);
    }

    private final PlatformTask requestSocketConnection(String param0, int param1, int param2, boolean param3) {
        if (param1 >= -120) {
          field_n = (String) null;
        }
        return this.enqueueTask(0, !param3 ? 1 : 22, param0, param2, 0);
    }

    private final PlatformTask enqueueTask(int param0, int param1, Object param2, int param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param4 != 0) {
          return (PlatformTask) null;
        }
        var6 = new PlatformTask();
        var6.requestType = param1;
        var6.objectArgument = param2;
        var6.intArgument = param3;
        var6.secondaryIntArgument = param0;
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
          int var3_int = 0;
          Exception var3_ref = null;
          BoundedRandomAccessFile var3_ref2 = null;
          qk var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          java.awt.Frame var12 = null;
          java.awt.Component var13 = null;
          String var14 = null;
          Object[] var15 = null;
          String var16 = null;
          java.awt.datatransfer.Clipboard var17 = null;
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
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 3:
                        if (la.correctedCurrentTimeMillis(false) < field_w) {
                          throw new IOException();
                        }
                        var16 = (255 & var8.intArgument >> 24) + "." + (255 & var8.intArgument >> 16) + "." + ((var8.intArgument & 65384) >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var16).getHostName();
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_k.a(var3_int, 1, var4_int);
                          } else {
                            Class.forName("tj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          15 == var2_int) {
                          stackIn_80_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_80_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("tj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_k.a((byte) -126, var13, var3_int != 0);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var15 = (Object[]) (var8.objectArgument);
                          Class.forName("tj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var15[0], var15[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var15[2]});
                        } else {
                          if (16 != var2_int) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_r.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var14 = (String) (var8.objectArgument);
                            if (!var14.startsWith("http://") &&
                              !var14.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var14.length() > var5; var5++) {
                              if (var4.indexOf((int) var14.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref);
                          }
                        }
                        break;
                      case 13:
                        var3_ref2 = PlatformTaskDispatcher.a("", (byte) -77, (String) (var8.objectArgument), field_l);
                        var8.result = var3_ref2;
                        break;
                      case 12:
                        var3_ref2 = PlatformTaskDispatcher.a(field_p, (byte) -77, (String) (var8.objectArgument), field_l);
                        var8.result = var3_ref2;
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("ve").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                        } else {
                          this.field_v.a(7537, (java.awt.Frame) (var8.objectArgument));
                        }
                        break;
                      case 6:
                        var12 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var12;
                        var12.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_v.a(65535 & var8.secondaryIntArgument, var8.intArgument >>> 16, var8.secondaryIntArgument >> 16, -16, 65535 & var8.intArgument, var12);
                        } else {
                          Class.forName("ve").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var12, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_v.a(0);
                        } else {
                          var8.result = Class.forName("ve").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_w > la.correctedCurrentTimeMillis(false)) {
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
                    if (field_w > la.correctedCurrentTimeMillis(false)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 22:
                    if (la.correctedCurrentTimeMillis(false) < field_w) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (qk) null;
                      var8.result = el.a((String) (var8.objectArgument), var8.intArgument, (byte) 58).a(true);
                    } catch (qk decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (qk) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (field_w > la.correctedCurrentTimeMillis(false)) {
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
        mb var6 = null;
        this.microsoftJvm = false;
        this.privilegedTasksEnabled = false;
        this.field_b = null;
        this.shutdownRequested = false;
        this.field_d = null;
        this.field_m = null;
        this.queueHead = null;
        this.queueTail = null;
        field_t = "1.1";
        field_n = "Unknown";
        field_p = param1;
        field_l = param0;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_n = System.getProperty("java.vendor");
          field_t = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_n.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_a = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_a = "Unknown";
        }
        field_r = field_a.toLowerCase();
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
          field_f = System.getProperty("user.home");
          if (null != field_f) {
            field_f = field_f + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_f) {
          field_f = "~/";
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
            field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        vf.a(true, field_p, field_l);
        if (this.privilegedTasksEnabled) {
          this.field_m = new BoundedRandomAccessFile(vf.a(field_l, 1387, (String) null, "random.dat"), "rw", 25L);
          this.field_d = new BoundedRandomAccessFile(vf.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_b = new BoundedRandomAccessFile(vf.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_c = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_c[var5_int] = new BoundedRandomAccessFile(vf.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("ef").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new mb();
              this.field_v = var6;
            } else {
              this.field_e = Class.forName("ve").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_k = new w();
            } else {
              this.field_u = Class.forName("tj").newInstance();
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
