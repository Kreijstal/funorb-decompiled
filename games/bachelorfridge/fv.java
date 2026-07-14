/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends ana {
    static kv field_y;
    private taa field_z;
    static int field_w;
    static int[] field_x;
    private boolean field_v;

    final static void a(int param0, int param1, int param2, eaa param3, int param4, byte param5) {
        rea var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = BachelorFridge.field_y;
        var6 = (rea) (Object) param3.b((byte) 90);
        if (param5 > -104) {
          var9 = null;
          fv.a(6, 16, -46, (eaa) null, -23, (byte) 95);
          L0: while (true) {
            if (var6 != null) {
              L1: {
                var7 = (var6.field_n >> 1599358209) + (630 & (int)var6.field_m * 8357 + 326565 * (int)var6.field_j);
                if (-257 <= (var7 ^ -1)) {
                  break L1;
                } else {
                  var7 = 256;
                  break L1;
                }
              }
              param1 = var6.field_i;
              dg.f((int)var6.field_m + param4, -2 + (param0 + (int)var6.field_l), (128 + -var6.field_n) / 16, param1, 256 - var7 >> 267019074);
              var6 = (rea) (Object) param3.c(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var6 != null) {
              L3: {
                var7 = (var6.field_n >> 1599358209) + (630 & (int)var6.field_m * 8357 + 326565 * (int)var6.field_j);
                if (-257 <= (var7 ^ -1)) {
                  break L3;
                } else {
                  var7 = 256;
                  break L3;
                }
              }
              param1 = var6.field_i;
              dg.f((int)var6.field_m + param4, -2 + (param0 + (int)var6.field_l), (128 + -var6.field_n) / 16, param1, 256 - var7 >> 267019074);
              var6 = (rea) (Object) param3.c(0);
              continue L2;
            } else {
              return;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = BachelorFridge.field_y;
        if (param0) {
          ola.field_p = ki.field_w;
          if (255 != param1) {
            if (param1 <= -101) {
              if (-106 >= param1) {
                sg.field_p = kw.a(false, param3);
                return;
              } else {
                sg.field_p = wu.a(param1, (byte) 97, param2);
                return;
              }
            } else {
              sg.field_p = wu.a(param1, (byte) 97, param2);
              return;
            }
          } else {
            L0: {
              stackOut_14_0 = 120;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (-14 >= (fga.field_f ^ -1)) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L0;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L0;
              }
            }
            sg.field_p = nna.a((byte) stackIn_17_0, stackIn_17_1 != 0);
            return;
          }
        } else {
          field_w = 2;
          ola.field_p = ki.field_w;
          if (255 != param1) {
            if (param1 <= -101) {
              if (-106 >= param1) {
                sg.field_p = kw.a(false, param3);
                return;
              } else {
                sg.field_p = wu.a(param1, (byte) 97, param2);
                return;
              }
            } else {
              sg.field_p = wu.a(param1, (byte) 97, param2);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 120;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (-14 >= (fga.field_f ^ -1)) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            sg.field_p = nna.a((byte) stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = -54 % ((param0 - 71) / 47);
        if (((fv) this).field_m.a((byte) -106)) {
            return false;
        }
        if (((fv) this).field_z.a((byte) -106)) {
            return false;
        }
        if (!((fv) this).field_v) {
            ((fv) this).field_v = true;
            jja.a(192, -1, 42);
            ((fv) this).field_q.field_s.field_d = ((fv) this).field_q.field_s.field_d + 2;
            if (!(((fv) this).field_q.field_s.field_d >= 100)) {
                return false;
            }
            this.d(-103);
            return true;
        }
        ((fv) this).field_q.field_s.field_d = ((fv) this).field_q.field_s.field_d + 2;
        if (!(((fv) this).field_q.field_s.field_d >= 100)) {
            return false;
        }
        this.d(-103);
        return true;
    }

    private final void d(int param0) {
        if (param0 >= -76) {
            return;
        }
        ((fv) this).field_q.field_s.field_d = 100;
    }

    public static void e(byte param0) {
        field_x = null;
        field_y = null;
        if (param0 == -35) {
            return;
        }
        field_x = null;
    }

    fv(gj param0, tl param1) {
        super(param0, (bca) (Object) param1);
        ((fv) this).field_v = false;
        ((fv) this).field_z = new taa(((fv) this).field_q, (((fv) this).field_q.field_h.field_z >> 1062201025) - 1, -3);
        ((fv) this).a(27799, (at) (Object) ((fv) this).field_z);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
    }
}
