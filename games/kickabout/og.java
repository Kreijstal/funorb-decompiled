/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class og {
    int[] field_b;
    int field_a;
    static int field_c;
    java.awt.Image field_d;
    int field_e;

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, ut[] param1, int param2, int param3) {
        ut var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var10 = 0;
        ut var11 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ut var6_ref_ut = null;
        int var7 = 0;
        ut var7_ref_ut = null;
        int var8 = 0;
        int var9 = 0;
        int[] var12 = null;
        ut var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ut var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        ut var19 = null;
        int[] var20 = null;
        int var5Lifetime1;
        var10 = Kickabout.field_G;
        try {
          if (0 == rm.field_C) {
            var15 = new int[]{-100, 100, 0, 50, -50};
            var17 = new int[]{100, 100, 90, 40, 40};
            for (var6 = 0; 5 > var6; var6++) {
              var16 = param1[p.a((byte) -24, 3)];
              var8 = 448 + var15[var6] - (var16.field_o >> 1);
              var9 = var17[var6] - (var16.field_v >> 1) + 10;
              var16.c(var8 + param2, var9 + param3);
              var16.c(var8 + param2, param3 + 1344 - var9 - var16.field_v);
            }
            var20 = new int[]{30, -20, 0};
            var18 = new int[]{-50, -10, 40};
            for (var6 = 0; var6 < 3; var6++) {
              var19 = param1[p.a((byte) -24, 3)];
              var8 = var18[var6] + (896 - var19.field_o >> 1);
              var9 = var20[var6] + (1344 - var19.field_v >> 1);
              var19.c(param2 + var8, var9 + param3);
            }
          } else if (rm.field_C != 1 &&
            rm.field_C != 2) {
            if (3 == rm.field_C) {
              var11 = param1[p.a((byte) -24, 3)];
              var4 = var11;
              var5 = el.a(29430, 10, 896 - var11.field_o >> 1);
              var6 = el.a(29430, 10, 50 - (var11.field_v >> 1));
              var11.c(var5 + param2, var6 + param3);
              var4.c(param2 + var5, -var11.field_v - var6 + (1344 + param3));
              var5Lifetime1 = el.a(29430, 10, -var11.field_o + 896 >> 1);
              var6 = el.a(29430, 10, 1344 - var11.field_v >> 1);
              param1[p.a((byte) -24, 3)].c(var5Lifetime1 + param2, param3 + var6);
            }
          } else {
            var12 = new int[]{-40, 40, 0};
            var14 = new int[]{0, 0, 50};
            for (var6 = 0; var6 < 3; var6++) {
              var13 = param1[var6];
              var7_ref_ut = var13;
              var8 = el.a(29430, 10, var12[var6] + (896 - var13.field_o >> 1));
              var9 = el.a(29430, 10, 60 - ((var13.field_v >> 1) - var14[var6]));
              var13.c(var8 + param2, var9 + param3);
              var7_ref_ut.c(var8 + param2, -var13.field_v - var9 + (1344 + param3));
            }
            var6_ref_ut = param1[p.a((byte) -24, 3)];
            var7 = el.a(29430, 10, -var6_ref_ut.field_o + 896 >> 1);
            var8 = el.a(29430, 10, 1344 - var6_ref_ut.field_v >> 1);
            var6_ref_ut.c(var7 + param2, var8 + param3);
          }
          if (param0 < 71) {
            field_c = 46;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("og.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) {
        on.a(this.field_b, this.field_a, this.field_e);
        if (param0 != 32) {
          this.field_a = -72;
        }
    }

    final static void a(int param0) {
        vu.field_Ib = new tk("Cabinet", ne.j((byte) 15), be.field_q, it.field_m);
        vu.field_Ib.a(16, 100, 4, (byte) -114, 200, 300, 70);
        if (param0 != 20164) {
          field_c = 125;
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static String[] a(String param0, int param1, byte param2) {
        StringBuilder discarded$0 = null;
        int var12 = 0;
        String[] stackIn_4_0 = null;
        String[] stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        int var11_int = 0;
        int var13 = 0;
        int var10Lifetime1;
        var13 = Kickabout.field_G;
        try {
          if (param0 == null) {
            stackIn_4_0 = new String[]{};
            return stackIn_4_0;
          }
          dj.a(0, ' ', -11407, c.field_a);
          var3_int = 0;
          var4 = 0;
          var5 = -1;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = param0.length();
          for (var10 = 0; var10 < var9; var10++) {
            var11_int = param0.charAt(var10);
            if (var11_int != 0) {
              discarded$0 = c.field_a.append((char) var11_int);
              var3_int++;
              var11_int = (char)(255 & mf.a((char) var11_int, (byte) -104));
            }
            if (var11_int == 32) {
              var5 = c.field_a.length();
              var7 = 1;
              var6 = var3_int;
            }
            if (var3_int > param1 &&
              var5 >= 0) {
              n.field_f[var8] = c.field_a.toString().substring(var4, var5 - var7);
              var8++;
              var4 = var5;
              var3_int = var3_int - var6;
              var5 = -1;
            }
            if (var11_int == 45) {
              var5 = c.field_a.length();
              var7 = 0;
              var6 = var3_int;
            }
          }
          if (var4 < c.field_a.length()) {
            n.field_f[var8] = c.field_a.toString().substring(var4, c.field_a.length());
            var8++;
          }
          var10Lifetime1 = -13 % ((param2 - 77) / 44);
          var11 = new String[var8];
          for (var12 = 0; var8 > var12; var12++) {
            var11[var12] = n.field_f[var12];
          }
          stackIn_27_0 = var11;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("og.F(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        np.field_Jb.a(new sq(), 3);
        if (param0) {
          og.a(false);
        }
    }

    static {
        field_c = 1;
    }
}
