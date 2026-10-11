/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    private String field_g;
    static int field_f;
    static String field_d;
    static kg field_c;
    static int[] field_b;
    static ba field_e;
    static String field_a;
    static String field_h;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 < 114) {
          return;
        }
        field_h = null;
        field_b = null;
        field_e = null;
    }

    final static void a(rj param0, byte param1, int param2) {
        kd.field_c = param2;
        uo.field_f = le.field_b[kd.field_c];
        fc.field_d = 0;
        id.field_l = param0;
        if (param1 < 40) {
          return;
        }
        try {
          og.a(false, 0, uo.field_f[fc.field_d]);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ba.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 != 64) {
            rj var4 = (rj) null;
            ba.a((rj) null, (byte) 20, -83);
          }
          lm.a(false, "jagex-last-login-method", 31536000L, param1, this.field_g);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 20886) {
            stackIn_4_0 = this.field_g.equals(param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ba.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static cn[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        cn[] var10;
        cn[] var11_ref_cn__;
        int var11;
        int var12;
        cn var13;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var9 = param6 + (param5 + param8);
        var10 = new cn[]{new cn(var9, var9), new cn(param1, var9), new cn(var9, var9), new cn(var9, param1), new cn(64, 64), new cn(var9, param1), new cn(var9, var9), new cn(param1, var9), new cn(var9, var9)};
        if (param2 > -80) {
          field_a = (String) null;
        }
        var11_ref_cn__ = var10;
        for (var12 = 0; var11_ref_cn__.length > var12; var12++) {
          var13 = var11_ref_cn__[var12];
          for (var14 = 0; var13.field_B.length > var14; var14++) {
            var13.field_B[var14] = param3;
          }
        }
        for (var11 = 0; param6 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_B[var12Lifetime1 + var9 * (-var11 + (var9 - 1))] = param4;
            var10[8].field_B[(-1 + var9 - var11) * var9 + var12Lifetime1] = param4;
            var10[2].field_B[var12Lifetime1 * var9 + (-var11 - 1 + var9)] = param4;
            var10[8].field_B[var9 - 1 - var11 + var12Lifetime1 * var9] = param4;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param6; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_B[var11Lifetime1 * var9 + var12Lifetime2] = param0;
            var10[0].field_B[var11Lifetime1 + var9 * var12Lifetime2] = param0;
            if (-var11Lifetime1 + var9 > var12Lifetime2) {
              var10[2].field_B[var9 * var11Lifetime1 + var12Lifetime2] = param0;
              var10[6].field_B[var11Lifetime1 + var12Lifetime2 * var9] = param0;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param1; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param6 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_B[var11Lifetime2 + (-var12Lifetime3 + var9 - 1) * param1] = param4;
            var10[5].field_B[var11Lifetime2 * var9 - (-var9 + 1) - var12Lifetime3] = param4;
            var10[1].field_B[param1 * var12Lifetime3 + var11Lifetime2] = param0;
            var10[3].field_B[var12Lifetime3 + var11Lifetime2 * var9] = param0;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param1 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param8 > var12Lifetime4; var12Lifetime4++) {
            var10[1].field_B[var11Lifetime3 + (var9 - var12Lifetime4 - 1) * param1] = param7;
            var10[3].field_B[-var12Lifetime4 - (-var9 + 1) + var9 * var11Lifetime3] = param7;
            var10[7].field_B[var11Lifetime3 + var12Lifetime4 * param1] = param7;
            var10[5].field_B[var11Lifetime3 * var9 + var12Lifetime4] = param7;
          }
        }
        return var10;
    }

    ba(String param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Your raider was detected by trap, but avoided it.";
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_a = "Notoriously dimwitted, the ogres share the highlands with the goblin and orc tribes. What this particular ogre thug lacks in intellect and subtlety, he compensates for with raw force.";
        field_c = null;
        field_e = new ba("email");
        field_h = "Dungeon Assault";
    }
}
