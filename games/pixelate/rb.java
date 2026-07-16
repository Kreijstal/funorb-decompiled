/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb extends de {
    static String field_r;
    static int field_q;
    static int field_o;
    static String[] field_p;

    final void a(int param0, int param1, boolean param2) {
        jn.field_v = -1;
        jm.field_j = -1;
        super.a(param0, param1, param2);
    }

    private final String d(int param0, int param1) {
        if (param1 != 7698) {
            ((rb) this).a(-110, 30, true);
        }
        if (param0 == 0) {
            return ge.field_b;
        }
        return we.field_o[((rb) this).field_k[param0]];
    }

    private final int f(int param0) {
        if (param0 >= -95) {
            return -69;
        }
        return ((rb) this).field_l == 9 ? go.field_k : de.field_n;
    }

    private final boolean c(int param0, byte param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 > 90) {
            break L0;
          } else {
            ((rb) this).b(6);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (8 != ((rb) this).field_l) {
                break L3;
              } else {
                if ((param0 ^ -1) > -17) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!this.a((byte) 66, param0)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            field_r = null;
        }
        return ((rb) this).a(param0, (byte) 90) - -this.e(-112, param0);
    }

    final int b(int param0, int param1) {
        int var3 = 25 / ((param0 - -13) / 37);
        return ((rb) this).field_d;
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          if (var3 >= tn.field_n.length) {
            return var2;
          } else {
            if ((1 << var3 & this.f(-111)) > 0) {
              var2++;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        ob var3 = null;
        tc var4 = null;
        int var5 = 0;
        tf var6_ref_tf = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var15 = Pixelate.field_H ? 1 : 0;
          if (9 != ((rb) this).field_l) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          var3 = rk.field_e;
          if (param0 == 11) {
            break L1;
          } else {
            rk discarded$2 = rb.b(-94, (byte) 78);
            break L1;
          }
        }
        var4 = qj.field_e;
        gj.field_W[6].b(0, 45);
        ((rb) this).b((byte) -71);
        var5 = 0;
        L2: while (true) {
          if (var5 >= tn.field_n.length) {
            L3: {
              if ((jm.field_j ^ -1) == 0) {
                stackOut_21_0 = jn.field_v;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              } else {
                stackOut_20_0 = jm.field_j;
                stackIn_22_0 = stackOut_20_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_22_0;
              if (-1 != var5) {
                L5: {
                  var6 = var3.field_z + var3.field_D;
                  var7 = var4.field_D + (var4.field_z - -3);
                  var3.b(tn.field_n[var5], 320, 280, 0, -1);
                  if (this.a((byte) 66, var5)) {
                    var3.b(co.field_d, 320, 280 - -var6, 0, -1);
                    break L5;
                  } else {
                    var3.b(bf.field_t, 320, var6 + 280, 1, -1);
                    break L5;
                  }
                }
                var9 = this.b((byte) 37, var5);
                var9.b(60, 120);
                var10 = var4.a(this.a(true, var5), 120, 320, 400, 400, 16777215, 0, 0, 0, var7);
                var11 = 320 + (var7 * var10 + 24);
                var4.a(to.field_p + ri.field_c[var5], 120, var11, 16777215, 0);
                var11 = var11 + (4 + var7);
                var4.a(fh.field_K, 120, var11, 16777215, 0);
                var12 = var4.c(fh.field_K) + 120;
                var13 = var11;
                var14 = 0;
                L6: while (true) {
                  if (var14 >= ri.field_e[var5]) {
                    break L4;
                  } else {
                    vn.field_c.b((vn.field_c.field_A >> -1663174463) * var14 + var12, -vn.field_c.field_B + (var13 + 4));
                    var14++;
                    continue L6;
                  }
                }
              } else {
                int discarded$3 = var3.a(th.field_a, 30, 280, 580, 400, 0, -1, 1, 0, 30);
                if (!jg.a((byte) 109)) {
                  break L4;
                } else {
                  var6 = 280 + ((rb) this).field_d >> -269366303;
                  var4.b(mj.field_h, 320, var6, 16777215, 0);
                  break L4;
                }
              }
            }
            return;
          } else {
            L7: {
              var6_ref_tf = this.b((byte) 37, var5);
              if (this.a((byte) 66, var5)) {
                break L7;
              } else {
                if (var2 == 0) {
                  break L7;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
            if (this.c(var5, (byte) 97)) {
              L8: {
                var7 = this.d(var5, (byte) -54);
                var8 = this.f(-111, var5);
                if (var5 != jm.field_j) {
                  break L8;
                } else {
                  t.a(var7 - 3, -3 + var8, 38, 38, 6, 0, 128);
                  break L8;
                }
              }
              L9: {
                if (var5 == jn.field_v) {
                  t.e(var7 - 3, var8 + -3, 38, 38, 6, 16777215);
                  break L9;
                } else {
                  break L9;
                }
              }
              var6_ref_tf.e(var7, var8);
              var5++;
              continue L2;
            } else {
              var5++;
              continue L2;
            }
          }
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = 0;
        if (param0 == 4) {
          L0: while (true) {
            if (tn.field_n.length <= var4) {
              return -1;
            } else {
              if (this.c(var4, (byte) 95)) {
                var5 = this.d(var4, (byte) -89);
                var6 = this.f(124, var4);
                if (var5 < param1) {
                  if (var6 < param2) {
                    if (param1 < var5 - -32) {
                      if (param2 < var6 - -32) {
                        return var4;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 126;
        }
    }

    final int a(int param0, byte param1) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var3 = -40;
        int var4 = 0;
        if (param1 != 90) {
            field_q = 120;
        }
        while (((rb) this).field_g.field_h > var4) {
            var3 = var3 + (40 + this.e(param1 + -207, var4));
            var4++;
        }
        var4 = 640 + -var3 >> 1091059201;
        for (var5 = 0; param0 > var5; var5++) {
            var4 = var4 + (this.e(-118, var5) + 40);
        }
        return var4;
    }

    private final String a(boolean param0, int param1) {
        if (param0) {
          L0: {
            if (-11 != (param1 ^ -1)) {
              break L0;
            } else {
              if (!this.a((byte) 66, param1)) {
                return dq.field_a;
              } else {
                break L0;
              }
            }
          }
          return qa.field_a[param1];
        } else {
          return null;
        }
    }

    final void c(byte param0) {
        if (param0 >= -13) {
            return;
        }
        la.a(((rb) this).field_l, nc.field_a, false, -25528);
    }

    rb(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final int d(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        if (16 > param0) {
          return 264 + 40 * (param0 % 8);
        } else {
          var3 = 40 * this.e(16);
          var4 = (-var3 + 320) / 2 + 264;
          var5 = 68 % ((39 - param1) / 56);
          var6 = 16;
          L0: while (true) {
            if (param0 <= var6) {
              return var4;
            } else {
              if (this.a((byte) 66, var6)) {
                var4 += 40;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    private final tf b(byte param0, int param1) {
        if (this.a((byte) 66, param1)) {
          return oo.field_c[param1];
        } else {
          L0: {
            if (!gq.d(param0 ^ 96)) {
              break L0;
            } else {
              if (!qi.field_p[param1]) {
                break L0;
              } else {
                return gd.field_i;
              }
            }
          }
          if (param0 == 37) {
            return pj.field_a;
          } else {
            return null;
          }
        }
    }

    private final boolean a(byte param0, int param1) {
        if (param0 != 66) {
            field_o = -28;
        }
        return 0 < (1 << param1 & this.f(-109)) ? true : false;
    }

    private final int f(int param0, int param1) {
        int var4 = -118 / ((param0 - 91) / 33);
        int var3 = -1 != (this.e(16) ^ -1) ? 130 : 150;
        return var3 - -(param1 / 8 * 40);
    }

    final void e(byte param0) {
        super.e((byte) -94);
        if (param0 > -64) {
            field_q = 92;
        }
        jn.field_v = this.b(4, uf.field_d, bg.field_k);
        if (jn.field_v != -1) {
            if (-2 == (nm.field_c ^ -1)) {
                pp discarded$8 = mc.a(128, -126);
                if (jn.field_v == jm.field_j) {
                    jm.field_j = -1;
                } else {
                    jm.field_j = jn.field_v;
                }
            }
        }
    }

    final void b(int param0) {
        if (param0 > -35) {
            return;
        }
        ((rb) this).field_g.a(114, 0);
    }

    final static rk b(int param0, byte param1) {
        int var2 = -(param0 * 2) + 140;
        if (param1 < 26) {
            field_o = 88;
        }
        int var3 = 3 + ok.a(tg.field_f, -124, 17);
        double var4 = (double)(param0 - 10) / 10.0 + 7.0;
        return new rk(var2, var3, of.a(var4, 65536));
    }

    public static void b(boolean param0) {
        if (!param0) {
            rk discarded$0 = rb.b(3, (byte) 57);
        }
        field_p = null;
        field_r = null;
    }

    private final int e(int param0, int param1) {
        if (param0 >= -107) {
            return 80;
        }
        return rk.field_e.c(this.d(param1, 7698)) - -(0 == param1 ? sn.field_m.field_A : 0);
    }

    final void a(byte param0, boolean param1, int param2) {
        String var4 = null;
        tf var5 = null;
        tf stackIn_5_0 = null;
        tf stackOut_4_0 = null;
        tf stackOut_3_0 = null;
        L0: {
          L1: {
            var4 = this.d(param2, 7698);
            if (param2 != 1) {
              break L1;
            } else {
              if ((((rb) this).field_k[param2] ^ -1) == -24) {
                stackOut_4_0 = oc.field_S;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = oc.field_N;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var5 = stackIn_5_0;
          if (param2 == 0) {
            ((rb) this).a(param1, var4, var5, -6, ((rb) this).a(0, (byte) 90) - -((rb) this).a(0, false) >> -1505320223);
            break L2;
          } else {
            super.a(var4, param1, param2, var5, (byte) 124);
            break L2;
          }
        }
        L3: {
          if (param0 <= -116) {
            break L3;
          } else {
            rk discarded$1 = rb.b(40, (byte) -112);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Email: ";
    }
}
