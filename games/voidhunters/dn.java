/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends rqa {
    static float[] field_o;
    static int field_p;
    static dfa field_r;
    static int field_q;

    final static boolean a(tv[] param0, boolean param1, int param2, tv[] param3, int param4) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var5_int = 88 / ((param4 - 60) / 55);
          if (param3 == null) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = param3.length;
          }
          var6 = stackIn_4_0;
          if (param0 == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param0.length;
          }
          var7 = stackIn_7_0;
          if (var6 != var7) {
            return true;
          }
          for (var8 = 0; var8 < var6; var8++) {
            boolean decompiledFrameRemainder0 = true;
            if (param3[var8] == null) {
              decompiledFrameRemainder0 = (null != param0[var8]);
            } else {
              if ((param0[var8] != null && (!param1 ||
                param0[var8].getClass() == param3[var8].getClass())) &&
                (decompiledFrameRemainder0 = !(!la.a(param0[var8], param3[var8], param2, (byte) -86)))) {
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("dn.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(129, 62, param0[0].a(44));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 1 % ((param0 - 59) / 42);
        field_r = null;
        field_o = null;
    }

    dn(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_q = 49;
    }
}
