/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ResourceArchive field_b;
    static float[][] field_a;

    public static void a(byte param0) {
        if (param0 <= 0) {
          return;
        }
        field_a = (float[][]) null;
        field_b = null;
    }

    final static hj a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        String stackIn_8_2 = null;
        try {
          java.awt.Frame var8 = kn.a(param0, param2, param5, param4, param3, 29742);
          java.awt.Frame var6 = var8;
          if (var8 == null) {
            return null;
          }
          hj var7 = new hj();
          var7.field_a = var8;
          var7.field_a.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, param1, param2, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          hj stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var6_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("uj.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = new float[][]{new float[]{-0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}};
    }
}
