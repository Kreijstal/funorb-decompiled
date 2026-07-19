/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static double field_b;
    static String field_e;
    static String field_f;
    static int field_d;
    static int field_a;
    static int[] field_c;

    final static void a(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        ck var8 = null;
        ck var9 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            hk.f(243, 197, 369, 143, 16777215);
            hk.a(244, 198, 367, 141, 0);
            if (null != d.field_h) {
              L1: {
                var7 = d.field_h[wh.field_a];
                var8 = var7;
                var8 = var7;
                if (var7 != null) {
                  var7.c(245, 199);
                  break L1;
                } else {
                  if (null != bn.field_g) {
                    discarded$3 = bn.field_g.a(wf.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var2 = -32;
                if (~ac.field_F <= ~dk.field_i) {
                  break L2;
                } else {
                  var8 = d.field_h[bh.field_m];
                  if (var8 == null) {
                    break L2;
                  } else {
                    var3_int = (var8.field_K - -60) * ac.field_F / dk.field_i;
                    var4 = -30 + var3_int;
                    if (lb.field_b) {
                      bn.a((byte) -112, var4 * -256 / 30, (var8.field_K - var4) * 256 / 30, 199, var8, 245);
                      break L2;
                    } else {
                      bn.a((byte) -115, (var8.field_K + -var4) * 256 / 30, -256 * var4 / 30, 199, var8, 245);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (bn.field_g == null) {
                  break L3;
                } else {
                  var3 = null;
                  var6 = 0;
                  var4 = var6;
                  L4: while (true) {
                    if (~var6 <= ~d.field_h.length) {
                      if (var3 == null) {
                        break L3;
                      } else {
                        discarded$4 = bn.field_g.a("Screenshot(s) " + (String) (var3) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      }
                    } else {
                      L5: {
                        var9 = d.field_h[var6];
                        if (var9 == null) {
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              L6: {
                if (null == bn.field_g) {
                  break L6;
                } else {
                  discarded$5 = bn.field_g.a(wf.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L6;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "hc.B(" + 73 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = 68;
        field_f = null;
    }

    final static pi a(int param0, int[] param1, pi param2) {
        pi var3 = null;
        RuntimeException var3_ref = null;
        pi stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3 = new pi(0, 0, 0);
            var3.field_b = param2.field_b;
            var3.field_i = param2.field_i;
            var3.field_a = param2.field_a;
            var3.field_g = param2.field_g;
            var3.field_c = param2.field_c;
            var3.field_l = param1;
            var3.field_d = param2.field_d;
            var3.field_k = param2.field_k;
            stackOut_0_0 = (pi) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("hc.A(").append(0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_e = "Searching for opponents";
        field_f = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
