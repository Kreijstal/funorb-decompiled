/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private static int[] field_a;
    static int[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, o param5) {
        int var6 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var6 = (param1 + -param0 << -1167900312) / param5.field_q;
          var7 = param5.field_s * var6 + (param0 << -1287111928);
          param4 = param4 + param5.field_n;
          param2 = param2 + param5.field_s;
          var8 = 70 % ((param3 - -32) / 52);
          var9 = param4 * mi.field_a + param2;
          var10 = 0;
          var11 = param5.field_t;
          var12 = param5.field_p;
          var13 = mi.field_a - var12;
          if (param4 >= mi.field_l) {
            break L0;
          } else {
            var15 = mi.field_l - param4;
            var11 = var11 - var15;
            var10 = var10 + var15 * var12;
            param4 = mi.field_l;
            var9 = var9 + var15 * mi.field_a;
            break L0;
          }
        }
        L1: {
          var14 = 0;
          if (mi.field_b > param2) {
            var15 = -param2 + mi.field_b;
            var9 = var9 + var15;
            var14 = var14 + var15;
            var10 = var10 + var15;
            var13 = var13 + var15;
            var7 = var7 + var6 * var15;
            var12 = var12 - var15;
            param2 = mi.field_b;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param4 - -var11 > mi.field_e) {
            var11 = var11 - (param4 - (-var11 - -mi.field_e));
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var12 + param2 > mi.field_k) {
            var15 = param2 + (var12 - mi.field_k);
            var13 = var13 + var15;
            var14 = var14 + var15;
            var12 = var12 - var15;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var12 >= -1) {
            break L4;
          } else {
            if (-1 < var11) {
              param4 = -var11;
              L5: while (true) {
                if (0 <= param4) {
                  return;
                } else {
                  var15 = var7;
                  param2 = -var12;
                  L6: while (true) {
                    if (param2 >= 0) {
                      var10 = var10 + var14;
                      var9 = var9 + var13;
                      param4++;
                      continue L5;
                    } else {
                      var16 = var15 >> -85275064;
                      var15 = var15 + var6;
                      var17 = -var16 + 256;
                      if (var16 >= 0) {
                        var10++;
                        var18 = param5.field_v[var10];
                        if (-1 != (var18 ^ -1)) {
                          if (255 >= var16) {
                            var19 = mi.field_f[var9];
                            var20 = (16711935 & var19) * var17 + var16 * (16711935 & var18) >> -1704501464 & 16711935;
                            mi.field_f[var9] = fi.a(fi.a(var19, 65280) * var17 + fi.a(var18, 65280) * var16 >> 836634632, 65280) + var20;
                            var9++;
                            param2++;
                            continue L6;
                          } else {
                            mi.field_f[var9] = var18;
                            var9++;
                            param2++;
                            continue L6;
                          }
                        } else {
                          var9++;
                          param2++;
                          continue L6;
                        }
                      } else {
                        var9++;
                        var10++;
                        param2++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        Object var4 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (-1 <= kk.field_e) {
              break L0;
            } else {
              kk.field_e = kk.field_e - 1;
              var2_ref_byte__ = ng.field_g[kk.field_e - 1];
              ng.field_g[kk.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != param0) {
            break L1;
          } else {
            if (0 >= nf.field_V) {
              break L1;
            } else {
              nf.field_V = nf.field_V - 1;
              var2_ref_byte__ = hc.field_e[nf.field_V - 1];
              hc.field_e[nf.field_V] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1 == -1) {
            break L2;
          } else {
            var4 = null;
            fl.a(40, -45, 42, 86, 61, (o) null);
            break L2;
          }
        }
        L3: {
          if (30000 != param0) {
            break L3;
          } else {
            if ((sf.field_c ^ -1) < -1) {
              sf.field_c = sf.field_c - 1;
              var2_ref_byte__ = ef.field_d[sf.field_c - 1];
              ef.field_d[sf.field_c] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (rg.field_d == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= sf.field_i.length) {
                break L4;
              } else {
                if (sf.field_i[var2] == param0) {
                  if (cl.field_l[var2] > 0) {
                    cl.field_l[var2] = cl.field_l[var2] - 1;
                    var3 = rg.field_d[var2][cl.field_l[var2] - 1];
                    rg.field_d[var2][cl.field_l[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    final static void b(byte param0) {
        al var1_ref = null;
        if (param0 != 91) {
            byte[] discarded$0 = fl.a(112, -6);
        }
        al var1 = (al) (Object) uc.field_a.e((byte) 86);
        if (var1 == null) {
            var1_ref = new al();
        }
        var1_ref.a(mi.field_b, mi.field_k, mi.field_a, (byte) 86, mi.field_f, mi.field_e, mi.field_l, mi.field_d);
        cj.field_a.a((gg) (Object) var1_ref, param0 + -7135);
    }

    public static void a(byte param0) {
        if (param0 != -108) {
            Object var2 = null;
            fl.a(88, 111, 27, -112, 11, (o) null);
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_a = new int[98304];
        for (var0 = 92682; (var0 ^ -1) <= -46342; var0--) {
            var4 = (long)(-1 + (var0 << 652255297));
            var6 = (long)((var0 << -1236874719) - -1);
            var3 = (int)(-32768L + (var6 * var6 >> 79400210));
            var2 = (int)((var4 * var4 >> -1047441070) - 32768L);
            if (field_a.length <= var3) {
                var3 = field_a.length - 1;
            }
            for (var1 = 0 > var2 ? 0 : var2; var1 <= var3; var1++) {
                field_a[var1] = var0;
            }
        }
    }
}
