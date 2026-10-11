/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int[] field_h;
    kc field_b;
    private int field_c;
    private int field_a;
    kc[] field_f;
    private boolean field_g;
    private int field_e;
    private int field_d;
    private int field_i;

    final oc c(int param0, byte param1) {
        this.field_e = param0;
        if (param1 <= 32) {
          this.field_g = false;
          return this;
        }
        return this;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          if (param1 != 6) {
            field_h = (int[]) null;
          }
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(sj.field_d);
          param0.addFocusListener(sj.field_d);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "oc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final oc a(int param0, int param1) {
        this.field_c = param0;
        int var3 = 78 / ((-24 - param1) / 37);
        return this;
    }

    final oc a(int param0, byte param1) {
        if (param1 > -96) {
          this.field_g = true;
          this.field_a = param0;
          return this;
        }
        this.field_a = param0;
        return this;
    }

    final void a(byte param0) {
        this.field_i = 256;
        this.field_c = 0;
        this.field_d = 0;
        this.field_e = 0;
        this.field_a = -1;
        int var2 = 64 % ((-27 - param0) / 45);
        this.field_f = null;
        this.field_b = null;
    }

    final oc a(boolean param0, byte param1) {
        if (param1 < -18) {
          this.field_g = param0 ? true : false;
          return this;
        }
        this.field_c = 0;
        this.field_g = param0 ? true : false;
        return this;
    }

    final void a(int param0, lk param1, int param2, byte param3, nd param4) {
        ee stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_5 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          if (param3 != 88) {
            oc.a(101);
          }
          uk.a(this.field_f, (byte) -104, param1.field_q, param2 + param1.field_i, param1.field_h, param1.field_o + param0);
          if (null != this.field_b) {
            var6_int = this.field_d + (param0 + param1.field_o);
            var7 = this.field_c + param2 + param1.field_i;
            if (param4.field_i == 1) {
              var6_int = var6_int + (param1.field_h - this.field_b.field_l) / 2;
            }
            if (param4.field_i == 2) {
              var6_int = var6_int + (param1.field_h - this.field_b.field_l);
            }
            if (param4.field_f == 1) {
              var7 = var7 + (param1.field_q - this.field_b.field_k) / 2;
            }
            if (param4.field_f == 2) {
              var7 = var7 + (-this.field_b.field_k + param1.field_q);
            }
            this.field_b.d(var6_int, var7);
          }
          var6 = param4.b(96, param1);
          if (var6 != null &&
            param4.field_c != null) {
            if (this.field_e < 0) {
              return;
            }
            stackIn_21_0 = param4.field_c;
            stackIn_21_1 = var6;
            if (-2147483648 != this.field_d) {
              stackIn_22_2 = this.field_d;
            } else {
              stackIn_22_2 = 0;
            }
            stackIn_24_2 = stackIn_22_2 + param4.field_k + (param0 + param1.field_o);
            stackIn_24_3 = param4.field_m;
            stackIn_24_4 = param2 + param1.field_i;
            if (this.field_c == -2147483648) {
              stackIn_25_5 = 0;
            } else {
              stackIn_25_5 = this.field_c;
            }
            stackIn_27_3 = stackIn_24_3 + (stackIn_24_4 + stackIn_25_5);
            stackIn_27_4 = -param4.field_k + param1.field_h - param4.field_n;
            stackIn_27_5 = param1.field_q - param4.field_m - param4.field_j;
            stackIn_27_6 = this.field_e;
            stackIn_27_7 = this.field_a;
            if (this.field_i == -2147483648) {
              stackIn_28_8 = 256;
            } else {
              stackIn_28_8 = this.field_i;
            }
            ((ee) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param4.field_i, param4.field_f, param4.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("oc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 > -40) {
          field_h = (int[]) null;
        }
    }

    final oc b(int param0, byte param1) {
        this.field_d = param0;
        int var3 = 86 % ((9 - param1) / 58);
        return this;
    }

    final void a(int param0, oc param1) {
        try {
          if (param0 >= -48) {
            this.field_d = 60;
          }
          param1.field_a = this.field_a;
          param1.field_d = this.field_d;
          param1.field_i = this.field_i;
          param1.field_g = this.field_g;
          param1.field_c = this.field_c;
          param1.field_e = this.field_e;
          param1.field_f = this.field_f;
          param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "oc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, kl param1, String param2, String param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        bg var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tj.field_F != jc.field_P) {
            return false;
          }
          var8 = new bg(sd.field_c, param1);
          sd.field_c.b(var8, (byte) -121);
          if (param5 != 0) {
            oc.a(-71);
          }
          if (md.a((byte) -101)) {
            var8.f((byte) -42);
            return true;
          }
          lh.field_c = param0;
          jc.field_P = hh.field_g;
          mh.field_a = null;
          ri.field_b = param3;
          lf.field_b = param4;
          ji.field_b = param2;
          ok.field_c = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, lk param1, int param2, nd param3, oc param4, byte param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_g) {
            param4.a(param2, param1, param0, (byte) 88, param3);
            param4.a((byte) -80);
          }
          if (this.field_e >= -1) {
            param4.field_e = this.field_e;
          }
          if (this.field_c != -2147483648) {
            param4.field_c = this.field_c;
          }
          if (this.field_f != null) {
            param4.field_f = this.field_f;
          }
          if (null != this.field_b) {
            param4.field_b = this.field_b;
          }
          if (param5 > -7) {
            return;
          }
          if (this.field_d != -2147483648) {
            param4.field_d = this.field_d;
          }
          if (this.field_i != -2147483648) {
            param4.field_i = this.field_i;
          }
          if (this.field_a < -1) {
            return;
          }
          param4.field_a = this.field_a;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("oc.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(')').toString());
        }
    }

    final oc a(kc[] param0, boolean param1) {
        RuntimeException var3 = null;
        oc stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (oc) null;
            return stackIn_2_0;
          }
          this.field_f = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    oc() {
        this.field_b = null;
        this.field_g = false;
        this.field_f = null;
        this.field_a = -2;
        this.field_e = -2;
        this.field_c = -2147483648;
        this.field_d = -2147483648;
        this.field_i = -2147483648;
    }

    static {
        field_h = new int[128];
    }
}
