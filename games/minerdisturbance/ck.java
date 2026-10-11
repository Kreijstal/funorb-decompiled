/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String[] field_c;
    static String field_e;
    static ea field_a;
    static long field_d;

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -100) {
          bj var2 = (bj) null;
          ck.a(-35, -80, 96, (bj) null);
        }
    }

    final static ea[] a(int param0, int param1, int param2, bj param3) {
        RuntimeException var4 = null;
        ea[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cn.a(param0, 258, param2, param3)) {
            return null;
          }
          if (param1 != 64) {
            field_b = (String) null;
          }
          stackIn_6_0 = kk.a(94);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ck.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static ea[] a(byte param0, int param1) {
        ea[] var3 = new ea[9];
        ea[] var2 = var3;
        var3[4] = hb.a(64, 32768, param1);
        if (param0 == 126) {
          return var2;
        }
        field_d = -100L;
        return var2;
    }

    final static void a(int param0) {
        byte[] var2 = null;
        byte[] var1 = null;
        byte[] var2Lifetime1;
        byte[] var1Lifetime1;
        if (kj.a(false)) {
          return;
        }
        if (aa.field_j == null) {
          return;
        }
        if (param0 == -30833) {
          var2 = en.a((byte) -92);
          var1 = var2;
          le.a(0, var2, 6);
          return;
        }
        field_e = (String) null;
        var2Lifetime1 = en.a((byte) -92);
        var1Lifetime1 = var2Lifetime1;
        le.a(0, var2Lifetime1, 6);
    }

    static {
        field_b = "Ranking: Maestro Miner";
        field_c = new String[]{"All scores", "My scores", "Best each"};
        field_e = "There's so much water in the Super Volcano you'll need much more air to swim through it. Grab this souped-up aqualung for an extra large supply of precious oxygen.";
    }
}
