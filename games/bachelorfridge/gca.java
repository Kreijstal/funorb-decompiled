/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gca extends bw {
    static qia field_f;
    int field_h;
    static kv field_g;

    void a(int param0, int param1, byte param2) {
        if (param2 != -34) {
            gca.c((byte) -81);
        }
    }

    final static ola a(int param0, lu param1) {
        ola var2 = null;
        RuntimeException var2_ref = null;
        ola stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                gca.c((byte) -1);
                break L1;
              }
            }
            var2 = new ola();
            var2.a((byte) -118, param1);
            stackIn_3_0 = (ola) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("gca.M(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void d(byte param0) {
        if (param0 != 124) {
          gca.c((byte) -33);
          iv.b(false);
          hb.a(gi.field_b[0].field_n, gba.field_Bb, he.field_l, rg.field_h, -103, rj.field_j);
          return;
        } else {
          iv.b(false);
          hb.a(gi.field_b[0].field_n, gba.field_Bb, he.field_l, rg.field_h, -103, rj.field_j);
          return;
        }
    }

    gca(int param0) {
        this.field_h = param0;
    }

    void a(int param0, byte param1, int param2) {
        if (param1 <= 7) {
            field_f = (qia) null;
        }
    }

    public static void c(byte param0) {
        field_g = null;
        field_f = null;
        if (param0 <= 102) {
            gca.c((byte) 111);
        }
    }

    abstract boolean a(boolean param0, boolean param1);

    static {
        field_f = new qia();
    }
}
