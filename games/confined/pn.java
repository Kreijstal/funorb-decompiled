/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class pn {
    static bi field_k;
    static nf[] field_l;
    private int field_j;
    nf field_d;
    private int field_m;
    nf[] field_g;
    private int field_f;
    private int field_c;
    static double field_h;
    static String field_b;
    private boolean field_i;
    static ce field_a;
    private int field_e;

    final pn d(int param0, int param1) {
        if (param1 != -2) {
            ((pn) this).field_c = 70;
        }
        ((pn) this).field_c = param0;
        return (pn) this;
    }

    final pn c(int param0, int param1) {
        if (param1 <= 58) {
            return null;
        }
        ((pn) this).field_m = param0;
        return (pn) this;
    }

    final pn a(int param0, nf[] param1) {
        RuntimeException var3 = null;
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
              if (param0 == -1) {
                break L1;
              } else {
                ((pn) this).field_f = 74;
                break L1;
              }
            }
            ((pn) this).field_g = param1;
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pn.I(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (pn) this;
    }

    final pn a(int param0, int param1) {
        if (param0 != 1918) {
            Object var4 = null;
            ((pn) this).a(6, -47, (fj) null, (byte) -120, (qh) null);
        }
        ((pn) this).field_f = param1;
        return (pn) this;
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 >= -74) {
            field_h = 1.4272429316816215;
        }
        field_a = null;
        field_b = null;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = pn.a(31, (String) null);
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-var4 + -1 + var2_int] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("pn.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, pn param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.field_d = ((pn) this).field_d;
              param1.field_f = ((pn) this).field_f;
              param1.field_i = ((pn) this).field_i;
              param1.field_m = ((pn) this).field_m;
              param1.field_j = ((pn) this).field_j;
              param1.field_c = ((pn) this).field_c;
              param1.field_e = ((pn) this).field_e;
              param1.field_g = ((pn) this).field_g;
              if (!param0) {
                break L1;
              } else {
                field_h = 0.5523327335770317;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pn.L(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void b(int param0) {
        ((pn) this).field_g = null;
        ((pn) this).field_f = 0;
        ((pn) this).field_m = -1;
        ((pn) this).field_d = null;
        ((pn) this).field_e = 0;
        ((pn) this).field_j = 256;
        if (param0 != 2585) {
            return;
        }
        ((pn) this).field_c = 0;
    }

    final pn a(boolean param0, int param1) {
        if (param1 != 0) {
            field_k = null;
        }
        ((pn) this).field_i = param0 ? true : false;
        return (pn) this;
    }

    final void a(int param0, int param1, fj param2, byte param3, qh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        ok stackIn_20_0 = null;
        String stackIn_20_1 = null;
        ok stackIn_21_0 = null;
        String stackIn_21_1 = null;
        ok stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        ok stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        ok stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        ok stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        ok stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        ok stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        ok stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_19_0 = null;
        String stackOut_19_1 = null;
        ok stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        ok stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        ok stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        ok stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        ok stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        ok stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        ok stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        ok stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              di.a(param2.field_z, ((pn) this).field_g, (byte) -116, param0 + param2.field_q, param2.field_F, param1 + param2.field_m);
              if (((pn) this).field_d != null) {
                L2: {
                  var6_int = ((pn) this).field_e + param2.field_q + param0;
                  if (1 == param4.field_p) {
                    var6_int = var6_int + (-((pn) this).field_d.field_t + param2.field_F) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = ((pn) this).field_c + param1 - -param2.field_m;
                  if (param4.field_k != 1) {
                    break L3;
                  } else {
                    var7 = var7 + (-((pn) this).field_d.field_x + param2.field_z) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (2 == param4.field_p) {
                    var6_int = var6_int + (-((pn) this).field_d.field_t + param2.field_F);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param4.field_k) {
                    var7 = var7 + (param2.field_z - ((pn) this).field_d.field_x);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((pn) this).field_d.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            var6_ref = param4.b(param2, -2);
            if (param3 >= 43) {
              L6: {
                if (var6_ref == null) {
                  break L6;
                } else {
                  if (param4.field_a == null) {
                    break L6;
                  } else {
                    if (((pn) this).field_f < 0) {
                      break L6;
                    } else {
                      L7: {
                        stackOut_19_0 = param4.field_a;
                        stackOut_19_1 = (String) var6_ref;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (((pn) this).field_e == -2147483648) {
                          stackOut_21_0 = (ok) (Object) stackIn_21_0;
                          stackOut_21_1 = (String) (Object) stackIn_21_1;
                          stackOut_21_2 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          break L7;
                        } else {
                          stackOut_20_0 = (ok) (Object) stackIn_20_0;
                          stackOut_20_1 = (String) (Object) stackIn_20_1;
                          stackOut_20_2 = ((pn) this).field_e;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          break L7;
                        }
                      }
                      L8: {
                        stackOut_22_0 = (ok) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2 + (param0 + param2.field_q) - -param4.field_h;
                        stackOut_22_3 = param2.field_m + param1;
                        stackOut_22_4 = -param4.field_b;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        stackIn_24_4 = stackOut_22_4;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        stackIn_23_4 = stackOut_22_4;
                        if (((pn) this).field_c == -2147483648) {
                          stackOut_24_0 = (ok) (Object) stackIn_24_0;
                          stackOut_24_1 = (String) (Object) stackIn_24_1;
                          stackOut_24_2 = stackIn_24_2;
                          stackOut_24_3 = stackIn_24_3;
                          stackOut_24_4 = stackIn_24_4;
                          stackOut_24_5 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          stackIn_25_3 = stackOut_24_3;
                          stackIn_25_4 = stackOut_24_4;
                          stackIn_25_5 = stackOut_24_5;
                          break L8;
                        } else {
                          stackOut_23_0 = (ok) (Object) stackIn_23_0;
                          stackOut_23_1 = (String) (Object) stackIn_23_1;
                          stackOut_23_2 = stackIn_23_2;
                          stackOut_23_3 = stackIn_23_3;
                          stackOut_23_4 = stackIn_23_4;
                          stackOut_23_5 = ((pn) this).field_c;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          stackIn_25_3 = stackOut_23_3;
                          stackIn_25_4 = stackOut_23_4;
                          stackIn_25_5 = stackOut_23_5;
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_25_0 = (ok) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3 - (stackIn_25_4 - stackIn_25_5);
                        stackOut_25_4 = param2.field_F - (param4.field_h - -param4.field_r);
                        stackOut_25_5 = -param4.field_b + (param2.field_z + -param4.field_j);
                        stackOut_25_6 = ((pn) this).field_f;
                        stackOut_25_7 = ((pn) this).field_m;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        stackIn_27_3 = stackOut_25_3;
                        stackIn_27_4 = stackOut_25_4;
                        stackIn_27_5 = stackOut_25_5;
                        stackIn_27_6 = stackOut_25_6;
                        stackIn_27_7 = stackOut_25_7;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        stackIn_26_4 = stackOut_25_4;
                        stackIn_26_5 = stackOut_25_5;
                        stackIn_26_6 = stackOut_25_6;
                        stackIn_26_7 = stackOut_25_7;
                        if (((pn) this).field_j != -2147483648) {
                          stackOut_27_0 = (ok) (Object) stackIn_27_0;
                          stackOut_27_1 = (String) (Object) stackIn_27_1;
                          stackOut_27_2 = stackIn_27_2;
                          stackOut_27_3 = stackIn_27_3;
                          stackOut_27_4 = stackIn_27_4;
                          stackOut_27_5 = stackIn_27_5;
                          stackOut_27_6 = stackIn_27_6;
                          stackOut_27_7 = stackIn_27_7;
                          stackOut_27_8 = ((pn) this).field_j;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          stackIn_28_2 = stackOut_27_2;
                          stackIn_28_3 = stackOut_27_3;
                          stackIn_28_4 = stackOut_27_4;
                          stackIn_28_5 = stackOut_27_5;
                          stackIn_28_6 = stackOut_27_6;
                          stackIn_28_7 = stackOut_27_7;
                          stackIn_28_8 = stackOut_27_8;
                          break L9;
                        } else {
                          stackOut_26_0 = (ok) (Object) stackIn_26_0;
                          stackOut_26_1 = (String) (Object) stackIn_26_1;
                          stackOut_26_2 = stackIn_26_2;
                          stackOut_26_3 = stackIn_26_3;
                          stackOut_26_4 = stackIn_26_4;
                          stackOut_26_5 = stackIn_26_5;
                          stackOut_26_6 = stackIn_26_6;
                          stackOut_26_7 = stackIn_26_7;
                          stackOut_26_8 = 256;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_28_1 = stackOut_26_1;
                          stackIn_28_2 = stackOut_26_2;
                          stackIn_28_3 = stackOut_26_3;
                          stackIn_28_4 = stackOut_26_4;
                          stackIn_28_5 = stackOut_26_5;
                          stackIn_28_6 = stackOut_26_6;
                          stackIn_28_7 = stackOut_26_7;
                          stackIn_28_8 = stackOut_26_8;
                          break L9;
                        }
                      }
                      int discarded$1 = ((ok) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param4.field_p, param4.field_k, param4.field_s);
                      break L6;
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
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("pn.H(").append(param0).append(44).append(param1).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44).append(param3).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
    }

    final void a(int param0, pn param1, int param2, int param3, fj param4, qh param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
        try {
          L0: {
            L1: {
              if (!((pn) this).field_i) {
                break L1;
              } else {
                param1.a(param2, param0, param4, (byte) 52, param5);
                param1.b(param3 ^ 2147481062);
                break L1;
              }
            }
            L2: {
              if (((pn) this).field_e == -2147483648) {
                break L2;
              } else {
                param1.field_e = ((pn) this).field_e;
                break L2;
              }
            }
            L3: {
              if (null != ((pn) this).field_d) {
                param1.field_d = ((pn) this).field_d;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((pn) this).field_g == null) {
                break L4;
              } else {
                param1.field_g = ((pn) this).field_g;
                break L4;
              }
            }
            L5: {
              if (((pn) this).field_j == -2147483648) {
                break L5;
              } else {
                param1.field_j = ((pn) this).field_j;
                break L5;
              }
            }
            L6: {
              if (-1 > ((pn) this).field_f) {
                break L6;
              } else {
                param1.field_f = ((pn) this).field_f;
                break L6;
              }
            }
            L7: {
              if (((pn) this).field_c == param3) {
                break L7;
              } else {
                param1.field_c = ((pn) this).field_c;
                break L7;
              }
            }
            L8: {
              if (0 <= ((pn) this).field_m) {
                param1.field_m = ((pn) this).field_m;
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var7;
            stackOut_19_1 = new StringBuilder().append("pn.G(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          L10: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (wm.field_jb == null) {
                break L1;
              } else {
                if (wm.field_jb.equals((Object) (Object) param2.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) wm.field_jb;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (gk.field_v == null) {
                break L2;
              } else {
                if (!gk.field_v.equals((Object) (Object) param2.getParameter("session"))) {
                  var4 = (Object) (Object) gk.field_v;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = ec.a(-1, (String) var4, param0, (String) var3, -1);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("pn.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(-33).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final pn b(int param0, int param1) {
        if (param1 != -2147483648) {
            ((pn) this).field_f = -14;
        }
        ((pn) this).field_e = param0;
        return (pn) this;
    }

    pn() {
        ((pn) this).field_m = -2;
        ((pn) this).field_d = null;
        ((pn) this).field_f = -2;
        ((pn) this).field_g = null;
        ((pn) this).field_j = -2147483648;
        ((pn) this).field_i = false;
        ((pn) this).field_c = -2147483648;
        ((pn) this).field_e = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Basic energy weapon";
    }
}
