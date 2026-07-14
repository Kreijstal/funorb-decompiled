/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends qf implements Cloneable {
    private int field_z;
    private boolean field_B;
    static ko field_x;
    private int field_D;
    static int field_A;
    static String field_E;
    static String field_C;
    private int field_F;
    static String field_y;

    final void c(boolean param0, boolean param1) {
        if (!(!param1)) {
            return;
        }
        if (!param0) {
            Object var4 = null;
            byte[] discarded$0 = cj.a(-101, 72, (md) null, (byte[]) null);
        }
        to.field_c = to.field_c + 1;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        if (param0 != 1) {
            field_C = null;
        }
        if (!(0 >= ((cj) this).field_z)) {
            ((cj) this).field_z = ((cj) this).field_z - 1;
            if (0 == ((cj) this).field_z) {
                ((cj) this).field_B = true;
            }
        }
        if (0 == ((cj) this).field_z) {
            if (!((cj) this).field_B) {
                super.f(1, param1, param2, param3);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        double var7_double = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (param0) {
            break L0;
          } else {
            var7_double = -Math.cos((double)((cj) this).field_F * 0.09817477042468103) + 1.0;
            var9 = (int)Math.floor(0.5 + (double)param2 * var7_double / 12.0);
            param1 = param1 + var9;
            var10 = (int)Math.floor((double)param3 * var7_double / 12.0 + 0.5);
            param2 = param2 - var9;
            param4 = param4 + var10;
            param3 = param3 - var10;
            break L0;
          }
        }
        L1: {
          if (0 >= param2) {
            break L1;
          } else {
            if (0 >= param3) {
              break L1;
            } else {
              if (((cj) this).field_u) {
                var7 = param1 + param2 << -1893408604;
                var8 = (param3 << -67635741) + (param4 << 286858980);
                var9 = 4096 * param2 / 24;
                var10 = (int)(Math.random() * 2048.0 - 1024.0);
                al.field_a.a(384, 576, var7, var8, var10, var9);
                break L1;
              } else {
                L2: {
                  if (param2 != -25) {
                    break L2;
                  } else {
                    if (-25 == param3) {
                      al.field_a.a(param1, param4 + -param3);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                al.field_a.b(param1, -param3 + param4, param2 * 2, 3 * param3);
                break L1;
              }
            }
          }
        }
        if (param5 == 4261) {
          L3: {
            if (!param0) {
              break L3;
            } else {
              an.field_q.c(Integer.toString(((cj) this).field_D), param2 + param1, 6 + (param3 / 2 + param4), 16760896, -1);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final f g(int param0, int param1, f[][] param2, int param3) {
        int var5_int = 0;
        f var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        f[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        f stackIn_14_2 = null;
        Object stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        f[][] stackIn_14_6 = null;
        f[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        f stackIn_15_2 = null;
        Object stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        f[][] stackIn_15_6 = null;
        f[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        f stackIn_16_2 = null;
        Object stackIn_16_3 = null;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        f[][] stackIn_16_6 = null;
        dl[] stackIn_16_7 = null;
        f[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        f stackIn_21_2 = null;
        Object stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        f[][] stackIn_21_6 = null;
        f[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        f stackIn_22_2 = null;
        Object stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        f[][] stackIn_22_6 = null;
        f[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        f stackIn_23_2 = null;
        Object stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        f[][] stackIn_23_6 = null;
        dl[] stackIn_23_7 = null;
        f[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        f stackIn_29_2 = null;
        Object stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        f[][] stackIn_29_6 = null;
        f[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        f stackIn_30_2 = null;
        Object stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        f[][] stackIn_30_6 = null;
        f[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        f stackIn_31_2 = null;
        Object stackIn_31_3 = null;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        f[][] stackIn_31_6 = null;
        dl[] stackIn_31_7 = null;
        f[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        f stackIn_37_2 = null;
        Object stackIn_37_3 = null;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        f[][] stackIn_37_6 = null;
        f[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        f stackIn_38_2 = null;
        Object stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        f[][] stackIn_38_6 = null;
        f[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        f stackIn_39_2 = null;
        Object stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        f[][] stackIn_39_6 = null;
        dl[] stackIn_39_7 = null;
        f[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        f stackOut_13_2 = null;
        Object stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        f[][] stackOut_13_6 = null;
        f[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        f stackOut_15_2 = null;
        Object stackOut_15_3 = null;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        f[][] stackOut_15_6 = null;
        dl[] stackOut_15_7 = null;
        f[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        f stackOut_14_2 = null;
        Object stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        f[][] stackOut_14_6 = null;
        dl[] stackOut_14_7 = null;
        f[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        f stackOut_20_2 = null;
        Object stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        f[][] stackOut_20_6 = null;
        f[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        f stackOut_22_2 = null;
        Object stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        f[][] stackOut_22_6 = null;
        dl[] stackOut_22_7 = null;
        f[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        f stackOut_21_2 = null;
        Object stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        f[][] stackOut_21_6 = null;
        dl[] stackOut_21_7 = null;
        f[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        f stackOut_28_2 = null;
        Object stackOut_28_3 = null;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        f[][] stackOut_28_6 = null;
        f[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        f stackOut_30_2 = null;
        Object stackOut_30_3 = null;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        f[][] stackOut_30_6 = null;
        dl[] stackOut_30_7 = null;
        f[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        f stackOut_29_2 = null;
        Object stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        f[][] stackOut_29_6 = null;
        dl[] stackOut_29_7 = null;
        f[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        f stackOut_36_2 = null;
        Object stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        f[][] stackOut_36_6 = null;
        f[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        f stackOut_38_2 = null;
        Object stackOut_38_3 = null;
        int stackOut_38_4 = 0;
        int stackOut_38_5 = 0;
        f[][] stackOut_38_6 = null;
        dl[] stackOut_38_7 = null;
        f[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        f stackOut_37_2 = null;
        Object stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        f[][] stackOut_37_6 = null;
        dl[] stackOut_37_7 = null;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (ab.field_D != null) {
            break L0;
          } else {
            to.field_c = to.field_c - 1;
            var5_int = ((cj) this).a(false);
            mb.field_g = mb.field_g + 5;
            fn.field_j = fn.field_j + 5;
            var6 = 0;
            L1: while (true) {
              if (var6 >= 3) {
                break L0;
              } else {
                if (-1 != (1 << var6 & var5_int ^ -1)) {
                  q.field_a[var6].field_g = q.field_a[var6].field_g + 1;
                  mb.field_g = mb.field_g + 3;
                  fn.field_j = fn.field_j + 4;
                  if (to.field_c == 0) {
                    qg.field_q = qg.field_q | 1 << var6;
                    var6++;
                    continue L1;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
        ((cj) this).field_l.a((byte) 82, (f) this);
        if ((((cj) this).field_D ^ -1) == param3) {
          dd.field_c.a(64, param1 * 12, param0 * 12, 0, (byte) -111);
          return (f) (Object) new ig((f) this, bd.field_n, ((cj) this).field_l, false);
        } else {
          var5 = ((cj) this).field_l.a((f) this, param0, param1, param2, ba.field_g, (byte) -87).a((f) this, param0, param1, param2, jg.field_i, (byte) -87);
          var6 = 1;
          L2: while (true) {
            L3: {
              if (var6 > ((cj) this).field_D) {
                break L3;
              } else {
                L4: {
                  var7 = param2[param0][param1 + -var6].b((byte) 98) ? 1 : 0;
                  stackOut_13_0 = param2[param0];
                  stackOut_13_1 = -var6 + param1;
                  stackOut_13_2 = param2[param0][param1 - var6];
                  stackOut_13_3 = this;
                  stackOut_13_4 = param0;
                  stackOut_13_5 = -var6 + param1;
                  stackOut_13_6 = (f[][]) param2;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  stackIn_15_5 = stackOut_13_5;
                  stackIn_15_6 = stackOut_13_6;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  stackIn_14_4 = stackOut_13_4;
                  stackIn_14_5 = stackOut_13_5;
                  stackIn_14_6 = stackOut_13_6;
                  if (var6 == ((cj) this).field_D) {
                    stackOut_15_0 = (f[]) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = (f) (Object) stackIn_15_2;
                    stackOut_15_3 = this;
                    stackOut_15_4 = stackIn_15_4;
                    stackOut_15_5 = stackIn_15_5;
                    stackOut_15_6 = (f[][]) (Object) stackIn_15_6;
                    stackOut_15_7 = hj.field_b;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    stackIn_16_5 = stackOut_15_5;
                    stackIn_16_6 = stackOut_15_6;
                    stackIn_16_7 = stackOut_15_7;
                    break L4;
                  } else {
                    stackOut_14_0 = (f[]) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = (f) (Object) stackIn_14_2;
                    stackOut_14_3 = this;
                    stackOut_14_4 = stackIn_14_4;
                    stackOut_14_5 = stackIn_14_5;
                    stackOut_14_6 = (f[][]) (Object) stackIn_14_6;
                    stackOut_14_7 = ba.field_g;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    stackIn_16_5 = stackOut_14_5;
                    stackIn_16_6 = stackOut_14_6;
                    stackIn_16_7 = stackOut_14_7;
                    break L4;
                  }
                }
                stackIn_16_0[stackIn_16_1] = ((f) (Object) stackIn_16_2).a((f) this, stackIn_16_4, stackIn_16_5, stackIn_16_6, stackIn_16_7, (byte) -87);
                if (var7 == 0) {
                  break L3;
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
            var6 = 1;
            L5: while (true) {
              L6: {
                if (var6 > ((cj) this).field_D) {
                  break L6;
                } else {
                  L7: {
                    var7 = param2[param0][param1 + var6].b((byte) 97) ? 1 : 0;
                    stackOut_20_0 = param2[param0];
                    stackOut_20_1 = var6 + param1;
                    stackOut_20_2 = param2[param0][var6 + param1];
                    stackOut_20_3 = this;
                    stackOut_20_4 = param0;
                    stackOut_20_5 = param1 - -var6;
                    stackOut_20_6 = (f[][]) param2;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    stackIn_22_3 = stackOut_20_3;
                    stackIn_22_4 = stackOut_20_4;
                    stackIn_22_5 = stackOut_20_5;
                    stackIn_22_6 = stackOut_20_6;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    stackIn_21_4 = stackOut_20_4;
                    stackIn_21_5 = stackOut_20_5;
                    stackIn_21_6 = stackOut_20_6;
                    if (var6 == ((cj) this).field_D) {
                      stackOut_22_0 = (f[]) (Object) stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = (f) (Object) stackIn_22_2;
                      stackOut_22_3 = this;
                      stackOut_22_4 = stackIn_22_4;
                      stackOut_22_5 = stackIn_22_5;
                      stackOut_22_6 = (f[][]) (Object) stackIn_22_6;
                      stackOut_22_7 = q.field_b;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      stackIn_23_5 = stackOut_22_5;
                      stackIn_23_6 = stackOut_22_6;
                      stackIn_23_7 = stackOut_22_7;
                      break L7;
                    } else {
                      stackOut_21_0 = (f[]) (Object) stackIn_21_0;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = (f) (Object) stackIn_21_2;
                      stackOut_21_3 = this;
                      stackOut_21_4 = stackIn_21_4;
                      stackOut_21_5 = stackIn_21_5;
                      stackOut_21_6 = (f[][]) (Object) stackIn_21_6;
                      stackOut_21_7 = ba.field_g;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      stackIn_23_5 = stackOut_21_5;
                      stackIn_23_6 = stackOut_21_6;
                      stackIn_23_7 = stackOut_21_7;
                      break L7;
                    }
                  }
                  stackIn_23_0[stackIn_23_1] = ((f) (Object) stackIn_23_2).a((f) this, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, (byte) -87);
                  if (var7 != 0) {
                    var6++;
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var6 = 1;
              L8: while (true) {
                L9: {
                  if (var6 > ((cj) this).field_D) {
                    break L9;
                  } else {
                    L10: {
                      var7 = param2[param0 - var6][param1].b((byte) 112) ? 1 : 0;
                      stackOut_28_0 = param2[-var6 + param0];
                      stackOut_28_1 = param1;
                      stackOut_28_2 = param2[param0 - var6][param1];
                      stackOut_28_3 = this;
                      stackOut_28_4 = -var6 + param0;
                      stackOut_28_5 = param1;
                      stackOut_28_6 = (f[][]) param2;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_30_2 = stackOut_28_2;
                      stackIn_30_3 = stackOut_28_3;
                      stackIn_30_4 = stackOut_28_4;
                      stackIn_30_5 = stackOut_28_5;
                      stackIn_30_6 = stackOut_28_6;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      stackIn_29_4 = stackOut_28_4;
                      stackIn_29_5 = stackOut_28_5;
                      stackIn_29_6 = stackOut_28_6;
                      if (var6 != ((cj) this).field_D) {
                        stackOut_30_0 = (f[]) (Object) stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = (f) (Object) stackIn_30_2;
                        stackOut_30_3 = this;
                        stackOut_30_4 = stackIn_30_4;
                        stackOut_30_5 = stackIn_30_5;
                        stackOut_30_6 = (f[][]) (Object) stackIn_30_6;
                        stackOut_30_7 = jg.field_i;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        stackIn_31_3 = stackOut_30_3;
                        stackIn_31_4 = stackOut_30_4;
                        stackIn_31_5 = stackOut_30_5;
                        stackIn_31_6 = stackOut_30_6;
                        stackIn_31_7 = stackOut_30_7;
                        break L10;
                      } else {
                        stackOut_29_0 = (f[]) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = (f) (Object) stackIn_29_2;
                        stackOut_29_3 = this;
                        stackOut_29_4 = stackIn_29_4;
                        stackOut_29_5 = stackIn_29_5;
                        stackOut_29_6 = (f[][]) (Object) stackIn_29_6;
                        stackOut_29_7 = pl.field_B;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        stackIn_31_5 = stackOut_29_5;
                        stackIn_31_6 = stackOut_29_6;
                        stackIn_31_7 = stackOut_29_7;
                        break L10;
                      }
                    }
                    stackIn_31_0[stackIn_31_1] = ((f) (Object) stackIn_31_2).a((f) this, stackIn_31_4, stackIn_31_5, stackIn_31_6, stackIn_31_7, (byte) -87);
                    if (var7 != 0) {
                      var6++;
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var6 = 1;
                L11: while (true) {
                  L12: {
                    if (var6 > ((cj) this).field_D) {
                      break L12;
                    } else {
                      L13: {
                        var7 = param2[var6 + param0][param1].b((byte) 58) ? 1 : 0;
                        stackOut_36_0 = param2[var6 + param0];
                        stackOut_36_1 = param1;
                        stackOut_36_2 = param2[var6 + param0][param1];
                        stackOut_36_3 = this;
                        stackOut_36_4 = var6 + param0;
                        stackOut_36_5 = param1;
                        stackOut_36_6 = (f[][]) param2;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_38_4 = stackOut_36_4;
                        stackIn_38_5 = stackOut_36_5;
                        stackIn_38_6 = stackOut_36_6;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        stackIn_37_4 = stackOut_36_4;
                        stackIn_37_5 = stackOut_36_5;
                        stackIn_37_6 = stackOut_36_6;
                        if (var6 == ((cj) this).field_D) {
                          stackOut_38_0 = (f[]) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = (f) (Object) stackIn_38_2;
                          stackOut_38_3 = this;
                          stackOut_38_4 = stackIn_38_4;
                          stackOut_38_5 = stackIn_38_5;
                          stackOut_38_6 = (f[][]) (Object) stackIn_38_6;
                          stackOut_38_7 = cl.field_n;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          stackIn_39_3 = stackOut_38_3;
                          stackIn_39_4 = stackOut_38_4;
                          stackIn_39_5 = stackOut_38_5;
                          stackIn_39_6 = stackOut_38_6;
                          stackIn_39_7 = stackOut_38_7;
                          break L13;
                        } else {
                          stackOut_37_0 = (f[]) (Object) stackIn_37_0;
                          stackOut_37_1 = stackIn_37_1;
                          stackOut_37_2 = (f) (Object) stackIn_37_2;
                          stackOut_37_3 = this;
                          stackOut_37_4 = stackIn_37_4;
                          stackOut_37_5 = stackIn_37_5;
                          stackOut_37_6 = (f[][]) (Object) stackIn_37_6;
                          stackOut_37_7 = jg.field_i;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          stackIn_39_3 = stackOut_37_3;
                          stackIn_39_4 = stackOut_37_4;
                          stackIn_39_5 = stackOut_37_5;
                          stackIn_39_6 = stackOut_37_6;
                          stackIn_39_7 = stackOut_37_7;
                          break L13;
                        }
                      }
                      stackIn_39_0[stackIn_39_1] = ((f) (Object) stackIn_39_2).a((f) this, stackIn_39_4, stackIn_39_5, stackIn_39_6, stackIn_39_7, (byte) -87);
                      if (var7 != 0) {
                        var6++;
                        continue L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  return var5;
                }
              }
            }
          }
        }
    }

    final static byte[] a(int param0, int param1, md param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (param1 == 2048) {
            break L0;
          } else {
            cj.f((byte) 73);
            break L0;
          }
        }
        var4 = param2.d((byte) -61, param0);
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (param3.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param3 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param2.d((byte) -58, 3);
            var6 = (byte)param2.d((byte) -104, 8);
            if (-1 <= (var5 ^ -1)) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param3[var7] = (byte)(param2.d((byte) -69, var5) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    cj(f param0, int param1, int param2, int param3) {
        super(param0);
        ((cj) this).field_B = false;
        ((cj) this).field_z = 0;
        ((cj) this).field_F = (3 * param2 - -(5 * param3)) % 64;
        ((cj) this).field_D = param1;
    }

    final void a(int param0, int param1) {
        ((cj) this).field_D = param0;
        if (param1 < 61) {
            Object var4 = null;
            byte[] discarded$0 = cj.a(29, -120, (md) null, (byte[]) null);
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
            Object var3 = null;
            f discarded$0 = ((cj) this).a(-108, 119, (f[][]) null, (f) null, (byte) -39);
        }
        return ((cj) this).field_B;
    }

    public static void f(byte param0) {
        field_x = null;
        if (param0 != -21) {
            return;
        }
        field_C = null;
        field_y = null;
        field_E = null;
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
            return null;
        }
        return ng.a(kd.field_i, param1, (f) (Object) new cj((f) (Object) new kp(-1), ((cj) this).field_D, 0, 0), (byte) -83, bd.field_l);
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        ((cj) this).field_B = param1 ? true : false;
        ((cj) this).a((byte) 95, (f) (Object) param0.field_a);
        return false;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        if (((cj) this).field_B) {
            b.field_a = b.field_a + -3;
            we.field_h = we.field_h + -6;
            je.field_j = je.field_j + -3;
            fp.field_a = fp.field_a + -6;
            return this.g(param0, param1, param2, -1);
        }
        if (param3 <= 120) {
            return null;
        }
        return (f) this;
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        if (param0 != 42) {
            Object var5 = null;
            boolean discarded$0 = ((cj) this).a(96, -108, 70, (f[][]) null, -76, (fq) null, -124);
        }
        if (0 == ((cj) this).field_z) {
            ((cj) this).field_z = 2;
            ((cj) this).a((byte) 63, param2);
            b.field_a = b.field_a + -4;
            we.field_h = we.field_h + -8;
            fp.field_a = fp.field_a + -8;
            je.field_j = je.field_j + -4;
            fn.field_j = fn.field_j - ob.field_l;
            wd.field_j = wd.field_j + 1;
            return true;
        }
        return true;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        ((cj) this).field_F = (3 * param2 - -(5 * param3)) % 64;
        if (param0 != -35) {
            ((cj) this).field_B = true;
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        fn.field_j = fn.field_j + ob.field_l;
        wd.field_j = wd.field_j - 1;
        we.field_h = we.field_h + 20;
        fp.field_a = fp.field_a + 20;
        je.field_j = je.field_j + 10;
        b.field_a = b.field_a + 10;
        if (param2 > 0) {
            field_x = null;
        }
        ((cj) this).field_B = true;
        wd.field_j = wd.field_j + 1;
        mb.field_g = mb.field_g + ob.field_l;
        return true;
    }

    final static int[] d(int param0, int param1, int param2) {
        int var3 = rl.b(param1, (byte) -23);
        int var4 = tm.a(param1, 500);
        int var5 = rl.b(param2, (byte) -23);
        int var6 = tm.a(param2, 500);
        if (param0 > -64) {
            field_y = null;
        }
        int var7 = (int)((long)var5 * (long)var3 >> -444876976);
        int var8 = (int)((long)var6 * (long)var3 >> -2020812336);
        int var9 = (int)((long)var5 * (long)var4 >> 1863610320);
        int var10 = (int)((long)var6 * (long)var4 >> -428674864);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        if (param1 != 0) {
            return;
        }
        ((cj) this).field_F = (((cj) this).field_F - -1) % 64;
    }

    final boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        if (param1 == (((cj) this).field_z ^ -1)) {
            if (((cj) this).field_B) {
                return false;
            }
            return super.a(param0, -1, param2, param3, param4, param5, param6);
        }
        return false;
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        ob.field_l = ob.field_l + 1;
        int var6 = -110 / ((73 - param4) / 42);
        fn.field_j = fn.field_j - wd.field_j;
        ((cj) this).field_B = true;
        ((cj) this).a((byte) 123, param3);
        return (f) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "To get a score or proceed beyond this level, complete the earlier ones first!";
        field_C = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_y = "Crystal";
    }
}
