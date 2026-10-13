/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends d {
    int field_R;
    int field_K;
    int field_W;
    static String field_V;
    static PacketBuffer field_N;
    static boolean field_L;
    int field_Q;
    static cd field_X;
    static String field_T;
    static ResourceArchive field_S;
    int field_Z;
    static String field_P;
    static String field_Y;
    static int field_U;
    int field_O;
    static String field_M;

    public static void a(int param0) {
        field_V = null;
        field_M = null;
        field_N = null;
        field_P = null;
        field_S = null;
        if (param0 >= 89) {
          field_X = null;
          field_T = null;
          field_Y = null;
          return;
        }
        vh.h(64);
        field_X = null;
        field_T = null;
        field_Y = null;
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param1 + (-this.field_o - param2) - this.field_Z;
          var9 = -param3 - this.field_w - this.field_R + param5;
          if (var8_int * var8_int + var9 * var9 >= this.field_W * this.field_W) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - hh.field_d;
          if (!(0.0 > var10)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_K;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_K;
          }
          this.field_O = (int)(var10 * (double)this.field_K / 6.283185307179586);
          while (this.field_K <= this.field_O) {
            this.field_O = this.field_O - this.field_K;
          }
          while (this.field_O < 0) {
            this.field_O = this.field_O + this.field_K;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("vh.MA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int h(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = 0;
          while (jl.pollKeyEvent((byte) 5)) {
            ArcticBackground.field_r.navigateVertical(param0 - 1);
            if (!ArcticBackground.field_r.isActivated((byte) 113)) {
              continue;
            }
            var1_int = 1;
          }
          ArcticBackground.field_r.updatePointer(aj.a(param0 + param0, po.pointerY, pq.pointerX), param0 ^ 27479, aj.a(0, qo.pressY, tb.pressX));
          if (ArcticBackground.field_r.isActivated((byte) 113)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            ArcticBackground.field_r.selectedIndex >= 0) {
            var2 = hi.field_A[ArcticBackground.field_r.selectedIndex];
            if (var2 == 2) {
              DualLinkIterator.b((byte) 99);
            }
          }
          stackIn_14_0 = var2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "vh.B(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 25 % ((param1 + 25) / 49);
          ik.field_g = up.field_v;
          if (param0 != 255) {
            if (param0 < 100) {
              ni.field_Rb = AchievementIcon.a(param0, -126, param2);
              return;
            }
            if (param0 > 105) {
              ni.field_Rb = AchievementIcon.a(param0, -126, param2);
              return;
            }
            ni.field_Rb = IntKeyIndex.a(-2079, param3);
            return;
          }
          stackIn_4_0 = true;
          stackIn_5_1 = !(Paddle.field_x >= 13);
          ni.field_Rb = cd.a(stackIn_4_0, stackIn_5_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private vh() throws Throwable {
        throw new Error();
    }

    static {
        field_V = "Sticky: any balls that hit the paddle stick to it";
        field_T = "Basic Bricks";
        field_X = new cd(3);
        field_Y = "Report abuse";
        field_P = "Waiting for fonts";
        field_M = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
