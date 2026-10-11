/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String[] field_b;
    static int field_a;

    final static void a(int param0, boolean param1) {
        if (param0 >= -15) {
          field_b = (String[]) null;
          im.field_b.a(param1, false);
          return;
        }
        im.field_b.a(param1, false);
    }

    final static void a(String[] args, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        int var3 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var8 = 0;
        String var9 = null;
        var10 = DungeonAssault.field_K;
        try {
          var3 = -88 % ((-51 - param1) / 40);
          var2_int = -1;
          for (var4 = 0; args.length > var4; var4++) {
            var5 = args[var4];
            if (var2_int != -1) {
              args[var4] = jk.a(new String[]{Integer.toString(var2_int, 16)}, "<col=<%0>>", 30496) + var5;
            }
            var6 = en.a(var5, -8634, "<col=");
            var7 = en.a(var5, -8634, "</col>");
            if (var6 > var7) {
              var8 = var5.indexOf('>', var6);
              if (var8 != -1) {
                var9 = var5.substring(5 + var6, var8);
                var2_int = hl.a(-120, (CharSequence) ((Object) var9), 16);
              }
            } else {
              if (var7 != -1) {
                var2_int = -1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ig.B(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        if (param0 <= -25) {
          if (oo.field_d <= 32) {
            sf.d(-110, 0);
          } else {
            var1 = oo.field_d % 32;
            if (var1 == 0) {
              var1 = 32;
            }
            sf.d(62, -var1 + oo.field_d);
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -2898) {
          ig.b(-47);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (null == dd.field_E) {
          if (param0 == 31131) {
            return 0;
          }
          field_a = 4;
          return 0;
        }
        if (dd.field_E.field_w) {
          var1 = of.field_l + 20;
          var2 = var1 - 452;
          return var2 * dd.field_E.field_F / dd.field_E.field_G;
        }
        if (param0 == 31131) {
          return 0;
        }
        field_a = 4;
        return 0;
    }

    static {
    }
}
