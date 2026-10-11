/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends te {
    private ga field_T;
    static String field_Y;
    private String field_R;
    static im field_X;
    private int field_Q;
    private hj field_W;
    static qg[] field_P;
    static int[] field_U;
    static char[] field_V;
    static int field_S;

    kk(ga param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, kd.a(false));
        try {
          this.field_R = param1;
          this.field_T = param0;
          this.a(param2, param3, param5, (byte) -90, param4);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -81) {
            return false;
          }
          this.field_Q = 3;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var3 = OrbDefence.field_D ? 1 : 0;
        cf.field_a = null;
        dd.field_A = null;
        mc.field_j = 0;
        if (param0 != -30179) {
          return 72;
        }
        int var2 = ta.field_z;
        ta.field_z = hf.field_k;
        hf.field_k = var2;
        kg.field_h.field_b = kg.field_h.field_b + 1;
        if (param1 == 51) {
          kg.field_h.field_n = 2;
        } else {
          if (param1 == 50) {
            kg.field_h.field_n = 5;
          } else {
            kg.field_h.field_n = 1;
          }
        }
        if (2 <= kg.field_h.field_b &&
          param1 == 51) {
          return 2;
        }
        if (kg.field_h.field_b >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (4 <= kg.field_h.field_b) {
          return 1;
        }
        return -1;
    }

    public static void l(int param0) {
        field_Y = null;
        field_U = null;
        field_X = null;
        if (param0 <= 71) {
          return;
        }
        field_P = null;
        field_V = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        qd var6;
        rj var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        hj var14;
        hj var15;
        hj var16;
        qd var6Lifetime1;
        L0: {
          L1: {
            var13 = OrbDefence.field_D ? 1 : 0;
            var6 = this.field_T.d(-7847);
            if (ml.field_a != var6 &&
              var6 != uj.field_b) {
              var5 = this.field_T.a(param2 ^ 1048451);
              if (var5 == null) {
                var5 = this.field_R;
                break L1;
              }
              if (!(var5.equals(this.field_l))) {
                this.field_l = var5;
                this.a((byte) -127);
              }
              break L0;
            }
            var5 = pi.field_g;
          }
          if (!var5.equals(this.field_l)) {
            this.field_l = var5;
            this.a((byte) -127);
          }
        }
        super.a(param0, param1, param2 ^ 0, param3);
        if (param2 != 1048575) {
          this.field_R = (String) null;
        }
        var6Lifetime1 = this.field_T.d(-7847);
        var8 = (rj) ((Object) this.field_j);
        var9 = param3 + this.field_s;
        var10 = var8.a((pj) (this), 9534, param0) + (var8.a((pj) (this), true).b(122) >> 1);
        if (var6Lifetime1 != ml.field_a &&
          uj.field_b != var6Lifetime1) {
          if (vh.field_h == var6Lifetime1) {
            var14 = wd.field_C[2];
            var14.e(var9, var10 - (var14.field_k >> 1), 256);
          } else if (var6Lifetime1 == nc.field_bb) {
            var15 = wd.field_C[1];
            var15.e(var9, -(var15.field_k >> 1) + var10, 256);
          }
        } else {
          var16 = wd.field_C[0];
          var11 = var16.field_s << 1;
          var12 = var16.field_t << 1;
          if (null != this.field_W &&
            var11 <= this.field_W.field_o &&
            this.field_W.field_k >= var12) {
            de.a(-123, this.field_W);
            ul.d();
          } else {
            this.field_W = new hj(var11, var12);
            de.a(param2 - 1048697, this.field_W);
          }
          var16.b(112, 144, var16.field_s << 4, var16.field_t << 4, -this.field_Q << 10, 4096);
          oc.g((byte) -105);
          this.field_W.e(-(var16.field_s >> 1) + var9, -var16.field_t + var10, 256);
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        hj[] var10;
        hj[] var11_ref_hj__;
        int var11;
        int var12;
        hj var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = OrbDefence.field_D ? 1 : 0;
        var9 = param3 + (param1 + param6);
        var10 = new hj[]{new hj(var9, var9), new hj(param0, var9), new hj(var9, var9), new hj(var9, param0), new hj(64, 64), new hj(var9, param0), new hj(var9, var9), new hj(param0, var9), new hj(var9, var9)};
        var11_ref_hj__ = var10;
        for (var12 = 0; var12 < var11_ref_hj__.length; var12++) {
          var13 = var11_ref_hj__[var12];
          for (var14 = 0; var13.field_v.length > var14; var14++) {
            var13.field_v[var14] = param5;
          }
        }
        var11 = 0;
        if (param4 < 28) {
          kk.a(-33, 100);
        }
        while (param1 > var11) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_v[var9 * (-var11 + (var9 - 1)) + var12Lifetime1] = param7;
            var10[8].field_v[var9 * (-1 + (var9 - var11)) + var12Lifetime1] = param7;
            var10[2].field_v[-var11 + (-1 + var9) + var12Lifetime1 * var9] = param7;
            var10[8].field_v[var12Lifetime1 * var9 - var11 - 1 + var9] = param7;
          }
          var11++;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_v[var12Lifetime2 + var11Lifetime1 * var9] = param2;
            var10[0].field_v[var12Lifetime2 * var9 + var11Lifetime1] = param2;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10[2].field_v[var11Lifetime1 * var9 + var12Lifetime2] = param2;
              var10[6].field_v[var11Lifetime1 + var9 * var12Lifetime2] = param2;
            }
          }
        }
        for (var11Lifetime2 = 0; param0 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param1 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_v[param0 * (-1 + (var9 - var12Lifetime3)) + var11Lifetime2] = param7;
            var10[5].field_v[var9 - (1 - (-var12Lifetime3 + var11Lifetime2 * var9))] = param7;
            var10[1].field_v[var11Lifetime2 + var12Lifetime3 * param0] = param2;
            var10[3].field_v[var9 * var11Lifetime2 + var12Lifetime3] = param2;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param0 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param3; var12Lifetime4++) {
            var10[1].field_v[param0 * (-1 + var9 - var12Lifetime4) + var11Lifetime3] = param8;
            var10[3].field_v[var11Lifetime3 * var9 + (-var12Lifetime4 - 1) + var9] = param8;
            var10[7].field_v[var11Lifetime3 + var12Lifetime4 * param0] = param8;
            var10[5].field_v[var9 * var11Lifetime3 + var12Lifetime4] = param8;
          }
        }
        return var10;
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (md.a(-20767, param1)) {
            return false;
          }
          if (me.a(param1, (byte) -44)) {
            return false;
          }
          if (mm.a(param1, (byte) 51)) {
            return false;
          }
          if (param2 == ~param0.length()) {
            return true;
          }
          if (df.a(param1, (byte) 117, param0)) {
            return false;
          }
          if (vh.a(false, param0, param1)) {
            return false;
          }
          if (!l.a(117, param1, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("kk.O(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final String g(int param0) {
        if (param0 == -8235) {
          return null;
        }
        return (String) null;
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
          this.field_Q = this.field_Q + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "kk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_X = new im();
        field_V = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
