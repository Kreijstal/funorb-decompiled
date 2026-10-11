/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends pu {
    static String[] field_l;

    final static rga a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        rga stackIn_3_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_18_0 = null;
        rga stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = uc.field_j;
            return stackIn_3_0;
          }
          if (63 < var2_int) {
            stackIn_7_0 = rm.field_c;
            return stackIn_7_0;
          }
          if (param1 != 5431) {
            field_l = (String[]) null;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                stackIn_18_0 = cha.field_m;
                return stackIn_18_0;
              }
            } else {
              if (hb.field_i.indexOf(var4) == -1) {
                stackIn_22_0 = cha.field_m;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ol.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_l = null;
        if (param0 > -18) {
          field_l = (String[]) null;
        }
    }

    final static cq a(be param0, boolean param1) {
        RuntimeException var2 = null;
        cq stackIn_2_0 = null;
        cq stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = tw.a(je.b(param0, 100, 96), (byte) -36);
            return stackIn_4_0;
          }
          stackIn_2_0 = (cq) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ol.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = new String[]{"single", "range", "long range", "ranged with splash", "splash", "big splash", "cone", "slash", "charge", "long charge", "jump", "big jump", "bigger splash", "board", "doughnut", "boomerang", "team", "one creature", "board edge", "mid splash", "range splash"};
    }
}
