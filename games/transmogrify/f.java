/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int field_a;
    static fe field_b;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        e var4_ref_e = null;
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
        e var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            rk.field_n = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = rf.field_eb.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var1_int <= var3) {
                  var3 = rk.field_n[9] >> -754950712;
                  break L2;
                } else {
                  var4_ref_e = rf.field_eb[var3];
                  var17 = var4_ref_e;
                  var17 = var4_ref_e;
                  var4_ref_e.a(22856);
                  l.a(var3, -87);
                  var5 = var4_ref_e.field_t + var4_ref_e.field_P >> -1731126143;
                  var6 = var4_ref_e.field_O + var4_ref_e.field_u >> 1412566657;
                  var7 = var4_ref_e.field_i + var4_ref_e.field_k >> -1596816735;
                  var8 = rk.field_n[9] >> -390669566;
                  var9 = rk.field_n[10] >> 1258268034;
                  var10_int = rk.field_n[11] >> -1071120062;
                  var11 = var10_int * qd.field_a[5] + var9 * qd.field_a[4] + var8 * qd.field_a[3] >> 279874894;
                  var12 = var9 * qd.field_a[7] + qd.field_a[6] * var8 + qd.field_a[8] * var10_int >> -1906025650;
                  var13 = qd.field_a[9] * var8 - (-(var9 * qd.field_a[10]) + -(qd.field_a[11] * var10_int)) >> -537249234;
                  var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> -1363314128;
                  var3++;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = rk.field_n[10] >> -738775320;
                var5 = rk.field_n[11] >> -1235034008;
                var6 = si.field_l << -957934428;
                if (param0 == 16) {
                  break L3;
                } else {
                  f.a(true);
                  break L3;
                }
              }
              L4: {
                var7 = 0;
                var8 = pe.a(4096, var6) >> 117989000;
                var9 = ri.a(-124, var6) >> 1189305032;
                if (oa.field_j == -1) {
                  break L4;
                } else {
                  if (-1 == bk.field_a) {
                    break L4;
                  } else {
                    var7 = -320 + oa.field_j;
                    var9 = -128;
                    var8 = 240 - bk.field_a;
                    break L4;
                  }
                }
              }
              var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
              var7 = (int)((double)var7 * var10);
              var8 = (int)((double)var8 * var10);
              var9 = (int)((double)var9 * var10);
              var12 = -var3 + var7;
              var13 = -var4 + var8;
              var14 = var9 - var5;
              var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
              var14 = (int)((double)var14 * var10);
              var13 = (int)((double)var13 * var10);
              var12 = (int)((double)var12 * var10);
              var15 = 0;
              L5: while (true) {
                stackOut_13_0 = rf.field_eb.length;
                stackOut_13_1 = var15;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                L6: while (true) {
                  if (stackIn_14_0 <= stackIn_14_1) {
                    break L0;
                  } else {
                    var16 = 0;
                    if (var19 == 0) {
                      var17_int = 1;
                      L7: while (true) {
                        if (var17_int >= rf.field_eb.length) {
                          var21[var16] = -2147483648;
                          var17 = rf.field_eb[var16];
                          l.a(var16, -95);
                          var18 = 0;
                          L8: while (true) {
                            L9: {
                              if (3 <= var18) {
                                gg.a((byte) 119, rk.field_n, true, false, var17, false, qd.field_a);
                                vd.a(var12, var14, var7, var8, -110, var13, var17, var9);
                                var15++;
                                break L9;
                              } else {
                                qd.field_a[var18] = qd.field_a[var18] + ae.field_a[var15][var18];
                                var18++;
                                if (var19 != 0) {
                                  break L9;
                                } else {
                                  continue L8;
                                }
                              }
                            }
                            continue L5;
                          }
                        } else {
                          stackOut_19_0 = var21[var17_int] ^ -1;
                          stackOut_19_1 = var21[var16] ^ -1;
                          stackIn_14_0 = stackOut_19_0;
                          stackIn_14_1 = stackOut_19_1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          if (var19 != 0) {
                            continue L6;
                          } else {
                            L10: {
                              if (stackIn_20_0 >= stackIn_20_1) {
                                break L10;
                              } else {
                                var16 = var17_int;
                                break L10;
                              }
                            }
                            var17_int++;
                            continue L7;
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
          throw ch.a((Throwable) ((Object) var1), "f.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = (fe) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static ii a(int param0) {
        ii var1 = new ii(pj.field_y, ll.field_U, gj.field_j[0], re.field_a[0], ql.field_b[0], wk.field_b[param0], re.field_K[0], rg.field_D);
        wd.d(param0 ^ 9);
        return var1;
    }

    static {
    }
}
