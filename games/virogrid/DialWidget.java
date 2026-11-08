/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DialWidget extends TextButton {
    static int field_K;
    int field_F;
    int field_N;
    int field_G;
    int field_Q;
    static IntrusiveDeque field_P;
    int field_O;
    int field_M;
    static Js5Archive field_I;
    static java.util.zip.CRC32 field_S;
    static String field_L;
    static SpriteWidget field_J;
    static SpriteWidget field_H;
    static PlatformTaskDispatcher field_R;

    public static void releaseStatics(byte param0) {
        field_I = null;
        field_R = null;
        field_H = null;
        field_L = null;
        field_S = null;
        if (param0 != -124) {
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          DialWidget.decodeMesh((CipherPacketBuffer) null, 93);
        }
        field_P = null;
        field_J = null;
    }

    final static TriangleMesh decodeMesh(CipherPacketBuffer param0, int param1) {
        int var7 = 0;
        TriangleMesh stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.readBits((byte) -78, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param1 != 13472) {
            DialWidget.releaseStatics((byte) -24);
          }
          var3 = UrlRewriteHelpers.readBooleanBit(1, param0) ? 1 : 0;
          var4 = UrlRewriteHelpers.readBooleanBit(1, param0) ? 1 : 0;
          var5 = new TriangleMesh();
          var5.field_h = (short)param0.readBits((byte) -78, 16);
          var5.field_l = DisplayNameHelpers.readPackedShorts(var5.field_l, -27, 16, param0);
          var5.field_b = DisplayNameHelpers.readPackedShorts(var5.field_b, -67, 16, param0);
          var5.field_H = DisplayNameHelpers.readPackedShorts(var5.field_H, -35, 16, param0);
          var5.field_k = (short)param0.readBits((byte) -78, 16);
          var5.field_J = DisplayNameHelpers.readPackedShorts(var5.field_J, -13, 16, param0);
          var5.field_e = DisplayNameHelpers.readPackedShorts(var5.field_e, -6, 16, param0);
          var5.field_j = DisplayNameHelpers.readPackedShorts(var5.field_j, -78, 16, param0);
          if (var3 != 0) {
            var5.field_i = (short)param0.readBits((byte) -78, 16);
            var5.field_A = DisplayNameHelpers.readPackedShorts(var5.field_A, -77, 16, param0);
            var5.field_G = DisplayNameHelpers.readPackedShorts(var5.field_G, -51, 16, param0);
            var5.field_D = DisplayNameHelpers.readPackedShorts(var5.field_D, -13, 16, param0);
            var5.field_y = DisplayNameHelpers.readPackedShorts(var5.field_y, -110, 16, param0);
            var5.field_I = DisplayNameHelpers.readPackedShorts(var5.field_I, -41, 16, param0);
            var5.field_K = DisplayNameHelpers.readPackedShorts(var5.field_K, -15, 16, param0);
          }
          if (var4 != 0) {
            param0.readBits((byte) -78, 16);
            var5.field_s = DisplayNameHelpers.readPackedShorts(var5.field_s, -119, 16, param0);
            var5.field_d = DisplayNameHelpers.readPackedShorts(var5.field_d, -108, 16, param0);
            var5.field_t = DisplayNameHelpers.readPackedShorts(var5.field_t, param1 - 13589, 16, param0);
            var5.field_x = DisplayNameHelpers.readPackedShorts(var5.field_x, -120, 16, param0);
            var5.field_O = DisplayNameHelpers.readPackedShorts(var5.field_O, param1 - 13576, 16, param0);
          }
          if (UrlRewriteHelpers.readBooleanBit(1, param0)) {
            var5.field_S = DisplayNameHelpers.readPackedShorts(var5.field_S, -27, 16, param0);
          }
          if (UrlRewriteHelpers.readBooleanBit(1, param0)) {
            var5.field_z = IndexedSpriteState.readPackedByteArray(16, var5.field_z, param0, 8);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_z.length; var7++) {
              if (var6 < (255 & var5.field_z[var7])) {
                var6 = var5.field_z[var7] & 255;
              }
            }
            if (var6 == 0) {
              var5.field_z = null;
            } else {
              var5.field_a = (byte)(1 + var6);
            }
          }
          stackIn_27_0 = var5;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("qn.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_M + (-this.field_l + (-param3 + param6));
          var9 = -this.field_N - this.field_u - (param5 - param4);
          if (this.field_F * this.field_F > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - LoginCredentials.field_b;
            if (!(0.0 > var10)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_Q;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_Q;
            }
            this.field_G = (int)(var10 * (double)this.field_Q / 6.283185307179586);
            while (this.field_Q <= this.field_G) {
              this.field_G = this.field_G - this.field_Q;
            }
            while (0 > this.field_G) {
              this.field_G = this.field_G + this.field_Q;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("qn.NA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private DialWidget() throws Throwable {
        throw new Error();
    }

    static {
        field_K = 2;
        field_P = new IntrusiveDeque();
        field_L = "<%0> has resigned.";
        field_S = new java.util.zip.CRC32();
    }
}
