/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class bd extends oh implements da {
    private lk field_lb;
    static int[] field_ob;
    private boolean field_mb;
    static java.awt.Image field_kb;
    private boolean field_rb;
    private boolean field_nb;
    private fa field_qb;
    private boolean field_pb;

    final void n(int param0) {
        if (!((bd) this).field_G) {
          return;
        } else {
          if (param0 == -22645) {
            L0: {
              ((bd) this).field_G = false;
              if (((bd) this).field_pb) {
                ek.a((byte) -6);
                break L0;
              } else {
                if (((bd) this).field_mb) {
                  cj.a(param0 + 22645);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0, int param1, String param2) {
        int var5 = 0;
        Object var6 = null;
        bm var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        bm stackIn_10_0 = null;
        bm stackIn_11_0 = null;
        bm stackIn_12_0 = null;
        String stackIn_12_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        bm stackOut_9_0 = null;
        bm stackOut_11_0 = null;
        String stackOut_11_1 = null;
        bm stackOut_10_0 = null;
        String stackOut_10_1 = null;
        var5 = fleas.field_A ? 1 : 0;
        if (((bd) this).field_rb) {
          return;
        } else {
          L0: {
            ((bd) this).field_rb = true;
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param1 != 256) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            ((bd) this).field_nb = stackIn_6_1 != 0;
            ((bd) this).field_lb.a((byte) 105, 4210752, 8405024);
            var7 = new bm((bd) this, ((bd) this).field_qb, param2);
            if (-6 != (param1 ^ -1)) {
              if (-257 == (param1 ^ -1)) {
                bb discarded$2 = var7.a((kd) this, true, uh.field_o);
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = (bm) var7;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((bd) this).field_pb) {
                    stackOut_11_0 = (bm) (Object) stackIn_11_0;
                    stackOut_11_1 = uh.field_o;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = (bm) (Object) stackIn_10_0;
                    stackOut_10_1 = mi.field_k;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((bm) (Object) stackIn_12_0).a(stackIn_12_1, -23493, -1);
                break L1;
              }
            } else {
              var7.a(ld.field_c, -23493, 11);
              var7.a(vk.field_K, -23493, 17);
              break L1;
            }
          }
          L3: {
            if ((param1 ^ -1) != -4) {
              if (4 == param1) {
                var7.a(uj.field_e, -23493, 8);
                break L3;
              } else {
                if (-7 == (param1 ^ -1)) {
                  var7.a(cb.field_s, -23493, 9);
                  break L3;
                } else {
                  if (9 != param1) {
                    break L3;
                  } else {
                    bb discarded$3 = var7.a((kd) this, true, fc.field_d);
                    break L3;
                  }
                }
              }
            } else {
              var7.a(bm.field_N, -23493, 7);
              break L3;
            }
          }
          L4: {
            ((bd) this).d((qa) (Object) var7, 26034);
            if (param0 <= -2) {
              break L4;
            } else {
              var6 = null;
              ((bd) this).a((byte) 83, 85, (String) null);
              break L4;
            }
          }
          return;
        }
    }

    public static void g(byte param0) {
        field_ob = null;
        if (param0 != 127) {
            bd.g((byte) 53);
        }
        field_kb = null;
    }

    bd(f param0, fa param1, String param2, boolean param3, boolean param4) {
        super(param0, (qa) (Object) new bm((bd) null, param1, param2), 77, 10, 10);
        ((bd) this).field_qb = param1;
        ((bd) this).field_pb = param3 ? true : false;
        ((bd) this).field_mb = param4 ? true : false;
        ((bd) this).field_nb = false;
        ((bd) this).field_rb = false;
        ((bd) this).field_lb = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
        ((bd) this).field_lb.field_H = true;
        ((bd) this).a((qa) (Object) ((bd) this).field_lb, (byte) -97);
    }

    final static void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        ll var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        bh var6_ref_bh = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ih var28 = null;
        L0: {
          var26 = fleas.field_A ? 1 : 0;
          var28 = ae.field_a;
          var2 = var28.e(false);
          if (0 == var2) {
            var3 = var28.d((byte) 108);
            var4 = (ll) (Object) jj.field_S.c((byte) 47);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var3 == var4.field_k) {
                    break L2;
                  } else {
                    var4 = (ll) (Object) jj.field_S.b((byte) -105);
                    continue L1;
                  }
                }
              }
              if (var4 != null) {
                L3: {
                  var5 = var28.e(false);
                  if (0 == var5) {
                    break L3;
                  } else {
                    var6 = var4.field_q;
                    de.field_n[0].field_b = b.field_e;
                    de.field_n[0].field_e = null;
                    de.field_n[0].field_i = false;
                    var7 = var4.field_t;
                    var8_int = 1;
                    L4: while (true) {
                      if (var8_int >= var5) {
                        String[][] dupTemp$6 = new String[3][var6];
                        var4.field_i = dupTemp$6;
                        var8 = dupTemp$6;
                        var9 = new String[3][var6];
                        long[][] dupTemp$7 = new long[3][var6];
                        var4.field_u = dupTemp$7;
                        var10 = dupTemp$7;
                        int[][] dupTemp$8 = new int[3][var6 * var7];
                        var4.field_p = dupTemp$8;
                        var11 = dupTemp$8;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.e(false);
                        if (0 < var18) {
                          var19 = 0;
                          L5: while (true) {
                            if (var19 >= var18) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var28.e(false);
                                var21 = de.field_n[var20].field_b;
                                var22 = var28.f(-103);
                                var24 = var28.field_i;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = de.field_n[var20].field_e;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      break L6;
                                    } else {
                                      int incrementValue$9 = var15;
                                      var15++;
                                      var11[0][incrementValue$9] = var28.c((byte) 127);
                                      var25++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var21 == null) {
                                  break L8;
                                } else {
                                  if (!ng.a(var21, (byte) 7)) {
                                    break L8;
                                  } else {
                                    var8[1][var13] = b.field_e;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var28.field_i = var24;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        int incrementValue$10 = var16;
                                        var16++;
                                        var11[1][incrementValue$10] = var28.c((byte) -31);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!de.field_n[var20].field_i) {
                                  de.field_n[var20].field_i = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = de.field_n[var20].field_e;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_i = var24;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 < var7) {
                                      int incrementValue$11 = var17;
                                      var17++;
                                      var11[2][incrementValue$11] = var28.c((byte) 123);
                                      var25++;
                                      continue L10;
                                    } else {
                                      var19++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L5;
                                }
                              } else {
                                var19++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        de.field_n[var8_int].field_b = var28.h(0);
                        de.field_n[var8_int].field_i = false;
                        if (-2 == (var28.e(false) ^ -1)) {
                          de.field_n[var8_int].field_e = var28.h(param0 + 24021);
                          var8_int++;
                          continue L4;
                        } else {
                          de.field_n[var8_int].field_e = null;
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var4.field_l = true;
                var4.c(param0 + 24020);
                break L0;
              } else {
                k.c(param0 ^ 13077);
                return;
              }
            }
          } else {
            if ((var2 ^ -1) != -2) {
              ud.a("HS1: " + ak.a(true), (Throwable) null, 0);
              k.c(-28354);
              break L0;
            } else {
              var3 = var28.d((byte) -53);
              var4_long = var28.f(-102);
              var6_ref_bh = (bh) (Object) wi.field_j.c((byte) 47);
              L11: while (true) {
                L12: {
                  if (var6_ref_bh == null) {
                    break L12;
                  } else {
                    if (var3 != var6_ref_bh.field_s) {
                      var6_ref_bh = (bh) (Object) wi.field_j.b((byte) -105);
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (var6_ref_bh != null) {
                  var6_ref_bh.field_k = var4_long;
                  var6_ref_bh.c(-1);
                  break L0;
                } else {
                  k.c(param0 ^ 13077);
                  return;
                }
              }
            }
          }
        }
        L13: {
          if (param0 == -24021) {
            break L13;
          } else {
            bd.o(-33);
            break L13;
          }
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            ((bd) this).field_rb = false;
        }
        ((bd) this).field_lb.a((byte) 92, 4210752, 2121792);
        bm var2 = new bm((bd) this, ((bd) this).field_qb, kb.field_m);
        var2.a(rc.field_f, -23493, 15);
        ((bd) this).d((qa) (Object) var2, 26034);
    }

    public void a(int param0, int param1, int param2, int param3, bb param4) {
        if (((bd) this).field_nb) {
            cg.a((byte) -105, 3);
            ((bd) this).n(-22645);
        } else {
            qg.a("tochangedisplayname.ws", rl.a((byte) -72), 0);
        }
        if (param3 != 248) {
            ((bd) this).field_lb = null;
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (13 == param1) {
            ((bd) this).n(-22645);
            return true;
        }
        if (param0 != -2) {
            field_kb = null;
        }
        return super.a(-2, param1, param2, param3);
    }

    static {
    }
}
