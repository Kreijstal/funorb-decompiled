/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements Runnable {
    static ar field_m;
    private ak field_e;
    static int field_b;
    static String field_n;
    static int field_a;
    static String field_i;
    static int field_l;
    static String field_k;
    static int field_g;
    private Thread field_h;
    static int field_c;
    int field_d;
    private boolean field_j;
    static int field_f;

    private final void a(nq param0, int param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = this.field_e;
            synchronized (var3) {
              L1: {
                this.field_e.a(false, param0);
                this.field_d = this.field_d + 1;
                this.field_e.notifyAll();
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                t.a(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("t.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            r var2 = (r) null;
            t.a((fp) null, 44, 108, (r) null);
        }
        field_n = null;
        field_m = null;
        field_i = null;
        field_k = null;
    }

    public final void run() {
        try {
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Exception var2 = null;
            Object var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            nq var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Vertigo2.field_L ? 1 : 0;
            L0: while (true) {
              if (this.field_j) {
                return;
              } else {
                var2_ref = this.field_e;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (nq) ((Object) this.field_e.a(-112));
                    if (var7 != null) {
                      this.field_d = this.field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_e.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if ((var7.field_B ^ -1) == -3) {
                          discarded$1 = var7.field_F.a(var7.field_L.length, (int)var7.field_n, var7.field_L, (byte) -84);
                          var7.field_z = false;
                          break L5;
                        } else {
                          if (3 == var7.field_B) {
                            var7.field_L = var7.field_F.a((int)var7.field_n, 27176);
                            var7.field_z = false;
                            break L5;
                          } else {
                            var7.field_z = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      ke.a((Throwable) ((Object) var2), (String) null, 0);
                      var7.field_z = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        try {
            this.field_j = true;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
            }
            if (param0 > -8) {
                r var4 = (r) null;
                t.a((fp) null, 6, 3, (r) null);
            }
            try {
                this.field_h.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (sp.field_V) {
            if (vj.field_h) {
                return;
            }
        }
        if (null == hj.field_e) {
            hj.field_e = hm.a(4, true);
        }
        if (null == bs.field_Xb) {
            bs.field_Xb = ol.a(106, 5, 0, 1);
        }
        if (hj.field_e != null) {
            if (!(!hj.field_e.field_o)) {
                jq.field_e = jq.field_e & (hj.field_e.field_p ^ -1);
                ml.field_z = ml.field_z | hj.field_e.field_p;
                sp.field_V = true;
                hj.field_e = null;
            }
        }
        if (bs.field_Xb != null) {
            if (!(!bs.field_Xb.field_p)) {
                var1 = -1 + bs.field_Xb.field_o[0];
                vj.field_h = true;
                bs.field_Xb = null;
                if (!(field_l >= var1)) {
                    field_l = var1;
                }
            }
        }
        if (param0 != 44) {
            r var2 = (r) null;
            t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
        }
        if (sp.field_V) {
            if (vj.field_h) {
                le.a(468713154);
                jn.a(param0 ^ 41);
                if (lc.field_b == 9) {
                    if (jq.field_e == 0) {
                        lc.field_b = 5;
                        gj.a((byte) -123, false, am.field_n, 5);
                    }
                }
            }
        }
    }

    final static void a(fp param0, int param1, int param2, r param3) {
        try {
            sq.field_e = param2 * el.b(true) / 1000;
            hi.a(param3, 56);
            jl.a(param3, (byte) -85);
            ao.a(param1 + -1513236, param3);
            uc.a((byte) 73);
            bs.a((byte) -12);
            if (param1 != 1513239) {
                field_f = 65;
            }
            hm.field_F = -sq.field_e + 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "t.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 < 26) {
            r var6 = (r) null;
            t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
        }
        hq.field_r = param2;
        jm.field_G = param3;
        ml.field_v = param0;
        cd.field_a = param1;
    }

    final nq a(boolean param0, qh param1, int param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nq var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        nq stackIn_8_0 = null;
        nq stackIn_15_0 = null;
        nq stackIn_16_0 = null;
        nq stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        nq stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        nq stackOut_7_0 = null;
        nq stackOut_14_0 = null;
        nq stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        nq stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        nq stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new nq();
            var4.field_B = 1;
            var5 = this.field_e;
            synchronized (var5) {
              L1: {
                var6 = (nq) ((Object) this.field_e.b((byte) -50));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((var6.field_n ^ -1L) != ((long)param2 ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_F != param1) {
                          break L3;
                        } else {
                          if (2 != var6.field_B) {
                            break L3;
                          } else {
                            var4.field_L = var6.field_L;
                            var4.field_z = false;
                            stackOut_7_0 = (nq) (var4);
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (nq) ((Object) this.field_e.a(true));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_L = param1.a(param2, 27176);
              stackOut_14_0 = (nq) (var4);
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param0) {
                stackOut_16_0 = (nq) ((Object) stackIn_16_0);
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L4;
              } else {
                stackOut_15_0 = (nq) ((Object) stackIn_15_0);
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L4;
              }
            }
            stackIn_17_0.field_u = stackIn_17_1 != 0;
            var4.field_z = false;
            stackOut_17_0 = (nq) (var4);
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4_ref);
            stackOut_19_1 = new StringBuilder().append("t.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final nq a(qh param0, int param1, byte param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nq stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        nq stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5 = -57 % ((3 - param2) / 35);
            var4 = new nq();
            var4.field_n = (long)param1;
            var4.field_u = false;
            var4.field_B = 3;
            var4.field_F = param0;
            this.a(var4, 0);
            stackOut_0_0 = (nq) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("t.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(u[] param0, int[] param1, r param2, r param3, boolean param4) {
        er[] dupTemp$4 = null;
        er[] dupTemp$5 = null;
        er[] dupTemp$6 = null;
        er[] dupTemp$7 = null;
        RuntimeException var5 = null;
        u[] var5_array = null;
        int[] var6 = null;
        u[] var6_array = null;
        int var7_int = 0;
        co var7 = null;
        cr var8 = null;
        cr var9 = null;
        cr var10 = null;
        cr var11 = null;
        er[] var12 = null;
        er[] var13 = null;
        er[] var14 = null;
        cr var15 = null;
        er[] var16 = null;
        er[] var17 = null;
        int var18 = 0;
        int[] var19 = null;
        u[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        cr stackIn_21_0 = null;
        r stackIn_21_1 = null;
        String stackIn_21_2 = null;
        String stackIn_21_3 = null;
        cr stackIn_22_0 = null;
        r stackIn_22_1 = null;
        String stackIn_22_2 = null;
        String stackIn_22_3 = null;
        cr stackIn_23_0 = null;
        r stackIn_23_1 = null;
        String stackIn_23_2 = null;
        String stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        cr stackIn_24_0 = null;
        r stackIn_24_1 = null;
        String stackIn_24_2 = null;
        String stackIn_24_3 = null;
        cr stackIn_25_0 = null;
        r stackIn_25_1 = null;
        String stackIn_25_2 = null;
        String stackIn_25_3 = null;
        cr stackIn_26_0 = null;
        r stackIn_26_1 = null;
        String stackIn_26_2 = null;
        String stackIn_26_3 = null;
        int stackIn_26_4 = 0;
        cr stackIn_27_0 = null;
        r stackIn_27_1 = null;
        String stackIn_27_2 = null;
        String stackIn_27_3 = null;
        cr stackIn_28_0 = null;
        r stackIn_28_1 = null;
        String stackIn_28_2 = null;
        String stackIn_28_3 = null;
        cr stackIn_29_0 = null;
        r stackIn_29_1 = null;
        String stackIn_29_2 = null;
        String stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        cr stackIn_30_0 = null;
        r stackIn_30_1 = null;
        String stackIn_30_2 = null;
        String stackIn_30_3 = null;
        cr stackIn_31_0 = null;
        r stackIn_31_1 = null;
        String stackIn_31_2 = null;
        String stackIn_31_3 = null;
        cr stackIn_32_0 = null;
        r stackIn_32_1 = null;
        String stackIn_32_2 = null;
        String stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        cr stackIn_33_0 = null;
        r stackIn_33_1 = null;
        String stackIn_33_2 = null;
        String stackIn_33_3 = null;
        cr stackIn_34_0 = null;
        r stackIn_34_1 = null;
        String stackIn_34_2 = null;
        String stackIn_34_3 = null;
        cr stackIn_35_0 = null;
        r stackIn_35_1 = null;
        String stackIn_35_2 = null;
        String stackIn_35_3 = null;
        int stackIn_35_4 = 0;
        cr stackIn_36_0 = null;
        r stackIn_36_1 = null;
        String stackIn_36_2 = null;
        String stackIn_36_3 = null;
        cr stackIn_37_0 = null;
        r stackIn_37_1 = null;
        String stackIn_37_2 = null;
        String stackIn_37_3 = null;
        cr stackIn_38_0 = null;
        r stackIn_38_1 = null;
        String stackIn_38_2 = null;
        String stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        cr stackIn_39_0 = null;
        r stackIn_39_1 = null;
        String stackIn_39_2 = null;
        String stackIn_39_3 = null;
        cr stackIn_40_0 = null;
        r stackIn_40_1 = null;
        String stackIn_40_2 = null;
        String stackIn_40_3 = null;
        cr stackIn_41_0 = null;
        r stackIn_41_1 = null;
        String stackIn_41_2 = null;
        String stackIn_41_3 = null;
        int stackIn_41_4 = 0;
        cr stackIn_42_0 = null;
        r stackIn_42_1 = null;
        String stackIn_42_2 = null;
        String stackIn_42_3 = null;
        cr stackIn_43_0 = null;
        r stackIn_43_1 = null;
        String stackIn_43_2 = null;
        String stackIn_43_3 = null;
        cr stackIn_44_0 = null;
        r stackIn_44_1 = null;
        String stackIn_44_2 = null;
        String stackIn_44_3 = null;
        int stackIn_44_4 = 0;
        cr stackIn_45_0 = null;
        r stackIn_45_1 = null;
        String stackIn_45_2 = null;
        String stackIn_45_3 = null;
        cr stackIn_46_0 = null;
        r stackIn_46_1 = null;
        String stackIn_46_2 = null;
        String stackIn_46_3 = null;
        cr stackIn_47_0 = null;
        r stackIn_47_1 = null;
        String stackIn_47_2 = null;
        String stackIn_47_3 = null;
        int stackIn_47_4 = 0;
        cr stackIn_48_0 = null;
        r stackIn_48_1 = null;
        String stackIn_48_2 = null;
        String stackIn_48_3 = null;
        cr stackIn_49_0 = null;
        r stackIn_49_1 = null;
        String stackIn_49_2 = null;
        String stackIn_49_3 = null;
        cr stackIn_50_0 = null;
        r stackIn_50_1 = null;
        String stackIn_50_2 = null;
        String stackIn_50_3 = null;
        int stackIn_50_4 = 0;
        cr stackIn_51_0 = null;
        r stackIn_51_1 = null;
        String stackIn_51_2 = null;
        String stackIn_51_3 = null;
        cr stackIn_52_0 = null;
        r stackIn_52_1 = null;
        String stackIn_52_2 = null;
        String stackIn_52_3 = null;
        cr stackIn_53_0 = null;
        r stackIn_53_1 = null;
        String stackIn_53_2 = null;
        String stackIn_53_3 = null;
        int stackIn_53_4 = 0;
        cr stackIn_54_0 = null;
        r stackIn_54_1 = null;
        String stackIn_54_2 = null;
        String stackIn_54_3 = null;
        cr stackIn_55_0 = null;
        r stackIn_55_1 = null;
        String stackIn_55_2 = null;
        String stackIn_55_3 = null;
        cr stackIn_56_0 = null;
        r stackIn_56_1 = null;
        String stackIn_56_2 = null;
        String stackIn_56_3 = null;
        int stackIn_56_4 = 0;
        r stackIn_57_0 = null;
        String stackIn_57_1 = null;
        String stackIn_57_2 = null;
        r stackIn_58_0 = null;
        String stackIn_58_1 = null;
        String stackIn_58_2 = null;
        r stackIn_59_0 = null;
        String stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int stackIn_59_3 = 0;
        cr stackIn_60_0 = null;
        r stackIn_60_1 = null;
        String stackIn_60_2 = null;
        String stackIn_60_3 = null;
        cr stackIn_61_0 = null;
        r stackIn_61_1 = null;
        String stackIn_61_2 = null;
        String stackIn_61_3 = null;
        cr stackIn_62_0 = null;
        r stackIn_62_1 = null;
        String stackIn_62_2 = null;
        String stackIn_62_3 = null;
        int stackIn_62_4 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cr stackOut_20_0 = null;
        r stackOut_20_1 = null;
        String stackOut_20_2 = null;
        String stackOut_20_3 = null;
        cr stackOut_22_0 = null;
        r stackOut_22_1 = null;
        String stackOut_22_2 = null;
        String stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        cr stackOut_21_0 = null;
        r stackOut_21_1 = null;
        String stackOut_21_2 = null;
        String stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        cr stackOut_23_0 = null;
        r stackOut_23_1 = null;
        String stackOut_23_2 = null;
        String stackOut_23_3 = null;
        cr stackOut_25_0 = null;
        r stackOut_25_1 = null;
        String stackOut_25_2 = null;
        String stackOut_25_3 = null;
        int stackOut_25_4 = 0;
        cr stackOut_24_0 = null;
        r stackOut_24_1 = null;
        String stackOut_24_2 = null;
        String stackOut_24_3 = null;
        int stackOut_24_4 = 0;
        cr stackOut_26_0 = null;
        r stackOut_26_1 = null;
        String stackOut_26_2 = null;
        String stackOut_26_3 = null;
        cr stackOut_28_0 = null;
        r stackOut_28_1 = null;
        String stackOut_28_2 = null;
        String stackOut_28_3 = null;
        int stackOut_28_4 = 0;
        cr stackOut_27_0 = null;
        r stackOut_27_1 = null;
        String stackOut_27_2 = null;
        String stackOut_27_3 = null;
        int stackOut_27_4 = 0;
        cr stackOut_29_0 = null;
        r stackOut_29_1 = null;
        String stackOut_29_2 = null;
        String stackOut_29_3 = null;
        cr stackOut_31_0 = null;
        r stackOut_31_1 = null;
        String stackOut_31_2 = null;
        String stackOut_31_3 = null;
        int stackOut_31_4 = 0;
        cr stackOut_30_0 = null;
        r stackOut_30_1 = null;
        String stackOut_30_2 = null;
        String stackOut_30_3 = null;
        int stackOut_30_4 = 0;
        cr stackOut_32_0 = null;
        r stackOut_32_1 = null;
        String stackOut_32_2 = null;
        String stackOut_32_3 = null;
        cr stackOut_34_0 = null;
        r stackOut_34_1 = null;
        String stackOut_34_2 = null;
        String stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        cr stackOut_33_0 = null;
        r stackOut_33_1 = null;
        String stackOut_33_2 = null;
        String stackOut_33_3 = null;
        int stackOut_33_4 = 0;
        cr stackOut_35_0 = null;
        r stackOut_35_1 = null;
        String stackOut_35_2 = null;
        String stackOut_35_3 = null;
        cr stackOut_37_0 = null;
        r stackOut_37_1 = null;
        String stackOut_37_2 = null;
        String stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        cr stackOut_36_0 = null;
        r stackOut_36_1 = null;
        String stackOut_36_2 = null;
        String stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        cr stackOut_38_0 = null;
        r stackOut_38_1 = null;
        String stackOut_38_2 = null;
        String stackOut_38_3 = null;
        cr stackOut_40_0 = null;
        r stackOut_40_1 = null;
        String stackOut_40_2 = null;
        String stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        cr stackOut_39_0 = null;
        r stackOut_39_1 = null;
        String stackOut_39_2 = null;
        String stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        cr stackOut_41_0 = null;
        r stackOut_41_1 = null;
        String stackOut_41_2 = null;
        String stackOut_41_3 = null;
        cr stackOut_43_0 = null;
        r stackOut_43_1 = null;
        String stackOut_43_2 = null;
        String stackOut_43_3 = null;
        int stackOut_43_4 = 0;
        cr stackOut_42_0 = null;
        r stackOut_42_1 = null;
        String stackOut_42_2 = null;
        String stackOut_42_3 = null;
        int stackOut_42_4 = 0;
        cr stackOut_44_0 = null;
        r stackOut_44_1 = null;
        String stackOut_44_2 = null;
        String stackOut_44_3 = null;
        cr stackOut_46_0 = null;
        r stackOut_46_1 = null;
        String stackOut_46_2 = null;
        String stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        cr stackOut_45_0 = null;
        r stackOut_45_1 = null;
        String stackOut_45_2 = null;
        String stackOut_45_3 = null;
        int stackOut_45_4 = 0;
        cr stackOut_47_0 = null;
        r stackOut_47_1 = null;
        String stackOut_47_2 = null;
        String stackOut_47_3 = null;
        cr stackOut_49_0 = null;
        r stackOut_49_1 = null;
        String stackOut_49_2 = null;
        String stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        cr stackOut_48_0 = null;
        r stackOut_48_1 = null;
        String stackOut_48_2 = null;
        String stackOut_48_3 = null;
        int stackOut_48_4 = 0;
        cr stackOut_50_0 = null;
        r stackOut_50_1 = null;
        String stackOut_50_2 = null;
        String stackOut_50_3 = null;
        cr stackOut_52_0 = null;
        r stackOut_52_1 = null;
        String stackOut_52_2 = null;
        String stackOut_52_3 = null;
        int stackOut_52_4 = 0;
        cr stackOut_51_0 = null;
        r stackOut_51_1 = null;
        String stackOut_51_2 = null;
        String stackOut_51_3 = null;
        int stackOut_51_4 = 0;
        cr stackOut_53_0 = null;
        r stackOut_53_1 = null;
        String stackOut_53_2 = null;
        String stackOut_53_3 = null;
        cr stackOut_55_0 = null;
        r stackOut_55_1 = null;
        String stackOut_55_2 = null;
        String stackOut_55_3 = null;
        int stackOut_55_4 = 0;
        cr stackOut_54_0 = null;
        r stackOut_54_1 = null;
        String stackOut_54_2 = null;
        String stackOut_54_3 = null;
        int stackOut_54_4 = 0;
        r stackOut_56_0 = null;
        String stackOut_56_1 = null;
        String stackOut_56_2 = null;
        r stackOut_58_0 = null;
        String stackOut_58_1 = null;
        String stackOut_58_2 = null;
        int stackOut_58_3 = 0;
        r stackOut_57_0 = null;
        String stackOut_57_1 = null;
        String stackOut_57_2 = null;
        int stackOut_57_3 = 0;
        cr stackOut_59_0 = null;
        r stackOut_59_1 = null;
        String stackOut_59_2 = null;
        String stackOut_59_3 = null;
        cr stackOut_61_0 = null;
        r stackOut_61_1 = null;
        String stackOut_61_2 = null;
        String stackOut_61_3 = null;
        int stackOut_61_4 = 0;
        cr stackOut_60_0 = null;
        r stackOut_60_1 = null;
        String stackOut_60_2 = null;
        String stackOut_60_3 = null;
        int stackOut_60_4 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var18 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var20 = oh.a((byte) -39, "crowns", "lobby", param3);
              var5_array = var20;
              eh.field_e = var20.length;
              if (param0 == null) {
                break L1;
              } else {
                var6_array = new u[param0.length + eh.field_e];
                var7_int = 0;
                L2: while (true) {
                  if (eh.field_e <= var7_int) {
                    var7_int = 0;
                    L3: while (true) {
                      if (var7_int >= param0.length) {
                        var5_array = var6_array;
                        break L1;
                      } else {
                        var6_array[var7_int + eh.field_e] = param0[var7_int];
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var6_array[var7_int] = var20[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              }
            }
            var23 = new int[var5_array.length];
            var21 = var23;
            var19 = var21;
            var24 = var19;
            var22 = var24;
            var6 = var22;
            var7_int = 0;
            L4: while (true) {
              if (var7_int >= eh.field_e) {
                L5: {
                  if (param0 == null) {
                    break L5;
                  } else {
                    if (param1 != null) {
                      var7_int = 0;
                      L6: while (true) {
                        if (var7_int >= param0.length) {
                          break L5;
                        } else {
                          var6[var7_int + eh.field_e] = param1[var7_int];
                          var7_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var7_int = 0;
                      L7: while (true) {
                        if (var7_int >= param0.length) {
                          break L5;
                        } else {
                          var6[eh.field_e + var7_int] = param0[var7_int].field_h;
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  nl.field_k = 2;
                  r.field_j = 2;
                  r.field_f = 15;
                  ia.field_G = 4;
                  hc.field_b = 11;
                  var7 = w.a(param2, param3, "largefont", "lobby", 121);
                  li.field_e = w.a(param2, param3, "generalfont", "lobby", 104);
                  kb.field_c = w.a(param2, param3, "chatfont", "lobby", 121);
                  var7.a(var5_array, var24);
                  li.field_e.a(var5_array, var24);
                  kb.field_c.a(var5_array, var24);
                  var8 = new cr(0L, (cr) null);
                  var8.field_z = (cc) ((Object) var7);
                  var8.field_qb = r.field_f;
                  var8.field_A = 16777215;
                  var9 = var8;
                  var8.field_ab = 1;
                  var9.field_O = 1;
                  var10 = new cr(0L, (cr) null);
                  var10.field_z = (cc) ((Object) li.field_e);
                  var10.field_qb = r.field_f;
                  var10.field_A = 16777215;
                  var10.field_ab = 1;
                  var11 = var10;
                  var11.field_O = 1;
                  j.field_q = new cr(0L, var8);
                  j.field_q.field_Bb = hq.a(gk.a(param3, "lobby", "heading", true), 202);
                  rq.field_t = new cr(0L, (cr) null);
                  rq.field_t.field_Bb = ml.a((byte) -13, 8421504, false, 4210752, 120, param4);
                  lk.field_a = new cr(0L, (cr) null);
                  lk.field_a.field_Bb = vl.a(114, 3, 0, 1, 6316128, 6316128);
                  vf.field_B = new cr(0L, (cr) null);
                  vf.field_B.field_Bb = hq.a(gk.a(param3, "lobby", "popup", true), 202);
                  var12 = hq.a(gk.a(param3, "lobby", "popup_mouseover", true), 202);
                  var13 = gk.a(param3, "lobby", "button", true);
                  var14 = hq.a(gk.a(param3, "lobby", "tab_active", true), 202);
                  ji.field_s = new cr(0L, var8);
                  ji.field_s.field_Bb = var14;
                  eh.field_a = new cr(0L, (cr) null);
                  eh.field_a.field_Db = tn.a("closebutton", param3, -82, "lobby");
                  eh.field_a.field_W = tn.a("closebutton_mouseover", param3, -90, "lobby");
                  gn.field_f = new cr(0L, var8);
                  gn.field_f.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 40, true);
                  db.field_t = new cr(0L, var10);
                  db.field_t.field_R = 2;
                  db.field_t.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 30, false);
                  kl.field_Ib = new cr(0L, var10);
                  kl.field_Ib.field_R = 2;
                  kl.field_Ib.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, false);
                  sa.field_a = new cr(0L, var10);
                  sa.field_a.field_R = 2;
                  sa.field_a.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, true);
                  ee.field_b = new cr(0L, (cr) null);
                  ee.field_b.field_qb = r.field_f;
                  ee.field_b.field_ab = 1;
                  ee.field_b.field_A = 13421772;
                  ee.field_b.field_z = (cc) ((Object) li.field_e);
                  ja.field_e = new cr(0L, ee.field_b);
                  ja.field_e.field_H = 16777215;
                  ja.field_e.field_B = 16777215;
                  ja.field_e.field_A = 16764006;
                  ja.field_e.field_D = 8421504;
                  ja.field_e.field_K = 16777215;
                  var15 = new cr(0L, ja.field_e);
                  var15.field_z = (cc) ((Object) var7);
                  var15.field_qb = r.field_f;
                  var15.field_A = 16777215;
                  pn.field_N = new cr(0L, ee.field_b);
                  pn.field_N.field_Bb = ml.a((byte) -13, 2236962, false, 2236962, 16, false);
                  pn.field_N.field_R = 2;
                  fm.field_e = new cr(0L, ee.field_b);
                  fm.field_e.field_Bb = ml.a((byte) -13, 1513239, false, 1513239, 16, false);
                  fm.field_e.field_R = 2;
                  tm.field_b = new cr(0L, pn.field_N);
                  tm.field_b.a(ja.field_e, -46);
                  el.field_b = new cr(0L, fm.field_e);
                  el.field_b.a(ja.field_e, -104);
                  var16 = gk.a(param3, "lobby", "button_mouseover", true);
                  ar.field_c = new kq(vf.field_B, var12, ee.field_b, ja.field_e, 3, 2, r.field_j, 3, r.field_f);
                  bq.field_B = new cr(0L, ja.field_e);
                  bq.field_B.field_bb = 1;
                  bq.field_B.field_Y = 1;
                  bq.field_B.field_Cb = 1;
                  bq.field_B.field_Q = var16;
                  bq.field_B.field_Bb = var13;
                  bq.field_B.field_Gb = 1;
                  bq.field_B.field_cb = gk.a(param3, "lobby", "button_mouseheld", true);
                  stackOut_20_0 = bq.field_B;
                  stackOut_20_1 = (r) (param3);
                  stackOut_20_2 = "lobby";
                  stackOut_20_3 = "button_active";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  stackIn_22_3 = stackOut_20_3;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  stackIn_21_3 = stackOut_20_3;
                  if (param4) {
                    stackOut_22_0 = (cr) ((Object) stackIn_22_0);
                    stackOut_22_1 = (r) ((Object) stackIn_22_1);
                    stackOut_22_2 = (String) ((Object) stackIn_22_2);
                    stackOut_22_3 = (String) ((Object) stackIn_22_3);
                    stackOut_22_4 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    stackIn_23_4 = stackOut_22_4;
                    break L8;
                  } else {
                    stackOut_21_0 = (cr) ((Object) stackIn_21_0);
                    stackOut_21_1 = (r) ((Object) stackIn_21_1);
                    stackOut_21_2 = (String) ((Object) stackIn_21_2);
                    stackOut_21_3 = (String) ((Object) stackIn_21_3);
                    stackOut_21_4 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    stackIn_23_4 = stackOut_21_4;
                    break L8;
                  }
                }
                L9: {
                  stackIn_23_0.field_T = gk.a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4 != 0);
                  stackOut_23_0 = bq.field_B;
                  stackOut_23_1 = (r) (param3);
                  stackOut_23_2 = "lobby";
                  stackOut_23_3 = "button_disabled";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_25_3 = stackOut_23_3;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  stackIn_24_3 = stackOut_23_3;
                  if (param4) {
                    stackOut_25_0 = (cr) ((Object) stackIn_25_0);
                    stackOut_25_1 = (r) ((Object) stackIn_25_1);
                    stackOut_25_2 = (String) ((Object) stackIn_25_2);
                    stackOut_25_3 = (String) ((Object) stackIn_25_3);
                    stackOut_25_4 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    break L9;
                  } else {
                    stackOut_24_0 = (cr) ((Object) stackIn_24_0);
                    stackOut_24_1 = (r) ((Object) stackIn_24_1);
                    stackOut_24_2 = (String) ((Object) stackIn_24_2);
                    stackOut_24_3 = (String) ((Object) stackIn_24_3);
                    stackOut_24_4 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    stackIn_26_3 = stackOut_24_3;
                    stackIn_26_4 = stackOut_24_4;
                    break L9;
                  }
                }
                L10: {
                  stackIn_26_0.field_gb = gk.a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4 != 0);
                  bq.field_B.field_O = 1;
                  qr.field_m = new cr(0L, ja.field_e);
                  qr.field_m.field_O = 1;
                  stackOut_26_0 = qr.field_m;
                  stackOut_26_1 = (r) (param3);
                  stackOut_26_2 = "lobby";
                  stackOut_26_3 = "tab_inactive";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  stackIn_27_3 = stackOut_26_3;
                  if (param4) {
                    stackOut_28_0 = (cr) ((Object) stackIn_28_0);
                    stackOut_28_1 = (r) ((Object) stackIn_28_1);
                    stackOut_28_2 = (String) ((Object) stackIn_28_2);
                    stackOut_28_3 = (String) ((Object) stackIn_28_3);
                    stackOut_28_4 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    stackIn_29_3 = stackOut_28_3;
                    stackIn_29_4 = stackOut_28_4;
                    break L10;
                  } else {
                    stackOut_27_0 = (cr) ((Object) stackIn_27_0);
                    stackOut_27_1 = (r) ((Object) stackIn_27_1);
                    stackOut_27_2 = (String) ((Object) stackIn_27_2);
                    stackOut_27_3 = (String) ((Object) stackIn_27_3);
                    stackOut_27_4 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    stackIn_29_3 = stackOut_27_3;
                    stackIn_29_4 = stackOut_27_4;
                    break L10;
                  }
                }
                L11: {
                  stackIn_29_0.field_Bb = hq.a(gk.a(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4 != 0), 202);
                  stackOut_29_0 = qr.field_m;
                  stackOut_29_1 = (r) (param3);
                  stackOut_29_2 = "lobby";
                  stackOut_29_3 = "tab_mouseover";
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  stackIn_31_2 = stackOut_29_2;
                  stackIn_31_3 = stackOut_29_3;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  stackIn_30_3 = stackOut_29_3;
                  if (param4) {
                    stackOut_31_0 = (cr) ((Object) stackIn_31_0);
                    stackOut_31_1 = (r) ((Object) stackIn_31_1);
                    stackOut_31_2 = (String) ((Object) stackIn_31_2);
                    stackOut_31_3 = (String) ((Object) stackIn_31_3);
                    stackOut_31_4 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    stackIn_32_3 = stackOut_31_3;
                    stackIn_32_4 = stackOut_31_4;
                    break L11;
                  } else {
                    stackOut_30_0 = (cr) ((Object) stackIn_30_0);
                    stackOut_30_1 = (r) ((Object) stackIn_30_1);
                    stackOut_30_2 = (String) ((Object) stackIn_30_2);
                    stackOut_30_3 = (String) ((Object) stackIn_30_3);
                    stackOut_30_4 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    stackIn_32_2 = stackOut_30_2;
                    stackIn_32_3 = stackOut_30_3;
                    stackIn_32_4 = stackOut_30_4;
                    break L11;
                  }
                }
                L12: {
                  stackIn_32_0.field_Q = hq.a(gk.a(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4 != 0), 202);
                  qr.field_m.field_T = var14;
                  ab.field_d = new cr(0L, (cr) null);
                  ab.field_d.field_Bb = vl.a(206, 3, 0, -1, 1856141, 1127256);
                  dj.field_b = new cr(0L, (cr) null);
                  dj.field_b.field_Bb = vl.a(290, 3, 0, -1, 11579568, 6052956);
                  fb.field_u = new cr(0L, var15);
                  fb.field_u.field_bb = 1;
                  fb.field_u.field_Gb = 1;
                  fb.field_u.field_O = 1;
                  fb.field_u.field_Y = 1;
                  fb.field_u.field_Cb = 1;
                  ub.field_t = new cr(0L, fb.field_u);
                  uk.field_e = new cr(0L, ja.field_e);
                  uk.field_e.field_Cb = 1;
                  uk.field_e.field_O = 1;
                  uk.field_e.field_Y = 1;
                  uk.field_e.field_Gb = 1;
                  uk.field_e.field_bb = 1;
                  sc.field_c = new cr(0L, uk.field_e);
                  gh.field_b = new cr(0L, uk.field_e);
                  vc.field_b = new cr(0L, fb.field_u);
                  ip.field_a = new cr(0L, uk.field_e);
                  ca.field_f = new cr(0L, uk.field_e);
                  tr.field_l = new cr(0L, uk.field_e);
                  uk.field_e.field_Bb = hq.a(gk.a(param3, "lobby", "smallbutton", true), 202);
                  uk.field_e.field_Q = hq.a(gk.a(param3, "lobby", "smallbutton_mouseover", true), 202);
                  dupTemp$4 = hq.a(gk.a(param3, "lobby", "smallbutton_active", true), 202);
                  uk.field_e.field_T = dupTemp$4;
                  uk.field_e.field_cb = dupTemp$4;
                  stackOut_32_0 = uk.field_e;
                  stackOut_32_1 = (r) (param3);
                  stackOut_32_2 = "lobby";
                  stackOut_32_3 = "smallbutton_disabled";
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  if (param4) {
                    stackOut_34_0 = (cr) ((Object) stackIn_34_0);
                    stackOut_34_1 = (r) ((Object) stackIn_34_1);
                    stackOut_34_2 = (String) ((Object) stackIn_34_2);
                    stackOut_34_3 = (String) ((Object) stackIn_34_3);
                    stackOut_34_4 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    stackIn_35_4 = stackOut_34_4;
                    break L12;
                  } else {
                    stackOut_33_0 = (cr) ((Object) stackIn_33_0);
                    stackOut_33_1 = (r) ((Object) stackIn_33_1);
                    stackOut_33_2 = (String) ((Object) stackIn_33_2);
                    stackOut_33_3 = (String) ((Object) stackIn_33_3);
                    stackOut_33_4 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_35_4 = stackOut_33_4;
                    break L12;
                  }
                }
                L13: {
                  stackIn_35_0.field_gb = hq.a(gk.a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4 != 0), 202);
                  ub.field_t.field_Bb = hq.a(gk.a(param3, "lobby", "mediumbutton", true), 202);
                  ub.field_t.field_Q = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseover", true), 202);
                  ub.field_t.field_cb = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseheld", true), 202);
                  fb.field_u.field_Bb = hq.a(gk.a(param3, "lobby", "bigbutton", true), 202);
                  fb.field_u.field_Q = hq.a(gk.a(param3, "lobby", "bigbutton_mouseover", true), 202);
                  stackOut_35_0 = fb.field_u;
                  stackOut_35_1 = (r) (param3);
                  stackOut_35_2 = "lobby";
                  stackOut_35_3 = "bigbutton_mouseheld";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  stackIn_37_3 = stackOut_35_3;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  if (param4) {
                    stackOut_37_0 = (cr) ((Object) stackIn_37_0);
                    stackOut_37_1 = (r) ((Object) stackIn_37_1);
                    stackOut_37_2 = (String) ((Object) stackIn_37_2);
                    stackOut_37_3 = (String) ((Object) stackIn_37_3);
                    stackOut_37_4 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    stackIn_38_3 = stackOut_37_3;
                    stackIn_38_4 = stackOut_37_4;
                    break L13;
                  } else {
                    stackOut_36_0 = (cr) ((Object) stackIn_36_0);
                    stackOut_36_1 = (r) ((Object) stackIn_36_1);
                    stackOut_36_2 = (String) ((Object) stackIn_36_2);
                    stackOut_36_3 = (String) ((Object) stackIn_36_3);
                    stackOut_36_4 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_38_2 = stackOut_36_2;
                    stackIn_38_3 = stackOut_36_3;
                    stackIn_38_4 = stackOut_36_4;
                    break L13;
                  }
                }
                L14: {
                  stackIn_38_0.field_cb = hq.a(gk.a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4 != 0), 202);
                  fb.field_u.field_gb = hq.a(gk.a(param3, "lobby", "bigbutton_disabled", true), 202);
                  sc.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "greenbutton", true), 202);
                  stackOut_38_0 = sc.field_c;
                  stackOut_38_1 = (r) (param3);
                  stackOut_38_2 = "lobby";
                  stackOut_38_3 = "greenbutton_mouseover";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  stackIn_40_3 = stackOut_38_3;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  stackIn_39_3 = stackOut_38_3;
                  if (param4) {
                    stackOut_40_0 = (cr) ((Object) stackIn_40_0);
                    stackOut_40_1 = (r) ((Object) stackIn_40_1);
                    stackOut_40_2 = (String) ((Object) stackIn_40_2);
                    stackOut_40_3 = (String) ((Object) stackIn_40_3);
                    stackOut_40_4 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    stackIn_41_3 = stackOut_40_3;
                    stackIn_41_4 = stackOut_40_4;
                    break L14;
                  } else {
                    stackOut_39_0 = (cr) ((Object) stackIn_39_0);
                    stackOut_39_1 = (r) ((Object) stackIn_39_1);
                    stackOut_39_2 = (String) ((Object) stackIn_39_2);
                    stackOut_39_3 = (String) ((Object) stackIn_39_3);
                    stackOut_39_4 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    stackIn_41_3 = stackOut_39_3;
                    stackIn_41_4 = stackOut_39_4;
                    break L14;
                  }
                }
                L15: {
                  stackIn_41_0.field_Q = hq.a(gk.a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4 != 0), 202);
                  stackOut_41_0 = sc.field_c;
                  stackOut_41_1 = (r) (param3);
                  stackOut_41_2 = "lobby";
                  stackOut_41_3 = "greenbutton_mouseheld";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  stackIn_43_3 = stackOut_41_3;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  stackIn_42_3 = stackOut_41_3;
                  if (param4) {
                    stackOut_43_0 = (cr) ((Object) stackIn_43_0);
                    stackOut_43_1 = (r) ((Object) stackIn_43_1);
                    stackOut_43_2 = (String) ((Object) stackIn_43_2);
                    stackOut_43_3 = (String) ((Object) stackIn_43_3);
                    stackOut_43_4 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    stackIn_44_3 = stackOut_43_3;
                    stackIn_44_4 = stackOut_43_4;
                    break L15;
                  } else {
                    stackOut_42_0 = (cr) ((Object) stackIn_42_0);
                    stackOut_42_1 = (r) ((Object) stackIn_42_1);
                    stackOut_42_2 = (String) ((Object) stackIn_42_2);
                    stackOut_42_3 = (String) ((Object) stackIn_42_3);
                    stackOut_42_4 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_44_2 = stackOut_42_2;
                    stackIn_44_3 = stackOut_42_3;
                    stackIn_44_4 = stackOut_42_4;
                    break L15;
                  }
                }
                L16: {
                  stackIn_44_0.field_cb = hq.a(gk.a(stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4 != 0), 202);
                  gh.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "redbutton", true), 202);
                  gh.field_b.field_Q = hq.a(gk.a(param3, "lobby", "redbutton_mouseover", true), 202);
                  stackOut_44_0 = gh.field_b;
                  stackOut_44_1 = (r) (param3);
                  stackOut_44_2 = "lobby";
                  stackOut_44_3 = "redbutton_mouseheld";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  stackIn_46_3 = stackOut_44_3;
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  stackIn_45_2 = stackOut_44_2;
                  stackIn_45_3 = stackOut_44_3;
                  if (param4) {
                    stackOut_46_0 = (cr) ((Object) stackIn_46_0);
                    stackOut_46_1 = (r) ((Object) stackIn_46_1);
                    stackOut_46_2 = (String) ((Object) stackIn_46_2);
                    stackOut_46_3 = (String) ((Object) stackIn_46_3);
                    stackOut_46_4 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    stackIn_47_2 = stackOut_46_2;
                    stackIn_47_3 = stackOut_46_3;
                    stackIn_47_4 = stackOut_46_4;
                    break L16;
                  } else {
                    stackOut_45_0 = (cr) ((Object) stackIn_45_0);
                    stackOut_45_1 = (r) ((Object) stackIn_45_1);
                    stackOut_45_2 = (String) ((Object) stackIn_45_2);
                    stackOut_45_3 = (String) ((Object) stackIn_45_3);
                    stackOut_45_4 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    stackIn_47_2 = stackOut_45_2;
                    stackIn_47_3 = stackOut_45_3;
                    stackIn_47_4 = stackOut_45_4;
                    break L16;
                  }
                }
                L17: {
                  stackIn_47_0.field_cb = hq.a(gk.a(stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4 != 0), 202);
                  vc.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "backbutton", true), 202);
                  vc.field_b.field_Q = hq.a(gk.a(param3, "lobby", "backbutton_mouseover", true), 202);
                  vc.field_b.field_cb = hq.a(gk.a(param3, "lobby", "backbutton_mouseheld", true), 202);
                  vc.field_b.field_gb = hq.a(gk.a(param3, "lobby", "backbutton_disabled", true), 202);
                  tr.field_l.field_Bb = hq.a(gk.a(param3, "lobby", "gameoptionbutton", true), 202);
                  stackOut_47_0 = tr.field_l;
                  stackOut_47_1 = (r) (param3);
                  stackOut_47_2 = "lobby";
                  stackOut_47_3 = "gameoptionbutton_mouseover";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  stackIn_49_3 = stackOut_47_3;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  stackIn_48_3 = stackOut_47_3;
                  if (param4) {
                    stackOut_49_0 = (cr) ((Object) stackIn_49_0);
                    stackOut_49_1 = (r) ((Object) stackIn_49_1);
                    stackOut_49_2 = (String) ((Object) stackIn_49_2);
                    stackOut_49_3 = (String) ((Object) stackIn_49_3);
                    stackOut_49_4 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    stackIn_50_3 = stackOut_49_3;
                    stackIn_50_4 = stackOut_49_4;
                    break L17;
                  } else {
                    stackOut_48_0 = (cr) ((Object) stackIn_48_0);
                    stackOut_48_1 = (r) ((Object) stackIn_48_1);
                    stackOut_48_2 = (String) ((Object) stackIn_48_2);
                    stackOut_48_3 = (String) ((Object) stackIn_48_3);
                    stackOut_48_4 = 1;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    stackIn_50_2 = stackOut_48_2;
                    stackIn_50_3 = stackOut_48_3;
                    stackIn_50_4 = stackOut_48_4;
                    break L17;
                  }
                }
                L18: {
                  stackIn_50_0.field_Q = hq.a(gk.a(stackIn_50_1, stackIn_50_2, stackIn_50_3, stackIn_50_4 != 0), 202);
                  dupTemp$5 = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active", true), 202);
                  tr.field_l.field_T = dupTemp$5;
                  tr.field_l.field_cb = dupTemp$5;
                  tr.field_l.field_gb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_disabled", true), 202);
                  ip.field_a.field_Bb = hq.a(gk.a(param3, "lobby", "chatbutton", true), 202);
                  ip.field_a.field_Q = hq.a(gk.a(param3, "lobby", "chatbutton_mouseover", true), 202);
                  dupTemp$6 = hq.a(gk.a(param3, "lobby", "chatbutton_active", true), 202);
                  ip.field_a.field_T = dupTemp$6;
                  ip.field_a.field_cb = dupTemp$6;
                  stackOut_50_0 = ca.field_f;
                  stackOut_50_1 = (r) (param3);
                  stackOut_50_2 = "lobby";
                  stackOut_50_3 = "chatfilterbutton";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  stackIn_52_3 = stackOut_50_3;
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  stackIn_51_3 = stackOut_50_3;
                  if (param4) {
                    stackOut_52_0 = (cr) ((Object) stackIn_52_0);
                    stackOut_52_1 = (r) ((Object) stackIn_52_1);
                    stackOut_52_2 = (String) ((Object) stackIn_52_2);
                    stackOut_52_3 = (String) ((Object) stackIn_52_3);
                    stackOut_52_4 = 0;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    stackIn_53_2 = stackOut_52_2;
                    stackIn_53_3 = stackOut_52_3;
                    stackIn_53_4 = stackOut_52_4;
                    break L18;
                  } else {
                    stackOut_51_0 = (cr) ((Object) stackIn_51_0);
                    stackOut_51_1 = (r) ((Object) stackIn_51_1);
                    stackOut_51_2 = (String) ((Object) stackIn_51_2);
                    stackOut_51_3 = (String) ((Object) stackIn_51_3);
                    stackOut_51_4 = 1;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_53_1 = stackOut_51_1;
                    stackIn_53_2 = stackOut_51_2;
                    stackIn_53_3 = stackOut_51_3;
                    stackIn_53_4 = stackOut_51_4;
                    break L18;
                  }
                }
                L19: {
                  stackIn_53_0.field_Bb = hq.a(gk.a(stackIn_53_1, stackIn_53_2, stackIn_53_3, stackIn_53_4 != 0), 202);
                  stackOut_53_0 = ca.field_f;
                  stackOut_53_1 = (r) (param3);
                  stackOut_53_2 = "lobby";
                  stackOut_53_3 = "chatfilterbutton_mouseover";
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  stackIn_55_3 = stackOut_53_3;
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  stackIn_54_3 = stackOut_53_3;
                  if (param4) {
                    stackOut_55_0 = (cr) ((Object) stackIn_55_0);
                    stackOut_55_1 = (r) ((Object) stackIn_55_1);
                    stackOut_55_2 = (String) ((Object) stackIn_55_2);
                    stackOut_55_3 = (String) ((Object) stackIn_55_3);
                    stackOut_55_4 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    stackIn_56_3 = stackOut_55_3;
                    stackIn_56_4 = stackOut_55_4;
                    break L19;
                  } else {
                    stackOut_54_0 = (cr) ((Object) stackIn_54_0);
                    stackOut_54_1 = (r) ((Object) stackIn_54_1);
                    stackOut_54_2 = (String) ((Object) stackIn_54_2);
                    stackOut_54_3 = (String) ((Object) stackIn_54_3);
                    stackOut_54_4 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_56_2 = stackOut_54_2;
                    stackIn_56_3 = stackOut_54_3;
                    stackIn_56_4 = stackOut_54_4;
                    break L19;
                  }
                }
                L20: {
                  stackIn_56_0.field_Q = hq.a(gk.a(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4 != 0), 202);
                  dupTemp$7 = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active", true), 202);
                  ca.field_f.field_T = dupTemp$7;
                  ca.field_f.field_cb = dupTemp$7;
                  stackOut_56_0 = (r) (param3);
                  stackOut_56_1 = "lobby";
                  stackOut_56_2 = "checkbox";
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_58_1 = stackOut_56_1;
                  stackIn_58_2 = stackOut_56_2;
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  stackIn_57_2 = stackOut_56_2;
                  if (param4) {
                    stackOut_58_0 = (r) ((Object) stackIn_58_0);
                    stackOut_58_1 = (String) ((Object) stackIn_58_1);
                    stackOut_58_2 = (String) ((Object) stackIn_58_2);
                    stackOut_58_3 = 0;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    stackIn_59_2 = stackOut_58_2;
                    stackIn_59_3 = stackOut_58_3;
                    break L20;
                  } else {
                    stackOut_57_0 = (r) ((Object) stackIn_57_0);
                    stackOut_57_1 = (String) ((Object) stackIn_57_1);
                    stackOut_57_2 = (String) ((Object) stackIn_57_2);
                    stackOut_57_3 = 1;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    stackIn_59_2 = stackOut_57_2;
                    stackIn_59_3 = stackOut_57_3;
                    break L20;
                  }
                }
                L21: {
                  var17 = gk.a(stackIn_59_0, stackIn_59_1, stackIn_59_2, stackIn_59_3 != 0);
                  fr.field_a = new sm(0L, var17[1], var17[0], 1, ja.field_e, (String) null);
                  tb.field_a = new cr(0L, (cr) null);
                  tb.field_a.field_Bb = rh.a(tn.a("slideregion", param3, -90, "lobby"), -27140);
                  tb.field_a.field_Q = rh.a(tn.a("slideregion_mouseover", param3, -95, "lobby"), -27140);
                  tb.field_a.field_cb = rh.a(tn.a("slideregion_mouseheld", param3, -77, "lobby"), -27140);
                  tb.field_a.field_gb = rh.a(tn.a("slideregion_disabled", param3, -89, "lobby"), -27140);
                  sj.field_c = new cr(0L, (cr) null);
                  sj.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "dragbar", true), 202);
                  stackOut_59_0 = sj.field_c;
                  stackOut_59_1 = (r) (param3);
                  stackOut_59_2 = "lobby";
                  stackOut_59_3 = "dragbar_mouseover";
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_61_1 = stackOut_59_1;
                  stackIn_61_2 = stackOut_59_2;
                  stackIn_61_3 = stackOut_59_3;
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  stackIn_60_2 = stackOut_59_2;
                  stackIn_60_3 = stackOut_59_3;
                  if (param4) {
                    stackOut_61_0 = (cr) ((Object) stackIn_61_0);
                    stackOut_61_1 = (r) ((Object) stackIn_61_1);
                    stackOut_61_2 = (String) ((Object) stackIn_61_2);
                    stackOut_61_3 = (String) ((Object) stackIn_61_3);
                    stackOut_61_4 = 0;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    stackIn_62_2 = stackOut_61_2;
                    stackIn_62_3 = stackOut_61_3;
                    stackIn_62_4 = stackOut_61_4;
                    break L21;
                  } else {
                    stackOut_60_0 = (cr) ((Object) stackIn_60_0);
                    stackOut_60_1 = (r) ((Object) stackIn_60_1);
                    stackOut_60_2 = (String) ((Object) stackIn_60_2);
                    stackOut_60_3 = (String) ((Object) stackIn_60_3);
                    stackOut_60_4 = 1;
                    stackIn_62_0 = stackOut_60_0;
                    stackIn_62_1 = stackOut_60_1;
                    stackIn_62_2 = stackOut_60_2;
                    stackIn_62_3 = stackOut_60_3;
                    stackIn_62_4 = stackOut_60_4;
                    break L21;
                  }
                }
                stackIn_62_0.field_Q = hq.a(gk.a(stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_62_4 != 0), 202);
                sj.field_c.field_cb = hq.a(gk.a(param3, "lobby", "dragbar_mouseheld", true), 202);
                sj.field_c.field_gb = hq.a(gk.a(param3, "lobby", "dragbar_disabled", true), 202);
                ad.field_e = new cr(0L, (cr) null);
                ad.field_e.field_Db = tn.a("upbutton", param3, -73, "lobby");
                ad.field_e.field_W = tn.a("upbutton_mouseover", param3, -107, "lobby");
                ad.field_e.field_Ab = tn.a("upbutton_mouseheld", param3, -100, "lobby");
                ad.field_e.field_I = tn.a("upbutton_disabled", param3, -80, "lobby");
                lc.field_e = new cr(0L, (cr) null);
                lc.field_e.field_Db = tn.a("downbutton", param3, -101, "lobby");
                lc.field_e.field_W = tn.a("downbutton_mouseover", param3, -77, "lobby");
                lc.field_e.field_Ab = tn.a("downbutton_mouseheld", param3, -114, "lobby");
                lc.field_e.field_I = tn.a("downbutton_disabled", param3, -99, "lobby");
                ol.field_H = new ie(0L, ad.field_e, lc.field_e, tb.field_a, sj.field_c);
                pb.field_b = new dm(0L, (cr) null, ua.field_c, ol.field_H, uk.field_e, (String) null, (String) null);
                break L0;
              } else {
                var23[var7_int] = 10;
                var7_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var5 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var5);
            stackOut_64_1 = new StringBuilder().append("t.F(");
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param0 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L22;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L22;
            }
          }
          L23: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L23;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L23;
            }
          }
          L24: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L24;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L24;
            }
          }
          L25: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L25;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L25;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param4 + ')');
        }
    }

    final nq a(int param0, int param1, qh param2, byte[] param3) {
        nq var5 = null;
        RuntimeException var5_ref = null;
        nq stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        nq stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5 = new nq();
              var5.field_B = 2;
              var5.field_n = (long)param1;
              var5.field_u = false;
              var5.field_F = param2;
              if (param0 == -19932) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            var5.field_L = param3;
            this.a(var5, 0);
            stackOut_2_0 = (nq) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("t.E(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    t(jj param0) {
        wk var2 = null;
        this.field_e = new ak();
        this.field_d = 0;
        this.field_j = false;
        try {
            var2 = param0.a(5, (Runnable) (this), 0);
            while (0 == var2.field_b) {
                um.a(true, 10L);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            this.field_h = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Unable to delete name - system busy";
        field_k = "Clan";
        field_a = 0;
        field_b = 0;
        field_i = "Level select";
        field_f = field_a;
        field_m = null;
        field_g = 49;
    }
}
