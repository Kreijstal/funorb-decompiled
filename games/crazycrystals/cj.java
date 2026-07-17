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
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              if (0 < ((cj) this).field_z) {
                ((cj) this).field_z = ((cj) this).field_z - 1;
                if (0 != ((cj) this).field_z) {
                  break L2;
                } else {
                  ((cj) this).field_B = true;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (0 != ((cj) this).field_z) {
                break L3;
              } else {
                if (((cj) this).field_B) {
                  break L3;
                } else {
                  super.f(1, param1, param2, param3);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("cj.LA(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
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
                var7 = param1 + param2 << 4;
                var8 = (param3 << 3) + (param4 << 4);
                var9 = 4096 * param2 / 24;
                var10 = (int)(Math.random() * 2048.0 - 1024.0);
                al.field_a.a(384, 576, var7, var8, var10, var9);
                break L1;
              } else {
                L2: {
                  if (param2 != 24) {
                    break L2;
                  } else {
                    if (param3 == 24) {
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
        RuntimeException var5 = null;
        int var5_int = 0;
        f var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ig stackIn_13_0 = null;
        f[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        f stackIn_17_2 = null;
        Object stackIn_17_3 = null;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        f[][] stackIn_17_6 = null;
        f[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        f stackIn_18_2 = null;
        Object stackIn_18_3 = null;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        f[][] stackIn_18_6 = null;
        f[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        f stackIn_19_2 = null;
        Object stackIn_19_3 = null;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        f[][] stackIn_19_6 = null;
        dl[] stackIn_19_7 = null;
        f[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        f stackIn_24_2 = null;
        Object stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        f[][] stackIn_24_6 = null;
        f[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        f stackIn_25_2 = null;
        Object stackIn_25_3 = null;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        f[][] stackIn_25_6 = null;
        f[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        f stackIn_26_2 = null;
        Object stackIn_26_3 = null;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        f[][] stackIn_26_6 = null;
        dl[] stackIn_26_7 = null;
        f[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        f stackIn_32_2 = null;
        Object stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        f[][] stackIn_32_6 = null;
        f[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        f stackIn_33_2 = null;
        Object stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        f[][] stackIn_33_6 = null;
        f[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        f stackIn_34_2 = null;
        Object stackIn_34_3 = null;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        f[][] stackIn_34_6 = null;
        dl[] stackIn_34_7 = null;
        f[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        f stackIn_40_2 = null;
        Object stackIn_40_3 = null;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        f[][] stackIn_40_6 = null;
        f[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        f stackIn_41_2 = null;
        Object stackIn_41_3 = null;
        int stackIn_41_4 = 0;
        int stackIn_41_5 = 0;
        f[][] stackIn_41_6 = null;
        f[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        f stackIn_42_2 = null;
        Object stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        f[][] stackIn_42_6 = null;
        dl[] stackIn_42_7 = null;
        f stackIn_46_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_12_0 = null;
        f[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        f stackOut_16_2 = null;
        Object stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        f[][] stackOut_16_6 = null;
        f[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        f stackOut_18_2 = null;
        Object stackOut_18_3 = null;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        f[][] stackOut_18_6 = null;
        dl[] stackOut_18_7 = null;
        f[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        f stackOut_17_2 = null;
        Object stackOut_17_3 = null;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        f[][] stackOut_17_6 = null;
        dl[] stackOut_17_7 = null;
        f[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        f stackOut_23_2 = null;
        Object stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        f[][] stackOut_23_6 = null;
        f[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        f stackOut_25_2 = null;
        Object stackOut_25_3 = null;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        f[][] stackOut_25_6 = null;
        dl[] stackOut_25_7 = null;
        f[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        f stackOut_24_2 = null;
        Object stackOut_24_3 = null;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        f[][] stackOut_24_6 = null;
        dl[] stackOut_24_7 = null;
        f[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        f stackOut_31_2 = null;
        Object stackOut_31_3 = null;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        f[][] stackOut_31_6 = null;
        f[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        f stackOut_33_2 = null;
        Object stackOut_33_3 = null;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        f[][] stackOut_33_6 = null;
        dl[] stackOut_33_7 = null;
        f[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        f stackOut_32_2 = null;
        Object stackOut_32_3 = null;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        f[][] stackOut_32_6 = null;
        dl[] stackOut_32_7 = null;
        f[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        f stackOut_39_2 = null;
        Object stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        int stackOut_39_5 = 0;
        f[][] stackOut_39_6 = null;
        f[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        f stackOut_41_2 = null;
        Object stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        f[][] stackOut_41_6 = null;
        dl[] stackOut_41_7 = null;
        f[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        f stackOut_40_2 = null;
        Object stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        int stackOut_40_5 = 0;
        f[][] stackOut_40_6 = null;
        dl[] stackOut_40_7 = null;
        f stackOut_45_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (ab.field_D != null) {
                break L1;
              } else {
                to.field_c = to.field_c - 1;
                var5_int = ((cj) this).a(false);
                mb.field_g = mb.field_g + 5;
                fn.field_j = fn.field_j + 5;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 3) {
                    break L1;
                  } else {
                    L3: {
                      if ((1 << var6 & var5_int) != 0) {
                        q.field_a[var6].field_g = q.field_a[var6].field_g + 1;
                        mb.field_g = mb.field_g + 3;
                        fn.field_j = fn.field_j + 4;
                        if (to.field_c == 0) {
                          qg.field_q = qg.field_q | 1 << var6;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            ((cj) this).field_l.a((byte) 82, (f) this);
            if (((cj) this).field_D == 0) {
              dd.field_c.a(64, param1 * 12, param0 * 12, 0, (byte) -111);
              stackOut_12_0 = new ig((f) this, bd.field_n, ((cj) this).field_l, false);
              stackIn_13_0 = stackOut_12_0;
              return (f) (Object) stackIn_13_0;
            } else {
              var5_ref = ((cj) this).field_l.a((f) this, param0, param1, param2, ba.field_g, (byte) -87).a((f) this, param0, param1, param2, jg.field_i, (byte) -87);
              var6 = 1;
              L4: while (true) {
                L5: {
                  if (var6 > ((cj) this).field_D) {
                    break L5;
                  } else {
                    L6: {
                      var7 = param2[param0][param1 + -var6].b((byte) 98) ? 1 : 0;
                      stackOut_16_0 = param2[param0];
                      stackOut_16_1 = -var6 + param1;
                      stackOut_16_2 = param2[param0][param1 - var6];
                      stackOut_16_3 = this;
                      stackOut_16_4 = param0;
                      stackOut_16_5 = -var6 + param1;
                      stackOut_16_6 = (f[][]) param2;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      stackIn_18_4 = stackOut_16_4;
                      stackIn_18_5 = stackOut_16_5;
                      stackIn_18_6 = stackOut_16_6;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      stackIn_17_6 = stackOut_16_6;
                      if (var6 == ((cj) this).field_D) {
                        stackOut_18_0 = (f[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (f) (Object) stackIn_18_2;
                        stackOut_18_3 = this;
                        stackOut_18_4 = stackIn_18_4;
                        stackOut_18_5 = stackIn_18_5;
                        stackOut_18_6 = (f[][]) (Object) stackIn_18_6;
                        stackOut_18_7 = hj.field_b;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        stackIn_19_3 = stackOut_18_3;
                        stackIn_19_4 = stackOut_18_4;
                        stackIn_19_5 = stackOut_18_5;
                        stackIn_19_6 = stackOut_18_6;
                        stackIn_19_7 = stackOut_18_7;
                        break L6;
                      } else {
                        stackOut_17_0 = (f[]) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = (f) (Object) stackIn_17_2;
                        stackOut_17_3 = this;
                        stackOut_17_4 = stackIn_17_4;
                        stackOut_17_5 = stackIn_17_5;
                        stackOut_17_6 = (f[][]) (Object) stackIn_17_6;
                        stackOut_17_7 = ba.field_g;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        stackIn_19_3 = stackOut_17_3;
                        stackIn_19_4 = stackOut_17_4;
                        stackIn_19_5 = stackOut_17_5;
                        stackIn_19_6 = stackOut_17_6;
                        stackIn_19_7 = stackOut_17_7;
                        break L6;
                      }
                    }
                    stackIn_19_0[stackIn_19_1] = ((f) (Object) stackIn_19_2).a((f) this, stackIn_19_4, stackIn_19_5, stackIn_19_6, stackIn_19_7, (byte) -87);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      var6++;
                      continue L4;
                    }
                  }
                }
                var6 = 1;
                L7: while (true) {
                  L8: {
                    if (var6 > ((cj) this).field_D) {
                      break L8;
                    } else {
                      L9: {
                        var7 = param2[param0][param1 + var6].b((byte) 97) ? 1 : 0;
                        stackOut_23_0 = param2[param0];
                        stackOut_23_1 = var6 + param1;
                        stackOut_23_2 = param2[param0][var6 + param1];
                        stackOut_23_3 = this;
                        stackOut_23_4 = param0;
                        stackOut_23_5 = param1 - -var6;
                        stackOut_23_6 = (f[][]) param2;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_25_4 = stackOut_23_4;
                        stackIn_25_5 = stackOut_23_5;
                        stackIn_25_6 = stackOut_23_6;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        stackIn_24_6 = stackOut_23_6;
                        if (var6 == ((cj) this).field_D) {
                          stackOut_25_0 = (f[]) (Object) stackIn_25_0;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = (f) (Object) stackIn_25_2;
                          stackOut_25_3 = this;
                          stackOut_25_4 = stackIn_25_4;
                          stackOut_25_5 = stackIn_25_5;
                          stackOut_25_6 = (f[][]) (Object) stackIn_25_6;
                          stackOut_25_7 = q.field_b;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          stackIn_26_3 = stackOut_25_3;
                          stackIn_26_4 = stackOut_25_4;
                          stackIn_26_5 = stackOut_25_5;
                          stackIn_26_6 = stackOut_25_6;
                          stackIn_26_7 = stackOut_25_7;
                          break L9;
                        } else {
                          stackOut_24_0 = (f[]) (Object) stackIn_24_0;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = (f) (Object) stackIn_24_2;
                          stackOut_24_3 = this;
                          stackOut_24_4 = stackIn_24_4;
                          stackOut_24_5 = stackIn_24_5;
                          stackOut_24_6 = (f[][]) (Object) stackIn_24_6;
                          stackOut_24_7 = ba.field_g;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          stackIn_26_3 = stackOut_24_3;
                          stackIn_26_4 = stackOut_24_4;
                          stackIn_26_5 = stackOut_24_5;
                          stackIn_26_6 = stackOut_24_6;
                          stackIn_26_7 = stackOut_24_7;
                          break L9;
                        }
                      }
                      stackIn_26_0[stackIn_26_1] = ((f) (Object) stackIn_26_2).a((f) this, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, (byte) -87);
                      if (var7 != 0) {
                        var6++;
                        continue L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var6 = 1;
                  L10: while (true) {
                    L11: {
                      if (var6 > ((cj) this).field_D) {
                        break L11;
                      } else {
                        L12: {
                          var7 = param2[param0 - var6][param1].b((byte) 112) ? 1 : 0;
                          stackOut_31_0 = param2[-var6 + param0];
                          stackOut_31_1 = param1;
                          stackOut_31_2 = param2[param0 - var6][param1];
                          stackOut_31_3 = this;
                          stackOut_31_4 = -var6 + param0;
                          stackOut_31_5 = param1;
                          stackOut_31_6 = (f[][]) param2;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          stackIn_33_2 = stackOut_31_2;
                          stackIn_33_3 = stackOut_31_3;
                          stackIn_33_4 = stackOut_31_4;
                          stackIn_33_5 = stackOut_31_5;
                          stackIn_33_6 = stackOut_31_6;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          stackIn_32_2 = stackOut_31_2;
                          stackIn_32_3 = stackOut_31_3;
                          stackIn_32_4 = stackOut_31_4;
                          stackIn_32_5 = stackOut_31_5;
                          stackIn_32_6 = stackOut_31_6;
                          if (var6 != ((cj) this).field_D) {
                            stackOut_33_0 = (f[]) (Object) stackIn_33_0;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = (f) (Object) stackIn_33_2;
                            stackOut_33_3 = this;
                            stackOut_33_4 = stackIn_33_4;
                            stackOut_33_5 = stackIn_33_5;
                            stackOut_33_6 = (f[][]) (Object) stackIn_33_6;
                            stackOut_33_7 = jg.field_i;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            stackIn_34_2 = stackOut_33_2;
                            stackIn_34_3 = stackOut_33_3;
                            stackIn_34_4 = stackOut_33_4;
                            stackIn_34_5 = stackOut_33_5;
                            stackIn_34_6 = stackOut_33_6;
                            stackIn_34_7 = stackOut_33_7;
                            break L12;
                          } else {
                            stackOut_32_0 = (f[]) (Object) stackIn_32_0;
                            stackOut_32_1 = stackIn_32_1;
                            stackOut_32_2 = (f) (Object) stackIn_32_2;
                            stackOut_32_3 = this;
                            stackOut_32_4 = stackIn_32_4;
                            stackOut_32_5 = stackIn_32_5;
                            stackOut_32_6 = (f[][]) (Object) stackIn_32_6;
                            stackOut_32_7 = pl.field_B;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_34_1 = stackOut_32_1;
                            stackIn_34_2 = stackOut_32_2;
                            stackIn_34_3 = stackOut_32_3;
                            stackIn_34_4 = stackOut_32_4;
                            stackIn_34_5 = stackOut_32_5;
                            stackIn_34_6 = stackOut_32_6;
                            stackIn_34_7 = stackOut_32_7;
                            break L12;
                          }
                        }
                        stackIn_34_0[stackIn_34_1] = ((f) (Object) stackIn_34_2).a((f) this, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_34_7, (byte) -87);
                        if (var7 != 0) {
                          var6++;
                          continue L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var6 = 1;
                    L13: while (true) {
                      L14: {
                        if (var6 > ((cj) this).field_D) {
                          break L14;
                        } else {
                          L15: {
                            var7 = param2[var6 + param0][param1].b((byte) 58) ? 1 : 0;
                            stackOut_39_0 = param2[var6 + param0];
                            stackOut_39_1 = param1;
                            stackOut_39_2 = param2[var6 + param0][param1];
                            stackOut_39_3 = this;
                            stackOut_39_4 = var6 + param0;
                            stackOut_39_5 = param1;
                            stackOut_39_6 = (f[][]) param2;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            stackIn_41_3 = stackOut_39_3;
                            stackIn_41_4 = stackOut_39_4;
                            stackIn_41_5 = stackOut_39_5;
                            stackIn_41_6 = stackOut_39_6;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            stackIn_40_2 = stackOut_39_2;
                            stackIn_40_3 = stackOut_39_3;
                            stackIn_40_4 = stackOut_39_4;
                            stackIn_40_5 = stackOut_39_5;
                            stackIn_40_6 = stackOut_39_6;
                            if (var6 == ((cj) this).field_D) {
                              stackOut_41_0 = (f[]) (Object) stackIn_41_0;
                              stackOut_41_1 = stackIn_41_1;
                              stackOut_41_2 = (f) (Object) stackIn_41_2;
                              stackOut_41_3 = this;
                              stackOut_41_4 = stackIn_41_4;
                              stackOut_41_5 = stackIn_41_5;
                              stackOut_41_6 = (f[][]) (Object) stackIn_41_6;
                              stackOut_41_7 = cl.field_n;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              stackIn_42_2 = stackOut_41_2;
                              stackIn_42_3 = stackOut_41_3;
                              stackIn_42_4 = stackOut_41_4;
                              stackIn_42_5 = stackOut_41_5;
                              stackIn_42_6 = stackOut_41_6;
                              stackIn_42_7 = stackOut_41_7;
                              break L15;
                            } else {
                              stackOut_40_0 = (f[]) (Object) stackIn_40_0;
                              stackOut_40_1 = stackIn_40_1;
                              stackOut_40_2 = (f) (Object) stackIn_40_2;
                              stackOut_40_3 = this;
                              stackOut_40_4 = stackIn_40_4;
                              stackOut_40_5 = stackIn_40_5;
                              stackOut_40_6 = (f[][]) (Object) stackIn_40_6;
                              stackOut_40_7 = jg.field_i;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_42_1 = stackOut_40_1;
                              stackIn_42_2 = stackOut_40_2;
                              stackIn_42_3 = stackOut_40_3;
                              stackIn_42_4 = stackOut_40_4;
                              stackIn_42_5 = stackOut_40_5;
                              stackIn_42_6 = stackOut_40_6;
                              stackIn_42_7 = stackOut_40_7;
                              break L15;
                            }
                          }
                          stackIn_42_0[stackIn_42_1] = ((f) (Object) stackIn_42_2).a((f) this, stackIn_42_4, stackIn_42_5, stackIn_42_6, stackIn_42_7, (byte) -87);
                          if (var7 != 0) {
                            var6++;
                            continue L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      stackOut_45_0 = (f) var5_ref;
                      stackIn_46_0 = stackOut_45_0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5;
            stackOut_47_1 = new StringBuilder().append("cj.HC(").append(param0).append(44).append(param1).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L16;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L16;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + -1 + 41);
        }
        return stackIn_46_0;
    }

    final static byte[] a(int param0, int param1, md param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 == 2048) {
                break L1;
              } else {
                cj.f((byte) 73);
                break L1;
              }
            }
            var4_int = param2.d((byte) -61, param0);
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (param3.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.d((byte) -58, 3);
                var6 = (byte)param2.d((byte) -104, 8);
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)(param2.d((byte) -69, var5) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) param3;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("cj.GC(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_18_0;
    }

    cj(f param0, int param1, int param2, int param3) {
        super(param0);
        ((cj) this).field_B = false;
        ((cj) this).field_z = 0;
        try {
            ((cj) this).field_F = (3 * param2 - -(5 * param3)) % 64;
            ((cj) this).field_D = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "cj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
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
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 23525) {
              stackOut_3_0 = ng.a(kd.field_i, param1, (f) (Object) new cj((f) (Object) new kp(-1), ((cj) this).field_D, 0, 0), (byte) -83, bd.field_l);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cj.V(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param1) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            ((cj) this).field_B = stackIn_3_1 != 0;
            ((cj) this).a((byte) 95, (f) (Object) param0.field_a);
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cj.PA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        f stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((cj) this).field_B) {
              if (param3 > 120) {
                stackOut_6_0 = this;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (f) (Object) stackIn_5_0;
              }
            } else {
              b.field_a = b.field_a + -3;
              we.field_h = we.field_h + -6;
              je.field_j = je.field_j + -3;
              fp.field_a = fp.field_a + -6;
              stackOut_1_0 = this.g(param0, param1, param2, -1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("cj.OA(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return (f) this;
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 42) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = ((cj) this).a(96, -108, 70, (f[][]) null, -76, (fq) null, -124);
                break L1;
              }
            }
            if (0 != ((cj) this).field_z) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("cj.FB(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((cj) this).field_F = (3 * param2 - -(5 * param3)) % 64;
              if (param0 == -35) {
                break L1;
              } else {
                ((cj) this).field_B = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cj.KC(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              fn.field_j = fn.field_j + ob.field_l;
              wd.field_j = wd.field_j - 1;
              we.field_h = we.field_h + 20;
              fp.field_a = fp.field_a + 20;
              je.field_j = je.field_j + 10;
              b.field_a = b.field_a + 10;
              if (param2 <= 0) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            ((cj) this).field_B = true;
            wd.field_j = wd.field_j + 1;
            mb.field_g = mb.field_g + ob.field_l;
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("cj.KA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static int[] d(int param0, int param1, int param2) {
        int var3 = rl.b(param1, (byte) -23);
        int var4 = tm.a(param1, 500);
        int var5 = rl.b(param2, (byte) -23);
        int var6 = tm.a(param2, 500);
        if (param0 > -64) {
            field_y = null;
        }
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        if (param1 != 0) {
            return;
        }
        try {
            ((cj) this).field_F = (((cj) this).field_F - -1) % 64;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "cj.W(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param1 != ~((cj) this).field_z) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              if (!((cj) this).field_B) {
                stackOut_3_0 = super.a(param0, -1, param2, param3, param4, param5, param6);
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("cj.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param4).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ob.field_l = ob.field_l + 1;
            var6_int = -110 / ((73 - param4) / 42);
            fn.field_j = fn.field_j - wd.field_j;
            ((cj) this).field_B = true;
            ((cj) this).a((byte) 123, param3);
            stackOut_0_0 = this;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("cj.L(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 41);
        }
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
