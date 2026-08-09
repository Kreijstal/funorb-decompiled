/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    String field_c;
    fa field_a;
    String field_b;
    int field_e;
    static long[] field_f;
    static String field_h;
    String field_g;
    static int field_d;

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 87) {
              if (param1) {
                stackIn_7_0 = qk.field_a.b(param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = da.field_h.b(param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 48;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = 0;
            var4 = jh.field_m;
            L1: while (true) {
              if (var3_int >= rb.field_d.length) {
                L2: {
                  if (param0 <= -24) {
                    break L2;
                  } else {
                    field_h = (String) null;
                    break L2;
                  }
                }
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = f.field_a[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + jm.field_b;
                    break L3;
                  } else {
                    var6 = bb.a((byte) 87, true, rb.field_d[var3_int]);
                    var7 = -(var6 >> -145841279) + nd.field_r;
                    var4 = var4 + hi.field_ab;
                    if (gb.a(var7 - se.field_j, var4, param2, (byte) 76, param1, var6 + (se.field_j << -1000359743), (dc.field_b << -205399423) + lm.field_d)) {
                      stackIn_7_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (hi.field_ab + ((dc.field_b << -1679922975) - -lm.field_d));
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "bb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_14_0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != -1) {
            bb.a(97, 79, 46);
        }
    }

    final static void a(fa param0, int param1, int param2, vg param3) {
        try {
            uf.field_e = uc.j((byte) -127) * param2 / 1000;
            ee.a((byte) 51, param0);
            qe.a(-28664, param0);
            if (param1 >= -60) {
                bb.a(2);
            }
            ik.a(param0, (byte) 100);
            cg.f((byte) -75);
            vc.a(true);
            kf.field_f = 0 + -uf.field_e;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "bb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        jg.field_kb.field_i = 0;
        if (param0 != 3287) {
            vg var2 = (vg) null;
            bb.a((fa) null, 113, -67, (vg) null);
        }
        jg.field_kb.field_l = 0;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (param0 >= 105) {
                break L1;
              } else {
                bb.b(96);
                break L1;
              }
            }
            L2: {
              if (null == va.field_g) {
                break L2;
              } else {
                if (va.field_g.equals(param2.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = va.field_g;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                }
              }
            }
            L3: {
              if (null == hb.field_o) {
                break L3;
              } else {
                if (!hb.field_o.equals(param2.getParameter("session"))) {
                  var4 = hb.field_o;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_10_0 = wl.a(param1, (String) (var4), (String) (var3), false, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("bb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    private bb() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "MHX-3";
        field_f = new long[32];
    }
}
