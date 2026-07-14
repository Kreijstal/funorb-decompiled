/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    boolean field_h;
    ed field_e;
    static int field_g;
    boolean field_f;
    int field_b;
    private int field_c;
    static om field_d;
    static hh field_a;

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 4) {
            ll discarded$0 = ci.a(-111, 38, 24, -46);
        }
    }

    final static oc a(byte param0, hh param1, int param2, ed param3, boolean param4, int param5) {
        oc var6 = null;
        oc stackIn_2_0 = null;
        oc stackIn_3_0 = null;
        oc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        oc stackIn_6_0 = null;
        oc stackIn_7_0 = null;
        oc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        oc stackOut_5_0 = null;
        oc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        oc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        oc stackOut_1_0 = null;
        oc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        oc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = new oc(param3, param5, param2, param1);
        if (param0 != -43) {
          L0: {
            ci.b(68);
            stackOut_5_0 = (oc) var6;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param4) {
              stackOut_7_0 = (oc) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (oc) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_q = stackIn_8_1 != 0;
          return var6;
        } else {
          L1: {
            stackOut_1_0 = (oc) var6;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param4) {
              stackOut_3_0 = (oc) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (oc) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          return var6;
        }
    }

    final static void a(int param0) {
        if (ce.field_f.b(param0 + 117)) {
          nf.a(-106, true);
          if (param0 != 0) {
            field_d = null;
            return;
          } else {
            return;
          }
        } else {
          if (null != de.field_i) {
            kh.a(lh.b((byte) 116), param0 + -1230, true);
            if (param0 == 0) {
              return;
            } else {
              field_d = null;
              return;
            }
          } else {
            if (param0 == 0) {
              return;
            } else {
              field_d = null;
              return;
            }
          }
        }
    }

    final static ll a(int param0, int param1, int param2, int param3) {
        ll var4 = null;
        var4 = new ll();
        var4.field_i = param1;
        var4.field_g = param0;
        jl.field_n.a(-12328, (hg) (Object) var4);
        if (param2 != -1) {
          field_g = 109;
          ma.a(-100, param3, var4);
          return var4;
        } else {
          ma.a(-100, param3, var4);
          return var4;
        }
    }

    final boolean a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 <= -56) {
          if (!bj.e((byte) -52)) {
            if (!((ci) this).field_h) {
              L0: {
                var3 = 1 << param0;
                if (0 == (((ci) this).field_c & var3)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              var4 = stackIn_12_0;
              return var4 != 0;
            } else {
              return false;
            }
          } else {
            L1: {
              var3 = 1 << param0;
              if (0 == (((ci) this).field_c & var3)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var4 = stackIn_6_0;
            return var4 != 0;
          }
        } else {
          return false;
        }
    }

    ci(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        ((ci) this).field_e = jb.field_w;
        ((ci) this).field_h = param1 ? true : false;
        ((ci) this).field_b = param0;
        ((ci) this).field_f = param2 ? true : false;
        ((ci) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_d = new om(6, 0, 4, 2);
    }
}
