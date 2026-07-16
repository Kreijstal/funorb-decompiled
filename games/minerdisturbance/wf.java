/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends cc {
    static String[][] field_Y;
    static int[] field_P;
    private int field_T;
    static String field_N;
    private int field_S;
    private int field_W;
    static String field_U;
    static String field_V;
    private int field_O;
    static String[][] field_Q;
    private int field_X;
    private int field_R;

    boolean a(boolean param0) {
        if (param0) {
            ((wf) this).field_S = 78;
        }
        ((wf) this).o(24619);
        return super.a(false);
    }

    final static void p(int param0) {
        int var1 = 0;
        int var2 = MinerDisturbance.field_ab;
        if (param0 != 4462) {
            field_Q = null;
        }
        eb.field_d.a(true);
        for (var1 = 0; -33 < (var1 ^ -1); var1++) {
            fb.field_e[var1] = 0L;
        }
        for (var1 = 0; var1 < 32; var1++) {
            si.field_f[var1] = 0L;
        }
        ig.field_b = 0;
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = MinerDisturbance.field_ab;
        eh.c(6 + param2, 35 + param1, ((wf) this).field_v - 12, -40 + ((wf) this).field_q, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param1;
            L1: while (true) {
              if (var4 <= var7) {
                if (param0 == 21533) {
                  fh.field_a.f(-90 + param2 - -((wf) this).field_v, param1 + 10);
                  pm.a(param1 + 35, param0 + -21532, 5 + param2, -10 + ((wf) this).field_v, vk.field_e);
                  pm.a(-22 + ((wf) this).field_q + param1, param0 + -21532, param2, ((wf) this).field_v, v.field_d);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + ((wf) this).field_q;
                  var7 = 0;
                  var8 = param1 + 57;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var5 + (-var5 + var6) * var7 / var4;
                      var9 = var9 | (var9 << -422812656 | var9 << -1081432);
                      eh.e(param2, var8, 6, var9);
                      eh.e(-6 + ((wf) this).field_v + param2, var8, 6, var9);
                      var7++;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var9 = (var6 + -var5) * var7 / var4 + var5;
                var9 = var9 | (var9 << -2080841168 | var9 << 228424168);
                eh.e(param2, var8, 6, var9);
                eh.e(param2 - -((wf) this).field_v - 6, var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (eh.field_d <= var8) {
              if (var8 < eh.field_e) {
                L3: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = ((wf) this).field_v;
                  if (20 < var7) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (20 < var10) {
                        break L3;
                      } else {
                        var12 = (-var7 + 20) * (20 + -var7) + (20 + -var10) * (20 - var10);
                        if (-463 <= (var12 ^ -1)) {
                          if ((var12 ^ -1) > -421) {
                            break L3;
                          } else {
                            var13 = (462 - var12) * var9 / 42;
                            var13 = var13 | (var13 << -1100115760 | var13 << -1553717048);
                            eh.field_f[var10 + eh.field_g * var8 + param2] = var13;
                            var10++;
                            continue L4;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if ((var7 ^ -1) >= -21) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (var13 > 20) {
                          break L7;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                          if (var14 <= 462) {
                            if (var14 >= 420) {
                              var15 = (-var14 + 462) * var9 / 42;
                              var15 = var15 | (var15 << 859787016 | var15 << -293095120);
                              eh.field_f[var11 + (var8 * eh.field_g - -param2)] = var15;
                              var13++;
                              var11++;
                              continue L6;
                            } else {
                              var12 = var11 - -1;
                              var13++;
                              var11++;
                              continue L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = var12;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var9 = var9 | (var9 << 438933360 | var9 << -736330104);
                eh.e(param2 + var10, var8, -var10 + var11, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!(-1 > (param0 ^ -1))) {
            ((wf) this).a(param3, param2, (byte) 55);
            return;
        }
        ((wf) this).field_R = ((wf) this).field_v;
        ((wf) this).field_S = param2;
        ((wf) this).field_O = param0;
        ((wf) this).field_W = 0;
        ((wf) this).field_T = ((wf) this).field_q;
        ((wf) this).field_X = param3;
        if (!param1) {
            ((wf) this).a(-63, false, 91, -16);
        }
    }

    final static boolean q(int param0) {
        if (param0 < 2) {
            return true;
        }
        return -vh.field_g + (di.field_X + qd.field_M * ac.field_b) == 11055064 + a.field_c ? true : false;
    }

    wf(hm param0, int param1, int param2) {
        super(param0, param1, param2);
        ((wf) this).field_W = 0;
        ((wf) this).field_O = 0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != 8) {
            field_N = null;
        }
        ti.a((byte) 127);
        eh.f(param1, param0, param3, param4);
    }

    void o(int param0) {
        if (!((((wf) this).field_O ^ -1) < -1)) {
            return;
        }
        ((wf) this).a(((wf) this).field_X, ((wf) this).field_S, (byte) 55);
        if (param0 != 24619) {
            return;
        }
        ((wf) this).field_O = 0;
        ((wf) this).b(true);
    }

    void b(boolean param0) {
        if (!param0) {
            ((wf) this).field_X = -66;
        }
    }

    public static void g(byte param0) {
        field_Y = null;
        field_P = null;
        field_V = null;
        field_N = null;
        field_Q = null;
        if (param0 != 87) {
            boolean discarded$0 = wf.q(-90);
        }
        field_U = null;
    }

    boolean n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != -4) {
            ((wf) this).b(true);
        }
        if ((((wf) this).field_O ^ -1) < -1) {
            var2 = ((wf) this).field_S;
            var3 = ((wf) this).field_X;
            int fieldTemp$0 = ((wf) this).field_W + 1;
            ((wf) this).field_W = ((wf) this).field_W + 1;
            if (((wf) this).field_O > fieldTemp$0) {
                var4 = ((wf) this).field_W * (-((wf) this).field_W + ((wf) this).field_O * 2);
                var5 = ((wf) this).field_O * ((wf) this).field_O;
                var3 = var4 * (((wf) this).field_X - ((wf) this).field_T) / var5 + ((wf) this).field_T;
                var2 = var4 * (-((wf) this).field_R + ((wf) this).field_S) / var5 + ((wf) this).field_R;
            } else {
                ((wf) this).field_O = 0;
                ((wf) this).b(true);
            }
            ((wf) this).a(var3, var2, (byte) 55);
        }
        return super.n(param0 + 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new String[][]{null, new String[1]};
        field_N = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_Q = new String[][]{new String[5]};
        field_V = "Dig Deep or Die Tryin'";
    }
}
