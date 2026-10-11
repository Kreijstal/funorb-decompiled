/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bk extends ci {
    private int field_q;
    static String[] field_m;
    private int field_p;
    private int field_o;
    private int field_r;
    private int field_n;

    public static void d(byte param0) {
        if (param0 != 101) {
          field_m = (String[]) null;
        }
        field_m = null;
    }

    final void b(byte param0) {
        if (param0 != 116) {
          uia var3 = (uia) null;
          this.a((byte) 61, (uia) null, -62);
        }
        tka.b((byte) 115);
    }

    public bk() {
        super(0, true);
        this.field_q = 4096;
        this.field_o = 16;
        this.field_p = 2000;
        this.field_r = 0;
        this.field_n = 0;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (2 == var4_int) {
                this.field_o = param1.h(255);
              } else {
                if (3 == var4_int) {
                  this.field_r = param1.d(param0 + 17);
                } else {
                  if (4 == var4_int) {
                    this.field_q = param1.d(121);
                  }
                }
              }
            } else {
              this.field_p = param1.d(param0 ^ 21);
            }
          } else {
            this.field_n = param1.h(param0 ^ 148);
          }
          if (param0 != 107) {
            this.field_o = -113;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("bk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != 9033) {
          field_m = (String[]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int var7 = 0;
        int var23 = 0;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
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
        var27 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_i.a((byte) -104, param1);
        if (this.field_i.field_d) {
          var4 = this.field_q >> 1;
          var31 = this.field_i.a(0);
          var6 = new Random((long)this.field_n);
          for (var7 = 0; this.field_p > var7; var7++) {
            if (this.field_q <= 0) {
              stackIn_8_0 = this.field_r;
            } else {
              stackIn_8_0 = this.field_r + jqa.a(this.field_q, var6, -102) - var4;
            }
            var8 = stackIn_8_0;
            var8 = var8 >> 4 & 255;
            var9 = jqa.a(ns.field_g, var6, 44);
            var10 = jqa.a(qda.field_i, var6, -127);
            var11 = (this.field_o * lm.field_r[var8] >> 12) + var9;
            var12 = var10 + (ou.field_e[var8] * this.field_o >> 12);
            var13 = var12 - var10;
            var14 = -var9 + var11;
            if (var14 != 0 ||
              var13 != 0) {
              if (0 > var14) {
                var14 = -var14;
              }
              if (var13 < 0) {
                var13 = -var13;
              }
              stackIn_21_0 = (var13 <= var14) ? 0 : 1;
              var15 = stackIn_21_0;
              if (var15 != 0) {
                var16 = var9;
                var9 = var10;
                var17 = var11;
                var11 = var12;
                var10 = var16;
                var12 = var17;
              }
              if (var11 < var9) {
                var16Lifetime1 = var9;
                var9 = var11;
                var17Lifetime1 = var10;
                var11 = var16Lifetime1;
                var10 = var12;
                var12 = var17Lifetime1;
              }
              var16Lifetime2 = var10;
              var17Lifetime2 = var11 - var9;
              var18 = -var10 + var12;
              var19 = -var17Lifetime2 / 2;
              var20 = 2048 / var17Lifetime2;
              var21 = -(jqa.a(4096, var6, -85) >> 2) + 1024;
              stackIn_29_0 = (var12 > var10) ? 1 : -1;
              var22 = stackIn_29_0;
              if (var18 < 0) {
                var18 = -var18;
              }
              for (var23 = var9; var23 < var11; var23++) {
                var24 = var21 + 1024 + (var23 - var9) * var20;
                var25 = var23 & una.field_b;
                var26 = var16Lifetime2 & hba.field_b;
                if (var15 != 0) {
                  var31[var26][var25] = var24;
                } else {
                  var31[var25][var26] = var24;
                }
                var19 = var19 + var18;
                if (var19 > 0) {
                  var16Lifetime2 = var16Lifetime2 + var22;
                  var19 = var19 - var17Lifetime2;
                }
              }
            }
          }
        }
        if (param0 == 1) {
          return var3;
        }
        return (int[]) null;
    }

    static {
        field_m = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
