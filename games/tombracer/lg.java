/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends dna {
    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!ej.a(false, param0, param1)) {
          return false;
        } else {
          var3 = 0;
          L0: while (true) {
            if (param1.length() <= var3) {
              if (param2 != 1617) {
                return false;
              } else {
                return true;
              }
            } else {
              if (fqa.a(false, param1.charAt(var3))) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            }
          }
        }
    }

    lg(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((lg) this).b(-71, 2097152, 2097152);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var12 = new fsa(param2, param0);
        var12.b((byte) -11, ((lg) this).field_k, ((lg) this).field_l);
        var12.h(2, 0);
        var12.a(2, (byte) -12, true);
        var12.a((byte) -3, 1);
        var12.b((byte) 17, false);
        var12.e(true, 124);
        var12.d(1, -1);
        bg var5 = new bg(param2, param0);
        var5.a(false, 98304);
        var12.a((wda) (Object) var5, 0);
        pt var6 = new pt(param2, param0);
        var6.a(256, (byte) 124);
        var12.a((wda) (Object) var6, 0);
        eq var7 = new eq(param2, param0);
        var7.b((byte) -114, true);
        var7.a(8, (byte) -22);
        var12.a((byte) 83, (nv) (Object) var7);
        cu var8 = new cu(param2, param0);
        var8.b(0, 5, param1 + -3);
        var8.a(0, 0, 36, 0);
        kpa var9 = var8.j((byte) -114);
        var9.a(false, param1 ^ 102);
        var9.a(0, -17075, true);
        var9.a(param1, -17075, true);
        var9.a(2, param1 ^ -17074, true);
        var12.a((byte) 83, (nv) (Object) var8);
        mfa var10 = rm.field_a;
        aka var11 = (aka) (Object) var10.a(18, 98);
        var11.b(param1 + 87, 0);
        var12.a((gr) null, (byte) 124, (dg) (Object) var11);
        var12.e(0, 122);
        return var12;
    }

    lg(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    static {
    }
}
