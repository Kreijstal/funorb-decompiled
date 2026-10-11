/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_b;
    static int[] field_d;
    static cm field_f;
    static cm field_e;
    static boolean field_g;
    static int field_c;
    static int field_a;
    static String field_h;

    final static void a(int param0, pn param1, java.awt.Frame param2) {
        wj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        java.awt.Frame var5 = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          while (true) {
            var3 = param1.a(param2, -1463474960);
            while (var3.field_a == 0) {
              a.a((byte) 121, 10L);
            }
            if (var3.field_a != 1) {
              a.a((byte) 118, 100L);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          param2.dispose();
          if (param0 == -1) {
            return;
          }
          var5 = (java.awt.Frame) null;
          ok.a(27, (pn) null, (java.awt.Frame) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ok.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        nm.a((String) null, param0, param1, 12);
        int var3 = -36 % ((param2 + 22) / 36);
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        if (param1 > 33) {
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
        byte[] var3 = (byte[]) null;
        ok.a(-16, (byte[]) null, 9, (byte) -15);
        var2 = var2 | var2 >>> 16;
        return param0 & ~var2;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0) {
          field_b = null;
          field_h = null;
          return;
        }
        field_d = (int[]) null;
        field_b = null;
        field_h = null;
    }

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        byte[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (param3 != 109) {
            var7 = (byte[]) null;
            ok.a(-97, (byte[]) null, -1, (byte) -92);
          }
          var4_int = -1;
          for (var5 = param0; param2 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ kh.field_r[255 & (var4_int ^ param1[var5])];
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ok.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "Report abuse";
        field_h = "Invite";
    }
}
