/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends df {
    static String createUnder13TermsText;
    static String startGameText;
    private String field_d;
    static int[] field_c;
    private String field_h;
    static int[] packedMatchCandidates;
    static volatile int keyboardIdleTicks;

    final void a(int param0, ByteArrayBuffer param1) {
        try {
            if (param0 <= 107) {
                byte[] var4 = (byte[]) null;
                nk.a((byte[]) null, -72);
            }
            param1.writeZeroPrefixedNullTerminatedText(this.field_d, (byte) -126);
            param1.writeBase38Text(this.field_h, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "nk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          sf.a(param0, 0, var3, param1, var2_int);
          stackIn_1_0 = (byte[]) (var3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var2);
          stackIn_4_1 = new StringBuilder().append("nk.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        createUnder13TermsText = null;
        packedMatchCandidates = null;
        startGameText = null;
        field_c = null;
        if (param0 != -17226) {
            startGameText = (String) null;
        }
    }

    final qg a(byte param0) {
        if (param0 != -32) {
            field_c = (int[]) null;
            return ej.field_b;
        }
        return ej.field_b;
    }

    nk(String param0, String param1) {
        try {
            this.field_h = param1;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        startGameText = "Start Game";
        createUnder13TermsText = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        packedMatchCandidates = new int[1000];
        keyboardIdleTicks = 0;
    }
}
