/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private Object field_v;
    private in field_t;
    private static String field_r;
    private PlatformTask queueTail;
    BoundedRandomAccessFile field_g;
    private PlatformTask queueHead;
    private static int field_c;
    static String field_m;
    private Object field_w;
    BoundedRandomAccessFile field_s;
    private boolean shutdownRequested;
    BoundedRandomAccessFile[] field_n;
    static String field_u;
    static java.lang.reflect.Method field_l;
    private static volatile long field_k;
    static String field_e;
    private hh field_x;
    java.awt.EventQueue field_d;
    private Thread workerThread;
    private boolean microsoftJvm;
    private static String field_f;
    boolean privilegedTasksEnabled;
    BoundedRandomAccessFile field_p;
    private static String field_a;

    final PlatformTask requestDeclaredMethod(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 > -49) {
          this.run();
        }
        return this.enqueueTask(0, 8, new Object[]{param1, param3, param2}, true, 0);
    }

    final boolean isFullscreenAvailable(int param0) {
        if (param0 != 5) {
          this.field_d = (java.awt.EventQueue) null;
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (!this.microsoftJvm) {
          return this.field_v != null ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final PlatformTask requestDeclaredField(int param0, String param1, Class param2) {
        int var4 = -116 % ((param0 + 49) / 40);
        return this.enqueueTask(0, 9, new Object[]{param2, param1}, true, 0);
    }

    private final static BoundedRandomAccessFile a(String param0, int param1, int param2, String param3) {
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
          if (33 != param2) {
            if (param2 == 34) {
              var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
            } else {
              var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
            }
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          }
          var5 = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          var6 = 0;
          if (param1 >= -12) {
            return (BoundedRandomAccessFile) null;
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

    final PlatformTask requestDisplayModes(byte param0) {
        if (param0 > -12) {
          String var3 = (String) null;
          this.requestDirectSocket(-51, false, (String) null);
        }
        return this.enqueueTask(0, 5, (Object) null, true, 0);
    }

    private final PlatformTask enqueueTask(int param0, int param1, Object param2, boolean param3, int param4) {
        PlatformTask var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new PlatformTask();
        var6.secondaryIntArgument = param4;
        var6.objectArgument = param2;
        var6.intArgument = param0;
        var6.requestType = param1;
        var7 = this;
        synchronized (var7) {
          if (!param3) {
            field_c = -46;
          }
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

    final PlatformTask requestUrlStream(int param0, java.net.URL param1) {
        if (param0 != 5) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(0, 4, param1, true, 0);
    }

    final PlatformTask requestFullscreenExit(java.awt.Frame param0, byte param1) {
        if (param1 != -116) {
          Runnable var4 = (Runnable) null;
          this.requestThreadStart((Runnable) null, 17, -112);
        }
        return this.enqueueTask(0, 7, param0, true, 0);
    }

    final PlatformTask requestDirectSocket(int param0, boolean param1, String param2) {
        if (param1) {
          String var5 = (String) null;
          this.requestDirectSocket(52, false, (String) null);
        }
        return this.requestSocketConnection(param2, true, false, param0);
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
            this.shutdownRequested = true;
            if (param0 <= 95) {
              field_f = (String) null;
            }
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (this.field_p != null) {
            try {
              this.field_p.close(107);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_g) {
            try {
              this.field_g.close(102);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_n) {
            for (var2_int = 0; var2_int < this.field_n.length; var2_int++) {
              if (this.field_n[var2_int] != null) {
                try {
                  this.field_n[var2_int].close(119);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_s) {
            try {
              this.field_s.close(98);
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

    private final PlatformTask requestSocketConnection(String param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param3, !param2 ? 1 : 22, param0, param1, 0);
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
          va var3_ref = null;
          BoundedRandomAccessFile var3_ref2 = null;
          int var3_int = 0;
          Exception var3_ref3 = null;
          int var4_int = 0;
          String var4 = null;
          java.awt.datatransfer.Transferable var7 = null;
          PlatformTask var8 = null;
          Object[] var9 = null;
          java.awt.datatransfer.Clipboard var10 = null;
          java.awt.Component var11 = null;
          String var12 = null;
          Object[] var13 = null;
          java.awt.Frame var14 = null;
          String var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
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
                    if (field_k > lo.correctedCurrentTimeMillis((byte) 111)) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                  case 22:
                    if (lo.correctedCurrentTimeMillis((byte) 108) < field_k) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (va) null;
                      var8.result = sj.a(var8.intArgument, (String) (var8.objectArgument), (byte) 122).a(true);
                    } catch (va decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var3_ref = (va) (Object) decompiledCaughtException;
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
                      null == ((Class) (var17[0])).getClassLoader()) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
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
                        if (field_k > lo.correctedCurrentTimeMillis((byte) 90)) {
                          throw new IOException();
                        }
                        var15 = (var8.intArgument >> 24 & 255) + "." + (255 & var8.intArgument >> 16) + "." + (var8.intArgument >> 8 & 255) + "." + (255 & var8.intArgument);
                        var8.result = java.net.InetAddress.getByName(var15).getHostName();
                        break;
                      case 21:
                        if (field_k > lo.correctedCurrentTimeMillis((byte) 127)) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 5:
                        if (!this.microsoftJvm) {
                          var8.result = Class.forName("bg").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                        } else {
                          var8.result = this.field_x.a((byte) 88);
                        }
                        break;
                      case 6:
                        var14 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var14;
                        var14.setResizable(false);
                        if (this.microsoftJvm) {
                          this.field_x.a(var8.intArgument >>> 16, var8.secondaryIntArgument >> 16, (byte) -108, 65535 & var8.intArgument, var14, var8.secondaryIntArgument & 65535);
                        } else {
                          Class.forName("bg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var14, new Integer(var8.intArgument >>> 16), new Integer(65535 & var8.intArgument), new Integer(var8.secondaryIntArgument >> 16), new Integer(65535 & var8.secondaryIntArgument)});
                        }
                        break;
                      case 13:
                        var3_ref2 = PlatformTaskDispatcher.a((String) (var8.objectArgument), -26, field_c, "");
                        var8.result = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          var4_int = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_t.a(var4_int, var3_int, 0);
                          } else {
                            Class.forName("up").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_w, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          15 == var2_int) {
                          stackIn_57_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_57_0;
                          var11 = (java.awt.Component) (var8.objectArgument);
                          if (!this.microsoftJvm) {
                            Class.forName("up").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_w, new Object[]{var11, new Boolean(var3_int != 0)});
                          } else {
                            this.field_t.a(var3_int != 0, var11, (byte) 88);
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          var13 = (Object[]) (var8.objectArgument);
                          Class.forName("up").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_w, new Object[]{var13[0], var13[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var13[2]});
                        } else {
                          if (16 != var2_int) {
                            throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_u.startsWith("win")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var12 = (String) (var8.objectArgument);
                            if (!var12.startsWith("http://") &&
                              !var12.startsWith("https://")) {
                              throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                            }
                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (var5 = 0; var5 < var12.length(); var5++) {
                              if (var4.indexOf((int) var12.charAt(var5)) == -1) {
                                throw PlatformTaskDispatcher.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
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
                        var3_ref2 = PlatformTaskDispatcher.a((String) (var8.objectArgument), -63, field_c, field_a);
                        var8.result = var3_ref2;
                        break;
                      case 7:
                        if (!this.microsoftJvm) {
                          Class.forName("bg").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                        } else {
                          this.field_x.a((byte) 54, (java.awt.Frame) (var8.objectArgument));
                        }
                        break;
                    }
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
                  case 4:
                    if (field_k > lo.correctedCurrentTimeMillis((byte) 97)) {
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

    final PlatformTask requestFullscreenEnter(int param0, int param1, int param2, int param3, byte param4) {
        PlatformTask discarded$0 = null;
        if (param4 != 4) {
          String var7 = (String) null;
          discarded$0 = this.requestSocketConnection((String) null, false, true, 4);
        }
        return this.enqueueTask((param0 << 16) + param1, 6, (Object) null, true, param3 + (param2 << 16));
    }

    final PlatformTask requestThreadStart(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
          return (PlatformTask) null;
        }
        return this.enqueueTask(param2, 2, param0, true, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        hh var6 = null;
        this.queueTail = null;
        this.queueHead = null;
        this.field_g = null;
        this.shutdownRequested = false;
        this.field_p = null;
        this.microsoftJvm = false;
        this.privilegedTasksEnabled = false;
        this.field_s = null;
        field_m = "1.1";
        field_a = param1;
        field_e = "Unknown";
        stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_c = param0;
        try {
          field_e = System.getProperty("java.vendor");
          field_m = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_e.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_r = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_r = "Unknown";
        }
        field_u = field_r.toLowerCase();
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
          if (field_f != null) {
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
          this.field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
            field_l = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        lh.a(-98, field_a, field_c);
        if (this.privilegedTasksEnabled) {
          this.field_s = new BoundedRandomAccessFile(lh.a((String) null, 6234, "random.dat", field_c), "rw", 25L);
          this.field_p = new BoundedRandomAccessFile(lh.a("main_file_cache.dat2", -93), "rw", 314572800L);
          this.field_g = new BoundedRandomAccessFile(lh.a("main_file_cache.idx255", -86), "rw", 1048576L);
          this.field_n = new BoundedRandomAccessFile[param2];
          for (var5_int = 0; param2 > var5_int; var5_int++) {
            this.field_n[var5_int] = new BoundedRandomAccessFile(lh.a("main_file_cache.idx" + var5_int, -95), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("ki").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (this.microsoftJvm) {
              var6 = new hh();
              this.field_x = var6;
            } else {
              this.field_v = Class.forName("bg").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_t = new in();
            } else {
              this.field_w = Class.forName("up").newInstance();
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
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
