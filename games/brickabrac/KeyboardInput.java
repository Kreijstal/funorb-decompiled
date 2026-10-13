/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardInput implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static boolean hasNonnegativeResult;

    final static String a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        mp var7 = null;
        mp var8 = null;
        BitPacketBuffer var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param2);
          if (!DualLinkNode.a(var10, param1)) {
            stackIn_3_0 = om.field_Xb;
            return stackIn_3_0;
          }
          if (LevelMetadata.field_m != 2) {
            stackIn_6_0 = hj.field_Ub;
            return stackIn_6_0;
          }
          var8 = pf.a(param1, param2);
          if (var8 == null) {
            stackIn_9_0 = rd.a(ka.field_C, new String[]{param2}, (byte) 103);
            return stackIn_9_0;
          }
          bf.field_N.a((byte) 107, var8);
          while (true) {
            var7 = (mp) (bf.field_N.next((byte) 116));
            if (var7 != null) {
              var7.field_Sb = var7.field_Sb - 1;
              continue;
            }
            break;
          }
          var8.unlink((byte) 111);
          var8.unlinkSecondary(3);
          LevelPackSelectScreen.field_w = LevelPackSelectScreen.field_w - 1;
          var9 = k.outgoingPackets;
          var9.writeCipheredOpcode(-13413, param0);
          var9.position = var9.position + 1;
          var5 = var9.position;
          var9.writeByte(-13, 1);
          var9.writeCp1252String(param2, -1);
          var9.backfillByteLength((byte) 118, -var5 + var9.position);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("op.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, RgbSprite[] param1, int param2, int param3, int param4, int param5, int param6) {
        int var22 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (param2 > 0 &&
            param4 > 0 &&
            param5 != 0) {
            if (null != param1[3]) {
              stackIn_12_0 = param1[3].canvasWidth;
            } else {
              stackIn_12_0 = 0;
            }
            var7_int = stackIn_12_0;
            if (null == param1[5]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param1[5].canvasWidth;
            }
            var8 = stackIn_15_0;
            if (null == param1[1]) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param1[1].canvasHeight;
            }
            var9 = stackIn_18_0;
            if (null == param1[7]) {
              stackIn_21_0 = 0;
            } else {
              stackIn_21_0 = param1[7].canvasHeight;
            }
            var10 = stackIn_21_0;
            var11 = param2 + param0;
            var12 = param6 + param4;
            var13 = var7_int + param0;
            var14 = -var8 + var11;
            var15 = var9 + param6;
            var16 = -var10 + var12;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = param0 + param2 * var7_int / (var8 + var7_int);
              var17 = param0 + param2 * var7_int / (var8 + var7_int);
            }
            var19 = var15;
            var20 = var16;
            if (var19 > var20) {
              var20 = param4 * var9 / (var9 + var10) + param6;
              var19 = param4 * var9 / (var9 + var10) + param6;
            }
            Rasterizer2D.saveClip(rg.field_g);
            if (param1[0] != null) {
              Rasterizer2D.intersectClip(param0, param6, var17, var19);
              param1[0].b(param0, param6, param5);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (null != param1[2]) {
              Rasterizer2D.intersectClip(var18, param6, var11, var19);
              param1[2].b(var14, param6, param5);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (null != param1[param3]) {
              Rasterizer2D.intersectClip(param0, var20, var17, var12);
              param1[6].b(param0, var16, param5);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (param1[8] != null) {
              Rasterizer2D.intersectClip(var18, var20, var11, var12);
              param1[8].b(var14, var16, param5);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (param1[1] != null &&
              param1[1].canvasWidth != 0) {
              Rasterizer2D.intersectClip(var17, param6, var18, var19);
              for (var21 = var13; var14 > var21; var21 = var21 + param1[1].canvasWidth) {
                param1[1].b(var21, param6, param5);
              }
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (param1[7] != null &&
              param1[7].canvasWidth != 0) {
              Rasterizer2D.intersectClip(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param1[7].canvasWidth) {
                param1[7].b(var21Lifetime1, var16, param5);
              }
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (param1[3] != null &&
              param1[3].canvasHeight != 0) {
              Rasterizer2D.intersectClip(param0, var19, var17, var20);
              for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param1[3].canvasHeight) {
                param1[3].b(param0, var21Lifetime2, param5);
              }
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (param1[5] != null &&
              param1[5].canvasHeight != 0) {
              Rasterizer2D.intersectClip(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param1[5].canvasHeight) {
                param1[5].b(var14, var21Lifetime3, param5);
              }
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (null != param1[4] &&
              param1[4].canvasWidth != 0 &&
              0 != param1[4].canvasHeight) {
              Rasterizer2D.intersectClip(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param1[4].canvasHeight) {
                for (var22 = var13; var22 < var14; var22 = var22 + param1[4].canvasWidth) {
                  param1[4].b(var22, var21Lifetime4, param5);
                }
              }
              Rasterizer2D.restoreClip(rg.field_g);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_75_0 = var7;
          stackIn_75_1 = new StringBuilder().append("op.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent event) {
        int mappedKeyCode = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != DualLinkDeque.keyboardInput) {
            PowerUp.keyboardIdleTicks = 0;
            mappedKeyCode = event.getKeyCode();
            if (mappedKeyCode >= 0 &&
              tf.javaKeyCodeMap.length > mappedKeyCode) {
              mappedKeyCode = -129 & tf.javaKeyCodeMap[mappedKeyCode];
            } else {
              mappedKeyCode = -1;
            }
            if (pl.keyChangeWriteIndex >= 0 &&
              mappedKeyCode >= 0) {
              lo.keyChangeQueue[pl.keyChangeWriteIndex] = ~mappedKeyCode;
              pl.keyChangeWriteIndex = 1 + pl.keyChangeWriteIndex & 127;
              if (ek.keyChangeReadIndex == pl.keyChangeWriteIndex) {
                pl.keyChangeWriteIndex = -1;
              }
            }
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("op.keyReleased(");
          if (event == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent event) {
        int mappedKeyCode = 0;
        int nextWriteIndex = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int modifiers;
        try {
          if (null != DualLinkDeque.keyboardInput) {
            PowerUp.keyboardIdleTicks = 0;
            mappedKeyCode = event.getKeyCode();
            if (0 <= mappedKeyCode &&
              mappedKeyCode < tf.javaKeyCodeMap.length) {
              mappedKeyCode = tf.javaKeyCodeMap[mappedKeyCode];
              if (0 != (128 & mappedKeyCode)) {
                mappedKeyCode = -1;
              }
            } else {
              mappedKeyCode = -1;
            }
            if (pl.keyChangeWriteIndex >= 0 &&
              mappedKeyCode >= 0) {
              lo.keyChangeQueue[pl.keyChangeWriteIndex] = mappedKeyCode;
              pl.keyChangeWriteIndex = 127 & 1 + pl.keyChangeWriteIndex;
              if (pl.keyChangeWriteIndex == ek.keyChangeReadIndex) {
                pl.keyChangeWriteIndex = -1;
              }
            }
            if (mappedKeyCode >= 0) {
              nextWriteIndex = 127 & ResourceRequest.keyEventWriteIndex + 1;
              if (IntrusiveHashTable.keyEventReadIndex != nextWriteIndex) {
                ef.keyEventCodes[ResourceRequest.keyEventWriteIndex] = mappedKeyCode;
                TimedSplashScreen.keyEventCharacters[ResourceRequest.keyEventWriteIndex] = (char)0;
                ResourceRequest.keyEventWriteIndex = nextWriteIndex;
              }
            }
            modifiers = event.getModifiers();
            if ((modifiers & 10) == 0 &&
              mappedKeyCode != 85 &&
              mappedKeyCode != 10) {
              return;
            }
            event.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("op.keyPressed(");
          if (event == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(vc param0, int param1) {
        try {
          kp.field_d.insertElementAt(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "op.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, int param1) {
        if (param0) {
          vc var3 = (vc) null;
          KeyboardInput.a((vc) null, -56);
        }
        return rd.a(FramedMenuScreen.field_t, new String[]{(param1 >= 10 ? "" : "0") + Integer.toString(param1)}, (byte) 103).toLowerCase();
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -42) {
          hasNonnegativeResult = false;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent event) {
        int characterCode = 0;
        int nextWriteIndex = 0;
        try {
          if (DualLinkDeque.keyboardInput != null) {
            characterCode = event.getKeyChar();
            if (0 != characterCode && characterCode != 65535 &&
              DelegatingCanvas.isLegacyInputCharacter((char) characterCode, -12)) {
              nextWriteIndex = 127 & ResourceRequest.keyEventWriteIndex + 1;
              if (IntrusiveHashTable.keyEventReadIndex != nextWriteIndex) {
                ef.keyEventCodes[ResourceRequest.keyEventWriteIndex] = -1;
                TimedSplashScreen.keyEventCharacters[ResourceRequest.keyEventWriteIndex] = (char)characterCode;
                ResourceRequest.keyEventWriteIndex = nextWriteIndex;
              }
            }
          }
          event.consume();
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "op.keyTyped(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = 0;
          if (param2 != -1) {
            stackIn_3_0 = 59;
            return stackIn_3_0;
          }
          while (param0 > 0) {
            var3_int = 1 & param1 | var3_int << 1;
            param0--;
            param1 = param1 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var3), "op.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        try {
          if (DualLinkDeque.keyboardInput != null) {
            pl.keyChangeWriteIndex = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "op.focusLost(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent event) {
    }

    static {
        field_b = "Balls destroy bricks, giving you points.<br><br>The first brick a ball destroys after touching the paddle is worth 10 points, the next is worth 11, the next 12, and so on.";
    }
}
