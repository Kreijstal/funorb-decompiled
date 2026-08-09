/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends to {
    int field_u;
    static vs field_v;
    static String field_x;
    static int field_w;

    public static void k(int param0) {
        if (param0 > -40) {
            return;
        }
        field_v = null;
        field_x = null;
    }

    hi(ea param0) {
        super(param0.field_p, param0.field_h, param0.field_q, param0.field_n, (ir) null, (no) null);
        try {
            param0.a(this.field_n, 0, 0, this.field_q, (byte) 126);
            this.field_u = 256;
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public hi() {
        super(0, 0, 0, 0, (ir) null, (no) null);
        this.field_u = 256;
    }

    final static boolean c(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        boolean stackIn_27_0 = false;
        boolean stackIn_28_0 = false;
        int stackIn_28_1 = 0;
        if (param0 == 14834) {
          if (si.a(param2, 2, param1)) {
            L0: {
              stackIn_20_0 = qr.a(param1, param0 + -22084, param2);

              if ((param1 & 36864) == 0) {
                stackIn_21_0 = stackIn_20_0;
                stackIn_21_1 = 0;
                break L0;
              } else {
                stackIn_21_0 = stackIn_20_0;
                stackIn_21_1 = 1;
                break L0;
              }
            }
            if (stackIn_21_0 | stackIn_21_1 != 0 | hh.a(0, param1, param2)) {
              return true;
            } else {
              L1: {
                if (0 == (param1 & 8192)) {
                  stackIn_25_0 = 0;
                  break L1;
                } else {
                  stackIn_25_0 = 1;
                  break L1;
                }
              }
              L2: {
                stackIn_27_0 = stackIn_25_0 != 0 | gl.a(param1, 544, param2) | gh.a(param2, false, param1);

                if (-1 != (55 & param2 ^ -1)) {
                  stackIn_28_0 = stackIn_27_0;
                  stackIn_28_1 = 0;
                  break L2;
                } else {
                  stackIn_28_0 = stackIn_27_0;
                  stackIn_28_1 = 1;
                  break L2;
                }
              }
              return stackIn_28_0 & stackIn_28_1 != 0;
            }
          } else {
            return false;
          }
        } else {
          hi.k(13);
          if (si.a(param2, 2, param1)) {
            L3: {
              stackIn_5_0 = qr.a(param1, param0 + -22084, param2);

              if ((param1 & 36864) == 0) {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = 0;
                break L3;
              } else {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = 1;
                break L3;
              }
            }
            if (stackIn_6_0 | stackIn_6_1 != 0 | hh.a(0, param1, param2)) {
              return true;
            } else {
              L4: {
                if (0 == (param1 & 8192)) {
                  stackIn_10_0 = 0;
                  break L4;
                } else {
                  stackIn_10_0 = 1;
                  break L4;
                }
              }
              L5: {
                stackIn_12_0 = stackIn_10_0 != 0 | gl.a(param1, 544, param2) | gh.a(param2, false, param1);

                if (-1 != (55 & param2 ^ -1)) {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 0;
                  break L5;
                } else {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 1;
                  break L5;
                }
              }
              return stackIn_13_0 & stackIn_13_1 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ll var6;
        if (-1 != (param1 ^ -1)) {
          return;
        } else {
          if (this.field_s != null) {
            if (0 != this.field_u) {
              if ((this.field_u ^ -1) != -257) {
                var6 = new ll(this.field_s.field_q, this.field_s.field_n);
                cm.a(var6, -14492);
                this.field_s.a((byte) 90, param1, 0, 0);
                sl.c(2765);
                var6.a(param3 - -this.field_p, param2 - -this.field_h, this.field_u);
                if (param0 < 64) {
                  field_v = (vs) null;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_s.a((byte) 69, param1, this.field_h + param2, this.field_p + param3);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void j(int param0) {
        if (!gi.a(true)) {
          return;
        } else {
          if (param0 != 8585) {
            hi.k(37);
            nk.a((byte) -119, 4, false);
            return;
          } else {
            nk.a((byte) -119, 4, false);
            return;
          }
        }
    }

    static {
        field_w = -1;
    }
}
