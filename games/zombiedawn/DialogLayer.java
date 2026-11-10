/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DialogLayer extends SingleChildWidget {
    static ContentTransitionPhase field_I;
    private IntrusiveDeque field_H;
    static IntrusiveDeque field_D;
    static String field_G;
    static Sprite field_E;
    static String field_J;

    final void recentreDialogs(int param0, boolean param1, int param2) {
        int var8 = ZombieDawn.field_J;
        if (param2 == this.field_i &&
          param0 == this.field_n) {
          return;
        }
        int var4 = (-this.field_i + param2) / 2;
        int var5 = (-this.field_n + param0) / 2;
        IntrusiveDequeCursor var6 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var7 = (FadingModalPanel) (var6.last((byte) -119));
        while (var7 != null) {
          var7.field_k = var7.field_k + var4;
          var7.field_j = var7.field_j + var5;
          var7 = (FadingModalPanel) (var6.previous((byte) 61));
        }
        this.field_i = param2;
        this.field_n = param0;
        if (param1) {
          field_G = (String) null;
        }
    }

    final FadingModalPanel getTopOpenDialog(boolean param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = ZombieDawn.field_J;
        var2 = new IntrusiveDequeCursor(this.field_H);
        if (!param0) {
          this.hideAllDialogs(112);
        }
        var3 = (FadingModalPanel) (var2.last((byte) -116));
        while (var3 != null) {
          if (var3.field_H) {
            return var3;
          }
          var3 = (FadingModalPanel) (var2.previous((byte) 61));
        }
        return null;
    }

    public static void releaseStatics(int param0) {
        field_D = null;
        field_E = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
          return;
        }
        field_G = null;
    }

    final static void writeReflectionCheckReply(BitPacketBuffer param0, int param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_67_0 = null;
          StringBuilder stackIn_67_1 = null;
          String stackIn_68_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          ReflectionCheckRequest var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          ReflectionCheckRequest var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = ZombieDawn.field_J;
          try {
            var13 = (ReflectionCheckRequest) (Js5Archive.field_l.last((byte) 26));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            if (param1 < 57) {
              DialogLayer.isLoggedInOnline(-44);
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_l; var4++) {
              if (null != var13.field_n[var4]) {
                if (var13.field_n[var4].status == 2) {
                  var13.field_q[var4] = -5;
                }
                if (var13.field_n[var4].status == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_m[var4] != null) {
                if (var13.field_m[var4].status == 2) {
                  var13.field_q[var4] = -6;
                }
                if (var13.field_m[var4].status == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.position;
            param0.writeInt(-116, var17.field_o);
            for (var5 = 0; var17.field_l > var5; var5++) {
              if (var17.field_q[var5] != 0) {
                param0.writeByte(var17.field_q[var5], 111);
              } else {
                try {
                  var6_int = var17.field_h[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_n[var5].result);
                    var8 = var15.getInt((Object) null);
                    param0.writeByte(0, 64);
                    param0.writeInt(102, var8);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_n[var5].result);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_j[var5]);
                      param0.writeByte(0, 122);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_n[var5].result);
                        var8 = var26.getModifiers();
                        param0.writeByte(0, 29);
                        param0.writeInt(73, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_m[var5].result);
                    var25 = var17.field_i[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.writeByte(0, 89);
                    } else if (var10 instanceof Number) {
                      param0.writeByte(1, 12);
                      param0.writeLong(((Number) (var10)).longValue(), 121);
                    } else if (!(var10 instanceof String)) {
                      param0.writeByte(4, -119);
                    } else {
                      param0.writeByte(2, 61);
                      param0.writeTerminatedString(128, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_m[var5].result);
                      var8Lifetime1 = var27.getModifiers();
                      param0.writeByte(0, -84);
                      param0.writeInt(69, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.writeByte(-10, 74);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.writeByte(-11, -95);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.writeByte(-12, -113);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.writeByte(-13, -90);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.writeByte(-14, 18);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.writeByte(-15, -113);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.writeByte(-16, 53);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.writeByte(-17, -95);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.writeByte(-18, -103);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.writeByte(-19, -91);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.writeByte(-20, 37);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.writeByte(-21, 58);
                }
              }
            }
            param0.writeCrc32(-120, var4);
            var17.unlink(-27598);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var2;
            stackIn_67_1 = new StringBuilder().append("dn.R(");
            if (param0 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Sprite[] buildDecodedSprites(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ZombieDawn.field_J;
        var1 = new Sprite[DialWidgetPainter.field_h];
        if (param0 != 43) {
          return (Sprite[]) null;
        }
        for (var2 = 0; var2 < DialWidgetPainter.field_h; var2++) {
          var3 = RasterState.field_n[var2] * LongAndTextLoginPayload.field_c[var2];
          var20 = HighscoresScreen.field_m[var2];
          if (!HighscoreRequest.field_r[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var9[var6_int] = ArchiveLoadStep.field_a[TextHotspotRegion.bitAnd((int) var20[var6_int], 255)];
            }
            var1[var2] = new Sprite(FocusDelegatingButton.field_F, Zombie.field_pb, LogoPoseHelpers.field_d[var2], AchievementSubmission.field_o[var2], LongAndTextLoginPayload.field_c[var2], RasterState.field_n[var2], var21);
          } else {
            var22 = SoundEffectLibrary.field_f[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = GameWorld.intOr(ArchiveLoadStep.field_a[TextHotspotRegion.bitAnd((int) var20[var7], 255)], TextHotspotRegion.bitAnd((int) var22[var7], 255) << 24);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(FocusDelegatingButton.field_F, Zombie.field_pb, LogoPoseHelpers.field_d[var2], AchievementSubmission.field_o[var2], LongAndTextLoginPayload.field_c[var2], RasterState.field_n[var2], var16));
          }
        }
        RopeLadder.clearSpriteDecodeBuffers((byte) -114);
        return var1;
    }

    final UiWidget getFocusedChild(int param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 > -2) {
          this.getFocusedChild(-10);
        }
        var2 = new IntrusiveDequeCursor(this.field_H);
        var3 = (FadingModalPanel) (var2.last((byte) -116));
        while (var3 != null) {
          if (var3.field_H) {
            return var3.findFocusedChild((byte) 35);
          }
          var3 = (FadingModalPanel) (var2.previous((byte) 61));
        }
        return null;
    }

    final void advanceDialogAnimations(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 > -122) {
          field_J = (String) null;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var3 = (FadingModalPanel) (var2.last((byte) -116));
        while (var3 != null) {
          if (var3.tickLayerAndCheckHidden(2634)) {
            var3.unlink(-27598);
          }
          var3 = (FadingModalPanel) (var2.previous((byte) 61));
        }
        this.field_z = (UiWidget) ((Object) this.getTopOpenDialog(true));
    }

    final void addDialog(UiWidget param0, boolean param1) {
        FadingModalPanel var3 = null;
        try {
          if (!(param0 instanceof FadingModalPanel)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingModalPanel) (param0);
          this.field_H.addLast(var3, -112);
          var3.field_H = param1 ? true : false;
          var3.focusNext((byte) 107, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "dn.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void hideAllDialogs(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -636330975) {
          this.hideAllDialogs(-51);
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var3 = (FadingModalPanel) (var2.last((byte) -123));
        while (var3 != null) {
          var3.field_H = false;
          var3 = (FadingModalPanel) (var2.previous((byte) 61));
        }
        this.field_z = null;
    }

    final static boolean isLoggedInOnline(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -19301) {
          DialogLayer.releaseStatics(28);
        }
        stackIn_7_0 = (AccountResultHelpers.field_a >= 10) && (!FullscreenErrorDialog.field_Y) && (!LoginConnectionHelpers.isLoggedInConnection((byte) -64));
        return stackIn_7_0;
    }

    final void removeHiddenDialogs(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -36) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingModalPanel var3 = (FadingModalPanel) (var2.last((byte) -125));
        while (var3 != null) {
          if (var3.isFullyFadedOut((byte) 28)) {
            var3.unlink(-27598);
          }
          var3 = (FadingModalPanel) (var2.previous((byte) 61));
        }
    }

    public DialogLayer() {
        super(0, 0, DropdownItemList.field_N, PendingIntArrayRequest.field_l, (WidgetPainter) null, (WidgetListener) null);
        this.field_H = new IntrusiveDeque();
    }

    final static int hitTestMenuOption(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          if (param1) {
            stackIn_3_0 = 57;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = MarkerSliderPainter.field_k;
          while (ReflectionCheckRequest.field_r.length > var3_int) {
            var5 = FullscreenFocusCanvas.field_b[var3_int];
            if (var5 >= 0) {
              var6 = FullscreenErrorReason.measureMenuText(32564, true, ReflectionCheckRequest.field_r[var3_int]);
              var7 = TileableNoiseGenerator.field_d - (var6 >> 1);
              var4 = var4 + AbstractSprite.field_i;
              if (RankingSortHelpers.rectContains(var7 - DualLinkNode.field_m, 0, param2, var4, var6 + (DualLinkNode.field_m << 1), (DisplaySettingsDialog.field_Y << 1) + MusicPatch.field_k, param0)) {
                stackIn_11_0 = var5;
                return stackIn_11_0;
              }
              var4 = var4 + ((DisplaySettingsDialog.field_Y << 1) + AbstractSprite.field_i + MusicPatch.field_k);
            } else {
              var4 = var4 + WidgetContainer.field_G;
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "dn.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (this.field_h != null) {
          this.field_h.drawWidget(16777215, true, param0, (UiWidget) (this), param2);
        }
        if (param3 != 0) {
          return;
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_H);
        UiWidget var6 = (UiWidget) (var5.first((byte) -21));
        while (var6 != null) {
          var6.drawLayer(this.field_j + param0, param1, this.field_k + param2, param3 ^ 0);
          var6 = (UiWidget) (var5.next(17));
        }
    }

    static {
        field_I = new ContentTransitionPhase();
        field_G = "Names cannot start or end with space or underscore";
        field_D = new IntrusiveDeque();
        field_E = new Sprite(48, 48);
        field_J = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
