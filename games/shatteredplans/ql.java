/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends oh {
    static bi[] field_o;
    int field_l;
    int field_m;
    int field_k;
    ql field_h;
    int field_i;
    static pf field_p;
    int field_j;
    static nq field_n;
    static volatile int field_q;

    final static void a(byte param0, String[] param1) {
        sq stackIn_17_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        sq var3 = null;
        int var4 = 0;
        String var5 = null;
        sq var6 = null;
        int var7 = 0;
        int var8 = 0;
        dm var9 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            vc.field_c = param1;
            if (param0 == 50) {
              if (0 != vc.field_c.length) {
                um.field_k = 0;
                tp.b((byte) 93);
                var9 = new dm();
                var3 = nd.a((byte) -106);
                L1: while (true) {
                  if (var3 == null) {
                    mf.field_q = new sq[var9.field_g];
                    var4 = 0;
                    L2: while (true) {
                      if (var4 >= var9.field_g) {
                        var8 = 0;
                        var4 = var8;
                        L3: while (true) {
                          if (var9.field_g - 1 <= var8) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              var5 = mf.field_q[var8].field_d;
                              if (var5 == null) {
                                stackIn_17_0 = null;
                                break L4;
                              } else {
                                stackIn_17_0 = n.a(var5, -21502);
                                break L4;
                              }
                            }
                            L5: {
                              var6 = stackIn_17_0;
                              if (var6 != null) {
                                break L5;
                              } else {
                                if (!mf.field_q[var8].field_r) {
                                  var6 = mf.field_q[var8 - -1];
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            mf.field_q[var8].field_l = var6;
                            var8++;
                            continue L3;
                          }
                        }
                      } else {
                        mf.field_q[var4] = (sq) (var9.field_b[var4]);
                        var4++;
                        continue L2;
                      }
                    }
                  } else {
                    var9.a(false, var3);
                    var3 = nd.a((byte) 118);
                    continue L1;
                  }
                }
              } else {
                mf.field_q = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ql.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        gm var1 = null;
        int var2 = 0;
        boolean stackIn_21_0 = false;
        RuntimeException decompiledCaughtException = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              aj.field_e.e();
              hg.field_q.e();
              if (param0 == -26848) {
                break L1;
              } else {
                ql.a((byte) 108);
                break L1;
              }
            }
            L2: {
              dp.field_u = dp.field_u - 1;
              if (dp.field_u == 0) {
                dp.field_u = 200;
                var1 = (gm) ((Object) eo.field_ab.d(param0 ^ -26848));
                L3: while (true) {
                  if (var1 == null) {
                    if (nc.field_v != null) {
                      var1 = (gm) ((Object) nc.field_v.d(0));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (!var1.field_n.c(2048)) {
                              var1.b((byte) -84);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var1 = (gm) ((Object) nc.field_v.a((byte) -71));
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (!var1.field_n.c(2048)) {
                        var1.b((byte) -108);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1 = (gm) ((Object) eo.field_ab.a((byte) -71));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (jh.field_B == null) {
                break L7;
              } else {
                stackIn_21_0 = jh.field_B.h(5309);
                if (!stackIn_21_0) {
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ql.A(" + param0 + ')');
        }
    }

    final static void a(java.awt.Frame param0, int param1, qb param2) {
        pb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(param0, (byte) 127);
              L2: while (true) {
                if (var3.field_d != 0) {
                  if ((var3.field_d ^ -1) == -2) {
                    if (param1 == 0) {
                      param0.setVisible(false);
                      param0.dispose();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    jb.a((byte) -93, 100L);
                    continue L1;
                  }
                } else {
                  jb.a((byte) -94, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ql.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 > -46) {
            field_o = (bi[]) null;
        }
        field_n = null;
    }

    ql(int param0, int param1, int param2, int param3, int param4) {
        this.field_m = param2;
        this.field_j = param3;
        this.field_l = param4;
        this.field_i = param0;
        this.field_k = param1;
    }

    static {
        field_p = new pf();
        field_q = 0;
    }
}
