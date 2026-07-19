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
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        int stackIn_33_0 = 0;
        String stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        pf stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        String stackOut_37_0 = null;
        String stackOut_36_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        pf stackOut_47_0 = null;
        pf stackOut_46_0 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = sd.field_h;
              if (param0 < -8) {
                break L1;
              } else {
                field_b = (ki) null;
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
                var4 = dd.field_B[var3];
                if (var10 == 0) {
                  L4: {
                    L5: {
                      if (0 > var4) {
                        break L5;
                      } else {
                        L6: {
                          if (ab.field_j.field_h == var4) {
                            break L6;
                          } else {
                            var5 = mf.field_c;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5 = lf.field_e;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = he.field_C;
                    break L4;
                  }
                  L7: {
                    var6 = ea.field_d[var3];
                    if (-3 != (kg.field_m ^ -1)) {
                      break L7;
                    } else {
                      if (1 == var2) {
                        L8: {
                          if (pj.field_o.length < fd.field_e.length) {
                            stackOut_22_0 = fd.field_e.length;
                            stackIn_23_0 = stackOut_22_0;
                            break L8;
                          } else {
                            stackOut_21_0 = pj.field_o.length;
                            stackIn_23_0 = stackOut_21_0;
                            break L8;
                          }
                        }
                        L9: {
                          var7 = stackIn_23_0;
                          if (-7 < (var3 ^ -1)) {
                            break L9;
                          } else {
                            if (var3 < 6 - -var7) {
                              L10: {
                                if ((pj.field_o.length + (-6 + var3 + -var7) ^ -1) > -1) {
                                  stackOut_28_0 = "";
                                  stackIn_29_0 = stackOut_28_0;
                                  break L10;
                                } else {
                                  stackOut_27_0 = pj.field_o[-var7 + pj.field_o.length + -6 + var3];
                                  stackIn_29_0 = stackOut_27_0;
                                  break L10;
                                }
                              }
                              var6 = stackIn_29_0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L11: {
                          if (bc.field_t.length < sj.field_u.length) {
                            stackOut_32_0 = sj.field_u.length;
                            stackIn_33_0 = stackOut_32_0;
                            break L11;
                          } else {
                            stackOut_31_0 = bc.field_t.length;
                            stackIn_33_0 = stackOut_31_0;
                            break L11;
                          }
                        }
                        var8 = stackIn_33_0;
                        if (var7 + 7 > var3) {
                          break L7;
                        } else {
                          if (var3 >= var8 + 7 + var7) {
                            break L7;
                          } else {
                            L12: {
                              if (bc.field_t.length > -7 + var3 - var7) {
                                stackOut_37_0 = bc.field_t[-var7 + (var3 - 7)];
                                stackIn_38_0 = stackOut_37_0;
                                break L12;
                              } else {
                                stackOut_36_0 = "";
                                stackIn_38_0 = stackOut_36_0;
                                break L12;
                              }
                            }
                            var6 = stackIn_38_0;
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  L13: {
                    if (-2 != var4) {
                      break L13;
                    } else {
                      var6 = Integer.toString(var2);
                      break L13;
                    }
                  }
                  L14: {
                    if (var4 < 0) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L14;
                    } else {
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L14;
                    }
                  }
                  L15: {
                    var7 = hg.a(stackIn_44_0 != 0, var6, 0);
                    var8 = -(var7 >> 661664001) + fd.field_c;
                    if (0 > var4) {
                      break L15;
                    } else {
                      L16: {
                        if (var4 == ab.field_j.field_h) {
                          stackOut_47_0 = lc.field_v;
                          stackIn_48_0 = stackOut_47_0;
                          break L16;
                        } else {
                          stackOut_46_0 = gj.field_g;
                          stackIn_48_0 = stackOut_46_0;
                          break L16;
                        }
                      }
                      L17: {
                        var9 = stackIn_48_0;
                        var1_int = var1_int + gg.field_N;
                        if (var9 == null) {
                          break L17;
                        } else {
                          var9.a(-123, -mj.field_f + var8, el.field_D - -(ol.field_b << -1966896191), var1_int, var7 + (mj.field_f << -1626858207));
                          break L17;
                        }
                      }
                      var1_int = var1_int + ol.field_b;
                      break L15;
                    }
                  }
                  L18: {
                    L19: {
                      if (var4 >= 0) {
                        break L19;
                      } else {
                        jd.field_a.b(var6, var8, var1_int - -fe.field_c, var5, -1);
                        var1_int = var1_int + d.field_j;
                        if (var10 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    ck.field_g.b(var6, var8, vl.field_f + var1_int, var5, -1);
                    var1_int = var1_int + (ol.field_b - (-gg.field_N + -el.field_D));
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
          throw dd.a((Throwable) ((Object) var1), "j.C(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(int param0) {
        if (param0 > -97) {
            return;
        }
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("j.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    j(int param0, int param1, int[] param2) {
        try {
            this.field_a = param0;
            this.field_d = param1;
            param2[this.field_a] = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "j.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "That name is not available";
    }
}
