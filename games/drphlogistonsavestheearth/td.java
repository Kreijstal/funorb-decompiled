/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int[] field_g;
    private ag field_b;
    static boolean field_f;
    boolean field_j;
    private int field_k;
    private int field_h;
    private int field_l;
    private int field_c;
    static String field_o;
    private int field_e;
    private int field_a;
    private boolean field_i;
    private he[] field_d;
    private int field_n;
    private int[] field_p;
    static String[] field_m;

    public static void a(int param0) {
        field_g = null;
        if (param0 != 869637800) {
            field_g = null;
        }
        field_o = null;
        field_m = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((td) this).field_i) {
          return;
        } else {
          L0: {
            if (-12 == ((td) this).field_n) {
              if (((td) this).field_d.length > ((td) this).field_k / ((td) this).field_e) {
                ((td) this).field_d[((td) this).field_k / ((td) this).field_e].a(-((td) this).field_c + ((td) this).field_l, ((td) this).field_a + -((td) this).field_h);
                break L0;
              } else {
                ((td) this).field_i = true;
                break L0;
              }
            } else {
              if (-1 != ((td) this).field_n) {
                L1: {
                  var2 = 255 * (hf.field_H[((td) this).field_n] - vh.field_e[((td) this).field_n] * ((td) this).field_k / 2) / hf.field_H[((td) this).field_n];
                  if (255 < var2) {
                    var2 = 255;
                    break L1;
                  } else {
                    if (var2 < 0) {
                      var2 = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  stackOut_11_0 = this;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var2 != 0) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L2;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L2;
                  }
                }
                L3: {
                  ((td) this).field_i = stackIn_14_1 != 0;
                  var3 = ((td) this).field_k * vh.field_e[((td) this).field_n];
                  wj.c(((td) this).field_l, ((td) this).field_a, var3, 16777215, var2);
                  var4 = 250 + -var2;
                  if (1 > var4) {
                    var4 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var4 < -251) {
                    var4 = 250;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-3 > var3) {
                    break L5;
                  } else {
                    if ((double)var3 > 181.25) {
                      break L5;
                    } else {
                      wj.a(((td) this).field_l << -1127641820, ((td) this).field_a << 781956356, var3 << -1868827805, var4, ((td) this).field_p);
                      break L0;
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
          L6: {
            if (param0) {
              break L6;
            } else {
              ((td) this).field_c = 76;
              break L6;
            }
          }
          return;
        }
    }

    final boolean a(byte param0) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          ((td) this).field_k = ((td) this).field_k + 1;
          if (param0 <= -98) {
            break L0;
          } else {
            td.a(-106);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = this;
            stackIn_5_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (((td) this).field_b == null) {
              break L2;
            } else {
              stackOut_3_0 = this;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!((td) this).field_b.m()) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L1;
              } else {
                stackOut_4_0 = this;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              }
            }
          }
          stackOut_5_0 = this;
          stackOut_5_1 = 1;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          break L1;
        }
        L3: {
          L4: {
            L5: {
              ((td) this).field_j = stackIn_7_1 != 0;
              if (!((td) this).field_i) {
                break L5;
              } else {
                if (((td) this).field_j) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            if (-1 != (((td) this).field_n ^ -1)) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              break L4;
            }
          }
          stackOut_12_0 = 1;
          stackIn_14_0 = stackOut_12_0;
          break L3;
        }
        return stackIn_14_0 != 0;
    }

    td(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ((td) this).field_k = 0;
        ((td) this).field_j = false;
        ((td) this).field_h = 0;
        ((td) this).field_e = 1;
        ((td) this).field_c = 0;
        ((td) this).field_d = null;
        ((td) this).field_p = new int[255];
        ((td) this).field_i = false;
        ((td) this).field_a = param2;
        ((td) this).field_l = param1;
        ((td) this).field_n = param0;
        var5 = fa.field_l[((td) this).field_n] >> -1309204080;
        var6 = 255 & fa.field_l[((td) this).field_n] >> 869637800;
        var7 = fa.field_l[((td) this).field_n] & 255;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 250) {
            L1: {
              if (-12 != (((td) this).field_n ^ -1)) {
                break L1;
              } else {
                ((td) this).field_c = 5;
                ((td) this).field_e = 1;
                ((td) this).field_h = 5;
                ((td) this).field_d = oj.field_c;
                break L1;
              }
            }
            L2: {
              if (param3 != -1) {
                var8 = e.a(104, param1);
                ((td) this).field_b = ag.a(nl.field_r[param3], 100, dk.field_a[((td) this).field_n], var8);
                od.a(-1630758008, ((td) this).field_b);
                break L2;
              } else {
                ((td) this).field_b = null;
                break L2;
              }
            }
          } else {
            var9 = 1 - -(var8 >> -714237947);
            ((td) this).field_p[var8] = var7 / var9 + (var5 / var9 << -842691504) - -(var6 / var9 << 1228323784);
            var8++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[]{2400, 1050, 1350, 1900, 1500, 900, 1400, 950, 650};
        field_o = "Waiting for graphics";
    }
}
