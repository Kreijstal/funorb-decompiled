/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc extends to {
    private BitmapFont field_w;
    private int field_u;
    private String field_A;
    private boolean field_y;
    static String field_v;
    private int field_z;
    private int field_x;

    final static int a(String param0, byte param1) {
        String stackIn_46_2 = null;
        Throwable decompiledCaughtException = null;
        File var12 = null;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!bm.field_I.field_q) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (vg.field_j.containsKey(param0)) {
            int stackIn_6_0 = 100;
            return stackIn_6_0;
          }
          String var11 = SoundCache.a(param0, (byte) -18);
          if (var11 == null) {
            int stackIn_10_0 = -1;
            return stackIn_10_0;
          }
          String var3 = bl.field_g + var11;
          if (!rj.field_b.a(var3, -126, "")) {
            int stackIn_13_0 = -1;
            return stackIn_13_0;
          }
          if (!rj.field_b.c(var3, -14012)) {
            int stackIn_16_0 = rj.field_b.a(var3, (byte) -79);
            return stackIn_16_0;
          }
          byte[] var15 = rj.field_b.a(var3, (byte) -71, "");
          byte[] var13 = var15;
          byte[] var4 = var13;
          int var6 = -26 / ((param1 + 35) / 33);
          Object var5 = null;
          try {
            var12 = qc.a(true, var11);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            RuntimeException var7_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
            int stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          if (var4 != null &&
            var12 != null) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            int var7 = 1;
            byte[] var16 = ee.a(true, var12);
            byte[] var14 = var16;
            byte[] var8 = var14;
            if (var8 != null &&
              var15.length == var16.length) {
              int var9_int = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var16.length <= var9_int))) {
                if (var15[var9_int] == var16[var9_int]) {
                  var9_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted0 = false;
              }
              if (decompiledFrameCompleted0) {
                var7 = 0;
                decompiledFrameRemainder0 = false;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var7 = 0;
            }
            try {
              if (var7 == 0) {
                bm.field_I.a(var12, var15, true);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Throwable var9 = decompiledCaughtException;
              int stackIn_38_0 = -1;
              return stackIn_38_0;
            }
            vn.a(0, var12, param0);
            int stackIn_40_0 = 100;
            return stackIn_40_0;
          }
          int stackIn_42_0 = -1;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          RuntimeException var2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_45_0 = var2;
          StringBuilder stackIn_45_1 = new StringBuilder().append("bc.V(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_v = null;
        if (param0 != 14912) {
          field_v = (String) null;
        }
    }

    final String c(byte param0) {
        int var2 = this.field_s.field_g ? 1 : 0;
        this.field_s.field_g = this.field_g;
        if (param0 < -41) {
          String var3 = this.field_s.c((byte) -75);
          this.field_s.field_g = var2 != 0 ? true : false;
          return var3;
        }
        field_v = (String) null;
        String var3Lifetime1 = this.field_s.c((byte) -75);
        this.field_s.field_g = var2 != 0 ? true : false;
        return var3Lifetime1;
    }

    bc(int param0, int param1, int param2, int param3, ea param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ir) null, (no) null);
        int stackIn_10_0 = 0;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        try {
          this.field_x = param6;
          this.field_z = param7;
          this.field_A = param10;
          this.field_u = param9;
          boolean stackIn_4_1 = (param5);
          this.field_y = stackIn_4_1;
          this.field_w = param8;
          this.field_s = param4;
          int var12_int = -this.field_z + this.field_x;
          int var13 = this.field_w.measureWrappedHeight(param10, var12_int, this.field_w.maxAscent) + 2 * this.field_z;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(var13, param0, param1, param2, (byte) 123);
          }
          if (!this.field_y) {
            stackIn_10_0 = this.field_x + this.field_z * 2;
          } else {
            stackIn_10_0 = 0;
          }
          int var14 = stackIn_10_0;
          this.field_s.a(param3 - 2 * this.field_z, var14, this.field_z + (var13 - param3 >> 1), param2 - (this.field_x + this.field_z * 3), (byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var12 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var12;
          StringBuilder stackIn_14_1 = new StringBuilder().append("bc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = this.field_p + param3;
        if (param0 < 64) {
          return;
        }
        int var6 = this.field_h + param2;
        super.a((byte) 108, param1, param2, param3);
        if (0 == param1) {
          int var7 = this.field_y ? -this.field_x + this.field_q - 2 * this.field_z : 0;
          this.field_w.drawParagraph(this.field_A, this.field_z + var7 + var5, var6 + this.field_z, -this.field_z + this.field_x, -(2 * this.field_z) + this.field_n, this.field_u, -1, this.field_y ? 0 : 2, 1, this.field_w.maxAscent);
          return;
        }
    }

    static {
        field_v = "Connection lost. <%0>";
    }
}
