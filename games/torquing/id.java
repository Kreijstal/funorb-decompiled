/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int[] field_c;
    static fi field_a;
    static fn field_b;

    final static void a(bc param0, int param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              od.field_s[0] = sa.field_d.nextInt();
              od.field_s[1] = sa.field_d.nextInt();
              jb.field_c.field_n = 0;
              od.field_s[2] = (int)(ij.field_l >> 32);
              od.field_s[3] = (int)ij.field_l;
              jb.field_c.b((byte) 60, od.field_s[0]);
              jb.field_c.b((byte) 60, od.field_s[1]);
              jb.field_c.b((byte) 60, od.field_s[2]);
              jb.field_c.b((byte) 60, od.field_s[3]);
              ga.a(jb.field_c, 24);
              jb.field_c.a(param1, 103);
              param0.a(jb.field_c, (byte) -71);
              wa.field_d.field_n = 0;
              if (param2) {
                wa.field_d.b(90, 18);
                break L1;
              } else {
                wa.field_d.b(90, 16);
                break L1;
              }
            }
            L2: {
              wa.field_d.field_n = wa.field_d.field_n + 2;
              var5_int = wa.field_d.field_n;
              wa.field_d.b((byte) 60, rj.field_w);
              wa.field_d.a(78, ul.field_f);
              var6 = 0;
              if (!ao.field_b) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (ql.field_t) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param4) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == wh.field_u) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              wa.field_d.b(90, var6);
              var7 = rb.a(-124, ip.a(9));
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              wa.field_d.b((byte) 4, var7);
              if (null != wh.field_u) {
                wa.field_d.a(wh.field_u, (byte) -72);
                break L7;
              } else {
                break L7;
              }
            }
            ok.a(jb.field_c, ua.field_a, (fj) (Object) wa.field_d, gk.field_b, -4);
            wa.field_d.c(wa.field_d.field_n + -var5_int, 400369768);
            jd.a((byte) -95, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("id.C(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + 19 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        ae.a(ip.a(9), (byte) -50);
        if (param0 != 57) {
            id.a((byte) -1);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 0;
        field_a = null;
    }

    static {
    }
}
