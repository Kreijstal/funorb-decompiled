/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends bd {
    private int field_r;
    private int field_i;
    private String field_s;
    private int field_v;
    static int field_u;
    static String field_t;
    static String[] field_n;
    private int field_q;
    private boolean field_k;
    static ue field_l;
    private qe field_h;
    private int field_j;
    static ia field_p;
    static int[] field_o;
    static int field_m;

    private final nh a(String param0, int param1, qe param2, int param3) {
        nh var5 = null;
        RuntimeException var5_ref = null;
        nh var6 = null;
        nh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new nh(-param2.field_p + param1, param2.field_q + param1, param0.length());
          var5 = var6;
          this.field_d = new nh[]{var6};
          if (param3 < 99) {
            field_t = (String) null;
          }
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("se.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_l = null;
        field_p = null;
        field_t = null;
        if (param0 != -2) {
          se.c((byte) 85);
          field_o = null;
          field_n = null;
          return;
        }
        field_o = null;
        field_n = null;
    }

    final static void a(boolean param0, hh param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          jl.field_b[param2] = di.field_l.nextInt();
          jl.field_b[1] = di.field_l.nextInt();
          ck.field_g.field_g = 0;
          jl.field_b[3] = (int)mi.field_o;
          jl.field_b[2] = (int)(mi.field_o >> 32);
          ck.field_g.c((byte) -113, jl.field_b[0]);
          ck.field_g.c((byte) -71, jl.field_b[1]);
          ck.field_g.c((byte) -109, jl.field_b[2]);
          ck.field_g.c((byte) -107, jl.field_b[3]);
          fd.a(ck.field_g, (byte) -111);
          ck.field_g.c(param3, param2 - 306);
          param1.a((byte) 69, ck.field_g);
          d.field_b.field_g = 0;
          if (!param0) {
            d.field_b.a(16, -110);
          } else {
            d.field_b.a(18, -108);
          }
          d.field_b.field_g = d.field_b.field_g + 2;
          var5_int = d.field_b.field_g;
          d.field_b.c((byte) -123, ce.field_b);
          d.field_b.a(true, gh.field_B);
          var6 = 0;
          if (ah.field_i) {
            var6 = var6 | 1;
          }
          if (qa.field_e) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (lj.field_c != null) {
            var6 = var6 | 16;
          }
          d.field_b.a(var6, param2 - 93);
          var7 = uj.a(ll.b(125), 61);
          if (var7 == null) {
            var7 = "";
          }
          d.field_b.b(false, var7);
          if (null != lj.field_c) {
            d.field_b.a(false, lj.field_c);
          }
          fc.a(ck.field_g, d.field_b, ed.field_j, gg.field_e, 0);
          d.field_b.a((byte) 88, -var5_int + d.field_b.field_g);
          nf.a(-1, (byte) 95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("se.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 != -91) {
          field_n = (String[]) null;
          if (bl.field_a < 10) {
            return false;
          }
          if (ai.field_c) {
            return false;
          }
          return !fc.a((byte) 57) ? true : false;
        }
        if (bl.field_a < 10) {
          return false;
        }
        if (ai.field_c) {
          return false;
        }
        return !fc.a((byte) 57) ? true : false;
    }

    final void a(byte param0, qe param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        nh stackIn_37_0;
        nh stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        nh stackIn_38_0 = null;
        nh stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        nh stackIn_42_0;
        qe stackIn_42_1;
        int stackIn_42_2;
        String stackIn_42_3;
        int stackIn_43_4;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        nh var14 = null;
        int var15 = 0;
        qe var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        int var12Lifetime1;
        var15 = StarCannon.field_A;
        try {
          if (param6 == 0) {
            param6 = param1.field_x;
          }
          if (param7 == null) {
            this.field_d = null;
            return;
          }
          if (this.field_h == param1 &&
            !this.field_k &&
            ~this.field_v == ~param2 &&
            ~param5 == ~this.field_q &&
            ~this.field_r == ~param6 &&
            this.field_i == param4 &&
            ~this.field_j == ~param3 &&
            null != this.field_s &&
            this.field_s.equals(param7)) {
            return;
          }
          this.field_s = param7;
          this.field_i = param4;
          this.field_q = param5;
          this.field_v = param2;
          this.field_h = param1;
          if (param0 < 5) {
            var16 = (qe) null;
            this.a(16, -33, (byte) 44, (String) null, (qe) null);
          }
          this.field_j = param3;
          this.field_r = param6;
          this.field_k = false;
          var17 = new String[param1.a(param7, param3) + 1];
          var18 = var17;
          var10 = Math.max(1, param1.a(param7, new int[]{param3}, var18));
          if (this.field_q == 3 &&
            1 == var10) {
            this.field_q = 1;
          }
          this.field_d = new nh[var10];
          if (this.field_q != 0) {
            if (this.field_q == 1) {
              var11 = (this.field_i - var10 * this.field_r >> 1) + param1.field_p;
            } else {
              if (this.field_q != 2) {
                var12 = (this.field_i - this.field_r * var10) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_r = this.field_r + var12;
                var11 = param1.field_p + var12;
              } else {
                var11 = -(this.field_r * var10) - param1.field_q + this.field_i;
              }
            }
          } else {
            var11 = param1.field_p;
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var17[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = var11 - param1.field_p;
            stackIn_37_3 = var11 + param1.field_q;
            if (var13 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            }
            var14 = new nh(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_d[0] = 0;
            if (var13 != null) {
              var14.field_d[var13.length()] = param1.a(var13);
              stackIn_42_0 = var14;
              stackIn_42_1 = (qe) (param1);
              stackIn_42_2 = 3853;
              stackIn_42_3 = var13;
              if (param2 == 3) {
                stackIn_43_4 = this.a((byte) 85, param3, param1.a(var13), var13);
              } else {
                stackIn_43_4 = 0;
              }
              lb.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_43_4);
            }
            this.field_d[var12Lifetime1] = var14;
            var11 = var11 + param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("se.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final static boolean d(byte param0) {
        int var1 = 62 % ((param0 - 86) / 37);
        return tc.field_x;
    }

    final void a(String param0, int param1, byte param2, int param3, qe param4) {
        nh var8 = null;
        nh var9 = null;
        if (param2 <= 126) {
          this.field_i = -18;
        }
        if (param0 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_h == param4 &&
          this.field_k &&
          this.field_v == 2 &&
          this.field_s != null &&
          this.field_s.equals(param0)) {
          return;
        }
        try {
          this.field_h = param4;
          this.field_k = true;
          this.field_v = 2;
          this.field_s = param0;
          var8 = this.a(param0, param3, param4, 119);
          var9 = var8;
          var9.field_d[0] = param1 - param4.a(param0);
          var9.field_d[param0.length()] = param1;
          lb.a(var9, param4, 3853, param0, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "se.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(qe param0, String param1, int param2, int param3, int param4) {
        nh var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_d = null;
          return;
        }
        if (param0 == this.field_h &&
          this.field_k &&
          this.field_v == 1 &&
          null != this.field_s &&
          this.field_s.equals(param1)) {
          return;
        }
        try {
          this.field_k = true;
          this.field_v = 1;
          this.field_h = param0;
          var8 = this.a(param1, param4, param0, param2 ^ 466572270);
          var7 = param0.a(param1);
          var8.field_d[0] = -(var7 >> 1) + param3;
          var8.field_d[param1.length()] = param3 + (var7 >> 1);
          if (param2 != 466572161) {
            field_u = 97;
          }
          lb.a(var8, param0, 3853, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "se.P(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, String param3, qe param4) {
        nh var7 = null;
        nh var8 = null;
        if (param2 <= 9) {
          return;
        }
        if (param3 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_h == param4 &&
          this.field_k &&
          this.field_v == 0 &&
          this.field_s != null &&
          this.field_s.equals(param3)) {
          return;
        }
        try {
          this.field_s = param3;
          this.field_k = true;
          this.field_v = 0;
          this.field_h = param4;
          var7 = this.a(param3, param0, param4, 123);
          var8 = var7;
          var7.field_d[0] = param1;
          var8.field_d[param3.length()] = param4.a(param3) + param1;
          lb.a(var8, param4, 3853, param3, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "se.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (0 >= u.field_d) {
          if (wk.a(param1 ^ 421)) {
            var2 = 0;
            if (param1 != 480) {
              field_t = (String) null;
            }
            if (kd.field_B == null &&
              vf.field_b) {
              ig.a((byte) 61, var2, param0);
              return;
            }
            return;
          }
          var2Lifetime2 = 1;
          if (param1 != 480) {
            field_t = (String) null;
          }
          if (kd.field_B == null &&
            vf.field_b) {
            ig.a((byte) 61, var2Lifetime2, param0);
            return;
          }
          return;
        }
        if (null == kd.field_B) {
          n.field_a = re.a(0, nb.field_e, 0, true, 640, 480);
        } else {
          n.field_a = kd.field_B.a(2);
          ae.a(2, (byte) 31);
        }
        if (n.field_a == null) {
          var2Lifetime1 = 3;
          if (param1 == 480) {
            if (kd.field_B == null &&
              vf.field_b) {
              ig.a((byte) 61, var2Lifetime1, param0);
              return;
            }
            return;
          }
          field_t = (String) null;
        } else {
          var2Lifetime1 = 2;
          mf.a(true, n.field_a);
          if (param1 != 480) {
            field_t = (String) null;
          }
        }
        if (kd.field_B != null) {
          return;
        }
        if (!vf.field_b) {
          return;
        }
        ig.a((byte) 61, var2Lifetime1, param0);
    }

    public se() {
    }

    static {
        field_t = "Members' Benefits";
        field_u = 256;
    }
}
