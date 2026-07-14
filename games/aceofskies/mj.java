/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private int[] field_c;
    private int field_g;
    private int field_f;
    private int[] field_d;
    static boolean field_b;
    private long field_e;
    static rk field_a;

    final void a(boolean param0, vu param1) {
        ha var3 = null;
        ha var4 = null;
        var4 = ((vu) param1).field_c;
        var3 = var4;
        var4.KA(((mj) this).field_c[0], ((mj) this).field_c[1], ((mj) this).field_c[2], ((mj) this).field_c[3]);
        var4.DA(((mj) this).field_d[0], ((mj) this).field_d[1], ((mj) this).field_d[2], ((mj) this).field_d[3]);
        var3.f(((mj) this).field_f, ((mj) this).field_g);
        if (!param0) {
          return;
        } else {
          param1.field_a = ((mj) this).field_e;
          return;
        }
    }

    final void a(vu param0, boolean param1) {
        ha var3 = null;
        var3 = ((vu) param0).field_c;
        var3.K(((mj) this).field_c);
        ((mj) this).field_d = var3.Y();
        if (param1) {
          return;
        } else {
          ((mj) this).field_f = var3.i();
          ((mj) this).field_g = var3.XA();
          ((mj) this).field_e = ((vu) param0).field_a;
          return;
        }
    }

    final static int a(String param0, int param1, int param2, String param3, boolean param4, String param5, int param6) {
        cd var7 = null;
        cd var8 = null;
        var7 = new cd(param0);
        if (param1 != 3) {
          return 39;
        } else {
          var8 = new cd(param3);
          return u.a(var8, param2, param5, param4, param1 ^ -120, param6, var7);
        }
    }

    mj() {
        ((mj) this).field_c = new int[4];
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == 3) {
            return;
        }
        mj.a(26);
    }

    final static void a(byte param0, int param1) {
        ht var2 = null;
        int var3 = 0;
        String var4 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        var2 = (ht) an.field_b.d(268435455);
        if (param0 != 84) {
          var4 = (String) null;
          int discarded$1 = mj.a((String) null, 4, -49, (String) null, false, (String) null, 101);
          L0: while (true) {
            if (var2 != null) {
              sg.a(param1, (byte) -92, var2);
              var2 = (ht) an.field_b.b((byte) 103);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var2 != null) {
              sg.a(param1, (byte) -92, var2);
              var2 = (ht) an.field_b.b((byte) 103);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
