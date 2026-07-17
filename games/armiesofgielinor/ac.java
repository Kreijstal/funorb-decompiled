/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ac extends tc {
    private int field_z;
    private int field_y;
    static String field_u;
    private int field_q;
    private int field_w;
    static String field_x;
    private int field_v;
    static int field_p;
    static ru[] field_k;
    private int field_l;
    static boolean field_n;
    static int field_m;
    static String field_s;
    private int field_t;
    private int field_r;
    private int field_o;

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -12614) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            L2: {
              param0.field_H[((ac) this).field_q] = param0.field_H[((ac) this).field_q] + ((ac) this).field_w;
              if (1000000000 < param0.field_H[((ac) this).field_q]) {
                param0.field_H[((ac) this).field_q] = 1000000000;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((ac) this).field_y != 3) {
                L4: {
                  if (((ac) this).field_y != 4) {
                    int dupTemp$2 = param0.o(((ac) this).field_q, -1);
                    param0.field_fb[dupTemp$2] = param0.field_fb[dupTemp$2] + ((ac) this).field_w;
                    if (param0.field_fb[param0.o(((ac) this).field_q, param1 + 12613)] > 1000000000) {
                      param0.field_fb[param0.o(((ac) this).field_q, -1)] = 1000000000;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                ((ac) this).d(96);
                break L3;
              } else {
                ((ac) this).d(96);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ac.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_x = null;
        field_u = null;
        field_s = null;
        if (param0 <= 19) {
            ac.a((byte) 70);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = -param0 + (((ac) this).field_v >> 4);
        if (param2 <= -6) {
          var5 = -param1 + (((ac) this).field_l >> 4);
          if (((ac) this).field_o <= 100) {
            if (((ac) this).field_o >= 0) {
              var5 = (((ac) this).field_o * 30 + var5 * (-((ac) this).field_o + 100)) / 100;
              var4 = (var4 * (100 - ((ac) this).field_o) + 210 * ((ac) this).field_o) / 100;
              if (((ac) this).field_o >= 0) {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              } else {
                return;
              }
            } else {
              if (((ac) this).field_o >= 0) {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              } else {
                return;
              }
            }
          } else {
            var4 = 210;
            var5 = 30;
            if (((ac) this).field_o < 0) {
              return;
            } else {
              vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
              return;
            }
          }
        } else {
          ((ac) this).field_o = 62;
          var5 = -param1 + (((ac) this).field_l >> 4);
          if (((ac) this).field_o <= 100) {
            if (((ac) this).field_o >= 0) {
              var5 = (((ac) this).field_o * 30 + var5 * (-((ac) this).field_o + 100)) / 100;
              var4 = (var4 * (100 - ((ac) this).field_o) + 210 * ((ac) this).field_o) / 100;
              if (((ac) this).field_o < 0) {
                return;
              } else {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              }
            } else {
              if (((ac) this).field_o < 0) {
                return;
              } else {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              }
            }
          } else {
            var4 = 210;
            var5 = 30;
            if (((ac) this).field_o < 0) {
              return;
            } else {
              vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
              return;
            }
          }
        }
    }

    final void b(ha param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (((ac) this).field_o < 0) {
                break L1;
              } else {
                ((ac) this).field_l = ((ac) this).field_l + ((ac) this).field_z;
                ((ac) this).field_v = ((ac) this).field_v + ((ac) this).field_r;
                ((ac) this).field_r = ((ac) this).field_r + 1;
                if (1600 >= ((ac) this).field_l) {
                  ((ac) this).field_z = ((ac) this).field_z + 1;
                  break L1;
                } else {
                  ((ac) this).field_z = ((ac) this).field_z - 1;
                  break L1;
                }
              }
            }
            L2: {
              ((ac) this).field_o = ((ac) this).field_o + 1;
              if (-1 == ((ac) this).field_o) {
                L3: {
                  if (-1 != ((ac) this).field_y) {
                    break L3;
                  } else {
                    if (!uu.field_b) {
                      te discarded$5 = ub.a((byte) 29, el.field_b[0]);
                      ep.field_f = false;
                      uu.field_b = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((ac) this).field_y != 1) {
                    break L4;
                  } else {
                    if (et.field_d) {
                      break L4;
                    } else {
                      te discarded$6 = ub.a((byte) 50, el.field_b[0]);
                      ep.field_f = false;
                      et.field_d = true;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((ac) this).field_y != 2) {
                    break L5;
                  } else {
                    if (wt.field_G) {
                      break L5;
                    } else {
                      te discarded$7 = ub.a((byte) 113, el.field_b[0]);
                      ep.field_f = false;
                      wt.field_G = true;
                      break L5;
                    }
                  }
                }
                if (((ac) this).field_y != 3) {
                  break L2;
                } else {
                  if (!ep.field_f) {
                    te discarded$8 = ub.a((byte) 57, el.field_b[0]);
                    et.field_d = false;
                    wt.field_G = false;
                    uu.field_b = false;
                    ep.field_f = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L6: {
              if (((ac) this).field_o >= 0) {
                ((ac) this).field_o = ((ac) this).field_o + 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1 == 100) {
                break L7;
              } else {
                var4 = null;
                ((ac) this).b((ha) null, -123);
                break L7;
              }
            }
            if (((ac) this).field_o < 100) {
              break L0;
            } else {
              ((ac) this).a(param0, -12614);
              te discarded$9 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("ac.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 41);
        }
    }

    final static wk[] a(kl param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wk[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              var4_int = param0.a(param3, 124);
              if (param2 == -4) {
                break L1;
              } else {
                ac.a((byte) -15);
                break L1;
              }
            }
            var5 = param0.a((byte) -20, var4_int, param1);
            stackOut_2_0 = nk.a(var4_int, (byte) 28, var5, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ac.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    ac(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ac) this).field_v = param0 << 4;
        ((ac) this).field_l = param1 << 4;
        ((ac) this).field_r = param2 + ((int)(-80.0 + 161.0 * Math.random()) >> 1);
        ((ac) this).field_z = param3 - -((int)(Math.random() * 161.0 - 80.0) >> 1);
        ((ac) this).field_q = param4;
        ((ac) this).field_w = param6;
        ((ac) this).field_o = -param5;
        ((ac) this).field_t = ns.a(false, vc.field_k.length, li.field_n);
        ((ac) this).field_y = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "End tutorial";
        field_x = "Accept <%0> into this game";
        field_s = "Cancel";
        field_n = false;
    }
}
