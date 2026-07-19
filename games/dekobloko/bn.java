/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_a;
    static boolean[] field_f;
    static mm field_g;
    static String field_c;
    static String field_b;
    static String field_d;
    static ck field_e;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, ck param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var17 = 0;
        int var20 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var20 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param1 + -param2 << 8) / param4.field_K;
              param5 = param5 + param4.field_F;
              var7 = (param2 << 8) - -(var6_int * param4.field_F);
              if (param0 <= -96) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              param3 = param3 + param4.field_z;
              var8 = hk.field_j * param3 + param5;
              var9 = 0;
              var10 = param4.field_H;
              var11 = param4.field_I;
              var12 = hk.field_j + -var11;
              var13 = 0;
              if (param3 < hk.field_h) {
                var14 = hk.field_h + -param3;
                var8 = var8 + var14 * hk.field_j;
                var9 = var9 + var11 * var14;
                var10 = var10 - var14;
                param3 = hk.field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hk.field_b < var10 + param3) {
                var10 = var10 - (-hk.field_b + param3 + var10);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (hk.field_c <= param5) {
                break L4;
              } else {
                var14 = hk.field_c + -param5;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var9 = var9 + var14;
                var13 = var13 + var14;
                var7 = var7 + var14 * var6_int;
                param5 = hk.field_c;
                var8 = var8 + var14;
                break L4;
              }
            }
            L5: {
              if (var11 + param5 > hk.field_g) {
                var14 = var11 + (param5 - hk.field_g);
                var13 = var13 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (0 < var10) {
                  param3 = -var10;
                  L7: while (true) {
                    if (0 <= param3) {
                      break L0;
                    } else {
                      var14 = var7;
                      param5 = -var11;
                      L8: while (true) {
                        if (0 <= param5) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param3++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = -var15 + 256;
                            if (var15 < 0) {
                              var9++;
                              var8++;
                              break L9;
                            } else {
                              L10: {
                                incrementValue$1 = var9;
                                var9++;
                                var17 = param4.field_D[incrementValue$1];
                                if (var17 == 0) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            }
                          }
                          param5++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("bn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param5 + ')');
        }
    }

    final static cd a(boolean param0, boolean param1) {
        cd var2 = new cd(true);
        var2.field_e = param1 ? true : false;
        return var2;
    }

    final static void a(long param0, int param1, byte param2) {
        uf var4 = we.field_b;
        var4.f(param1, -4);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(true, 6);
        var4.a(param0, (byte) 0);
        var4.b(var4.field_n + -var5, true);
    }

    static {
        field_c = "PANIC!";
        field_a = "Kick";
        field_d = "Loading graphics";
        field_b = "Enter name of player to delete from list";
    }
}
