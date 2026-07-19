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
          this.field_k = -18;
          return 100 * Math.abs(this.field_k) / 56;
        } else {
          return 100 * Math.abs(this.field_k) / 56;
        }
    }

    final static boolean e(int param0) {
        if (param0 == 11) {
          if (gja.b(param0 + -16114)) {
            if ((vr.field_b & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void b(int param0) {
        field_l = null;
        int var1 = -36 % ((param0 - 28) / 40);
        field_p = null;
        field_m = null;
    }

    private final void c(int param0) {
        if (param0 != 64) {
            this.field_n = 44;
        }
    }

    private final int c(byte param0) {
        if (param0 >= -14) {
          this.field_k = 90;
          return this.field_n + (int)((double)this.field_g * this.field_j);
        } else {
          return this.field_n + (int)((double)this.field_g * this.field_j);
        }
    }

    final boolean b(boolean param0) {
        int discarded$3 = 0;
        int fieldTemp$2 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$2 <= this.d(124)) {
          if (param0) {
            if (this.field_g == 1) {
              if (-1 >= (this.field_k ^ -1)) {
                this.field_f.field_u = this.field_f.field_u + 1;
                this.field_f.field_v.a((byte) 49, this.field_f.field_g.field_o.field_b, 15);
                this.field_f.field_n = this.c((byte) -92);
                return false;
              } else {
                this.field_f.field_u = this.field_f.field_u - 1;
                this.field_f.field_v.a((byte) 49, this.field_f.field_g.field_o.field_b, 15);
                this.field_f.field_n = this.c((byte) -92);
                return false;
              }
            } else {
              this.field_f.field_n = this.c((byte) -92);
              return false;
            }
          } else {
            discarded$3 = this.d(-44);
            if (this.field_g == 1) {
              if (-1 >= (this.field_k ^ -1)) {
                this.field_f.field_u = this.field_f.field_u + 1;
                this.field_f.field_v.a((byte) 49, this.field_f.field_g.field_o.field_b, 15);
                this.field_f.field_n = this.c((byte) -92);
                return false;
              } else {
                this.field_f.field_u = this.field_f.field_u - 1;
                this.field_f.field_v.a((byte) 49, this.field_f.field_g.field_o.field_b, 15);
                this.field_f.field_n = this.c((byte) -92);
                return false;
              }
            } else {
              this.field_f.field_n = this.c((byte) -92);
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
          this.field_k = param1;
          this.field_f = param0;
          this.field_n = this.field_f.field_n;
          this.field_j = (double)this.field_k / (double)this.d(124);
          if ((this.field_k ^ -1) > -1) {
            this.field_f.field_s = false;
            return;
          } else {
            this.field_f.field_s = true;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("aja.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        field_o = 64;
        field_m = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
