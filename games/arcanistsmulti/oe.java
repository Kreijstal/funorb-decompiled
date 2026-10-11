/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static boolean field_a;
    static int field_b;
    static ll[] field_d;
    static int[] field_c;

    final static int a(int param0, int param1, int param2) {
        if (~param2 != param0) {
          return ub.field_i[param2];
        }
        if (cn.a(113, param1)) {
          return 29;
        }
        return ub.field_i[param2];
    }

    public static void a(int param0) {
        if (param0 <= 119) {
          field_d = (ll[]) null;
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    final static String a(String param0, int param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        wa var7 = null;
        wa var8 = null;
        ab var9 = null;
        CharSequence var10 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!vn.a(var10, param1 - 29140)) {
            stackIn_4_0 = fn.field_h;
            return stackIn_4_0;
          }
          if (jb.field_t != 2) {
            stackIn_8_0 = oo.field_E;
            return stackIn_8_0;
          }
          var8 = im.a(0, param0);
          if (var8 == null) {
            stackIn_12_0 = tj.a(122, new String[]{param0}, rd.field_c);
            return stackIn_12_0;
          }
          vd.field_d.a(var8, 121);
          while (true) {
            var7 = (wa) (vd.field_d.a(param1 ^ 29140));
            if (var7 != null) {
              var7.field_Bb = var7.field_Bb - 1;
              continue;
            }
            break;
          }
          var8.a(true);
          var8.a((byte) 88);
          rc.field_m = rc.field_m - 1;
          if (param1 != 29140) {
            stackIn_19_0 = (String) null;
            return stackIn_19_0;
          }
          var9 = he.field_e;
          var9.b((byte) -48, param2);
          var9.field_g = var9.field_g + 1;
          var5 = var9.field_g;
          var9.f(1, (byte) -118);
          var9.a(param0, 23333);
          var9.b(var9.field_g - var5, (byte) 43);
          stackIn_21_0 = null;
          return (String) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("oe.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = false;
    }
}
