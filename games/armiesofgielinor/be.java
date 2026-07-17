/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class be extends bd {
    static at field_u;
    static kl field_w;
    static String field_D;
    static int field_E;
    private int field_t;
    static je field_y;
    static sa field_z;
    private int field_C;
    private int field_G;
    static String field_A;
    static String field_v;
    private int field_B;
    static String field_F;
    static int field_s;
    static int field_x;

    final void a(int param0, ha param1) {
        try {
            ((be) this).field_C = param1.a(bw.field_m[((be) this).field_t][1], ((be) this).field_B, ((be) this).field_G, 0, ((be) this).field_m, bw.field_m[((be) this).field_t][2]);
            if (param0 != 64) {
                Object var4 = null;
                String discarded$0 = be.a(-2, (CharSequence) null, false);
            }
            param1.field_l.a((byte) -119, (tc) (Object) new mb(((be) this).field_t, ((be) this).field_G, ((be) this).field_B, ((be) this).field_C, ((be) this).field_m));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "be.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_36_0 = null;
        String stackOut_31_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = pu.field_G;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = k.a(param1, false);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (rs.a(var4.charAt(0), (byte) -122)) {
                              break L3;
                            } else {
                              if (!rs.a(var4.charAt(-1 + var4.length()), (byte) -107)) {
                                if (param0 < -22) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param1.length()) {
                                      if (0 < var5) {
                                        stackOut_36_0 = kd.field_U;
                                        stackIn_37_0 = stackOut_36_0;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (rs.a((char) var7, (byte) -88)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (!param2) {
                                            stackOut_31_0 = ul.field_o;
                                            stackIn_32_0 = stackOut_31_0;
                                            return stackIn_32_0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackOut_21_0 = null;
                                  stackIn_22_0 = stackOut_21_0;
                                  return (String) (Object) stackIn_22_0;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_18_0 = kd.field_U;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    }
                    stackOut_13_0 = pu.field_G;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
              stackOut_8_0 = pu.field_G;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("be.B(").append(param0).append(44);
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
              break L7;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param2 + 41);
        }
        return stackIn_37_0;
    }

    public static void a(byte param0) {
        field_A = null;
        field_u = null;
        field_w = null;
        field_y = null;
        field_F = null;
        field_D = null;
        field_v = null;
        field_z = null;
    }

    be(int param0, int param1, int param2, int param3, int param4) {
        ((be) this).field_B = param1;
        ((be) this).field_G = param0;
        ((be) this).field_t = param2;
        ((be) this).field_m = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please try again in a few minutes.";
        field_A = "Ongoing Mission";
        field_v = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_E = 0;
        field_z = new sa();
        field_x = 77;
        field_F = "Choose three alignments";
    }
}
