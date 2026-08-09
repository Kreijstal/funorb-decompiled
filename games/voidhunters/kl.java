/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static phb field_c;
    static String field_e;
    uwa[] field_b;
    static String field_a;
    int field_d;

    final static void a(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            rib.a((java.awt.Component) ((Object) param0), (byte) 121);
            uab.a((byte) 1, (java.awt.Component) ((Object) param0));
            var2_int = 105 / ((41 - param1) / 39);
            if (kkb.field_o == null) {
              break L0;
            } else {
              kkb.field_o.a((java.awt.Component) ((Object) param0), -21835);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("kl.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        if (param0 < 26) {
            this.field_b = (uwa[]) null;
            this.field_d = 0;
            return;
        }
        this.field_d = 0;
    }

    final uwa a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 == 0) {
          if (this.field_d < this.field_b.length) {
            if (null == this.field_b[this.field_d]) {
              this.field_b[this.field_d] = new uwa();
              fieldTemp$2 = this.field_d;
              this.field_d = this.field_d + 1;
              return this.field_b[fieldTemp$2];
            } else {
              fieldTemp$3 = this.field_d;
              this.field_d = this.field_d + 1;
              return this.field_b[fieldTemp$3];
            }
          } else {
            nkb.a(false, "We've run out of shieldinfo slots");
            return null;
          }
        } else {
          return (uwa) null;
        }
    }

    public static void b(int param0) {
        java.awt.Canvas var2;
        if (param0 >= -102) {
          var2 = (java.awt.Canvas) null;
          kl.a((java.awt.Canvas) null, 125);
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ch.field_o = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            qs.a(param0, -125, var3, var2, var4);
            if (param1 == 0) {
              break L0;
            } else {
              field_a = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("kl.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public kl() {
        this.field_b = new uwa[128];
    }

    static {
        field_e = "Arm self destruct";
        field_a = "Bomblet spray";
    }
}
