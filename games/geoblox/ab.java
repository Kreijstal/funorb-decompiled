/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static ck field_c;
    static boolean field_f;
    static boolean field_d;
    static String field_e;
    static int field_b;
    static volatile boolean field_a;

    final static void a(int param0, rh param1) {
        ua.a(param1.a(0, "", "headers.packvorbis"));
        ua var2 = ua.a(param1, "jagex logo2.packvorbis", "");
        gd discarded$3 = var2.c();
        if (param0 < 29) {
            field_f = true;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        if (param2 == null) {
          return gg.field_d;
        } else {
          L0: {
            var3 = param2.length();
            if ((var3 ^ -1) > -2) {
              break L0;
            } else {
              if ((var3 ^ -1) >= -13) {
                L1: {
                  var4 = oe.a(param2, 12);
                  if (param1 == 2) {
                    break L1;
                  } else {
                    ab.a((byte) 112);
                    break L1;
                  }
                }
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L3: {
                        if (gg.a((byte) -32, var4.charAt(0))) {
                          break L3;
                        } else {
                          if (gg.a((byte) -75, var4.charAt(-1 + var4.length()))) {
                            break L3;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (var6 >= param2.length()) {
                                if (-1 > (var5 ^ -1)) {
                                  return c.field_r;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param2.charAt(var6);
                                  if (gg.a((byte) -96, (char) var7)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                if (2 <= var5) {
                                  if (!param0) {
                                    return fa.field_h;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return c.field_r;
                    } else {
                      break L2;
                    }
                  }
                }
                return gg.field_d;
              } else {
                break L0;
              }
            }
          }
          return gg.field_d;
        }
    }

    final static na a(int param0) {
        na var1 = new na(pg.field_b, dd.field_C, gh.field_m[0], md.field_e[0], rc.field_j[0], hl.field_K[0], mj.field_a[0], cm.field_j);
        int var2 = -128 / ((param0 - 52) / 49);
        kj.c(true);
        return var1;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2 = param1.length();
        int var3 = 0;
        if (param0 <= 42) {
            Object var5 = null;
            int discarded$0 = ab.a(-120, (CharSequence) null);
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3 = -var3 + (var3 << -357128155) + qc.a(param1.charAt(var4), true);
        }
        return var3;
    }

    final static void a(int param0, float param1) {
        ja var2 = null;
        int var3 = 0;
        float var3_float = 0.0f;
        ja var4 = null;
        float var4_float = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        int var15 = 0;
        Object var16 = null;
        ja var17 = null;
        int stackIn_16_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var16 = null;
        var15 = Geoblox.field_C;
        field_f = false;
        wb.field_b = 0;
        sh.field_y.a(255);
        var2 = (ja) (Object) ji.field_r.g(0);
        L0: while (true) {
          if (var2 == null) {
            var3 = -125 % ((param0 - 35) / 49);
            var17 = (ja) (Object) ji.field_r.g(0);
            L1: while (true) {
              if (var17 == null) {
                return;
              } else {
                var17.j(30383);
                var17 = (ja) (Object) ji.field_r.d(1);
                continue L1;
              }
            }
          } else {
            if (a.field_d != var2.field_K) {
              L2: {
                if (!el.field_o.field_C) {
                  var2.f((byte) -59);
                  var2.b(true);
                  break L2;
                } else {
                  break L2;
                }
              }
              gf.a(var2, -1232328029, param1);
              if (!uj.a(var2, param1, 0)) {
                L3: {
                  L4: {
                    if (ma.a(true, param1, var2)) {
                      var3 = wd.field_b.field_v[aa.field_a + wd.field_b.field_s * aa.field_b] + -1;
                      var4 = tl.field_g[var3];
                      if (a.field_d != var4.field_K) {
                        L5: {
                          var5 = 0.5f * (var4.field_w + var2.field_w);
                          var6 = (var4.field_F + var2.field_F) * 0.5f;
                          var7 = var6 * var6 + var5 * var5;
                          var7 = og.field_r / (float)Math.sqrt((double)var7);
                          var6 = var6 * var7;
                          var5 = var5 * var7;
                          var8 = -var4.field_o + 320.0f;
                          var9 = 240.0f - var4.field_v;
                          var10 = -var5 - var4.field_o + 320.0f;
                          var11 = 240.0f - (var4.field_v + var6);
                          var10 = var10 * var10;
                          var11 = var11 * var11;
                          if (var10 + var11 <= var9 * var9 + var8 * var8) {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            break L5;
                          } else {
                            stackOut_33_0 = 1;
                            stackIn_35_0 = stackOut_33_0;
                            break L5;
                          }
                        }
                        L6: {
                          var12 = stackIn_35_0;
                          var8 = 320.0f - var2.field_o;
                          var11 = 240.0f - (var6 + var2.field_v);
                          var10 = -var2.field_o - var5 + 320.0f;
                          var9 = -var2.field_v + 240.0f;
                          var10 = var10 * var10;
                          var11 = var11 * var11;
                          if (var9 * var9 + var8 * var8 >= var11 + var10) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            break L6;
                          } else {
                            stackOut_36_0 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            break L6;
                          }
                        }
                        L7: {
                          var13 = stackIn_38_0;
                          if (var12 == 0) {
                            break L7;
                          } else {
                            if (var13 != 0) {
                              var8 = -((var2.field_o + var4.field_o) * 0.5f) + 320.0f;
                              var9 = 240.0f - 0.5f * (var4.field_v + var2.field_v);
                              var14 = og.field_r / (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
                              var5 = var8 * var14;
                              var6 = var14 * var9;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var2.field_F = var2.field_F * -1.0f;
                        var2.field_w = var2.field_w * -1.0f;
                        var2.f((byte) -59);
                        var4.field_w = var5;
                        var2.field_w = var5;
                        var4.field_F = var6;
                        var2.field_F = var6;
                        break L4;
                      } else {
                        break L3;
                      }
                    } else {
                      var3_float = 320.0f - var2.field_o;
                      var4_float = 240.0f - var2.field_v;
                      var5 = -(var4_float * var2.field_o) + var2.field_v * var3_float;
                      if (-1 != (var2.field_L ^ -1)) {
                        break L4;
                      } else {
                        if (var5 * var5 <= 0.30000001192092896f) {
                          break L4;
                        } else {
                          var2.field_w = var3_float;
                          var2.field_F = var4_float;
                          var6 = og.field_r / (float)Math.sqrt((double)(var2.field_w * var2.field_w + var2.field_F * var2.field_F));
                          var2.field_w = var2.field_w * var6;
                          var2.field_F = var2.field_F * var6;
                          break L4;
                        }
                      }
                    }
                  }
                  var2.h((byte) 51);
                  break L3;
                }
                var2 = (ja) (Object) ji.field_r.d(1);
                continue L0;
              } else {
                L8: {
                  vf.field_L.g(1);
                  if (var2.field_E > 0) {
                    break L8;
                  } else {
                    al.a(9666, c.field_ab);
                    break L8;
                  }
                }
                field_f = true;
                var2.field_K = null;
                var3 = 0;
                L9: while (true) {
                  if (var3 >= var2.field_L) {
                    L10: {
                      var2.field_L = 0;
                      if ((var2.field_z ^ -1) != -3) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L10;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        var3 = stackIn_16_0;
                        ih.a(-1, td.field_E, var2, ng.field_G);
                        if (var3 == 0) {
                          break L12;
                        } else {
                          if (var2.field_z == 2) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        if ((var2.field_z ^ -1) != -3) {
                          var2.field_u = var2.field_u - param1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var2.field_v = (float)td.field_E;
                      var2.field_K = a.field_d;
                      var2.field_o = (float)ng.field_G;
                      break L11;
                    }
                    if (!var2.field_B) {
                      wb.field_b = wb.field_b + 1;
                      var2 = (ja) (Object) ji.field_r.d(1);
                      continue L0;
                    } else {
                      var2 = (ja) (Object) ji.field_r.d(1);
                      continue L0;
                    }
                  } else {
                    var2.field_n[var3].a(var2, 0);
                    var3++;
                    continue L9;
                  }
                }
              }
            } else {
              var2 = (ja) (Object) ji.field_r.d(1);
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -58 % ((param0 - 0) / 38);
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ck(2, 4, 4, 0);
        field_e = "Suggested names: ";
        field_a = false;
        field_b = 0;
    }
}
