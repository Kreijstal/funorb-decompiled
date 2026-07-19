/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static int[] field_c;
    static int field_b;
    static String field_d;
    static String field_a;

    final static void a(db[] param0, int param1, byte param2, int param3) {
        ki.field_a = new wh(param0);
        wh.field_f = param3;
        if (param2 != -105) {
            return;
        }
        try {
            id.field_v = param1;
            ge.f(72);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 < -91) {
            break L0;
          } else {
            field_c = (int[]) null;
            break L0;
          }
        }
        if (null != ol.field_l) {
          var1 = ol.field_l;
          synchronized (var1) {
            L1: {
              ol.field_l = null;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 0) {
            rg.b(8);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pk var4_ref_pk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        pk var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var19 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            ae.field_M = new int[]{param0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ae.field_J.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var1_int <= var3) {
                  var3 = ae.field_M[9] >> -89894072;
                  break L2;
                } else {
                  var4_ref_pk = ae.field_J[var3];
                  var17 = var4_ref_pk;
                  var17 = var4_ref_pk;
                  var4_ref_pk.a((byte) -50);
                  u.b(var3, -119);
                  var5 = var4_ref_pk.field_v + var4_ref_pk.field_m >> -351007007;
                  var6 = var4_ref_pk.field_G + var4_ref_pk.field_M >> -1727207135;
                  var7 = var4_ref_pk.field_O - -var4_ref_pk.field_F >> 232142913;
                  var8 = ae.field_M[9] >> -1467711358;
                  var9 = ae.field_M[10] >> -1040104862;
                  var10_int = ae.field_M[11] >> -1922749086;
                  var11 = var10_int * oj.field_l[5] + var8 * oj.field_l[3] - -(var9 * oj.field_l[4]) >> -1888821970;
                  var12 = var8 * oj.field_l[6] - -(oj.field_l[7] * var9) + oj.field_l[8] * var10_int >> 1625374030;
                  var13 = var8 * oj.field_l[9] + (oj.field_l[10] * var9 - -(var10_int * oj.field_l[11])) >> -476690770;
                  var2[var3] = var7 * var13 + var12 * var6 + var5 * var11 >> 1508913360;
                  var3++;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = ae.field_M[10] >> 1113561416;
                var5 = ae.field_M[11] >> -1990331032;
                var6 = mc.field_k << -370566780;
                var7 = 0;
                var8 = m.a(var6, (byte) 30) >> -2144669688;
                var9 = nb.a(-95, var6) >> -2072174136;
                if (-1 == bk.field_b) {
                  break L3;
                } else {
                  if (sh.field_e != -1) {
                    var8 = -sh.field_e + 240;
                    var7 = bk.field_b + -320;
                    var9 = -128;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
              var7 = (int)((double)var7 * var10);
              var9 = (int)((double)var9 * var10);
              var8 = (int)((double)var8 * var10);
              var12 = var7 - var3;
              var13 = var8 + -var4;
              var14 = var9 + -var5;
              var10 = 256.0 / Math.sqrt((double)(var12 * var12 - (-(var13 * var13) - var14 * var14)));
              var12 = (int)((double)var12 * var10);
              var14 = (int)((double)var14 * var10);
              var13 = (int)((double)var13 * var10);
              var15 = 0;
              L4: while (true) {
                stackOut_12_0 = ae.field_J.length;
                stackOut_12_1 = var15;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                L5: while (true) {
                  if (stackIn_13_0 <= stackIn_13_1) {
                    break L0;
                  } else {
                    var16 = 0;
                    if (var19 == 0) {
                      var17_int = 1;
                      L6: while (true) {
                        if (var17_int >= ae.field_J.length) {
                          var21[var16] = -2147483648;
                          var17 = ae.field_J[var16];
                          u.b(var16, -114);
                          var18 = 0;
                          L7: while (true) {
                            L8: {
                              if (var18 >= 3) {
                                da.a(oj.field_l, true, ae.field_M, false, false, var17, (byte) -58);
                                ff.a(var13, var7, var8, var12, var14, var9, (byte) -116, var17);
                                var15++;
                                break L8;
                              } else {
                                oj.field_l[var18] = oj.field_l[var18] + uj.field_f[var15][var18];
                                var18++;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  continue L7;
                                }
                              }
                            }
                            continue L4;
                          }
                        } else {
                          stackOut_18_0 = var21[var16] ^ -1;
                          stackOut_18_1 = var21[var17_int] ^ -1;
                          stackIn_13_0 = stackOut_18_0;
                          stackIn_13_1 = stackOut_18_1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          if (var19 != 0) {
                            continue L5;
                          } else {
                            L9: {
                              if (stackIn_19_0 <= stackIn_19_1) {
                                break L9;
                              } else {
                                var16 = var17_int;
                                break L9;
                              }
                            }
                            var17_int++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "rg.A(" + param0 + ')');
        }
    }

    static {
        field_d = "Passwords can only contain letters and numbers";
        field_a = "Names cannot contain consecutive spaces";
    }
}
