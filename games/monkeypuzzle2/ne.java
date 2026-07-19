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
        am stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        am stackOut_3_0 = null;
        am stackOut_7_0 = null;
        am stackOut_16_0 = null;
        am stackOut_19_0 = null;
        am stackOut_22_0 = null;
        am stackOut_10_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = si.field_s;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = wk.field_f;
                stackIn_8_0 = stackOut_7_0;
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
                    L3: {
                      L4: {
                        if (var5 >= var4.length) {
                          break L4;
                        } else {
                          var6 = var4[var5];
                          var7 = dh.a(var6, (byte) 55);
                          stackOut_16_0 = (am) (var7);
                          stackIn_23_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            if (stackIn_17_0 != null) {
                              stackOut_19_0 = (am) (var7);
                              stackIn_20_0 = stackOut_19_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var5++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_22_0 = bi.a(var3[-1 + var3.length], 5000);
                      stackIn_23_0 = stackOut_22_0;
                      break L3;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_10_0 = si.field_s;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("ne.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
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
                return stackIn_23_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        int discarded$1 = 0;
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
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_35_0 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_42_0 = 0;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        gg stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        String stackOut_34_0 = null;
        String stackOut_33_0 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_41_0 = 0;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        gg stackOut_45_0 = null;
        gg stackOut_44_0 = null;
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
                discarded$1 = ne.a(-67);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (pl.field_k.length <= var3) {
                break L0;
              } else {
                var4 = gh.field_a[var3];
                if (var10 == 0) {
                  L4: {
                    L5: {
                      if (0 > var4) {
                        break L5;
                      } else {
                        L6: {
                          if (sj.field_f.field_a != var4) {
                            break L6;
                          } else {
                            var5 = ki.field_s;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5 = qj.field_D;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = lc.field_e;
                    break L4;
                  }
                  L7: {
                    var6 = pl.field_k[var3];
                    if (-3 != (ud.field_b ^ -1)) {
                      break L7;
                    } else {
                      if ((var2 ^ -1) != -2) {
                        break L7;
                      } else {
                        L8: {
                          if (uj.field_c.length <= wi.field_b.length) {
                            stackOut_20_0 = wi.field_b.length;
                            stackIn_21_0 = stackOut_20_0;
                            break L8;
                          } else {
                            stackOut_19_0 = uj.field_c.length;
                            stackIn_21_0 = stackOut_19_0;
                            break L8;
                          }
                        }
                        L9: {
                          var7 = stackIn_21_0;
                          if (re.field_a.length <= ud.field_e.length) {
                            stackOut_23_0 = ud.field_e.length;
                            stackIn_24_0 = stackOut_23_0;
                            break L9;
                          } else {
                            stackOut_22_0 = re.field_a.length;
                            stackIn_24_0 = stackOut_22_0;
                            break L9;
                          }
                        }
                        L10: {
                          var8 = stackIn_24_0;
                          if (var3 < 6) {
                            break L10;
                          } else {
                            if (6 - -var7 <= var3) {
                              break L10;
                            } else {
                              L11: {
                                if ((wi.field_b.length + -6 + (var3 + -var7) ^ -1) > -1) {
                                  stackOut_28_0 = "";
                                  stackIn_29_0 = stackOut_28_0;
                                  break L11;
                                } else {
                                  stackOut_27_0 = wi.field_b[-var7 + (-6 + var3 - -wi.field_b.length)];
                                  stackIn_29_0 = stackOut_27_0;
                                  break L11;
                                }
                              }
                              var6 = stackIn_29_0;
                              break L10;
                            }
                          }
                        }
                        if (var7 + 7 > var3) {
                          break L7;
                        } else {
                          if (7 + (var7 - -var8) <= var3) {
                            break L7;
                          } else {
                            L12: {
                              if (ud.field_e.length > -var7 + -7 + var3) {
                                stackOut_34_0 = ud.field_e[-var7 + (var3 - 7)];
                                stackIn_35_0 = stackOut_34_0;
                                break L12;
                              } else {
                                stackOut_33_0 = "";
                                stackIn_35_0 = stackOut_33_0;
                                break L12;
                              }
                            }
                            var6 = stackIn_35_0;
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (-2 == var4) {
                      var6 = Integer.toString(var2);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    stackOut_39_0 = 47;
                    stackOut_39_1 = (String) (var6);
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (0 > var4) {
                      stackOut_41_0 = stackIn_41_0;
                      stackOut_41_1 = (String) ((Object) stackIn_41_1);
                      stackOut_41_2 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L14;
                    } else {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = (String) ((Object) stackIn_40_1);
                      stackOut_40_2 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      break L14;
                    }
                  }
                  L15: {
                    var7 = hh.a((byte) stackIn_42_0, stackIn_42_1, stackIn_42_2 != 0);
                    var8 = -(var7 >> -677257887) + jc.field_b;
                    if (var4 < 0) {
                      break L15;
                    } else {
                      L16: {
                        if (var4 == sj.field_f.field_a) {
                          stackOut_45_0 = mg.field_u;
                          stackIn_46_0 = stackOut_45_0;
                          break L16;
                        } else {
                          stackOut_44_0 = de.field_j;
                          stackIn_46_0 = stackOut_44_0;
                          break L16;
                        }
                      }
                      L17: {
                        var9 = stackIn_46_0;
                        var1_int = var1_int + ud.field_a;
                        if (var9 == null) {
                          break L17;
                        } else {
                          var9.a(var7 - -(pl.field_h << -966354943), var8 + -pl.field_h, false, var1_int, hb.field_n - -(vf.field_b << -718633823));
                          break L17;
                        }
                      }
                      var1_int = var1_int + vf.field_b;
                      break L15;
                    }
                  }
                  L18: {
                    L19: {
                      if (-1 >= (var4 ^ -1)) {
                        break L19;
                      } else {
                        fe.field_a.b(var6, var8, nf.field_M + var1_int, var5, -1);
                        var1_int = var1_int + gi.field_a;
                        if (var10 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    sl.field_o.b(var6, var8, da.field_a + var1_int, var5, -1);
                    var1_int = var1_int + (hb.field_n + vf.field_b + ud.field_a);
                    break L18;
                  }
                  var3++;
                  continue L3;
                } else {
                  return;
                }
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
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != -1) {
            ne.b((byte) 95);
            return ib.field_a;
        }
        return ib.field_a;
    }

    final static void a(boolean param0) {
        if (null == wg.field_j) {
          if (param0) {
            if (null != vl.field_f) {
              vl.field_f.c(true);
              vb.g(81);
              return;
            } else {
              vb.g(81);
              return;
            }
          } else {
            ne.a((byte) -120);
            if (null != vl.field_f) {
              vl.field_f.c(true);
              vb.g(81);
              return;
            } else {
              vb.g(81);
              return;
            }
          }
        } else {
          wg.field_j.a(true);
          if (!param0) {
            ne.a((byte) -120);
            if (null == vl.field_f) {
              vb.g(81);
              return;
            } else {
              vl.field_f.c(true);
              vb.g(81);
              return;
            }
          } else {
            if (null != vl.field_f) {
              vl.field_f.c(true);
              vb.g(81);
              return;
            } else {
              vb.g(81);
              return;
            }
          }
        }
    }

    static {
        field_b = 0;
    }
}
