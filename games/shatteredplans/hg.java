/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ka {
    static boolean field_r;
    static int field_t;
    static char field_p;
    static ds field_u;
    static String field_s;
    static ap field_q;

    hg(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 6);
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10, boolean param11) {
        so.a(0, true, 16777215, param9, param2, param6, param11, param5, param0, param4, param10, param1, param7, param3);
    }

    final int a(int param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.field_x;
              if (((hg) this).field_n == param2) {
                break L1;
              } else {
                if (((hg) this).field_n.field_h[var4_int]) {
                  break L1;
                } else {
                  if ((1 << var4_int & ((hg) this).field_g.field_w) != 0) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var5 = ((hg) this).field_g.field_v[((hg) this).field_g.field_m[-1 + ((hg) this).field_g.field_r]];
                    if (param2 == var5) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      var6 = param1;
                      var7 = 0;
                      var8_ref_ln__ = ((hg) this).field_g.field_g.field_e;
                      var9 = 0;
                      L2: while (true) {
                        if (var8_ref_ln__.length <= var9) {
                          if (var7 * 2 < var6) {
                            stackOut_30_0 = -1;
                            stackIn_31_0 = stackOut_30_0;
                            return stackIn_31_0;
                          } else {
                            L3: {
                              var8 = lc.a(param1 + 12330, (1 << ((hg) this).field_g.field_r) - 1 ^ ((hg) this).field_g.field_w);
                              if (var8 * var6 >= var7) {
                                break L3;
                              } else {
                                if (((hg) this).field_g.field_D[((hg) this).field_n.field_x] > ((hg) this).field_g.field_D[var4_int] * var8) {
                                  stackOut_35_0 = 4;
                                  stackIn_36_0 = stackOut_35_0;
                                  return stackIn_36_0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (var5 != ((hg) this).field_n) {
                                stackOut_39_0 = -2;
                                stackIn_40_0 = stackOut_39_0;
                                break L4;
                              } else {
                                stackOut_38_0 = -3;
                                stackIn_40_0 = stackOut_38_0;
                                break L4;
                              }
                            }
                            break L0;
                          }
                        } else {
                          var10 = var8_ref_ln__[var9];
                          if (var10.field_y == ((hg) this).field_n) {
                            var11 = 0;
                            var12 = var10.field_D;
                            var13 = 0;
                            L5: while (true) {
                              if (var13 >= var12.length) {
                                L6: {
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var9++;
                                continue L2;
                              } else {
                                L7: {
                                  var14 = var12[var13];
                                  if (var14.field_y == param2) {
                                    var11 = 1;
                                    var6 = var6 + var14.field_x;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var13++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("hg.UA(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L8;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
        return stackIn_40_0;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; ((hg) this).field_g.field_r > var2; var2++) {
            ((hg) this).field_b[var2] = ((hg) this).a(0, 0, ((hg) this).field_g.field_v[var2]);
        }
        if (param0 != -18484) {
            hg.a(-92, true, -31, false, 87, 112, -41, 4, true, false, 96, false);
        }
    }

    public static void c(boolean param0) {
        field_u = null;
        field_q = null;
        field_s = null;
    }

    final int[] b(int param0) {
        int var2 = -114 % ((-48 - param0) / 61);
        return new int[]{17, 18};
    }

    final static String a(boolean param0, nf param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param1.field_d == null) {
                break L1;
              } else {
                L2: {
                  var5 = param1.field_d;
                  var2 = (Object) (Object) var5;
                  var2 = (Object) (Object) var5;
                  if (param1.field_c == 1) {
                    var2 = (Object) (Object) ("<img=0>" + var5);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1.field_c != 2) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  break L1;
                }
              }
            }
            L3: {
              var3 = "";
              if (param1.field_n == 2) {
                if (!param1.field_h) {
                  L4: {
                    if (-1 != param1.field_l) {
                      break L4;
                    } else {
                      if (-1 == param1.field_e) {
                        var3 = re.a(fj.field_q, 4371, new String[1]);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = re.a(cf.field_M, 4371, new String[1]);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                L5: {
                  if (param1.field_n != 0) {
                    break L5;
                  } else {
                    if (!je.field_e) {
                      break L5;
                    } else {
                      var3 = "[" + ds.field_a + "] ";
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param1.field_n == 1) {
                    var3 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_n != 4) {
                    break L7;
                  } else {
                    if (wf.field_m != null) {
                      var3 = "[" + wf.field_m + "] ";
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1.field_n == 3) {
                    var3 = "[#" + param1.field_o + "] ";
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (param1.field_h) {
                  break L3;
                } else {
                  var3 = var3 + (String) var2 + ": ";
                  break L3;
                }
              }
            }
            stackOut_32_0 = (String) var3;
            stackIn_33_0 = stackOut_32_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_34_0 = var2;
            stackOut_34_1 = new StringBuilder().append("hg.C(").append(false).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((hg) this).field_g.field_o.field_i) {
            if (((hg) this).field_n.field_m.e(27650)) {
              ((hg) this).a(false, param0 ^ 6898);
              break L0;
            } else {
              break L0;
            }
          } else {
            if (!((hg) this).field_n.field_i.g(param0 ^ 80)) {
              break L0;
            } else {
              ((hg) this).a(false, -6861);
              break L0;
            }
          }
        }
        L1: {
          var2 = ((hg) this).field_g.field_m[((hg) this).field_g.field_r - 1];
          if (param0 == -63) {
            break L1;
          } else {
            field_q = null;
            break L1;
          }
        }
        var3 = ((hg) this).field_g.field_D[var2];
        var4 = 0;
        L2: while (true) {
          if (~var4 <= ~((hg) this).field_g.field_r) {
            L3: {
              if (!((hg) this).c((byte) -116)) {
                break L3;
              } else {
                ((hg) this).g(-18484);
                var4 = 0;
                L4: while (true) {
                  if (((hg) this).field_g.field_r <= var4) {
                    break L3;
                  } else {
                    L5: {
                      if (((hg) this).field_b[var4] < 0) {
                        L6: {
                          var5 = ((hg) this).field_g.field_v[var4];
                          if (((hg) this).field_c[var4] > 0) {
                            break L6;
                          } else {
                            L7: {
                              var9 = ((hg) this).field_b[var4];
                              if (var9 == -1) {
                                var6 = 7;
                                break L7;
                              } else {
                                if (var9 != -2) {
                                  if (var9 != -3) {
                                    var6 = -1;
                                    break L7;
                                  } else {
                                    var7 = ((hg) this).field_g.field_m[-1 + ((hg) this).field_g.field_r];
                                    var6 = 9;
                                    var8 = ((hg) this).field_g.field_m[-2 + ((hg) this).field_g.field_r];
                                    if (~var7 == ~((hg) this).field_n.field_x) {
                                      break L7;
                                    } else {
                                      if (var7 != var4) {
                                        if (~(((hg) this).field_g.field_D[var7] * 2) < ~(((hg) this).field_g.field_D[var8] * 3)) {
                                          var6 = 8;
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                } else {
                                  var6 = 8;
                                  break L7;
                                }
                              }
                            }
                            if (var6 == -1) {
                              break L6;
                            } else {
                              ((hg) this).field_j.a(0, (byte) -118, var5, ((hg) this).field_n, var6);
                              ((hg) this).field_c[var4] = rg.a(6, 3, (byte) 118);
                              break L6;
                            }
                          }
                        }
                        ((hg) this).field_j.a((byte) -63, ((hg) this).field_n, var5);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4++;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            L8: {
              ((hg) this).field_c[var4] = ((hg) this).field_c[var4] - 1;
              if (~var2 != ~var4) {
                if (~(((hg) this).field_g.field_D[var4] * 2) > ~var3) {
                  ((hg) this).field_i[var4] = 0;
                  break L8;
                } else {
                  ((hg) this).field_i[var4] = ((hg) this).field_i[var4] - 1;
                  break L8;
                }
              } else {
                ((hg) this).field_i[var4] = 3;
                break L8;
              }
            }
            var4++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = '/';
        field_u = new ds(3);
        field_s = "<%0> points per turn";
    }
}
