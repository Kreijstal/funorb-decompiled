/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends lw {
    static int field_l;

    final static cj a(lu param0, int param1) {
        RuntimeException var2 = null;
        cj stackIn_2_0 = null;
        df stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 290) {
            stackIn_4_0 = new df(param0);
            return (cj) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (cj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ih.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        this.b((byte) 112);
        int var2 = 113 % ((59 - param0) / 33);
    }

    final static void e(int param0) {
        if (param0 == jv.field_j) {
          gma.a(true);
          jv.field_j = 11;
          wk.field_b = true;
          return;
        }
        if (!uga.e(37)) {
          gma.a(true);
          jv.field_j = 11;
          wk.field_b = true;
          return;
        }
        wk.field_b = true;
    }

    final void a(int param0, byte param1) {
        lu var4 = null;
        lu var4Lifetime1;
        lu var4Lifetime2;
        if (34 != param0) {
          if (param0 != 29) {
            if (param1 != 73) {
              var4 = (lu) null;
              ih.a((lu) null, 104);
              return;
            }
            return;
          }
          fla.b(param1 + 23548);
          dj.field_c.field_h.a(true, 0);
          dj.field_c.e(-60);
          if (param1 != 73) {
            var4Lifetime2 = (lu) null;
            ih.a((lu) null, 104);
            return;
          }
          return;
        }
        this.b((byte) 112);
        if (param1 == 73) {
          return;
        }
        var4Lifetime1 = (lu) null;
        ih.a((lu) null, 104);
    }

    ih() {
        super(false, new String[]{kk.field_q, we.field_a, gea.field_l}, eb.field_r);
        this.field_c = new int[][]{new int[]{150, 300}, new int[]{150, 300}, new int[]{150, 290}};
    }

    final static void d(byte param0) {
        di.c(67);
        c.f((byte) 48);
        wt.field_n = null;
        int var1 = 62 % ((58 - param0) / 40);
        ki.g(-26);
    }

    final static void d(int param0) {
        if (param0 != 15366) {
          field_l = 45;
        }
    }

    final void a(byte param0) {
        if (param0 <= 103) {
          field_l = 125;
        }
    }

    static {
    }
}
