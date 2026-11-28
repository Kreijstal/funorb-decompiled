/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ModalDialogHost extends SingleChildWidgetContainer {
    static String field_E;
    static Vector[] field_z;
    static int[] field_y;
    static int[] field_C;
    static int field_B;
    private IntrusiveDeque field_A;
    static uf[] field_D;

    final void snapAndPruneDialogs(int param0) {
        int var4 = CrazyCrystals.field_B;
        tm var2 = new tm(this.field_A);
        if (param0 != 0) {
          ModalDialogHost.f((byte) 68);
        }
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 97));
        while (var3 != null) {
          if (var3.snapDialogAnimation((byte) 79)) {
            var3.unlink(false);
          }
          var3 = (ModalDialog) (var2.b(-6));
        }
    }

    public ModalDialogHost() {
        super(0, 0, DraggableWidgetContainer.field_y, ArchiveSourceManager.field_c, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_A = new IntrusiveDeque();
    }

    final void advanceDialogs(boolean param0) {
        int var4 = CrazyCrystals.field_B;
        tm var2 = new tm(this.field_A);
        if (param0) {
          this.field_A = (IntrusiveDeque) null;
        }
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 124));
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) 8)) {
            var3.unlink(false);
          }
          var3 = (ModalDialog) (var2.b(-27));
        }
        this.field_w = (UiWidget) ((Object) this.getTopOpenDialog(0));
    }

    final UiWidget getFocusedChild(byte param0) {
        tm var2;
        ModalDialog var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        var2 = new tm(this.field_A);
        if (param0 < 39) {
          return (UiWidget) null;
        }
        var3 = (ModalDialog) (var2.a((byte) 95));
        while (var3 != null) {
          if (var3.field_C) {
            return var3.getFocusedChild(false);
          }
          var3 = (ModalDialog) (var2.b(122));
        }
        return null;
    }

    public static void resetStaticState(int param0) {
        field_y = null;
        field_z = null;
        field_D = null;
        field_E = null;
        if (param0 != 0) {
          field_B = -66;
        }
        field_C = null;
    }

    final ModalDialog getTopOpenDialog(int param0) {
        tm var2;
        ModalDialog var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        var2 = new tm(this.field_A);
        var3 = (ModalDialog) (var2.a((byte) 39));
        if (param0 != 0) {
          field_C = (int[]) null;
        }
        while (var3 != null) {
          if (var3.field_C) {
            return var3;
          }
          var3 = (ModalDialog) (var2.b(104));
        }
        return null;
    }

    final void closeAllDialogs(byte param0) {
        int var4 = CrazyCrystals.field_B;
        if (param0 >= -13) {
          this.getFocusedChild((byte) -34);
        }
        tm var2 = new tm(this.field_A);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 114));
        while (var3 != null) {
          var3.field_C = false;
          var3 = (ModalDialog) (var2.b(-60));
        }
        this.field_w = null;
    }

    final static boolean f(byte param0) {
        if (rk.field_b == -1) {
          if (!fq.a(1, (byte) -44)) {
            return false;
          }
          rk.field_b = ConfirmedEmailAvailabilityValidator.field_n.readUnsignedByte(255);
          ConfirmedEmailAvailabilityValidator.field_n.position = 0;
        }
        if (param0 != 60) {
          field_C = (int[]) null;
        }
        if (rk.field_b == -2) {
          if (!fq.a(2, (byte) 58)) {
            return false;
          }
          rk.field_b = ConfirmedEmailAvailabilityValidator.field_n.readUnsignedShort((byte) -7);
          ConfirmedEmailAvailabilityValidator.field_n.position = 0;
        }
        return fq.a(rk.field_b, (byte) -103);
    }

    final void showDialog(int param0, UiWidget param1) {
        ModalDialog var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param1 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param1);
          this.field_A.addFirst(82, var3);
          var3.field_C = true;
          var3.takeFocus(true, (UiWidget) (this));
          if (param0 != -3264) {
            ModalDialogHost.f((byte) -84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ol.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        int var7 = CrazyCrystals.field_B;
        if (null != this.field_i) {
          this.field_i.paintWidget(param0, false, param2, (UiWidget) (this), true);
        }
        if (param1 > -12) {
          field_D = (uf[]) null;
        }
        tm var5 = new tm(this.field_A);
        UiWidget var6 = (UiWidget) (var5.d(107));
        while (var6 != null) {
          var6.drawWidget(this.field_j + param0, (byte) -74, param2 + this.field_r, param3);
          var6 = (UiWidget) (var5.c(-50));
        }
    }

    final static wj a(int[] param0, int param1, wj param2) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wj(0, 0, 0);
          var3.field_f = param2.field_f;
          var3.field_d = param2.field_d;
          var3.field_e = param2.field_e;
          var3.field_i = param0;
          var3.field_a = param2.field_a;
          var3.field_j = param2.field_j;
          var3.field_c = param2.field_c;
          var3.field_g = param2.field_g;
          var4 = 101 % ((param1 - 67) / 51);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("ol.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_E = "You can make him move using the arrow keys.";
        field_z = new Vector[5];
        field_C = new int[8192];
        field_y = new int[8192];
    }
}
