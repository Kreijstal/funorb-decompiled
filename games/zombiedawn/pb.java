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
        ((pb) this).field_j = ((pb) this).field_k * 24 + (12 - -this.a(270415848));
        ((pb) this).field_o = -pb.a(so.field_a, 50, 1);
    }

    private final int a(int param0) {
        if (param0 != 270415848) {
            ((pb) this).field_q = -61;
        }
        return -9 + pb.a(so.field_a, 18, 1);
    }

    final static dj a(boolean param0, boolean param1, int param2, boolean param3, int param4) {
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
        int fieldTemp$0 = ((pb) this).field_n;
        ((pb) this).field_n = ((pb) this).field_n + 1;
        if (fieldTemp$0 <= 1) {
            return;
        }
        ((pb) this).field_n = 0;
        if (((pb) this).field_r > 0) {
            ((pb) this).field_r = ((pb) this).field_r - 1;
            return;
        }
        if (((pb) this).field_p < ((pb) this).field_l) {
            ((pb) this).field_p = ((pb) this).field_p + 1;
        }
        int fieldTemp$1 = ((pb) this).field_o + 1;
        ((pb) this).field_o = ((pb) this).field_o + 1;
        if (fieldTemp$1 >= 8) {
            this.d(152);
        }
    }

    final static void a(long param0, byte param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 > 28) {
                  Thread.sleep(param0);
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) ng.field_b;
        synchronized (var1) {
          L0: {
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
            break L0;
          }
        }
    }

    final static int c(int param0) {
        return kg.field_f;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              bi.b(param0, param2, param4 - -1, 10000536);
              bi.b(param0, param2 + param1, 1 + param4, 12105912);
              var5_int = 1;
              var6 = param1;
              if (bi.field_l <= var5_int + param2) {
                break L1;
              } else {
                var5_int = bi.field_l + -param2;
                break L1;
              }
            }
            if (param3 == 48) {
              L2: {
                if (bi.field_d >= var6 + param2) {
                  break L2;
                } else {
                  var6 = -param2 + bi.field_d;
                  break L2;
                }
              }
              var7 = var5_int;
              L3: while (true) {
                if (var7 >= var6) {
                  break L0;
                } else {
                  var8 = 152 - -(var7 * 48 / param1);
                  var9 = var8 | (var8 << 16 | var8 << 8);
                  bi.field_c[(var7 + param2) * bi.field_f + param0] = var9;
                  bi.field_c[(var7 + param2) * bi.field_f - (-param0 + -param4)] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var5, "pb.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var9 = fj.field_g;
            var2 = var9.d((byte) -122);
            L1: {
              var3 = var9.d((byte) -126);
              if (0 != var2) {
                if (var2 == 1) {
                  var4 = var9.f((byte) 108);
                  var5 = (wg) (Object) jb.field_b.b((byte) 26);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var5.field_i != var3) {
                            break L4;
                          } else {
                            if (var5.field_r != var4) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = (wg) (Object) jb.field_b.a(false);
                        continue L2;
                      }
                    }
                    if (var5 == null) {
                      p.a(1);
                      return;
                    } else {
                      var5.b(-27598);
                      break L1;
                    }
                  }
                } else {
                  ae.a((Throwable) null, 10331, "LR1: " + cb.f(3));
                  p.a(1);
                  break L1;
                }
              } else {
                var4_ref_lo = (lo) (Object) c.field_b.b((byte) 26);
                if (var4_ref_lo == null) {
                  p.a(1);
                  return;
                } else {
                  L5: {
                    var5_int = jd.field_b + -var9.field_j;
                    var13 = var4_ref_lo.field_o;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var13.length << 2 < var5_int) {
                      var5_int = var13.length << 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5_int) {
                      var4_ref_lo.field_h = true;
                      var4_ref_lo.b(-27598);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -116) << (eg.a(var7, 3) << 8));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "pb.A(" + 68 + 41);
        }
    }

    final void a(byte param0, wk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((pb) this).field_r > 0) {
              return;
            } else {
              if (param0 == -28) {
                L1: {
                  ej.field_a.e(param1.a(((pb) this).field_i, (byte) -112) - 30, param1.a(((pb) this).field_m, param0 + 28) + -30, ((pb) this).field_p);
                  if (((pb) this).field_o >= 0) {
                    var3_int = param1.a(((pb) this).field_q, (byte) -77);
                    var4 = param1.a(((pb) this).field_j, 0);
                    og.field_x[((pb) this).field_o].e(var3_int - 11, -11 + (-((pb) this).field_o + (-((pb) this).field_o + var4)) + (-((pb) this).field_o - ((pb) this).field_o), -((pb) this).field_o + 8 << 3);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("pb.M(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                pb.a(-76, 34, 47, -94, 39);
                break L1;
              }
            }
            if (param1 > 0) {
              if (ul.a(param1, (byte) 77)) {
                stackOut_6_0 = (int)((long)param1 * ((long)param0.nextInt() & 4294967295L) >> 32);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3_int = -2147483648 - (int)(4294967296L % (long)param1);
                L2: while (true) {
                  var4 = param0.nextInt();
                  if (var4 < var3_int) {
                    stackOut_11_0 = nd.a(31336, var4, param1);
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("pb.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    pb(int param0, int param1, int param2) {
        ((pb) this).field_k = param1;
        ((pb) this).field_h = param0;
        this.d(152);
        ((pb) this).field_l = pb.a(so.field_a, 10, 1) + 25 >> 2;
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
