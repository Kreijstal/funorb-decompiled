/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class FocusableWidget extends UiWidget {
    int field_x;
    private boolean field_u;
    private boolean field_v;
    boolean field_y;
    boolean field_w;

    boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.hasKeyboardFocus((byte) -34) && (param2 == 84 ||
            param2 == 83)) {
            this.b(-1, 1, -1, -81);
            return true;
          }
          if (!param3) {
            this.clearKeyboardFocus((byte) -61);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    FocusableWidget(String param0, isa param1, WidgetListener param2) {
        super(param0, param1, param2);
        this.field_u = false;
        this.field_x = 0;
        this.field_v = true;
        this.field_y = true;
    }

    final StringBuilder appendDiagnostics(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        UiWidget var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDiagnosticVisit((byte) -122, param0, param1, param2)) {
            this.appendDiagnosticProperties(1, param2, param1, param0);
            if (this.field_w) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_y) {
              discarded$3 = param2.append(" disabled");
            }
          }
          if (param3 != 0) {
            var6 = (UiWidget) null;
            this.requestKeyboardFocus((UiWidget) null, true);
          }
          stackIn_8_0 = (StringBuilder) (param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("rj.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    FocusableWidget(String param0, WidgetListener param1) {
        this(param0, afa.field_c.field_u, param1);
    }

    void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_x = 0;
          if (this.field_s != 0) {
            if (this.field_s == RangeOperator.field_p) {
              return;
            }
            if (this.containsPointer(AgeValidator.field_j, param0, param1 ^ -2097252, GridWidgetContainer.field_B, param3) &&
              RangeOperator.field_p == 0) {
              this.b(GridWidgetContainer.field_B - param3, this.field_s, -param0 + AgeValidator.field_j, -86);
            }
            this.handlePointerRelease((byte) 59, param2, GridWidgetContainer.field_B, param0, param3, AgeValidator.field_j);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean requestKeyboardFocus(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.field_v) {
            param0.clearKeyboardFocus((byte) -127);
            this.field_u = true;
            if (param1) {
              this.field_v = true;
            }
            if (null != this.field_h) {
              if (!(this.field_h instanceof vfa)) {
                return true;
              }
              ((vfa) (this.field_h)).a((UiWidget) (this), (byte) 90, this.field_u);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rj.S(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clearKeyboardFocus(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (!this.field_u) {
          var2 = 101 / ((param0 + 38) / 60);
          return;
        }
        this.field_u = false;
        if (this.field_h == null) {
          var2Lifetime1 = 101 / ((param0 + 38) / 60);
          return;
        }
        if (this.field_h instanceof vfa) {
          ((vfa) (this.field_h)).a((UiWidget) (this), (byte) -74, this.field_u);
          var2Lifetime2 = 101 / ((param0 + 38) / 60);
          return;
        }
        var2Lifetime3 = 101 / ((param0 + 38) / 60);
    }

    FocusableWidget(int param0, int param1, int param2, int param3, isa param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_u = false;
        this.field_x = 0;
        this.field_v = true;
        this.field_y = true;
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sda var4_ref_sda = null;
        Object var5 = null;
        int var6 = 0;
        ResourceArchive var7 = null;
        mm var10 = null;
        BitPacketBuffer var11 = null;
        byte[] var15 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 4) {
            var7 = (ResourceArchive) null;
            FocusableWidget.a((ResourceArchive) null, 5, -25, (byte) 14);
          }
          var11 = WeaveOperator.field_q;
          var2 = var11.readUnsignedByte(255);
          if (var2 == 0) {
            var10 = (mm) (SpawnerBehaviour.field_n.first(-80));
            if (var10 == null) {
              dea.a(60);
              return;
            }
            var4 = var11.readUnsignedByte(param0 ^ 251);
            if (var4 == 0) {
              var5 = null;
            } else {
              var15 = new byte[var4];
              var11.readBytes(var15, 0, -115, var4);
            }
            var11.position = var11.position + 4;
            if (var11.verifyCrc32((byte) 114)) {
              var10.unlink(95);
              return;
            }
            dea.a(60);
            return;
          }
          if (var2 != 1) {
            ssa.a("A1: " + kk.a(32), (byte) 117, (Throwable) null);
            dea.a(60);
            return;
          }
          var3 = var11.readInt(-34);
          var4_ref_sda = (sda) (qd.field_a.first(param0 - 84));
          while (var4_ref_sda != null) {
            if (var4_ref_sda.field_l != var3) {
              var4_ref_sda = (sda) (qd.field_a.next(117));
              continue;
            }
            break;
          }
          if (var4_ref_sda != null) {
            var4_ref_sda.unlink(24);
            return;
          }
          dea.a(60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "rj.TA(" + param0 + ')');
        }
    }

    public FocusableWidget() {
        this.field_u = false;
        this.field_x = 0;
        this.field_v = true;
        this.field_y = true;
        this.field_r = afa.field_c.field_v;
    }

    final static Sprite[] a(ResourceArchive param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!GameApplet.a(false, param1, param2, param0)) {
            return null;
          }
          if (param3 != -82) {
            FocusableWidget.a(23);
          }
          stackIn_6_0 = RoomViewRenderer.takeDecodedOpaqueSprites(1500);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rj.UA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.containsPointer(param6, param1, 125, param3, param2)) {
            this.requestKeyboardFocus(param5, false);
            this.field_s = param4;
            if (null != this.field_h &&
              this.field_h instanceof om) {
              ((om) (this.field_h)).a(param3, param6, this, 453, param2, param4, param1);
            }
            return true;
          }
          if (param0 > 70) {
            return false;
          }
          this.field_y = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("rj.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(byte param0) {
        if (param0 != -34) {
          this.field_u = false;
          return this.field_u;
        }
        return this.field_u;
    }

    final void handlePointerRelease(byte param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        try {
          if (this.field_h != null &&
            this.field_h instanceof om) {
            ((om) (this.field_h)).a(param4, param3, 12728, param2, this, param5);
          }
          if (param0 != 59) {
            UiWidget var8 = (UiWidget) null;
            this.requestKeyboardFocus((UiWidget) null, true);
          }
          this.field_s = 0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        this.field_x = param1;
        if (null == this.field_h) {
          if (param3 <= -40) {
            return;
          }
          FocusableWidget.a(14);
          return;
        }
        if (!(this.field_h instanceof ButtonListener)) {
          if (param3 <= -40) {
            return;
          }
          FocusableWidget.a(14);
          return;
        }
        ((ButtonListener) (this.field_h)).onButtonActivated(param0, param2, this, param1, (byte) 115);
        if (param3 <= -40) {
          return;
        }
        FocusableWidget.a(14);
    }

    static {
    }
}
