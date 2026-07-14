/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    private boolean field_h;
    static String[] field_e;
    private String field_f;
    static sd field_a;
    static float[] field_g;
    static float[] field_d;
    private boolean field_c;
    static String field_b;

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        int var1 = 8 / ((64 - param0) / 35);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 44 / ((param1 - 43) / 55);
        if (14 != param0) {
          if (param0 != 12) {
            if ((param0 ^ -1) != -6) {
              if (8 != param0) {
                if (param0 != 7) {
                  if (6 == param0) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 1;
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        } else {
          return 1;
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 >= -24) {
          L0: {
            String discarded$11 = ((tk) this).c(96);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((tk) this).field_h = stackIn_8_1 != 0;
          ((tk) this).field_c = true;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((tk) this).field_h = stackIn_4_1 != 0;
          ((tk) this).field_c = true;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            Object var3 = null;
            int discarded$0 = tk.a((String) null, false, true);
            return ((tk) this).field_h;
        }
        return ((tk) this).field_h;
    }

    final String c(int param0) {
        if (param0 != 0) {
            field_d = null;
            return ((tk) this).field_f;
        }
        return ((tk) this).field_f;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        if (!param1) {
            return 44;
        }
        if (!param2) {
            return ZombieDawn.field_K.b(param0);
        }
        return q.field_H.b(param0);
    }

    final boolean a(int param0) {
        int var2 = 122 % ((-46 - param0) / 63);
        return ((tk) this).field_c;
    }

    tk(String param0) {
        ((tk) this).field_h = false;
        ((tk) this).field_c = false;
        ((tk) this).field_f = param0;
    }

    final static boolean a(byte param0, String param1) {
        if (param1 != null) {
          if (param1.length() >= ek.field_J) {
            if (param1.length() <= lg.field_s) {
              if (param0 != 84) {
                field_a = null;
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = "SPEED";
        field_g = new float[75];
        field_d = new float[75];
        double var0 = 0.08377580409572781;
        for (var2 = 0; -76 < (var2 ^ -1); var2++) {
            field_d[var2] = (float)Math.cos((double)var2 * var0);
            field_g[var2] = (float)Math.sin(var0 * (double)var2);
        }
    }
}
