/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static UiPanel field_a;
    static char[] field_b;
    static String field_c;

    public static void clearStaticReferences(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 91) {
          uc.clearStaticReferences(12);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void updateClientPanelStack(byte param0, boolean param1) {
        ie.b(20983, param1);
        if (param0 >= 97) {
          return;
        }
        field_a = (UiPanel) null;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            field_a = (UiPanel) null;
          }
          if (!param1) {
            stackIn_6_0 = mf.field_c.stringWidth(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = gb.field_b.stringWidth(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("uc.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          TriangleRasterizer.useRasterClip();
          bl.field_r = new int[260];
          BlastDebrisModel.field_j = 11;
          if (param0 != 73) {
            uc.updateClientPanelStackWithIntGuard(69, true);
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            bl.field_r[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < bl.field_r.length) {
            bl.field_r[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var1), "uc.B(" + param0 + ')');
        }
    }

    static {
        field_b = new char[]{(char)91, (char)93, (char)35};
        field_c = "Password: ";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void updateClientPanelStackWithIntGuard(int param0, boolean param1) {
        ie.b(20983, param1);
        if (param0 >= 97) {
          return;
        }
        field_a = (UiPanel) null;
    }
}
