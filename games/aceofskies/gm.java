/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gm extends ab {
    private lt field_u;
    private int field_t;
    boolean field_z;
    static gb field_y;
    static ej field_v;
    static String field_w;
    static id field_x;

    public static void a(byte param0) {
        field_v = null;
        field_x = null;
        field_y = null;
        field_w = null;
        if (param0 != -76) {
            field_y = (gb) null;
        }
    }

    final void a(int param0, byte param1, int param2) {
        ((gm) this).a(param2, fj.field_c + -param0 >> 1883678817, nc.field_d + -param2 >> 290806273, param0, (byte) 124);
        if (param1 != 29) {
            ((gm) this).a(true, 82, -19);
        }
    }

    abstract void a(boolean param0, int param1, int param2);

    private final int d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 == 76) {
            break L0;
          } else {
            field_y = (gb) null;
            break L0;
          }
        }
        L1: {
          if (!((gm) this).field_z) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            if (this != (Object) (Object) ((gm) this).field_u.d((byte) -112)) {
              stackOut_5_0 = 0;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 256;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
          }
        }
        return stackIn_7_0;
    }

    boolean i(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            ((gm) this).field_t = this.d((byte) 76);
            var2 = 105 / ((20 - param0) / 62);
            if (-1 != (((gm) this).field_t ^ -1)) {
              break L1;
            } else {
              if (((gm) this).field_z) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((gm) this).field_t == 0) {
            return;
        }
        if ((((gm) this).field_t ^ -1) <= -257) {
            if (param1 != 0) {
                return;
            }
            ((gm) this).a(false, ((gm) this).field_p + param3, param2 - -((gm) this).field_h);
            this.a((byte) 94, param1, param2, param3);
            return;
        }
        if (null != na.field_b) {
            // if_icmplt L91
            // if_icmplt L91
        } else {
            na.field_b = new ll(((gm) this).field_q, ((gm) this).field_n);
        }
        cm.a(na.field_b, -14492);
        vp.a();
        ((gm) this).a(false, 0, 0);
        this.a((byte) 87, param1, -((gm) this).field_h + -param2, -((gm) this).field_p + -param3);
        sl.c(2765);
        na.field_b.a(param3 + ((gm) this).field_p, param2 + ((gm) this).field_h, ((gm) this).field_t);
        if (param0 <= 64) {
            ((gm) this).a(true, -76, 79);
        }
    }

    gm(lt param0, int param1, int param2) {
        super(fj.field_c - param1 >> -871152511, nc.field_d + -param2 >> -833903007, param1, param2, (ir) null);
        ((gm) this).field_t = 0;
        ((gm) this).field_u = param0;
        ((gm) this).field_z = false;
    }

    final static long g(int param0) {
        if (param0 != -1) {
            gm.a((byte) -17);
        }
        return -ff.field_b + kh.a(param0 + -91);
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var2 = this.d((byte) 76);
          var3 = -((gm) this).field_t + var2;
          if (-1 > (var3 ^ -1)) {
            ((gm) this).field_t = ((gm) this).field_t + (-1 + (var3 - -8)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 11) {
          L1: {
            if (var3 >= 0) {
              break L1;
            } else {
              ((gm) this).field_t = ((gm) this).field_t + (1 + var3 + -16) / 16;
              break L1;
            }
          }
          L2: {
            L3: {
              if (0 != ((gm) this).field_t) {
                break L3;
              } else {
                if (-1 != (var2 ^ -1)) {
                  break L3;
                } else {
                  if (((gm) this).field_z) {
                    break L3;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          return stackIn_12_0 != 0;
        } else {
          return false;
        }
    }

    final ea a(int param0) {
        ea var2 = this.a(param0 + param0);
        if (var2 != null) {
            return var2;
        }
        return (ea) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new gb(1.6, 5, 10, 100, 5, 5.0, 7.0, 32, 1);
        field_v = new ej(0, 2, 2, 1);
    }
}
