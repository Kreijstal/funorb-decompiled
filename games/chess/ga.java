/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static java.awt.Image field_a;
    static ag field_b;

    final static boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return kb.field_S;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rh.field_c.a(param0, param1, -2147483648, param5, param2);
        if (param3 != 22478) {
          field_a = (java.awt.Image) null;
        }
        if (tl.field_Fb != null) {
          tl.field_Fb.a(param5, param6, -hf.field_g + param4, param5, param4, 6);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -54) {
          return;
        }
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        if (param1 < 106) {
          return;
        }
        if (0 < cl.field_d) {
          if (null != ch.field_gb) {
            rm.field_R = ch.field_gb.a((byte) 101);
            dn.a(2, (byte) -96);
          } else {
            rm.field_R = fn.a(0, 480, 0, 21, 640, oc.field_l);
          }
          if (rm.field_R != null) {
            ca.a(13369344, rm.field_R);
            var2 = 2;
          } else {
            var2 = 3;
          }
        } else {
          var2 = (vi.a(-3)) ? 0 : 1;
        }
        if (null == ch.field_gb &&
          re.field_r) {
          qh.a(false, param0, var2);
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = -var3 + (var3 << 5) + ai.a((byte) -43, param1.charAt(var4));
          }
          if (param0 < -71) {
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          stackIn_6_0 = -87;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ga.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_b = new ag();
    }
}
