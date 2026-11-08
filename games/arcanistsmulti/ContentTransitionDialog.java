/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalPanel {
    private int field_kb;
    private AlphaContainer field_sb;
    static String field_qb;
    private int field_jb;
    private UiComponent field_V;
    private int field_nb;
    private int field_mb;
    private int field_ob;
    private Crc32Helpers field_rb;
    static Sprite[] field_lb;
    static String field_pb;

    final static boolean isOwnGameSelected(byte param0) {
        if (param0 < 57) {
          field_qb = (String) null;
        }
        return MembershipGlobals.field_a == DirectByteStorage.field_f.field_Bb ? true : false;
    }

    private final void replaceContent(int param0, UiComponent param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != this.field_sb) {
            this.field_sb.unlink(true);
          }
          if (param1 != null) {
            param1.setBounds(param1.field_k, this.field_mb + 6, param1.field_v, 6, param0 ^ -55);
            this.field_sb = new AlphaContainer(param1);
          } else {
            this.field_sb = new AlphaContainer();
          }
          this.addChild(-126, this.field_sb);
          this.field_V = null;
          if (param0 != 12) {
            this.field_rb = (Crc32Helpers) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qk.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    ContentTransitionDialog(ModalPanelStack param0, UiComponent param1, int param2, int param3, int param4) {
        super(param0, param1.field_v + 12, 12 + param2 + param1.field_k);
        try {
          this.field_mb = param2;
          this.field_nb = param4;
          this.field_ob = param3;
          this.field_kb = param3;
          this.replaceContent(12, param1);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean updateFade(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 19) {
          this.updateFade((byte) 113);
        }
        if (null != this.field_rb) {
          if (this.field_rb == ConditionalTextValue.field_i) {
            fieldTemp$1 = this.field_jb + 1;
            this.field_jb = this.field_jb + 1;
            if (fieldTemp$1 == this.field_kb) {
              this.field_rb = ConditionalTextValue.field_h;
              this.startResize(this.field_V.field_v + 12, 116, this.field_nb, this.field_V.field_k + 12 + this.field_mb);
              this.field_jb = 0;
              this.field_sb.field_K = 0;
            } else {
              this.field_sb.field_K = 256 - (this.field_jb << 8) / this.field_kb;
            }
          } else {
            if (StatefulTextPainter.field_u == this.field_rb) {
              fieldTemp$2 = this.field_jb + 1;
              this.field_jb = this.field_jb + 1;
              if (this.field_ob == fieldTemp$2) {
                this.field_sb.field_K = 256;
                this.field_rb = null;
              } else {
                this.field_sb.field_K = (this.field_jb << 8) / this.field_ob;
              }
            }
          }
        }
        return super.updateFade((byte) 57);
    }

    boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, (byte) -123, param2, param3)) {
            return true;
          }
          if (null != this.field_sb) {
            if (param3 == 98) {
              this.field_sb.focusNext(0, param0);
            }
            if (param3 == 99) {
              this.field_sb.focusNext(0, param0);
            }
          }
          if (param1 < -120) {
            return false;
          }
          field_lb = (Sprite[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qk.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void onResizeFinished(boolean param0) {
        if (this.field_rb == ConditionalTextValue.field_i) {
          return;
        }
        this.field_rb = StatefulTextPainter.field_u;
        if (param0) {
          this.field_kb = 82;
        }
        this.field_jb = 0;
        this.replaceContent(12, this.field_V);
        this.field_V = null;
        this.field_sb.field_K = 0;
    }

    final void finishResize(int param0) {
        if (param0 < 89) {
          UiComponent var3 = (UiComponent) null;
          this.setContent((byte) -74, (UiComponent) null);
        }
        if (this.field_rb != null) {
          if (this.field_rb != StatefulTextPainter.field_u) {
            this.centerOnScreen(this.field_V.field_v + 12, 0, this.field_V.field_k + (this.field_mb + 12));
            this.replaceContent(12, this.field_V);
          }
          this.field_rb = null;
          this.field_sb.field_K = 256;
        }
        super.finishResize(126);
    }

    public static void releaseStatics(int param0) {
        field_lb = null;
        field_qb = null;
        field_pb = null;
        if (param0 != 0) {
          field_qb = (String) null;
        }
    }

    final boolean isFullyFadedOut(byte param0) {
        if (param0 != 45) {
          this.field_ob = -74;
        }
        this.finishResize(127);
        return super.isFullyFadedOut((byte) 45);
    }

    void setContent(byte param0, UiComponent param1) {
        UiComponent var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_V = param1;
          if (this.field_rb != ConditionalTextValue.field_h) {
            if (ConditionalTextValue.field_i != this.field_rb) {
              this.field_jb = 0;
              this.field_rb = ConditionalTextValue.field_i;
            }
          } else {
            this.startResize(this.field_V.field_v + 12, 117, this.field_nb, this.field_mb + (12 + this.field_V.field_k));
            this.field_jb = 0;
          }
          if (param0 != -92) {
            var4 = (UiComponent) null;
            this.replaceContent(106, (UiComponent) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_qb = "This option cannot be combined with the current settings for:  ";
        field_pb = "(1 player wants to join)";
    }
}
