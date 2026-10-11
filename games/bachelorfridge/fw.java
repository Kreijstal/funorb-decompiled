/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fw extends bw {
    int field_k;
    static ee field_f;
    int field_g;
    static jd field_i;
    static vr field_j;
    static long field_l;
    static pd[] field_h;

    final static void a(int param0, kv param1, int param2, int param3, boolean param4, kv param5, int param6) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kv var14 = null;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var13 = BachelorFridge.field_y;
        try {
          if (!param4) {
            var14 = (kv) null;
            fw.a((byte) 13, (kv) null, (kv) null, (kv) null);
          }
          param6 -= 3;
          if (param1.field_q < param2) {
            param2 = param1.field_q;
          }
          var7_int = 1 + param1.field_q;
          for (var8 = 1; var8 < -1 + param1.field_p; var8++) {
            for (var9 = 1; var9 < param2; var9++) {
              var10 = param1.field_v[var7_int] & 255;
              if (var10 < (param1.field_v[var7_int + param1.field_q] & 255)) {
                var10 = param1.field_v[var7_int + param1.field_q] & 255;
              }
              if (var10 < (255 & param1.field_v[-param1.field_q + var7_int])) {
                var10 = 255 & param1.field_v[var7_int - param1.field_q];
              }
              if (var10 < (param1.field_v[1 + param1.field_q + var7_int] & 255)) {
                var10 = 255 & param1.field_v[1 + var7_int + param1.field_q];
              }
              if (var10 < (param1.field_v[-1 + (-param1.field_q + var7_int)] & 255)) {
                var10 = param1.field_v[var7_int - (param1.field_q + 1)] & 255;
              }
              if (var10 < (255 & param1.field_v[param1.field_q + var7_int - 1])) {
                var10 = 255 & param1.field_v[var7_int + (param1.field_q - 1)];
              }
              if (var10 < (255 & param1.field_v[1 + (var7_int - param1.field_q)])) {
                var10 = 255 & param1.field_v[-param1.field_q + (var7_int + 1)];
              }
              if ((param1.field_v[var7_int + 1] & 255) > var10) {
                var10 = param1.field_v[1 + var7_int] & 255;
              }
              if (var10 < (255 & param1.field_v[var7_int - 1])) {
                var10 = 255 & param1.field_v[-1 + var7_int];
              }
              incrementValue$0 = var7_int;
              var7_int++;
              param5.field_v[incrementValue$0] = var10;
            }
            var7_int = var7_int + (-param2 + param1.field_q + 1);
          }
          var7_intLifetime1 = 0;
          for (var8Lifetime1 = 0; param1.field_p > var8Lifetime1; var8Lifetime1++) {
            for (var9Lifetime1 = 0; var9Lifetime1 < param2; var9Lifetime1++) {
              var10Lifetime1 = 255 & param1.field_v[var7_intLifetime1];
              var11 = param5.field_v[var7_intLifetime1] & 255;
              var12 = 0;
              var12 = var12 | ((param3 >> 16) * var10Lifetime1 & 65280) << 8;
              var12 = var12 | 65280 & var10Lifetime1 * ((param3 & 65280) >> 8);
              var12 = var12 | var10Lifetime1 * (255 & param3) >> 8 & 255;
              if (0 <= param1.field_v[var7_intLifetime1]) {
                tla.a(var9Lifetime1 + param0, -1898743704, var12, var8Lifetime1 + param6, var11);
              }
              var7_intLifetime1++;
            }
            var7_intLifetime1 = var7_intLifetime1 + (param1.field_q - param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_41_0 = var7;
          stackIn_41_1 = new StringBuilder().append("fw.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param6).append(')').toString());
        }
    }

    final static kv[] a(byte param0, kv param1, kv param2, kv param3) {
        kv[] var4 = null;
        RuntimeException var4_ref = null;
        kv[] var5 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new kv[9];
          var4 = var5;
          var5[3] = param2;
          var5[5] = param3;
          if (param0 > -112) {
            field_h = (pd[]) null;
          }
          var5[4] = param1;
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("fw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static kv[] a(int param0, byte param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        kv[] var5 = new kv[50];
        kv[] var2 = var5;
        if (param1 != -74) {
          return (kv[]) null;
        }
        for (var3 = 0; 50 > var3; var3++) {
          var5[var3] = bs.a(qs.field_l[param0][var3], (byte) 112);
        }
        return var2;
    }

    fw(int param0, int param1) {
        this.field_k = param0;
        this.field_g = param1;
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != -8668) {
          return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        field_i = new jd(1);
        field_h = new pd[50];
    }
}
