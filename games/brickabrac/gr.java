/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    static jp field_c;
    static volatile int field_a;
    static jp[] field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 <= 109) {
            gr.b(47, 0);
        }
        field_c = null;
    }

    final static byte[] a(boolean param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_c = (jp) null;
                break L1;
              }
            }
            stackIn_3_0 = hq.field_t.a(-61, "", param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gr.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ti.a(rn.field_l, pe.field_u, wi.field_m, true, 97, param1, 0);
              if (param0 == 12429) {
                break L1;
              } else {
                gr.a(22, -5);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= wi.field_m) {
                L3: {
                  ti.a(uf.field_b, ba.field_w, param1 + wi.field_m, false, 118, param1 + param1, param1);
                  if (param1 >= wi.field_m) {
                    break L3;
                  } else {
                    wi.field_m = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                fj.field_Pb[var2_int + param1] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "gr.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1) {
        tn.field_C = param0;
        if (-2 != (tn.field_C ^ -1)) {
            a.field_s = ln.field_j;
            jc.field_J = mh.field_ib;
            tf.field_c = kp.field_e;
            field_c = p.field_i;
            vn.field_w = cq.field_o;
            we.field_b = ch.field_k;
            bq.field_e = hc.field_a;
            gg.field_o = ep.field_j;
            nj.field_l = mf.field_a;
            fq.field_d = ol.field_z;
        } else {
            bq.field_e = ip.field_v;
            a.field_s = hp.field_l;
            tf.field_c = dg.field_b;
            vn.field_w = dg.field_e;
            jc.field_J = vn.field_D;
            gg.field_o = dk.field_R;
            nj.field_l = pa.field_m;
            fq.field_d = qg.field_D;
            we.field_b = gg.field_p;
            field_c = re.field_k;
        }
        if (param1 != -28463) {
            field_a = -38;
        }
    }

    static {
        field_a = 0;
        field_b = "<%0> has dropped out.";
    }
}
