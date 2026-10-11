/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static ll field_b;
    static int field_c;
    static boolean field_a;
    static int[] field_d;

    public static void b(byte param0) {
        int var1 = -20 / ((81 - param0) / 40);
        field_d = null;
        field_b = null;
    }

    final static ui a(int param0, int param1, el param2) {
        RuntimeException var3 = null;
        ui stackIn_2_0 = null;
        ui stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 255) {
            stackIn_4_0 = lg.a(db.a(param2, 100, param1), (byte) -68);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ui) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ad.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        int var2 = 0;
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        hj var4 = null;
        ki var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          var5 = (ki) (sl.field_b.b((byte) 94));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          if (param0 <= 80) {
            var4 = (hj) null;
            ad.a((int[]) null, 0.6495102643966675f, (byte) -45, 0.5647060871124268f, (hj) null);
          }
          for (var2 = 0; var2 < var1.field_p; var2++) {
            if (null != var5.field_k[var2] &&
              0 == var5.field_k[var2].field_d) {
              return false;
            }
            if (null != var5.field_l[var2] &&
              0 == var5.field_l[var2].field_d) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "ad.D(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = 10 / ((-30 - param0) / 44);
        if (ra.field_ab != -1) {
          mn.field_b = ld.field_b << 16 | ra.field_ab;
        } else {
          if (na.field_k) {
            mn.field_b = -1;
            qj.field_I = -1;
          }
        }
        hm.a((byte) 66, mn.field_b);
        ra.field_ab = -1;
    }

    final static void a(int[] param0, float param1, byte param2, float param3, hj param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var21Lifetime1;
        int var22Lifetime1;
        var24 = HoldTheLine.field_D;
        try {
          gf.a();
          gf.a(param0, 0, param0.length);
          gf.c();
          var5_int = 51 % ((param2 - 26) / 33);
          while (true) {
            if (!gf.d()) {
              return;
            }
            var6 = gf.field_g;
            if (var6 < 0) {
              var6 = 0;
            }
            var7 = gf.field_b;
            if (var7 >= tc.field_j) {
              var7 = -1 + tc.field_j;
            }
            var8 = gf.field_a;
            if (var8 < 0) {
              var8 = 0;
            }
            if (tc.field_c <= var8) {
              var8 = -1 + tc.field_c;
            }
            var9 = var6 % param4.field_s;
            var10 = var8 % param4.field_y;
            var11 = var8 * tc.field_j + var6;
            var12 = var10 * param4.field_s + var9;
            var13 = param4.field_s - var9;
            var14 = -var6 + var7;
            while (true) {
              var14--;
              if (0 > var14) {
                break;
              }
              var15 = tc.field_b[var11] & 16711680;
              var16 = tc.field_b[var11] & 65280;
              var17 = tc.field_b[var11] & 255;
              var18 = 16711680 & param4.field_z[var12];
              var19 = 65280 & param4.field_z[var12];
              var20 = 255 & param4.field_z[var12];
              if (!(param3 < 0.0f)) {
                var21 = (int)(param3 * 256.0f);
                var22 = 256 - var21;
                var18 = var21 * 16711680 + var22 * var18 >>> 8;
                var19 = var21 * 65280 + var19 * var22 >>> 8;
                var20 = var20 * var22 + 255 * var21 >>> 8;
              } else {
                var21 = (int)((1.0f + param3) * 256.0f);
                var19 = var21 * var19 >>> 8;
                var18 = var18 * var21 >>> 8;
                var20 = var20 * var21 >>> 8;
              }
              var21Lifetime1 = (int)(param1 * (float)(-var15 + var18)) + var15;
              var22Lifetime1 = (int)(param1 * (float)(-var16 + var19)) + var16;
              var23 = (int)((float)(-var17 + var20) * param1) + var17;
              tc.field_b[var11] = kc.a(pk.a(255, var23), kc.a(pk.a(var22Lifetime1, 65280), pk.a(var21Lifetime1, 16711680)));
              var11++;
              var12++;
              var13--;
              if (var13 != 0) {
                continue;
              }
              var12 = var10 * param4.field_s;
              var13 = param4.field_s;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ad.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_b = new ll();
    }
}
