/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends InteractiveWidget {
    static Object field_C;
    private int field_H;
    private int field_A;
    private long field_E;
    private boolean field_G;
    static ia field_x;
    private int field_B;
    private boolean field_y;
    private int field_D;
    private long field_F;
    static SystemTaskService field_I;
    static int field_z;
    static int[] field_w;

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        int stackIn_53_2 = 0;
        int stackIn_59_2 = 0;
        String stackIn_79_2 = null;
        try {
          int var5_int = 127 / ((param0 + 53) / 33);
          this.field_F = kh.correctedCurrentTimeMillis(-97);
          if (60 != param2 &&
            param2 != 62) {
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_B != this.field_D) {
                this.deleteSelection((byte) -127);
              }
              if (this.field_H == -1 ||
                !(this.field_f.length() >= this.field_H)) {
                if (this.field_B >= this.field_f.length()) {
                  this.field_f = this.field_f + param2;
                  int dupTemp$0 = this.field_f.length();
                  this.field_B = dupTemp$0;
                  this.field_D = dupTemp$0;
                } else {
                  this.field_f = this.field_f.substring(0, this.field_B) + param2 + this.field_f.substring(this.field_B, this.field_f.length());
                  this.field_B = this.field_B + 1;
                  this.field_D = this.field_B;
                }
                this.notifyTextChanged((byte) -75);
              }
              return true;
            }
            if (param1 != 85) {
              if (param1 == 101) {
                if (this.field_D != this.field_B) {
                  this.deleteSelection((byte) -87);
                  return true;
                }
                if (this.field_B >= this.field_f.length()) {
                  return false;
                }
                this.field_D = 1 + this.field_B;
                this.deleteSelection((byte) 43);
                return true;
              }
              if (param1 == 13) {
                this.clearText((byte) -2);
                return true;
              }
              if (param1 == 96) {
                if (this.field_B > 0) {
                  int stackIn_58_1 = 120;
                  if (lp.heldKeys[82]) {
                    stackIn_59_2 = this.findPreviousWordBoundary((byte) 76);
                  } else {
                    stackIn_59_2 = -1 + this.field_B;
                  }
                  this.moveCaret((byte) stackIn_58_1, stackIn_59_2);
                  return true;
                }
              } else if (param1 != 97) {
                if (102 == param1) {
                  this.moveCaret((byte) 69, 0);
                  return true;
                }
                if (param1 == 103) {
                  this.moveCaret((byte) 59, this.field_f.length());
                  return true;
                }
                if (param1 == 84) {
                  this.submitText(-1);
                  return true;
                }
                if (lp.heldKeys[82] &&
                  param1 == 65) {
                  this.cutSelection(true);
                  return true;
                }
                if (lp.heldKeys[82] &&
                  param1 == 66) {
                  this.copySelection(-116);
                  return true;
                }
                if (lp.heldKeys[82] &&
                  67 == param1) {
                  this.pasteClipboardText(-1);
                  return true;
                }
              } else if (this.field_B < this.field_f.length()) {
                int stackIn_52_1 = 53;
                if (!lp.heldKeys[82]) {
                  stackIn_53_2 = 1 + this.field_B;
                } else {
                  stackIn_53_2 = this.findNextWordBoundary(0);
                }
                this.moveCaret((byte) stackIn_52_1, stackIn_53_2);
                return true;
              }
            } else {
              if (this.field_D != this.field_B) {
                this.deleteSelection((byte) -118);
                return true;
              }
              if (this.field_B > 0) {
                this.field_D = this.field_B - 1;
                this.deleteSelection((byte) 14);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_78_0 = var5;
          StringBuilder stackIn_78_1 = new StringBuilder().append("bm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    private final void pasteClipboardText(int param0) {
        try {
          try {
            String var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection((byte) -81);
            this.insertTextAtCaret(var2, (byte) 126);
          } catch (Exception exception) {
          }
          if (param0 == -1) {
            return;
          }
          field_I = (SystemTaskService) null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet m(int param0) {
        if (param0 < 106) {
          PcmSample var2 = (PcmSample) null;
          EditableTextField.a((byte) -67, (PcmSample) null);
          if (hu.field_a != null) {
            return hu.field_a;
          }
          return (java.applet.Applet) ((Object) BufferedRandomAccessFile.field_f);
        }
        if (hu.field_a != null) {
          return hu.field_a;
        }
        return (java.applet.Applet) ((Object) BufferedRandomAccessFile.field_f);
    }

    private final int findPreviousWordBoundary(byte param0) {
        int var2;
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_B == 0) {
          return this.field_B;
        }
        int var3 = 85 % ((param0 - 13) / 39);
        for (var2 = -1 + this.field_B; var2 > 0; var2--) {
          if (this.field_f.charAt(-1 + var2) == 32) {
            return var2;
          }
        }
        return var2;
    }

    final void setText(int param0, String param1, boolean param2) {
        String stackIn_15_2 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_f = param1;
          if (param0 != -20975) {
            return;
          }
          int var4_int = param1.length();
          if (this.field_H != -1 &&
            this.field_H < var4_int) {
            this.field_f = this.field_f.substring(0, this.field_H);
          }
          int dupTemp$1 = this.field_f.length();
          this.field_D = dupTemp$1;
          this.field_B = dupTemp$1;
          if (param2) {
            return;
          }
          this.notifyTextChanged((byte) -75);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("bm.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static SoundPlayback a(byte param0, PcmSample param1) {
        String stackIn_8_2 = null;
        try {
          if (param0 == -70) {
            SoundPlayback stackIn_4_0 = am.a(param1, false);
            return stackIn_4_0;
          }
          SoundPlayback stackIn_2_0 = (SoundPlayback) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("bm.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        if (null == this.field_e) {
          if (param0 > 64) {
            return;
          }
          int discarded$6 = this.findNextWordBoundary(125);
          return;
        }
        if (param1 != 0) {
          if (param0 > 64) {
            return;
          }
          int discarded$5 = this.findNextWordBoundary(125);
          return;
        }
        this.field_e.paintWidget(this.field_u, -7592, param3, (UiWidget) (this), param2);
        if (!(this.field_e instanceof TextWidgetRenderer)) {
          if (param0 > 64) {
            return;
          }
          int discarded$4 = this.findNextWordBoundary(125);
          return;
        }
        TextWidgetRenderer var8 = (TextWidgetRenderer) ((Object) this.field_e);
        if (this.field_D == this.field_B) {
          long var6 = kh.correctedCurrentTimeMillis(-62);
          if ((-this.field_F + var6) % 1000L >= 500L) {
            if (param0 > 64) {
              return;
            }
            int discarded$1 = this.findNextWordBoundary(125);
            return;
          }
          var8.paintCaret((byte) 71, param3, param2, this.field_B, (UiWidget) (this));
          if (param0 > 64) {
            return;
          }
          int discarded$0 = this.findNextWordBoundary(125);
          return;
        }
        var8.paintSelection(this.field_D, this.field_B, param2, param3, (UiWidget) (this), (byte) -123);
        long var6Lifetime1 = kh.correctedCurrentTimeMillis(-62);
        if ((-this.field_F + var6Lifetime1) % 1000L >= 500L) {
          if (param0 > 64) {
            return;
          }
          int discarded$2 = this.findNextWordBoundary(125);
          return;
        }
        var8.paintCaret((byte) 71, param3, param2, this.field_B, (UiWidget) (this));
        if (param0 > 64) {
          return;
        }
        int discarded$3 = this.findNextWordBoundary(125);
        return;
    }

    void notifyTextChanged(byte param0) {
        if (this.field_o instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_o)).onTextChanged(this, -6525);
        }
        if (param0 == -75) {
          return;
        }
        field_I = (SystemTaskService) null;
    }

    EditableTextField(String param0, WidgetEventListener param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_A = -1;
        this.field_G = false;
        try {
          this.field_H = param2;
          this.field_e = ArchiveRequest.field_n.field_n;
          this.setText(-20975, param0, true);
          this.field_y = true;
          this.field_F = kh.correctedCurrentTimeMillis(-88);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void cutSelection(boolean param0) {
        this.copySelection(-120);
        if (param0) {
          this.deleteSelection((byte) -85);
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.pointerPressed(9, 25, 35, 10, 41, (UiWidget) null, -23);
        this.deleteSelection((byte) -85);
    }

    private final void deleteSelection(byte param0) {
        int var2 = -51 / ((-40 - param0) / 32);
        if (this.field_B != this.field_D) {
          int var3 = this.field_B <= this.field_D ? this.field_B : this.field_D;
          int var4 = this.field_B > this.field_D ? this.field_B : this.field_D;
          this.field_D = var3;
          this.field_B = var3;
          this.field_f = this.field_f.substring(0, var3) + this.field_f.substring(var4, this.field_f.length());
          this.notifyTextChanged((byte) -75);
        }
    }

    private final void scrollCaretIntoView(int param0) {
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!this.field_y) {
          this.field_j = 0;
          this.field_l = 0;
          return;
        }
        if (!(this.field_e instanceof TextWidgetRenderer)) {
          return;
        }
        TextWidgetRenderer var9 = (TextWidgetRenderer) ((Object) this.field_e);
        TextLayout var3 = var9.getTextLayout((byte) 96, (UiWidget) (this));
        int var4 = var3.getMaxLineRightX((byte) 24);
        int var5 = var9.getTextAreaWidth((UiWidget) (this), -64);
        int var6 = var9.getFontLineHeight(-4) >> 1;
        if (var4 < -var6 + var5) {
          this.field_l = 0;
          this.field_j = 0;
          return;
        }
        int var7 = this.field_j + var3.getXForTextOffset(this.field_B, -127);
        if (var5 - var6 < var7) {
          this.field_j = -var7 - var6 + (var5 + this.field_j);
        } else if (var6 > var7) {
          this.field_j = this.field_j + var6 - var7;
        }
        if (param0 < this.field_j) {
          this.field_j = 0;
          return;
        }
        if (-var5 + var6 <= this.field_j) {
          return;
        }
        this.field_j = -var5 + var6;
        return;
    }

    private final void moveCaret(byte param0, int param1) {
        this.field_B = param1;
        if (param0 > 30) {
          if (!lp.heldKeys[81]) {
            this.field_D = this.field_B;
          }
          return;
        }
        this.field_F = 35L;
        if (!lp.heldKeys[81]) {
          this.field_D = this.field_B;
        }
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointer((byte) 126, param1, param2, param3);
          if (param0 <= 13) {
            this.field_B = -1;
          }
          this.scrollCaretIntoView(0);
          if (this.field_i == 1) {
            if (this.field_e instanceof TextWidgetRenderer) {
              TextWidgetRenderer var7 = (TextWidgetRenderer) ((Object) this.field_e);
              int var6 = var7.findTextOffsetAtScreenPosition((UiWidget) (this), param3, param2, cf.field_g, 3, ic.field_b);
              if (-1 != var6) {
                if (this.field_G && var6 < this.field_A &&
                  var6 > this.field_D) {
                  var6 = this.field_A;
                }
                this.field_B = var6;
              }
            }
            this.field_F = kh.correctedCurrentTimeMillis(-60);
          }
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "bm.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 < -33) {
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        }
        PcmSample var2 = (PcmSample) null;
        EditableTextField.a((byte) -72, (PcmSample) null);
        field_x = null;
        field_I = null;
        field_C = null;
        field_w = null;
    }

    private final void submitText(int param0) {
        if (param0 == -1) {
          if (this.field_o instanceof TextFieldListener) {
            ((TextFieldListener) (this.field_o)).onTextSubmitted(this, -40);
          }
          return;
        }
        this.field_A = 14;
        if (this.field_o instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_o)).onTextSubmitted(this, -40);
        }
    }

    private final int findNextWordBoundary(int param0) {
        int var3;
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var2 = this.field_f.length();
        if (param0 != 0) {
          return -109;
        }
        if (var2 == this.field_B) {
          return this.field_B;
        }
        for (var3 = 1 + this.field_B; var2 > var3; var3++) {
          if (this.field_f.charAt(-1 + var3) == 32) {
            return var3;
          }
        }
        return var3;
    }

    final void clearText(byte param0) {
        this.field_f = "";
        this.field_B = 0;
        this.field_D = 0;
        this.notifyTextChanged((byte) -75);
        if (param0 != -2) {
          this.field_y = false;
        }
    }

    private final void copySelection(int param0) {
        try {
          if (param0 > -98) {
            this.field_D = -50;
            String var2 = this.getSelectedText((byte) 97);
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
            return;
          }
          String var2Lifetime1 = this.getSelectedText((byte) 97);
          if (var2Lifetime1.length() <= 0) {
            return;
          }
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void insertTextAtCaret(String param0, byte param1) {
        if (this.field_H != -1) {
          int var3_int = this.field_H - this.field_f.length();
          if (var3_int >= 0) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_B == this.field_f.length()) {
          this.field_f = this.field_f + param0;
        } else {
          this.field_f = this.field_f.substring(0, this.field_B) + param0 + this.field_f.substring(this.field_B, this.field_f.length());
        }
        if (param1 <= 120) {
          return;
        }
        try {
          this.field_B = this.field_B + param0.length();
          this.field_D = this.field_B;
          this.notifyTextChanged((byte) -75);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "bm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String getSelectedText(byte param0) {
        int var2 = this.field_D < this.field_B ? this.field_D : this.field_B;
        if (param0 > 80) {
          int var3 = this.field_D < this.field_B ? this.field_B : this.field_D;
          return this.field_f.substring(var2, var3);
        }
        this.drawWidget((byte) 107, -41, -122, -11);
        int var3Lifetime1 = this.field_D < this.field_B ? this.field_B : this.field_D;
        return this.field_f.substring(var2, var3Lifetime1);
    }

    final boolean pointerPressed(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        int stackIn_7_2 = 0;
        String stackIn_22_2 = null;
        try {
          if (!super.pointerPressed((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_e instanceof TextWidgetRenderer)) {
            return false;
          }
          int var8_int = ((TextWidgetRenderer) ((Object) this.field_e)).findTextOffsetAtScreenPosition((UiWidget) (this), param1, param4, cf.field_g, param0 - 31, ic.field_b);
          int stackIn_6_1 = 82;
          stackIn_7_2 = (var8_int == -1) ? (0) : (var8_int);
          this.moveCaret((byte) stackIn_6_1, stackIn_7_2);
          long var8_long = kh.correctedCurrentTimeMillis(param0 - 125);
          boolean stackIn_10_1 = !(var8_long - this.field_E >= 250L);
          this.field_G = stackIn_10_1;
          if (this.field_G) {
            this.field_D = this.findPreviousWordBoundary((byte) 97);
            this.field_B = this.findNextWordBoundary(0);
            if (this.field_B > 0 &&
              this.field_f.charAt(this.field_B - 1) == 32) {
              this.field_B = this.field_B - 1;
            }
            this.field_A = this.field_B;
          }
          this.field_E = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var8;
          StringBuilder stackIn_21_1 = new StringBuilder().append("bm.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_x = new ia();
        field_w = new int[4];
    }
}
