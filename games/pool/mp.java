/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends ch implements tb {
    static int[] field_P;
    static String field_Q;
    static String field_X;
    private String[] field_T;
    static ko field_R;
    static dd[] field_N;
    private jn field_Y;
    static String field_S;
    static int field_V;
    static int field_O;
    private fe[] field_U;
    static int field_W;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 52 / ((param1 + 42) / 53);
        super.a(param0, (byte) -102, param2, param3);
        if (param0 != 0) {
          return;
        }
        lr var6 = lc.field_O;
        if (this.field_T != null) {
          var6.a(oc.field_h, this.field_C + param2, this.field_D + param3, this.field_l, 20, 16777215, -1, 0, 0, var6.field_w + var6.field_C);
        }
    }

    mp(jn param0) {
        super(0, 0, 0, 0, (fp) null);
        try {
          this.field_Y = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pd var4 = null;
        try {
          this.field_F.d((byte) 87);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_T = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_T[var4_int] = ch.a(false, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new pd(lc.field_O, 0, 1);
            this.field_U = new fe[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_U[var5] = new fe(this.field_T[var5], (cc) (this));
              this.field_U[var5].field_z = (fp) ((Object) var4);
              this.field_U[var5].field_p = ab.field_i;
              this.field_U[var5].a(80, 0, 15, false, 20 + 16 * var5);
              this.a(true, this.field_U[var5]);
            }
            this.field_U[var3_int] = new fe(be.field_J, (cc) (this));
            this.field_U[var3_int].field_z = (fp) ((Object) var4);
            this.field_U[var3_int].a(100, 0, 15, param0, 20 - (-(16 * var3_int) - 16));
            this.a(true, this.field_U[var3_int]);
            return;
          }
          this.field_T = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mp.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean g(byte param0) {
        if (param0 >= -77) {
          mp.a(9);
        }
        return !hr.field_y ? true : false;
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a(param3, 3);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(param3, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("mp.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11;
        var11 = Pool.field_O;
        if (param5 != 13375) {
          return;
        }
        if (!param4 && (fr.field_s != qh.field_l ||
          qh.field_f != f.field_h) && (qh.field_f == sh.field_P.field_k &&
          sh.field_P.field_e == qh.field_l)) {
          if (null == em.field_L) {
            if (tp.field_e == null) {
              f.a(48);
            } else {
              al.a(true, 0);
            }
          } else {
            al.a(false, 0);
          }
        }
        if (!param4) {
          tn.field_u = (fr.field_s - 640) / 2;
        } else {
          tn.field_u = fd.field_I;
        }
        pf.a(param4, param5 ^ -13418);
        if (hb.field_a > 0) {
          ie.a(param4, param1, param5 - 13502, param9);
        }
        gi.field_o.field_tb = pa.field_M.field_tb;
        gi.field_o.field_Fb = 1;
        if (uf.field_z > 0) {
          wk.a(param4, param9, param1, 112);
        }
        if (nj.field_b > 0) {
          fe.a(param8, param4, param1, -102, param9);
        }
        if (nr.field_bb &&
          em.field_L.field_Nb <= em.field_L.field_mc) {
          ci.field_c.field_Sb.field_nb = ro.field_p;
          c.field_e.field_pb = false;
          mq.a(ci.field_c.field_Rb, (byte) 109);
        } else {
          c.field_e.field_pb = true;
          ci.field_c.field_Sb.field_nb = null;
          rk.a(param7, param0, ci.field_c, param9, (byte) -83);
        }
        mk.a(param3, 0, param9, param7, param6, param2, param0);
        rk.a(param7, param0, wo.field_f, param9, (byte) -83);
        va.field_V = va.field_V + 1;
    }

    public static void a(int param0) {
        field_N = null;
        field_Q = null;
        if (param0 != 160) {
          return;
        }
        field_S = null;
        field_R = null;
        field_X = null;
        field_P = null;
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pool.field_O;
        try {
          if (!param0) {
            return;
          }
          for (var6_int = 0; var6_int < this.field_T.length; var6_int++) {
            if (this.field_U[var6_int] == param3) {
              this.field_Y.a(this.field_T[var6_int], 35);
            }
          }
          if (param3 == this.field_U[this.field_T.length]) {
            this.field_Y.a(16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("mp.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, nm param2, int param3) {
        try {
          kp.field_d = param1;
          qe.field_o = param0;
          int var4_int = 87 % ((40 - param3) / 48);
          db.field_Vb = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mp.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_P = new int[8192];
        field_Q = "ss.ff";
        field_R = null;
        field_X = "EXCLUSIVE";
    }
}
