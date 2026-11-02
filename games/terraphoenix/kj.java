/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj implements WidgetActionListener {
    static String[] field_c;
    static im field_d;
    static vg field_b;
    static String field_a;
    static String field_f;
    static String field_e;

    public final void a(int param0, UiWidget param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var6_int = param2 + param1.x;
          var7 = param1.y + param0;
          ah.a(param1.height, 128, param1.width, var6_int, var7);
          if (param3 != -24381) {
            return;
          }
          var8 = og.field_c[1];
          if (param1 instanceof eb &&
            ((eb) (param1)).field_C) {
            var8.d((-var8.field_q + param1.width >> 1) + (var6_int + 1), var7 + 1 + (-var8.field_u + param1.height >> 1), 256);
          }
          if (!param1.d(-118)) {
            return;
          }
          ed.a(-4 + param1.width, -4 + param1.height, 2 + var7, 52, var6_int + 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("kj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1;
        int var2;
        var2 = Terraphoenix.field_V;
        if (param0 == 95) {
          m.field_e = null;
          fd.field_k = false;
          if (qi.field_b) {
            nb.field_b.l(54);
            return;
          }
          var1 = MouseInputHandler.field_b;
          if (var1 > 0) {
            if (var1 != 1) {
              m.field_e = MessageKeys.a(new String[]{Integer.toString(var1)}, -1, na.field_X);
            } else {
              m.field_e = ol.field_Lb;
            }
            m.field_e = bj.a(new CharSequence[]{(CharSequence) ((Object) m.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mm.field_h)}, (byte) -103);
          }
          nb.field_b.h((byte) -126);
          vj.a(param0 ^ -24476);
          return;
        }
        field_b = (vg) null;
        m.field_e = null;
        fd.field_k = false;
        if (qi.field_b) {
          nb.field_b.l(54);
        } else {
          var1 = MouseInputHandler.field_b;
          if (var1 > 0) {
            if (var1 != 1) {
              m.field_e = MessageKeys.a(new String[]{Integer.toString(var1)}, -1, na.field_X);
            } else {
              m.field_e = ol.field_Lb;
            }
            m.field_e = bj.a(new CharSequence[]{(CharSequence) ((Object) m.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mm.field_h)}, (byte) -103);
          }
          nb.field_b.h((byte) -126);
          vj.a(param0 ^ -24476);
        }
    }

    public static void a(int param0) {
        int var1 = -87 % ((-43 - param0) / 37);
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_a = "Terrain Level:";
        field_d = new im();
        field_e = "Unfortunately we are unable to create an account for you at this time.";
    }
}
