/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[][][] field_c;
    static IndexedSprite[] field_d;
    int field_a;
    static String field_b;
    private og[] field_e;

    final og a(byte param0) {
        if (param0 != 13) {
          this.a(97);
        }
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_e[fieldTemp$0];
    }

    public static void b(int param0) {
        if (param0 > -13) {
          es.b(-31);
        }
        field_b = null;
        field_d = null;
        field_c = (String[][][]) null;
    }

    final static boolean receivePacketBytes(int obfuscationGuard, int requiredLength) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (ByteStorage.incomingPacket.position >= requiredLength) {
            return true;
          }
          if (obfuscationGuard >= -63) {
            return true;
          }
          if (null == MoveAttackRequest.sessionSocket) {
            return false;
          }
          try {
            var2_int = MoveAttackRequest.sessionSocket.available((byte) 43);
            if (var2_int > 0) {
              if (requiredLength - ByteStorage.incomingPacket.position < var2_int) {
                var2_int = -ByteStorage.incomingPacket.position + requiredLength;
              }
              MoveAttackRequest.sessionSocket.readFully(0, ByteStorage.incomingPacket.position, var2_int, ByteStorage.incomingPacket.payload);
              CampaignMenuButton.lastPacketReadMillis = vi.monotonicMillis(46);
              ByteStorage.incomingPacket.position = ByteStorage.incomingPacket.position + var2_int;
              if (ByteStorage.incomingPacket.position < requiredLength) {
                return false;
              }
              ByteStorage.incomingPacket.position = 0;
              return true;
            }
            if (0 <= var2_int &&
              TileMetadata.b(0) <= 30000L) {
              return false;
            }
            dj.a((byte) -127);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            dj.a((byte) -127);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 <= 109) {
          field_d = (IndexedSprite[]) null;
        }
        return this.field_a >= this.field_e.length ? true : false;
    }

    final static void a(int param0, int param1, au param2, int param3, boolean param4, int param5, byte param6, int param7) {
        IconTextComponent[][] stackIn_33_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        IconTextComponent[] var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        IconTextComponent var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int var11Lifetime1;
        int var14_intLifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var8_int = -49 % ((2 - param6) / 56);
          if (param3 >= param1) {
            var9_int = 1;
            var10 = 0;
            while (true) {
              if (fs.field_d.length <= var10) {
                if (var9_int == 0) {
                  return;
                }
                fc.field_a = true;
                return;
              }
              var18 = fs.field_d[var10];
              var17 = var18;
              var11_ref_int__ = var17;
              var12 = 0;
              var13 = 0;
              scanLoop1: while (true) {
                if (var13 >= var18.length) {
                  if (var12 == 0 &&
                    param3 != tq.field_b) {
                    break scanLoop1;
                  }
                  var9_int = 0;
                  for (var13 = 0; var18.length > var13; var13 += 2) {
                    var14_int = var18[var13];
                    if (var14_int == -1) {
                      jp.field_a = true;
                    } else {
                      if (param3 > var14_int) {
                        dt.field_d[var14_int] = true;
                      }
                    }
                  }
                  break scanLoop1;
                }
                var14_intLifetime1 = var18[var13];
                var15 = var11_ref_int__[var13 + 1];
                if (-1 != var14_intLifetime1) {
                  if (var14_intLifetime1 == param3 &&
                    var15 == param5) {
                    var12 = 1;
                  } else {
                    if (param3 <= var14_intLifetime1) {
                      break scanLoop1;
                    }
                    if (var15 != (255 & TeleportAction.field_B[var14_intLifetime1])) {
                      break scanLoop1;
                    }
                  }
                } else {
                  if (var15 != lm.field_e[param7]) {
                    break scanLoop1;
                  }
                }
                var13 += 2;
                continue;

              }
              var10++;
            }
          }
          stackIn_33_0 = pu.field_k;
          if (param3 != -1) {
            stackIn_34_1 = 4 + param3;
          } else {
            stackIn_34_1 = 1;
          }
          var9 = stackIn_33_0[stackIn_34_1];
          var10 = 1;
          if (param4) {
            if (param3 != -1) {
              for (var11 = 0; var9.length - 1 > var11; var11++) {
                if ((tg.field_d[(var11 + param0) / 8] & 1 << (param0 + var11 & 7)) == 0) {
                  continue;
                }
                var10 = 0;
                break;
              }
              param0 = param0 + (255 & t.field_b[param3]);
            } else {
              var11 = 0;
              while (!(var11 >= lm.field_e.length)) {
                if ((CoatOfArms.field_d[var11 / 8] & 1 << (var11 & 7)) == 0) {
                  var11++;
                  continue;
                }
                var10 = 0;
                break;
              }
            }
          }
          var11Lifetime1 = 0;
          var12 = 0;
          while (true) {
            if (param3 != -1) {
              stackIn_51_0 = -1 + var9.length;
            } else {
              stackIn_51_0 = lm.field_e.length;
            }
            if (stackIn_51_0 <= var12) {
              if (var11Lifetime1 == 0) {
                for (var12 = 0; var12 < var9.length - 1; var12++) {
                  if (-1 != param3) {
                    TeleportAction.field_B[param3] = (byte)var12;
                  } else {
                    param7 = var12;
                  }
                  es.a(param0, param1, param2, param3 + 1, param4, param5, (byte) -72, param7);
                  if (fc.field_a) {
                    return;
                  }
                }
                return;
              }
              return;
            }
            if (param3 == -1) {
              param7 = var12;
            } else {
              TeleportAction.field_B[param3] = (byte)var12;
            }
            if (param3 == -1 &&
              lm.field_e.length == 1) {
              var13 = 1;
            } else {
              var14 = var9[1 + var12];
              if (param4) {
                if (!var14.selected) {
                  if (var10 != 0) {
                    stackIn_75_0 = (var14.inputEnabled) ? 1 : 0;
                  } else {
                    stackIn_75_0 = 0;
                  }
                } else {
                  stackIn_75_0 = 1;
                }
                var13 = stackIn_75_0;
              } else {
                if (param3 == -1) {
                  stackIn_66_0 = (vu.field_M.field_nc != lm.field_e[var12]) ? 0 : 1;
                } else {
                  stackIn_66_0 = ((vu.field_M.field_pc[param3] & 255) != var12) ? 0 : 1;
                }
                var13 = stackIn_66_0;
              }
            }
            if (var13 != 0) {
              es.a(param0, param1, param2, param3 + 1, param4, param5, (byte) 120, param7);
              var11Lifetime1 = 1;
            }
            if (fc.field_a) {
              return;
            }
            var12++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_95_0 = var8;
          stackIn_95_1 = new StringBuilder().append("es.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    es(NodeDeque param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        og var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          this.field_e = new og[param0.size(false)];
          var2_int = 0;
          var3 = (og) (param0.first((byte) 105));
          while (var3 != null) {
            var3.unlink(121);
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_e[incrementValue$2] = var3;
            var3 = (og) (param0.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("es.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_c = new String[][][]{new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, "movement_range", null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null}, new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{"key_space", "key_arrows", "key_esc"}}};
        field_b = "Load Mission";
    }
}
