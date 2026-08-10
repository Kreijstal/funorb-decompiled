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
        am stackIn_19_0 = null;
        am stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = si.field_s;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 < var2_int) {
                stackIn_8_0 = wk.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = ma.a(126, '.', param0);
                if ((var3.length ^ -1) <= -3) {
                  L1: {
                    if (param1 < -61) {
                      break L1;
                    } else {
                      field_b = -50;
                      break L1;
                    }
                  }
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_22_0 = bi.a(var3[-1 + var3.length], 5000);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = dh.a(var6, (byte) 55);
                      if (var7 != null) {
                        stackIn_19_0 = (am) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackIn_11_0 = si.field_s;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ne.E(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        gg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = fb.field_k;
              var2 = 0;
              if ((ud.field_b ^ -1) != -3) {
                break L1;
              } else {
                var3_long = -fb.field_n + pf.a(0);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (-1 < (var2 ^ -1)) {
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
                ne.a(-67);
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
                  if (-3 != (ud.field_b ^ -1)) {
                    break L5;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L5;
                    } else {
                      L6: {
                        if (uj.field_c.length <= wi.field_b.length) {
                          stackIn_19_0 = wi.field_b.length;
                          break L6;
                        } else {
                          stackIn_19_0 = uj.field_c.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (re.field_a.length <= ud.field_e.length) {
                          stackIn_22_0 = ud.field_e.length;
                          break L7;
                        } else {
                          stackIn_22_0 = re.field_a.length;
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
                              if ((wi.field_b.length + -6 + (var3 + -var7) ^ -1) > -1) {
                                stackIn_27_0 = "";
                                break L9;
                              } else {
                                stackIn_27_0 = wi.field_b[-var7 + (-6 + var3 - -wi.field_b.length)];
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
                              stackIn_33_0 = ud.field_e[-var7 + (var3 - 7)];
                              break L10;
                            } else {
                              stackIn_33_0 = "";
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
                  stackIn_39_0 = 47;

                  stackIn_39_1 = (String) (var6);

                  if (0 > var4) {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 0;
                    break L12;
                  } else {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = hh.a((byte) stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var8 = -(var7 >> -677257887) + jc.field_b;
                  if (var4 < 0) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == sj.field_f.field_a) {
                        stackIn_44_0 = mg.field_u;
                        break L14;
                      } else {
                        stackIn_44_0 = de.field_j;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + ud.field_a;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(var7 - -(pl.field_h << -966354943), var8 + -pl.field_h, false, var1_int, hb.field_n - -(vf.field_b << -718633823));
                        break L15;
                      }
                    }
                    var1_int = var1_int + vf.field_b;
                    break L13;
                  }
                }
                L16: {
                  if (-1 >= (var4 ^ -1)) {
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
          throw la.a((Throwable) ((Object) var1), "ne.C(" + param0 + ')');
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
        if (!param0) {
            ne.a((byte) -120);
        }
        if (null != vl.field_f) {
            vl.field_f.c(true);
        }
        vb.g(81);
    }

    static {
        field_b = 0;
    }
}
