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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        ck var8 = null;
        ck var9 = null;
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
                    bn.field_g.a(wf.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var2 = -96 / ((param0 - -79) / 41);
                if (ac.field_F >= dk.field_i) {
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
                L4: {
                  if (bn.field_g == null) {
                    break L4;
                  } else {
                    var3 = null;
                    var6 = 0;
                    var4 = var6;
                    L5: while (true) {
                      if (var6 >= d.field_h.length) {
                        if (var3 == null) {
                          break L4;
                        } else {
                          bn.field_g.a("Screenshot(s) " + (String) (var3) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L3;
                        }
                      } else {
                        var9 = d.field_h[var6];
                        if (var9 != null) {
                          L6: {
                            L7: {
                              if (365 != var9.field_K) {
                                break L7;
                              } else {
                                if (var9.field_C != 139) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if (var3 != null) {
                              var3 = (String) (var3) + ", " + var6;
                              break L6;
                            } else {
                              var3 = Integer.toString(var6);
                              break L6;
                            }
                          }
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L8: {
                if (null == bn.field_g) {
                  break L8;
                } else {
                  bn.field_g.a(wf.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L8;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "hc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = -68 / ((16 - param0) / 39);
        field_f = null;
    }

    final static pi a(int param0, int[] param1, pi param2) {
        pi var3 = null;
        RuntimeException var3_ref = null;
        pi stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new pi(0, param0, 0);
            var3.field_b = param2.field_b;
            var3.field_i = param2.field_i;
            var3.field_a = param2.field_a;
            var3.field_g = param2.field_g;
            var3.field_c = param2.field_c;
            var3.field_l = param1;
            var3.field_d = param2.field_d;
            var3.field_k = param2.field_k;
            stackIn_1_0 = (pi) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("hc.A(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_e = "Searching for opponents";
        field_f = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
