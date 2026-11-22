/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private boolean shutdownRequested;
    static String field_p;
    private static String field_r;
    private static volatile long field_a;
    private static String field_k;
    private Object field_b;
    private PlatformTask queueTail;
    static String field_c;
    static String field_n;
    private ma field_m;
    BoundedRandomAccessFile[] field_v;
    private Thread workerThread;
    private static String field_i;
    private on field_l;
    boolean privilegedTasksEnabled;
    private static int field_t;
    BoundedRandomAccessFile field_h;
    static java.lang.reflect.Method field_g;
    java.awt.EventQueue field_e;
    private Object field_s;
    BoundedRandomAccessFile field_q;
    BoundedRandomAccessFile field_x;
    private boolean microsoftJvm;
    private PlatformTask queueHead;

    private final static BoundedRandomAccessFile a(String param0, String param1, int param2, int param3) {
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
          if (param3 == 33) {
            var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
          } else {
            if (param3 == 34) {
              var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
            }
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          var6 = 0;
          if (param2 != -35) {
            var9 = (String) null;
            PlatformTaskDispatcher.a((String) null, (String) null, -3, -52);
          }
          while (var6 < var5.length) {
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
                  if (var6 >= var5.length) {
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

    public final void run() {
        try {
          int var5 = 0;
          int stackIn_55_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          int var2_int = 0;
          ThreadDeath var2_ref = null;
          Throwable var2_ref2 = null;
          InterruptedException var3 = null;
          wl var3_ref = null;
          BoundedRandomAccessFile var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4 = 0;
          String var4_ref_String = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          String var9 = null;
          java.awt.Frame var10 = null;
          java.awt.Component var11 = null;
          Object[] var12 = null;
          String var13 = null;
          java.awt.datatransfer.Clipboard var14 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          Object[] var16 = null;
          Object[] var17 = null;
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
                  case 1:
                    if (kd.c(-2456) < field_a) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 22:
                    if (field_a > kd.c(-2456)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (wl) null;
                      var8.result = bp.a(var8.intArgument, (byte) 127, (String) (var8.objectArgument)).b(13905);
                    } catch (wl decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (wl) (Object) decompiledCaughtException;
                      var8.result = var3_ref.getMessage();
                      throw var3_ref;
                    }
                    break;
                  case 2:
                    var18 = new Thread((Runnable) (var8.objectArgument));
                    var18.setDaemon(true);
                    var18.start();
                    var18.setPriority(var8.intArgument);
                    var8.result = var18;
                    break;
                  case 8:
                    var17 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var17[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                    break;
                  case 9:
                    var16 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      null == ((Class) (var16[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                    break;
                  case 18:
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var15.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_m.a(10127);
                        } else {
                          var8.result = Class.forName("eo").getMethod("listmodes", new Class[]{}).invoke(this.field_b, new Object[]{});
                        }
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_m.a(42, (java.awt.Frame) (var8.objectArgument));
                        } else {
                          Class.forName("eo").getMethod("exit", new Class[]{}).invoke(this.field_b, new Object[]{});
                        }
                        break;
                      case 13:
                        var3_ref2 = PlatformTaskDispatcher.a((String) (var8.objectArgument), "", -35, field_t);
                        var8.result = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4 = var8.secondaryIntArgument;
                          if (!this.microsoftJvm) {
                            Class.forName("w").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_s, new Object[]{new Integer(var3_int), new Integer(var4)});
                          } else {
                            this.field_l.a(var3_int, true, var4);
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          15 == var2_int) {
                          stackIn_55_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_55_0;
                          var11 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_l.a(-14677, var11, var3_int != 0);
                          } else {
                            Class.forName("w").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_s, new Object[]{var11, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var12 = (Object[]) (var8.objectArgument);
                          Class.forName("w").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_s, new Object[]{var12[0], var12[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var12[2]});
                        } else {
                          if (16 != var2_int) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_n.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var13 = (String) (var8.objectArgument);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var13.length() > var5; var5++) {
                              if (var4_ref_String.indexOf((int) var13.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref3;
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(var3_ref3);
                          }
                        }
                        break;
                      case 12:
                        var3_ref2 = PlatformTaskDispatcher.a((String) (var8.objectArgument), field_k, -35, field_t);
                        var8.result = var3_ref2;
                        break;
                      case 6:
                        var10 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var10;
                        var10.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_m.a((byte) 6, var10, var8.intArgument >>> 16, var8.intArgument & 65535, var8.secondaryIntArgument >> 16, 65535 & var8.secondaryIntArgument);
                        } else {
                          Class.forName("eo").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{var10, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        }
                        break;
                      case 21:
                        if (kd.c(-2456) < field_a) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 3:
                        if (kd.c(-2456) < field_a) {
                          throw new IOException();
                        }
                        var9 = (255 & var8.intArgument >> 24) + "." + (255 & var8.intArgument >> 16) + "." + (255 & var8.intArgument >> 8) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var9).getHostName();
                        break;
                    }
                    break;
                  case 4:
                    if (field_a > kd.c(-2456)) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
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

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        if (param0 != -18) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, param1, 6, 4, 0);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (param0 < 25) {
          java.awt.Frame var3 = (java.awt.Frame) null;
          this.requestFullscreenExit((java.awt.Frame) null, (byte) -13);
        }
        if (!this.microsoftJvm) {
          return this.field_b != null ? true : false;
        }
        return this.field_m != null ? true : false;
    }

    private final PlatformTask enqueueTask(int param0, Object param1, int param2, int param3, int param4) {
        PlatformTask var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        if (param2 != 6) {
          var9 = (String) null;
          this.requestDirectSocket(91, 66, (String) null);
        }
        var6 = new PlatformTask();
        var6.objectArgument = param1;
        var6.intArgument = param0;
        var6.requestType = param3;
        var6.secondaryIntArgument = param4;
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

    final PlatformTask requestDirectSocket(int param0, int param1, String param2) {
        if (param0 >= -68) {
          return (PlatformTask) null;
        }
        return this.requestSocketConnection(false, param2, param1, 1);
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
          if (this.field_x != null) {
            try {
              this.field_x.close(param0 ^ -119);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (param0 != -119) {
            field_i = (String) null;
          }
          if (this.field_q != null) {
            try {
              this.field_q.close(0);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_v) {
            for (var2_int = 0; var2_int < this.field_v.length; var2_int++) {
              if (null != this.field_v[var2_int]) {
                try {
                  this.field_v[var2_int].close(0);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_h) {
            try {
              this.field_h.close(param0 ^ -119);
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

    final PlatformTask requestThreadStart(int param0, int param1, Runnable param2) {
        if (param0 != -21432) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param1, param2, 6, 2, 0);
    }

    final PlatformTask requestFullscreenEnter(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 >= -10) {
          Runnable var7 = (Runnable) null;
          this.requestThreadStart(-77, -50, (Runnable) null);
        }
        return this.enqueueTask((param2 << 16) + param4, (Object) null, 6, 6, param1 + (param3 << 16));
    }

    final PlatformTask requestCursorVisibility(java.awt.Component param0, byte param1, boolean param2) {
        if (param1 < 13) {
          this.field_v = (BoundedRandomAccessFile[]) null;
        }
        return this.enqueueTask(!param2 ? 0 : 1, param0, 6, 15, 0);
    }

    final PlatformTask requestDeclaredField(int param0, Class param1, String param2) {
        PlatformTask discarded$0 = null;
        if (param0 != 65535) {
          Object var5 = (Object) null;
          discarded$0 = this.enqueueTask(21, (Object) null, -63, 47, 126);
        }
        return this.enqueueTask(0, new Object[]{param1, param2}, 6, 9, 0);
    }

    final PlatformTask requestDisplayModes(boolean param0) {
        if (param0) {
          field_a = 9L;
        }
        return this.enqueueTask(0, (Object) null, 6, 5, 0);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, byte param1) {
        if (param1 > -36) {
          field_c = (String) null;
        }
        return this.enqueueTask(0, param0, 6, 7, 0);
    }

    final PlatformTask requestDeclaredMethod(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != -1) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, new Object[]{param1, param3, param0}, 6, 8, 0);
    }

    private final PlatformTask requestSocketConnection(boolean param0, String param1, int param2, int param3) {
        if (param3 != 1) {
          this.field_m = (ma) null;
        }
        return this.enqueueTask(param2, param1, 6, param0 ? 22 : 1, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ma var7 = null;
        this.shutdownRequested = false;
        this.queueTail = null;
        this.privilegedTasksEnabled = false;
        this.field_x = null;
        this.field_h = null;
        this.microsoftJvm = false;
        this.queueHead = null;
        this.field_q = null;
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_c = "Unknown";
        field_k = param1;
        field_t = param0;
        field_p = "1.1";
        try {
          field_c = System.getProperty("java.vendor");
          field_p = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (-1 != field_c.toLowerCase().indexOf("microsoft")) {
          this.microsoftJvm = true;
        }
        try {
          field_i = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_i = "Unknown";
        }
        field_n = field_i.toLowerCase();
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
          field_r = System.getProperty("user.home");
          if (null != field_r) {
            field_r = field_r + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_r == null) {
          field_r = "~/";
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
        nc.a(field_t, 116, field_k);
        if (this.privilegedTasksEnabled) {
          this.field_h = new BoundedRandomAccessFile(nc.a("random.dat", field_t, (String) null, -6665), "rw", 25L);
          this.field_x = new BoundedRandomAccessFile(nc.a(0, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_q = new BoundedRandomAccessFile(nc.a(0, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_v = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_v[var5_int] = new BoundedRandomAccessFile(nc.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("pl").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftJvm) {
              this.field_b = Class.forName("eo").newInstance();
            } else {
              var7 = new ma();
              this.field_m = var7;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (!this.microsoftJvm) {
              this.field_s = Class.forName("w").newInstance();
            } else {
              this.field_l = new on();
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
        field_a = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
