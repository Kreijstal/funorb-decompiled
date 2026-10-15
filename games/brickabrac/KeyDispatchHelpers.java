/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyDispatchHelpers {
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

    final static boolean shouldPairKeyWithCharacter(int obfuscationGuard, int keyCode) {
        boolean postDigitRangeAccepted = false;
        boolean mainRangeAccepted = false;
        boolean letterOrSpecialAccepted = false;
        boolean upperSpecialAccepted = false;
        boolean lowSpecialAccepted = false;
        boolean tailSpecialAccepted = false;
        boolean tailRangeAccepted = false;
        boolean fallbackSpecialAccepted = false;
        boolean fallbackAccepted = false;
        if (obfuscationGuard > -84) {
          return true;
        }
        if (IntArrayRequest.heldKeys[82]) {
          return false;
        }
        if (IntArrayRequest.heldKeys[86]) {
          return false;
        }
        if (keyCode >= 16) {
          if (keyCode <= 27) {
            return true;
          }
          if (keyCode < 32) {
            postDigitRangeAccepted = ((!(keyCode < 48) &&
              !(58 < keyCode)) ||
              (!(keyCode < 64) &&
              !(73 < keyCode)) ||
              (keyCode == 80 ||
              keyCode == 83 ||
              keyCode == 84 ||
              85 == keyCode ||
              keyCode == 59 ||
              74 == keyCode ||
              28 == keyCode));
            return postDigitRangeAccepted;
          }
          boolean unusedMainRangeGate = true;
          if (keyCode > 43 && ((keyCode < 48 ||
            58 < keyCode) &&
            (keyCode < 64 ||
            73 < keyCode)) && (keyCode != 80 &&
            keyCode != 83 &&
            keyCode != 84 &&
            85 != keyCode &&
            keyCode != 59 &&
            74 != keyCode &&
            28 != keyCode)) {
            mainRangeAccepted = false;
            unusedMainRangeGate = false;
          }
          else {
            mainRangeAccepted = true;
          }
          return mainRangeAccepted;
        }
        if (keyCode >= 32) {
          if (keyCode <= 43) {
            return true;
          }
          if (keyCode >= 48) {
            if (58 >= keyCode) {
              return true;
            }
            letterOrSpecialAccepted = ((!(keyCode < 64) &&
              !(73 < keyCode)) ||
              (keyCode == 80 ||
              keyCode == 83 ||
              keyCode == 84 ||
              85 == keyCode ||
              keyCode == 59 ||
              74 == keyCode ||
              28 == keyCode));
            return letterOrSpecialAccepted;
          }
          boolean continueUpperSpecialCheck = true;
          if (keyCode < 64) {
            if (keyCode != 80 &&
              keyCode != 83 &&
              keyCode != 84 &&
              85 != keyCode &&
              keyCode != 59 &&
              74 != keyCode) {
              if (28 == keyCode) {
                return true;
              }
              lowSpecialAccepted = false;
              continueUpperSpecialCheck = false;
            }
          } else {
            if (73 < keyCode) {
              if (keyCode != 80 &&
                keyCode != 83 &&
                keyCode != 84 &&
                85 != keyCode &&
                keyCode != 59 &&
                74 != keyCode) {
                if (28 == keyCode) {
                  return true;
                }
                upperSpecialAccepted = false;
              } else {
                upperSpecialAccepted = true;
              }
              return upperSpecialAccepted;
            }
          }
          if (continueUpperSpecialCheck) {
            lowSpecialAccepted = true;
          }
          return lowSpecialAccepted;
        }
        boolean continueFallbackCheck = true;
        if (keyCode < 48) {
          if (keyCode < 64) {
            if (keyCode != 80 &&
              keyCode != 83 &&
              keyCode != 84 &&
              85 != keyCode &&
              keyCode != 59 &&
              74 != keyCode) {
              if (28 == keyCode) {
                return true;
              }
              fallbackAccepted = false;
              continueFallbackCheck = false;
            }
          } else {
            if (73 < keyCode) {
              if (keyCode != 80 &&
                keyCode != 83 &&
                keyCode != 84 &&
                85 != keyCode &&
                keyCode != 59 &&
                74 != keyCode) {
                if (28 == keyCode) {
                  return true;
                }
                fallbackSpecialAccepted = false;
              } else {
                fallbackSpecialAccepted = true;
              }
              return fallbackSpecialAccepted;
            }
          }
        } else {
          if (58 < keyCode) {
            boolean continueTailRangeCheck = true;
            if (keyCode < 64) {
              if (keyCode != 80 &&
                keyCode != 83 &&
                keyCode != 84 &&
                85 != keyCode &&
                keyCode != 59 &&
                74 != keyCode) {
                if (28 == keyCode) {
                  return true;
                }
                tailRangeAccepted = false;
                continueTailRangeCheck = false;
              }
            } else {
              if (73 < keyCode) {
                if (keyCode != 80 &&
                  keyCode != 83 &&
                  keyCode != 84 &&
                  85 != keyCode &&
                  keyCode != 59 &&
                  74 != keyCode) {
                  if (28 == keyCode) {
                    return true;
                  }
                  tailSpecialAccepted = false;
                } else {
                  tailSpecialAccepted = true;
                }
                return tailSpecialAccepted;
              }
            }
            if (continueTailRangeCheck) {
              tailRangeAccepted = true;
            }
            return tailRangeAccepted;
          }
        }
        if (continueFallbackCheck) {
          fallbackAccepted = true;
        }
        return fallbackAccepted;
    }

    final static void spawnFireworkBursts(int endIndex, int firstIndex) {
        int burstIndex = 0;
        int unusedClientFlag = 0;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          for (burstIndex = firstIndex; burstIndex < endIndex; burstIndex++) {
            LevelCompleteScreen.spawnFireworkBurst(5 + JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 2), 1273378209, JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 3) + 9);
          }
          return;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "uf.D(" + endIndex + ',' + firstIndex + ')');
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
            stackIn_9_0 = GamePresentationHelpers.formatIndexedText(WeightedLruCache.field_h, new String[]{lookupName}, (byte) 103);
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
