/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ab {
    static ck field_c;
    static boolean field_f;
    static boolean field_d;
    static String field_e;
    static int field_b;
    static volatile boolean field_a;

    final static void a(int param0, rh param1) {
        ua var2 = null;
        RuntimeException var2_ref = null;
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
            ua.a(param1.a(0, "", "headers.packvorbis"));
            var2 = ua.a(param1, "jagex logo2.packvorbis", "");
            gd discarded$2 = var2.c();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("ab.F(").append(99).append(',');
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_27_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_31_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = gg.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = oe.a(param2, 12);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
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
                                    if (var5 > 0) {
                                      stackOut_31_0 = c.field_r;
                                      stackIn_32_0 = stackOut_31_0;
                                      break L0;
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
                                    if (2 > var5) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_26_0 = fa.field_h;
                                      stackIn_27_0 = stackOut_26_0;
                                      return stackIn_27_0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_18_0 = c.field_r;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = gg.field_d;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = gg.field_d;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("ab.A(").append(false).append(',').append(2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    final static na a(int param0) {
        na var1 = new na(pg.field_b, dd.field_C, gh.field_m[0], md.field_e[0], rc.field_j[0], hl.field_K[0], mj.field_a[0], cm.field_j);
        int var2 = -128;
        kj.c(true);
        return var1;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 > 42) {
                break L1;
              } else {
                var5 = null;
                int discarded$4 = ab.a(-120, (CharSequence) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_5_0 = var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                int discarded$5 = 1;
                var3 = -var3 + (var3 << 5) + qc.a(param1.charAt(var4));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ab.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, float param1) {
        RuntimeException var2 = null;
        ja var2_ref = null;
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
        int stackIn_17_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = null;
        var15 = Geoblox.field_C;
        try {
          L0: {
            field_f = false;
            wb.field_b = 0;
            sh.field_y.a(255);
            var2_ref = (ja) (Object) ji.field_r.g(0);
            L1: while (true) {
              if (var2_ref == null) {
                var3 = 0;
                var17 = (ja) (Object) ji.field_r.g(0);
                L2: while (true) {
                  if (var17 == null) {
                    break L0;
                  } else {
                    var17.j(30383);
                    var17 = (ja) (Object) ji.field_r.d(1);
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (a.field_d != var2_ref.field_K) {
                    L4: {
                      if (!el.field_o.field_C) {
                        var2_ref.f((byte) -59);
                        var2_ref.b(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    gf.a(var2_ref, -1232328029, param1);
                    int discarded$1 = 0;
                    if (!uj.a(var2_ref, param1)) {
                      L5: {
                        if (ma.a(true, param1, var2_ref)) {
                          var3 = wd.field_b.field_v[aa.field_a + wd.field_b.field_s * aa.field_b] + -1;
                          var4 = tl.field_g[var3];
                          if (a.field_d != var4.field_K) {
                            L6: {
                              var5 = 0.5f * (var4.field_w + var2_ref.field_w);
                              var6 = (var4.field_F + var2_ref.field_F) * 0.5f;
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
                                stackOut_35_0 = 0;
                                stackIn_36_0 = stackOut_35_0;
                                break L6;
                              } else {
                                stackOut_34_0 = 1;
                                stackIn_36_0 = stackOut_34_0;
                                break L6;
                              }
                            }
                            L7: {
                              var12 = stackIn_36_0;
                              var8 = 320.0f - var2_ref.field_o;
                              var11 = 240.0f - (var6 + var2_ref.field_v);
                              var10 = -var2_ref.field_o - var5 + 320.0f;
                              var9 = -var2_ref.field_v + 240.0f;
                              var10 = var10 * var10;
                              var11 = var11 * var11;
                              if (var9 * var9 + var8 * var8 >= var11 + var10) {
                                stackOut_38_0 = 0;
                                stackIn_39_0 = stackOut_38_0;
                                break L7;
                              } else {
                                stackOut_37_0 = 1;
                                stackIn_39_0 = stackOut_37_0;
                                break L7;
                              }
                            }
                            L8: {
                              var13 = stackIn_39_0;
                              if (var12 == 0) {
                                break L8;
                              } else {
                                if (var13 != 0) {
                                  var8 = -((var2_ref.field_o + var4.field_o) * 0.5f) + 320.0f;
                                  var9 = 240.0f - 0.5f * (var4.field_v + var2_ref.field_v);
                                  var14 = og.field_r / (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
                                  var5 = var8 * var14;
                                  var6 = var14 * var9;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var2_ref.field_F = var2_ref.field_F * -1.0f;
                            var2_ref.field_w = var2_ref.field_w * -1.0f;
                            var2_ref.f((byte) -59);
                            var4.field_w = var5;
                            var2_ref.field_w = var5;
                            var4.field_F = var6;
                            var2_ref.field_F = var6;
                            break L5;
                          } else {
                            break L3;
                          }
                        } else {
                          var3_float = 320.0f - var2_ref.field_o;
                          var4_float = 240.0f - var2_ref.field_v;
                          var5 = -(var4_float * var2_ref.field_o) + var2_ref.field_v * var3_float;
                          if (var2_ref.field_L != 0) {
                            break L5;
                          } else {
                            if (var5 * var5 <= 0.30000001192092896f) {
                              break L5;
                            } else {
                              var2_ref.field_w = var3_float;
                              var2_ref.field_F = var4_float;
                              var6 = og.field_r / (float)Math.sqrt((double)(var2_ref.field_w * var2_ref.field_w + var2_ref.field_F * var2_ref.field_F));
                              var2_ref.field_w = var2_ref.field_w * var6;
                              var2_ref.field_F = var2_ref.field_F * var6;
                              break L5;
                            }
                          }
                        }
                      }
                      var2_ref.h((byte) 51);
                      break L3;
                    } else {
                      L9: {
                        vf.field_L.g(1);
                        if (var2_ref.field_E > 0) {
                          break L9;
                        } else {
                          al.a(9666, c.field_ab);
                          break L9;
                        }
                      }
                      field_f = true;
                      var2_ref.field_K = null;
                      var3 = 0;
                      L10: while (true) {
                        if (var3 >= var2_ref.field_L) {
                          L11: {
                            var2_ref.field_L = 0;
                            if (var2_ref.field_z != 2) {
                              stackOut_16_0 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              break L11;
                            } else {
                              stackOut_15_0 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              break L11;
                            }
                          }
                          L12: {
                            L13: {
                              var3 = stackIn_17_0;
                              ih.a(-1, td.field_E, var2_ref, ng.field_G);
                              if (var3 == 0) {
                                break L13;
                              } else {
                                if (var2_ref.field_z == 2) {
                                  break L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L14: {
                              if (var2_ref.field_z != 2) {
                                var2_ref.field_u = var2_ref.field_u - param1;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            var2_ref.field_v = (float)td.field_E;
                            var2_ref.field_K = a.field_d;
                            var2_ref.field_o = (float)ng.field_G;
                            break L12;
                          }
                          if (!var2_ref.field_B) {
                            wb.field_b = wb.field_b + 1;
                            break L3;
                          } else {
                            var2_ref = (ja) (Object) ji.field_r.d(1);
                            continue L1;
                          }
                        } else {
                          var2_ref.field_n[var3].a(var2_ref, 0);
                          var3++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var2_ref = (ja) (Object) ji.field_r.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "ab.C(" + -37 + ',' + param1 + ')');
        }
    }

    public static void a() {
        int var1 = 0;
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
