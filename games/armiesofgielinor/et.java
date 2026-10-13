/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et {
    static String field_c;
    static boolean field_d;
    static int field_b;
    static char field_a;

    final static void a(pu param0, int param1, boolean param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_35_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = ModalDialog.bitLength((-param3 + param4) * 3, param1 ^ 13329);
          var6 = 3 * param3;
          EditableTextField.n(0);
          var7 = param1 + var5_int;
          if (0 < param0.field_E &&
            param0.field_K != null) {
            la.d((byte) 111);
          }
          hc.field_q = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_q > var8)))) {
            var9 = param0.field_c[var8];
            var10 = param0.field_j[var8];
            var11 = param0.field_e[var8];
            stackOut_10_0 = param2;
            stackIn_44_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var19 == 0) {
              if (stackIn_11_0) {
                var12 = TileMetadata.field_f[var9];
                var13 = fa.field_k[var9];
                var14 = TileMetadata.field_f[var10] - var12;
                var15 = TileMetadata.field_f[var11] - var12;
                var16 = -var13 + fa.field_k[var10];
                var17 = fa.field_k[var11] - var13;
              }
              if (!stackIn_11_0 ||
                !(var17 * var14 - var15 * var16 >= 0)) {
                var12Lifetime1 = ls.field_c[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = ls.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = ls.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + (var13Lifetime1 + var12Lifetime1) - var6;
                      stackIn_24_0 = -1;
                      stackIn_24_1 = MoveAttackRequest.field_K.length;
                      if (0 <= var7) {
                        stackIn_25_2 = var15 >> var7;
                      } else {
                        stackIn_25_2 = var15 << -var7;
                      }
                      var16 = stackIn_24_0 + (stackIn_24_1 - stackIn_25_2);
                      var17 = MoveAttackRequest.field_K[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_35_0 = var16;
                          if (stackIn_35_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = MoveAttackRequest.field_K[var16];
                          continue;
                        }
                        stackIn_35_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_35_0Lifetime1;
                        ab.field_c[var18] = var8;
                        MoveAttackRequest.field_K[var16] = 1 + var17;
                        if (param0.field_E > 0 &&
                          null != param0.field_K) {
                          dupTemp$0 = param0.field_K[var8];
                          jp.field_g[dupTemp$0] = jp.field_g[dupTemp$0] + 1;
                        }
                        hc.field_q = hc.field_q + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_44_0 = -1;
          }
          if (stackIn_44_0 > ~param0.field_E &&
            param0.field_K != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(jp.field_g.length <= var9Lifetime1)) {
              var10Lifetime1 = jp.field_g[var9Lifetime1];
              jp.field_g[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_60_0 = var5;
          stackIn_60_1 = new StringBuilder().append("et.B(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          KingBlackDragonEvent.field_C.a(true, -6226, LoginMethod.field_b, UiSelectionState.field_i);
          KingBlackDragonEvent.field_C.advanceDialogs((byte) -102);
          if (param0 != -3) {
            et.a(103);
          }
          do {
            if (!Unit.pollKeyEvent((byte) 80)) {
              if (cn.field_r == -1) {
                if (ac.field_n) {
                  stackIn_18_0 = 3;
                  return stackIn_18_0;
                }
                if (du.nameCheckPending == mh.accountNameCheckState) {
                  stackIn_21_0 = 1;
                  return stackIn_21_0;
                }
                if (!se.emailCheckResult.isComplete((byte) -26)) {
                  stackIn_24_0 = 1;
                  return stackIn_24_0;
                }
                if (ChannelBaseVolumeConsoleCommand.field_L == du.nameCheckPending) {
                  stackIn_29_0 = 2;
                  return stackIn_29_0;
                }
                stackIn_31_0 = -1;
                return stackIn_31_0;
              }
              break;
            }
            KingBlackDragonEvent.field_C.a(rs.keyCode, DualNodeDeque.typedCharacter, 80);
          } while (var2 == 0);
          var1_int = cn.field_r;
          gl.a(param0 ^ -127, -1);
          stackIn_13_0 = var1_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "et.C(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 13626) {
            et.c(-112);
          }
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "et.D(" + param0 + ')');
        }
    }

    final static ClientUiComponent b(int param0) {
        RuntimeException var1 = null;
        ClientUiComponent stackIn_2_0 = null;
        ClientUiComponent stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = bu.field_a.content;
            return stackIn_4_0;
          }
          stackIn_2_0 = (ClientUiComponent) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "et.A(" + param0 + ')');
        }
    }

    static {
        field_c = "Who can join";
        field_d = false;
        field_a = '/';
    }
}
