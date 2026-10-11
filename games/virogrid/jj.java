/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    private int field_j;
    private int field_b;
    private boolean field_d;
    private int field_e;
    mg[] field_k;
    private int field_l;
    mg field_c;
    static hh field_f;
    static String field_g;
    static km field_a;
    static km field_m;
    static String field_i;
    private int field_h;
    static uk field_n;

    final void a(int param0) {
        this.field_h = 256;
        if (param0 != 31749) {
          return;
        }
        this.field_j = 0;
        this.field_l = 0;
        this.field_b = 0;
        this.field_e = -1;
        this.field_k = null;
        this.field_c = null;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 55) {
          field_g = (String) null;
        }
        field_g = null;
        field_i = null;
        field_f = null;
        field_m = null;
    }

    final jj a(int param0, mg[] param1) {
        RuntimeException var3 = null;
        jj stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = param1;
          if (param0 == -8779) {
            return this;
          }
          stackIn_2_0 = (jj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, jj param1) {
        param1.field_e = this.field_e;
        param1.field_k = this.field_k;
        param1.field_b = this.field_b;
        param1.field_c = this.field_c;
        param1.field_d = this.field_d;
        param1.field_l = this.field_l;
        if (param0 != 13598) {
          return;
        }
        try {
          param1.field_j = this.field_j;
          param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "jj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static mg[] a(String param0, eh param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mg[] stackIn_2_0 = null;
        mg[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(-1, param0);
          var5 = param1.a(-57, var4_int, param3);
          if (!param2) {
            stackIn_4_0 = tm.a(param1, var4_int, 4, var5);
            return stackIn_4_0;
          }
          stackIn_2_0 = (mg[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("jj.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final jj a(boolean param0, int param1) {
        this.field_d = param0 ? true : false;
        if (param1 != 0) {
          field_i = (String) null;
        }
        return this;
    }

    final static void a(int param0, km param1, byte[] param2, int param3, km param4, int param5, int param6, int param7, int param8, km param9) {
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          hh.field_d = -1L;
          lk.field_Pb = param2;
          la.field_l = param8;
          vb.field_h = param2.length;
          kn.field_E = new byte[(7 + la.field_l) / param3];
          la.field_h = null;
          ld.field_c = false;
          wl.field_d = null;
          var10_int = 0;
          for (var11 = 0; var11 < lk.field_Pb.length; var11++) {
            var10_int = var10_int + (lk.field_Pb[var11] & 255);
          }
          var10_int = (var10_int + 7) / 8;
          pm.field_p = new byte[var10_int];
          if (param9.field_W == null) {
            param9.field_W = new p();
          }
          ci.field_o = param9.field_W;
          ci.field_o.a(false);
          ti.field_i = new kf(param7);
          ea.field_a = 0;
          nh.field_c = -1;
          sb.field_i = -1;
          wl.field_b = 0;
          if (null == param1.field_W) {
            param1.field_W = new p();
          }
          te.field_f = param1.field_W;
          te.field_f.a(false);
          ma.field_c = new kf(param5);
          if (null == param4.field_W) {
            param4.field_W = new p();
          }
          qm.field_Mb = param4.field_W;
          qm.field_Mb.a(false);
          ah.field_h = new kf(param0);
          fn.field_c = param6;
          d.field_Eb = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("jj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final jj a(int param0, int param1) {
        this.field_l = param0;
        if (param1 < 123) {
          this.field_h = 36;
        }
        return this;
    }

    final jj b(boolean param0, int param1) {
        this.field_b = param1;
        if (!param0) {
          jj.a((byte) -66);
        }
        return this;
    }

    final void a(fi param0, int param1, nl param2, int param3, int param4) {
        e stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_24_6 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_8;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          tm.a(param4 + param0.field_l, param3 + param0.field_u, false, param0.field_g, param0.field_m, this.field_k);
          if (null != this.field_c) {
            var6_int = param0.field_l + (param4 + this.field_j);
            if (param2.field_j == 1) {
              var6_int = var6_int + (param0.field_g - this.field_c.field_u) / 2;
            }
            var7 = this.field_l + param3 + param0.field_u;
            if (1 == param2.field_k) {
              var7 = var7 + (param0.field_m - this.field_c.field_z) / 2;
            }
            if (param2.field_j == 2) {
              var6_int = var6_int + (-this.field_c.field_u + param0.field_g);
            }
            if (param2.field_k == 2) {
              var7 = var7 + (param0.field_m - this.field_c.field_z);
            }
            this.field_c.d(var6_int, var7);
          }
          var6 = param2.c(param0, 218479361);
          if (var6 != null &&
            param2.field_i != null &&
            0 <= this.field_b) {
            stackIn_20_0 = param2.field_i;
            stackIn_20_1 = var6;
            if (this.field_j != -2147483648) {
              stackIn_21_2 = this.field_j;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_23_2 = stackIn_21_2 + param4 - (-param0.field_l - param2.field_p);
            stackIn_23_3 = param2.field_n;
            stackIn_23_4 = param0.field_u;
            stackIn_23_5 = param3;
            if (-2147483648 == this.field_l) {
              stackIn_24_6 = 0;
            } else {
              stackIn_24_6 = this.field_l;
            }
            stackIn_26_3 = stackIn_23_3 + (stackIn_23_4 + (stackIn_23_5 + stackIn_24_6));
            stackIn_26_4 = -param2.field_d + (param0.field_g - param2.field_p);
            stackIn_26_5 = param0.field_m - (param2.field_n + param2.field_r);
            stackIn_26_6 = this.field_b;
            stackIn_26_7 = this.field_e;
            if (this.field_h != -2147483648) {
              stackIn_27_8 = this.field_h;
            } else {
              stackIn_27_8 = 256;
            }
            ((e) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param2.field_j, param2.field_k, param2.field_f);
          }
          if (param1 != 2) {
            this.field_l = 118;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_33_0 = var6_ref;
          stackIn_33_1 = new StringBuilder().append("jj.I(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final jj a(byte param0, int param1) {
        this.field_j = param1;
        if (param0 != 64) {
          return (jj) null;
        }
        return this;
    }

    final jj b(int param0, int param1) {
        if (param1 != -26973) {
          field_m = (km) null;
        }
        this.field_e = param0;
        return this;
    }

    final void a(int param0, nl param1, byte param2, jj param3, fi param4, int param5) {
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
          if (this.field_d) {
            param3.a(param4, 2, param1, param0, param5);
            param3.a(31749);
          }
          if (this.field_c != null) {
            param3.field_c = this.field_c;
          }
          if (-2147483648 != this.field_j) {
            param3.field_j = this.field_j;
          }
          if (-1 <= this.field_b) {
            param3.field_b = this.field_b;
          }
          if (this.field_k != null) {
            param3.field_k = this.field_k;
          }
          if (this.field_l != -2147483648) {
            param3.field_l = this.field_l;
          }
          if (this.field_e >= -1) {
            param3.field_e = this.field_e;
          }
          if (param2 != -12) {
            return;
          }
          if (this.field_h != -2147483648) {
            param3.field_h = this.field_h;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("jj.C(").append(param0).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(')').toString());
        }
    }

    jj() {
        this.field_b = -2;
        this.field_l = -2147483648;
        this.field_e = -2;
        this.field_k = null;
        this.field_d = false;
        this.field_j = -2147483648;
        this.field_c = null;
        this.field_h = -2147483648;
    }

    static {
        field_f = new hh();
        field_i = "Use this alternative as your account name";
        field_n = null;
    }
}
