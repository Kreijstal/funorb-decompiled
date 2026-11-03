/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_a;
    static int[][][] field_c;
    static String findOpponentSingular;
    static int[] crcTable;
    static int[] field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          if (wn.field_a != null) {
            ti.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < AchievementsScreen.field_H.length) {
              var2_int = AchievementsScreen.field_H[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (MessageDialog.field_xb >= 0 &&
              var2_int >= 0) {
              field_b[MessageDialog.field_xb] = var2_int;
              MessageDialog.field_xb = 1 + MessageDialog.field_xb & 127;
              if (MessageDialog.field_xb == jq.field_g) {
                MessageDialog.field_xb = -1;
              }
            }
            if (0 <= var2_int) {
              var3 = TextLayout.field_h + 1 & 127;
              if (var3 != WireframeQuad.field_s) {
                ee.field_b[TextLayout.field_h] = var2_int;
                ek.field_c[TextLayout.field_h] = (char)0;
                TextLayout.field_h = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) == 0 &&
              var2_int != 85 &&
              var2_int != 10) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("fo.keyPressed(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          if (QuickChatCategoryDefinition.field_y < 10) {
            var3_int = 0;
            if (he.field_c) {
              he.field_c = false;
              var3_int = 1;
            }
            ModelTableScene.a(var3_int != 0, 30, AimTarget.getLoadingStatusMessage((byte) 84), LocalGameSetupScreen.field_H, ResizableDialog.i(19535));
          } else {
            if (u.a(108)) {
              if (PlasmaTableScene.field_ab == 0) {
                ResourceArchive.a(param1, (byte) 109, false);
                ButtonWidget.a(0, 0, (byte) -65, param2);
              } else {
                ModelTableScene.a(true, param2);
              }
            } else {
              SoftwareRasterizer.clear();
              DialWidget.a(240, false, 320);
              ButtonWidget.a(0, 0, (byte) -89, param2);
            }
          }
          if (param0 != -55) {
            findOpponentSingular = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fo.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -1) {
          return;
        }
        findOpponentSingular = null;
        field_b = null;
        field_c = (int[][][]) null;
        crcTable = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != wn.field_a) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && 65535 != var2_int &&
              PlayerContextMenu.isValidNameCharacter((byte) 112, (char) var2_int)) {
              var3 = 1 + TextLayout.field_h & 127;
              if (WireframeQuad.field_s != var3) {
                ee.field_b[TextLayout.field_h] = -1;
                ek.field_c[TextLayout.field_h] = (char)var2_int;
                TextLayout.field_h = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fo.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != wn.field_a) {
            ti.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              AchievementsScreen.field_H.length > var2_int) {
              var2_int = AchievementsScreen.field_H[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (MessageDialog.field_xb >= 0 &&
              var2_int >= 0) {
              field_b[MessageDialog.field_xb] = ~var2_int;
              MessageDialog.field_xb = 127 & 1 + MessageDialog.field_xb;
              if (MessageDialog.field_xb == jq.field_g) {
                MessageDialog.field_xb = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("fo.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static IndexedSprite a(byte param0) {
        int var2 = 77 % ((20 - param0) / 41);
        IndexedSprite var1 = new IndexedSprite(DialRenderer.field_c, tq.field_r, AchievementsScreen.field_I[0], ih.field_d[0], LinkButtonPainter.field_a[0], rc.field_f[0], LimitedRandomAccessFile.field_b[0], IntrusiveNode.field_h);
        OpacityWidget.h(-1);
        return var1;
    }

    final static void a(String param0, float param1, boolean param2) {
        try {
          if (param2) {
            KeyHandler.a((String) null, 0.6310321688652039f, false);
          }
          TextWidgetPainter.field_n = param0;
          CacheEntry.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fo.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (wn.field_a != null) {
            MessageDialog.field_xb = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fo.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        findOpponentSingular = "Find opponent";
        crcTable = new int[256];
        field_b = new int[128];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          crcTable[var1] = var0;
        }
    }
}
