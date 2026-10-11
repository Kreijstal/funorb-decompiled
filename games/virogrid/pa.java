/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends in {
    p field_k;
    private i field_m;
    static ob field_l;
    static km field_o;
    r field_n;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = id.a(param1, 32);
        int var4 = nf.a(21855, param1);
        int var5 = id.a(param2, 32);
        int var6 = nf.a(21855, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var11 = -89 % ((param0 + 71) / 53);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void a(int param0) {
        int var2;
        wn var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        this.field_n.a(param0);
        var3 = (wn) (this.field_k.a((byte) -111));
        while (var3 != null) {
          if (!this.field_m.b(-109, var3)) {
            var2 = param0;
            do {
              if (var3.field_D >= var2) {
                this.a(true, var2, var3);
                var3.field_D = var3.field_D - var2;
                break;
              }
              this.a(true, var3.field_D, var3);
              var2 = var2 - var3.field_D;
            } while (!this.field_m.a(0, (int[]) null, var2, 123, var3));
          }
          var3 = (wn) (this.field_k.a(16213));
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        wn var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          this.field_n.b(param0, param1, param2);
          var6 = (wn) (this.field_k.a((byte) -93));
          while (var6 != null) {
            stackIn_4_0 = this.field_m.b(-124, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_D) {
                this.a(var6.field_D, var6, param0, (byte) 46, var4_int, var4_int + var5);
                var4_int = var4_int + var6.field_D;
                var5 = var5 - var6.field_D;
                if (this.field_m.a(var4_int, param0, var5, 123, var6)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var5, var6, param0, (byte) 46, var4_int, var4_int + var5);
                var6.field_D = var6.field_D - var5;
              }
            }
            var6 = (wn) (this.field_k.a(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pa.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(String param0, boolean param1, int param2, byte param3, boolean param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_20_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_58_0 = false;
          int stackIn_85_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_97_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_108_0 = 0;
          RuntimeException stackIn_111_0 = null;
          StringBuilder stackIn_111_1 = null;
          String stackIn_112_2 = null;
          StringBuilder stackIn_114_1 = null;
          String stackIn_115_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          CharSequence var10 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Virogrid.field_F ? 1 : 0;
          try {
            if (oj.field_Ub == null &&
              !ce.a(-69, param1)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (ul.field_c == ug.field_a) {
              if (!param1) {
                ab.field_G = dg.a(param5, 16711935, param0, false);
              } else {
                ab.field_G = pl.a(md.field_a, (String) null, param3 + 184, param0, false);
              }
              gk.field_g.field_l = 0;
              gk.field_g.a(14, -77);
              gk.field_g.a(ab.field_G.a(true).field_d, 77);
              al.b(-1, -1);
              ug.field_a = th.field_t;
            }
            if (th.field_t == ug.field_a &&
              wg.a(1, param3 + 57)) {
              var6_int = sh.field_qb.g(11132);
              if (0 == var6_int) {
                ug.field_a = ga.field_Ob;
              } else {
                ci.field_q = var6_int;
                ba.field_a = -1;
                ug.field_a = ub.field_E;
              }
              sh.field_qb.field_l = 0;
            }
            if (param3 != -57) {
              stackIn_20_0 = -38;
              return stackIn_20_0;
            }
            if (ug.field_a == ga.field_Ob &&
              wg.a(8, 0)) {
              ph.field_i = sh.field_qb.e((byte) -60);
              sh.field_qb.field_l = 0;
              md.a(param1, 0, param4, param2, ab.field_G);
              ug.field_a = lg.field_d;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ug.field_a == lg.field_d &&
              wg.a(1, 0)) {
              var6_intLifetime1 = sh.field_qb.g(11132);
              ci.field_q = var6_intLifetime1;
              mj.field_B = null;
              sh.field_qb.field_l = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  ba.field_a = -1;
                  ug.field_a = ub.field_E;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  tn.a(false);
                  fh.field_e = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ug.field_a = nf.field_h;
                ba.field_a = -1;
              }
            }
            if (nf.field_h == ug.field_a &&
              ic.c((byte) 48)) {
              md.field_a = sh.field_qb.e((byte) -60);
              he.field_Wb = param0;
              hd.field_d = sh.field_qb.g(11132);
              og.field_s = sh.field_qb.g(11132);
              bn.field_d = sh.field_qb.c((byte) -64);
              var6 = sh.field_qb.f(param3 ^ -97);
              var7 = sh.field_qb.g(param3 ^ -11077);
              if ((var7 & 1) != 0) {
                oe.a(0);
              }
              if (!param1) {
                stackIn_46_0 = ((var7 & 2) != 0);
                dh.field_n = stackIn_46_0;
                stackIn_49_0 = ((8 & var7) != 0);
                wg.field_f = stackIn_49_0;
                stackIn_52_0 = (0 != (4 & var7));
                cj.field_l = stackIn_52_0;
                if (wg.field_f) {
                  dh.field_n = true;
                }
              }
              stackIn_58_0 = ((var7 & 16) != 0);
              wd.field_a = stackIn_58_0;
              if (el.field_k) {
                sh.field_qb.g(11132);
                sh.field_qb.g(param3 + 11189);
                sh.field_qb.d((byte) 98);
                rn.field_e = sh.field_qb.c((byte) 127);
                lj.field_d = new byte[rn.field_e];
                for (var8 = 0; rn.field_e > var8; var8++) {
                  lj.field_d[var8] = sh.field_qb.a((byte) 114);
                }
              }
              mi.field_d = sh.field_qb.h(param3 - 69);
              var10 = (CharSequence) ((Object) mi.field_d);
              wn.field_n = c.a(var10, true);
              mf.field_h = sh.field_qb.g(11132);
              ug.field_a = kh.field_c;
              if (ab.field_G.a(true) != qg.field_r) {
                if (ab.field_G.a(true) == p.field_b) {
                  Virogrid.field_O.a(mb.g((byte) -86), (byte) 100);
                }
              } else {
                aa.field_b.a(mb.g((byte) -86), (byte) 88);
              }
              fh.field_e = false;
              if (var6 != null) {
                jd.a(-69, var6, mb.g((byte) 13));
              }
              if (0 >= bn.field_d &&
                !cj.field_l) {
                try {
                  q.b("unzap", 6168, mb.g((byte) 32));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  q.a(mb.g((byte) 61), -8582, new Object[]{ci.a(md.field_a, 92)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (bn.field_d > 0) {
                wg.field_c = true;
              }
              gk.field_g.a(sb.field_b, false);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                sb.field_b[var8Lifetime1] = sb.field_b[var8Lifetime1] + 50;
              }
              sh.field_qb.a(sb.field_b, false);
              stackIn_85_0 = ci.field_q;
              return stackIn_85_0;
            }
            if (ub.field_E == ug.field_a &&
              ic.c((byte) 48)) {
              tn.a(false);
              if (ci.field_q == 7 &&
                !fh.field_e) {
                fh.field_e = true;
                stackIn_93_0 = -1;
                return stackIn_93_0;
              }
              if (7 == ci.field_q) {
                ci.field_q = 3;
              }
              ld.field_g = sh.field_qb.h(param3 ^ 68);
              fh.field_e = false;
              stackIn_97_0 = ci.field_q;
              return stackIn_97_0;
            }
            if (null == oj.field_Ub) {
              if (fh.field_e) {
                if (af.b(param3 ^ 69) <= 30000L) {
                  ld.field_g = ll.field_a;
                } else {
                  ld.field_g = wa.field_L;
                }
                fh.field_e = false;
                stackIn_105_0 = 3;
                return stackIn_105_0;
              }
              var6_intLifetime2 = uh.field_b;
              uh.field_b = tn.field_i;
              fh.field_e = true;
              tn.field_i = var6_intLifetime2;
            }
            stackIn_108_0 = -1;
            return stackIn_108_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_111_0 = var6_ref;
            stackIn_111_1 = new StringBuilder().append("pa.H(");
            if (param0 == null) {
              stackIn_112_2 = "null";
            } else {
              stackIn_112_2 = "{...}";
            }
            stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_115_2 = "null";
            } else {
              stackIn_115_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final in c() {
        wn var1 = (wn) (this.field_k.a((byte) -77));
        if (var1 == null) {
          return null;
        }
        if (var1.field_p != null) {
          return (in) ((Object) var1.field_p);
        }
        return this.b();
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_o = (km) null;
        }
        field_l = null;
        field_o = null;
    }

    final int d() {
        return 0;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -110) {
            stackIn_4_0 = jm.a(10, 88, true, param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pa.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, wn param2) {
        i stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        try {
          if (0 != (4 & this.field_m.field_U[param2.field_h]) &&
            param2.field_o < 0) {
            var4_int = this.field_m.field_I[param2.field_h] / ua.field_p;
            var5 = (-param2.field_B + (1048575 + var4_int)) / var4_int;
            param2.field_B = 1048575 & param2.field_B + param1 * var4_int;
            if (param1 >= var5) {
              if (this.field_m.field_S[param2.field_h] == 0) {
                param2.field_p = jh.b(param2.field_q, param2.field_p.k(), param2.field_p.l(), param2.field_p.f());
              } else {
                param2.field_p = jh.b(param2.field_q, param2.field_p.k(), 0, param2.field_p.f());
                stackIn_8_0 = this.field_m;
                stackIn_9_1 = !(param2.field_E.field_p[param2.field_l] >= 0);
                ((i) (Object) stackIn_8_0).a(stackIn_9_1, -16257, param2);
              }
              if (param2.field_E.field_p[param2.field_l] < 0) {
                param2.field_p.e(-1);
              }
              param1 = param2.field_B / var4_int;
            }
          }
          if (!param0) {
            var6 = (int[]) null;
            this.b((int[]) null, 69, -108);
          }
          param2.field_p.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(int param0, wn param1, int[] param2, byte param3, int param4, int param5) {
        i stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jh var11 = null;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          if ((4 & this.field_m.field_U[param1.field_h]) != 0 &&
            param1.field_o < 0) {
            var7_int = this.field_m.field_I[param1.field_h] / ua.field_p;
            while (true) {
              var8 = (var7_int + 1048575 - param1.field_B) / var7_int;
              if (var8 > param0) {
                param1.field_B = param1.field_B + var7_int * param0;
                break;
              }
              param1.field_p.b(param2, param4, var8);
              param4 = param4 + var8;
              param1.field_B = param1.field_B + (var8 * var7_int - 1048576);
              param0 = param0 - var8;
              var9 = ua.field_p / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param1.field_p;
              if (this.field_m.field_S[param1.field_h] != 0) {
                param1.field_p = jh.b(param1.field_q, var11.k(), 0, var11.f());
                stackIn_14_0 = this.field_m;
                stackIn_15_1 = !(param1.field_E.field_p[param1.field_l] >= 0);
                ((i) (Object) stackIn_14_0).a(stackIn_15_1, -16257, param1);
                param1.field_p.d(var9, var11.l());
              } else {
                param1.field_p = jh.b(param1.field_q, var11.k(), var11.l(), var11.f());
              }
              if (0 > param1.field_E.field_p[param1.field_l]) {
                param1.field_p.e(-1);
              }
              var11.g(var9);
              var11.b(param2, param4, -param4 + param5);
              if (!var11.i()) {
                continue;
              }
              this.field_n.a(var11);
            }
          }
          if (param3 != 46) {
            return;
          }
          param1.field_p.b(param2, param4, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("pa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final in b() {
        wn var1_ref = null;
        int var2 = Virogrid.field_F ? 1 : 0;
        do {
          var1_ref = (wn) (this.field_k.a(16213));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_p);
        return (in) ((Object) var1_ref.field_p);
    }

    pa(i param0) {
        this.field_k = new p();
        this.field_n = new r();
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
