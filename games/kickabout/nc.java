/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static boolean field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    final static void a(nu param0, byte param1, int param2, boolean param3) {
        cn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cn var9 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              vu.field_Cb = param2;
              vt.field_c = param0;
              if (!param3) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            u.field_c = stackIn_4_0 != 0;
            var9 = un.field_d;
            var4 = var9;
            kn.field_G = new String[vt.field_c.field_I];
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= vt.field_c.field_I) {
                rb.field_yb = -8 + ((hu) ((Object) var4)).field_G - -((hu) ((Object) var4)).field_p;
                et.field_c = 18 + var5 - -20;
                if (param1 == -85) {
                  L3: {
                    rn.field_c = rb.field_yb + 6;
                    if (100 <= et.field_c) {
                      break L3;
                    } else {
                      et.field_c = 100;
                      break L3;
                    }
                  }
                  hr.b(22);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                kn.field_G[var6] = vt.field_c.field_S[var6].toLowerCase();
                var7 = ((hu) ((Object) var9)).a(kn.field_G[var6]);
                if ((var7 ^ -1) < (var5 ^ -1)) {
                  var5 = var7;
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("nc.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, boolean param1, ps param2, int param3, int param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              sn.field_f[0] = ac.field_d.nextInt();
              sn.field_f[1] = ac.field_d.nextInt();
              gl.field_a.field_n = 0;
              sn.field_f[3] = (int)ld.field_c;
              sn.field_f[2] = (int)(ld.field_c >> 463177824);
              gl.field_a.b(-116, sn.field_f[0]);
              gl.field_a.b(-55, sn.field_f[1]);
              gl.field_a.b(-92, sn.field_f[2]);
              gl.field_a.b(-102, sn.field_f[3]);
              qr.a(param3 ^ -16185, gl.field_a);
              gl.field_a.g(param3 ^ 1207442647, param4);
              param2.a(gl.field_a, param3 + 33214);
              if (param3 == -16161) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              or.field_d.field_n = 0;
              if (!param1) {
                or.field_d.a(102, 16);
                break L2;
              } else {
                or.field_d.a(126, 18);
                break L2;
              }
            }
            L3: {
              or.field_d.field_n = or.field_d.field_n + 2;
              var5_int = or.field_d.field_n;
              or.field_d.b(-116, cm.field_J);
              or.field_d.a(il.field_f, param3 ^ 1781875959);
              var6 = 0;
              if (fu.field_c) {
                var6 = var6 | 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (it.field_n) {
                var6 = var6 | 4;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0) {
                var6 = var6 | 8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (lh.field_A == null) {
                break L6;
              } else {
                var6 = var6 | 16;
                break L6;
              }
            }
            L7: {
              or.field_d.a(103, var6);
              var7 = sa.a(so.a(param3 ^ 16246), (byte) 116);
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              or.field_d.a(14190, var7);
              if (lh.field_A != null) {
                or.field_d.a(lh.field_A, (byte) -127);
                break L8;
              } else {
                break L8;
              }
            }
            om.a(hn.field_h, or.field_d, (byte) -116, gl.field_a, bb.field_Nb);
            or.field_d.d(or.field_d.field_n - var5_int, 62);
            c.a(-1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("nc.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = 48 % ((-12 - param0) / 49);
        field_d = null;
    }

    static {
        field_a = false;
        field_b = "My Auctions";
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_c = "Invite";
    }
}
