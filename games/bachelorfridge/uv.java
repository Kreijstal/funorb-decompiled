/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends k {
    static String field_k;

    final int[] a(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return jq.field_k;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = param0 + param3;
              var6 = param1 - -param2;
              if (param3 > dg.field_f) {
                stackOut_3_0 = param3;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = dg.field_f;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param1 <= dg.field_j) {
                stackOut_6_0 = dg.field_j;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= dg.field_h) {
                stackOut_9_0 = dg.field_h;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (dg.field_k <= var6) {
                stackOut_12_0 = dg.field_k;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (dg.field_f > param3) {
                break L5;
              } else {
                if (param3 >= dg.field_h) {
                  break L5;
                } else {
                  var11 = dg.field_i * var8 + param3;
                  var12 = -var8 + var10 + 1 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      dg.field_e[var11] = 16777215;
                      var11 = var11 + dg.field_i * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (param1 < dg.field_j) {
                break L7;
              } else {
                if (dg.field_k <= var6) {
                  break L7;
                } else {
                  var11 = dg.field_i * param1 - -var7;
                  var12 = 1 + (var9 + -var7) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      dg.field_e[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (var5_int < dg.field_f) {
                field_k = null;
                break L9;
              } else {
                if (var5_int >= dg.field_h) {
                  field_k = null;
                  break L9;
                } else {
                  var11 = dg.field_i * ((var5_int + -param3 & 1) + var8) - -var5_int;
                  var12 = -var8 + 1 - -var10 >> 1;
                  L10: while (true) {
                    var12--;
                    if (0 > var12) {
                      field_k = null;
                      break L9;
                    } else {
                      dg.field_e[var11] = 16777215;
                      var11 = var11 + dg.field_i * 2;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (dg.field_j > param1) {
                break L11;
              } else {
                if (var6 < dg.field_k) {
                  var11 = var6 * dg.field_i + var7 - -(-param1 + var6 & 1);
                  var12 = 1 + var9 - var7 >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      dg.field_e[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var5, "uv.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + false + ')');
        }
    }

    public uv() {
        super(0, true);
    }

    final static boolean a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        bs var4_ref_bs = null;
        int var4 = 0;
        int var5_int = 0;
        bs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (uca.field_a != eia.field_a) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            var2_long = f.b((byte) 73);
            L0: {
              if (lca.field_s == 0) {
                break L0;
              } else {
                if (0 > hd.field_m) {
                  var4_ref_bs = (bs) (Object) mba.field_c.b((byte) 90);
                  if (var4_ref_bs == null) {
                    break L0;
                  } else {
                    if (var2_long > var4_ref_bs.field_f) {
                      var4_ref_bs.a(false);
                      dw.field_f = var4_ref_bs.field_h.length;
                      ig.field_m.field_g = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (var5_int >= dw.field_f) {
                          f.field_b = ef.field_l;
                          ef.field_l = bd.field_j;
                          bd.field_j = ri.field_a;
                          ri.field_a = var4_ref_bs.field_i;
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        } else {
                          ig.field_m.field_h[var5_int] = var4_ref_bs.field_h[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (hd.field_m >= 0) {
                  break L3;
                } else {
                  ig.field_m.field_g = 0;
                  if (ii.b(1, 0)) {
                    hd.field_m = ig.field_m.k(694);
                    ig.field_m.field_g = 0;
                    dw.field_f = param1[hd.field_m];
                    break L3;
                  } else {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  }
                }
              }
              if (!u.d((byte) -67)) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                return stackIn_26_0 != 0;
              } else {
                if (0 != lca.field_s) {
                  L4: {
                    var4 = lca.field_s;
                    if (0.0 != nla.field_d) {
                      var4 = (int)((double)var4 + ia.field_k.nextGaussian() * nla.field_d);
                      if (var4 < 0) {
                        var4 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = new bs(var2_long - -(long)var4, hd.field_m, new byte[dw.field_f]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= dw.field_f) {
                      mba.field_c.a((bw) (Object) var5, true);
                      hd.field_m = -1;
                      continue L2;
                    } else {
                      var5.field_h[var6] = ig.field_m.field_h[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  f.field_b = ef.field_l;
                  ef.field_l = bd.field_j;
                  bd.field_j = ri.field_a;
                  ri.field_a = hd.field_m;
                  hd.field_m = -1;
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("uv.F(").append(122).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L6;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        try {
            sna.field_s = param2;
            eea.field_b = true;
            oq.field_b = new mf(gja.field_m, qia.field_a, param1, gfa.field_i, sna.field_s);
            gja.field_m.a((wj) (Object) oq.field_b, (byte) 73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uv.C(" + false + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
