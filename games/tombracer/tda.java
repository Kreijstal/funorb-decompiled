/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tda extends jg {
    private int[] field_c;
    static String field_b;

    final static int a(int param0, int param1) {
        param1 = (param1 & 1431655765) + ((-1431655765 & param1) >>> -1379903071);
        param1 = (param1 & 858993459) + (param1 >>> 2138921218 & -1288490189);
        param1 = param1 - -(param1 >>> 1123451428) & 252645135;
        param1 = param1 + (param1 >>> 307713224);
        param1 = param1 + (param1 >>> 885989872);
        int var2 = 1 % ((-12 - param0) / 44);
        return param1 & 255;
    }

    public static void c(byte param0) {
        int var1 = -17 % ((param0 - 57) / 36);
        field_b = null;
    }

    tda(int param0) {
        Random var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Random var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_c = new int[512];
        var7 = new Random((long)param0);
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var3 >= 256) {
              var3 = 0;
              break L1;
            } else {
              this.field_c[var3 + 256] = var3;
              this.field_c[var3] = var3;
              var3++;
              if (var6 != 0) {
                break L1;
              } else {
                continue L0;
              }
            }
          }
          L2: while (true) {
            if (256 > var3) {
              var4 = 255 & var7.nextInt();
              var5 = this.field_c[var4];
              this.field_c[var4 - -256] = this.field_c[var3];
              this.field_c[var4] = this.field_c[var3];
              this.field_c[256 + var3] = var5;
              this.field_c[var3] = var5;
              var3++;
              if (var6 == 0) {
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(float param0, float param1, float param2, int param3, float[] param4, float param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$1 = 0;
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var41 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var12_int = (int)((float)param10 * param2 - 1.0f);
            var12_int = var12_int & 255;
            var13 = (int)(-1.0f + (float)param8 * param5);
            var13 = var13 & 255;
            var14 = (int)(-1.0f + param1 * (float)param3);
            var14 = var14 & 255;
            var15 = param1 * (float)param9;
            var16 = (int)var15;
            var17 = var16 + 1;
            var18 = var15 - (float)var16;
            var19 = -var18 + (float)param6;
            var17 = var17 & var14;
            var20 = nk.a((byte) 14, var18);
            var16 = var16 & var14;
            var21 = this.field_c[var16];
            var22 = this.field_c[var17];
            var23 = 0;
            L1: while (true) {
              L2: {
                if (param8 <= var23) {
                  break L2;
                } else {
                  var24 = param5 * (float)var23;
                  var25 = (int)var24;
                  var26 = 1 + var25;
                  var27 = var24 - (float)var25;
                  var28 = -var27 + 1.0f;
                  var29 = nk.a((byte) 14, var27);
                  var26 = var26 & var13;
                  var25 = var25 & var13;
                  var30 = this.field_c[var21 + var25];
                  var31 = this.field_c[var21 + var26];
                  var32 = this.field_c[var25 + var22];
                  var33 = this.field_c[var22 + var26];
                  if (var41 == 0) {
                    var34 = 0;
                    L3: while (true) {
                      L4: {
                        if (param10 <= var34) {
                          var23++;
                          break L4;
                        } else {
                          var35 = (float)var34 * param2;
                          var36 = (int)var35;
                          var37 = 1 + var36;
                          var38 = var35 - (float)var36;
                          var39 = -var38 + 1.0f;
                          var37 = var37 & var12_int;
                          var40 = nk.a((byte) 14, var38);
                          var36 = var36 & var12_int;
                          incrementValue$1 = param7;
                          param7++;
                          param4[incrementValue$1] = lr.a(var20, 5122, lr.a(var29, 5122, lr.a(var40, 5122, hp.a(var18, var27, (byte) 26, var38, sea.c(this.field_c[var33 + var37], 7)), hp.a(var18, var27, (byte) 26, var39, sea.c(this.field_c[var33 + var36], 7))), lr.a(var40, kha.b(param6, 5123), hp.a(var18, var28, (byte) 26, var38, sea.c(this.field_c[var37 - -var32], 7)), hp.a(var18, var28, (byte) 26, var39, sea.c(7, this.field_c[var32 + var36])))), lr.a(var29, 5122, lr.a(var40, 5122, hp.a(var19, var27, (byte) 26, var38, sea.c(this.field_c[var31 + var37], 7)), hp.a(var19, var27, (byte) 26, var39, sea.c(7, this.field_c[var31 + var36]))), lr.a(var40, 5122, hp.a(var19, var28, (byte) 26, var38, sea.c(this.field_c[var37 - -var30], 7)), hp.a(var19, var28, (byte) 26, var39, sea.c(this.field_c[var30 + var36], 7))))) * param0;
                          var34++;
                          if (var41 != 0) {
                            break L4;
                          } else {
                            continue L3;
                          }
                        }
                      }
                      if (var41 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var12);
            stackOut_13_1 = new StringBuilder().append("tda.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        ara.field_xb = 0;
        if (param1 != -71) {
            return;
        }
        sd.field_K = param0;
        wea.field_d = new gqa[param0 * 15];
        baa.field_b = new int[3];
    }

    static {
        field_b = "4th";
    }
}
