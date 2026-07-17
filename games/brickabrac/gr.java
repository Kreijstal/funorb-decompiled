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
        field_c = null;
    }

    final static byte[] a(boolean param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_2_0 = hq.field_t.a(-61, "", param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gr.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
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
          throw qb.a((Throwable) (Object) var2, "gr.D(" + param0 + 44 + param1 + 41);
        }
    }

    final static void b(int param0, int param1) {
        tn.field_C = param0;
        if (tn.field_C != 1) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "<%0> has dropped out.";
    }
}
