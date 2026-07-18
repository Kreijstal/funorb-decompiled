/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends ma {
    int field_l;
    static int field_p;
    static hj field_r;
    static Boolean field_q;
    static dd field_n;
    static int field_m;
    static String field_s;
    static boolean field_o;

    final static void a(int param0, dd param1) {
        RuntimeException var9 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            pq.field_m = 15;
            jc.field_h = 80;
            ad.field_r = 2;
            ej.field_g = -2400;
            se.field_h = 40;
            rf.field_c = 40;
            li.field_e = 80;
            vn.field_j = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("bq.A(").append(40).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 80 + ',' + 80 + ',' + 15 + ',' + -2400 + ',' + 2 + ',' + -1 + ',' + 40 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        sa var8_ref_sa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sa var12 = null;
        int var12_int = 0;
        sa var13 = null;
        int var13_int = 0;
        int var14 = 0;
        sa var15 = null;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -116) {
                break L1;
              } else {
                field_p = -107;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param1 <= 0) {
                      break L4;
                    } else {
                      if (~kj.field_g[0].field_u < ~param6) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (kj.field_g[-1 + param1].field_u != param6) {
                    break L2;
                  } else {
                    var7_int = 0;
                    L5: while (true) {
                      if (~var7_int <= ~param1) {
                        var7_int = param1;
                        var8 = param6;
                        var9 = param5;
                        var10 = param3;
                        var11 = param4;
                        var12_int = param2;
                        var13 = kj.field_g[var7_int];
                        var13.field_n = (byte)var9;
                        var13.field_u = var8;
                        var13.field_i = (byte)var10;
                        var13.field_a = (byte)var12_int;
                        var13.field_x = (byte)var11;
                        param1++;
                        break L2;
                      } else {
                        L6: {
                          var8_ref_sa = kj.field_g[var7_int];
                          if (~var8_ref_sa.field_n == ~param5) {
                            break L6;
                          } else {
                            if (~var8_ref_sa.field_i == ~param5) {
                              break L6;
                            } else {
                              L7: {
                                if (-1 == param3) {
                                  break L7;
                                } else {
                                  if (param3 == var8_ref_sa.field_n) {
                                    break L6;
                                  } else {
                                    if (~param3 == ~var8_ref_sa.field_i) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var7_int++;
                              continue L5;
                            }
                          }
                        }
                        L8: {
                          if (param3 == -1) {
                            break L8;
                          } else {
                            L9: {
                              if (var8_ref_sa.field_a != -1) {
                                break L9;
                              } else {
                                if (var8_ref_sa.field_x == -1) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var9 = var7_int;
                            var10 = param6;
                            var11 = param5;
                            var12_int = param3;
                            var13_int = param4;
                            var14 = param2;
                            var15 = kj.field_g[var9];
                            var15.field_n = (byte)var11;
                            var15.field_i = (byte)var12_int;
                            var15.field_x = (byte)var13_int;
                            var15.field_a = (byte)var14;
                            var15.field_u = var10;
                            break L8;
                          }
                        }
                        L10: {
                          if (-1 == param2) {
                            break L10;
                          } else {
                            if (var8_ref_sa.field_x != -1) {
                              var9 = var7_int;
                              var10 = param6;
                              var11 = param5;
                              var12_int = param3;
                              var13_int = param4;
                              var14 = param2;
                              var15 = kj.field_g[var9];
                              var15.field_x = (byte)var13_int;
                              var15.field_u = var10;
                              var15.field_n = (byte)var11;
                              var15.field_a = (byte)var14;
                              var15.field_i = (byte)var12_int;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        stackOut_24_0 = param1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                    }
                  }
                }
              }
              param1 = 1;
              var7_int = param6;
              var8 = param5;
              var9 = param3;
              var10 = param4;
              var11 = param2;
              var12 = kj.field_g[0];
              var12.field_a = (byte)var11;
              var12.field_n = (byte)var8;
              var12.field_i = (byte)var9;
              var12.field_x = (byte)var10;
              var12.field_u = var7_int;
              break L2;
            }
            stackOut_29_0 = param1;
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var7, "bq.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_30_0;
    }

    bq(int param0) {
        ((bq) this).field_l = param0;
    }

    public static void c() {
        field_n = null;
        field_s = null;
        field_q = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = -1;
        field_r = new hj(14, 0, 4, 1);
        field_s = "Foul!";
        field_o = false;
    }
}
