/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka extends uj {
    static String[] field_d;

    hka() {
    }

    final boolean c(byte param0) {
        if (param0 > -104) {
            field_d = null;
            return true;
        }
        return true;
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_d = null;
            return gg.field_j;
        }
        return gg.field_j;
    }

    final boolean c(int param0) {
        if (param0 < 63) {
            return true;
        }
        return false;
    }

    final int b(byte param0) {
        if (param0 <= 79) {
            field_d = null;
            return 111;
        }
        return 111;
    }

    final static void a(asb param0, int param1) {
        RuntimeException var2 = null;
        llb var3 = null;
        llb var5 = null;
        llb var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            iqb.field_o = gra.a(param0, "display_name_changed", "basic", true);
            re.field_n = new wdb(0L, rbb.field_k, jj.field_q, esa.field_o);
            vra.field_b = new wdb(0L, rbb.field_k, bnb.field_q, ci.field_a);
            ci.field_c = new llb(0L, (llb) null);
            rtb.field_h = new llb(0L, qc.field_q);
            rtb.field_h.field_F = 1;
            aha.field_o = new llb(0L, sdb.field_p, kpb.field_r);
            rrb.field_b = new llb(0L, qsa.field_d, mab.field_e);
            nf.field_c = new llb(0L, iga.field_o);
            ci.field_c.b(-561, rtb.field_h);
            ci.field_c.b(-561, aha.field_o);
            ci.field_c.b(-561, rrb.field_b);
            ci.field_c.b(-561, (llb) (Object) re.field_n);
            ci.field_c.b(-561, nf.field_c);
            re.field_n.field_xb.field_xb.a(18445, qc.field_q);
            re.field_n.field_xb.field_xb.field_B = 1;
            var5 = re.field_n.field_xb.field_xb;
            var6 = var5;
            var6.field_F = 1;
            vra.field_b.field_xb.field_xb.a(18445, qc.field_q);
            var3 = vra.field_b.field_xb.field_xb;
            vra.field_b.field_xb.field_xb.field_B = 1;
            var3.field_F = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hka.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -97 + ')');
        }
    }

    public static void d(int param0) {
        field_d = null;
    }

    final int b(int param0) {
        if (param0 != -25131) {
            boolean discarded$0 = ((hka) this).c(-85);
            return 256;
        }
        return 256;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = VoidHunters.field_G;
        try {
          if (ef.field_z >= 10) {
            if (!lm.a(true)) {
              dma.a();
              uba.a((byte) 82, 320, 240);
              dh.a(param1, 0, 0, 0);
              return;
            } else {
              if (qmb.field_q == 0) {
                pi.a((byte) -70, false, param2);
                dh.a(param1, 0, 0, 0);
                return;
              } else {
                pga.a(param1, true);
                return;
              }
            }
          } else {
            L0: {
              var3_int = 0;
              if (aob.field_o) {
                aob.field_o = false;
                var3_int = 1;
                break L0;
              } else {
                break L0;
              }
            }
            skb.a(wpb.field_p, 13, bj.e((byte) 97), var3_int != 0, dua.e((byte) -79));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("hka.K(").append(111).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final int d(byte param0) {
        if (param0 != 64) {
            field_d = null;
            return oq.field_t;
        }
        return oq.field_t;
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_d = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
