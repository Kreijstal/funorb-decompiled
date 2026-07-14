/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uca {
    int field_e;
    static double field_b;
    static qea field_c;
    static int field_a;
    static int field_d;
    static iu[] field_f;

    final static String a(String param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        mu var8 = null;
        mu var10 = null;
        kh var11 = null;
        mu var12 = null;
        kh var13 = null;
        Object var16 = null;
        CharSequence var17 = null;
        var16 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var17 = (CharSequence) (Object) param0;
        if (fs.a(true, var17)) {
          if ((ae.field_g ^ -1) == -3) {
            var8 = wp.a(94, param0);
            if (var8 == null) {
              return gl.a((byte) 88, hoa.field_m, new String[1]);
            } else {
              if (param1 == 102) {
                vg discarded$2 = fla.field_f.a(-13854, (vg) (Object) var8);
                L0: while (true) {
                  var10 = (mu) (Object) fla.field_f.e(115);
                  if (var10 != null) {
                    var10.field_Db = var10.field_Db - 1;
                    continue L0;
                  } else {
                    var8.p(19);
                    var8.c(-7975);
                    ii.field_a = ii.field_a - 1;
                    var11 = ql.field_k;
                    var11.k(param2, param1 + -3090);
                    var11.field_h = var11.field_h + 1;
                    var5 = var11.field_h;
                    var11.i(1, 0);
                    var11.a(param0, false);
                    var11.d(var11.field_h - var5, (byte) -113);
                    return null;
                  }
                }
              } else {
                field_d = 38;
                vg discarded$3 = fla.field_f.a(-13854, (vg) (Object) var8);
                L1: while (true) {
                  var12 = (mu) (Object) fla.field_f.e(115);
                  if (var12 != null) {
                    var12.field_Db = var12.field_Db - 1;
                    continue L1;
                  } else {
                    var8.p(19);
                    var8.c(-7975);
                    ii.field_a = ii.field_a - 1;
                    var13 = ql.field_k;
                    var13.k(param2, param1 + -3090);
                    var13.field_h = var13.field_h + 1;
                    var5 = var13.field_h;
                    var13.i(1, 0);
                    var13.a(param0, false);
                    var13.d(var13.field_h - var5, (byte) -113);
                    return null;
                  }
                }
              }
            }
          } else {
            return dga.field_b;
          }
        } else {
          return pk.field_v;
        }
    }

    public static void a(int param0) {
        int var1 = 79 / ((-50 - param0) / 48);
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, toa param1, byte param2) {
        int var4 = 0;
        kh var5 = null;
        var5 = ql.field_k;
        var5.k(param0, -2988);
        var5.field_h = var5.field_h + 1;
        if (param2 != 93) {
          field_a = 32;
          var4 = var5.field_h;
          var5.i(1, 0);
          var5.i(param1.field_i, 0);
          var5.e(param2 ^ -5253, param1.field_k);
          var5.a(param1.field_h, (byte) -22);
          var5.a(param1.field_m, (byte) 102);
          var5.a(param1.field_l, (byte) -1);
          var5.a(param1.field_g, (byte) -90);
          int discarded$2 = var5.g(var4, 64);
          var5.d(-var4 + var5.field_h, (byte) -122);
          return;
        } else {
          var4 = var5.field_h;
          var5.i(1, 0);
          var5.i(param1.field_i, 0);
          var5.e(param2 ^ -5253, param1.field_k);
          var5.a(param1.field_h, (byte) -22);
          var5.a(param1.field_m, (byte) 102);
          var5.a(param1.field_l, (byte) -1);
          var5.a(param1.field_g, (byte) -90);
          int discarded$3 = var5.g(var4, 64);
          var5.d(-var4 + var5.field_h, (byte) -122);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Math.atan2(1.0, 0.0);
        field_c = new qea(new int[1]);
        field_a = -1;
    }
}
