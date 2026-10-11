/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeamRoster {
    static int[][][] field_f;
    private String teamName;
    static RgbSprite field_e;
    static String field_d;
    static String[] field_c;
    static RgbSprite field_g;
    int[] playerIds;
    static String field_h;

    final int getPlayerCount(int obfuscationGuard) {
        if (obfuscationGuard != 16648) {
          field_d = (String) null;
        }
        return this.playerIds.length;
    }

    final static boolean a(int param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -85 / ((param0 + 50) / 45);
        stackIn_4_0 = (MoveAttackRequest.field_z != null) && (kl.field_k == ov.field_g);
        return stackIn_4_0;
    }

    final boolean containsPlayer(int playerId, byte obfuscationGuard) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > -82) {
          return true;
        }
        int[] var7 = this.playerIds;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5 == playerId) {
            return true;
          }
        }
        return false;
    }

    public static void b(int param0) {
        field_g = null;
        field_d = null;
        if (param0 >= -15) {
          TeamRoster.a(62);
        }
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = (int[][][]) null;
    }

    final void a(int param0, Battlefield param1) {
        int var4 = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = this.playerIds;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            param1.b(param0 ^ 10002, var5, true);
          }
          if (param0 != 3) {
            field_g = (RgbSprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("go.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String getTeamName(int obfuscationGuard) {
        if (obfuscationGuard != 3) {
          this.containsPlayer(-128, (byte) 1);
        }
        return this.teamName;
    }

    TeamRoster(String param0, int[] param1) {
        try {
          this.teamName = param0;
          this.playerIds = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"Summon this unit", "Insufficient Mana", "Favour level too low", "Favour level too low and insufficient Mana", "You have not purchased this unit"};
        field_f = new int[][][]{new int[][]{new int[]{-1, 5, -1, -1}}, new int[][]{new int[]{-1, 3, -1, -1}}, new int[][]{new int[]{-1, -1, -1, -1, 1}}, new int[][]{new int[]{-1, 3, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3, 3, -1}}, new int[][]{new int[]{-1, -1, -1, 1, 1, -1}}, new int[][]{new int[]{-1, 3, 3, 3, -1, -1}}, new int[][]{new int[]{-1, 3, 3, 3, -1}}, new int[][]{new int[]{-1, -1, -1, 1}}, new int[][]{new int[]{-1, 3, 3, 3, 3}, new int[]{3, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3, 3, 3, 3}}, new int[][]{new int[]{-1, 3, 3, 3, -1, -1, -1}}, new int[][]{new int[]{-1, 3, 3, 3}}, new int[][]{new int[]{-1, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3}}, new int[][]{new int[]{-1, -1, -1, -1}}, new int[][]{new int[]{3, 3, 3, 3}}};
        field_d = "Please select an option in the '<%0>' row.";
        field_h = "Miracles";
    }
}
