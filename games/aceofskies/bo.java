/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static int field_h;
    static String field_g;
    private fo field_b;
    private pa field_d;
    static kp field_i;
    static hc field_a;
    private int[] field_e;
    private ha field_c;
    private fo field_f;

    final static boolean a(byte param0) {
        boolean discarded$5 = false;
        if (param0 == 102) {
          if (hr.field_e != null) {
            if (null == hr.field_e.d((byte) -112)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$5 = bo.a((byte) -128);
          if (hr.field_e != null) {
            if (null == hr.field_e.d((byte) -112)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static rh a(al[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 23187) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = gg.a(param0[qq.a(20, param0.length)], param1, -27227);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("bo.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0) {
        fo var2 = null;
        fo var3 = null;
        if (this.field_b.field_b == this.field_d) {
          if (!param0) {
            bo.a(65);
            this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
            var3 = this.field_b;
            var2 = var3;
            this.field_b = this.field_b.field_c;
            var3.field_c = this.field_f;
            var3.field_b = null;
            this.field_f = var3;
            return;
          } else {
            this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
            var3 = this.field_b;
            var2 = var3;
            this.field_b = this.field_b.field_c;
            var3.field_c = this.field_f;
            var3.field_b = null;
            this.field_f = var3;
            return;
          }
        } else {
          this.field_c.a();
          if (null == this.field_b.field_b) {
            this.field_d = this.field_b.field_b;
            if (param0) {
              this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
              var3 = this.field_b;
              var2 = var3;
              this.field_b = this.field_b.field_c;
              var3.field_c = this.field_f;
              var3.field_b = null;
              this.field_f = var3;
              return;
            } else {
              bo.a(65);
              this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
              var3 = this.field_b;
              var2 = var3;
              this.field_b = this.field_b.field_c;
              var3.field_c = this.field_f;
              var3.field_b = null;
              this.field_f = var3;
              return;
            }
          } else {
            this.field_c.a(this.field_b.field_b, true);
            this.field_d = this.field_b.field_b;
            if (param0) {
              this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
              var3 = this.field_b;
              var2 = var3;
              this.field_b = this.field_b.field_c;
              var3.field_c = this.field_f;
              var3.field_b = null;
              this.field_f = var3;
              return;
            } else {
              bo.a(65);
              this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
              var3 = this.field_b;
              var2 = var3;
              this.field_b = this.field_b.field_c;
              var3.field_c = this.field_f;
              var3.field_b = null;
              this.field_f = var3;
              return;
            }
          }
        }
    }

    private final void b(int param0) {
        fo var2 = null;
        L0: {
          this.field_c.K(this.field_e);
          if (null == this.field_f) {
            var2 = new fo();
            break L0;
          } else {
            var2 = this.field_f;
            this.field_f = this.field_f.field_c;
            break L0;
          }
        }
        var2.a((byte) 46, this.field_e[3], this.field_e[2], this.field_b, this.field_e[1], this.field_d, this.field_e[0]);
        this.field_b = var2;
        if (param0 != 884) {
          field_h = -21;
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 18598) {
            field_i = (kp) null;
            field_g = null;
            field_a = null;
            return;
        }
        field_g = null;
        field_a = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 120 % ((param4 - 25) / 44);
        this.b(884);
        this.field_c.T(param1, param3, param0, param2);
    }

    bo(ha param0) {
        this.field_d = null;
        this.field_e = new int[4];
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Loading extra data";
        field_i = new kp();
    }
}
