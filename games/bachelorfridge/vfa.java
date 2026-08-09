/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vfa extends td {
    static String field_r;
    static vr field_p;
    static String field_q;

    public static void b(int param0) {
        field_r = null;
        if (param0 != -14431) {
            return;
        }
        field_p = null;
        field_q = null;
    }

    final static jla a(int param0, int param1) {
        if (!(param1 != 5)) {
            return (jla) ((Object) new eca());
        }
        if (!(7 != param1)) {
            return (jla) ((Object) new ina(false));
        }
        if (param0 != 19341) {
            field_p = (vr) null;
        }
        if (!((param1 ^ -1) != -9)) {
            return (jla) ((Object) new ina(true));
        }
        if (param1 == 3) {
            return (jla) ((Object) new dl());
        }
        return new jla(param1);
    }

    vfa(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_k = param2;
            this.field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vfa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        bea stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        bea var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        aga var17 = null;
        int[][] var19 = null;
        int[][] var21 = null;
        int[][] var23 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var17 = this.field_h.a(93, param0);
              var4 = new bea(this.field_g, new nq(var17));
              var4.field_t = this.field_n;
              if (param1 == 3) {
                break L1;
              } else {
                vfa.b(-73);
                break L1;
              }
            }
            var4.field_q = this.field_k;
            var23 = var4.c(false);
            var6 = 17;
            var7 = 17;
            var8 = var6 + -1 >> -26217023;
            var9 = -1 + var7 >> 528665089;
            var10 = 0;
            var11_int = 0;
            L2: while (true) {
              if (var11_int >= var6) {
                L3: {
                  if (var10 >= 12) {
                    break L3;
                  } else {
                    var21 = new int[var10][2];
                    var19 = var21;
                    var11 = var19;
                    var16 = 0;
                    var12 = var16;
                    L4: while (true) {
                      if (var16 >= var21.length) {
                        var4.field_r = var11;
                        break L3;
                      } else {
                        var21[var16][0] = var4.field_r[var16][0];
                        var21[var16][1] = var4.field_r[var16][1];
                        var16++;
                        continue L4;
                      }
                    }
                  }
                }
                stackIn_24_0 = (bea) (var4);
                break L0;
              } else {
                var12 = 0;
                L5: while (true) {
                  if (var7 <= var12) {
                    var11_int++;
                    continue L2;
                  } else {
                    L6: {
                      if (var23[var11_int][var12] != 1) {
                        break L6;
                      } else {
                        var13 = -var8 + (var11_int + this.field_k);
                        var14 = this.field_n + (var12 + -var9);
                        if ((var13 ^ -1) > -1) {
                          break L6;
                        } else {
                          if (param0.field_z <= var13) {
                            break L6;
                          } else {
                            if (0 > var14) {
                              break L6;
                            } else {
                              if (param0.field_B > var14) {
                                if (var10 >= 12) {
                                  break L6;
                                } else {
                                  if (8 < kla.a(10, param0.field_w, -2147483648)) {
                                    break L6;
                                  } else {
                                    var4.field_r[var10][0] = var13;
                                    var4.field_r[var10][1] = var14;
                                    var10++;
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    var12++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("vfa.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_24_0);
    }

    final static fea a(String param0, vr param1, int param2, String param3, vr param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        fea stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1.a(param3, false);
            var7 = -21 % ((31 - param2) / 43);
            var6 = param1.a((byte) 6, var5_int, param0);
            stackIn_1_0 = jc.a(param4, var6, false, param1, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("vfa.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_r = "All players have left <%0>'s game.";
        field_q = "Invalid password.";
    }
}
