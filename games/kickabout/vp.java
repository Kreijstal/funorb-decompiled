/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp implements hc {
    private int field_i;
    static String field_d;
    static sj field_j;
    static String field_n;
    static ff field_o;
    static int field_f;
    static int field_c;
    static int field_a;
    static int field_h;
    static String field_e;
    static String field_l;
    static String field_b;
    static int field_k;
    static String field_g;
    static String field_p;
    static String field_m;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nm var6 = null;
        nm var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dd var12 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == wr.field_l) {
              return;
            } else {
              L1: {
                hq.field_a = false;
                wr.field_l = param1;
                var12 = new dd();
                if (wr.field_l == 0) {
                  break L1;
                } else {
                  if (wr.field_l == 1) {
                    break L1;
                  } else {
                    vf.field_K = new byte[5][][][];
                    cb.field_b = new byte[5][][];
                    var3 = 5;
                    var4 = 0;
                    L2: while (true) {
                      if (var4 >= 5) {
                        var4 = 0;
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= 5) {
                            hq.field_a = true;
                            break L0;
                          } else {
                            var6 = pv.field_I[var5][5];
                            var7 = pv.field_I[var5][3];
                            var12.a(var7, (byte) -107);
                            cb.field_b[var5] = new byte[8][];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= 8) {
                                var12.a(var6, (byte) -107);
                                var8 = (2 + var6.field_e.length) / 3;
                                vf.field_K[var5] = new byte[var8][8][];
                                var9 = 0;
                                L5: while (true) {
                                  if (var9 >= var8) {
                                    var5++;
                                    continue L3;
                                  } else {
                                    var12.a(var9 * 3, -39);
                                    var10 = 0;
                                    L6: while (true) {
                                      if (var10 >= 8) {
                                        var4++;
                                        jm.a(var3, 9863, var4);
                                        var9++;
                                        continue L5;
                                      } else {
                                        kh.a(var5, var12, var10 << 8, false, 2150);
                                        vf.field_K[var5][var9][var10] = ge.a(16, vf.field_F);
                                        var10++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                              } else {
                                kh.a(var5, var12, var8 << 8, false, 2150);
                                cb.field_b[var5][var8] = ge.a(16, vf.field_F);
                                var8++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var3 = var3 + pv.field_I[var4][5].field_e.length / 3;
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              hq.field_a = true;
              vf.field_K = null;
              cb.field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "vp.A(" + -4121 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 8) {
          L0: {
            L1: {
              if (!od.field_n) {
                break L1;
              } else {
                L2: {
                  if (sf.c(-1, param0 + -9)) {
                    break L2;
                  } else {
                    if (!sf.c(-2, param0 + -9)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        if (null == td.field_c) {
            return -1;
        }
        if (param1 >= ik.field_D) {
            if (ik.field_D - -td.field_c.field_q > param1) {
                if (rp.field_w <= param0) {
                    if (param0 < rp.field_w + td.field_c.field_w) {
                        return 0;
                    }
                }
            }
        }
        if (ha.field_G <= param1) {
            if (ha.field_G + td.field_c.field_q > param1) {
                if (param0 >= lr.field_q) {
                    if (param0 < td.field_c.field_w + lr.field_q) {
                        return 1;
                    }
                }
            }
        }
        if (param2 < 0) {
            field_b = null;
        }
        return -1;
    }

    vp() {
        ((vp) this).field_i = 0;
    }

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null != lw.field_e) {
            var1 = (Object) (Object) lw.field_e;
            synchronized (var1) {
              L1: {
                lw.field_e = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
    }

    public final void a(int param0, boolean param1) {
        Object var4 = null;
        L0: {
          pe.b(0);
          var4 = null;
          vc.a((String) null, -1);
          if (param0 == -25) {
            break L0;
          } else {
            field_a = -18;
            break L0;
          }
        }
        L1: {
          if (!this.b(8)) {
            break L1;
          } else {
            L2: {
              if (sr.field_l == null) {
                if (um.field_e == null) {
                  break L2;
                } else {
                  if (!um.field_e.field_A) {
                    break L2;
                  } else {
                    L3: {
                      if (!um.field_e.e(param0 ^ 25)) {
                        break L3;
                      } else {
                        if (um.field_e.b(-21660)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    ui.h(param0 ^ 15419);
                    vc.a(wn.field_h, param0 ^ 24);
                    jh.a(6356832, (byte) -25);
                    break L2;
                  }
                }
              } else {
                ui.h(-15396);
                vc.a(qr.field_g, -1);
                jh.a(6356832, (byte) -25);
                break L2;
              }
            }
            ((vp) this).field_i = ((vp) this).field_i + 1;
            ul.a(true, 300, 320, param1);
            break L1;
          }
        }
    }

    public final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 63) {
            break L0;
          } else {
            vp.b((byte) 99);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.b(8)) {
              break L2;
            } else {
              if (!vg.field_Wb) {
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

    public final boolean a(int param0, int param1, char param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 11516) {
          L0: {
            L1: {
              if (!this.b(param0 ^ 11508)) {
                break L1;
              } else {
                if (!ud.a(13, 12, 17860, 15)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public final void a(int param0) {
        int var2 = 83 % ((50 - param0) / 45);
        if (((vp) this).a((byte) 87)) {
            ei.a((((vp) this).field_i & 8) == 0 ? true : false, false);
        }
    }

    public static void b(byte param0) {
        field_m = null;
        if (param0 < 77) {
            field_a = 64;
        }
        field_l = null;
        field_e = null;
        field_b = null;
        field_n = null;
        field_p = null;
        field_d = null;
        field_o = null;
        field_g = null;
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Play rated game";
        field_d = "tournament lobby";
        field_o = new ff(8, 0, 4, 1);
        de.b(50, (byte) -110);
        field_l = "Loading animations";
        field_g = "Public chat is unavailable while setting up a rated game.";
        field_b = "Quick Chat Help";
        field_m = "Report <%0> for abuse";
    }
}
