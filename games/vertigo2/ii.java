/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ji {
    static int field_E;
    private int field_F;
    static boolean field_z;
    static String field_A;
    private int field_B;
    static r field_C;
    private int field_D;
    private int field_y;

    public ii() {
        super(0, true);
        ((ii) this).field_F = 0;
        ((ii) this).field_B = 0;
        ((ii) this).field_D = 20;
        ((ii) this).field_y = 1365;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        var4 = param1;
        if (-1 == (var4 ^ -1)) {
          ((ii) this).field_y = param2.a((byte) -11);
          if (param0 == 110) {
            return;
          } else {
            ((ii) this).field_y = -51;
            return;
          }
        } else {
          if (1 == var4) {
            ((ii) this).field_D = param2.a((byte) -11);
            if (param0 != 110) {
              ((ii) this).field_y = -51;
              return;
            } else {
              return;
            }
          } else {
            if (var4 != 2) {
              if (3 == var4) {
                ((ii) this).field_B = param2.a((byte) -11);
                if (param0 != 110) {
                  ((ii) this).field_y = -51;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 == 110) {
                  return;
                } else {
                  ((ii) this).field_y = -51;
                  return;
                }
              }
            } else {
              ((ii) this).field_F = param2.a((byte) -11);
              if (param0 != 110) {
                ((ii) this).field_y = -51;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
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
        int[] var15 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          var15 = ((ii) this).field_x.a(param0, (byte) 66);
          var3 = var15;
          if (!((ii) this).field_x.field_i) {
            return var15;
          } else {
            var4 = 0;
            L0: while (true) {
              if (we.field_M <= var4) {
                return var15;
              } else {
                var5 = (rh.field_O[var4] << 21853868) / ((ii) this).field_y + ((ii) this).field_F;
                var6 = (lf.field_y[param0] << 677724396) / ((ii) this).field_y + ((ii) this).field_B;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> -1854068212;
                var12 = var6 * var6 >> 69234444;
                var13 = 0;
                L1: while (true) {
                  L2: {
                    if ((var12 + var11 ^ -1) <= -16385) {
                      break L2;
                    } else {
                      if (((ii) this).field_D <= var13) {
                        break L2;
                      } else {
                        var10 = 2 * (var10 * var9 >> -1073982676) - -var8;
                        var9 = var7 + var11 + -var12;
                        var11 = var9 * var9 >> -891831444;
                        var12 = var10 * var10 >> -1438574356;
                        var13++;
                        continue L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_22_0 = (int[]) var15;
                    stackOut_22_1 = var4;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    if (-1 + ((ii) this).field_D > var13) {
                      stackOut_24_0 = (int[]) (Object) stackIn_24_0;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = (var13 << -1872970868) / ((ii) this).field_D;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      break L3;
                    } else {
                      stackOut_23_0 = (int[]) (Object) stackIn_23_0;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = 0;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      break L3;
                    }
                  }
                  stackIn_25_0[stackIn_25_1] = stackIn_25_2;
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          field_C = null;
          var15 = ((ii) this).field_x.a(param0, (byte) 66);
          var3 = var15;
          if (!((ii) this).field_x.field_i) {
            return var15;
          } else {
            var4 = 0;
            L4: while (true) {
              if (we.field_M <= var4) {
                return var15;
              } else {
                var5 = (rh.field_O[var4] << 21853868) / ((ii) this).field_y + ((ii) this).field_F;
                var6 = (lf.field_y[param0] << 677724396) / ((ii) this).field_y + ((ii) this).field_B;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> -1854068212;
                var12 = var6 * var6 >> 69234444;
                var13 = 0;
                L5: while (true) {
                  L6: {
                    if ((var12 + var11 ^ -1) <= -16385) {
                      break L6;
                    } else {
                      if (((ii) this).field_D <= var13) {
                        break L6;
                      } else {
                        var10 = 2 * (var10 * var9 >> -1073982676) - -var8;
                        var9 = var7 + var11 + -var12;
                        var11 = var9 * var9 >> -891831444;
                        var12 = var10 * var10 >> -1438574356;
                        var13++;
                        continue L5;
                      }
                    }
                  }
                  L7: {
                    stackOut_8_0 = (int[]) var15;
                    stackOut_8_1 = var4;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (-1 + ((ii) this).field_D > var13) {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (var13 << -1872970868) / ((ii) this).field_D;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L7;
                    } else {
                      stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L7;
                    }
                  }
                  stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                  var4++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    public static void g(int param0) {
        field_A = null;
        field_C = null;
        if (param0 < 57) {
            ii.g(-31);
        }
    }

    final static void b(byte param0) {
        if (param0 != -90) {
          ii.b((byte) 1);
          qf.field_b = 0;
          gl.field_o = false;
          rl.field_db = -1;
          as.field_a = null;
          hn.field_n = -1;
          return;
        } else {
          qf.field_b = 0;
          gl.field_o = false;
          rl.field_db = -1;
          as.field_a = null;
          hn.field_n = -1;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Set up new game";
        field_E = 99;
        field_z = false;
    }
}
