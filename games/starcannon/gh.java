/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends dk {
    static int[] field_C;
    static String field_A;
    static long field_B;

    private gh(String param0, de param1, qg param2) {
        super(param0, param1, param2);
        ((gh) this).field_o = eh.field_j.field_p;
    }

    final static void a(byte param0, int param1) {
        rf var2 = null;
        int var3 = 0;
        hb var4 = null;
        var3 = StarCannon.field_A;
        var4 = (hb) (Object) hi.field_f.c(-3905);
        L0: while (true) {
          if (var4 == null) {
            var2 = sd.field_d.c(-3905);
            if (param0 >= -27) {
              field_A = null;
              L1: while (true) {
                if (var2 != null) {
                  u.a(param1, 1);
                  var2 = sd.field_d.a(-16913);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              L2: while (true) {
                if (var2 != null) {
                  u.a(param1, 1);
                  var2 = sd.field_d.a(-16913);
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            hb.a(107, param1, var4);
            var4 = (hb) (Object) hi.field_f.a(-16913);
            continue L0;
          }
        }
    }

    gh(String param0, qg param1, boolean param2) {
        this(param0, param1);
        ((gh) this).field_z = param2 ? true : false;
    }

    private gh(String param0, qg param1) {
        this(param0, eh.field_j.field_d, param1);
        ((gh) this).field_o = eh.field_j.field_p;
    }

    public static void e(int param0) {
        if (param0 != 13329) {
            field_B = -72L;
            field_C = null;
            field_A = null;
            return;
        }
        field_C = null;
        field_A = null;
    }

    final static boolean f(int param0) {
        if (param0 != -23093) {
            boolean discarded$0 = gh.f(-117);
            return m.field_c;
        }
        return m.field_c;
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((gh) this).field_z) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((gh) this).field_z = stackIn_3_1 != 0;
        super.a(param0, 93, param2, param3);
        if (param1 > 59) {
          return;
        } else {
          gh.e(116);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "GFX - HIGH";
    }
}
