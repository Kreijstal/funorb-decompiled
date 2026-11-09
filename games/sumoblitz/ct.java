/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ct extends ml {
    static int field_x;
    static java.applet.Applet field_z;
    static ToolkitSprite[] field_A;
    private byte[] field_y;

    ct() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static void a(int param0, Drone param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1.droneType != 0) {
            var2_double = vp.field_d[param1.variant] * (double)gq.field_q[param1.droneType];
            var2_double = var2_double + (double)(param1.field_G / 50);
            var2_double = var2_double * (double)pd.field_p;
            IntrusiveDequeCursor.a((int)var2_double, -1372239541);
            if ((1 << param1.droneType & DisplayModeConfirmationDialog.field_T) == 0) {
              DisplayModeConfirmationDialog.field_T = DisplayModeConfirmationDialog.field_T | 1 << param1.droneType;
              bi.field_c = bi.field_c + 1;
            } else {
              DisplayModeConfirmationDialog.field_T = 0;
              bi.field_c = 1;
              DisplayModeConfirmationDialog.field_T = DisplayModeConfirmationDialog.field_T | 1 << param1.droneType;
            }
            rn.a(Integer.toString((int)var2_double), param1.xQ8 >> 8, param1.yQ8 >> 8, 16777215, 28807);
            if (DisplayModeConfirmationDialog.field_T != 0 &&
              ps.field_e[13] == bi.field_c) {
              th.b(24753, 242, 13);
            }
            if (7 == oh.levelIndex &&
              0 == an.waveIndex) {
              if (param1.variant == 5) {
                ei.field_a = ei.field_a + 1;
              } else {
                ei.field_a = ei.field_a - 1;
              }
              if (ei.field_a == 4) {
                th.b(24753, 240, 15);
              }
            }
          }
          if (param0 != 6510) {
            ct.b(true);
          }
          SoftwareRenderBuffer.a(param1.variant, (byte) 73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ct.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          this.field_y = new byte[2 * (param0 * param1 * param3)];
          this.a(param3, 206, param1, param0);
          return this.field_y;
        }
        return (byte[]) null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 2 * param1;
        int var5 = param0 & 255;
        int incrementValue$0 = var4;
        var4++;
        this.field_y[incrementValue$0] = (byte)-1;
        this.field_y[var4] = (byte)(3 * var5 >> 5);
        if (param2 == 4096) {
          return;
        }
        field_x = 71;
    }

    public static void releaseStatics(byte param0) {
        field_z = null;
        if (param0 >= -15) {
          return;
        }
        field_A = null;
    }

    final static void b(boolean param0) {
        SpriteMask.drones = new Drone[100];
        sm.a(72);
        bj.powerupPickups = new IntrusiveDeque();
        is.arenaPads = new IntrusiveDeque();
        HardwareGraphicsHeap.field_o = new Random();
        db.droneSlotLimit = 1;
        FadingWidget.score = 0;
        GridWidgetContainer.livesRemaining = 1;
        TextureFormat.elapsedTicks = 0;
        MusicPatch.simulationPaused = false;
        if (param0) {
          ke.a(false);
          oc.field_e = 1000;
          TextLayout.a(0, 8);
          return;
        }
    }

    static {
    }
}
