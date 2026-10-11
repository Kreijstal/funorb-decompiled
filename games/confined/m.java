/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private vh field_f;
    static va field_g;
    static nf[] field_i;
    static int field_a;
    static int field_l;
    private mi field_c;
    private mi field_e;
    static java.awt.Color field_k;
    private vh field_j;
    static String field_h;
    static long field_b;
    static mn field_d;

    final bi a(int param0, int param1, int param2) {
        if (param2 != 256) {
          return (bi) null;
        }
        return this.a(param0, (int[]) null, false, param1);
    }

    private final bi a(int param0, int[] param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        bi var8 = null;
        fk var9 = null;
        bi var10 = null;
        bi stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        bi stackIn_12_0 = null;
        bi stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi var8Lifetime1;
        try {
          var5_int = ((268439551 & param0) << 4 | param0 >>> 12) ^ param3;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (bi) (this.field_j.a(1, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            stackIn_6_0 = null;
            return (bi) (stackIn_6_0);
          }
          var9 = fk.a(this.field_c, param0, param3);
          if (var9 == null) {
            return null;
          }
          if (param2) {
            stackIn_12_0 = (bi) null;
            return stackIn_12_0;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_j.a(var8Lifetime1, 11, var6);
          if (param1 != null) {
            param1[0] = param1[0] - var10.field_o.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("m.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final bi a(int param0, byte param1, int param2) {
        if (param1 == 76) {
          return this.a(param2, param0, (int[]) null, (byte) -117);
        }
        this.a(-124, (byte) -9, -5);
        return this.a(param2, param0, (int[]) null, (byte) -117);
    }

    private final bi a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        int var8 = 0;
        bi var9 = null;
        ph var10 = null;
        bi stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        bi stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi var9Lifetime1;
        try {
          var5_int = (param0 >>> 12 | param0 << 4 & 65527) ^ param1;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = 17 / ((param3 + 56) / 58);
          var9 = (bi) (this.field_j.a(1, var6));
          if (var9 != null) {
            stackIn_2_0 = var9;
            return stackIn_2_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            return null;
          }
          var10 = (ph) (this.field_f.a(1, var6));
          if (var10 == null) {
            var10 = ph.a(this.field_e, param0, param1);
            if (var10 == null) {
              stackIn_11_0 = null;
              return (bi) (stackIn_11_0);
            }
            this.field_f.a(var10, 11, var6);
          }
          var9Lifetime1 = var10.a(param2);
          if (var9Lifetime1 == null) {
            stackIn_15_0 = null;
            return (bi) (stackIn_15_0);
          }
          var10.a(true);
          this.field_j.a(var9Lifetime1, 11, var6);
          stackIn_17_0 = var9Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("m.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_d = null;
        field_i = null;
        field_g = null;
        if (param0 == 27244) {
          field_h = null;
          return;
        }
        m.a(23);
        field_h = null;
    }

    m(mi param0, mi param1) {
        this.field_f = new vh(256);
        this.field_j = new vh(256);
        try {
          this.field_e = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
        field_l = 0;
        field_g = new va();
        field_h = "If we could get#our hands on their#technology#we could become#supreme rulers#of the galaxy.";
        field_k = new java.awt.Color(10040319);
        field_d = new mn();
    }
}
