/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RaiderDefinition {
    cf field_a;
    eh field_u;
    int field_r;
    eh field_t;
    static String[] field_y;
    int field_o;
    eh field_l;
    static String field_i;
    int field_z;
    int field_c;
    int field_s;
    static ae field_h;
    static RgbSprite field_E;
    String field_F;
    int[] field_A;
    static int field_j;
    int field_B;
    int field_w;
    int field_b;
    int field_x;
    int field_m;
    static RgbSprite field_f;
    String field_G;
    String[] field_C;
    String[] field_d;
    cf field_g;
    String[][] field_k;
    cf field_p;
    static String field_n;
    eh field_e;
    static int field_q;
    eh field_v;
    String[][] field_D;

    final static void drawTiledPanelBorder(boolean param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var6 = 0;
        int var8 = DungeonAssault.field_K;
        int var5_int = pi.field_b.field_y;
        jh.c();
        SoftwareRasterizer.setClip(param2, param4, var5_int + param2, param4 + param1);
        for (var6 = 0; var6 < param1; var6 = var6 + pi.field_b.field_v) {
          pi.field_b.drawOpaque(param2, var6 + param4);
        }
        if (!param3) {
          return;
        }
        try {
          if (param0) {
            for (var6 = 0; 8 > var6; var6++) {
              var7 = 192 - 24 * var6;
              SoftwareRasterizer.drawHorizontalLineAlpha(param2, param4 + var6, var5_int, 0, var7);
              SoftwareRasterizer.drawHorizontalLineAlpha(param2, param4 + (param1 - 1 - var6), var5_int, 0, var7);
            }
          }
          jh.b();
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "h.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean hasAbility(int param0, int param1) {
        int var5 = DungeonAssault.field_K;
        if (param0 == this.field_s) {
          return true;
        }
        int var3 = 0;
        int var4 = 70 / ((-8 - param1) / 57);
        while (this.field_A.length > var3) {
          if (this.field_A[var3] == param0) {
            return true;
          }
          var3++;
        }
        return false;
    }

    final static int measureStartupAssetLoadPercent(int param0) {
        if (~dk.field_c > param0) {
          return 0;
        }
        if (hc.field_d != 0) {
          if (null != ia.field_U) {
            if (!ia.field_U.ensureIndexLoaded(-14354)) {
              return 14;
            }
            if (!ia.field_U.hasGroupName("", param0 + 3)) {
              return 29;
            }
            if (!ia.field_U.tryLoadGroupByName(false, "")) {
              return 29;
            }
          }
          if (!InstructionsScreen.field_u.ensureIndexLoaded(-14354)) {
            return 43;
          }
          if (!InstructionsScreen.field_u.tryLoadGroupByName(false, "commonui")) {
            return 57;
          }
          if (!GameAppletShell.field_b.ensureIndexLoaded(-14354)) {
            return 71;
          }
          if (!GameAppletShell.field_b.tryLoadGroupByName(false, "commonui")) {
            return 80;
          }
          if (!ib.field_b.ensureIndexLoaded(-14354)) {
            return 82;
          }
          if (!ib.field_b.tryLoadAllGroups((byte) 59)) {
            return 86;
          }
        } else {
          if (!InstructionsScreen.field_u.ensureIndexLoaded(-14354)) {
            return 20;
          }
          if (!InstructionsScreen.field_u.tryLoadGroupByName(false, "commonui")) {
            return 40;
          }
          if (!GameAppletShell.field_b.ensureIndexLoaded(-14354)) {
            return 50;
          }
          if (!GameAppletShell.field_b.tryLoadGroupByName(false, "commonui")) {
            return 60;
          }
          if (!ib.field_b.ensureIndexLoaded(-14354)) {
            return 70;
          }
          if (!ib.field_b.tryLoadAllGroups((byte) 59)) {
            return 80;
          }
        }
        return 100;
    }

    public static void clearRaiderDefinitionGlobals(byte param0) {
        field_f = null;
        field_h = null;
        field_n = null;
        field_i = null;
        field_y = null;
        field_E = null;
        if (param0 != 16) {
          RaiderDefinition.drawTiledPanelBorder(true, 65, -49, false, 20);
        }
    }

    final static void initializeGameUiAssets(int param0, ResourceArchive param1, ResourceArchive param2, boolean param3, ResourceArchive param4) {
        try {
          im.field_b = oh.a("", -8);
          im.field_b.a(false, false);
          DungeonBuilderScreen.a(param2, 37, param4, param1);
          if (param0 != 8171) {
            RaiderDefinition.clearRaiderDefinitionGlobals((byte) 32);
          }
          qj.a((byte) 102);
          SpriteAnimationPlayer.field_d = sp.field_e;
          ol.field_i = sp.field_e;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "h.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    RaiderDefinition(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        int var13Lifetime1;
        int var11_intLifetime1;
        try {
          this.field_B = param2;
          this.field_m = param5;
          this.field_b = param7;
          this.field_w = param0;
          this.field_z = param1;
          this.field_x = param4;
          this.field_o = param8;
          this.field_c = param3;
          this.field_r = param6;
          this.field_s = -1;
          var11_int = 0;
          for (var12 = 0; var12 < param9.length; var12++) {
            var13 = param9[var12];
            if (ob.field_cc[var13] != 0) {
              if (this.field_s != -1) {
                throw new RuntimeException("Multiple active abilities declared for: " + this.field_w);
              }
              this.field_s = var13;
            } else {
              var11_int++;
            }
          }
          this.field_A = new int[var11_int];
          var11_intLifetime1 = 0;
          for (var12Lifetime1 = 0; param9.length > var12Lifetime1; var12Lifetime1++) {
            var13Lifetime1 = param9[var12Lifetime1];
            if (0 == ob.field_cc[var13Lifetime1]) {
              incrementValue$0 = var11_intLifetime1;
              var11_intLifetime1++;
              this.field_A[incrementValue$0] = var13Lifetime1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_19_0 = var11;
          stackIn_19_1 = new StringBuilder().append("h.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_y = new String[]{"Moving", "To move through the dungeon, simply <col=FF0000>left-click on an unexplored room</col>. Rooms are connected by doors. Rooms that are accessible from the party's current location are <%highlight>outlined with an orange glow</col>.<br><br><%command>Enter a new room now.</col>"};
        field_i = "Monster wins!";
        field_n = "Trolls are found throughout the swamps, making their homes in dank caves. Slow and lumbering, they are nevertheless devastating in combat and nearly impossible to kill.";
        field_h = new ae(1);
    }
}
