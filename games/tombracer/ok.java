/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends pd {
    static boolean field_s;
    private gfa field_t;

    final static void a(int param0, int param1, byte param2, boolean param3, long param4, String param5) {
        int var7 = 0;
        kh stackIn_2_0 = null;
        kh stackIn_3_0 = null;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kh stackOut_1_0 = null;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ql.field_k.k(param1, -2988);
        ql.field_k.field_h = ql.field_k.field_h + 1;
        var7 = ql.field_k.field_h;
        ql.field_k.a(1736565456, param4);
        ql.field_k.a(param5, false);
        if (param2 <= 70) {
          return;
        } else {
          L0: {
            ql.field_k.i(param0, 0);
            stackOut_1_0 = ql.field_k;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param3) {
              stackOut_3_0 = (kh) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (kh) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((kh) (Object) stackIn_4_0).i(stackIn_4_1, 0);
          ql.field_k.d(-var7 + ql.field_k.field_h, (byte) 35);
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return 89;
        }
        return 6;
    }

    ok(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ok) this).field_t = (gfa) (Object) lka.a(-25, param1, param0.field_E);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((ok) this).field_t.a(param1, -5);
    }

    final void g(byte param0) {
        if (param0 != 3) {
            Object var3 = null;
            ((ok) this).a(true, (kh) null);
        }
    }

    final boolean a(int param0, hca param1) {
        Object var4 = null;
        if (param0 > -114) {
          var4 = null;
          ((ok) this).a(true, (kh) null);
          ((ok) this).b(true).b(-1).a((bs) (Object) ((ok) this).field_t, param1, true);
          return true;
        } else {
          ((ok) this).b(true).b(-1).a((bs) (Object) ((ok) this).field_t, param1, true);
          return true;
        }
    }

    static {
    }
}
