/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends nv {
    private boolean field_s;
    static String field_q;
    static int[] field_o;
    private int field_t;
    private jma field_n;
    static jea[] field_p;
    static long field_r;

    final static tn a(cn param0, int param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param2 == 15) {
          var4 = param0.f(param1, 105);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new tn(var4);
          }
        } else {
          return null;
        }
    }

    final void k(int param0) {
        this.j((byte) 79);
        ((rb) this).field_n.a((byte) -14, ((rb) this).field_s);
        if (param0 != 5418) {
            ((rb) this).c(false);
        }
    }

    rb(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((rb) this).field_t = param1.b((byte) 44, 4);
        ((rb) this).field_n = new jma(15, param0, param1);
    }

    public static void g(byte param0) {
        if (param0 > -116) {
          rb.g((byte) 32);
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        if (param0) {
          return;
        } else {
          super.a(param0, param1);
          param1.a((byte) -127, ((rb) this).field_t, 4);
          ((rb) this).field_n.a(((rb) this).h((byte) 119), (byte) 88, param1);
          return;
        }
    }

    private final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = ((rb) this).field_t;
        if (var3 != 0) {
          if ((var3 ^ -1) != -2) {
            if (var3 != 2) {
              if (var3 == 3) {
                ((rb) this).field_s = ((rb) this).i(12340).f(8, 10915);
                if (param0 == 79) {
                  return;
                } else {
                  ((rb) this).g(91);
                  return;
                }
              } else {
                if (param0 != 79) {
                  ((rb) this).g(91);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L0: {
                var2 = ((rb) this).b(true).a(((rb) this).field_g.e(9648), ((rb) this).field_g.c(-96), param0 ^ 79, 2, ((rb) this).field_g.a((byte) 55), ((rb) this).field_g.d(param0 + -76), (gma) (Object) ((rb) this).e(6));
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var2 < (((rb) this).field_g.c(param0 ^ -51) >> -82100400) * (((rb) this).field_g.a((byte) 55) >> 775746832)) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L0;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L0;
                }
              }
              ((rb) this).field_s = stackIn_8_1 != 0;
              if (param0 != 79) {
                ((rb) this).g(91);
                return;
              } else {
                return;
              }
            }
          } else {
            ((rb) this).field_s = ((rb) this).field_g.d(50, false);
            if (param0 != 79) {
              ((rb) this).g(91);
              return;
            } else {
              return;
            }
          }
        } else {
          ((rb) this).field_s = ((rb) this).a((byte) 87);
          if (param0 != 79) {
            ((rb) this).g(91);
            return;
          } else {
            return;
          }
        }
    }

    final void c(boolean param0) {
        super.c(param0);
        if (((rb) this).field_t == 0) {
            ((rb) this).field_n.a((byte) -14, true);
        }
    }

    final int a(int param0, int param1) {
        Object var4 = null;
        if (param1 > -48) {
          var4 = null;
          ((rb) this).a(false, (kh) null);
          param0 = upa.a(((rb) this).field_s, param0, (byte) -53);
          return param0;
        } else {
          param0 = upa.a(((rb) this).field_s, param0, (byte) -53);
          return param0;
        }
    }

    final void g(int param0) {
        super.g(param0);
        ((rb) this).field_n.a((byte) 48, ((rb) this).h((byte) 116));
    }

    final int a(boolean param0) {
        if (param0) {
            ((rb) this).field_n = null;
            return 13;
        }
        return 13;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Played";
        field_o = fqa.e(true);
    }
}
