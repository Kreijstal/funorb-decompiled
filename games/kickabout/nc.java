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
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cn var9 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              vu.field_Cb = param2;
              vt.field_c = param0;
              if (!param3) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
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
                rb.field_yb = -8 + ((hu) (Object) var4).field_G - -((hu) (Object) var4).field_p;
                et.field_c = 18 + var5 - -20;
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
                break L0;
              } else {
                L4: {
                  kn.field_G[var6] = vt.field_c.field_S[var6].toLowerCase();
                  var7 = ((hu) (Object) var9).a(kn.field_G[var6]);
                  if (var7 <= var5) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("nc.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + -85 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, ps param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              sn.field_f[0] = ac.field_d.nextInt();
              sn.field_f[1] = ac.field_d.nextInt();
              gl.field_a.field_n = 0;
              sn.field_f[3] = (int)ld.field_c;
              sn.field_f[2] = (int)(ld.field_c >> 32);
              gl.field_a.b(-116, sn.field_f[0]);
              gl.field_a.b(-55, sn.field_f[1]);
              gl.field_a.b(-92, sn.field_f[2]);
              gl.field_a.b(-102, sn.field_f[3]);
              qr.a(24, gl.field_a);
              gl.field_a.g(-1207444472, param4);
              param2.a(gl.field_a, 17053);
              or.field_d.field_n = 0;
              if (!param1) {
                or.field_d.a(102, 16);
                break L1;
              } else {
                or.field_d.a(126, 18);
                break L1;
              }
            }
            L2: {
              or.field_d.field_n = or.field_d.field_n + 2;
              var5_int = or.field_d.field_n;
              or.field_d.b(-116, cm.field_J);
              or.field_d.a(il.field_f, -1781890008);
              var6 = 0;
              if (fu.field_c) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (it.field_n) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (lh.field_A == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              or.field_d.a(103, var6);
              var7 = sa.a(so.a(-87), (byte) 116);
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              or.field_d.a(14190, var7);
              if (lh.field_A != null) {
                or.field_d.a(lh.field_A, (byte) -127);
                break L7;
              } else {
                break L7;
              }
            }
            om.a(hn.field_h, (iw) (Object) or.field_d, (byte) -116, gl.field_a, bb.field_Nb);
            or.field_d.d(or.field_d.field_n - var5_int, 62);
            c.a(-1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("nc.A(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + -16161 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = 0;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_b = "My Auctions";
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_c = "Invite";
    }
}
