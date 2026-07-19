/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends f implements bp {
    private kg field_G;
    private kg field_J;
    private kg field_H;
    static String field_F;
    static int field_E;
    static String field_I;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param3 + this.field_m;
        int var6 = param2 + this.field_q;
        int discarded$0 = gn.field_u.a(fi.field_j, var5 - -20, var6 + 20, this.field_x + -40, -50 + this.field_n, 16777215, -1, 1, 0, gn.field_u.field_J);
        super.a(param0, param1, param2, param3);
    }

    final static int d(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = param0 ? 1 : 0;
            L1: while (true) {
              if (!cc.e((byte) 55)) {
                L2: {
                  dc.field_l.a(-1, kq.a(nh.field_p, td.field_P, 16777215), kq.a(pd.field_k, bb.field_b, 16777215));
                  if (!dc.field_l.a((byte) -76)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (dc.field_l.field_c >= 0) {
                        L5: {
                          var3 = ShatteredPlansClient.field_E[dc.field_l.field_c];
                          if (2 == var3) {
                            break L5;
                          } else {
                            if (var3 == 5) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        jf.b((byte) -15);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (2 == eh.field_C) {
                      break L3;
                    } else {
                      jf.b((byte) -15);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (eh.field_C == 2) {
                      var4 = pr.a(14274) - br.field_p;
                      var6 = (int)((10999L + -var4) / 1000L);
                      if ((var6 ^ -1) >= -1) {
                        var3 = 2;
                        gm.a(true, 56, 5);
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_25_0 = var3;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L7: {
                  dc.field_l.b(0);
                  if (!dc.field_l.a((byte) -46)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (oq.field_j != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "cq.A(" + param0 + ')');
        }
        return stackIn_26_0;
    }

    final static void a(int param0) {
        L0: {
          if (null != le.field_e) {
            le.field_e.h((byte) 121);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -50) {
          return;
        } else {
          L1: {
            if (ed.field_h != null) {
              ed.field_h.p(8305);
              break L1;
            } else {
              break L1;
            }
          }
          ga.g(param0 + 14795);
          return;
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
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
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 ^ -1) == -99) {
                stackOut_6_0 = this.a(param3, true);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 != param0) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = this.a(param3, param2 ^ -74);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("cq.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 6) {
              if (this.field_J == param0) {
                la.a(false);
                return;
              } else {
                if (this.field_H != param0) {
                  if (param0 == this.field_G) {
                    oo.a((byte) -86);
                    return;
                  } else {
                    return;
                  }
                } else {
                  cs.a((byte) 71);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("cq.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(nq param0, boolean param1) {
        try {
            ss.field_b = param0;
            if (!param1) {
                String var3 = (String) null;
                cq.a(-64, -115, (String) null, (String) null, 39);
            }
            hs.field_j = rp.i(0);
            ld.field_p = new pf();
            hj.field_l = new tm[7];
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cq.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 69 / ((23 - param0) / 59);
        field_I = null;
        field_F = null;
    }

    final static void a(int param0, int param1, String param2, String param3, int param4) {
        uq.field_j.field_x = param1;
        uq.field_j.field_z = param3;
        if (param0 > -67) {
            return;
        }
        try {
            uq.field_j.field_u = param2;
            uq.field_j.field_K = uq.field_j.field_K + cg.field_C.field_K;
            cg.field_C.field_hb = cg.field_C.field_hb + cg.field_C.field_K;
            cg.field_C.field_K = param4;
            uq.field_j.field_K = uq.field_j.field_K - cg.field_C.field_K;
            cg.field_C.field_hb = cg.field_C.field_hb - cg.field_C.field_K;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cq.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public cq() {
        super(0, 0, 476, 225, (iq) null);
        this.field_H = new kg(oj.field_Ab, (ko) null);
        this.field_J = new kg(rn.field_a, (ko) null);
        this.field_G = new kg(tr.field_Pb, (ko) null);
        qp var1 = new qp();
        this.field_H.field_p = (iq) ((Object) var1);
        this.field_J.field_p = (iq) ((Object) var1);
        this.field_G.field_p = (iq) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> -1521715775;
        this.field_J.a(this.field_n - 48 - var2, 30, (byte) 113, -var3 + this.field_x >> 1925764737, var4);
        this.field_G.a(-var2 + -48 + this.field_n, 30, (byte) 104, var2 + var4 + (this.field_x - var3 >> -1375664895), var4);
        this.field_H.a(this.field_n - (78 - -(var2 * 2)), 30, (byte) 104, this.field_x + -var3 >> -1999236127, var3);
        this.field_J.field_u = (ko) (this);
        this.field_H.field_u = (ko) (this);
        this.field_G.field_u = (ko) (this);
        this.field_H.field_v = nc.field_m;
        this.field_G.field_v = bs.field_c;
        this.b((byte) -46, this.field_J);
        this.b((byte) -62, this.field_H);
        this.b((byte) -100, this.field_G);
    }

    static {
        field_F = "<%0> has declined the invitation.";
        field_I = "Unpacking music";
    }
}
