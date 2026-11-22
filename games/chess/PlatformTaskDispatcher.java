/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private ff field_h;
    static java.lang.reflect.Method field_m;
    BoundedRandomAccessFile field_n;
    private static volatile long field_f;
    private gj field_v;
    boolean privilegedTasksEnabled;
    static String field_c;
    private static String field_l;
    private PlatformTask queueHead;
    private PlatformTask queueTail;
    private Thread workerThread;
    private Object field_g;
    private static String field_e;
    BoundedRandomAccessFile field_a;
    private boolean shutdownRequested;
    private static String field_j;
    private Object field_u;
    java.awt.EventQueue field_x;
    BoundedRandomAccessFile field_d;
    private static int field_b;
    static String field_o;
    BoundedRandomAccessFile[] field_r;
    static String field_i;
    private boolean microsoftJvm;

    final PlatformTask requestDeclaredMethod(int param0, String param1, Class[] param2, Class param3) {
        PlatformTask discarded$0 = null;
        if (param0 != 8) {
          String var6 = (String) null;
          discarded$0 = this.requestSocketConnection((String) null, 21, 78, false);
        }
        return this.enqueueTask(param0 ^ 9, 0, new Object[]{param3, param1, param2}, 8, 0);
    }

    final PlatformTask requestThreadStart(int param0, boolean param1, Runnable param2) {
        if (!param1) {
          this.requestDisplayModes(117);
        }
        return this.enqueueTask(1, param0, param2, 2, 0);
    }

    final PlatformTask requestDeclaredField(String param0, Class param1, byte param2) {
        if (param2 < 4) {
          field_m = (java.lang.reflect.Method) null;
        }
        return this.enqueueTask(1, 0, new Object[]{param1, param0}, 9, 0);
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
          if (param0 != 0) {
            var4 = (String) null;
            this.requestDirectSocket((String) null, true, -30);
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
          if (null != this.field_a) {
            try {
              this.field_a.close(10992);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            try {
              this.field_n.close(10992);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_r) {
            for (var2_int = 0; var2_int < this.field_r.length; var2_int++) {
              if (null != this.field_r[var2_int]) {
                try {
                  this.field_r[var2_int].close(10992);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_d) {
            try {
              this.field_d.close(param0 ^ 10992);
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

    private final PlatformTask requestSocketConnection(String param0, int param1, int param2, boolean param3) {
        if (param1 != 0) {
          this.requestFullscreenEnter(97, -106, 27, 64, -97);
        }
        return this.enqueueTask(param1 + 1, param2, param0, !param3 ? 1 : 22, 0);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, boolean param1) {
        if (param1) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(1, 0, param0, 7, 0);
    }

    private final PlatformTask enqueueTask(int param0, int param1, Object param2, int param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param0 != 1) {
          return (PlatformTask) null;
        }
        var6 = new PlatformTask();
        var6.secondaryIntArgument = param4;
        var6.requestType = param3;
        var6.objectArgument = param2;
        var6.intArgument = param1;
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

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 89) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(1, (param0 << 16) + param1, (Object) null, 6, param4 + (param3 << 16));
    }

    final PlatformTask requestUrlStream(byte param0, java.net.URL param1) {
        if (param0 != -49) {
          this.requestFullscreenEnter(100, -38, -20, -23, 39);
        }
        return this.enqueueTask(1, 0, param1, 4, 0);
    }

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
          if (param2 <= 74) {
            field_j = (String) null;
          }
          if (33 != param3) {
            if (param3 != 34) {
              var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_72_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          BoundedRandomAccessFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          oa var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Object[] var9 = null;
          Object[] var10 = null;
          java.awt.Frame var11 = null;
          java.awt.Component var12 = null;
          String var13 = null;
          Object[] var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
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
                        if (field_f > ud.a(2)) {
                          throw new IOException();
                        }
                        var15 = (255 & var8.intArgument >> 24) + "." + (255 & var8.intArgument >> 16) + "." + ((var8.intArgument & 65468) >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 21:
                        if (field_f > ud.a(2)) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_v.a(0);
                        } else {
                          var8.result = Class.forName("wd").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                        }
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.a("", (String) (var8.objectArgument), 90, field_b);
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("sm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_h.a(0, var3_int, var4_int);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_72_0 = (0 == var8.intArgument) ? 0 : 1;
                          var3_int = stackIn_72_0;
                          var12 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_h.a(29783, var3_int != 0, var12);
                          } else {
                            Class.forName("sm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.objectArgument);
                          Class.forName("sm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var14[0], var14[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_c.startsWith("win")) {
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
                            var3_ref2 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref2;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref2);
                          }
                        }
                        break;
                      case 12:
                        var3_ref = PlatformTaskDispatcher.a(field_j, (String) (var8.objectArgument), 91, field_b);
                        var8.result = var3_ref;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_v.a(121, (java.awt.Frame) (var8.objectArgument));
                        } else {
                          Class.forName("wd").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                        }
                        break;
                      case 6:
                        var11 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var11;
                        var11.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_v.a(var11, var8.intArgument & 65535, 65535 & var8.secondaryIntArgument, 127, var8.intArgument >>> 16, var8.secondaryIntArgument >> 16);
                        } else {
                          Class.forName("wd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var11, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
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
                      null == ((Class) (var9[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                    break;
                  case 4:
                    if (field_f > ud.a(2)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 22:
                    if (field_f > ud.a(2)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (oa) null;
                      var8.result = bl.a(0, var8.intArgument, (String) (var8.objectArgument)).a((byte) -101);
                    } catch (oa decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (oa) (Object) decompiledCaughtException;
                      var8.result = var3_ref3.getMessage();
                      throw var3_ref3;
                    }
                    break;
                  case 1:
                    if (ud.a(2) < field_f) {
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

    final boolean isFullscreenAvailable(boolean param0) {
        if (!param0) {
          this.privilegedTasksEnabled = false;
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (this.microsoftJvm) {
          return this.field_v != null ? true : false;
        }
        return null != this.field_g ? true : false;
    }

    final PlatformTask requestDirectSocket(String param0, boolean param1, int param2) {
        if (param1) {
          return (PlatformTask) null;
        }
        return this.requestSocketConnection(param0, 0, param2, false);
    }

    final PlatformTask requestDisplayModes(int param0) {
        if (param0 != -16312) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(1, 0, (Object) null, 5, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        gj var6 = null;
        this.privilegedTasksEnabled = false;
        this.shutdownRequested = false;
        this.queueHead = null;
        this.field_a = null;
        this.field_d = null;
        this.queueTail = null;
        this.field_n = null;
        this.microsoftJvm = false;
        field_i = "1.1";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_o = "Unknown";
        field_b = param0;
        field_j = param1;
        try {
          field_o = System.getProperty("java.vendor");
          field_i = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
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
          field_l = System.getProperty("user.home");
          if (null != field_l) {
            field_l = field_l + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_l) {
          field_l = "~/";
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
        ul.a(21747, field_j, field_b);
        if (this.privilegedTasksEnabled) {
          this.field_d = new BoundedRandomAccessFile(ul.a((String) null, field_b, "random.dat", (byte) 86), "rw", 25L);
          this.field_a = new BoundedRandomAccessFile(ul.a((byte) -103, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_n = new BoundedRandomAccessFile(ul.a((byte) -69, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_r = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_r[var5_int] = new BoundedRandomAccessFile(ul.a((byte) -113, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("kc").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftJvm) {
              this.field_g = Class.forName("wd").newInstance();
            } else {
              var6 = new gj();
              this.field_v = var6;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_u = Class.forName("sm").newInstance();
            } else {
              this.field_h = new ff();
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
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
