/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb implements n {
    private long field_a;
    static String field_c;
    static je field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var4 = -107 / ((param2 - 41) / 55);
        var3 = nf.a(true, param0);
        if ((param1.indexOf(param0) ^ -1) != 0) {
          return true;
        } else {
          if ((param1.indexOf(var3) ^ -1) == 0) {
            L0: {
              L1: {
                if (param1.startsWith(param0)) {
                  break L1;
                } else {
                  if (param1.startsWith(var3)) {
                    break L1;
                  } else {
                    if (param1.endsWith(param0)) {
                      break L1;
                    } else {
                      if (!param1.endsWith(var3)) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_11_0 != 0;
          } else {
            return true;
          }
        }
    }

    abstract gu c(int param0);

    final static boolean a(long param0, String param1, int param2, int param3, int[] param4) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 == -17231) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 == null) {
              break L2;
            } else {
              L3: {
                if (param3 != 2) {
                  break L3;
                } else {
                  if (!wq.a(param0, param1, (byte) -125)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static ne a(int param0, byte param1, bv param2) {
        if (-1 == (param0 ^ -1)) {
            return null;
        }
        ne var3 = new ne();
        no.a(param2, (uo) (Object) var3, param0, -24721);
        var3.j(-78);
        int var4 = -72 / ((-5 - param1) / 60);
        return var3;
    }

    final static void e(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        pu var4_ref_pu = null;
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
        int var17_int = 0;
        pu var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        mn.field_t = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = iq.field_a.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = mn.field_t[param0] >> -629540216;
              var4 = mn.field_t[10] >> 264936072;
              var5 = mn.field_t[11] >> -1314104728;
              var6 = ib.field_j << 1554443236;
              var7 = 0;
              var8 = ae.b(var6, 100) >> 1785809320;
              var9 = g.a(param0 + -10, var6) >> 534432968;
              if (sm.field_d == -1) {
                break L1;
              } else {
                if (ko.field_b != -1) {
                  var9 = -128;
                  var7 = sm.field_d - 320;
                  var8 = -ko.field_b + 240;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
            var9 = (int)((double)var9 * var10);
            var8 = (int)((double)var8 * var10);
            var7 = (int)((double)var7 * var10);
            var12 = var7 + -var3;
            var13 = var8 - var4;
            var14 = -var5 + var9;
            var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14));
            var12 = (int)((double)var12 * var10);
            var13 = (int)((double)var13 * var10);
            var14 = (int)((double)var14 * var10);
            var15 = 0;
            L2: while (true) {
              if (iq.field_a.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L3: while (true) {
                  if (var17_int >= iq.field_a.length) {
                    var23[var16] = -2147483648;
                    var17 = iq.field_a[var16];
                    cq.a((byte) -116, var16);
                    var18 = 0;
                    L4: while (true) {
                      if (-4 >= (var18 ^ -1)) {
                        ou.a(var17, true, true, false, false, pd.field_a, mn.field_t);
                        fp.a(var13, var17, var9, var8, var12, var7, var14, (byte) 120);
                        var15++;
                        continue L2;
                      } else {
                        pd.field_a[var18] = pd.field_a[var18] + sd.field_s[var15][var18];
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L3;
                    } else {
                      var17_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_pu = iq.field_a[var3];
            var4_ref_pu.a(-3831);
            cq.a((byte) -116, var3);
            var5 = var4_ref_pu.field_L + var4_ref_pu.field_p >> 470108033;
            var6 = var4_ref_pu.field_H + var4_ref_pu.field_P >> -401580991;
            var7 = var4_ref_pu.field_D + var4_ref_pu.field_J >> -1252407999;
            var8 = mn.field_t[9] >> -1855318878;
            var9 = mn.field_t[10] >> -710206046;
            var10_int = mn.field_t[11] >> -1792785598;
            var11 = var8 * pd.field_a[3] + pd.field_a[4] * var9 - -(pd.field_a[5] * var10_int) >> -1764664338;
            var12 = var10_int * pd.field_a[8] + (var8 * pd.field_a[6] + var9 * pd.field_a[7]) >> -2022129842;
            var13 = pd.field_a[10] * var9 + pd.field_a[9] * var8 + pd.field_a[11] * var10_int >> -1708086482;
            var2[var3] = var11 * var5 - -(var12 * var6) - -(var7 * var13) >> -893537680;
            var3++;
            continue L0;
          }
        }
    }

    public final void a(int param0) {
        if (param0 <= 123) {
            return;
        }
        ((rb) this).field_a = vi.b(99);
    }

    public final gu a(boolean param0) {
        if (param0) {
            return null;
        }
        if (!(!((rb) this).b(81))) {
            return lq.field_c;
        }
        if (!((350L + ((rb) this).field_a ^ -1L) >= (vi.b(-96) ^ -1L))) {
            return ad.field_K;
        }
        return ((rb) this).c(118);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ru param5) {
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
          var20 = ArmiesOfGielinor.field_M ? 1 : 0;
          var6 = (-param4 + param3 << -602358776) / param5.field_g;
          var7 = var6 * param5.field_i + (param4 << -2082097144);
          param2 = param2 + param5.field_i;
          param0 = param0 + param5.field_d;
          var8 = param2 - -(qn.field_l * param0);
          var9 = 0;
          var10 = param5.field_h;
          var11 = param5.field_e;
          var12 = qn.field_l + -var11;
          if (param0 < qn.field_a) {
            var14 = qn.field_a + -param0;
            param0 = qn.field_a;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            var8 = var8 + qn.field_l * var14;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == -1708086482) {
            break L1;
          } else {
            rb.e(-63);
            break L1;
          }
        }
        L2: {
          var13 = 0;
          if (param2 < qn.field_j) {
            var14 = qn.field_j + -param2;
            var9 = var9 + var14;
            var8 = var8 + var14;
            param2 = qn.field_j;
            var13 = var13 + var14;
            var12 = var12 + var14;
            var7 = var7 + var6 * var14;
            var11 = var11 - var14;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (qn.field_f >= var10 + param0) {
            break L3;
          } else {
            var10 = var10 - (param0 - -var10 + -qn.field_f);
            break L3;
          }
        }
        L4: {
          if (qn.field_e >= var11 + param2) {
            break L4;
          } else {
            var14 = -qn.field_e + param2 - -var11;
            var12 = var12 + var14;
            var13 = var13 + var14;
            var11 = var11 - var14;
            break L4;
          }
        }
        L5: {
          if (0 >= var11) {
            break L5;
          } else {
            if (var10 < -1) {
              param0 = -var10;
              L6: while (true) {
                if (-1 <= param0) {
                  return;
                } else {
                  var14 = var7;
                  param2 = -var11;
                  L7: while (true) {
                    if (param2 >= 0) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param0++;
                      continue L6;
                    } else {
                      var15 = var14 >> -1513187960;
                      var14 = var14 + var6;
                      var16 = -var15 + 256;
                      if (0 <= var15) {
                        var9++;
                        var17 = param5.field_j[param5.field_k[var9] & 255];
                        if (0 != var17) {
                          if (255 < var15) {
                            qn.field_d[var8] = var17;
                            var8++;
                            param2++;
                            continue L7;
                          } else {
                            var18 = qn.field_d[var8];
                            var19 = (var17 & 16711935) * var15 + (16711935 & var18) * var16 >> 208566024 & 16711935;
                            qn.field_d[var8] = var19 + rn.a(65280, rn.a(var17, 65280) * var15 + rn.a(var18, 65280) * var16 >> -1903824056);
                            var8++;
                            param2++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param2++;
                          continue L7;
                        }
                      } else {
                        var8++;
                        var9++;
                        param2++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        if (param2 != 1) {
            field_b = null;
        }
        return (param1[param0 >> 106908741] & 1 << (param0 & 31)) != 0 ? true : false;
    }

    public final String a(byte param0) {
        if (((rb) this).b(88)) {
            return null;
        }
        if ((vi.b(65) ^ -1L) > (350L + ((rb) this).field_a ^ -1L)) {
            return null;
        }
        if (param0 != 55) {
            ((rb) this).field_a = -82L;
        }
        return ((rb) this).b((byte) -71);
    }

    public static void d(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 65280) {
            field_c = null;
        }
    }

    abstract String b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This <%0> is currently wielding the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
    }
}
