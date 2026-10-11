/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static String field_d;
    static String field_c;
    static pf field_a;
    static String[] field_b;

    final static boolean a(byte param0) {
        eq var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -50) {
            bk.a((byte) -35);
          }
          var1 = (eq) (kc.field_b.d(0));
          if (null == var1) {
            return false;
          }
          var2 = 0;
          while (var2 < var1.field_l) {
            if (var1.field_q[var2] != null &&
              var1.field_q[var2].field_d == 0) {
              return false;
            }
            if (null != var1.field_n[var2] &&
              var1.field_n[var2].field_d == 0) {
              return false;
            }
            var2++;
            if (var3 == 0) {
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "bk.C(" + param0 + ')');
        }
    }

    final static void a(ik[] param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        ik stackIn_22_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik[] var2 = null;
        ik var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3_int = 0;
        ik[] var3 = null;
        ik var4_ref_ik = null;
        int var4 = 0;
        int var5_int = 0;
        ik var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = param0;
          var3_int = param1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= var2.length))) {
            var4_ref_ik = var2[var3_int];
            stackIn_22_0 = var4_ref_ik;
            if (var6 == 0) {
              var5_int = stackIn_22_0.field_k >> 4;
              if (var5_int < nm.field_a) {
                stackIn_11_0 = (var5_int <= 0) ? 0 : var5_int;
                nm.field_a = stackIn_11_0;
              }
              var5_int++;
              if (er.field_i < var5_int) {
                if (gf.field_k <= var5_int) {
                  stackIn_19_0 = -1 + gf.field_k;
                } else {
                  stackIn_19_0 = var5_int;
                }
                er.field_i = stackIn_19_0;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_22_0 = param0[param0.length - 1];
          }
          var2_ref = stackIn_22_0;
          var3 = param0;
          var4 = 0;
          while (var3.length > var4) {
            var5 = var3[var4];
            if (var6 != 0) {
              return;
            }
            if (var5.field_k <= var2_ref.field_k) {
              if (!(var2_ref.field_k <= var5.field_k)) {
                tc.a(param1 ^ 24, var5, false, var2_ref);
              }
            } else {
              tc.a(61, var2_ref, true, var5);
            }
            var2_ref = var5;
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          stackIn_41_0 = var2_ref2;
          stackIn_41_1 = new StringBuilder().append("bk.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          field_d = null;
          if (param0 != 2562) {
            bk.a(88);
          }
          field_c = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "bk.D(" + param0 + ')');
        }
    }

    final static String b(int param0) {
        String stackIn_53_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = null;
          var2 = null;
          var3 = 85 / ((-64 - param0) / 60);
          if (0 == em.field_h &&
            null != he.field_p) {
            var2 = di.field_k;
          }
          if (em.field_h == 2 &&
            !lh.e((byte) 75)) {
            if (!da.a(-30106, nd.field_k)) {
              var2 = re.a(of.field_g, 4371, new String[]{gi.field_a});
              if (var11 != 0) {
                var2 = re.a(oi.field_g, 4371, new String[]{gi.field_a});
              }
            } else {
              var2 = re.a(oi.field_g, 4371, new String[]{gi.field_a});
            }
            if (dp.field_t) {
              md.a(2, (String) (var2), 0, (String) null, (String) null, -16169);
              eo.f(false);
            }
          }
          if (null == var2 &&
            !ShatteredPlansClient.field_K &&
            fa.field_X == null) {
            var2 = ce.field_u;
          }
          if (var2 != null) {
            cq.a(-73, ho.field_c, (String) null, (String) (var2), 0);
          } else {
            var4 = ln.field_o;
            var4 = v.a(var4, (byte) 19);
            var5 = "";
            var6 = "|";
            var7 = em.field_h;
            var8 = 0;
            if (var7 == 2) {
              var5 = re.a(fj.field_q, 4371, new String[]{gi.field_a});
              var9 = re.a(cf.field_M, 4371, new String[]{var4});
              var8 = -485 + uq.field_j.field_K - (-cg.field_C.field_K - ho.field_f.c(var9) + ho.field_f.c(var5));
              if (var8 < 0) {
                var8 = 0;
              }
            } else {
              if (var7 == 0) {
                if (np.field_a == null &&
                  je.field_e) {
                  var5 = "[" + ds.field_a + "] ";
                }
                if (null != np.field_a) {
                  var7 = 1;
                  boolean decompiledSharedTail1 = (!(i.field_c) ||
                    null == wf.field_m);
                  if (!decompiledSharedTail1) {
                    var5 = "[" + wf.field_m + "] ";
                    decompiledSharedTail1 = (var11 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var5 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                  }
                }
              }
              if (eg.a((byte) 118)) {
                stackIn_53_0 = ": ";
              } else {
                stackIn_53_0 = "<img=3>: ";
              }
              var9 = stackIn_53_0;
              var5 = var5 + var4 + var9;
              boolean decompiledSharedTail0 = !(bg.field_g);
              if (!decompiledSharedTail0) {
                var6 = "";
                var5 = "<col=999999>" + var5 + uh.field_d + "</col>";
                decompiledSharedTail0 = (var11 != 0);
              }
              if ((decompiledSharedTail0) &&
                (ae.field_b)) {
                var6 = "";
                var5 = "<col=999999>" + var5 + qj.field_c + "</col>";
              }
              var10 = ho.field_f.c(var5);
              if (!eg.a((byte) 110)) {
                if (uq.field_j.field_L &&
                  var10 > (-uq.field_j.field_B + pd.field_k)) {
                  if (bg.field_g) {
                    var1 = "Broken!";
                  } else {
                    var1 = qj.field_c;
                  }
                }
                if (uq.field_j.field_rb != 0 &&
                  uq.field_j.field_Q < var10 &&
                  !bg.field_g) {
                  rg.a(true);
                }
              }
            }
            cq.a(-110, ke.field_q[var7], var6, var5 + nq.a(cg.field_E.toString()), var8);
            if (!sr.field_h) {
              cg.field_C.field_L = false;
            }
            if (cg.field_C.field_L) {
              var1 = re.a(fi.field_m, 4371, new String[]{var4, gi.field_a});
            }
          }
          stackIn_97_0 = var1;
          return (String) (stackIn_97_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (var1), "bk.A(" + param0 + ')');
        }
    }

    static {
        field_c = "Open in popup window";
        field_d = "you lost 1 fleet in the attack";
        field_b = new String[16];
        field_a = new pf();
    }
}
