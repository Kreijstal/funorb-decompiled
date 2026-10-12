/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellMenuGroup {
    int iconIndex;
    int[] spellIds;
    static RgbSprite[] field_h;
    static int[] field_m;
    int indexInParent;
    String label;
    SpellMenuGroup parent;
    String description;
    static BufferedFile field_b;
    SpellMenuGroup[] children;
    static String field_l;
    static String field_d;
    RgbSprite icon;

    final int drawRadialMenu(int transition, int selectionFade, int horizontalOffset, int obfuscationGuard, TutorialController unusedTutorial, int previousSelection, int selectedChild) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RgbSprite stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_3 = 0;
        RgbSprite stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_61_3;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int angularPhase = 0;
        RuntimeException var8 = null;
        int hoveredSelection = 0;
        int extraRadius = 0;
        int opacity = 0;
        int entryCount = 0;
        int spellIndex = 0;
        int iconX = 0;
        int iconY = 0;
        int branchControl = 0;
        int childIndex = 0;
        branchControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 40) {
            SpellMenuGroup.a(-65);
          }
          angularPhase = transition;
          if (this.children == null) {
            if (null != this.spellIds) {
              angularPhase = angularPhase * this.spellIds.length;
            }
          } else {
            angularPhase = angularPhase * this.children.length;
          }
          hoveredSelection = previousSelection;
          if (0 >= transition) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = 150 * transition >> 8;
          }
          extraRadius = stackIn_11_0;
          if (transition >= 0) {
            stackIn_14_0 = 256;
          } else {
            stackIn_14_0 = transition + 256;
          }
          opacity = stackIn_14_0;
          if (transition <= 0 &&
            this.parent != null) {
            TeamRoster.field_e.f(130 + horizontalOffset, 177, opacity);
            if (transition == 0 &&
              ml.a(212, 165, 20, false)) {
              vi.field_f = fo.a(4800, rr.field_a, new String[]{this.parent.label});
              hoveredSelection = 40;
              TeamRoster.field_e.f(db.a(true, 130 + horizontalOffset), MatchConditionEntry.a(177, (byte) 94), 128);
            }
            this.icon.e(db.a(true, horizontalOffset + 145), MatchConditionEntry.a(192, (byte) 94), opacity);
            km.field_h[1].e(db.a(true, 142 + horizontalOffset), MatchConditionEntry.a(189, (byte) 94), opacity);
          }
          if (null != this.children) {
            entryCount = this.children.length;
            childIndex = 0;
            spellIndex = childIndex;
            while (entryCount > childIndex) {
              if (transition >= 0) {
                iconX = horizontalOffset + 165 + (int)(Math.sin(((double)angularPhase + 256.0 * ((double)childIndex * 6.283185307179586)) / (double)(256 * entryCount)) * (double)(90 + extraRadius));
                iconY = -(int)((double)(extraRadius + 90) * Math.cos(((double)angularPhase + 256.0 * (6.283185307179586 * (double)childIndex)) / (double)(256 * entryCount))) + 212;
              } else {
                if (selectedChild == childIndex) {
                  iconX = horizontalOffset + 165 + (int)((double)((90 * transition >> 8) + 90) * Math.sin(256.0 * ((double)childIndex * 6.283185307179586) / (double)(entryCount * 256)));
                  iconY = 212 - (int)(Math.cos(256.0 * (6.283185307179586 * (double)childIndex) / (double)(entryCount * 256)) * (double)((90 * transition >> 8) + 90));
                } else {
                  iconX = 165 + ((int)(Math.sin(256.0 * ((double)childIndex * 6.283185307179586) / (double)(256 * entryCount)) * (double)(90 + extraRadius)) + horizontalOffset);
                  iconY = -(int)(Math.cos(256.0 * (6.283185307179586 * (double)childIndex) / (double)(256 * entryCount)) * (double)(extraRadius + 90)) + 212;
                }
              }
              if (transition == 0 &&
                ml.a(iconY, iconX, 20, false)) {
                vi.field_f = this.children[childIndex].label;
                hoveredSelection = 50 + childIndex;
                TeamRoster.field_e.f(db.a(true, iconX - 35), MatchConditionEntry.a(iconY - 35, (byte) 94), 128);
              }
              if (transition < 0 &&
                selectedChild == childIndex) {
                TeamRoster.field_e.f(db.a(true, iconX - 35), MatchConditionEntry.a(iconY - 35, (byte) 94), -transition);
              }
              stackIn_57_0 = this.children[childIndex].icon;
              stackIn_57_1 = db.a(true, -20 + iconX);
              stackIn_57_2 = MatchConditionEntry.a(iconY - 20, (byte) 94);
              if (childIndex != selectedChild) {
                stackIn_58_3 = opacity;
              } else {
                stackIn_58_3 = 256;
              }
              ((RgbSprite) (Object) stackIn_57_0).e(stackIn_57_1, stackIn_57_2, stackIn_58_3);
              stackIn_60_0 = km.field_h[1];
              stackIn_60_1 = db.a(true, iconX - 23);
              stackIn_60_2 = MatchConditionEntry.a(-23 + iconY, (byte) 94);
              if (childIndex == selectedChild) {
                stackIn_61_3 = 256;
              } else {
                stackIn_61_3 = opacity;
              }
              ((RgbSprite) (Object) stackIn_60_0).e(stackIn_60_1, stackIn_60_2, stackIn_61_3);
              childIndex++;
            }
          } else {
            if (this.spellIds != null) {
              entryCount = this.spellIds.length;
              for (spellIndex = 0; entryCount > spellIndex; spellIndex++) {
                iconX = 165 + (int)(Math.sin((256.0 * (6.283185307179586 * (double)spellIndex) + (double)angularPhase) / (double)(entryCount * 256)) * (double)(extraRadius + 90)) + horizontalOffset;
                iconY = -(int)((double)(90 + extraRadius) * Math.cos(((double)angularPhase + 6.283185307179586 * (double)spellIndex * 256.0) / (double)(256 * entryCount))) + 212;
                if (0 == transition &&
                  ml.a(iconY, iconX, 20, false)) {
                  vi.field_f = fq.field_f[this.spellIds[spellIndex]];
                  hoveredSelection = 50 + spellIndex;
                  TeamRoster.field_e.f(db.a(true, -35 + iconX), MatchConditionEntry.a(-35 + iconY, (byte) 94), 128);
                }
                if (ev.field_d == this.spellIds[spellIndex]) {
                  TeamRoster.field_e.f(db.a(true, -35 + iconX), MatchConditionEntry.a(iconY - 35, (byte) 94), selectionFade);
                }
                if (this.spellIds[spellIndex] == ab.field_a) {
                  TeamRoster.field_e.f(db.a(true, iconX - 35), MatchConditionEntry.a(iconY - 35, (byte) 94), 256 - selectionFade);
                }
                BattleCharacter.field_h[uc.spellDefinitions[this.spellIds[spellIndex]][2]].g(db.a(true, iconX - 20), MatchConditionEntry.a(-20 + iconY, (byte) 94));
                if (ev.field_d == this.spellIds[spellIndex]) {
                  BattleCharacter.field_h[uc.spellDefinitions[this.spellIds[spellIndex]][2]].f(db.a(true, -20 + iconX), MatchConditionEntry.a(iconY - 20, (byte) 94), selectionFade);
                }
                if (this.spellIds[spellIndex] == ab.field_a) {
                  BattleCharacter.field_h[uc.spellDefinitions[this.spellIds[spellIndex]][2]].f(db.a(true, iconX - 20), MatchConditionEntry.a(iconY - 20, (byte) 94), 256 - selectionFade);
                }
                km.field_h[0].g(db.a(true, -23 + iconX), MatchConditionEntry.a(iconY - 23, (byte) 94));
              }
            }
          }
          stackIn_63_0 = hoveredSelection;
          return stackIn_63_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_66_0 = var8;
          stackIn_66_1 = new StringBuilder().append("rg.A(").append(transition).append(',').append(selectionFade).append(',').append(horizontalOffset).append(',').append(obfuscationGuard).append(',');
          if (unusedTutorial == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(previousSelection).append(',').append(selectedChild).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_l = null;
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 > -57) {
          field_b = (BufferedFile) null;
        }
    }

    SpellMenuGroup(int iconIndex, String label, String description, int[] spellIds) {
        int spellIndex = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.parent = null;
        try {
          this.iconIndex = iconIndex;
          this.icon = BattleCharacter.field_h[iconIndex];
          this.label = label;
          this.spellIds = spellIds;
          this.description = description;
          for (spellIndex = 0; this.spellIds.length > spellIndex; spellIndex++) {
            ct.spellMenuById[this.spellIds[spellIndex]] = this;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rg.<init>(").append(iconIndex).append(',');
          if (label == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (description == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (spellIds == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    SpellMenuGroup(int iconIndex, String label, String description, SpellMenuGroup[] children) {
        int childIndex = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.parent = null;
        try {
          this.iconIndex = iconIndex;
          this.icon = BattleCharacter.field_h[iconIndex];
          this.label = label;
          this.children = children;
          this.description = description;
          for (childIndex = 0; this.children.length > childIndex; childIndex++) {
            this.children[childIndex].parent = this;
            this.children[childIndex].indexInParent = childIndex;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rg.<init>(").append(iconIndex).append(',');
          if (label == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (description == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (children == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_l = "To play a multiplayer game, please log in or create a free account.";
        field_d = "Elixirs";
    }
}
