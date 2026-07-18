/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dg {
    static String field_d;
    static kd field_g;
    static String field_m;
    private int field_i;
    private int field_f;
    private int field_b;
    private boolean field_a;
    static float field_j;
    oh[] field_k;
    private int field_c;
    static int field_e;
    static String field_l;
    private int field_h;
    oh field_n;

    final static boolean c(int param0) {
        int var1 = -62 % ((param0 - -11) / 57);
        return ma.field_g;
    }

    public static void b(int param0) {
        field_g = null;
        field_l = null;
        field_d = null;
        field_m = null;
    }

    final dg a(oh[] param0, boolean param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
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
              ((dg) this).field_k = param0;
              if (param1) {
                break L1;
              } else {
                var4 = null;
                dg discarded$2 = ((dg) this).a((oh[]) null, true);
                break L1;
              }
            }
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("dg.H(");
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (dg) this;
    }

    final void a(int param0, int param1, int param2, qn param3, na param4) {
        RuntimeException var6 = null;
        String var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        jb stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        jb stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        jb stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        jb stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        jb stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        jb stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        jb stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        jb stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        jb stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
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
        jb stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        jb stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        jb stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        jb stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        jb stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        jb stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        jb stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        jb stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        jb stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
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
        try {
          L0: {
            L1: {
              qj.a(param4.field_F, (byte) -36, ((dg) this).field_k, param2 + param4.field_t, param4.field_u, param1 + param4.field_w);
              if (((dg) this).field_n == null) {
                break L1;
              } else {
                L2: {
                  var6_int = param4.field_t + param2 + ((dg) this).field_b;
                  if (param3.field_k != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param4.field_F - ((dg) this).field_n.field_t) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param4.field_w + (param1 + ((dg) this).field_f);
                  if (1 != param3.field_d) {
                    break L3;
                  } else {
                    var7 = var7 + (-((dg) this).field_n.field_F + param4.field_u) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (param3.field_k != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param4.field_F - ((dg) this).field_n.field_t);
                    break L4;
                  }
                }
                L5: {
                  if (2 != param3.field_d) {
                    break L5;
                  } else {
                    var7 = var7 + (-((dg) this).field_n.field_F + param4.field_u);
                    break L5;
                  }
                }
                ((dg) this).field_n.c(var6_int, var7);
                break L1;
              }
            }
            L6: {
              var6_ref = param3.c(param4, 4373);
              if (param0 == 46) {
                break L6;
              } else {
                var8 = null;
                ((dg) this).a(-111, 99, -82, (qn) null, (na) null);
                break L6;
              }
            }
            L7: {
              if (var6_ref == null) {
                break L7;
              } else {
                if (null == param3.field_b) {
                  break L7;
                } else {
                  if (((dg) this).field_i < 0) {
                    break L7;
                  } else {
                    L8: {
                      stackOut_15_0 = param3.field_b;
                      stackOut_15_1 = (String) var6_ref;
                      stackOut_15_2 = param3.field_f + param2;
                      stackOut_15_3 = -param4.field_t;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      if (((dg) this).field_b == -2147483648) {
                        stackOut_17_0 = (jb) (Object) stackIn_17_0;
                        stackOut_17_1 = (String) (Object) stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackOut_17_3 = stackIn_17_3;
                        stackOut_17_4 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        stackIn_18_3 = stackOut_17_3;
                        stackIn_18_4 = stackOut_17_4;
                        break L8;
                      } else {
                        stackOut_16_0 = (jb) (Object) stackIn_16_0;
                        stackOut_16_1 = (String) (Object) stackIn_16_1;
                        stackOut_16_2 = stackIn_16_2;
                        stackOut_16_3 = stackIn_16_3;
                        stackOut_16_4 = ((dg) this).field_b;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        stackIn_18_3 = stackOut_16_3;
                        stackIn_18_4 = stackOut_16_4;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_18_0 = (jb) (Object) stackIn_18_0;
                      stackOut_18_1 = (String) (Object) stackIn_18_1;
                      stackOut_18_2 = stackIn_18_2 - (stackIn_18_3 + -stackIn_18_4);
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      if (((dg) this).field_f != -2147483648) {
                        stackOut_20_0 = (jb) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = ((dg) this).field_f;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        break L9;
                      } else {
                        stackOut_19_0 = (jb) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = 0;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_21_0 = (jb) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = stackIn_21_3 + (param1 + param4.field_w + param3.field_j);
                      stackOut_21_4 = -param3.field_g + param4.field_F - param3.field_f;
                      stackOut_21_5 = -param3.field_h + (-param3.field_j + param4.field_u);
                      stackOut_21_6 = ((dg) this).field_i;
                      stackOut_21_7 = ((dg) this).field_c;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      stackIn_23_5 = stackOut_21_5;
                      stackIn_23_6 = stackOut_21_6;
                      stackIn_23_7 = stackOut_21_7;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      stackIn_22_4 = stackOut_21_4;
                      stackIn_22_5 = stackOut_21_5;
                      stackIn_22_6 = stackOut_21_6;
                      stackIn_22_7 = stackOut_21_7;
                      if (((dg) this).field_h == -2147483648) {
                        stackOut_23_0 = (jb) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = 256;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        stackIn_24_6 = stackOut_23_6;
                        stackIn_24_7 = stackOut_23_7;
                        stackIn_24_8 = stackOut_23_8;
                        break L10;
                      } else {
                        stackOut_22_0 = (jb) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = stackIn_22_3;
                        stackOut_22_4 = stackIn_22_4;
                        stackOut_22_5 = stackIn_22_5;
                        stackOut_22_6 = stackIn_22_6;
                        stackOut_22_7 = stackIn_22_7;
                        stackOut_22_8 = ((dg) this).field_h;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        stackIn_24_4 = stackOut_22_4;
                        stackIn_24_5 = stackOut_22_5;
                        stackIn_24_6 = stackOut_22_6;
                        stackIn_24_7 = stackOut_22_7;
                        stackIn_24_8 = stackOut_22_8;
                        break L10;
                      }
                    }
                    int discarded$1 = ((jb) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, param3.field_k, param3.field_d, param3.field_c);
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("dg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final dg b(int param0, int param1) {
        if (param1 != 2) {
            dg discarded$0 = ((dg) this).a((byte) 106, false);
        }
        ((dg) this).field_c = param0;
        return (dg) this;
    }

    final dg a(int param0, int param1) {
        if (param0 != 2) {
            field_l = null;
        }
        ((dg) this).field_i = param1;
        return (dg) this;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        bc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        eh var11 = null;
        bc var12 = null;
        int[] var13 = null;
        cf var14 = null;
        cf var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var12 = kb.field_q;
              var2 = var12.d((byte) -99);
              if (var2 != 0) {
                if (var2 != 1) {
                  if (2 != var2) {
                    fk.a(-93, (Throwable) null, "A1: " + hc.a(false));
                    mk.a(false);
                    break L1;
                  } else {
                    var15 = (cf) (Object) sf.field_a.c(false);
                    if (var15 == null) {
                      mk.a(false);
                      return;
                    } else {
                      var15.field_u = lh.h(-7990);
                      var15.field_t = var15.field_u[0];
                      var15.field_s = true;
                      var15.b(false);
                      break L1;
                    }
                  }
                } else {
                  var11 = (eh) (Object) qn.field_t.c(false);
                  if (var11 != null) {
                    var11.b(false);
                    break L1;
                  } else {
                    mk.a(false);
                    return;
                  }
                }
              } else {
                var10 = lh.h(-7990);
                var18 = var10;
                var17 = var18;
                var16 = var17;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((bh) (Object) var5).d((byte) -99);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (cf) (Object) sf.field_a.c(false);
                    if (var14 != null) {
                      var14.field_u = var3;
                      var14.field_s = true;
                      var14.field_t = var18[0];
                      var14.b(false);
                      break L1;
                    } else {
                      mk.a(false);
                      return;
                    }
                  } else {
                    var9[var7] = ((bh) (Object) var5).f(122);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "dg.E(" + -1 + ')');
        }
    }

    final dg a(byte param0, int param1) {
        ((dg) this).field_b = param1;
        if (param0 != -128) {
            return null;
        }
        return (dg) this;
    }

    final void a(int param0, na param1, dg param2, boolean param3, int param4, qn param5) {
        RuntimeException var7 = null;
        Object var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
              if (!((dg) this).field_a) {
                break L1;
              } else {
                param2.a(46, param0, param4, param5, param1);
                param2.a(30033);
                break L1;
              }
            }
            L2: {
              if (((dg) this).field_c >= -1) {
                param2.field_c = ((dg) this).field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((dg) this).field_f != -2147483648) {
                param2.field_f = ((dg) this).field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != ((dg) this).field_k) {
                param2.field_k = ((dg) this).field_k;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 > ((dg) this).field_i) {
                break L5;
              } else {
                param2.field_i = ((dg) this).field_i;
                break L5;
              }
            }
            L6: {
              if (-2147483648 == ((dg) this).field_h) {
                break L6;
              } else {
                param2.field_h = ((dg) this).field_h;
                break L6;
              }
            }
            L7: {
              if (null == ((dg) this).field_n) {
                break L7;
              } else {
                param2.field_n = ((dg) this).field_n;
                break L7;
              }
            }
            L8: {
              if (param3) {
                break L8;
              } else {
                var8 = null;
                bf discarded$1 = dg.a(-102, (byte) 68, (wf) null);
                break L8;
              }
            }
            L9: {
              if (((dg) this).field_b == -2147483648) {
                break L9;
              } else {
                param2.field_b = ((dg) this).field_b;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("dg.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final void a(int param0) {
        ((dg) this).field_h = 256;
        if (param0 != 30033) {
            dg discarded$0 = ((dg) this).b(6, -45);
        }
        ((dg) this).field_b = 0;
        ((dg) this).field_n = null;
        ((dg) this).field_i = 0;
        ((dg) this).field_k = null;
        ((dg) this).field_f = 0;
        ((dg) this).field_c = -1;
    }

    final static void a(boolean param0, byte param1) {
        if (!(!ak.a(3058))) {
            param0 = false;
        }
        vd.b(param0, 0);
        if (wl.field_d) {
            ra.e(we.field_e.field_g.field_M, we.field_e.field_g.field_yb, we.field_e.field_g.field_Hb, we.field_e.field_g.field_R);
            we.field_e.field_g.a(param0, 256);
        }
        h.a((byte) -89, param0);
    }

    final dg a(byte param0, boolean param1) {
        if (param0 != -77) {
            Object var4 = null;
            dg discarded$0 = ((dg) this).a((oh[]) null, true);
        }
        ((dg) this).field_a = param1 ? true : false;
        return (dg) this;
    }

    final void a(dg param0, int param1) {
        try {
            param0.field_c = ((dg) this).field_c;
            param0.field_a = ((dg) this).field_a;
            param0.field_f = ((dg) this).field_f;
            param0.field_b = ((dg) this).field_b;
            param0.field_i = ((dg) this).field_i;
            param0.field_n = ((dg) this).field_n;
            param0.field_k = ((dg) this).field_k;
            int var3_int = -14 / ((param1 - 6) / 54);
            param0.field_h = ((dg) this).field_h;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "dg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        hl var5 = null;
        hl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        hl var15 = null;
        String var16 = null;
        hl var17 = null;
        int stackIn_11_0 = 0;
        hl stackIn_23_0 = null;
        hl stackIn_24_0 = null;
        hl stackIn_25_0 = null;
        String stackIn_25_1 = null;
        hl stackIn_26_0 = null;
        String[] stackIn_26_1 = null;
        hl stackIn_27_0 = null;
        String[] stackIn_27_1 = null;
        hl stackIn_28_0 = null;
        String[] stackIn_28_1 = null;
        String stackIn_28_2 = null;
        String stackIn_53_0 = null;
        hl stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        hl stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        hl stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        hl stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        hl stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        hl stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        hl stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        hl stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        hl stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        hl stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        hl stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        hl stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        hl stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        hl stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        hl stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        String stackOut_52_0 = null;
        String stackOut_51_0 = null;
        hl stackOut_22_0 = null;
        hl stackOut_24_0 = null;
        String stackOut_24_1 = null;
        hl stackOut_23_0 = null;
        String stackOut_23_1 = null;
        hl stackOut_25_0 = null;
        String[] stackOut_25_1 = null;
        hl stackOut_27_0 = null;
        String[] stackOut_27_1 = null;
        String stackOut_27_2 = null;
        hl stackOut_26_0 = null;
        String[] stackOut_26_1 = null;
        String stackOut_26_2 = null;
        hl stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        hl stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        hl stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        hl stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        hl stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        hl stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        hl stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        hl stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        hl stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        hl stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        hl stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        hl stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        hl stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        hl stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        hl stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              nb.a(ng.field_t, (byte) 89);
              if (null != qe.field_a) {
                L2: {
                  L3: {
                    var15 = nm.field_n;
                    var17 = var15;
                    nm.field_n.field_R = 0;
                    var17.field_Hb = 0;
                    var5 = rn.field_c;
                    rn.field_c.field_R = 0;
                    var5.field_Hb = 0;
                    tn.field_a.field_R = 0;
                    var6 = tn.field_a;
                    var6.field_Hb = 0;
                    ua.field_d.field_jb = lh.field_u.toUpperCase();
                    var7 = (2 + fk.field_V.field_Hb) / 2;
                    tn.field_a.a((byte) -99, var7 + -2, fk.field_V.field_R - 40, 40, 0);
                    rn.field_c.a((byte) -124, fk.field_V.field_Hb - var7, -40 + fk.field_V.field_R, 40, var7);
                    if (cl.field_f.length != 1) {
                      break L3;
                    } else {
                      if (2 != cl.field_f[0]) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (cl.field_f.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if ((km.field_o[var10 / 8] & 1 << (var10 & 7)) == 0) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (cl.field_f[var10] != 2) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (var9_int == 0) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                rn.field_c.field_S = true;
                if (kl.field_a) {
                  L9: {
                    eh.field_q.field_jb = kk.field_R;
                    qi.field_n.field_S = false;
                    if (var8 != 0) {
                      stackOut_52_0 = md.field_I;
                      stackIn_53_0 = stackOut_52_0;
                      break L9;
                    } else {
                      stackOut_51_0 = ni.field_i;
                      stackIn_53_0 = stackOut_51_0;
                      break L9;
                    }
                  }
                  L10: {
                    var16 = stackIn_53_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = tn.field_a.field_Ib.b(var16) - -(3 * tn.field_a.field_Ib.a('.'));
                    tn.field_a.field_V = (tn.field_a.field_Hb - var10) / 2;
                    if ((cb.field_u & 48) != 16) {
                      break L10;
                    } else {
                      var9 = var16 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    tn.field_a.field_xb = 0;
                    if (32 != (48 & cb.field_u)) {
                      break L11;
                    } else {
                      var9 = var9 + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if ((48 & cb.field_u) == 48) {
                      var9 = var9 + "...";
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  tn.field_a.field_jb = var9;
                  rn.field_c.field_jb = rj.field_c.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackOut_22_0 = rn.field_c;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var8 == 0) {
                      stackOut_24_0 = (hl) (Object) stackIn_24_0;
                      stackOut_24_1 = el.field_Ob;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L13;
                    } else {
                      stackOut_23_0 = (hl) (Object) stackIn_23_0;
                      stackOut_23_1 = cb.field_q;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_25_0.field_jb = ((String) (Object) stackIn_25_1).toUpperCase();
                    stackOut_25_0 = eh.field_q;
                    stackOut_25_1 = new String[]{rn.field_c.field_jb};
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (var8 == 0) {
                      stackOut_27_0 = (hl) (Object) stackIn_27_0;
                      stackOut_27_1 = (String[]) (Object) stackIn_27_1;
                      stackOut_27_2 = ib.field_c;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      break L14;
                    } else {
                      stackOut_26_0 = (hl) (Object) stackIn_26_0;
                      stackOut_26_1 = (String[]) (Object) stackIn_26_1;
                      stackOut_26_2 = ml.field_cb;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_28_0.field_jb = sk.a(stackIn_28_1, stackIn_28_2, 122);
                    nn.field_R = true;
                    tn.field_a.field_jb = ei.field_o;
                    qi.field_n.field_S = true;
                    if (null != uj.field_s) {
                      L16: {
                        if (eg.field_K != null) {
                          break L16;
                        } else {
                          rh.field_G = new boolean[hg.field_k];
                          eg.field_K = new byte[hg.field_k];
                          break L16;
                        }
                      }
                      nn.field_R = false;
                      n.field_P = false;
                      var13 = 0;
                      var9_int = var13;
                      L17: while (true) {
                        if (hg.field_k <= var13) {
                          lk.a(true, (byte) -119, -1, qe.field_a, 0, -1, hg.field_k, -1);
                          if (dd.field_c < 2) {
                            break L15;
                          } else {
                            if (sn.field_a[12]) {
                              nn.field_R = true;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        } else {
                          rh.field_G[var13] = false;
                          var13++;
                          continue L17;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  if (nn.field_R) {
                    break L1;
                  } else {
                    rn.field_c.field_S = false;
                    if (rn.field_c.field_rb) {
                      L18: {
                        var9 = null;
                        if (!n.field_P) {
                          break L18;
                        } else {
                          var9 = "<col=A00000>" + fi.field_zb + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L18;
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (hg.field_k <= var10) {
                          re.field_P = "<col=A00000>" + vg.field_Nb + "<br>" + da.field_a + var9;
                          break L1;
                        } else {
                          L20: {
                            if (!rh.field_G[var10]) {
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_63_0 = tl.field_P;
                stackOut_63_1 = 0;
                stackIn_67_0 = stackOut_63_0;
                stackIn_67_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (!param0) {
                  break L22;
                } else {
                  stackOut_64_0 = (hl) (Object) stackIn_64_0;
                  stackOut_64_1 = stackIn_64_1;
                  stackIn_67_0 = stackOut_64_0;
                  stackIn_67_1 = stackOut_64_1;
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  if (param2) {
                    break L22;
                  } else {
                    stackOut_65_0 = (hl) (Object) stackIn_65_0;
                    stackOut_65_1 = stackIn_65_1;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (lg.field_S) {
                      break L22;
                    } else {
                      stackOut_66_0 = (hl) (Object) stackIn_66_0;
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      stackIn_68_1 = stackOut_66_1;
                      stackIn_68_2 = stackOut_66_2;
                      break L21;
                    }
                  }
                }
              }
              stackOut_67_0 = (hl) (Object) stackIn_67_0;
              stackOut_67_1 = stackIn_67_1;
              stackOut_67_2 = 0;
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L21;
            }
            L23: {
              L24: {
                ((hl) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2 != 0);
                stackOut_68_0 = fk.field_V;
                stackOut_68_1 = 0;
                stackIn_72_0 = stackOut_68_0;
                stackIn_72_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (!param0) {
                  break L24;
                } else {
                  stackOut_69_0 = (hl) (Object) stackIn_69_0;
                  stackOut_69_1 = stackIn_69_1;
                  stackIn_72_0 = stackOut_69_0;
                  stackIn_72_1 = stackOut_69_1;
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  if (param2) {
                    break L24;
                  } else {
                    stackOut_70_0 = (hl) (Object) stackIn_70_0;
                    stackOut_70_1 = stackIn_70_1;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    if (lg.field_S) {
                      break L24;
                    } else {
                      stackOut_71_0 = (hl) (Object) stackIn_71_0;
                      stackOut_71_1 = stackIn_71_1;
                      stackOut_71_2 = 1;
                      stackIn_73_0 = stackOut_71_0;
                      stackIn_73_1 = stackOut_71_1;
                      stackIn_73_2 = stackOut_71_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_72_0 = (hl) (Object) stackIn_72_0;
              stackOut_72_1 = stackIn_72_1;
              stackOut_72_2 = 0;
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L23;
            }
            L25: {
              L26: {
                ((hl) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2 != 0);
                stackOut_73_0 = fj.field_b;
                stackOut_73_1 = 0;
                stackIn_77_0 = stackOut_73_0;
                stackIn_77_1 = stackOut_73_1;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                if (!param0) {
                  break L26;
                } else {
                  stackOut_74_0 = (hl) (Object) stackIn_74_0;
                  stackOut_74_1 = stackIn_74_1;
                  stackIn_77_0 = stackOut_74_0;
                  stackIn_77_1 = stackOut_74_1;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  if (param2) {
                    break L26;
                  } else {
                    stackOut_75_0 = (hl) (Object) stackIn_75_0;
                    stackOut_75_1 = stackIn_75_1;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    if (!lg.field_S) {
                      break L26;
                    } else {
                      stackOut_76_0 = (hl) (Object) stackIn_76_0;
                      stackOut_76_1 = stackIn_76_1;
                      stackOut_76_2 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      stackIn_78_2 = stackOut_76_2;
                      break L25;
                    }
                  }
                }
              }
              stackOut_77_0 = (hl) (Object) stackIn_77_0;
              stackOut_77_1 = stackIn_77_1;
              stackOut_77_2 = 0;
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L25;
            }
            L27: {
              ((hl) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2 != 0);
              we.field_e.field_g.c(true);
              if (qe.field_a == null) {
                break L27;
              } else {
                L28: {
                  if (qi.field_n.field_F != 0) {
                    tb.a(11, -15289);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (rn.field_c.field_F == 0) {
                    break L29;
                  } else {
                    if (!kl.field_a) {
                      l.a(0, 11);
                      break L29;
                    } else {
                      oi.a((byte) 126, 11);
                      break L29;
                    }
                  }
                }
                hg.a(11, qe.field_a, 30544, true);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "dg.D(" + param0 + ',' + false + ',' + param2 + ',' + 11 + ')');
        }
    }

    dg() {
        ((dg) this).field_b = -2147483648;
        ((dg) this).field_f = -2147483648;
        ((dg) this).field_a = false;
        ((dg) this).field_i = -2;
        ((dg) this).field_k = null;
        ((dg) this).field_h = -2147483648;
        ((dg) this).field_n = null;
        ((dg) this).field_c = -2;
    }

    final static bf a(int param0, byte param1, wf param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bf stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_0_0 = null;
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
            var3_int = -58 / ((param1 - 71) / 52);
            stackOut_0_0 = we.a(-11040, ee.a(param2, 100, param0));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final dg a(int param0, byte param1) {
        ((dg) this).field_f = param0;
        if (param1 != 12) {
            field_m = null;
        }
        return (dg) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please wait...";
        field_d = "<%0> has resigned and is offering a rematch.";
        field_l = "Chat is currently disabled.";
    }
}
