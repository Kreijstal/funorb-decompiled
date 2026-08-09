/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bu implements Runnable {
    ao field_q;
    ao field_c;
    private static String field_e;
    java.awt.EventQueue field_a;
    ao field_j;
    private Thread field_s;
    boolean field_l;
    private boolean field_m;
    private gh field_k;
    private static volatile long field_w;
    ao[] field_v;
    private wu field_p;
    private Object field_g;
    static String field_r;
    static java.lang.reflect.Method field_x;
    private boolean field_f;
    static String field_h;
    private static String field_t;
    private static int field_d;
    private Object field_i;
    private static String field_b;
    private wu field_o;
    private wg field_n;
    static String field_u;

    final wu a(int param0, Class[] param1, Class param2, String param3) {
        if (param0 != -30971) {
            this.field_k = (gh) null;
        }
        return this.a(8, 0, 8128, new Object[]{param2, param3, param1}, 0);
    }

    final wu a(String param0, Class param1, int param2) {
        if (param2 != 0) {
            return (wu) null;
        }
        return this.a(9, 0, 8128, new Object[]{param1, param0}, 0);
    }

    final wu a(byte param0, int param1, int param2, java.awt.Component param3) {
        java.awt.Point var5 = param3.getLocationOnScreen();
        if (param0 <= 19) {
            field_e = (String) null;
        }
        return this.a(14, param1 - -var5.y, 8128, (Object) null, var5.x + param2);
    }

    private final wu a(String param0, boolean param1, int param2, int param3) {
        if (param2 != -8) {
            return (wu) null;
        }
        return this.a(param1 ? 22 : 1, 0, 8128, param0, param3);
    }

    final wu b(boolean param0) {
        if (!param0) {
            return (wu) null;
        }
        return this.a(5, 0, 8128, (Object) null, 0);
    }

    final wu a(int param0, java.awt.Component param1, boolean param2) {
        if (param0 > -116) {
            return (wu) null;
        }
        return this.a(15, 0, 8128, param1, !param2 ? 0 : 1);
    }

    final boolean b(int param0) {
        if (!(this.field_l)) {
            return false;
        }
        int var2 = -103 % ((param0 - 46) / 34);
        if (this.field_f) {
            return this.field_k != null ? true : false;
        }
        return this.field_i != null ? true : false;
    }

    public final void run() {
        try {
            int stackIn_70_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            ao var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            lw var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            wu var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            java.awt.Frame var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            Object[] var16 = null;
            String var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_m) {
                      return;
                    } else {
                      if (null == this.field_o) {
                        try {
                          L3: {
                            this.wait();
                            break L3;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L4;
                          }
                        }
                        continue L2;
                      } else {
                        L5: {
                          var8 = this.field_o;
                          this.field_o = this.field_o.field_f;
                          if (this.field_o != null) {
                            break L5;
                          } else {
                            this.field_p = null;
                            break L5;
                          }
                        }
                        break L1;
                      }
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8.field_c;
                    if (-2 == (var2_int ^ -1)) {
                      if (nj.a(-119) < field_w) {
                        throw new IOException();
                      } else {
                        var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_d);
                        break L7;
                      }
                    } else {
                      if (-23 != (var2_int ^ -1)) {
                        if (var2_int != 2) {
                          if (4 != var2_int) {
                            if ((var2_int ^ -1) != -9) {
                              if (-10 == (var2_int ^ -1)) {
                                L8: {
                                  var18 = (Object[]) (var8.field_g);
                                  if (this.field_l) {
                                    if (null != ((Class) (var18[0])).getClassLoader()) {
                                      break L8;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                var8.field_b = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                                break L7;
                              } else {
                                if (-19 != (var2_int ^ -1)) {
                                  if ((var2_int ^ -1) != -20) {
                                    if (!this.field_l) {
                                      throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (-4 == (var2_int ^ -1)) {
                                        if ((nj.a(-68) ^ -1L) <= (field_w ^ -1L)) {
                                          var17 = (255 & var8.field_d >> -263221864) + "." + ((16767672 & var8.field_d) >> -1175570576) + "." + ((65454 & var8.field_d) >> -274944696) + "." + (var8.field_d & 255);
                                          var8.field_b = java.net.InetAddress.getByName(var17).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if ((var2_int ^ -1) != -22) {
                                          if ((var2_int ^ -1) != -6) {
                                            if (var2_int != 6) {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (12 == var2_int) {
                                                  var3_ref = bu.a(-127, field_d, field_e, (String) (var8.field_g));
                                                  var8.field_b = var3_ref;
                                                  break L7;
                                                } else {
                                                  if (13 != var2_int) {
                                                    L9: {
                                                      if (!this.field_l) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8.field_d;
                                                          var4_int = var8.field_e;
                                                          if (!this.field_f) {
                                                            Class.forName("fl").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          } else {
                                                            this.field_n.a(var4_int, (byte) -40, var3_int);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_l) {
                                                        break L10;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (-1 == (var8.field_d ^ -1)) {
                                                              stackIn_70_0 = 0;
                                                              break L11;
                                                            } else {
                                                              stackIn_70_0 = 1;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_70_0;
                                                          var14 = (java.awt.Component) (var8.field_g);
                                                          if (!this.field_f) {
                                                            Class.forName("fl").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_g, new Object[]{var14, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_n.a(var14, var3_int != 0, -106);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_f) {
                                                        break L12;
                                                      } else {
                                                        if ((var2_int ^ -1) == -18) {
                                                          var16 = (Object[]) (var8.field_g);
                                                          Class.forName("fl").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_g, new Object[]{var16[0], var16[1], new Integer(var8.field_d), new Integer(var8.field_e), var16[2]});
                                                          break L7;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (field_h.startsWith("win")) {
                                                            L14: {
                                                              var15 = (String) (var8.field_g);
                                                              if (var15.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (var15.startsWith("https://")) {
                                                                  break L14;
                                                                } else {
                                                                  throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var15.length() <= var5) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8.field_b = null;
                                                                break L13;
                                                              } else {
                                                                if (-1 != var4.indexOf((int) var15.charAt(var5))) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_b = var3_ref2;
                                                        throw bu.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref = bu.a(-112, field_d, "", (String) (var8.field_g));
                                                    var8.field_b = var3_ref;
                                                    break L7;
                                                  }
                                                }
                                              } else {
                                                if (!this.field_f) {
                                                  Class.forName("fe").getMethod("exit", new Class[]{}).invoke(this.field_i, new Object[]{});
                                                  break L7;
                                                } else {
                                                  this.field_k.a(0, (java.awt.Frame) (var8.field_g));
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_b = var13;
                                              var13.setResizable(false);
                                              if (this.field_f) {
                                                this.field_k.a(var8.field_d >>> 1232972816, 65535 & var8.field_e, var8.field_d & 65535, var13, var8.field_e >> 1153725424, -2147483648);
                                                break L7;
                                              } else {
                                                Class.forName("fe").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_i, new Object[]{var13, new Integer(var8.field_d >>> -165715728), new Integer(65535 & var8.field_d), new Integer(var8.field_e >> -269506864), new Integer(var8.field_e & 65535)});
                                                break L7;
                                              }
                                            }
                                          } else {
                                            if (this.field_f) {
                                              var8.field_b = this.field_k.a(0);
                                              break L7;
                                            } else {
                                              var8.field_b = Class.forName("fe").getMethod("listmodes", new Class[]{}).invoke(this.field_i, new Object[]{});
                                              break L7;
                                            }
                                          }
                                        } else {
                                          if ((field_w ^ -1L) >= (nj.a(-52) ^ -1L)) {
                                            var8.field_b = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_b = var11.getContents((Object) null);
                                  break L7;
                                }
                              }
                            } else {
                              L16: {
                                var10 = (Object[]) (var8.field_g);
                                if (!this.field_l) {
                                  break L16;
                                } else {
                                  if (null != ((Class) (var10[0])).getClassLoader()) {
                                    break L16;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8.field_b = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L7;
                            }
                          } else {
                            if (field_w <= nj.a(43)) {
                              var8.field_b = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_g));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_d);
                          var8.field_b = var9;
                          break L7;
                        }
                      } else {
                        if (field_w > nj.a(35)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (lw) null;
                            L17: {
                              var8.field_b = ql.a((String) (var8.field_g), var8.field_d, -13067).a(1);
                              break L17;
                            }
                          } catch (lw decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (lw) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        }
                      }
                    }
                  }
                  var8.field_a = 1;
                  break L6;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L18: {
                  var2_ref2 = decompiledCaughtException;
                  var8.field_a = 2;
                  break L18;
                }
              }
              var2 = var8;
              synchronized (var2) {
                L19: {
                  var8.notify();
                  break L19;
                }
              }
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wu a(byte param0, java.awt.datatransfer.Transferable param1) {
        if (param0 != 68) {
            this.field_g = (Object) null;
        }
        return this.a(19, 0, 8128, param1, 0);
    }

    final wu a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            return (wu) null;
        }
        return this.a(6, param1 + (param4 << -1370823920), 8128, (Object) null, (param3 << -1397180272) - -param0);
    }

    final wu a(int param0) {
        if (param0 != 15) {
            return (wu) null;
        }
        return this.a(18, 0, 8128, (Object) null, 0);
    }

    final void a(boolean param0) {
        try {
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  stackIn_3_0 = this;

                  if (!param0) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L1;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L1;
                  }
                }
                ((bu) (this)).field_m = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                this.field_s.join();
                break L2;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null == this.field_c) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_c.a(-101);
                    break L5;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null != this.field_j) {
                try {
                  L8: {
                    this.field_j.a(-118);
                    break L8;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L9: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L9;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null != this.field_v) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_v.length) {
                    break L10;
                  } else {
                    if (this.field_v[var2_int] != null) {
                      try {
                        L12: {
                          this.field_v[var2_int].a(-123);
                          var2_int++;
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          var2_int++;
                          break L13;
                        }
                      }
                      continue L11;
                    } else {
                      var2_int++;
                      continue L11;
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (null != this.field_q) {
                try {
                  L15: {
                    this.field_q.a(-106);
                    break L15;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L16: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L16;
                  }
                }
                break L14;
              } else {
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wu a(java.net.URL param0, byte param1) {
        if (param1 > -17) {
            String var4 = (String) null;
            bu.a(92, -82, (String) null, (String) null);
        }
        return this.a(4, 0, 8128, param0, 0);
    }

    final wu a(byte param0, java.awt.Frame param1) {
        if (param0 >= -36) {
            String var4 = (String) null;
            bu.a(-21, 74, (String) null, (String) null);
        }
        return this.a(7, 0, 8128, param1, 0);
    }

    final wu a(int param0, byte param1, Runnable param2) {
        if (param1 < 109) {
            this.field_g = (Object) null;
        }
        return this.a(2, 0, 8128, param2, param0);
    }

    private final wu a(int param0, int param1, int param2, Object param3, int param4) {
        wu var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        wu stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new wu();
        var6.field_e = param1;
        var6.field_d = param4;
        var6.field_g = param3;
        var6.field_c = param0;
        var7_ref = this;
        synchronized (var7_ref) {
          L0: {
            if (param2 == 8128) {
              L1: {
                if (null != this.field_p) {
                  this.field_p.field_f = var6;
                  this.field_p = var6;
                  break L1;
                } else {
                  this.field_o = var6;
                  this.field_p = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            } else {
              stackIn_3_0 = (wu) null;
              return stackIn_3_0;
            }
          }
        }
        return var6;
    }

    bu(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        gh var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          this.field_l = false;
          this.field_m = false;
          this.field_j = null;
          this.field_c = null;
          this.field_f = false;
          this.field_p = null;
          this.field_o = null;
          this.field_q = null;
          field_u = "Unknown";
          field_r = "1.1";
          field_e = param1;
          field_d = param0;
          stackIn_2_0 = this;

          if (!param3) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((bu) (this)).field_l = stackIn_3_1 != 0;
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
            field_r = System.getProperty("java.version");
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
            this.field_f = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_t = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_t = "Unknown";
            break L5;
          }
        }
        field_h = field_t.toLowerCase();
        try {
          L6: {
            System.getProperty("os.arch").toLowerCase();
            break L6;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L7;
          }
        }
        try {
          L8: {
            System.getProperty("os.version").toLowerCase();
            break L8;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L9: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L9;
          }
        }
        try {
          L10: {
            L11: {
              field_b = System.getProperty("user.home");
              if (null == field_b) {
                break L11;
              } else {
                field_b = field_b + "/";
                break L11;
              }
            }
            break L10;
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L12: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L12;
          }
        }
        L13: {
          if (null == field_b) {
            field_b = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L14;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L15: {
            throwable = decompiledCaughtException;
            break L15;
          }
        }
        L16: {
          if (this.field_f) {
            break L16;
          } else {
            try {
              L17: {
                Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
                break L17;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L18: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            try {
              L19: {
                field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
                break L19;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L20: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L20;
              }
            }
            break L16;
          }
        }
        L21: {
          bj.a(field_e, (byte) -99, field_d);
          if (!this.field_l) {
            break L21;
          } else {
            this.field_q = new ao(bj.a("random.dat", (String) null, field_d, false), "rw", 25L);
            this.field_c = new ao(bj.a("main_file_cache.dat2", 0), "rw", 314572800L);
            this.field_j = new ao(bj.a("main_file_cache.idx255", 0), "rw", 1048576L);
            this.field_v = new ao[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_f) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("mw").newInstance();
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L25: {
                        throwable = decompiledCaughtException;
                        break L25;
                      }
                    }
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (!this.field_f) {
                        this.field_i = Class.forName("fe").newInstance();
                        break L27;
                      } else {
                        var7 = new gh();
                        this.field_k = var7;
                        break L27;
                      }
                    }
                    break L26;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L28: {
                    throwable = decompiledCaughtException;
                    break L28;
                  }
                }
                try {
                  L29: {
                    L30: {
                      if (this.field_f) {
                        this.field_n = new wg();
                        break L30;
                      } else {
                        this.field_g = Class.forName("fl").newInstance();
                        break L30;
                      }
                    }
                    break L29;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L31: {
                    throwable = decompiledCaughtException;
                    break L31;
                  }
                }
                break L21;
              } else {
                this.field_v[var5_int] = new ao(bj.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_m = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    private final static ao a(int param0, int param1, String param2, String param3) {
        try {
            ao stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            ao var8 = null;
            Exception var8_ref = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if ((param1 ^ -1) != -35) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_b, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 <= -95) {
              var6 = 0;
              L1: while (true) {
                if (var5.length > var6) {
                  L2: {
                    var7 = var5[var6];
                    if (0 >= var7.length()) {
                      break L2;
                    } else {
                      if (new File(var7).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    L3: {
                      var8 = new ao(new File(var7, var4), "rw", 10000L);
                      stackIn_15_0 = (ao) (var8);
                      decompiledRegionSelector0 = 0;
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var8_ref = (Exception) (Object) decompiledCaughtException;
                      var6++;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_15_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (ao) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wu a(boolean param0, String param1, int param2) {
        if (!param0) {
            field_h = (String) null;
        }
        return this.a(param1, false, -8, param2);
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
