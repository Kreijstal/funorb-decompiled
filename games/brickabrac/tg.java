/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Runnable {
    static String field_b;
    private static String field_h;
    private boolean field_r;
    java.awt.EventQueue field_p;
    private io field_u;
    private Thread field_j;
    rn field_k;
    private static String field_e;
    boolean field_i;
    private static volatile long field_f;
    private static int field_c;
    private ql field_d;
    private Object field_a;
    private ql field_v;
    private boolean field_l;
    rn[] field_s;
    static String field_g;
    rn field_m;
    rn field_q;
    private static String field_t;
    private Object field_n;
    static java.lang.reflect.Method field_x;
    static String field_o;
    private in field_w;

    private final ql a(String param0, int param1, boolean param2, int param3) {
        return this.a(true, 0, (Object) (Object) param0, 1, param1);
    }

    final ql a(int param0, Runnable param1, byte param2) {
        if (param2 >= -68) {
            Object var5 = null;
            ql discarded$0 = ((tg) this).a(-7, (Class) null, (Class[]) null, (String) null);
        }
        return this.a(true, 0, (Object) (Object) param1, 2, param0);
    }

    final boolean b(int param0) {
        int var2 = -94 / ((param0 - 4) / 42);
        if (!((tg) this).field_i) {
            return false;
        }
        if (!((tg) this).field_r) {
            return ((tg) this).field_a != null ? true : false;
        }
        return null != ((tg) this).field_u ? true : false;
    }

    final ql a(byte param0, java.net.URL param1) {
        int var3 = 36 / ((param0 - 3) / 40);
        return this.a(true, 0, (Object) (Object) param1, 4, 0);
    }

    final ql a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -35) {
            ql discarded$0 = ((tg) this).a(125, -72, 117, -42, -13);
        }
        return this.a(true, param0 + (param3 << 16), (Object) null, 6, (param4 << 16) + param2);
    }

    final ql a(String param0, byte param1, int param2) {
        if (param1 != 120) {
            Object var5 = null;
            ql discarded$0 = this.a(false, -76, (Object) null, 124, 36);
        }
        return this.a(param0, param2, false, -31592);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ef var3_ref = null;
            Exception var3_ref2 = null;
            rn var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            ql var8_ref = null;
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
            int stackIn_67_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_66_0 = 0;
            int stackOut_65_0 = 0;
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
                    if (((tg) this).field_l) {
                      return;
                    } else {
                      if (((tg) this).field_v == null) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((tg) this).field_v;
                          ((tg) this).field_v = ((tg) this).field_v.field_a;
                          if (null != ((tg) this).field_v) {
                            break L6;
                          } else {
                            ((tg) this).field_d = null;
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
                    var2_int = var8_ref.field_d;
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_b);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_e = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int == 4) {
                            if (~ue.a(false) > ~field_f) {
                              throw new IOException();
                            } else {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_b).openStream());
                              break L8;
                            }
                          } else {
                            if (var2_int == 8) {
                              L9: {
                                var17 = (Object[]) var8_ref.field_b;
                                if (!((tg) this).field_i) {
                                  break L9;
                                } else {
                                  if (((Class) var17[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var16 = (Object[]) var8_ref.field_b;
                                  if (!((tg) this).field_i) {
                                    break L10;
                                  } else {
                                    if (null != ((Class) var16[0]).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_e = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = (Object) (Object) var15.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_b;
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((tg) this).field_i) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int != 5) {
                                            if (6 != var2_int) {
                                              if (var2_int != 7) {
                                                if (12 != var2_int) {
                                                  if (var2_int != 13) {
                                                    L11: {
                                                      if (!((tg) this).field_i) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_g;
                                                          var4_int = var8_ref.field_c;
                                                          if (((tg) this).field_r) {
                                                            ((tg) this).field_w.a(var4_int, -4, var3_int);
                                                            break L8;
                                                          } else {
                                                            Object discarded$6 = Class.forName("dd").getDeclaredMethod("movemouse", new Class[2]).invoke(((tg) this).field_n, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((tg) this).field_i) {
                                                        break L12;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_66_0 = 0;
                                                              stackIn_67_0 = stackOut_66_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_65_0 = 1;
                                                              stackIn_67_0 = stackOut_65_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_67_0;
                                                          var11 = (java.awt.Component) var8_ref.field_b;
                                                          if (!((tg) this).field_r) {
                                                            Object discarded$7 = Class.forName("dd").getDeclaredMethod("showcursor", new Class[2]).invoke(((tg) this).field_n, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((tg) this).field_w.a(var11, 0, var3_int != 0);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((tg) this).field_r) {
                                                        break L14;
                                                      } else {
                                                        if (17 != var2_int) {
                                                          break L14;
                                                        } else {
                                                          var12 = (Object[]) var8_ref.field_b;
                                                          Object discarded$8 = Class.forName("dd").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((tg) this).field_n, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_b.startsWith("win")) {
                                                            L16: {
                                                              var13 = (String) var8_ref.field_b;
                                                              if (var13.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 == var4_ref.indexOf((int) var13.charAt(var5))) {
                                                                  throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref2;
                                                        throw tg.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = tg.a((String) var8_ref.field_b, field_c, "", (byte) -89);
                                                    var8_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = tg.a((String) var8_ref.field_b, field_c, field_t, (byte) -70);
                                                  var8_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (((tg) this).field_r) {
                                                  ((tg) this).field_u.a(-3887, (java.awt.Frame) var8_ref.field_b);
                                                  break L8;
                                                } else {
                                                  Object discarded$10 = Class.forName("db").getMethod("exit", new Class[0]).invoke(((tg) this).field_a, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var10 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var10;
                                              var10.setResizable(false);
                                              if (((tg) this).field_r) {
                                                ((tg) this).field_u.a(var10, 65535 & var8_ref.field_g, var8_ref.field_g >>> 16, 0, var8_ref.field_c & 65535, var8_ref.field_c >> 16);
                                                break L8;
                                              } else {
                                                Object discarded$11 = Class.forName("db").getMethod("enter", new Class[5]).invoke(((tg) this).field_a, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!((tg) this).field_r) {
                                              var8_ref.field_e = Class.forName("db").getMethod("listmodes", new Class[0]).invoke(((tg) this).field_a, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = (Object) (Object) ((tg) this).field_u.a((byte) -48);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (ue.a(false) >= field_f) {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_b).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (ue.a(false) >= field_f) {
                                          var9 = (255 & var8_ref.field_g >> 24) + "." + (var8_ref.field_g >> 16 & 255) + "." + ((65391 & var8_ref.field_g) >> 8) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (field_f <= ue.a(false)) {
                          try {
                            L18: {
                              var8_ref.field_e = (Object) (Object) nd.a(60, var8_ref.field_g, (String) var8_ref.field_b).a(0);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (ef) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if (~ue.a(false) <= ~field_f) {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_b), var8_ref.field_g);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_f = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_f = 2;
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

    final ql a(int param0) {
        if (param0 != 0) {
            ql discarded$0 = ((tg) this).a(79);
        }
        return this.a(true, 0, (Object) null, 5, 0);
    }

    final ql a(int param0, Class param1, String param2) {
        int var4 = 121 / ((param0 - 7) / 36);
        return this.a(true, 0, (Object) (Object) new Object[2], 9, 0);
    }

    private final static rn a(String param0, int param1, String param2, byte param3) {
        try {
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            rn var8_ref = null;
            Object var9 = null;
            rn stackIn_11_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            rn stackOut_10_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_e, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5.length) {
                if (param3 >= -61) {
                  var9 = null;
                  rn discarded$1 = tg.a((String) null, 48, (String) null, (byte) -119);
                  return null;
                } else {
                  return null;
                }
              } else {
                L2: {
                  L3: {
                    var7 = var5[var6];
                    if (var7.length() <= 0) {
                      break L3;
                    } else {
                      if (!new File(var7).exists()) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L4: {
                      var8_ref = new rn(new File(var7, var4), "rw", 10000L);
                      stackOut_10_0 = (rn) var8_ref;
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var8 = (Exception) (Object) decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_11_0;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
                ((tg) this).field_l = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((tg) this).field_j.join();
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
              if (((tg) this).field_q != null) {
                {
                  L5: {
                    ((tg) this).field_q.c(83);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (((tg) this).field_m != null) {
                {
                  L8: {
                    ((tg) this).field_m.c(-119);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((tg) this).field_s != null) {
                var2_int = 0;
                L11: while (true) {
                  if (((tg) this).field_s.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != ((tg) this).field_s[var2_int]) {
                      {
                        L12: {
                          ((tg) this).field_s[var2_int].c(56);
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
              if (null != ((tg) this).field_k) {
                {
                  L15: {
                    ((tg) this).field_k.c(108);
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

    final ql a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 23311) {
            return null;
        }
        return this.a(true, 0, (Object) (Object) new Object[3], 8, 0);
    }

    final ql a(int param0, java.awt.Frame param1) {
        int var3 = -2 / ((param0 - 54) / 37);
        return this.a(true, 0, (Object) (Object) param1, 7, 0);
    }

    private final ql a(boolean param0, int param1, Object param2, int param3, int param4) {
        ql var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new ql();
          var6.field_g = param4;
          var6.field_b = param2;
          if (param0) {
            break L0;
          } else {
            var9 = null;
            ql discarded$3 = ((tg) this).a((String) null, (byte) -43, 124);
            break L0;
          }
        }
        var6.field_c = param1;
        var6.field_d = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != ((tg) this).field_d) {
                ((tg) this).field_d.field_a = var6;
                ((tg) this).field_d = var6;
                break L2;
              } else {
                ((tg) this).field_v = var6;
                ((tg) this).field_d = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    tg(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        io var7 = null;
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
          ((tg) this).field_k = null;
          ((tg) this).field_v = null;
          ((tg) this).field_d = null;
          ((tg) this).field_r = false;
          ((tg) this).field_m = null;
          ((tg) this).field_i = false;
          ((tg) this).field_q = null;
          ((tg) this).field_l = false;
          field_o = "1.1";
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
        ((tg) this).field_i = stackIn_3_1 != 0;
        field_t = param1;
        field_g = "Unknown";
        field_c = param0;
        try {
          L1: {
            field_g = System.getProperty("java.vendor");
            field_o = System.getProperty("java.version");
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
          if (-1 == field_g.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((tg) this).field_r = true;
            break L3;
          }
        }
        try {
          L4: {
            field_h = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_h = "Unknown";
            break L5;
          }
        }
        field_b = field_h.toLowerCase();
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
              field_e = System.getProperty("user.home");
              if (null == field_e) {
                break L11;
              } else {
                field_e = field_e + "/";
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
          if (null != field_e) {
            break L13;
          } else {
            field_e = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((tg) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((tg) this).field_r) {
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
          } else {
            break L16;
          }
        }
        L21: {
          gl.a(98, field_c, field_t);
          if (!((tg) this).field_i) {
            break L21;
          } else {
            ((tg) this).field_k = new rn(gl.a(-1, "random.dat", (String) null, field_c), "rw", 25L);
            ((tg) this).field_q = new rn(gl.a("main_file_cache.dat2", -1), "rw", 314572800L);
            ((tg) this).field_m = new rn(gl.a("main_file_cache.idx255", -1), "rw", 1048576L);
            ((tg) this).field_s = new rn[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((tg) this).field_r) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("iq").newInstance();
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
                  } else {
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (((tg) this).field_r) {
                        var7 = new io();
                        ((tg) this).field_u = var7;
                        break L27;
                      } else {
                        ((tg) this).field_a = Class.forName("db").newInstance();
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
                      if (!((tg) this).field_r) {
                        ((tg) this).field_n = Class.forName("dd").newInstance();
                        break L30;
                      } else {
                        ((tg) this).field_w = new in();
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
                ((tg) this).field_s[var5_int] = new rn(gl.a("main_file_cache.idx" + var5_int, -1), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((tg) this).field_l = false;
        ((tg) this).field_j = new Thread((Runnable) this);
        ((tg) this).field_j.setPriority(10);
        ((tg) this).field_j.setDaemon(true);
        ((tg) this).field_j.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
