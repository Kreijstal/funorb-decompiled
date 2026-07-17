/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ch {
    static boolean[][] field_g;
    static int field_i;
    static String field_h;
    static String field_j;
    static String field_a;
    static byte[] field_c;
    static boolean field_e;
    static boolean field_k;
    static ja[] field_b;
    private th field_d;
    private br field_f;

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
          if (param0 >= 32) {
            if (38 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ch.d(76);
          if (param0 >= 32) {
            if (38 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int b() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            k var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_32_0 = 0;
            if (4 > i.field_a.field_n) {
              try {
                L0: {
                  L1: {
                    if (la.field_d == 0) {
                      vo.field_o = p.field_a.a(vg.field_r, qe.field_f, (byte) -120);
                      la.field_d = la.field_d + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (la.field_d == 1) {
                      if (vo.field_o.field_f == 2) {
                        stackOut_13_0 = u.b(-1, 5);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (1 != vo.field_o.field_f) {
                          break L2;
                        } else {
                          la.field_d = la.field_d + 1;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (la.field_d == 2) {
                      vh.field_Gb = new ej((java.net.Socket) vo.field_o.field_d, p.field_a);
                      var2 = new k(13);
                      int discarded$1 = -124;
                      mo.a(o.field_b, var2, ej.field_q, db.field_e);
                      var2.a(108, 15);
                      var2.b(-128, kk.field_q);
                      vh.field_Gb.a(0, -100, 13, var2.field_m);
                      la.field_d = la.field_d + 1;
                      li.field_A = 30000L + bl.a((byte) 43);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (la.field_d != 3) {
                      break L4;
                    } else {
                      if (vh.field_Gb.a(116) > 0) {
                        var1_int = vh.field_Gb.c((byte) 59);
                        if (var1_int == 0) {
                          la.field_d = la.field_d + 1;
                          break L4;
                        } else {
                          stackOut_28_0 = u.b(var1_int, 5);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      } else {
                        if (bl.a((byte) 124) > li.field_A) {
                          stackOut_25_0 = u.b(-2, 5);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 != la.field_d) {
                    stackOut_34_0 = -1;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    i.field_a.a(k.field_f, (Object) (Object) vh.field_Gb, 104);
                    vo.field_o = null;
                    la.field_d = 0;
                    vh.field_Gb = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return u.b(-3, 5);
              }
              return stackIn_35_0;
            } else {
              if (i.field_a.field_p != -1) {
                if (i.field_a.field_p == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -1) {
          ch.d(-29);
          field_g = null;
          field_h = null;
          field_b = null;
          field_j = null;
          return;
        } else {
          field_g = null;
          field_h = null;
          field_b = null;
          field_j = null;
          return;
        }
    }

    final br b(int param0, br param1) {
        br var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        br stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        br stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -4) {
                break L1;
              } else {
                boolean discarded$2 = ch.a(92, false);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = ((ch) this).field_d.field_b.field_b;
                break L2;
              }
            }
            if (var3 == ((ch) this).field_d.field_b) {
              ((ch) this).field_f = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (br) (Object) stackIn_8_0;
            } else {
              ((ch) this).field_f = var3.field_b;
              stackOut_9_0 = (br) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ch.H(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final br a(int param0, br param1) {
        br var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        br stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        br stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((ch) this).field_d.field_b.field_d;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (var3 != ((ch) this).field_d.field_b) {
              L2: {
                ((ch) this).field_f = var3.field_d;
                if (param0 == 2680) {
                  break L2;
                } else {
                  boolean discarded$2 = ch.a(95, true);
                  break L2;
                }
              }
              stackOut_8_0 = (br) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((ch) this).field_f = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (br) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ch.G(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final br e(int param0) {
        br var2 = null;
        if (param0 != -3) {
            field_i = -81;
            var2 = ((ch) this).field_f;
            if (!(((ch) this).field_d.field_b != var2)) {
                ((ch) this).field_f = null;
                return null;
            }
            ((ch) this).field_f = var2.field_b;
            return var2;
        }
        var2 = ((ch) this).field_f;
        if (!(((ch) this).field_d.field_b != var2)) {
            ((ch) this).field_f = null;
            return null;
        }
        ((ch) this).field_f = var2.field_b;
        return var2;
    }

    final br c(int param0) {
        br var2 = null;
        var2 = ((ch) this).field_d.field_b.field_d;
        if (var2 != ((ch) this).field_d.field_b) {
          if (param0 != -3) {
            field_g = null;
            ((ch) this).field_f = var2.field_d;
            return var2;
          } else {
            ((ch) this).field_f = var2.field_d;
            return var2;
          }
        } else {
          ((ch) this).field_f = null;
          return null;
        }
    }

    final br a(int param0) {
        br var2 = null;
        var2 = ((ch) this).field_d.field_b.field_b;
        if (var2 != ((ch) this).field_d.field_b) {
          if (param0 != 32397) {
            br discarded$2 = ((ch) this).c(62);
            ((ch) this).field_f = var2.field_b;
            return var2;
          } else {
            ((ch) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          ((ch) this).field_f = null;
          return null;
        }
    }

    final br a(byte param0) {
        br var2 = null;
        if (param0 < -26) {
          var2 = ((ch) this).field_f;
          if (var2 == ((ch) this).field_d.field_b) {
            ((ch) this).field_f = null;
            return null;
          } else {
            ((ch) this).field_f = var2.field_d;
            return var2;
          }
        } else {
          field_e = true;
          var2 = ((ch) this).field_f;
          if (var2 == ((ch) this).field_d.field_b) {
            ((ch) this).field_f = null;
            return null;
          } else {
            ((ch) this).field_f = var2.field_d;
            return var2;
          }
        }
    }

    ch(th param0) {
        try {
            ((ch) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ch.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
