/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ProgressMessageDialog extends ContentTransitionDialog implements ButtonActionListener {
    private StripedProgressBar field_pb;
    static String field_sb;
    private boolean field_xb;
    private BitmapFont field_ob;
    private boolean field_vb;
    private boolean field_zb;
    static int field_rb;
    static IntrusiveDeque field_tb;
    static int[] turnDurations;
    private boolean field_wb;
    static CipherPacketBuffer field_qb;
    static int[] field_ub;

    final void closeDialog(boolean param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (this.field_vb) {
          DisplayModeInfo.showLoginPanel((byte) -127);
        } else {
          if (this.field_zb) {
            GameClock.showLoginPanelWithoutMessage(0);
          }
        }
        if (!param0) {
          this.showConnectionRestored(62);
        }
    }

    final static AccountRequestReply pollUsernameAvailability(int param0, String param1) {
        RuntimeException var2 = null;
        AccountRequestReply stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        AccountRequestReply stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MouseWheelInput.field_c == ScrollPaneWithFooter.field_Kb) {
            return null;
          }
          if (param0 != 648093968) {
            stackIn_5_0 = (AccountRequestReply) null;
            return stackIn_5_0;
          }
          if (ClientException.field_d == MouseWheelInput.field_c &&
            param1.equals(EmailValidator.field_u)) {
            MouseWheelInput.field_c = ClientServiceHelpers.field_e;
            stackIn_12_0 = LoginDialog.field_ob;
            return stackIn_12_0;
          }
          MouseWheelInput.field_c = ScrollPaneWithFooter.field_Kb;
          LoginDialog.field_ob = null;
          EmailValidator.field_u = param1;
          stackIn_10_0 = null;
          return (AccountRequestReply) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("sh.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        turnDurations = null;
        field_sb = null;
        field_tb = null;
        if (!param0) {
          field_qb = (CipherPacketBuffer) null;
        }
        field_qb = null;
        field_ub = null;
    }

    final static int choosePopupX(int param0, int param1, int param2, int param3) {
        if (!(param2 + param3 > Rasterizer.field_e)) {
          return param2;
        }
        if (param2 + (param1 - param3) >= param0) {
          return param1 + param2 - param3;
        }
        return Rasterizer.field_e - param3;
    }

    final boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -30 / ((param3 + 75) / 36);
          if (13 != param2) {
            stackIn_4_0 = super.handleKeyInput(param0, param1, param2, -30);
            return stackIn_4_0;
          }
          this.closeDialog(true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("sh.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String readSettingsCookie(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_8_0 = null;
          String stackIn_14_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Virogrid.field_F ? 1 : 0;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (JavaScriptBridge.callJavaScript("getcookies", 6168, param1));
              var5 = DialWidgetPainter.split(var4, (byte) -123, ';');
              if (param0 >= 0) {
                field_tb = (IntrusiveDeque) null;
              }
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_8_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == NamedTextResourceHelpers.field_a) {
              stackIn_16_0 = param1.getParameter("settings");
              return stackIn_16_0;
            }
            stackIn_14_0 = NamedTextResourceHelpers.field_a;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("sh.CC(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void setFrameStyles(byte param0, int param1, FrameSkin param2, FrameSkin param3, int param4, int param5) {
        try {
          DelayedPacket.field_j = param4;
          RasterSnapshot.field_l = param2;
          BitwiseHelpers.field_d = param1;
          LoginCredentialType.field_g = param3;
          if (param0 != -40) {
            ProgressMessageDialog.releaseStatics(true);
          }
          Js5Archive.field_d = param5;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sh.WB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int randomInt(int param0, int param1) {
        if (param0 != 4712) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          ProgressMessageDialog.readSettingsCookie(76, (java.applet.Applet) null);
        }
        return TextEncodingHelpers.randomBelow(param1, (byte) -74, EditableTextWidget.field_M);
    }

    public void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_xb) {
            DualLinkHashTable.setLoginResultCode(3, -1);
            this.closeDialog(true);
          } else {
            LobbyGameListHelpers.openRelativePage("tochangedisplayname.ws", -17713, ContentTransitionDialog.getApplet((byte) 75));
          }
          if (param0 != 12085) {
            turnDurations = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("sh.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void fillGouraudTriangle(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var33 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = Virogrid.field_F ? 1 : 0;
        try {
          if (param16 <= param7 &&
            TriangleRasterizer.field_n > param15) {
            if (param4 < 0 &&
              param2 < 0 &&
              param8 < 0) {
              return;
            }
            if (param4 >= TriangleRasterizer.field_o &&
              param2 >= TriangleRasterizer.field_o &&
              TriangleRasterizer.field_o <= param8) {
              return;
            }
            var34 = param7 - param15;
            if (param14 != param15) {
              var18 = param4 << 16;
              var17_int = param4 << 16;
              var30 = param3 << 16;
              var29 = param3 << 16;
              var26 = param1 << 16;
              var25 = param1 << 16;
              var22 = param11 << 16;
              var21 = param11 << 16;
              var35 = -param15 + param14;
              var19 = (-param4 + param2 << 16) / var35;
              var20 = (-param4 + param8 << 16) / var34;
              if (var19 >= var20) {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (param13 - param1 << 16) / var34;
                var24 = (param12 - param11 << 16) / var35;
                var31 = (-param3 + param5 << 16) / var34;
                var23 = (-param11 + param10 << 16) / var34;
                var28 = (-param1 + param6 << 16) / var35;
                var33 = 1;
                var32 = (param9 - param3 << 16) / var35;
              } else {
                var27 = (-param1 + param6 << 16) / var35;
                var31 = (param9 - param3 << 16) / var35;
                var23 = (-param11 + param12 << 16) / var35;
                var32 = (-param3 + param5 << 16) / var34;
                var28 = (-param1 + param13 << 16) / var34;
                var24 = (param10 - param11 << 16) / var34;
                var33 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (param14 < 0) {
                  param15 = param14 - param15;
                  var25 = var25 + var27 * param15;
                  var30 = var30 + var32 * param15;
                  var21 = var21 + param15 * var23;
                  var29 = var29 + var31 * param15;
                  var17_int = var17_int + param15 * var19;
                  var18 = var18 + param15 * var20;
                  var22 = var22 + var24 * param15;
                  var26 = var26 + param15 * var28;
                  param15 = param14;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var29 = var29 + var31 * param15;
                  var21 = var21 + param15 * var23;
                  var17_int = var17_int + var19 * param15;
                  var25 = var25 + param15 * var27;
                  var26 = var26 + param15 * var28;
                  var30 = var30 + var32 * param15;
                  var18 = var18 + var20 * param15;
                  var22 = var22 + param15 * var24;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = TriangleRasterizer.field_m[param15];
                while (param14 > param15) {
                  var37 = var17_int >> 16;
                  if (TriangleRasterizer.field_o > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (0 == var38) {
                      if (var37 >= 0 &&
                        var37 < TriangleRasterizer.field_o) {
                        PasswordValidator.drawHalfBlendGouraudSpan(0, var29, 0, var38, var25, (byte) -80, var37 + var36Lifetime2, param0, 0, var21);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (TriangleRasterizer.field_o <= var38 + var37) {
                        var38 = -var37 + TriangleRasterizer.field_o - 1;
                      }
                      if (0 > var37) {
                        PasswordValidator.drawHalfBlendGouraudSpan(var40, var29 - var37 * var41, var41, var37 + var38, -(var40 * var37) + var25, (byte) 91, var36Lifetime2, param0, var39, -(var39 * var37) + var21);
                      } else {
                        PasswordValidator.drawHalfBlendGouraudSpan(var40, var29, var41, var38, var25, (byte) -104, var37 + var36Lifetime2, param0, var39, var21);
                      }
                    }
                  }
                  param15++;
                  if (TriangleRasterizer.field_n <= param15) {
                    return;
                  }
                  var29 = var29 + var31;
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                  var36Lifetime2 = var36Lifetime2 + Rasterizer.field_e;
                  var21 = var21 + var23;
                  var17_int = var17_int + var19;
                }
              }
              var36Lifetime3 = param7 - param14;
              if (0 == var36Lifetime3) {
                var27 = 0;
                var20 = 0;
                var31 = 0;
                var19 = 0;
                var32 = 0;
                var28 = 0;
                var24 = 0;
                var23 = 0;
              } else {
                var37Lifetime2 = param8 << 16;
                var38Lifetime2 = param10 << 16;
                var39Lifetime2 = param13 << 16;
                if (var33 == 0) {
                  var17_int = param2 << 16;
                  var29 = param9 << 16;
                  var21 = param12 << 16;
                  var25 = param6 << 16;
                } else {
                  var22 = param12 << 16;
                  var18 = param2 << 16;
                  var30 = param9 << 16;
                  var26 = param6 << 16;
                }
                var40Lifetime2 = param5 << 16;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
              }
            } else {
              if (param7 == param15) {
                var17_int = param4 << 16;
                var32 = 0;
                var23 = 0;
                var25 = param1;
                var22 = param12;
                var29 = param3;
                var21 = param11;
                var20 = 0;
                var28 = 0;
                var30 = param9;
                var31 = 0;
                var19 = 0;
                var27 = 0;
                var18 = param2 << 16;
                var24 = 0;
                var26 = param6;
              } else {
                var35 = -param14 + param7;
                if (param4 < param2) {
                  var29 = param3 << 16;
                  var17_int = param4 << 16;
                  var25 = param1 << 16;
                  var28 = (param13 - param6 << 16) / var35;
                  var27 = (-param1 + param13 << 16) / var34;
                  var31 = (param5 - param3 << 16) / var34;
                  var20 = (param8 - param2 << 16) / var35;
                  var24 = (param10 - param12 << 16) / var35;
                  var23 = (param10 - param11 << 16) / var34;
                  var30 = param9 << 16;
                  var22 = param12 << 16;
                  var19 = (param8 - param4 << 16) / var34;
                  var32 = (param5 - param9 << 16) / var35;
                  var26 = param6 << 16;
                  var21 = param11 << 16;
                  var18 = param2 << 16;
                } else {
                  var23 = (param10 - param12 << 16) / var35;
                  var20 = (param8 - param4 << 16) / var34;
                  var29 = param9 << 16;
                  var28 = (-param1 + param13 << 16) / var34;
                  var21 = param12 << 16;
                  var30 = param3 << 16;
                  var26 = param1 << 16;
                  var24 = (-param11 + param10 << 16) / var34;
                  var22 = param11 << 16;
                  var32 = (param5 - param3 << 16) / var34;
                  var25 = param6 << 16;
                  var17_int = param2 << 16;
                  var18 = param4 << 16;
                  var19 = (-param2 + param8 << 16) / var35;
                  var27 = (param13 - param6 << 16) / var35;
                  var31 = (param5 - param9 << 16) / var35;
                }
              }
              if (param15 < 0) {
                param15 = Math.min(-param15, -param15 + param14);
                var17_int = var17_int + param15 * var19;
                var29 = var29 + param15 * var31;
                var21 = var21 + var23 * param15;
                var25 = var25 + param15 * var27;
                var30 = var30 + var32 * param15;
                var26 = var26 + param15 * var28;
                var22 = var22 + param15 * var24;
                var18 = var18 + var20 * param15;
                param15 = 0;
              }
              var33 = 0;
            }
            if (param15 < 0) {
              param15 = -param15;
              var30 = var30 + var32 * param15;
              var29 = var29 + var31 * param15;
              var21 = var21 + param15 * var23;
              var26 = var26 + var28 * param15;
              var25 = var25 + var27 * param15;
              var17_int = var17_int + var19 * param15;
              var18 = var18 + var20 * param15;
              var22 = var22 + var24 * param15;
              param15 = 0;
            }
            var35Lifetime1 = TriangleRasterizer.field_m[param15];
            while (param15 < param7) {
              var36Lifetime1 = var17_int >> 16;
              if (TriangleRasterizer.field_o > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (0 <= var36Lifetime1 &&
                    var36Lifetime1 < TriangleRasterizer.field_o) {
                    PasswordValidator.drawHalfBlendGouraudSpan(0, var29, 0, var37Lifetime1, var25, (byte) 53, var35Lifetime1 + var36Lifetime1, param0, 0, var21);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= TriangleRasterizer.field_o) {
                    var37Lifetime1 = -1 - var36Lifetime1 + TriangleRasterizer.field_o;
                  }
                  if (var36Lifetime1 >= 0) {
                    PasswordValidator.drawHalfBlendGouraudSpan(var39Lifetime1, var29, var40Lifetime1, var37Lifetime1, var25, (byte) -80, var35Lifetime1 + var36Lifetime1, param0, var38Lifetime1, var21);
                  } else {
                    PasswordValidator.drawHalfBlendGouraudSpan(var39Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29, var40Lifetime1, var36Lifetime1 + var37Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, (byte) -123, var35Lifetime1, param0, var38Lifetime1, -(var38Lifetime1 * var36Lifetime1) + var21);
                  }
                }
              }
              param15++;
              if (TriangleRasterizer.field_n <= param15) {
                return;
              }
              var26 = var26 + var28;
              var18 = var18 + var20;
              var21 = var21 + var23;
              var29 = var29 + var31;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var22 = var22 + var24;
              var35Lifetime1 = var35Lifetime1 + Rasterizer.field_e;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_76_0 = var17;
          stackIn_76_1 = new StringBuilder().append("sh.TB(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    ProgressMessageDialog(WidgetLayerStack param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_vb = param3 ? true : false;
          this.field_ob = param1;
          this.field_zb = param4 ? true : false;
          this.field_wb = false;
          this.field_xb = false;
          this.field_pb = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_pb.field_z = true;
          this.addChild((UiWidget) (this.field_pb), (byte) -78);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void showResult(int param0, boolean param1, String param2) {
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        DialogMessagePane stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        DialogMessagePane var6 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_wb) {
            return;
          }
          stackIn_7_1 = (param1);
          this.field_wb = stackIn_7_1;
          stackIn_10_1 = (param0 == 256);
          this.field_xb = stackIn_10_1;
          this.field_pb.setColors(4210752, 8405024, 118);
          var6 = new DialogMessagePane(this, this.field_ob, param2);
          if (param0 == 5) {
            var6.addActionButton(11, SocketConnector.field_g, (byte) 126);
            var6.addActionButton(17, BoundedUrlRequest.field_k, (byte) 127);
          } else {
            if (param0 != 256) {
              stackIn_15_0 = var6;
              stackIn_15_1 = -1;
              if (!this.field_vb) {
                stackIn_16_2 = AccountChoicePanel.field_D;
              } else {
                stackIn_16_2 = MenuInputState.field_e;
              }
              ((DialogMessagePane) (Object) stackIn_15_0).addActionButton(stackIn_15_1, stackIn_16_2, (byte) 126);
            } else {
              var6.addButton((UiListener) (this), 260, MenuInputState.field_e);
            }
          }
          if (param0 != 3) {
            if (param0 != 4) {
              if (6 == param0) {
                var6.addActionButton(9, RequestResendSupport.field_f, (byte) 126);
              } else {
                if (param0 == 9) {
                  var6.addButton((UiListener) (this), 260, EmailValidator.field_n);
                }
              }
            } else {
              var6.addActionButton(8, DrawOfferMenuHelpers.field_b, (byte) 127);
            }
          } else {
            var6.addActionButton(7, AccountCreationForm.field_N, (byte) 127);
          }
          this.transitionToContent(var6, (byte) -53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("sh.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static void sendChatFilterSettings(byte param0, int param1) {
        CipherPacketBuffer var2 = IterableNodeHashTable.field_g;
        var2.writeCipheredOpcode(param1, 8);
        var2.writeByte(2, -66);
        if (param0 != -112) {
          return;
        }
        var2.writeByte(4, -95);
        var2.writeByte(StatefulWidgetPainter.packChatFilterSettings(4), -75);
    }

    final void showConnectionRestored(int param0) {
        this.field_pb.setColors(4210752, 2121792, 122);
        DialogMessagePane var2 = new DialogMessagePane(this, this.field_ob, GrowableIntList.field_h);
        if (param0 <= 115) {
          this.field_vb = true;
        }
        var2.addActionButton(15, ChatMessage.field_f, (byte) 126);
        this.transitionToContent(var2, (byte) -53);
    }

    static {
        field_sb = "Name is available";
        field_tb = new IntrusiveDeque();
        turnDurations = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
    }
}
