/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    static boolean field_m;
    int y;
    int textOffsetX;
    WidgetRenderer renderer;
    boolean hovered;
    static ResourceArchive field_x;
    String tooltip;
    int pressedMouseButton;
    int width;
    int height;
    String text;
    static BufferedRandomAccessFile randomSeedFile;
    int x;
    WidgetListener listener;
    int textOffsetY;
    TextLayout textLayout;

    final boolean dispatchKeyPress(int param0, int param1, char param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.isFocused((byte) 53) &&
            this.handleKeyPress(param2, param1, (byte) -110, this)) {
            return true;
          }
          var4_int = 96 % ((-42 - param0) / 45);
          var5 = param1;
          if (80 == var5) {
            stackIn_10_0 = this.requestFocus(this, 8);
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var4), "ub.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean isPasswordLengthInvalid(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0 &&
            param0.length() >= MeshMaterial.field_f &&
            param0.length() <= TextLayout.field_e) {
            if (param1 <= 43) {
              UiWidget.a(117, -70);
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("ub.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8) {
            field_x = (ResourceArchive) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ub.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void appendDebugProperties(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (null != this.text) {
            discarded$1 = param3.append(" text=\"").append(this.text).append('"');
          }
          if (this.hovered) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.isFocused((byte) 53)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.renderer != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.renderer instanceof UiWidget)) {
              discarded$5 = param3.append(this.renderer);
              if (var6 != 0) {
                param3 = this.appendDebugTree(param2, (byte) 102, param1 + 1, param3);
              }
            } else {
              param3 = this.appendDebugTree(param2, (byte) 102, param1 + 1, param3);
            }
          }
          if (param0 <= 79) {
            return;
          }
          if (null != this.listener) {
            discarded$6 = param3.append(" listener=");
            if (!(this.listener instanceof UiWidget)) {
              discarded$7 = param3.append(this.listener);
              if (var6 == 0) {
                return;
              }
            }
            param3 = this.appendDebugTree(param2, (byte) 102, param1 + 1, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("ub.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 102) {
            this.y = -40;
          }
          if (this.beginDebugDescription(param3, param0, param2, true)) {
            this.appendDebugProperties(param1 - 2, param2, param0, param3);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ub.U(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            this.x = 26;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void drawAllLayers(boolean param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          var4_int = this.getLastDrawLayer((byte) 33);
          if (!param0) {
            this.listener = (WidgetListener) null;
          }
          var5_int = 0;
          while (var4_int >= var5_int) {
            this.drawLayer(param1, 0, var5_int, param2);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = AccountFormText.getVisibleTooltip((byte) -50);
          if (null != var5) {
            ValidationIndicator.field_H.drawTooltip(StrongCacheEntry.field_u, ArchiveLoadingPlan.field_a, var5, 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ub.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = this.appendDebugTree(new Hashtable(), (byte) 102, 0, new StringBuilder()).toString();
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "ub.toString()");
        }
    }

    final static void a(int param0, int param1) {
        IsaacPacketBuffer var2 = null;
        try {
          var2 = AccountPacketState.field_b;
          var2.writeCipheredOpcode((byte) -96, param1);
          var2.writeByte((byte) 11, 1);
          var2.writeByte((byte) 11, param0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ub.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void refreshLayout(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 108) {
            field_x = (ResourceArchive) null;
          }
          this.setBounds(121, this.y, this.height, this.width, this.x);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "ub.A(" + param0 + ')');
        }
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.width = param3;
        if (param0 <= 108) {
          return;
        }
        try {
          this.x = param4;
          this.height = param2;
          this.y = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ub.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean beginDebugDescription(StringBuilder param0, Hashtable param1, int param2, boolean param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            return false;
          }
          if (param1.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param1.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ub.W(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void clearFocus(boolean param0) {
        try {
          if (param0) {
            this.beginDebugDescription((StringBuilder) null, (Hashtable) null, -7, false);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ub.S(" + param0 + ')');
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 == param1 &&
            this.renderer != null) {
            this.renderer.drawWidget(param0, param3, this, true, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var5), "ub.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    String getTooltip(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.setBounds(30, 86, -9, 25, -124);
          }
          if (!this.hovered) {
            stackIn_7_0 = null;
          } else {
            stackIn_7_0 = this.tooltip;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "ub.V(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int[] param1) {
        boolean stackIn_38_0 = false;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        DelayedServerPacket var4_ref_hb = null;
        int var4 = 0;
        int var5_int = 0;
        DelayedServerPacket var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          if (NodeHashTableIterator.field_j != BufferedSocket.field_l) {
            return false;
          }
          if (param0 != 0) {
            return false;
          }
          var2_long = MonotonicClockHelpers.monotonicMillis((byte) 35);
          if (MenuController.field_j != 0 &&
            ValidatedTextField.field_W < 0) {
            var4_ref_hb = (DelayedServerPacket) (HighscorePlayer.field_c.first((byte) 125));
            if (var4_ref_hb != null &&
              var2_long > var4_ref_hb.deliveryTime) {
              var4_ref_hb.unlink(false);
              DelegatingCanvas.field_c = var4_ref_hb.payload.length;
              AccountCreationForm.field_N.position = 0;
              var5_int = 0;
              do {
                if (!(DelegatingCanvas.field_c > var5_int)) {
                  ValidationHelpWidget.field_P = wizardrun.field_E;
                  wizardrun.field_E = LoadingMessageHelpers.field_c;
                  LoadingMessageHelpers.field_c = AchievementUnlock.field_k;
                  AchievementUnlock.field_k = var4_ref_hb.opcode;
                  break;
                }
                AccountCreationForm.field_N.payload[var5_int] = var4_ref_hb.payload[var5_int];
                var5_int++;
              } while (var7 == 0);
              return true;
            }
          }
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (ValidatedTextField.field_W < 0) {
              AccountCreationForm.field_N.position = 0;
              stackIn_38_0 = ConfirmedEmailValidator.ensureAccountResponseBytes(1, param0 ^ -28266);
              decompiledFrameRemainder0 = (var7 == 0);
              if (decompiledFrameRemainder0) {
                if (!stackIn_38_0) {
                  return false;
                }
                ValidatedTextField.field_W = AccountCreationForm.field_N.readCipheredOpcode(45);
                AccountCreationForm.field_N.position = 0;
                DelegatingCanvas.field_c = param1[ValidatedTextField.field_W];
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_38_0 = ExceptionSupport.ensurePacketPayload(52);
            }
            if (!stackIn_38_0) {
              return false;
            }
            if (0 == MenuController.field_j) {
              ValidationHelpWidget.field_P = wizardrun.field_E;
              wizardrun.field_E = LoadingMessageHelpers.field_c;
              LoadingMessageHelpers.field_c = AchievementUnlock.field_k;
              AchievementUnlock.field_k = ValidatedTextField.field_W;
              ValidatedTextField.field_W = -1;
              return true;
            }
            var4 = MenuController.field_j;
            if (0.0 != ProgressSubmission.field_j) {
              var4 = (int)((double)var4 + IntrusiveDeque.field_c.nextGaussian() * ProgressSubmission.field_j);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new DelayedServerPacket((long)var4 + var2_long, ValidatedTextField.field_W, new byte[DelegatingCanvas.field_c]);
            var6 = 0;
            do {
              if (!(var6 < DelegatingCanvas.field_c)) {
                HighscorePlayer.field_c.addLast(var5, false);
                ValidatedTextField.field_W = -1;
                break;
              }
              var5.payload[var6] = AccountCreationForm.field_N.payload[var6];
              var6++;
            } while (var7 == 0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_62_0 = var2;
          stackIn_62_1 = new StringBuilder().append("ub.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    final boolean containsPoint(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.handleMouseRelease(-68, -40, -26, -46, (UiWidget) null, -33);
          }
          stackIn_16_0 = (param1 >= param3 + this.x) && (param0 >= this.y + param4) && (this.width + param3 + this.x > param1) && ((this.height + (param4 + this.y)) > param0);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var6), "ub.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void handleMouseRelease(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.pressedMouseButton = param5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ub.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_x = null;
          if (param0 != 31) {
            field_x = (ResourceArchive) null;
          }
          randomSeedFile = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "ub.AA(" + param0 + ')');
        }
    }

    int getLastDrawLayer(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 23) {
            UiWidget.releaseStatics((byte) 70);
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "ub.I(" + param0 + ')');
        }
    }

    boolean handleScrollInput(UiWidget param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23023) {
            this.handleScrollInput((UiWidget) null, 28, 74, 38, 125, 87, 3);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ub.M(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean processMouseInput(int param0, boolean param1, int param2, int param3) {
        boolean stackIn_48_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        DraggableWidget var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          this.updateInput(10000536, param3, param2, this);
          if (param0 <= 124) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          var5_int = this.isFocused((byte) 53) ? 1 : 0;
          if ((!param1) &&
            (decompiledFrameRemainder0 = (var5_int != 0)) &&
            (decompiledFrameRemainder0 = (0 != UiThemeSetupHelpers.field_c))) {
            this.clearFocus(false);
          }
          if ((decompiledFrameRemainder0) &&
            (param1 ||
            var7 != 0)) {
            if (LoginPacketBuilder.field_c != 0 &&
              var5_int != 0) {
              this.handleScrollInput(this, -23023, param2, LoginPacketBuilder.field_c, NetworkArchiveRequest.field_B, param3, AchievementSubmission.field_n);
            }
            if (UiThemeSetupHelpers.field_c != 0) {
              if (!this.handleMousePress(param2, (byte) 93, MouseInputHandler.field_e, param3, UiThemeSetupHelpers.field_c, EmailDomainHelpers.field_b, this)) {
                if (var5_int != 0) {
                  this.clearFocus(false);
                  if (var7 != 0) {
                    param1 = false;
                  }
                }
              } else {
                param1 = false;
              }
            }
            if (BrowserUrlLauncher.field_c == 0 &&
              0 != RadixParsingHelpers.field_c) {
              this.handleMouseRelease(param2, NetworkArchiveRequest.field_B, param3, AchievementSubmission.field_n, this, 0);
              var6 = LevelData.field_h;
              if (var6 != null) {
                if (var6.listener instanceof DropListener) {
                  ((DropListener) (var6.listener)).onDrop(var6, -98, (DropTargetWidget) null);
                }
                LevelData.field_h = null;
              }
            }
          }
          RadixParsingHelpers.field_c = BrowserUrlLauncher.field_c;
          MonotonicClockHelpers.a(this.getTooltip(false), 0);
          stackIn_48_0 = param1;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var5), "ub.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean isFocused(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 53) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "ub.O(" + param0 + ')');
        }
    }

    boolean handleMousePress(int param0, byte param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPoint(param5, param2, 0, param0, param3)) {
            this.pressedMouseButton = param4;
          }
          var8_int = -45 % ((param1 - 12) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ub.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void loadGameTextResources(int param0, ResourceArchive param1) {
        RuntimeException stackIn_367_0 = null;
        StringBuilder stackIn_367_1 = null;
        String stackIn_368_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        try {
          PacketBuffer.field_n = param1;
          var2 = LoginMethodPreference.loadNamedResource("achievement_names,0", 107);
          if (null != var2) {
            SpriteState.field_t[0] = AccountFormTextHelpers.a((byte) 100, var2);
          }
          var2Lifetime1 = LoginMethodPreference.loadNamedResource("achievement_names,1", 111);
          if (null != var2Lifetime1) {
            SpriteState.field_t[1] = AccountFormTextHelpers.a((byte) 84, var2Lifetime1);
          }
          var2Lifetime2 = LoginMethodPreference.loadNamedResource("achievement_names,2", 122);
          if (var2Lifetime2 != null) {
            SpriteState.field_t[2] = AccountFormTextHelpers.a((byte) 94, var2Lifetime2);
          }
          var2Lifetime3 = LoginMethodPreference.loadNamedResource("achievement_names,3", 111);
          if (null != var2Lifetime3) {
            SpriteState.field_t[3] = AccountFormTextHelpers.a((byte) 125, var2Lifetime3);
          }
          var2Lifetime4 = LoginMethodPreference.loadNamedResource("achievement_names,4", 120);
          if (null != var2Lifetime4) {
            SpriteState.field_t[4] = AccountFormTextHelpers.a((byte) 113, var2Lifetime4);
          }
          var2Lifetime5 = LoginMethodPreference.loadNamedResource("achievement_names,5", 122);
          if (null != var2Lifetime5) {
            SpriteState.field_t[5] = AccountFormTextHelpers.a((byte) 114, var2Lifetime5);
          }
          var2Lifetime6 = LoginMethodPreference.loadNamedResource("achievement_names,6", 110);
          if (var2Lifetime6 != null) {
            SpriteState.field_t[6] = AccountFormTextHelpers.a((byte) 126, var2Lifetime6);
          }
          var2Lifetime7 = LoginMethodPreference.loadNamedResource("achievement_names,7", 108);
          if (var2Lifetime7 != null) {
            SpriteState.field_t[7] = AccountFormTextHelpers.a((byte) 111, var2Lifetime7);
          }
          var2Lifetime8 = LoginMethodPreference.loadNamedResource("achievement_names,8", 119);
          if (null != var2Lifetime8) {
            SpriteState.field_t[8] = AccountFormTextHelpers.a((byte) 86, var2Lifetime8);
          }
          var2Lifetime9 = LoginMethodPreference.loadNamedResource("achievement_names,9", 107);
          if (null != var2Lifetime9) {
            SpriteState.field_t[9] = AccountFormTextHelpers.a((byte) 93, var2Lifetime9);
          }
          var2Lifetime10 = LoginMethodPreference.loadNamedResource("achievement_names,10", 123);
          if (null != var2Lifetime10) {
            SpriteState.field_t[10] = AccountFormTextHelpers.a((byte) 84, var2Lifetime10);
          }
          var2Lifetime11 = LoginMethodPreference.loadNamedResource("achievement_names,11", 119);
          if (var2Lifetime11 != null) {
            SpriteState.field_t[11] = AccountFormTextHelpers.a((byte) 109, var2Lifetime11);
          }
          var2Lifetime12 = LoginMethodPreference.loadNamedResource("achievement_criteria,0", 120);
          if (null != var2Lifetime12) {
            AccountProgressDialog.field_sb[0] = AccountFormTextHelpers.a((byte) 124, var2Lifetime12);
          }
          var2Lifetime13 = LoginMethodPreference.loadNamedResource("achievement_criteria,1", 120);
          if (null != var2Lifetime13) {
            AccountProgressDialog.field_sb[1] = AccountFormTextHelpers.a((byte) 91, var2Lifetime13);
          }
          var2Lifetime14 = LoginMethodPreference.loadNamedResource("achievement_criteria,2", 115);
          if (var2Lifetime14 != null) {
            AccountProgressDialog.field_sb[2] = AccountFormTextHelpers.a((byte) 104, var2Lifetime14);
          }
          var2Lifetime15 = LoginMethodPreference.loadNamedResource("achievement_criteria,3", 122);
          if (null != var2Lifetime15) {
            AccountProgressDialog.field_sb[3] = AccountFormTextHelpers.a((byte) 112, var2Lifetime15);
          }
          var2Lifetime16 = LoginMethodPreference.loadNamedResource("achievement_criteria,4", 107);
          if (null != var2Lifetime16) {
            AccountProgressDialog.field_sb[4] = AccountFormTextHelpers.a((byte) 112, var2Lifetime16);
          }
          var2Lifetime17 = LoginMethodPreference.loadNamedResource("achievement_criteria,5", 121);
          if (var2Lifetime17 != null) {
            AccountProgressDialog.field_sb[5] = AccountFormTextHelpers.a((byte) 112, var2Lifetime17);
          }
          var2Lifetime18 = LoginMethodPreference.loadNamedResource("achievement_criteria,6", 126);
          if (null != var2Lifetime18) {
            AccountProgressDialog.field_sb[6] = AccountFormTextHelpers.a((byte) 124, var2Lifetime18);
          }
          var2Lifetime19 = LoginMethodPreference.loadNamedResource("achievement_criteria,7", 120);
          if (null != var2Lifetime19) {
            AccountProgressDialog.field_sb[7] = AccountFormTextHelpers.a((byte) 88, var2Lifetime19);
          }
          var2Lifetime20 = LoginMethodPreference.loadNamedResource("achievement_criteria,8", 107);
          if (null != var2Lifetime20) {
            AccountProgressDialog.field_sb[8] = AccountFormTextHelpers.a((byte) 125, var2Lifetime20);
          }
          var2Lifetime21 = LoginMethodPreference.loadNamedResource("achievement_criteria,9", 115);
          if (null != var2Lifetime21) {
            AccountProgressDialog.field_sb[9] = AccountFormTextHelpers.a((byte) 98, var2Lifetime21);
          }
          var2Lifetime22 = LoginMethodPreference.loadNamedResource("achievement_criteria,10", 112);
          if (var2Lifetime22 != null) {
            AccountProgressDialog.field_sb[10] = AccountFormTextHelpers.a((byte) 105, var2Lifetime22);
          }
          var2Lifetime23 = LoginMethodPreference.loadNamedResource("achievement_criteria,11", 108);
          if (null != var2Lifetime23) {
            AccountProgressDialog.field_sb[11] = AccountFormTextHelpers.a((byte) 109, var2Lifetime23);
          }
          var2Lifetime24 = LoginMethodPreference.loadNamedResource("captions,0", 121);
          if (var2Lifetime24 != null) {
            ValidationHelpWidget.field_O[0] = AccountFormTextHelpers.a((byte) 88, var2Lifetime24);
          }
          var2Lifetime25 = LoginMethodPreference.loadNamedResource("captions,1", 121);
          if (null != var2Lifetime25) {
            ValidationHelpWidget.field_O[1] = AccountFormTextHelpers.a((byte) 91, var2Lifetime25);
          }
          var2Lifetime26 = LoginMethodPreference.loadNamedResource("captions,2", 111);
          if (null != var2Lifetime26) {
            ValidationHelpWidget.field_O[2] = AccountFormTextHelpers.a((byte) 94, var2Lifetime26);
          }
          var2Lifetime27 = LoginMethodPreference.loadNamedResource("captions,3", 118);
          if (var2Lifetime27 != null) {
            ValidationHelpWidget.field_O[3] = AccountFormTextHelpers.a((byte) 112, var2Lifetime27);
          }
          var2Lifetime28 = LoginMethodPreference.loadNamedResource("gamename", 109);
          if (null != var2Lifetime28) {
            MidiNote.field_u = AccountFormTextHelpers.a((byte) 127, var2Lifetime28);
          }
          var2Lifetime29 = LoginMethodPreference.loadNamedResource("openmenu", 116);
          if (null != var2Lifetime29) {
            DiskCacheRequest.field_C = AccountFormTextHelpers.a((byte) 114, var2Lifetime29);
          }
          var2Lifetime30 = LoginMethodPreference.loadNamedResource("holdtocharge", 118);
          if (var2Lifetime30 != null) {
            IntrusiveDeque.field_d = AccountFormTextHelpers.a((byte) 120, var2Lifetime30);
          }
          var2Lifetime31 = LoginMethodPreference.loadNamedResource("firestars", 111);
          if (var2Lifetime31 != null) {
            SystemMemoryHelpers.field_e = AccountFormTextHelpers.a((byte) 103, var2Lifetime31);
          }
          var2Lifetime32 = LoginMethodPreference.loadNamedResource("jump", 113);
          if (var2Lifetime32 != null) {
            NineSliceFrame.field_a = AccountFormTextHelpers.a((byte) 115, var2Lifetime32);
          }
          var2Lifetime33 = LoginMethodPreference.loadNamedResource("movelr", 107);
          if (var2Lifetime33 != null) {
            EditableTextWidget.field_P = AccountFormTextHelpers.a((byte) 86, var2Lifetime33);
          }
          var2Lifetime34 = LoginMethodPreference.loadNamedResource("snd", 116);
          if (null != var2Lifetime34) {
            EmailValidationError.field_b = AccountFormTextHelpers.a((byte) 84, var2Lifetime34);
          }
          var2Lifetime35 = LoginMethodPreference.loadNamedResource("mus", 113);
          if (null != var2Lifetime35) {
            DualLinkNodeHashTable.field_a = AccountFormTextHelpers.a((byte) 93, var2Lifetime35);
          }
          var2Lifetime36 = LoginMethodPreference.loadNamedResource("musbar", 107);
          if (null != var2Lifetime36) {
            WhirlpoolHasher.field_i = AccountFormTextHelpers.a((byte) 125, var2Lifetime36);
          }
          var2Lifetime37 = LoginMethodPreference.loadNamedResource("sndbar", 121);
          if (var2Lifetime37 != null) {
            LoginForm.field_N = AccountFormTextHelpers.a((byte) 125, var2Lifetime37);
          }
          var2Lifetime38 = LoginMethodPreference.loadNamedResource("holdxspace", 113);
          if (var2Lifetime38 != null) {
            RasterSnapshot.field_m = AccountFormTextHelpers.a((byte) 112, var2Lifetime38);
          }
          var2Lifetime39 = LoginMethodPreference.loadNamedResource("presszup", 113);
          if (var2Lifetime39 != null) {
            RadialSelectorPainter.field_a = AccountFormTextHelpers.a((byte) 111, var2Lifetime39);
          }
          var2Lifetime40 = LoginMethodPreference.loadNamedResource("pressxspace", 112);
          if (var2Lifetime40 != null) {
            EmailLoginCredentials.field_g = AccountFormTextHelpers.a((byte) 112, var2Lifetime40);
          }
          var2Lifetime41 = LoginMethodPreference.loadNamedResource("gameover", 114);
          if (null != var2Lifetime41) {
            LoadingMessageHelpers.field_b = AccountFormTextHelpers.a((byte) 95, var2Lifetime41);
          }
          var2Lifetime42 = LoginMethodPreference.loadNamedResource("starpower", 122);
          if (var2Lifetime42 != null) {
            UsernameLoginCredentials.field_g = AccountFormTextHelpers.a((byte) 91, var2Lifetime42);
          }
          var2Lifetime43 = LoginMethodPreference.loadNamedResource("instructiontextl", 111);
          if (null != var2Lifetime43) {
            AccountFormTextHelpers.a((byte) 94, var2Lifetime43);
          }
          var2Lifetime44 = LoginMethodPreference.loadNamedResource("instructiontextr", 117);
          if (null != var2Lifetime44) {
            AccountFormTextHelpers.a((byte) 117, var2Lifetime44);
          }
          var2Lifetime45 = LoginMethodPreference.loadNamedResource("fgc", 127);
          if (var2Lifetime45 != null) {
            PcmResampler.field_d = AccountFormTextHelpers.a((byte) 113, var2Lifetime45);
          }
          var2Lifetime46 = LoginMethodPreference.loadNamedResource("andthat", 122);
          if (var2Lifetime46 != null) {
            RadialSelectorWidget.field_P = AccountFormTextHelpers.a((byte) 124, var2Lifetime46);
          }
          var2Lifetime47 = LoginMethodPreference.loadNamedResource("dothis", 123);
          if (var2Lifetime47 != null) {
            HuffmanDecoder.field_a = AccountFormTextHelpers.a((byte) 99, var2Lifetime47);
          }
          var2Lifetime48 = LoginMethodPreference.loadNamedResource("todefeattheboss", 114);
          if (var2Lifetime48 != null) {
            DualLinkNodeHashTable.field_c = AccountFormTextHelpers.a((byte) 126, var2Lifetime48);
          }
          var2Lifetime49 = LoginMethodPreference.loadNamedResource("threecreatures", 117);
          if (var2Lifetime49 != null) {
            MidiNoteMixer.field_r = AccountFormTextHelpers.a((byte) 122, var2Lifetime49);
          }
          var2Lifetime50 = LoginMethodPreference.loadNamedResource("lastlevelbeforeboss", 108);
          if (var2Lifetime50 != null) {
            IntrusiveNodeHashTable.field_b = AccountFormTextHelpers.a((byte) 87, var2Lifetime50);
          }
          var2Lifetime51 = LoginMethodPreference.loadNamedResource("becareful", 113);
          if (null != var2Lifetime51) {
            LoginCredentialKind.field_e = AccountFormTextHelpers.a((byte) 101, var2Lifetime51);
          }
          var2Lifetime52 = LoginMethodPreference.loadNamedResource("usingstarpowerisfun", 109);
          if (var2Lifetime52 != null) {
            StrongCacheEntry.field_w = AccountFormTextHelpers.a((byte) 112, var2Lifetime52);
          }
          var2Lifetime53 = LoginMethodPreference.loadNamedResource("charrrrge", 117);
          if (null != var2Lifetime53) {
            ArchiveReadinessHelpers.field_c = AccountFormTextHelpers.a((byte) 117, var2Lifetime53);
          }
          var2Lifetime54 = LoginMethodPreference.loadNamedResource("iseecolours", 108);
          if (var2Lifetime54 != null) {
            MusicPatchLoader.field_a = AccountFormTextHelpers.a((byte) 103, var2Lifetime54);
          }
          var2Lifetime55 = LoginMethodPreference.loadNamedResource("yummycrystals", 123);
          if (null != var2Lifetime55) {
            DiskCacheWorker.field_h = AccountFormTextHelpers.a((byte) 94, var2Lifetime55);
          }
          var2Lifetime56 = LoginMethodPreference.loadNamedResource("crystalsgrow", 111);
          if (var2Lifetime56 != null) {
            CheckboxPainter.field_a = AccountFormTextHelpers.a((byte) 93, var2Lifetime56);
          }
          var2Lifetime57 = LoginMethodPreference.loadNamedResource("fallfrombelow", 118);
          if (var2Lifetime57 != null) {
            BrowserCookieHelpers.field_d = AccountFormTextHelpers.a((byte) 100, var2Lifetime57);
          }
          var2Lifetime58 = LoginMethodPreference.loadNamedResource("fallfromabove", 120);
          if (var2Lifetime58 != null) {
            MouseWheelInput.field_f = AccountFormTextHelpers.a((byte) 125, var2Lifetime58);
          }
          var2Lifetime59 = LoginMethodPreference.loadNamedResource("jumpwithz", 125);
          if (var2Lifetime59 != null) {
            MidiKeyUsage.field_i = AccountFormTextHelpers.a((byte) 111, var2Lifetime59);
          }
          var2Lifetime60 = LoginMethodPreference.loadNamedResource("pressattack", 127);
          if (null != var2Lifetime60) {
            PcmResampler.field_c = AccountFormTextHelpers.a((byte) 127, var2Lifetime60);
          }
          var2Lifetime61 = LoginMethodPreference.loadNamedResource("usearrows", 119);
          if (null != var2Lifetime61) {
            TimedValidator.field_c = AccountFormTextHelpers.a((byte) 115, var2Lifetime61);
          }
          var2Lifetime62 = LoginMethodPreference.loadNamedResource("pressenterorclick", 119);
          if (null != var2Lifetime62) {
            AccountSocketHelpers.field_d = AccountFormTextHelpers.a((byte) 84, var2Lifetime62);
          }
          var2Lifetime63 = LoginMethodPreference.loadNamedResource("logintoaccess", 124);
          if (null != var2Lifetime63) {
            ByteStorage.field_c = AccountFormTextHelpers.a((byte) 123, var2Lifetime63);
          }
          var2Lifetime64 = LoginMethodPreference.loadNamedResource("psfhs", 111);
          if (var2Lifetime64 != null) {
            HighscoreMessages.field_a = AccountFormTextHelpers.a((byte) 91, var2Lifetime64);
          }
          var2Lifetime65 = LoginMethodPreference.loadNamedResource("hssu", 121);
          if (var2Lifetime65 != null) {
            PowerOfTwoHelpers.field_a = AccountFormTextHelpers.a((byte) 119, var2Lifetime65);
          }
          var2Lifetime66 = LoginMethodPreference.loadNamedResource("hs4", 123);
          if (var2Lifetime66 != null) {
            ScoreSubmission.field_s = AccountFormTextHelpers.a((byte) 104, var2Lifetime66);
          }
          var2Lifetime67 = LoginMethodPreference.loadNamedResource("hs3", 125);
          if (null != var2Lifetime67) {
            TextLayout.field_b = AccountFormTextHelpers.a((byte) 124, var2Lifetime67);
          }
          var2Lifetime68 = LoginMethodPreference.loadNamedResource("hs2", 125);
          if (null != var2Lifetime68) {
            ToggleButton.field_G = AccountFormTextHelpers.a((byte) 103, var2Lifetime68);
          }
          var2Lifetime69 = LoginMethodPreference.loadNamedResource("hs1", 110);
          if (var2Lifetime69 != null) {
            DropTargetWidget.field_G = AccountFormTextHelpers.a((byte) 112, var2Lifetime69);
          }
          var2Lifetime70 = LoginMethodPreference.loadNamedResource("compltex", 121);
          if (null != var2Lifetime70) {
            MidiEnvelope.field_l = AccountFormTextHelpers.a((byte) 119, var2Lifetime70);
          }
          var2Lifetime71 = LoginMethodPreference.loadNamedResource("lastscor", 120);
          if (null != var2Lifetime71) {
            AccountFormTextHelpers.a((byte) 86, var2Lifetime71);
          }
          var2Lifetime72 = LoginMethodPreference.loadNamedResource("scrtex", 119);
          if (null != var2Lifetime72) {
            NineSliceFrame.field_f = AccountFormTextHelpers.a((byte) 124, var2Lifetime72);
          }
          var2Lifetime73 = LoginMethodPreference.loadNamedResource("worldstage", 124);
          if (var2Lifetime73 != null) {
            HighscoreRequest.field_p = AccountFormTextHelpers.a((byte) 124, var2Lifetime73);
          }
          var2Lifetime74 = LoginMethodPreference.loadNamedResource("nametex", 113);
          if (param0 >= -33) {
            return;
          }
          if (var2Lifetime74 != null) {
            UsernameLoginCredentials.field_l = AccountFormTextHelpers.a((byte) 90, var2Lifetime74);
          }
          var2Lifetime75 = LoginMethodPreference.loadNamedResource("requirementshidden", 127);
          if (null != var2Lifetime75) {
            HighscorePlayerState.field_f = AccountFormTextHelpers.a((byte) 114, var2Lifetime75);
          }
          var2Lifetime76 = LoginMethodPreference.loadNamedResource("loginn", 122);
          if (null != var2Lifetime76) {
            SoundCache.field_b = AccountFormTextHelpers.a((byte) 100, var2Lifetime76);
          }
          var2Lifetime77 = LoginMethodPreference.loadNamedResource("levelonly", 121);
          if (var2Lifetime77 != null) {
            GameKeyHandler.field_a = AccountFormTextHelpers.a((byte) 117, var2Lifetime77);
          }
          var2Lifetime78 = LoginMethodPreference.loadNamedResource("levelnotyet", 110);
          if (var2Lifetime78 != null) {
            BufferedRandomAccessFile.field_g = AccountFormTextHelpers.a((byte) 89, var2Lifetime78);
          }
          var2Lifetime79 = LoginMethodPreference.loadNamedResource("worldspace", 110);
          if (null != var2Lifetime79) {
            NineSliceFrame.field_c = AccountFormTextHelpers.a((byte) 109, var2Lifetime79);
          }
          var2Lifetime80 = LoginMethodPreference.loadNamedResource("thedem", 114);
          if (null != var2Lifetime80) {
            NameCheckProgressDialog.field_vb = AccountFormTextHelpers.a((byte) 85, var2Lifetime80);
          }
          var2Lifetime81 = LoginMethodPreference.loadNamedResource("theice", 120);
          if (null != var2Lifetime81) {
            DialogLayer.field_H = AccountFormTextHelpers.a((byte) 98, var2Lifetime81);
          }
          var2Lifetime82 = LoginMethodPreference.loadNamedResource("thetro", 109);
          if (var2Lifetime82 != null) {
            SecondaryNodeDeque.field_c = AccountFormTextHelpers.a((byte) 99, var2Lifetime82);
          }
          var2Lifetime83 = LoginMethodPreference.loadNamedResource("thepir", 109);
          if (null != var2Lifetime83) {
            AchievementUnlock.field_l = AccountFormTextHelpers.a((byte) 86, var2Lifetime83);
          }
          var2Lifetime84 = LoginMethodPreference.loadNamedResource("thebea", 117);
          if (var2Lifetime84 != null) {
            GameShell.field_o = AccountFormTextHelpers.a((byte) 89, var2Lifetime84);
          }
          var2Lifetime85 = LoginMethodPreference.loadNamedResource("thevil", 109);
          if (null != var2Lifetime85) {
            FriendEntry.field_kb = AccountFormTextHelpers.a((byte) 127, var2Lifetime85);
          }
          var2Lifetime86 = LoginMethodPreference.loadNamedResource("worldselect", 116);
          if (null != var2Lifetime86) {
            LoginCredentials.field_b = AccountFormTextHelpers.a((byte) 95, var2Lifetime86);
          }
          var2Lifetime87 = LoginMethodPreference.loadNamedResource("scorecolon", 115);
          if (var2Lifetime87 != null) {
            MouseInputHandler.field_d = AccountFormTextHelpers.a((byte) 111, var2Lifetime87);
          }
          var2Lifetime88 = LoginMethodPreference.loadNamedResource("livescolon", 119);
          if (var2Lifetime88 != null) {
            SpriteTextStyle.field_J = AccountFormTextHelpers.a((byte) 96, var2Lifetime88);
          }
          var2Lifetime89 = LoginMethodPreference.loadNamedResource("tut6", 118);
          if (null != var2Lifetime89) {
            AccountFormTextHelpers.a((byte) 97, var2Lifetime89);
          }
          var2Lifetime90 = LoginMethodPreference.loadNamedResource("tut5", 110);
          if (null != var2Lifetime90) {
            AccountFormTextHelpers.a((byte) 122, var2Lifetime90);
          }
          var2Lifetime91 = LoginMethodPreference.loadNamedResource("tut4", 107);
          if (var2Lifetime91 != null) {
            AccountFormTextHelpers.a((byte) 109, var2Lifetime91);
          }
          var2Lifetime92 = LoginMethodPreference.loadNamedResource("tut3", 113);
          if (var2Lifetime92 != null) {
            AccountFormTextHelpers.a((byte) 125, var2Lifetime92);
          }
          var2Lifetime93 = LoginMethodPreference.loadNamedResource("tut2", 113);
          if (var2Lifetime93 != null) {
            AccountFormTextHelpers.a((byte) 123, var2Lifetime93);
          }
          var2Lifetime94 = LoginMethodPreference.loadNamedResource("tut1", 126);
          if (null != var2Lifetime94) {
            AccountFormTextHelpers.a((byte) 106, var2Lifetime94);
          }
          var2Lifetime95 = LoginMethodPreference.loadNamedResource("pressentertocont", 116);
          if (var2Lifetime95 != null) {
            AccountFormTextHelpers.a((byte) 127, var2Lifetime95);
          }
          var2Lifetime96 = LoginMethodPreference.loadNamedResource("worldstage1", 120);
          if (var2Lifetime96 != null) {
            IconButtonPainter.field_b = AccountFormTextHelpers.a((byte) 125, var2Lifetime96);
          }
          var2Lifetime97 = LoginMethodPreference.loadNamedResource("tut", 109);
          if (var2Lifetime97 != null) {
            ValidationHelpWidget.field_Q = AccountFormTextHelpers.a((byte) 96, var2Lifetime97);
          }
          var2Lifetime98 = LoginMethodPreference.loadNamedResource("introtex", 114);
          if (var2Lifetime98 != null) {
            ToggleButton.field_F = AccountFormTextHelpers.a((byte) 84, var2Lifetime98);
          }
          var2Lifetime99 = LoginMethodPreference.loadNamedResource("stagecolon", 119);
          if (var2Lifetime99 != null) {
            MarkerSliderPainter.field_i = AccountFormTextHelpers.a((byte) 127, var2Lifetime99);
          }
          var2Lifetime100 = LoginMethodPreference.loadNamedResource("worldcolon", 113);
          if (var2Lifetime100 != null) {
            HighscorePlayer.field_f = AccountFormTextHelpers.a((byte) 110, var2Lifetime100);
          }
          var2Lifetime101 = LoginMethodPreference.loadNamedResource("keycode_playerattack", 121);
          if (var2Lifetime101 != null) {
            SpriteTextStyle.field_S = 255 & var2Lifetime101[0];
          }
          var2Lifetime102 = LoginMethodPreference.loadNamedResource("keycode_playerjump", 113);
          if (null != var2Lifetime102) {
            AccountFormTextHelpers.field_d = var2Lifetime102[0] & 255;
          }
          PacketBuffer.field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_367_0 = var2_ref;
          stackIn_367_1 = new StringBuilder().append("ub.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_368_2 = "null";
          } else {
            stackIn_368_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_367_0), ((StringBuilder) (Object) stackIn_367_1).append(stackIn_368_2).append(')').toString());
        }
    }

    void updateInput(int param0, int param1, int param2, UiWidget param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        boolean stackIn_6_0 = false;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.containsPoint(NetworkArchiveRequest.field_B, AchievementSubmission.field_n, 0, param2, param1) ? 1 : 0;
          if (param0 != 10000536) {
            UiWidget.loadGameTextResources(101, (ResourceArchive) null);
          }
          stackIn_6_0 = this.hovered;
          if (var5_int != 0) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = 1;
          }
          if ((stackIn_6_0 ? 1 : 0) == stackIn_7_1) {
            this.hovered = var5_int != 0;
            if (this.listener != null &&
              this.listener instanceof HoverListener) {
              ((HoverListener) (this.listener)).onHoverChanged(var5_int != 0, -12361, this);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("ub.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    UiWidget(String param0, WidgetListener param1) {
        this(param0, ValidationIndicator.field_H.field_u, param1);
    }

    protected UiWidget() {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        RuntimeException runtimeException = null;
        TextWidgetRenderer var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
          this.listener = param2;
          this.text = param0;
          this.renderer = param1;
          if (this.renderer instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.renderer);
            this.width = var4.getPreferredWidth((byte) 95, this);
            this.height = var4.getPreferredHeight((byte) 118, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ub.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
          this.renderer = param4;
          this.listener = param5;
          this.x = param0;
          this.height = param3;
          this.width = param2;
          this.y = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ub.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
