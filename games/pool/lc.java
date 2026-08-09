/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc extends fe {
    private int field_S;
    static Random field_P;
    private ip field_N;
    static String field_Q;
    static vh field_U;
    static int field_V;
    static String field_T;
    static String field_R;
    static lr field_O;

    final static void a(boolean param0, String param1, int param2, int param3, long param4, int param5) {
        int var7_int = 0;
        try {
            ej.field_j.b(false, param3);
            ej.field_j.field_v = ej.field_j.field_v + 1;
            int var8 = 55 % ((param5 - -38) / 51);
            var7_int = ej.field_j.field_v;
            ej.field_j.a(param4, (byte) -79);
            ej.field_j.a(-9946, param1);
            ej.field_j.a(param2, false);
            ej.field_j.a(!param0 ? 0 : 1, false);
            ej.field_j.b(ej.field_j.field_v - var7_int, true);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "lc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String e(int param0) {
        if (!(!this.field_s)) {
            return this.field_N.a(98);
        }
        if (param0 <= -10) {
            return null;
        }
        return (String) null;
    }

    public static void g(byte param0) {
        field_P = null;
        field_Q = null;
        field_T = null;
        int var1 = -32 / ((29 - param0) / 48);
        field_U = null;
        field_O = null;
        field_R = null;
    }

    lc(ip param0) {
        try {
            this.field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -87 % ((param1 - -43) / 47);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("lc.M(");

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
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            this.field_S = this.field_S + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "lc.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        na var9;
        int var10;
        int var11;
        int var12;
        dd var13;
        dd var14;
        dd var15;
        var12 = Pool.field_O;
        super.a(param0, (byte) -122, param2, param3);
        if (-1 != (param0 ^ -1)) {
          return;
        } else {
          L0: {
            L1: {
              var5 = (this.field_l >> -239556031) + (this.field_C + param2);
              var7 = 1 % ((-42 - param1) / 53);
              var6 = (this.field_y >> 192158081) + (param3 + this.field_D);
              var9 = this.field_N.c(-31873);
              if (ji.field_h == var9) {
                break L1;
              } else {
                if (no.field_k != var9) {
                  if (var9 == gp.field_d) {
                    var15 = bo.field_a[2];
                    var15.c(-(var15.field_z >> 374229793) + var5, var6 - (var15.field_A >> 1883728065), 256);
                    break L0;
                  } else {
                    if (var9 != kr.field_e) {
                      break L0;
                    } else {
                      var14 = bo.field_a[1];
                      var14.c(-(var14.field_z >> -2075578783) + var5, -(var14.field_A >> -759010111) + var6, 256);
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var13 = bo.field_a[0];
                var10 = var13.field_w << 1000193441;
                var11 = var13.field_y << -667739711;
                if (null == sm.field_z) {
                  break L3;
                } else {
                  if (sm.field_z.field_z < var10) {
                    break L3;
                  } else {
                    if (sm.field_z.field_A < var11) {
                      break L3;
                    } else {
                      kj.a(104, sm.field_z);
                      qh.d();
                      break L2;
                    }
                  }
                }
              }
              sm.field_z = new dd(var10, var11);
              kj.a(56, sm.field_z);
              break L2;
            }
            var13.b(112, 144, var13.field_w << -982641820, var13.field_y << -459286108, -this.field_S << 684841482, 4096);
            oc.a(112);
            sm.field_z.c(-var13.field_w + var5, var6 + -var13.field_y, 256);
            break L0;
          }
          return;
        }
    }

    final static int a(int param0, int param1, eh param2, oj param3) {
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.field_z == null) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (param2.field_A == param3.field_l) {
                      var4_int = param3.field_z.length;
                      var5 = param2.field_z[param0].length / var4_int;
                      var6 = param1;
                      L2: while (true) {
                        if (var6 >= var5) {
                          stackIn_21_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L3: {
                            if (param3.field_w != param2.field_q[param0][var6]) {
                              break L3;
                            } else {
                              if (or.a((byte) 3, param2.field_m[param0][var6])) {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_18_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param3.field_z[var7] != param2.field_z[param0][var7 + var6 * var4_int]) {
                                      break L3;
                                    } else {
                                      var7++;
                                      continue L4;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_21_0;
          }
        }
    }

    static {
        field_P = new Random();
        field_V = 20;
        field_Q = "Go Back";
        field_T = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_R = "Unpacking models";
    }
}
