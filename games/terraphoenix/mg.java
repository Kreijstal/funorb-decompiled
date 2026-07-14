/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends di {
    static int[] field_p;
    private ej field_n;
    static int field_o;
    static String field_m;

    final String a(String param0, int param1) {
        int var3 = 0;
        rc var4 = null;
        var3 = 117 / ((26 - param1) / 56);
        if (((mg) this).field_n instanceof v) {
          var4 = ((v) (Object) ((mg) this).field_n).a(29730);
          if (var4 != null) {
            if (var4.a(-16323) == dg.field_c) {
              if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                return var4.b((byte) 119);
              } else {
                return hl.field_e;
              }
            } else {
              return var4.b((byte) 119);
            }
          } else {
            if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
              return null;
            } else {
              return hl.field_e;
            }
          }
        } else {
          if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
            return null;
          } else {
            return hl.field_e;
          }
        }
    }

    public static void e(byte param0) {
        field_m = null;
        field_p = null;
        if (param0 != -27) {
            Object var2 = null;
            mg.a(33, -128, (ci[]) null, -11, 74, -27, 87, 16, 114, (ci[]) null, 20, 25, (pk) null, 41, (ci[]) null);
        }
    }

    final im b(String param0, int param1) {
        rc var3 = null;
        im stackIn_5_0 = null;
        im stackIn_9_0 = null;
        im stackIn_16_0 = null;
        im stackIn_20_0 = null;
        im stackIn_28_0 = null;
        im stackIn_32_0 = null;
        im stackOut_31_0 = null;
        im stackOut_30_0 = null;
        im stackOut_27_0 = null;
        im stackOut_26_0 = null;
        im stackOut_19_0 = null;
        im stackOut_18_0 = null;
        im stackOut_15_0 = null;
        im stackOut_14_0 = null;
        im stackOut_8_0 = null;
        im stackOut_7_0 = null;
        im stackOut_4_0 = null;
        im stackOut_3_0 = null;
        if (((mg) this).field_n instanceof v) {
          var3 = ((v) (Object) ((mg) this).field_n).a(29730);
          if (var3 != null) {
            if (var3.a(-16323) == dg.field_c) {
              if (param1 != 0) {
                L0: {
                  field_p = null;
                  if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                    stackOut_31_0 = dg.field_c;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = qf.field_d;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              } else {
                L1: {
                  if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                    stackOut_27_0 = dg.field_c;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = qf.field_d;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              return qf.field_d;
            }
          } else {
            if (param1 != 0) {
              L2: {
                field_p = null;
                if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                  stackOut_19_0 = dg.field_c;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = qf.field_d;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return stackIn_20_0;
            } else {
              L3: {
                if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                  stackOut_15_0 = dg.field_c;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = qf.field_d;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          if (param1 != 0) {
            L4: {
              field_p = null;
              if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                stackOut_8_0 = dg.field_c;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = qf.field_d;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              if (param0.equals((Object) (Object) ((mg) this).field_n.field_o)) {
                stackOut_4_0 = dg.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = qf.field_d;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    mg(ej param0, ej param1) {
        super(param0);
        ((mg) this).field_n = param1;
    }

    final static void a(int param0, int param1, ci[] param2, int param3, int param4, int param5, int param6, int param7, int param8, ci[] param9, int param10, int param11, pk param12, int param13, ci[] param14) {
        int var15 = param12.field_p + param12.field_u;
        int var16 = param12.field_u;
        int var17 = 19 / ((-26 - param5) / 53);
        mb.a(param3, param12, param4, 480, param9, param11, param2, (byte) 77, param13, param1, var16, var15, var15, param14, param10, param8, param12, param6, var16, param0, param7);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_p = new int[8192];
        field_m = "That name is not available";
    }
}
