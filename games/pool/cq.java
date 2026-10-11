/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String field_e;
    static int field_a;
    static dd[] field_b;
    static vh field_d;
    static ko field_g;
    static int field_c;
    static String field_f;

    public static void a(byte param0) {
        if (param0 != -90) {
          cq.a(-5);
        }
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static void a(boolean param0, int param1) {
        ig.field_j.a(param0, (byte) 118);
        if (param1 < 27) {
          field_a = -63;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static dd[] a(int param0, int param1, int param2, int param3) {
        int var6 = Pool.field_O;
        dd[] var7 = new dd[9];
        dd[] var4 = var7;
        var7[0] = ad.a(param2, param0, 7);
        int var5 = 1;
        if (param1 != 4578) {
          cq.a(true, -89);
        }
        while (var5 < 9) {
          var4[var5] = var4[0];
          var5++;
        }
        var4[4] = ad.a(param3, 64, param1 - 4571);
        return var4;
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        if (param8 == 0) {
          return -1;
        }
        boolean decompiledFrameRemainder0 = true;
        var11 = lh.a(param8, (byte) -75, (long)(param0 + ((param1 << 16) - param3)));
        var12 = lh.a(param8, (byte) -81, (long)(-param3 + (-(param1 << 16) + param0)));
        if (0 < var11 &&
          -param6 + 65536 >= var11 &&
          var12 > var11) {
          var10 = param5 + aj.a(var11, false, param4);
          if (param7 < param9) {
            decompiledFrameRemainder0 = !(param7 > var10);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(var10 > param9);
            }
          } else {
            decompiledFrameRemainder0 = !(var10 < param9);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(var10 > param7);
            }
          }
          if (decompiledFrameRemainder0) {
            return param6 + var11;
          }
        }
        L2: {
          if (var12 > 0 &&
            65536 - param6 >= var12) {
            var10Lifetime1 = param5 + aj.a(var12, false, param4);
            if (param7 >= param9) {
              if (var10Lifetime1 < param9) {
                break L2;
              }
              if (param7 < var10Lifetime1) {
                break L2;
              }
            } else {
              if (var10Lifetime1 < param7) {
                break L2;
              }
              if (param9 < var10Lifetime1) {
                break L2;
              }
            }
            return var12 + param6;
          }
        }
        if (param2 <= -61) {
          return -1;
        }
        return -43;
    }

    final static void a(int param0) {
        al.i(-27397);
        so.field_g = new hq[3];
        so.field_g[0] = new hq(jj.field_Q, -1, 3);
        so.field_g[0].field_d.b((byte) 110, new bk(fn.field_Ob, 100, 0));
        so.field_g[0].field_d.b((byte) -114, new bk(tj.field_eb, 50, 1, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -80, new bk(ie.field_i, 3, 2, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -50, new bk(je.field_a, 1, 3, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) 91, new bk(en.field_d, 300, 4, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) 88, new bk(na.field_b, 150, 5, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -78, new bk(el.field_L, 1, 7, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -110, new bk(om.field_t, 1, 6, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -74, new bk(vj.field_f, 1, -1, so.field_g[0].field_d));
        so.field_g[0].a(false);
        hq dupTemp$0 = new hq(fc.field_e, 2, 0);
        hq arrayValue$1 = so.field_g[0];
        so.field_g[1] = dupTemp$0;
        arrayValue$1.field_j = dupTemp$0;
        if (param0 != 4313) {
          return;
        }
        so.field_g[1].field_d.b((byte) -59, new bk(qq.field_yb, 40, 13, 128));
        so.field_g[1].field_d.b((byte) -43, new bk(dr.field_e, 1, 8, 0));
        so.field_g[1].field_d.b((byte) 99, new bk(ea.field_m, 1, 9, 0));
        so.field_g[1].field_d.b((byte) 87, new bk(gn.field_a, 7, 11, 0));
        so.field_g[1].field_d.b((byte) 99, new bk(lk.field_r, 1, 12, 0));
        so.field_g[1].field_d.b((byte) -6, new bk(g.field_w, 1, -1, 0));
        so.field_g[1].a(false);
        so.field_g[2] = new hq(ep.field_G, 2, 1);
        so.field_g[2].field_d.b((byte) -90, new bk(ca.field_m, 40, 13, 128));
        so.field_g[2].field_d.b((byte) -99, new bk(cf.field_i, 1, 8, 0));
        so.field_g[2].field_d.b((byte) -21, new bk(eq.field_N, 1, 14, 0));
        so.field_g[2].field_d.b((byte) -9, new bk(pl.field_c, 1, 15, 0));
        so.field_g[2].field_d.b((byte) -62, new bk(ui.field_N, 1, 16, 0));
        so.field_g[2].field_d.b((byte) 92, new bk(rc.field_a, 1, -1, 0));
        so.field_g[2].a(false);
    }

    final static eg a(int param0, int param1, int param2, eg param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        eg stackIn_3_0 = null;
        eg stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var6 = Pool.field_O;
        try {
          var5_int = 0;
          if (param1 <= 53) {
            stackIn_3_0 = (eg) null;
            return stackIn_3_0;
          }
          while (var5_int < param3.field_g.length) {
            param3.field_g[var5_int] = param3.field_g[var5_int] - param0;
            var5_int++;
          }
          for (var5_intLifetime1 = 0; param3.field_Y.length > var5_intLifetime1; var5_intLifetime1++) {
            param3.field_Y[var5_intLifetime1] = param3.field_Y[var5_intLifetime1] - param4;
          }
          for (var5_intLifetime2 = 0; var5_intLifetime2 < param3.field_q.length; var5_intLifetime2++) {
            param3.field_q[var5_intLifetime2] = param3.field_q[var5_intLifetime2] - param2;
          }
          param3.a();
          stackIn_13_0 = (eg) (param3);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("cq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_e = "Unpacking sound effects";
        field_g = new ko();
        field_f = "Enter name of friend to add to list";
    }
}
