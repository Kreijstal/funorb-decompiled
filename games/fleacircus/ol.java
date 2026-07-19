/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static ca field_d;
    static String[] field_a;
    static java.awt.Canvas field_e;
    static int[] field_c;
    static String[] field_b;
    static rk field_f;

    final static ad a(int param0) {
        if (param0 >= -98) {
            return (ad) null;
        }
        return new ad(ti.a((byte) -120), rl.a(true));
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_a = (String[]) null;
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static hm a(String param0, int param1, int param2) {
        hm discarded$2 = null;
        jk var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk stackOut_2_0 = null;
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
              if (param1 > 55) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = ol.a((String) null, 81, 32);
                break L1;
              }
            }
            var3 = new jk();
            ((hm) ((Object) var3)).field_a = param0;
            ((hm) ((Object) var3)).field_e = param2;
            stackOut_2_0 = (jk) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("ol.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (hm) ((Object) stackIn_3_0);
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 <= 0) {
                  break L2;
                } else {
                  if (param0 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < 160) {
                  break L3;
                } else {
                  if (param0 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1 < -84) {
                L4: {
                  L5: {
                    if (param0 == 0) {
                      break L5;
                    } else {
                      var6 = fh.field_e;
                      var2 = var6;
                      var3 = 0;
                      L6: while (true) {
                        if (var3 >= var6.length) {
                          break L5;
                        } else {
                          var4 = var6[var3];
                          stackOut_15_0 = var4 ^ -1;
                          stackIn_22_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (stackIn_16_0 == (param0 ^ -1)) {
                              stackOut_18_0 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L4;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "ol.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    static {
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_c = new int[8192];
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
