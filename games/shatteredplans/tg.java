/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tg {
    static Random field_b;
    static int[] field_d;
    static int field_a;
    static qr field_c;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -91) {
          bi var5 = (bi) null;
          tg.a(-57, (bi) null, (byte) 36, -126);
          if (param1 < 0) {
            return false;
          }
          if (param1 > 11) {
            return false;
          }
          if (param0 < 1) {
            return false;
          }
          if (!(oq.a((byte) -123, param3, param1) >= param0)) {
            return false;
          }
          return true;
        }
        if (param1 < 0) {
          return false;
        }
        if (param1 > 11) {
          return false;
        }
        if (param0 < 1) {
          return false;
        }
        if (oq.a((byte) -123, param3, param1) >= param0) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 95 % ((param0 + 56) / 38);
    }

    final static void a(int param0, bi param1, byte param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param3 = param3 + param1.field_t;
          param0 = param0 + param1.field_x;
          var4_int = 0;
          var5 = 0;
          var6 = param1.field_z;
          if (gf.field_i > param3) {
            var6 = var6 + (param3 - gf.field_i);
            var4_int = -param3 + gf.field_i;
            param3 = gf.field_i;
          }
          var7 = param1.field_w;
          if (param0 < gf.field_a) {
            var5 = -param0 + gf.field_a;
            var7 = var7 + (-gf.field_a + param0);
            param0 = gf.field_a;
          }
          if (var6 + param3 > gf.field_l) {
            var6 = gf.field_l - param3;
          }
          var8 = -74 % ((param2 + 81) / 43);
          if (var7 + param0 > gf.field_f) {
            var7 = -param0 + gf.field_f;
          }
          var9 = var4_int + var5 * param1.field_z;
          var10 = -var6 + param1.field_z;
          var11 = gf.field_b * param0 + param3;
          var12 = -var6 + gf.field_b;
          for (param0 = -var7; 0 > param0; param0++) {
            for (param3 = -var6; 0 > param3; param3++) {
              incrementValue$0 = var9;
              var9++;
              var13 = 255 & param1.field_B[incrementValue$0];
              if (var13 != 0) {
                var14 = gf.field_h[var11];
                if (255 > var13) {
                  var13 = var13 >> 2;
                  var15 = var14 & 65280;
                  var14 = var14 & 16711935;
                  var14 = var14 * (256 - var13);
                  var14 = var14 & -16711936;
                  var15 = var15 * (256 - var13);
                  var15 = var15 & 16711680;
                  var14 = (var14 | var15) >>> 8;
                  var14 = var14 + var13 * 65793;
                } else {
                  var14 = 8355711 & var14 >>> 1 | 8421504;
                }
                incrementValue$1 = var11;
                var11++;
                gf.field_h[incrementValue$1] = var14;
              } else {
                var11++;
              }
            }
            var9 = var9 + var10;
            var11 = var11 + var12;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("tg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = new Random();
        field_d = new int[8192];
    }
}
