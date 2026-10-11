/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static int field_a;

    final static gg a(byte param0, ae param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        gg stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 65 / ((-27 - param0) / 52);
          stackIn_1_0 = sp.a(ra.a(param1, 100, param2), -124);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("pf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    final static tp a(boolean param0, boolean param1, int param2) {
        od stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        boolean stackIn_4_3;
        boolean stackIn_5_4 = false;
        tp stackIn_12_0 = null;
        cr stackIn_37_0 = null;
        String stackIn_38_1 = null;
        cr stackIn_41_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_101_0 = null;
        RuntimeException decompiledCaughtException = null;
        tp stackOut_11_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        nj var4 = null;
        Object var5 = null;
        Object var6 = null;
        tp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        b var17 = null;
        String var18 = null;
        int var19 = 0;
        b var17Lifetime1;
        String var18Lifetime1;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          stackIn_4_0 = h.field_D.field_Lb;
          stackIn_4_1 = param2 * ((2 + r.field_f) * 3);
          stackIn_4_2 = 2;
          stackIn_4_3 = param1;
          stackIn_5_4 = (wq.field_M == h.field_D.field_Lb);
          var3_int = ((od) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, -5, 2 + r.field_f) ? 1 : 0;
          var4 = h.field_D.field_Mb.field_M;
          if (param0) {
            pf.a(true, true, 108);
          }
          boolean decompiledFrameCompleted0 = true;
          var5 = null;
          if (ba.field_d == 2) {
            wi.field_g.field_lb = true;
            el.field_a.field_S = Vertigo2.a(new String[]{dg.field_d}, pq.field_a, 0);
            h.field_D.field_Lb.field_Lb.field_S = null;
            var6 = null;
            var7 = (tp) (var4.a((byte) 100));
            while (var7 != null) {
              var8 = 0;
              stackOut_11_0 = var7;
              stackIn_101_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_12_0.field_M == null) {
                var7.field_Jb = new cr(0L, el.field_b);
                var7.b(var7.field_Jb, 119);
                var7.field_Kb = new cr(0L, tm.field_b);
                var7.b(var7.field_Kb, 126);
                var7.field_Ob = new cr(0L, el.field_b);
                var7.b(var7.field_Ob, 125);
                var7.field_Kb.field_O = 2;
                var8 = 1;
                var7.i(-2147483648);
              }
              var7.field_Fb = h.field_D.field_Mb.field_Fb;
              var9 = 0;
              if (null == var7.field_Lb) {
                var10 = 13369344;
                var11 = 16737894;
              } else if (var7.field_Lb == dg.field_d) {
                var11 = 6750054;
                var10 = 52224;
              } else {
                var11 = 16777062;
                var10 = 13421568;
              }
              var12 = 0;
              if (var7.field_Ib != null &&
                !var7.field_Ib.equals("")) {
                var7.field_Ob.field_Db = qr.field_q;
                var7.field_Ob.field_B = var11;
                var12 = 1;
                var7.field_Ob.a(100, qr.field_q.field_x + 3, r.field_f, var9, 0);
              }
              var7.field_Kb.field_B = var11;
              var7.field_Jb.field_B = var11;
              var7.field_Kb.field_A = var10;
              var7.field_Jb.field_A = var10;
              var7.field_Kb.field_K = var11;
              var7.field_Jb.field_K = var11;
              var7.field_Kb.field_H = var11;
              var7.field_Jb.field_H = var11;
              var13 = 0;
              var14 = -2 + var7.field_Fb - 80;
              if (var12 != 0) {
                var13 = 3 + qr.field_q.field_x;
                var14 = var14 - var13;
              }
              stackIn_37_0 = var7.field_Jb;
              if (var14 <= 0) {
                stackIn_38_1 = var7.field_Mb;
              } else {
                stackIn_38_1 = cc.a(var7.field_Jb.field_z, var7.field_Mb, var14);
              }
              stackIn_37_0.field_S = stackIn_38_1;
              var7.field_Jb.a(81, var14, r.field_f, var9, var13);
              stackIn_41_0 = var7.field_Kb;
              if (null == var7.field_Lb) {
                stackIn_42_1 = aq.field_f;
              } else {
                stackIn_42_1 = var7.field_Lb;
              }
              stackIn_41_0.field_S = stackIn_42_1;
              var7.field_Kb.a(97, 80, r.field_f, var9, -80 + var7.field_Fb);
              stackIn_46_0 = (var7.field_Jb.field_S.equals(var7.field_Mb)) ? 0 : 1;
              var15 = stackIn_46_0;
              var9 = var9 + r.field_f;
              if (var3_int == 0) {
                var7.field_kb = var9 - var7.field_db;
              }
              if (var8 != 0) {
                h.field_D.field_Mb.a((byte) 121, (cr) (var6), var7, 2);
              }
              var6 = var7;
              if (var7.field_Ob == null ||
                !var7.field_Ob.field_pb) {
                if (var7.field_tb != 0) {
                  var16 = var7.field_Mb;
                  oq.a(h.field_D.field_Lb, -1, 4462, -1, (String) null, (int[]) null, var7, 0L, var16);
                  if (var7.field_Lb != null &&
                    !ak.a(76, un.field_Lb.field_k) &&
                    !pe.field_r) {
                    if (!hj.field_b) {
                      var17 = un.field_Lb;
                      var18 = Vertigo2.a(new String[]{var16}, sc.field_b, -23);
                      var17.field_n.a(var18, 8, 0);
                    }
                    var17Lifetime1 = un.field_Lb;
                    var18Lifetime1 = Vertigo2.a(new String[]{var16}, hh.field_d, 19);
                    var17Lifetime1.field_n.a(var18Lifetime1, 18, 0);
                  }
                  var5 = var7;
                } else if (var7.field_Jb.field_pb &&
                  var15 != 0) {
                  ko.field_S = var7.field_Mb;
                }
              } else {
                ko.field_S = var7.field_Ib;
              }
              var7 = (tp) (var4.b(122));
            }
            if (decompiledFrameCompleted0) {
              if (h.field_D.field_Hb.field_tb != 0) {
                rc.field_d = new un(h.field_D.field_Hb.field_ob, h.field_D.field_Hb.field_C, h.field_D.field_Hb.field_Fb, h.field_D.field_Hb.field_db, kj.field_A, vf.field_B, ee.field_b, ee.field_b);
                hk.field_n = 0;
              }
              if (h.field_D.field_Kb.field_tb != 0) {
                rc.field_d = new un(h.field_D.field_Kb.field_ob, h.field_D.field_Kb.field_C, h.field_D.field_Kb.field_Fb, h.field_D.field_Kb.field_db, ce.field_a, vf.field_B, ee.field_b, ee.field_b);
                hk.field_n = 1;
              }
            }
          } else {
            wi.field_g.field_lb = false;
            el.field_a.field_S = b.field_f;
            if (ba.field_d != 1) {
              h.field_D.field_Lb.field_Lb.field_S = mq.field_t;
              if (var19 != 0) {
                h.field_D.field_Lb.field_Lb.field_S = tn.field_r;
              }
            } else {
              h.field_D.field_Lb.field_Lb.field_S = tn.field_r;
            }
            tg.a(0, h.field_D.field_Mb);
          }
          if (decompiledFrameCompleted0) {
            stackIn_101_0 = var5;
          }
          return (tp) (stackIn_101_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "pf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = 2;
    }
}
