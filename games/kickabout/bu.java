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
            ((bu) this).field_k = null;
        }
        return this.a(8, 0, 8128, (Object) (Object) new Object[3], 0);
    }

    final wu a(String param0, Class param1, int param2) {
        if (param2 != 0) {
            return null;
        }
        return this.a(9, 0, 8128, (Object) (Object) new Object[2], 0);
    }

    final wu a(byte param0, int param1, int param2, java.awt.Component param3) {
        java.awt.Point var5 = param3.getLocationOnScreen();
        if (param0 <= 19) {
            field_e = null;
        }
        return this.a(14, param1 - -var5.y, 8128, (Object) null, var5.x + param2);
    }

    private final wu a(String param0, boolean param1, int param2, int param3) {
        return this.a(1, 0, 8128, (Object) (Object) param0, param3);
    }

    final wu b(boolean param0) {
        if (!param0) {
            return null;
        }
        return this.a(5, 0, 8128, (Object) null, 0);
    }

    final wu a(int param0, java.awt.Component param1, boolean param2) {
        if (param0 > -116) {
            return null;
        }
        return this.a(15, 0, 8128, (Object) (Object) param1, !param2 ? 0 : 1);
    }

    final boolean b(int param0) {
        if (!(((bu) this).field_l)) {
            return false;
        }
        int var2 = -103 % ((param0 - 46) / 34);
        if (((bu) this).field_f) {
            return ((bu) this).field_k != null ? true : false;
        }
        return ((bu) this).field_i != null ? true : false;
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            lw var3_ref = null;
            Exception var3_ref2 = null;
            ao var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            wu var8_ref = null;
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
            int stackIn_70_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_69_0 = 0;
            int stackOut_68_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  ((Object) (Object) var8_ref).notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (((bu) this).field_m) {
                      return;
                    } else {
                      if (null == ((bu) this).field_o) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((bu) this).field_o;
                          ((bu) this).field_o = ((bu) this).field_o.field_f;
                          if (((bu) this).field_o != null) {
                            break L6;
                          } else {
                            ((bu) this).field_p = null;
                            break L6;
                          }
                        }
                        break L2;
                      }
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_c;
                    if (var2_int == 1) {
                      if (nj.a(-119) < field_w) {
                        throw new IOException();
                      } else {
                        var8_ref.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_g), var8_ref.field_d);
                        break L8;
                      }
                    } else {
                      if (var2_int != 22) {
                        if (var2_int != 2) {
                          if (4 != var2_int) {
                            if (var2_int != 8) {
                              if (var2_int == 9) {
                                L9: {
                                  var18 = (Object[]) var8_ref.field_g;
                                  if (((bu) this).field_l) {
                                    if (null != ((Class) var18[0]).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8_ref.field_b = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (!((bu) this).field_l) {
                                      throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (~nj.a(-68) <= ~field_w) {
                                          var17 = (255 & var8_ref.field_d >> 24) + "." + ((16767672 & var8_ref.field_d) >> 16) + "." + ((65454 & var8_ref.field_d) >> 8) + "." + (var8_ref.field_d & 255);
                                          var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if (var2_int != 5) {
                                            if (var2_int != 6) {
                                              if (var2_int != 7) {
                                                if (12 == var2_int) {
                                                  var3_ref3 = bu.a(-127, field_d, field_e, (String) var8_ref.field_g);
                                                  var8_ref.field_b = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (13 != var2_int) {
                                                    L10: {
                                                      if (!((bu) this).field_l) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L10;
                                                        } else {
                                                          var3_int = var8_ref.field_d;
                                                          var4_int = var8_ref.field_e;
                                                          if (!((bu) this).field_f) {
                                                            Object discarded$7 = Class.forName("fl").getDeclaredMethod("movemouse", new Class[2]).invoke(((bu) this).field_g, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((bu) this).field_n.a(var4_int, (byte) -40, var3_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((bu) this).field_l) {
                                                        break L11;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (var8_ref.field_d == 0) {
                                                              stackOut_69_0 = 0;
                                                              stackIn_70_0 = stackOut_69_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_68_0 = 1;
                                                              stackIn_70_0 = stackOut_68_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_70_0;
                                                          var14 = (java.awt.Component) var8_ref.field_g;
                                                          if (!((bu) this).field_f) {
                                                            Object discarded$8 = Class.forName("fl").getDeclaredMethod("showcursor", new Class[2]).invoke(((bu) this).field_g, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((bu) this).field_n.a(var14, var3_int != 0, -106);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((bu) this).field_f) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var16 = (Object[]) var8_ref.field_g;
                                                          Object discarded$9 = Class.forName("fl").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((bu) this).field_g, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_h.startsWith("win")) {
                                                            L15: {
                                                              var15 = (String) var8_ref.field_g;
                                                              if (var15.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var15.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw bu.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (~var15.length() >= ~var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 != var4_ref.indexOf((int) var15.charAt(var5))) {
                                                                  var5++;
                                                                  continue L16;
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
                                                        var8_ref.field_b = (Object) (Object) var3_ref2;
                                                        throw bu.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = bu.a(-112, field_d, "", (String) var8_ref.field_g);
                                                    var8_ref.field_b = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                if (!((bu) this).field_f) {
                                                  Object discarded$11 = Class.forName("fe").getMethod("exit", new Class[0]).invoke(((bu) this).field_i, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((bu) this).field_k.a(0, (java.awt.Frame) var8_ref.field_g);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = (Object) (Object) var13;
                                              var13.setResizable(false);
                                              if (((bu) this).field_f) {
                                                ((bu) this).field_k.a(var8_ref.field_d >>> 16, 65535 & var8_ref.field_e, var8_ref.field_d & 65535, var13, var8_ref.field_e >> 16, -2147483648);
                                                break L8;
                                              } else {
                                                Object discarded$12 = Class.forName("fe").getMethod("enter", new Class[5]).invoke(((bu) this).field_i, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (((bu) this).field_f) {
                                              var8_ref.field_b = (Object) (Object) ((bu) this).field_k.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_b = Class.forName("fe").getMethod("listmodes", new Class[0]).invoke(((bu) this).field_i, new Object[0]);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (~field_w >= ~nj.a(-52)) {
                                            var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_g).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_g;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var8_ref.field_g;
                                if (!((bu) this).field_l) {
                                  break L17;
                                } else {
                                  if (null != ((Class) var10[0]).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_b = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          } else {
                            if (field_w <= nj.a(43)) {
                              var8_ref.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_g).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_g);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_d);
                          var8_ref.field_b = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (field_w > nj.a(35)) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              int discarded$13 = -13067;
                              var8_ref.field_b = (Object) (Object) ql.a((String) var8_ref.field_g, var8_ref.field_d).a(1);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (lw) (Object) decompiledCaughtException;
                            var8_ref.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    }
                  }
                  var8_ref.field_a = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_a = 2;
                  break L19;
                }
              }
              var2 = (Object) (Object) var8_ref;
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
            ((bu) this).field_g = null;
        }
        return this.a(19, 0, 8128, (Object) (Object) param1, 0);
    }

    final wu a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            return null;
        }
        return this.a(6, param1 + (param4 << 16), 8128, (Object) null, (param3 << 16) - -param0);
    }

    final wu a(int param0) {
        if (param0 != 15) {
            return null;
        }
        return this.a(18, 0, 8128, (Object) null, 0);
    }

    final void a(boolean param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (!param0) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L1;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L1;
                  }
                }
                ((bu) this).field_m = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((bu) this).field_s.join();
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null == ((bu) this).field_c) {
                break L4;
              } else {
                {
                  L5: {
                    ((bu) this).field_c.a(-101);
                    break L5;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null != ((bu) this).field_j) {
                {
                  L8: {
                    ((bu) this).field_j.a(-118);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null != ((bu) this).field_v) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((bu) this).field_v.length) {
                    break L10;
                  } else {
                    if (((bu) this).field_v[var2_int] != null) {
                      {
                        L12: {
                          ((bu) this).field_v[var2_int].a(-123);
                          var2_int++;
                          break L12;
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
              if (null != ((bu) this).field_q) {
                {
                  L15: {
                    ((bu) this).field_q.a(-106);
                    break L15;
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
            Object var4 = null;
            ao discarded$0 = bu.a(92, -82, (String) null, (String) null);
        }
        return this.a(4, 0, 8128, (Object) (Object) param0, 0);
    }

    final wu a(byte param0, java.awt.Frame param1) {
        if (param0 >= -36) {
            Object var4 = null;
            ao discarded$0 = bu.a(-21, 74, (String) null, (String) null);
        }
        return this.a(7, 0, 8128, (Object) (Object) param1, 0);
    }

    final wu a(int param0, byte param1, Runnable param2) {
        if (param1 < 109) {
            ((bu) this).field_g = null;
        }
        return this.a(2, 0, 8128, (Object) (Object) param2, param0);
    }

    private final wu a(int param0, int param1, int param2, Object param3, int param4) {
        wu var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new wu();
        var6.field_e = param1;
        var6.field_d = param4;
        var6.field_g = param3;
        var6.field_c = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null != ((bu) this).field_p) {
                ((bu) this).field_p.field_f = var6;
                ((bu) this).field_p = var6;
                break L1;
              } else {
                ((bu) this).field_o = var6;
                ((bu) this).field_p = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    bu(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        gh var7 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((bu) this).field_l = false;
          ((bu) this).field_m = false;
          ((bu) this).field_j = null;
          ((bu) this).field_c = null;
          ((bu) this).field_f = false;
          ((bu) this).field_p = null;
          ((bu) this).field_o = null;
          ((bu) this).field_q = null;
          field_u = "Unknown";
          field_r = "1.1";
          field_e = param1;
          field_d = param0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((bu) this).field_l = stackIn_3_1 != 0;
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
            field_r = System.getProperty("java.version");
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
            ((bu) this).field_f = true;
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
            var5 = (Exception) (Object) decompiledCaughtException;
            field_t = "Unknown";
            break L5;
          }
        }
        field_h = field_t.toLowerCase();
        try {
          L6: {
            String discarded$4 = System.getProperty("os.arch").toLowerCase();
            break L6;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L7;
          }
        }
        try {
          L8: {
            String discarded$5 = System.getProperty("os.version").toLowerCase();
            break L8;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L9: {
            var5 = (Exception) (Object) decompiledCaughtException;
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
            var5 = (Exception) (Object) decompiledCaughtException;
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
            ((bu) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L14;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L15: {
            var5_ref = decompiledCaughtException;
            break L15;
          }
        }
        L16: {
          if (((bu) this).field_f) {
            break L16;
          } else {
            try {
              L17: {
                java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                break L17;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L18: {
                var5 = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            try {
              L19: {
                field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                break L19;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L20: {
                var5 = (Exception) (Object) decompiledCaughtException;
                break L20;
              }
            }
            break L16;
          }
        }
        L21: {
          bj.a(field_e, (byte) -99, field_d);
          if (!((bu) this).field_l) {
            break L21;
          } else {
            ((bu) this).field_q = new ao(bj.a("random.dat", (String) null, field_d, false), "rw", 25L);
            ((bu) this).field_c = new ao(bj.a("main_file_cache.dat2", 0), "rw", 314572800L);
            ((bu) this).field_j = new ao(bj.a("main_file_cache.idx255", 0), "rw", 1048576L);
            ((bu) this).field_v = new ao[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((bu) this).field_f) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("mw").newInstance();
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L25: {
                        var5_ref = decompiledCaughtException;
                        break L25;
                      }
                    }
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (!((bu) this).field_f) {
                        ((bu) this).field_i = Class.forName("fe").newInstance();
                        break L27;
                      } else {
                        var7 = new gh();
                        ((bu) this).field_k = var7;
                        break L27;
                      }
                    }
                    break L26;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L28: {
                    var5_ref = decompiledCaughtException;
                    break L28;
                  }
                }
                try {
                  L29: {
                    L30: {
                      if (((bu) this).field_f) {
                        ((bu) this).field_n = new wg();
                        break L30;
                      } else {
                        ((bu) this).field_g = Class.forName("fl").newInstance();
                        break L30;
                      }
                    }
                    break L29;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L31: {
                    var5_ref = decompiledCaughtException;
                    break L31;
                  }
                }
                break L21;
              } else {
                ((bu) this).field_v[var5_int] = new ao(bj.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((bu) this).field_m = false;
        ((bu) this).field_s = new Thread((Runnable) this);
        ((bu) this).field_s.setPriority(10);
        ((bu) this).field_s.setDaemon(true);
        ((bu) this).field_s.start();
    }

    private final static ao a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ao var8_ref = null;
            ao stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ao stackOut_14_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if (param1 != 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_b, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 <= -95) {
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7 = var5_array[var6];
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
                      var8_ref = new ao(new File(var7, var4), "rw", 10000L);
                      stackOut_14_0 = (ao) var8_ref;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 0;
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var8 = (Exception) (Object) decompiledCaughtException;
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
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wu a(boolean param0, String param1, int param2) {
        if (!param0) {
            field_h = null;
        }
        return this.a(param1, false, -8, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
