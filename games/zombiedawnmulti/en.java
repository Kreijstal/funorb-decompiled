/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class en extends IOException {
    static cj field_b;
    static String field_a;
    static String field_e;
    static String field_f;
    static int field_c;
    static pd field_d;

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (wf.field_t != param1) {
            wf.field_t = param1;
          }
          if (param0 != -1) {
            en.a((byte) -66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "en.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 != 20964) {
          return;
        }
        try {
          field_d = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "en.C(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "en.E(" + param0 + ',' + param1 + ')');
        }
    }

    en(String param0) {
        super(param0);
    }

    final static cj a(byte param0) {
        RuntimeException var1 = null;
        cj stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -86) {
            en.a(40);
          }
          stackIn_4_0 = ek.field_H.field_Gb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "en.D(" + param0 + ')');
        }
    }

    final static dm a(byte param0, long param1) {
        RuntimeException var3 = null;
        dm stackIn_2_0 = null;
        dm stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 50) {
            stackIn_4_0 = (dm) (hq.field_c.a(param1, -22877));
            return stackIn_4_0;
          }
          stackIn_2_0 = (dm) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "en.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(cj param0, cj param1, fm param2, cj param3, cj param4, cj param5, boolean param6, hi param7, int param8, cj param9, cj param10, cj param11) {
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ja[] var16 = null;
        cj var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          pq.field_m[3] = param8;
          pq.field_m[4] = 16711935;
          pq.field_m[1] = 6356832;
          sn.field_Hb = param6;
          pq.field_m[0] = 16764000;
          w.field_A = param2;
          qq.field_f = param0;
          pq.field_m[2] = 9474303;
          wp.field_c[3] = 16736511;
          wp.field_c[0] = 16764000;
          pq.field_m[4] = 16711935;
          wp.field_c[1] = 6356832;
          wp.field_c[2] = 16736352;
          wj.field_g = 8421504;
          var12 = new ja(4, 4);
          var13 = var12.field_B;
          var14 = var12.field_B;
          var15 = var12.field_B;
          var12.field_B[15] = 7368816;
          var14[5] = 7368816;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var16 = new ja[9];
          var16[4] = var12;
          dq.field_k = new cj(0L, param10);
          qe.field_q = new cj(0L, param9);
          dq.field_k.a((byte) 50, qe.field_q);
          var17 = new cj(0L, (cj) null);
          var17.field_Cb = new th();
          tn.field_A = new tq(0L, var17, param1, param7);
          qe.field_q.a((byte) 50, tn.field_A);
          ek.field_z = new cj(0L, param3);
          qe.field_q.a((byte) 50, ek.field_z);
          ec.field_b = new cj(0L, param4);
          ec.field_b.field_yb = w.field_A;
          ek.field_z.a((byte) 50, ec.field_b);
          ek.field_z.f(-128);
          ua.field_E = new cj(0L, (cj) null);
          ua.field_E.field_ab = var16;
          ek.field_z.a((byte) 50, ua.field_E);
          la.field_h = new cj[5];
          pf.field_d = new cj[5];
          ij.field_k = new cj[5];
          hh.field_l = new cj[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_28_0 = ~var18;
            stackIn_28_1 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 != stackIn_28_1) {
                if (1 != var18 ||
                  !sn.field_Hb) {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = lo.field_c;
                  }
                } else {
                  var19 = l.field_d;
                }
              } else {
                if (!sn.field_Hb) {
                  stackIn_24_0 = uq.field_c;
                } else {
                  stackIn_24_0 = ne.field_vb;
                }
                var19 = stackIn_24_0;
              }
              if (decompiledFrameRemainder0) {
                la.field_h[var18] = new cj(0L, param11);
                ij.field_k[var18] = new cj(0L, qq.field_f, var19);
                pf.field_d[var18] = new cj(0L, (cj) null);
                pf.field_d[var18].field_lb = 1;
                hh.field_l[var18] = new cj(0L, qq.field_f);
                hh.field_l[var18].field_lb = 1;
                la.field_h[var18].a((byte) 50, ij.field_k[var18]);
                la.field_h[var18].a((byte) 50, pf.field_d[var18]);
                la.field_h[var18].a((byte) 50, hh.field_l[var18]);
                la.field_h[var18].f(-128);
                dq.field_k.a((byte) 50, la.field_h[var18]);
                gi.field_l = gi.field_l + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            nn.field_b = new cj(0L, param5);
            nn.field_b.field_wb = ln.field_c;
            dq.field_k.a((byte) 50, nn.field_b);
            stackIn_28_0 = param8;
            stackIn_28_1 = -16736510;
          }
          if (vo.e(stackIn_28_0 + stackIn_28_1) &&
            !nh.field_m) {
            return;
          }
          ra.field_f = new oj(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_39_0 = var12_ref;
          stackIn_39_1 = new StringBuilder().append("en.A(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param4 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_59_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',');
          if (param5 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param10 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param11 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    static {
        field_e = "x???";
        field_a = "Create a free Account";
        field_f = "Traits";
    }
}
