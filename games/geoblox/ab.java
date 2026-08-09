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
        ua var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              ua.a(param1.a(0, "", "headers.packvorbis"));
              var2 = ua.a(param1, "jagex logo2.packvorbis", "");
              var2.c();
              if (param0 >= 29) {
                break L1;
              } else {
                field_f = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("ab.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = gg.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if ((var3_int ^ -1) >= -13) {
                    L2: {
                      var4 = oe.a(param2, 12);
                      if (param1 == 2) {
                        break L2;
                      } else {
                        ab.a((byte) 112);
                        break L2;
                      }
                    }
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if ((var4.length() ^ -1) <= -2) {
                          L4: {
                            if (gg.a((byte) -32, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (gg.a((byte) -75, var4.charAt(-1 + var4.length()))) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (-1 > (var5 ^ -1)) {
                                      stackIn_36_0 = c.field_r;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param2.charAt(var6);
                                      if (gg.a((byte) -96, (char) var7)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (2 > var5) {
                                        break L7;
                                      } else {
                                        if (!param0) {
                                          stackIn_31_0 = fa.field_h;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_21_0 = c.field_r;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_16_0 = gg.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = gg.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    final static na a(int param0) {
        na var1 = new na(pg.field_b, dd.field_C, gh.field_m[0], md.field_e[0], rc.field_j[0], hl.field_K[0], mj.field_a[0], cm.field_j);
        int var2 = -128 / ((param0 - 52) / 49);
        kj.c(true);
        return var1;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 > 42) {
                break L1;
              } else {
                var5 = (CharSequence) null;
                ab.a(-120, (CharSequence) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_6_0 = var3;
                break L0;
              } else {
                var3 = -var3 + (var3 << -357128155) + qc.a(param1.charAt(var4), true);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ab.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, float param1) {
        int stackIn_17_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ja var2 = null;
        RuntimeException var2_ref = null;
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
        var16 = null;
        var15 = Geoblox.field_C;
        try {
          L0: {
            field_f = false;
            wb.field_b = 0;
            sh.field_y.a(255);
            var2 = (ja) ((Object) ji.field_r.g(0));
            L1: while (true) {
              if (var2 == null) {
                var3 = -125 % ((param0 - 35) / 49);
                var17 = (ja) ((Object) ji.field_r.g(0));
                L2: while (true) {
                  if (var17 == null) {
                    break L0;
                  } else {
                    var17.j(30383);
                    var17 = (ja) ((Object) ji.field_r.d(1));
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (a.field_d != var2.field_K) {
                    L4: {
                      if (!el.field_o.field_C) {
                        var2.f((byte) -59);
                        var2.b(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    gf.a(var2, -1232328029, param1);
                    if (!uj.a(var2, param1, 0)) {
                      L5: {
                        if (ma.a(true, param1, var2)) {
                          var3 = wd.field_b.field_v[aa.field_a + wd.field_b.field_s * aa.field_b] + -1;
                          var4 = tl.field_g[var3];
                          if (a.field_d != var4.field_K) {
                            L6: {
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
                                stackIn_36_0 = 0;
                                break L6;
                              } else {
                                stackIn_36_0 = 1;
                                break L6;
                              }
                            }
                            L7: {
                              var12 = stackIn_36_0;
                              var8 = 320.0f - var2.field_o;
                              var11 = 240.0f - (var6 + var2.field_v);
                              var10 = -var2.field_o - var5 + 320.0f;
                              var9 = -var2.field_v + 240.0f;
                              var10 = var10 * var10;
                              var11 = var11 * var11;
                              if (var9 * var9 + var8 * var8 >= var11 + var10) {
                                stackIn_39_0 = 0;
                                break L7;
                              } else {
                                stackIn_39_0 = 1;
                                break L7;
                              }
                            }
                            L8: {
                              var13 = stackIn_39_0;
                              if (var12 == 0) {
                                break L8;
                              } else {
                                if (var13 != 0) {
                                  var8 = -((var2.field_o + var4.field_o) * 0.5f) + 320.0f;
                                  var9 = 240.0f - 0.5f * (var4.field_v + var2.field_v);
                                  var14 = og.field_r / (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
                                  var5 = var8 * var14;
                                  var6 = var14 * var9;
                                  break L8;
                                } else {
                                  break L8;
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
                            break L5;
                          } else {
                            break L3;
                          }
                        } else {
                          var3_float = 320.0f - var2.field_o;
                          var4_float = 240.0f - var2.field_v;
                          var5 = -(var4_float * var2.field_o) + var2.field_v * var3_float;
                          if (-1 != (var2.field_L ^ -1)) {
                            break L5;
                          } else {
                            if (var5 * var5 <= 0.30000001192092896f) {
                              break L5;
                            } else {
                              var2.field_w = var3_float;
                              var2.field_F = var4_float;
                              var6 = og.field_r / (float)Math.sqrt((double)(var2.field_w * var2.field_w + var2.field_F * var2.field_F));
                              var2.field_w = var2.field_w * var6;
                              var2.field_F = var2.field_F * var6;
                              break L5;
                            }
                          }
                        }
                      }
                      var2.h((byte) 51);
                      break L3;
                    } else {
                      L9: {
                        vf.field_L.g(1);
                        if (var2.field_E > 0) {
                          break L9;
                        } else {
                          al.a(9666, c.field_ab);
                          break L9;
                        }
                      }
                      field_f = true;
                      var2.field_K = null;
                      var3 = 0;
                      L10: while (true) {
                        if (var3 >= var2.field_L) {
                          L11: {
                            var2.field_L = 0;
                            if ((var2.field_z ^ -1) != -3) {
                              stackIn_17_0 = 0;
                              break L11;
                            } else {
                              stackIn_17_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            L13: {
                              var3 = stackIn_17_0;
                              ih.a(-1, td.field_E, var2, ng.field_G);
                              if (var3 == 0) {
                                break L13;
                              } else {
                                if (var2.field_z == 2) {
                                  break L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L14: {
                              if ((var2.field_z ^ -1) != -3) {
                                var2.field_u = var2.field_u - param1;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            var2.field_v = (float)td.field_E;
                            var2.field_K = a.field_d;
                            var2.field_o = (float)ng.field_G;
                            break L12;
                          }
                          if (!var2.field_B) {
                            wb.field_b = wb.field_b + 1;
                            break L3;
                          } else {
                            var2 = (ja) ((Object) ji.field_r.d(1));
                            continue L1;
                          }
                        } else {
                          var2.field_n[var3].a(var2, 0);
                          var3++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var2 = (ja) ((Object) ji.field_r.d(1));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ab.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -58 % ((param0 - 0) / 38);
        field_e = null;
        field_c = null;
    }

    static {
        field_c = new ck(2, 4, 4, 0);
        field_e = "Suggested names: ";
        field_a = false;
        field_b = 0;
    }
}
