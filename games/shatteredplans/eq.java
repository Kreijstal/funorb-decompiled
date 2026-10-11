/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends oh {
    static bi field_o;
    static String field_i;
    int[] field_r;
    int[] field_p;
    byte[][][] field_h;
    int[] field_m;
    pb[] field_q;
    int field_j;
    pb[] field_n;
    static qh field_k;
    int field_l;

    final static void d(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        sq var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          wn.c();
          we.field_e = 11;
          uc.field_w = new int[260];
          if (param0 != -47) {
            var5 = (sq) null;
            eq.a((String[]) null, (sq) null, 48);
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            uc.field_w[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var6 = 256;
          var1_intLifetime1 = var6;
          while (var6 < uc.field_w.length) {
            uc.field_w[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "eq.B(" + param0 + ')');
        }
    }

    final static void a(String[] args, sq param1, int param2) {
        int var4 = 0;
        String[] var3 = null;
        String var5 = null;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7 = args;
          var3 = var7;
          for (var4 = param2; var7.length > var4; var4++) {
            var5 = var7[var4];
            param1.a(30712, var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("eq.A(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -70) {
          return;
        }
        field_i = null;
        field_o = null;
        field_k = null;
    }

    eq() {
    }

    static {
        field_i = "Cancel unrated rematch";
    }
}
