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

    final static void a(int param0, dd param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        pq.field_m = param4;
        jc.field_h = param3;
        ad.field_r = param6;
        ej.field_g = param5;
        se.field_h = param0;
        rf.field_c = param8;
        li.field_e = param2;
        vn.field_j = param1;
        if (param7 != -1) {
            field_n = null;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
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
        L0: {
          if (param0 < -116) {
            break L0;
          } else {
            field_p = -107;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) == -1) {
              break L2;
            } else {
              L3: {
                if (-1 <= (param1 ^ -1)) {
                  break L3;
                } else {
                  if ((kj.field_g[0].field_u ^ -1) < (param6 ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (kj.field_g[-1 + param1].field_u != param6) {
                break L1;
              } else {
                var7 = 0;
                L4: while (true) {
                  if ((var7 ^ -1) <= (param1 ^ -1)) {
                    var7 = param1;
                    var8 = param6;
                    var9 = param5;
                    var10 = param3;
                    var11 = param4;
                    var12_int = param2;
                    var13 = kj.field_g[var7];
                    var13.field_n = (byte)var9;
                    var13.field_u = var8;
                    var13.field_i = (byte)var10;
                    var13.field_a = (byte)var12_int;
                    var13.field_x = (byte)var11;
                    param1++;
                    break L1;
                  } else {
                    L5: {
                      var8_ref_sa = kj.field_g[var7];
                      if ((var8_ref_sa.field_n ^ -1) == (param5 ^ -1)) {
                        break L5;
                      } else {
                        if ((var8_ref_sa.field_i ^ -1) == (param5 ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            if (-1 == param3) {
                              break L6;
                            } else {
                              if (param3 == var8_ref_sa.field_n) {
                                break L5;
                              } else {
                                if ((param3 ^ -1) == (var8_ref_sa.field_i ^ -1)) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var7++;
                          continue L4;
                        }
                      }
                    }
                    L7: {
                      if ((param3 ^ -1) == 0) {
                        break L7;
                      } else {
                        L8: {
                          if ((var8_ref_sa.field_a ^ -1) != 0) {
                            break L8;
                          } else {
                            if ((var8_ref_sa.field_x ^ -1) == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var9 = var7;
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
                        break L7;
                      }
                    }
                    L9: {
                      if (-1 == param2) {
                        break L9;
                      } else {
                        if ((var8_ref_sa.field_x ^ -1) != 0) {
                          var9 = var7;
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
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    return param1;
                  }
                }
              }
            }
          }
          param1 = 1;
          var7 = param6;
          var8 = param5;
          var9 = param3;
          var10 = param4;
          var11 = param2;
          var12 = kj.field_g[0];
          var12.field_a = (byte)var11;
          var12.field_n = (byte)var8;
          var12.field_i = (byte)var9;
          var12.field_x = (byte)var10;
          var12.field_u = var7;
          break L1;
        }
        return param1;
    }

    bq(int param0) {
        ((bq) this).field_l = param0;
    }

    public static void c(byte param0) {
        field_n = null;
        field_s = null;
        field_q = null;
        field_r = null;
        if (param0 > -16) {
            int discarded$0 = bq.a((byte) -80, 69, -63, -22, -2, -27, -72);
        }
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
