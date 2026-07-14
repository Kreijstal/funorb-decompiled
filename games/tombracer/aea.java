/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea extends hn {
    private int field_K;

    aea(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -125, ((aea) this).field_K, 4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        L0: {
          var36 = TombRacer.field_G ? 1 : 0;
          var10 = 12 % ((param8 - 52) / 40);
          if (param0 != param2) {
            break L0;
          } else {
            if (param9 != param5) {
              break L0;
            } else {
              if (param3 != param1) {
                break L0;
              } else {
                if (param6 != param4) {
                  break L0;
                } else {
                  ik.a(param3, param2, 111, param7, param4, param5);
                  return;
                }
              }
            }
          }
        }
        var11 = param2;
        var12 = param5;
        var13 = param2 * 3;
        var14 = param5 * 3;
        var15 = param0 * 3;
        var16 = param9 * 3;
        var17 = param1 * 3;
        var18 = 3 * param6;
        var19 = var15 + (-var17 + (param3 - param2));
        var20 = -param5 + (var16 + (-var18 + param4));
        var21 = -var15 + (var17 - var15) + var13;
        var22 = var14 + (-var16 + -var16 + var18);
        var23 = var15 + -var13;
        var24 = var16 + -var14;
        var25 = 128;
        L1: while (true) {
          if ((var25 ^ -1) >= -4097) {
            var26 = var25 * var25 >> 982197516;
            var27 = var26 * var25 >> 977032172;
            var28 = var19 * var27;
            var29 = var27 * var20;
            var30 = var26 * var21;
            var31 = var22 * var26;
            var32 = var23 * var25;
            var33 = var24 * var25;
            var34 = (var30 + (var28 - -var32) >> -2034570004) + param2;
            var35 = (var29 + var31 + var33 >> -1516823732) + param5;
            ik.a(var34, var11, -21, param7, var35, var12);
            var12 = var35;
            var11 = var34;
            // wide iinc 25 128
            continue L1;
          } else {
            return;
          }
        }
    }

    final boolean D(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            fsa discarded$0 = ((aea) this).a((la) null, false, false);
            return true;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1) {
            ((aea) this).field_K = -86;
            return true;
        }
        return true;
    }

    aea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((aea) this).field_K = param2.b((byte) 44, 4);
    }

    final fsa a(la param0, boolean param1, boolean param2) {
        fsa var4 = new fsa(param0, param2);
        var4.b((byte) -11, 2097152, 2097152);
        lpa var5 = new lpa(param0, param1);
        var5.b(-5, ((aea) this).field_K);
        var4.a((byte) 83, (nv) (Object) var5);
        mfa var6 = rm.field_a;
        ce var7 = (ce) (Object) var6.a(17, 102);
        var7.b(0, (byte) 23);
        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    final fsa a(int param0, boolean param1, la param2) {
        if (param0 == 5) {
            return null;
        }
        return null;
    }

    static {
    }
}
