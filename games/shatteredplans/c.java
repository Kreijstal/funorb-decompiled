/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int field_h;
    private static int field_d;
    private static int field_c;
    static int field_e;
    private static int field_b;
    private static int field_g;
    private static int[] field_f;
    static int field_a;

    private final static void a(int param0, int param1) {
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        if (param1 <= param0 + 4) {
          return;
        }
        var2 = param0;
        var3 = field_f[var2];
        var4 = field_f[var2 + 1];
        var5 = field_f[var2 + 2];
        var6 = field_f[var2 + 3];
        for (var7 = param0 + 4; var7 < param1; var7 += 4) {
          var8 = field_f[var7 + 1];
          if (var8 < var4) {
            field_f[var2] = field_f[var7];
            field_f[var2 + 1] = var8;
            field_f[var2 + 2] = field_f[var7 + 2];
            field_f[var2 + 3] = field_f[var7 + 3];
            var2 += 4;
            field_f[var7] = field_f[var2];
            field_f[var7 + 1] = field_f[var2 + 1];
            field_f[var7 + 2] = field_f[var2 + 2];
            field_f[var7 + 3] = field_f[var2 + 3];
          }
        }
        field_f[var2] = var3;
        field_f[var2 + 1] = var4;
        field_f[var2 + 2] = var5;
        field_f[var2 + 3] = var6;
        c.a(param0, var2);
        c.a(var2 + 4, param1);
    }

    private final static void b(int param0, int param1) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        while (param1 >= param0 + 8) {
          var2 = 1;
          for (var3 = param0 + 4; var3 < param1; var3 += 4) {
            var4 = field_f[var3 - 4];
            var5 = field_f[var3];
            if (var4 > var5) {
              var2 = 0;
              field_f[var3 - 4] = var5;
              field_f[var3] = var4;
              var4 = field_f[var3 - 2];
              field_f[var3 - 2] = field_f[var3 + 2];
              field_f[var3 + 2] = var4;
              var4 = field_f[var3 - 1];
              field_f[var3 - 1] = field_f[var3 + 3];
              field_f[var3 + 3] = var4;
            }
          }
          if (var2 != 0) {
            return;
          }
          param1 -= 4;
        }
        return;
    }

    final static void a(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        int[] var4_ref_int__;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        var3 = field_g + (param2 << 1);
        if (field_f == null ||
          !(field_f.length >= var3)) {
          var4_ref_int__ = new int[var3];
          for (var5 = 0; var5 < field_g; var5++) {
            var4_ref_int__[var5] = field_f[var5];
          }
          field_f = var4_ref_int__;
        }
        param2 = param2 + param1;
        var4 = param2 - 2;
        var8 = param1;
        var5Lifetime1 = var8;
        while (var8 < param2) {
          var6 = param0[var4 + 1];
          var7 = param0[var8 + 1];
          if (var6 >= var7) {
            if (var7 < var6) {
              fieldTemp$0 = field_g;
              field_g = field_g + 1;
              field_f[fieldTemp$0] = param0[var8];
              fieldTemp$1 = field_g;
              field_g = field_g + 1;
              field_f[fieldTemp$1] = var7;
              fieldTemp$2 = field_g;
              field_g = field_g + 1;
              field_f[fieldTemp$2] = param0[var4];
              fieldTemp$3 = field_g;
              field_g = field_g + 1;
              field_f[fieldTemp$3] = var6;
            }
            var4 = var8;
          } else {
            fieldTemp$4 = field_g;
            field_g = field_g + 1;
            field_f[fieldTemp$4] = param0[var4];
            fieldTemp$5 = field_g;
            field_g = field_g + 1;
            field_f[fieldTemp$5] = var6;
            fieldTemp$6 = field_g;
            field_g = field_g + 1;
            field_f[fieldTemp$6] = param0[var8];
            fieldTemp$7 = field_g;
            field_g = field_g + 1;
            field_f[fieldTemp$7] = var7;
            var4 = var8;
          }
          var8 += 2;
        }
    }

    final static void c() {
        field_g = 0;
    }

    public static void b() {
        field_f = null;
    }

    final static void d() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2 = 0;
        if (field_g < 0) {
          field_b = 0;
          field_d = 0;
          field_c = 0;
          field_h = 2147483646;
          return;
        }
        c.a(0, field_g);
        int var0 = field_f[1];
        if (var0 < gf.field_a) {
          var0 = gf.field_a;
        }
        int var1 = 0;
        for (var2 = 0; var2 < field_g; var2 += 4) {
          var3 = field_f[var2 + 1];
          if (var0 < var3) {
            break;
          }
          var4 = field_f[var2];
          var5 = field_f[var2 + 2];
          var6 = field_f[var2 + 3];
          var7 = (var5 - var4 << 16) / (var6 - var3);
          var8 = (var4 << 16) + 32768;
          field_f[var2] = var8 + (var0 - var3) * var7;
          field_f[var2 + 2] = var7;
        }
        field_c = var1;
        field_d = var2;
        field_b = var2;
        field_h = var0 - 1;
    }

    final static boolean a() {
        int var0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        int var5Lifetime1;
        var0 = field_d;
        var1 = field_b;
        var2 = field_h;
        while (true) {
          if (var1 < var0) {
            field_e = field_f[var1] >> 16;
            field_a = field_f[var1 + 4] >> 16;
            field_f[var1] = field_f[var1] + field_f[var1 + 2];
            field_f[var1 + 4] = field_f[var1 + 4] + field_f[var1 + 6];
            var1 += 8;
            field_b = var1;
            return true;
          }
          var2++;
          field_h = var2;
          if (var2 >= gf.field_f) {
            return false;
          }
          var3 = field_c;
          while (var0 < field_g) {
            var4 = field_f[var0 + 1];
            if (var2 >= var4) {
              var5 = field_f[var0];
              var6 = field_f[var0 + 2];
              var7 = field_f[var0 + 3];
              var8 = (var6 - var5 << 16) / (var7 - var4);
              var9 = (var5 << 16) + 32768;
              field_f[var0] = var9;
              field_f[var0 + 2] = var8;
              var0 += 4;
              continue;
            }
            break;
          }
          var10 = var3;
          var4Lifetime1 = var10;
          while (var10 < var0) {
            var5Lifetime1 = field_f[var10 + 3];
            if (var2 >= var5Lifetime1) {
              field_f[var10] = field_f[var3];
              field_f[var10 + 1] = field_f[var3 + 1];
              field_f[var10 + 2] = field_f[var3 + 2];
              field_f[var10 + 3] = field_f[var3 + 3];
              var3 += 4;
            }
            var10 += 4;
          }
          if (var3 == field_g) {
            field_g = 0;
            return false;
          }
          c.b(var3, var0);
          field_c = var3;
          field_d = var0;
          var1 = var3;
        }
    }
}
