/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements uj {
    static int[] field_c;
    static ji[] field_a;
    static int field_b;
    static int field_d;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          var5_int = param0;
          while (true) {
            if (mg.field_e.length <= var5_int) {
              return;
            }
            param4 = mg.field_e[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = ta.field_d[incrementValue$1];
              dupTemp$2 = param1[param3];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              ta.field_d[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("re.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 0;
        if (param0) {
          String var3 = (String) null;
          re.a(-10, false, true, (String) null, false, (String) null);
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var4 < var2_int; var4++) {
            var3[-1 + var2_int - var4] = param0.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("re.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, boolean param4, String param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_42_0 = false;
          boolean stackIn_45_0 = false;
          int stackIn_72_0 = 0;
          int stackIn_75_0 = 0;
          int stackIn_81_0 = 0;
          int stackIn_86_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_97_0 = 0;
          RuntimeException stackIn_100_0 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = MinerDisturbance.field_ab;
          try {
            if (null == ci.field_i &&
              !ed.a(param4, (byte) -126)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (qd.field_Q == cm.field_p) {
              if (param4) {
                var10 = (String) null;
                tb.field_d = qg.a(ne.field_Q, param5, 0, (String) null, false);
              } else {
                tb.field_d = sl.a((byte) 86, param3, param5, false);
              }
              sn.field_c.field_o = 0;
              sn.field_c.c(14, 25564);
              sn.field_c.c(tb.field_d.b(0).field_a, 25564);
              bk.a((byte) -104, -1);
              qd.field_Q = ra.field_c;
            }
            if (qd.field_Q == ra.field_c &&
              ta.a(0, 1)) {
              var6_int = kj.field_a.d((byte) -54);
              kj.field_a.field_o = 0;
              if (var6_int == 0) {
                qd.field_Q = ka.field_d;
              } else {
                oj.field_K = var6_int;
                qd.field_Q = bh.field_bb;
                rj.field_d = -1;
              }
            }
            if (qd.field_Q == ka.field_d &&
              ta.a(0, 8)) {
              gd.field_s = kj.field_a.h(81);
              kj.field_a.field_o = 0;
              cm.a((byte) 6, param4, param0, tb.field_d, param2);
              qd.field_Q = nn.field_m;
            }
            boolean decompiledFrameRemainder0 = true;
            if (qd.field_Q == nn.field_m &&
              ta.a(0, 1)) {
              var6_intLifetime1 = kj.field_a.d((byte) -54);
              ag.field_d = null;
              oj.field_K = var6_intLifetime1;
              kj.field_a.field_o = 0;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  qd.field_Q = bh.field_bb;
                  rj.field_d = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  si.a(-67);
                  ek.field_c = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                rj.field_d = -1;
                qd.field_Q = wi.field_s;
              }
            }
            if (qd.field_Q == wi.field_s &&
              kj.b(-9319)) {
              ne.field_Q = kj.field_a.h(71);
              wj.field_j = kj.field_a.d((byte) -54);
              kj.field_a.d((byte) -54);
              pj.field_a = kj.field_a.e(-96);
              var11 = kj.field_a.j(103);
              var7 = kj.field_a.d((byte) -54);
              if ((1 & var7) != 0) {
                nj.a((byte) 89);
              }
              if (!param4) {
                stackIn_42_0 = ((8 & var7) != 0);
                bd.field_b = stackIn_42_0;
                stackIn_45_0 = ((4 & var7) != 0);
                fa.field_b = stackIn_45_0;
                if (bd.field_b) {
                }
              }
              if (ei.field_L) {
                kj.field_a.d((byte) -54);
                kj.field_a.d((byte) -54);
                kj.field_a.b((byte) 33);
                g.field_k = kj.field_a.e(-47);
                ja.field_v = new byte[g.field_k];
                for (var8 = 0; g.field_k > var8; var8++) {
                  ja.field_v[var8] = kj.field_a.m(4);
                }
              }
              ti.field_J = kj.field_a.a(false);
              var12 = (CharSequence) ((Object) ti.field_J);
              in.field_b = cl.a(-95, var12);
              a.field_d = kj.field_a.d((byte) -54);
              qd.field_Q = pb.field_c;
              if (tb.field_d.b(0) == hk.field_i) {
                ak.field_b.a(bm.c(-122), 447616545);
              } else {
                if (tb.field_d.b(0) == kl.field_a) {
                  hj.field_e.a(bm.c(-116), 447616545);
                }
              }
              ek.field_c = false;
              if (var11 != null) {
                nc.a(bm.c(-93), var11, (byte) 78);
              }
              if (0 >= pj.field_a &&
                !fa.field_b) {
                try {
                  lk.a((byte) 18, "unzap", bm.c(-96));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  lk.a("zap", bm.c(-111), 16715, new Object[]{oh.a(ne.field_Q, 95)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (pj.field_a > 0) {
                v.field_e = true;
              }
              sn.field_c.b(v.field_b, -97);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                v.field_b[var8Lifetime1] = v.field_b[var8Lifetime1] + 50;
              }
              kj.field_a.b(v.field_b, 107);
              stackIn_72_0 = oj.field_K;
              return stackIn_72_0;
            }
            if (param1) {
              stackIn_75_0 = -33;
              return stackIn_75_0;
            }
            if (bh.field_bb == qd.field_Q &&
              kj.b(-9319)) {
              si.a(-110);
              if (7 == oj.field_K &&
                !ek.field_c) {
                ek.field_c = true;
                stackIn_81_0 = -1;
                return stackIn_81_0;
              }
              if (7 == oj.field_K) {
                oj.field_K = 3;
              }
              nf.field_g = kj.field_a.a(false);
              ek.field_c = false;
              stackIn_86_0 = oj.field_K;
              return stackIn_86_0;
            }
            if (null == ci.field_i) {
              if (ek.field_c) {
                if (qa.a(-125) > 30000L) {
                  nf.field_g = oi.field_K;
                } else {
                  nf.field_g = l.field_a;
                }
                ek.field_c = false;
                stackIn_94_0 = 3;
                return stackIn_94_0;
              }
              var6_intLifetime2 = jc.field_E;
              jc.field_E = ic.field_h;
              ek.field_c = true;
              ic.field_h = var6_intLifetime2;
            }
            stackIn_97_0 = -1;
            return stackIn_97_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_100_0 = var6;
            stackIn_100_1 = new StringBuilder().append("re.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -10887) {
          field_a = (ji[]) null;
        }
        field_c = null;
    }

    public final String a(byte param0) {
        int var2 = -121 % ((-33 - param0) / 62);
        return "Make Ore Iron";
    }

    static {
        int var0 = 0;
        field_c = new int[10];
        for (var0 = 0; field_c.length > var0; var0++) {
          if (var0 != 0) {
            field_c[var0] = 51 * (var0 + 1) << 16;
          } else {
            field_c[var0] = 20 * var0 + 20 << 16;
          }
          if (2 < var0) {
            field_c[var0] = hi.a(field_c[var0], (-2 + var0) * 22 << 8);
          }
        }
        field_d = 0;
    }
}
