/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends sl {
    static un field_r;
    static String field_s;
    static String field_t;

    final static boolean a(String param0, byte param1) {
        String stackIn_16_2 = null;
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          for (int var2_int = 0; var2_int < param0.length(); var2_int++) {
            int var3 = param0.charAt(var2_int);
            if (!IndexedSpriteState.a((char) var3, 63) &&
              !oj.a((char) var3, (byte) -15)) {
              return true;
            }
          }
          if (param1 <= -103) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var2;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ul.O(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String d(ea param0, int param1) {
        String stackIn_5_2 = null;
        try {
          int var3_int = -91 / ((3 - param1) / 35);
          String stackIn_1_0 = pt.a((byte) -126, param0.field_f.length(), '*');
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("ul.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private ul(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param1) {
          SoftwareRasterizer.clearFramebuffer();
        } else {
          SoftwareRasterizer.b(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, 0, 192);
        }
        if (param2 != -7395) {
          field_t = (String) null;
        }
        si.a(param1, -32106);
    }

    ul(int param0) {
        this(qo.field_b, param0);
    }

    public static void a(byte param0) {
        field_t = null;
        field_r = null;
        int var1 = 11 / ((param0 + 50) / 55);
        field_s = null;
    }

    static {
        field_t = "Service unavailable";
    }
}
