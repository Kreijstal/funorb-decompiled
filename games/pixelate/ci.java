/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends jj {
    private li field_q;
    static boolean field_n;
    static int[] field_m;
    static String field_r;
    private li field_p;
    static int field_o;

    final void c(int param0) {
        super.c(param0);
        this.field_p.a(440, 100, (byte) 116, 120, 0);
        this.field_q.a(440, 100, (byte) 116, 120, 0);
        lg.field_a = lg.field_a - 4;
        if (!(0 <= lg.field_a)) {
          lg.field_a = 0;
        }
    }

    final void a(boolean param0) {
        qa.field_g.f(0, 0);
        int var2 = lg.field_a >> 3;
        t.f(0, 0, 640, 480, 17, (var2 << 8) + (var2 * 2 + 34) + (var2 << 16));
        this.field_p.b((byte) -123);
        this.field_q.b((byte) -123);
        Pixelate.field_E.b(0, -Pixelate.field_E.field_B + 480);
        if (param0) {
          return;
        }
        u.field_f.b(0, -u.field_f.field_B + 480, lg.field_a);
    }

    ci(String param0, tf[] param1) {
        super(param0, param1);
        int var4 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var17 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1Lifetime1;
        try {
          var14 = new int[255];
          var12 = var14;
          var11 = var12;
          var3 = var11;
          for (var4 = 0; var4 < var14.length; var4++) {
            var5 = var4 * 257;
            var6 = var4;
            var7 = var4;
            var6 = var6 >> 1;
            var8 = (int)(0.5 * (double)var4);
            var7 = var7 >> 1;
            var8 = var8 >> 1;
            if (var7 > 255) {
              var7 = 255;
            }
            if (var7 < 0) {
              var7 = 0;
            }
            if (var6 < 0) {
              var6 = 0;
            }
            if (var8 > 255) {
              var8 = 255;
            }
            var6 = var6 << 16;
            var7 = var7 << 8;
            if (var8 < 0) {
              var8 = 0;
            }
            var5Lifetime2 = var7 | var6 | var8;
            var14[var4] = var5Lifetime2;
          }
          var17 = new int[255];
          for (var5Lifetime1 = 0; var17.length > var5Lifetime1; var5Lifetime1++) {
            var6Lifetime1 = 257 * var5Lifetime1;
            var8Lifetime1 = (int)((double)var5Lifetime1 * 0.6);
            var7Lifetime1 = (int)((double)var5Lifetime1 * 0.6);
            var7Lifetime1 = var7Lifetime1 >> 1;
            var9 = var5Lifetime1;
            var8Lifetime1 = var8Lifetime1 >> 1;
            if (var8Lifetime1 > 255) {
              var8Lifetime1 = 255;
            }
            var9 = var9 >> 1;
            if (var9 > 255) {
              var9 = 255;
            }
            if (0 > var8Lifetime1) {
              var8Lifetime1 = 0;
            }
            if (var7Lifetime1 < 0) {
              var7Lifetime1 = 0;
            }
            var7Lifetime1 = var7Lifetime1 << 16;
            var8Lifetime1 = var8Lifetime1 << 8;
            if (var9 < 0) {
              var9 = 0;
            }
            var6Lifetime1Lifetime1 = var8Lifetime1 | var7Lifetime1 | var9;
            var17[var5Lifetime1] = var6Lifetime1Lifetime1;
          }
          this.field_p = new li(2, 47, var14);
          this.field_q = new li(1, 47, var17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_31_0 = var3_ref;
          stackIn_31_1 = new StringBuilder().append("ci.<init>(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != -12424) {
          return;
        }
        field_m = null;
        field_r = null;
    }

    static {
        int var0 = 0;
        field_m = new int[132];
        field_r = "Create unrated game";
        for (var0 = 0; field_m.length > var0; var0++) {
          field_m[var0] = 256;
        }
        field_m[118] = 200;
        field_m[57] = 180;
        field_m[7] = 141;
        field_m[113] = 146;
        field_m[62] = 103;
        field_m[79] = 200;
        field_m[59] = 180;
        field_m[112] = 146;
        field_m[126] = 211;
        field_m[115] = 205;
        field_m[6] = 150;
        field_m[124] = 201;
        field_m[61] = 190;
        field_m[119] = 200;
        field_m[117] = 146;
        field_m[58] = 180;
        field_m[39] = 213;
        field_m[114] = 146;
        field_m[63] = 180;
        field_m[60] = 180;
        field_m[38] = 213;
        field_m[56] = 180;
        field_m[78] = 200;
        field_m[131] = 238;
    }
}
