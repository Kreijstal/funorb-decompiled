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
        this.field_q = this.field_h * 24 + (12 - -this.a(270415848));
        this.field_j = this.field_k * 24 + (12 - -this.a(param0 ^ 270415728));
        this.field_o = -pb.a(so.field_a, 50, param0 ^ 153);
        if (param0 != 152) {
            this.field_i = -123;
        }
    }

    private final int a(int param0) {
        if (param0 != 270415848) {
            this.field_q = -61;
        }
        return -9 + pb.a(so.field_a, 18, 1);
    }

    final static dj a(boolean param0, boolean param1, int param2, boolean param3, int param4) {
        if (param4 != 1) {
            return (dj) null;
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
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        if (fieldTemp$0 <= 1) {
            return;
        }
        this.field_n = 0;
        if ((this.field_r ^ -1) < -1) {
            this.field_r = this.field_r - 1;
            return;
        }
        if (this.field_p < this.field_l) {
            this.field_p = this.field_p + 1;
        }
        int fieldTemp$1 = this.field_o + 1;
        this.field_o = this.field_o + 1;
        if ((fieldTemp$1 ^ -1) <= -9) {
            this.d(152);
        }
    }

    final static void a(long param0, byte param1) {
        try {
            InterruptedException var3 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 > 28) {
                  Thread.sleep(param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
        if (param0 <= -70) {
          var1 = ng.field_b;
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
          return;
        } else {
          return;
        }
    }

    final static int c(int param0) {
        if (param0 != -1) {
            return -109;
        }
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
        int decompiledRegionSelector0 = 0;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 152 - -(var7 * 48 / param1);
                  var9 = var8 | (var8 << 615794128 | var8 << 270415848);
                  bi.field_c[(var7 + param2) * bi.field_f + param0] = var9;
                  bi.field_c[(var7 + param2) * bi.field_f - (-param0 + -param4)] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "pb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var9 = fj.field_g;
            var2 = var9.d((byte) -122);
            if (param0 >= 63) {
              L1: {
                var3 = var9.d((byte) -126);
                if (0 != var2) {
                  if ((var2 ^ -1) == -2) {
                    var4 = var9.f((byte) 108);
                    var5 = (wg) ((Object) jb.field_b.b((byte) 26));
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
                          var5 = (wg) ((Object) jb.field_b.a(false));
                          continue L2;
                        }
                      }
                      if (var5 == null) {
                        p.a(1);
                        decompiledRegionSelector0 = 3;
                        break L0;
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
                  var4_ref_lo = (lo) ((Object) c.field_b.b((byte) 26));
                  if (var4_ref_lo == null) {
                    p.a(1);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L5: {
                      var5_int = jd.field_b + -var9.field_j;
                      var11 = var4_ref_lo.field_o;
                      var10 = var11;
                      var6 = var10;
                      if (var11.length << 357534370 < var5_int) {
                        var5_int = var11.length << 1172550658;
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
                        var6[var7 >> -926510526] = var6[var7 >> -926510526] + (var9.d((byte) -116) << (eg.a(var7, 3) << -1705059064));
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "pb.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
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
        int decompiledRegionSelector0 = 0;
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
            if ((this.field_r ^ -1) < -1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == -28) {
                L1: {
                  ej.field_a.e(param1.a(this.field_i, (byte) -112) - 30, param1.a(this.field_m, param0 + 28) + -30, this.field_p);
                  if (-1 >= (this.field_o ^ -1)) {
                    var3_int = param1.a(this.field_q, (byte) -77);
                    var4 = param1.a(this.field_j, 0);
                    og.field_x[this.field_o].e(var3_int - 11, -11 + (-this.field_o + (-this.field_o + var4)) + (-this.field_o - this.field_o), -this.field_o + 8 << 1883190691);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("pb.M(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
            this.field_r = 22;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-31 >= (Math.abs(param1 - this.field_i) ^ -1)) {
              break L2;
            } else {
              if (-31 >= (Math.abs(param0 + -this.field_m) ^ -1)) {
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
        int decompiledRegionSelector0 = 0;
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
                stackOut_6_0 = (int)((long)param1 * ((long)param0.nextInt() & 4294967295L) >> 1465910432);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3_int = -2147483648 - (int)(4294967296L % (long)param1);
                L2: while (true) {
                  var4 = param0.nextInt();
                  if (var4 < var3_int) {
                    stackOut_11_0 = nd.a(31336, var4, param1);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
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
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("pb.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    pb(int param0, int param1, int param2) {
        this.field_k = param1;
        this.field_h = param0;
        this.d(152);
        this.field_l = pb.a(so.field_a, 10, 1) + 25 >> -1292267742;
        this.field_p = 0;
        this.field_i = 12 + 24 * this.field_h + this.a(270415848);
        this.field_m = 12 + (this.field_k * 24 + this.a(270415848));
        this.field_r = pb.a(so.field_a, 10, 1) + param2;
        this.field_o = 0;
        this.field_n = pb.a(so.field_a, 1, 1);
    }

    static {
    }
}
