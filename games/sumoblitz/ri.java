/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    byte[] field_a;
    int field_f;
    byte[] field_e;
    int[] field_g;
    int field_b;
    int field_i;
    int field_h;
    int field_d;
    int field_c;

    private final static ri[] a(byte[] param0) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_1 = 0;
        fs var1;
        int var2;
        ri[] var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int var8;
        ri var8_ref_ri;
        ri var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var16;
        int[] var17;
        int var4Lifetime1;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var7_intLifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        var1 = new fs(param0);
        var1.field_p = param0.length - 2;
        var2 = var1.a(255);
        var3 = new ri[var2];
        for (var4 = 0; var4 < var2; var4++) {
          var3[var4] = new ri();
        }
        var1.field_p = param0.length - 7 - var2 * 8;
        var4Lifetime1 = var1.a(255);
        var5 = var1.a(255);
        var6 = (var1.e(-31302) & 255) + 1;
        for (var7_int = 0; var7_int < var2; var7_int++) {
          var3[var7_int].field_c = var1.a(255);
        }
        for (var7_intLifetime1 = 0; var7_intLifetime1 < var2; var7_intLifetime1++) {
          var3[var7_intLifetime1].field_d = var1.a(255);
        }
        for (var7_intLifetime2 = 0; var7_intLifetime2 < var2; var7_intLifetime2++) {
          var3[var7_intLifetime2].field_h = var1.a(255);
        }
        for (var7_intLifetime3 = 0; var7_intLifetime3 < var2; var7_intLifetime3++) {
          var3[var7_intLifetime3].field_i = var1.a(255);
        }
        for (var7_intLifetime4 = 0; var7_intLifetime4 < var2; var7_intLifetime4++) {
          var8_ref_ri = var3[var7_intLifetime4];
          var8_ref_ri.field_b = var4Lifetime1 - var8_ref_ri.field_h - var8_ref_ri.field_c;
          var8_ref_ri.field_f = var5 - var8_ref_ri.field_i - var8_ref_ri.field_d;
        }
        var1.field_p = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
        var17 = new int[var6];
        var16 = var17;
        var7 = var16;
        for (var8 = 1; var8 < var6; var8++) {
          var7[var8] = var1.c((byte) 122);
          if (var17[var8] == 0) {
            var17[var8] = 1;
          }
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < var2; var8Lifetime1++) {
          var3[var8Lifetime1].field_g = var7;
        }
        var1.field_p = 0;
        for (var8Lifetime2 = 0; var8Lifetime2 < var2; var8Lifetime2++) {
          var9 = var3[var8Lifetime2];
          var10 = var9.field_h * var9.field_i;
          var9.field_e = new byte[var10];
          var11 = var1.e(-31302);
          if ((var11 & 2) == 0) {
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var10; var12++) {
                var9.field_e[var12] = var1.d(true);
              }
            } else {
              for (var12 = 0; var12 < var9.field_h; var12++) {
                for (var13 = 0; var13 < var9.field_i; var13++) {
                  var9.field_e[var12 + var13 * var9.field_h] = var1.d(true);
                }
              }
            }
          } else {
            var12 = 0;
            var9.field_a = new byte[var10];
            if ((var11 & 1) == 0) {
              for (var13 = 0; var13 < var10; var13++) {
                var9.field_e[var13] = var1.d(true);
              }
              for (var13 = 0; var13 < var10; var13++) {
                dupTemp$1 = var1.d(true);
                var9.field_a[var13] = dupTemp$1;
                var14 = dupTemp$1;
                stackIn_53_0 = var12;
                if (var14 == -1) {
                  stackIn_54_1 = 0;
                } else {
                  stackIn_54_1 = 1;
                }
                var12 = stackIn_53_0 | stackIn_54_1;
              }
            } else {
              for (var13 = 0; var13 < var9.field_h; var13++) {
                for (var14 = 0; var14 < var9.field_i; var14++) {
                  var9.field_e[var13 + var14 * var9.field_h] = var1.d(true);
                }
              }
              for (var13 = 0; var13 < var9.field_h; var13++) {
                for (var14 = 0; var14 < var9.field_i; var14++) {
                  dupTemp$0 = var1.d(true);
                  var9.field_a[var13 + var14 * var9.field_h] = dupTemp$0;
                  var15 = dupTemp$0;
                  stackIn_67_0 = var12;
                  if (var15 == -1) {
                    stackIn_68_1 = 0;
                  } else {
                    stackIn_68_1 = 1;
                  }
                  var12 = stackIn_67_0 | stackIn_68_1;
                }
              }
            }
            if (var12 == 0) {
              var9.field_a = null;
            }
          }
        }
        return var3;
    }

    final static ri[] a(ki param0, String param1) {
        byte[] var2 = param0.a((byte) 111, param1);
        if (var2 == null) {
          return null;
        }
        return ri.a(var2);
    }

    final static ri[] b(ki param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, param1, -1);
        if (var3 == null) {
          return null;
        }
        return ri.a(var3);
    }

    final static ri a(ki param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, param1, -1);
        if (var3 == null) {
          return null;
        }
        return ri.a(var3)[0];
    }
}
