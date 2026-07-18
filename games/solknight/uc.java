/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uc {
    static int field_b;
    static int field_f;
    static int field_c;
    static int field_e;
    static nc field_j;
    static String field_d;
    static mg field_g;
    static nc field_a;
    static int field_i;
    static String[] field_h;
    static String field_k;

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (param0 > -54) {
            uc.a(49);
        }
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = th.field_J;
            L1: while (true) {
              if (vc.field_d.length <= var3_int) {
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  var5 = oa.field_l[var3_int];
                  if (var5 >= 0) {
                    var6 = fa.a(vc.field_d[var3_int], true, (byte) 99);
                    var4 = var4 + vg.field_N;
                    var7 = sb.field_d + -(var6 >> 1);
                    if (!gh.a(var4, we.field_c + (g.field_l << 1), param0, var6 + (bl.field_i << 1), 16777215, param2, -bl.field_i + var7)) {
                      var4 = var4 + (we.field_c + vg.field_N + (g.field_l << 1));
                      break L2;
                    } else {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  } else {
                    var4 = var4 + field_i;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "uc.C(" + param0 + ',' + 1691746689 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      var4 = jg.a(param1, -2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (1 <= var4.length()) {
                          L3: {
                            if (ck.a(var4.charAt(0), true)) {
                              break L3;
                            } else {
                              if (!ck.a(var4.charAt(var4.length() + -1), true)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (param1.length() <= var6) {
                                    if (var5 > 0) {
                                      stackOut_30_0 = qf.field_f;
                                      stackIn_31_0 = stackOut_30_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param1.charAt(var6);
                                      if (ck.a((char) var7, true)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_25_0 = td.field_n;
                                      stackIn_26_0 = stackOut_25_0;
                                      return stackIn_26_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = qf.field_f;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = rk.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = rk.field_b;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = rk.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("uc.B(").append(false).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + 0 + ')');
        }
        return stackIn_31_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        int var1 = 7 / ((param0 - -35) / 46);
        field_d = null;
        field_j = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pg.a(50, 1);
        field_j = new nc();
        field_d = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new nc();
        field_k = "Player names can be up to 12 letters, numbers and underscores";
        field_h = new String[]{"Defender of Humanity", "Warrior of the Void", "Heavenly Guardian", "Astral Avenger", "Rock Crusher", "Lord of the System", "Earth's Last Hope", "Revenge of the Rock Scum"};
    }
}
