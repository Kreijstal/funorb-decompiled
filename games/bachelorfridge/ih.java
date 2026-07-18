/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends lw {
    static int field_l;

    final static cj a(lu param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        df stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == 290) {
              stackOut_3_0 = new df(param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ih.F(");
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return (cj) (Object) stackIn_4_0;
    }

    final void a(int param0) {
        ((ih) this).b((byte) 112);
        int var2 = 113 % ((59 - param0) / 33);
    }

    final static void e(int param0) {
        if (param0 != jv.field_j) {
          int discarded$4 = 37;
          if (uga.e()) {
            wk.field_b = true;
            return;
          } else {
            gma.a(true);
            jv.field_j = 11;
            wk.field_b = true;
            return;
          }
        } else {
          gma.a(true);
          jv.field_j = 11;
          wk.field_b = true;
          return;
        }
    }

    final void a(int param0, byte param1) {
        Object var4 = null;
        if (34 == param0) {
          ((ih) this).b((byte) 112);
          if (param1 != 73) {
            var4 = null;
            cj discarded$6 = ih.a((lu) null, 104);
            return;
          } else {
            return;
          }
        } else {
          if (param0 == 29) {
            fla.b(param1 + 23548);
            dj.field_c.field_h.a(true, 0);
            dj.field_c.e(-60);
            if (param1 == 73) {
              return;
            } else {
              var4 = null;
              cj discarded$7 = ih.a((lu) null, 104);
              return;
            }
          } else {
            if (param1 == 73) {
              return;
            } else {
              var4 = null;
              cj discarded$8 = ih.a((lu) null, 104);
              return;
            }
          }
        }
    }

    ih() {
        super(false, new String[3], eb.field_r);
        ((ih) this).field_c = new int[][]{new int[2], new int[2], new int[2]};
    }

    final static void d(byte param0) {
        di.c(67);
        int discarded$0 = 48;
        c.f();
        wt.field_n = null;
        int var1 = 62 % ((58 - param0) / 40);
        int discarded$1 = -26;
        ki.g();
    }

    final static void d() {
    }

    final void a(byte param0) {
        if (param0 <= 103) {
            field_l = 125;
        }
    }

    static {
    }
}
