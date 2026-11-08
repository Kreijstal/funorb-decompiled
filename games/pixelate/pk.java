/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static mc field_f;
    static String field_e;
    static long field_g;
    static String field_b;
    static Sprite[] field_c;
    static String[] field_d;
    static int[] field_a;

    final static void orderFacesByGroup(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 0;
          scanLoop1: while (true) {
            if (DateInputWidget.field_N.length > var5_int) {
              param1 = DateInputWidget.field_N[var5_int];
              stackIn_13_0 = var5_int << 4;
              if (var7 != 0) {
                break scanLoop1;
              }
              var6 = stackIn_13_0;
              while (true) {
                incrementValue$0 = param1;
                param1--;
                if (incrementValue$0 != 0) {
                  incrementValue$1 = var6;
                  var6++;
                  param4 = nd.field_c[incrementValue$1];
                  dupTemp$2 = param0[param4];
                  dupTemp$3 = param2[dupTemp$2];
                  param2[dupTemp$2] = dupTemp$3 + 1;
                  nd.field_c[dupTemp$3] = param4;
                  continue;
                }
                break;
              }
              var5_int++;
              continue scanLoop1;
            }
            stackIn_13_0 = param3;
            break;
          }
          if (stackIn_13_0 <= 36) {
            pk.isLobbyChatInputActive(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pk.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          if (param0 != 4194303) {
            pk.readTriangleMesh((CipherPacketBuffer) null, -21);
          }
          field_c = null;
          field_e = null;
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "pk.F(" + param0 + ')');
        }
    }

    final static id createDobResult(boolean param0, int param1) {
        id var2 = null;
        RuntimeException var2_ref = null;
        id stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5731) {
            pk.clearSharedReferences(-111);
          }
          var2 = new id(true);
          var2.field_e = param0;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2_ref), "pk.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static TriangleMesh readTriangleMesh(CipherPacketBuffer param0, int param1) {
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        TriangleMesh stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.readBits(8, (byte) -34);
          if (~var2_int < param1) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = StrongCacheReference.readBit(param0, -32) ? 1 : 0;
          var4 = StrongCacheReference.readBit(param0, -32) ? 1 : 0;
          var5 = new TriangleMesh();
          var5.vertexCount = (short)param0.readBits(16, (byte) -34);
          var5.vertexX = EmergentBehaviourBackground.a(var5.vertexX, (byte) -128, param0, 16);
          var5.vertexY = EmergentBehaviourBackground.a(var5.vertexY, (byte) -128, param0, 16);
          var5.vertexZ = EmergentBehaviourBackground.a(var5.vertexZ, (byte) -128, param0, 16);
          var5.field_j = (short)param0.readBits(16, (byte) -34);
          var5.field_h = EmergentBehaviourBackground.a(var5.field_h, (byte) -128, param0, 16);
          var5.field_I = EmergentBehaviourBackground.a(var5.field_I, (byte) -128, param0, 16);
          var5.field_o = EmergentBehaviourBackground.a(var5.field_o, (byte) -128, param0, 16);
          if (var3 != 0) {
            var5.field_a = (short)param0.readBits(16, (byte) -34);
            var5.field_K = EmergentBehaviourBackground.a(var5.field_K, (byte) -128, param0, 16);
            var5.field_q = EmergentBehaviourBackground.a(var5.field_q, (byte) -128, param0, 16);
            var5.field_p = EmergentBehaviourBackground.a(var5.field_p, (byte) -128, param0, 16);
            var5.field_J = EmergentBehaviourBackground.a(var5.field_J, (byte) -128, param0, 16);
            var5.field_s = EmergentBehaviourBackground.a(var5.field_s, (byte) -128, param0, 16);
            var5.field_i = EmergentBehaviourBackground.a(var5.field_i, (byte) -128, param0, 16);
          }
          if (var4 != 0) {
            param0.readBits(16, (byte) -34);
            var5.field_D = EmergentBehaviourBackground.a(var5.field_D, (byte) -128, param0, 16);
            var5.field_L = EmergentBehaviourBackground.a(var5.field_L, (byte) -128, param0, 16);
            var5.field_S = EmergentBehaviourBackground.a(var5.field_S, (byte) -128, param0, 16);
            var5.field_d = EmergentBehaviourBackground.a(var5.field_d, (byte) -128, param0, 16);
            var5.field_z = EmergentBehaviourBackground.a(var5.field_z, (byte) -128, param0, 16);
          }
          if (StrongCacheReference.readBit(param0, -32)) {
            var5.field_l = EmergentBehaviourBackground.a(var5.field_l, (byte) -128, param0, 16);
          }
          if (StrongCacheReference.readBit(param0, -32)) {
            var5.field_n = NodeHashTable.readPackedByteArray(param0, var5.field_n, 16, param1 ^ -122);
            var6 = 0;
            var7 = 0;
            while (true) {
              if (var5.field_n.length > var7) {
                stackIn_29_0 = var6;
                stackIn_29_1 = 255 & var5.field_n[var7];
                if (var8 == 0) {
                  if (stackIn_29_0 < stackIn_29_1) {
                    var6 = 255 & var5.field_n[var7];
                  }
                  var7++;
                  continue;
                }
              } else {
                stackIn_29_0 = -1;
                stackIn_29_1 = ~var6;
              }
              if (stackIn_29_0 == stackIn_29_1) {
                var5.field_n = null;
                if (var8 == 0) {
                  break;
                }
              }
              var5.field_B = (byte)(1 + var6);
              break;
            }
          }
          stackIn_36_0 = var5;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("pk.C(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean isLobbyChatInputActive(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 119) {
            field_d = (String[]) null;
          }
          if (!oo.field_d) {
            return false;
          }
          if (ce.field_d == 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "pk.A(" + param0 + ')');
        }
    }

    final static String buildChatInputPrompt(byte param0) {
        String stackIn_20_0 = null;
        String stackIn_60_0 = null;
        Object stackIn_96_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = null;
          var2 = null;
          if (ce.field_d == 0 &&
            null != DraggableWidget.field_S) {
            var2 = AccountChoicePanel.field_P;
          }
          if (ce.field_d == 2 &&
            !ra.a((byte) -99)) {
            if (CanvasRasterBuffer.a(fp.field_d, (byte) 37)) {
              var2 = AlphaContainer.a(GameApplet.field_m, 34, new String[]{CheckboxPainter.field_k});
              if (var10 != 0) {
                var2 = AlphaContainer.a(fg.field_d, 34, new String[]{CheckboxPainter.field_k});
              }
            } else {
              var2 = AlphaContainer.a(fg.field_d, 34, new String[]{CheckboxPainter.field_k});
            }
            if (un.field_l) {
              MidiPcmStream.appendChatMessage(0, (String) null, (String) null, (byte) -82, 2, (String) (var2));
              SoundCache.a(true);
            }
          }
          if (param0 <= 59) {
            stackIn_20_0 = (String) null;
            return stackIn_20_0;
          }
          if (null == var2 &&
            !MatchingTextValidator.field_z &&
            LoadingProgressDialog.field_eb == null) {
            var2 = NameSuggestionsPanel.field_M;
          }
          if (null != var2) {
            IntKeyLookup.a((String) null, 0, VerticalScrollbar.field_Ib, 24092, (String) (var2));
          } else {
            var3 = ModalStack.field_J;
            var3 = th.prefixWithCrown(2, var3);
            var4 = "";
            var5 = "|";
            var6 = ce.field_d;
            var7 = 0;
            if (2 == var6) {
              var4 = AlphaContainer.a(dg.field_b, 73, new String[]{CheckboxPainter.field_k});
              var8 = AlphaContainer.a(sk.field_c, 69, new String[]{var3});
              var7 = -485 + (nf.field_d.field_K + rh.field_y.field_K + AccountMessagePanel.field_Q.textWidth(var8) - AccountMessagePanel.field_Q.textWidth(var4));
              if (var7 < 0) {
                var7 = 0;
              }
            }
            if (2 != var6 ||
              var10 != 0) {
              if (0 == var6) {
                if (null == LoginMethod.field_c &&
                  ge.field_f) {
                  var4 = "[" + TimerBar.field_m + "] ";
                }
                if (null != LoginMethod.field_c) {
                  if (!TickClock.field_b ||
                    TextLayoutLine.field_f == null) {
                    var4 = "[" + AlphaContainer.a(HowToPlayScreen.field_q, 40, new String[]{LoginMethod.field_c.field_pc}) + "] ";
                    if (var10 != 0) {
                      var4 = "[" + TextLayoutLine.field_f + "] ";
                    }
                  } else {
                    var4 = "[" + TextLayoutLine.field_f + "] ";
                  }
                  var6 = 1;
                }
              }
              if (RankingTableRequest.a((byte) 81)) {
                stackIn_60_0 = ": ";
              } else {
                stackIn_60_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_60_0;
              var4 = var4 + var3 + var8Lifetime1;
              boolean decompiledSharedTail0 = !(ln.field_q);
              if (!decompiledSharedTail0) {
                var5 = "";
                var4 = "<col=999999>" + var4 + ef.field_d + "</col>";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (IsaacRandom.field_g)) {
                var5 = "";
                var4 = "<col=999999>" + var4 + JaggrabDownloader.field_i + "</col>";
              }
              var9 = AccountMessagePanel.field_Q.textWidth(var4);
              if (!RankingTableRequest.a((byte) 124)) {
                if (nf.field_d.field_W &&
                  (-nf.field_d.field_tb + ProxyAuthenticationException.field_d) < var9) {
                  if (!ln.field_q) {
                    var1 = JaggrabDownloader.field_i;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (nf.field_d.field_P != 0 &&
                  nf.field_d.field_ub < var9 &&
                  !ln.field_q) {
                  SceneWidget.c(true);
                }
              }
            }
            IntKeyLookup.a(var5, var7, ib.field_i[var6], 24092, var4 + BitmapFont.escapeMarkup(mp.field_a.toString()));
            if (!oo.field_d) {
              rh.field_y.field_W = false;
            }
            if (rh.field_y.field_W) {
              var1 = AlphaContainer.a(MatchHud.field_m, 78, new String[]{var3, CheckboxPainter.field_k});
            }
          }
          stackIn_96_0 = var1;
          return (String) (stackIn_96_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) (var1), "pk.E(" + param0 + ')');
        }
    }

    static {
        field_d = new String[]{"Welcome to Pixelate!", "The Buffer Zone", "How To Play", "Game Mode: Challenge", "Game Mode: Challenge", "Game Mode: Puzzle", "Game Mode: Multiplayer", "Game Mode: Multiplayer"};
        field_e = "Players";
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
