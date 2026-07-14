/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static ge[] field_d;
    static volatile boolean field_a;
    static ka field_b;
    static ka[][][] field_c;

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5) {
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
          var20 = TorChallenge.field_F ? 1 : 0;
          var6 = (-param0 + param3 << -403745528) / param4.field_q;
          param1 = param1 + param4.field_p;
          param2 = param2 + param4.field_s;
          var7 = (param0 << 1429206920) - -(param4.field_s * var6);
          var8 = param1 * qg.field_g + param2;
          var9 = 0;
          var10 = param4.field_x;
          var11 = param4.field_u;
          var12 = -var11 + qg.field_g;
          if (param1 >= qg.field_k) {
            break L0;
          } else {
            var14 = qg.field_k + -param1;
            var9 = var9 + var11 * var14;
            var8 = var8 + qg.field_g * var14;
            param1 = qg.field_k;
            var10 = var10 - var14;
            break L0;
          }
        }
        L1: {
          var13 = 0;
          if (param2 < qg.field_a) {
            var14 = -param2 + qg.field_a;
            var11 = var11 - var14;
            param2 = qg.field_a;
            var7 = var7 + var14 * var6;
            var9 = var9 + var14;
            var12 = var12 + var14;
            var13 = var13 + var14;
            var8 = var8 + var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (qg.field_l < param1 + var10) {
            var10 = var10 - (-qg.field_l + param1 - -var10);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (qg.field_c < param2 - -var11) {
            var14 = -qg.field_c + (param2 + var11);
            var11 = var11 - var14;
            var13 = var13 + var14;
            var12 = var12 + var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param5 >= 51) {
            break L4;
          } else {
            field_d = null;
            break L4;
          }
        }
        if (var11 <= 0) {
          return;
        } else {
          if ((var10 ^ -1) < -1) {
            param1 = -var10;
            L5: while (true) {
              if (param1 >= 0) {
                return;
              } else {
                var14 = var7;
                param2 = -var11;
                L6: while (true) {
                  if (param2 >= 0) {
                    var9 = var9 + var13;
                    var8 = var8 + var12;
                    param1++;
                    continue L5;
                  } else {
                    var15 = var14 >> 1020655816;
                    var14 = var14 + var6;
                    var16 = 256 + -var15;
                    if (-1 >= (var15 ^ -1)) {
                      var9++;
                      var17 = param4.field_y[var9];
                      if (var17 != 0) {
                        if (255 >= var15) {
                          var18 = qg.field_i[var8];
                          var19 = var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 1569313576 & 16711935;
                          qg.field_i[var8] = var19 - -jh.a(var16 * jh.a(65280, var18) - -(var15 * jh.a(65280, var17)) >> 2145359400, 65280);
                          var8++;
                          param2++;
                          continue L6;
                        } else {
                          qg.field_i[var8] = var17;
                          var8++;
                          param2++;
                          continue L6;
                        }
                      } else {
                        var8++;
                        param2++;
                        continue L6;
                      }
                    } else {
                      var8++;
                      var9++;
                      param2++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            c.a(93, -47, -27, 44, (ka) null, 19);
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 1067751487) {
            field_b = null;
        }
        int var3 = param2 >>> 1067751487;
        return -var3 + (param2 + var3) / param0;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          var1 = 5;
          if (!d.p(-88)) {
            if (ee.field_o <= 0) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_6_0;
        var3 = 0;
        L1: while (true) {
          if ((var3 ^ -1) <= -4) {
            L2: {
              var3 = 0;
              if (param0 >= 86) {
                break L2;
              } else {
                field_a = true;
                break L2;
              }
            }
            L3: while (true) {
              if (var3 >= 6) {
                var3 = 0;
                L4: while (true) {
                  if ((var3 ^ -1) <= -7) {
                    return;
                  } else {
                    L5: {
                      kj.field_I[var3] = false;
                      if (var2 == 0) {
                        break L5;
                      } else {
                        if (1 >= var3) {
                          break L5;
                        } else {
                          kj.field_I[var3] = true;
                          break L5;
                        }
                      }
                    }
                    if (bh.field_p) {
                      if (aj.field_h) {
                        ac.field_d = ac.field_d + 64;
                        pi.field_a = pi.field_a + 128;
                        kj.field_I[var3] = false;
                        var3++;
                        continue L4;
                      } else {
                        var3++;
                        continue L4;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                var4 = 0;
                L6: while (true) {
                  if (var4 >= var1) {
                    if (var3 != 5) {
                      L7: {
                        if ((1 << var3 & k.field_b[ok.field_b]) <= 0) {
                          pa.field_s[ok.field_b][1 + var3] = false;
                          break L7;
                        } else {
                          pa.field_s[ok.field_b][1 + var3] = true;
                          break L7;
                        }
                      }
                      L8: {
                        if (var2 == 0) {
                          break L8;
                        } else {
                          if (-1 > (var3 ^ -1)) {
                            pa.field_s[ok.field_b][1 + var3] = false;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (aj.field_h) {
                        pa.field_s[ok.field_b][var3 - -1] = true;
                        var3++;
                        continue L3;
                      } else {
                        var3++;
                        continue L3;
                      }
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    L9: {
                      if (var2 == 0) {
                        break L9;
                      } else {
                        if (var3 >= -2) {
                          break L9;
                        } else {
                          var4++;
                          continue L6;
                        }
                      }
                    }
                    if (-1 < (1 << var3 & pi.field_d[ok.field_b][ak.field_h])) {
                      var4++;
                      continue L6;
                    } else {
                      var4++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            pa.field_s[var3][0] = true;
            var3++;
            continue L1;
          }
        }
    }

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if ((param1 % 10L ^ -1L) != -1L) {
            nd.a(123, param1);
        } else {
            nd.a(117, -1L + param1);
            nd.a(125, 1L);
        }
        int var3 = 70 % ((param0 - -35) / 61);
    }

    final static void a(boolean param0, boolean param1) {
        t.field_b.a(0, 0, 0);
        if (param1) {
            field_b = null;
        }
    }

    final static void a(String param0, int param1, boolean param2, float param3) {
        if (null == oa.field_k) {
            oa.field_k = new pe(t.field_b, jh.field_a);
            t.field_b.a((byte) 86, (ee) (Object) oa.field_k);
        }
        oa.field_k.a(param2, param0, param3, false);
        qg.b();
        int var4 = -58 / ((-64 - param1) / 51);
        c.a(true, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_c = new ka[20][3][];
    }
}
