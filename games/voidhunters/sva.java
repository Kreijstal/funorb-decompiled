/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sva extends le {
    private int field_j;
    private int field_k;
    static int field_m;
    private int field_l;
    private int field_i;
    private int field_n;

    final int[] a(int param0, boolean param1) {
        int var7 = 0;
        int var23 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int[] var3;
        int var4;
        Random var6;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var24;
        int var25;
        int var26;
        int var27;
        int[][] var31;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        var27 = VoidHunters.field_G;
        var3 = this.field_f.a((byte) 117, param0);
        if (this.field_f.field_e) {
          var4 = this.field_j >> 1;
          var31 = this.field_f.b(73);
          var6 = new Random((long)this.field_n);
          for (var7 = 0; this.field_k > var7; var7++) {
            if (this.field_j <= 0) {
              stackIn_7_0 = this.field_i;
            } else {
              stackIn_7_0 = this.field_i + (-var4 + hob.a(var6, this.field_j, 124));
            }
            var8 = stackIn_7_0;
            var8 = var8 >> 4 & 255;
            var9 = hob.a(var6, hob.field_d, 127);
            var10 = hob.a(var6, noa.field_o, 117);
            var11 = var9 + (jmb.field_q[var8] * this.field_l >> 12);
            var12 = var10 + (qta.field_o[var8] * this.field_l >> 12);
            var13 = -var10 + var12;
            var14 = -var9 + var11;
            if (var14 != 0 ||
              var13 != 0) {
              if (0 > var14) {
                var14 = -var14;
              }
              if (var13 < 0) {
                var13 = -var13;
              }
              stackIn_20_0 = (var14 >= var13) ? 0 : 1;
              var15 = stackIn_20_0;
              if (var15 != 0) {
                var16 = var9;
                var17 = var11;
                var9 = var10;
                var11 = var12;
                var10 = var16;
                var12 = var17;
              }
              if (var9 > var11) {
                var16Lifetime1 = var9;
                var9 = var11;
                var17Lifetime1 = var10;
                var10 = var12;
                var11 = var16Lifetime1;
                var12 = var17Lifetime1;
              }
              var16Lifetime2 = var10;
              var17Lifetime2 = var11 - var9;
              var18 = var12 - var10;
              var19 = -var17Lifetime2 / 2;
              var20 = 2048 / var17Lifetime2;
              var21 = 1024 - (hob.a(var6, 4096, 127) >> 2);
              stackIn_27_0 = (var12 > var10) ? 1 : -1;
              var22 = stackIn_27_0;
              if (var18 < 0) {
                var18 = -var18;
              }
              for (var23 = var9; var23 < var11; var23++) {
                var24 = var20 * (var23 - var9) + 1024 + var21;
                var25 = gbb.field_q & var23;
                var26 = var16Lifetime2 & wf.field_d;
                var19 = var19 + var18;
                if (var15 == 0) {
                  var31[var25][var26] = var24;
                } else {
                  var31[var26][var25] = var24;
                }
                if (var19 > 0) {
                  var19 = -var17Lifetime2 + var19;
                  var16Lifetime2 = var16Lifetime2 + var22;
                }
              }
            }
          }
        }
        if (!param1) {
          sva.e((byte) 3);
        }
        return var3;
    }

    public sva() {
        super(0, true);
        this.field_k = 2000;
        this.field_j = 4096;
        this.field_l = 16;
        this.field_n = 0;
        this.field_i = 0;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            this.a(66, true);
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.field_n = param2.e((byte) -101);
          } else {
            if (var4_int == 1) {
              this.field_k = param2.e(1869);
            } else {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  this.field_i = param2.e(1869);
                } else {
                  if (var4_int == 4) {
                    this.field_j = param2.e(1869);
                  }
                }
              } else {
                this.field_l = param2.e((byte) -117);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("sva.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (param0 >= -35) {
          sva.e((byte) -123);
        }
        taa.e((byte) -120);
    }

    final static boolean e(byte param0) {
        if (param0 != -34) {
          sva.e((byte) 68);
        }
        return !wba.field_p.a(4) ? true : false;
    }

    static {
        field_m = 20;
    }
}
