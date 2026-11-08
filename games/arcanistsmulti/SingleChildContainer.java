/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildContainer extends UiComponent implements UiContainerMarker {
    static SceneWidget field_D;
    static String field_x;
    static String field_A;
    static NameCheckRequest field_z;
    static int field_y;
    static int field_C;
    UiComponent field_B;

    final boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_B = (UiComponent) null;
          }
          stackIn_6_0 = (null != this.field_B) && (this.field_B.focusNext(0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_z = null;
        field_x = null;
        if (param0 != 23123) {
          String var2 = (String) null;
          SingleChildContainer.performLogin(-25, -49, false, (String) null, false, (String) null);
        }
        field_A = null;
        field_D = null;
    }

    final void blur(byte param0) {
        if (param0 != 29) {
          field_y = -126;
        }
        if (null != this.field_B) {
          this.field_B.blur((byte) 29);
        }
    }

    final static int performLogin(int param0, int param1, boolean param2, String param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_7_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_58_0 = false;
          int stackIn_85_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_107_0 = 0;
          RuntimeException stackIn_110_0 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          StringBuilder stackIn_113_1 = null;
          String stackIn_114_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (null == CredentialKind.field_c &&
              !ie.pollStatusSocket(-62, param4)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (param1 < 22) {
              stackIn_7_0 = 41;
              return stackIn_7_0;
            }
            if (pc.field_g == ResizableModalPanel.field_eb) {
              if (param4) {
                var10 = (String) null;
                fd.field_e = ci.createCredentials(false, (String) null, -95, fk.field_k, param5);
              } else {
                fd.field_e = cf.parseCredentials(param3, param5, (byte) -128, false);
              }
              he.field_e.position = 0;
              he.field_e.writeByte(14, (byte) -105);
              he.field_e.writeByte(fd.field_e.getCredentialKind(0).field_g, (byte) -106);
              we.sendKeepAlive(-1, (byte) 86);
              ResizableModalPanel.field_eb = ContextActionMenu.field_Db;
            }
            if (ResizableModalPanel.field_eb == ContextActionMenu.field_Db &&
              ContextActionMenu.hasIncomingBytes((byte) -86, 1)) {
              var6_int = UiContainer.field_z.readUnsignedByte((byte) -123);
              UiContainer.field_z.position = 0;
              if (0 == var6_int) {
                ResizableModalPanel.field_eb = SocketConnector.field_c;
              } else {
                on.field_g = var6_int;
                fj.field_h = -1;
                ResizableModalPanel.field_eb = lf.field_f;
              }
            }
            if (ResizableModalPanel.field_eb == SocketConnector.field_c &&
              ContextActionMenu.hasIncomingBytes((byte) -86, 8)) {
              of.field_j = UiContainer.field_z.readLong(-943038560);
              UiContainer.field_z.position = 0;
              SceneScrollPane.writeLoginBlock(param4, fd.field_e, (byte) 116, param2, param0);
              ResizableModalPanel.field_eb = co.field_h;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ResizableModalPanel.field_eb == co.field_h &&
              ContextActionMenu.hasIncomingBytes((byte) -86, 1)) {
              var6_intLifetime1 = UiContainer.field_z.readUnsignedByte((byte) -122);
              UiContainer.field_z.position = 0;
              AudioService.field_i = null;
              on.field_g = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  fj.field_h = -1;
                  ResizableModalPanel.field_eb = lf.field_f;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ProxySocketConnector.closeActiveConnection(false);
                  bb.field_h = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ResizableModalPanel.field_eb = bb.field_c;
                fj.field_h = -1;
              }
            }
            if (ResizableModalPanel.field_eb == bb.field_c &&
              pn.readServerStatus(-12564)) {
              fk.field_k = UiContainer.field_z.readLong(-943038560);
              fn.field_f = param5;
              qf.field_d = UiContainer.field_z.readUnsignedByte((byte) 115);
              BevelTextPainter.field_r = UiContainer.field_z.readUnsignedByte((byte) 93);
              ah.field_c = UiContainer.field_z.readUnsignedShort(-98);
              var6 = UiContainer.field_z.readOptionalString(103);
              var7 = UiContainer.field_z.readUnsignedByte((byte) -94);
              if ((1 & var7) != 0) {
                BevelBoxPainter.saveRandomData(-69);
              }
              if (!param4) {
                stackIn_46_0 = ((4 & var7) != 0);
                fd.field_a = stackIn_46_0;
                stackIn_49_0 = (0 != (var7 & 2));
                AlternateUsernameCredentials.field_p = stackIn_49_0;
                stackIn_52_0 = ((var7 & 8) != 0);
                wh.field_g = stackIn_52_0;
                if (wh.field_g) {
                  AlternateUsernameCredentials.field_p = true;
                }
              }
              stackIn_58_0 = (0 != (16 & var7));
              TextButton.field_E = stackIn_58_0;
              if (fl.field_a) {
                UiContainer.field_z.readUnsignedByte((byte) 110);
                PlayerActionMenu.field_g = UiContainer.field_z.readUnsignedByte((byte) -115);
                UiContainer.field_z.readInt(-10674);
                ResizableViewResizeListener.field_d = UiContainer.field_z.readUnsignedShort(-98);
                ra.field_f = new byte[ResizableViewResizeListener.field_d];
                for (var8 = 0; var8 < ResizableViewResizeListener.field_d; var8++) {
                  ra.field_f[var8] = UiContainer.field_z.readByte(6);
                }
              }
              ah.field_b = UiContainer.field_z.readString(-1);
              var11 = (CharSequence) ((Object) ah.field_b);
              nm.field_b = Js5ArchiveManager.normalizeNameForLookup(var11, -13);
              dd.field_j = UiContainer.field_z.readUnsignedByte((byte) 65);
              ResizableModalPanel.field_eb = qc.field_c;
              if (fd.field_e.getCredentialKind(0) == BufferedSocket.field_q) {
                DiskCacheRequest.field_y.saveAsLastLoginMethod(IconButtonPainter.getApplet(118), (byte) -93);
              } else {
                if (fd.field_e.getCredentialKind(0) == MusicPatchPcmStream.field_m) {
                  of.field_n.saveAsLastLoginMethod(IconButtonPainter.getApplet(120), (byte) -118);
                }
              }
              bb.field_h = false;
              if (var6 != null) {
                NodeHashTableIterator.setSettingsCookie(var6, IconButtonPainter.getApplet(108), 0);
              }
              if (0 >= ah.field_c &&
                !fd.field_a) {
                try {
                  JavaScriptBridge.callFunction(IconButtonPainter.getApplet(125), 108, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callFunctionWithArgs("zap", IconButtonPainter.getApplet(113), (byte) 114, new Object[]{TextFieldValidator.decodeBase37(fk.field_k, 29424)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (ah.field_c > 0) {
                Js5Transport.field_d = true;
              }
              he.field_e.installCipher(-107, hj.field_a);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                hj.field_a[var8Lifetime1] = hj.field_a[var8Lifetime1] + 50;
              }
              UiContainer.field_z.installCipher(90, hj.field_a);
              stackIn_85_0 = on.field_g;
              return stackIn_85_0;
            }
            if (ResizableModalPanel.field_eb == lf.field_f &&
              pn.readServerStatus(-12564)) {
              ProxySocketConnector.closeActiveConnection(false);
              if (7 == on.field_g &&
                !bb.field_h) {
                bb.field_h = true;
                stackIn_92_0 = -1;
                return stackIn_92_0;
              }
              if (on.field_g == 7) {
                on.field_g = 3;
              }
              MenuButtonPanel.field_E = UiContainer.field_z.readString(-1);
              bb.field_h = false;
              stackIn_96_0 = on.field_g;
              return stackIn_96_0;
            }
            if (null == CredentialKind.field_c) {
              if (bb.field_h) {
                if (rk.timeSinceLastInput(-68) <= 30000L) {
                  MenuButtonPanel.field_E = NumericDateInputWidget.field_R;
                } else {
                  MenuButtonPanel.field_E = DualLinkDeque.field_a;
                }
                bb.field_h = false;
                stackIn_105_0 = 3;
                return stackIn_105_0;
              }
              var6_intLifetime2 = ng.field_G;
              ng.field_G = SceneTextInput.field_Lb;
              bb.field_h = true;
              SceneTextInput.field_Lb = var6_intLifetime2;
            }
            stackIn_107_0 = -1;
            return stackIn_107_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_110_0 = var6_ref;
            stackIn_110_1 = new StringBuilder().append("wn.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            stackIn_113_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_114_2 = "null";
            } else {
              stackIn_114_2 = "{...}";
            }
            throw aa.wrapException((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    String getTooltip(boolean param0) {
        String var3 = null;
        String var2 = super.getTooltip(param0);
        if (this.field_B != null) {
          var3 = this.field_B.getTooltip(param0);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    UiComponent getFocusedChild(int param0) {
        if (param0 < 31) {
          return (UiComponent) null;
        }
        UiComponent var2 = this.field_B;
        if (var2 == null) {
          return null;
        }
        if (!var2.isFocused(-2116)) {
          return null;
        }
        return var2;
    }

    StringBuilder appendDebugTree(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 43 % ((param3 - 50) / 60);
          if (this.beginDebugEntry(param0, (byte) -90, param2, param1)) {
            this.appendDebugSummary(param0, param1, param2, 1);
            this.appendDebugChild(0, param2, param0, param1);
          }
          stackIn_3_0 = (StringBuilder) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wn.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != -2116) {
          this.isFocused(-106);
        }
        return null != this.getFocusedChild(103) ? true : false;
    }

    SingleChildContainer(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void drawLayer(byte param0, int param1, int param2, int param3) {
        if (param2 == 0 &&
          null != this.field_r) {
          this.field_r.paint((UiComponent) (this), 5592405, param1, param3, true);
        }
        if (param0 > -52) {
          this.getTopLayer(14);
        }
        if (this.field_B != null) {
          this.field_B.drawLayer((byte) -100, param1 + this.field_n, param2, param3 + this.field_j);
        }
    }

    final void appendDebugChild(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$10 = null;
        int var5_int = 0;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$11 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          discarded$10 = param2.append('\n');
          for (var5_int = param0; var5_int <= param3; var5_int++) {
            discarded$12 = param2.append(' ');
          }
          if (this.field_B != null) {
            this.field_B.appendDebugTree(param2, 1 + param3, param1, (byte) -93);
          } else {
            discarded$11 = param2.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("wn.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int getTopLayer(int param0) {
        if (param0 != 0) {
          BitmapFont var3 = (BitmapFont) null;
          SingleChildContainer.setDefaultFont((byte) 24, (BitmapFont) null);
        }
        return this.field_B == null ? 0 : this.field_B.getTopLayer(0);
    }

    private final boolean focusChildIfUnfocused(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return true;
          }
          stackIn_8_0 = (null != this.field_B) && (!this.field_B.isFocused(param1 ^ -2116)) && (this.field_B.focusNext(param1 ^ 0, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wn.K(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiComponent param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_B) {
            this.field_B.handlePointerRelease(param0, -20592, param2, this.field_j + param3, this.field_n + param4, param5);
          }
          if (param1 != -20592) {
            field_C = 79;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("wn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean handleMouseWheel(int param0, int param1, int param2, int param3, int param4, int param5, UiComponent param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 0) {
            this.field_B = (UiComponent) null;
          }
          stackIn_7_0 = (this.field_B != null) && (this.field_B.isFocused(-2116)) && (this.field_B.handleMouseWheel(param0, param1, param2, param3, param4, 0, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("wn.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B != null &&
            this.field_B.isFocused(-2116) &&
            this.field_B.handleKeyInput(param0, (byte) -127, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.getTooltip(false);
          }
          var5_int = param3;
          if (var5_int != 80) {
            return false;
          }
          if (ri.field_b[81]) {
            stackIn_13_0 = this.focusChildIfUnfocused(param0, 0);
          } else {
            stackIn_13_0 = this.focusUnfocusedChild(false, param0);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("wn.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handlePointerPress(int param0, int param1, UiComponent param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -70 % ((-42 - param4) / 35);
          stackIn_4_0 = (null != this.field_B) && (this.field_B.handlePointerPress(param0, param1, param2, param3 + this.field_j, 53, param5, this.field_n + param6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("wn.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void setDefaultFont(byte param0, BitmapFont param1) {
        try {
          if (param0 != 111) {
            BitmapFont var3 = (BitmapFont) null;
            SingleChildContainer.setDefaultFont((byte) 9, (BitmapFont) null);
          }
          mc.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "wn.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (null != this.field_B) {
            this.field_B.updatePointer(param0, this.field_n + param1, param2 ^ 0, this.field_j + param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wn.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void refreshChildLayout(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -75) {
          UiComponent var3 = (UiComponent) null;
          discarded$0 = this.focusUnfocusedChild(true, (UiComponent) null);
        }
        if (null != this.field_B) {
          this.field_B.refreshLayout((byte) 100);
        }
    }

    private final boolean focusUnfocusedChild(boolean param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_8_0 = (null != this.field_B) && (!this.field_B.isFocused(-2116)) && (this.field_B.focusNext(0, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
          StringBuilder var7 = (StringBuilder) null;
          this.appendDebugChild(-47, (Hashtable) null, (StringBuilder) null, -126);
        }
        super.setBounds(param0, param1, param2, param3, -75);
        this.refreshChildLayout((byte) -75);
    }

    static {
        field_x = " wand";
        field_A = "Graveyard:";
        field_C = 0;
    }
}
