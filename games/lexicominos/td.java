/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_g;
    static String field_b;
    private int field_h;
    String field_f;
    private int field_d;
    private sa[] field_a;
    private int field_e;
    float field_c;

    final static db[] a(String param0, String param1, sh param2, int param3) {
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        db[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        db[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 22306) {
                break L1;
              } else {
                var6 = (int[]) null;
                discarded$2 = td.a((int[]) null, false);
                break L1;
              }
            }
            var4_int = param2.c(param0, (byte) -89);
            var5 = param2.a(param1, -27964, var4_int);
            stackOut_2_0 = ij.a(var5, (byte) -117, param2, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("td.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, boolean param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        c var4_ref_c = null;
        int var4 = 0;
        int var5_int = 0;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        ng stackIn_11_0 = null;
        ng stackIn_12_0 = null;
        ng stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        ng stackOut_10_0 = null;
        ng stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ng stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (gg.field_b != uf.field_m) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param1) {
                L1: {
                  var2_long = rf.c(0);
                  if (0 == sc.field_f) {
                    break L1;
                  } else {
                    if (0 <= kk.field_r) {
                      break L1;
                    } else {
                      L2: {
                        stackOut_10_0 = eb.field_f;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (param1) {
                          stackOut_12_0 = (ng) ((Object) stackIn_12_0);
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L2;
                        } else {
                          stackOut_11_0 = (ng) ((Object) stackIn_11_0);
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L2;
                        }
                      }
                      var4_ref_c = (c) ((Object) ((ng) (Object) stackIn_13_0).a(stackIn_13_1 != 0));
                      if (var4_ref_c == null) {
                        break L1;
                      } else {
                        if ((var2_long ^ -1L) >= (var4_ref_c.field_l ^ -1L)) {
                          break L1;
                        } else {
                          var4_ref_c.b((byte) -119);
                          a.field_c = var4_ref_c.field_h.length;
                          ig.field_a.field_h = 0;
                          var5_int = 0;
                          L3: while (true) {
                            L4: {
                              L5: {
                                if (a.field_c <= var5_int) {
                                  break L5;
                                } else {
                                  ig.field_a.field_j[var5_int] = var4_ref_c.field_h[var5_int];
                                  var5_int++;
                                  if (var7 != 0) {
                                    break L4;
                                  } else {
                                    if (var7 == 0) {
                                      continue L3;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              vh.field_b = df.field_a;
                              df.field_a = wl.field_i;
                              wl.field_i = pg.field_d;
                              pg.field_d = var4_ref_c.field_k;
                              break L4;
                            }
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                L6: while (true) {
                  L7: {
                    if (-1 < (kk.field_r ^ -1)) {
                      ig.field_a.field_h = 0;
                      if (!a.b(1, 10343)) {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        kk.field_r = ig.field_a.i((byte) -76);
                        ig.field_a.field_h = 0;
                        a.field_c = param0[kk.field_r];
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (!dc.d(2)) {
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (sc.field_f != 0) {
                      L8: {
                        var4 = sc.field_f;
                        if (0.0 == ug.field_u) {
                          break L8;
                        } else {
                          var4 = (int)((double)var4 + q.field_a.nextGaussian() * ug.field_u);
                          if (-1 >= (var4 ^ -1)) {
                            break L8;
                          } else {
                            var4 = 0;
                            break L8;
                          }
                        }
                      }
                      var5 = new c((long)var4 + var2_long, kk.field_r, new byte[a.field_c]);
                      var6 = 0;
                      L9: while (true) {
                        L10: {
                          if (a.field_c <= var6) {
                            break L10;
                          } else {
                            var5.field_h[var6] = ig.field_a.field_j[var6];
                            var6++;
                            if (var7 != 0) {
                              continue L6;
                            } else {
                              if (var7 == 0) {
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        eb.field_f.b(125, var5);
                        kk.field_r = -1;
                        continue L6;
                      }
                    } else {
                      vh.field_b = df.field_a;
                      df.field_a = wl.field_i;
                      wl.field_i = pg.field_d;
                      pg.field_d = kk.field_r;
                      kk.field_r = -1;
                      stackOut_36_0 = 1;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var2);
            stackOut_48_1 = new StringBuilder().append("td.E(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L11;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_34_0 != 0;
                } else {
                  return stackIn_37_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (qg.field_b.length <= var5_int) {
                break L0;
              } else {
                param2 = qg.field_b[var5_int];
                if (var7 == 0) {
                  var6 = var5_int << 637584772;
                  L2: while (true) {
                    L3: {
                      incrementValue$17 = param2;
                      param2--;
                      if (0 == incrementValue$17) {
                        var5_int++;
                        break L3;
                      } else {
                        incrementValue$18 = var6;
                        var6++;
                        param4 = bf.field_a[incrementValue$18];
                        param1[param3[param4]] = param1[param3[param4]] + 1;
                        bf.field_a[param1[param3[param4]]] = param4;
                        if (var7 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("td.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, sa param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 37) {
              var4_float = (float)param2 / 100.0f + (float)(1 + this.field_h);
              this.field_c = var4_float * (float)this.field_d / (float)(this.field_e - -1);
              if (0 == param2) {
                this.field_f = param1.field_b;
                return;
              } else {
                this.field_f = param1.field_e + " - " + param2 + "%";
                if (!Lexicominos.field_L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_f = param1.field_b;
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("td.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        sa var2 = null;
        int var3 = 0;
        sa var4 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (param0 <= -38) {
            break L0;
          } else {
            this.field_e = -36;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_e > this.field_h) {
            var4 = this.field_a[this.field_h];
            var2 = var4;
            stackOut_4_0 = var4.field_d.c(88);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var3 == 0) {
              if (stackIn_6_0) {
                L2: {
                  if (var4.field_i < 0) {
                    break L2;
                  } else {
                    if (var4.field_d.c(5, var4.field_i)) {
                      break L2;
                    } else {
                      this.a((byte) 37, var2, var4.field_d.b((byte) -91, var4.field_i));
                      return false;
                    }
                  }
                }
                L3: {
                  if (var4.field_f == null) {
                    break L3;
                  } else {
                    if (var4.field_d.a(var4.field_f, 10762)) {
                      break L3;
                    } else {
                      this.a((byte) 37, var2, var4.field_d.b(var4.field_f, (byte) 121));
                      return false;
                    }
                  }
                }
                L4: {
                  if ((var4.field_i ^ -1) <= -1) {
                    break L4;
                  } else {
                    if (var4.field_f != null) {
                      break L4;
                    } else {
                      if (var4.field_e == null) {
                        break L4;
                      } else {
                        if (!var4.field_d.a((byte) -126)) {
                          this.a((byte) 37, var2, var4.field_d.a(false));
                          return false;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_h = this.field_h + 1;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return true;
                }
              } else {
                this.a((byte) 37, var4, 0);
                return false;
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return true;
          }
        }
    }

    private td() throws Throwable {
        throw new Error();
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        if (param0 == 0) {
            return;
        }
        field_b = (String) null;
    }

    static {
        field_b = "This password contains repeated characters, and would be easy to guess";
        field_g = "TUTORIAL";
    }
}
