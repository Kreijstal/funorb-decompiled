/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ana {
    private cja field_C;
    private taa field_E;
    private int field_v;
    static int field_z;
    private int field_H;
    private int field_F;
    static int field_D;
    private int field_G;
    private int field_w;
    private boolean field_A;
    private int field_x;
    private cq field_y;
    private int field_B;

    private final void e(byte param0) {
        int var2 = 0;
        if (!(null == ((mm) this).field_y)) {
            id.a(127, ((mm) this).field_y);
        }
    }

    final boolean c(byte param0) {
        uea var2_ref_uea = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        je var5 = null;
        if (!((mm) this).field_m.a((byte) -106)) {
          if (!((mm) this).field_E.a((byte) -106)) {
            L0: {
              if (null != ((mm) this).field_y) {
                break L0;
              } else {
                var5 = je.a(rt.field_a[20], 256, 192);
                var5.d(-1);
                ((mm) this).field_y = tw.a(var5, (byte) -36);
                break L0;
              }
            }
            int fieldTemp$1 = ((mm) this).field_F + 1;
            ((mm) this).field_F = ((mm) this).field_F + 1;
            if (((mm) this).field_H > fieldTemp$1) {
              L1: {
                if (((mm) this).field_F == -25) {
                  var2_ref_uea = new uea(((mm) this).field_q, ((mm) this).field_C.field_s, ((mm) this).field_C.field_u, 16777215);
                  ((kj) (Object) var2_ref_uea).a(0);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = 38 % ((param0 - 71) / 47);
              if (((mm) this).field_F == 0) {
                this.d(58);
                jja.a(192, -1, 3);
                var3 = ((mm) this).field_G - -(((mm) this).field_F * ((mm) this).field_v);
                var4 = ((mm) this).field_x - -(((mm) this).field_B * ((mm) this).field_F);
                ((mm) this).field_q.field_s.c(18, -var4 + 240, -var3 + 320);
                return false;
              } else {
                var3 = ((mm) this).field_G - -(((mm) this).field_F * ((mm) this).field_v);
                var4 = ((mm) this).field_x - -(((mm) this).field_B * ((mm) this).field_F);
                ((mm) this).field_q.field_s.c(18, -var4 + 240, -var3 + 320);
                return false;
              }
            } else {
              this.e((byte) -111);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void d(int param0) {
        ((mm) this).field_C.a(((mm) this).field_q.field_h, false);
    }

    mm(gj param0, cja param1) {
        super(param0, (bca) (Object) param1);
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              ((mm) this).field_C = param1;
              var6 = ((mm) this).field_q.field_s.a(((mm) this).field_C.field_u, (byte) -128, ((mm) this).field_C.field_s);
              ((mm) this).field_x = var6.field_a - ((mm) this).field_q.field_s.field_B;
              ((mm) this).field_G = -((mm) this).field_q.field_s.field_b + var6.field_c;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((1 & m.field_a.nextInt()) != 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((mm) this).field_A = stackIn_4_1 != 0;
              ((mm) this).field_B = 2;
              ((mm) this).field_v = ((mm) this).field_B << 1;
              if (!((mm) this).field_A) {
                ((mm) this).field_w = 64 * (7 - -((mm) this).field_C.field_s) / ((mm) this).field_v;
                ((mm) this).field_H = (64 * (-((mm) this).field_C.field_s + ((mm) this).field_q.field_h.field_z) + 448) / ((mm) this).field_v;
                break L2;
              } else {
                ((mm) this).field_w = (((mm) this).field_C.field_u + 7) * 64 / ((mm) this).field_v;
                ((mm) this).field_H = (448 + 64 * (((mm) this).field_q.field_h.field_B + -((mm) this).field_C.field_u)) / ((mm) this).field_v;
                break L2;
              }
            }
            L3: {
              if (!((mm) this).field_A) {
                break L3;
              } else {
                ((mm) this).field_v = -((mm) this).field_v;
                break L3;
              }
            }
            ((mm) this).field_F = -((mm) this).field_w;
            var4 = ((mm) this).field_G - ((mm) this).field_w * ((mm) this).field_v;
            var5 = -(((mm) this).field_B * ((mm) this).field_w) + ((mm) this).field_x;
            ((mm) this).field_E = new taa(((mm) this).field_q, 0, 0);
            ((mm) this).field_E.field_k = 320 + -var4;
            ((mm) this).field_E.field_j = -var5 + 240;
            ((mm) this).a(27799, (at) (Object) ((mm) this).field_E);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mm.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 < -10) {
          var2 = ((mm) this).field_F * ((mm) this).field_v + ((mm) this).field_G;
          var2 = var2 + ((mm) this).field_q.field_s.field_b;
          var3 = ((mm) this).field_B * ((mm) this).field_F + ((mm) this).field_x;
          var3 = var3 + ((mm) this).field_q.field_s.field_B;
          var4 = ((mm) this).field_F >> 3 & 1;
          var5 = (via.a(((mm) this).field_F << 8, (byte) 102) >> 13) + 64;
          var6 = 65536;
          if (((mm) this).field_F > -64) {
            if (((mm) this).field_F < 64) {
              L0: {
                if (((mm) this).field_F >= 0) {
                  stackOut_41_0 = 64 + -((mm) this).field_F;
                  stackIn_42_0 = stackOut_41_0;
                  break L0;
                } else {
                  stackOut_40_0 = 64 + ((mm) this).field_F;
                  stackIn_42_0 = stackOut_40_0;
                  break L0;
                }
              }
              L1: {
                var7 = stackIn_42_0;
                var6 = var6 - (var7 * var7 << 4);
                var5 = var5 * var6 >> 16;
                if (((mm) this).field_F >= 0) {
                  break L1;
                } else {
                  var7 = od.field_w[((mm) this).field_C.field_q].field_f;
                  if (var7 < 4) {
                    ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
                    break L1;
                  } else {
                    var7 -= 4;
                    ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
                    var7 = -(var5 >> 2) + 64;
                    var8 = 48 + -(var5 >> 2);
                    nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
                    if (!((mm) this).field_A) {
                      ho.field_j[var4].c(var2, -45 + var3 - var5);
                      return;
                    } else {
                      ho.field_j[var4].a(var2, -var5 + var3 + -45);
                      return;
                    }
                  }
                }
              }
              var7 = -(var5 >> 2) + 64;
              var8 = 48 + -(var5 >> 2);
              nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
              if (!((mm) this).field_A) {
                ho.field_j[var4].c(var2, -45 + var3 - var5);
                return;
              } else {
                ho.field_j[var4].a(var2, -var5 + var3 + -45);
                return;
              }
            } else {
              L2: {
                var5 = var5 * var6 >> 16;
                if (((mm) this).field_F >= 0) {
                  break L2;
                } else {
                  var7 = od.field_w[((mm) this).field_C.field_q].field_f;
                  if (var7 < 4) {
                    ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
                    break L2;
                  } else {
                    var7 -= 4;
                    ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
                    var7 = -(var5 >> 2) + 64;
                    var8 = 48 + -(var5 >> 2);
                    nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
                    if (!((mm) this).field_A) {
                      ho.field_j[var4].c(var2, -45 + var3 - var5);
                      return;
                    } else {
                      ho.field_j[var4].a(var2, -var5 + var3 + -45);
                      return;
                    }
                  }
                }
              }
              var7 = -(var5 >> 2) + 64;
              var8 = 48 + -(var5 >> 2);
              nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
              if (!((mm) this).field_A) {
                ho.field_j[var4].c(var2, -45 + var3 - var5);
                return;
              } else {
                ho.field_j[var4].a(var2, -var5 + var3 + -45);
                return;
              }
            }
          } else {
            L3: {
              var5 = var5 * var6 >> 16;
              if (((mm) this).field_F >= 0) {
                break L3;
              } else {
                var7 = od.field_w[((mm) this).field_C.field_q].field_f;
                if (var7 < 4) {
                  ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
                  break L3;
                } else {
                  var7 -= 4;
                  ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
                  var7 = -(var5 >> 2) + 64;
                  var8 = 48 + -(var5 >> 2);
                  nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
                  if (!((mm) this).field_A) {
                    ho.field_j[var4].c(var2, -45 + var3 - var5);
                    return;
                  } else {
                    ho.field_j[var4].a(var2, -var5 + var3 + -45);
                    return;
                  }
                }
              }
            }
            var7 = -(var5 >> 2) + 64;
            var8 = 48 + -(var5 >> 2);
            nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
            if (!((mm) this).field_A) {
              ho.field_j[var4].c(var2, -45 + var3 - var5);
              return;
            } else {
              ho.field_j[var4].a(var2, -var5 + var3 + -45);
              return;
            }
          }
        } else {
          L4: {
            ((mm) this).c(-72);
            var2 = ((mm) this).field_F * ((mm) this).field_v + ((mm) this).field_G;
            var2 = var2 + ((mm) this).field_q.field_s.field_b;
            var3 = ((mm) this).field_B * ((mm) this).field_F + ((mm) this).field_x;
            var3 = var3 + ((mm) this).field_q.field_s.field_B;
            var4 = ((mm) this).field_F >> 3 & 1;
            var5 = (via.a(((mm) this).field_F << 8, (byte) 102) >> 13) + 64;
            var6 = 65536;
            if (((mm) this).field_F <= -64) {
              break L4;
            } else {
              if (((mm) this).field_F >= 64) {
                break L4;
              } else {
                L5: {
                  if (((mm) this).field_F >= 0) {
                    stackOut_5_0 = 64 + -((mm) this).field_F;
                    stackIn_6_0 = stackOut_5_0;
                    break L5;
                  } else {
                    stackOut_4_0 = 64 + ((mm) this).field_F;
                    stackIn_6_0 = stackOut_4_0;
                    break L5;
                  }
                }
                var7 = stackIn_6_0;
                var6 = var6 - (var7 * var7 << 4);
                break L4;
              }
            }
          }
          var5 = var5 * var6 >> 16;
          if (((mm) this).field_F >= 0) {
            var7 = -(var5 >> 2) + 64;
            var8 = 48 + -(var5 >> 2);
            nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
            if (!((mm) this).field_A) {
              ho.field_j[var4].c(var2, -45 + var3 - var5);
              return;
            } else {
              ho.field_j[var4].a(var2, -var5 + var3 + -45);
              return;
            }
          } else {
            var7 = od.field_w[((mm) this).field_C.field_q].field_f;
            if (var7 < 4) {
              ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
              var7 = -(var5 >> 2) + 64;
              var8 = 48 + -(var5 >> 2);
              nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
              if (!((mm) this).field_A) {
                ho.field_j[var4].c(var2, -45 + var3 - var5);
                return;
              } else {
                ho.field_j[var4].a(var2, -var5 + var3 + -45);
                return;
              }
            } else {
              var7 -= 4;
              ve.field_m[var7][(((mm) this).field_q.field_L >> 2) % 25].e(var2 - -44, -var5 + var3);
              var7 = -(var5 >> 2) + 64;
              var8 = 48 + -(var5 >> 2);
              nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1) + 64 + var2, 24 + (var3 + -(var8 >> 1)), var7, var8);
              if (!((mm) this).field_A) {
                ho.field_j[var4].c(var2, -45 + var3 - var5);
                return;
              } else {
                ho.field_j[var4].a(var2, -var5 + var3 + -45);
                return;
              }
            }
          }
        }
    }

    static {
    }
}
