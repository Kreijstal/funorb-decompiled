/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputWidget extends ButtonWidget {
    private long field_T;
    static String field_P;
    static PacketBuffer field_R;
    private int field_O;
    static int field_Q;
    private boolean field_U;
    private int field_V;
    private long field_X;
    private boolean field_M;
    private int field_W;
    private int field_S;
    static IndexedSprite field_N;

    final boolean handleKeyInput(int param0, char param1, UiWidget param2, int param3) {
        int dupTemp$0 = 0;
        boolean stackIn_26_1 = false;
        int stackIn_27_2 = 0;
        boolean stackIn_33_1 = false;
        int stackIn_34_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_T = bl.monotonicMillis((byte) 45);
          if (param1 != 60 &&
            param1 != 62) {
            if (param1 >= 32 &&
              param1 <= 126) {
              if (this.field_S != this.field_O) {
                this.deleteSelectedText(false);
              }
              if (this.field_W != -1 &&
                this.field_j.length() >= this.field_W) {
                return true;
              }
              if (this.field_O >= this.field_j.length()) {
                this.field_j = this.field_j + param1;
                dupTemp$0 = this.field_j.length();
                this.field_O = dupTemp$0;
                this.field_S = dupTemp$0;
              } else {
                this.field_j = this.field_j.substring(0, this.field_O) + param1 + this.field_j.substring(this.field_O, this.field_j.length());
                this.field_O = this.field_O + 1;
                this.field_S = this.field_O;
              }
              this.notifyTextChanged(param3 ^ -14400);
              return true;
            }
            if (param0 == 85) {
              if (this.field_O != this.field_S) {
                this.deleteSelectedText(false);
                return true;
              }
              if (this.field_O > 0) {
                this.field_S = -1 + this.field_O;
                this.deleteSelectedText(false);
                return true;
              }
            } else {
              if (param0 == 101) {
                if (this.field_O != this.field_S) {
                  this.deleteSelectedText(false);
                  return true;
                }
                if (this.field_O < this.field_j.length()) {
                  this.field_S = this.field_O + 1;
                  this.deleteSelectedText(false);
                  return true;
                }
              } else {
                if (param0 == 13) {
                  this.clearInputText(true);
                  return true;
                }
                if (param0 != 96) {
                  if (97 != param0) {
                    if (param0 == 102) {
                      this.b(false, 0);
                      return true;
                    }
                    if (param0 == 103) {
                      this.b(false, this.field_j.length());
                      return true;
                    }
                    if (84 == param0) {
                      this.h(97);
                      return true;
                    }
                    if (lc.field_m[82] &&
                      param0 == 65) {
                      this.f(102);
                      return true;
                    }
                    if (lc.field_m[82] &&
                      param0 == 66) {
                      this.copySelectedTextToClipboard((byte) -60);
                      return true;
                    }
                    if (lc.field_m[82] &&
                      param0 == 67) {
                      this.pasteClipboardText(param3 + 6458);
                      return true;
                    }
                  } else {
                    if (this.field_O < this.field_j.length()) {
                      stackIn_33_1 = false;
                      if (!lc.field_m[82]) {
                        stackIn_34_2 = this.field_O + 1;
                      } else {
                        stackIn_34_2 = this.findNextWordBoundary(param3 + 6329);
                      }
                      this.b(stackIn_33_1, stackIn_34_2);
                      return true;
                    }
                  }
                } else {
                  if (this.field_O > 0) {
                    stackIn_26_1 = false;
                    if (lc.field_m[82]) {
                      stackIn_27_2 = this.findPreviousWordBoundary((byte) -110);
                    } else {
                      stackIn_27_2 = -1 + this.field_O;
                    }
                    this.b(stackIn_26_1, stackIn_27_2);
                    return true;
                  }
                }
              }
            }
            if (param3 == -6208) {
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("pm.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_P = (String) null;
        }
        field_R = null;
        field_P = null;
        field_N = null;
    }

    private final void copySelectedTextToClipboard(byte param0) {
        if (param0 != -60) {
          field_R = (PacketBuffer) null;
        }
        String var2 = this.getSelectedText(-112);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(param0 ^ 67))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean handlePointerPress(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        boolean stackIn_4_1 = false;
        int stackIn_5_2 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6) &&
            this.painter instanceof rk) {
            var8_int = ((rk) ((Object) this.painter)).hitTestCaretIndex(param5, param6, MouseInputHandler.field_g, bo.field_d, 98, (UiWidget) (this));
            stackIn_4_1 = false;
            if (-1 == var8_int) {
              stackIn_5_2 = 0;
            } else {
              stackIn_5_2 = var8_int;
            }
            this.b(stackIn_4_1, stackIn_5_2);
            var8_long = bl.monotonicMillis((byte) 115);
            stackIn_8_1 = !(-this.field_X + var8_long >= 250L);
            this.field_M = stackIn_8_1;
            if (this.field_M) {
              this.field_S = this.findPreviousWordBoundary((byte) -110);
              this.field_O = this.findNextWordBoundary(114);
              if (this.field_O > 0 &&
                32 == this.field_j.charAt(-1 + this.field_O)) {
                this.field_O = this.field_O - 1;
              }
              this.field_V = this.field_O;
            }
            this.field_X = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("pm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void clearInputText(boolean param0) {
        this.field_S = 0;
        if (!param0) {
          this.field_V = 88;
        }
        this.field_j = "";
        this.field_O = 0;
        this.notifyTextChanged(8192);
    }

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 110) {
          TextInputWidget.releaseStatics(true);
        }
        var2 = this.field_j.length();
        if (this.field_O == var2) {
          return this.field_O;
        }
        for (var3 = 1 + this.field_O; var3 < var2; var3++) {
          if (this.field_j.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    final void renderWidget(int param0, int param1, int param2, int param3) {
        rk var8 = null;
        long var6 = 0L;
        if (param0 != -2) {
          this.field_O = -67;
        }
        if (null != this.painter &&
          0 == param2) {
          this.painter.paintWidget(this.field_F, param1, -15112, param3, (UiWidget) (this));
          if (this.painter instanceof rk) {
            var8 = (rk) ((Object) this.painter);
            if (this.field_S != this.field_O) {
              var8.drawSelection(this.field_S, param1, this.field_O, param3, param0 ^ -93, (UiWidget) (this));
            }
            var6 = bl.monotonicMillis((byte) 56);
            if (500L > (-this.field_T + var6) % 1000L) {
              var8.drawCaret((UiWidget) (this), (byte) 2, param3, this.field_O, param1);
            }
          }
        }
    }

    private final void deleteSelectedText(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_S != this.field_O) {
          var2 = this.field_O <= this.field_S ? this.field_O : this.field_S;
          var3 = this.field_O > this.field_S ? this.field_O : this.field_S;
          this.field_S = var2;
          this.field_O = var2;
          this.field_j = this.field_j.substring(0, var2) + this.field_j.substring(var3, this.field_j.length());
          this.notifyTextChanged(8192);
        }
        if (param0) {
          this.field_V = 105;
        }
    }

    private final void g(byte param0) {
        mp var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rk var9;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.field_U) {
          this.field_z = 0;
          this.field_q = 0;
          return;
        }
        if (!(this.painter instanceof rk)) {
          return;
        }
        var9 = (rk) ((Object) this.painter);
        var3 = var9.getTextLayout((UiWidget) (this), -112);
        if (param0 >= -60) {
          this.field_W = -107;
        }
        var4 = var3.width(101);
        var5 = var9.getAvailableTextWidth((UiWidget) (this), true);
        var6 = var9.getLineHeight(0) >> 1;
        if (var4 < var5 - var6) {
          this.field_z = 0;
          this.field_q = 0;
          return;
        }
        var7 = this.field_z + var3.characterX(52224, this.field_O);
        if (var5 - var6 >= var7) {
          if (var7 < var6) {
            this.field_z = this.field_z + var6 - var7;
          }
        } else {
          this.field_z = this.field_z + (-var7 - (-var5 + var6));
        }
        if (this.field_z > 0) {
          this.field_z = 0;
        } else {
          if (-var5 + var6 > this.field_z) {
            this.field_z = -var5 + var6;
          }
        }
        return;
    }

    TextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.field_M = false;
        this.field_V = -1;
        this.field_X = 0L;
        try {
          this.field_W = param2;
          this.painter = ra.field_o.field_o;
          this.setInputText(true, param0, (byte) 108);
          this.field_U = true;
          this.field_T = bl.monotonicMillis((byte) 106);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String getSelectedText(int param0) {
        int var2 = this.field_O > this.field_S ? this.field_S : this.field_O;
        int var3 = this.field_O <= this.field_S ? this.field_S : this.field_O;
        if (param0 >= -98) {
          ResourceArchive var4 = (ResourceArchive) null;
          TextInputWidget.a((ResourceArchive) null, -5, 40, (ResourceArchive) null, -102);
        }
        return this.field_j.substring(var2, var3);
    }

    private final void pasteClipboardText(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelectedText(false);
            if (param0 != 250) {
              return;
            }
            this.insertText(var2, (byte) 112);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void updatePointerState(int param0, UiWidget param1, int param2, int param3) {
        rk var5 = null;
        int var6 = 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.g((byte) -84);
          if (1 == this.field_u) {
            if (this.painter instanceof rk) {
              var5 = (rk) ((Object) this.painter);
              var6 = var5.hitTestCaretIndex(param2, param3, MouseInputHandler.field_g, bo.field_d, 98, (UiWidget) (this));
              if (var6 != -1) {
                if (this.field_M &&
                  var6 < this.field_V &&
                  this.field_S < var6) {
                  var6 = this.field_V;
                }
                this.field_O = var6;
              }
            }
            this.field_T = bl.monotonicMillis((byte) 121);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pm.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void notifyTextChanged(int param0) {
        if (this.field_A instanceof TextInputListener) {
          ((TextInputListener) (this.field_A)).onTextInputChanged(this, 0);
        }
        if (param0 != 8192) {
          this.field_T = 67L;
        }
    }

    private final void b(boolean param0, int param1) {
        this.field_O = param1;
        if (!lc.field_m[81]) {
          this.field_S = this.field_O;
        }
        if (param0) {
          String var4 = (String) null;
          this.insertText((String) null, (byte) -92);
        }
    }

    private final int findPreviousWordBoundary(byte param0) {
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        }
        for (var2 = this.field_O - 1; var2 > 0; var2--) {
          if (32 != this.field_j.charAt(var2 - 1)) {
            continue;
          }
          break;
        }
        if (param0 != -110) {
          this.h(15);
        }
        return var2;
    }

    private final void insertText(String param0, byte param1) {
        int var3_int = 0;
        if (this.field_W != -1) {
          var3_int = this.field_W - this.field_j.length();
          if (0 <= var3_int) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_O != this.field_j.length()) {
          this.field_j = this.field_j.substring(0, this.field_O) + param0 + this.field_j.substring(this.field_O, this.field_j.length());
        } else {
          this.field_j = this.field_j + param0;
        }
        this.field_O = this.field_O + param0.length();
        if (param1 <= 109) {
          return;
        }
        try {
          this.field_S = this.field_O;
          this.notifyTextChanged(8192);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        this.copySelectedTextToClipboard((byte) -60);
        this.deleteSelectedText(false);
        if (param0 != 102) {
          this.b(true, -83);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (null != ui.field_j) {
          Waypoint.a(ui.field_j, -123);
        }
        if (param0) {
          ResourceArchive var3 = (ResourceArchive) null;
          TextInputWidget.a((ResourceArchive) null, -81, 46, (ResourceArchive) null, -115);
        }
        if (null != pk.field_b) {
          pk.field_b.b(param1, (byte) 47);
        }
        EmailAvailabilityValidator.drawNameEntryPopup(param1, -19);
        if (null != bk.field_i) {
          bk.field_i.c(param1, -1);
        }
        ContentTransitionDialog.a(param1, param0);
    }

    final static PaletteBitmapFont a(ResourceArchive param0, int param1, int param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        PaletteBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ud.loadSpriteSheet(param2, param3, param1, (byte) -42)) {
            return null;
          }
          if (param4 != -29435) {
            field_R = (PacketBuffer) null;
          }
          stackIn_6_0 = me.createPaletteFont(param0.a(param2, true, param1), true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pm.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void h(int param0) {
        if (this.field_A instanceof TextInputListener) {
          ((TextInputListener) (this.field_A)).onTextInputSubmitted(this, true);
        }
        if (param0 != 97) {
          this.field_S = -78;
        }
    }

    final void setInputText(boolean param0, String param1, byte param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_j = param1;
          var4_int = param1.length();
          if (-1 != this.field_W &&
            this.field_W < var4_int) {
            this.field_j = this.field_j.substring(0, this.field_W);
          }
          dupTemp$1 = this.field_j.length();
          this.field_S = dupTemp$1;
          this.field_O = dupTemp$1;
          if (!param0) {
            this.notifyTextChanged(8192);
          }
          if (param2 <= 102) {
            this.renderWidget(91, 117, 22, -113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pm.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_P = null;
        field_R = new PacketBuffer(256);
    }
}
