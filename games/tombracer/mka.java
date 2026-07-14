/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mka {
    private int field_c;
    private int field_d;
    private csa field_e;
    private csa field_g;
    static jea field_b;
    private ir field_a;
    private ir field_h;
    private int field_f;

    final void a(int param0, byte param1, la param2, int param3) {
        ((mka) this).field_a.field_f = -((mka) this).field_a.field_f;
        ((mka) this).a(param0, param3, (byte) -100);
        ((mka) this).field_f = dfa.a(-((mka) this).field_f, 8192, 111);
        if (param1 != -61) {
          return;
        } else {
          L0: {
            if (((mka) this).field_e != null) {
              ((mka) this).field_e.a(param2, 1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(csa param0, int param1) {
        ((mka) this).field_e = param0;
        param0.a(((mka) this).field_g, ((mka) this).field_d, (byte) -52);
        param0.a(1434528720, ((mka) this).field_a.field_d, ((mka) this).field_a.field_f);
        int var3 = -62 / ((param1 - 30) / 49);
    }

    final ir c(byte param0) {
        if (param0 < 103) {
            ((mka) this).field_h = null;
            return ((mka) this).field_a;
        }
        return ((mka) this).field_a;
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 8192) {
          L0: {
            mka.a((byte) -112);
            if (uu.field_a.field_Ab != rb.field_r) {
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
            if (uu.field_a.field_Ab != rb.field_r) {
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

    final static void a(int param0, int param1) {
        if ((param1 ^ -1) != (msa.field_a ^ -1)) {
            return;
        }
        if (null == rba.field_a) {
            return;
        }
        v.b(param0, 0);
    }

    final void a(int param0, int param1, csa param2) {
        ((mka) this).field_g = param2;
        int var4 = 19 / ((param0 - 76) / 46);
        ((mka) this).field_d = param1;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 36 / ((-63 - param0) / 42);
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((mka) this).a(false);
            return ((mka) this).field_f;
        }
        return ((mka) this).field_f;
    }

    final int b(byte param0) {
        if (param0 != -125) {
            ((mka) this).field_h = null;
            return ((mka) this).field_c;
        }
        return ((mka) this).field_c;
    }

    final csa a(int param0) {
        int var2 = 89 % ((28 - param0) / 54);
        return ((mka) this).field_e;
    }

    mka(int param0, int param1, int param2, int param3, int param4) {
        ((mka) this).field_a = new ir(param0, param1);
        ((mka) this).field_c = param4;
        ((mka) this).field_f = param3;
        ((mka) this).field_h = new ir();
        ((mka) this).field_e = null;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = -53 % ((9 - param2) / 58);
        ((mka) this).field_h.field_f = ((mka) this).field_a.field_f * param1 - param0 * ((mka) this).field_a.field_d;
        ((mka) this).field_h.field_d = param0 * ((mka) this).field_a.field_f - -(param1 * ((mka) this).field_a.field_d);
    }

    final static boolean a(dh param0, int param1, dh param2) {
        if (param0.field_a < param2.field_a) {
          return true;
        } else {
          if (param1 == 13) {
            if (param0.field_a == param2.field_a) {
              if (param2.field_c <= param0.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            field_b = null;
            if (param0.field_a == param2.field_a) {
              if (param2.field_c <= param0.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
    }
}
