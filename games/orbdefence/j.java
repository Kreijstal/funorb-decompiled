/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static ki field_b;
    int field_a;
    int field_d;
    static int field_e;
    static String field_c;

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
        pf var9 = null;
        int var10 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        String stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        pf stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        pf stackOut_45_0 = null;
        pf stackOut_44_0 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = sd.field_h;
              if (param0 < -8) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var2 = 0;
              if (kg.field_m == 2) {
                var3_long = ji.b(-90) - am.field_a;
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (ea.field_d.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = dd.field_B[var3];
                  if (0 > var4) {
                    var5 = he.field_C;
                    break L4;
                  } else {
                    if (ab.field_j.field_h == var4) {
                      var5 = lf.field_e;
                      break L4;
                    } else {
                      var5 = mf.field_c;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = ea.field_d[var3];
                  if (kg.field_m != 2) {
                    break L5;
                  } else {
                    if (1 == var2) {
                      L6: {
                        if (pj.field_o.length < fd.field_e.length) {
                          stackOut_20_0 = fd.field_e.length;
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          stackOut_19_0 = pj.field_o.length;
                          stackIn_21_0 = stackOut_19_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_21_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var3 < 6 - -var7) {
                            L8: {
                              if (pj.field_o.length + (-6 + var3 + -var7) < 0) {
                                stackOut_26_0 = "";
                                stackIn_27_0 = stackOut_26_0;
                                break L8;
                              } else {
                                stackOut_25_0 = pj.field_o[-var7 + pj.field_o.length + -6 + var3];
                                stackIn_27_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (bc.field_t.length < sj.field_u.length) {
                          stackOut_30_0 = sj.field_u.length;
                          stackIn_31_0 = stackOut_30_0;
                          break L9;
                        } else {
                          stackOut_29_0 = bc.field_t.length;
                          stackIn_31_0 = stackOut_29_0;
                          break L9;
                        }
                      }
                      var8 = stackIn_31_0;
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var3 >= var8 + 7 + var7) {
                          break L5;
                        } else {
                          L10: {
                            if (bc.field_t.length > -7 + var3 - var7) {
                              stackOut_35_0 = bc.field_t[-var7 + (var3 - 7)];
                              stackIn_36_0 = stackOut_35_0;
                              break L10;
                            } else {
                              stackOut_34_0 = "";
                              stackIn_36_0 = stackOut_34_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_36_0;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  if (-2 != var4) {
                    break L11;
                  } else {
                    var6 = Integer.toString(var2);
                    break L11;
                  }
                }
                L12: {
                  if (var4 < 0) {
                    stackOut_41_0 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    break L12;
                  } else {
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L12;
                  }
                }
                L13: {
                  int discarded$1 = 0;
                  var7 = hg.a(stackIn_42_0 != 0, var6);
                  var8 = -(var7 >> 1) + fd.field_c;
                  if (0 > var4) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == ab.field_j.field_h) {
                        stackOut_45_0 = lc.field_v;
                        stackIn_46_0 = stackOut_45_0;
                        break L14;
                      } else {
                        stackOut_44_0 = gj.field_g;
                        stackIn_46_0 = stackOut_44_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_46_0;
                      var1_int = var1_int + gg.field_N;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(-123, -mj.field_f + var8, el.field_D - -(ol.field_b << 1), var1_int, var7 + (mj.field_f << 1));
                        break L15;
                      }
                    }
                    var1_int = var1_int + ol.field_b;
                    break L13;
                  }
                }
                L16: {
                  if (var4 >= 0) {
                    ck.field_g.b(var6, var8, vl.field_f + var1_int, var5, -1);
                    var1_int = var1_int + (ol.field_b - (-gg.field_N + -el.field_D));
                    var3++;
                    break L16;
                  } else {
                    jd.field_a.b(var6, var8, var1_int - -fe.field_c, var5, -1);
                    var1_int = var1_int + d.field_j;
                    var3++;
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
          throw dd.a((Throwable) (Object) var1, "j.C(" + param0 + 41);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static void a(float param0, String param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              q.field_b = param0;
              tl.field_e = param1;
              if (param2 >= 104) {
                break L1;
              } else {
                j.a((byte) 124);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("j.B(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    j(int param0, int param1, int[] param2) {
        try {
            ((j) this).field_a = param0;
            ((j) this).field_d = param1;
            param2[((j) this).field_a] = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "j.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "That name is not available";
    }
}
