/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt {
    static String field_g;
    static boolean field_f;
    private int field_a;
    static rc field_e;
    static int field_d;
    private String field_b;
    int field_c;

    public final String toString() {
        return this.field_b.substring(0, this.field_c) + "|" + this.field_b.substring(this.field_c);
    }

    final char b(int param0) {
        if (param0 != -1) {
          this.field_b = (String) null;
        }
        int fieldTemp$0 = this.field_c;
        this.field_c = this.field_c + 1;
        return this.field_b.charAt(fieldTemp$0);
    }

    final boolean a(byte param0) {
        if (param0 != 16) {
          return true;
        }
        return this.field_c >= this.field_a ? true : false;
    }

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 > -116) {
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          mt.a((CipherPacketBuffer) null, false);
        }
    }

    final static String a(CipherPacketBuffer param0, boolean param1) {
        int var4_int = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.g(61, 2) + 1;
          var3 = new byte[var2_int];
          for (var4_int = 0; var4_int < var2_int; var4_int++) {
            var3[var4_int] = (byte)(int)sa.a(param0, -1, -15329);
          }
          if (!param1) {
            field_g = (String) null;
          }
          var4 = new String(var3);
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mt.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    mt(String param0) {
        this.field_c = 0;
        try {
          this.field_b = param0;
          this.field_a = this.field_b.length();
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "mt.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_g = "You can only use Fortify on a village.";
    }
}
