/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ml implements ntb, utb {
    int[] field_g;
    int field_b;
    aqa field_a;
    imb[] field_d;
    qjb field_c;
    private eka field_h;
    int field_r;
    lja field_k;
    ml[] field_f;
    private int field_o;
    private int field_m;
    int field_j;
    int field_e;
    private int field_i;
    int field_n;
    private int field_q;
    private int field_p;
    static byte[][][] field_l;

    final void a(byte param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = ((ml) this).i((byte) -112).field_u;
            param1[1] = param1[1] + (((ml) this).field_n * var3_int >> 4);
            param1[2] = param1[2] + var3_int;
            if (param0 >= 23) {
              L1: {
                param1[0] = param1[0] + (((ml) this).field_r * var3_int >> 4);
                if (null != ((ml) this).field_f) {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= ((ml) this).field_f.length) {
                      break L1;
                    } else {
                      ((ml) this).field_f[var4].a((byte) 117, param1);
                      var4++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ml.WC(").append(param0).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final int c(byte param0) {
        if (param0 != 100) {
            return -49;
        }
        return ((ml) this).i((byte) -112).field_i;
    }

    final void a(byte param0, lta param1, boolean param2, pe param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            ((ml) this).a(param3, (byte) 84, param4, param1, param2);
            if (param0 > 21) {
              L1: {
                if (null == ((ml) this).field_f) {
                  break L1;
                } else {
                  var6_int = 0;
                  L2: while (true) {
                    if (((ml) this).field_f.length <= var6_int) {
                      break L1;
                    } else {
                      ((ml) this).field_f[var6_int].a((byte) 87, param1, param2, param3, param4);
                      var6_int++;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ml.NB(").append(param0).append(44);
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    final void a(anb param0, int param1, pe param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        wfb var7_ref = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param4 > 7) {
              L1: {
                var7_ref = ((ml) this).i((byte) -112);
                if (((ml) this).field_a == null) {
                  break L1;
                } else {
                  ((ml) this).field_a.a(true, var7_ref.field_i, ((ml) this).field_r, ((ml) this).field_n, var7_ref.field_b, param0, var7_ref.field_v, ((ml) this).field_g, param2, ((ml) this).field_b, param1, param5, param3, ((ml) this).field_j);
                  break L1;
                }
              }
              L2: {
                if (((ml) this).field_c != null) {
                  ((ml) this).field_c.a(param2, false, var7_ref.field_b, param3, -97, param0, param1, ((ml) this).field_n, ((ml) this).field_b, ((ml) this).field_r, var7_ref.field_i, var7_ref.field_v);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((ml) this).field_k != null) {
                  ((ml) this).field_k.a(param3, ((ml) this).field_n, var7_ref.field_v, param1, ((ml) this).field_b, ((ml) this).field_r, var7_ref.field_i, (byte) 77, param2, var7_ref.field_b, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (null != ((ml) this).field_h) {
                  ((ml) this).field_h.a(param0, var7_ref.field_v, -9151, param1, ((ml) this).field_n, ((ml) this).field_b, var7_ref.field_b, param2, var7_ref.field_i, ((ml) this).field_r, param3);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("ml.CA(");
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void a(pe param0, int param1, anb param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (null == ((ml) this).field_k) {
                break L1;
              } else {
                ((ml) this).field_k.a(param0, 19278);
                break L1;
              }
            }
            L2: {
              param0.a(15520, (ml) this, param2);
              if (((ml) this).field_c != null) {
                L3: {
                  if (((ml) this).field_c.b(true)) {
                    ((ml) this).field_c.field_b = ((ml) this).field_c.a((byte) 24).f((byte) 12) + -((ml) this).field_c.a((byte) 24).c((byte) 122);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((ml) this).field_c.b(2048);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              L5: {
                if (null == ((ml) this).field_f) {
                  break L5;
                } else {
                  var4_int = 0;
                  L6: while (true) {
                    if (((ml) this).field_f.length <= var4_int) {
                      break L5;
                    } else {
                      ((ml) this).field_f[var4_int].a(param0, -19625, param2);
                      var4_int++;
                      if (var5 != 0) {
                        break L4;
                      } else {
                        if (var5 == 0) {
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == -19625) {
                break L4;
              } else {
                ((ml) this).field_r = -47;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ml.AC(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    private final boolean d(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 63 / ((-25 - param0) / 43);
            if (this.d(-47)) {
              break L1;
            } else {
              if (0 >= ((ml) this).c(118)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final void a(boolean param0, byte param1, pe param2, anb param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        wfb var5_ref = null;
        mfb var6 = null;
        wfb var6_ref = null;
        odb var7 = null;
        anb var8 = null;
        ij var8_ref = null;
        sg[] var9 = null;
        Object var10 = null;
        int var11 = 0;
        tj var12 = null;
        sg[] var12_array = null;
        int var13 = 0;
        sg var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        sg[] var19 = null;
        Object var20 = null;
        sg var21 = null;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        sg stackIn_46_0 = null;
        sg stackIn_55_0 = null;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        sg stackOut_45_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var20 = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ml) this).field_f != null) {
                  var5_int = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var5_int) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var5_int].a(param0, (byte) -124, param2, param3);
                      var5_int++;
                      if (var18 != 0) {
                        break L1;
                      } else {
                        if (var18 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L4: {
                if (null == ((ml) this).field_c) {
                  break L4;
                } else {
                  if (!param0) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        L7: {
                          var5_ref = ((ml) this).i((byte) -112);
                          var6 = ((ml) this).field_c.a((byte) 24);
                          if (0 >= var6.b((byte) 97)) {
                            break L7;
                          } else {
                            if (((ml) this).field_c.field_b == 0) {
                              break L7;
                            } else {
                              ((ml) this).field_p = ((ml) this).field_p + ((ml) this).field_c.field_b;
                              ((ml) this).field_c.a(((ml) this).field_r, param3, var5_ref.field_v, var5_ref.field_i, ((ml) this).field_n, true, var5_ref.field_b, ((ml) this).field_b, param2);
                              param3.d((byte) -76);
                              if (var18 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (!((ml) this).k((byte) 127)) {
                          L8: {
                            if (((ml) this).field_c.c((byte) 101)) {
                              L9: {
                                if (((ml) this).field_c.b(true)) {
                                  break L9;
                                } else {
                                  ((ml) this).field_c.b(param1 + 2172);
                                  if (var18 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var7 = ((ml) this).field_c.c(2);
                              if (var7 != null) {
                                L10: {
                                  var8 = param3;
                                  if (var7.field_a < 0) {
                                    break L10;
                                  } else {
                                    var8 = param2.d((byte) -27, var7.field_a);
                                    break L10;
                                  }
                                }
                                if (var8 == null) {
                                  break L8;
                                } else {
                                  int discarded$2 = ((ml) this).a(var8.d(false) - -var7.field_d, true, 0, var8.g((byte) -87) - -var7.field_c, 21750, 0);
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          ((ml) this).field_c.a(((ml) this).field_r, param3, var5_ref.field_v, var5_ref.field_i, ((ml) this).field_n, true, var5_ref.field_b, ((ml) this).field_b, param2);
                          if (var6.h(param1 ^ 2185)) {
                            var21 = (sg) (Object) param3;
                            var8_ref = param2.c(true);
                            var9 = param2.d(1000);
                            var10 = null;
                            var11 = var6.j(param1 ^ 107);
                            var12 = (tj) (Object) var8_ref.d(0);
                            L11: while (true) {
                              L12: {
                                if (var12 == null) {
                                  break L12;
                                } else {
                                  var13 = var12.g((byte) -104);
                                  stackOut_31_0 = ~var12.e(512);
                                  stackOut_31_1 = ~var21.q((byte) 73);
                                  stackIn_59_0 = stackOut_31_0;
                                  stackIn_59_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var18 != 0) {
                                    break L5;
                                  } else {
                                    L13: {
                                      L14: {
                                        if (stackIn_32_0 != stackIn_32_1) {
                                          break L14;
                                        } else {
                                          if (qab.a(33, param2.d(false))) {
                                            break L13;
                                          } else {
                                            if (var12.b(false) == var21.o((byte) -117)) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                      L15: {
                                        if (var13 == 6) {
                                          break L15;
                                        } else {
                                          if (var13 != 1) {
                                            break L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var14_int = var12.field_d + -((ml) this).field_r;
                                      var15 = var12.field_e - ((ml) this).field_n;
                                      var16 = ar.a(var14_int, (byte) 104, var15);
                                      if (var11 <= var16) {
                                        break L13;
                                      } else {
                                        if (!((ml) this).field_c.a(-26772, var12.field_e, var12.field_d, var5_ref, (ml) this)) {
                                          break L13;
                                        } else {
                                          var10 = (Object) (Object) var12;
                                          var11 = var16;
                                          break L13;
                                        }
                                      }
                                    }
                                    var12 = (tj) (Object) var8_ref.a((byte) 65);
                                    if (var18 == 0) {
                                      continue L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              var19 = var9;
                              var12_array = var9;
                              var13 = 0;
                              L16: while (true) {
                                L17: {
                                  L18: {
                                    if (var13 >= var19.length) {
                                      break L18;
                                    } else {
                                      var14 = var19[var13];
                                      stackOut_45_0 = (sg) var14;
                                      stackIn_55_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if (var18 != 0) {
                                        break L17;
                                      } else {
                                        L19: {
                                          if (stackIn_46_0 == null) {
                                            break L19;
                                          } else {
                                            if (!var14.g(false)) {
                                              break L19;
                                            } else {
                                              if (var14.q((byte) 78) == var21.q((byte) 124)) {
                                                break L19;
                                              } else {
                                                var15 = var14.field_d - ((ml) this).field_r;
                                                var16 = var14.field_e + -((ml) this).field_n;
                                                var17 = ar.a(var15, (byte) 109, var16);
                                                if (var17 >= var11) {
                                                  break L19;
                                                } else {
                                                  if (((ml) this).field_c.a(param1 ^ 26856, var14.field_e, var14.field_d, var5_ref, (ml) this)) {
                                                    var11 = var17;
                                                    var10 = (Object) (Object) var14;
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var13++;
                                        if (var18 == 0) {
                                          continue L16;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_54_0 = var10;
                                  stackIn_55_0 = (sg) (Object) stackOut_54_0;
                                  break L17;
                                }
                                if (stackIn_55_0 != null) {
                                  int discarded$3 = ((ml) this).a(((ara) var10).field_f + ((ara) var10).field_d, true, 0, ((ara) var10).field_e + ((ara) var10).field_h, 21750, 0);
                                  ((ml) this).a(param3, ((ara) var10).field_h + ((ara) var10).field_e, param2, ((ara) var10).field_d + ((ara) var10).field_f, 111, 256);
                                  param3.d((byte) -44);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      stackOut_58_0 = 0;
                      stackOut_58_1 = var6.b((byte) 72);
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      break L5;
                    }
                    if (stackIn_59_0 >= stackIn_59_1) {
                      break L4;
                    } else {
                      if (((ml) this).k((byte) 106)) {
                        break L4;
                      } else {
                        ((ml) this).field_c.a(param2, true, var5_ref.field_b, 0, -78, param3, 0, ((ml) this).field_n, ((ml) this).field_b, ((ml) this).field_r, var5_ref.field_i, var5_ref.field_v);
                        break L4;
                      }
                    }
                  }
                }
              }
              L20: {
                if (!((ml) this).k((byte) 46)) {
                  stackOut_64_0 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  break L20;
                } else {
                  stackOut_63_0 = 1;
                  stackIn_65_0 = stackOut_63_0;
                  break L20;
                }
              }
              var5_int = stackIn_65_0;
              break L1;
            }
            L21: {
              if (param1 == -124) {
                break L21;
              } else {
                ((ml) this).a((faa) null, false);
                break L21;
              }
            }
            L22: {
              if (var5_int == 0) {
                break L22;
              } else {
                if (((ml) this).field_c == null) {
                  break L22;
                } else {
                  if (!((ml) this).field_c.b(true)) {
                    break L22;
                  } else {
                    ((ml) this).field_c.field_b = ((ml) this).field_c.a((byte) 24).f((byte) 57) - ((ml) this).field_c.a((byte) 24).c((byte) 124);
                    break L22;
                  }
                }
              }
            }
            L23: {
              if (null != ((ml) this).field_a) {
                ((ml) this).field_a.a(var5_int != 0, param3, ((ml) this).field_b, ((ml) this).field_n, ((ml) this).field_j, ((ml) this).field_g, param1 + -31377, ((ml) this).field_r, param2);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var6_ref = ((ml) this).i((byte) -112);
              if (((ml) this).field_k != null) {
                ((ml) this).field_k.a(param3, param2, ((ml) this).field_n, var5_int != 0, (byte) 126, ((ml) this).field_r, ((ml) this).field_b, var6_ref.field_v);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (null != ((ml) this).field_h) {
                ((ml) this).field_h.a(var5_int != 0, ((ml) this).field_n, param3, var6_ref.field_v, param2, ((ml) this).field_b, 123, ((ml) this).field_r);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (var6_ref.field_d <= 0) {
                break L26;
              } else {
                if (!param0) {
                  break L26;
                } else {
                  ((sg) (Object) param3).e(-1, var6_ref.field_d);
                  break L26;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var5 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) var5;
            stackOut_85_1 = new StringBuilder().append("ml.OB(").append(param0).append(44).append(param1).append(44);
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param2 == null) {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L27;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L27;
            }
          }
          L28: {
            stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(44);
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param3 == null) {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L28;
            } else {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L28;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_91_0, stackIn_91_2 + 41);
        }
    }

    final ml[] a(byte param0, int param1, int param2, ml[] param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ml[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ml) this).field_f != null) {
                  var6_int = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var6_int) {
                      break L2;
                    } else {
                      param3 = ((ml) this).field_f[var6_int].a((byte) 101, param1, param2, param3, param4);
                      var6_int++;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param0 == 101) {
                break L1;
              } else {
                ((ml) this).a((byte) 114, (anb) null);
                break L1;
              }
            }
            L4: {
              if (!ujb.a((byte) -57, ((ml) this).field_g, param1, param4, param2)) {
                break L4;
              } else {
                param3 = (ml[]) (Object) ija.a(this, (Object[]) (Object) param3, 0, ii.field_d);
                break L4;
              }
            }
            stackOut_12_0 = (ml[]) param3;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ml.IC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
        return stackIn_13_0;
    }

    final lu a(int param0, boolean param1, int param2, int param3, int param4, ml param5, int param6, anb param7) {
        Object var9 = null;
        int var10 = 0;
        int var11 = 0;
        lu var11_ref_lu = null;
        imb var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        lu stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        lu stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            if (param6 == -29866) {
              L1: {
                L2: {
                  var9 = null;
                  if (((ml) this).field_f == null) {
                    break L2;
                  } else {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= ((ml) this).field_f.length) {
                        break L2;
                      } else {
                        var11_ref_lu = ((ml) this).field_f[var10].a(param0, param1, param2, param3, param4, param5, -29866, param7);
                        stackOut_7_0 = null;
                        stackIn_12_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var16 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (stackIn_8_0 == (Object) (Object) var11_ref_lu) {
                              break L4;
                            } else {
                              var9 = (Object) (Object) var11_ref_lu;
                              param2 = ((lu) var9).field_g;
                              break L4;
                            }
                          }
                          var10++;
                          if (var16 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                break L1;
              }
              L5: {
                if (stackIn_12_0 == (Object) (Object) ((ml) this).field_d) {
                  break L5;
                } else {
                  var10 = -1;
                  var11 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (((ml) this).field_d.length <= var11) {
                          break L8;
                        } else {
                          var12 = ((ml) this).field_d[var11];
                          var13 = var12.field_e + -param0;
                          var14 = -param4 + var12.field_d;
                          var15 = ar.a(var13, (byte) 120, var14);
                          stackOut_15_0 = ~param2;
                          stackOut_15_1 = ~var15;
                          stackIn_21_0 = stackOut_15_0;
                          stackIn_21_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var16 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_16_0 < stackIn_16_1) {
                                param2 = var15;
                                var10 = var11;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var11++;
                            if (var16 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_20_0 = -1;
                      stackOut_20_1 = var10;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L7;
                    }
                    if (stackIn_21_0 == stackIn_21_1) {
                      break L5;
                    } else {
                      stackOut_22_0 = new lu(var10, (ml) this, param2);
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    }
                  }
                }
              }
              stackOut_24_0 = var9;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (lu) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = (Object) (Object) decompiledCaughtException;
            stackOut_26_0 = var9;
            stackOut_26_1 = new StringBuilder().append("ml.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param6).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param7 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
        return (lu) (Object) stackIn_25_0;
    }

    private final void a(byte param0, int param1, int param2, ij param3, int param4, ml param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[][] var7_array = null;
        int var8 = 0;
        int[][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ml) this).field_f == null) {
                  break L2;
                } else {
                  var7_int = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var7_int) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var7_int].a((byte) -52, 1 + param1, var7_int - -1 << 4 * param1 | param2, param3, param4, param5);
                      var7_int++;
                      if (var16 != 0) {
                        break L1;
                      } else {
                        if (var16 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (ar.a(-param5.field_r + ((ml) this).field_r, (byte) 115, -param5.field_n + ((ml) this).field_n) > ((ml) this).i((byte) -112).field_l - -param5.i((byte) -112).field_l) {
                break L1;
              } else {
                L4: {
                  L5: {
                    var7_array = ((ml) this).i((byte) -112).field_A;
                    var8 = 37 % ((61 - param0) / 51);
                    var9 = param5.i((byte) -112).field_A;
                    if (var7_array == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var9 != null) {
                          break L6;
                        } else {
                          var10 = -1;
                          var11 = 0;
                          L7: while (true) {
                            L8: {
                              L9: {
                                if (var7_array.length <= var11) {
                                  break L9;
                                } else {
                                  var17 = this.a(((ml) this).field_g, var11, var7_array, -600917695);
                                  var13 = ihb.a(var17, -5115, param5.field_g);
                                  stackOut_14_0 = ~var10;
                                  stackOut_14_1 = ~var13;
                                  stackIn_20_0 = stackOut_14_0;
                                  stackIn_20_1 = stackOut_14_1;
                                  stackIn_15_0 = stackOut_14_0;
                                  stackIn_15_1 = stackOut_14_1;
                                  if (var16 != 0) {
                                    break L8;
                                  } else {
                                    L10: {
                                      if (stackIn_15_0 > stackIn_15_1) {
                                        var10 = var13;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var11++;
                                    if (var16 == 0) {
                                      continue L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              stackOut_19_0 = var10;
                              stackOut_19_1 = -1;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              break L8;
                            }
                            L11: {
                              if (stackIn_20_0 != stackIn_20_1) {
                                param3.b(-10258, (ksa) (Object) new fka((ml) this, param2, param5, param4, var10));
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (var16 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var10 = -1;
                      var11 = 0;
                      L12: while (true) {
                        stackOut_25_0 = var7_array.length;
                        stackOut_25_1 = var11;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        L13: while (true) {
                          L14: {
                            L15: {
                              if (stackIn_26_0 <= stackIn_26_1) {
                                break L15;
                              } else {
                                var18 = this.a(((ml) this).field_g, var11, var7_array, -600917695);
                                stackOut_27_0 = 0;
                                stackIn_33_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (var16 != 0) {
                                  break L14;
                                } else {
                                  var13 = stackIn_28_0;
                                  if (var13 >= var9.length) {
                                    var11++;
                                    if (var16 == 0) {
                                      continue L12;
                                    } else {
                                      break L15;
                                    }
                                  } else {
                                    var14 = this.a(param5.field_g, var13, var9, -600917695);
                                    var15 = ihb.a(var18, -5115, var14);
                                    stackOut_29_0 = var15;
                                    stackOut_29_1 = var10;
                                    stackIn_26_0 = stackOut_29_0;
                                    stackIn_26_1 = stackOut_29_1;
                                    continue L13;
                                  }
                                }
                              }
                            }
                            stackOut_32_0 = ~var10;
                            stackIn_33_0 = stackOut_32_0;
                            break L14;
                          }
                          L16: {
                            if (stackIn_33_0 != 0) {
                              param3.b(-10258, (ksa) (Object) new fka((ml) this, param2, param5, param4, var10));
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          if (var16 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (var9 == null) {
                      break L17;
                    } else {
                      var10 = -1;
                      var11 = 0;
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (var11 >= var9.length) {
                              break L20;
                            } else {
                              var19 = this.a(param5.field_g, var11, var9, -600917695);
                              var13 = ihb.a(((ml) this).field_g, -5115, var19);
                              stackOut_40_0 = var13;
                              stackOut_40_1 = var10;
                              stackIn_45_0 = stackOut_40_0;
                              stackIn_45_1 = stackOut_40_1;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              if (var16 != 0) {
                                break L19;
                              } else {
                                L21: {
                                  if (stackIn_41_0 <= stackIn_41_1) {
                                    break L21;
                                  } else {
                                    var10 = var13;
                                    break L21;
                                  }
                                }
                                var11++;
                                if (var16 == 0) {
                                  continue L18;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          stackOut_44_0 = 0;
                          stackOut_44_1 = ~var10;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          break L19;
                        }
                        L22: {
                          if (stackIn_45_0 != stackIn_45_1) {
                            param3.b(-10258, (ksa) (Object) new fka((ml) this, param2, param5, param4, var10));
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  var10 = ihb.a(((ml) this).field_g, -5115, param5.field_g);
                  if (-1 != var10) {
                    param3.b(-10258, (ksa) (Object) new fka((ml) this, param2, param5, param4, var10));
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var7;
            stackOut_53_1 = new StringBuilder().append("ml.LC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param3 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L23;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L23;
            }
          }
          L24: {
            stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44).append(param4).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param5 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L24;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L24;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 41);
        }
    }

    final boolean a(int param0, int param1, pe param2, anb param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (((ml) this).field_j == param1) {
              int discarded$2 = param3.field_k.a(param0, (byte) 80);
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((ml) this).field_f) {
                  break L1;
                } else {
                  if (((ml) this).field_f.length == 0) {
                    break L1;
                  } else {
                    var5_int = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (((ml) this).field_f.length <= var5_int) {
                            break L4;
                          } else {
                            var6 = ((ml) this).field_f[var5_int].a(param0, 47, param2, param3) ? 1 : 0;
                            stackOut_9_0 = var6;
                            stackIn_15_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var7 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_10_0 != 0) {
                                  this.a(param2, 0, true, param3);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var5_int++;
                              if (var7 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      }
                      return stackIn_15_0 != 0;
                    }
                  }
                }
              }
              ((ml) this).field_i = ((ml) this).field_i - param0;
              if (((ml) this).field_i > 0) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                ((ml) this).field_i = 0;
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ml.PB(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final int k(int param0) {
        if (param0 != 0) {
            return 64;
        }
        return ((ml) this).field_j;
    }

    final void a(pe param0, byte param1, int param2, lta param3, boolean param4) {
        wfb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14_float = 0.0f;
        int var14 = 0;
        float var15_float = 0.0f;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[][] var17_ref_int____ = null;
        int var18 = 0;
        int var19 = 0;
        int[] var19_ref_int__ = null;
        float var20_float = 0.0f;
        int var20 = 0;
        int[] var20_ref_int__ = null;
        float var21_float = 0.0f;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        wfb var47 = null;
        int stackIn_73_0 = 0;
        int stackIn_92_0 = 0;
        boolean stackIn_95_0 = false;
        boolean stackIn_106_0 = false;
        int stackIn_120_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_91_0 = 0;
        boolean stackOut_94_0 = false;
        boolean stackOut_105_0 = false;
        boolean stackOut_119_0 = false;
        L0: {
          L1: {
            var46 = VoidHunters.field_G;
            var47 = ((ml) this).i((byte) -112);
            var6 = var47;
            var7 = ((ml) this).field_i * 256 / var6.field_p;
            var8 = (-var7 + 256) * ((31 & kdb.field_o ^ (kdb.field_o & 32) + -((32 & kdb.field_o) >>> 5)) - -32) / 64;
            var9 = -var8 + 256;
            var10 = var8;
            var11 = 16724787;
            if (((ml) this).k((byte) 97)) {
              break L1;
            } else {
              if (((ml) this).field_i != 1) {
                break L0;
              } else {
                if (param4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          param2 = param2 / 2;
          var11 = 8926003;
          break L0;
        }
        L2: {
          var12 = ((var11 & 65280) * var10 & 16711680) + (-16711936 & var10 * (var11 & 16711935)) + ((-16711936 & var9 * (16711935 & param2)) + (var9 * (65280 & param2) & 16711680)) >>> 8;
          if (var6.field_B == 0) {
            var12 = 11184810;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 == 84) {
            break L3;
          } else {
            boolean discarded$1 = this.d((byte) -119);
            break L3;
          }
        }
        L4: {
          if (((ml) this).field_j == 45) {
            jj.a(13412864, (byte) 7, param3.b(true, ((ml) this).field_n), (float)(int)(param3.field_a * 4096.0f), 128 + (eu.a(100 * kdb.field_o, param1 ^ 122) >> 8) / 8, param3.a(((ml) this).field_r, (byte) 127));
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!pqa.a(16, param1 + 11200)) {
            break L5;
          } else {
            kq.a(param3.field_a * (float)var6.field_l, (byte) 113, param3.b(true, ((ml) this).field_n), 16711680, param3.a(((ml) this).field_r, (byte) 126));
            break L5;
          }
        }
        L6: {
          var13 = 1;
          if (1 == ki.field_o) {
            L7: {
              L8: {
                var14_float = 128.0f;
                var15_float = 128.0f;
                var16 = 32;
                var17 = -1;
                var18 = -1;
                if (((ml) this).field_j == 3) {
                  break L8;
                } else {
                  L9: {
                    if (4 == ((ml) this).field_j) {
                      break L9;
                    } else {
                      L10: {
                        if (((ml) this).field_j != 6) {
                          break L10;
                        } else {
                          var16 = 24;
                          var18 = 16;
                          var15_float = 118.0f;
                          var17 = 15;
                          if (var46 == 0) {
                            break L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (((ml) this).field_j == 5) {
                          break L11;
                        } else {
                          L12: {
                            if (((ml) this).field_j != 7) {
                              break L12;
                            } else {
                              var17 = 19;
                              var18 = 20;
                              var15_float = 104.0f;
                              var16 = 27;
                              if (var46 == 0) {
                                break L7;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (((ml) this).field_j != 8) {
                              break L13;
                            } else {
                              var18 = 22;
                              var17 = 21;
                              var16 = 28;
                              var15_float = 116.0f;
                              if (var46 == 0) {
                                break L7;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (((ml) this).field_j == 9) {
                              break L14;
                            } else {
                              L15: {
                                if (((ml) this).field_j != 10) {
                                  break L15;
                                } else {
                                  var18 = 26;
                                  var15_float = 134.0f;
                                  var16 = 29;
                                  var17 = 25;
                                  if (var46 == 0) {
                                    break L7;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if (((ml) this).field_j == 11) {
                                var15_float = 128.0f;
                                var16 = 56;
                                var17 = 27;
                                var18 = 28;
                                if (var46 == 0) {
                                  break L7;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          var16 = 64;
                          var15_float = 110.0f;
                          var18 = 24;
                          var17 = 23;
                          if (var46 == 0) {
                            break L7;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var17 = 17;
                      var15_float = 136.0f;
                      var16 = 32;
                      var18 = 18;
                      if (var46 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17 = 13;
                  var15_float = 98.0f;
                  var18 = 14;
                  var16 = 36;
                  if (var46 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              var18 = 12;
              var17 = 11;
              var15_float = 134.0f;
              var16 = 32;
              break L7;
            }
            if (var17 >= 0) {
              L16: {
                L17: {
                  var19 = (int)((float)var16 * (16384.0f * param3.field_a));
                  var20_float = param3.b(((ml) this).field_r, param1 ^ -41);
                  var21_float = param3.c(0, ((ml) this).field_n);
                  var22 = -(2048 + ((ml) this).field_b) << 3;
                  var23 = var12 | -16777216;
                  if (!li.field_i) {
                    break L17;
                  } else {
                    L18: {
                      if (mmb.field_d[var17] == null) {
                        break L18;
                      } else {
                        mmb.field_d[var17].a(var20_float, var21_float, var14_float, var15_float, var19, var22, 0, var23, 1);
                        break L18;
                      }
                    }
                    if (0 > var18) {
                      break L16;
                    } else {
                      if (null == mmb.field_d[var18]) {
                        break L16;
                      } else {
                        mmb.field_d[var18].a(var20_float, var21_float, var14_float, var15_float, var19, var22, 0, var23, 2);
                        if (var46 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                }
                if (null == wnb.field_o) {
                  break L16;
                } else {
                  L19: {
                    var18 -= 11;
                    var17 -= 11;
                    if (var17 < 0) {
                      break L19;
                    } else {
                      if (wnb.field_o[var17] != null) {
                        wnb.field_o[var17].b((int)var14_float << 4, (int)var15_float << 4, (int)var20_float << 4, (int)var21_float << 4, var22, var19);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (0 > var18) {
                    break L16;
                  } else {
                    if (null == wnb.field_o[var18]) {
                      break L16;
                    } else {
                      wnb.field_o[var18].a((int)var14_float << 4, (int)var15_float << 4, (int)var20_float << 4, (int)var21_float << 4, var22, var19);
                      break L16;
                    }
                  }
                }
              }
              var13 = 0;
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        L20: {
          if (pqa.a(4, param1 ^ 11328)) {
            var13 = 1;
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (var13 != 0) {
            L22: {
              L23: {
                var14 = fc.a(((ml) this).field_b, (byte) -108);
                var15 = eu.a(((ml) this).field_b, 69);
                if (0 != var6.field_b) {
                  break L23;
                } else {
                  if (0 == var6.field_i) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              var16 = -(var6.field_i * var15) + var6.field_b * var14 >> 16;
              var17 = var6.field_b * var15 - -(var6.field_i * var14) >> 16;
              var18 = var16 + ((ml) this).field_r;
              var19 = ((ml) this).field_n - -var17;
              var20 = param3.a(var18, (byte) 115);
              var21 = param3.b(true, var19);
              ena.a(var21, (float)(int)(512.0f * param3.field_a), param1 ^ -35, var20, param2);
              var22 = ((ml) this).field_p - ((ml) this).field_q;
              var23 = -var22 + ((ml) this).field_b;
              var24 = 8 * fc.a(var23, (byte) 104) >> 9;
              var25 = eu.a(var23, 55) * 8 >> 9;
              c.a(param3.b(true, var19 + -var25), param3.a(var18 - var24, (byte) 126), var20, var21, param1 + -16777300, param2);
              var24 = 8 * var14 >> 9;
              var25 = var15 * 8 >> 9;
              c.a(param3.b(true, var25 + var19), param3.a(var18 - -var24, (byte) 127), var20, var21, -16777216, param2);
              break L22;
            }
            L24: {
              L25: {
                L26: {
                  L27: {
                    if (wkb.field_c != 1) {
                      break L27;
                    } else {
                      L28: {
                        var16 = 1879048192;
                        if (var6.field_k) {
                          break L28;
                        } else {
                          var16 = 1342177280;
                          break L28;
                        }
                      }
                      L29: {
                        var17_ref_int____ = var6.field_w;
                        if (0 != asb.field_f) {
                          if (var17_ref_int____ != null) {
                            if (var6.field_m) {
                              stackOut_72_0 = 1;
                              stackIn_73_0 = stackOut_72_0;
                              break L29;
                            } else {
                              stackOut_71_0 = 0;
                              stackIn_73_0 = stackOut_71_0;
                              break L29;
                            }
                          } else {
                            stackOut_69_0 = 1;
                            stackIn_73_0 = stackOut_69_0;
                            break L29;
                          }
                        } else {
                          stackOut_67_0 = 1;
                          stackIn_73_0 = stackOut_67_0;
                          break L29;
                        }
                      }
                      L30: {
                        L31: {
                          var18 = stackIn_73_0;
                          if (var18 != 0) {
                            var19_ref_int__ = kg.field_p;
                            var20 = 0;
                            L32: while (true) {
                              L33: {
                                L34: {
                                  if (var20 >= ((ml) this).field_g.length) {
                                    break L34;
                                  } else {
                                    var19_ref_int__[var20] = param3.a(((ml) this).field_g[var20], (byte) 122);
                                    var19_ref_int__[var20 + 1] = param3.b(true, ((ml) this).field_g[var20 - -1]);
                                    var20 += 2;
                                    if (var46 != 0) {
                                      break L33;
                                    } else {
                                      if (var46 == 0) {
                                        continue L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                am.a(-112, 0, ((ml) this).field_g.length, var12 | var16, var19_ref_int__);
                                break L33;
                              }
                              var20 = 0;
                              L35: while (true) {
                                if (var20 >= ((ml) this).field_g.length) {
                                  break L31;
                                } else {
                                  var21 = var19_ref_int__[var20];
                                  var22 = var19_ref_int__[1 + var20];
                                  var23 = var19_ref_int__[(2 + var20) % ((ml) this).field_g.length];
                                  var24 = var19_ref_int__[(var20 + 3) % ((ml) this).field_g.length];
                                  c.a(var24, var23, var21, var22, -16777216, var12);
                                  var20 += 2;
                                  if (var46 != 0) {
                                    break L30;
                                  } else {
                                    if (var46 == 0) {
                                      continue L35;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        if (asb.field_f != 1) {
                          break L30;
                        } else {
                          if (var17_ref_int____ != null) {
                            var19 = 0;
                            L36: while (true) {
                              if (var19 >= var17_ref_int____.length) {
                                break L30;
                              } else {
                                var20_ref_int__ = kg.field_p;
                                var21_ref_int__ = feb.field_b;
                                var22 = 0;
                                var23 = 0;
                                var24 = 0;
                                var25 = 0;
                                var26 = 1;
                                stackOut_91_0 = 0;
                                stackIn_120_0 = stackOut_91_0;
                                stackIn_92_0 = stackOut_91_0;
                                if (var46 != 0) {
                                  break L25;
                                } else {
                                  var27 = stackIn_92_0;
                                  L37: while (true) {
                                    L38: {
                                      L39: {
                                        if (var17_ref_int____[var19].length <= var27) {
                                          break L39;
                                        } else {
                                          var28 = var17_ref_int____[var19][var27] - this.a(param4, var6, true) >> 4;
                                          var29 = var17_ref_int____[var19][1 + var27] >> 4;
                                          var30 = var14 * var28;
                                          var31 = var15 * var29;
                                          var32 = var15 * var28;
                                          var33 = var29 * var14;
                                          var34 = var30 - var31 >> 12;
                                          var35 = var32 + var33 >> 12;
                                          var36 = var34 + ((ml) this).field_r;
                                          var37 = var35 + ((ml) this).field_n;
                                          var38 = param3.a(var36, (byte) 119);
                                          var39 = param3.b(true, var37);
                                          var20_ref_int__[var27] = var38;
                                          var20_ref_int__[1 + var27] = var39;
                                          stackOut_94_0 = var6.field_k;
                                          stackIn_106_0 = stackOut_94_0;
                                          stackIn_95_0 = stackOut_94_0;
                                          if (var46 != 0) {
                                            break L38;
                                          } else {
                                            L40: {
                                              L41: {
                                                if (stackIn_95_0) {
                                                  break L41;
                                                } else {
                                                  if (var26 != 0) {
                                                    break L40;
                                                  } else {
                                                    if (!var6.field_m) {
                                                      c.a(var39, var38, var22, var23, -16777216, var12);
                                                      if (var46 == 0) {
                                                        break L40;
                                                      } else {
                                                        break L41;
                                                      }
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                              }
                                              L42: {
                                                var40 = var31 + var30 >> 12;
                                                var41 = -var33 + var32 >> 12;
                                                var42 = ((ml) this).field_r + var40;
                                                var43 = ((ml) this).field_n + var41;
                                                var44 = param3.a(var42, (byte) 120);
                                                var45 = param3.b(true, var43);
                                                if (var26 == 0) {
                                                  c.a(var39, var38, var22, var23, -16777216, var12);
                                                  c.a(var45, var44, var24, var25, -16777216, var12);
                                                  break L42;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                              var24 = var44;
                                              var25 = var45;
                                              var21_ref_int__[var27] = var44;
                                              var21_ref_int__[var27 - -1] = var45;
                                              break L40;
                                            }
                                            var26 = 0;
                                            var23 = var39;
                                            var22 = var38;
                                            var27 += 2;
                                            if (var46 == 0) {
                                              continue L37;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_105_0 = var6.field_k;
                                      stackIn_106_0 = stackOut_105_0;
                                      break L38;
                                    }
                                    L43: {
                                      if (stackIn_106_0) {
                                        break L43;
                                      } else {
                                        if (!var6.field_m) {
                                          c.a(var20_ref_int__[1], var20_ref_int__[0], var20_ref_int__[var17_ref_int____[var19].length - 2], var20_ref_int__[var17_ref_int____[var19].length - 1], -16777216, var12);
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    L44: {
                                      var27 = var16;
                                      am.a(param1 + -198, 0, var17_ref_int____[var19].length, var12 | var27, var20_ref_int__);
                                      if (!var6.field_k) {
                                        break L44;
                                      } else {
                                        am.a(-111, 0, var17_ref_int____[var19].length, var16 | var12, var21_ref_int__);
                                        break L44;
                                      }
                                    }
                                    var19++;
                                    if (var46 == 0) {
                                      continue L36;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L30;
                          }
                        }
                      }
                      if (var46 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var16 = 0;
                  L45: while (true) {
                    if (((ml) this).field_g.length <= var16) {
                      break L26;
                    } else {
                      var17 = ((ml) this).field_g[var16];
                      var18 = ((ml) this).field_g[var16 + 1];
                      var19 = ((ml) this).field_g[(2 + var16) % ((ml) this).field_g.length];
                      var20 = ((ml) this).field_g[(3 + var16) % ((ml) this).field_g.length];
                      c.a(param3.b(true, var20), param3.a(var19, (byte) 124), param3.a(var17, (byte) 120), param3.b(true, var18), -16777216, var12);
                      var16 += 2;
                      if (var46 != 0) {
                        break L24;
                      } else {
                        if (var46 == 0) {
                          continue L45;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                }
                stackOut_119_0 = this.d(-128);
                stackIn_120_0 = stackOut_119_0 ? 1 : 0;
                break L25;
              }
              if (stackIn_120_0 == 0) {
                break L24;
              } else {
                var16 = 0;
                L46: while (true) {
                  if (((ml) this).field_g.length <= var16) {
                    break L24;
                  } else {
                    var17 = ((ml) this).field_g[var16];
                    var18 = ((ml) this).field_g[var16 + 1];
                    var19 = ((ml) this).field_r;
                    var20 = ((ml) this).field_n;
                    c.a(param3.b(true, var20), param3.a(var19, (byte) 116), param3.a(var17, (byte) 115), param3.b(true, var18), -16777216, var12);
                    var16 += 2;
                    if (var46 != 0) {
                      break L21;
                    } else {
                      if (var46 == 0) {
                        continue L46;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
              }
            }
            if (((ml) this).field_d == null) {
              break L21;
            } else {
              if (!pqa.a(4, 11284)) {
                break L21;
              } else {
                var16 = 0;
                L47: while (true) {
                  if (((ml) this).field_d.length <= var16) {
                    break L21;
                  } else {
                    if (var46 != 0) {
                      break L21;
                    } else {
                      L48: {
                        if (-1 == ((ml) this).field_d[var16].field_c) {
                          var17 = ((ml) this).field_d[var16].field_e;
                          var18 = ((ml) this).field_d[var16].field_d;
                          var19 = param3.a(var17, (byte) 125);
                          var20 = param3.b(true, var18);
                          if (pqa.a(4, 11284)) {
                            var21 = fc.a(((ml) this).field_b + var47.field_o[var16].field_a, (byte) -93) * 8 >> 8;
                            var22 = eu.a(var47.field_o[var16].field_a + ((ml) this).field_b, 99) * 8 >> 8;
                            c.a(param3.b(true, var22 + var18), param3.a(var17 - -var21, (byte) 119), var19, var20, -16777216, 16711680);
                            cka.a(-1, Integer.toString(var16), 16711935, var20, var19, param1 ^ 4350);
                            break L48;
                          } else {
                            break L48;
                          }
                        } else {
                          break L48;
                        }
                      }
                      var16++;
                      if (var46 == 0) {
                        continue L47;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L21;
          }
        }
    }

    final int a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        wfb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (((ml) this).k((byte) 110)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        ((ml) this).field_i = ((ml) this).field_i + param2;
        var5 = ((ml) this).i((byte) -112);
        if (((ml) this).field_i <= var5.field_p) {
          L1: {
            if (!((ml) this).k((byte) 52)) {
              break L1;
            } else {
              if (var4 != 0) {
                if (param0) {
                  break L1;
                } else {
                  if (((ml) this).field_f == null) {
                    break L1;
                  } else {
                    if (((ml) this).field_f.length <= 0) {
                      break L1;
                    } else {
                      var6 = 0;
                      L2: while (true) {
                        if (((ml) this).field_f.length <= var6) {
                          break L1;
                        } else {
                          int discarded$1 = ((ml) this).field_f[var6].g(-((ml) this).field_f[var6].field_i, 3);
                          var6++;
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
          }
          if (param1) {
            ((ml) this).field_o = -14;
            return 0;
          } else {
            return 0;
          }
        } else {
          var6 = -var5.field_p + ((ml) this).field_i;
          if (!param0) {
            if (null != ((ml) this).field_f) {
              if (((ml) this).field_f.length > 0) {
                var7 = 0;
                L3: while (true) {
                  if (((ml) this).field_f.length > var7) {
                    var8 = ((ml) this).field_f[var7].g(var6, 3);
                    var6 = var8;
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var9 == 0) {
                      if (stackIn_15_0 != var6) {
                        var7++;
                        continue L3;
                      } else {
                        ((ml) this).field_i = var5.field_p;
                        return var6;
                      }
                    } else {
                      return stackIn_14_0;
                    }
                  } else {
                    ((ml) this).field_i = var5.field_p;
                    return var6;
                  }
                }
              } else {
                ((ml) this).field_i = var5.field_p;
                return var6;
              }
            } else {
              ((ml) this).field_i = var5.field_p;
              return var6;
            }
          } else {
            ((ml) this).field_i = var5.field_p;
            return var6;
          }
        }
    }

    final boolean k(byte param0) {
        if (param0 < 40) {
            ml discarded$0 = ((ml) this).d(-95, -20);
        }
        return ((ml) this).field_i <= 0 ? true : false;
    }

    private final void b(faa param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
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
              if (!this.d((byte) -94)) {
                break L1;
              } else {
                param0.a(-632, ((ml) this).field_p, 14);
                break L1;
              }
            }
            L2: {
              var3_int = -63 / ((9 - param1) / 47);
              stackOut_2_0 = (faa) param0;
              stackOut_2_1 = -115;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (((ml) this).field_i == ((ml) this).i((byte) -112).field_p) {
                stackOut_4_0 = (faa) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L2;
              } else {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L2;
              }
            }
            L3: {
              if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 == 0)) {
                break L3;
              } else {
                param0.a(-632, ((ml) this).field_i, iia.a(-88, ((ml) this).i((byte) -112).field_p));
                break L3;
              }
            }
            L4: {
              if (this.f((byte) -98)) {
                param0.a(-632, ((ml) this).field_e, 9);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ml.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, int[] param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                ((ml) this).field_q = 110;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (((ml) this).field_c == null) {
                    break L4;
                  } else {
                    if (((ml) this).field_c.a((byte) 24).h((byte) 55)) {
                      break L3;
                    } else {
                      if (((ml) this).field_c.a((byte) 24).b((byte) 29) > 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var10_int = fc.a(((ml) this).field_b, (byte) -103);
                var11 = eu.a(((ml) this).field_b, 57);
                gaa.field_o = var10_int;
                pua.field_p = var11;
                if (var13 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              this.a(param5, param3, 0, param1, param2, param6, param0, param7, param8);
              break L2;
            }
            L5: {
              if (null == ((ml) this).field_f) {
                break L5;
              } else {
                if (((ml) this).field_f.length <= 0) {
                  break L5;
                } else {
                  var10_int = gaa.field_o;
                  var11 = pua.field_p;
                  var12 = 0;
                  L6: while (true) {
                    if (((ml) this).field_f.length <= var12) {
                      break L5;
                    } else {
                      ((ml) this).field_f[var12].a(var11, ((ml) this).field_b, var10_int, ((ml) this).field_n, true, param5, param6, ((ml) this).field_r, param8);
                      var12++;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        if (var13 == 0) {
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var10;
            stackOut_17_1 = new StringBuilder().append("ml.QC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param8 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    public final void a(tv param0, int param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        try {
          L0: {
            var3 = (ml) (Object) param0;
            if (param1 < -19) {
              L1: {
                if (var3.field_c == null) {
                  break L1;
                } else {
                  if (var3.field_c == null) {
                    break L1;
                  } else {
                    var3.field_c.a((tv) (Object) var3.field_c, -53);
                    break L1;
                  }
                }
              }
              L2: {
                if (var3.field_a == null) {
                  break L2;
                } else {
                  if (null != var3.field_a) {
                    var3.field_a.a((tv) (Object) var3.field_a, -28);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var3.field_k == null) {
                  break L3;
                } else {
                  if (var3.field_k != null) {
                    var3.field_k.a((tv) (Object) var3.field_k, -37);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == var3.field_h) {
                  break L4;
                } else {
                  if (var3.field_h == null) {
                    break L4;
                  } else {
                    if (((Object) (Object) var3.field_h).getClass() != ((Object) (Object) var3.field_h).getClass()) {
                      break L4;
                    } else {
                      var3.field_h.a((tv) (Object) var3.field_h, -36);
                      break L4;
                    }
                  }
                }
              }
              L5: {
                boolean discarded$6 = tja.a((ntb[]) (Object) var3.field_f, 1, (ntb[]) (Object) var3.field_f, false, 5547);
                boolean discarded$7 = tja.a((ntb[]) (Object) var3.field_d, 1, (ntb[]) (Object) var3.field_d, false, 5547);
                var4 = 0;
                if (var3.field_j != var3.field_j) {
                  System.out.println("int component_type_id has changed. before=" + var3.field_j + ", now=" + var3.field_j);
                  var4 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var3.field_e == var3.field_e) {
                  break L6;
                } else {
                  System.out.println("int triggermap has changed. before=" + var3.field_e + ", now=" + var3.field_e);
                  var4 = 1;
                  break L6;
                }
              }
              L7: {
                if (var3.field_o != var3.field_o) {
                  var4 = 1;
                  System.out.println("int connectionpointx has changed. before=" + var3.field_o + ", now=" + var3.field_o);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var3.field_m != var3.field_m) {
                  var4 = 1;
                  System.out.println("int connectionpointy has changed. before=" + var3.field_m + ", now=" + var3.field_m);
                  break L8;
                } else {
                  break L8;
                }
              }
              qjb discarded$8 = var3.field_c;
              L9: {
                if (var3.field_c == null) {
                  break L9;
                } else {
                  if (!var3.field_c.a((byte) 114, (tv) (Object) var3.field_c)) {
                    break L9;
                  } else {
                    System.out.println("WeaponBehaviour weaponbehaviour has changed. before=" + var3.field_c + ", now=" + var3.field_c);
                    var4 = 1;
                    break L9;
                  }
                }
              }
              aqa discarded$9 = var3.field_a;
              L10: {
                if (var3.field_a == null) {
                  break L10;
                } else {
                  if (!var3.field_a.a((byte) 109, (tv) (Object) var3.field_a)) {
                    break L10;
                  } else {
                    System.out.println("ThrusterBehaviour thrusterbehaviour has changed. before=" + var3.field_a + ", now=" + var3.field_a);
                    var4 = 1;
                    break L10;
                  }
                }
              }
              lja discarded$10 = var3.field_k;
              L11: {
                if (var3.field_k == null) {
                  break L11;
                } else {
                  if (!var3.field_k.a((byte) 110, (tv) (Object) var3.field_k)) {
                    break L11;
                  } else {
                    var4 = 1;
                    System.out.println("GrappleLauncherBehaviour grapplebehaviour has changed. before=" + var3.field_k + ", now=" + var3.field_k);
                    break L11;
                  }
                }
              }
              eka discarded$11 = var3.field_h;
              L12: {
                L13: {
                  L14: {
                    if (null == var3.field_h) {
                      break L14;
                    } else {
                      if (((Object) (Object) var3.field_h).getClass() != ((Object) (Object) var3.field_h).getClass()) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var3.field_h == null) {
                    break L12;
                  } else {
                    if (!var3.field_h.a((byte) -125, (tv) (Object) var3.field_h)) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                System.out.println("ComponentBehaviour behaviour has changed. before=" + var3.field_h + ", now=" + var3.field_h);
                var4 = 1;
                break L12;
              }
              L15: {
                if (dn.a((tv[]) (Object) var3.field_f, false, 1, (tv[]) (Object) var3.field_f, -9)) {
                  System.out.println("Component[] subcomponents has changed. ");
                  var4 = 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (dn.a((tv[]) (Object) var3.field_d, false, 1, (tv[]) (Object) var3.field_d, 118)) {
                  System.out.println("Hardpoint[] hardpoints has changed. ");
                  var4 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var3.field_q == var3.field_q) {
                  break L17;
                } else {
                  var4 = 1;
                  System.out.println("int connectedangle has changed. before=" + var3.field_q + ", now=" + var3.field_q);
                  break L17;
                }
              }
              L18: {
                if (var3.field_p != var3.field_p) {
                  var4 = 1;
                  System.out.println("int currentconnectedangle has changed. before=" + var3.field_p + ", now=" + var3.field_p);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (var3.field_i == var3.field_i) {
                  break L19;
                } else {
                  System.out.println("int health has changed. before=" + var3.field_i + ", now=" + var3.field_i);
                  var4 = 1;
                  break L19;
                }
              }
              L20: {
                if (var3.field_r != var3.field_r) {
                  System.out.println("int finalx has changed. before=" + var3.field_r + ", now=" + var3.field_r);
                  var4 = 1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (var3.field_n != var3.field_n) {
                  var4 = 1;
                  System.out.println("int finaly has changed. before=" + var3.field_n + ", now=" + var3.field_n);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (var3.field_b == var3.field_b) {
                  break L22;
                } else {
                  System.out.println("int finalangle has changed. before=" + var3.field_b + ", now=" + var3.field_b);
                  var4 = 1;
                  break L22;
                }
              }
              L23: {
                if (ikb.a(var3.field_g, var3.field_g, false)) {
                  System.out.println("int[] finaloutline has changed. ");
                  var4 = 1;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if (var4 == 0) {
                  break L24;
                } else {
                  System.out.println("This instance of Component has changed, where component_type_id=" + var3.field_j);
                  break L24;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var3_ref = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) var3_ref;
            stackOut_82_1 = new StringBuilder().append("ml.F(");
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param0 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L25;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L25;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2, boolean param3, byte param4, int param5, int[] param6) {
        int var8_int = 0;
        int var9 = 0;
        try {
            var8_int = fc.a(param0, (byte) -96);
            if (param4 < 84) {
                ((ml) this).a((ij) null, (sg) null, 87);
            }
            var9 = eu.a(param0, 84);
            this.a(param2, var9, param3, param0, param6, param1, 256, var8_int, param5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ml.AB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var4 = VoidHunters.field_G;
            var2 = param0;
            if (((ml) this).field_f == null) {
              break L1;
            } else {
              var3 = 0;
              L2: while (true) {
                if (((ml) this).field_f.length <= var3) {
                  break L1;
                } else {
                  stackOut_3_0 = var2 + ((ml) this).field_f[var3].j(1);
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    var2 = stackIn_4_0;
                    var3++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_5_0 = var2;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0;
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (((ml) this).field_j == param1) {
            if (null != ((ml) this).field_c) {
              ((ml) this).field_c.field_b = 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 > 63) {
            break L1;
          } else {
            this.a((Random) null, (pe) null, 35, (byte) -68, 76, (anb) null);
            break L1;
          }
        }
        L2: {
          if (null != ((ml) this).field_f) {
            var3 = 0;
            L3: while (true) {
              if (var3 >= ((ml) this).field_f.length) {
                break L2;
              } else {
                ((ml) this).field_f[var3].e(93, param1);
                var3++;
                if (var4 != 0) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final int[] a(int param0, int param1, int param2, byte param3, int param4, int param5, int[] param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param3 <= -1) {
                break L1;
              } else {
                boolean discarded$2 = this.a((ml) null, 51, (ml) null, (ml) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ml) this).field_f == null) {
                  break L3;
                } else {
                  var8_int = 0;
                  L4: while (true) {
                    if (((ml) this).field_f.length <= var8_int) {
                      break L3;
                    } else {
                      param6 = ((ml) this).field_f[var8_int].a(param0, param1, param2 | 1 + var8_int << 4 * param5, (byte) -45, param4, 1 + param5, param6);
                      var8_int++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              if (!ujb.a((byte) -57, ((ml) this).field_g, param4, param1, param0)) {
                break L2;
              } else {
                if (((ml) this).field_i < ((ml) this).i((byte) -112).field_p) {
                  param6 = kdb.a(param6, param2, (byte) -106);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_13_0 = (int[]) param6;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("ml.FB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          var5 = ar.a(param3 - ((ml) this).field_r, (byte) 124, param1 + -((ml) this).field_n) + ((ml) this).i((byte) -112).field_l;
          if (param2 <= -61) {
            break L0;
          } else {
            this.b((faa) null, (byte) -13);
            break L0;
          }
        }
        L1: {
          if (var5 <= param0) {
            break L1;
          } else {
            param0 = var5;
            break L1;
          }
        }
        L2: {
          L3: {
            if (((ml) this).field_f != null) {
              var6 = 0;
              L4: while (true) {
                if (var6 >= ((ml) this).field_f.length) {
                  break L3;
                } else {
                  stackOut_8_0 = ((ml) this).field_f[var6].a(param0, param1, -114, param3);
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var7 != 0) {
                    break L2;
                  } else {
                    param0 = stackIn_9_0;
                    var6++;
                    if (var7 == 0) {
                      continue L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            } else {
              break L3;
            }
          }
          stackOut_10_0 = param0;
          stackIn_11_0 = stackOut_10_0;
          break L2;
        }
        return stackIn_11_0;
    }

    final void a(int param0, int param1, pe param2, byte param3, int param4, anb param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((ml) this).i((byte) -112).b(-1) != param0) {
                break L1;
              } else {
                if (((ml) this).k((byte) 67)) {
                  break L1;
                } else {
                  ((ml) this).a(param5, param1, param2, param4, 50, 256);
                  break L1;
                }
              }
            }
            L2: {
              if (param3 < -47) {
                break L2;
              } else {
                ((ml) this).field_o = -103;
                break L2;
              }
            }
            L3: {
              if (((ml) this).field_f != null) {
                var7_int = 0;
                L4: while (true) {
                  if (((ml) this).field_f.length <= var7_int) {
                    break L3;
                  } else {
                    ((ml) this).field_f[var7_int].a(param0, param1, param2, (byte) -102, param4, param5);
                    var7_int++;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("ml.A(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    private final void a(pe param0, int param1, boolean param2, anb param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ml) this).field_f != null) {
                  var5_int = 0;
                  L3: while (true) {
                    if (var5_int >= ((ml) this).field_f.length) {
                      break L2;
                    } else {
                      var6 = ((ml) this).field_f[var5_int];
                      var7 = var6.a(param1, param0, param3) ? 1 : 0;
                      stackOut_5_0 = var7;
                      stackIn_14_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_6_0 == 0) {
                            break L4;
                          } else {
                            L5: {
                              if (param2) {
                                var8 = var6.i((byte) -112).field_y;
                                if (var8 <= 0) {
                                  break L5;
                                } else {
                                  param0.a((byte) -44, param3, var6, var6.i((byte) -112));
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var6.a(param0, -19625, param3);
                            this.f(115, var5_int);
                            var5_int = -1 + var5_int;
                            param3.e((byte) 119);
                            var6.a(true, param0, param3, (byte) -113);
                            break L4;
                          }
                        }
                        var5_int++;
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_13_0 = param1;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            L6: {
              if (stackIn_14_0 == 0) {
                break L6;
              } else {
                ((ml) this).field_d = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("ml.I(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    private final int a(boolean param0, wfb param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4_int = 0;
            if (!param0) {
              break L0;
            } else {
              if (((ml) this).field_c == null) {
                break L0;
              } else {
                if (((ml) this).field_c.field_b > 0) {
                  var5 = ((ml) this).field_c.a(89);
                  if (var5 > 0) {
                    var4_int = param1.field_l * var5 >> 8;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return var4_int;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ml.ID(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 1 + 41);
        }
    }

    final int a(byte param0) {
        if (param0 <= 43) {
            ((ml) this).a((ij) null, (sg) null, 87);
        }
        return ((ml) this).field_n;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (null == ((ml) this).field_a) {
            break L0;
          } else {
            ((ml) this).field_a.b(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ml) this).field_f) {
              break L2;
            } else {
              var2 = 0;
              L3: while (true) {
                if (var2 >= ((ml) this).field_f.length) {
                  break L2;
                } else {
                  ((ml) this).field_f[var2].g(0);
                  var2++;
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          if (param0 == 0) {
            break L1;
          } else {
            ((ml) this).a(59, -127, (pe) null, (byte) 46, 109, (anb) null);
            break L1;
          }
        }
    }

    private final void a(int param0, faa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (!this.d((byte) -94)) {
                break L1;
              } else {
                ((ml) this).field_p = uwa.a(14, param1, (byte) 20);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!kv.a(false, param1)) {
                  break L3;
                } else {
                  ((ml) this).field_i = param1.i(0, iia.a(-111, ((ml) this).i((byte) -112).field_p));
                  if (VoidHunters.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((ml) this).field_i = ((ml) this).i((byte) -112).field_p;
              break L2;
            }
            L4: {
              if (!this.f((byte) -15)) {
                break L4;
              } else {
                ((ml) this).field_e = param1.i(0, 9);
                break L4;
              }
            }
            L5: {
              this.c(true);
              if (param0 == 0) {
                break L5;
              } else {
                ((ml) this).field_c = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ml.RA(").append(param0).append(44);
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
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(ij param0, sg param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (~((ml) this).i((byte) -112).b(-1) == param2) {
                break L1;
              } else {
                L2: {
                  var4_int = this.a(param1, param2 ^ 10298);
                  if (!((ml) this).k((byte) 84)) {
                    break L2;
                  } else {
                    if (var4_int == 0) {
                      var4_int++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                param0.b(-10258, (ksa) (Object) new ihb(((ml) this).i((byte) -112).b(-1), var4_int));
                break L1;
              }
            }
            L3: {
              if (((ml) this).field_f == null) {
                break L3;
              } else {
                var4_int = 0;
                L4: while (true) {
                  if (((ml) this).field_f.length <= var4_int) {
                    break L3;
                  } else {
                    ((ml) this).field_f[var4_int].a(param0, param1, 0);
                    var4_int++;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ml.VC(");
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = -97 / ((-34 - param1) / 62);
        var3 = ((ml) this).i((byte) -112).field_B;
        if (var3 != 0) {
          ((ml) this).field_i = ((ml) this).field_i - (var3 * param0 >> 8);
          if (((ml) this).field_i < 0) {
            var5 = -((ml) this).field_i;
            ((ml) this).field_i = 0;
            return (var5 << 8) / var3;
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    private final void a(int param0, ij param1, ml param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((ml) this).field_f) {
                  break L2;
                } else {
                  var7_int = 0;
                  L3: while (true) {
                    if (var7_int >= ((ml) this).field_f.length) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var7_int].a(param0 + 1, param1, param2, param3 | 1 + var7_int << param0 * 4, 0, param5);
                      var7_int++;
                      if (var20 != 0) {
                        break L1;
                      } else {
                        if (var20 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (ar.a(((ml) this).field_r + -param2.field_r, (byte) 119, ((ml) this).field_n - param2.field_n) <= ((ml) this).i((byte) -112).field_l - -param2.i((byte) -112).field_l) {
                break L1;
              } else {
                return;
              }
            }
            var7_int = param4;
            L4: while (true) {
              stackOut_10_0 = var7_int;
              stackIn_11_0 = stackOut_10_0;
              L5: while (true) {
                L6: {
                  if (stackIn_11_0 >= ((ml) this).field_g.length) {
                    break L6;
                  } else {
                    var8 = ((ml) this).field_g[var7_int];
                    var9 = ((ml) this).field_g[var7_int + 1];
                    var10 = ((ml) this).field_g[(var7_int + 2) % ((ml) this).field_g.length];
                    var11 = ((ml) this).field_g[(var7_int + 3) % ((ml) this).field_g.length];
                    if (var20 != 0) {
                      break L6;
                    } else {
                      var12 = 0;
                      L7: while (true) {
                        L8: {
                          if (var12 >= param2.field_g.length) {
                            break L8;
                          } else {
                            var13 = param2.field_g[var12];
                            var14 = param2.field_g[1 + var12];
                            var15 = param2.field_g[(var12 - -2) % param2.field_g.length];
                            var16 = param2.field_g[(3 + var12) % param2.field_g.length];
                            var17 = ng.a(8, var9, (byte) 88, var8, var15, var10, var14, var13, var16, var11);
                            stackOut_15_0 = ~var17;
                            stackIn_11_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (var20 != 0) {
                              continue L5;
                            } else {
                              L9: {
                                if (stackIn_16_0 == 0) {
                                  break L9;
                                } else {
                                  if (var17 <= 10) {
                                    break L9;
                                  } else {
                                    if (var17 < 245) {
                                      var18 = var8 + (var17 * (var10 + -var8) >> 8);
                                      var19 = var9 + ((var11 - var9) * var17 >> 8);
                                      param1.b(-10258, (ksa) (Object) new gda((ml) this, param3, param2, param5, var18, var19, var7_int >> 1, var12 >> 1));
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var12 += 2;
                              if (var20 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        var7_int += 2;
                        if (var20 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("ml.JD(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(byte param0, anb param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        aqa stackIn_25_0 = null;
        aqa stackIn_26_0 = null;
        aqa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        aqa stackOut_24_0 = null;
        aqa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        aqa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ml) this).field_a == null) {
                  break L2;
                } else {
                  if (((ml) this).field_a.a(((ml) this).field_j, (byte) -61)) {
                    break L2;
                  } else {
                    L3: {
                      ((ml) this).field_e = 0;
                      if (!(param1 instanceof sg)) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            var3_int = param1.field_t;
                            var4 = param1.field_o;
                            var5 = param1.field_p;
                            var6 = ((ml) this).field_a.a(((ml) this).field_j, false);
                            param1.a(((ml) this).field_n, ((ml) this).field_b, ((ml) this).field_r, var6, 1948934248);
                            var7 = -var3_int + param1.field_t >> 8;
                            var8 = param1.field_o + -var4 >> 8;
                            var9 = param1.field_p + -var5;
                            var10 = fc.a(param1.e(0), (byte) -119) >> 8;
                            var11 = eu.a(param1.e(0), 114) >> 8;
                            var12 = rrb.a(22433, -2048 + param1.e(0));
                            var13 = fc.a(var12, (byte) -78) >> 8;
                            var14 = eu.a(var12, 96) >> 8;
                            var15 = var10 * var7 - -(var8 * var11);
                            var16 = var8 * var14 + var13 * var7;
                            var17 = Math.max(var8 * var8 + var7 * var7, 1);
                            var18 = 256 * var15 / var17;
                            if (var9 > 0) {
                              break L5;
                            } else {
                              if (var9 < 0) {
                                ((ml) this).field_e = ((ml) this).field_e | 4;
                                if (var21 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((ml) this).field_e = ((ml) this).field_e | 8;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var19 = 256 * var16 / var17;
                            var20 = 128;
                            if (var15 <= 0) {
                              break L7;
                            } else {
                              if (var20 >= var18) {
                                break L7;
                              } else {
                                ((ml) this).field_e = ((ml) this).field_e | 1;
                                if (var21 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var15 >= 0) {
                            break L6;
                          } else {
                            if (-var20 <= var18) {
                              break L6;
                            } else {
                              ((ml) this).field_e = ((ml) this).field_e | 2;
                              break L6;
                            }
                          }
                        }
                        L8: {
                          param1.field_t = var3_int;
                          param1.field_p = var5;
                          param1.field_o = var4;
                          if (var16 <= 0) {
                            break L8;
                          } else {
                            if (var19 <= var20) {
                              break L8;
                            } else {
                              ((ml) this).field_e = ((ml) this).field_e | 32;
                              if (var21 == 0) {
                                break L3;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var16 >= 0) {
                          break L3;
                        } else {
                          if (-var20 > var19) {
                            ((ml) this).field_e = ((ml) this).field_e | 64;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L9: {
                      stackOut_24_0 = ((ml) this).field_a;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if ((99 & ((ml) this).field_e) == 0) {
                        stackOut_26_0 = (aqa) (Object) stackIn_26_0;
                        stackOut_26_1 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L9;
                      } else {
                        stackOut_25_0 = (aqa) (Object) stackIn_25_0;
                        stackOut_25_1 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        break L9;
                      }
                    }
                    ((aqa) (Object) stackIn_27_0).a(stackIn_27_1 != 0, 1024);
                    if (var21 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (null == ((ml) this).field_a) {
                break L1;
              } else {
                ((ml) this).field_a.a(param1 instanceof sg, 1024);
                ((ml) this).field_a.a(((ml) this).field_j, param1, -24213);
                break L1;
              }
            }
            L10: {
              L11: {
                if (null == ((ml) this).field_f) {
                  break L11;
                } else {
                  var3_int = 0;
                  L12: while (true) {
                    if (((ml) this).field_f.length <= var3_int) {
                      break L11;
                    } else {
                      ((ml) this).field_f[var3_int].a((byte) 115, param1);
                      var3_int++;
                      if (var21 != 0) {
                        break L10;
                      } else {
                        if (var21 == 0) {
                          continue L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
              }
              var3_int = 7 % ((param0 - -76) / 43);
              break L10;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("ml.VA(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    final void a(boolean param0, ml param1, pe param2, int param3, anb param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        nbb var8 = null;
        int var9 = 0;
        ml stackIn_6_0 = null;
        ml stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_5_0 = null;
        Object stackOut_18_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (null != ((ml) this).field_f) {
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= ((ml) this).field_f.length) {
                        break L3;
                      } else {
                        stackOut_5_0 = (ml) param1;
                        stackIn_19_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 == ((ml) this).field_f[var6_int]) {
                                break L6;
                              } else {
                                ((ml) this).field_f[var6_int].a(param0, param1, param2, 90, param4);
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              var7 = param1.field_b;
                              if (null == param1.field_a) {
                                break L7;
                              } else {
                                var7 = rrb.a(22433, var7 - -4096);
                                break L7;
                              }
                            }
                            L8: {
                              param1.a(param2, -19625, param4);
                              var8 = new nbb(param1, param0);
                              var8.field_f = param4.field_f;
                              var8.field_h = param4.field_h;
                              param2.a(var8, (byte) 37);
                              if (param0) {
                                break L8;
                              } else {
                                if (wr.field_o > 0) {
                                  var8.a(var8.field_e, var7, var8.field_d, var8.e(false) * wr.field_o >> 8, 1948934248);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            this.f(126, var6_int);
                            param4.e((byte) 119);
                            break L5;
                          }
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (param3 >= 23) {
                  break L1;
                } else {
                  stackOut_18_0 = this;
                  stackIn_19_0 = (ml) (Object) stackOut_18_0;
                  break L2;
                }
              }
              stackIn_19_0.field_c = null;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ml.DC(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    final boolean a(int param0, ml param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 16) {
                break L1;
              } else {
                ((ml) this).field_b = -93;
                break L1;
              }
            }
            L2: {
              if (((ml) this).field_f == null) {
                break L2;
              } else {
                var3_int = 0;
                L3: while (true) {
                  if (((ml) this).field_f.length <= var3_int) {
                    break L2;
                  } else {
                    if (((ml) this).field_f[var3_int] == param1) {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    } else {
                      if (((ml) this).field_f[var3_int].a(param0, param1)) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        var3_int++;
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ml.SB(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0 != 0;
    }

    private final void a(int param0, int param1, boolean param2, int param3, int[] param4, boolean param5, int param6, int param7, int param8) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param6 == 256) {
                break L1;
              } else {
                ((ml) this).a((pe) null, (byte) -46, (anb) null);
                break L1;
              }
            }
            L2: {
              this.a(param5, param0, 0, param3, param7, param2, param1, param8, param4);
              if (((ml) this).field_f == null) {
                break L2;
              } else {
                if (((ml) this).field_f.length > 0) {
                  var10_int = gaa.field_o;
                  var11 = pua.field_p;
                  var12 = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var12) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var12].a(((ml) this).field_n, var11, param2, ((ml) this).field_b, param4, param5, 256, var10_int, ((ml) this).field_r);
                      var12++;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        if (var13 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var10;
            stackOut_12_1 = new StringBuilder().append("ml.UC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    private final boolean a(ml param0, int param1, ml param2, ml param3) {
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -23) {
                break L1;
              } else {
                ((ml) this).field_o = 125;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3.field_j != 22) {
                  break L3;
                } else {
                  L4: {
                    if (param2.i((byte) -112).field_a == 2) {
                      break L4;
                    } else {
                      if (param0 != param2) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ml.GB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final ml[] a(ml[] param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ml[] stackIn_6_0 = null;
        ml[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml[] stackOut_5_0 = null;
        ml[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -63 % ((param1 - -44) / 42);
                if (((ml) this).field_f != null) {
                  var4 = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var4) {
                      break L2;
                    } else {
                      param0 = (ml[]) (Object) ija.a((Object) (Object) ((ml) this).field_f[var4], (Object[]) (Object) param0, 0, ii.field_d);
                      stackOut_5_0 = ((ml) this).field_f[var4].a(param0, (byte) -127);
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        param0 = stackIn_6_0;
                        var4++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_7_0 = (ml[]) param0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ml.P(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                ((ml) this).field_j = param0.i(0, 6);
                if (!kv.a(false, param0)) {
                  break L2;
                } else {
                  L3: {
                    if (null == ((ml) this).field_c) {
                      ((ml) this).field_c = new qjb();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((ml) this).field_c.a(param0, false);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ml) this).field_c = null;
              break L1;
            }
            L4: {
              L5: {
                if (kv.a(false, param0)) {
                  break L5;
                } else {
                  ((ml) this).field_a = null;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (null == ((ml) this).field_a) {
                  ((ml) this).field_a = new aqa();
                  break L6;
                } else {
                  break L6;
                }
              }
              ((ml) this).field_a.a(param0, param1);
              break L4;
            }
            L7: {
              L8: {
                if (kv.a(param1, param0)) {
                  break L8;
                } else {
                  ((ml) this).field_k = null;
                  if (var4 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (((ml) this).field_k != null) {
                  break L9;
                } else {
                  ((ml) this).field_k = new lja();
                  break L9;
                }
              }
              ((ml) this).field_k.a(param0, param1);
              break L7;
            }
            L10: {
              L11: {
                if (!kv.a(false, param0)) {
                  break L11;
                } else {
                  L12: {
                    if (null == ((ml) this).field_h) {
                      L13: {
                        var3_int = param0.i(0, 1);
                        if (0 == var3_int) {
                          break L13;
                        } else {
                          if (var3_int != 1) {
                            break L12;
                          } else {
                            ((ml) this).field_h = (eka) (Object) new kma();
                            if (var4 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      ((ml) this).field_h = (eka) (Object) new mua();
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ((ml) this).field_h.a(param0, false);
                  if (var4 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              ((ml) this).field_h = null;
              break L10;
            }
            ((ml) this).field_f = (ml[]) (Object) kcb.a(5, ii.field_d, param0, 1, -85, (tv[]) (Object) ((ml) this).field_f);
            ((ml) this).field_d = (imb[]) (Object) kcb.a(5, ta.field_a, param0, 1, -63, (tv[]) (Object) ((ml) this).field_d);
            this.a(0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("ml.H(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 41);
        }
    }

    private final boolean f(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 22 % ((param0 - -61) / 32);
            if (null != ((ml) this).field_c) {
              break L1;
            } else {
              if (null == ((ml) this).field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final ml[] a(int param0, Random param1, ml[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ml[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((ml) this).field_a = null;
                break L1;
              }
            }
            L2: {
              if (null == ((ml) this).field_f) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((ml) this).field_f.length) {
                    break L2;
                  } else {
                    L4: {
                      L5: {
                        L6: {
                          var5 = hob.a(param1, 100, 122);
                          if (js.field_s <= var5) {
                            break L6;
                          } else {
                            if (((ml) this).field_f[var4_int].field_j != 47) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (0 < ((ml) this).field_f[var4_int].field_i) {
                          break L4;
                        } else {
                          ((ml) this).field_f[var4_int].field_i = 1;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((ml) this).field_f[var4_int].field_i = 0;
                      param2 = (ml[]) (Object) ija.a((Object) (Object) ((ml) this).field_f[var4_int], (Object[]) (Object) param2, 0, ii.field_d);
                      break L4;
                    }
                    param2 = ((ml) this).field_f[var4_int].a(0, param1, param2);
                    var4_int++;
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_14_0 = (ml[]) param2;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("ml.BB(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_15_0;
    }

    private final int c(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (param1 == 0) {
            break L0;
          } else {
            if (((ml) this).c(112) <= 0) {
              break L0;
            } else {
              if (((ml) this).field_i > 0) {
                L1: {
                  L2: {
                    var3 = 0;
                    if (param1 > 0) {
                      break L2;
                    } else {
                      var3 = Math.abs(rrb.a(22433, ((ml) this).field_q - (((ml) this).c(-116) - -((ml) this).field_p)));
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var3 = Math.abs(rrb.a(22433, ((ml) this).field_q - (-((ml) this).c(124) + ((ml) this).field_p)));
                  break L1;
                }
                L3: {
                  var4 = this.b((byte) 103);
                  if (lrb.field_e == 1) {
                    L4: {
                      if (((ml) this).field_c == null) {
                        break L4;
                      } else {
                        if (!((ml) this).field_c.a(true)) {
                          break L4;
                        } else {
                          var4 = 2048;
                          ((ml) this).field_c.a(false, true);
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return param1;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  var5 = Math.min(Math.min(var4, Math.abs(param1)), var3);
                  if (param1 < 0) {
                    var5 = -var5;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((ml) this).field_p = rrb.a(22433, var5 + ((ml) this).field_p);
                param1 = param1 - var5;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        if (param0 > -68) {
          return -4;
        } else {
          return param1;
        }
    }

    private final int b(byte param0) {
        if (((ml) this).field_h == null) {
          if (((ml) this).field_c == null) {
            if (null != ((ml) this).field_k) {
              return ((ml) this).field_k.d((byte) 126);
            } else {
              return 0;
            }
          } else {
            return ((ml) this).field_c.e((byte) -4);
          }
        } else {
          return ((ml) this).field_h.b((byte) 118);
        }
    }

    public static void e(int param0) {
        field_l = null;
        if (param0 != 24388) {
            field_l = null;
        }
    }

    private final void c(boolean param0) {
        wfb var2 = null;
        int var3 = 0;
        imb var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          var2 = hab.field_g[((ml) this).field_j];
          ((ml) this).field_g = new int[var2.field_v.length];
          if (((ml) this).field_d == null) {
            break L0;
          } else {
            var3 = 0;
            L1: while (true) {
              if (((ml) this).field_d.length <= var3) {
                break L0;
              } else {
                var4 = ((ml) this).field_d[var3];
                var5 = var4.field_c;
                if (var7 != 0) {
                  break L0;
                } else {
                  L2: {
                    if (0 > var5) {
                      break L2;
                    } else {
                      var6 = ((ml) this).field_f[var5];
                      this.a(var6, (byte) 83, ((ml) this).i((byte) -112), var3);
                      if (!var6.d((byte) -91)) {
                        var6.h((byte) 42);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var3++;
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((ml) this).field_f != null) {
            var2 = 0;
            L1: while (true) {
              if (((ml) this).field_f.length <= var2) {
                break L0;
              } else {
                ((ml) this).field_f[var2].i(94);
                var2++;
                if (var3 == 0) {
                  continue L1;
                } else {
                  L2: {
                    if (this.a(true)) {
                      var2 = rrb.a(22433, ((ml) this).field_q + -((ml) this).field_p);
                      int discarded$20 = this.c((byte) -105, var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 < 93) {
          return;
        } else {
          L3: {
            if (this.a(true)) {
              var2 = rrb.a(22433, ((ml) this).field_q + -((ml) this).field_p);
              int discarded$21 = this.c((byte) -105, var2);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final qua a(boolean param0, anb param1, int param2, int param3, int param4, int param5, ml param6, int param7) {
        RuntimeException var9 = null;
        lu var9_ref = null;
        int var10 = 0;
        qua var11 = null;
        ml var12 = null;
        lsb var13 = null;
        imb var14 = null;
        ml var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        ij var19 = null;
        Object var20 = null;
        fka var20_ref = null;
        int var21 = 0;
        lu var22 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        qua stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        qua stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var20 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            var22 = ((ml) this).a(param7, false, param5, param2, param4, param6, -29866, (anb) null);
            var9_ref = var22;
            if (var9_ref != null) {
              L1: {
                var10 = param1.e(0);
                var11 = new qua(var9_ref);
                var12 = var9_ref.field_b;
                var13 = var12.i((byte) -112).field_o[var22.field_e];
                var14 = var12.field_d[var22.field_e];
                var15 = param1.field_k;
                var16 = var13.field_a + var12.field_b;
                if (null != var15.field_a) {
                  var16 = rrb.a(22433, var16 + 4096);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  var17 = var15.b(-10) * fc.a(var10, (byte) -89) - var15.c((byte) 100) * eu.a(var10, 49) >> 16;
                  var18 = var15.b(124) * eu.a(var10, param3 ^ -120) + var15.c((byte) 100) * fc.a(var10, (byte) -72) >> 16;
                  var15.a(false, var14.field_e - var17, -var18 + var14.field_d, var16, param3 ^ param3, (int[]) null);
                  var19 = new ij();
                  param6.a(var15, 0, 0, (byte) -126, var19);
                  if (var19.c(3) <= 0) {
                    break L3;
                  } else {
                    var20_ref = (fka) (Object) var19.d(0);
                    L4: while (true) {
                      if (var20_ref == null) {
                        break L3;
                      } else {
                        stackOut_10_0 = ~var20_ref.field_e;
                        stackOut_10_1 = -256;
                        stackIn_21_0 = stackOut_10_0;
                        stackIn_21_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var21 != 0) {
                          break L2;
                        } else {
                          L5: {
                            if (stackIn_11_0 >= stackIn_11_1) {
                              break L5;
                            } else {
                              if (this.a(param6, -23, var20_ref.field_f, var20_ref.field_d)) {
                                break L5;
                              } else {
                                if (this.a(param6, -23, var20_ref.field_d, var20_ref.field_f)) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var15 != var20_ref.field_d) {
                                      break L6;
                                    } else {
                                      if (null == var15.field_a) {
                                        break L6;
                                      } else {
                                        if (var20_ref.field_f != var9_ref.field_b) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  var11.a((byte) 108, var20_ref.field_f);
                                  break L5;
                                }
                              }
                            }
                          }
                          var20_ref = (fka) (Object) var19.a((byte) 112);
                          if (var21 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_20_0 = var14.field_c;
                stackOut_20_1 = -1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L2;
              }
              L7: {
                if (stackIn_21_0 != stackIn_21_1) {
                  var11.a((byte) 108, var12.field_f[var14.field_c]);
                  break L7;
                } else {
                  break L7;
                }
              }
              stackOut_24_0 = (qua) var11;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var9 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var9;
            stackOut_26_1 = new StringBuilder().append("ml.CB(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param6 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param7 + 41);
        }
        return stackIn_25_0;
    }

    public final boolean a(byte param0, tv param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -19 % ((param0 - 22) / 59);
                var3 = (ml) (Object) param1;
                if (var3.field_j != var3.field_j) {
                  break L2;
                } else {
                  qjb discarded$4 = var3.field_c;
                  L3: {
                    if (null == var3.field_c) {
                      break L3;
                    } else {
                      if (var3.field_c.a((byte) 87, (tv) (Object) var3.field_c)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  aqa discarded$5 = var3.field_a;
                  L4: {
                    if (var3.field_a == null) {
                      break L4;
                    } else {
                      if (var3.field_a.a((byte) 117, (tv) (Object) var3.field_a)) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  lja discarded$6 = var3.field_k;
                  L5: {
                    if (var3.field_k == null) {
                      break L5;
                    } else {
                      if (var3.field_k.a((byte) 90, (tv) (Object) var3.field_k)) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  eka discarded$7 = var3.field_h;
                  L6: {
                    if (var3.field_h == null) {
                      break L6;
                    } else {
                      if (((Object) (Object) var3.field_h).getClass() != ((Object) (Object) var3.field_h).getClass()) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (null == var3.field_h) {
                      break L7;
                    } else {
                      if (var3.field_h.a((byte) -80, (tv) (Object) var3.field_h)) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (dn.a((tv[]) (Object) var3.field_f, false, 1, (tv[]) (Object) var3.field_f, 125)) {
                    break L2;
                  } else {
                    if (!dn.a((tv[]) (Object) var3.field_d, false, 1, (tv[]) (Object) var3.field_d, 125)) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_27_0 = 1;
              stackIn_29_0 = stackOut_27_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3_ref;
            stackOut_30_1 = new StringBuilder().append("ml.C(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_29_0 != 0;
    }

    private final ml a(int param0, byte param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = 15 & param2 >> param0 * 4;
          if (param1 < -50) {
            break L0;
          } else {
            int discarded$2 = ((ml) this).b(20);
            break L0;
          }
        }
        if (var4 != 0) {
          if (null != ((ml) this).field_f) {
            if (((ml) this).field_f.length < var4) {
              return null;
            } else {
              return ((ml) this).field_f[var4 + -1].a(param0 - -1, (byte) -73, param2);
            }
          } else {
            return null;
          }
        } else {
          return (ml) this;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((ml) this).field_i != 1) {
            break L0;
          } else {
            ((ml) this).field_i = 0;
            break L0;
          }
        }
        if (param0 <= 52) {
          return;
        } else {
          L1: {
            if (null == ((ml) this).field_f) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (((ml) this).field_f.length <= var2) {
                  break L1;
                } else {
                  ((ml) this).field_f[var2].h(89);
                  var2++;
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final int a(sg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1 == 10298) {
              if (null != ((ml) this).field_k) {
                if (-1 != ((ml) this).field_k.field_e) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  return ((ml) this).field_k.field_g;
                }
              } else {
                if (((ml) this).field_c == null) {
                  if (((ml) this).field_a == null) {
                    if (null == ((ml) this).field_h) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      stackOut_11_0 = ((ml) this).field_h.a(param1 ^ 10317, param0);
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    }
                  } else {
                    stackOut_8_0 = ((ml) this).field_a.c(0);
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  stackOut_5_0 = ((ml) this).field_c.field_b;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            } else {
              stackOut_1_0 = -51;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ml.JC(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 == -86) {
            break L0;
          } else {
            int discarded$2 = ((ml) this).j((byte) 13);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((ml) this).i((byte) -112).field_u;
            if (null != ((ml) this).field_f) {
              var3 = 0;
              L3: while (true) {
                if (((ml) this).field_f.length <= var3) {
                  break L2;
                } else {
                  stackOut_6_0 = var2 + ((ml) this).field_f[var3].e((byte) -86);
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    var2 = stackIn_7_0;
                    var3++;
                    if (var4 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          stackOut_8_0 = var2;
          stackIn_9_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_9_0;
    }

    final int c(int param0) {
        int var2 = 0;
        var2 = 17 / ((56 - param0) / 56);
        if (null == ((ml) this).field_h) {
          if (null == ((ml) this).field_c) {
            if (((ml) this).field_k == null) {
              return 0;
            } else {
              return ((ml) this).field_k.a((byte) 12);
            }
          } else {
            return ((ml) this).field_c.d((byte) 120);
          }
        } else {
          return ((ml) this).field_h.a((byte) -114);
        }
    }

    final void a(tj param0, sfa param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ml) this).field_f == null) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var4_int) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var4_int].a(param0, param1, -1);
                      stackOut_4_0 = param1.a((byte) -61);
                      stackIn_10_0 = stackOut_4_0 ? 1 : 0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (!stackIn_5_0) {
                          var4_int++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = ~((ml) this).field_i;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            if (stackIn_10_0 < param2) {
              param0.a(24158, (ml) this, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ml.N(");
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    final void a(tj param0, tpb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((ml) this).field_f) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= ((ml) this).field_f.length) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var4_int].a(param0, param1, 0);
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param2 < ((ml) this).field_i) {
                var4_int = param0.a((ml) this, 3);
                break L1;
              } else {
                return;
              }
            }
            L4: {
              if (param1.field_a > var4_int) {
                param1.field_a = var4_int;
                param1.field_b = (ml) this;
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ml.CC(");
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_29_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        var6 = VoidHunters.field_G;
        if (((ml) this).field_f != null) {
          var5 = 0;
          L0: while (true) {
            if (var5 < ((ml) this).field_f.length) {
              stackOut_11_0 = ((ml) this).field_f[var5].b(32609, param1, param2, param3);
              stackIn_19_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var6 == 0) {
                if (stackIn_19_0) {
                  return true;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                L1: {
                  if ((stackIn_12_0 ? 1 : 0) == 32609) {
                    break L1;
                  } else {
                    ((ml) this).a(false, (byte) 89, (pe) null, (anb) null);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (!ujb.a((byte) -57, ((ml) this).field_g, param3, param1, param2)) {
                      break L3;
                    } else {
                      if (((ml) this).field_i >= ((ml) this).i((byte) -112).field_p) {
                        break L3;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                }
                return stackIn_18_0 != 0;
              }
            } else {
              L4: {
                if (param0 == 32609) {
                  break L4;
                } else {
                  ((ml) this).a(false, (byte) 89, (pe) null, (anb) null);
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (!ujb.a((byte) -57, ((ml) this).field_g, param3, param1, param2)) {
                    break L6;
                  } else {
                    if (((ml) this).field_i >= ((ml) this).i((byte) -112).field_p) {
                      break L6;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L5;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L5;
              }
              return stackIn_10_0 != 0;
            }
          }
        } else {
          L7: {
            if (param0 == 32609) {
              break L7;
            } else {
              ((ml) this).a(false, (byte) 89, (pe) null, (anb) null);
              break L7;
            }
          }
          L8: {
            L9: {
              if (!ujb.a((byte) -57, ((ml) this).field_g, param3, param1, param2)) {
                break L9;
              } else {
                if (((ml) this).field_i >= ((ml) this).i((byte) -112).field_p) {
                  break L9;
                } else {
                  stackOut_27_0 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  break L8;
                }
              }
            }
            stackOut_28_0 = 0;
            stackIn_29_0 = stackOut_28_0;
            break L8;
          }
          return stackIn_29_0 != 0;
        }
    }

    final int a(wfb param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -69) {
                break L1;
              } else {
                ((ml) this).field_k = null;
                break L1;
              }
            }
            stackOut_2_0 = ((ml) this).field_r - -(param0.field_b * fc.a(((ml) this).field_b, (byte) -99) - param0.field_i * eu.a(((ml) this).field_b, 84) >> 16);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ml.TA(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final int b(int param0, int param1) {
        ml[] var3_ref_ml__ = null;
        int var3 = 0;
        int var4 = 0;
        ml[] var5 = null;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (null != ((ml) this).field_c) {
            L1: {
              if (param1 < lcb.field_q.length) {
                break L1;
              } else {
                var5 = new ml[lcb.field_q.length - -1];
                var3_ref_ml__ = var5;
                cua.a((Object[]) (Object) lcb.field_q, 0, (Object[]) (Object) var3_ref_ml__, 0, lcb.field_q.length);
                lcb.field_q = var5;
                break L1;
              }
            }
            int incrementValue$2 = param1;
            param1++;
            lcb.field_q[incrementValue$2] = (ml) this;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 >= 125) {
            break L2;
          } else {
            ((ml) this).field_k = null;
            break L2;
          }
        }
        L3: {
          L4: {
            if (((ml) this).field_f != null) {
              var3 = 0;
              L5: while (true) {
                if (((ml) this).field_f.length <= var3) {
                  break L4;
                } else {
                  stackOut_11_0 = ((ml) this).field_f[var3].b(126, param1);
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    param1 = stackIn_12_0;
                    var3++;
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
          stackOut_13_0 = param1;
          stackIn_14_0 = stackOut_13_0;
          break L3;
        }
        return stackIn_14_0;
    }

    final void a(ij param0, ml param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((ml) this).field_f) {
                  break L2;
                } else {
                  var6_int = 0;
                  L3: while (true) {
                    if (((ml) this).field_f.length <= var6_int) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var6_int].a(param0, param1, 1 + var6_int << param4 * 4 | param2, (byte) 122, param4 - -1);
                      var6_int++;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              param1.a(0, param0, (ml) this, param2, 0, 0);
              break L1;
            }
            L4: {
              if (param3 >= 117) {
                break L4;
              } else {
                ((ml) this).c(38, 37, -84, -122);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ml.K(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(int param0, pe param1, anb param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            this.a(param1, 0, false, param2);
            if (((ml) this).field_i > param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ml.Q(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (null == ((ml) this).field_a) {
            break L0;
          } else {
            if (((ml) this).field_a.a(((ml) this).field_j, (byte) -61)) {
              break L0;
            } else {
              if (0 < ((ml) this).field_i) {
                return 1;
              } else {
                break L0;
              }
            }
          }
        }
        if (((ml) this).field_f != null) {
          var2 = 0;
          var3 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (((ml) this).field_f.length <= var3) {
                  break L3;
                } else {
                  stackOut_9_0 = var2 + ((ml) this).field_f[var3].l(-8913);
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var2 = stackIn_10_0;
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_11_0 = var2;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            return stackIn_12_0;
          }
        } else {
          if (param0 != -8913) {
            boolean discarded$2 = ((ml) this).a(31, 93, (pe) null, (anb) null);
            return 0;
          } else {
            return 0;
          }
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        ((ml) this).field_m = param3;
        ((ml) this).field_q = param0;
        ((ml) this).field_o = param1;
        if (param2 != 56) {
            ((ml) this).field_d = null;
        }
    }

    final int j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var6 = VoidHunters.field_G;
        var2 = 1;
        if (param0 != 57) {
          return -12;
        } else {
          L0: {
            if (((ml) this).field_f == null) {
              break L0;
            } else {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= ((ml) this).field_f.length) {
                  var2 = var2 + var3;
                  break L0;
                } else {
                  var5 = ((ml) this).field_f[var4].j((byte) 57);
                  stackOut_4_0 = ~var5;
                  stackOut_4_1 = ~var3;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var6 == 0) {
                    L2: {
                      if (stackIn_6_0 < stackIn_6_1) {
                        var3 = var5;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    var2 = stackIn_5_0 + stackIn_5_1;
                    break L0;
                  }
                }
              }
            }
          }
          return var2;
        }
    }

    public final void a(faa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                ((ml) this).field_j = param0.i(0, 6);
                ((ml) this).field_e = param0.i(0, 32);
                ((ml) this).field_o = param0.i(param1 + -32, 32);
                ((ml) this).field_m = param0.i(param1 + -32, param1);
                if (!kv.a(false, param0)) {
                  break L2;
                } else {
                  L3: {
                    if (((ml) this).field_c != null) {
                      break L3;
                    } else {
                      ((ml) this).field_c = new qjb();
                      break L3;
                    }
                  }
                  ((ml) this).field_c.a(param0, false);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ml) this).field_c = null;
              break L1;
            }
            L4: {
              L5: {
                if (kv.a(false, param0)) {
                  break L5;
                } else {
                  ((ml) this).field_a = null;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (((ml) this).field_a != null) {
                  break L6;
                } else {
                  ((ml) this).field_a = new aqa();
                  break L6;
                }
              }
              ((ml) this).field_a.a(param0, false);
              break L4;
            }
            L7: {
              L8: {
                if (kv.a(false, param0)) {
                  break L8;
                } else {
                  ((ml) this).field_k = null;
                  if (var4 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (null != ((ml) this).field_k) {
                  break L9;
                } else {
                  ((ml) this).field_k = new lja();
                  break L9;
                }
              }
              ((ml) this).field_k.a(param0, false);
              break L7;
            }
            L10: {
              L11: {
                if (!kv.a(false, param0)) {
                  break L11;
                } else {
                  L12: {
                    if (null != ((ml) this).field_h) {
                      break L12;
                    } else {
                      L13: {
                        var3_int = param0.i(0, 1);
                        if (var3_int != 0) {
                          break L13;
                        } else {
                          ((ml) this).field_h = (eka) (Object) new mua();
                          if (var4 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (var3_int == 1) {
                        ((ml) this).field_h = (eka) (Object) new kma();
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  ((ml) this).field_h.a(param0, false);
                  if (var4 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              ((ml) this).field_h = null;
              break L10;
            }
            ((ml) this).field_f = (ml[]) (Object) pt.a(127, 1, (tv[]) (Object) ((ml) this).field_f, ii.field_d, 5, param0);
            ((ml) this).field_d = (imb[]) (Object) pt.a(param1 ^ 93, 1, (tv[]) (Object) ((ml) this).field_d, ta.field_a, 5, param0);
            ((ml) this).field_q = param0.i(0, 32);
            ((ml) this).field_p = uwa.a(14, param0, (byte) 20);
            ((ml) this).field_i = param0.i(0, 32);
            ((ml) this).field_r = param0.i(0, 32);
            ((ml) this).field_n = param0.i(0, 32);
            ((ml) this).field_b = param0.i(0, 32);
            ((ml) this).field_g = wkb.a((byte) 37, ((ml) this).field_g, param0, 8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("ml.L(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L14;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L14;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 41);
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((ml) this).field_i <= 0) {
            ((ml) this).field_i = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != ((ml) this).field_f) {
              var2 = 0;
              L3: while (true) {
                if (((ml) this).field_f.length <= var2) {
                  break L2;
                } else {
                  ((ml) this).field_f[var2].d(param0);
                  var2++;
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          if (!param0) {
            break L1;
          } else {
            this.a(-20, (ij) null, (ml) null, 126, 9, -78);
            break L1;
          }
        }
    }

    final ml c(int param0, int param1) {
        if (param1 >= -83) {
            ((ml) this).f(5);
        }
        return this.a(0, (byte) -62, param0);
    }

    private final void f(int param0, int param1) {
        ml[] var3 = null;
        int var4 = 0;
        imb var5 = null;
        int var6 = 0;
        ml[] var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == ((ml) this).field_f) {
            break L0;
          } else {
            if (((ml) this).field_f.length <= param1) {
              break L0;
            } else {
              if (param1 >= 0) {
                if (param0 < 71) {
                  return;
                } else {
                  L1: {
                    var7 = new ml[-1 + ((ml) this).field_f.length];
                    var3 = var7;
                    cua.a((Object[]) (Object) ((ml) this).field_f, 0, (Object[]) (Object) var3, 0, param1);
                    if (-1 + ((ml) this).field_f.length > param1) {
                      cua.a((Object[]) (Object) ((ml) this).field_f, 1 + param1, (Object[]) (Object) var3, param1, var7.length - param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    ((ml) this).field_f = var3;
                    if (null == ((ml) this).field_d) {
                      break L2;
                    } else {
                      var4 = 0;
                      L3: while (true) {
                        if (((ml) this).field_d.length <= var4) {
                          break L2;
                        } else {
                          var5 = ((ml) this).field_d[var4];
                          if (var6 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                if (param1 != var5.field_c) {
                                  break L5;
                                } else {
                                  var5.field_c = -1;
                                  if (var6 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              if (param1 >= var5.field_c) {
                                break L4;
                              } else {
                                var5.field_c = var5.field_c - 1;
                                break L4;
                              }
                            }
                            var4++;
                            if (var6 == 0) {
                              continue L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                break L0;
              }
            }
          }
        }
    }

    final ml a(int param0, int param1, boolean param2) {
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackOut_4_0 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (((ml) this).field_f != null) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((ml) this).field_f.length) {
                break L0;
              } else {
                var5 = ((ml) this).field_f[var4].a(param0, param1, param2);
                stackOut_4_0 = null;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6 == 0) {
                  if (stackIn_6_0 == (Object) (Object) var5) {
                    var4++;
                    continue L1;
                  } else {
                    return var5;
                  }
                } else {
                  return (ml) (Object) stackIn_5_0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (!fra.a(((ml) this).field_g, param0, 2, param1)) {
          if (param2) {
            return null;
          } else {
            int discarded$2 = ((ml) this).a(-9);
            return null;
          }
        } else {
          return (ml) this;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int[] param5) {
        int var7_int = 0;
        int var8 = 0;
        try {
            if (param4 != 0) {
                int discarded$0 = this.c((byte) 99, 116);
            }
            var7_int = fc.a(param3, (byte) 35);
            var8 = eu.a(param3, 86);
            this.a(param2, var8, param0, param3, param5, false, 256, var7_int, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ml.OA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        ml var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var3_ref = (ml) (Object) param1;
                var3_ref.field_e = var3_ref.field_e;
                var3_ref.field_m = var3_ref.field_m;
                var3_ref.field_o = var3_ref.field_o;
                var3_ref.field_j = var3_ref.field_j;
                if (var3_ref.field_c == null) {
                  break L2;
                } else {
                  L3: {
                    if (null != var3_ref.field_c) {
                      break L3;
                    } else {
                      var3_ref.field_c = new qjb();
                      break L3;
                    }
                  }
                  var3_ref.field_c.b((byte) 110, (tv) (Object) var3_ref.field_c);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref.field_c = null;
              break L1;
            }
            L4: {
              L5: {
                if (var3_ref.field_a != null) {
                  break L5;
                } else {
                  var3_ref.field_a = null;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var3_ref.field_a == null) {
                  var3_ref.field_a = new aqa();
                  break L6;
                } else {
                  break L6;
                }
              }
              var3_ref.field_a.b((byte) 117, (tv) (Object) var3_ref.field_a);
              break L4;
            }
            L7: {
              L8: {
                if (null != var3_ref.field_k) {
                  break L8;
                } else {
                  var3_ref.field_k = null;
                  if (var4 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (null == var3_ref.field_k) {
                  var3_ref.field_k = new lja();
                  break L9;
                } else {
                  break L9;
                }
              }
              var3_ref.field_k.b((byte) 55, (tv) (Object) var3_ref.field_k);
              break L7;
            }
            L10: {
              L11: {
                if (var3_ref.field_h != null) {
                  break L11;
                } else {
                  var3_ref.field_h = null;
                  if (var4 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                L13: {
                  if (var3_ref.field_h == null) {
                    break L13;
                  } else {
                    if (((Object) (Object) var3_ref.field_h).getClass() == ((Object) (Object) var3_ref.field_h).getClass()) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (((Object) (Object) var3_ref.field_h).getClass() == mua.class) {
                    break L14;
                  } else {
                    if (((Object) (Object) var3_ref.field_h).getClass() != kma.class) {
                      break L12;
                    } else {
                      var3_ref.field_h = (eka) (Object) new kma();
                      if (var4 == 0) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                var3_ref.field_h = (eka) (Object) new mua();
                break L12;
              }
              var3_ref.field_h.b((byte) 78, (tv) (Object) var3_ref.field_h);
              break L10;
            }
            L15: {
              var3_ref.field_f = (ml[]) (Object) sqb.a((tv[]) (Object) var3_ref.field_f, (tv[]) (Object) var3_ref.field_f, 1, ii.field_d, false);
              var3_ref.field_d = (imb[]) (Object) sqb.a((tv[]) (Object) var3_ref.field_d, (tv[]) (Object) var3_ref.field_d, 1, ta.field_a, false);
              var3_ref.field_q = var3_ref.field_q;
              var3_ref.field_b = var3_ref.field_b;
              var3_ref.field_r = var3_ref.field_r;
              var3_ref.field_p = var3_ref.field_p;
              var3_ref.field_n = var3_ref.field_n;
              var3_ref.field_i = var3_ref.field_i;
              if (param0 > 54) {
                break L15;
              } else {
                field_l = null;
                break L15;
              }
            }
            var3_ref.field_g = dob.a(var3_ref.field_g, (byte) -94, var3_ref.field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("ml.D(").append(param0).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L16;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L16;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
    }

    final void a(byte param0, int param1) {
        ((ml) this).field_e = param1;
        int var3 = -97 / ((param0 - 58) / 33);
    }

    private final boolean d(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -112 / ((param0 - 25) / 51);
            if (((ml) this).field_c == null) {
              break L1;
            } else {
              if (((ml) this).field_c.a((byte) 24).b((byte) 127) <= 0) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(ml param0, int param1, int param2, byte param3, ij param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((ml) this).field_f) {
                  var6_int = 0;
                  L3: while (true) {
                    if (var6_int >= ((ml) this).field_f.length) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var6_int].a(param0, 1 + var6_int << param2 * 4 | param1, 1 + param2, (byte) -126, param4);
                      var6_int++;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              param0.a((byte) -53, 0, param1, param4, 0, (ml) this);
              break L1;
            }
            L4: {
              if (param3 == -126) {
                break L4;
              } else {
                ((ml) this).field_g = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ml.JA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final nbb a(pe param0, int param1, int param2, anb param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        ml var7 = null;
        nbb var8 = null;
        nbb var9 = null;
        int var10 = 0;
        nbb stackIn_8_0 = null;
        nbb stackIn_11_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        nbb stackOut_10_0 = null;
        nbb stackOut_7_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((ml) this).field_f == null) {
                break L1;
              } else {
                var6_int = 0;
                L2: while (true) {
                  if (var6_int >= ((ml) this).field_f.length) {
                    break L1;
                  } else {
                    var7 = ((ml) this).field_f[var6_int];
                    var8 = var7.a(param0, param1, param2, param3, (byte) 106);
                    if (var10 == 0) {
                      if (var8 == null) {
                        if (!fra.a(var7.field_g, param2, 2, param1)) {
                          var6_int++;
                          continue L2;
                        } else {
                          var7.a(param0, -19625, param3);
                          var9 = new nbb(var7, false);
                          param0.a(var9, (byte) 124);
                          this.f(121, var6_int);
                          param3.e((byte) 119);
                          stackOut_10_0 = (nbb) var9;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0;
                        }
                      } else {
                        stackOut_7_0 = (nbb) var8;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
            if (param4 <= 62) {
              ((ml) this).field_e = -85;
              stackOut_15_0 = null;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("ml.KB(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
        return (nbb) (Object) stackIn_16_0;
    }

    final int g(int param0, int param1) {
        if (param1 != 3) {
            return 111;
        }
        return ((ml) this).a(false, false, param0);
    }

    final void a(int param0, int param1, anb param2, int param3, int param4, pe param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == 7834) {
              L1: {
                if (0 == (param4 & ((ml) this).field_e)) {
                  break L1;
                } else {
                  if (((ml) this).field_i > 0) {
                    L2: {
                      if (null == ((ml) this).field_a) {
                        break L2;
                      } else {
                        L3: {
                          if (0 == (1 & param4)) {
                            break L3;
                          } else {
                            L4: {
                              if ((param4 & 4) == 0) {
                                break L4;
                              } else {
                                if ((8 & param4) != 0) {
                                  break L4;
                                } else {
                                  if ((8 & ((ml) this).field_e) != 0) {
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            L5: {
                              if (0 == (8 & param4)) {
                                break L5;
                              } else {
                                if (0 != (param4 & 4)) {
                                  break L5;
                                } else {
                                  if (0 != (((ml) this).field_e & 4)) {
                                    break L1;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            if (pmb.field_p != 0) {
                              break L3;
                            } else {
                              if ((((ml) this).field_e & 2) != 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        if ((param4 & 2) == 0) {
                          break L2;
                        } else {
                          L6: {
                            if ((param4 & 4) == 0) {
                              break L6;
                            } else {
                              if ((param4 & 8) != 0) {
                                break L6;
                              } else {
                                if ((8 & ((ml) this).field_e) != 0) {
                                  break L1;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if ((8 & param4) == 0) {
                              break L7;
                            } else {
                              if ((param4 & 4) != 0) {
                                break L7;
                              } else {
                                if ((((ml) this).field_e & 4) != 0) {
                                  break L1;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (pmb.field_p != 0) {
                            break L2;
                          } else {
                            if ((((ml) this).field_e & 1) != 0) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    ((ml) this).a(param2, param0, param5, param3, 90, 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L8: {
                if (((ml) this).field_f != null) {
                  var7_int = 0;
                  L9: while (true) {
                    if (((ml) this).field_f.length <= var7_int) {
                      break L8;
                    } else {
                      ((ml) this).field_f[var7_int].a(param0, 7834, param2, param3, param4, param5);
                      var7_int++;
                      if (var8 != 0) {
                        break L8;
                      } else {
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var7;
            stackOut_40_1 = new StringBuilder().append("ml.MC(").append(param0).append(44).append(param1).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          L11: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param5 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((ml) this).field_a != null) {
            ((ml) this).field_a.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 14546) {
          return;
        } else {
          L1: {
            if (null == ((ml) this).field_f) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (var2 >= ((ml) this).field_f.length) {
                  break L1;
                } else {
                  ((ml) this).field_f[var2].f(param0);
                  var2++;
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final ml d(int param0, int param1) {
        L0: {
          if (param1 == 692) {
            break L0;
          } else {
            boolean discarded$2 = ((ml) this).b(48, 1, -93, 81);
            break L0;
          }
        }
        if (null != ((ml) this).field_f) {
          if (param0 >= 0) {
            if (((ml) this).field_f.length <= param0) {
              return null;
            } else {
              return ((ml) this).field_f[param0];
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(ml param0, int param1, int param2, int param3, int param4, int param5, ij param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                break L1;
              } else {
                ((ml) this).field_g = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((ml) this).field_f) {
                  break L3;
                } else {
                  var10_int = 0;
                  L4: while (true) {
                    if (var10_int >= ((ml) this).field_f.length) {
                      break L3;
                    } else {
                      ((ml) this).field_f[var10_int].a(param0, param1, var10_int + 1 << param4 * 4 | param2, param3, 1 + param4, param5, param6, param7, param8);
                      var10_int++;
                      if (var11 != 0) {
                        break L2;
                      } else {
                        if (var11 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              if (!ujb.a((byte) -57, ((ml) this).field_g, param3, param1, param5)) {
                break L2;
              } else {
                param6.b(-10258, (ksa) (Object) new gda((ml) this, param2, param0, param8, param3, param1, 0, 0));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var10;
            stackOut_12_1 = new StringBuilder().append("ml.TB(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        var12 = VoidHunters.field_G;
        var4 = ((ml) this).i((byte) -112).field_u;
        var5 = ((ml) this).field_g.length >> 1;
        var6 = var4 / var5;
        var7 = 1;
        var8 = 0;
        L0: while (true) {
          L1: {
            if (var5 <= var8) {
              stackOut_7_0 = param0;
              stackOut_7_1 = -921054591;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              var9 = (((ml) this).field_g[var8 << 1] >> ou.field_r) + -(param1 >> ou.field_r);
              var10 = (((ml) this).field_g[(var8 << 1) + 1] >> ou.field_r) + -(param2 >> ou.field_r);
              var11 = var7;
              var7 = var7 + var6 * (var9 * var9 - -(var10 * var10));
              stackOut_2_0 = var7;
              stackOut_2_1 = var11;
              stackIn_8_0 = stackOut_2_0;
              stackIn_8_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (var12 != 0) {
                break L1;
              } else {
                L2: {
                  if (stackIn_3_0 < stackIn_3_1) {
                    var7 = 2147483647;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8++;
                continue L0;
              }
            }
          }
          L3: {
            if (stackIn_8_0 == stackIn_8_1) {
              break L3;
            } else {
              ((ml) this).field_b = 31;
              break L3;
            }
          }
          L4: {
            L5: {
              if (null == ((ml) this).field_f) {
                break L5;
              } else {
                var8 = 0;
                L6: while (true) {
                  if (((ml) this).field_f.length <= var8) {
                    break L5;
                  } else {
                    var9 = var7;
                    var7 = var7 + ((ml) this).field_f[var8].a(-921054591, param1, param2);
                    stackOut_13_0 = var9;
                    stackIn_19_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var12 != 0) {
                      break L4;
                    } else {
                      L7: {
                        if (stackIn_14_0 > var7) {
                          var7 = 2147483647;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var8++;
                      if (var12 == 0) {
                        continue L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
            }
            stackOut_18_0 = var7;
            stackIn_19_0 = stackOut_18_0;
            break L4;
          }
          return stackIn_19_0;
        }
    }

    final int a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wfb var10_ref_wfb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var17 = VoidHunters.field_G;
          if (fra.field_a != 1) {
            break L0;
          } else {
            if (null == ((ml) this).field_c) {
              break L0;
            } else {
              if (!((ml) this).field_c.b(true)) {
                break L0;
              } else {
                if (!param1) {
                  return 0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          var7 = 0;
          if (param4 == 21750) {
            break L1;
          } else {
            ((ml) this).field_k = null;
            break L1;
          }
        }
        L2: {
          var8 = Math.abs(rrb.a(param4 + 683, ((ml) this).field_q + (-((ml) this).c(127) - ((ml) this).field_p)));
          param2 = param2 + var8;
          var9 = Math.abs(rrb.a(param4 + 683, ((ml) this).field_q + (((ml) this).c(param4 ^ 21639) - ((ml) this).field_p)));
          if (param2 < 8192) {
            break L2;
          } else {
            param2 = 8191;
            break L2;
          }
        }
        L3: {
          param5 = param5 + var9;
          if (8192 > param5) {
            break L3;
          } else {
            param5 = 8191;
            break L3;
          }
        }
        L4: {
          L5: {
            L6: {
              if (this.a(true)) {
                break L6;
              } else {
                if (!param1) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              L8: {
                var10_ref_wfb = ((ml) this).i((byte) -112);
                var11 = ((ml) this).a(var10_ref_wfb, (byte) -69);
                var12 = ((ml) this).a(-86, var10_ref_wfb);
                var13 = param0 + -var11;
                var14 = param3 - var12;
                var15 = ecb.a(var14, (byte) -77, var13);
                if (this.d(-77)) {
                  break L8;
                } else {
                  var7 = rrb.a(22433, -((ml) this).field_b + var15);
                  if (var17 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              var16 = rrb.a(param4 ^ 855, rrb.a(22433, -((ml) this).field_p + ((ml) this).field_b) + ((ml) this).field_q);
              var7 = rrb.a(22433, var15 - var16);
              break L7;
            }
            L9: {
              L10: {
                var16 = var7;
                if (0 < var16) {
                  break L10;
                } else {
                  if (var16 >= 0) {
                    break L9;
                  } else {
                    var16 += 8192;
                    if (var17 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              var16 -= 8192;
              break L9;
            }
            L11: {
              L12: {
                L13: {
                  if (var7 <= param5) {
                    break L13;
                  } else {
                    if (param2 > -var16) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (-var7 <= param2) {
                  break L11;
                } else {
                  if (var16 < param5) {
                    var7 = var16;
                    if (var17 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              var7 = var16;
              break L11;
            }
            if (var17 == 0) {
              break L4;
            } else {
              break L5;
            }
          }
          if (((ml) this).field_f == null) {
            break L4;
          } else {
            var7 = 0;
            var10 = 0;
            var11 = 0;
            L14: while (true) {
              L15: {
                if (((ml) this).field_f.length <= var11) {
                  if (var10 > 0) {
                    break L15;
                  } else {
                    break L4;
                  }
                } else {
                  var12 = ((ml) this).field_f[var11].a(param0, false, param2, param3, 21750, param5);
                  var10++;
                  var7 = var7 + var12;
                  var11++;
                  if (var17 != 0) {
                    break L15;
                  } else {
                    continue L14;
                  }
                }
              }
              var7 = var7 / var10;
              break L4;
            }
          }
        }
        var7 = this.c((byte) -105, var7);
        return var7;
    }

    public final void a(faa param0, byte param1) {
        RuntimeException var3 = null;
        faa var3_ref = null;
        ml[] var4 = null;
        imb[] var4_array = null;
        int var5 = 0;
        ml[] var6 = null;
        imb[] var6_array = null;
        int var7 = 0;
        ml var8 = null;
        imb var8_ref = null;
        int var9 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        faa stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        faa stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_31_0 = 0;
        faa stackIn_35_0 = null;
        faa stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        faa stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        faa stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        faa stackIn_42_0 = null;
        int stackIn_47_0 = 0;
        faa stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        faa stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        faa stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        faa stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        faa stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        faa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        faa stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        faa stackOut_34_0 = null;
        faa stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        faa stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        faa stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        faa stackOut_41_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        faa stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        faa stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        faa stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        faa stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        faa stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              param0.a(-632, ((ml) this).field_j, 6);
              param0.a(-632, ((ml) this).field_e, 32);
              param0.a(-632, ((ml) this).field_o, 32);
              param0.a(-632, ((ml) this).field_m, 32);
              stackOut_1_0 = (faa) param0;
              stackOut_1_1 = 74;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((ml) this).field_c == null) {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (faa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_4_2 == 0)) {
                break L2;
              } else {
                ((ml) this).field_c.b(param0, -125);
                break L2;
              }
            }
            L3: {
              stackOut_6_0 = (faa) param0;
              stackOut_6_1 = 104;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              if (null == ((ml) this).field_a) {
                stackOut_8_0 = (faa) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                break L3;
              } else {
                stackOut_7_0 = (faa) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                break L3;
              }
            }
            L4: {
              if (vq.a(stackIn_9_0, stackIn_9_1, stackIn_9_2 == 0)) {
                break L4;
              } else {
                ((ml) this).field_a.b(param0, -125);
                break L4;
              }
            }
            L5: {
              stackOut_11_0 = (faa) param0;
              stackOut_11_1 = -93;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (((ml) this).field_k == null) {
                stackOut_13_0 = (faa) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L5;
              } else {
                stackOut_12_0 = (faa) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                break L5;
              }
            }
            L6: {
              if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 == 0)) {
                break L6;
              } else {
                ((ml) this).field_k.b(param0, -115);
                break L6;
              }
            }
            L7: {
              stackOut_16_0 = (faa) param0;
              stackOut_16_1 = 54;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              if (null == ((ml) this).field_h) {
                stackOut_18_0 = (faa) (Object) stackIn_18_0;
                stackOut_18_1 = stackIn_18_1;
                stackOut_18_2 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                break L7;
              } else {
                stackOut_17_0 = (faa) (Object) stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                break L7;
              }
            }
            L8: {
              if (vq.a(stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0)) {
                L9: {
                  L10: {
                    if (((Object) (Object) ((ml) this).field_h).getClass() != mua.class) {
                      break L10;
                    } else {
                      param0.a(-632, 0, 1);
                      if (var9 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (((Object) (Object) ((ml) this).field_h).getClass() == kma.class) {
                    param0.a(-632, 1, 1);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((ml) this).field_h.b(param0, -127);
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              var3_ref = param0;
              var4 = ((ml) this).field_f;
              if (var4 == null) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L11;
              } else {
                stackOut_29_0 = var4.length;
                stackIn_31_0 = stackOut_29_0;
                break L11;
              }
            }
            L12: {
              L13: {
                var5 = stackIn_31_0;
                var3_ref.a(-632, var5, 5);
                if (0 == var5) {
                  break L13;
                } else {
                  var6 = var4;
                  var7 = 0;
                  L14: while (true) {
                    if (var6.length <= var7) {
                      break L13;
                    } else {
                      var8 = var6[var7];
                      stackOut_34_0 = (faa) var3_ref;
                      stackIn_42_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (var9 != 0) {
                        break L12;
                      } else {
                        L15: {
                          stackOut_35_0 = (faa) (Object) stackIn_35_0;
                          stackOut_35_1 = -97;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var8 == null) {
                            stackOut_37_0 = (faa) (Object) stackIn_37_0;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            stackIn_38_2 = stackOut_37_2;
                            break L15;
                          } else {
                            stackOut_36_0 = (faa) (Object) stackIn_36_0;
                            stackOut_36_1 = stackIn_36_1;
                            stackOut_36_2 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_38_2 = stackOut_36_2;
                            break L15;
                          }
                        }
                        L16: {
                          if (vq.a(stackIn_38_0, stackIn_38_1, stackIn_38_2 == 0)) {
                            break L16;
                          } else {
                            ((utb) (Object) var8).a(var3_ref, (byte) -122);
                            break L16;
                          }
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_41_0 = (faa) param0;
              stackIn_42_0 = stackOut_41_0;
              break L12;
            }
            var3_ref = stackIn_42_0;
            var4_array = ((ml) this).field_d;
            if (param1 <= -91) {
              L17: {
                if (var4_array != null) {
                  stackOut_46_0 = var4_array.length;
                  stackIn_47_0 = stackOut_46_0;
                  break L17;
                } else {
                  stackOut_45_0 = 0;
                  stackIn_47_0 = stackOut_45_0;
                  break L17;
                }
              }
              L18: {
                L19: {
                  var5 = stackIn_47_0;
                  var3_ref.a(-632, var5, 5);
                  if (0 != var5) {
                    var6_array = var4_array;
                    var7 = 0;
                    L20: while (true) {
                      if (var6_array.length <= var7) {
                        break L19;
                      } else {
                        var8_ref = var6_array[var7];
                        stackOut_51_0 = (faa) var3_ref;
                        stackOut_51_1 = 120;
                        stackIn_60_0 = stackOut_51_0;
                        stackIn_60_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (var9 != 0) {
                          break L18;
                        } else {
                          L21: {
                            stackOut_52_0 = (faa) (Object) stackIn_52_0;
                            stackOut_52_1 = stackIn_52_1;
                            stackIn_54_0 = stackOut_52_0;
                            stackIn_54_1 = stackOut_52_1;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            if (var8_ref == null) {
                              stackOut_54_0 = (faa) (Object) stackIn_54_0;
                              stackOut_54_1 = stackIn_54_1;
                              stackOut_54_2 = 0;
                              stackIn_55_0 = stackOut_54_0;
                              stackIn_55_1 = stackOut_54_1;
                              stackIn_55_2 = stackOut_54_2;
                              break L21;
                            } else {
                              stackOut_53_0 = (faa) (Object) stackIn_53_0;
                              stackOut_53_1 = stackIn_53_1;
                              stackOut_53_2 = 1;
                              stackIn_55_0 = stackOut_53_0;
                              stackIn_55_1 = stackOut_53_1;
                              stackIn_55_2 = stackOut_53_2;
                              break L21;
                            }
                          }
                          L22: {
                            if (vq.a(stackIn_55_0, stackIn_55_1, stackIn_55_2 != 0)) {
                              ((utb) (Object) var8_ref).a(var3_ref, (byte) -93);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          var7++;
                          if (var9 == 0) {
                            continue L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                param0.a(-632, ((ml) this).field_q, 32);
                param0.a(-632, ((ml) this).field_p, 14);
                param0.a(-632, ((ml) this).field_i, 32);
                param0.a(-632, ((ml) this).field_r, 32);
                param0.a(-632, ((ml) this).field_n, 32);
                stackOut_59_0 = (faa) param0;
                stackOut_59_1 = -632;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                break L18;
              }
              L23: {
                ((faa) (Object) stackIn_60_0).a(stackIn_60_1, ((ml) this).field_b, 32);
                stackOut_60_0 = 8;
                stackIn_62_0 = stackOut_60_0;
                stackIn_61_0 = stackOut_60_0;
                if (((ml) this).field_g == null) {
                  stackOut_62_0 = stackIn_62_0;
                  stackOut_62_1 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  break L23;
                } else {
                  stackOut_61_0 = stackIn_61_0;
                  stackOut_61_1 = ((ml) this).field_g.length;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  break L23;
                }
              }
              pgb.a(stackIn_63_0, stackIn_63_1, -96, param0, ((ml) this).field_g);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var3;
            stackOut_65_1 = new StringBuilder().append("ml.E(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L24;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L24;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 44 + param1 + 41);
        }
    }

    final int b(int param0) {
        int var2 = 32 % ((param0 - 89) / 35);
        return ((ml) this).i((byte) -112).field_b;
    }

    private final boolean a(boolean param0) {
        L0: {
          if (((ml) this).field_h == null) {
            break L0;
          } else {
            if (((ml) this).field_h.a(0)) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (null == ((ml) this).field_c) {
            break L1;
          } else {
            if (((ml) this).field_c.d(6)) {
              return true;
            } else {
              break L1;
            }
          }
        }
        if (((ml) this).field_k != null) {
          if (((ml) this).field_k.b((byte) -113)) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8) {
        RuntimeException var10 = null;
        wfb var10_ref = null;
        long var11 = 0L;
        long var13 = 0L;
        int var15 = 0;
        int var16 = 0;
        long var17 = 0L;
        long var19 = 0L;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        long var29 = 0L;
        long var31 = 0L;
        long var33 = 0L;
        long var35 = 0L;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        wfb var40 = null;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var39 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackOut_1_1 = param2 ^ 22433;
              stackOut_1_2 = param3;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (param0) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = ((ml) this).field_q;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = ((ml) this).field_p;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            L2: {
              ((ml) this).field_b = rrb.a(stackIn_4_1, stackIn_4_2 + stackIn_4_3);
              var40 = ((ml) this).i((byte) -112);
              var10_ref = var40;
              var11 = (long)var10_ref.field_b;
              var13 = (long)var10_ref.field_i;
              var15 = fc.a(((ml) this).field_b, (byte) -97);
              var16 = eu.a(((ml) this).field_b, 123);
              gaa.field_o = var15;
              pua.field_p = var16;
              var17 = -(var13 * (long)var16) + (long)var15 * var11 >> 16;
              var19 = (long)var15 * var13 + (long)var16 * var11 >> 16;
              var21 = (long)(-(((ml) this).field_m * param6 >> 16) + (param4 * ((ml) this).field_o >> 16));
              var23 = (long)((param6 * ((ml) this).field_o >> 16) - -(((ml) this).field_m * param4 >> 16));
              ((ml) this).field_r = (int)((long)param7 - (-var21 + var17));
              ((ml) this).field_n = (int)(-var19 + (long)param1 - -var23);
              var25 = 0;
              var26 = 0;
              var27 = this.a(param5, var10_ref, true);
              if (var27 != param2) {
                var25 = var27 * var15 >> 16;
                var26 = var16 * var27 >> 16;
                break L2;
              } else {
                break L2;
              }
            }
            var28 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var28 >= var10_ref.field_v.length) {
                    break L5;
                  } else {
                    var29 = (long)var40.field_v[var28];
                    var31 = (long)var40.field_v[var28 + 1];
                    var33 = (-(var31 * (long)var16) + var29 * (long)var15 >> 16) + (long)((ml) this).field_r;
                    var35 = (long)((ml) this).field_n + ((long)var16 * var29 - -((long)var15 * var31) >> 16);
                    ((ml) this).field_g[var28] = (int)var33 - var25;
                    ((ml) this).field_g[var28 + 1] = (int)var35 - var26;
                    if (var39 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (param8 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (((ml) this).field_g[var28] < param8[0]) {
                              param8[0] = ((ml) this).field_g[var28];
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (param8[1] < ((ml) this).field_g[var28]) {
                              param8[1] = ((ml) this).field_g[var28];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (param8[2] > ((ml) this).field_g[1 + var28]) {
                              param8[2] = ((ml) this).field_g[1 + var28];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (((ml) this).field_g[1 + var28] <= param8[3]) {
                              break L10;
                            } else {
                              param8[3] = ((ml) this).field_g[var28 - -1];
                              break L10;
                            }
                          }
                          L11: {
                            if (var25 != 0) {
                              break L11;
                            } else {
                              if (var26 != 0) {
                                break L11;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L12: {
                            var37 = var25 + ((ml) this).field_g[var28];
                            var38 = var26 + ((ml) this).field_g[1 + var28];
                            if (var37 > param8[1]) {
                              param8[1] = var37;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (var37 >= param8[0]) {
                              break L13;
                            } else {
                              param8[0] = var37;
                              break L13;
                            }
                          }
                          L14: {
                            if (param8[3] >= var38) {
                              break L14;
                            } else {
                              param8[3] = var38;
                              break L14;
                            }
                          }
                          if (var38 < param8[2]) {
                            param8[2] = var38;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var28 += 2;
                      if (var39 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (null == ((ml) this).field_d) {
                  break L4;
                } else {
                  var28 = 0;
                  L15: while (true) {
                    if (var28 >= ((ml) this).field_d.length) {
                      break L4;
                    } else {
                      ((ml) this).field_d[var28].a(var16, ((ml) this).field_r, ((ml) this).field_n, var15, param2 ^ -665140432, var40.field_o[var28].field_b, var40.field_o[var28].field_c);
                      var28++;
                      if (var39 != 0) {
                        break L4;
                      } else {
                        if (var39 == 0) {
                          continue L15;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var10;
            stackOut_43_1 = new StringBuilder().append("ml.OC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param8 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L16;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L16;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
    }

    private final void a(Random param0, pe param1, int param2, byte param3, int param4, anb param5) {
        RuntimeException var7 = null;
        nbb var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((ml) this).field_f[param4].a(param1, -19625, param5);
              if (param3 == 97) {
                break L1;
              } else {
                ((ml) this).field_p = 117;
                break L1;
              }
            }
            L2: {
              var7_ref = new nbb(((ml) this).field_f[param4], false);
              var8 = var7_ref.d(false) - ((ml) this).field_r;
              var9 = var7_ref.g((byte) 126) + -((ml) this).field_n;
              cqb.a(((ml) this).field_r + var8, ((ml) this).field_n + var9, ((ml) this).field_n, ((ml) this).field_r, (byte) -54);
              var10 = ar.a(var8, (byte) 110, var9);
              if (0 == var10) {
                var10 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = ecb.a(var9, (byte) -77, var8);
              var12 = param2 * var7_ref.e(false) / var10;
              if (param5 != null) {
                var7_ref.field_h = param5.field_h;
                var7_ref.field_f = param5.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            var7_ref.a(((ml) this).field_n, rrb.a(22433, -100 + (var11 + hob.a(param0, 200, 118))), ((ml) this).field_r, var12, 1948934248);
            param1.a(var7_ref, (byte) 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7;
            stackOut_10_1 = new StringBuilder().append("ml.DA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param5 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final ml[] a(int param0, ml[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ml[] stackIn_12_0 = null;
        ml[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml[] stackOut_11_0 = null;
        ml[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((ml) this).field_a == null) {
                break L1;
              } else {
                if (((ml) this).field_a.a(((ml) this).field_j, (byte) -61)) {
                  break L1;
                } else {
                  if (((ml) this).field_i <= 0) {
                    break L1;
                  } else {
                    param1 = (ml[]) (Object) ija.a(this, (Object[]) (Object) param1, 0, ii.field_d);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                ((ml) this).field_p = 84;
                break L2;
              }
            }
            L3: {
              L4: {
                if (null != ((ml) this).field_f) {
                  var4_int = 0;
                  L5: while (true) {
                    if (((ml) this).field_f.length <= var4_int) {
                      break L4;
                    } else {
                      stackOut_11_0 = ((ml) this).field_f[var4_int].a(param0, param1, param2);
                      stackIn_14_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        param1 = stackIn_12_0;
                        var4_int++;
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_13_0 = (ml[]) param1;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ml.BD(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_14_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = VoidHunters.field_G;
            var3 = param1;
            if (((ml) this).field_f != null) {
              var4 = 0;
              L2: while (true) {
                if (((ml) this).field_f.length <= var4) {
                  break L1;
                } else {
                  var3 = var3 + ((ml) this).field_f[var4].a(param0, 0);
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 != ((ml) this).field_j) {
            break L0;
          } else {
            var3++;
            break L0;
          }
        }
        return var3;
    }

    final void a(int[] param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -17) {
                break L1;
              } else {
                ((ml) this).field_a = null;
                break L1;
              }
            }
            L2: {
              param0[0] = param0[0] + ((ml) this).field_i;
              param0[1] = param0[1] + ((ml) this).i((byte) -112).field_p;
              if (!param2) {
                break L2;
              } else {
                if (null == ((ml) this).field_f) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= ((ml) this).field_f.length) {
                      break L2;
                    } else {
                      ((ml) this).field_f[var4_int].a(param0, (byte) -17, param2);
                      var4_int++;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ml.EC(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final wfb i(byte param0) {
        if (param0 != -112) {
            return null;
        }
        return hab.field_g[((ml) this).field_j];
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa var3_ref = null;
        ml[] var4 = null;
        imb[] var4_array = null;
        int var5 = 0;
        ml[] var6 = null;
        imb[] var6_array = null;
        int var7 = 0;
        ml var8 = null;
        imb var8_ref = null;
        int var9 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        faa stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_32_0 = 0;
        faa stackIn_36_0 = null;
        faa stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        faa stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        faa stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        faa stackIn_44_0 = null;
        int stackIn_49_0 = 0;
        faa stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        faa stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        faa stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        faa stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        faa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        faa stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        faa stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        faa stackOut_35_0 = null;
        faa stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        faa stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        faa stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        faa stackOut_43_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        faa stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        faa stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        faa stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              param0.a(-632, ((ml) this).field_j, 6);
              stackOut_1_0 = (faa) param0;
              stackOut_1_1 = -55;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((ml) this).field_c == null) {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (faa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_4_2 != 0)) {
                ((ml) this).field_c.b(param0, -114);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              stackOut_7_0 = (faa) param0;
              stackOut_7_1 = 62;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (null == ((ml) this).field_a) {
                stackOut_9_0 = (faa) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L3;
              } else {
                stackOut_8_0 = (faa) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L3;
              }
            }
            L4: {
              if (vq.a(stackIn_10_0, stackIn_10_1, stackIn_10_2 == 0)) {
                break L4;
              } else {
                ((ml) this).field_a.b(param0, -123);
                break L4;
              }
            }
            L5: {
              stackOut_12_0 = (faa) param0;
              stackOut_12_1 = 113;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              if (((ml) this).field_k == null) {
                stackOut_14_0 = (faa) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                break L5;
              } else {
                stackOut_13_0 = (faa) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                break L5;
              }
            }
            L6: {
              if (vq.a(stackIn_15_0, stackIn_15_1, stackIn_15_2 != 0)) {
                ((ml) this).field_k.b(param0, -115);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              stackOut_18_0 = (faa) param0;
              stackOut_18_1 = -98;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              if (null == ((ml) this).field_h) {
                stackOut_20_0 = (faa) (Object) stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                break L7;
              } else {
                stackOut_19_0 = (faa) (Object) stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackOut_19_2 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                break L7;
              }
            }
            L8: {
              if (vq.a(stackIn_21_0, stackIn_21_1, stackIn_21_2 != 0)) {
                L9: {
                  L10: {
                    if (((Object) (Object) ((ml) this).field_h).getClass() != mua.class) {
                      break L10;
                    } else {
                      param0.a(-632, 0, 1);
                      if (var9 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (((Object) (Object) ((ml) this).field_h).getClass() != kma.class) {
                    break L9;
                  } else {
                    param0.a(-632, 1, 1);
                    break L9;
                  }
                }
                ((ml) this).field_h.b(param0, -110);
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              var3_ref = param0;
              var4 = ((ml) this).field_f;
              if (var4 != null) {
                stackOut_31_0 = var4.length;
                stackIn_32_0 = stackOut_31_0;
                break L11;
              } else {
                stackOut_30_0 = 0;
                stackIn_32_0 = stackOut_30_0;
                break L11;
              }
            }
            L12: {
              L13: {
                var5 = stackIn_32_0;
                var3_ref.a(-632, var5, 5);
                if (var5 == 0) {
                  break L13;
                } else {
                  var6 = var4;
                  var7 = 0;
                  L14: while (true) {
                    if (var6.length <= var7) {
                      break L13;
                    } else {
                      var8 = var6[var7];
                      stackOut_35_0 = (faa) var3_ref;
                      stackIn_44_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (var9 != 0) {
                        break L12;
                      } else {
                        L15: {
                          stackOut_36_0 = (faa) (Object) stackIn_36_0;
                          stackOut_36_1 = 113;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (var8 == null) {
                            stackOut_38_0 = (faa) (Object) stackIn_38_0;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            break L15;
                          } else {
                            stackOut_37_0 = (faa) (Object) stackIn_37_0;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = 1;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L15;
                          }
                        }
                        L16: {
                          if (vq.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0)) {
                            stb.a(2, 1, var3_ref, (tv) (Object) var8);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_43_0 = (faa) param0;
              stackIn_44_0 = stackOut_43_0;
              break L12;
            }
            L17: {
              var3_ref = stackIn_44_0;
              var4_array = ((ml) this).field_d;
              if (param1 <= -109) {
                break L17;
              } else {
                ((ml) this).field_h = null;
                break L17;
              }
            }
            L18: {
              if (var4_array != null) {
                stackOut_48_0 = var4_array.length;
                stackIn_49_0 = stackOut_48_0;
                break L18;
              } else {
                stackOut_47_0 = 0;
                stackIn_49_0 = stackOut_47_0;
                break L18;
              }
            }
            L19: {
              L20: {
                var5 = stackIn_49_0;
                var3_ref.a(-632, var5, 5);
                if (var5 == 0) {
                  break L20;
                } else {
                  var6_array = var4_array;
                  var7 = 0;
                  L21: while (true) {
                    if (var7 >= var6_array.length) {
                      break L20;
                    } else {
                      var8_ref = var6_array[var7];
                      if (var9 != 0) {
                        break L19;
                      } else {
                        L22: {
                          stackOut_53_0 = (faa) var3_ref;
                          stackOut_53_1 = 53;
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          if (var8_ref == null) {
                            stackOut_55_0 = (faa) (Object) stackIn_55_0;
                            stackOut_55_1 = stackIn_55_1;
                            stackOut_55_2 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            stackIn_56_2 = stackOut_55_2;
                            break L22;
                          } else {
                            stackOut_54_0 = (faa) (Object) stackIn_54_0;
                            stackOut_54_1 = stackIn_54_1;
                            stackOut_54_2 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            stackIn_56_1 = stackOut_54_1;
                            stackIn_56_2 = stackOut_54_2;
                            break L22;
                          }
                        }
                        L23: {
                          if (vq.a(stackIn_56_0, stackIn_56_1, stackIn_56_2 == 0)) {
                            break L23;
                          } else {
                            stb.a(2, 1, var3_ref, (tv) (Object) var8_ref);
                            break L23;
                          }
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                }
              }
              this.b(param0, (byte) 63);
              break L19;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var3;
            stackOut_61_1 = new StringBuilder().append("ml.B(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L24;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L24;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param1 + 41);
        }
    }

    final void a(pe param0, byte param1, anb param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ml var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -111) {
                break L1;
              } else {
                ((ml) this).field_m = 51;
                break L1;
              }
            }
            L2: {
              if (null != ((ml) this).field_f) {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((ml) this).field_f.length) {
                    break L2;
                  } else {
                    var5 = ((ml) this).field_f[var4_int];
                    var5.a(param0, (byte) -111, param2);
                    var4_int--;
                    ((ml) this).a(false, var5, param0, param1 + 234, param2);
                    var4_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ml.IB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    private final int[] a(int[] param0, int param1, int[][] param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var9 = param2[param1];
            var5 = var9;
            var6 = new int[var9.length << 1];
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var9.length <= var7) {
                    break L3;
                  } else {
                    var6[var7 << 1] = param0[var9[var7] << 1];
                    stackOut_5_0 = (int[]) var6;
                    stackIn_9_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      stackIn_6_0[(var7 << 1) - -1] = param0[(var9[var7] << 1) + 1];
                      var7++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_8_0 = (int[]) var6;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("ml.NA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + -600917695 + 41);
        }
        return stackIn_9_0;
    }

    final int a(int param0, wfb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -106 % ((-24 - param0) / 56);
            stackOut_0_0 = ((ml) this).field_n + (param1.field_b * eu.a(((ml) this).field_b, 62) + param1.field_i * fc.a(((ml) this).field_b, (byte) -119) >> 16);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ml.CD(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final boolean b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackOut_11_0 = false;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 >= 39) {
            break L0;
          } else {
            ((ml) this).field_c = null;
            break L0;
          }
        }
        L1: {
          if (param1 != ((ml) this).i((byte) -112).b(-1)) {
            break L1;
          } else {
            if (!((ml) this).k((byte) 69)) {
              return true;
            } else {
              break L1;
            }
          }
        }
        if (((ml) this).field_f != null) {
          var3 = 0;
          L2: while (true) {
            if (var3 < ((ml) this).field_f.length) {
              stackOut_11_0 = ((ml) this).field_f[var3].b((byte) 118, param1);
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var4 == 0) {
                if (stackIn_13_0) {
                  return true;
                } else {
                  var3++;
                  continue L2;
                }
              } else {
                return stackIn_12_0;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(byte param0, ml param1) {
        RuntimeException runtimeException = null;
        ml[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ml[] var6 = null;
        ml[] var7 = null;
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
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 73) {
                break L1;
              } else {
                lu discarded$2 = ((ml) this).a(-81, false, 28, -34, 8, (ml) null, 106, (anb) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ml) this).field_f != null) {
                  break L3;
                } else {
                  ((ml) this).field_f = new ml[1];
                  ((ml) this).field_f[0] = param1;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = new ml[((ml) this).field_f.length + 1];
              var7 = var6;
              var3 = var7;
              var4 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 >= ((ml) this).field_f.length) {
                      break L6;
                    } else {
                      var6[var4] = ((ml) this).field_f[var4];
                      var4++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var6[((ml) this).field_f.length] = param1;
                  break L5;
                }
                ((ml) this).field_f = var7;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ml.R(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    ml() {
    }

    final int g(byte param0) {
        if (param0 != -127) {
            ((ml) this).field_g = null;
        }
        return rrb.a(22433, ((ml) this).field_b - ((ml) this).field_p + ((ml) this).field_q);
    }

    final int b(boolean param0) {
        if (!param0) {
            return -24;
        }
        return ((ml) this).field_r;
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 == 0) {
            break L0;
          } else {
            this.a(45, 20, true, -45, (int[]) null, false, 77, -58, 36);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((ml) this).i((byte) -112).field_n;
            if (((ml) this).field_f == null) {
              break L2;
            } else {
              var3 = 0;
              L3: while (true) {
                if (((ml) this).field_f.length <= var3) {
                  break L2;
                } else {
                  stackOut_5_0 = var2 + ((ml) this).field_f[var3].a(param0);
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    var2 = stackIn_6_0;
                    var3++;
                    if (var4 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_7_0 = var2;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0;
    }

    final void h(byte param0) {
        if (param0 != 42) {
            ((ml) this).field_n = 90;
        }
        ((ml) this).field_p = ((ml) this).field_q;
    }

    final void a(boolean param0, pe param1, anb param2, byte param3) {
        RuntimeException var5 = null;
        wfb var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              qba.a(20382, ((ml) this).field_r, 65, ((ml) this).field_n, 10);
              var5_ref = ((ml) this).i((byte) -112);
              var6 = Math.min(var5_ref.field_p / var5_ref.field_z - -((ml) this).j(1), 1000);
              if (param3 <= -53) {
                break L1;
              } else {
                ((ml) this).field_p = -111;
                break L1;
              }
            }
            L2: {
              L3: {
                var7 = param2.field_f;
                var8 = param2.field_h;
                var9 = kmb.field_f * ((ml) this).i((byte) -112).field_h >> 8;
                var10 = new Random((long)((ml) this).field_r);
                if (null == ((ml) this).field_f) {
                  break L3;
                } else {
                  if (param0) {
                    var11 = 0;
                    L4: while (true) {
                      if (((ml) this).field_f.length <= var11) {
                        break L3;
                      } else {
                        this.a(var10, param1, var9, (byte) 97, var11, param2);
                        var11++;
                        if (var17 != 0) {
                          break L2;
                        } else {
                          if (var17 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var11 = 3;
              break L2;
            }
            L5: {
              if (param2 instanceof sg) {
                var11 = ((sg) (Object) param2).q((byte) 71);
                param2 = null;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              param1.a(var11, var8, 100, 50, 1000, var6 << 1, var7, ((ml) this).field_g, (byte) 84);
              if (param2 == null) {
                break L6;
              } else {
                L7: {
                  var12 = param2.d(false) + -((ml) this).field_r;
                  var13 = param2.g((byte) -21) + -((ml) this).field_n;
                  cqb.a(((ml) this).field_r + var12, ((ml) this).field_n + var13, ((ml) this).field_n, ((ml) this).field_r, (byte) -54);
                  var14 = ar.a(var12, (byte) 120, var13);
                  if (var14 == 0) {
                    var14 = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var15 = ecb.a(var13, (byte) -77, var12);
                var16 = param2.e(false) * var9 / var14;
                param2.a(((ml) this).field_n, rrb.a(22433, -100 + (var15 - -hob.a(var10, 200, 123))), ((ml) this).field_r, var16, 1948934248);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ml.NC(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, pe param2, lta param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((ml) this).field_a == null) {
                break L1;
              } else {
                ((ml) this).field_a.a((byte) -116, param1, param3, ((ml) this).field_g);
                break L1;
              }
            }
            L2: {
              if (null == ((ml) this).field_k) {
                break L2;
              } else {
                ((ml) this).field_k.a(((ml) this).field_b, param3, ((ml) this).i((byte) -112).field_v, ((ml) this).field_n, param2, ((ml) this).field_r, param0 + 110);
                break L2;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                ml discarded$2 = ((ml) this).d(34, -81);
                break L3;
              }
            }
            L4: {
              if (((ml) this).field_f == null) {
                break L4;
              } else {
                var5_int = 0;
                L5: while (true) {
                  if (var5_int >= ((ml) this).field_f.length) {
                    break L4;
                  } else {
                    ((ml) this).field_f[var5_int].a(0, param1, param2, param3);
                    var5_int++;
                    if (var6 != 0) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ml.JB(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    private final void a(ml param0, byte param1, wfb param2, int param3) {
        int var5_int = 0;
        try {
            if (param1 <= 25) {
                ((ml) this).field_f = null;
            }
            var5_int = param2.field_o[param3].field_a;
            if (!(null == param0.field_a)) {
                var5_int = rrb.a(22433, 4096 + var5_int);
            }
            param0.c(var5_int, param2.field_o[param3].field_b, 56, param2.field_o[param3].field_c);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ml.PC(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, ml param2) {
        wfb var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              this.a((byte) 73, param2);
              ((ml) this).field_d[param1].field_c = -1 + ((ml) this).field_f.length;
              var4 = ((ml) this).i((byte) -112);
              this.a(param2, (byte) 115, var4, param1);
              if (param0 != 1) {
                ml[] discarded$2 = ((ml) this).a((ml[]) null, (byte) 63);
                param2.h((byte) 42);
                break L1;
              } else {
                param2.h((byte) 42);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("ml.KA(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    ml(int param0) {
        wfb var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          ((ml) this).field_j = param0;
          var2 = hab.field_g[((ml) this).field_j];
          if (null == var2.field_c) {
            break L0;
          } else {
            ((ml) this).field_c = new qjb();
            var2.field_c.b((byte) 94, (tv) (Object) ((ml) this).field_c);
            if (var2.b(-1) != -1) {
              break L0;
            } else {
              if (var2.field_c.a((byte) 24).e(-3)) {
                break L0;
              } else {
                ((ml) this).a((byte) 124, 16);
                break L0;
              }
            }
          }
        }
        L1: {
          L2: {
            if (var2.field_e == null) {
              break L2;
            } else {
              ((ml) this).field_h = (eka) (Object) new kma();
              var2.field_e.b((byte) 64, (tv) (Object) ((ml) this).field_h);
              if (var4 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (null == var2.field_g) {
            break L1;
          } else {
            ((ml) this).field_h = (eka) (Object) new mua();
            var2.field_g.b((byte) 56, (tv) (Object) ((ml) this).field_h);
            break L1;
          }
        }
        L3: {
          if (null == var2.field_t) {
            break L3;
          } else {
            ((ml) this).field_a = new aqa();
            var2.field_t.b((byte) 92, (tv) (Object) ((ml) this).field_a);
            break L3;
          }
        }
        L4: {
          if (null == var2.field_x) {
            break L4;
          } else {
            ((ml) this).field_k = new lja();
            var2.field_x.b((byte) 107, (tv) (Object) ((ml) this).field_k);
            break L4;
          }
        }
        L5: {
          L6: {
            ((ml) this).field_p = 0;
            ((ml) this).field_i = var2.field_p;
            ((ml) this).field_q = 0;
            if (null == var2.field_o) {
              break L6;
            } else {
              ((ml) this).field_d = new imb[var2.field_o.length];
              var3 = 0;
              L7: while (true) {
                if (var3 >= ((ml) this).field_d.length) {
                  break L6;
                } else {
                  ((ml) this).field_d[var3] = new imb();
                  var3++;
                  if (var4 != 0) {
                    break L5;
                  } else {
                    if (var4 == 0) {
                      continue L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
          }
          this.c(true);
          break L5;
        }
    }

    static {
    }
}
