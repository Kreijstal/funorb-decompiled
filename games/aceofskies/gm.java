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

    public static void a() {
        field_v = null;
        field_x = null;
        field_y = null;
        field_w = null;
    }

    final void a(int param0, byte param1, int param2) {
        ((gm) this).a(param2, fj.field_c + -param0 >> 1, nc.field_d + -param2 >> 1, param0, (byte) 124);
        if (param1 != 29) {
            ((gm) this).a(true, 82, -19);
        }
    }

    abstract void a(boolean param0, int param1, int param2);

    private final int d() {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!((gm) this).field_z) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (this != (Object) (Object) ((gm) this).field_u.d((byte) -112)) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 256;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    boolean i(int param0) {
        int var2 = 0;
        int discarded$2 = 76;
        ((gm) this).field_t = this.d();
        var2 = 105 / ((20 - param0) / 62);
        if (((gm) this).field_t == 0) {
          if (((gm) this).field_z) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((gm) this).field_t != 0) {
          if (((gm) this).field_t < 256) {
            if (null == na.field_b) {
              na.field_b = new ll(((gm) this).field_q, ((gm) this).field_n);
              int discarded$8 = -14492;
              cm.a(na.field_b);
              vp.a();
              ((gm) this).a(false, 0, 0);
              super.a((byte) 87, param1, -((gm) this).field_h + -param2, -((gm) this).field_p + -param3);
              int discarded$9 = 2765;
              sl.c();
              na.field_b.a(param3 + ((gm) this).field_p, param2 + ((gm) this).field_h, ((gm) this).field_t);
              if (param0 > 64) {
                return;
              } else {
                ((gm) this).a(true, -76, 79);
                return;
              }
            } else {
              if (na.field_b.field_r < ((gm) this).field_q) {
                na.field_b = new ll(((gm) this).field_q, ((gm) this).field_n);
                int discarded$10 = -14492;
                cm.a(na.field_b);
                vp.a();
                ((gm) this).a(false, 0, 0);
                super.a((byte) 87, param1, -((gm) this).field_h + -param2, -((gm) this).field_p + -param3);
                int discarded$11 = 2765;
                sl.c();
                na.field_b.a(param3 + ((gm) this).field_p, param2 + ((gm) this).field_h, ((gm) this).field_t);
                if (param0 <= 64) {
                  ((gm) this).a(true, -76, 79);
                  return;
                } else {
                  return;
                }
              } else {
                if (na.field_b.field_n < ((gm) this).field_n) {
                  na.field_b = new ll(((gm) this).field_q, ((gm) this).field_n);
                  int discarded$12 = -14492;
                  cm.a(na.field_b);
                  vp.a();
                  ((gm) this).a(false, 0, 0);
                  super.a((byte) 87, param1, -((gm) this).field_h + -param2, -((gm) this).field_p + -param3);
                  int discarded$13 = 2765;
                  sl.c();
                  na.field_b.a(param3 + ((gm) this).field_p, param2 + ((gm) this).field_h, ((gm) this).field_t);
                  if (param0 <= 64) {
                    ((gm) this).a(true, -76, 79);
                    return;
                  } else {
                    return;
                  }
                } else {
                  int discarded$14 = -14492;
                  cm.a(na.field_b);
                  vp.a();
                  ((gm) this).a(false, 0, 0);
                  super.a((byte) 87, param1, -((gm) this).field_h + -param2, -((gm) this).field_p + -param3);
                  int discarded$15 = 2765;
                  sl.c();
                  na.field_b.a(param3 + ((gm) this).field_p, param2 + ((gm) this).field_h, ((gm) this).field_t);
                  if (param0 > 64) {
                    return;
                  } else {
                    ((gm) this).a(true, -76, 79);
                    return;
                  }
                }
              }
            }
          } else {
            if (param1 != 0) {
              return;
            } else {
              ((gm) this).a(false, ((gm) this).field_p + param3, param2 - -((gm) this).field_h);
              super.a((byte) 94, param1, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    gm(lt param0, int param1, int param2) {
        super(fj.field_c - param1 >> 1, nc.field_d + -param2 >> 1, param1, param2, (ir) null);
        try {
            ((gm) this).field_t = 0;
            ((gm) this).field_u = param0;
            ((gm) this).field_z = false;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static long g() {
        return -ff.field_b + kh.a(-92);
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          int discarded$2 = 76;
          var2 = this.d();
          var3 = -((gm) this).field_t + var2;
          if (var3 > 0) {
            ((gm) this).field_t = ((gm) this).field_t + (-1 + (var3 - -8)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 11) {
          if (var3 >= 0) {
            if (0 == ((gm) this).field_t) {
              if (var2 != 0) {
                return false;
              } else {
                L1: {
                  if (((gm) this).field_z) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L1;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L1;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            ((gm) this).field_t = ((gm) this).field_t + (1 + var3 + -16) / 16;
            if (0 == ((gm) this).field_t) {
              if (var2 != 0) {
                return false;
              } else {
                L2: {
                  if (((gm) this).field_z) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                return stackIn_12_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final ea a(int param0) {
        ea var2 = super.a(param0 + param0);
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
