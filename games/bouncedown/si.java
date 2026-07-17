/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si implements Runnable {
    private Thread field_q;
    private static volatile long field_h;
    static java.lang.reflect.Method field_w;
    private boolean field_n;
    private cj field_s;
    static String field_d;
    private static String field_b;
    private static String field_c;
    ok field_m;
    static String field_a;
    private boolean field_t;
    private Object field_g;
    private me field_x;
    ok field_v;
    static String field_r;
    ok field_j;
    private static int field_o;
    private mk field_p;
    ok[] field_u;
    private Object field_f;
    private static String field_i;
    boolean field_l;
    java.awt.EventQueue field_e;
    private mk field_k;

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            tk var3_ref_tk = null;
            Exception var3_ref_Exception = null;
            ok var3_ref_ok = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object var9 = null;
            mk var9_ref = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            Object[] var13 = null;
            java.awt.Component var14 = null;
            java.awt.Frame var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_80_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_79_0 = 0;
            int stackOut_78_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  ((Object) (Object) var9_ref).notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (!((si) this).field_n) {
                      if (((si) this).field_p == null) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var9_ref = ((si) this).field_p;
                          ((si) this).field_p = ((si) this).field_p.field_a;
                          if (((si) this).field_p != null) {
                            break L6;
                          } else {
                            ((si) this).field_k = null;
                            break L6;
                          }
                        }
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var9_ref.field_c;
                    if (1 != var2_int) {
                      if (var2_int != 22) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) var9_ref.field_d);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9_ref.field_b);
                          var9_ref.field_e = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int == 4) {
                            if (field_h > fa.a(76)) {
                              throw new IOException();
                            } else {
                              var9_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var9_ref.field_d).openStream());
                              break L8;
                            }
                          } else {
                            if (var2_int == 8) {
                              L9: {
                                var17 = (Object[]) var9_ref.field_d;
                                if (((si) this).field_l) {
                                  if (((Class) var17[0]).getClassLoader() != null) {
                                    break L9;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var9_ref.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (var2_int != 9) {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (!((si) this).field_l) {
                                      throw si.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (fa.a(-20) < field_h) {
                                          throw new IOException();
                                        } else {
                                          var16 = (255 & var9_ref.field_b >> 24) + "." + (var9_ref.field_b >> 16 & 255) + "." + (255 & var9_ref.field_b >> 8) + "." + (255 & var9_ref.field_b);
                                          var9_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (~field_h >= ~fa.a(103)) {
                                            var9_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var9_ref.field_d).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (!((si) this).field_t) {
                                              var9_ref.field_e = Class.forName("hk").getMethod("listmodes", new Class[0]).invoke(((si) this).field_f, new Object[0]);
                                              break L8;
                                            } else {
                                              var9_ref.field_e = (Object) (Object) ((si) this).field_s.a(true);
                                              break L8;
                                            }
                                          } else {
                                            if (6 == var2_int) {
                                              var15 = new java.awt.Frame("Jagex Full Screen");
                                              var9_ref.field_e = (Object) (Object) var15;
                                              var15.setResizable(false);
                                              if (!((si) this).field_t) {
                                                Object discarded$6 = Class.forName("hk").getMethod("enter", new Class[5]).invoke(((si) this).field_f, new Object[5]);
                                                break L8;
                                              } else {
                                                ((si) this).field_s.a(65535 & var9_ref.field_g, false, var9_ref.field_b >>> 16, var15, var9_ref.field_b & 65535, var9_ref.field_g >> 16);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (12 != var2_int) {
                                                  if (var2_int != 13) {
                                                    L10: {
                                                      if (!((si) this).field_l) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3 = var9_ref.field_b;
                                                          var4 = var9_ref.field_g;
                                                          if (!((si) this).field_t) {
                                                            Object discarded$7 = Class.forName("sc").getDeclaredMethod("movemouse", new Class[2]).invoke(((si) this).field_g, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((si) this).field_x.a(var3, -121, var4);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((si) this).field_l) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (var9_ref.field_b == 0) {
                                                              stackOut_79_0 = 0;
                                                              stackIn_80_0 = stackOut_79_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_78_0 = 1;
                                                              stackIn_80_0 = stackOut_78_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3 = stackIn_80_0;
                                                          var14 = (java.awt.Component) var9_ref.field_d;
                                                          if (((si) this).field_t) {
                                                            ((si) this).field_x.a(var3 != 0, var14, 32512);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("sc").getDeclaredMethod("showcursor", new Class[2]).invoke(((si) this).field_g, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((si) this).field_t) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var13 = (Object[]) var9_ref.field_d;
                                                          Object discarded$9 = Class.forName("sc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((si) this).field_g, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw si.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_a.startsWith("win")) {
                                                            throw si.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var8 = (String) var9_ref.field_d;
                                                              if (var8.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var8.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw si.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var8.length() <= var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                                var9_ref.field_e = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var8.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw si.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var9_ref.field_e = (Object) (Object) var3_ref_Exception;
                                                        throw si.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_ok = si.a(field_o, -11227, "", (String) var9_ref.field_d);
                                                    var9_ref.field_e = (Object) (Object) var3_ref_ok;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_ok = si.a(field_o, -11227, field_b, (String) var9_ref.field_d);
                                                  var9_ref.field_e = (Object) (Object) var3_ref_ok;
                                                  break L8;
                                                }
                                              } else {
                                                if (!((si) this).field_t) {
                                                  Object discarded$11 = Class.forName("hk").getMethod("exit", new Class[0]).invoke(((si) this).field_f, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((si) this).field_s.a(89, (java.awt.Frame) var9_ref.field_d);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var9_ref.field_d;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9_ref.field_e = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              } else {
                                L17: {
                                  var10 = (Object[]) var9_ref.field_d;
                                  if (!((si) this).field_l) {
                                    break L17;
                                  } else {
                                    if (null != ((Class) var10[0]).getClassLoader()) {
                                      break L17;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var9_ref.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                                break L8;
                              }
                            }
                          }
                        }
                      } else {
                        if (field_h <= fa.a(-90)) {
                          try {
                            L18: {
                              var9_ref.field_e = (Object) (Object) je.a(var9_ref.field_b, (byte) -121, (String) var9_ref.field_d).b(-19314);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_tk = (tk) (Object) decompiledCaughtException;
                            var9_ref.field_e = (Object) (Object) var3_ref_tk.getMessage();
                            throw var3_ref_tk;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if (~field_h < ~fa.a(110)) {
                        throw new IOException();
                      } else {
                        var9_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9_ref.field_d), var9_ref.field_b);
                        break L8;
                      }
                    }
                  }
                  var9_ref.field_f = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var9_ref.field_f = 2;
                  break L19;
                }
              }
              var2 = (Object) (Object) var9_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final mk a(int param0, Object param1, int param2, int param3, int param4) {
        mk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new mk();
        var6.field_b = param2;
        var6.field_d = param1;
        var6.field_g = param4;
        var6.field_c = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null == ((si) this).field_k) {
                ((si) this).field_p = var6;
                ((si) this).field_k = var6;
                break L1;
              } else {
                ((si) this).field_k.field_a = var6;
                ((si) this).field_k = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final mk a(String param0, int param1, int param2) {
        if (param2 != 0) {
            mk discarded$0 = ((si) this).c((byte) -24);
        }
        return this.a(false, param1, 1689798128, param0);
    }

    final mk a(int param0, byte param1, Runnable param2) {
        int var4 = -82 % ((-47 - param1) / 53);
        return this.a(2, (Object) (Object) param2, param0, -20766, 0);
    }

    final mk c(byte param0) {
        if (param0 != 5) {
            return null;
        }
        return this.a(5, (Object) null, 0, -20766, 0);
    }

    private final static ok a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ok var8_ref = null;
            ok stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ok stackOut_11_0 = null;
            L0: {
              if (param0 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if (param0 != 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                    var8_ref = new ok(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (ok) var8_ref;
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

    final mk a(String param0, Class param1, int param2, Class[] param3) {
        if (param2 != 8532) {
            ((si) this).field_x = null;
        }
        return this.a(8, (Object) (Object) new Object[3], 0, -20766, 0);
    }

    final mk a(java.awt.Frame param0, byte param1) {
        if (param1 != 4) {
            return null;
        }
        return this.a(7, (Object) (Object) param0, 0, -20766, 0);
    }

    final mk a(java.net.URL param0, boolean param1) {
        if (param1) {
            return null;
        }
        return this.a(4, (Object) (Object) param0, 0, -20766, 0);
    }

    private final mk a(boolean param0, int param1, int param2, String param3) {
        return this.a(1, (Object) (Object) param3, param1, -20766, 0);
    }

    final mk a(String param0, Class param1, byte param2) {
        if (param2 != 48) {
            field_r = null;
        }
        return this.a(9, (Object) (Object) new Object[2], 0, -20766, 0);
    }

    final void b(byte param0) {
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
                L1: {
                  if (param0 > 83) {
                    break L1;
                  } else {
                    ((si) this).field_m = null;
                    break L1;
                  }
                }
                ((si) this).field_n = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((si) this).field_q.join();
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
              if (null != ((si) this).field_j) {
                {
                  L5: {
                    ((si) this).field_j.b(1337);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (((si) this).field_m != null) {
                {
                  L8: {
                    ((si) this).field_m.b(1337);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((si) this).field_u != null) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((si) this).field_u.length) {
                    break L10;
                  } else {
                    if (null != ((si) this).field_u[var2_int]) {
                      {
                        L12: {
                          ((si) this).field_u[var2_int].b(1337);
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
              if (((si) this).field_v != null) {
                {
                  L15: {
                    ((si) this).field_v.b(1337);
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

    final mk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 314572800) {
            ((si) this).field_k = null;
        }
        return this.a(6, (Object) null, (param1 << 16) + param3, -20766, param2 + (param0 << 16));
    }

    final boolean a(byte param0) {
        if (param0 != 53) {
            ((si) this).field_g = null;
        }
        if (!(((si) this).field_l)) {
            return false;
        }
        if (!((si) this).field_t) {
            return null != ((si) this).field_f ? true : false;
        }
        return null != ((si) this).field_s ? true : false;
    }

    si(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        cj var6 = null;
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
          ((si) this).field_t = false;
          ((si) this).field_p = null;
          ((si) this).field_n = false;
          ((si) this).field_j = null;
          ((si) this).field_m = null;
          ((si) this).field_l = false;
          ((si) this).field_k = null;
          ((si) this).field_v = null;
          field_o = param0;
          field_b = param1;
          field_d = "1.1";
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
        ((si) this).field_l = stackIn_3_1 != 0;
        field_r = "Unknown";
        try {
          L1: {
            field_r = System.getProperty("java.vendor");
            field_d = System.getProperty("java.version");
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
          if (-1 == field_r.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((si) this).field_t = true;
            break L3;
          }
        }
        try {
          L4: {
            field_c = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_c = "Unknown";
            break L5;
          }
        }
        field_a = field_c.toLowerCase();
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
              field_i = System.getProperty("user.home");
              if (null == field_i) {
                break L11;
              } else {
                field_i = field_i + "/";
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
          if (field_i != null) {
            break L13;
          } else {
            field_i = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((si) this).field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((si) this).field_t) {
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
                field_w = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          kd.a(-67, field_o, field_b);
          if (!((si) this).field_l) {
            break L21;
          } else {
            ((si) this).field_v = new ok(kd.a((String) null, "random.dat", false, field_o), "rw", 25L);
            ((si) this).field_j = new ok(kd.a("main_file_cache.dat2", 7900), "rw", 314572800L);
            ((si) this).field_m = new ok(kd.a("main_file_cache.idx255", 7900), "rw", 1048576L);
            ((si) this).field_u = new ok[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!((si) this).field_t) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("rh").newInstance();
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
                      if (((si) this).field_t) {
                        var6 = new cj();
                        ((si) this).field_s = var6;
                        break L27;
                      } else {
                        ((si) this).field_f = Class.forName("hk").newInstance();
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
                      if (((si) this).field_t) {
                        ((si) this).field_x = new me();
                        break L30;
                      } else {
                        ((si) this).field_g = Class.forName("sc").newInstance();
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
                ((si) this).field_u[var5_int] = new ok(kd.a("main_file_cache.idx" + var5_int, 7900), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((si) this).field_n = false;
        ((si) this).field_q = new Thread((Runnable) this);
        ((si) this).field_q.setPriority(10);
        ((si) this).field_q.setDaemon(true);
        ((si) this).field_q.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
