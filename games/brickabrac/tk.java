/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk extends IntrusiveNode {
    static String field_o;
    static mh field_t;
    static int field_q;
    static jp[][] field_l;
    static int field_r;
    static String field_m;
    static byte[] field_k;
    long field_j;
    static String field_i;
    tk field_n;
    static String field_p;
    tk field_s;

    final void d(int param0) {
        if (null == this.field_n) {
          return;
        }
        this.field_n.field_s = this.field_s;
        this.field_s.field_n = this.field_n;
        this.field_n = null;
        if (param0 != 3) {
          this.field_s = (tk) null;
        }
        this.field_s = null;
    }

    final static void a(int param0, MultiplayerMatch param1, bi param2, PlayerBoard param3, byte param4, int param5, int param6, int param7) {
        int var13 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          var8_int = 5;
          var9 = 5;
          var10 = 3 + param2.field_B + param2.field_P;
          var11 = var8_int + param5;
          var12 = param6 + (var9 + param2.field_B);
          param2.c(jo.field_j, var11, var12, 2, -1);
          var12 = var12 + var10;
          param2.c(lq.field_e, var11, var12, 1, -1);
          var12 = var12 + var10;
          param2.c(ff.field_j, var11, var12, 2, -1);
          var12 = var12 + var10;
          param2.c(vd.field_d, var11, var12, 0, -1);
          if (param4 >= -96) {
            return;
          }
          if (r.field_A &&
            !wl.field_N) {
            return;
          }
          var11 -= 2;
          var12 = var12 + (param2.field_P + 4);
          for (var13 = 0; var13 < -1 + param3.field_rb; var13++) {
            if (var13 < -2 + param3.field_rb) {
              ch.field_l.a(var11, var12, 196);
            } else {
              ch.field_l.e(ch.field_l.field_x / 2 + var11, var12 + ch.field_l.field_z / 2, 0, 4480 + (BrickABrac.c(2048, 200 * de.field_x) * 384 >> 16));
            }
            var11 = var11 + ch.field_l.field_D / 2;
            if (param5 + param7 < var11 + ch.field_l.field_D) {
              var12 = var12 + (ch.field_l.field_C + 2);
              var11 = param5 + var8_int - 2;
            }
            if (var12 + ch.field_l.field_C > param6 - (-param0 + var9)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("tk.VB(").append(param0).append(',');
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
          throw qb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -2) {
          field_p = (String) null;
        }
        field_m = null;
        field_l = (jp[][]) null;
        field_k = null;
        field_i = null;
        field_t = null;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -55) {
            field_k = (byte[]) null;
          }
          stackIn_3_0 = sq.a((byte) -32, param0, true, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tk.QB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final long e(int param0) {
        if (param0 != -19451) {
          this.field_s = (tk) null;
        }
        return this.field_j;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          tk.a((byte) 86, 25, 9);
        }
        if (null == this.field_n) {
          return false;
        }
        return true;
    }

    final void a(long param0, int param1) {
        if (this.field_n != null) {
          throw new RuntimeException();
        }
        if (param1 >= -62) {
          field_k = (byte[]) null;
        }
        this.field_j = param0;
    }

    final static void a(byte param0, int param1, int param2) {
        if (null == cf.field_c ||
          !(param1 <= cf.field_c.length)) {
          cf.field_c = new int[param1 * 2];
        }
        if (ec.field_N == null ||
          !(ec.field_N.length >= param1)) {
          ec.field_N = new int[param1 * 2];
        }
        if (lf.field_r == null ||
          !(lf.field_r.length >= param1)) {
          lf.field_r = new int[param1 * 2];
        }
        if (ao.field_p == null ||
          !(param1 <= ao.field_p.length)) {
          ao.field_p = new int[param1 * 2];
        }
        if (null == ib.field_D ||
          !(param1 <= ib.field_D.length)) {
          ib.field_D = new int[2 * param1];
        }
        if (pj.field_b == null ||
          !(pj.field_b.length >= param1)) {
          pj.field_b = new int[2 * param1];
        }
        if (fj.field_Pb == null ||
          !(param2 + param1 <= fj.field_Pb.length)) {
          fj.field_Pb = new int[2 * (param2 + param1)];
        }
        if (null == ga.field_l ||
          !(ga.field_l.length >= param1)) {
          ga.field_l = new boolean[2 * param1];
        }
        rn.field_l = -2147483648;
        if (param0 < 0) {
          return;
        }
        wi.field_m = 0;
        ba.field_w = 2147483647;
        pe.field_u = 2147483647;
        uf.field_b = -2147483648;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!bd.a(param0, 0, true)) {
            return false;
          }
          var2_int = 0;
          if (param1) {
            var4 = (CharSequence) null;
            tk.a((CharSequence) null, false);
          }
          while (true) {
            if (param0.length() <= var2_int) {
              return true;
            }
            if (m.a(true, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("tk.SB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    protected tk() {
    }

    static {
        field_o = "Honour";
        field_m = "Show game chat from my friends";
        field_k = new byte[]{(byte) 1};
        field_i = "Scamming";
    }
}
