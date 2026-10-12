/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    private long[] field_h;
    private long[] field_k;
    private byte[] field_a;
    private long[] field_c;
    private long[] field_f;
    private byte[] field_b;
    private int field_i;
    private int field_l;
    static int field_e;
    private long[] field_j;
    static gh field_m;
    static fm field_n;
    static wk[][] field_o;
    static String field_d;
    static String[] field_g;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int incrementValue$1 = 0;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var25Lifetime2;
        int var25Lifetime1Lifetime1;
        var28 = SteelSentinels.field_G;
        try {
          var15_int = (param2 << 4) - param8;
          var16 = param14;
          var17 = param13;
          var18 = param7;
          for (var19 = param4; var19 < param10; var19++) {
            if (var17 < param9) {
              var20 = (var19 << 4) - param11;
              var21 = (var17 << param1) / param3;
              var22 = param5 * ff.field_kb[var21] >> 15;
              var23 = var19 + (131072 + var20 * var22 >> 18);
              if (639 < var23) {
                var23 = 639;
              }
              var24 = (131072 + var22 * var15_int >> 18) + param2;
              if (var24 > 479) {
                var24 = 479;
              }
              var25 = pb.field_g[var24 * 640 + var23];
              var26 = 64 + (ff.field_ib[var21] * param5 >> 17);
              if (var26 < 0) {
                throw new Error();
              }
              var27 = var26 * (16711935 & var25);
              var26 = var26 * (var25 & 65280);
              var25Lifetime2 = (var26 & 4177920) + (var27 & 1069563840);
              var27 = (12582912 & var26) + (-1073692672 & var27);
              var27 = (var27 | var27 >>> 1) & 1077952512;
              var17 = var17 + var18;
              incrementValue$1 = var16;
              var16++;
              pb.field_g[incrementValue$1] = vn.a(var27 - (var27 >>> 8), var25Lifetime2) >>> 6;
              var18 = var18 + param12;
              continue;
            }
            break;
          }
          var16Lifetime1 = param14;
          var18Lifetime1 = param7;
          var17Lifetime1 = param13;
          for (var19Lifetime1 = param4 - 1; param6 <= var19Lifetime1; var19Lifetime1--) {
            var18Lifetime1 = var18Lifetime1 - param12;
            var17Lifetime1 = var17Lifetime1 - var18Lifetime1;
            if (var17Lifetime1 < param9) {
              var20Lifetime1 = (var19Lifetime1 << 4) - param11;
              var21Lifetime1 = (var17Lifetime1 << param1) / param3;
              var22Lifetime1 = param5 * ff.field_kb[var21Lifetime1] >> 15;
              var23Lifetime1 = var19Lifetime1 + (var22Lifetime1 * var20Lifetime1 + 131072 >> 18);
              if (var23Lifetime1 < 0) {
                var23Lifetime1 = 0;
              }
              var24Lifetime1 = param2 + (var22Lifetime1 * var15_int + 131072 >> 18);
              if (var24Lifetime1 > 479) {
                var24Lifetime1 = 479;
              }
              var25Lifetime1 = pb.field_g[var24Lifetime1 * 640 + var23Lifetime1];
              var26Lifetime1 = 64 + (ff.field_ib[var21Lifetime1] * param5 >> 17);
              if (var26Lifetime1 < 0) {
                var26Lifetime1 = -var26Lifetime1;
              }
              var27Lifetime1 = var26Lifetime1 * (var25Lifetime1 & 16711935);
              var26Lifetime1 = var26Lifetime1 * (65280 & var25Lifetime1);
              var25Lifetime1Lifetime1 = (var26Lifetime1 & 4177920) + (var27Lifetime1 & 1069563840);
              var27Lifetime1 = (12582912 & var26Lifetime1) + (var27Lifetime1 & -1073692672);
              var27Lifetime1 = 1077952512 & (var27Lifetime1 | var27Lifetime1 >>> 1);
              var16Lifetime1--;
              pb.field_g[var16Lifetime1] = vn.a(var25Lifetime1Lifetime1, -(var27Lifetime1 >>> 8) + var27Lifetime1) >>> 6;
              continue;
            }
            break;
          }
          if (param0 != -88) {
            ig.a((byte) 48, -77, 97, -52, -41, 76, -64, -64, -109, 22, -123, 42, 66, -96, -39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var15), "ig.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = SteelSentinels.field_G;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_k[var2] = el.a(el.a(el.a(el.a(td.a(255L, (long)this.field_b[var3 + 4]) << 24, el.a(td.a((long)this.field_b[var3 + 3] << 32, 1095216660480L), el.a(el.a(td.a(255L, (long)this.field_b[var3 + 1]) << 48, (long)this.field_b[var3] << 56), td.a((long)this.field_b[2 + var3], 255L) << 40))), td.a((long)this.field_b[var3 + 5], 255L) << 16), td.a((long)this.field_b[var3 + 6] << 8, 65280L)), td.a((long)this.field_b[var3 + 7], 255L));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_f[var2Lifetime1];
          arrayValue$1 = this.field_k[var2Lifetime1];
          this.field_h[var2Lifetime1] = dupTemp$0;
          this.field_c[var2Lifetime1] = el.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_j[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_j[var3Lifetime1] = el.a(this.field_j[var3Lifetime1], tm.field_i[var4][ec.a((int)(this.field_h[ec.a(7, -var4 + var3Lifetime1)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_h[var3Lifetime1Lifetime1] = this.field_j[var3Lifetime1Lifetime1];
          }
          this.field_h[0] = el.a(this.field_h[0], tm.field_e[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_j[var3Lifetime1Lifetime2] = this.field_h[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_j[var3Lifetime1Lifetime2] = el.a(this.field_j[var3Lifetime1Lifetime2], tm.field_i[var7][ec.a((int)(this.field_c[ec.a(7, -var7 + var3Lifetime1Lifetime2)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_c[var3Lifetime1Lifetime3] = this.field_j[var3Lifetime1Lifetime3];
          }
        }
        if (param0) {
          field_e = -28;
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_f[var2Lifetime3] = el.a(this.field_f[var2Lifetime3], el.a(this.field_c[var2Lifetime3], this.field_k[var2Lifetime3]));
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_o = (wk[][]) null;
        if (param0 < 118) {
          field_o = (wk[][]) null;
        }
        field_m = null;
        field_n = null;
    }

    final void a(byte param0, long param1, byte[] param2) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var8Lifetime1;
        var14 = SteelSentinels.field_G;
        try {
          var5_int = 0;
          var6 = 8 - (7 & (int)param1) & 7;
          var7 = 7 & this.field_i;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_a[var11]) + (255 & (int)var9));
            this.field_a[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          var13 = -108 % ((30 - param0) / 43);
          while (param1 > 8L) {
            var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int + 1]) >>> -var6 + 8;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_b[this.field_l] = (byte)vn.a((int) this.field_b[this.field_l], var8 >>> var7);
              this.field_i = this.field_i + (8 - var7);
              this.field_l = this.field_l + 1;
              if (this.field_i == 512) {
                this.a(false);
                this.field_l = 0;
                this.field_i = 0;
              }
              this.field_b[this.field_l] = (byte)ec.a(var8 << -var7 + 8, 255);
              this.field_i = this.field_i + var7;
              param1 = param1 - 8L;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param1) {
            stackIn_16_0 = param2[var5_int] << var6;
            stackIn_16_1 = 255;
            var8Lifetime1 = stackIn_16_0 & stackIn_16_1;
            this.field_b[this.field_l] = (byte)vn.a((int) this.field_b[this.field_l], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (8L <= (long)var7 + param1) {
            this.field_l = this.field_l + 1;
            param1 = param1 - (long)(8 - var7);
            this.field_i = this.field_i + (8 - var7);
            if (512 == this.field_i) {
              this.a(false);
              this.field_i = 0;
              this.field_l = 0;
            }
            this.field_b[this.field_l] = (byte)ec.a(255, var8Lifetime1 << 8 - var7);
            this.field_i = this.field_i + (int)param1;
          } else {
            this.field_i = (int)((long)this.field_i + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ig.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var3 = SteelSentinels.field_G;
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -635160440) {
          field_o = (wk[][]) null;
        }
        while (var2 < 32) {
          this.field_a[var2] = (byte) 0;
          var2++;
        }
        this.field_l = 0;
        this.field_b[0] = (byte) 0;
        this.field_i = 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.field_f[var2Lifetime1] = 0L;
        }
    }

    final void a(byte[] param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          if (!param1) {
            this.field_k = (long[]) null;
          }
          this.field_b[this.field_l] = (byte)vn.a((int) this.field_b[this.field_l], 128 >>> ec.a(this.field_i, 7));
          this.field_l = this.field_l + 1;
          if (this.field_l > 32) {
            while (this.field_l < 64) {
              fieldTemp$0 = this.field_l;
              this.field_l = this.field_l + 1;
              this.field_b[fieldTemp$0] = (byte) 0;
            }
            this.a(false);
            this.field_l = 0;
          }
          while (32 > this.field_l) {
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_b[fieldTemp$1] = (byte) 0;
          }
          ii.a(this.field_a, 0, this.field_b, 32, 32);
          this.a(false);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_f[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ig.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ig() {
        this.field_h = new long[8];
        this.field_a = new byte[32];
        this.field_k = new long[8];
        this.field_c = new long[8];
        this.field_f = new long[8];
        this.field_b = new byte[64];
        this.field_l = 0;
        this.field_j = new long[8];
        this.field_i = 0;
    }

    static {
        field_n = new fm(2, 4, 4, 0);
        field_d = "Cancel rematch";
        field_g = new String[]{"The Golem-class sentinel entered the war in the early stages to replace conventional armour. Even to this day it remains a strong weapons platform for supporting the larger chassis.", "Slave-class sentinels specialise in closing in and destroying targets at close range. They are fitted with powerful legs, capable of leaping onto buildings for added tactical movement in a combat situation.", "When speed and accuracy are required, the Aquila-class scout sentinel is the robot for the job. The default design is fitted with a targeting system for perfect accuracy with its lasers, and also anti-air support from its missile systems.", "Long-range fire support is granted through the Turtle-class sentinel. Fitted with multiple heavy rockets and an ordnance weapon point on its back, a constant barrage of destruction can be created while you slowly advance.", "Commando-class sentinels provide a powerful mix of EMP rockets, a long range sniper cannon and close-range support with plasma and thunder blade.", "The Hurricane-class sentinel was designed as an aerial missile platform. It leaps into the air to launch its payload while utilising its rail guns for long range sniping.", "The high-speed Scorpion-class chassis destroys targets at close range with its top-mounted ultra gun, while keeping air defences enabled with targeted laser beams.", "As the war progressed, earlier sentinels were replaced with the heavier Crusher-class. Featuring a back-mounted ordnance slot, stormhammer, thrusters and a range of weapon points, this sentinel provided well-supported power for any situation.", "The colossal Bertha-class sentinel was one of the first chassis designs to be used in the war. Low-tech, but massive in design, it relies on outlasting its opponents and dealing massive damage at long range with its heavy rocket systems.", "Only just entering operation, the Orbital-class sentinel was designed to be a space-borne weapons platform. At the last moment, however, it was converted for atmospheric use, with the addition of extra heavy guns for missile defence.", "As the most advanced sentinel within the war, the Valhalla-class design is feared by commanders throughout the systems. It contains state-of-the-art energy weapons to deal with all manner of situations, as well as the devastating fusion blade for close-range decapitation.", "The first and last Babel-class sentinel started the war. The Babel landed on Ilolian Prime, and proceeded to destroy the whole planetary defence force over weeks of fighting. Commanders throughout the systems knew at this point that the old wars had ended, and the age of the sentinel had begun."};
    }
}
