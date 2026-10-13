/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_c;
    static mf field_a;
    static boolean[] field_d;
    static int field_b;
    static RgbSprite field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 85) {
          return;
        }
        field_e = null;
        field_d = null;
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
        if (pe.heldKeys[82]) {
          return false;
        }
        if (pe.heldKeys[86]) {
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
            LevelCompleteScreen.a(5 + ip.field_r.nextBoundedInt(-37880252, 2), 1273378209, ip.field_r.nextBoundedInt(-37880252, 3) + 9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var2), "uf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        BitPacketBuffer var6 = null;
        int var7 = 0;
        mp var8 = null;
        CharSequence var9 = null;
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
          var9 = (CharSequence) ((Object) param0);
          if (!DualLinkNode.a(var9, false)) {
            stackIn_2_0 = om.field_Xb;
            return stackIn_2_0;
          }
          if (2 != LevelMetadata.field_m) {
            stackIn_6_0 = hd.field_b;
            return stackIn_6_0;
          }
          var8 = HighscorePackSelector.a(0, param2);
          var5 = 42 / ((15 - param3) / 34);
          if (var8 == null) {
            stackIn_9_0 = rd.a(to.field_h, new String[]{param2}, (byte) 103);
            return stackIn_9_0;
          }
          var8.unlink((byte) 111);
          var8.unlinkSecondary(3);
          IsaacGenerator.field_h = IsaacGenerator.field_h - 1;
          var6 = k.field_h;
          var6.writeCipheredOpcode(-13413, param1);
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.writeByte(16, 3);
          var6.writeCp1252String(param0, -1);
          var6.backfillByteLength((byte) 117, -var7 + var6.position);
          stackIn_11_0 = null;
          return (String) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("uf.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = new boolean[64];
    }
}
