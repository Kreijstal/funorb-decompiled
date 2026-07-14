/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends je {
    static String field_Lb;
    String field_Pb;
    je field_Kb;
    je field_Qb;
    je field_Jb;
    int field_Ob;
    String field_Mb;
    String field_Nb;
    String field_Ib;

    hl() {
        super(0L, (je) null);
    }

    final static wk a(boolean param0, int param1, int param2) {
        wk var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = new wk(param2, param2);
        var4 = 0;
        if (param0) {
          field_Lb = null;
          L0: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var3.field_B[var4] = param1;
              var4++;
              continue L0;
            }
          }
        } else {
          L1: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var3.field_B[var4] = param1;
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void k(int param0) {
        field_Lb = null;
        if (param0 == -4175) {
            return;
        }
        wk discarded$0 = hl.a(true, -43, 13);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Ranged";
    }
}
