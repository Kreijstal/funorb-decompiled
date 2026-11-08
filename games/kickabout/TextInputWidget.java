/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputWidget extends TextButton {
    private boolean field_H;
    private long field_J;
    private int field_I;
    private int field_T;
    private int field_S;
    private boolean field_G;
    private long field_L;
    private int field_Q;
    static Sprite field_N;
    static boolean[] field_O;
    static Sprite field_E;
    static int field_P;
    static String field_M;
    static String field_U;
    static float field_R;
    static String field_K;

    private final void moveCaret(int param0, int param1) {
        this.field_I = param0;
        if (!GameplayHelpScreen.field_G[81]) {
          this.field_Q = this.field_I;
        }
        if (param1 != 20) {
          field_E = (Sprite) null;
        }
    }

    final static String a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_E = (Sprite) null;
          }
          var2_int = PlayerInputEvent.a(LobbyMatchPreview.field_c, (byte) -105, ScrollContainer.field_Ib);
          if (1 == var2_int) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_8_0 = (String) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ga.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void m(int param0) {
        if (this.field_k instanceof TextInputListener) {
          ((TextInputListener) (this.field_k)).onEnterPressed(-86, this);
        }
        if (param0 <= 66) {
          this.field_Q = 66;
        }
    }

    public static void l(int param0) {
        field_E = null;
        field_U = null;
        field_N = null;
        field_K = null;
        field_O = null;
        if (param0 != 0) {
          field_P = 82;
        }
        field_M = null;
    }

    private final String getSelectedText(int param0) {
        if (param0 != 82) {
          return (String) null;
        }
        int var2 = this.field_Q < this.field_I ? this.field_Q : this.field_I;
        int var3 = this.field_I > this.field_Q ? this.field_I : this.field_Q;
        return this.field_q.substring(var2, var3);
    }

    private final void copySelectedTextToClipboard(byte param0) {
        if (param0 < 99) {
          this.clearInputText((byte) 116);
        }
        String var2 = this.getSelectedText(82);
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(82))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void pasteFromClipboard(boolean param0) {
        try {
          String stackIn_4_1 = null;
          boolean stackIn_5_2 = false;
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          String var3 = null;
          if (!param0) {
            var3 = (String) null;
            this.setInputText((String) null, (byte) -122, true);
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelectedText(-126);
            stackIn_4_1 = var2;
            stackIn_5_2 = !(param0);
            this.insertTextAtCaret(stackIn_4_1, stackIn_5_2);
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

    void m(byte param0) {
        if (param0 > -57) {
          this.m(49);
        }
        if (this.field_k instanceof TextInputListener) {
          ((TextInputListener) (this.field_k)).onTextChanged((byte) 113, this);
        }
    }

    final void setInputText(String param0, byte param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.field_q = param0;
          var4_int = param0.length();
          if (this.field_S != -1 &&
            this.field_S < var4_int) {
            this.field_q = this.field_q.substring(0, this.field_S);
          }
          dupTemp$1 = this.field_q.length();
          this.field_Q = dupTemp$1;
          this.field_I = dupTemp$1;
          if (!param2) {
            this.m((byte) -83);
          }
          if (param1 != -17) {
            this.field_S = 42;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ga.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        WidgetTextLayout var8 = null;
        long var6 = 0L;
        if (null != this.field_r &&
          0 == param0) {
          this.field_r.drawWidget(127, this.field_y, param3, (UiWidget) (this), param2);
          if (this.field_r instanceof WidgetTextLayout) {
            var8 = (WidgetTextLayout) ((Object) this.field_r);
            if (this.field_I != this.field_Q) {
              var8.drawSelection(param2, this.field_I, this.field_Q, (UiWidget) (this), 91, param3);
            }
            var6 = MonotonicClock.monotonicMillis(30);
            if ((var6 - this.field_L) % 1000L < 500L) {
              var8.drawCaret(this.field_I, param2, param3, true, (UiWidget) (this));
            }
          }
        }
        if (param1 != 65) {
          this.field_I = -80;
        }
    }

    private final void deleteSelectedText(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 >= -117) {
          PcmSampleStream var4 = (PcmSampleStream) null;
          TextInputWidget.a((PcmSampleStream) null, -85);
        }
        if (this.field_I != this.field_Q) {
          var2 = this.field_Q >= this.field_I ? this.field_I : this.field_Q;
          var3 = this.field_Q >= this.field_I ? this.field_Q : this.field_I;
          this.field_Q = var2;
          this.field_I = var2;
          this.field_q = this.field_q.substring(0, var2) + this.field_q.substring(var3, this.field_q.length());
          this.m((byte) -96);
        }
    }

    TextInputWidget(String param0, UiListener param1, int param2) {
        super(param0, param1);
        this.field_J = 0L;
        this.field_T = -1;
        this.field_G = false;
        try {
          this.field_r = GameSoundEffect.field_i.field_h;
          this.field_S = param2;
          this.setInputText(param0, (byte) -17, true);
          this.field_H = true;
          this.field_L = MonotonicClock.monotonicMillis(-123);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void clearInputText(byte param0) {
        this.field_I = 0;
        this.field_q = "";
        if (param0 >= -11) {
          field_E = (Sprite) null;
        }
        this.field_Q = 0;
        this.m((byte) -85);
    }

    final static SoundStreamHandle a(PcmSampleStream param0, int param1) {
        SoundStreamHandle var2 = null;
        RuntimeException var2_ref = null;
        SoundStreamHandle stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new SoundStreamHandle(param0, param0);
          LoginCredentials.field_a.addLast(var2, 3);
          if (param1 <= 108) {
            field_U = (String) null;
          }
          PlayerMeshFactory.field_b.addSubStream(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ga.TA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        WidgetTextLayout var7 = null;
        int var6 = 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.scrollCaretIntoView((byte) 110);
          if (this.field_p == 1) {
            if (this.field_r instanceof WidgetTextLayout) {
              var7 = (WidgetTextLayout) ((Object) this.field_r);
              var6 = var7.characterIndexAtPosition(ArchiveManager.field_m, (UiWidget) (this), BytePlusOneCommand.field_A, param2, param3, 0);
              if (var6 != -1) {
                if (this.field_G && var6 < this.field_T &&
                  this.field_Q < var6) {
                  var6 = this.field_T;
                }
                this.field_I = var6;
              }
            }
            this.field_L = MonotonicClock.monotonicMillis(param0 ^ -117);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ga.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean handlePointerPress(boolean param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_r instanceof WidgetTextLayout)) {
            return false;
          }
          var8_int = ((WidgetTextLayout) ((Object) this.field_r)).characterIndexAtPosition(ArchiveManager.field_m, (UiWidget) (this), BytePlusOneCommand.field_A, param5, param1, 0);
          if (var8_int == -1) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.moveCaret(stackIn_6_1, 20);
          var8_long = MonotonicClock.monotonicMillis(95);
          stackIn_9_1 = !(var8_long - this.field_J >= 250L);
          this.field_G = stackIn_9_1;
          if (this.field_G) {
            this.field_Q = this.previousWordBoundary((byte) -55);
            this.field_I = this.nextWordBoundary((byte) 104);
            if (this.field_I > 0 &&
              this.field_q.charAt(this.field_I - 1) == 32) {
              this.field_I = this.field_I - 1;
            }
            this.field_T = this.field_I;
          }
          this.field_J = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ga.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, byte param1, UiWidget param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 >= -60) {
            field_O = (boolean[]) null;
          }
          this.field_L = MonotonicClock.monotonicMillis(101);
          if (param0 == 60) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (32 <= param0 &&
            param0 <= 126) {
            if (this.field_Q != this.field_I) {
              this.deleteSelectedText(-125);
            }
            if (this.field_S == -1 ||
              !(this.field_q.length() >= this.field_S)) {
              if (this.field_I < this.field_q.length()) {
                this.field_q = this.field_q.substring(0, this.field_I) + param0 + this.field_q.substring(this.field_I, this.field_q.length());
                this.field_I = this.field_I + 1;
                this.field_Q = this.field_I;
              } else {
                this.field_q = this.field_q + param0;
                dupTemp$0 = this.field_q.length();
                this.field_I = dupTemp$0;
                this.field_Q = dupTemp$0;
              }
              this.m((byte) -61);
            }
            return true;
          }
          if (param3 != 85) {
            if (param3 != 101) {
              if (param3 == 13) {
                this.clearInputText((byte) -107);
                return true;
              }
              if (96 != param3) {
                if (param3 != 97) {
                  if (param3 == 102) {
                    this.moveCaret(0, 20);
                    return true;
                  }
                  if (param3 == 103) {
                    this.moveCaret(this.field_q.length(), 20);
                    return true;
                  }
                  if (84 == param3) {
                    this.m(99);
                    return true;
                  }
                  if (GameplayHelpScreen.field_G[82] &&
                    65 == param3) {
                    this.j(-13630);
                    return true;
                  }
                  if (GameplayHelpScreen.field_G[82] &&
                    param3 == 66) {
                    this.copySelectedTextToClipboard((byte) 109);
                    return true;
                  }
                  if (GameplayHelpScreen.field_G[82] &&
                    param3 == 67) {
                    this.pasteFromClipboard(true);
                    return true;
                  }
                } else {
                  if (this.field_I < this.field_q.length()) {
                    if (GameplayHelpScreen.field_G[82]) {
                      stackIn_40_1 = this.nextWordBoundary((byte) 37);
                    } else {
                      stackIn_40_1 = 1 + this.field_I;
                    }
                    this.moveCaret(stackIn_40_1, 20);
                    return true;
                  }
                }
              } else {
                if (this.field_I > 0) {
                  if (!GameplayHelpScreen.field_G[82]) {
                    stackIn_33_1 = -1 + this.field_I;
                  } else {
                    stackIn_33_1 = this.previousWordBoundary((byte) -55);
                  }
                  this.moveCaret(stackIn_33_1, 20);
                  return true;
                }
              }
            } else {
              if (this.field_I != this.field_Q) {
                this.deleteSelectedText(-127);
                return true;
              }
              if (this.field_I < this.field_q.length()) {
                this.field_Q = this.field_I + 1;
                this.deleteSelectedText(-126);
                return true;
              }
            }
          } else {
            if (this.field_Q != this.field_I) {
              this.deleteSelectedText(-128);
              return true;
            }
            if (0 < this.field_I) {
              this.field_Q = -1 + this.field_I;
              this.deleteSelectedText(-123);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("ga.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int previousWordBoundary(byte param0) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (0 == this.field_I) {
          return this.field_I;
        }
        for (var2 = -1 + this.field_I; var2 > 0; var2--) {
          if (this.field_q.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0 == -55) {
          return var2;
        }
        return -81;
    }

    private final void j(int param0) {
        if (param0 != -13630) {
          return;
        }
        this.copySelectedTextToClipboard((byte) 119);
        this.deleteSelectedText(-124);
    }

    private final int nextWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = Kickabout.field_G;
        var2 = this.field_q.length();
        if (this.field_I == var2) {
          return this.field_I;
        }
        if (param0 <= 1) {
          return -65;
        }
        for (var3 = this.field_I + 1; var3 < var2; var3++) {
          if (this.field_q.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void insertTextAtCaret(String param0, boolean param1) {
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_S != -1) {
            var3_int = this.field_S - this.field_q.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_I == this.field_q.length()) {
            this.field_q = this.field_q + param0;
          } else {
            this.field_q = this.field_q.substring(0, this.field_I) + param0 + this.field_q.substring(this.field_I, this.field_q.length());
          }
          if (param1) {
            var4 = (String) null;
            this.setInputText((String) null, (byte) -99, true);
          }
          this.field_I = this.field_I + param0.length();
          this.field_Q = this.field_I;
          this.m((byte) -86);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ga.VA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void scrollCaretIntoView(byte param0) {
        int var3;
        TextLayout var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        WidgetTextLayout var10;
        var9 = Kickabout.field_G;
        if (!this.field_H) {
          this.field_s = 0;
          this.field_o = 0;
          return;
        }
        if (!(this.field_r instanceof WidgetTextLayout)) {
          return;
        }
        var10 = (WidgetTextLayout) ((Object) this.field_r);
        var3 = 21 / ((param0 - 45) / 37);
        var4 = var10.ensureTextLayout(5035, (UiWidget) (this));
        var5 = var4.a((byte) -25);
        var6 = var10.contentWidth((byte) -124, (UiWidget) (this));
        var7 = var10.lineHeight((byte) -76) >> 1;
        if (var5 < var6 - var7) {
          this.field_s = 0;
          this.field_o = 0;
        } else {
          var8 = this.field_s + var4.b(0, this.field_I);
          if (-var7 + var6 >= var8) {
            if (var8 < var7) {
              this.field_s = var7 + (-var8 + this.field_s);
            }
          } else {
            this.field_s = this.field_s + var6 - var7 - var8;
          }
          if (this.field_s > 0) {
            this.field_s = 0;
          } else {
            if (var7 - var6 > this.field_s) {
              this.field_s = var7 - var6;
            }
          }
        }
    }

    static {
        int var0 = 0;
        field_N = (Sprite) ((Object) new ArgbSprite(140, 140));
        field_M = "No options available";
        field_P = field_N.field_o >> 1;
        field_O = new boolean[89];
        field_U = "You can spectate this game";
        for (var0 = 0; field_O.length > var0; var0++) {
          if (var0 == 0) {
            field_O[var0] = false;
          } else {
            if (var0 == 1) {
              field_O[var0] = false;
            } else {
              if (var0 == 2) {
                field_O[var0] = false;
              } else {
                if (var0 != 3) {
                  if (4 != var0) {
                    if (var0 != 5) {
                      if (var0 != 6) {
                        if (var0 == 7) {
                          field_O[var0] = true;
                        } else {
                          if (var0 == 8) {
                            field_O[var0] = true;
                          } else {
                            if (var0 == 9) {
                              field_O[var0] = true;
                            } else {
                              if (var0 == 10) {
                                field_O[var0] = true;
                              } else {
                                if (var0 == 11) {
                                  field_O[var0] = true;
                                } else {
                                  if (12 == var0) {
                                    field_O[var0] = true;
                                  } else {
                                    if (var0 != 13) {
                                      if (var0 != 14) {
                                        if (var0 != 15) {
                                          if (var0 != 16) {
                                            if (17 == var0) {
                                              field_O[var0] = true;
                                            } else {
                                              if (var0 != 18) {
                                                if (var0 == 19) {
                                                  field_O[var0] = true;
                                                } else {
                                                  if (var0 != 20) {
                                                    if (21 == var0) {
                                                      field_O[var0] = true;
                                                    } else {
                                                      if (var0 == 22) {
                                                        field_O[var0] = true;
                                                      } else {
                                                        if (var0 != 23) {
                                                          if (var0 == 24) {
                                                            field_O[var0] = true;
                                                          } else {
                                                            if (25 != var0) {
                                                              if (var0 != 26) {
                                                                if (27 == var0) {
                                                                  field_O[var0] = true;
                                                                } else {
                                                                  if (28 == var0) {
                                                                    field_O[var0] = true;
                                                                  } else {
                                                                    if (var0 != 29) {
                                                                      if (var0 != 30) {
                                                                        if (31 != var0) {
                                                                          if (var0 != 32) {
                                                                            if (33 != var0) {
                                                                              if (var0 != 34) {
                                                                                if (var0 != 35) {
                                                                                  if (var0 != 36) {
                                                                                    if (37 == var0) {
                                                                                      field_O[var0] = false;
                                                                                    } else {
                                                                                      if (var0 != 38) {
                                                                                        if (var0 != 39) {
                                                                                          if (var0 == 40) {
                                                                                            field_O[var0] = false;
                                                                                          } else {
                                                                                            if (var0 == 41) {
                                                                                              field_O[var0] = false;
                                                                                            } else {
                                                                                              if (var0 != 42) {
                                                                                                if (43 == var0) {
                                                                                                  field_O[var0] = true;
                                                                                                } else {
                                                                                                  if (44 != var0) {
                                                                                                    if (var0 != 45) {
                                                                                                      if (var0 != 46) {
                                                                                                        if (var0 != 47) {
                                                                                                          if (var0 == 48) {
                                                                                                            field_O[var0] = false;
                                                                                                          } else {
                                                                                                            if (var0 != 49) {
                                                                                                              if (var0 != 50) {
                                                                                                                if (var0 == 51) {
                                                                                                                  field_O[var0] = false;
                                                                                                                } else {
                                                                                                                  if (var0 == 52) {
                                                                                                                    field_O[var0] = false;
                                                                                                                  } else {
                                                                                                                    if (53 != var0) {
                                                                                                                      if (var0 != 54) {
                                                                                                                        if (var0 != 55) {
                                                                                                                          if (var0 == 56) {
                                                                                                                            field_O[var0] = false;
                                                                                                                          } else {
                                                                                                                            if (var0 != 57) {
                                                                                                                              if (var0 == 58) {
                                                                                                                                field_O[var0] = false;
                                                                                                                              } else {
                                                                                                                                if (var0 == 59) {
                                                                                                                                  field_O[var0] = false;
                                                                                                                                } else {
                                                                                                                                  if (var0 == 60) {
                                                                                                                                    field_O[var0] = false;
                                                                                                                                  } else {
                                                                                                                                    if (61 != var0) {
                                                                                                                                      if (var0 == 62) {
                                                                                                                                        field_O[var0] = false;
                                                                                                                                      } else {
                                                                                                                                        if (var0 != 63) {
                                                                                                                                          if (var0 != 64) {
                                                                                                                                            if (var0 == 65) {
                                                                                                                                              field_O[var0] = false;
                                                                                                                                            } else {
                                                                                                                                              if (var0 == 66) {
                                                                                                                                                field_O[var0] = false;
                                                                                                                                              } else {
                                                                                                                                                if (var0 != 67) {
                                                                                                                                                  if (var0 == 68) {
                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                  } else {
                                                                                                                                                    if (69 != var0) {
                                                                                                                                                      if (var0 != 70) {
                                                                                                                                                        if (var0 != 71) {
                                                                                                                                                          if (var0 == 72) {
                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                          } else {
                                                                                                                                                            if (var0 == 73) {
                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                            } else {
                                                                                                                                                              if (var0 != 74) {
                                                                                                                                                                if (75 == var0) {
                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var0 == 76) {
                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var0 != 77) {
                                                                                                                                                                      if (var0 == 78) {
                                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (79 == var0) {
                                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (80 != var0) {
                                                                                                                                                                            if (var0 == 81) {
                                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (var0 != 82) {
                                                                                                                                                                                if (83 == var0) {
                                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var0 == 84) {
                                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (85 == var0) {
                                                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (var0 != 86) {
                                                                                                                                                                                        if (var0 == 87) {
                                                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (var0 != 88) {
                                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      } else {
                                                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              } else {
                                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          } else {
                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    } else {
                                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              } else {
                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                        }
                                                                                                                                                      } else {
                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          } else {
                                                                                                                                            field_O[var0] = false;
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          field_O[var0] = false;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      field_O[var0] = false;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              field_O[var0] = false;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          field_O[var0] = false;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        field_O[var0] = false;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      field_O[var0] = false;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                field_O[var0] = false;
                                                                                                              }
                                                                                                            } else {
                                                                                                              field_O[var0] = false;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          field_O[var0] = false;
                                                                                                        }
                                                                                                      } else {
                                                                                                        field_O[var0] = false;
                                                                                                      }
                                                                                                    } else {
                                                                                                      field_O[var0] = false;
                                                                                                    }
                                                                                                  } else {
                                                                                                    field_O[var0] = false;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                field_O[var0] = false;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          field_O[var0] = false;
                                                                                        }
                                                                                      } else {
                                                                                        field_O[var0] = false;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    field_O[var0] = false;
                                                                                  }
                                                                                } else {
                                                                                  field_O[var0] = false;
                                                                                }
                                                                              } else {
                                                                                field_O[var0] = false;
                                                                              }
                                                                            } else {
                                                                              field_O[var0] = false;
                                                                            }
                                                                          } else {
                                                                            field_O[var0] = true;
                                                                          }
                                                                        } else {
                                                                          field_O[var0] = true;
                                                                        }
                                                                      } else {
                                                                        field_O[var0] = true;
                                                                      }
                                                                    } else {
                                                                      field_O[var0] = true;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                field_O[var0] = true;
                                                              }
                                                            } else {
                                                              field_O[var0] = true;
                                                            }
                                                          }
                                                        } else {
                                                          field_O[var0] = true;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    field_O[var0] = true;
                                                  }
                                                }
                                              } else {
                                                field_O[var0] = true;
                                              }
                                            }
                                          } else {
                                            field_O[var0] = true;
                                          }
                                        } else {
                                          field_O[var0] = true;
                                        }
                                      } else {
                                        field_O[var0] = true;
                                      }
                                    } else {
                                      field_O[var0] = true;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        field_O[var0] = true;
                      }
                    } else {
                      field_O[var0] = true;
                    }
                  } else {
                    field_O[var0] = true;
                  }
                } else {
                  field_O[var0] = true;
                }
              }
            }
          }
        }
        field_K = "Offline";
    }
}
