/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        int var1 = 7 % ((79 - param0) / 43);
        field_b = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener(je.field_j);
        if (param1 != 0) {
            return;
        }
        try {
            param0.removeFocusListener(je.field_j);
            ii.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.field_C;
        try {
          sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
          if (param1 != -98) {
            return;
          }
          var2_int = 0;
          while (true) {
            L1: {
              if (md.field_c > var2_int) {
                qi.field_i[param0 + var2_int] = var2_int;
                var2_int++;
                if (var3 != 0) {
                  break L1;
                }
                if (var3 == 0) {
                  continue;
                }
              }
              sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c + param0, false);
            }
            if (param0 < md.field_c) {
              md.field_c = param0;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "kc.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        tf stackIn_12_0 = null;
        boolean stackIn_15_0 = false;
        ja stackIn_20_0 = null;
        boolean stackIn_22_0 = false;
        int stackIn_44_0 = 0;
        ja stackIn_51_0 = null;
        ja stackIn_51_1 = null;
        int stackIn_56_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_90_3;
        gh stackIn_110_0 = null;
        boolean stackIn_112_1 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_14_0;
        boolean stackOut_21_0;
        ja var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        ja var2_ref_ja = null;
        int var2 = 0;
        float var3_float = 0.0f;
        int var3_int = 0;
        ja var3 = null;
        int var4_int = 0;
        float var4_float = 0.0f;
        ja var4 = null;
        ja var5_ref_ja = null;
        double var5 = 0.0;
        int var6_int = 0;
        ja var6 = null;
        ja var7 = null;
        int var7_int = 0;
        ja var8 = null;
        int var9 = 0;
        ja var10 = null;
        wd var11 = null;
        ja var12 = null;
        wd var13 = null;
        var9 = Geoblox.field_C;
        try {
          fa.field_a = false;
          var1 = (ja) ((Object) ji.field_r.g(0));
          while (true) {
            L1: {
              L2: {
                L3: {
                  if (var1 != null) {
                    stackIn_12_0 = var1.field_K;
                    if (var9 != 0) {
                      break L3;
                    }
                    L5: {
                      if (stackIn_12_0 != a.field_d) {
                        if (!var1.field_B) {
                          break L5;
                        }
                        fa.field_a = true;
                        if (var9 == 0) {
                          break L5;
                        }
                      }
                      var1.j(30383);
                      var1.k(2);
                      var1.a(false);
                      var1.a((byte) 54);
                      a.field_d.a(-80, var1);
                      el.field_o.field_F = true;
                    }
                    var1.field_K = null;
                    var1 = (ja) ((Object) ji.field_r.d(1));
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  if (!re.field_j) {
                    break L2;
                  }
                  stackIn_12_0 = a.field_d;
                }
                var1 = (ja) ((Object) ((tf) (Object) stackIn_12_0).g(0));
                while (true) {
                  L8: {
                    if (var1 != null) {
                      stackOut_14_0 = pk.field_o[var1.field_H];
                      stackIn_56_0 = stackOut_14_0 ? 1 : 0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var9 != 0) {
                        break L8;
                      }
                      L10: {
                        if ((stackIn_15_0) &&
                            (var9 == 0)) {
                          break L10;
                        }
                        var11 = new wd();
                        var13 = new wd();
                        var11.a(var1, false);
                        var4_int = 1;
                        L12: while (true) {
                          stackIn_20_0 = (ja) ((Object) var11.a(true));
                          L13: while (true) {
                            L14: {
                              L15: {
                                var10 = stackIn_20_0;
                                var12 = var10;
                                var5_ref_ja = var12;
                                if (var12 != null) {
                                  pk.field_o[var10.field_H] = true;
                                  stackOut_21_0 = var12.field_t;
                                  stackIn_44_0 = stackOut_21_0 ? 1 : 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var9 != 0) {
                                    break L14;
                                  }
                                  if (stackIn_22_0) {
                                    var4_int = 0;
                                    if (var9 == 0) {
                                      break L15;
                                    }
                                  }
                                  var13.a(var12, false);
                                  var6_int = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var6_int < var12.field_L) {
                                        var7 = var10.field_n[var6_int];
                                        stackIn_20_0 = (ja) ((Object) var13.c((byte) 121));
                                        if (var9 != 0) {
                                          continue L13;
                                        }
                                        var8 = stackIn_20_0;
                                        while (true) {
                                          L20: {
                                            L21: {
                                              if (var8 != null) {
                                                stackIn_51_0 = (ja) (var8);
                                                stackIn_51_1 = (ja) (var7);
                                                if (var9 != 0) {
                                                  break L21;
                                                }
                                                if ((stackIn_51_0 == stackIn_51_1) &&
                                                    (var9 == 0)) {
                                                  break L20;
                                                }
                                                var8 = (ja) ((Object) var13.a(-45));
                                                if (var9 == 0) {
                                                  continue;
                                                }
                                              }
                                              var8 = (ja) ((Object) var11.c((byte) 121));
                                              while (var8 != null) {
                                                stackIn_51_0 = (ja) (var8);
                                                stackIn_51_1 = (ja) (var7);
                                                if (var9 != 0) {
                                                  break L21;
                                                }
                                                if (stackIn_51_0 == stackIn_51_1) {
                                                  break L20;
                                                }
                                                var8 = (ja) ((Object) var11.a(54));
                                                if (var9 == 0) {
                                                  continue;
                                                }
                                                break;
                                              }
                                              var11.a(var7, false);
                                              break L20;
                                            }
                                            while (true) {
                                              L27: {
                                                ((ja) (Object) stackIn_51_0).a(stackIn_51_1, 0);
                                                var6_int++;
                                                if (var9 != 0) {
                                                  while (true) {
                                                    if (var5_ref_ja == null) {
                                                      break L10;
                                                    }
                                                    var5_ref_ja.field_K = ji.field_r;
                                                    var5_ref_ja.field_t = false;
                                                    var5_ref_ja.field_B = true;
                                                    fa.field_a = true;
                                                    stackIn_56_0 = 0;
                                                    if (var9 != 0) {
                                                      break L8;
                                                    }
                                                    var6_int = stackIn_56_0;
                                                    if (var6_int < var5_ref_ja.field_L) {
                                                      break L27;
                                                    }
                                                    var6 = var5_ref_ja;
                                                    var7 = var5_ref_ja;
                                                    var5_ref_ja.field_L = 0;
                                                    var6.field_N = 0;
                                                    var7.field_m = 0;
                                                    var5_ref_ja = (ja) ((Object) var13.a(true));
                                                    if (var9 == 0) {
                                                      continue;
                                                    }
                                                    break L10;
                                                  }
                                                }
                                                if (var9 == 0) {
                                                  while (var6_int >= var5_ref_ja.field_L) {
                                                    var6 = var5_ref_ja;
                                                    var7 = var5_ref_ja;
                                                    var5_ref_ja.field_L = 0;
                                                    var6.field_N = 0;
                                                    var7.field_m = 0;
                                                    var5_ref_ja = (ja) ((Object) var13.a(true));
                                                    if (var9 != 0) {
                                                      break L10;
                                                    }
                                                    if (var5_ref_ja == null) {
                                                      break L10;
                                                    }
                                                    var5_ref_ja.field_K = ji.field_r;
                                                    var5_ref_ja.field_t = false;
                                                    var5_ref_ja.field_B = true;
                                                    fa.field_a = true;
                                                    stackIn_56_0 = 0;
                                                    if (var9 != 0) {
                                                      break L8;
                                                    }
                                                    var6_int = stackIn_56_0;
                                                  }
                                                  break L27;
                                                }
                                                while (true) {
                                                  var6 = var5_ref_ja;
                                                  var7 = var5_ref_ja;
                                                  var5_ref_ja.field_L = 0;
                                                  var6.field_N = 0;
                                                  var7.field_m = 0;
                                                  var5_ref_ja = (ja) ((Object) var13.a(true));
                                                  if (var9 != 0) {
                                                    break L10;
                                                  }
                                                  if (var5_ref_ja == null) {
                                                    break L10;
                                                  }
                                                  var5_ref_ja.field_K = ji.field_r;
                                                  var5_ref_ja.field_t = false;
                                                  var5_ref_ja.field_B = true;
                                                  fa.field_a = true;
                                                  stackIn_56_0 = 0;
                                                  if (var9 != 0) {
                                                    break L8;
                                                  }
                                                  var6_int = stackIn_56_0;
                                                  if (var6_int >= var5_ref_ja.field_L) {
                                                    continue;
                                                  }
                                                  break L27;
                                                }
                                              }
                                              stackIn_51_0 = var5_ref_ja.field_n[var6_int];
                                              stackIn_51_1 = (ja) (var5_ref_ja);
                                              continue;
                                            }
                                          }
                                          var6_int++;
                                          if (var9 == 0) {
                                            continue L17;
                                          }
                                          break L18;
                                        }
                                      }
                                    }
                                    if (var9 == 0) {
                                      continue L12;
                                    }
                                    break L15;
                                  }
                                }
                              }
                              stackIn_44_0 = var4_int;
                            }
                            if (stackIn_44_0 == 0) {
                              break L10;
                            }
                            var5_ref_ja = (ja) ((Object) var13.a(true));
                            L31: while (true) {
                              if (var5_ref_ja == null) {
                                break L10;
                              }
                              var5_ref_ja.field_K = ji.field_r;
                              var5_ref_ja.field_t = false;
                              var5_ref_ja.field_B = true;
                              fa.field_a = true;
                              stackIn_56_0 = 0;
                              if (var9 != 0) {
                                break L8;
                              }
                              var6_int = stackIn_56_0;
                              while (var6_int < var5_ref_ja.field_L) {
                                stackIn_51_0 = var5_ref_ja.field_n[var6_int];
                                stackIn_51_1 = (ja) (var5_ref_ja);
                                ((ja) (Object) stackIn_51_0).a(stackIn_51_1, 0);
                                var6_int++;
                                if (var9 != 0) {
                                  continue L31;
                                }
                                if (var9 == 0) {
                                  continue;
                                }
                                break;
                              }
                              var6 = var5_ref_ja;
                              var7 = var5_ref_ja;
                              var5_ref_ja.field_L = 0;
                              var6.field_N = 0;
                              var7.field_m = 0;
                              var5_ref_ja = (ja) ((Object) var13.a(true));
                              if (var9 == 0) {
                                continue;
                              }
                              break L10;
                            }
                          }
                        }
                      }
                      var1 = (ja) ((Object) a.field_d.d(1));
                      if (var9 == 0) {
                        continue;
                      }
                    }
                    re.field_j = false;
                    el.field_o.field_B = true;
                    stackIn_56_0 = 0;
                  }
                  var1_int = stackIn_56_0;
                  while (true) {
                    if (1000 <= var1_int) {
                      break L2;
                    }
                    pk.field_o[var1_int] = false;
                    var1_int++;
                    if (var9 != 0) {
                      break L1;
                    }
                    if (var9 == 0) {
                      continue;
                    }
                    break L2;
                  }
                }
              }
              var1_int = 0;
            }
            var2_ref_ja = (ja) ((Object) a.field_d.g(0));
            while (var2_ref_ja != null) {
              if ((!(null == var2_ref_ja.field_K) ||
                  (!(!w.field_f) &&
                    !(!var2_ref_ja.field_t)))) {
                L39: {
                  L40: {
                    re.field_j = true;
                    var2_ref_ja.a(false);
                    var2_ref_ja.a((byte) 100);
                    el.field_o.field_F = true;
                    var2_ref_ja.f(92);
                    if (ji.field_r == var2_ref_ja.field_K) {
                      var2_ref_ja.a(-el.field_o.field_J, -117);
                      var3_float = -var2_ref_ja.field_o + 320.0f;
                      var4_float = -var2_ref_ja.field_v + 240.0f;
                      var5 = (double)og.field_r / Math.sqrt((double)(var4_float * var4_float + var3_float * var3_float));
                      var3_float = (float)((double)var3_float * var5);
                      var4_float = (float)((double)var4_float * var5);
                      var2_ref_ja.field_F = var4_float;
                      var2_ref_ja.field_w = var3_float;
                      var7_int = 0;
                      while (var2_ref_ja.field_L > var7_int) {
                        var2_ref_ja.field_n[var7_int].a(var2_ref_ja, 0);
                        var7_int++;
                        if (var9 != 0) {
                          break L39;
                        }
                        if (var9 == 0) {
                          continue;
                        }
                        break;
                      }
                      var7 = var2_ref_ja;
                      var8 = var2_ref_ja;
                      var2_ref_ja.field_L = 0;
                      var7.field_N = 0;
                      var8.field_m = 0;
                      ji.field_r.a(-36, var2_ref_ja);
                      if (var9 == 0) {
                        break L40;
                      }
                    }
                    if ((var2_ref_ja.field_K != bh.field_c) &&
                        (!w.field_f)) {
                      break L40;
                    }
                    var3_int = 0;
                    while (var3_int < var2_ref_ja.field_L) {
                      var2_ref_ja.field_n[var3_int].a(var2_ref_ja, 0);
                      var2_ref_ja.field_n[var3_int].k(2);
                      var3_int++;
                      if (var9 != 0) {
                        break L39;
                      }
                      if (var9 == 0) {
                        continue;
                      }
                      break;
                    }
                    var3 = var2_ref_ja;
                    var2_ref_ja.field_L = 0;
                    var4 = var2_ref_ja;
                    var3.field_N = 0;
                    var4.field_m = 0;
                    var2_ref_ja.field_r = 50;
                    bh.field_c.a(-100, var2_ref_ja);
                    var2_ref_ja.field_G = 0;
                    if ((var2_ref_ja.field_t) &&
                        (w.field_f)) {
                      stackIn_88_0 = (int)var2_ref_ja.field_v;
                      stackIn_88_1 = (int)var2_ref_ja.field_o;
                      stackIn_88_2 = 117;
                      if ((var2_ref_ja.field_z != 4) &&
                          (var2_ref_ja.field_z != 3)) {
                        stackIn_90_3 = 10;
                      } else {
                        stackIn_90_3 = 100;
                      }
                      ld.a(stackIn_88_0, stackIn_88_1, stackIn_88_2, stackIn_90_3);
                    }
                    if (4 != var2_ref_ja.field_z) {
                      var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 5);
                      if (var9 == 0) {
                        break L40;
                      }
                    }
                    var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 7);
                    var1_int++;
                    rb.field_b = rb.field_b + 1;
                  }
                  var2_ref_ja.field_K = null;
                }
                el.field_o.field_F = true;
              }
              var2_ref_ja = (ja) ((Object) a.field_d.d(1));
              if (var9 == 0) {
                continue;
              }
              break;
            }
            var2 = -23 / ((param0 - 69) / 46);
            var3 = (ja) ((Object) bh.field_c.g(0));
            while (true) {
              L52: {
                if (var3 != null) {
                  if (var9 != 0) {
                    break L52;
                  }
                  if (ra.field_a == var3.field_K) {
                    var3.a(false);
                    var3.a((byte) 51);
                    ra.field_a.a(-44, var3);
                    var3.field_K = null;
                  }
                  var3 = (ja) ((Object) bh.field_c.d(1));
                  if (var9 == 0) {
                    continue;
                  }
                }
                if (w.field_f) {
                  jc.a(3, false);
                  jl.field_t = false;
                }
              }
              stackIn_110_0 = el.field_o;
              stackIn_112_1 = (el.field_o.field_F) || (ab.field_f) || (w.field_f);
              stackIn_110_0.field_F = stackIn_112_1;
              w.field_f = false;
              if (var1_int >= 3) {
                ra.a(255 ^ fe.field_f, -88, fe.field_f);
              }
              if (rb.field_b >= 5) {
                ra.a(255 ^ vd.field_p, -83, vd.field_p);
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "kc.C(" + param0 + ')');
        }
    }

    static {
        field_c = 0;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
