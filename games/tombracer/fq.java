/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    private int field_d;
    static int field_g;
    private int field_b;
    private int field_f;
    static pl field_c;
    private boolean field_a;
    static l field_e;

    final int c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1) {
          L0: {
            int discarded$10 = ((fq) this).c(-33);
            if (((fq) this).field_a) {
              stackOut_7_0 = ((fq) this).field_b;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((fq) this).field_f;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((fq) this).field_a) {
              stackOut_3_0 = ((fq) this).field_b;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((fq) this).field_f;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_e = null;
    }

    final static hea a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hea var3 = null;
        hea stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hea stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 35;
              var3 = new hea(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, ck.field_c);
              loa.a((byte) 123);
              stackOut_3_0 = (hea) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("fq.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 103 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        fna.field_k = vc.field_q.e((byte) -76);
        CharSequence var2 = (CharSequence) (Object) fna.field_k;
        tia.field_b = jd.a(1, var2);
    }

    final void a(kh param0, int param1) {
        try {
            if (param1 != 23) {
                boolean discarded$0 = ((fq) this).a(-16);
            }
            param0.a((byte) 118, !((fq) this).field_a ? 0 : 1, 1);
            param0.a((byte) -125, ((fq) this).field_d, 2);
            param0.a((byte) -128, ((fq) this).field_b, 8);
            param0.a((byte) 64, ((fq) this).field_f, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fq.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 > -44) {
            return 74;
        }
        return ((fq) this).field_b;
    }

    final boolean a(int param0) {
        if (param0 != -25584) {
            return true;
        }
        return ((fq) this).field_a;
    }

    fq() {
        ((fq) this).field_f = 0;
        ((fq) this).field_b = 10;
    }

    fq(int param0, kh param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        ((fq) this).field_f = 0;
        ((fq) this).field_b = 10;
        try {
          L0: {
            if (param0 < 11) {
              break L0;
            } else {
              L1: {
                stackOut_2_0 = this;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param1.b((byte) 44, 1) != 1) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              ((fq) this).field_a = stackIn_5_1 != 0;
              break L0;
            }
          }
          L2: {
            if (param0 < 13) {
              ((fq) this).field_b = 10;
              ((fq) this).field_d = 0;
              break L2;
            } else {
              ((fq) this).field_d = param1.b((byte) 44, 2);
              ((fq) this).field_b = param1.b((byte) 44, 8);
              break L2;
            }
          }
          L3: {
            if (param0 < 23) {
              break L3;
            } else {
              if (param0 >= 26) {
                break L3;
              } else {
                int discarded$2 = param1.b((byte) 44, 8);
                break L3;
              }
            }
          }
          if (param0 < 24) {
            ((fq) this).field_f = 100;
            return;
          } else {
            ((fq) this).field_f = param1.b((byte) 44, 8);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("fq.<init>(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new pl(0);
    }
}
