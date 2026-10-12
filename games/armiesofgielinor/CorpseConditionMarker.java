/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CorpseConditionMarker extends PreparedAction {
    static RgbSprite field_v;
    static vk field_u;
    static String[] field_s;
    static String field_t;
    static ResourceArchive field_w;
    static String field_x;

    final static void a(int param0, boolean param1) {
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        if (kd.field_X < 0) {
          Widget.field_n = 0;
          dd.field_e = 0;
          return;
        }
        dd.field_e = dd.field_e + Widget.field_n;
        if (dd.field_e < 0) {
          dd.field_e = 0;
          Widget.field_n = 0;
        }
        if (param0 != -28309) {
          field_u = (vk) null;
        }
        if (uk.field_q < dd.field_e &&
          -1 < uk.field_q) {
          dd.field_e = uk.field_q;
          Widget.field_n = 0;
        } else {
          if (uk.field_q == -1) {
            dd.field_e = 0;
          }
        }
        if (param1 &&
          Widget.field_n != 0) {
          stackIn_19_0 = Widget.field_n;
          stackIn_20_1 = (Widget.field_n > 0) ? -1 : 1;
          Widget.field_n = stackIn_19_0 + stackIn_20_1;
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int[] param4) {
        int var10 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 < param0) {
            var5_int = (param0 + param1) / 2;
            var6 = param1;
            var7 = param3[var5_int];
            param3[var5_int] = param3[param0];
            param3[param0] = var7;
            var8 = param4[var5_int];
            param4[var5_int] = param4[param0];
            param4[param0] = var8;
            stackIn_6_0 = (2147483647 != var7) ? 1 : 0;
            var9 = stackIn_6_0;
            for (var10 = param1; var10 < param0; var10++) {
              if (param3[var10] > (-(var9 & var10) + var7)) {
                var11 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6] = var11;
                var12 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6++] = var12;
              }
            }
            param3[param0] = param3[var6];
            param3[var6] = var7;
            param4[param0] = param4[var6];
            param4[var6] = var8;
            CorpseConditionMarker.a(-1 + var6, param1, (byte) -127, param3, param4);
            CorpseConditionMarker.a(param0, 1 + var6, (byte) -127, param3, param4);
          }
          if (param2 != -127) {
            field_w = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("dk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != 64) {
            int[] var4 = (int[]) null;
            CorpseConditionMarker.a(12, -29, (byte) 33, (int[]) null, (int[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dk.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    CorpseConditionMarker(int actingPlayer, int playerCount) {
        this.actingPlayer = actingPlayer;
        this.playerFlags = new int[playerCount];
        this.playerFlags[this.actingPlayer] = 1024;
    }

    public static void a(boolean param0) {
        field_u = null;
        field_s = null;
        field_t = null;
        field_x = null;
        field_v = null;
        field_w = null;
        if (!param0) {
          field_s = (String[]) null;
        }
    }

    static {
        field_s = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_u = new vk();
        field_t = "Game options changed (<%0>)";
        field_x = "Prestige";
    }
}
