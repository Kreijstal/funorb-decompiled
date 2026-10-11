/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md extends ji {
    private int field_B;
    private int field_E;
    static String[] field_C;
    private int field_A;
    private int field_z;
    private int field_F;
    static int field_D;
    static String field_y;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            md.g(10);
          }
          var4_int = param1;
          if (var4_int == 0) {
            this.field_E = param2.h(-11);
          } else {
            if (1 == var4_int) {
              this.field_F = param2.a((byte) -11);
            } else {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  this.field_A = param2.a((byte) -11);
                } else {
                  if (var4_int == 4) {
                    this.field_z = param2.a((byte) -11);
                  }
                }
              } else {
                this.field_B = param2.h(-11);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("md.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 >= -98) {
          int[] var3 = (int[]) null;
          md.a(-83, -41, (int[]) null, 88, -98);
        }
        uk.d((byte) 71);
    }

    final static boolean a(int param0, tp param1, tp param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_int = param2.field_Pb - param1.field_Pb;
          if (dg.field_d == param2.field_Lb) {
            var3_int -= 200;
          } else {
            if (null == param2.field_Lb) {
              var3_int += 200;
            }
          }
          if (param1.field_Lb != dg.field_d) {
            if (null == param1.field_Lb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          if (param0 != 1308) {
            field_y = (String) null;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("md.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Vertigo2.field_L ? 1 : 0;
        try {
          while (true) {
            param3--;
            if (0 > param3) {
              break;
            }
            var9 = param2;
            int[] var5 = var9;
            var6 = param1;
            var7 = param4;
            var9[var6] = (b.a(16711422, var9[var6]) >> 1) + var7;
            param1++;
          }
          int var5_int = 4 / ((param0 + 39) / 53);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "md.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public md() {
        super(0, true);
        this.field_B = 16;
        this.field_E = 0;
        this.field_A = 0;
        this.field_F = 2000;
        this.field_z = 4096;
    }

    public static void g(int param0) {
        field_C = null;
        int var1 = -119 / ((param0 - 50) / 32);
        field_y = null;
    }

    final int[] c(int param0, int param1) {
        int var7 = 0;
        int var23 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
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
        tp var28;
        int[][] var32;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        var27 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 91) {
          var28 = (tp) null;
          md.a(55, (tp) null, (tp) null);
        }
        var3 = this.field_x.a(param0, (byte) 110);
        if (this.field_x.field_i) {
          var4 = this.field_z >> 1;
          var32 = this.field_x.a(100);
          var6 = new Random((long)this.field_E);
          for (var7 = 0; var7 < this.field_F; var7++) {
            if (this.field_z <= 0) {
              stackIn_8_0 = this.field_A;
            } else {
              stackIn_8_0 = this.field_A + (mj.a(-110, var6, this.field_z) - var4);
            }
            var8 = stackIn_8_0;
            var8 = var8 >> 4 & 255;
            var9 = mj.a(-106, var6, we.field_M);
            var10 = mj.a(-128, var6, aa.field_Vb);
            var11 = (qb.field_b[var8] * this.field_B >> 12) + var9;
            var12 = var10 + (this.field_B * eh.field_b[var8] >> 12);
            var13 = -var10 + var12;
            var14 = var11 - var9;
            if (var14 != 0 ||
              0 != var13) {
              if (0 > var14) {
                var14 = -var14;
              }
              if (var13 < 0) {
                var13 = -var13;
              }
              stackIn_19_0 = (var13 <= var14) ? 0 : 1;
              var15 = stackIn_19_0;
              if (var15 != 0) {
                var16 = var9;
                var17 = var11;
                var9 = var10;
                var10 = var16;
                var11 = var12;
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
              var18 = var12 - var10;
              var19 = -var17Lifetime2 / 2;
              var20 = 2048 / var17Lifetime2;
              var21 = -(mj.a(-107, var6, 4096) >> 2) + 1024;
              stackIn_28_0 = (var10 >= var12) ? -1 : 1;
              var22 = stackIn_28_0;
              if (var18 < 0) {
                var18 = -var18;
              }
              for (var23 = var9; var23 < var11; var23++) {
                var24 = var20 * (-var9 + var23) + (1024 + var21);
                var25 = var23 & rm.field_z;
                var26 = fk.field_x & var16Lifetime2;
                if (var15 != 0) {
                  var32[var26][var25] = var24;
                } else {
                  var32[var25][var26] = var24;
                }
                var19 = var19 + var18;
                if (var19 > 0) {
                  var19 = var19 - var17Lifetime2;
                  var16Lifetime2 = var16Lifetime2 + var22;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        field_y = "Press any key to continue";
    }
}
