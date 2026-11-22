/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SystemTaskService implements Runnable {
    static String field_o;
    static String field_l;
    private static int field_v;
    private MicrosoftDisplayController field_x;
    private static String field_k;
    private static volatile long field_u;
    private Thread workerThread;
    BoundedRandomAccessFile field_a;
    private MicrosoftCursorController field_d;
    BoundedRandomAccessFile[] field_r;
    static java.lang.reflect.Method field_e;
    private SystemTask queueTail;
    private static String field_t;
    private SystemTask queueHead;
    BoundedRandomAccessFile field_g;
    boolean microsoftJvm;
    java.awt.EventQueue field_j;
    static String field_f;
    private Object field_m;
    BoundedRandomAccessFile field_n;
    private Object field_h;
    boolean privilegedTasksEnabled;
    private static String field_i;
    private boolean shutdownRequested;

    final SystemTask requestFullscreenExit(java.awt.Frame param0, int param1) {
        if (param1 != 16823) {
          this.field_m = (Object) null;
        }
        return this.enqueueTask(param0, 0, 0, 7, (byte) 125);
    }

    final boolean writeFileBytes(File param0, byte[] param1, boolean param2) {
        try {
          FileOutputStream var4 = new FileOutputStream(param0);
          var4.write(param1, 0, param1.length);
          var4.close();
          if (param2) {
            return true;
          }
          field_t = (String) null;
          return true;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          IOException var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
    }

    private final SystemTask requestSocketConnection(int param0, boolean param1, String param2, int param3) {
        if (param3 < 10) {
          return (SystemTask) null;
        }
        return this.enqueueTask(param2, 0, param0, !param1 ? 1 : 22, (byte) 125);
    }

    public final void run() {
        try {
          Throwable decompiledCaughtException = null;
          BoundedRandomAccessFile var3_ref2 = null;
          int var3_int = 0;
          java.awt.datatransfer.Transferable var7 = null;
          SystemTask var8 = null;
          Object[] var9 = null;
          String var10 = null;
          java.awt.Frame var11 = null;
          java.awt.datatransfer.Clipboard var15 = null;
          java.awt.datatransfer.Clipboard var16 = null;
          Object[] var17 = null;
          Thread var18 = null;
          while (true) {
            Object var2 = this;
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
                  InterruptedException var3 = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              if (decompiledFrameCompleted0) {
                return;
              }
            }
            try {
              {
                int var2_int = var8.requestType;
                switch (var2_int) {
                  case 22:
                    if (field_u > kh.a(-107)) {
                      throw new IOException();
                    }
                    try {
                      if (false) throw (ls) null;
                      var8.result = dd.a((String) (var8.objectArgument), var8.intArgument, -105).a((byte) 97);
                    } catch (ls decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      ls var3_ref = (ls) (Object) decompiledCaughtException;
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
                  case 18:
                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.result = var16.getContents((Object) null);
                    break;
                  case 19:
                    var7 = (java.awt.datatransfer.Transferable) (var8.objectArgument);
                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                    break;
                  case 16:
                  default:
                    if (!this.privilegedTasksEnabled) {
                      throw SystemTaskService.<RuntimeException>throwUnchecked(new Exception(""));
                    }
                    switch (var2_int) {
                      case 21:
                        if (kh.a(-92) < field_u) {
                          throw new IOException();
                        }
                        var8.result = java.net.InetAddress.getByName((String) (var8.objectArgument)).getAddress();
                        break;
                      case 5:
                        if (this.microsoftJvm) {
                          var8.result = this.field_x.a(-116);
                        } else {
                          var8.result = Class.forName("AwtFullscreenController").getMethod("listmodes", new Class[]{}).invoke(this.field_m, new Object[]{});
                        }
                        break;
                      case 7:
                        if (this.microsoftJvm) {
                          this.field_x.a((java.awt.Frame) (var8.objectArgument), -70);
                        } else {
                          Class.forName("AwtFullscreenController").getMethod("exit", new Class[]{}).invoke(this.field_m, new Object[]{});
                        }
                        break;
                      case 12:
                        var3_ref2 = SystemTaskService.a((String) (var8.objectArgument), field_v, (byte) -97, field_t);
                        var8.result = var3_ref2;
                        break;
                      case 13:
                        var3_ref2 = SystemTaskService.a((String) (var8.objectArgument), field_v, (byte) -97, "");
                        var8.result = var3_ref2;
                        break;
                      case 16:
                      default:
                        if (this.privilegedTasksEnabled &&
                          var2_int == 14) {
                          var3_int = var8.intArgument;
                          int var4 = var8.secondaryIntArgument;
                          if (this.microsoftJvm) {
                            this.field_d.a(0, var3_int, var4);
                          } else {
                            Class.forName("AwtCursorBridge").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                          }
                          break;
                        }
                        if (this.privilegedTasksEnabled &&
                          var2_int == 15) {
                          int stackIn_60_0 = (var8.intArgument == 0) ? 0 : 1;
                          var3_int = stackIn_60_0;
                          java.awt.Component var12 = (java.awt.Component) (var8.objectArgument);
                          if (this.microsoftJvm) {
                            this.field_d.a(var3_int != 0, var12, -4);
                          } else {
                            Class.forName("AwtCursorBridge").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var12, new Boolean(var3_int != 0)});
                          }
                          break;
                        }
                        if (!this.microsoftJvm &&
                          var2_int == 17) {
                          Object[] var14 = (Object[]) (var8.objectArgument);
                          Class.forName("AwtCursorBridge").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var14[0], var14[1], new Integer(var8.intArgument), new Integer(var8.secondaryIntArgument), var14[2]});
                        } else {
                          if (var2_int != 16) {
                            throw SystemTaskService.<RuntimeException>throwUnchecked(new Exception(""));
                          }
                          try {
                            if (!field_f.startsWith("win")) {
                              throw SystemTaskService.<RuntimeException>throwUnchecked(new Exception());
                            }
                            String var13 = (String) (var8.objectArgument);
                            if (!var13.startsWith("http://") &&
                              !var13.startsWith("https://")) {
                              throw SystemTaskService.<RuntimeException>throwUnchecked(new Exception());
                            }
                            String var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            for (int var5 = 0; var5 < var13.length(); var5++) {
                              if (var4_ref_String.indexOf((int) var13.charAt(var5)) == -1) {
                                throw SystemTaskService.<RuntimeException>throwUnchecked(new Exception());
                              }
                            }
                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.result = null;
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            Exception var3_ref3 = (Exception) (Object) decompiledCaughtException;
                            var8.result = var3_ref3;
                            throw SystemTaskService.<RuntimeException>throwUnchecked(var3_ref3);
                          }
                        }
                        break;
                      case 6:
                        var11 = new java.awt.Frame("Jagex Full Screen");
                        var8.result = var11;
                        var11.setResizable(false);
                        if (!this.microsoftJvm) {
                          Class.forName("AwtFullscreenController").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{var11, new Integer(var8.intArgument >>> 16), new Integer(var8.intArgument & 65535), new Integer(var8.secondaryIntArgument >> 16), new Integer(var8.secondaryIntArgument & 65535)});
                        } else {
                          this.field_x.a(var8.intArgument >>> 16, 17, var11, 65535 & var8.intArgument, var8.secondaryIntArgument >> 16, 65535 & var8.secondaryIntArgument);
                        }
                        break;
                      case 3:
                        if (kh.a(-87) < field_u) {
                          throw new IOException();
                        }
                        var10 = (var8.intArgument >> 24 & 255) + "." + ((16746416 & var8.intArgument) >> 16) + "." + (255 & var8.intArgument >> 8) + "." + (var8.intArgument & 255);
                        var8.result = java.net.InetAddress.getByName(var10).getHostName();
                        break;
                    }
                    break;
                  case 9:
                    var9 = (Object[]) (var8.objectArgument);
                    if (this.privilegedTasksEnabled &&
                      ((Class) (var9[0])).getClassLoader() == null) {
                      throw new SecurityException();
                    }
                    var8.result = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                    break;
                  case 4:
                    if (kh.a(-59) < field_u) {
                      throw new IOException();
                    }
                    var8.result = new DataInputStream(((java.net.URL) (var8.objectArgument)).openStream());
                    break;
                  case 1:
                    if (kh.a(-101) < field_u) {
                      throw new IOException();
                    }
                    var8.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.objectArgument)), var8.intArgument);
                    break;
                }
              }
              var8.status = 1;
            } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              ThreadDeath var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
              throw var2_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              Throwable var2_ref2 = decompiledCaughtException;
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

    final SystemTask requestThreadStart(int param0, int param1, Runnable param2) {
        if (param1 != 1048576) {
          java.net.URL var5 = (java.net.URL) null;
          this.requestUrlStream((byte) 49, (java.net.URL) null);
        }
        return this.enqueueTask(param2, 0, param0, 2, (byte) 117);
    }

    final void shutdown(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2_ref2 = null;
          Object var2 = this;
          synchronized (var2) {
            this.shutdownRequested = true;
            if (param0 >= -99) {
              return;
            }
            this.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            InterruptedException var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          if (null != this.field_n) {
            try {
              this.field_n.close(19260);
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (null != this.field_a) {
            try {
              this.field_a.close(19260);
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (IOException) (Object) decompiledCaughtException;
            }
          }
          if (this.field_r != null) {
            for (int var2_int = 0; this.field_r.length > var2_int; var2_int++) {
              if (this.field_r[var2_int] != null) {
                try {
                  this.field_r[var2_int].close(19260);
                } catch (java.io.IOException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  IOException var3 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
          }
          if (null != this.field_g) {
            try {
              this.field_g.close(19260);
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

    final SystemTask requestDeclaredMethod(Class param0, Class[] param1, String param2, boolean param3) {
        if (!param3) {
          return (SystemTask) null;
        }
        return this.enqueueTask(new Object[]{param0, param2, param1}, 0, 0, 8, (byte) 61);
    }

    final SystemTask requestDisplayModes(int param0) {
        if (param0 != 255) {
          String var3 = (String) null;
          this.requestDeclaredMethod((Class) null, (Class[]) null, (String) null, false);
        }
        return this.enqueueTask((Object) null, 0, 0, 5, (byte) 56);
    }

    private final static BoundedRandomAccessFile a(String param0, int param1, byte param2, String param3) {
        try {
          String var4 = null;
          if (param2 != -97) {
            return (BoundedRandomAccessFile) null;
          }
          if (param1 == 33) {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
          } else if (param1 == 34) {
            var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
          } else {
            var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
          }
          String[] var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
          for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (!(var7.length() > 0) ||
              new File(var7).exists()) {
              try {
                BoundedRandomAccessFile var8 = new BoundedRandomAccessFile(new File(var7, var4), "rw", 10000L);
                BoundedRandomAccessFile stackIn_15_0 = var8;
                return stackIn_15_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                Exception var8_ref = (Exception) (Object) decompiledCaughtException;
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

    final boolean isFullscreenAvailable(byte param0) {
        if (param0 != 84) {
          this.run();
        }
        if (!this.privilegedTasksEnabled) {
          return false;
        }
        if (this.microsoftJvm) {
          return this.field_x != null ? true : false;
        }
        return this.field_m != null ? true : false;
    }

    final SystemTask requestDeclaredField(String param0, Class param1, int param2) {
        if (param2 != 9) {
          return (SystemTask) null;
        }
        return this.enqueueTask(new Object[]{param1, param0}, 0, 0, 9, (byte) 87);
    }

    final SystemTask requestFullscreenEnter(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -79) {
          this.field_x = (MicrosoftDisplayController) null;
        }
        return this.enqueueTask((Object) null, param2 + (param4 << 16), param3 + (param0 << 16), 6, (byte) 83);
    }

    final SystemTask requestDirectSocket(int param0, String param1, int param2) {
        if (param0 != 2) {
          this.field_d = (MicrosoftCursorController) null;
        }
        return this.requestSocketConnection(param2, false, param1, param0 + 114);
    }

    final SystemTask requestUrlStream(byte param0, java.net.URL param1) {
        if (param0 < 55) {
          this.queueHead = (SystemTask) null;
        }
        return this.enqueueTask(param1, 0, 0, 4, (byte) 58);
    }

    private final SystemTask enqueueTask(Object param0, int param1, int param2, int param3, byte param4) {
        Throwable decompiledCaughtException = null;
        SystemTask var6 = new SystemTask();
        var6.objectArgument = param0;
        var6.secondaryIntArgument = param1;
        var6.requestType = param3;
        var6.intArgument = param2;
        Object var7 = this;
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
        if (param4 <= 54) {
          this.requestFullscreenEnter(47, -115, 69, 14, 3);
        }
        return var6;
    }

    SystemTaskService(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Throwable decompiledCaughtException = null;
        this.queueTail = null;
        this.queueHead = null;
        this.field_g = null;
        this.microsoftJvm = false;
        this.field_a = null;
        this.field_n = null;
        this.shutdownRequested = false;
        this.privilegedTasksEnabled = false;
        boolean stackIn_3_1 = (param3);
        this.privilegedTasksEnabled = stackIn_3_1;
        field_l = "1.1";
        field_t = param1;
        field_o = "Unknown";
        field_v = param0;
        try {
          field_o = System.getProperty("java.vendor");
          field_l = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.microsoftJvm = true;
        }
        try {
          field_k = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_k = "Unknown";
        }
        field_f = field_k.toLowerCase();
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
        if (null == field_i) {
          field_i = "~/";
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
        CacheFileLocator.a(field_t, field_v, 73);
        if (this.privilegedTasksEnabled) {
          this.field_g = new BoundedRandomAccessFile(CacheFileLocator.a("random.dat", 1, field_v, (String) null), "rw", 25L);
          this.field_n = new BoundedRandomAccessFile(CacheFileLocator.a(true, "main_file_cache.dat2"), "rw", 314572800L);
          this.field_a = new BoundedRandomAccessFile(CacheFileLocator.a(true, "main_file_cache.idx255"), "rw", 1048576L);
          this.field_r = new BoundedRandomAccessFile[param2];
          for (int var5_int = 0; var5_int < param2; var5_int++) {
            this.field_r[var5_int] = new BoundedRandomAccessFile(CacheFileLocator.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
          }
          if (this.microsoftJvm) {
            try {
              Class.forName("f").newInstance();
            } catch (java.lang.Throwable decompiledCaughtParameter8) {
              decompiledCaughtException = decompiledCaughtParameter8;
              throwable = decompiledCaughtException;
            }
          }
          try {
            if (!this.microsoftJvm) {
              this.field_m = Class.forName("AwtFullscreenController").newInstance();
            } else {
              MicrosoftDisplayController var10 = new MicrosoftDisplayController();
              this.field_x = var10;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter9) {
            decompiledCaughtException = decompiledCaughtParameter9;
            throwable = decompiledCaughtException;
          }
          try {
            if (this.microsoftJvm) {
              this.field_d = new MicrosoftCursorController();
            } else {
              this.field_h = Class.forName("AwtCursorBridge").newInstance();
            }
          } catch (java.lang.Throwable decompiledCaughtParameter10) {
            decompiledCaughtException = decompiledCaughtParameter10;
            throwable = decompiledCaughtException;
          }
        }
        if (this.privilegedTasksEnabled &&
          !this.microsoftJvm) {
          ThreadGroup var11 = Thread.currentThread().getThreadGroup();
          ThreadGroup var5 = var11;
          ThreadGroup var6 = var11.getParent();
          while (var6 != null) {
            ThreadGroup var12 = var6;
            var5 = var12;
            var6 = var12.getParent();
          }
          Thread[] var7 = new Thread[1000];
          var5.enumerate(var7);
          for (int var8 = 0; var8 < var7.length; var8++) {
            if (var7[var8] != null &&
              var7[var8].getName().startsWith("AWT")) {
              var7[var8].setPriority(1);
            }
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
