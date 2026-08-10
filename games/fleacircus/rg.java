/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends ef {
    static String field_r;
    static int field_p;
    static String field_q;
    static int field_n;
    static fa field_o;

    final uj a(boolean param0) {
        if (!param0) {
            rg.b(false);
        }
        return ui.field_nb;
    }

    rg(long param0, String param1) {
        super(param0, param1);
    }

    final static gm b(byte param0, String param1) {
        String var2 = null;
        gm var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_10_0 = null;
        gm stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (null != di.field_b) {
              if (param1 != null) {
                if (0 != param1.length()) {
                  var7 = (CharSequence) ((Object) param1);
                  var2 = uk.a(-100, var7);
                  if (var2 != null) {
                    var3 = (gm) ((Object) di.field_b.a((long)var2.hashCode(), 16571));
                    var4 = 98 % ((-92 - param0) / 33);
                    L1: while (true) {
                      if (var3 != null) {
                        var8 = (CharSequence) ((Object) var3.field_jb);
                        var5 = uk.a(99, var8);
                        if (var5.equals(var2)) {
                          stackIn_17_0 = (gm) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (gm) ((Object) di.field_b.a(-111));
                          continue L1;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("rg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gm) ((Object) stackIn_10_0);
        } else {
          return stackIn_17_0;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_n = 55;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (-41 >= (var1_int ^ -1)) {
                break L0;
              } else {
                qg.field_a[var1_int] = rk.field_s;
                dh.field_b[var1_int] = ck.field_o;
                ge.field_a[var1_int] = -4;
                cl.field_d[var1_int] = 0;
                jd.field_o[var1_int] = 0;
                nb.field_b = 0;
                qg.field_c = 149;
                va.field_t[var1_int] = 0;
                lh.field_e[qg.field_a[var1_int] / 4][dh.field_b[var1_int] / 4] = 1;
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "rg.F(" + param0 + ')');
        }
    }

    final static void a(int param0, dd param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dd var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gb.field_l > param0) {
                param2 = param2 - (gb.field_l - param0);
                param0 = gb.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 + param0 > gb.field_h) {
                param2 = gb.field_h - param0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (gb.field_b <= param7) {
                break L3;
              } else {
                param3 = param3 - (-param7 + gb.field_b);
                param7 = gb.field_b;
                break L3;
              }
            }
            L4: {
              if (param7 - -param3 > gb.field_i) {
                param3 = gb.field_i + -param7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 <= (param2 ^ -1)) {
                break L5;
              } else {
                if ((param3 ^ -1) < -1) {
                  var21 = param1.c();
                  var30 = gb.field_a;
                  var10 = gb.field_d;
                  var11 = gb.field_k;
                  var29 = new int[4];
                  gb.a(var29);
                  param1.f();
                  gb.g(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param7 * param1.field_w + param0;
                  var14 = param1.field_w - param2;
                  var25 = var21.field_B;
                  var22 = var25;
                  var15 = var22;
                  var16 = param7;
                  L6: while (true) {
                    if (param3 - -param7 <= var16) {
                      L7: {
                        var21.d(-param1.field_q, -param1.field_v);
                        gb.a(var30, var10, var11);
                        gb.b(var29);
                        if (param5 <= -3) {
                          break L7;
                        } else {
                          field_n = 126;
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param0;
                      L8: while (true) {
                        if (var17 >= param2 + param0) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L9: {
                            var18 = var25[var13];
                            if (0 == var18) {
                              break L9;
                            } else {
                              L10: {
                                if (var17 <= 0) {
                                  break L10;
                                } else {
                                  if (-1 == (var15[-1 + var13] ^ -1)) {
                                    gb.f(var17, var16, param6, param4);
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var16 <= 0) {
                                  break L11;
                                } else {
                                  if (var15[-param1.field_w + var13] == 0) {
                                    gb.f(var17, var16, param6, param4);
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (-1 + param1.field_w <= var17) {
                                  break L12;
                                } else {
                                  if (-1 == (var15[1 + var13] ^ -1)) {
                                    gb.f(var17, var16, param6, param4);
                                    break L9;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var16 >= param1.field_t + -1) {
                                break L9;
                              } else {
                                if (0 != var15[var13 + param1.field_w]) {
                                  break L9;
                                } else {
                                  gb.f(var17, var16, param6, param4);
                                  break L9;
                                }
                              }
                            }
                          }
                          var13++;
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var8);

            stackIn_44_1 = new StringBuilder().append("rg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L13;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L13;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            String var2 = (String) null;
            rg.b((byte) 68, (String) null);
        }
        field_q = null;
        field_r = null;
    }

    static {
        field_r = "You have <%0> unread messages!";
        field_q = "Loading fonts";
        field_p = 0;
    }
}
