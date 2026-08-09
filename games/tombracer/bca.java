/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bca {
    static nh field_d;
    private kpa field_b;
    static String field_c;
    static int[] field_a;

    public static void b(int param0) {
        if (param0 != 3) {
          field_a = (int[]) null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static ip a(int param0) {
        if (param0 != 0) {
            vb var2 = (vb) null;
            bca.a((vb) null, (byte) 31);
            return (ip) ((Object) new es());
        }
        return (ip) ((Object) new es());
    }

    private final void a(byte param0) {
        this.field_b = new kpa(3);
        if (param0 != -101) {
            return;
        }
        this.field_b.a(true, 106);
    }

    final static void b(byte param0) {
        rn.field_b = 0;
        if (param0 != 55) {
            field_d = (nh) null;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            this.field_b.a(param1, (byte) -120);
            if (param0 >= -13) {
                field_d = (nh) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bca.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(vb param0, byte param1) {
        try {
            kva.field_n.b(param0.field_f);
            if (param1 != -42) {
                bca.b((byte) -90);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bca.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        if (param1 != 14530) {
            return false;
        }
        if (-1 == param0) {
            return true;
        }
        return this.field_b.a(0, param0);
    }

    public bca() {
        this.a((byte) -101);
    }

    bca(int param0, kh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((param0 ^ -1) >= -9) {
            this.a((byte) -101);
            return;
          } else {
            this.field_b = new kpa(3, param0, param1);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bca.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L0;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L0;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_c = "Points from room +<%0>";
        field_a = new int[]{};
    }
}
