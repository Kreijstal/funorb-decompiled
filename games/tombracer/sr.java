/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr extends b implements tsa {
    private ij field_y;
    private int field_z;
    private String field_C;
    private rj[] field_x;
    private il field_B;
    private int[] field_w;

    final rj a(String param0, byte param1, qc param2) {
        rj var4 = null;
        int var5 = 0;
        var4 = new rj(param0, param2);
        var4.field_r = (isa) (Object) new td();
        var5 = ((sr) this).field_p + -2;
        if (param1 != -102) {
          ((sr) this).field_B = null;
          ((sr) this).a((byte) -31, ((sr) this).field_m, 34 + ((sr) this).field_p, 0, 0);
          var4.a((byte) -31, -14 + ((sr) this).field_m, 30, 7, var5);
          ((sr) this).a((ae) (Object) var4, -1);
          return var4;
        } else {
          ((sr) this).a((byte) -31, ((sr) this).field_m, 34 + ((sr) this).field_p, 0, 0);
          var4.a((byte) -31, -14 + ((sr) this).field_m, 30, 7, var5);
          ((sr) this).a((ae) (Object) var4, -1);
          return var4;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (((sr) this).field_z > var6) {
            if (((sr) this).field_x[var6] != param2) {
              var6++;
              var6++;
              continue L0;
            } else {
              var7 = ((sr) this).field_w[var6];
              if ((var7 ^ -1) == 0) {
                L1: {
                  ((sr) this).field_y.i((byte) -1);
                  if (param4 >= 44) {
                    break L1;
                  } else {
                    ((sr) this).field_C = null;
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  jsa.a(false, ((sr) this).field_w[var6]);
                  if (param4 >= 44) {
                    break L2;
                  } else {
                    ((sr) this).field_C = null;
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            L3: {
              if (param4 >= 44) {
                break L3;
              } else {
                ((sr) this).field_C = null;
                break L3;
              }
            }
            return;
          }
        }
    }

    sr(ij param0, il param1, String param2) {
        super(0, 0, 288, 0, (isa) null);
        ((sr) this).field_z = 0;
        ((sr) this).field_y = param0;
        ((sr) this).field_C = param2;
        ((sr) this).field_B = param1;
        int var4 = null == ((sr) this).field_C ? 0 : ((sr) this).field_B.a(((sr) this).field_C, 260, ((sr) this).field_B.field_w);
        ((sr) this).a((byte) -31, 288, 22 + var4, 0, 0);
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((sr) this).field_z;
        this.b(var4 - -1, (byte) 104);
        int var5 = -11 % ((-15 - param2) / 38);
        ((sr) this).field_x[var4] = ((sr) this).a(param0, (byte) -102, (qc) this);
        ((sr) this).field_w[var4] = param1;
    }

    private final void b(int param0, byte param1) {
        rj[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        rj[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (((sr) this).field_z < param0) {
          var7 = new rj[param0];
          var3 = var7;
          var4 = new int[param0];
          var5 = 0;
          L0: while (true) {
            if (((sr) this).field_z <= var5) {
              ((sr) this).field_x = var3;
              ((sr) this).field_z = param0;
              if (param1 < 86) {
                return;
              } else {
                ((sr) this).field_w = var4;
                return;
              }
            } else {
              var7[var5] = ((sr) this).field_x[var5];
              var4[var5] = ((sr) this).field_w[var5];
              var5++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 115) {
          L0: {
            boolean discarded$9 = sr.a(-111);
            if (ub.field_c == ub.field_h) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ub.field_c == ub.field_h) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((sr) this).field_B.a(((sr) this).field_C, 14 + (param0 - -((sr) this).field_i), 10 + ((sr) this).field_n + param1, -28 + ((sr) this).field_m, ((sr) this).field_p, 16777215, -1, 0, 0, ((sr) this).field_B.field_w);
    }

    static {
    }
}
