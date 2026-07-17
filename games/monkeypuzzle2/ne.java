/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static ai[] field_a;
    static fg field_c;
    static int field_b;

    final static am a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        am var7 = null;
        int var8 = 0;
        am stackIn_4_0 = null;
        am stackIn_8_0 = null;
        am stackIn_11_0 = null;
        am stackIn_17_0 = null;
        am stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_3_0 = null;
        am stackOut_7_0 = null;
        am stackOut_19_0 = null;
        am stackOut_16_0 = null;
        am stackOut_10_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = si.field_s;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = wk.field_f;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = ma.a(126, '.', param0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_19_0 = bi.a(var3[-1 + var3.length], 5000);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = dh.a(var6, (byte) 55);
                      if (var7 != null) {
                        stackOut_16_0 = (am) var7;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = si.field_s;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ne.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -98 + 41);
        }
        return stackIn_20_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gg var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        gg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        gg stackOut_43_0 = null;
        gg stackOut_42_0 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = fb.field_k;
              var2 = 0;
              if (ud.field_b != 2) {
                break L1;
              } else {
                var3_long = -fb.field_n + pf.a(0);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -107) {
                break L2;
              } else {
                int discarded$1 = ne.a(-67);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (pl.field_k.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = gh.field_a[var3];
                  if (0 > var4) {
                    var5 = lc.field_e;
                    break L4;
                  } else {
                    if (sj.field_f.field_a != var4) {
                      var5 = qj.field_D;
                      break L4;
                    } else {
                      var5 = ki.field_s;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = pl.field_k[var3];
                  if (ud.field_b != 2) {
                    break L5;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (uj.field_c.length <= wi.field_b.length) {
                          stackOut_18_0 = wi.field_b.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = uj.field_c.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (re.field_a.length <= ud.field_e.length) {
                          stackOut_21_0 = ud.field_e.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L7;
                        } else {
                          stackOut_20_0 = re.field_a.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_22_0;
                        if (var3 < 6) {
                          break L8;
                        } else {
                          if (6 - -var7 <= var3) {
                            break L8;
                          } else {
                            L9: {
                              if (wi.field_b.length + -6 + (var3 + -var7) < 0) {
                                stackOut_26_0 = "";
                                stackIn_27_0 = stackOut_26_0;
                                break L9;
                              } else {
                                stackOut_25_0 = wi.field_b[-var7 + (-6 + var3 - -wi.field_b.length)];
                                stackIn_27_0 = stackOut_25_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L8;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (7 + (var7 - -var8) <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (ud.field_e.length > -var7 + -7 + var3) {
                              stackOut_32_0 = ud.field_e[-var7 + (var3 - 7)];
                              stackIn_33_0 = stackOut_32_0;
                              break L10;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackOut_37_0 = 47;
                  stackOut_37_1 = (String) var6;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  if (0 > var4) {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    break L12;
                  } else {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    break L12;
                  }
                }
                L13: {
                  var7 = hh.a((byte) stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var8 = -(var7 >> 1) + jc.field_b;
                  if (var4 < 0) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == sj.field_f.field_a) {
                        stackOut_43_0 = mg.field_u;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_42_0 = de.field_j;
                        stackIn_44_0 = stackOut_42_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + ud.field_a;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(var7 - -(pl.field_h << 1), var8 + -pl.field_h, false, var1_int, hb.field_n - -(vf.field_b << 1));
                        break L15;
                      }
                    }
                    var1_int = var1_int + vf.field_b;
                    break L13;
                  }
                }
                L16: {
                  if (var4 >= 0) {
                    sl.field_o.b(var6, var8, da.field_a + var1_int, var5, -1);
                    var1_int = var1_int + (hb.field_n + vf.field_b + ud.field_a);
                    break L16;
                  } else {
                    fe.field_a.b(var6, var8, nf.field_M + var1_int, var5, -1);
                    var1_int = var1_int + gi.field_a;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ne.C(" + param0 + 41);
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -17) {
            field_b = -18;
        }
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != -1) {
            ne.b((byte) 95);
        }
        return ib.field_a;
    }

    final static void a(boolean param0) {
        if (null != wg.field_j) {
            wg.field_j.a(true);
        }
        if (null != vl.field_f) {
            vl.field_f.c(true);
        }
        vb.g(81);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
