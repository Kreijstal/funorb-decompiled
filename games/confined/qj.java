/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static bi field_b;
    static int[] field_c;
    static String field_d;
    static String field_a;

    final static void a(int param0, boolean param1) {
        fb.field_a.a(param1, 64187);
        int var2 = 32 % ((param0 - 77) / 33);
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
          qj.a(106, false);
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(nf[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = Confined.field_J ? 1 : 0;
          if (param0 == null) {
            break L0;
          } else {
            if (-1 > (param2 ^ -1)) {
              var6 = param0[0].field_t;
              var7 = param0[2].field_t;
              var8 = param0[1].field_t;
              param0[0].b(param4, param1, param5);
              param0[2].b(-var7 + param4 + param2, param1, param5);
              fn.b(hj.field_l);
              if (param3 > 43) {
                fn.f(param4 + var6, param1, -var7 + param2 + param4, param1 + param0[1].field_x);
                var9 = var6 + param4;
                var10 = -var7 + (param2 + param4);
                param4 = var9;
                L1: while (true) {
                  if (var10 <= param4) {
                    fn.a(hj.field_l);
                    return;
                  } else {
                    param0[1].b(param4, param1, param5);
                    param4 = param4 + var8;
                    continue L1;
                  }
                }
              } else {
                var12 = null;
                qj.a((nf[]) null, 54, 102, 49, -15, -58);
                fn.f(param4 + var6, param1, -var7 + param2 + param4, param1 + param0[1].field_x);
                var9 = var6 + param4;
                var10 = -var7 + (param2 + param4);
                param4 = var9;
                L2: while (true) {
                  if (var10 <= param4) {
                    fn.a(hj.field_l);
                    return;
                  } else {
                    param0[1].b(param4, param1, param5);
                    param4 = param4 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static String a(int param0) {
        if (oe.field_Q == wh.field_fb) {
            return rd.field_Jb;
        }
        if (!fb.field_a.c(param0 + 17236)) {
            return fb.field_a.a(108);
        }
        if (param0 != 1) {
            qj.b(-6);
            if (!(na.field_S != wh.field_fb)) {
                return fb.field_a.a(81);
            }
            return kj.field_c;
        }
        if (!(na.field_S != wh.field_fb)) {
            return fb.field_a.a(81);
        }
        return kj.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Start Game";
        field_c = new int[12];
        field_a = "<col=FFFFFF>Click and hold</col> to fire your basic energy weapon!";
    }
}
