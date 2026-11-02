/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String privatequickchatToX;
    static String playerListAreOut;
    static Sprite[][] field_d;
    static rb field_e;
    static int field_c;

    public static void a(byte param0) {
        playerListAreOut = null;
        privatequickchatToX = null;
        field_e = null;
        if (param0 > 31) {
          field_d = (Sprite[][]) null;
          return;
        }
        field_e = (rb) null;
        field_d = (Sprite[][]) null;
    }

    final static boolean a(byte param0, di param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        di var4 = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 5) {
            var4 = (di) null;
            jl.a((byte) -59, (di) null, -110);
          }
          var5 = param1.b(param2, -31413);
          var3 = var5;
          if (var5 == null) {
            return false;
          }
          ClientException.a(true, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        playerListAreOut = "<%0> are all out of lives!";
        privatequickchatToX = "To <%0>: ";
    }
}
