/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends DualNode {
    int field_O;
    private int field_C;
    private boolean field_Q;
    int field_z;
    private Sentinel[] field_A;
    static String field_J;
    private RgbSprite field_P;
    private int field_D;
    static PacketBuffer field_y;
    int field_S;
    private boolean field_U;
    int field_K;
    boolean field_E;
    static vk field_N;
    int field_F;
    private CombatWorld field_B;
    Sentinel field_T;
    int field_I;
    static IndexedSprite[] field_R;
    private boolean field_L;
    static String field_H;
    static int[] field_G;
    private int field_M;

    final static int[] a(int param0, byte param1) {
        int incrementValue$0 = 0;
        Object stackIn_6_0 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int[] stackIn_41_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var2 = nl.a(param0, (byte) 124);
          if (null != var2 &&
            var2.length != 0) {
            var3 = new int[-9 + var2.length];
            ii.a(var2, 1, var3, 0, var3.length);
            var4 = 0;
            var5_int = 0;
            while (true) {
              stackIn_9_0 = var3.length;
              stackIn_9_1 = var5_int;
              if (stackIn_9_0 > stackIn_9_1) {
                stackIn_28_0 = 0;
                stackIn_28_1 = qg.a((byte) -60, var3[var5_int]);
                if (var7 == 0) {
                  if (stackIn_28_0 <= stackIn_28_1) {
                    var3[var5_int] = -1;
                  }
                  if (0 <= var3[var5_int]) {
                    var4++;
                    var6 = 1 + var5_int;
                    while (var6 < var3.length) {
                      stackIn_9_0 = var3[var5_int];
                      stackIn_9_1 = var3[var6];
                      if (stackIn_9_0 == stackIn_9_1) {
                        var3[var6] = -1;
                      }
                      var6++;
                    }
                  }
                  var5_int++;
                  continue;
                }
              } else {
                stackIn_28_0 = param1;
                stackIn_28_1 = 28;
              }
              if (stackIn_28_0 != stackIn_28_1) {
                ne.g(61);
              }
              var5 = new int[var4];
              var4 = 0;
              var6Lifetime1 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var3.length <= var6Lifetime1))) {
                stackIn_41_0 = var3;
                if (var7 == 0) {
                  if (stackIn_41_0[var6Lifetime1] != -1) {
                    incrementValue$0 = var4;
                    var4++;
                    var5[incrementValue$0] = var3[var6Lifetime1];
                  }
                  var6Lifetime1++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_41_0 = var5;
              }
              return stackIn_41_0;
            }
          }
          stackIn_6_0 = null;
          return (int[]) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ne.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(Sentinel param0, byte param1) {
        RuntimeException stackIn_186_0 = null;
        StringBuilder stackIn_186_1 = null;
        String stackIn_187_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var4 = SteelSentinels.obfuscationControl;
        try {
          this.field_T = param0;
          if (!this.field_Q &&
            this.field_T.activeModuleType != -1) {
            nh.a(true, this.field_T);
          }
          if (43 != this.field_O) {
            this.field_T.field_tb = this.field_T.field_tb + 1;
          }
          if (!this.field_Q) {
            param0.activeModuleType = this.field_O;
            param0.field_xb = this.field_E;
            param0.field_v = this.field_F;
          }
          boolean decompiledFrameRemainder18 = true;
          boolean decompiledFrameRemainder17 = true;
          boolean decompiledFrameRemainder16 = true;
          boolean decompiledFrameRemainder15 = true;
          boolean decompiledFrameRemainder14 = true;
          boolean decompiledFrameRemainder13 = true;
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          param0.field_F = -Math.abs(param0.field_F);
          var3_int = this.field_O;
          if ((var3_int != 10 ||
            var4 != 0) &&
            (decompiledFrameRemainder0 = (11 != var3_int ||
            var4 != 0)) &&
            (decompiledFrameRemainder1 = (12 != var3_int)) &&
            (decompiledFrameRemainder2 = (var3_int != 13 ||
            var4 != 0)) &&
            (decompiledFrameRemainder3 = (14 != var3_int ||
            var4 != 0)) &&
            (decompiledFrameRemainder4 = (var3_int != 0 ||
            var4 != 0)) &&
            (decompiledFrameRemainder5 = (var3_int != 1)) &&
            (decompiledFrameRemainder6 = (var3_int != 2 ||
            var4 != 0)) &&
            (decompiledFrameRemainder7 = (3 != var3_int)) &&
            (decompiledFrameRemainder8 = (var3_int != 4)) &&
            (decompiledFrameRemainder9 = (var3_int != 20))) {
            decompiledFrameRemainder10 = (5 != var3_int ||
              var4 != 0);
            if (((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder10 = (6 != var3_int)) &&
              (decompiledFrameRemainder10 = (7 != var3_int ||
              var4 != 0)) &&
              (decompiledFrameRemainder10 = (var3_int != 8 ||
              var4 != 0)) &&
              (decompiledFrameRemainder10 = (var3_int != 9))) &&
              (decompiledFrameRemainder11 = (var3_int != 29 ||
              var4 != 0)) &&
              (decompiledFrameRemainder12 = (28 != var3_int)) &&
              (decompiledFrameRemainder13 = (var3_int != 15 ||
              var4 != 0)) &&
              (decompiledFrameRemainder14 = (var3_int != 36 ||
              var4 != 0)) &&
              (decompiledFrameRemainder15 = (var3_int != 43 ||
              var4 != 0)) &&
              (decompiledFrameRemainder16 = (var3_int != 44)) &&
              (decompiledFrameRemainder18 = (var3_int == 45))) {
              decompiledFrameRemainder17 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            param0.field_Q = param0.field_Q + 100;
            param0.field_S = param0.field_Q;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            param0.field_Q = param0.field_Q + 200;
            param0.field_S = param0.field_Q;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            param0.field_Q = param0.field_Q + 300;
            param0.field_S = param0.field_Q;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            param0.field_Q = param0.field_Q + 400;
            param0.field_S = param0.field_Q;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            param0.field_Q = param0.field_Q + 500;
            param0.field_S = param0.field_Q;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            param0.field_wb = param0.field_wb + 1;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            param0.field_wb = param0.field_wb + 2;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            param0.field_wb = param0.field_wb + 3;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            param0.field_wb = param0.field_wb + 4;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9)) {
            param0.field_wb = param0.field_wb + 5;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10)) {
            param0.field_wb = param0.field_wb + 10;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11)) {
            param0.maximumCharge = param0.maximumCharge + ag.a(111, this.field_O);
            param0.refillCharge(5);
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12)) {
            param0.field_cb = param0.field_cb * 2;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13)) {
            param0.field_Fb = param0.field_Fb * 2;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14)) {
            var3_intLifetime2 = param0.charge;
            param0.charge = 10;
            param0.b((byte) -31, (SentinelCommand) null);
            param0.charge = var3_intLifetime2;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15)) {
            this.field_B.field_q = this.field_B.field_q + 6000000;
            param0.maximumArmour = param0.maximumArmour + 100;
            param0.restoreArmour(-20039);
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16)) {
            param0.field_Cb = true;
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if ((decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17)) {
            param0.a((byte) -65);
            decompiledFrameRemainder18 = (var4 != 0);
          }
          if (decompiledFrameRemainder18) {
            this.field_B.field_M = this.field_B.field_M + 1;
            this.field_B.field_N = this.field_B.field_N - 22;
            this.field_B.field_f = this.field_B.field_f + 10;
          }
          var3_intLifetime1 = 13 / ((param1 - 5) / 63);
          if (param0.playerId == ed.field_j) {
            g.field_h = this.field_O;
            pd.field_X = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_186_0 = var3;
          stackIn_186_1 = new StringBuilder().append("ne.E(");
          if (param0 == null) {
            stackIn_187_2 = "null";
          } else {
            stackIn_187_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_186_0), ((StringBuilder) (Object) stackIn_186_1).append(stackIn_187_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        boolean stackIn_11_0 = false;
        int stackIn_58_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        Sentinel[] var7 = null;
        int var8 = 0;
        double var8_double = 0.0;
        int var9 = 0;
        int var10_int = 0;
        double var10_double = 0.0;
        Sentinel var10 = null;
        int var11 = 0;
        ParticleEffect var12_ref_qb = null;
        int var12 = 0;
        int var13 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var6Lifetime2;
        var13 = SteelSentinels.obfuscationControl;
        try {
          this.field_K = this.field_K - 1;
          if (this.field_K <= 0) {
            return;
          }
          if (null != this.field_T) {
            return;
          }
          boolean decompiledFrameCompleted1 = true;
          if (this.field_P != null) {
            var2_int = this.field_P.field_E.length;
            var6 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var6 >= var2_int))) {
              var4 = 255 & this.field_P.field_E[var6] >> 8;
              var5 = this.field_P.field_E[var6] & 255;
              var3 = (16711680 & this.field_P.field_E[var6]) >> 16;
              stackOut_10_0 = this.field_Q;
              stackIn_58_0 = stackOut_10_0 ? 1 : 0;
              stackIn_11_0 = stackOut_10_0;
              if (var13 == 0) {
                if (stackIn_11_0) {
                  if (var4 > 0) {
                    var4--;
                  }
                  if (var3 > 0 &&
                    (this.field_K & 3) != 0) {
                    var3--;
                  }
                  if (0 < var5 &&
                    (this.field_K & 3) != 0) {
                    var5--;
                  }
                } else {
                  if (var5 > 0 &&
                    (this.field_K & 1) == 0) {
                    var5--;
                  }
                  if (var3 > 0) {
                    var3--;
                  }
                  if (var4 > 0) {
                    var4--;
                  }
                }
                this.field_P.field_E[var6] = var5 + ((var4 << 8) + (var3 << 16));
                if (this.field_L &&
                  0 != this.field_P.field_E[var6]) {
                  this.field_P.field_E[var6] = ec.a(~this.field_P.field_E[var6], 16777215);
                }
                var6++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_58_0 = 0;
            }
            var6Lifetime2 = stackIn_58_0;
            while (2 > var6Lifetime2) {
              this.field_C = this.field_C + 1;
              stackIn_72_0 = ~var2_int;
              stackIn_72_1 = ~this.field_C;
              if (var13 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_72_0 >= stackIn_72_1) {
                this.field_C = 0;
              }
              this.field_P.field_E[this.field_C] = nc.a(this.field_O, (byte) -114).field_o[nc.a(this.field_O, (byte) -113).field_p[this.field_C]];
              if (this.field_P.field_E[this.field_C] == 0) {
                var6Lifetime2--;
              }
              var6Lifetime2++;
            }
          }
          if (decompiledFrameCompleted1) {
            var2_int = -this.field_B.terrain.getGroundHeightAt((byte) -99, this.field_z >> 4) << 4;
            stackIn_72_0 = -this.field_B.terrain.getSecondaryHeightAt(false, this.field_z >> 4);
            stackIn_72_1 = 1285948708;
          }
          var3Lifetime1 = stackIn_72_0 << stackIn_72_1;
          var4Lifetime1 = -this.field_B.terrain.getSurfaceProfileAt((byte) 121, this.field_z >> 4) << 4;
          var5Lifetime1 = var2_int;
          if (~var3Lifetime1 != ~var4Lifetime1 &&
            this.field_I < var4Lifetime1) {
            var5Lifetime1 = var3Lifetime1;
          }
          stackIn_83_0 = (this.field_I < var5Lifetime1) ? 0 : 1;
          var6Lifetime1 = stackIn_83_0;
          if (4 == this.field_B.terrain.getTerrainType(114) &&
            this.field_I >= 0) {
            this.field_B.pendingRemovals.addLast((byte) 114, (DualNode) (this));
            return;
          }
          if (var6Lifetime1 == 0) {
            this.field_S = this.field_S + this.field_B.gravityAcceleration;
            if (this.field_U) {
              this.field_S = this.field_S - 3 * this.field_B.gravityAcceleration / 4;
            }
            this.field_I = this.field_I + this.field_S;
            if (var5Lifetime1 <= this.field_I) {
              var6Lifetime1 = 1;
            }
          }
          if (var6Lifetime1 != 0) {
            this.field_S = 0;
            this.field_U = false;
            this.field_I = var5Lifetime1;
          }
          if (this.field_B.terrain.getTerrainType(106) == 3 &&
            !this.field_L) {
            var7_int = this.field_B.terrain.getProfileLength(-116) >> 1;
            var8 = 600;
            var9 = 5120;
            var10_int = -var7_int + (this.field_z >> 4);
            var11 = (this.field_I >> 4) - var8;
            if ((var9 * var9) > (var11 * var11 + var10_int * var10_int)) {
              this.field_L = true;
            }
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_L) {
            this.field_K = Math.min(500, -1 + this.field_K);
            this.field_S = Math.min(this.field_S, 50);
            if (!this.field_B.field_h) {
              var7_intLifetime1 = 0;
              while (2 > var7_intLifetime1) {
                var8_double = Math.random() * 6.283185307179586;
                var10_double = Math.random() * 512.0;
                var12_ref_qb = ArticulatedPart.createParticle(8, (int)(Math.sin(var8_double) * var10_double), this.field_B, 90, this.field_I, false, 250, (int)((double)(this.field_S + 10) - Math.abs(Math.cos(var8_double)) * var10_double), this.field_z, this.field_z);
                this.field_B.pendingParticles.addLast(3, var12_ref_qb);
                var7_intLifetime1++;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_z = Math.max(0, Math.min(-128 + (this.field_B.terrain.getProfileLength(106) << 4), this.field_z));
          }
          var8Lifetime1 = 9 % ((param0 + 25) / 39);
          var7 = this.field_A;
          var9Lifetime1 = 0;
          while (var9Lifetime1 < var7.length) {
            var10 = var7[var9Lifetime1];
            if (var13 != 0) {
              return;
            }
            if (var10 == null &&
              var13 == 0) {
              return;
            }
            if (!var10.field_V &&
              !var10.field_Hb) {
              var11Lifetime1 = var10.field_Ub << 3;
              var12 = var10.field_Db << 4;
              if (var10.worldX + var11Lifetime1 >= this.field_z - this.field_M / 2 &&
                this.field_z + this.field_M / 2 > var10.worldX - var11Lifetime1 &&
                (this.field_I - this.field_D) <= var10.worldY &&
                (var10.worldY - var12) < this.field_I) {
                this.a(var10, (byte) -86);
                fc.a((byte) -73, 102, this.field_z);
                return;
              }
            }
            var9Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ne.D(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_R = null;
        field_J = null;
        if (param0 != -23261) {
          return;
        }
        try {
          field_y = null;
          field_H = null;
          field_N = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ne.B(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0;
        RuntimeException var3 = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (!f.a(param1, 4, param2)) {
            return false;
          }
          var3_int = 113 / ((5 - param0) / 50);
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var4 < param1.length())))) {
            stackOut_8_0 = im.a(param1.charAt(var4), false);
            stackIn_17_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (var5 == 0) {
              if (!stackIn_9_0) {
                return false;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = true;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ne.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_17_4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        try {
          var5_int = (this.field_z * param0 >> 16) + param3;
          var6 = param1 + (this.field_I * param0 >> 16);
          var7 = this.field_P.field_z / 2 + 2;
          var8 = 2 + this.field_P.field_B / 2;
          var9 = 3 * (param0 * this.field_M >> 16) / 2;
          var10 = (this.field_D * param0 >> 16) * 3 / 2;
          if (param2 != -1) {
            return;
          }
          var11 = Math.min(256, this.field_K / 2);
          if (null == sl.field_p) {
            sl.field_p = new RgbSprite(var9, var8 + (var10 + 5));
          }
          sl.field_p.d();
          SoftwareRaster.a(0, 0, sl.field_p.field_z, sl.field_p.field_B, 0);
          var6 = var6 - (var10 - 5);
          var12 = this.field_K / 5 % 3;
          var5_int = var5_int - var9 / 2;
          var13 = 6719624;
          if (this.field_Q) {
            var13 = 8921736;
          }
          var14 = sl.field_p.field_B - var10;
          if (!this.field_L ||
            !(Math.random() < 0.1)) {
            var15 = (var9 - var7) / 2 - (-(this.field_C % this.field_P.field_A / 2) - (this.field_P.field_D / 2 + (int)(2.0 * Math.sin((double)this.field_K * 0.2))));
            var16 = 2 + (this.field_P.field_H / 2 + this.field_C / (this.field_P.field_F * 2) + (int)(Math.cos((double)this.field_K * 0.3) * 2.0));
            this.field_P.b((var9 - var7) / 2 + (int)(2.0 * Math.sin(0.2 * (double)this.field_K)), 2 + (int)(Math.cos((double)this.field_K * 0.3) * 2.0));
            stackIn_16_0 = var9 / 2 + (int)(Math.sin((double)this.field_K * 0.1) * 5.0);
            stackIn_16_1 = var14;
            stackIn_16_2 = var15;
            stackIn_16_3 = var16;
            if (this.field_Q) {
              stackIn_17_4 = 12264123;
            } else {
              stackIn_17_4 = 12303138;
            }
            SoftwareRaster.f(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_17_4, 192);
            SoftwareRaster.a(-1 + var15, var16, var13);
            SoftwareRaster.a(var15, var16 - 1, var13);
            SoftwareRaster.a(1 + var15, var16, var13);
            SoftwareRaster.a(var15, var16 + 1, var13);
            stackIn_20_0 = var15;
            stackIn_20_1 = var16;
            if (this.field_Q) {
              stackIn_21_2 = 16755455;
            } else {
              stackIn_21_2 = 11206655;
            }
            SoftwareRaster.a(stackIn_20_0, stackIn_20_1, stackIn_21_2);
          }
          ml.field_c[var12].b(0, var14, var9, var10);
          if (this.field_L) {
          }
          var6 = var6 - var10;
          sb.field_bb.b((byte) 123);
          if (var11 >= 256) {
            sl.field_p.a(var5_int, var6);
            if (SteelSentinels.obfuscationControl == 0) {
              return;
            }
          }
          sl.field_p.b(var5_int, var6, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ne.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ne(CombatWorld param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        IndexedSprite var4 = null;
        NodeIterator var5 = null;
        Sentinel var6 = null;
        int var7 = 0;
        var7 = SteelSentinels.obfuscationControl;
        this.field_Q = false;
        this.field_S = 0;
        this.field_K = 3000;
        this.field_F = 1500;
        this.field_D = 4096;
        this.field_E = true;
        this.field_M = 4096;
        this.field_L = false;
        try {
          this.field_O = param1;
          this.field_B = param0;
          var3_int = this.field_B.playerCount + this.field_B.computerPlayerCount;
          this.field_A = new Sentinel[var3_int];
          var4_int = 0;
          var5 = new NodeIterator(this.field_B.sentinels);
          var6 = (Sentinel) (var5.b(2));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var6))) {
            stackIn_14_0 = -1;
            stackIn_14_1 = ~var6.playerId;
            if (var7 == 0) {
              if (stackIn_14_0 >= stackIn_14_1 &&
                var3_int > var6.playerId) {
                incrementValue$0 = var4_int;
                var4_int++;
                this.field_A[incrementValue$0] = var6;
              }
              var6 = (Sentinel) (var5.d(2));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var4_int = this.field_O;
            stackIn_14_0 = -25;
            stackIn_14_1 = ~var4_int;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_14_0 == stackIn_14_1) {
            this.field_E = false;
            this.field_F = 2147483647;
            decompiledFrameRemainder1 = (var7 != 0);
          } else {
            if (var4_int != 36 && (var4_int != 15 ||
              var7 != 0) && (var4_int != 44 &&
              var4_int != 45)) {
              decompiledFrameRemainder0 = (var4_int != 43);
              decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.field_Q = true;
            decompiledFrameRemainder1 = (var7 != 0);
          }
          if (decompiledFrameRemainder1) {
            this.field_K = 2147483647;
            this.field_Q = true;
          }
          if (this.field_Q) {
            this.field_F = 100;
            this.field_E = false;
          }
          if (!this.field_B.field_h) {
            var4 = nc.a(this.field_O, (byte) -97);
            this.field_P = new RgbSprite(var4.field_a, var4.field_i);
            this.field_P.field_H = var4.field_n / 2;
            this.field_P.field_D = var4.field_j / 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("ne.<init>(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_J = "Progress <col=ffffff><%0>%</col>";
        field_y = new PacketBuffer(256);
        field_H = "Only show game chat from my friends";
    }
}
