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
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        String stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        pf stackIn_46_0 = null;
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
        pf var9 = null;
        int var10 = 0;
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
                  if (-3 != (kg.field_m ^ -1)) {
                    break L5;
                  } else {
                    if (1 == var2) {
                      L6: {
                        if (pj.field_o.length < fd.field_e.length) {
                          stackIn_21_0 = fd.field_e.length;
                          break L6;
                        } else {
                          stackIn_21_0 = pj.field_o.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_21_0;
                        if (-7 < (var3 ^ -1)) {
                          break L7;
                        } else {
                          if (var3 < 6 - -var7) {
                            L8: {
                              if ((pj.field_o.length + (-6 + var3 + -var7) ^ -1) > -1) {
                                stackIn_27_0 = "";
                                break L8;
                              } else {
                                stackIn_27_0 = pj.field_o[-var7 + pj.field_o.length + -6 + var3];
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
                          stackIn_31_0 = sj.field_u.length;
                          break L9;
                        } else {
                          stackIn_31_0 = bc.field_t.length;
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
                              stackIn_36_0 = bc.field_t[-var7 + (var3 - 7)];
                              break L10;
                            } else {
                              stackIn_36_0 = "";
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
                    stackIn_42_0 = 0;
                    break L12;
                  } else {
                    stackIn_42_0 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = hg.a(stackIn_42_0 != 0, var6, 0);
                  var8 = -(var7 >> 661664001) + fd.field_c;
                  if (0 > var4) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == ab.field_j.field_h) {
                        stackIn_46_0 = lc.field_v;
                        break L14;
                      } else {
                        stackIn_46_0 = gj.field_g;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_46_0;
                      var1_int = var1_int + gg.field_N;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(-123, -mj.field_f + var8, el.field_D - -(ol.field_b << -1966896191), var1_int, var7 + (mj.field_f << -1626858207));
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
                    break L16;
                  } else {
                    jd.field_a.b(var6, var8, var1_int - -fe.field_c, var5, -1);
                    var1_int = var1_int + d.field_j;
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
        try {
            q.field_b = param0;
            tl.field_e = param1;
            if (param2 < 104) {
                j.a((byte) 124);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "j.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
