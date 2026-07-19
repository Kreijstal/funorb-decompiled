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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("kl.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 == 0) {
          if (this.field_d < this.field_b.length) {
            if (null == this.field_b[this.field_d]) {
              this.field_b[this.field_d] = new uwa();
              fieldTemp$4 = this.field_d;
              this.field_d = this.field_d + 1;
              return this.field_b[fieldTemp$4];
            } else {
              fieldTemp$5 = this.field_d;
              this.field_d = this.field_d + 1;
              return this.field_b[fieldTemp$5];
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
        java.awt.Canvas var2 = null;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (var2_ref);
            stackOut_3_1 = new StringBuilder().append("kl.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
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
