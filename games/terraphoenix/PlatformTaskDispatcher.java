/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    RandomAccessCacheFile field_q;
    static String field_j;
    private Object field_f;
    private AsyncRequest queueTail;
    private static String field_t;
    private static int field_e;
    private static String field_k;
    private static String field_i;
    private boolean microsoftJvm;
    private Object field_p;
    boolean privilegedTasksEnabled;
    static String field_d;
    private gk field_l;
    private Thread workerThread;
    private static volatile long field_b;
    private AsyncRequest queueHead;
    static String field_o;
    RandomAccessCacheFile[] field_s;
    static java.lang.reflect.Method field_x;
    RandomAccessCacheFile field_m;
    private ff field_c;
    java.awt.EventQueue field_g;
    RandomAccessCacheFile field_r;
    private boolean shutdownRequested;

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
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_r) {
            try {
              this.field_r.a(115);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_q != null) {
            try {
              this.field_q.a(124);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != -7538) {
            return;
          }
          if (this.field_s != null) {
            for (var2_int = 0; this.field_s.length > var2_int; var2_int++) {
              if (this.field_s[var2_int] != null) {
                try {
                  this.field_s[var2_int].a(127);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_m) {
            try {
              this.field_m.a(114);
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

    private final AsyncRequest enqueueTask(int param0, int param1, int param2, int param3, Object param4) {
        AsyncRequest var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new AsyncRequest();
        var6.intArgument = param1;
        if (param0 != 0) {
          return (AsyncRequest) null;
        }
        var6.secondaryIntArgument = param2;
        var6.requestType = param3;
        var6.objectArgument = param4;
        var7 = this;
        synchronized (var7) {
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

    final AsyncRequest requestDirectSocket(int param0, String param1, byte param2) {
        if (param2 != 60) {
          this.requestDisplayModes(-116);
        }
        return this.requestSocketConnection(param1, param0, false, (byte) -2);
    }

    private final static RandomAccessCacheFile a(String param0, int param1, String param2, int param3) {
        try {
          int var6 = 0;
          RandomAccessCacheFile stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          RandomAccessCacheFile var8 = null;
          Exception var8_ref = null;
          if (param3 == 33) {
            var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
            } else {
              var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param1; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!(0 < var7.length()) ||
              new File(var7).exists()) {
              try {
                var8 = new RandomAccessCacheFile(new File(var7, var4), "rw", 10000L);
                stackIn_13_0 = var8;
                return stackIn_13_0;
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

    final AsyncRequest requestFullscreenEnter(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          this.shutdownRequested = false;
        }
        return this.enqueueTask(0, param4 + (param3 << 16), param1 + (param0 << 16), 6, (Object) null);
    }

    private final AsyncRequest requestSocketConnection(String param0, int param1, boolean param2, byte param3) {
        if (param3 >= 0) {
          this.field_r = (RandomAccessCacheFile) null;
        }
        return this.enqueueTask(0, param1, 0, !param2 ? 1 : 22, param0);
    }

    final AsyncRequest requestDeclaredMethod(int param0, Class param1, String param2, Class[] param3) {
        if (param0 < 87) {
          field_j = (String) null;
        }
        return this.enqueueTask(0, 0, 0, 8, new Object[]{param1, param2, param3});
    }

    final AsyncRequest requestThread(Runnable task, byte obfuscationGuard, int priority) {
        if (obfuscationGuard != -21) {
          String var5 = (String) null;
          this.requestDirectSocket(-53, (String) null, (byte) -45);
        }
        return this.enqueueTask(obfuscationGuard ^ -21, priority, 0, 2, task);
    }

    final AsyncRequest requestUrl(java.net.URL url, int obfuscationGuard) {
        int var3 = 119 / ((17 - obfuscationGuard) / 54);
        return this.enqueueTask(0, 0, 0, 4, url);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_62_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          RandomAccessCacheFile var3_ref = null;
          int var3_int = 0;
          Exception var3_ref2 = null;
          wb var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          AsyncRequest var8 = null;
          Thread var9 = null;
          Object[] var10 = null;
          java.awt.datatransfer.Clipboard var11 = null;
          String var12 = null;
          java.awt.Component var13 = null;
          Object[] var14 = null;
          String var15 = null;
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
                    if (field_b > ll.a(1000)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 4:
                    if (ll.a(1000) < field_b) {
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
                          var8.result = this.field_c.a(0);
                        } else {
                          var8.result = Class.forName("ti").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                        }
                        break;
                      case 6:
                        var16 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var16;
                        var16.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("ti").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var16, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_c.a(var8.intArgument >>> 16, var16, 0, var8.secondaryIntArgument >> 16, 65535 & var8.intArgument, var8.secondaryIntArgument & 65535);
                        }
                        break;
                      case 13:
                        var3_ref = PlatformTaskDispatcher.a("", 0, (String) (var8.objectArgument), field_e);
                        var8.result = var3_ref;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          14 == var2_int) {
                          var3_int = var8.intArgument;
                          var4 = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("ub").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_l.a(-2, var4, var3_int);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_62_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_62_0;
                          var13 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("ub").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var13, new Boolean(var3_int != 0)});
                          } else {
                            this.field_l.a(var3_int != 0, var13, -64);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var14 = (Object[]) (var8.objectArgument);
                          Class.forName("ub").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var14[0], var14[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_o.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var15 = (String) (var8.objectArgument);
                            if (!var15.startsWith("http://") &&
                              !var15.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var15.length() > var5; var5++) {
                              if (-1 == var4_ref_String.indexOf((int) var15.charAt(var5))) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
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
                        var3_ref = PlatformTaskDispatcher.a(field_t, 0, (String) (var8.objectArgument), field_e);
                        var8.result = var3_ref;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_c.a((java.awt.Frame) (var8.objectArgument), 8);
                        } else {
                          Class.forName("ti").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_b > ll.a(1000)) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 3:
                        if (ll.a(1000) < field_b) {
                          throw new IOException();
                        }
                        var12 = (255 & var8.intArgument >> 24) + "." + ((var8.intArgument & 16731075) >> 16) + "." + ((var8.intArgument & 65324) >> 8) + "." + (255 & var8.intArgument);
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
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.intArgument);
                    var8.result = var9;
                    break;
                  case 22:
                    if (ll.a(1000) < field_b) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (wb) null;
                      var8.result = ah.a((String) (var8.objectArgument), var8.intArgument, -23891).createSocket(true);
                    } catch (wb decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      var3_ref3 = (wb) (Object) decompiledCaughtException;
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

    final AsyncRequest requestDeclaredField(Class param0, int param1, String param2) {
        AsyncRequest discarded$0 = null;
        if (param1 != -3645) {
          Object var5 = (Object) null;
          discarded$0 = this.enqueueTask(-35, 55, -69, 103, (Object) null);
        }
        return this.enqueueTask(0, 0, 0, 9, new Object[]{param0, param2});
    }

    final boolean isFullscreenAvailable(int param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 != 2) {
          this.shutdownRequested = true;
        }
        if (!this.microsoftJvm) {
          return this.field_f != null ? true : false;
        }
        return this.field_c != null ? true : false;
    }

    final AsyncRequest requestFrame(java.awt.Frame frame, int obfuscationGuard) {
        if (obfuscationGuard >= -120) {
          String var4 = (String) null;
          this.requestDeclaredField((Class) null, -83, (String) null);
        }
        return this.enqueueTask(0, 0, 0, 7, frame);
    }

    final AsyncRequest requestDisplayModes(int param0) {
        if (param0 >= -77) {
          return (AsyncRequest) null;
        }
        return this.enqueueTask(0, 0, 0, 5, (Object) null);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ff var7 = null;
        this.privilegedTasksEnabled = false;
        this.microsoftJvm = false;
        this.field_m = null;
        this.queueTail = null;
        this.queueHead = null;
        this.field_q = null;
        this.field_r = null;
        this.shutdownRequested = false;
        field_e = param0;
        field_d = "1.1";
        field_j = "Unknown";
        field_t = param1;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_j = System.getProperty("java.vendor");
          field_d = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_j.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_k = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_k = "Unknown";
        }
        field_o = field_k.toLowerCase();
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
          field_i = System.getProperty("user.home");
          if (null != field_i) {
            field_i = field_i + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_i == null) {
          field_i = "~/";
        }
        try {
          this.field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
        CacheFileLocator.a((byte) 119, field_e, field_t);
        if (this.privilegedTasksEnabled) {
          this.field_m = new RandomAccessCacheFile(CacheFileLocator.a("random.dat", (String) null, false, field_e), "rw", 25L);
          this.field_r = new RandomAccessCacheFile(CacheFileLocator.a("main_file_cache.dat2", -3), "rw", 314572800L);
          this.field_q = new RandomAccessCacheFile(CacheFileLocator.a("main_file_cache.idx255", -20), "rw", 1048576L);
          this.field_s = new RandomAccessCacheFile[param2];
          for (var5_int = 0; var5_int < param2; var5_int++) {
            this.field_s[var5_int] = new RandomAccessCacheFile(CacheFileLocator.a("main_file_cache.idx" + var5_int, -31), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("lc").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new ff();
              this.field_c = var7;
            } else {
              this.field_f = Class.forName("ti").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_p = Class.forName("ub").newInstance();
            } else {
              this.field_l = new gk();
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
        field_b = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
