/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SpaceObject {
    static byte[] field_j;
    private int field_m;
    static int field_i;
    static int field_f;
    private int[] field_g;
    private MeshBuilder field_n;
    private int field_q;
    private Quaternion field_e;
    private ModelMesh field_o;
    static String enterignoreAdd;
    private int field_c;
    private int field_b;
    private int field_a;
    private Quaternion field_p;
    static Sprite field_k;
    private int field_h;
    static PcmStreamMixer field_d;

    final void move(int param0) {
        this.field_a = this.field_a + this.field_h;
        this.field_q = this.field_q + this.field_b;
        this.field_m = this.field_m + this.field_c;
        if (this.field_q >= 167772160) {
          this.field_q = -167772159;
          this.field_g[0] = this.field_q >> 13;
          this.field_g[1] = this.field_m >> 13;
          this.field_g[2] = this.field_a >> 13;
          if (param0 == 2115785453) {
            this.field_p.multiplyBy(3, this.field_e);
            this.field_o = null;
            return;
          }
          return;
        }
        if (-167772160 < this.field_q) {
          this.field_g[0] = this.field_q >> 13;
          this.field_g[1] = this.field_m >> 13;
          this.field_g[2] = this.field_a >> 13;
          if (param0 == 2115785453) {
            this.field_p.multiplyBy(3, this.field_e);
            this.field_o = null;
            return;
          }
          return;
        }
        this.field_q = 167772159;
        this.field_g[0] = this.field_q >> 13;
        this.field_g[1] = this.field_m >> 13;
        this.field_g[2] = this.field_a >> 13;
        if (param0 == 2115785453) {
          this.field_p.multiplyBy(3, this.field_e);
          this.field_o = null;
          return;
        }
    }

    final void prepareModel(int[] param0, SpaceTableScene param1, int param2) {
        int var5 = 0;
        Sprite[] var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pool.field_O;
        try {
          if (param2 <= 79) {
            var6 = (Sprite[]) null;
            SpaceObject.drawThreeSliceAlpha(48, -85, 56, (byte) 112, -17, (Sprite[]) null);
          }
          if (null == this.field_o) {
            this.field_p.toRotationMatrix(this.field_g, -125);
            if (this.field_q > 134217728) {
              this.field_n.field_f = DirectByteStorage.field_h[this.field_q - 134217728 >> 20];
            } else {
              if (this.field_q >= -134217728) {
                this.field_n.field_f = null;
              } else {
                this.field_n.field_f = DirectByteStorage.field_h[-134217728 - this.field_q >> 20];
              }
            }
            this.field_o = (ModelMesh) (this.field_n.createModelMeshTransformed(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, this.field_g));
          }
          this.field_o.drawTransformed(param0, this.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qf.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_k = null;
        if (param0) {
          field_d = null;
          field_j = null;
          enterignoreAdd = null;
          return;
        }
        enterignoreAdd = (String) null;
        field_d = null;
        field_j = null;
        enterignoreAdd = null;
    }

    final int viewDepth(int[] param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -101 % ((param1 + 31) / 38);
          stackIn_1_0 = (-param0[1] + this.field_g[1]) * param0[10] + (param0[9] * (this.field_g[0] - param0[0]) + (this.field_g[2] - param0[2]) * param0[11]);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("qf.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawThreeSliceAlpha(int y, int alpha, int x, byte obfuscationGuard, int width, Sprite[] sprites) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Sprite[] var12 = null;
        var11 = Pool.field_O;
        try {
          if (sprites != null &&
            width > 0) {
            var6_int = sprites[0].field_w;
            var7 = sprites[2].field_w;
            var8 = sprites[1].field_w;
            sprites[0].drawAlpha(x, y, alpha);
            sprites[2].drawAlpha(-var7 + (x + width), y, alpha);
            SoftwareRasterizer.saveClip(GameRules.field_a);
            SoftwareRasterizer.intersectClip(var6_int + x, y, width + (x - var7), y + sprites[1].field_y);
            var9 = x + var6_int;
            var10 = x + width - var7;
            if (obfuscationGuard != 18) {
              var12 = (Sprite[]) null;
              SpaceObject.drawThreeSliceAlpha(-32, 78, -31, (byte) 16, 88, (Sprite[]) null);
            }
            for (x = var9; x < var10; x = x + var8) {
              sprites[1].drawAlpha(x, y, alpha);
            }
            SoftwareRasterizer.restoreClip(GameRules.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("qf.E(").append(y).append(',').append(alpha).append(',').append(x).append(',').append(obfuscationGuard).append(',').append(width).append(',');
          if (sprites == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    SpaceObject(MeshBuilder param0) {
        int var2_int = 0;
        int var3 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        this.field_n = null;
        this.field_o = null;
        try {
          this.field_n = param0;
          var2_int = MaxLengthTextInputWidget.nextRandomInt(8192, true, RankingsRequest.field_r);
          var3 = 1024;
          dupTemp$0 = -134217728 + MaxLengthTextInputWidget.nextRandomInt(268435456, true, RankingsRequest.field_r);
          this.field_q = dupTemp$0;
          dupTemp$1 = EightBallRules.sineLookup((byte) -128, var2_int) * var3;
          this.field_m = dupTemp$1;
          dupTemp$2 = UiComponentNode.sineFixed(var2_int, (byte) 77) * var3;
          this.field_a = dupTemp$2;
          this.field_g = new int[]{dupTemp$0 >> 13, dupTemp$1 >> 13, dupTemp$2 >> 13, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          this.field_b = -(65536 + MaxLengthTextInputWidget.nextRandomInt(131072, true, RankingsRequest.field_r));
          this.field_c = MaxLengthTextInputWidget.nextRandomInt(9, true, RankingsRequest.field_r) - 5;
          this.field_h = -5 + MaxLengthTextInputWidget.nextRandomInt(9, true, RankingsRequest.field_r);
          this.field_p = new Quaternion(MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r) - 16384, MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r) - 16384, MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r) - 16384, -16384 + MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r));
          this.field_p.normalise(true);
          this.field_e = new Quaternion();
          this.field_e.setFromAxisAngle(60, MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r) - 16384, -16384 + MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r), -16384 + MaxLengthTextInputWidget.nextRandomInt(32768, true, RankingsRequest.field_r), 1 + MaxLengthTextInputWidget.nextRandomInt(8, true, RankingsRequest.field_r));
          this.field_e.normalise(true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        enterignoreAdd = "Enter name of player to add to list";
    }
}
