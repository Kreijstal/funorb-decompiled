/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String field_e;
    static PcmSample[][] field_b;
    static pt field_a;
    static ep field_f;
    static String field_c;
    static int field_d;

    public static void a(byte param0) {
        int var1 = 16 % ((15 - param0) / 50);
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = (PcmSample[][]) null;
        field_f = null;
    }

    final static void a(int param0) {
        lr var1 = null;
        byte[] var3 = null;
        ah var1_ref = null;
        byte[] var4 = null;
        ah var1_refLifetime1;
        byte[] var4Lifetime1;
        if (wl.field_r == null) {
          var1 = new lr();
          var3 = var1.a(128, 128, (byte) -120, 16);
          wl.field_r = sf.a(false, -137, var3);
        }
        if (param0 <= -50) {
          if (null == lg.field_l) {
            var1_ref = new ah();
            var4 = var1_ref.a(128, 16, 128, (byte) 118);
            lg.field_l = sf.a(false, -137, var4);
          }
          return;
        }
        field_e = (String) null;
        if (null == lg.field_l) {
          var1_refLifetime1 = new ah();
          var4Lifetime1 = var1_refLifetime1.a(128, 16, 128, (byte) 118);
          lg.field_l = sf.a(false, -137, var4Lifetime1);
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6) {
            field_c = (String) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = cf.field_h.equals(vu.a(127, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fd.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_int = 1;
          while (param2 > 1) {
            if ((param2 & 1) != 0) {
              var3_int = var3_int * param1;
            }
            param1 = param1 * param1;
            param2 = param2 >> 1;
          }
          if (param2 != param0) {
            stackIn_12_0 = var3_int;
            return stackIn_12_0;
          }
          stackIn_10_0 = var3_int * param1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "fd.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Please check if address is correct";
        field_a = new pt();
        field_c = "Score";
    }
}
