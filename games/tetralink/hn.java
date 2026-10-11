/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends gn implements uc {
    static i field_M;
    private qh field_L;
    static hl field_P;
    static boolean field_K;
    static rb field_Q;
    static oh[] field_O;
    static String field_N;

    void a(int param0, qh param1) {
        try {
          this.field_L = param1;
          this.field_L.field_m = this;
          if (param0 != 45) {
            field_N = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "hn.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int g(byte param0);

    abstract int a(boolean param0);

    abstract boolean h(int param0);

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          if (param0 != -74) {
            field_K = true;
          }
          var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param2;
            param1--;
            param2 = param2 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "hn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_P = null;
        field_O = null;
        field_M = null;
        int var1 = 18 % ((param0 + 29) / 58);
        field_Q = null;
        field_N = null;
    }

    final static int a(boolean param0, String param1, bh param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var5 = (String) null;
            hn.a(false, (String) null, -28, true, -123, (String) null);
          }
          var3_int = param2.field_t;
          var6 = (CharSequence) ((Object) param1);
          var4 = q.a(65, var6);
          param2.b(var4.length, (byte) -93);
          param2.field_t = param2.field_t + ck.field_Z.a(0, param2.field_t, var4, var4.length, param2.field_u, 28677);
          stackIn_3_0 = -var3_int + param2.field_t;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final vm a(int param0) {
        if (param0 > -100) {
          this.h(-117);
        }
        return (vm) ((Object) this.field_L);
    }

    hn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_28_0 = 0;
          boolean stackIn_40_0 = false;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          boolean stackIn_52_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_89_0 = 0;
          int stackIn_91_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          RuntimeException stackIn_107_0 = null;
          StringBuilder stackIn_107_1 = null;
          String stackIn_108_2 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = TetraLink.field_J;
          try {
            if (null == wa.field_e &&
              !om.a(param3, (byte) -70)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (qi.field_p == bc.field_z) {
              if (param3) {
                var10 = (String) null;
                c.field_a = ug.a(ua.field_g, (String) null, false, param1, -6336);
              } else {
                c.field_a = sk.a((byte) -79, param5, false, param1);
              }
              nd.field_Lb.field_t = 0;
              nd.field_Lb.a(14, false);
              nd.field_Lb.a(c.field_a.a((byte) -95).field_d, false);
              ak.a((byte) -116, -1);
              qi.field_p = qi.field_u;
            }
            if (qi.field_p == qi.field_u &&
              en.b(109, 1)) {
              var6_int = kb.field_q.d((byte) -99);
              kb.field_q.field_t = 0;
              if (var6_int == 0) {
                qi.field_p = eh.field_v;
              } else {
                rl.field_d = -1;
                qi.field_p = mk.field_a;
                ua.field_c = var6_int;
              }
            }
            if (qi.field_p == eh.field_v &&
              en.b(110, 8)) {
              ca.field_g = kb.field_q.c(255);
              kb.field_q.field_t = 0;
              ng.a((byte) -34, param4, param3, c.field_a, param0);
              qi.field_p = vb.field_l;
            }
            boolean decompiledFrameRemainder0 = true;
            if (qi.field_p == vb.field_l &&
              en.b(param2 ^ -2513, 1)) {
              var6_intLifetime1 = kb.field_q.d((byte) -99);
              ua.field_c = var6_intLifetime1;
              kb.field_q.field_t = 0;
              cl.field_b = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  rl.field_d = -1;
                  qi.field_p = mk.field_a;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  mk.a(false);
                  vb.field_j = false;
                  stackIn_28_0 = var6_intLifetime1;
                  return stackIn_28_0;
                }
              }
              if (decompiledFrameRemainder0) {
                rl.field_d = -1;
                qi.field_p = sa.field_f;
              }
            }
            if (sa.field_f == qi.field_p &&
              ua.b(46)) {
              ua.field_g = kb.field_q.c(255);
              fd.field_J = param1;
              dd.field_c = kb.field_q.d((byte) -99);
              mb.field_z = kb.field_q.d((byte) -99);
              mb.field_C = kb.field_q.e(param2 + 2599);
              var6 = kb.field_q.i(-53);
              var7 = kb.field_q.d((byte) -99);
              if ((var7 & 1) != 0) {
                qj.b((byte) 115);
              }
              if (!param3) {
                stackIn_40_0 = ((var7 & 4) != 0);
                dh.field_o = stackIn_40_0;
                stackIn_43_0 = (0 != (var7 & 8));
                cd.field_a = stackIn_43_0;
                stackIn_46_0 = ((2 & var7) != 0);
                fn.field_K = stackIn_46_0;
                if (cd.field_a) {
                  fn.field_K = true;
                }
              }
              stackIn_52_0 = ((16 & var7) != 0);
              ef.field_n = stackIn_52_0;
              if (mc.field_k) {
                kb.field_q.d((byte) -99);
                kb.field_q.d((byte) -99);
                kb.field_q.f(-117);
                bf.field_n = kb.field_q.e(127);
                ua.field_a = new byte[bf.field_n];
                for (var8 = 0; bf.field_n > var8; var8++) {
                  ua.field_a[var8] = kb.field_q.g(oj.a(param2, 1772090971));
                }
              }
              ph.field_w = kb.field_q.g((byte) 81);
              var11 = (CharSequence) ((Object) ph.field_w);
              ik.field_f = cc.a(var11, (byte) 119);
              pg.field_a = kb.field_q.d((byte) -99);
              qi.field_p = li.field_a;
              if (c.field_a.a((byte) -106) == t.field_h) {
                lh.field_s.a((byte) -86, lk.q(13));
              } else {
                if (c.field_a.a((byte) -85) == qf.field_h) {
                  lc.field_j.a((byte) -90, lk.q(13));
                }
              }
              vb.field_j = false;
              if (var6 != null) {
                qi.a(var6, -7011, lk.q(13));
              }
              if (0 >= mb.field_C &&
                !dh.field_o) {
                try {
                  ii.a((byte) 81, "unzap", lk.q(13));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ii.a(new Object[]{la.a(ua.field_g, true)}, 6760, "zap", lk.q(param2 + 2485));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (mb.field_C > 0) {
                pg.field_m = true;
              }
              nd.field_Lb.a(ai.field_e, (byte) 33);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                ai.field_e[var8Lifetime1] = ai.field_e[var8Lifetime1] + 50;
              }
              kb.field_q.a(ai.field_e, (byte) 33);
              stackIn_79_0 = ua.field_c;
              return stackIn_79_0;
            }
            if (qi.field_p == mk.field_a &&
              ua.b(param2 + 2515)) {
              mk.a(false);
              if (ua.field_c == 7 &&
                !vb.field_j) {
                vb.field_j = true;
                stackIn_91_0 = -1;
                return stackIn_91_0;
              }
              if (7 == ua.field_c) {
                ua.field_c = 3;
              }
              tg.field_d = kb.field_q.g((byte) 81);
              vb.field_j = false;
              stackIn_89_0 = ua.field_c;
              return stackIn_89_0;
            }
            if (param2 != -2472) {
              stackIn_94_0 = 123;
              return stackIn_94_0;
            }
            if (null == wa.field_e) {
              if (vb.field_j) {
                if (ib.a((byte) 127) <= 30000L) {
                  tg.field_d = ja.field_d;
                } else {
                  tg.field_d = wc.field_G;
                }
                vb.field_j = false;
                stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              var6_intLifetime2 = ko.field_t;
              ko.field_t = oi.field_m;
              vb.field_j = true;
              oi.field_m = var6_intLifetime2;
            }
            stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_107_0 = var6_ref;
            stackIn_107_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int f(byte param0);

    final static void a(boolean param0, String param1, int param2, boolean param3) {
        try {
          if (param2 < 21) {
            String var5 = (String) null;
            hn.a(false, (String) null, 8, true, 77, (String) null);
          }
          dd.b(-123);
          mf.field_s.i(0);
          ao.field_c = new tl(mk.field_d, (String) null, qa.field_v, param0, param3);
          mm.field_u = new sd(mf.field_s, ao.field_c);
          mf.field_s.a(mm.field_u, false);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_M = null;
        field_N = "Type your age in years";
    }
}
