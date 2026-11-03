/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int[] field_a;
    static String field_c;
    static qr field_b;
    static qr field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -50) {
          return;
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static MenuList a(ListContent param0, Player[] param1, int param2, Player param3) {
        int var8_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kb var6 = null;
        SpriteButton var7 = null;
        SpriteButton var8 = null;
        SpriteButton var9 = null;
        int var10 = 0;
        MenuList var11 = null;
        MenuList stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var11 = new MenuList(0, 0, 182, ClientException.field_a);
          var11.field_h = param3;
          var5 = 0;
          for (var5Lifetime1 = 0; param0.field_h.length > var5Lifetime1; var5Lifetime1++) {
            if (param0.field_h[var5Lifetime1] != null) {
              continue;
            }
            param0.field_h[var5Lifetime1] = var11;
            break;
          }
          var6 = new kb(3 * IntrusiveDeque.field_a[param3.field_x].field_z / 4, -(rs.field_Cb.field_J / 2) + var11.field_i / 2, -(3 * IntrusiveDeque.field_a[param3.field_x].field_z / 4) + 182, param3.field_k, param3.name, 16777215, true);
          var11.addChild(var6, param2 ^ 10);
          bg.a(-2612, param1.length);
          var7 = new SpriteButton(3 * IntrusiveDeque.field_a[param3.field_x].field_z / 4, var11.field_i / 2 + rs.field_Cb.field_J / 2 + 3, BattleContribution.a(-1, false));
          var11.addChild(var7, 8);
          param0.field_f[var5Lifetime1][0] = var7;
          for (var8_int = 1; param1.length - 1 > var8_int; var8_int++) {
            var9 = new SpriteButton(IntrusiveDeque.field_a[param3.field_x].field_z + var8_int * (2 + GameState.field_F.field_z), 3 + rs.field_Cb.field_J / 2 + var11.field_i / 2, wm.a(-1, 0));
            var11.addChild(var9, 8);
            param0.field_f[var5Lifetime1][var8_int] = var9;
          }
          var8 = new SpriteButton(0, (-IntrusiveDeque.field_a[param3.field_x].field_w + var11.field_i) / param2, IntrusiveDeque.field_a[param3.field_x]);
          var11.addChild(var8, 8);
          stackIn_10_0 = var11;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("nl.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
