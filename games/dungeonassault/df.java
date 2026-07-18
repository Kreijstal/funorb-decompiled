/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_g;
    static cn field_c;
    static cn field_e;
    static String field_a;
    static String field_b;
    static String field_d;
    static String field_f;

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        ai var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 49) {
                break L0;
              } else {
                L2: {
                  var2 = qj.field_c[var1_int];
                  if (var2 != null) {
                    var2.field_f = qe.a(var2, false, false, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var2 = gm.field_d.field_L[var1_int];
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.field_f = qe.a(var2, false, false, 0);
                    break L3;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "df.A(" + 16 + ')');
        }
    }

    final static int a() {
        return (int)(-16912800L + kd.c(-2456) / 60000L);
    }

    final static qh a(boolean param0, wj param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        qh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qh stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param1.j(114, 8);
            if (0 >= var2_int) {
              L1: {
                var3 = jl.a(param1, -123) ? 1 : 0;
                var4 = jl.a(param1, 90) ? 1 : 0;
                var5 = new qh();
                var5.field_B = (short)param1.j(-101, 16);
                var5.field_L = aj.a(param1, var5.field_L, (byte) 31, 16);
                var5.field_S = aj.a(param1, var5.field_S, (byte) 31, 16);
                var5.field_z = aj.a(param1, var5.field_z, (byte) 31, 16);
                var5.field_h = (short)param1.j(-43, 16);
                var5.field_A = aj.a(param1, var5.field_A, (byte) 31, 16);
                var5.field_x = aj.a(param1, var5.field_x, (byte) 31, 16);
                var5.field_N = aj.a(param1, var5.field_N, (byte) 31, 16);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_c = (short)param1.j(-79, 16);
                  var5.field_d = aj.a(param1, var5.field_d, (byte) 31, 16);
                  var5.field_P = aj.a(param1, var5.field_P, (byte) 31, 16);
                  var5.field_v = aj.a(param1, var5.field_v, (byte) 31, 16);
                  var5.field_e = aj.a(param1, var5.field_e, (byte) 31, 16);
                  var5.field_s = aj.a(param1, var5.field_s, (byte) 31, 16);
                  var5.field_F = aj.a(param1, var5.field_F, (byte) 31, 16);
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$1 = param1.j(-97, 16);
                  var5.field_t = aj.a(param1, var5.field_t, (byte) 31, 16);
                  var5.field_Q = aj.a(param1, var5.field_Q, (byte) 31, 16);
                  var5.field_I = aj.a(param1, var5.field_I, (byte) 31, 16);
                  var5.field_n = aj.a(param1, var5.field_n, (byte) 31, 16);
                  var5.field_C = aj.a(param1, var5.field_C, (byte) 31, 16);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (jl.a(param1, -120)) {
                  var5.field_o = aj.a(param1, var5.field_o, (byte) 31, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (jl.a(param1, 95)) {
                  var5.field_y = rj.a(param1, false, 16, var5.field_y);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_y.length) {
                      if (var6 == 0) {
                        var5.field_y = null;
                        break L4;
                      } else {
                        var5.field_w = (byte)(1 + var6);
                        break L4;
                      }
                    } else {
                      L6: {
                        if (var6 >= (255 & var5.field_y[var7])) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_21_0 = (qh) var5;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("df.E(").append(false).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_22_0;
    }

    final static void a(byte param0, ja param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            qh.field_G = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("df.C(").append(11).append(',');
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
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Necromancer";
        field_b = "<col=FF0000>Attack -1, Defence -1</col>";
        field_d = "Orb of Brilliance";
        field_a = "Change display name";
        field_f = "The larger and better trained saurus warriors are far superior in combat than their smaller brethren, using their innate agility to ensure success against all foes.";
    }
}
