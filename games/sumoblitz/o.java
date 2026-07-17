/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static hr[] field_b;
    static String field_a;

    final static void a(int param0) {
        wm.field_f[oh.field_e] = true;
        jk.field_a = iw.field_b;
        if (!(!rf.a(false))) {
            qn.field_d[oh.field_e] = true;
        }
        if (!(nd.field_F != 3)) {
            up.field_g[oh.field_e] = true;
        }
        int discarded$4 = -104;
        of.a();
        int discarded$8 = 123;
        ju.g();
        if (!og.a(-77)) {
            av.a(-7753, true, 10);
        }
        if (!(oh.field_e <= bl.field_e)) {
            bl.field_e = oh.field_e;
        }
        int var1 = iw.field_b;
        if (!(var1 >= ql.field_z[oh.field_e])) {
            ql.field_z[oh.field_e] = var1;
        }
        if (go.field_j[oh.field_e] < in.field_z) {
            go.field_j[oh.field_e] = in.field_z;
        }
        field_a = null;
        if (oh.field_e == 12) {
            if (!(bn.field_P)) {
                th.b(24753, 245, 10);
            }
        }
        nq.field_i = nq.field_i + 1;
        il.field_a = in.field_z;
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    final static void a() {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null != bb.field_i) {
              return;
            } else {
              bb.field_i = new int[65536];
              var1_double = Math.random() * 0.03 - 0.015 + 0.7;
              var3 = 0;
              L1: while (true) {
                if (var3 >= 65536) {
                  break L0;
                } else {
                  L2: {
                    var4 = (double)(var3 >> 10 & 63) / 64.0 + 0.0078125;
                    var6 = (double)(7 & var3 >> 7) / 8.0 + 0.0625;
                    var8 = (double)(127 & var3) / 128.0;
                    var10 = var8;
                    var12 = var8;
                    var14 = var8;
                    if (0.0 == var6) {
                      break L2;
                    } else {
                      L3: {
                        if (var8 >= 0.5) {
                          var16_double = -(var6 * var8) + (var8 + var6);
                          break L3;
                        } else {
                          var16_double = (1.0 + var6) * var8;
                          break L3;
                        }
                      }
                      L4: {
                        var18_double = var8 * 2.0 - var16_double;
                        var20 = 0.3333333333333333 + var4;
                        if (1.0 >= var20) {
                          break L4;
                        } else {
                          var20 = var20 - 1.0;
                          break L4;
                        }
                      }
                      L5: {
                        var22 = var4;
                        var24 = -0.3333333333333333 + var4;
                        if (var22 * 6.0 >= 1.0) {
                          if (var22 * 2.0 < 1.0) {
                            var12 = var16_double;
                            break L5;
                          } else {
                            if (2.0 > 3.0 * var22) {
                              var12 = var18_double + (-var18_double + var16_double) * (0.6666666666666666 - var22) * 6.0;
                              break L5;
                            } else {
                              var12 = var18_double;
                              break L5;
                            }
                          }
                        } else {
                          var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
                          break L5;
                        }
                      }
                      L6: {
                        if (var20 * 6.0 < 1.0) {
                          var10 = var18_double + var20 * ((-var18_double + var16_double) * 6.0);
                          break L6;
                        } else {
                          if (1.0 > 2.0 * var20) {
                            var10 = var16_double;
                            break L6;
                          } else {
                            if (var20 * 3.0 < 2.0) {
                              var10 = var18_double + (0.6666666666666666 - var20) * (var16_double - var18_double) * 6.0;
                              break L6;
                            } else {
                              var10 = var18_double;
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        if (0.0 <= var24) {
                          break L7;
                        } else {
                          var24 = var24 + 1.0;
                          break L7;
                        }
                      }
                      if (6.0 * var24 < 1.0) {
                        var14 = var18_double + var24 * ((var16_double - var18_double) * 6.0);
                        break L2;
                      } else {
                        if (var24 * 2.0 >= 1.0) {
                          if (2.0 <= 3.0 * var24) {
                            var14 = var18_double;
                            break L2;
                          } else {
                            var14 = var18_double + (0.6666666666666666 - var24) * (-var18_double + var16_double) * 6.0;
                            break L2;
                          }
                        } else {
                          var14 = var16_double;
                          break L2;
                        }
                      }
                    }
                  }
                  var10 = Math.pow(var10, var1_double);
                  var12 = Math.pow(var12, var1_double);
                  var14 = Math.pow(var14, var1_double);
                  var16 = (int)(var10 * 256.0);
                  var17 = (int)(256.0 * var12);
                  var18 = (int)(var14 * 256.0);
                  var19 = (var16 << 16) - (-(var17 << 8) + -var18);
                  bb.field_i[var3] = var19;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "o.B(" + -56 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
