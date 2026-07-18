/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ql extends um implements ij {
    static cr field_L;
    private ko field_I;
    static String field_K;
    static int field_M;
    private d field_J;

    final static void i(int param0) {
        if (null != un.field_Lb) {
            if (!(null == un.field_Lb.field_l)) {
                un.field_Lb.field_l.field_V = false;
            }
        }
        un.field_Lb = null;
        wq.field_M = null;
        int var1 = -53 / ((param0 - -14) / 39);
    }

    final void b(boolean param0) {
        int var2 = 250;
        if (!param0) {
            field_K = null;
        }
        ((ql) this).field_I.a(false, -var2 + ((ql) this).field_n >> 1, -25 + (20 + ((ql) this).field_s) >> 1, 25, 140);
        ((ql) this).field_J.a(false, 10 + (140 + (((ql) this).field_n + -var2 >> 1)), (-10 + ((ql) this).field_s >> 1) + 2, 30, 100);
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        if (!(((ql) this).field_I.a((byte) -5).a(-23996) == qm.field_G)) {
            return;
        }
        try {
            nr.a((byte) 115, ((ql) this).field_I.c(false), ((ql) this).field_I.a(-32410), ((ql) this).field_I.i(0));
            int var6_int = -75 / ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ql.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            Object var6 = null;
            ((ql) this).a((byte) 54, -43, -84, (iq) null);
        }
        super.a(param0, param1, param2, param3);
        bl.field_N.b(jq.field_d, param2 - (-((ql) this).field_o + -4), bl.field_N.field_z + (((ql) this).field_t + param3 + 4), 16777215, -1);
    }

    public static void j() {
        field_K = null;
        field_L = null;
    }

    ql(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (ur) null);
        ((ql) this).field_I = new ko((ur) (Object) new ml(10000536), lo.field_i, 0, 0, 140, 25);
        ((ql) this).field_I.a(-11808, new df());
        ((ql) this).field_J = new d(vi.field_x, (uf) this);
        ((ql) this).field_G = new iq[]{(iq) (Object) ((ql) this).field_I, (iq) (Object) ((ql) this).field_J};
        ((ql) this).field_J.field_B = (ur) (Object) new vo();
        ((ql) this).g(-128);
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        od stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        boolean stackIn_2_3 = false;
        od stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_3_3 = false;
        od stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_4_3 = false;
        int stackIn_4_4 = 0;
        cr stackIn_19_0 = null;
        cr stackIn_20_0 = null;
        cr stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        od stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        boolean stackOut_1_3 = false;
        od stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        boolean stackOut_3_3 = false;
        int stackOut_3_4 = 0;
        od stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        boolean stackOut_2_3 = false;
        int stackOut_2_4 = 0;
        cr stackOut_18_0 = null;
        cr stackOut_20_0 = null;
        String stackOut_20_1 = null;
        cr stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = ao.field_O.field_Lb;
              stackOut_1_1 = 3 * (r.field_f - -2) * param2;
              stackOut_1_2 = 2;
              stackOut_1_3 = param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (ao.field_O.field_Lb != wq.field_M) {
                stackOut_3_0 = (od) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                break L1;
              } else {
                stackOut_2_0 = (od) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L1;
              }
            }
            var3_int = ((od) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, -83, r.field_f + 2) ? 1 : 0;
            L2: {
              L3: {
                var4 = ao.field_O.field_Mb.field_M;
                if (ba.field_d == 2) {
                  break L3;
                } else {
                  if (ba.field_d != 1) {
                    ao.field_O.field_Lb.field_Lb.field_S = mq.field_t;
                    ao.field_O.field_lb = false;
                    tg.a(0, ao.field_O.field_Mb);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ao.field_O.field_Lb.field_Lb.field_S = null;
              ao.field_O.field_lb = true;
              var5 = null;
              var6 = (tp) (Object) var4.a((byte) 100);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (ao.field_O.field_Hb.field_tb == 0) {
                      break L5;
                    } else {
                      rc.field_d = new un(ao.field_O.field_Hb.field_ob, ao.field_O.field_Hb.field_C, ao.field_O.field_Hb.field_Fb, ao.field_O.field_Hb.field_db, gp.field_r, vf.field_B, ee.field_b, ee.field_b);
                      hk.field_n = 2;
                      break L5;
                    }
                  }
                  if (ao.field_O.field_Kb.field_tb == 0) {
                    break L2;
                  } else {
                    rc.field_d = new un(ao.field_O.field_Kb.field_ob, ao.field_O.field_Kb.field_C, ao.field_O.field_Kb.field_Fb, ao.field_O.field_Kb.field_db, qc.field_y, vf.field_B, ee.field_b, ee.field_b);
                    hk.field_n = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (var6.field_M != null) {
                      break L6;
                    } else {
                      var6.field_Jb = new cr(0L, el.field_b);
                      var6.b(var6.field_Jb, 123);
                      var6.field_Ob = new cr(0L, el.field_b);
                      var6.b(var6.field_Ob, 122);
                      var7 = 1;
                      var6.i(-2147483648);
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_Fb = ao.field_O.field_Mb.field_Fb;
                    var6.field_Jb.a(85, var6.field_Fb, r.field_f, 0, 0);
                    var8 = 0;
                    if (null == var6.field_Ib) {
                      break L7;
                    } else {
                      if (var6.field_Ib.equals((Object) (Object) "")) {
                        break L7;
                      } else {
                        var6.field_Ob.field_B = 16737894;
                        var6.field_Ob.field_Db = qr.field_q;
                        var6.field_Ob.a(126, qr.field_q.field_x + 3, r.field_f, 0, 0);
                        var8 = 1;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_Fb;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = qr.field_q.field_x - -3;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_18_0 = var6.field_Jb;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (0 >= var10) {
                      stackOut_20_0 = (cr) (Object) stackIn_20_0;
                      stackOut_20_1 = var6.field_Mb;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (cr) (Object) stackIn_19_0;
                      stackOut_19_1 = cc.a(var6.field_Jb.field_z, var6.field_Mb, var10);
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_S = stackIn_21_1;
                    if (var6.field_Jb.field_S.equals((Object) (Object) var6.field_Mb)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L10;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_24_0;
                    var6.field_Jb.a(104, var10, r.field_f, 0, var9);
                    if (var3_int == 0) {
                      var6.field_kb = r.field_f + -var6.field_db;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      ao.field_O.field_Mb.a((byte) 84, (cr) var5, (cr) (Object) var6, 2);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var6.field_Ob) {
                        break L14;
                      } else {
                        if (var6.field_Ob.field_pb) {
                          ko.field_S = var6.field_Ib;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Jb.field_pb) {
                      break L13;
                    } else {
                      if (var11 == 0) {
                        break L13;
                      } else {
                        ko.field_S = var6.field_Mb;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var6.field_tb != 0) {
                      oq.a(ao.field_O.field_Lb, -1, 4462, -1, var6.field_Mb, (int[]) null, (cr) (Object) var6, 0L, var6.field_Hb);
                      var16 = un.field_Lb;
                      var13_ref_String = eq.field_B;
                      var16.field_n.a(var13_ref_String, 7, 0);
                      var17 = un.field_Lb;
                      var13 = sd.field_N;
                      var14 = no.field_e;
                      var17.field_n.c(0, var14, -1220, var13, 0);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var5 = (Object) (Object) var6;
                  var6 = (tp) (Object) var4.b(75);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "ql.A(" + param0 + ',' + -127 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        d stackIn_1_0 = null;
        d stackIn_2_0 = null;
        d stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        d stackOut_0_0 = null;
        d stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        d stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) 102, param1, param2, param3);
              stackOut_0_0 = ((ql) this).field_J;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((ql) this).field_I.a((byte) -5).a(-23996) != qm.field_G) {
                stackOut_2_0 = (d) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (d) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              stackIn_3_0.field_F = stackIn_3_1 != 0;
              if (param0 >= 6) {
                break L2;
              } else {
                field_L = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ql.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Unfortunately we are unable to create an account for you at this time.";
    }
}
