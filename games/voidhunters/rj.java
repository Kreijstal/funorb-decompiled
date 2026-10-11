/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    private static int field_d;
    private static int field_c;
    private static int field_a;
    private static int field_f;
    private static int field_b;
    private static int field_h;
    private static int[] field_e;
    private static int field_g;

    private final static void a(int[] param0, int param1, int param2) {
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
        var3 = field_c + (param2 << 1);
        if (field_e == null ||
          !(field_e.length >= var3)) {
          var4_ref_int__ = new int[var3];
          for (var5 = 0; var5 < field_c; var5++) {
            var4_ref_int__[var5] = field_e[var5];
          }
          field_e = var4_ref_int__;
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
              fieldTemp$0 = field_c;
              field_c = field_c + 1;
              field_e[fieldTemp$0] = param0[var8];
              fieldTemp$1 = field_c;
              field_c = field_c + 1;
              field_e[fieldTemp$1] = var7;
              fieldTemp$2 = field_c;
              field_c = field_c + 1;
              field_e[fieldTemp$2] = param0[var4];
              fieldTemp$3 = field_c;
              field_c = field_c + 1;
              field_e[fieldTemp$3] = var6;
            }
          } else {
            fieldTemp$4 = field_c;
            field_c = field_c + 1;
            field_e[fieldTemp$4] = param0[var4];
            fieldTemp$5 = field_c;
            field_c = field_c + 1;
            field_e[fieldTemp$5] = var6;
            fieldTemp$6 = field_c;
            field_c = field_c + 1;
            field_e[fieldTemp$6] = param0[var8];
            fieldTemp$7 = field_c;
            field_c = field_c + 1;
            field_e[fieldTemp$7] = var7;
          }
          var4 = var8;
          var8 += 2;
        }
    }

    final static void a(ha param0, int[] param1, int param2, int param3, int param4) {
        int[] var6 = (int[]) null;
        int[] var5 = (int[]) null;
        rj.a(param0, param1, param2, param3, param4, (int[]) null, (int[]) null);
    }

    private final static void a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3 = 0;
        if (field_c < 0) {
          field_b = 0;
          field_f = 0;
          field_g = 0;
          field_d = 2147483646;
          return;
        }
        rj.a(0, field_c);
        int var1 = field_e[1];
        if (var1 < param0) {
          var1 = param0;
        }
        int var2 = 0;
        for (var3 = 0; var3 < field_c; var3 += 4) {
          var4 = field_e[var3 + 1];
          if (var1 < var4) {
            break;
          }
          var5 = field_e[var3];
          var6 = field_e[var3 + 2];
          var7 = field_e[var3 + 3];
          var8 = (var6 - var5 << 16) / (var7 - var4);
          var9 = (var5 << 16) + 32768;
          field_e[var3] = var9 + (var1 - var4) * var8;
          field_e[var3 + 2] = var8;
        }
        field_g = var2;
        field_f = var3;
        field_b = var3;
        field_d = var1 - 1;
    }

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
        var3 = field_e[var2];
        var4 = field_e[var2 + 1];
        var5 = field_e[var2 + 2];
        var6 = field_e[var2 + 3];
        for (var7 = param0 + 4; var7 < param1; var7 += 4) {
          var8 = field_e[var7 + 1];
          if (var8 < var4) {
            field_e[var2] = field_e[var7];
            field_e[var2 + 1] = var8;
            field_e[var2 + 2] = field_e[var7 + 2];
            field_e[var2 + 3] = field_e[var7 + 3];
            var2 += 4;
            field_e[var7] = field_e[var2];
            field_e[var7 + 1] = field_e[var2 + 1];
            field_e[var7 + 2] = field_e[var2 + 2];
            field_e[var7 + 3] = field_e[var2 + 3];
          }
        }
        field_e[var2] = var3;
        field_e[var2 + 1] = var4;
        field_e[var2 + 2] = var5;
        field_e[var2 + 3] = var6;
        rj.a(param0, var2);
        rj.a(var2 + 4, param1);
    }

    private final static void b(int param0, int param1) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        while (param1 >= param0 + 8) {
          var2 = 1;
          for (var3 = param0 + 4; var3 < param1; var3 += 4) {
            var4 = field_e[var3 - 4];
            var5 = field_e[var3];
            if (var4 > var5) {
              var2 = 0;
              field_e[var3 - 4] = var5;
              field_e[var3] = var4;
              var4 = field_e[var3 - 2];
              field_e[var3 - 2] = field_e[var3 + 2];
              field_e[var3 + 2] = var4;
              var4 = field_e[var3 - 1];
              field_e[var3 - 1] = field_e[var3 + 3];
              field_e[var3 + 3] = var4;
            }
          }
          if (var2 != 0) {
            return;
          }
          param1 -= 4;
        }
        return;
    }

    private final static void b() {
        field_c = 0;
    }

    final static void a(ha param0, int[] param1, int param2) {
        rj.a(param0, param1, 0, param1.length, param2, (int[]) null, (int[]) null);
    }

    private final static boolean b(int param0) {
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
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var1 = field_f;
        var2 = field_b;
        var3 = field_d;
        while (true) {
          if (var2 < var1) {
            field_a = field_e[var2] >> 16;
            field_h = field_e[var2 + 4] >> 16;
            field_e[var2] = field_e[var2] + field_e[var2 + 2];
            field_e[var2 + 4] = field_e[var2 + 4] + field_e[var2 + 6];
            var2 += 8;
            field_b = var2;
            return true;
          }
          var3++;
          field_d = var3;
          if (var3 >= param0) {
            return false;
          }
          var4 = field_g;
          while (var1 < field_c) {
            var5 = field_e[var1 + 1];
            if (var3 >= var5) {
              var6 = field_e[var1];
              var7 = field_e[var1 + 2];
              var8 = field_e[var1 + 3];
              var9 = (var7 - var6 << 16) / (var8 - var5);
              var10 = (var6 << 16) + 32768;
              field_e[var1] = var10;
              field_e[var1 + 2] = var9;
              var1 += 4;
              continue;
            }
            break;
          }
          var11 = var4;
          var5Lifetime1 = var11;
          while (var11 < var1) {
            var6Lifetime1 = field_e[var11 + 3];
            if (var3 >= var6Lifetime1) {
              field_e[var11] = field_e[var4];
              field_e[var11 + 1] = field_e[var4 + 1];
              field_e[var11 + 2] = field_e[var4 + 2];
              field_e[var11 + 3] = field_e[var4 + 3];
              var4 += 4;
            }
            var11 += 4;
          }
          if (var4 == field_c) {
            field_c = 0;
            return false;
          }
          rj.b(var4, var1);
          field_g = var4;
          field_f = var1;
          var2 = var4;
        }
    }

    private final static void a(ha param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var15;
        var15 = new int[4];
        param0.K(var15);
        if (param5 != null &&
          var15[3] - var15[1] != param5.length) {
          throw new IllegalStateException();
        }
        rj.b();
        rj.a(param1, param2, param3);
        rj.a(var15[1]);
        while (rj.b(var15[3])) {
          var8 = field_a;
          var9 = field_h;
          var10 = field_d;
          if (param5 != null) {
            var11 = var10 - var15[1];
            if (var8 < param5[var11] + var15[0]) {
              var8 = param5[var11] + var15[0];
            }
            if (var9 > param5[var11] + param6[var11] + var15[0]) {
              var9 = param5[var11] + param6[var11] + var15[0];
            }
            if (var9 - var8 <= 0) {
              continue;
            }
          }
          param0.U(var8, var10, var9 - var8, param4, 1);
        }
    }

    public static void a() {
        field_e = null;
    }
}
