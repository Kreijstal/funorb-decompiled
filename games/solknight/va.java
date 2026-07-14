/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class va {
    static nc field_f;
    static o field_g;
    hl field_m;
    hl field_i;
    hl field_d;
    hl field_k;
    long field_b;
    int field_j;
    gb field_e;
    byte field_n;
    volatile int field_c;
    gb field_h;
    volatile int field_l;
    ic field_a;

    abstract void c(byte param0);

    abstract void a(boolean param0, byte param1, Object param2);

    abstract void a(byte param0);

    final int c(int param0) {
        int var2 = -5 % ((param0 - -88) / 37);
        return ((va) this).field_d.a(-29749) + ((va) this).field_k.a(-29749);
    }

    final static String a(boolean param0) {
        if (param0) {
          if (!ab.field_u) {
            if (kk.field_d >= kg.field_e) {
              if (kk.field_d >= kg.field_e - -wi.field_l) {
                return null;
              } else {
                return s.field_ib;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_g = null;
          if (!ab.field_u) {
            if (kk.field_d >= kg.field_e) {
              if (kk.field_d >= kg.field_e - -wi.field_l) {
                return null;
              } else {
                return s.field_ib;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    abstract boolean d(byte param0);

    final ic a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = 0L;
        ic var8 = null;
        ic stackIn_1_0 = null;
        ic stackIn_2_0 = null;
        ic stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ic stackOut_0_0 = null;
        ic stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ic stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param2 + ((long)param0 << 437409504);
          var8 = new ic();
          var8.field_l = var6;
          stackOut_0_0 = (ic) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (ic) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ic) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_r = stackIn_3_1 != 0;
        var8.field_y = param4;
        if (param3 == 437409504) {
          if (!param1) {
            if (((va) this).c(125) >= 20) {
              throw new RuntimeException();
            } else {
              ((va) this).field_d.a((ec) (Object) var8, param3 + -437409504);
              return var8;
            }
          } else {
            if (-21 < (((va) this).b(false) ^ -1)) {
              ((va) this).field_m.a((ec) (Object) var8, 0);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          boolean discarded$1 = ((va) this).d((byte) -77);
          if (!param1) {
            if (((va) this).c(125) >= 20) {
              throw new RuntimeException();
            } else {
              ((va) this).field_d.a((ec) (Object) var8, param3 + -437409504);
              return var8;
            }
          } else {
            if (-21 < (((va) this).b(false) ^ -1)) {
              ((va) this).field_m.a((ec) (Object) var8, 0);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 != 0) {
            field_g = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final boolean a(int param0) {
        if (param0 != -5868) {
            return true;
        }
        return (((va) this).c(-49) ^ -1) <= -21 ? true : false;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            ((va) this).field_m = null;
            if (20 > ((va) this).b(false)) {
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
            if (20 > ((va) this).b(false)) {
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

    final int b(boolean param0) {
        if (param0) {
          ((va) this).a((byte) -33);
          return ((va) this).field_m.a(-29749) - -((va) this).field_i.a(-29749);
        } else {
          return ((va) this).field_m.a(-29749) - -((va) this).field_i.a(-29749);
        }
    }

    va() {
        ((va) this).field_m = new hl();
        ((va) this).field_i = new hl();
        ((va) this).field_d = new hl();
        ((va) this).field_k = new hl();
        ((va) this).field_e = new gb(6);
        ((va) this).field_n = (byte) 0;
        ((va) this).field_l = 0;
        ((va) this).field_c = 0;
        ((va) this).field_h = new gb(10);
    }

    static {
    }
}
