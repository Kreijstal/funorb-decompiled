/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d implements Runnable {
    private static String field_x;
    static java.lang.reflect.Method field_v;
    pa field_s;
    private cb field_d;
    java.awt.EventQueue field_q;
    static String field_t;
    private cb field_g;
    pa field_n;
    private static volatile long field_m;
    private Object field_u;
    private ie field_w;
    private static int field_f;
    pa field_j;
    pa[] field_r;
    private Thread field_i;
    static String field_b;
    private boolean field_h;
    static String field_o;
    private Object field_e;
    private tg field_a;
    private boolean field_l;
    private boolean field_c;
    private static String field_p;
    private static String field_k;

    final cb a(int param0) {
        if (param0 != 34) {
            String var3 = (String) null;
            d.a((byte) 23, 7, (String) null, (String) null);
        }
        return this.a(1, (Object) null, 0, 5, 0);
    }

    final cb a(java.awt.Frame param0, int param1) {
        if (param1 != 0) {
            return (cb) null;
        }
        return this.a(1, param0, 0, 7, 0);
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
            cb var9 = null;
            Thread var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  while (!this.field_c) {
                    if (this.field_d != null) {
                      var9 = this.field_d;
                      this.field_d = this.field_d.field_e;
                      if (null == this.field_d) {
                        this.field_g = null;
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
                  var2_int = var9.field_d;
                  if (1 != var2_int) {
                    if (var2_int != 22) {
                      if (var2_int != 2) {
                        if (4 == var2_int) {
                          if (oa.a(-12520) < field_m) {
                            throw new IOException();
                          }
                          var9.field_b = new DataInputStream(((java.net.URL) (var9.field_f)).openStream());
                        } else {
                          if (var2_int == 8) {
                            var18 = (Object[]) (var9.field_f);
                            if ((this.field_h) &&
                                (((Class) (var18[0])).getClassLoader() == null)) {
                              throw new SecurityException();
                            }
                            var9.field_b = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                          } else {
                            if (var2_int == 9) {
                              var17 = (Object[]) (var9.field_f);
                              if ((this.field_h) &&
                                  (null == ((Class) (var17[0])).getClassLoader())) {
                                throw new SecurityException();
                              }
                              var9.field_b = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                            } else {
                              if (18 == var2_int) {
                                var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                var9.field_b = var16.getContents((Object) null);
                              } else {
                                if (var2_int == 19) {
                                  var7 = (java.awt.datatransfer.Transferable) (var9.field_f);
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                } else {
                                  if (!this.field_h) {
                                    throw d.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                  }
                                  if (var2_int == 3) {
                                    if (~oa.a(-12520) > ~field_m) {
                                      throw new IOException();
                                    }
                                    var14 = (255 & var9.field_c >> 24) + "." + ((var9.field_c & 16718053) >> 16) + "." + (var9.field_c >> 8 & 255) + "." + (255 & var9.field_c);
                                    var9.field_b = java.net.InetAddress.getByName(var14).getHostName();
                                  } else {
                                    if (var2_int == 21) {
                                      if (~oa.a(-12520) > ~field_m) {
                                        throw new IOException();
                                      }
                                      var9.field_b = java.net.InetAddress.getByName((String) (var9.field_f)).getAddress();
                                    } else {
                                      if (var2_int != 5) {
                                        if (6 == var2_int) {
                                          var13 = new java.awt.Frame("Jagex Full Screen");
                                          var9.field_b = var13;
                                          var13.setResizable(false);
                                          if (this.field_l) {
                                            this.field_w.a(8, var9.field_c >>> 16, var13, var9.field_g >> 16, var9.field_c & 65535, var9.field_g & 65535);
                                          } else {
                                            Class.forName("pd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var13, new Integer(var9.field_c >>> 16), new Integer(var9.field_c & 65535), new Integer(var9.field_g >> 16), new Integer(var9.field_g & 65535)});
                                          }
                                        } else {
                                          if (var2_int == 7) {
                                            if (this.field_l) {
                                              this.field_w.a(111, (java.awt.Frame) (var9.field_f));
                                            } else {
                                              Class.forName("pd").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                                            }
                                          } else {
                                            if (12 == var2_int) {
                                              var3_ref = d.a((byte) -103, field_f, field_p, (String) (var9.field_f));
                                              var9.field_b = var3_ref;
                                            } else {
                                              if (var2_int == 13) {
                                                var3_ref = d.a((byte) 19, field_f, "", (String) (var9.field_f));
                                                var9.field_b = var3_ref;
                                              } else {
                                                if ((this.field_h) &&
                                                    (var2_int == 14)) {
                                                  var3_int = var9.field_c;
                                                  var4_int = var9.field_g;
                                                  if (!this.field_l) {
                                                    Class.forName("tk").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                    break L7;
                                                  }
                                                  this.field_a.a(-71, var4_int, var3_int);
                                                  break L7;
                                                }
                                                if ((this.field_h) &&
                                                    (var2_int == 15)) {
                                                  stackIn_76_0 = (var9.field_c == 0) ? 0 : 1;
                                                  var3_int = stackIn_76_0;
                                                  var12 = (java.awt.Component) (var9.field_f);
                                                  if (this.field_l) {
                                                    this.field_a.a(12758, var3_int != 0, var12);
                                                    break L7;
                                                  }
                                                  Class.forName("tk").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var12, new Boolean(var3_int != 0)});
                                                  break L7;
                                                }
                                                if ((!this.field_l) &&
                                                    (var2_int == 17)) {
                                                  var11 = (Object[]) (var9.field_f);
                                                  Class.forName("tk").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var11[0], var11[1], new Integer(var9.field_c), new Integer(var9.field_g), var11[2]});
                                                  break L7;
                                                }
                                                if (var2_int != 16) {
                                                  throw d.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                }
                                                try {
                                                  if (!field_b.startsWith("win")) {
                                                    throw d.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                  }
                                                  var8 = (String) (var9.field_f);
                                                  if ((!var8.startsWith("http://")) &&
                                                      (!var8.startsWith("https://"))) {
                                                    throw d.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                  }
                                                  var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                  for (var5 = 0; var5 < var8.length(); var5++) {
                                                    if (-1 == var4.indexOf((int) var8.charAt(var5))) {
                                                      throw d.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                    }
                                                  }
                                                  Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                  var9.field_b = null;
                                                } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                  decompiledCaughtException = decompiledCaughtParameter1;
                                                  var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                  var9.field_b = var3_ref2;
                                                  throw d.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (!this.field_l) {
                                          var9.field_b = Class.forName("pd").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                                        } else {
                                          var9.field_b = this.field_w.a(8);
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
                        var10 = new Thread((Runnable) (var9.field_f));
                        var10.setDaemon(true);
                        var10.start();
                        var10.setPriority(var9.field_c);
                        var9.field_b = var10;
                      }
                    } else {
                      if (oa.a(-12520) < field_m) {
                        throw new IOException();
                      }
                      try {
                          if (false) throw (bd) null;
                        var9.field_b = mk.a(-43, (String) (var9.field_f), var9.field_c).b(0);
                      } catch (bd decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        var3_ref3 = (bd) (Object) decompiledCaughtException;
                        var9.field_b = var3_ref3.getMessage();
                        throw var3_ref3;
                      }
                    }
                  } else {
                    if (~oa.a(-12520) > ~field_m) {
                      throw new IOException();
                    }
                    var9.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_f)), var9.field_c);
                  }
                }
                var9.field_a = 1;
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var2_ref2 = decompiledCaughtException;
                var9.field_a = 2;
              }
              var2 = var9;
              synchronized (var2) {
                var9.notify();
              }
              continue;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final cb a(int param0, int param1, boolean param2, String param3) {
        if (param0 != 0) {
            this.field_j = (pa) null;
        }
        return this.a(1, param3, param1, param2 ? 22 : 1, 0);
    }

    final cb a(Runnable param0, int param1, int param2) {
        if (param1 != 0) {
            return (cb) null;
        }
        return this.a(param1 + 1, param0, param2, 2, 0);
    }

    private final static pa a(byte param0, int param1, String param2, String param3) {
        try {
            pa stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
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
            var6 = 0;
            while (var6 < var5.length) {
              var8 = var5[var6];
              if ((0 < var8.length()) &&
                  (!new File(var8).exists())) {
                var6++;
                continue;
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
            cb discarded$0 = null;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            String var4 = null;
            var2 = this;
            synchronized (var2) {
              this.field_c = true;
              if (param0 != 13) {
                var4 = (String) null;
                discarded$0 = this.a(-99, 45, true, (String) null);
              }
              this.notifyAll();
            }
            try {
              this.field_i.join();
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
            if (null != this.field_r) {
              var2_int = 0;
              while (var2_int < this.field_r.length) {
                if (this.field_r[var2_int] == null) {
                  var2_int++;
                  continue;
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

    final cb a(int param0, String param1, boolean param2) {
        if (param2) {
            this.a(82);
        }
        return this.a(0, param0, false, param1);
    }

    final cb a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1743550128) {
            return (cb) null;
        }
        return this.a(param1 ^ -1743550127, (Object) null, param0 + (param4 << 16), 6, (param3 << 16) + param2);
    }

    final cb a(Class param0, int param1, String param2) {
        if (param1 != 0) {
            this.field_w = (ie) null;
        }
        return this.a(1, new Object[]{param0, param2}, 0, 9, 0);
    }

    private final cb a(int param0, Object param1, int param2, int param3, int param4) {
        cb var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new cb();
        var6.field_f = param1;
        var6.field_c = param2;
        var6.field_g = param4;
        if (param0 != 1) {
          return (cb) null;
        }
        var6.field_d = param3;
        var7 = this;
        synchronized (var7) {
          if (this.field_g == null) {
            this.field_d = var6;
            this.field_g = var6;
          } else {
            this.field_g.field_e = var6;
            this.field_g = var6;
          }
          this.notify();
        }
        return var6;
    }

    final cb a(String param0, int param1, Class[] param2, Class param3) {
        if (param1 >= -118) {
            this.field_e = (Object) null;
        }
        return this.a(1, new Object[]{param3, param0, param2}, 0, 8, 0);
    }

    final cb a(int param0, java.net.URL param1) {
        if (param0 != -14) {
            return (cb) null;
        }
        return this.a(1, param1, 0, 4, 0);
    }

    d(int param0, String param1, int param2, boolean param3) throws Exception {
        int var5_int = 0;
        Exception exception = null;
        Throwable throwable = null;
        boolean stackIn_3_1 = false;
        Throwable decompiledCaughtException = null;
        ie var6 = null;
        this.field_d = null;
        this.field_n = null;
        this.field_j = null;
        this.field_g = null;
        this.field_s = null;
        this.field_l = false;
        this.field_h = false;
        this.field_c = false;
        field_p = param1;
        if (!param3) {
          stackIn_3_1 = false;
        } else {
          stackIn_3_1 = true;
        }
        ((d) (this)).field_h = stackIn_3_1;
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
        }
        this.field_c = false;
        this.field_i = new Thread((Runnable) (this));
        this.field_i.setPriority(10);
        this.field_i.setDaemon(true);
        this.field_i.start();
    }

    static {
        field_m = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
