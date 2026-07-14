/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static bd field_b;
    static bd[] field_a;
    static bd field_c;

    final static int a(int param0, int param1, byte[] param2) {
        if (param1 != 31465) {
            return -46;
        }
        return hb.a(0, -109, param2, param0);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            pi.a(-10);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static ic a(int param0, int param1, int param2, int param3, int param4) {
        ic var5 = null;
        ic var5_ref = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var5 = (ic) (Object) ch.field_p.g(-23);
        L0: while (true) {
          if (var5 == null) {
            var5_ref = new ic();
            if (param1 != 6413) {
              field_b = null;
              var5_ref.field_q = param0;
              var5_ref.field_j = param3;
              var5_ref.field_h = param4;
              ch.field_p.a((am) (Object) var5_ref, 112);
              rl.a(param2, var5_ref, param1 + 746031541);
              return var5_ref;
            } else {
              var5_ref.field_q = param0;
              var5_ref.field_j = param3;
              var5_ref.field_h = param4;
              ch.field_p.a((am) (Object) var5_ref, 112);
              rl.a(param2, var5_ref, param1 + 746031541);
              return var5_ref;
            }
          } else {
            if (param3 == var5.field_j) {
              return var5;
            } else {
              var5 = (ic) (Object) ch.field_p.a(12684);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bd[3];
    }
}
