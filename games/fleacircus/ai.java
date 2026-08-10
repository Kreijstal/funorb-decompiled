/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends r {
    static dd[] field_n;
    static String field_o;

    final wd a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        wd stackIn_7_0 = null;
        wd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 160) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            L2: {
              if (pd.a(-94, param1) != null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3_int = stackIn_5_0;
            if (var3_int != 0) {
              stackIn_9_0 = hm.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = ml.field_K;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ai.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void c(byte param0) {
        if (param0 != -10) {
            field_n = (dd[]) null;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    final static void a(int param0, int param1, qc param2, boolean param3) {
        try {
            mk.field_d = param2;
            bb.field_C = param0;
            q.field_d = param1;
            if (param3) {
                ai.c((byte) 109);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ai.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ai(c param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(160, param1) != ml.field_K) {
              var3_int = -7 % ((param0 - 24) / 46);
              stackIn_4_0 = ha.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = bg.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ai.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void e(int param0) {
        pd var1 = null;
        int var2 = 0;
        boolean stackIn_21_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              db.field_J.a();
              tg.field_i.a();
              gg.field_g = gg.field_g - 1;
              if (param0 == -20846) {
                break L1;
              } else {
                ai.c((byte) -57);
                break L1;
              }
            }
            L2: {
              if (-1 == (gg.field_g ^ -1)) {
                gg.field_g = 200;
                var1 = (pd) ((Object) bk.field_d.c((byte) 47));
                L3: while (true) {
                  if (var1 == null) {
                    if (jc.field_c != null) {
                      var1 = (pd) ((Object) jc.field_c.c((byte) 47));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (!var1.field_n.b((byte) -54)) {
                              var1.c(-1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var1 = (pd) ((Object) jc.field_c.b((byte) -105));
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (var1.field_n.b((byte) -54)) {
                        break L6;
                      } else {
                        var1.c(param0 + 20845);
                        break L6;
                      }
                    }
                    var1 = (pd) ((Object) bk.field_d.b((byte) -105));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (gg.field_h == null) {
                break L7;
              } else {
                stackIn_21_0 = gg.field_h.d(31499);
                if (!stackIn_21_0) {
                  ae.field_b = null;
                  break L7;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "ai.B(" + param0 + ')');
        }
    }

    static {
        field_o = "Have fun!";
    }
}
