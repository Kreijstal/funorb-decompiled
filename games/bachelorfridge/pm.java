/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pm extends ana {
    private int field_C;
    private taa field_y;
    private qn field_x;
    static kia field_z;
    private kv field_D;
    private ws field_w;
    static ee[] field_v;
    private int field_B;
    private av field_E;
    private int field_A;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, String param7, int param8) {
        ur.field_e[pe.field_m] = (oha) (Object) new a(param1, param4, param0, param6, param7, param3, param5, param8);
        if (param2 != 12635) {
            pm.f(-58);
        }
        pe.field_m = pe.field_m + 1;
    }

    pm(gj param0, av param1) {
        super(param0, (bca) (Object) param1);
        ((pm) this).field_E = param1;
        ((pm) this).field_w = dba.field_a;
        ((pm) this).field_l = 75;
        ((pm) this).field_D = de.field_F.a();
        int var3 = ((pm) this).field_q.field_h.field_z;
        int var4 = ((pm) this).field_q.field_h.field_B;
        int var5 = kla.a(4, m.field_a, -2147483648);
        if (var5 == 0) {
            ((pm) this).field_B = -3;
            ((pm) this).field_C = kla.a(-1 + var4 - -6, m.field_a, -2147483648) - 3;
        } else {
            if (var5 == 1) {
                ((pm) this).field_B = kla.a(5 + var3, m.field_a, -2147483648) + -2;
                ((pm) this).field_C = 3 + var4;
            } else {
                if (-3 != (var5 ^ -1)) {
                    ((pm) this).field_B = kla.a(4 + var3, m.field_a, -2147483648) - 3 + 1;
                    ((pm) this).field_C = -3;
                } else {
                    ((pm) this).field_B = var3 + 3;
                    ((pm) this).field_C = -3 + kla.a(6 + var4 + -2, m.field_a, -2147483648) - -1;
                }
            }
        }
        ((pm) this).field_y = ((pm) this).field_m;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((pm) this).field_y.a((byte) -106)) {
          return false;
        } else {
          if (((pm) this).field_w != dba.field_a) {
            if (bia.field_i != ((pm) this).field_w) {
              L0: {
                if ((((pm) this).field_l ^ -1) != -66) {
                  break L0;
                } else {
                  if (hba.field_x == ((pm) this).field_w) {
                    wf.a(30, (byte) 127);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              ((pm) this).field_l = ((pm) this).field_l - 1;
              if (0 > ((pm) this).field_l - 1) {
                if (hba.field_x == ((pm) this).field_w) {
                  ((pm) this).field_y = new taa(((pm) this).field_q, ((pm) this).field_E.field_s, ((pm) this).field_E.field_r);
                  ((pm) this).a(27799, (at) (Object) ((pm) this).field_y);
                  ((pm) this).field_l = 30;
                  ((pm) this).field_w = lw.field_g;
                  return false;
                } else {
                  L1: {
                    if (lw.field_g == ((pm) this).field_w) {
                      ((pm) this).field_x.c(-26450);
                      ((pm) this).field_w = tma.field_w;
                      jja.a(256, -1, 29);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (ov.field_e.length > ((pm) this).field_A) {
                    ((pm) this).field_A = ((pm) this).field_A + 1;
                    this.a(((pm) this).field_A, true);
                    ((pm) this).field_l = ((pm) this).field_l + 30;
                    var2 = 89 % ((param0 - 71) / 47);
                    return false;
                  } else {
                    this.d(-73);
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              ((pm) this).field_y = new taa(((pm) this).field_q, ((pm) this).field_B, ((pm) this).field_C);
              ((pm) this).field_y.field_p = false;
              ((pm) this).a(27799, (at) (Object) ((pm) this).field_y);
              ((pm) this).field_w = hba.field_x;
              return false;
            }
          } else {
            ((pm) this).field_x = new qn(((pm) this).field_q, ((pm) this).field_E.field_s, ((pm) this).field_E.field_r);
            ((pm) this).field_x.a(0);
            ((pm) this).field_y = new taa(((pm) this).field_q, ((pm) this).field_E.field_s, ((pm) this).field_E.field_r);
            ((pm) this).a(27799, (at) (Object) ((pm) this).field_y);
            ((pm) this).field_w = bia.field_i;
            return false;
          }
        }
    }

    public static void e(int param0) {
        if (param0 >= -25) {
            return;
        }
        field_v = null;
        field_z = null;
    }

    private final void d(int param0) {
        ((pm) this).field_E.a(((pm) this).field_q.field_h, false);
        if (param0 >= -22) {
            Object var3 = null;
            pm.a(20, 100, 70, 26, 13, -84, (String) null, (String) null, -119);
        }
    }

    private final void a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        ad var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uea var13 = null;
        int var14 = 0;
        op var15 = null;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        L0: {
          var14 = BachelorFridge.field_y;
          var15 = ((pm) this).field_q.field_h;
          var4 = var15.field_z;
          if (param1) {
            break L0;
          } else {
            ((pm) this).field_D = null;
            break L0;
          }
        }
        var5 = var15.field_B;
        var6 = ((pm) this).field_E.field_l.a(-27449, ((pm) this).field_q);
        var7 = vn.field_M[param0];
        var8 = -3;
        L1: while (true) {
          if (var8 > 3) {
            return;
          } else {
            var9 = -3;
            L2: while (true) {
              if (-4 > (var9 ^ -1)) {
                var8++;
                continue L1;
              } else {
                var10 = ((pm) this).field_E.field_t + var8;
                var11 = ((pm) this).field_E.field_q + var9;
                if (0 <= var10) {
                  if (var4 > var10) {
                    if (0 <= var11) {
                      if (var5 > var11) {
                        L3: {
                          if (-1 < (var9 ^ -1)) {
                            stackOut_16_0 = -var9;
                            stackIn_17_0 = stackOut_16_0;
                            break L3;
                          } else {
                            stackOut_15_0 = var9;
                            stackIn_17_0 = stackOut_15_0;
                            break L3;
                          }
                        }
                        L4: {
                          stackOut_17_0 = stackIn_17_0;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var8 >= 0) {
                            stackOut_19_0 = stackIn_19_0;
                            stackOut_19_1 = var8;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            break L4;
                          } else {
                            stackOut_18_0 = stackIn_18_0;
                            stackOut_18_1 = -var8;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L4;
                          }
                        }
                        var12 = stackIn_20_0 + stackIn_20_1;
                        if (param0 == var12) {
                          L5: {
                            if (var12 != 0) {
                              var13 = new uea(((pm) this).field_q, var10, var11, var7);
                              break L5;
                            } else {
                              var13 = (uea) (Object) new dw(((pm) this).field_q, var10, var11);
                              break L5;
                            }
                          }
                          ((kj) (Object) var13).a(0);
                          ((pm) this).a(var10, var11, var6, 0);
                          var9++;
                          continue L2;
                        } else {
                          var9++;
                          continue L2;
                        }
                      } else {
                        var9++;
                        continue L2;
                      }
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        aj var7 = null;
        aj var5 = null;
        aj var6 = null;
        int var4 = BachelorFridge.field_y;
        if (param0 > -10) {
            ((pm) this).field_C = 66;
        }
        if (bia.field_i == ((pm) this).field_w) {
            var5 = ((pm) this).field_q.field_s.a(((pm) this).field_C, (byte) -117, ((pm) this).field_B);
            ((pm) this).field_D.b(var5.field_c, var5.field_a);
        } else {
            if (hba.field_x == ((pm) this).field_w) {
                var6 = ((pm) this).field_q.field_s.a(((pm) this).field_C, (byte) 80, ((pm) this).field_B);
                var2 = (-((pm) this).field_l + 75) * (-((pm) this).field_l + 75) * 400 / 5625;
                ((pm) this).field_D.b(var6.field_c, var6.field_a + -var2);
            } else {
                if (lw.field_g == ((pm) this).field_w) {
                    var7 = ((pm) this).field_q.field_s.a(((pm) this).field_E.field_q, (byte) -126, ((pm) this).field_E.field_t);
                    var2 = ((pm) this).field_l * 400 / 30;
                    ((pm) this).field_D.e(var7.field_c, var7.field_a - (var2 - -((pm) this).field_D.field_o) + 60);
                }
            }
        }
    }

    final static void f(int param0) {
        int var1 = (kg.field_b - 640) / 2;
        int var2 = saa.field_b * saa.field_b;
        int var3 = var2 + -(lfa.field_q * lfa.field_q);
        ng.field_e.a(-94 + (-120 + dg.field_c), param0 ^ 31336, 199, -(param0 * var3 / var2) + var1, 90);
        ui.field_r.a(-4 + (dg.field_c + -120), 31407, 438, 438 * var3 / var2 + 202 + var1, 0);
    }

    static {
    }
}
