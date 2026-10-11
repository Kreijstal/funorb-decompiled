/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt {
    static je[] field_b;
    static RgbSprite[] field_c;
    static String field_g;
    static int field_i;
    static String field_a;
    static int[] field_d;
    static RgbSprite field_e;
    static String field_h;
    static String[] field_f;

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -112 % ((param1 - 19) / 63);
          var3 = (CharSequence) ((Object) param0);
          stackIn_1_0 = ft.field_p.equals(k.a(var3, false));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("gt.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static rn b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        rn var5 = null;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            0 != param0.length()) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = hv.field_N;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            if (param1 != -24) {
              field_f = (String[]) null;
            }
            var5 = ng.a(var3, 15026);
            if (var5 == null) {
              return ew.a(var4, (byte) 104);
            }
            stackIn_14_0 = var5;
            return stackIn_14_0;
          }
          stackIn_4_0 = tn.field_ab;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("gt.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_d = null;
        if (param0 == 494) {
          field_h = null;
          return;
        }
    }

    final static int[] a(int param0, PacketBuffer param1) {
        int var3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        PacketBuffer var5 = null;
        int[] var6 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6 = new int[6];
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var6[var3] = param1.readUnsignedByte(param0 + 2);
          }
          if (param0 != -2) {
            var5 = (PacketBuffer) null;
            gt.a(115, (PacketBuffer) null);
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("gt.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_g = "This coat of arms became unlocked at <%0>. All parts of it are available to add to your own coat of arms.";
        field_a = "This game option is only available to members.";
        field_d = new int[128];
        field_h = "Checking";
    }
}
