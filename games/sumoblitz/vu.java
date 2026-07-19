/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vu extends ab {
    private int[] field_f;
    static jn field_g;
    static hv field_h;
    static String[] field_i;

    vu(int param0) {
        Random var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Random var7 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        this.field_f = new int[512];
        var7 = new Random((long)param0);
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var3 >= 256) {
              var3 = 0;
              break L1;
            } else {
              this.field_f[var3 - -256] = var3;
              this.field_f[var3] = var3;
              var3++;
              if (var6 != 0) {
                break L1;
              } else {
                continue L0;
              }
            }
          }
          L2: while (true) {
            if (var3 < 256) {
              var4 = 255 & var7.nextInt();
              var5 = this.field_f[var4];
              this.field_f[256 + var4] = this.field_f[var3];
              this.field_f[var4] = this.field_f[var3];
              this.field_f[var3 + 256] = var5;
              this.field_f[var3] = var5;
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

    final void a(float param0, int param1, float param2, float param3, int param4, int param5, int param6, float[] param7, int param8, float param9, int param10) {
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
        var41 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var12_int = (int)(-1.0f + param0 * (float)param8);
            var12_int = var12_int & 255;
            var13 = (int)(param2 * (float)param10 - 1.0f);
            var13 = var13 & 255;
            var14 = (int)(-1.0f + param3 * (float)param5);
            var14 = var14 & 255;
            var15 = (float)param4 * param3;
            var16 = (int)var15;
            var17 = param6 + var16;
            var18 = (float)(-var16) + var15;
            var19 = 1.0f - var18;
            var17 = var17 & var14;
            var20 = fs.a((byte) 124, var18);
            var16 = var16 & var14;
            var21 = this.field_f[var16];
            var22 = this.field_f[var17];
            var23 = 0;
            L1: while (true) {
              L2: {
                if (var23 >= param10) {
                  break L2;
                } else {
                  var24 = param2 * (float)var23;
                  var25 = (int)var24;
                  var26 = var25 + 1;
                  var27 = var24 - (float)var25;
                  var28 = 1.0f - var27;
                  var26 = var26 & var13;
                  var29 = fs.a((byte) 124, var27);
                  var25 = var25 & var13;
                  var30 = this.field_f[var21 + var25];
                  var31 = this.field_f[var21 + var26];
                  var32 = this.field_f[var22 + var25];
                  var33 = this.field_f[var26 - -var22];
                  if (var41 == 0) {
                    var34 = 0;
                    L3: while (true) {
                      L4: {
                        if (var34 >= param8) {
                          var23++;
                          break L4;
                        } else {
                          var35 = (float)var34 * param0;
                          var36 = (int)var35;
                          var37 = var36 - -1;
                          var38 = (float)(-var36) + var35;
                          var39 = -var38 + 1.0f;
                          var40 = fs.a((byte) 124, var38);
                          var37 = var37 & var12_int;
                          var36 = var36 & var12_int;
                          incrementValue$1 = param1;
                          param1++;
                          param7[incrementValue$1] = param9 * nw.a(1050, nw.a(1050, nw.a(jg.a(param6, 1051), an.a(var28, var19, eb.a(7, this.field_f[var30 + var36]), var39, 2), an.a(var28, var19, eb.a(7, this.field_f[var37 - -var30]), var38, jg.a(param6, 3)), var40), nw.a(1050, an.a(var27, var19, eb.a(7, this.field_f[var31 + var36]), var39, param6 + 1), an.a(var27, var19, eb.a(7, this.field_f[var37 - -var31]), var38, 2), var40), var29), nw.a(1050, nw.a(1050, an.a(var28, var18, eb.a(7, this.field_f[var32 + var36]), var39, 2), an.a(var28, var18, eb.a(this.field_f[var32 + var37], 7), var38, param6 + 1), var40), nw.a(1050, an.a(var27, var18, eb.a(this.field_f[var36 + var33], 7), var39, 2), an.a(var27, var18, eb.a(7, this.field_f[var33 + var37]), var38, 2), var40), var29), var20);
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
            stackOut_13_1 = new StringBuilder().append("vu.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param7 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -69) {
            vu.a((byte) 1);
            field_h = null;
            field_i = null;
            return;
        }
        field_h = null;
        field_i = null;
    }

    static {
        field_g = new jn();
        field_h = new hv();
        field_i = new String[]{"None", "Permanent speed up", "Permanent bounce up", "Permanent traction up", "Temporary speed up", "Temporary bounce up", "Temporary traction up"};
    }
}
