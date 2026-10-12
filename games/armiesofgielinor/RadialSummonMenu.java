/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RadialSummonMenu {
    private int itemCount;
    private RadialSummonItem[] items;
    static boolean field_e;
    static String field_a;
    private int layoutRadius;
    static int field_d;

    final static te a(byte param0, PcmSample param1) {
        RuntimeException var2 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = MapTile.a(-69, aa.a(param1, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (te) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ub.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean isSecondHalfHit(byte obfuscationGuard, int pointerY, int originY, int originX, int pointerX) {
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var6 = 0;
        if (obfuscationGuard != 117) {
          PcmSample var8 = (PcmSample) null;
          RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(7, (PcmSample) null);
        }
        while (this.itemCount > var6) {
          if (this.items[var6].containsPoint(42, pointerX, originY, originX, pointerY)) {
            return this.itemCount >> 1 < var6 ? true : false;
          }
          var6++;
        }
        return false;
    }

    final int getChoiceAtPoint(byte obfuscationGuard, int pointerY, int originX, int pointerX, int originY) {
        int itemOrdinal = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard >= -92) {
          field_d = 33;
        }
        for (itemOrdinal = 0; this.itemCount > itemOrdinal; itemOrdinal++) {
          if (this.items[itemOrdinal].containsPoint(71, pointerX, originY, originX, pointerY)) {
            return this.items[itemOrdinal].choiceId;
          }
        }
        return -1;
    }

    final void draw(int mana, int obfuscationGuard, int[] godFavourLevels, int originX, int originY) {
        int var7 = 0;
        RadialSummonItem stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = godFavourLevels[6];
          for (var7 = 0; this.itemCount > var7; var7++) {
            if (!this.items[var7].unitChoice) {
              if (this.items[var7].godGroupId == 0) {
                this.items[var7].draw(var6_int, originY + 16, false, originX + 16);
              } else {
                this.items[var7].draw(godFavourLevels[-1 + this.items[var7].godGroupId], originY + 16, false, originX + 16);
              }
            } else {
              if (-1 != bw.unitDefinitions[this.items[var7].choiceId][1]) {
                var6_int = godFavourLevels[bw.unitDefinitions[this.items[var7].choiceId][1]];
              }
              stackIn_9_0 = this.items[var7];
              if (mana >= bw.unitDefinitions[this.items[var7].choiceId][8] &&
                var6_int >= bw.unitDefinitions[this.items[var7].choiceId][2]) {
                stackIn_10_1 = 1;
              } else {
                stackIn_10_1 = 0;
              }
              ((RadialSummonItem) (Object) stackIn_9_0).draw(stackIn_10_1, 16 + originY, false, originX + 16);
            }
          }
          if (obfuscationGuard != -23451) {
            this.isSecondHalfHit((byte) 112, 3, 116, -86, -110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ub.E(").append(mana).append(',').append(obfuscationGuard).append(',');
          if (godFavourLevels == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(originX).append(',').append(originY).append(')').toString());
        }
    }

    final static String a(byte param0, int param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 > param1 ||
          param1 >= 3) {
          return "Unkown Campaign " + param1;
        }
        String var2 = "";
        if (param0 < 19) {
          return (String) null;
        }
        for (var3 = 0; var3 < cd.campaigns[param1].missions.length; var3++) {
          var2 = var2 + var3 + ": " + cd.campaigns[param1].missions[var3].name + "\n";
        }
        return var2;
    }

    final RadialSummonItem getItemByChoiceId(int choiceId, int obfuscationGuard) {
        int itemOrdinal;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        itemOrdinal = 0;
        if (obfuscationGuard != -15050) {
          field_a = (String) null;
        }
        while (itemOrdinal < this.itemCount) {
          if (choiceId == this.items[itemOrdinal].choiceId) {
            return this.items[itemOrdinal];
          }
          itemOrdinal++;
        }
        return null;
    }

    final static void a(boolean param0, boolean param1) {
        ij.field_w = !param1 ? new CommunityTabGroup(ob.field_O, eb.field_c) : new CommunityTabGroup(TeleportAction.field_x, uj.field_l);
        if (param0) {
          return;
        }
        lk.field_a = new ClientUiComponent(0L, (ClientUiComponent) null);
        lk.field_a.addChild(ij.field_w.tabs, 126);
        lk.field_a.addChild(SocialListPanel.field_Lb, 97);
        ta.field_R = new ClientUiComponent(0L, ArchiveIndex.field_b);
        df.field_K = new ClientUiComponent(0L, (ClientUiComponent) null);
        ta.field_R.addChild(bk.field_f, 54);
        ta.field_R.addChild(df.field_K, 70);
        df.field_K.addChild(IconTextComponent.field_Kb, 112);
        df.field_K.addChild(dv.field_m, 74);
        ClientUiComponent.a(27, param1);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -122) {
          field_a = (String) null;
        }
    }

    RadialSummonMenu(int layoutRadius, RadialSummonItem[] items, boolean clockwise) {
        int itemOrdinal = 0;
        RadialSummonItem stackIn_5_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.itemCount = items.length;
          this.layoutRadius = layoutRadius;
          this.items = items;
          for (itemOrdinal = 0; itemOrdinal < this.itemCount; itemOrdinal++) {
            stackIn_5_0 = this.items[itemOrdinal];
            if (!clockwise) {
              stackIn_6_1 = -1;
            } else {
              stackIn_6_1 = 1;
            }
            stackIn_5_0.offsetX = stackIn_6_1 * (int)(Math.sin(2.0 * (3.141592653589793 * (double)itemOrdinal) / (double)this.itemCount) * (double)this.layoutRadius);
            this.items[itemOrdinal].offsetY = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)itemOrdinal) / (double)this.itemCount) * (double)this.layoutRadius);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ub.<init>(").append(layoutRadius).append(',');
          if (items == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(clockwise).append(')').toString());
        }
    }

    final static EventPresenter a(GameEvent param0, Battlefield param1, boolean param2, int param3, GameplayController param4, int param5, int param6, BattleUnitRenderer param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        EventPresenter var9 = null;
        Object stackIn_2_0 = null;
        EventPresenter stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -39 / ((-87 - param5) / 33);
          var9 = new EventPresenter(param4, param1, param7, param0, param6, param3, param2);
          if (var9.b(param6, param3, true)) {
            stackIn_4_0 = var9;
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (EventPresenter) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ub.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = "Portal";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static te $cfr$intArgs$a$6d836999ad61(int param0, PcmSample param1) {
        RuntimeException var2 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = MapTile.a(-69, aa.a(param1, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (te) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ub.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }
}
