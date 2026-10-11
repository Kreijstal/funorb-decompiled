/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends um implements ij {
    static cr field_L;
    private ko field_I;
    static String field_K;
    static int field_M;
    private d field_J;

    final static void i(int param0) {
        if (null != un.field_Lb &&
          null != un.field_Lb.field_l) {
          un.field_Lb.field_l.field_V = false;
        }
        un.field_Lb = null;
        wq.field_M = null;
        int var1 = -53 / ((param0 + 14) / 39);
    }

    final void b(boolean param0) {
        int var2 = 250;
        if (!param0) {
          field_K = (String) null;
        }
        this.field_I.a(false, -var2 + this.field_n >> 1, -25 + (20 + this.field_s) >> 1, 25, 140);
        this.field_J.a(false, 10 + (140 + (this.field_n - var2 >> 1)), (-10 + this.field_s >> 1) + 2, 30, 100);
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        if (this.field_I.a((byte) -5).a(-23996) != qm.field_G) {
          return;
        }
        try {
          nr.a((byte) 115, this.field_I.c(false), this.field_I.a(-32410), this.field_I.i(0));
          int var6_int = -75 / ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ql.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          iq var6 = (iq) null;
          this.a((byte) 54, -43, -84, (iq) null);
        }
        super.a(param0, param1, param2, param3);
        bl.field_N.b(jq.field_d, param2 - (-this.field_o - 4), bl.field_N.field_z + (this.field_t + param3 + 4), 16777215, -1);
    }

    public static void j(int param0) {
        if (param0 != 30560) {
          return;
        }
        field_K = null;
        field_L = null;
    }

    ql(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (ur) null);
        this.field_I = new ko(new ml(10000536), lo.field_i, 0, 0, 140, 25);
        this.field_I.a(-11808, new df());
        this.field_J = new d(vi.field_x, (uf) (this));
        this.field_G = new iq[]{(iq) ((Object) this.field_I), (iq) ((Object) this.field_J)};
        this.field_J.field_B = (ur) ((Object) new vo());
        this.g(-128);
    }

    final static void a(boolean param0, int param1, int param2) {
        od stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        boolean stackIn_3_3;
        boolean stackIn_4_4 = false;
        cr stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nj var4 = null;
        Object var5 = null;
        tp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        b var16 = null;
        b var17 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          stackIn_3_0 = ao.field_O.field_Lb;
          stackIn_3_1 = 3 * (r.field_f + 2) * param2;
          stackIn_3_2 = 2;
          stackIn_3_3 = param0;
          stackIn_4_4 = (ao.field_O.field_Lb == wq.field_M);
          var3_int = ((od) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, -83, r.field_f + 2) ? 1 : 0;
          if (param1 >= -126) {
            return;
          }
          var4 = ao.field_O.field_Mb.field_M;
          if (ba.field_d != 2 &&
            ba.field_d != 1) {
            ao.field_O.field_Lb.field_Lb.field_S = mq.field_t;
            ao.field_O.field_lb = false;
            tg.a(0, ao.field_O.field_Mb);
            return;
          }
          ao.field_O.field_Lb.field_Lb.field_S = null;
          ao.field_O.field_lb = true;
          var5 = null;
          var6 = (tp) (var4.a((byte) 100));
          while (var6 != null) {
            var7 = 0;
            if (var6.field_M == null) {
              var6.field_Jb = new cr(0L, el.field_b);
              var6.b(var6.field_Jb, 123);
              var6.field_Ob = new cr(0L, el.field_b);
              var6.b(var6.field_Ob, 122);
              var7 = 1;
              var6.i(-2147483648);
            }
            var6.field_Fb = ao.field_O.field_Mb.field_Fb;
            var6.field_Jb.a(85, var6.field_Fb, r.field_f, 0, 0);
            var8 = 0;
            if (null != var6.field_Ib &&
              !var6.field_Ib.equals("")) {
              var6.field_Ob.field_B = 16737894;
              var6.field_Ob.field_Db = qr.field_q;
              var6.field_Ob.a(126, qr.field_q.field_x + 3, r.field_f, 0, 0);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_Fb;
            if (var8 != 0) {
              var9 = qr.field_q.field_x + 3;
              var10 = var10 - var9;
            }
            stackIn_20_0 = var6.field_Jb;
            if (0 >= var10) {
              stackIn_21_1 = var6.field_Mb;
            } else {
              stackIn_21_1 = cc.a(var6.field_Jb.field_z, var6.field_Mb, var10);
            }
            stackIn_20_0.field_S = stackIn_21_1;
            stackIn_24_0 = (var6.field_Jb.field_S.equals(var6.field_Mb)) ? 0 : 1;
            var11 = stackIn_24_0;
            var6.field_Jb.a(104, var10, r.field_f, 0, var9);
            if (var3_int == 0) {
              var6.field_kb = r.field_f - var6.field_db;
            }
            if (var7 != 0) {
              ao.field_O.field_Mb.a((byte) 84, (cr) (var5), var6, 2);
            }
            if (null != var6.field_Ob &&
              var6.field_Ob.field_pb) {
              ko.field_S = var6.field_Ib;
            } else {
              if (var6.field_Jb.field_pb &&
                var11 != 0) {
                ko.field_S = var6.field_Mb;
              }
            }
            if (var6.field_tb != 0) {
              oq.a(ao.field_O.field_Lb, -1, 4462, -1, var6.field_Mb, (int[]) null, var6, 0L, var6.field_Hb);
              var16 = un.field_Lb;
              var13_ref_String = eq.field_B;
              var16.field_n.a(var13_ref_String, 7, 0);
              var17 = un.field_Lb;
              var13 = sd.field_N;
              var14 = no.field_e;
              var17.field_n.c(0, var14, -1220, var13, 0);
            }
            var5 = var6;
            var6 = (tp) (var4.b(75));
          }
          if (ao.field_O.field_Hb.field_tb != 0) {
            rc.field_d = new un(ao.field_O.field_Hb.field_ob, ao.field_O.field_Hb.field_C, ao.field_O.field_Hb.field_Fb, ao.field_O.field_Hb.field_db, gp.field_r, vf.field_B, ee.field_b, ee.field_b);
            hk.field_n = 2;
          }
          if (ao.field_O.field_Kb.field_tb == 0) {
            return;
          }
          rc.field_d = new un(ao.field_O.field_Kb.field_ob, ao.field_O.field_Kb.field_C, ao.field_O.field_Kb.field_Fb, ao.field_O.field_Kb.field_db, qc.field_y, vf.field_B, ee.field_b, ee.field_b);
          hk.field_n = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "ql.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        d stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a((byte) 102, param1, param2, param3);
          stackIn_2_0 = this.field_J;
          stackIn_3_1 = (this.field_I.a((byte) -5).a(-23996) == qm.field_G);
          stackIn_2_0.field_F = stackIn_3_1;
          if (param0 < 6) {
            field_L = (cr) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ql.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_K = "Unfortunately we are unable to create an account for you at this time.";
    }
}
