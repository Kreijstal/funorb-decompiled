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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("t.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
            InterruptedException interruptedException = null;
            int var5 = 0;
            nq var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Vertigo2.field_L ? 1 : 0;
            L0: while (true) {
              if (this.field_j) {
                return;
              } else {
                var2 = this.field_e;
                synchronized (var2) {
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
                          var7.field_F.a(var7.field_L.length, (int)var7.field_n, var7.field_L, (byte) -84);
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
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      ke.a((Throwable) ((Object) var2_ref), (String) null, 0);
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
        int var1;
        r var2;
        L0: {
          if (!sp.field_V) {
            break L0;
          } else {
            if (!vj.field_h) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (null != hj.field_e) {
            break L1;
          } else {
            hj.field_e = hm.a(4, true);
            break L1;
          }
        }
        L2: {
          if (null != bs.field_Xb) {
            break L2;
          } else {
            bs.field_Xb = ol.a(106, 5, 0, 1);
            break L2;
          }
        }
        L3: {
          if (hj.field_e == null) {
            break L3;
          } else {
            if (hj.field_e.field_o) {
              jq.field_e = jq.field_e & (hj.field_e.field_p ^ -1);
              ml.field_z = ml.field_z | hj.field_e.field_p;
              sp.field_V = true;
              hj.field_e = null;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (bs.field_Xb == null) {
            break L4;
          } else {
            if (bs.field_Xb.field_p) {
              var1 = -1 + bs.field_Xb.field_o[0];
              vj.field_h = true;
              bs.field_Xb = null;
              if (field_l < var1) {
                field_l = var1;
                break L4;
              } else {
                break L4;
              }
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (param0 == 44) {
            break L5;
          } else {
            var2 = (r) null;
            t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
            break L5;
          }
        }
        L6: {
          if (!sp.field_V) {
            break L6;
          } else {
            L7: {
              if (!vj.field_h) {
                break L7;
              } else {
                le.a(468713154);
                jn.a(param0 ^ 41);
                if (lc.field_b != 9) {
                  break L7;
                } else {
                  if (jq.field_e != 0) {
                    break L7;
                  } else {
                    lc.field_b = 5;
                    gj.a((byte) -123, false, am.field_n, 5);
                    break L6;
                  }
                }
              }
            }
            break L6;
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
        int var8 = 0;
        nq stackIn_8_0 = null;
        nq stackIn_16_0 = null;
        nq stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        nq stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
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
                            stackIn_8_0 = (nq) (var4);
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
              stackIn_16_0 = (nq) (var4);

              if (!param0) {
                stackIn_17_0 = (nq) ((Object) stackIn_16_0);
                stackIn_17_1 = 0;
                break L4;
              } else {
                stackIn_17_0 = (nq) ((Object) stackIn_16_0);
                stackIn_17_1 = 1;
                break L4;
              }
            }
            stackIn_17_0.field_u = stackIn_17_1 != 0;
            var4.field_z = false;
            stackIn_18_0 = (nq) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("t.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = -57 % ((3 - param2) / 35);
            var4 = new nq();
            var4.field_n = (long)param1;
            var4.field_u = false;
            var4.field_B = 3;
            var4.field_F = param0;
            this.a(var4, 0);
            stackIn_1_0 = (nq) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("t.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(u[] param0, int[] param1, r param2, r param3, boolean param4) {
        er[] dupTemp$0 = null;
        er[] dupTemp$1 = null;
        er[] dupTemp$2 = null;
        er[] dupTemp$3 = null;
        u[] var5 = null;
        u[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        u[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        cr stackIn_22_0;
        r stackIn_22_1;
        String stackIn_22_2;
        String stackIn_22_3;
        cr stackIn_23_0 = null;
        r stackIn_23_1 = null;
        String stackIn_23_2 = null;
        String stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        cr stackIn_25_0;
        r stackIn_25_1;
        String stackIn_25_2;
        String stackIn_25_3;
        cr stackIn_26_0 = null;
        r stackIn_26_1 = null;
        String stackIn_26_2 = null;
        String stackIn_26_3 = null;
        int stackIn_26_4 = 0;
        cr stackIn_28_0;
        r stackIn_28_1;
        String stackIn_28_2;
        String stackIn_28_3;
        cr stackIn_29_0 = null;
        r stackIn_29_1 = null;
        String stackIn_29_2 = null;
        String stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        cr stackIn_31_0;
        r stackIn_31_1;
        String stackIn_31_2;
        String stackIn_31_3;
        cr stackIn_32_0 = null;
        r stackIn_32_1 = null;
        String stackIn_32_2 = null;
        String stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        cr stackIn_34_0;
        r stackIn_34_1;
        String stackIn_34_2;
        String stackIn_34_3;
        cr stackIn_35_0 = null;
        r stackIn_35_1 = null;
        String stackIn_35_2 = null;
        String stackIn_35_3 = null;
        int stackIn_35_4 = 0;
        cr stackIn_37_0;
        r stackIn_37_1;
        String stackIn_37_2;
        String stackIn_37_3;
        cr stackIn_38_0 = null;
        r stackIn_38_1 = null;
        String stackIn_38_2 = null;
        String stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        cr stackIn_40_0;
        r stackIn_40_1;
        String stackIn_40_2;
        String stackIn_40_3;
        cr stackIn_41_0 = null;
        r stackIn_41_1 = null;
        String stackIn_41_2 = null;
        String stackIn_41_3 = null;
        int stackIn_41_4 = 0;
        cr stackIn_43_0;
        r stackIn_43_1;
        String stackIn_43_2;
        String stackIn_43_3;
        cr stackIn_44_0 = null;
        r stackIn_44_1 = null;
        String stackIn_44_2 = null;
        String stackIn_44_3 = null;
        int stackIn_44_4 = 0;
        cr stackIn_46_0;
        r stackIn_46_1;
        String stackIn_46_2;
        String stackIn_46_3;
        cr stackIn_47_0 = null;
        r stackIn_47_1 = null;
        String stackIn_47_2 = null;
        String stackIn_47_3 = null;
        int stackIn_47_4 = 0;
        cr stackIn_49_0;
        r stackIn_49_1;
        String stackIn_49_2;
        String stackIn_49_3;
        cr stackIn_50_0 = null;
        r stackIn_50_1 = null;
        String stackIn_50_2 = null;
        String stackIn_50_3 = null;
        int stackIn_50_4 = 0;
        cr stackIn_52_0;
        r stackIn_52_1;
        String stackIn_52_2;
        String stackIn_52_3;
        cr stackIn_53_0 = null;
        r stackIn_53_1 = null;
        String stackIn_53_2 = null;
        String stackIn_53_3 = null;
        int stackIn_53_4 = 0;
        cr stackIn_55_0;
        r stackIn_55_1;
        String stackIn_55_2;
        String stackIn_55_3;
        cr stackIn_56_0 = null;
        r stackIn_56_1 = null;
        String stackIn_56_2 = null;
        String stackIn_56_3 = null;
        int stackIn_56_4 = 0;
        r stackIn_58_0 = null;
        String stackIn_58_1 = null;
        String stackIn_58_2 = null;
        r stackIn_59_0 = null;
        String stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int stackIn_59_3 = 0;
        cr stackIn_61_0;
        r stackIn_61_1;
        String stackIn_61_2;
        String stackIn_61_3;
        cr stackIn_62_0;
        r stackIn_62_1;
        String stackIn_62_2;
        String stackIn_62_3;
        int stackIn_62_4;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
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
        var18 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var20 = oh.a((byte) -39, "crowns", "lobby", param3);
              var5 = var20;
              eh.field_e = var20.length;
              if (param0 == null) {
                break L1;
              } else {
                var6 = new u[param0.length + eh.field_e];
                var7_int = 0;
                L2: while (true) {
                  if (eh.field_e <= var7_int) {
                    var7_int = 0;
                    L3: while (true) {
                      if (var7_int >= param0.length) {
                        var5 = var6;
                        break L1;
                      } else {
                        var6[var7_int + eh.field_e] = param0[var7_int];
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var6[var7_int] = var20[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              }
            }
            var23 = new int[var5.length];
            var21 = var23;
            var19 = var21;
            var24 = var19;
            var22 = var24;
            var6_array = var22;
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
                          var6_array[var7_int + eh.field_e] = param1[var7_int];
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
                          var6_array[eh.field_e + var7_int] = param0[var7_int].field_h;
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
                  var7.a(var5, var24);
                  li.field_e.a(var5, var24);
                  kb.field_c.a(var5, var24);
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
                  stackIn_22_0 = bq.field_B;

                  stackIn_22_1 = (r) (param3);

                  stackIn_22_2 = "lobby";

                  stackIn_22_3 = "button_active";

                  if (param4) {
                    stackIn_23_0 = (cr) ((Object) stackIn_22_0);
                    stackIn_23_1 = (r) ((Object) stackIn_22_1);
                    stackIn_23_2 = (String) ((Object) stackIn_22_2);
                    stackIn_23_3 = (String) ((Object) stackIn_22_3);
                    stackIn_23_4 = 0;
                    break L8;
                  } else {
                    stackIn_23_0 = (cr) ((Object) stackIn_22_0);
                    stackIn_23_1 = (r) ((Object) stackIn_22_1);
                    stackIn_23_2 = (String) ((Object) stackIn_22_2);
                    stackIn_23_3 = (String) ((Object) stackIn_22_3);
                    stackIn_23_4 = 1;
                    break L8;
                  }
                }
                L9: {
                  stackIn_23_0.field_T = gk.a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4 != 0);
                  stackIn_25_0 = bq.field_B;

                  stackIn_25_1 = (r) (param3);

                  stackIn_25_2 = "lobby";

                  stackIn_25_3 = "button_disabled";

                  if (param4) {
                    stackIn_26_0 = (cr) ((Object) stackIn_25_0);
                    stackIn_26_1 = (r) ((Object) stackIn_25_1);
                    stackIn_26_2 = (String) ((Object) stackIn_25_2);
                    stackIn_26_3 = (String) ((Object) stackIn_25_3);
                    stackIn_26_4 = 0;
                    break L9;
                  } else {
                    stackIn_26_0 = (cr) ((Object) stackIn_25_0);
                    stackIn_26_1 = (r) ((Object) stackIn_25_1);
                    stackIn_26_2 = (String) ((Object) stackIn_25_2);
                    stackIn_26_3 = (String) ((Object) stackIn_25_3);
                    stackIn_26_4 = 1;
                    break L9;
                  }
                }
                L10: {
                  stackIn_26_0.field_gb = gk.a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4 != 0);
                  bq.field_B.field_O = 1;
                  qr.field_m = new cr(0L, ja.field_e);
                  qr.field_m.field_O = 1;
                  stackIn_28_0 = qr.field_m;

                  stackIn_28_1 = (r) (param3);

                  stackIn_28_2 = "lobby";

                  stackIn_28_3 = "tab_inactive";

                  if (param4) {
                    stackIn_29_0 = (cr) ((Object) stackIn_28_0);
                    stackIn_29_1 = (r) ((Object) stackIn_28_1);
                    stackIn_29_2 = (String) ((Object) stackIn_28_2);
                    stackIn_29_3 = (String) ((Object) stackIn_28_3);
                    stackIn_29_4 = 0;
                    break L10;
                  } else {
                    stackIn_29_0 = (cr) ((Object) stackIn_28_0);
                    stackIn_29_1 = (r) ((Object) stackIn_28_1);
                    stackIn_29_2 = (String) ((Object) stackIn_28_2);
                    stackIn_29_3 = (String) ((Object) stackIn_28_3);
                    stackIn_29_4 = 1;
                    break L10;
                  }
                }
                L11: {
                  stackIn_29_0.field_Bb = hq.a(gk.a(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4 != 0), 202);
                  stackIn_31_0 = qr.field_m;

                  stackIn_31_1 = (r) (param3);

                  stackIn_31_2 = "lobby";

                  stackIn_31_3 = "tab_mouseover";

                  if (param4) {
                    stackIn_32_0 = (cr) ((Object) stackIn_31_0);
                    stackIn_32_1 = (r) ((Object) stackIn_31_1);
                    stackIn_32_2 = (String) ((Object) stackIn_31_2);
                    stackIn_32_3 = (String) ((Object) stackIn_31_3);
                    stackIn_32_4 = 0;
                    break L11;
                  } else {
                    stackIn_32_0 = (cr) ((Object) stackIn_31_0);
                    stackIn_32_1 = (r) ((Object) stackIn_31_1);
                    stackIn_32_2 = (String) ((Object) stackIn_31_2);
                    stackIn_32_3 = (String) ((Object) stackIn_31_3);
                    stackIn_32_4 = 1;
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
                  dupTemp$0 = hq.a(gk.a(param3, "lobby", "smallbutton_active", true), 202);
                  uk.field_e.field_T = dupTemp$0;
                  uk.field_e.field_cb = dupTemp$0;
                  stackIn_34_0 = uk.field_e;

                  stackIn_34_1 = (r) (param3);

                  stackIn_34_2 = "lobby";

                  stackIn_34_3 = "smallbutton_disabled";

                  if (param4) {
                    stackIn_35_0 = (cr) ((Object) stackIn_34_0);
                    stackIn_35_1 = (r) ((Object) stackIn_34_1);
                    stackIn_35_2 = (String) ((Object) stackIn_34_2);
                    stackIn_35_3 = (String) ((Object) stackIn_34_3);
                    stackIn_35_4 = 0;
                    break L12;
                  } else {
                    stackIn_35_0 = (cr) ((Object) stackIn_34_0);
                    stackIn_35_1 = (r) ((Object) stackIn_34_1);
                    stackIn_35_2 = (String) ((Object) stackIn_34_2);
                    stackIn_35_3 = (String) ((Object) stackIn_34_3);
                    stackIn_35_4 = 1;
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
                  stackIn_37_0 = fb.field_u;

                  stackIn_37_1 = (r) (param3);

                  stackIn_37_2 = "lobby";

                  stackIn_37_3 = "bigbutton_mouseheld";

                  if (param4) {
                    stackIn_38_0 = (cr) ((Object) stackIn_37_0);
                    stackIn_38_1 = (r) ((Object) stackIn_37_1);
                    stackIn_38_2 = (String) ((Object) stackIn_37_2);
                    stackIn_38_3 = (String) ((Object) stackIn_37_3);
                    stackIn_38_4 = 0;
                    break L13;
                  } else {
                    stackIn_38_0 = (cr) ((Object) stackIn_37_0);
                    stackIn_38_1 = (r) ((Object) stackIn_37_1);
                    stackIn_38_2 = (String) ((Object) stackIn_37_2);
                    stackIn_38_3 = (String) ((Object) stackIn_37_3);
                    stackIn_38_4 = 1;
                    break L13;
                  }
                }
                L14: {
                  stackIn_38_0.field_cb = hq.a(gk.a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4 != 0), 202);
                  fb.field_u.field_gb = hq.a(gk.a(param3, "lobby", "bigbutton_disabled", true), 202);
                  sc.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "greenbutton", true), 202);
                  stackIn_40_0 = sc.field_c;

                  stackIn_40_1 = (r) (param3);

                  stackIn_40_2 = "lobby";

                  stackIn_40_3 = "greenbutton_mouseover";

                  if (param4) {
                    stackIn_41_0 = (cr) ((Object) stackIn_40_0);
                    stackIn_41_1 = (r) ((Object) stackIn_40_1);
                    stackIn_41_2 = (String) ((Object) stackIn_40_2);
                    stackIn_41_3 = (String) ((Object) stackIn_40_3);
                    stackIn_41_4 = 0;
                    break L14;
                  } else {
                    stackIn_41_0 = (cr) ((Object) stackIn_40_0);
                    stackIn_41_1 = (r) ((Object) stackIn_40_1);
                    stackIn_41_2 = (String) ((Object) stackIn_40_2);
                    stackIn_41_3 = (String) ((Object) stackIn_40_3);
                    stackIn_41_4 = 1;
                    break L14;
                  }
                }
                L15: {
                  stackIn_41_0.field_Q = hq.a(gk.a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4 != 0), 202);
                  stackIn_43_0 = sc.field_c;

                  stackIn_43_1 = (r) (param3);

                  stackIn_43_2 = "lobby";

                  stackIn_43_3 = "greenbutton_mouseheld";

                  if (param4) {
                    stackIn_44_0 = (cr) ((Object) stackIn_43_0);
                    stackIn_44_1 = (r) ((Object) stackIn_43_1);
                    stackIn_44_2 = (String) ((Object) stackIn_43_2);
                    stackIn_44_3 = (String) ((Object) stackIn_43_3);
                    stackIn_44_4 = 0;
                    break L15;
                  } else {
                    stackIn_44_0 = (cr) ((Object) stackIn_43_0);
                    stackIn_44_1 = (r) ((Object) stackIn_43_1);
                    stackIn_44_2 = (String) ((Object) stackIn_43_2);
                    stackIn_44_3 = (String) ((Object) stackIn_43_3);
                    stackIn_44_4 = 1;
                    break L15;
                  }
                }
                L16: {
                  stackIn_44_0.field_cb = hq.a(gk.a(stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4 != 0), 202);
                  gh.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "redbutton", true), 202);
                  gh.field_b.field_Q = hq.a(gk.a(param3, "lobby", "redbutton_mouseover", true), 202);
                  stackIn_46_0 = gh.field_b;

                  stackIn_46_1 = (r) (param3);

                  stackIn_46_2 = "lobby";

                  stackIn_46_3 = "redbutton_mouseheld";

                  if (param4) {
                    stackIn_47_0 = (cr) ((Object) stackIn_46_0);
                    stackIn_47_1 = (r) ((Object) stackIn_46_1);
                    stackIn_47_2 = (String) ((Object) stackIn_46_2);
                    stackIn_47_3 = (String) ((Object) stackIn_46_3);
                    stackIn_47_4 = 0;
                    break L16;
                  } else {
                    stackIn_47_0 = (cr) ((Object) stackIn_46_0);
                    stackIn_47_1 = (r) ((Object) stackIn_46_1);
                    stackIn_47_2 = (String) ((Object) stackIn_46_2);
                    stackIn_47_3 = (String) ((Object) stackIn_46_3);
                    stackIn_47_4 = 1;
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
                  stackIn_49_0 = tr.field_l;

                  stackIn_49_1 = (r) (param3);

                  stackIn_49_2 = "lobby";

                  stackIn_49_3 = "gameoptionbutton_mouseover";

                  if (param4) {
                    stackIn_50_0 = (cr) ((Object) stackIn_49_0);
                    stackIn_50_1 = (r) ((Object) stackIn_49_1);
                    stackIn_50_2 = (String) ((Object) stackIn_49_2);
                    stackIn_50_3 = (String) ((Object) stackIn_49_3);
                    stackIn_50_4 = 0;
                    break L17;
                  } else {
                    stackIn_50_0 = (cr) ((Object) stackIn_49_0);
                    stackIn_50_1 = (r) ((Object) stackIn_49_1);
                    stackIn_50_2 = (String) ((Object) stackIn_49_2);
                    stackIn_50_3 = (String) ((Object) stackIn_49_3);
                    stackIn_50_4 = 1;
                    break L17;
                  }
                }
                L18: {
                  stackIn_50_0.field_Q = hq.a(gk.a(stackIn_50_1, stackIn_50_2, stackIn_50_3, stackIn_50_4 != 0), 202);
                  dupTemp$1 = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active", true), 202);
                  tr.field_l.field_T = dupTemp$1;
                  tr.field_l.field_cb = dupTemp$1;
                  tr.field_l.field_gb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_disabled", true), 202);
                  ip.field_a.field_Bb = hq.a(gk.a(param3, "lobby", "chatbutton", true), 202);
                  ip.field_a.field_Q = hq.a(gk.a(param3, "lobby", "chatbutton_mouseover", true), 202);
                  dupTemp$2 = hq.a(gk.a(param3, "lobby", "chatbutton_active", true), 202);
                  ip.field_a.field_T = dupTemp$2;
                  ip.field_a.field_cb = dupTemp$2;
                  stackIn_52_0 = ca.field_f;

                  stackIn_52_1 = (r) (param3);

                  stackIn_52_2 = "lobby";

                  stackIn_52_3 = "chatfilterbutton";

                  if (param4) {
                    stackIn_53_0 = (cr) ((Object) stackIn_52_0);
                    stackIn_53_1 = (r) ((Object) stackIn_52_1);
                    stackIn_53_2 = (String) ((Object) stackIn_52_2);
                    stackIn_53_3 = (String) ((Object) stackIn_52_3);
                    stackIn_53_4 = 0;
                    break L18;
                  } else {
                    stackIn_53_0 = (cr) ((Object) stackIn_52_0);
                    stackIn_53_1 = (r) ((Object) stackIn_52_1);
                    stackIn_53_2 = (String) ((Object) stackIn_52_2);
                    stackIn_53_3 = (String) ((Object) stackIn_52_3);
                    stackIn_53_4 = 1;
                    break L18;
                  }
                }
                L19: {
                  stackIn_53_0.field_Bb = hq.a(gk.a(stackIn_53_1, stackIn_53_2, stackIn_53_3, stackIn_53_4 != 0), 202);
                  stackIn_55_0 = ca.field_f;

                  stackIn_55_1 = (r) (param3);

                  stackIn_55_2 = "lobby";

                  stackIn_55_3 = "chatfilterbutton_mouseover";

                  if (param4) {
                    stackIn_56_0 = (cr) ((Object) stackIn_55_0);
                    stackIn_56_1 = (r) ((Object) stackIn_55_1);
                    stackIn_56_2 = (String) ((Object) stackIn_55_2);
                    stackIn_56_3 = (String) ((Object) stackIn_55_3);
                    stackIn_56_4 = 0;
                    break L19;
                  } else {
                    stackIn_56_0 = (cr) ((Object) stackIn_55_0);
                    stackIn_56_1 = (r) ((Object) stackIn_55_1);
                    stackIn_56_2 = (String) ((Object) stackIn_55_2);
                    stackIn_56_3 = (String) ((Object) stackIn_55_3);
                    stackIn_56_4 = 1;
                    break L19;
                  }
                }
                L20: {
                  stackIn_56_0.field_Q = hq.a(gk.a(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4 != 0), 202);
                  dupTemp$3 = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active", true), 202);
                  ca.field_f.field_T = dupTemp$3;
                  ca.field_f.field_cb = dupTemp$3;
                  stackIn_58_0 = (r) (param3);

                  stackIn_58_1 = "lobby";

                  stackIn_58_2 = "checkbox";

                  if (param4) {
                    stackIn_59_0 = (r) ((Object) stackIn_58_0);
                    stackIn_59_1 = (String) ((Object) stackIn_58_1);
                    stackIn_59_2 = (String) ((Object) stackIn_58_2);
                    stackIn_59_3 = 0;
                    break L20;
                  } else {
                    stackIn_59_0 = (r) ((Object) stackIn_58_0);
                    stackIn_59_1 = (String) ((Object) stackIn_58_1);
                    stackIn_59_2 = (String) ((Object) stackIn_58_2);
                    stackIn_59_3 = 1;
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
                  stackIn_61_0 = sj.field_c;

                  stackIn_61_1 = (r) (param3);

                  stackIn_61_2 = "lobby";

                  stackIn_61_3 = "dragbar_mouseover";

                  if (param4) {
                    stackIn_62_0 = (cr) ((Object) stackIn_61_0);
                    stackIn_62_1 = (r) ((Object) stackIn_61_1);
                    stackIn_62_2 = (String) ((Object) stackIn_61_2);
                    stackIn_62_3 = (String) ((Object) stackIn_61_3);
                    stackIn_62_4 = 0;
                    break L21;
                  } else {
                    stackIn_62_0 = (cr) ((Object) stackIn_61_0);
                    stackIn_62_1 = (r) ((Object) stackIn_61_1);
                    stackIn_62_2 = (String) ((Object) stackIn_61_2);
                    stackIn_62_3 = (String) ((Object) stackIn_61_3);
                    stackIn_62_4 = 1;
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
            var5_ref = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var5_ref);

            stackIn_66_1 = new StringBuilder().append("t.F(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L22;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param1 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L23;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');

            if (param2 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L24;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param3 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L25;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L25;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_67_0), stackIn_76_2 + ',' + param4 + ')');
        }
    }

    final nq a(int param0, int param1, qh param2, byte[] param3) {
        nq var5 = null;
        RuntimeException var5_ref = null;
        nq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (nq) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("t.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
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
