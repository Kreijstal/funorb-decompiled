/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ca {
    static int[] field_i;
    static km field_a;
    static int field_j;
    static um field_b;
    static tk field_h;
    static String field_e;
    static String field_f;
    static String field_c;
    static ci field_g;
    static String field_d;

    final static void a(int param0, byte param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          qb.field_b = param2;
          if (param1 != 107) {
            ca.a(-24);
          }
          ni.field_d = param0;
          cm.field_w = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "ca.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          a.a(102, (java.awt.Component) ((Object) param1));
          if (param0 != 13369344) {
            return;
          }
          he.a(-108, (java.awt.Component) ((Object) param1));
          if (null != ii.field_L) {
            ii.field_L.a((byte) 123, (java.awt.Component) ((Object) param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ca.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 13421568) {
            field_j = 38;
          }
          stackIn_4_0 = 1900 + new Date().getYear();
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "ca.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_b = null;
          field_f = null;
          int var1_int = -48 % ((param0 + 33) / 52);
          field_a = null;
          field_i = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_h = null;
          field_c = null;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ca.F(" + param0 + ')');
        }
    }

    final static ve a(boolean param0, int param1, int param2) {
        nb stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        ci stackIn_46_0 = null;
        String stackIn_47_1 = null;
        ci stackIn_50_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jc var4 = null;
        Object var5 = null;
        Object var6 = null;
        ve var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dh var17 = null;
        String var18 = null;
        int var19 = 0;
        dh var17Lifetime1;
        String var18Lifetime1;
        var19 = Chess.field_G;
        try {
          stackIn_4_0 = ea.field_bb.field_Kb;
          stackIn_5_1 = (ud.field_d == ea.field_bb.field_Kb);
          var3_int = ((nb) (Object) stackIn_4_0).a(stackIn_5_1, param0, 2, param1 * (fe.field_g + 2) * 3, 2 + fe.field_g, 0) ? 1 : 0;
          var4 = ea.field_bb.field_Fb.field_I;
          var5 = null;
          if (param2 > -94) {
            field_c = (String) null;
          }
          boolean decompiledFrameRemainder1 = true;
          if (2 != ld.field_g) {
            hb.field_a.field_tb = false;
            oj.field_c.field_db = m.field_c;
            if (ld.field_g == 1) {
              ea.field_bb.field_Kb.field_Jb.field_db = ch.field_db;
              if (var19 != 0) {
                ea.field_bb.field_Kb.field_Jb.field_db = field_c;
              }
            } else {
              ea.field_bb.field_Kb.field_Jb.field_db = field_c;
            }
            fm.a(ea.field_bb.field_Fb, -123);
            decompiledFrameRemainder1 = (var19 != 0);
          }
          if (decompiledFrameRemainder1) {
            hb.field_a.field_tb = true;
            oj.field_c.field_db = oc.a(gf.field_g, new String[]{f.field_a}, (byte) -59);
            ea.field_bb.field_Kb.field_Jb.field_db = null;
            var6 = null;
            var7 = (ve) (var4.g(-18110));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var7 != null) {
                var8 = 0;
                if (var19 == 0) {
                  if (null == var7.field_I) {
                    var7.field_Mb = new ci(0L, hg.field_f);
                    var7.a((byte) 127, var7.field_Mb);
                    var7.field_Jb = new ci(0L, sk.field_v);
                    var7.a((byte) 127, var7.field_Jb);
                    var7.field_Eb = new ci(0L, hg.field_f);
                    var7.a((byte) 123, var7.field_Eb);
                    var7.field_Jb.field_fb = 2;
                    var7.h(0);
                    var8 = 1;
                  }
                  var7.field_M = ea.field_bb.field_Fb.field_M;
                  var9 = 0;
                  if (null != var7.field_Lb) {
                    if (f.field_a != var7.field_Lb) {
                      var10 = 13421568;
                      var11 = 16777062;
                    } else {
                      var10 = 52224;
                      var11 = 6750054;
                    }
                  } else {
                    var11 = 16737894;
                    var10 = 13369344;
                  }
                  var12 = 0;
                  if (null != var7.field_Ob &&
                    !var7.field_Ob.equals("")) {
                    var7.field_Eb.field_jb = wk.field_g;
                    var7.field_Eb.field_O = var11;
                    var12 = 1;
                    var7.field_Eb.a(0, 3 + wk.field_g.field_v, -2147483648, fe.field_g, var9);
                  }
                  var7.field_Jb.field_ib = var10;
                  var7.field_Mb.field_ib = var10;
                  var7.field_Jb.field_T = var11;
                  var7.field_Mb.field_T = var11;
                  var7.field_Jb.field_P = var11;
                  var7.field_Mb.field_P = var11;
                  var7.field_Jb.field_O = var11;
                  var7.field_Mb.field_O = var11;
                  var13 = 0;
                  var14 = var7.field_M - 82;
                  if (var12 != 0) {
                    var13 = 3 + wk.field_g.field_v;
                    var14 = var14 - var13;
                  }
                  stackIn_46_0 = var7.field_Mb;
                  if (var14 > 0) {
                    stackIn_47_1 = lh.a(var7.field_Mb.field_xb, var7.field_Fb, var14);
                  } else {
                    stackIn_47_1 = var7.field_Fb;
                  }
                  stackIn_46_0.field_db = stackIn_47_1;
                  var7.field_Mb.a(var13, var14, -2147483648, fe.field_g, var9);
                  stackIn_50_0 = var7.field_Jb;
                  if (var7.field_Lb == null) {
                    stackIn_51_1 = ba.field_M;
                  } else {
                    stackIn_51_1 = var7.field_Lb;
                  }
                  stackIn_50_0.field_db = stackIn_51_1;
                  var7.field_Jb.a(var7.field_M - 80, 80, -2147483648, fe.field_g, var9);
                  stackIn_55_0 = (var7.field_Mb.field_db.equals(var7.field_Fb)) ? 0 : 1;
                  var15 = stackIn_55_0;
                  var9 = var9 + fe.field_g;
                  if (var3_int == 0) {
                    var7.field_N = var9 - var7.field_pb;
                  }
                  if (var8 != 0) {
                    ea.field_bb.field_Fb.a(true, (ci) (var6), 2, var7);
                  }
                  if (var7.field_Eb == null ||
                    !var7.field_Eb.field_F) {
                    if (var7.field_L != 0) {
                      var16 = var7.field_Fb;
                      ja.$cfr$intArgs$a$c398e174f2fe(0L, (String) null, 68, ea.field_bb.field_Kb, -1, var7, (int[]) null, -1, var16);
                      if (var7.field_Lb != null &&
                        !am.a(false, pi.field_d.field_i) &&
                        !qf.field_b) {
                        if (!kh.field_o) {
                          var17 = pi.field_d;
                          var18 = oc.a(bc.field_c, new String[]{var16}, (byte) -97);
                          var17.field_b.a((byte) -12, var18, 8);
                        }
                        var17Lifetime1 = pi.field_d;
                        var18Lifetime1 = oc.a(nd.field_b, new String[]{var16}, (byte) -107);
                        var17Lifetime1.field_b.a((byte) -12, var18Lifetime1, 18);
                      }
                      var5 = var7;
                    } else if (var7.field_Mb.field_F &&
                      var15 != 0) {
                      pc.field_Mb = var7.field_Fb;
                    }
                  } else {
                    pc.field_Mb = var7.field_Ob;
                  }
                  var6 = var7;
                  var7 = (ve) (var4.a((byte) -120));
                  continue;
                }
              } else {
                decompiledFrameRemainder0 = (0 != ea.field_bb.field_Hb.field_L);
                if (decompiledFrameRemainder0) {
                  me.field_a = new kd(ea.field_bb.field_Hb.field_U, ea.field_bb.field_Hb.field_wb, ea.field_bb.field_Hb.field_M, ea.field_bb.field_Hb.field_pb, oc.field_r, od.field_V, qn.field_P, qn.field_P);
                }
              }
              if (decompiledFrameRemainder0) {
                pk.field_b = 0;
              }
              if (ea.field_bb.field_Mb.field_L == 0) {
                break;
              }
              me.field_a = new kd(ea.field_bb.field_Mb.field_U, ea.field_bb.field_Mb.field_wb, ea.field_bb.field_Mb.field_M, ea.field_bb.field_Mb.field_pb, a.field_i, od.field_V, qn.field_P, qn.field_P);
              pk.field_b = 1;
              break;
            }
          }
          stackIn_104_0 = var5;
          return (ve) (stackIn_104_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "ca.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, km[] param3, byte param4, int param5, int param6, km[] param7, String param8, int param9, int param10, lh param11, boolean param12, int param13, boolean param14) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          if (param4 != 113) {
            field_e = (String) null;
          }
          rh.a(cm.field_w, param9, param11, param1, param13, param1, param6, o.field_f, new le(param7), param2, de.field_c, new le(param3), param10, param2, qb.field_b, param11, ni.field_d, (byte) -123, param5, bb.field_b);
          cg.a((byte) -25, param8, param0, param14, param12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_8_0 = var15;
          stackIn_8_1 = new StringBuilder().append("ca.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param8 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    static {
        field_e = "Next";
        field_c = "Loading...";
        field_f = "Try changing the following settings:  ";
        field_h = new tk();
        field_d = "Achieved";
    }
}
