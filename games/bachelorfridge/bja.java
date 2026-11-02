/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bja extends BoardChange {
    static String field_m;
    static String field_n;
    static byte[] field_o;
    static String field_p;

    public static void releaseStatics(int param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 != -10744) {
          field_m = (String) null;
        }
    }

    public bja() {
        this.field_j = 6;
    }

    final void a(boolean param0, BattleState param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        BattleState stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          stackIn_3_0 = (BattleState) (param1);
          stackIn_4_1 = (param0);
          stackIn_3_0.field_l = stackIn_4_1;
          for (var3_int = 0; param1.width > var3_int; var3_int++) {
            for (var4 = 0; var4 < param1.height; var4++) {
              if (param1.field_L.field_o[var3_int][var4].terrain == 1) {
                param1.tiles[var3_int][var4].field_i = true;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bja.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(BoardChangeAnimation param0, int param1) {
        try {
          param0.addChild(27799, new mi(param0.field_o, this));
          if (param1 >= -2) {
            Sprite var4 = (Sprite) null;
            bja.a((Sprite) null, 59, 82);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bja.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bja(PacketBuffer param0) {
        try {
          this.field_j = 6;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Sprite param0, int param1, int param2) {
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Sprite var4 = null;
        Sprite var5 = null;
        Sprite[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        IndexedSprite var12 = null;
        int[] var16 = null;
        var11 = BachelorFridge.field_y;
        try {
          var12 = BagpipeSpecial.a(IterableNodeHashTable.field_a, param1 ^ -7, "basic", "fridge_rust");
          var4 = FullHealEvent.a("fridge_drips", IterableNodeHashTable.field_a, "basic", (byte) -107);
          var5 = FullHealEvent.a("fridge_muck", IterableNodeHashTable.field_a, "basic", (byte) -107);
          ld.a(gla.field_j, var4, var5, var12, param2, param0, (byte) 27);
          if (param1 != 6) {
            return;
          }
          if (300 > ep.field_m) {
            kaa.field_l = gw.a("basic", "freezer_clean", IterableNodeHashTable.field_a, param1 ^ -108);
            var6 = gw.a("basic", "freezer_dirty", IterableNodeHashTable.field_a, param1 - 68);
            var7 = SoftwareRasterizer.field_i;
            var8 = SoftwareRasterizer.field_c;
            var16 = SoftwareRasterizer.field_e;
            for (var10 = 0; kaa.field_l.length > var10; var10++) {
              kaa.field_l[var10].normalizeCanvas();
              kaa.field_l[var10].b();
              var6[var10].a(0, 0, ep.field_m * 255 / 300);
              kaa.field_l[var10].trimTransparentBorders();
            }
            SoftwareRasterizer.setTarget(var16, var7, var8);
            return;
          }
          kaa.field_l = gw.a("basic", "freezer_dirty", IterableNodeHashTable.field_a, -49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bja.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_n = "***Resist!***";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = "You cannot join this game - it is in progress";
    }
}
