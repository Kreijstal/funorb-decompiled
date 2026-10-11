/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rj {
    static ti[] field_a;
    static boolean field_b;

    abstract int a(int param0);

    final static String a(ci param0, byte param1) {
        int var6 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (!param0.a((byte) -123)) {
            stackIn_3_0 = bd.field_r;
            return stackIn_3_0;
          }
          var9 = param0.a(false);
          var2 = var9;
          var3 = param0.b(79, "index");
          var4 = 0;
          var5 = var9;
          if (param1 > -2) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var3 != var7) {
              var4 = var4 + param0.a(true, var7);
            }
          }
          stackIn_14_0 = ne.field_c + " - " + var4 / (-1 + var9.length) + "%";
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("rj.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static h b(boolean param0) {
        if (null == eh.field_e) {
          eh.field_e = new h(al.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, al.field_i.field_y, -1, 2147483647, true);
        }
        if (!param0) {
          rj.b(false);
        }
        return eh.field_e;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_b = false;
        }
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    static {
    }
}
