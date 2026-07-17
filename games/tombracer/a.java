/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements e {
    private i field_a;
    private i field_j;
    private i field_f;
    private i field_d;
    private i field_b;
    private i field_g;
    private i field_l;
    Runnable field_h;
    private oa field_e;
    long field_nativeid;
    private i field_k;
    private i field_i;
    private i field_c;

    public final void w(boolean param0) {
        this.E(((a) this).field_nativeid, param0);
    }

    protected final void finalize() {
        if (((a) this).field_nativeid != 0L) {
            ho.a(-1, (e) this);
        }
    }

    private final void b() {
        this.M(((a) this).field_nativeid);
    }

    final void a() {
        ((a) this).field_h = (Runnable) (Object) Thread.currentThread();
        this.b();
    }

    private final native void M(long param0);

    private final native void E(long param0, boolean param1);

    final void a(ka param0, gda param1, int[] param2, int param3, int param4) {
        this.f(((a) this).field_nativeid, ((i) (Object) param0).field_nativeid, ((ja) (Object) param1).field_nativeid, param2, param3, param4);
    }

    private final native void UA(long param0, long param1, long param2, int[] param3, int param4);

    final ka a(i param0, byte param1, int param2, boolean param3) {
        i var5 = null;
        i var6 = null;
        i stackIn_2_0 = null;
        i stackIn_2_1 = null;
        i stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        i stackIn_3_0 = null;
        i stackIn_3_1 = null;
        i stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        i stackIn_4_0 = null;
        i stackIn_4_1 = null;
        i stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        i stackIn_7_0 = null;
        i stackIn_7_1 = null;
        i stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        i stackIn_8_0 = null;
        i stackIn_8_1 = null;
        i stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        i stackIn_9_0 = null;
        i stackIn_9_1 = null;
        i stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        i stackIn_12_0 = null;
        i stackIn_12_1 = null;
        i stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        i stackIn_13_0 = null;
        i stackIn_13_1 = null;
        i stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        i stackIn_14_0 = null;
        i stackIn_14_1 = null;
        i stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        i stackIn_17_0 = null;
        i stackIn_17_1 = null;
        i stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        i stackIn_18_0 = null;
        i stackIn_18_1 = null;
        i stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        i stackIn_19_0 = null;
        i stackIn_19_1 = null;
        i stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        i stackIn_22_0 = null;
        i stackIn_22_1 = null;
        i stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        i stackIn_23_0 = null;
        i stackIn_23_1 = null;
        i stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        i stackIn_24_0 = null;
        i stackIn_24_1 = null;
        i stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        i stackIn_26_0 = null;
        i stackIn_26_1 = null;
        i stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        i stackIn_27_0 = null;
        i stackIn_27_1 = null;
        i stackIn_27_2 = null;
        int stackIn_27_3 = 0;
        i stackIn_28_0 = null;
        i stackIn_28_1 = null;
        i stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        i stackOut_25_0 = null;
        i stackOut_25_1 = null;
        i stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        i stackOut_27_0 = null;
        i stackOut_27_1 = null;
        i stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        i stackOut_26_0 = null;
        i stackOut_26_1 = null;
        i stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        i stackOut_21_0 = null;
        i stackOut_21_1 = null;
        i stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        i stackOut_23_0 = null;
        i stackOut_23_1 = null;
        i stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        i stackOut_22_0 = null;
        i stackOut_22_1 = null;
        i stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        i stackOut_16_0 = null;
        i stackOut_16_1 = null;
        i stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        i stackOut_18_0 = null;
        i stackOut_18_1 = null;
        i stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        i stackOut_17_0 = null;
        i stackOut_17_1 = null;
        i stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        i stackOut_11_0 = null;
        i stackOut_11_1 = null;
        i stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        i stackOut_13_0 = null;
        i stackOut_13_1 = null;
        i stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        i stackOut_12_0 = null;
        i stackOut_12_1 = null;
        i stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        i stackOut_6_0 = null;
        i stackOut_6_1 = null;
        i stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        i stackOut_8_0 = null;
        i stackOut_8_1 = null;
        i stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        i stackOut_7_0 = null;
        i stackOut_7_1 = null;
        i stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        i stackOut_1_0 = null;
        i stackOut_1_1 = null;
        i stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        i stackOut_3_0 = null;
        i stackOut_3_1 = null;
        i stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        i stackOut_2_0 = null;
        i stackOut_2_1 = null;
        i stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        if (param1 != 1) {
          if (param1 != 2) {
            if (param1 != 3) {
              if (param1 != 4) {
                if (param1 == 5) {
                  L0: {
                    var6 = ((a) this).field_d;
                    var5 = ((a) this).field_l;
                    stackOut_25_0 = (i) param0;
                    stackOut_25_1 = (i) var5;
                    stackOut_25_2 = (i) var6;
                    stackOut_25_3 = param2;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    if (param1 == 0) {
                      stackOut_27_0 = (i) (Object) stackIn_27_0;
                      stackOut_27_1 = (i) (Object) stackIn_27_1;
                      stackOut_27_2 = (i) (Object) stackIn_27_2;
                      stackOut_27_3 = stackIn_27_3;
                      stackOut_27_4 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      stackIn_28_4 = stackOut_27_4;
                      break L0;
                    } else {
                      stackOut_26_0 = (i) (Object) stackIn_26_0;
                      stackOut_26_1 = (i) (Object) stackIn_26_1;
                      stackOut_26_2 = (i) (Object) stackIn_26_2;
                      stackOut_26_3 = stackIn_26_3;
                      stackOut_26_4 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      stackIn_28_3 = stackOut_26_3;
                      stackIn_28_4 = stackOut_26_4;
                      break L0;
                    }
                  }
                  ((i) (Object) stackIn_28_0).ZA(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4 != 0, param3);
                  var5.field_e = param0.field_e;
                  var5.field_d = param0.field_d;
                  return (ka) (Object) var5;
                } else {
                  L1: {
                    i dupTemp$1 = new i(((a) this).field_e);
                    var6 = dupTemp$1;
                    var5 = dupTemp$1;
                    stackOut_21_0 = (i) param0;
                    stackOut_21_1 = (i) var5;
                    stackOut_21_2 = (i) var6;
                    stackOut_21_3 = param2;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    if (param1 == 0) {
                      stackOut_23_0 = (i) (Object) stackIn_23_0;
                      stackOut_23_1 = (i) (Object) stackIn_23_1;
                      stackOut_23_2 = (i) (Object) stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3;
                      stackOut_23_4 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      stackIn_24_3 = stackOut_23_3;
                      stackIn_24_4 = stackOut_23_4;
                      break L1;
                    } else {
                      stackOut_22_0 = (i) (Object) stackIn_22_0;
                      stackOut_22_1 = (i) (Object) stackIn_22_1;
                      stackOut_22_2 = (i) (Object) stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3;
                      stackOut_22_4 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_24_3 = stackOut_22_3;
                      stackIn_24_4 = stackOut_22_4;
                      break L1;
                    }
                  }
                  ((i) (Object) stackIn_24_0).ZA(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4 != 0, param3);
                  var5.field_e = param0.field_e;
                  var5.field_d = param0.field_d;
                  return (ka) (Object) var5;
                }
              } else {
                L2: {
                  var6 = ((a) this).field_j;
                  var5 = ((a) this).field_b;
                  stackOut_16_0 = (i) param0;
                  stackOut_16_1 = (i) var5;
                  stackOut_16_2 = (i) var6;
                  stackOut_16_3 = param2;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  if (param1 == 0) {
                    stackOut_18_0 = (i) (Object) stackIn_18_0;
                    stackOut_18_1 = (i) (Object) stackIn_18_1;
                    stackOut_18_2 = (i) (Object) stackIn_18_2;
                    stackOut_18_3 = stackIn_18_3;
                    stackOut_18_4 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    stackIn_19_4 = stackOut_18_4;
                    break L2;
                  } else {
                    stackOut_17_0 = (i) (Object) stackIn_17_0;
                    stackOut_17_1 = (i) (Object) stackIn_17_1;
                    stackOut_17_2 = (i) (Object) stackIn_17_2;
                    stackOut_17_3 = stackIn_17_3;
                    stackOut_17_4 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    stackIn_19_4 = stackOut_17_4;
                    break L2;
                  }
                }
                ((i) (Object) stackIn_19_0).ZA(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4 != 0, param3);
                var5.field_e = param0.field_e;
                var5.field_d = param0.field_d;
                return (ka) (Object) var5;
              }
            } else {
              L3: {
                var6 = ((a) this).field_g;
                var5 = ((a) this).field_a;
                stackOut_11_0 = (i) param0;
                stackOut_11_1 = (i) var5;
                stackOut_11_2 = (i) var6;
                stackOut_11_3 = param2;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                if (param1 == 0) {
                  stackOut_13_0 = (i) (Object) stackIn_13_0;
                  stackOut_13_1 = (i) (Object) stackIn_13_1;
                  stackOut_13_2 = (i) (Object) stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  stackIn_14_4 = stackOut_13_4;
                  break L3;
                } else {
                  stackOut_12_0 = (i) (Object) stackIn_12_0;
                  stackOut_12_1 = (i) (Object) stackIn_12_1;
                  stackOut_12_2 = (i) (Object) stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  break L3;
                }
              }
              ((i) (Object) stackIn_14_0).ZA(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4 != 0, param3);
              var5.field_e = param0.field_e;
              var5.field_d = param0.field_d;
              return (ka) (Object) var5;
            }
          } else {
            L4: {
              var6 = ((a) this).field_f;
              var5 = ((a) this).field_i;
              stackOut_6_0 = (i) param0;
              stackOut_6_1 = (i) var5;
              stackOut_6_2 = (i) var6;
              stackOut_6_3 = param2;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              if (param1 == 0) {
                stackOut_8_0 = (i) (Object) stackIn_8_0;
                stackOut_8_1 = (i) (Object) stackIn_8_1;
                stackOut_8_2 = (i) (Object) stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L4;
              } else {
                stackOut_7_0 = (i) (Object) stackIn_7_0;
                stackOut_7_1 = (i) (Object) stackIn_7_1;
                stackOut_7_2 = (i) (Object) stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L4;
              }
            }
            ((i) (Object) stackIn_9_0).ZA(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4 != 0, param3);
            var5.field_e = param0.field_e;
            var5.field_d = param0.field_d;
            return (ka) (Object) var5;
          }
        } else {
          L5: {
            var6 = ((a) this).field_k;
            var5 = ((a) this).field_c;
            stackOut_1_0 = (i) param0;
            stackOut_1_1 = (i) var5;
            stackOut_1_2 = (i) var6;
            stackOut_1_3 = param2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            stackIn_2_3 = stackOut_1_3;
            if (param1 == 0) {
              stackOut_3_0 = (i) (Object) stackIn_3_0;
              stackOut_3_1 = (i) (Object) stackIn_3_1;
              stackOut_3_2 = (i) (Object) stackIn_3_2;
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              stackIn_4_4 = stackOut_3_4;
              break L5;
            } else {
              stackOut_2_0 = (i) (Object) stackIn_2_0;
              stackOut_2_1 = (i) (Object) stackIn_2_1;
              stackOut_2_2 = (i) (Object) stackIn_2_2;
              stackOut_2_3 = stackIn_2_3;
              stackOut_2_4 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              break L5;
            }
          }
          ((i) (Object) stackIn_4_0).ZA(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param3);
          var5.field_e = param0.field_e;
          var5.field_d = param0.field_d;
          return (ka) (Object) var5;
        }
    }

    private final native void f(long param0, long param1, long param2, int[] param3, int param4, int param5);

    final void a(ka param0, gda param1, int[] param2, int param3) {
        this.UA(((a) this).field_nativeid, ((i) (Object) param0).field_nativeid, ((ja) (Object) param1).field_nativeid, param2, param3);
    }

    private final native void HA(long param0, ha param1, int param2, int param3);

    a(oa param0, int param1, int param2) {
        ((a) this).field_e = param0;
        ((a) this).field_c = new i(((a) this).field_e);
        ((a) this).field_i = new i(((a) this).field_e);
        ((a) this).field_a = new i(((a) this).field_e);
        ((a) this).field_b = new i(((a) this).field_e);
        ((a) this).field_l = new i(((a) this).field_e);
        ((a) this).field_k = new i(((a) this).field_e);
        ((a) this).field_f = new i(((a) this).field_e);
        ((a) this).field_g = new i(((a) this).field_e);
        ((a) this).field_j = new i(((a) this).field_e);
        ((a) this).field_d = new i(((a) this).field_e);
        this.HA(((a) this).field_nativeid, (ha) (Object) param0, param1, param2);
    }
}
