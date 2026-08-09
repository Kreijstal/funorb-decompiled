/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ehb {
    static Boolean field_f;
    static int field_g;
    static int field_e;
    private fh field_b;
    private vga field_c;
    private gnb field_d;
    private int field_a;

    final void a(long param0, byte param1, fh param2) {
        fh var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (param1 <= -9) {
                break L1;
              } else {
                this.field_a = 91;
                break L1;
              }
            }
            L2: {
              if (0 != this.field_a) {
                this.field_a = this.field_a - 1;
                break L2;
              } else {
                var5 = this.field_c.b((byte) 77);
                var5.b(-3846);
                var5.d((byte) -35);
                if (var5 == this.field_b) {
                  var5 = this.field_c.b((byte) -128);
                  var5.b(-3846);
                  var5.d((byte) -35);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            this.field_d.a(param0, param2, (byte) -126);
            this.field_c.a(param2, -94);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("ehb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final fh a(long param0, int param1) {
        fh var4;
        int var5;
        var4 = (fh) ((Object) this.field_d.a(param0, 117));
        if (var4 != null) {
          this.field_c.a(var4, -74);
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        } else {
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            ehb.a(false);
        }
    }

    ehb(int param0) {
        int var2 = 0;
        this.field_b = new fh();
        this.field_c = new vga();
        this.field_a = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_d = new gnb(var2);
    }

    static {
        field_e = 5;
    }
}
