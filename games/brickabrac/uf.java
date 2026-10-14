/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int pendingJoinRequestCount;
    static ResourceArchive field_a;
    static boolean[] enabledCommonPackets;
    static int field_b;
    static RgbSprite field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 85) {
          return;
        }
        field_e = null;
        enabledCommonPackets = null;
    }

    final static boolean b(int param0, int param1) {
        boolean stackIn_26_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_64_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_103_0 = false;
        boolean stackIn_114_0 = false;
        boolean stackIn_127_0 = false;
        boolean stackIn_138_0 = false;
        if (param0 > -84) {
          return true;
        }
        if (IntArrayRequest.heldKeys[82]) {
          return false;
        }
        if (IntArrayRequest.heldKeys[86]) {
          return false;
        }
        if (param1 >= 16) {
          if (param1 <= 27) {
            return true;
          }
          if (param1 < 32) {
            stackIn_26_0 = ((!(param1 < 48) &&
              !(58 < param1)) ||
              (!(param1 < 64) &&
              !(73 < param1)) ||
              (param1 == 80 ||
              param1 == 83 ||
              param1 == 84 ||
              85 == param1 ||
              param1 == 59 ||
              74 == param1 ||
              28 == param1));
            return stackIn_26_0;
          }
          boolean decompiledFrameRemainder3 = true;
          if (param1 > 43 && ((param1 < 48 ||
            58 < param1) &&
            (param1 < 64 ||
            73 < param1)) && (param1 != 80 &&
            param1 != 83 &&
            param1 != 84 &&
            85 != param1 &&
            param1 != 59 &&
            74 != param1 &&
            28 != param1)) {
            stackIn_44_0 = false;
            decompiledFrameRemainder3 = false;
          }
          else {
            stackIn_44_0 = true;
          }
          return stackIn_44_0;
        }
        if (param1 >= 32) {
          if (param1 <= 43) {
            return true;
          }
          if (param1 >= 48) {
            if (58 >= param1) {
              return true;
            }
            stackIn_64_0 = ((!(param1 < 64) &&
              !(73 < param1)) ||
              (param1 == 80 ||
              param1 == 83 ||
              param1 == 84 ||
              85 == param1 ||
              param1 == 59 ||
              74 == param1 ||
              28 == param1));
            return stackIn_64_0;
          }
          boolean decompiledFrameRemainder2 = true;
          if (param1 < 64) {
            if (param1 != 80 &&
              param1 != 83 &&
              param1 != 84 &&
              85 != param1 &&
              param1 != 59 &&
              74 != param1) {
              if (28 == param1) {
                return true;
              }
              stackIn_88_0 = false;
              decompiledFrameRemainder2 = false;
            }
          } else {
            if (73 < param1) {
              if (param1 != 80 &&
                param1 != 83 &&
                param1 != 84 &&
                85 != param1 &&
                param1 != 59 &&
                74 != param1) {
                if (28 == param1) {
                  return true;
                }
                stackIn_77_0 = false;
              } else {
                stackIn_77_0 = true;
              }
              return stackIn_77_0;
            }
          }
          if (decompiledFrameRemainder2) {
            stackIn_88_0 = true;
          }
          return stackIn_88_0;
        }
        boolean decompiledFrameRemainder1 = true;
        if (param1 < 48) {
          if (param1 < 64) {
            if (param1 != 80 &&
              param1 != 83 &&
              param1 != 84 &&
              85 != param1 &&
              param1 != 59 &&
              74 != param1) {
              if (28 == param1) {
                return true;
              }
              stackIn_138_0 = false;
              decompiledFrameRemainder1 = false;
            }
          } else {
            if (73 < param1) {
              if (param1 != 80 &&
                param1 != 83 &&
                param1 != 84 &&
                85 != param1 &&
                param1 != 59 &&
                74 != param1) {
                if (28 == param1) {
                  return true;
                }
                stackIn_127_0 = false;
              } else {
                stackIn_127_0 = true;
              }
              return stackIn_127_0;
            }
          }
        } else {
          if (58 < param1) {
            boolean decompiledFrameRemainder0 = true;
            if (param1 < 64) {
              if (param1 != 80 &&
                param1 != 83 &&
                param1 != 84 &&
                85 != param1 &&
                param1 != 59 &&
                74 != param1) {
                if (28 == param1) {
                  return true;
                }
                stackIn_114_0 = false;
                decompiledFrameRemainder0 = false;
              }
            } else {
              if (73 < param1) {
                if (param1 != 80 &&
                  param1 != 83 &&
                  param1 != 84 &&
                  85 != param1 &&
                  param1 != 59 &&
                  74 != param1) {
                  if (28 == param1) {
                    return true;
                  }
                  stackIn_103_0 = false;
                } else {
                  stackIn_103_0 = true;
                }
                return stackIn_103_0;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_114_0 = true;
            }
            return stackIn_114_0;
          }
        }
        if (decompiledFrameRemainder1) {
          stackIn_138_0 = true;
        }
        return stackIn_138_0;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var2_int = param1; var2_int < param0; var2_int++) {
            LevelCompleteScreen.a(5 + JungleBackground.field_r.nextBoundedInt(-37880252, 2), 1273378209, JungleBackground.field_r.nextBoundedInt(-37880252, 3) + 9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "uf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static String requestRemoveIgnoredPlayer(String name, int opcode, String lookupName, int obfuscationGuard) {
        RuntimeException var4 = null;
        int guardDivision = 0;
        BitPacketBuffer packet = null;
        int bodyStart = 0;
        SocialListEntry entry = null;
        CharSequence nameCharacters = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nameCharacters = (CharSequence) ((Object) name);
          if (!DualLinkNode.isValidSocialName(nameCharacters, false)) {
            stackIn_2_0 = LobbyGame.field_Xb;
            return stackIn_2_0;
          }
          if (2 != LevelMetadata.field_m) {
            stackIn_6_0 = hd.field_b;
            return stackIn_6_0;
          }
          entry = HighscorePackSelector.findIgnoredPlayer(0, lookupName);
          guardDivision = 42 / ((15 - obfuscationGuard) / 34);
          if (entry == null) {
            stackIn_9_0 = rd.a(to.field_h, new String[]{lookupName}, (byte) 103);
            return stackIn_9_0;
          }
          entry.unlink((byte) 111);
          entry.unlinkSecondary(3);
          IsaacGenerator.ignoreCount = IsaacGenerator.ignoreCount - 1;
          packet = TextFieldValidator.outgoingPackets;
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          bodyStart = packet.position;
          packet.writeByte(16, 3);
          packet.writeCp1252String(name, -1);
          packet.backfillByteLength((byte) 117, -bodyStart + packet.position);
          stackIn_11_0 = null;
          return (String) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("uf.C(");
          if (name == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(opcode).append(',');
          if (lookupName == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        enabledCommonPackets = new boolean[64];
    }
}
