/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends pv {
    private double field_j;
    static sna field_p;
    static sna field_l;
    static int field_o;
    static String field_m;
    private int field_n;
    private int field_k;

    private final int d(int param0) {
        if (param0 < 121) {
          ((aja) this).field_k = -18;
          return 100 * Math.abs(((aja) this).field_k) / 56;
        } else {
          return 100 * Math.abs(((aja) this).field_k) / 56;
        }
    }

    final static boolean e() {
        if (!gja.b(-16103)) {
            return false;
        }
        if ((vr.field_b & 8) != 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        field_l = null;
        int var1 = 0;
        field_p = null;
        field_m = null;
    }

    private final void c(int param0) {
    }

    private final int c() {
        return ((aja) this).field_n + (int)((double)((aja) this).field_g * ((aja) this).field_j);
    }

    final boolean b(boolean param0) {
        int fieldTemp$8 = ((aja) this).field_g + 1;
        ((aja) this).field_g = ((aja) this).field_g + 1;
        if (fieldTemp$8 <= this.d(124)) {
          if (param0) {
            if (((aja) this).field_g == 1) {
              if (((aja) this).field_k >= 0) {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u + 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                int discarded$9 = -92;
                ((aja) this).field_f.field_n = this.c();
                return false;
              } else {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u - 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                int discarded$10 = -92;
                ((aja) this).field_f.field_n = this.c();
                return false;
              }
            } else {
              int discarded$11 = -92;
              ((aja) this).field_f.field_n = this.c();
              return false;
            }
          } else {
            int discarded$12 = this.d(-44);
            if (((aja) this).field_g == 1) {
              if (((aja) this).field_k >= 0) {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u + 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                int discarded$13 = -92;
                ((aja) this).field_f.field_n = this.c();
                return false;
              } else {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u - 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                int discarded$14 = -92;
                ((aja) this).field_f.field_n = this.c();
                return false;
              }
            } else {
              int discarded$15 = -92;
              ((aja) this).field_f.field_n = this.c();
              return false;
            }
          }
        } else {
          this.c(64);
          return true;
        }
    }

    aja(jfa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          ((aja) this).field_k = param1;
          ((aja) this).field_f = param0;
          ((aja) this).field_n = ((aja) this).field_f.field_n;
          ((aja) this).field_j = (double)((aja) this).field_k / (double)this.d(124);
          if (((aja) this).field_k < 0) {
            ((aja) this).field_f.field_s = false;
            return;
          } else {
            ((aja) this).field_f.field_s = true;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("aja.<init>(");
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
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 64;
        field_m = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
