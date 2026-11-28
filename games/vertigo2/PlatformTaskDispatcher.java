/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    java.awt.EventQueue field_j;
    private static int field_f;
    private Win32CursorManager field_w;
    boolean privilegedTasksEnabled;
    static String field_m;
    private AsyncRequest queueTail;
    private Object field_c;
    private boolean microsoftJvm;
    RandomAccessCacheFile field_k;
    private AsyncRequest queueHead;
    private static volatile long field_l;
    private static String field_t;
    static String field_v;
    private boolean shutdownRequested;
    private Object field_g;
    private DisplayModeEnumerator field_i;
    RandomAccessCacheFile[] field_n;
    static java.lang.reflect.Method field_e;
    static String field_d;
    RandomAccessCacheFile field_o;
    private Thread workerThread;
    private static String field_x;
    RandomAccessCacheFile field_r;
    private static String field_h;

    private final static RandomAccessCacheFile openPreferencesFile(int param0, int param1, String param2, String param3) {
        try {
          int var6 = 0;
          RandomAccessCacheFile stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          String var4 = null;
          String[] var5 = null;
          String var7 = null;
          RandomAccessCacheFile var8 = null;
          Exception var8_ref = null;
          if (param1 != 33) {
            if (34 != param1) {
              var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
            } else {
              var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
            }
          } else {
            var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_t, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (var6 = param0; var6 < var5.length; var6++) {
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

    final AsyncRequest requestDisplayModes(int param0) {
        if (param0 > -105) {
          this.field_c = (Object) null;
        }
        return this.enqueueTask(0, (Object) null, 0, 5, 0);
    }

    private final AsyncRequest enqueueTask(int param0, Object param1, int param2, int param3, int param4) {
        AsyncRequest var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param4 != 0) {
          var9 = (String) null;
          this.requestDeclaredField(-30, (Class) null, (String) null);
        }
        var6 = new AsyncRequest();
        var6.requestType = param3;
        var6.objectArgument = param1;
        var6.secondaryIntArgument = param2;
        var6.intArgument = param0;
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

    final AsyncRequest requestEnterFullscreen(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1636602704) {
          Runnable var7 = (Runnable) null;
          this.startThread(-115, (Runnable) null, -90);
        }
        return this.enqueueTask((param1 << 16) + param0, (Object) null, (param3 << 16) + param2, 6, 0);
    }

    final AsyncRequest requestDeclaredField(int param0, Class param1, String param2) {
        if (param0 > -50) {
          this.run();
        }
        return this.enqueueTask(0, new Object[]{param1, param2}, 0, 9, 0);
    }

    private final AsyncRequest requestSocketInternal(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
          return (AsyncRequest) null;
        }
        return this.enqueueTask(param3, param1, 0, param0 ? 22 : 1, 0);
    }

    final AsyncRequest requestExitFullscreen(boolean param0, java.awt.Frame param1) {
        if (param0) {
          return (AsyncRequest) null;
        }
        return this.enqueueTask(0, param1, 0, 7, 0);
    }

    final AsyncRequest startThread(int param0, Runnable param1, int param2) {
        if (param2 != 0) {
          return (AsyncRequest) null;
        }
        return this.enqueueTask(param0, param1, 0, 2, 0);
    }

    final AsyncRequest requestDeclaredMethod(Class[] param0, int param1, Class param2, String param3) {
        if (param1 < 29) {
          this.isFullscreenAvailable(38);
        }
        return this.enqueueTask(0, new Object[]{param2, param3, param0}, 0, 8, 0);
    }

    final AsyncRequest requestSocket(int param0, int param1, String param2) {
        if (param0 >= -79) {
          field_f = -84;
        }
        return this.requestSocketInternal(false, param2, 1, param1);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (param0 >= -118) {
          this.field_n = (RandomAccessCacheFile[]) null;
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (this.microsoftJvm) {
          return this.field_i != null ? true : false;
        }
        return null != this.field_c ? true : false;
    }

    final AsyncRequest requestUrlStream(int param0, java.net.URL param1) {
        int var3 = -127 % ((48 - param0) / 60);
        return this.enqueueTask(0, param1, 0, 4, 0);
    }

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_57_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          RandomAccessCacheFile var3_ref2 = null;
          ProxyAuthenticationRequiredException var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          AsyncRequest var8 = null;
          Thread var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.Component var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
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
                    if (field_l > gk.correctedCurrentTimeMillis(126)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 4:
                    if (field_l > gk.correctedCurrentTimeMillis(52)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 8:
                    var18 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var18[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
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
                        if (field_l > gk.correctedCurrentTimeMillis(115)) {
                          throw new IOException();
                        }
                        var15 = (var8.intArgument >> 24 & 255) + "." + ((16726532 & var8.intArgument) >> 16) + "." + (var8.intArgument >> 8 & 255) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("pa").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                        } else {
                          var8.result = this.field_i.a((byte) -99);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("pa").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var14, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_i.a(var8.intArgument >>> 16, var8.secondaryIntArgument & 65535, (byte) -70, var8.secondaryIntArgument >> 16, 65535 & var8.intArgument, var14);
                        }
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("pj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          } else {
                            this.field_w.setCursorPosition(var3_int, (byte) 76, var4_int);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          stackIn_57_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_57_0;
                          var11 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_w.setCursorVisible(11333, var11, var3_int != 0);
                          } else {
                            Class.forName("pj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_g, new Object[]{var11, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.objectArgument);
                          Class.forName("pj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_g, new Object[]{var12[0], var12[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var12[2]});
                        } else {
                          if (var2_int != 16) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_v.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var13 = (String) (var8.objectArgument);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var13.length() > var5; var5++) {
                              if (var4.indexOf((int) var13.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
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
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile(0, field_f, "", (String) (var8.objectArgument));
                        var8.result = var3_ref2;
                        break;
                      case 12:
                        var3_ref2 = PlatformTaskDispatcher.openPreferencesFile(0, field_f, field_h, (String) (var8.objectArgument));
                        var8.result = var3_ref2;
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_i.a((java.awt.Frame) (var8.objectArgument), 0);
                        } else {
                          Class.forName("pa").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                        }
                        break;
                      case 21:
                        if (field_l > gk.correctedCurrentTimeMillis(101)) {
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
                  case 2:
                    var9 = new Thread((Runnable) (var8.objectArgument));
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var8.intArgument);
                    var8.result = var9;
                    break;
                  case 22:
                    if (field_l > gk.correctedCurrentTimeMillis(61)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ProxyAuthenticationRequiredException) null;
                      var8.result = wp.a((String) (var8.objectArgument), (byte) -109, var8.intArgument).openSocket(640);
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

    final void shutdown(boolean param0) {
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
            if (param0) {
              return;
            }
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_o) {
            try {
              this.field_o.close(0);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_r) {
            try {
              this.field_r.close(0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_n != null) {
            for (var2_int = 0; var2_int < this.field_n.length; var2_int++) {
              if (null != this.field_n[var2_int]) {
                try {
                  this.field_n[var2_int].close(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_k) {
            try {
              this.field_k.close(0);
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

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        DisplayModeEnumerator var7 = null;
        this.privilegedTasksEnabled = false;
        this.queueHead = null;
        this.queueTail = null;
        this.shutdownRequested = false;
        this.field_k = null;
        this.field_o = null;
        this.microsoftJvm = false;
        this.field_r = null;
        field_f = param0;
        field_h = param1;
        field_m = "Unknown";
        field_d = "1.1";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        try {
          field_m = System.getProperty("java.vendor");
          field_d = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_m.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_x = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_x = "Unknown";
        }
        field_v = field_x.toLowerCase();
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
          field_t = System.getProperty("user.home");
          if (field_t != null) {
            field_t = field_t + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_t) {
          field_t = "~/";
        }
        try {
          this.field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        gq.a((byte) -110, field_h, field_f);
        if (this.privilegedTasksEnabled) {
          this.field_k = new RandomAccessCacheFile(gq.a(0, field_f, "random.dat", (String) null), "rw", 25L);
          this.field_o = new RandomAccessCacheFile(gq.a("main_file_cache.dat2", -122), "rw", 314572800L);
          this.field_r = new RandomAccessCacheFile(gq.a("main_file_cache.idx255", -121), "rw", 1048576L);
          this.field_n = new RandomAccessCacheFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_n[var5_int] = new RandomAccessCacheFile(gq.a("main_file_cache.idx" + var5_int, -122), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("hf").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var7 = new DisplayModeEnumerator();
              this.field_i = var7;
            } else {
              this.field_c = Class.forName("pa").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_w = new Win32CursorManager();
            } else {
              this.field_g = Class.forName("pj").newInstance();
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
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
