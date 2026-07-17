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

    private final void a(nq param0) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
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
            var3 = (Object) (Object) ((t) this).field_e;
            synchronized (var3) {
              L1: {
                ((t) this).field_e.a(false, (gp) (Object) param0);
                ((t) this).field_d = ((t) this).field_d + 1;
                ((Object) (Object) ((t) this).field_e).notifyAll();
                break L1;
              }
            }
            t.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("t.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 0 + 41);
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_m = null;
        field_i = null;
        field_k = null;
    }

    public final void run() {
        try {
            nq var1 = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Vertigo2.field_L ? 1 : 0;
            L0: while (true) {
              if (((t) this).field_j) {
                return;
              } else {
                var2 = (Object) (Object) ((t) this).field_e;
                synchronized (var2) {
                  L1: {
                    var1 = (nq) (Object) ((t) this).field_e.a(-112);
                    if (var1 != null) {
                      ((t) this).field_d = ((t) this).field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((t) this).field_e).wait();
                          break L2;
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
                        if (var1.field_B == 2) {
                          boolean discarded$1 = var1.field_F.a(var1.field_L.length, (int)var1.field_n, var1.field_L, (byte) -84);
                          var1.field_z = false;
                          break L5;
                        } else {
                          if (3 == var1.field_B) {
                            var1.field_L = var1.field_F.a((int)var1.field_n, 27176);
                            var1.field_z = false;
                            break L5;
                          } else {
                            var1.field_z = false;
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
                      ke.a((Throwable) (Object) var2_ref, (String) null, 0);
                      var1.field_z = false;
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
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((t) this).field_j = true;
        var2 = (Object) (Object) ((t) this).field_e;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((t) this).field_e).notifyAll();
            break L0;
          }
        }
        L1: {
          if (param0 <= -8) {
            break L1;
          } else {
            t.a((fp) null, 6, 3, (r) null);
            break L1;
          }
        }
        try {
          L2: {
            ((t) this).field_h.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((t) this).field_h = null;
    }

    final static void a() {
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
            int discarded$10 = 1;
            int discarded$11 = 4;
            hj.field_e = hm.a();
            break L1;
          }
        }
        L2: {
          if (null != bs.field_Xb) {
            break L2;
          } else {
            int discarded$12 = 1;
            int discarded$13 = 0;
            int discarded$14 = 5;
            int discarded$15 = 106;
            bs.field_Xb = ol.a();
            break L2;
          }
        }
        L3: {
          if (hj.field_e == null) {
            break L3;
          } else {
            if (hj.field_e.field_o) {
              jq.field_e = jq.field_e & ~hj.field_e.field_p;
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
            if (!sp.field_V) {
              break L4;
            } else {
              if (vj.field_h) {
                le.a(468713154);
                int discarded$16 = 5;
                jn.a();
                if (lc.field_b != 9) {
                  break L4;
                } else {
                  if (jq.field_e != 0) {
                    break L4;
                  } else {
                    lc.field_b = 5;
                    gj.a((byte) -123, false, am.field_n, 5);
                    break L4;
                  }
                }
              } else {
                if (!sp.field_V) {
                  break L4;
                } else {
                  if (!vj.field_h) {
                    break L4;
                  } else {
                    le.a(468713154);
                    int discarded$17 = 5;
                    jn.a();
                    if (lc.field_b != 9) {
                      break L4;
                    } else {
                      if (jq.field_e != 0) {
                        break L4;
                      } else {
                        lc.field_b = 5;
                        gj.a((byte) -123, false, am.field_n, 5);
                        break L4;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (!sp.field_V) {
              break L4;
            } else {
              if (vj.field_h) {
                le.a(468713154);
                int discarded$18 = 5;
                jn.a();
                if (lc.field_b != 9) {
                  break L4;
                } else {
                  if (jq.field_e != 0) {
                    break L4;
                  } else {
                    lc.field_b = 5;
                    gj.a((byte) -123, false, am.field_n, 5);
                    break L4;
                  }
                }
              } else {
                if (!sp.field_V) {
                  break L4;
                } else {
                  if (!vj.field_h) {
                    break L4;
                  } else {
                    le.a(468713154);
                    int discarded$19 = 5;
                    jn.a();
                    if (lc.field_b != 9) {
                      break L4;
                    } else {
                      if (jq.field_e != 0) {
                        break L4;
                      } else {
                        lc.field_b = 5;
                        gj.a((byte) -123, false, am.field_n, 5);
                        break L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(fp param0, int param1, int param2, r param3) {
        try {
            sq.field_e = param2 * el.b(true) / 1000;
            int discarded$12 = 56;
            hi.a(param3);
            int discarded$23 = -85;
            jl.a(param3);
            ao.a(param1 + -1513236, param3);
            int discarded$34 = 73;
            uc.a();
            bs.a((byte) -12);
            if (param1 != 1513239) {
                field_f = 65;
            }
            hm.field_F = -sq.field_e;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "t.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
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
            var5 = (Object) (Object) ((t) this).field_e;
            synchronized (var5) {
              L1: {
                var6 = (nq) (Object) ((t) this).field_e.b((byte) -50);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_n != ~(long)param2) {
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
                            stackOut_7_0 = (nq) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (nq) (Object) ((t) this).field_e.a(true);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_L = param1.a(param2, 27176);
              stackOut_14_0 = (nq) var4;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param0) {
                stackOut_16_0 = (nq) (Object) stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L4;
              } else {
                stackOut_15_0 = (nq) (Object) stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L4;
              }
            }
            stackIn_17_0.field_u = stackIn_17_1 != 0;
            var4.field_z = false;
            stackOut_17_0 = (nq) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("t.B(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
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
            int discarded$2 = 0;
            this.a(var4);
            stackOut_0_0 = (nq) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("t.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(u[] param0, int[] param1, r param2, r param3) {
        u[] var5 = null;
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
        L0: {
          var18 = Vertigo2.field_L ? 1 : 0;
          var5 = oh.a((byte) -39, "crowns", "lobby", param3);
          eh.field_e = var5.length;
          if (param0 == null) {
            break L0;
          } else {
            var6_array = new u[param0.length + eh.field_e];
            var7_int = 0;
            L1: while (true) {
              if (eh.field_e <= var7_int) {
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= param0.length) {
                    var5 = var6_array;
                    break L0;
                  } else {
                    var6_array[var7_int + eh.field_e] = param0[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var6_array[var7_int] = var5[var7_int];
                var7_int++;
                continue L1;
              }
            }
          }
        }
        var19 = new int[var5.length];
        var6 = var19;
        var7_int = 0;
        L3: while (true) {
          if (var7_int >= eh.field_e) {
            L4: {
              if (param0 == null) {
                break L4;
              } else {
                if (param1 != null) {
                  var7_int = 0;
                  L5: while (true) {
                    if (var7_int >= param0.length) {
                      break L4;
                    } else {
                      var6[var7_int + eh.field_e] = param1[var7_int];
                      var7_int++;
                      continue L5;
                    }
                  }
                } else {
                  var7_int = 0;
                  L6: while (true) {
                    if (var7_int >= param0.length) {
                      break L4;
                    } else {
                      var6[eh.field_e + var7_int] = param0[var7_int].field_h;
                      var7_int++;
                      continue L6;
                    }
                  }
                }
              }
            }
            nl.field_k = 2;
            r.field_j = 2;
            r.field_f = 15;
            ia.field_G = 4;
            hc.field_b = 11;
            var7 = w.a(param2, param3, "largefont", "lobby", 121);
            li.field_e = w.a(param2, param3, "generalfont", "lobby", 104);
            kb.field_c = w.a(param2, param3, "chatfont", "lobby", 121);
            var7.a((fq[]) (Object) var5, var6);
            li.field_e.a((fq[]) (Object) var5, var6);
            kb.field_c.a((fq[]) (Object) var5, var6);
            var8 = new cr(0L, (cr) null);
            var8.field_z = (cc) (Object) var7;
            var8.field_qb = r.field_f;
            var8.field_A = 16777215;
            var9 = var8;
            var8.field_ab = 1;
            var9.field_O = 1;
            var10 = new cr(0L, (cr) null);
            var10.field_z = (cc) (Object) li.field_e;
            var10.field_qb = r.field_f;
            var10.field_A = 16777215;
            var10.field_ab = 1;
            var11 = var10;
            var11.field_O = 1;
            j.field_q = new cr(0L, var8);
            int discarded$96 = 1;
            int discarded$97 = 202;
            j.field_q.field_Bb = hq.a(gk.a(param3, "lobby", "heading"));
            rq.field_t = new cr(0L, (cr) null);
            rq.field_t.field_Bb = ml.a((byte) -13, 8421504, false, 4210752, 120, false);
            lk.field_a = new cr(0L, (cr) null);
            lk.field_a.field_Bb = vl.a(114, 3, 0, 1, 6316128, 6316128);
            vf.field_B = new cr(0L, (cr) null);
            int discarded$98 = 1;
            int discarded$99 = 202;
            vf.field_B.field_Bb = hq.a(gk.a(param3, "lobby", "popup"));
            int discarded$100 = 1;
            int discarded$101 = 202;
            var12 = hq.a(gk.a(param3, "lobby", "popup_mouseover"));
            int discarded$102 = 1;
            var13 = gk.a(param3, "lobby", "button");
            int discarded$103 = 1;
            int discarded$104 = 202;
            var14 = hq.a(gk.a(param3, "lobby", "tab_active"));
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
            ee.field_b.field_z = (cc) (Object) li.field_e;
            ja.field_e = new cr(0L, ee.field_b);
            ja.field_e.field_H = 16777215;
            ja.field_e.field_B = 16777215;
            ja.field_e.field_A = 16764006;
            ja.field_e.field_D = 8421504;
            ja.field_e.field_K = 16777215;
            var15 = new cr(0L, ja.field_e);
            var15.field_z = (cc) (Object) var7;
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
            int discarded$105 = 1;
            var16 = gk.a(param3, "lobby", "button_mouseover");
            ar.field_c = new kq(vf.field_B, var12, ee.field_b, ja.field_e, 3, 2, r.field_j, 3, r.field_f);
            bq.field_B = new cr(0L, ja.field_e);
            bq.field_B.field_bb = 1;
            bq.field_B.field_Y = 1;
            bq.field_B.field_Cb = 1;
            bq.field_B.field_Q = var16;
            bq.field_B.field_Bb = var13;
            bq.field_B.field_Gb = 1;
            int discarded$106 = 1;
            bq.field_B.field_cb = gk.a(param3, "lobby", "button_mouseheld");
            int discarded$107 = 1;
            bq.field_B.field_T = gk.a(param3, "lobby", "button_active");
            int discarded$108 = 1;
            bq.field_B.field_gb = gk.a(param3, "lobby", "button_disabled");
            bq.field_B.field_O = 1;
            qr.field_m = new cr(0L, ja.field_e);
            qr.field_m.field_O = 1;
            int discarded$109 = 1;
            int discarded$110 = 202;
            qr.field_m.field_Bb = hq.a(gk.a(param3, "lobby", "tab_inactive"));
            int discarded$111 = 1;
            int discarded$112 = 202;
            qr.field_m.field_Q = hq.a(gk.a(param3, "lobby", "tab_mouseover"));
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
            int discarded$113 = 1;
            int discarded$114 = 202;
            uk.field_e.field_Bb = hq.a(gk.a(param3, "lobby", "smallbutton"));
            int discarded$115 = 1;
            int discarded$116 = 202;
            uk.field_e.field_Q = hq.a(gk.a(param3, "lobby", "smallbutton_mouseover"));
            int discarded$117 = 1;
            int discarded$118 = 202;
            er[] dupTemp$119 = hq.a(gk.a(param3, "lobby", "smallbutton_active"));
            uk.field_e.field_T = dupTemp$119;
            uk.field_e.field_cb = dupTemp$119;
            int discarded$120 = 1;
            int discarded$121 = 202;
            uk.field_e.field_gb = hq.a(gk.a(param3, "lobby", "smallbutton_disabled"));
            int discarded$122 = 1;
            int discarded$123 = 202;
            ub.field_t.field_Bb = hq.a(gk.a(param3, "lobby", "mediumbutton"));
            int discarded$124 = 1;
            int discarded$125 = 202;
            ub.field_t.field_Q = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseover"));
            int discarded$126 = 1;
            int discarded$127 = 202;
            ub.field_t.field_cb = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseheld"));
            int discarded$128 = 1;
            int discarded$129 = 202;
            fb.field_u.field_Bb = hq.a(gk.a(param3, "lobby", "bigbutton"));
            int discarded$130 = 1;
            int discarded$131 = 202;
            fb.field_u.field_Q = hq.a(gk.a(param3, "lobby", "bigbutton_mouseover"));
            int discarded$132 = 1;
            int discarded$133 = 202;
            fb.field_u.field_cb = hq.a(gk.a(param3, "lobby", "bigbutton_mouseheld"));
            int discarded$134 = 1;
            int discarded$135 = 202;
            fb.field_u.field_gb = hq.a(gk.a(param3, "lobby", "bigbutton_disabled"));
            int discarded$136 = 1;
            int discarded$137 = 202;
            sc.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "greenbutton"));
            int discarded$138 = 1;
            int discarded$139 = 202;
            sc.field_c.field_Q = hq.a(gk.a(param3, "lobby", "greenbutton_mouseover"));
            int discarded$140 = 1;
            int discarded$141 = 202;
            sc.field_c.field_cb = hq.a(gk.a(param3, "lobby", "greenbutton_mouseheld"));
            int discarded$142 = 1;
            int discarded$143 = 202;
            gh.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "redbutton"));
            int discarded$144 = 1;
            int discarded$145 = 202;
            gh.field_b.field_Q = hq.a(gk.a(param3, "lobby", "redbutton_mouseover"));
            int discarded$146 = 1;
            int discarded$147 = 202;
            gh.field_b.field_cb = hq.a(gk.a(param3, "lobby", "redbutton_mouseheld"));
            int discarded$148 = 1;
            int discarded$149 = 202;
            vc.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "backbutton"));
            int discarded$150 = 1;
            int discarded$151 = 202;
            vc.field_b.field_Q = hq.a(gk.a(param3, "lobby", "backbutton_mouseover"));
            int discarded$152 = 1;
            int discarded$153 = 202;
            vc.field_b.field_cb = hq.a(gk.a(param3, "lobby", "backbutton_mouseheld"));
            int discarded$154 = 1;
            int discarded$155 = 202;
            vc.field_b.field_gb = hq.a(gk.a(param3, "lobby", "backbutton_disabled"));
            int discarded$156 = 1;
            int discarded$157 = 202;
            tr.field_l.field_Bb = hq.a(gk.a(param3, "lobby", "gameoptionbutton"));
            int discarded$158 = 1;
            int discarded$159 = 202;
            tr.field_l.field_Q = hq.a(gk.a(param3, "lobby", "gameoptionbutton_mouseover"));
            int discarded$160 = 1;
            int discarded$161 = 202;
            er[] dupTemp$162 = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active"));
            tr.field_l.field_T = dupTemp$162;
            tr.field_l.field_cb = dupTemp$162;
            int discarded$163 = 1;
            int discarded$164 = 202;
            tr.field_l.field_gb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_disabled"));
            int discarded$165 = 1;
            int discarded$166 = 202;
            ip.field_a.field_Bb = hq.a(gk.a(param3, "lobby", "chatbutton"));
            int discarded$167 = 1;
            int discarded$168 = 202;
            ip.field_a.field_Q = hq.a(gk.a(param3, "lobby", "chatbutton_mouseover"));
            int discarded$169 = 1;
            int discarded$170 = 202;
            er[] dupTemp$171 = hq.a(gk.a(param3, "lobby", "chatbutton_active"));
            ip.field_a.field_T = dupTemp$171;
            ip.field_a.field_cb = dupTemp$171;
            int discarded$172 = 1;
            int discarded$173 = 202;
            ca.field_f.field_Bb = hq.a(gk.a(param3, "lobby", "chatfilterbutton"));
            int discarded$174 = 1;
            int discarded$175 = 202;
            ca.field_f.field_Q = hq.a(gk.a(param3, "lobby", "chatfilterbutton_mouseover"));
            int discarded$176 = 1;
            int discarded$177 = 202;
            er[] dupTemp$178 = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active"));
            ca.field_f.field_T = dupTemp$178;
            ca.field_f.field_cb = dupTemp$178;
            int discarded$179 = 1;
            var17 = gk.a(param3, "lobby", "checkbox");
            fr.field_a = new sm(0L, var17[1], var17[0], 1, ja.field_e, (String) null);
            tb.field_a = new cr(0L, (cr) null);
            int discarded$180 = -27140;
            tb.field_a.field_Bb = rh.a(tn.a("slideregion", param3, -90, "lobby"));
            int discarded$181 = -27140;
            tb.field_a.field_Q = rh.a(tn.a("slideregion_mouseover", param3, -95, "lobby"));
            int discarded$182 = -27140;
            tb.field_a.field_cb = rh.a(tn.a("slideregion_mouseheld", param3, -77, "lobby"));
            int discarded$183 = -27140;
            tb.field_a.field_gb = rh.a(tn.a("slideregion_disabled", param3, -89, "lobby"));
            sj.field_c = new cr(0L, (cr) null);
            int discarded$184 = 1;
            int discarded$185 = 202;
            sj.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "dragbar"));
            int discarded$186 = 1;
            int discarded$187 = 202;
            sj.field_c.field_Q = hq.a(gk.a(param3, "lobby", "dragbar_mouseover"));
            int discarded$188 = 1;
            int discarded$189 = 202;
            sj.field_c.field_cb = hq.a(gk.a(param3, "lobby", "dragbar_mouseheld"));
            int discarded$190 = 1;
            int discarded$191 = 202;
            sj.field_c.field_gb = hq.a(gk.a(param3, "lobby", "dragbar_disabled"));
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
            return;
          } else {
            var19[var7_int] = 10;
            var7_int++;
            continue L3;
          }
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
                field_i = null;
                break L1;
              }
            }
            var5.field_L = param3;
            int discarded$2 = 0;
            this.a(var5);
            stackOut_2_0 = (nq) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("t.E(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    t(jj param0) {
        wk var2 = null;
        ((t) this).field_e = new ak();
        ((t) this).field_d = 0;
        ((t) this).field_j = false;
        try {
            var2 = param0.a(5, (Runnable) this, 0);
            while (0 == var2.field_b) {
                um.a(true, 10L);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            ((t) this).field_h = (Thread) var2.field_d;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "t.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
