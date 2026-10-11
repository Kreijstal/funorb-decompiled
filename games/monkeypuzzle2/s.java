/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends nf implements ql {
    static String[] field_Q;
    static int field_R;
    private t field_P;
    static de field_S;
    static int field_T;
    static int field_O;

    s(kj param0, kg param1) {
        super(param0, 200, 150);
        Object var3 = null;
        we var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != hf.field_g) {
            if (param1 != cg.field_c) {
              if (ma.field_b == param1) {
                this.field_p = this.field_p + 30;
                var3 = mg.field_r;
              }
            } else {
              var3 = pd.field_e;
              this.field_p = this.field_p + 10;
              if (da.a(352)) {
                var3 = kk.field_h;
                this.field_p = this.field_p + 20;
              }
            }
          } else {
            var3 = ld.field_b;
          }
          var4 = new we((String) (var3), (of) null);
          var4.field_e = 50;
          var4.field_l = this.field_l;
          var4.field_p = 80;
          var4.field_r = 0;
          var4.field_h = (ml) ((Object) new a(pf.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b((byte) -75, var4);
          this.field_P = this.a(false, (of) (this), db.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("s.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void q(int param0) {
        field_S = null;
        field_Q = null;
        if (param0 != 7993) {
          field_S = (de) null;
        }
    }

    private final t a(boolean param0, of param1, String param2) {
        t var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        t stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new t(param2, param1);
          var4.field_h = (ml) ((Object) new hd());
          var5 = this.field_p - 6;
          this.field_p = this.field_p + 38;
          var4.a(30, 13361, 15, -30 + this.field_l, var5);
          this.b((byte) -98, var4);
          if (param0) {
            s.q(-59);
          }
          this.g(-1);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("s.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (!this.field_z) {
          return;
        }
        if (param0 != -93) {
          return;
        }
        this.field_z = false;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_P) {
            this.f((byte) -93);
          }
          if (param3 == 7) {
            return;
          }
          field_Q = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("s.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_Q = new String[]{"By rating", "By win percentage"};
        field_S = null;
        field_R = 0;
        field_T = 0;
    }
}
