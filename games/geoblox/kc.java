/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String field_b;
    static int field_c;

    public static void a() {
        int var1 = 0;
        field_b = null;
    }

    final static void a(java.awt.Component param0) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) je.field_j);
        try {
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) je.field_j);
            ii.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "kc.D(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
            var2_int = 0;
            L1: while (true) {
              if (md.field_c <= var2_int) {
                L2: {
                  sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c - -param0, false);
                  if (param0 < md.field_c) {
                    md.field_c = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                qi.field_i[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "kc.A(" + param0 + 44 + -98 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        int var1_int = 0;
        ja var2_ref_ja = null;
        int var2 = 0;
        ja var3 = null;
        float var3_float = 0.0f;
        int var3_int = 0;
        int var4_int = 0;
        float var4_float = 0.0f;
        ja var4 = null;
        double var5 = 0.0;
        ja var5_ref_ja = null;
        int var6_int = 0;
        ja var6 = null;
        int var7_int = 0;
        ja var7 = null;
        ja var8 = null;
        int var9 = 0;
        ja var10 = null;
        int var11 = 0;
        wd var12 = null;
        ja var13 = null;
        wd var14 = null;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        gh stackIn_81_0 = null;
        gh stackIn_82_0 = null;
        gh stackIn_83_0 = null;
        gh stackIn_84_0 = null;
        gh stackIn_85_0 = null;
        gh stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_80_0 = null;
        gh stackOut_81_0 = null;
        gh stackOut_82_0 = null;
        gh stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        gh stackOut_83_0 = null;
        gh stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        var9 = Geoblox.field_C;
        try {
          L0: {
            fa.field_a = false;
            var1_ref = (ja) (Object) ji.field_r.g(0);
            L1: while (true) {
              if (var1_ref == null) {
                L2: {
                  if (!re.field_j) {
                    break L2;
                  } else {
                    var1_ref = (ja) (Object) a.field_d.g(0);
                    L3: while (true) {
                      if (var1_ref == null) {
                        re.field_j = false;
                        el.field_o.field_B = true;
                        var1_int = 0;
                        L4: while (true) {
                          if (1000 <= var1_int) {
                            break L2;
                          } else {
                            pk.field_o[var1_int] = false;
                            var1_int++;
                            continue L4;
                          }
                        }
                      } else {
                        L5: {
                          if (!pk.field_o[var1_ref.field_H]) {
                            var12 = new wd();
                            var14 = new wd();
                            var12.a((rc) (Object) var1_ref, false);
                            var4_int = 1;
                            L6: while (true) {
                              L7: {
                                var10 = (ja) (Object) var12.a(true);
                                var13 = var10;
                                if (var13 == null) {
                                  break L7;
                                } else {
                                  pk.field_o[var10.field_H] = true;
                                  if (var13.field_t) {
                                    var4_int = 0;
                                    break L7;
                                  } else {
                                    var14.a((rc) (Object) var13, false);
                                    var6_int = 0;
                                    L8: while (true) {
                                      if (var6_int >= var13.field_L) {
                                        continue L6;
                                      } else {
                                        var7 = var13.field_n[var6_int];
                                        var8 = (ja) (Object) var14.c((byte) 121);
                                        L9: while (true) {
                                          L10: {
                                            if (var8 == null) {
                                              var8 = (ja) (Object) var12.c((byte) 121);
                                              if (var8 == null) {
                                                var12.a((rc) (Object) var7, false);
                                                break L10;
                                              } else {
                                                L11: {
                                                  if (var8 == var7) {
                                                    break L11;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                                var6_int++;
                                                continue L8;
                                              }
                                            } else {
                                              if (var8 != var7) {
                                                var8 = (ja) (Object) var14.a(-45);
                                                continue L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var6_int++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (var4_int == 0) {
                                break L5;
                              } else {
                                var5_ref_ja = (ja) (Object) var14.a(true);
                                L12: while (true) {
                                  if (var5_ref_ja == null) {
                                    break L5;
                                  } else {
                                    var5_ref_ja.field_K = ji.field_r;
                                    var5_ref_ja.field_t = false;
                                    var5_ref_ja.field_B = true;
                                    fa.field_a = true;
                                    var11 = 0;
                                    var6_int = var11;
                                    L13: while (true) {
                                      if (var11 >= var5_ref_ja.field_L) {
                                        var6 = var5_ref_ja;
                                        var7 = var5_ref_ja;
                                        var5_ref_ja.field_L = 0;
                                        var6.field_N = 0;
                                        var7.field_m = 0;
                                        var5_ref_ja = (ja) (Object) var14.a(true);
                                        continue L12;
                                      } else {
                                        var5_ref_ja.field_n[var11].a(var5_ref_ja, 0);
                                        var11++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var1_ref = (ja) (Object) a.field_d.d(1);
                        continue L3;
                      }
                    }
                  }
                }
                var1_int = 0;
                var2_ref_ja = (ja) (Object) a.field_d.g(0);
                L14: while (true) {
                  if (var2_ref_ja == null) {
                    var2 = -23 / ((param0 - 69) / 46);
                    var3 = (ja) (Object) bh.field_c.g(0);
                    L15: while (true) {
                      if (var3 == null) {
                        L16: {
                          if (!w.field_f) {
                            break L16;
                          } else {
                            jc.a(3, false);
                            jl.field_t = false;
                            break L16;
                          }
                        }
                        L17: {
                          L18: {
                            stackOut_80_0 = el.field_o;
                            stackIn_84_0 = stackOut_80_0;
                            stackIn_81_0 = stackOut_80_0;
                            if (el.field_o.field_F) {
                              break L18;
                            } else {
                              stackOut_81_0 = (gh) (Object) stackIn_81_0;
                              stackIn_84_0 = stackOut_81_0;
                              stackIn_82_0 = stackOut_81_0;
                              if (ab.field_f) {
                                break L18;
                              } else {
                                stackOut_82_0 = (gh) (Object) stackIn_82_0;
                                stackIn_85_0 = stackOut_82_0;
                                stackIn_83_0 = stackOut_82_0;
                                if (!w.field_f) {
                                  stackOut_85_0 = (gh) (Object) stackIn_85_0;
                                  stackOut_85_1 = 0;
                                  stackIn_86_0 = stackOut_85_0;
                                  stackIn_86_1 = stackOut_85_1;
                                  break L17;
                                } else {
                                  stackOut_83_0 = (gh) (Object) stackIn_83_0;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L18;
                                }
                              }
                            }
                          }
                          stackOut_84_0 = (gh) (Object) stackIn_84_0;
                          stackOut_84_1 = 1;
                          stackIn_86_0 = stackOut_84_0;
                          stackIn_86_1 = stackOut_84_1;
                          break L17;
                        }
                        L19: {
                          stackIn_86_0.field_F = stackIn_86_1 != 0;
                          w.field_f = false;
                          if (var1_int >= 3) {
                            ra.a(255 ^ fe.field_f, -88, fe.field_f);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          if (rb.field_b >= 5) {
                            ra.a(255 ^ vd.field_p, -83, vd.field_p);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        break L0;
                      } else {
                        L21: {
                          if (ra.field_a != var3.field_K) {
                            break L21;
                          } else {
                            var3.a(false);
                            var3.a((byte) 51);
                            ra.field_a.a(-44, (hf) (Object) var3);
                            var3.field_K = null;
                            break L21;
                          }
                        }
                        var3 = (ja) (Object) bh.field_c.d(1);
                        continue L15;
                      }
                    }
                  } else {
                    L22: {
                      L23: {
                        if (null != var2_ref_ja.field_K) {
                          break L23;
                        } else {
                          if (!w.field_f) {
                            break L22;
                          } else {
                            if (var2_ref_ja.field_t) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      L24: {
                        re.field_j = true;
                        var2_ref_ja.a(false);
                        var2_ref_ja.a((byte) 100);
                        el.field_o.field_F = true;
                        var2_ref_ja.f(92);
                        if (ji.field_r != var2_ref_ja.field_K) {
                          L25: {
                            if (var2_ref_ja.field_K == bh.field_c) {
                              break L25;
                            } else {
                              if (w.field_f) {
                                break L25;
                              } else {
                                var2_ref_ja.field_K = null;
                                el.field_o.field_F = true;
                                var2_ref_ja = (ja) (Object) a.field_d.d(1);
                                continue L14;
                              }
                            }
                          }
                          var3_int = 0;
                          L26: while (true) {
                            if (var3_int >= var2_ref_ja.field_L) {
                              L27: {
                                var3 = var2_ref_ja;
                                var2_ref_ja.field_L = 0;
                                var4 = var2_ref_ja;
                                var3.field_N = 0;
                                var4.field_m = 0;
                                var2_ref_ja.field_r = 50;
                                bh.field_c.a(-100, (hf) (Object) var2_ref_ja);
                                var2_ref_ja.field_G = 0;
                                if (!var2_ref_ja.field_t) {
                                  break L27;
                                } else {
                                  if (!w.field_f) {
                                    break L27;
                                  } else {
                                    L28: {
                                      L29: {
                                        stackOut_62_0 = (int)var2_ref_ja.field_v;
                                        stackOut_62_1 = (int)var2_ref_ja.field_o;
                                        stackOut_62_2 = 117;
                                        stackIn_65_0 = stackOut_62_0;
                                        stackIn_65_1 = stackOut_62_1;
                                        stackIn_65_2 = stackOut_62_2;
                                        stackIn_63_0 = stackOut_62_0;
                                        stackIn_63_1 = stackOut_62_1;
                                        stackIn_63_2 = stackOut_62_2;
                                        if (var2_ref_ja.field_z == 4) {
                                          break L29;
                                        } else {
                                          stackOut_63_0 = stackIn_63_0;
                                          stackOut_63_1 = stackIn_63_1;
                                          stackOut_63_2 = stackIn_63_2;
                                          stackIn_66_0 = stackOut_63_0;
                                          stackIn_66_1 = stackOut_63_1;
                                          stackIn_66_2 = stackOut_63_2;
                                          stackIn_64_0 = stackOut_63_0;
                                          stackIn_64_1 = stackOut_63_1;
                                          stackIn_64_2 = stackOut_63_2;
                                          if (var2_ref_ja.field_z != 3) {
                                            stackOut_66_0 = stackIn_66_0;
                                            stackOut_66_1 = stackIn_66_1;
                                            stackOut_66_2 = stackIn_66_2;
                                            stackOut_66_3 = 10;
                                            stackIn_67_0 = stackOut_66_0;
                                            stackIn_67_1 = stackOut_66_1;
                                            stackIn_67_2 = stackOut_66_2;
                                            stackIn_67_3 = stackOut_66_3;
                                            break L28;
                                          } else {
                                            stackOut_64_0 = stackIn_64_0;
                                            stackOut_64_1 = stackIn_64_1;
                                            stackOut_64_2 = stackIn_64_2;
                                            stackIn_65_0 = stackOut_64_0;
                                            stackIn_65_1 = stackOut_64_1;
                                            stackIn_65_2 = stackOut_64_2;
                                            break L29;
                                          }
                                        }
                                      }
                                      stackOut_65_0 = stackIn_65_0;
                                      stackOut_65_1 = stackIn_65_1;
                                      stackOut_65_2 = stackIn_65_2;
                                      stackOut_65_3 = 100;
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_67_2 = stackOut_65_2;
                                      stackIn_67_3 = stackOut_65_3;
                                      break L28;
                                    }
                                    ld.a(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3);
                                    break L27;
                                  }
                                }
                              }
                              if (4 == var2_ref_ja.field_z) {
                                var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 7);
                                var1_int++;
                                rb.field_b = rb.field_b + 1;
                                break L24;
                              } else {
                                var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 5);
                                break L24;
                              }
                            } else {
                              var2_ref_ja.field_n[var3_int].a(var2_ref_ja, 0);
                              var2_ref_ja.field_n[var3_int].k(2);
                              var3_int++;
                              continue L26;
                            }
                          }
                        } else {
                          var2_ref_ja.a(-el.field_o.field_J, -117);
                          var3_float = -var2_ref_ja.field_o + 320.0f;
                          var4_float = -var2_ref_ja.field_v + 240.0f;
                          var5 = (double)og.field_r / Math.sqrt((double)(var4_float * var4_float + var3_float * var3_float));
                          var3_float = (float)((double)var3_float * var5);
                          var4_float = (float)((double)var4_float * var5);
                          var2_ref_ja.field_F = var4_float;
                          var2_ref_ja.field_w = var3_float;
                          var7_int = 0;
                          L30: while (true) {
                            if (var2_ref_ja.field_L <= var7_int) {
                              var7 = var2_ref_ja;
                              var8 = var2_ref_ja;
                              var2_ref_ja.field_L = 0;
                              var7.field_N = 0;
                              var8.field_m = 0;
                              ji.field_r.a(-36, (hf) (Object) var2_ref_ja);
                              break L24;
                            } else {
                              var2_ref_ja.field_n[var7_int].a(var2_ref_ja, 0);
                              var7_int++;
                              continue L30;
                            }
                          }
                        }
                      }
                      var2_ref_ja.field_K = null;
                      el.field_o.field_F = true;
                      break L22;
                    }
                    var2_ref_ja = (ja) (Object) a.field_d.d(1);
                    continue L14;
                  }
                }
              } else {
                L31: {
                  if (var1_ref.field_K == a.field_d) {
                    var1_ref.j(30383);
                    var1_ref.k(2);
                    var1_ref.a(false);
                    var1_ref.a((byte) 54);
                    a.field_d.a(-80, (hf) (Object) var1_ref);
                    el.field_o.field_F = true;
                    break L31;
                  } else {
                    if (var1_ref.field_B) {
                      fa.field_a = true;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                }
                var1_ref.field_K = null;
                var1_ref = (ja) (Object) ji.field_r.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "kc.C(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
