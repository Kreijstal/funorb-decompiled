/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformTaskDispatcher implements Runnable {
    private static String field_x;
    static java.lang.reflect.Method field_v;
    pa field_s;
    private PlatformTask taskQueueHead;
    java.awt.EventQueue field_q;
    static String field_t;
    private PlatformTask taskQueueTail;
    pa field_n;
    private static volatile long field_m;
    private Object field_u;
    private ie field_w;
    private static int field_f;
    pa field_j;
    pa[] field_r;
    private Thread workerThread;
    static String field_b;
    private boolean field_h;
    static String field_o;
    private Object field_e;
    private tg field_a;
    private boolean field_l;
    private boolean shutdownRequested;
    private static String field_p;
    private static String field_k;

    final PlatformTask a(int param0) {
        if (param0 != 34) {
            String var3 = (String) null;
            PlatformTaskDispatcher.a((byte) 23, 7, (String) null, (String) null);
        }
        return this.enqueueTask(1, (Object) null, 0, 5, 0);
    }

    final PlatformTask a(java.awt.Frame param0, int param1) {
        if (param1 != 0) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(1, param0, 0, 7, 0);
    }

    final boolean b(int param0) {
        if (param0 != -26098) {
            return false;
        }
        if (!this.field_h) {
            return false;
        }
        if (!this.field_l) {
            return null != this.field_e ? true : false;
        }
        return this.field_w != null ? true : false;
    }

    public final void run() {
        try {
            int var5 = 0;
            int stackIn_76_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            pa var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            bd var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            PlatformTask var9 = null;
            Thread var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (!this.shutdownRequested) {
                    if (this.taskQueueHead != null) {
                      var9 = this.taskQueueHead;
                      this.taskQueueHead = this.taskQueueHead.next;
                      if (null == this.taskQueueHead) {
                        this.taskQueueTail = null;
                      }
                      break L1;
                    }
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var3 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                  return;
                }
              }
              try {
                L7: {
                  var2_int = var9.taskType;
                  if (1 != var2_int) {
                    if (var2_int != 22) {
                      if (var2_int != 2) {
                        if (4 == var2_int) {
                          if (oa.a(-12520) < field_m) {
                            throw new IOException();
                          }
                          var9.result = new DataInputStream(((java.net.URL) (var9.input)).openStream());
                        } else {
                          if (var2_int == 8) {
                            var18 = (Object[]) (var9.input);
                            if (this.field_h) {
                              if (((Class) (var18[0])).getClassLoader() == null) {
                                throw new SecurityException();
                              }
                            }
                            var9.result = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                          } else {
                            if (var2_int == 9) {
                              var17 = (Object[]) (var9.input);
                              if (this.field_h) {
                                if (null == ((Class) (var17[0])).getClassLoader()) {
                                  throw new SecurityException();
                                }
                              }
                              var9.result = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                            } else {
                              if (18 == var2_int) {
                                var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                var9.result = var16.getContents((Object) null);
                              } else {
                                if (var2_int == 19) {
                                  var7 = (java.awt.datatransfer.Transferable) (var9.input);
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                } else {
                                  if (!this.field_h) {
                                    throw PlatformTaskDispatcher.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                  }
                                  if (var2_int == 3) {
                                    if (~oa.a(-12520) > ~field_m) {
                                      throw new IOException();
                                    }
                                    {
                                      var14 = (255 & var9.firstIntArgument >> 24) + "." + ((var9.firstIntArgument & 16718053) >> 16) + "." + (var9.firstIntArgument >> 8 & 255) + "." + (255 & var9.firstIntArgument);
                                      var9.result = java.net.InetAddress.getByName(var14).getHostName();
                                    }
                                  } else {
                                    if (var2_int == 21) {
                                      if (~oa.a(-12520) > ~field_m) {
                                        throw new IOException();
                                      }
                                      var9.result = java.net.InetAddress.getByName((String) (var9.input)).getAddress();
                                    } else {
                                      if (var2_int != 5) {
                                        if (6 == var2_int) {
                                          var13 = new java.awt.Frame("Jagex Full Screen");
                                          var9.result = var13;
                                          var13.setResizable(false);
                                          if (this.field_l) {
                                            this.field_w.a(8, var9.firstIntArgument >>> 16, var13, var9.secondIntArgument >> 16, var9.firstIntArgument & 65535, var9.secondIntArgument & 65535);
                                          } else {
                                            Class.forName("pd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var13, new Integer(var9.firstIntArgument >>> 16), new Integer(var9.firstIntArgument & 65535), new Integer(var9.secondIntArgument >> 16), new Integer(var9.secondIntArgument & 65535)});
                                          }
                                        } else {
                                          if (var2_int == 7) {
                                            if (this.field_l) {
                                              this.field_w.a(111, (java.awt.Frame) (var9.input));
                                            } else {
                                              Class.forName("pd").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                                            }
                                          } else {
                                            if (12 == var2_int) {
                                              var3_ref = PlatformTaskDispatcher.a((byte) -103, field_f, field_p, (String) (var9.input));
                                              var9.result = var3_ref;
                                            } else {
                                              if (var2_int == 13) {
                                                var3_ref = PlatformTaskDispatcher.a((byte) 19, field_f, "", (String) (var9.input));
                                                var9.result = var3_ref;
                                              } else {
                                                if (this.field_h) {
                                                  if (var2_int == 14) {
                                                    var3_int = var9.firstIntArgument;
                                                    var4_int = var9.secondIntArgument;
                                                    if (!this.field_l) {
                                                      Class.forName("tk").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                      break L7;
                                                    }
                                                    this.field_a.a(-71, var4_int, var3_int);
                                                    break L7;
                                                  }
                                                }
                                                if (this.field_h) {
                                                  if (var2_int == 15) {
                                                    stackIn_76_0 = (var9.firstIntArgument == 0) ? 0 : 1;
                                                    var3_int = stackIn_76_0;
                                                    var12 = (java.awt.Component) (var9.input);
                                                    if (this.field_l) {
                                                      this.field_a.a(12758, var3_int != 0, var12);
                                                      break L7;
                                                    }
                                                    Class.forName("tk").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var12, new Boolean(var3_int != 0)});
                                                    break L7;
                                                  }
                                                }
                                                if (!this.field_l) {
                                                  if (var2_int == 17) {
                                                    var11 = (Object[]) (var9.input);
                                                    Class.forName("tk").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var11[0], var11[1], new Integer(var9.firstIntArgument), new Integer(var9.secondIntArgument), var11[2]});
                                                    break L7;
                                                  }
                                                }
                                                if (var2_int != 16) {
                                                  throw PlatformTaskDispatcher.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                }
                                                try {
                                                  L14: {
                                                    if (!field_b.startsWith("win")) {
                                                      throw PlatformTaskDispatcher.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                    }
                                                    {
                                                      var8 = (String) (var9.input);
                                                      if (!var8.startsWith("http://")) {
                                                        if (!var8.startsWith("https://")) {
                                                          throw PlatformTaskDispatcher.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                        }
                                                      }
                                                      var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                      for (var5 = 0; var5 < var8.length(); var5++) {
                                                        if (-1 == var4.indexOf((int) var8.charAt(var5))) {
                                                          throw PlatformTaskDispatcher.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                        }
                                                      }
                                                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                      var9.result = null;
                                                      break L14;
                                                    }
                                                  }
                                                } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                  decompiledCaughtException = decompiledCaughtParameter1;
                                                  var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                  var9.result = var3_ref2;
                                                  throw PlatformTaskDispatcher.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (!this.field_l) {
                                          var9.result = Class.forName("pd").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                                        } else {
                                          var9.result = this.field_w.a(8);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var10 = new Thread((Runnable) (var9.input));
                        var10.setDaemon(true);
                        var10.start();
                        var10.setPriority(var9.firstIntArgument);
                        var9.result = var10;
                      }
                    } else {
                      if (oa.a(-12520) < field_m) {
                        throw new IOException();
                      }
                      try {
                          if (false) throw (bd) null;
                        var9.result = mk.a(-43, (String) (var9.input), var9.firstIntArgument).b(0);
                      } catch (bd decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        var3_ref3 = (bd) (Object) decompiledCaughtException;
                        var9.result = var3_ref3.getMessage();
                        throw var3_ref3;
                      }
                    }
                  } else {
                    if (~oa.a(-12520) > ~field_m) {
                      throw new IOException();
                    }
                    var9.result = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.input)), var9.firstIntArgument);
                  }
                }
                var9.status = 1;
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var2_ref2 = decompiledCaughtException;
                var9.status = 2;
              }
              var2 = var9;
              synchronized (var2) {
                var9.notify();
              }
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final PlatformTask a(int param0, int param1, boolean param2, String param3) {
        if (param0 != 0) {
            this.field_j = (pa) null;
        }
        return this.enqueueTask(1, param3, param1, param2 ? 22 : 1, 0);
    }

    final PlatformTask startThread(Runnable runnable, int guard, int priority) {
        if (guard != 0) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(guard + 1, runnable, priority, 2, 0);
    }

    private final static pa a(byte param0, int param1, String param2, String param3) {
        try {
            int var6 = 0;
            pa stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var7 = 0;
            String var8 = null;
            pa var9 = null;
            Exception var9_ref = null;
            if (33 == param1) {
              var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
            } else {
              if (34 != param1) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var7 = -95 % ((-46 - param0) / 35);
            L1: for (var6 = 0; var6 < var5.length; var6++) {
              var8 = var5[var6];
              if (0 < var8.length()) {
                if (!new File(var8).exists()) {
                  continue L1;
                }
              }
              try {
                var9 = new pa(new File(var8, var4), "rw", 10000L);
                stackIn_13_0 = (pa) (var9);
                return stackIn_13_0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var9_ref = (Exception) (Object) decompiledCaughtException;
                var6++;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        try {
            PlatformTask discarded$0 = null;
            int var2_int = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            IOException var3 = null;
            String var4 = null;
            var2 = this;
            synchronized (var2) {
              this.shutdownRequested = true;
              if (param0 != 13) {
                var4 = (String) null;
                discarded$0 = this.a(-99, 45, true, (String) null);
              }
              this.notifyAll();
            }
            try {
              this.workerThread.join();
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (InterruptedException) (Object) decompiledCaughtException;
            }
            if (this.field_j != null) {
              try {
                this.field_j.a((byte) -5);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref2 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != this.field_s) {
              try {
                this.field_s.a((byte) -5);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var2_ref2 = (IOException) (Object) decompiledCaughtException;
              }
            }
            L10: {
              if (null != this.field_r) {
                L11: for (var2_int = 0; var2_int < this.field_r.length; var2_int++) {
                  if (this.field_r[var2_int] == null) {
                    continue L11;
                  }
                  try {
                    this.field_r[var2_int].a((byte) -5);
                    var2_int++;
                  } catch (java.io.IOException decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var3 = (IOException) (Object) decompiledCaughtException;
                    var2_int++;
                  }
                }
                break L10;
              }
            }
            if (null != this.field_n) {
              try {
                this.field_n.a((byte) -5);
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

    final PlatformTask a(int param0, String param1, boolean param2) {
        if (param2) {
            this.a(82);
        }
        return this.a(0, param0, false, param1);
    }

    final PlatformTask a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1743550128) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(param1 ^ -1743550127, (Object) null, param0 + (param4 << 16), 6, (param3 << 16) + param2);
    }

    final PlatformTask a(Class param0, int param1, String param2) {
        if (param1 != 0) {
            this.field_w = (ie) null;
        }
        return this.enqueueTask(1, new Object[]{param0, param2}, 0, 9, 0);
    }

    private final PlatformTask enqueueTask(int guard, Object input, int firstIntArgument, int taskType, int secondIntArgument) {
        PlatformTask task = null;
        Throwable unusedCaughtThrowable = null;
        Object queueMonitor = null;
        task = new PlatformTask();
        task.input = input;
        task.firstIntArgument = firstIntArgument;
        task.secondIntArgument = secondIntArgument;
        if (guard != 1) {
          return (PlatformTask) null;
        }
        {
          task.taskType = taskType;
          queueMonitor = this;
          synchronized (queueMonitor) {
            if (this.taskQueueTail == null) {
              this.taskQueueHead = task;
              this.taskQueueTail = task;
            } else {
              this.taskQueueTail.next = task;
              this.taskQueueTail = task;
            }
            this.notify();
          }
          return task;
        }
    }

    final PlatformTask a(String param0, int param1, Class[] param2, Class param3) {
        if (param1 >= -118) {
            this.field_e = (Object) null;
        }
        return this.enqueueTask(1, new Object[]{param3, param0, param2}, 0, 8, 0);
    }

    final PlatformTask a(int param0, java.net.URL param1) {
        if (param0 != -14) {
            return (PlatformTask) null;
        }
        return this.enqueueTask(1, param1, 0, 4, 0);
    }

    PlatformTaskDispatcher(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ie var6 = null;
        this.taskQueueHead = null;
        this.field_n = null;
        this.field_j = null;
        this.taskQueueTail = null;
        this.field_s = null;
        this.field_l = false;
        this.field_h = false;
        this.shutdownRequested = false;
        field_p = param1;
        stackIn_2_0 = this;

        if (!param3) {
          stackIn_3_0 = this;
          stackIn_3_1 = false;
        } else {
          stackIn_3_0 = this;
          stackIn_3_1 = true;
        }
        ((PlatformTaskDispatcher) (this)).field_h = stackIn_3_1;
        field_o = "Unknown";
        field_t = "1.1";
        field_f = param0;
        try {
          field_o = System.getProperty("java.vendor");
          field_t = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
          this.field_l = true;
        }
        try {
          field_k = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          exception = (Exception) (Object) decompiledCaughtException;
          field_k = "Unknown";
        }
        field_b = field_k.toLowerCase();
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
          field_x = System.getProperty("user.home");
          if (field_x != null) {
            field_x = field_x + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_x) {
          field_x = "~/";
        }
        try {
          this.field_q = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          throwable = decompiledCaughtException;
        }
        if (!this.field_l) {
          try {
            Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter6) {
            decompiledCaughtException = decompiledCaughtParameter6;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          try {
            field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
          } catch (java.lang.Exception decompiledCaughtParameter7) {
            decompiledCaughtException = decompiledCaughtParameter7;
            exception = (Exception) (Object) decompiledCaughtException;
          }
        }
        L21: {
          aj.a((byte) 66, field_p, field_f);
          if (this.field_h) {
            this.field_n = new pa(aj.a((String) null, -27533, "random.dat", field_f), "rw", 25L);
            this.field_j = new pa(aj.a("main_file_cache.dat2", (byte) -116), "rw", 314572800L);
            this.field_s = new pa(aj.a("main_file_cache.idx255", (byte) -77), "rw", 1048576L);
            this.field_r = new pa[param2];
            for (var5_int = 0; var5_int < param2; var5_int++) {
              this.field_r[var5_int] = new pa(aj.a("main_file_cache.idx" + var5_int, (byte) -104), "rw", 1048576L);
            }
            if (this.field_l) {
              try {
                Class.forName("of").newInstance();
              } catch (java.lang.Throwable decompiledCaughtParameter8) {
                decompiledCaughtException = decompiledCaughtParameter8;
                throwable = decompiledCaughtException;
              }
            }
            try {
              if (this.field_l) {
                var6 = new ie();
                this.field_w = var6;
              } else {
                this.field_e = Class.forName("pd").newInstance();
              }
            } catch (java.lang.Throwable decompiledCaughtParameter9) {
              decompiledCaughtException = decompiledCaughtParameter9;
              throwable = decompiledCaughtException;
            }
            try {
              if (!this.field_l) {
                this.field_u = Class.forName("tk").newInstance();
              } else {
                this.field_a = new tg();
              }
            } catch (java.lang.Throwable decompiledCaughtParameter10) {
              decompiledCaughtException = decompiledCaughtParameter10;
              throwable = decompiledCaughtException;
            }
            break L21;
          }
        }
        this.shutdownRequested = false;
        this.workerThread = new Thread((Runnable) (this));
        this.workerThread.setPriority(10);
        this.workerThread.setDaemon(true);
        this.workerThread.start();
    }

    static {
        field_m = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
