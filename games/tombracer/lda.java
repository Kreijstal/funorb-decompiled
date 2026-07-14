/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lda extends kna {
    static jea field_F;
    private int field_H;
    static String field_I;
    static String field_G;

    final int t(int param0) {
        if (param0 != 8) {
            ((lda) this).field_H = 63;
            return 7;
        }
        return 7;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return false;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return true;
    }

    lda(la param0, int param1) {
        super(param0, param1);
    }

    lda(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((lda) this).field_H = param2.b((byte) 44, 4);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((lda) this).field_H = -119;
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -125, ((lda) this).field_H, 4);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        int var12 = 0;
        fsa var13 = null;
        lpa var14 = null;
        fsa var15 = null;
        fsa var16 = null;
        eq var17 = null;
        eq var18 = null;
        mfa var19 = null;
        Object var20 = null;
        vsa var20_ref = null;
        eq var21 = null;
        eq var22 = null;
        mfa var23 = null;
        Object var24 = null;
        vsa var24_ref = null;
        lpa var25 = null;
        fsa var26 = null;
        fsa var27 = null;
        eq var28 = null;
        eq var29 = null;
        mfa var30 = null;
        Object var31 = null;
        vsa var31_ref = null;
        eq var32 = null;
        eq var33 = null;
        mfa var34 = null;
        Object var35 = null;
        vsa var35_ref = null;
        var20 = null;
        var24 = null;
        var31 = null;
        var35 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        var13 = new fsa(param2, param0);
        var4 = var13;
        if ((((lda) this).field_m ^ -1) != -47) {
          var13.b((byte) -11, ((lda) this).field_k, 4194304);
          var25 = new lpa(param2, param0);
          var25.b(-5, ((lda) this).field_H);
          var13.a((byte) 83, (nv) (Object) var25);
          var26 = new fsa(param2, param0);
          var27 = new fsa(param2, param0);
          if (-47 != (((lda) this).field_m ^ -1)) {
            var26.b((byte) -11, ((lda) this).field_k, 524288);
            var26.b(437453352, 0, -1835008);
            var27.b((byte) -11, ((lda) this).field_k, 524288);
            var27.b(437453352, 0, 1835008);
            var26.b((byte) 17, false);
            var26.h(3, param1 + -3);
            var28 = new eq(param2, param0);
            var28.a(true, -45);
            var28.a(-28592, true);
            var26.a((byte) 83, (nv) (Object) var28);
            var27.b((byte) 17, false);
            var27.h(param1, 0);
            var29 = new eq(param2, param0);
            var29.a(true, -128);
            var29.a(-28592, true);
            var27.a((byte) 83, (nv) (Object) var29);
            var13.a(-107, var26);
            var13.a(param1 ^ -61, var27);
            var30 = rm.field_a;
            var31_ref = (vsa) (Object) var30.a(19, param1 ^ 106);
            var31_ref.b((byte) 80, 0);
            var13.a((gr) (Object) var25, (byte) 124, (dg) (Object) var31_ref);
            return var13;
          } else {
            var26.b((byte) -11, 524288, ((lda) this).field_l);
            var26.b(437453352, -1835008, 0);
            var27.b((byte) -11, 524288, ((lda) this).field_l);
            var27.b(437453352, 1835008, 0);
            var26.b((byte) 17, false);
            var26.h(3, param1 + -3);
            var32 = new eq(param2, param0);
            var32.a(true, -45);
            var32.a(-28592, true);
            var26.a((byte) 83, (nv) (Object) var32);
            var27.b((byte) 17, false);
            var27.h(param1, 0);
            var33 = new eq(param2, param0);
            var33.a(true, -128);
            var33.a(-28592, true);
            var27.a((byte) 83, (nv) (Object) var33);
            var13.a(-107, var26);
            var13.a(param1 ^ -61, var27);
            var34 = rm.field_a;
            var35_ref = (vsa) (Object) var34.a(19, param1 ^ 106);
            var35_ref.b((byte) 80, 0);
            var13.a((gr) (Object) var25, (byte) 124, (dg) (Object) var35_ref);
            return var13;
          }
        } else {
          var13.b((byte) -11, 4194304, ((lda) this).field_l);
          var14 = new lpa(param2, param0);
          var14.b(-5, ((lda) this).field_H);
          var13.a((byte) 83, (nv) (Object) var14);
          var15 = new fsa(param2, param0);
          var16 = new fsa(param2, param0);
          if (-47 != (((lda) this).field_m ^ -1)) {
            var15.b((byte) -11, ((lda) this).field_k, 524288);
            var15.b(437453352, 0, -1835008);
            var16.b((byte) -11, ((lda) this).field_k, 524288);
            var16.b(437453352, 0, 1835008);
            var15.b((byte) 17, false);
            var15.h(3, param1 + -3);
            var17 = new eq(param2, param0);
            var17.a(true, -45);
            var17.a(-28592, true);
            var15.a((byte) 83, (nv) (Object) var17);
            var16.b((byte) 17, false);
            var16.h(param1, 0);
            var18 = new eq(param2, param0);
            var18.a(true, -128);
            var18.a(-28592, true);
            var16.a((byte) 83, (nv) (Object) var18);
            var13.a(-107, var15);
            var13.a(param1 ^ -61, var16);
            var19 = rm.field_a;
            var20_ref = (vsa) (Object) var19.a(19, param1 ^ 106);
            var20_ref.b((byte) 80, 0);
            var13.a((gr) (Object) var14, (byte) 124, (dg) (Object) var20_ref);
            return var13;
          } else {
            var15.b((byte) -11, 524288, ((lda) this).field_l);
            var15.b(437453352, -1835008, 0);
            var16.b((byte) -11, 524288, ((lda) this).field_l);
            var16.b(437453352, 1835008, 0);
            var15.b((byte) 17, false);
            var15.h(3, param1 + -3);
            var21 = new eq(param2, param0);
            var21.a(true, -45);
            var21.a(-28592, true);
            var15.a((byte) 83, (nv) (Object) var21);
            var16.b((byte) 17, false);
            var16.h(param1, 0);
            var22 = new eq(param2, param0);
            var22.a(true, -128);
            var22.a(-28592, true);
            var16.a((byte) 83, (nv) (Object) var22);
            var13.a(-107, var15);
            var13.a(param1 ^ -61, var16);
            var23 = rm.field_a;
            var24_ref = (vsa) (Object) var23.a(19, param1 ^ 106);
            var24_ref.b((byte) 80, 0);
            var13.a((gr) (Object) var14, (byte) 124, (dg) (Object) var24_ref);
            return var13;
          }
        }
    }

    public static void r(byte param0) {
        field_G = null;
        if (param0 >= -38) {
            field_G = null;
            field_F = null;
            field_I = null;
            return;
        }
        field_F = null;
        field_I = null;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((lda) this).s(26);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Offer draw";
        field_G = "Moving platforms";
    }
}
