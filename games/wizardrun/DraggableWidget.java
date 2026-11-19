/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    private int dragOffsetY;
    private int returnY;
    static AccountConnectionState field_P;
    static MidiTrack field_G;
    private int returnX;
    static ResourceArchive field_M;
    private boolean field_O;
    static String field_L;
    private boolean returnAfterDrag;
    private int dragOffsetX;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = wizardrun.field_H;
        if (param7 < param0) {
          if (param0 < param4) {
            FlatTriangleRasterizer.a(param6, param5, param0, param2, SoftwareRasterizer.pixels, param3, param4, -20476, param7);
          } else {
            if (param4 <= param7) {
              FlatTriangleRasterizer.a(param3, param5, param7, param6, SoftwareRasterizer.pixels, param2, param0, -20476, param4);
            } else {
              FlatTriangleRasterizer.a(param3, param5, param4, param2, SoftwareRasterizer.pixels, param6, param0, -20476, param7);
            }
          }
        } else {
          if (param7 < param4) {
            FlatTriangleRasterizer.a(param6, param5, param7, param3, SoftwareRasterizer.pixels, param2, param4, -20476, param0);
          } else {
            if (param4 > param0) {
              FlatTriangleRasterizer.a(param2, param5, param4, param3, SoftwareRasterizer.pixels, param6, param7, -20476, param0);
            } else {
              FlatTriangleRasterizer.a(param2, param5, param0, param6, SoftwareRasterizer.pixels, param3, param7, -20476, param4);
            }
          }
        }
        if (param1 == 0) {
          return;
        }
        DraggableWidget.releaseStatics(24);
    }

    final StringBuilder appendDebugTree(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 102) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugDescription(param3, param0, param2, true)) {
            this.appendDebugProperties(109, param2, param0, param3);
            this.appendChildDebugTree(param3, param2, param0, (byte) -101);
            discarded$62 = param3.append(" revert=").append(this.returnAfterDrag);
            if (this.returnX != 2147483647 &&
              this.returnY != 2147483647) {
              discarded$63 = param3.append(" to ").append(this.returnX).append(',').append(this.returnY);
            }
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pj.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_L = null;
        field_M = null;
        field_G = null;
        field_P = null;
        if (param0 < 103) {
          DraggableWidget.releaseStatics(-92);
        }
    }

    final void refreshChildLayout(int param0) {
        super.refreshChildLayout(param0);
        this.field_F.setBounds(110, 0, this.height, this.width, 0);
        this.returnX = this.x;
        this.returnY = this.y;
    }

    final void handleMouseRelease(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        try {
          super.handleMouseRelease(param0, param1, param2, param3, param4, param5);
          this.pressedMouseButton = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pj.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void updateInput(int param0, int param1, int param2, UiWidget param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_F instanceof TextButton) ||
            ((TextButton) (this.field_F)).field_B) &&
            this.pressedMouseButton == 1) {
            var5_int = -this.dragOffsetX + (AchievementSubmission.field_n - param2);
            var6 = -this.dragOffsetY + (NetworkArchiveRequest.field_B - param1);
            if (this.x != var5_int ||
              this.y != var6) {
              this.y = var6;
              this.x = var5_int;
              if (this.listener instanceof DragListener) {
                ((DragListener) (this.listener)).onDragged(param2, this, param1, param0 ^ 10000622);
              }
            }
          } else {
            if (this.returnAfterDrag) {
              if (this.returnX != this.x) {
                var5_int = -this.x + this.returnX;
                stackIn_17_1 = this.x;
                if (2 < Math.abs(var5_int)) {
                  stackIn_18_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_18_2 = 1;
                  } else {
                    stackIn_18_2 = -1;
                  }
                }
                this.x = stackIn_17_1 + stackIn_18_2;
              }
              if (this.returnY != this.y) {
                var5_int = this.returnY - this.y;
                stackIn_24_1 = this.y;
                if (Math.abs(var5_int) > 2) {
                  stackIn_25_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_25_2 = 1;
                  } else {
                    stackIn_25_2 = -1;
                  }
                }
                this.y = stackIn_24_1 + stackIn_25_2;
              }
            }
          }
          super.updateInput(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("pj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final boolean handleMousePress(int param0, byte param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.handleMousePress(param0, (byte) 48, param2, param3, param4, param5, param6) ? 1 : 0;
          var9 = -58 % ((12 - param1) / 36);
          if (var8_int != 0 &&
            this.field_O) {
            return true;
          }
          if (!this.containsPoint(param5, param2, 0, param0, param3)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          if (param4 == 1) {
            LevelData.field_h = this;
            this.dragOffsetX = param2 - this.x - param0;
            this.dragOffsetY = -this.y + param5 - param3;
          }
          this.pressedMouseButton = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("pj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void readProgressResponse(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ProgressQuery var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ProgressSubmission var5_ref_dc = null;
        int[] var6 = null;
        int var8 = 0;
        IsaacPacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = wizardrun.field_H;
        try {
          var9 = AccountCreationForm.field_N;
          if (param0 != -17144) {
            DraggableWidget.readProgressResponse(16);
          }
          var2 = var9.readUnsignedByte(255);
          var3 = var9.readUnsignedByte(255);
          if (var2 == 0) {
            var4 = (ProgressQuery) (LevelData.field_c.first((byte) 110));
            if (var4 == null) {
              HuffmanDecoder.closeAccountConnection(-64);
              return;
            }
            var5 = -var9.position + DelegatingCanvas.field_c;
            var11 = var4.values;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte(255) << ResourceArchive.bitAnd(768, var7 << 8));
            }
            var4.complete = true;
            var4.unlink(false);
            return;
          }
          if (var2 != 1) {
            ResizableDialog.reportClientError((Throwable) null, "LR1: " + LevelDecodingHelpers.describeAccountPacket(6), -562);
            HuffmanDecoder.closeAccountConnection(-66);
            return;
          }
          var4_int = var9.readSignedSmart(param0 + 37623);
          var5_ref_dc = (ProgressSubmission) (SpriteAlphaState.field_d.first((byte) 100));
          while (var5_ref_dc != null) {
            if (var5_ref_dc.category != var3 ||
              var4_int != var5_ref_dc.recordId) {
              var5_ref_dc = (ProgressSubmission) (SpriteAlphaState.field_d.next(param0 ^ -25336));
              continue;
            }
            break;
          }
          if (var5_ref_dc != null) {
            var5_ref_dc.unlink(false);
            return;
          }
          HuffmanDecoder.closeAccountConnection(-100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "pj.NA(" + param0 + ')');
        }
    }

    private DraggableWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.returnY = 2147483647;
        this.returnX = 2147483647;
        try {
          this.returnAfterDrag = param7 ? true : false;
          this.field_O = param8 ? true : false;
          this.field_F = param6;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_P = new AccountConnectionState();
        field_L = "This password contains repeated characters, and would be easy to guess";
    }
}
