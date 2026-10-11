/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static String[] field_a;
    static int[] field_b;

    final static byte[] a(byte param0) {
        ld var1 = null;
        ld var1Lifetime1;
        if (param0 == -92) {
          var1 = new ld(10);
          var1.c(2, 25564);
          aa.field_j.b(param0 + 27529, var1);
          return var1.field_u;
        }
        field_a = (String[]) null;
        var1Lifetime1 = new ld(10);
        var1Lifetime1.c(2, 25564);
        aa.field_j.b(param0 + 27529, var1Lifetime1);
        return var1Lifetime1.field_u;
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        String[] var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (kb.field_b != null) {
            kb.field_b.field_U.a((byte) -123, args);
          }
          if (param1 != 18423) {
            var3 = (String[]) null;
            en.a((String[]) null, 63);
          }
          if (bh.field_Z == null) {
            return;
          }
          bh.field_Z.field_K.a((byte) 118, args);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("en.B(");
          if (args == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 10) {
          en.a((byte) -13);
        }
    }

    static {
        field_a = new String[]{"Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Iron mined: <%0>/25", "Silver mined: <%0>/25", "Gold mined: <%0>/25", "Effluvium mined: <%0>/25", "Diamonds mined: <%0>/10", "Equipment collected: <%0>", null, "Underwater gems collected: <%0>/25", "Gems mined from rocks: <%0>/25", "Diamonds mined: <%0>/10", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Freezium mined: <%0>/25", "Points in oil: <%0>", null, "Walrus-free points: <%0>", null, null, "Snow blocks mined: <%0>", "Current score: <%0>", "Oil burnt: <%0>%", "Tutorial tips seen: <%0>/<%1>", "Ice blocks created: <%0>", null, null, "Seconds into game: <%0>", null, "Longest Explosion: <%0> sec."};
        field_b = new int[4];
    }
}
