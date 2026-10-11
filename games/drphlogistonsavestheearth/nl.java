/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends gi {
    int field_p;
    static vk[] field_r;
    int field_h;
    int field_l;
    static he[][] field_n;
    static int field_m;
    int field_q;
    int field_k;
    static String[] field_i;
    static String field_o;
    int field_j;

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var1Lifetime1;
        int var2Lifetime1;
        if (param0 == -1321745375) {
          var1 = ie.a(false);
          var2 = ig.a((byte) 115);
          cb.field_a.a(var2 + (di.field_d << 1), -df.field_h + si.field_B, var1 + (df.field_h << 1), jd.field_N - di.field_d, 7453);
          tf.n(17077);
          return;
        }
        nl.a((byte) -105);
        var1Lifetime1 = ie.a(false);
        var2Lifetime1 = ig.a((byte) 115);
        cb.field_a.a(var2Lifetime1 + (di.field_d << 1), -df.field_h + si.field_B, var1Lifetime1 + (df.field_h << 1), jd.field_N - di.field_d, 7453);
        tf.n(17077);
    }

    public static void a(byte param0) {
        field_n = (he[][]) null;
        if (param0 < -56) {
          field_o = null;
          field_i = null;
          field_r = null;
          return;
        }
        field_m = -5;
        field_o = null;
        field_i = null;
        field_r = null;
    }

    final static byte[] a(byte param0, int param1, lh param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4_int = param2.e(param1, (byte) -124);
          if (param0 != 65) {
            nl.a((byte) -84);
          }
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new byte[var4_int];
          }
          var5 = param2.e(3, (byte) 102);
          var6 = (byte)param2.e(8, (byte) -95);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)(param2.e(var5, (byte) -110) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("nl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    nl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param3;
        this.field_q = param4;
        this.field_k = param5;
        this.field_h = param2;
        this.field_l = param1;
        this.field_j = param0;
    }

    static {
        field_r = new vk[74];
        field_n = new he[3][];
        field_i = new String[]{"By rating", "By win percentage"};
        field_o = "To server list";
    }
}
