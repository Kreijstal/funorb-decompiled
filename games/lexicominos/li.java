/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends bc {
    static aj field_R;
    private ma field_N;
    static mb field_T;
    static int field_S;
    private int field_M;
    private String field_O;
    private db field_Q;
    static String field_P;

    final boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        w var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 44) {
            var4 = (w) null;
            this.a((byte) -87, (w) null, 66, 22);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("li.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void g(boolean param0) {
        vc.field_K[61] = 27;
        vc.field_K[93] = 43;
        if (!param0) {
          vc.field_K[46] = 72;
          vc.field_K[45] = 26;
          vc.field_K[92] = 74;
          vc.field_K[44] = 71;
          vc.field_K[47] = 73;
          vc.field_K[59] = 57;
          vc.field_K[222] = 58;
          vc.field_K[520] = 59;
          vc.field_K[192] = 28;
          vc.field_K[91] = 42;
          return;
        }
        field_S = -24;
        vc.field_K[46] = 72;
        vc.field_K[45] = 26;
        vc.field_K[92] = 74;
        vc.field_K[44] = 71;
        vc.field_K[47] = 73;
        vc.field_K[59] = 57;
        vc.field_K[222] = 58;
        vc.field_K[520] = 59;
        vc.field_K[192] = 28;
        vc.field_K[91] = 42;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
          this.field_M = this.field_M + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "li.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    li(ma param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, t.b(-11));
        try {
          this.field_O = param1;
          this.field_N = param0;
          this.a(param5, param4, true, param3, param2);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String b(int param0) {
        if (param0 > 121) {
          return null;
        }
        return (String) null;
    }

    public static void a(byte param0) {
        field_T = null;
        field_R = null;
        field_P = null;
        if (param0 < 64) {
          li.g(false);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5;
        sc var6;
        int var13;
        ub var8;
        int var9;
        int var10;
        int var11;
        int var12;
        db var15;
        db var16;
        db var17;
        db var18;
        int var11Lifetime1;
        int var12Lifetime1;
        sc var6Lifetime1;
        var13 = Lexicominos.field_L ? 1 : 0;
        var6 = this.field_N.b((byte) 125);
        if (var6 != jj.field_e &&
          be.field_q != var6) {
          var5 = this.field_N.a((byte) 100);
          if (var5 == null) {
            var5 = this.field_O;
          }
        } else {
          var5 = gg.field_c;
        }
        if (!var5.equals(this.field_u)) {
          this.field_u = var5;
          this.f(true);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_N.b((byte) 119);
        var8 = (ub) ((Object) this.field_i);
        var9 = param2 + this.field_t;
        var10 = var8.a((w) (this), param0 ^ -20231, param1) + (var8.a((w) (this), (byte) 101).a(0) >> 1);
        if (var6Lifetime1 == jj.field_e) {
          var18 = be.field_b[0];
          var11 = var18.field_r << 1;
          var12 = var18.field_x << 1;
          if (null == this.field_Q) {
            this.field_Q = new db(var11, var12);
            de.a(this.field_Q, 6);
          } else {
            if (var11 > this.field_Q.field_p) {
              this.field_Q = new db(var11, var12);
              de.a(this.field_Q, 6);
            } else {
              if (var12 > this.field_Q.field_u) {
                this.field_Q = new db(var11, var12);
                de.a(this.field_Q, 6);
              } else {
                de.a(this.field_Q, 6);
                lf.a();
              }
            }
          }
          var18.a(112, 144, var18.field_r << 4, var18.field_x << 4, -this.field_M << 10, 4096);
          pd.a(-22949);
          this.field_Q.d(-(var18.field_r >> 1) + var9, var10 - var18.field_x, 256);
          return;
        }
        if (be.field_q != var6Lifetime1) {
          if (ni.field_b == var6Lifetime1) {
            var15 = be.field_b[2];
            var15.d(var9, var10 - (var15.field_u >> 1), 256);
            return;
          }
          if (rh.field_p == var6Lifetime1) {
            var16 = be.field_b[1];
            var16.d(var9, var10 - (var16.field_u >> 1), 256);
          }
          return;
        }
        var17 = be.field_b[0];
        var11Lifetime1 = var17.field_r << 1;
        var12Lifetime1 = var17.field_x << 1;
        if (null == this.field_Q) {
          this.field_Q = new db(var11Lifetime1, var12Lifetime1);
          de.a(this.field_Q, 6);
        } else {
          if (var11Lifetime1 > this.field_Q.field_p) {
            this.field_Q = new db(var11Lifetime1, var12Lifetime1);
            de.a(this.field_Q, 6);
          } else {
            if (var12Lifetime1 > this.field_Q.field_u) {
              this.field_Q = new db(var11Lifetime1, var12Lifetime1);
              de.a(this.field_Q, 6);
            } else {
              de.a(this.field_Q, 6);
              lf.a();
            }
          }
        }
        var17.a(112, 144, var17.field_r << 4, var17.field_x << 4, -this.field_M << 10, 4096);
        pd.a(-22949);
        this.field_Q.d(-(var17.field_r >> 1) + var9, var10 - var17.field_x, 256);
        return;
    }

    static {
        field_S = 0;
        field_R = new aj(9, 0, 4, 1);
        field_P = "Waiting for fonts";
    }
}
