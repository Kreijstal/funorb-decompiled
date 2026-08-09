/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        sa var4 = null;
        he var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            var5 = (he) ((Object) of.field_b.a((byte) -105));
            if (param1 == -29) {
              L1: while (true) {
                if (var5 == null) {
                  var4 = (sa) ((Object) jl.field_f.a((byte) -58));
                  L2: while (true) {
                    if (var4 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      ha.a(-17765, var4, param0);
                      var4 = (sa) ((Object) jl.field_f.d((byte) -29));
                      continue L2;
                    }
                  }
                } else {
                  mi.a(param0, -115, var5);
                  var5 = (he) ((Object) of.field_b.d((byte) -18));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "rk.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
            ig.a(-92);
            q.field_N.k(-20281);
            if (param0 != 4) {
                field_a = 22;
            }
            vk.field_c = new ci(gi.field_b, (String) null, fe.field_g, param3, param2);
            ed.field_c = new ec(q.field_N, vk.field_c);
            q.field_N.b(ed.field_c, false);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "rk.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
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
            if (param0) {
              stackIn_4_0 = lh.a(-121, param1.length, param1, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rk.B(").append(param0).append(',');

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
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static o a(gk param0, gk param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -80 % ((51 - param2) / 48);
            if (c.a(param0, false, param4, param3)) {
              stackIn_4_0 = gi.a(param1.b(-127, param3, param4), 41);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rk.D(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        var4 = 0;
        if (!param1) {
          if (param2 != 4) {
            L0: {
              field_a = 22;
              if (param0) {
                var4 += 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param3) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return vg.field_a[var4];
          } else {
            L2: {
              if (param0) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return vg.field_a[var4];
          }
        } else {
          var4 += 4;
          if (param2 == 4) {
            L4: {
              if (param0) {
                var4 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return vg.field_a[var4];
          } else {
            L6: {
              field_a = 22;
              if (param0) {
                var4 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param3) {
                var4++;
                break L7;
              } else {
                break L7;
              }
            }
            return vg.field_a[var4];
          }
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, si param6, int param7, int param8) {
        bd.field_l = param2;
        a.field_a = param4;
        if (param3 != 0) {
            return;
        }
        try {
            vc.field_G = param6;
            mf.field_e = param0;
            fi.field_c = param5;
            pe.field_c = param1;
            uj.field_s = param7;
            fk.field_d = param8;
            tb.field_p = (v) ((Object) new tb());
            hb.field_F = new vi(param6);
            ih.field_Q = new oj(tb.field_p, hb.field_F);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "rk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
