/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class eb implements pf {
    static mc[] field_b;
    static qb field_d;
    static String field_c;
    static int field_a;

    final static nk a(boolean param0, int param1, int param2, int param3) {
        nk var4 = null;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = (nk) (Object) pe.field_Lb.b(12623);
        L0: while (true) {
          if (var4 == null) {
            var4 = new nk();
            var4.field_p = 0;
            var4.field_t = 10;
            pe.field_Lb.b((pg) (Object) var4, -1);
            int discarded$2 = 7;
            fj.a(-26971, var4);
            return var4;
          } else {
            if (var4.field_p != 0) {
              var4 = (nk) (Object) pe.field_Lb.a(0);
              continue L0;
            } else {
              return var4;
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_d = null;
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException runtimeException = null;
        Object var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 5592405) {
                break L1;
              } else {
                var7 = null;
                eb.a(-82, (jg) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("eb.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        ul.field_A = param0;
        if (!(null == jl.field_h)) {
            jl.field_h.a(param0, (byte) -66);
        }
        if (!(gg.field_h == null)) {
            gg.field_h.a(2, param0);
        }
    }

    final static void a(int param0, jg param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ne var5 = null;
        String var6 = null;
        ne var7 = null;
        String var8 = null;
        ne var9 = null;
        String var10 = null;
        ne var11 = null;
        String var12 = null;
        ne var13 = null;
        int stackIn_1_0 = 0;
        Object stackIn_1_1 = null;
        Object stackIn_1_2 = null;
        String stackIn_1_3 = null;
        long stackIn_1_4 = 0L;
        int stackIn_1_5 = 0;
        int stackIn_2_0 = 0;
        Object stackIn_2_1 = null;
        Object stackIn_2_2 = null;
        String stackIn_2_3 = null;
        long stackIn_2_4 = 0L;
        int stackIn_2_5 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_3_1 = null;
        Object stackIn_3_2 = null;
        String stackIn_3_3 = null;
        long stackIn_3_4 = 0L;
        int stackIn_3_5 = 0;
        int stackIn_3_6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        Object stackOut_0_1 = null;
        Object stackOut_0_2 = null;
        String stackOut_0_3 = null;
        long stackOut_0_4 = 0L;
        int stackOut_0_5 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_2_1 = null;
        Object stackOut_2_2 = null;
        String stackOut_2_3 = null;
        long stackOut_2_4 = 0L;
        int stackOut_2_5 = 0;
        int stackOut_2_6 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_1_1 = null;
        Object stackOut_1_2 = null;
        String stackOut_1_3 = null;
        long stackOut_1_4 = 0L;
        int stackOut_1_5 = 0;
        int stackOut_1_6 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = -26335;
              stackOut_0_1 = null;
              stackOut_0_2 = null;
              stackOut_0_3 = param1.field_n;
              stackOut_0_4 = param1.field_h;
              stackOut_0_5 = param1.field_m;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_2_5 = stackOut_0_5;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              stackIn_1_5 = stackOut_0_5;
              if (1 == param1.field_m) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = (String) (Object) stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = param1.field_q;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                stackIn_3_6 = stackOut_2_6;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = (String) (Object) stackIn_1_3;
                stackOut_1_4 = stackIn_1_4;
                stackOut_1_5 = stackIn_1_5;
                stackOut_1_6 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                stackIn_3_6 = stackOut_1_6;
                break L1;
              }
            }
            L2: {
              ArcanistsMulti.a(stackIn_3_0, (int[]) (Object) stackIn_3_1, (dn) (Object) stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_3_6, param1.field_g, param1.field_a);
              if (param1.field_m != param0) {
                break L2;
              } else {
                if (lk.f(-1)) {
                  break L2;
                } else {
                  if (wi.field_f != null) {
                    break L2;
                  } else {
                    if (null != om.field_x) {
                      break L2;
                    } else {
                      L3: {
                        if (ld.field_p) {
                          break L3;
                        } else {
                          var5 = eo.field_c;
                          var6 = jd.field_i;
                          var5.field_l.a(14, var6, (byte) -26);
                          break L3;
                        }
                      }
                      var7 = eo.field_c;
                      var8 = lk.field_h;
                      var7.field_l.a(20, var8, (byte) -26);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param1.field_m != 1) {
                break L4;
              } else {
                if (lk.f(-1)) {
                  break L4;
                } else {
                  if (null == wi.field_f) {
                    break L4;
                  } else {
                    if (param1.field_q != wi.field_f.h((byte) 78)) {
                      break L4;
                    } else {
                      L5: {
                        if (ld.field_p) {
                          break L5;
                        } else {
                          var9 = eo.field_c;
                          var10 = vk.field_v;
                          var9.field_l.a(14, var10, (byte) -26);
                          break L5;
                        }
                      }
                      var11 = eo.field_c;
                      var12 = ef.field_s;
                      var11.field_l.a(20, var12, (byte) -26);
                      break L4;
                    }
                  }
                }
              }
            }
            eo.field_c.a(3);
            eo.field_c.a((byte) 72, false);
            eo.field_c.a(param1.field_m, param1.field_f, 13);
            eo.field_c.d(5552);
            eo.field_c.a(19, param1);
            var13 = eo.field_c;
            var3 = pb.field_h;
            var4 = ja.field_s;
            var13.field_l.a(0, 0, -29466, var4, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("eb.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static void a(boolean param0) {
        mj.a(-6578, param0);
        if (!(null == kh.field_c)) {
            fk.a(0, kh.field_c);
        }
    }

    final static void a(qb[] param0, int param1, int param2, int param3) {
        try {
            ol.field_f = new ec(param0);
            mj.field_r = param3;
            int var4_int = 51;
            tg.field_d = param1;
            int discarded$0 = 403300833;
            eg.b();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "eb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + -117 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
        field_c = "Just one target left!";
    }
}
