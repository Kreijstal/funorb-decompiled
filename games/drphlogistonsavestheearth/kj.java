/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_i;
    nh[] field_c;
    nh field_e;
    static int[] field_b;
    static int[][] field_f;
    static int field_a;
    private int field_d;
    private boolean field_j;
    private int field_k;
    static he[] field_g;
    private int field_l;
    private int field_h;

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 59) {
            field_g = (he[]) null;
          }
          if (param0 != null &&
            param0.length() >= ni.field_t &&
            param0.length() <= uk.field_g) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("kj.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final kj a(int param0, int param1) {
        this.field_l = param1;
        if (param0 != -4130) {
          kj var4 = (kj) null;
          this.a((byte) 61, (kj) null);
          return this;
        }
        return this;
    }

    public static void a(int param0) {
        field_g = null;
        field_f = (int[][]) null;
        if (param0 != 14970) {
          kj.a(89);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final void a(byte param0, kj param1) {
        try {
          param1.field_h = this.field_h;
          if (param0 != -7) {
            field_a = -35;
          }
          param1.field_j = this.field_j;
          param1.field_l = this.field_l;
          param1.field_k = this.field_k;
          param1.field_c = this.field_c;
          param1.field_i = this.field_i;
          param1.field_d = this.field_d;
          param1.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "kj.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final kj b(int param0, int param1) {
        if (param0 != 256) {
          return (kj) null;
        }
        this.field_h = param1;
        return this;
    }

    final kj a(nh[] param0, int param1) {
        RuntimeException var3 = null;
        kj stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -47) {
            stackIn_2_0 = (kj) null;
            return stackIn_2_0;
          }
          this.field_c = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kj.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final kj a(byte param0, int param1) {
        this.field_i = param1;
        if (param0 < 65) {
          return (kj) null;
        }
        return this;
    }

    final kj a(byte param0, boolean param1) {
        if (param0 > 84) {
          this.field_j = param1 ? true : false;
          return this;
        }
        String var4 = (String) null;
        kj.a(13, 21, (String) null);
        this.field_j = param1 ? true : false;
        return this;
    }

    final void a(int param0, ch param1, boolean param2, int param3, vg param4, kj param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_j) {
            param5.a(param1, param4, true, param3, param0);
            param5.b(0);
          }
          if (this.field_c != null) {
            param5.field_c = this.field_c;
          }
          if (this.field_l != -2147483648) {
            param5.field_l = this.field_l;
          }
          if (this.field_i != -2147483648) {
            param5.field_i = this.field_i;
          }
          if (this.field_d != -2147483648) {
            param5.field_d = this.field_d;
          }
          if (this.field_e != null) {
            param5.field_e = this.field_e;
          }
          if (!param2) {
            kj.a(13);
          }
          if (this.field_k >= -1) {
            param5.field_k = this.field_k;
          }
          if (this.field_h < -1) {
            return;
          }
          param5.field_h = this.field_h;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("kj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static og a(int param0, int param1, String param2) {
        og var3 = null;
        RuntimeException var3_ref = null;
        og stackIn_2_0 = null;
        og stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4) {
            stackIn_2_0 = (og) null;
            return stackIn_2_0;
          }
          var3 = new og(false);
          var3.field_g = param2;
          var3.field_a = param0;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("kj.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void b(int param0) {
        this.field_k = -1;
        this.field_c = null;
        this.field_h = param0;
        this.field_d = 256;
        this.field_e = null;
        this.field_l = 0;
        this.field_i = 0;
    }

    final kj c(int param0, int param1) {
        this.field_k = param0;
        if (param1 < 13) {
          return (kj) null;
        }
        return this;
    }

    final void a(ch param0, vg param1, boolean param2, int param3, int param4) {
        rf stackIn_20_0;
        String stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_21_4 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          am.a(param1.field_m + param3, param1.field_k, param1.field_w, this.field_c, 14673, param4 + param1.field_o);
          if (null != this.field_e) {
            var6_int = param1.field_o + param4 + this.field_i;
            var7 = param3 + (param1.field_m + this.field_l);
            if (param0.field_p == 1) {
              var6_int = var6_int + (param1.field_w - this.field_e.field_z) / 2;
            }
            if (param0.field_p == 2) {
              var6_int = var6_int + (-this.field_e.field_z + param1.field_w);
            }
            if (param0.field_c == 1) {
              var7 = var7 + (param1.field_k - this.field_e.field_C) / 2;
            }
            if (param0.field_c == 2) {
              var7 = var7 + (param1.field_k - this.field_e.field_C);
            }
            this.field_e.d(var6_int, var7);
          }
          if (!param2) {
            this.field_e = (nh) null;
          }
          var6 = param0.b(-121, param1);
          if (var6 != null &&
            param0.field_g != null) {
            if (this.field_h < 0) {
              return;
            }
            stackIn_20_0 = param0.field_g;
            stackIn_20_1 = var6;
            stackIn_20_2 = param0.field_j + param4;
            stackIn_20_3 = param1.field_o;
            if (this.field_i == -2147483648) {
              stackIn_21_4 = 0;
            } else {
              stackIn_21_4 = this.field_i;
            }
            stackIn_23_2 = stackIn_20_2 + (stackIn_20_3 + stackIn_21_4);
            if (this.field_l != -2147483648) {
              stackIn_24_3 = this.field_l;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + (param1.field_m + param3) + param0.field_d;
            stackIn_26_4 = -param0.field_j + param1.field_w - param0.field_k;
            stackIn_26_5 = -param0.field_m + (param1.field_k - param0.field_d);
            stackIn_26_6 = this.field_h;
            stackIn_26_7 = this.field_k;
            if (this.field_d != -2147483648) {
              stackIn_27_8 = this.field_d;
            } else {
              stackIn_27_8 = 256;
            }
            ((rf) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param0.field_p, param0.field_c, param0.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("kj.G(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    kj() {
        this.field_i = -2147483648;
        this.field_e = null;
        this.field_k = -2;
        this.field_j = false;
        this.field_d = -2147483648;
        this.field_c = null;
        this.field_l = -2147483648;
        this.field_h = -2;
    }

    static {
        field_b = new int[13];
        field_f = new int[][]{new int[]{25, 140, 300, 35, 180, 250, 300, 35, 0}, new int[]{25}, new int[]{25}, new int[]{25, 160, 320}, new int[]{25}, new int[]{25}, new int[]{25, 160, 320}, new int[]{25}, new int[]{25}};
        field_b[7] = 200;
        field_b[0] = 200;
        field_b[5] = 200;
        field_b[8] = 200;
        field_b[1] = 200;
        field_b[2] = 180;
        field_b[3] = 80;
        field_b[9] = 100;
        field_b[11] = 200;
        field_b[4] = 200;
        field_b[6] = 200;
        field_b[10] = 200;
    }
}
