/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    ra[] field_p;
    private static int field_h;
    java.awt.EventQueue field_q;
    private Object field_t;
    static String field_r;
    ra field_a;
    static String field_b;
    boolean field_w;
    ra field_n;
    private Object field_o;
    ra field_k;
    private static String field_x;
    private fn field_c;
    private static volatile long field_u;
    private Thread field_j;
    static java.lang.reflect.Method field_v;
    private pb field_l;
    static String field_i;
    private boolean field_g;
    private static String field_s;
    private boolean field_e;
    private pb field_f;
    private pp field_m;
    private static String field_d;

    private final pb a(int param0, boolean param1, String param2, int param3) {
        if (param3 > -96) {
            return null;
        }
        return this.a(param0, !param1 ? 1 : 22, (Object) (Object) param2, (byte) -120, 0);
    }

    final pb a(Class[] param0, String param1, int param2, Class param3) {
        if (param2 < 72) {
            field_d = null;
        }
        return this.a(0, 8, (Object) (Object) new Object[3], (byte) -122, 0);
    }

    final pb a(boolean param0, int param1, Runnable param2) {
        if (!param0) {
            return null;
        }
        return this.a(param1, 2, (Object) (Object) param2, (byte) -100, 0);
    }

    final pb a(int param0, int param1, String param2) {
        if (param0 != 65535) {
            ((qb) this).field_e = true;
        }
        return this.a(param1, false, param2, param0 ^ -65434);
    }

    final pb a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -1194) {
            ((qb) this).field_k = null;
        }
        return this.a(param1 + (param2 << 16), 6, (Object) null, (byte) 47, (param3 << 16) + param0);
    }

    final boolean a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ra discarded$0 = qb.a((String) null, -128, (String) null, true);
        }
        if (!(((qb) this).field_w)) {
            return false;
        }
        if (((qb) this).field_g) {
            return ((qb) this).field_c != null ? true : false;
        }
        return null != ((qb) this).field_t ? true : false;
    }

    final pb a(java.net.URL param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            pb discarded$0 = this.a(-90, true, (String) null, -75);
        }
        return this.a(0, 4, (Object) (Object) param0, (byte) 92, 0);
    }

    private final pb a(int param0, int param1, Object param2, byte param3, int param4) {
        pb var6 = null;
        Object var7 = null;
        int var8 = 0;
        Throwable var9 = null;
        Throwable decompiledCaughtException = null;
        var6 = new pb();
        var6.field_a = param4;
        var6.field_b = param2;
        var6.field_c = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (((qb) this).field_f != null) {
                ((qb) this).field_f.field_f = var6;
                ((qb) this).field_f = var6;
                break L1;
              } else {
                ((qb) this).field_l = var6;
                ((qb) this).field_f = var6;
                break L1;
              }
            }
            this.notify();
            var8 = 14 / ((param3 - -38) / 62);
            break L0;
          }
        }
        return var6;
    }

    private final static ra a(String param0, int param1, String param2, boolean param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ra var8_ref = null;
            ra stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ra stackOut_11_0 = null;
            L0: {
              if (param1 != 33) {
                if (param1 != 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 < var5_array.length) {
                L2: {
                  var7 = var5_array[var6];
                  if (var7.length() <= 0) {
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
                    var8_ref = new ra(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (ra) var8_ref;
                    stackIn_12_0 = stackOut_11_0;
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
                  return stackIn_12_0;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            lg var3_ref2 = null;
            ra var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            pb var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_82_0 = 0;
            int stackOut_81_0 = 0;
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
                    if (((qb) this).field_e) {
                      return;
                    } else {
                      if (((qb) this).field_l != null) {
                        L4: {
                          var8_ref = ((qb) this).field_l;
                          ((qb) this).field_l = ((qb) this).field_l.field_f;
                          if (((qb) this).field_l == null) {
                            ((qb) this).field_f = null;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        {
                          L5: {
                            this.wait();
                            break L5;
                          }
                        }
                        continue L3;
                      }
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_c;
                    if (1 != var2_int) {
                      if (var2_int == 22) {
                        if (field_u > pr.a(14274)) {
                          throw new IOException();
                        } else {
                          try {
                            L9: {
                              var8_ref.field_e = (Object) (Object) ho.a(var8_ref.field_g, -4276, (String) var8_ref.field_b).b(-10463);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (lg) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (var2_int != 2) {
                          if (var2_int != 4) {
                            if (var2_int == 8) {
                              L10: {
                                var18 = (Object[]) var8_ref.field_b;
                                if (((qb) this).field_w) {
                                  if (null == ((Class) var18[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                              break L8;
                            } else {
                              if (9 != var2_int) {
                                if (var2_int == 18) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = (Object) (Object) var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_b;
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((qb) this).field_w) {
                                      throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (pr.a(14274) < field_u) {
                                          throw new IOException();
                                        } else {
                                          var15 = (255 & var8_ref.field_g >> 24) + "." + ((16756253 & var8_ref.field_g) >> 16) + "." + ((var8_ref.field_g & 65287) >> 8) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (!((qb) this).field_g) {
                                              var8_ref.field_e = Class.forName("ic").getMethod("listmodes", new Class[0]).invoke(((qb) this).field_t, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = (Object) (Object) ((qb) this).field_c.a(-19750);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((qb) this).field_g) {
                                                Object discarded$6 = Class.forName("ic").getMethod("enter", new Class[5]).invoke(((qb) this).field_t, new Object[5]);
                                                break L8;
                                              } else {
                                                ((qb) this).field_c.a(var14, 65535 & var8_ref.field_a, var8_ref.field_g >>> 16, 65535 & var8_ref.field_g, var8_ref.field_a >> 16, 0);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int == 7) {
                                                if (((qb) this).field_g) {
                                                  ((qb) this).field_c.a(0, (java.awt.Frame) var8_ref.field_b);
                                                  break L8;
                                                } else {
                                                  Object discarded$7 = Class.forName("ic").getMethod("exit", new Class[0]).invoke(((qb) this).field_t, new Object[0]);
                                                  break L8;
                                                }
                                              } else {
                                                if (12 != var2_int) {
                                                  if (var2_int != 13) {
                                                    L11: {
                                                      if (!((qb) this).field_w) {
                                                        break L11;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8_ref.field_g;
                                                          var4 = var8_ref.field_a;
                                                          if (((qb) this).field_g) {
                                                            ((qb) this).field_m.a(var3_int, -4, var4);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("lj").getDeclaredMethod("movemouse", new Class[2]).invoke(((qb) this).field_o, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((qb) this).field_w) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L13: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_82_0 = 0;
                                                              stackIn_83_0 = stackOut_82_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_81_0 = 1;
                                                              stackIn_83_0 = stackOut_81_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_83_0;
                                                          var13 = (java.awt.Component) var8_ref.field_b;
                                                          if (!((qb) this).field_g) {
                                                            Object discarded$9 = Class.forName("lj").getDeclaredMethod("showcursor", new Class[2]).invoke(((qb) this).field_o, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((qb) this).field_m.a(var3_int != 0, var13, 0);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((qb) this).field_g) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var12 = (Object[]) var8_ref.field_b;
                                                          Object discarded$10 = Class.forName("lj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((qb) this).field_o, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (!field_b.startsWith("win")) {
                                                            throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var11 = (String) var8_ref.field_b;
                                                              if (var11.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var11.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                                                  throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref;
                                                        throw qb.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = qb.a((String) var8_ref.field_b, field_h, "", true);
                                                    var8_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = qb.a((String) var8_ref.field_b, field_h, field_s, true);
                                                  var8_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (~pr.a(14274) <= ~field_u) {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_b).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L18: {
                                  var10 = (Object[]) var8_ref.field_b;
                                  if (((qb) this).field_w) {
                                    if (null != ((Class) var10[0]).getClassLoader()) {
                                      break L18;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                var8_ref.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                                break L8;
                              }
                            }
                          } else {
                            if (~field_u < ~pr.a(14274)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_b).openStream());
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_b);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_g);
                          var8_ref.field_e = (Object) (Object) var9;
                          break L8;
                        }
                      }
                    } else {
                      if (pr.a(14274) < field_u) {
                        throw new IOException();
                      } else {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_b), var8_ref.field_g);
                        break L8;
                      }
                    }
                  }
                  var8_ref.field_d = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_d = 2;
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

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                ((qb) this).field_e = true;
                this.notifyAll();
                break L0;
              }
            }
            if (param0 >= 55) {
              try {
                L1: {
                  ((qb) this).field_j.join();
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                  break L2;
                }
              }
              L3: {
                if (null != ((qb) this).field_k) {
                  {
                    L4: {
                      ((qb) this).field_k.c(10);
                      break L4;
                    }
                  }
                  break L3;
                } else {
                  break L3;
                }
              }
              L6: {
                if (((qb) this).field_n == null) {
                  break L6;
                } else {
                  {
                    L7: {
                      ((qb) this).field_n.c(10);
                      break L7;
                    }
                  }
                  break L6;
                }
              }
              L9: {
                if (null != ((qb) this).field_p) {
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= ((qb) this).field_p.length) {
                      break L9;
                    } else {
                      if (((qb) this).field_p[var2_int] != null) {
                        {
                          L11: {
                            ((qb) this).field_p[var2_int].c(10);
                            var2_int++;
                            break L11;
                          }
                        }
                        continue L10;
                      } else {
                        var2_int++;
                        continue L10;
                      }
                    }
                  }
                } else {
                  break L9;
                }
              }
              L13: {
                if (null != ((qb) this).field_a) {
                  {
                    L14: {
                      ((qb) this).field_a.c(10);
                      break L14;
                    }
                  }
                  break L13;
                } else {
                  break L13;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final pb a(java.awt.Frame param0, byte param1) {
        if (param1 <= 119) {
            ((qb) this).field_k = null;
        }
        return this.a(0, 7, (Object) (Object) param0, (byte) 55, 0);
    }

    final pb a(int param0) {
        if (param0 != 12) {
            return null;
        }
        return this.a(0, 5, (Object) null, (byte) -110, 0);
    }

    final pb a(Class param0, byte param1, String param2) {
        if (param1 <= 24) {
            boolean discarded$0 = ((qb) this).a(false);
        }
        return this.a(0, 9, (Object) (Object) new Object[2], (byte) -110, 0);
    }

    qb(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        fn var7 = null;
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
          ((qb) this).field_w = false;
          ((qb) this).field_n = null;
          ((qb) this).field_k = null;
          ((qb) this).field_a = null;
          ((qb) this).field_l = null;
          ((qb) this).field_e = false;
          ((qb) this).field_g = false;
          ((qb) this).field_f = null;
          field_r = "Unknown";
          field_s = param1;
          field_h = param0;
          field_i = "1.1";
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
        ((qb) this).field_w = stackIn_3_1 != 0;
        try {
          L1: {
            field_r = System.getProperty("java.vendor");
            field_i = System.getProperty("java.version");
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
          if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
            ((qb) this).field_g = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_x = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_x = "Unknown";
            break L5;
          }
        }
        field_b = field_x.toLowerCase();
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
              field_d = System.getProperty("user.home");
              if (field_d == null) {
                break L11;
              } else {
                field_d = field_d + "/";
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
          if (field_d == null) {
            field_d = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((qb) this).field_q = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((qb) this).field_g) {
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
                field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          ug.a(field_h, field_s, (byte) 116);
          if (!((qb) this).field_w) {
            break L21;
          } else {
            ((qb) this).field_a = new ra(ug.a("random.dat", field_h, -18261, (String) null), "rw", 25L);
            ((qb) this).field_k = new ra(ug.a("main_file_cache.dat2", false), "rw", 314572800L);
            ((qb) this).field_n = new ra(ug.a("main_file_cache.idx255", false), "rw", 1048576L);
            ((qb) this).field_p = new ra[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((qb) this).field_g) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("mo").newInstance();
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
                      if (((qb) this).field_g) {
                        var7 = new fn();
                        ((qb) this).field_c = var7;
                        break L27;
                      } else {
                        ((qb) this).field_t = Class.forName("ic").newInstance();
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
                      if (!((qb) this).field_g) {
                        ((qb) this).field_o = Class.forName("lj").newInstance();
                        break L30;
                      } else {
                        ((qb) this).field_m = new pp();
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
                ((qb) this).field_p[var5_int] = new ra(ug.a("main_file_cache.idx" + var5_int, false), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((qb) this).field_e = false;
        ((qb) this).field_j = new Thread((Runnable) this);
        ((qb) this).field_j.setPriority(10);
        ((qb) this).field_j.setDaemon(true);
        ((qb) this).field_j.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
