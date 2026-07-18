/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dl extends dg {
    private int field_H;
    static pb[] field_C;
    private int field_J;
    private int field_E;
    static re field_A;
    private int field_F;
    private boolean field_I;
    static String field_K;
    private boolean field_D;
    static String field_B;
    static int field_G;

    final static int a(int param0, int param1) {
        param1 = ((-1431655765 & param1) >>> 1) + (param1 & 1431655765);
        param1 = (858993459 & param1) + (param1 >>> 2 & -214748365);
        param1 = 252645135 & (param1 >>> 4) + param1;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    public static void i(int param0) {
        field_A = null;
        field_B = null;
        field_C = null;
        field_K = null;
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        try {
            super.a(param0, -118, param2, param3, param4, param5);
            int var7_int = -65 / ((-50 - param1) / 57);
            ((dl) this).field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "dl.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static pb[] d(byte param0) {
        pb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = stellarshard.field_B;
        var1 = new pb[sb.field_b];
        var2 = 0;
        L0: while (true) {
          if (sb.field_b <= var2) {
            tb.f((byte) -66);
            return var1;
          } else {
            var3 = vc.field_b[var2] * ih.field_d[var2];
            var21 = ih.field_b[var2];
            if (sk.field_c[var2]) {
              var23 = lj.field_D[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (pb) (Object) new jc(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var24);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = vf.b(gj.field_w[sa.a(255, (int) var21[var7])], sa.a((int) var23[var7], 255) << 24);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new pb(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = gj.field_w[sa.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_8_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
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
        try {
          L0: {
            L1: {
              if (!((dl) this).a((byte) 122, param3, param2, param0)) {
                break L1;
              } else {
                ((dl) this).a((byte) 116, param0, param2, param3);
                ((dl) this).a(-81, param2, param3, param0);
                StringBuilder discarded$26 = param2.append(" revert=").append(((dl) this).field_I);
                if (((dl) this).field_F == 2147483647) {
                  break L1;
                } else {
                  if (2147483647 != ((dl) this).field_E) {
                    StringBuilder discarded$27 = param2.append(" to ").append(((dl) this).field_F).append(',').append(((dl) this).field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                var6 = null;
                ((dl) this).a(108, true, -82, (rj) null);
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param2;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("dl.T(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0) {
        super.a(param0);
        ((dl) this).field_y.b(((dl) this).field_p, 0, 0, ((dl) this).field_t, 23987);
        ((dl) this).field_E = ((dl) this).field_k;
        ((dl) this).field_F = ((dl) this).field_w;
    }

    private dl(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((dl) this).field_E = 2147483647;
        ((dl) this).field_F = 2147483647;
        try {
            ((dl) this).field_y = param6;
            ((dl) this).field_I = param7 ? true : false;
            ((dl) this).field_D = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "dl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static a[] a(ej param0, boolean param1) {
        RuntimeException var2 = null;
        re var2_ref = null;
        int var7 = 0;
        re var8 = null;
        a[] stackIn_4_0 = null;
        a[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        a[] stackOut_3_0 = null;
        a[] stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            if (!param0.a(-102)) {
              stackOut_3_0 = new a[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param0.b(103);
              var2_ref = var8;
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (var8.field_f == 2) {
                    stackOut_10_0 = new a[]{};
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  jj.a((byte) -113, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("dl.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + false + ')');
        }
        return stackIn_11_0;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
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
            var8_int = super.a(param0, param1, param2, param3, param4, (byte) 119, param6) ? 1 : 0;
            if (param5 >= 24) {
              L1: {
                if (var8_int == 0) {
                  break L1;
                } else {
                  if (((dl) this).field_D) {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!((dl) this).a((byte) 124, param6, param3, param1, param4)) {
                stackOut_11_0 = var8_int;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                ((dl) this).field_o = param2;
                if (param2 == 1) {
                  lk.field_e = (dl) this;
                  ((dl) this).field_H = -param6 + param3 + -((dl) this).field_k;
                  ((dl) this).field_J = -param4 + -((dl) this).field_w + param1;
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  return true;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("dl.P(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
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
              L2: {
                L3: {
                  L4: {
                    if (!(((dl) this).field_y instanceof ig)) {
                      break L4;
                    } else {
                      if (!((ig) (Object) ((dl) this).field_y).field_E) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (1 != ((dl) this).field_o) {
                    break L3;
                  } else {
                    L5: {
                      var5_int = -((dl) this).field_J + (ni.field_e + -param2);
                      var6 = -((dl) this).field_H + eb.field_a - param0;
                      if (var5_int != ((dl) this).field_w) {
                        break L5;
                      } else {
                        if (((dl) this).field_k == var6) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((dl) this).field_k = var6;
                    ((dl) this).field_w = var5_int;
                    if (!(((dl) this).field_v instanceof gl)) {
                      break L2;
                    } else {
                      ((gl) (Object) ((dl) this).field_v).a(param2, (dl) this, param1, param0);
                      break L2;
                    }
                  }
                }
                if (((dl) this).field_I) {
                  L6: {
                    if (((dl) this).field_w == ((dl) this).field_F) {
                      break L6;
                    } else {
                      L7: {
                        var5_int = ((dl) this).field_F - ((dl) this).field_w;
                        stackOut_13_0 = this;
                        stackOut_13_1 = ((dl) this).field_w;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (Math.abs(var5_int) <= 2) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var5_int <= 0) {
                            stackOut_17_0 = this;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = -1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            break L7;
                          } else {
                            stackOut_16_0 = this;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            break L7;
                          }
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = var5_int >> 1;
                          stackIn_18_0 = stackOut_14_0;
                          stackIn_18_1 = stackOut_14_1;
                          stackIn_18_2 = stackOut_14_2;
                          break L7;
                        }
                      }
                      ((dl) this).field_w = stackIn_18_1 + stackIn_18_2;
                      break L6;
                    }
                  }
                  if (((dl) this).field_E != ((dl) this).field_k) {
                    L8: {
                      var5_int = -((dl) this).field_k + ((dl) this).field_E;
                      stackOut_21_0 = this;
                      stackOut_21_1 = ((dl) this).field_k;
                      stackIn_25_0 = stackOut_21_0;
                      stackIn_25_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (-3 > Math.abs(var5_int)) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = var5_int >> 1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        break L8;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (-1 < var5_int) {
                          stackOut_24_0 = this;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          break L8;
                        } else {
                          stackOut_23_0 = this;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = -1;
                          stackIn_26_0 = stackOut_23_0;
                          stackIn_26_1 = stackOut_23_1;
                          stackIn_26_2 = stackOut_23_2;
                          break L8;
                        }
                      }
                    }
                    ((dl) this).field_k = stackIn_26_1 + stackIn_26_2;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  break L1;
                }
              }
              super.a(param0, param1, param2, param3);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("dl.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_B = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_G = 5;
    }
}
