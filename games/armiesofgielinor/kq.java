/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kq extends fw {
    static int field_L;
    private Widget field_Q;
    static QuickChatCommandDefinition field_M;
    static je field_N;
    static RgbSprite field_P;

    final static String getSpellConfirmationPrompt(int tileY, int obfuscationGuard, int spellId, Battlefield battlefield, int tileX) {
        String[] array$0 = null;
        String[] array$1 = null;
        String[] array$2 = null;
        Object stackIn_7_0 = null;
        int stackIn_13_0;
        String stackIn_13_1;
        String[] stackIn_13_2;
        String[] stackIn_13_3;
        int stackIn_13_4;
        String stackIn_14_5 = null;
        int stackIn_16_4;
        String stackIn_17_5;
        String stackIn_18_0 = null;
        int stackIn_29_0;
        String stackIn_29_1;
        String[] stackIn_29_2;
        String[] stackIn_29_3;
        int stackIn_29_4;
        String stackIn_30_5 = null;
        int stackIn_32_4;
        String stackIn_33_5;
        String stackIn_34_0 = null;
        int stackIn_41_0;
        String stackIn_41_1;
        String[] stackIn_41_2;
        String[] stackIn_41_3;
        int stackIn_41_4;
        String stackIn_42_5 = null;
        int stackIn_44_4;
        String stackIn_45_5;
        String stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        Unit var7 = null;
        Unit var8 = null;
        int var6Lifetime1;
        int var6Lifetime2;
        try {
          if (obfuscationGuard != 7) {
            field_N = (je) null;
          }
          if (uc.spellDefinitions[spellId][3] != 0) {
            return null;
          }
          var7 = battlefield.getUnitAt(tileY, true, tileX);
          var8 = var7;
          if (var8 == null) {
            stackIn_7_0 = null;
            return (String) (stackIn_7_0);
          }
          if (uc.spellDefinitions[spellId][4] == 1 &&
            var8.getEquipmentId((byte) 81) > 0) {
            var6 = UiSelectionState.field_e[var7.getEquipmentId((byte) 81)][var7.getEquipmentCategory(20640)];
            array$0 = new String[3];
            stackIn_13_0 = 4800;
            stackIn_13_1 = rb.field_c;
            stackIn_13_2 = array$0;
            stackIn_13_3 = array$0;
            stackIn_13_4 = 1;
            if (og.field_m != 1) {
              stackIn_14_5 = fq.field_f[spellId].toLowerCase();
            } else {
              stackIn_14_5 = fq.field_f[spellId];
            }
            stackIn_13_3[stackIn_13_4] = stackIn_14_5;
            stackIn_16_4 = 2;
            if (og.field_m != 1) {
              stackIn_17_5 = fq.field_f[var6].toLowerCase();
            } else {
              stackIn_17_5 = fq.field_f[var6];
            }
            stackIn_13_2[stackIn_16_4] = stackIn_17_5;
            stackIn_18_0 = fo.a(stackIn_13_0, stackIn_13_1, stackIn_13_2);
            return stackIn_18_0;
          }
          if (uc.spellDefinitions[spellId][4] == 0 &&
            0 != var8.statusEffectType) {
            var6Lifetime1 = PaletteRegionMap.field_f[var7.statusEffectType];
            if (7 != var8.statusEffectType &&
              var8.statusEffectType != 8) {
              var6Lifetime1 = var6Lifetime1 + (-1 + var8.statusEffectValue);
            }
            array$1 = new String[3];
            stackIn_29_0 = 4800;
            stackIn_29_1 = oo.field_o;
            stackIn_29_2 = array$1;
            stackIn_29_3 = array$1;
            stackIn_29_4 = 1;
            if (og.field_m == 1) {
              stackIn_30_5 = fq.field_f[spellId];
            } else {
              stackIn_30_5 = fq.field_f[spellId].toLowerCase();
            }
            stackIn_29_3[stackIn_29_4] = stackIn_30_5;
            stackIn_32_4 = 2;
            if (og.field_m == 1) {
              stackIn_33_5 = fq.field_f[var6Lifetime1];
            } else {
              stackIn_33_5 = fq.field_f[var6Lifetime1].toLowerCase();
            }
            stackIn_29_2[stackIn_32_4] = stackIn_33_5;
            stackIn_34_0 = fo.a(stackIn_29_0, stackIn_29_1, stackIn_29_2);
            return stackIn_34_0;
          }
          if (uc.spellDefinitions[spellId][4] != 3) {
            stackIn_48_0 = null;
            return (String) (stackIn_48_0);
          }
          if (var8.accessoryType == 0) {
            return null;
          }
          var6Lifetime2 = bw.field_f[var7.accessoryType];
          array$2 = new String[3];
          stackIn_41_0 = 4800;
          stackIn_41_1 = io.field_u;
          stackIn_41_2 = array$2;
          stackIn_41_3 = array$2;
          stackIn_41_4 = 1;
          if (og.field_m == 1) {
            stackIn_42_5 = fq.field_f[spellId];
          } else {
            stackIn_42_5 = fq.field_f[spellId].toLowerCase();
          }
          stackIn_41_3[stackIn_41_4] = stackIn_42_5;
          stackIn_44_4 = 2;
          if (og.field_m == 1) {
            stackIn_45_5 = fq.field_f[var6Lifetime2];
          } else {
            stackIn_45_5 = fq.field_f[var6Lifetime2].toLowerCase();
          }
          stackIn_41_2[stackIn_44_4] = stackIn_45_5;
          stackIn_46_0 = fo.a(stackIn_41_0, stackIn_41_1, stackIn_41_2);
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_51_0 = var5;
          stackIn_51_1 = new StringBuilder().append("kq.G(").append(tileY).append(',').append(obfuscationGuard).append(',').append(spellId).append(',');
          if (battlefield == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(tileX).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        lw.field_mb = param4;
        jg.field_k = param0;
        cn.field_o = param1;
        ia.field_g = param3;
        if (param2 != 87) {
          Battlefield var6 = (Battlefield) null;
          kq.getSpellConfirmationPrompt(-11, 19, 8, (Battlefield) null, -83);
        }
    }

    kq(Widget param0) {
        try {
          this.field_Q = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_P = null;
        field_N = null;
        int var1 = 126 % ((param0 + 59) / 34);
        field_M = null;
    }

    final static void enterTaggedPayload(int headerBitPosition, int obfuscationGuard, int headerBitLength, int payloadBitLength, CipherPacketBuffer packet) {
        int var5_int = 0;
        if (payloadBitLength <= headerBitLength) {
          packet.setReadBitPosition((byte) -88, headerBitPosition + headerBitLength);
          return;
        }
        packet.setReadBitPosition((byte) -40, payloadBitLength + headerBitPosition);
        if (obfuscationGuard != -24232) {
          return;
        }
        try {
          var5_int = packet.readBits(-99, headerBitLength);
          packet.setWriteBitPosition(headerBitPosition, (byte) 0);
          packet.writeBits(-16807, headerBitLength, var5_int);
          packet.setReadBitPosition((byte) -73, headerBitPosition);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kq.E(" + headerBitPosition + ',' + obfuscationGuard + ',' + headerBitLength + ',' + payloadBitLength + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, Widget param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            field_L = 76;
          }
          stackIn_3_0 = this.field_Q.a(param0 + 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kq.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 != param0.length()) {
            return false;
          }
          if (param1) {
            var3 = (String) null;
            kq.a((String) null, true);
          }
          var2 = db.a(true, ' ');
          if (!param0.equals(var2)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("kq.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_L = 0;
        field_M = new QuickChatCommandDefinition(15, 0, 1, 0);
        field_P = new RgbSprite(270, 70);
    }
}
