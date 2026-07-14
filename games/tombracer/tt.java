/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends vg implements bo {
    private int[][] field_f;
    static String field_g;
    private boolean[] field_h;

    public final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        boolean[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        param0.h((byte) 125);
        var3 = 0;
        L0: while (true) {
          if (((tt) this).field_f.length <= var3) {
            L1: {
              if (param1 == -19) {
                break L1;
              } else {
                ((tt) this).field_h = null;
                break L1;
              }
            }
            param0.i((byte) 98);
            return;
          } else {
            L2: {
              stackOut_2_0 = ((tt) this).field_h;
              stackOut_2_1 = var3;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if ((param0.b((byte) 44, 1) ^ -1) == -2) {
                stackOut_4_0 = (boolean[]) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L2;
              } else {
                stackOut_3_0 = (boolean[]) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L2;
              }
            }
            stackIn_5_0[stackIn_5_1] = stackIn_5_2 != 0;
            if (((tt) this).field_h[var3]) {
              var4 = 0;
              L3: while (true) {
                if (var4 < ((tt) this).field_f[var3].length) {
                  ((tt) this).field_f[var3][var4] = vp.a(param0.b((byte) 44, 7), param1 + -6468);
                  var4++;
                  continue L3;
                } else {
                  var3++;
                  continue L0;
                }
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CActionPacket playerOrders:";
        for (var2 = 0; ((tt) this).field_f.length > var2; var2++) {
            var1 = var1 + " " + ((tt) this).field_h[var2];
        }
        return var1;
    }

    final static roa a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            tt.a(59);
            break L0;
          }
        }
        var2 = param1;
        if (4 == var2) {
          return eo.D((byte) -110);
        } else {
          if (-1 != var2) {
            if (-2 != var2) {
              if (2 == var2) {
                return mr.a((byte) 125);
              } else {
                throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
              }
            } else {
              return ik.b(-17698);
            }
          } else {
            return gda.a(true);
          }
        }
    }

    public final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          param1.i(8);
          var3 = 0;
          if (param0 == 200) {
            break L0;
          } else {
            ((tt) this).field_h = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 >= ((tt) this).field_f.length) {
            param1.k(param0 + -1826190886);
            return;
          } else {
            L2: {
              stackOut_3_0 = (kh) param1;
              stackOut_3_1 = 71;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (!((tt) this).field_h[var3]) {
                stackOut_5_0 = (kh) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                break L2;
              } else {
                stackOut_4_0 = (kh) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                break L2;
              }
            }
            ((kh) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2, 1);
            if (((tt) this).field_h[var3]) {
              var4 = 0;
              L3: while (true) {
                if (var4 < ((tt) this).field_f[var3].length) {
                  param1.a((byte) -23, uja.a(-47, ((tt) this).field_f[var3][var4]), 7);
                  var4++;
                  continue L3;
                } else {
                  var3++;
                  continue L1;
                }
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            Object var2 = null;
            boolean discarded$0 = tt.a((cn) null, (byte) -100);
        }
        field_g = null;
    }

    final static boolean a(cn param0, byte param1) {
        int var2 = 101 / ((param1 - 15) / 60);
        return param0.a(0);
    }

    final boolean a(boolean param0, int param1) {
        if (param0) {
            return true;
        }
        return ((tt) this).field_h[param1];
    }

    tt(int param0) {
        ((tt) this).field_f = new int[param0][8];
        ((tt) this).field_h = new boolean[param0];
    }

    final int a(boolean param0, int param1, int param2) {
        if (param0) {
            Object var5 = null;
            boolean discarded$0 = tt.a((cn) null, (byte) 42);
        }
        return ((tt) this).field_f[param1][param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Return to Main Menu";
    }
}
