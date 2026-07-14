/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pb extends le {
    private int field_o;
    private int field_k;
    private int field_h;
    private int field_j;
    private int field_l;
    private int field_p;
    private int field_n;
    private int field_i;
    private int field_q;
    private int field_m;
    private int field_r;

    private final void d(int param0) {
        ((pb) this).field_q = ((pb) this).field_h * 24 + (12 - -this.a(270415848));
        ((pb) this).field_j = ((pb) this).field_k * 24 + (12 - -this.a(param0 ^ 270415728));
        ((pb) this).field_o = -pb.a(so.field_a, 50, param0 ^ 153);
        if (param0 != 152) {
            ((pb) this).field_i = -123;
        }
    }

    private final int a(int param0) {
        if (param0 != 270415848) {
            ((pb) this).field_q = -61;
        }
        return -9 + pb.a(so.field_a, 18, 1);
    }

    final static dj a(boolean param0, boolean param1, int param2, boolean param3, int param4) {
        if (param4 != 1) {
            return null;
        }
        return hd.a(false, true, param2, param1 ? 1 : 0, param0, param3);
    }

    final static void a(int param0, byte param1, int param2) {
        ja.field_d = param0;
        ck.field_n = param2;
        int var3 = -16 / ((param1 - -11) / 63);
    }

    final void e(byte param0) {
        if (param0 != -113) {
            pb.a(-27, 54, -37, 57, -33);
        }
        ((pb) this).field_n = ((pb) this).field_n + 1;
        if (((pb) this).field_n <= 1) {
            return;
        }
        ((pb) this).field_n = 0;
        if ((((pb) this).field_r ^ -1) < -1) {
            ((pb) this).field_r = ((pb) this).field_r - 1;
            return;
        }
        if (((pb) this).field_p < ((pb) this).field_l) {
            ((pb) this).field_p = ((pb) this).field_p + 1;
        }
        ((pb) this).field_o = ((pb) this).field_o + 1;
        if ((((pb) this).field_o + 1 ^ -1) <= -9) {
            this.d(152);
        }
    }

    final static void a(long param0, byte param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param1 > 28) {
            Thread.sleep(param0);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 <= -70) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var1 = (Object) (Object) ng.field_b;
                    // monitorenter ng.field_b
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        kc.field_R = le.field_c;
                        wc.field_Ob = wc.field_Ob + 1;
                        ha.field_b = lf.field_m;
                        ei.field_K = vg.field_c;
                        ll.field_a = kg.field_l;
                        kg.field_l = false;
                        ci.field_d = nb.field_j;
                        nc.field_j = ep.field_m;
                        hp.field_D = pf.field_c;
                        nb.field_j = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int c(int param0) {
        if (param0 != -1) {
            return -109;
        }
        return kg.field_f;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = ZombieDawn.field_J;
        bi.b(param0, param2, param4 - -1, 10000536);
        bi.b(param0, param2 + param1, 1 + param4, 12105912);
        int var5 = 1;
        int var6 = param1;
        if (bi.field_l > var5 + param2) {
            var5 = bi.field_l + -param2;
        }
        if (param3 != 48) {
            return;
        }
        if (bi.field_d < var6 + param2) {
            var6 = -param2 + bi.field_d;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(var7 * 48 / param1);
            var9 = var8 | (var8 << 615794128 | var8 << 270415848);
            bi.field_c[(var7 + param2) * bi.field_f + param0] = var9;
            bi.field_c[(var7 + param2) * bi.field_f - (-param0 + -param4)] = var9;
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        lo var4_ref_lo = null;
        int var4 = 0;
        wg var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        am var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = ZombieDawn.field_J;
        var9 = fj.field_g;
        var2 = var9.d((byte) -122);
        if (param0 >= 63) {
          L0: {
            var3 = var9.d((byte) -126);
            if (0 != var2) {
              if ((var2 ^ -1) == -2) {
                var4 = var9.f((byte) 108);
                var5 = (wg) (Object) jb.field_b.b((byte) 26);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var5.field_i != var3) {
                          break L3;
                        } else {
                          if (var5.field_r != var4) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5 = (wg) (Object) jb.field_b.a(false);
                      continue L1;
                    }
                  }
                  if (var5 == null) {
                    p.a(1);
                    return;
                  } else {
                    var5.b(-27598);
                    break L0;
                  }
                }
              } else {
                ae.a((Throwable) null, 10331, "LR1: " + cb.f(3));
                p.a(1);
                break L0;
              }
            } else {
              var4_ref_lo = (lo) (Object) c.field_b.b((byte) 26);
              if (var4_ref_lo == null) {
                p.a(1);
                return;
              } else {
                L4: {
                  var5_int = jd.field_b + -var9.field_j;
                  var13 = var4_ref_lo.field_o;
                  var12 = var13;
                  var11 = var12;
                  var10 = var11;
                  var6 = var10;
                  if (var13.length << 357534370 < var5_int) {
                    var5_int = var13.length << 1172550658;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var7 >= var5_int) {
                    var4_ref_lo.field_h = true;
                    var4_ref_lo.b(-27598);
                    break L0;
                  } else {
                    var6[var7 >> -926510526] = var6[var7 >> -926510526] + (var9.d((byte) -116) << (eg.a(var7, 3) << -1705059064));
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        if (!((((pb) this).field_r ^ -1) >= -1)) {
            return;
        }
        if (param0 != -28) {
            return;
        }
        ej.field_a.e(param1.a(((pb) this).field_i, (byte) -112) - 30, param1.a(((pb) this).field_m, param0 + 28) + -30, ((pb) this).field_p);
        if (!(-1 < (((pb) this).field_o ^ -1))) {
            var3 = param1.a(((pb) this).field_q, (byte) -77);
            var4 = param1.a(((pb) this).field_j, 0);
            og.field_x[((pb) this).field_o].e(var3 - 11, -11 + (-((pb) this).field_o + (-((pb) this).field_o + var4)) + (-((pb) this).field_o - ((pb) this).field_o), -((pb) this).field_o + 8 << 1883190691);
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 > 87) {
            break L0;
          } else {
            ((pb) this).field_r = 22;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-31 >= Math.abs(param1 - ((pb) this).field_i)) {
              break L2;
            } else {
              if (-31 <= Math.abs(param0 + -((pb) this).field_m)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(Random param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != 1) {
            pb.a(-76, 34, 47, -94, 39);
        }
        if (param1 <= 0) {
            throw new IllegalArgumentException();
        }
        if (!(!ul.a(param1, (byte) 77))) {
            return (int)((long)param1 * ((long)param0.nextInt() & 4294967295L) >> 1465910432);
        }
        int var3 = -2147483648 - (int)(4294967296L % (long)param1);
        while (true) {
            var4 = param0.nextInt();
            if (var4 < var3) {
                break;
            }
        }
        return nd.a(31336, var4, param1);
    }

    pb(int param0, int param1, int param2) {
        ((pb) this).field_k = param1;
        ((pb) this).field_h = param0;
        this.d(152);
        ((pb) this).field_l = pb.a(so.field_a, 10, 1) + 25 >> -1292267742;
        ((pb) this).field_p = 0;
        ((pb) this).field_i = 12 + 24 * ((pb) this).field_h + this.a(270415848);
        ((pb) this).field_m = 12 + (((pb) this).field_k * 24 + this.a(270415848));
        ((pb) this).field_r = pb.a(so.field_a, 10, 1) + param2;
        ((pb) this).field_o = 0;
        ((pb) this).field_n = pb.a(so.field_a, 1, 1);
    }

    static {
    }
}
