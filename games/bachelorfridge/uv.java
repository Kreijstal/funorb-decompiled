/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends k {
    static String field_k;

    final int[] a(int param0, int param1) {
        if (param1 != 0) {
            return (int[]) null;
        }
        return jq.field_k;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = param0 + param3;
              var6 = param1 - -param2;
              if (param3 > dg.field_f) {
                stackIn_4_0 = param3;
                break L1;
              } else {
                stackIn_4_0 = dg.field_f;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param1 <= dg.field_j) {
                stackIn_7_0 = dg.field_j;
                break L2;
              } else {
                stackIn_7_0 = param1;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= dg.field_h) {
                stackIn_10_0 = dg.field_h;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (dg.field_k <= var6) {
                stackIn_13_0 = dg.field_k;
                break L4;
              } else {
                stackIn_13_0 = var6;
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
                  var12 = -var8 + var10 + 1 >> 956563329;
                  L6: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
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
                  var12 = 1 + (var9 + -var7) >> 482286305;
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
                break L9;
              } else {
                if (var5_int >= dg.field_h) {
                  break L9;
                } else {
                  var11 = dg.field_i * ((var5_int + -param3 & 1) + var8) - -var5_int;
                  var12 = -var8 + 1 - -var10 >> -552818719;
                  L10: while (true) {
                    var12--;
                    if (0 > var12) {
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
              if (!param4) {
                break L11;
              } else {
                field_k = (String) null;
                break L11;
              }
            }
            L12: {
              if (dg.field_j > param1) {
                break L12;
              } else {
                if (var6 < dg.field_k) {
                  var11 = var6 * dg.field_i + var7 - -(-param1 + var6 & 1);
                  var12 = 1 + var9 - var7 >> -1104331263;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      dg.field_e[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5), "uv.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public uv() {
        super(0, true);
    }

    final static boolean a(byte param0, int[] param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bs var4_ref_bs = null;
        int var4 = 0;
        int var5_int = 0;
        bs var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (uca.field_a != eia.field_a) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_long = f.b((byte) 73);
              if (param0 >= 113) {
                L1: {
                  if (lca.field_s == 0) {
                    break L1;
                  } else {
                    if (0 > hd.field_m) {
                      var4_ref_bs = (bs) ((Object) mba.field_c.b((byte) 90));
                      if (var4_ref_bs == null) {
                        break L1;
                      } else {
                        if (var2_long > var4_ref_bs.field_f) {
                          var4_ref_bs.a(false);
                          dw.field_f = var4_ref_bs.field_h.length;
                          ig.field_m.field_g = 0;
                          var5_int = 0;
                          L2: while (true) {
                            if (var5_int >= dw.field_f) {
                              f.field_b = ef.field_l;
                              ef.field_l = bd.field_j;
                              bd.field_j = ri.field_a;
                              ri.field_a = var4_ref_bs.field_i;
                              stackIn_18_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              ig.field_m.field_h[var5_int] = var4_ref_bs.field_h[var5_int];
                              var5_int++;
                              continue L2;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (-1 >= (hd.field_m ^ -1)) {
                      break L4;
                    } else {
                      ig.field_m.field_g = 0;
                      if (ii.b(1, 0)) {
                        hd.field_m = ig.field_m.k(694);
                        ig.field_m.field_g = 0;
                        dw.field_f = param1[hd.field_m];
                        break L4;
                      } else {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  if (!u.d((byte) -67)) {
                    stackIn_27_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (0 != lca.field_s) {
                      L5: {
                        var4 = lca.field_s;
                        if (0.0 != nla.field_d) {
                          var4 = (int)((double)var4 + ia.field_k.nextGaussian() * nla.field_d);
                          if ((var4 ^ -1) > -1) {
                            var4 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var5 = new bs(var2_long - -(long)var4, hd.field_m, new byte[dw.field_f]);
                      var6 = 0;
                      L6: while (true) {
                        if (var6 >= dw.field_f) {
                          mba.field_c.a(var5, true);
                          hd.field_m = -1;
                          continue L3;
                        } else {
                          var5.field_h[var6] = ig.field_m.field_h[var6];
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      f.field_b = ef.field_l;
                      ef.field_l = bd.field_j;
                      bd.field_j = ri.field_a;
                      ri.field_a = hd.field_m;
                      hd.field_m = -1;
                      stackIn_30_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("uv.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L7;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  return stackIn_30_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        try {
            sna.field_s = param2;
            eea.field_b = true;
            if (param0) {
                field_k = (String) null;
            }
            oq.field_b = new mf(gja.field_m, qia.field_a, param1, gfa.field_i, sna.field_s);
            gja.field_m.a((wj) (oq.field_b), (byte) 73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uv.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 != -12) {
            field_k = (String) null;
        }
        field_k = null;
    }

    static {
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
