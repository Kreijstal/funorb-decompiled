/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialLayout {
    private int[] bottomY;
    private int[] itemSpacing;
    private int[] leftX;
    private int[] topY;
    static String field_c;
    private int[] rightX;
    static RgbSprite field_b;
    static int[] field_g;

    final int getRightX(byte obfuscationGuard, int stage) {
        int var3 = -102 / ((obfuscationGuard - 44) / 42);
        return this.rightX[stage] + (-640 + so.field_b.field_a >> 1);
    }

    final int getTopY(int stage, byte obfuscationGuard) {
        if (obfuscationGuard <= -100) {
          return this.topY[stage] + (so.field_b.field_g - 480 >> 1);
        }
        field_c = (String) null;
        return this.topY[stage] + (so.field_b.field_g - 480 >> 1);
    }

    final void setRightX(int obfuscationGuard, int screenX, int stage) {
        int var4 = 120 / ((obfuscationGuard + 93) / 33);
        this.rightX[stage] = this.rightX[stage] + (screenX - this.getRightX((byte) -125, stage));
    }

    final void setStageLayout(int rightX, int bottomY, byte obfuscationGuard, int topY, int leftX, int itemSpacing, int stage) {
        this.leftX[stage] = leftX;
        this.rightX[stage] = rightX;
        this.topY[stage] = topY;
        this.itemSpacing[stage] = itemSpacing;
        this.bottomY[stage] = bottomY;
        if (obfuscationGuard != 18) {
          this.setStageLayout(-45, 80, (byte) -101, -37, -18, -104, -117);
        }
    }

    final int getLeftX(int stage, int obfuscationGuard) {
        if (obfuscationGuard == 29) {
          return (-640 + so.field_b.field_a >> 1) + this.leftX[stage];
        }
        PacketBuffer var4 = (PacketBuffer) null;
        TutorialLayout.readSpell(-13, (PacketBuffer) null, 83);
        return (-640 + so.field_b.field_a >> 1) + this.leftX[stage];
    }

    final void setLeftX(int obfuscationGuard, int screenX, int stage) {
        if (obfuscationGuard == -1) {
          this.leftX[stage] = this.leftX[stage] + (-this.getLeftX(stage, 29) + screenX);
          return;
        }
    }

    final static Spell readSpell(int actingPlayer, PacketBuffer packet, int obfuscationGuard) {
        GlobalSpell stackIn_16_0 = null;
        ActionSpell stackIn_21_0 = null;
        GlobalSpell stackIn_23_0 = null;
        UnitSpell stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int spellId = 0;
        RuntimeException var3 = null;
        int spellKind = 0;
        int var5 = 0;
        PacketBuffer var6 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 4368051) {
            var6 = (PacketBuffer) null;
            TutorialLayout.readSpell(-35, (PacketBuffer) null, 62);
          }
          spellId = packet.readUnsignedShort((byte) -104);
          spellKind = uc.spellDefinitions[spellId][3];
          if (spellKind == 4) {
            stackIn_16_0 = new GlobalSpell(spellId);
            return (Spell) ((Object) stackIn_16_0);
          }
          if (spellKind != 0 &&
            spellKind != 1 &&
            spellKind != 2 &&
            8 != spellKind &&
            3 != spellKind &&
            spellKind != 5 &&
            6 != spellKind &&
            7 != spellKind) {
            return null;
          }
          if (uc.spellDefinitions[spellId][4] != 5) {
            stackIn_25_0 = new UnitSpell(spellId, packet.readUnsignedByte(obfuscationGuard ^ 4368051), packet.readUnsignedByte(0));
            return (Spell) ((Object) stackIn_25_0);
          }
          if (actingPlayer > -1) {
            stackIn_21_0 = new ActionSpell(spellId, new MoveAttackRequest(packet, actingPlayer));
            return (Spell) ((Object) stackIn_21_0);
          }
          stackIn_23_0 = new GlobalSpell(spellId);
          return (Spell) ((Object) stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("bo.J(").append(actingPlayer).append(',');
          if (packet == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 4368051) {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
        TutorialLayout.a(false);
        field_g = null;
        field_c = null;
        field_b = null;
    }

    final int getItemSpacing(int stage, byte obfuscationGuard) {
        int var3 = -53 % ((45 - obfuscationGuard) / 61);
        return this.itemSpacing[stage];
    }

    final void setTopY(int screenY, int stage, byte obfuscationGuard) {
        if (obfuscationGuard > 118) {
          this.topY[stage] = this.topY[stage] + (screenY - this.getTopY(stage, (byte) -108));
          return;
        }
        this.bottomY = (int[]) null;
        this.topY[stage] = this.topY[stage] + (screenY - this.getTopY(stage, (byte) -108));
    }

    final static void a(boolean param0) {
        tp.field_e = new NodeDeque();
        if (!param0) {
          field_b = (RgbSprite) null;
        }
    }

    final int getBottomY(int obfuscationGuard, int stage) {
        if (obfuscationGuard == -6) {
          return (so.field_b.field_g - 480 >> 1) + this.bottomY[stage];
        }
        this.setRightX(-40, 11, -54);
        return (so.field_b.field_g - 480 >> 1) + this.bottomY[stage];
    }

    TutorialLayout() {
        this.leftX = new int[29];
        this.itemSpacing = new int[29];
        this.topY = new int[29];
        this.bottomY = new int[29];
        this.rightX = new int[29];
    }

    static {
        field_c = "<%0> / <%1> (+<%2>) - Victory in <%3> turns";
        field_g = new int[]{12303291, 740023, 12521488, 8495921, 4368051, 5132314, 10573849};
    }
}
