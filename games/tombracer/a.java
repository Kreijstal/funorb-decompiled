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
        this.E(this.field_nativeid, param0);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            ho.a(-1, (e) (this));
        }
    }

    private final void b() {
        this.M(this.field_nativeid);
    }

    final void a() {
        this.field_h = (Runnable) ((Object) Thread.currentThread());
        this.b();
    }

    private final native void M(long param0);

    private final native void E(long param0, boolean param1);

    final void a(ka param0, gda param1, int[] param2, int param3, int param4) {
        this.f(this.field_nativeid, ((i) ((Object) param0)).field_nativeid, ((ja) ((Object) param1)).field_nativeid, param2, param3, param4);
    }

    private final native void UA(long param0, long param1, long param2, int[] param3, int param4);

    final ka a(i param0, byte param1, int param2, boolean param3) {
        i dupTemp$0 = null;
        i stackIn_3_0;
        i stackIn_3_1;
        i stackIn_3_2;
        int stackIn_3_3;
        i stackIn_4_0 = null;
        i stackIn_4_1 = null;
        i stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        i stackIn_8_0;
        i stackIn_8_1;
        i stackIn_8_2;
        int stackIn_8_3;
        i stackIn_9_0 = null;
        i stackIn_9_1 = null;
        i stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        i stackIn_13_0;
        i stackIn_13_1;
        i stackIn_13_2;
        int stackIn_13_3;
        i stackIn_14_0 = null;
        i stackIn_14_1 = null;
        i stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        i stackIn_18_0;
        i stackIn_18_1;
        i stackIn_18_2;
        int stackIn_18_3;
        i stackIn_19_0 = null;
        i stackIn_19_1 = null;
        i stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        i stackIn_23_0;
        i stackIn_23_1;
        i stackIn_23_2;
        int stackIn_23_3;
        i stackIn_24_0 = null;
        i stackIn_24_1 = null;
        i stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        i stackIn_27_0;
        i stackIn_27_1;
        i stackIn_27_2;
        int stackIn_27_3;
        i stackIn_28_0 = null;
        i stackIn_28_1 = null;
        i stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        i var5;
        i var6;
        if (param1 != 1) {
          if (param1 != 2) {
            if (param1 != 3) {
              if (param1 != 4) {
                if (param1 == 5) {
                  L0: {
                    var6 = this.field_d;
                    var5 = this.field_l;
                    stackIn_27_0 = (i) (param0);

                    stackIn_27_1 = (i) (var5);

                    stackIn_27_2 = (i) (var6);

                    stackIn_27_3 = param2;

                    if (param1 == 0) {
                      stackIn_28_0 = (i) ((Object) stackIn_27_0);
                      stackIn_28_1 = (i) ((Object) stackIn_27_1);
                      stackIn_28_2 = (i) ((Object) stackIn_27_2);
                      stackIn_28_3 = stackIn_27_3;
                      stackIn_28_4 = 0;
                      break L0;
                    } else {
                      stackIn_28_0 = (i) ((Object) stackIn_27_0);
                      stackIn_28_1 = (i) ((Object) stackIn_27_1);
                      stackIn_28_2 = (i) ((Object) stackIn_27_2);
                      stackIn_28_3 = stackIn_27_3;
                      stackIn_28_4 = 1;
                      break L0;
                    }
                  }
                  ((i) (Object) stackIn_28_0).ZA(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4 != 0, param3);
                  var5.field_e = param0.field_e;
                  var5.field_d = param0.field_d;
                  return (ka) ((Object) var5);
                } else {
                  L1: {
                    dupTemp$0 = new i(this.field_e);
                    var6 = dupTemp$0;
                    var5 = dupTemp$0;
                    stackIn_23_0 = (i) (param0);

                    stackIn_23_1 = (i) (var5);

                    stackIn_23_2 = (i) (var6);

                    stackIn_23_3 = param2;

                    if (param1 == 0) {
                      stackIn_24_0 = (i) ((Object) stackIn_23_0);
                      stackIn_24_1 = (i) ((Object) stackIn_23_1);
                      stackIn_24_2 = (i) ((Object) stackIn_23_2);
                      stackIn_24_3 = stackIn_23_3;
                      stackIn_24_4 = 0;
                      break L1;
                    } else {
                      stackIn_24_0 = (i) ((Object) stackIn_23_0);
                      stackIn_24_1 = (i) ((Object) stackIn_23_1);
                      stackIn_24_2 = (i) ((Object) stackIn_23_2);
                      stackIn_24_3 = stackIn_23_3;
                      stackIn_24_4 = 1;
                      break L1;
                    }
                  }
                  ((i) (Object) stackIn_24_0).ZA(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4 != 0, param3);
                  var5.field_e = param0.field_e;
                  var5.field_d = param0.field_d;
                  return (ka) ((Object) var5);
                }
              } else {
                L2: {
                  var6 = this.field_j;
                  var5 = this.field_b;
                  stackIn_18_0 = (i) (param0);

                  stackIn_18_1 = (i) (var5);

                  stackIn_18_2 = (i) (var6);

                  stackIn_18_3 = param2;

                  if (param1 == 0) {
                    stackIn_19_0 = (i) ((Object) stackIn_18_0);
                    stackIn_19_1 = (i) ((Object) stackIn_18_1);
                    stackIn_19_2 = (i) ((Object) stackIn_18_2);
                    stackIn_19_3 = stackIn_18_3;
                    stackIn_19_4 = 0;
                    break L2;
                  } else {
                    stackIn_19_0 = (i) ((Object) stackIn_18_0);
                    stackIn_19_1 = (i) ((Object) stackIn_18_1);
                    stackIn_19_2 = (i) ((Object) stackIn_18_2);
                    stackIn_19_3 = stackIn_18_3;
                    stackIn_19_4 = 1;
                    break L2;
                  }
                }
                ((i) (Object) stackIn_19_0).ZA(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4 != 0, param3);
                var5.field_e = param0.field_e;
                var5.field_d = param0.field_d;
                return (ka) ((Object) var5);
              }
            } else {
              L3: {
                var6 = this.field_g;
                var5 = this.field_a;
                stackIn_13_0 = (i) (param0);

                stackIn_13_1 = (i) (var5);

                stackIn_13_2 = (i) (var6);

                stackIn_13_3 = param2;

                if (param1 == 0) {
                  stackIn_14_0 = (i) ((Object) stackIn_13_0);
                  stackIn_14_1 = (i) ((Object) stackIn_13_1);
                  stackIn_14_2 = (i) ((Object) stackIn_13_2);
                  stackIn_14_3 = stackIn_13_3;
                  stackIn_14_4 = 0;
                  break L3;
                } else {
                  stackIn_14_0 = (i) ((Object) stackIn_13_0);
                  stackIn_14_1 = (i) ((Object) stackIn_13_1);
                  stackIn_14_2 = (i) ((Object) stackIn_13_2);
                  stackIn_14_3 = stackIn_13_3;
                  stackIn_14_4 = 1;
                  break L3;
                }
              }
              ((i) (Object) stackIn_14_0).ZA(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4 != 0, param3);
              var5.field_e = param0.field_e;
              var5.field_d = param0.field_d;
              return (ka) ((Object) var5);
            }
          } else {
            L4: {
              var6 = this.field_f;
              var5 = this.field_i;
              stackIn_8_0 = (i) (param0);

              stackIn_8_1 = (i) (var5);

              stackIn_8_2 = (i) (var6);

              stackIn_8_3 = param2;

              if (param1 == 0) {
                stackIn_9_0 = (i) ((Object) stackIn_8_0);
                stackIn_9_1 = (i) ((Object) stackIn_8_1);
                stackIn_9_2 = (i) ((Object) stackIn_8_2);
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = 0;
                break L4;
              } else {
                stackIn_9_0 = (i) ((Object) stackIn_8_0);
                stackIn_9_1 = (i) ((Object) stackIn_8_1);
                stackIn_9_2 = (i) ((Object) stackIn_8_2);
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = 1;
                break L4;
              }
            }
            ((i) (Object) stackIn_9_0).ZA(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4 != 0, param3);
            var5.field_e = param0.field_e;
            var5.field_d = param0.field_d;
            return (ka) ((Object) var5);
          }
        } else {
          L5: {
            var6 = this.field_k;
            var5 = this.field_c;
            stackIn_3_0 = (i) (param0);

            stackIn_3_1 = (i) (var5);

            stackIn_3_2 = (i) (var6);

            stackIn_3_3 = param2;

            if (param1 == 0) {
              stackIn_4_0 = (i) ((Object) stackIn_3_0);
              stackIn_4_1 = (i) ((Object) stackIn_3_1);
              stackIn_4_2 = (i) ((Object) stackIn_3_2);
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = 0;
              break L5;
            } else {
              stackIn_4_0 = (i) ((Object) stackIn_3_0);
              stackIn_4_1 = (i) ((Object) stackIn_3_1);
              stackIn_4_2 = (i) ((Object) stackIn_3_2);
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = 1;
              break L5;
            }
          }
          ((i) (Object) stackIn_4_0).ZA(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param3);
          var5.field_e = param0.field_e;
          var5.field_d = param0.field_d;
          return (ka) ((Object) var5);
        }
    }

    private final native void f(long param0, long param1, long param2, int[] param3, int param4, int param5);

    final void a(ka param0, gda param1, int[] param2, int param3) {
        this.UA(this.field_nativeid, ((i) ((Object) param0)).field_nativeid, ((ja) ((Object) param1)).field_nativeid, param2, param3);
    }

    private final native void HA(long param0, ha param1, int param2, int param3);

    a(oa param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = new i(this.field_e);
        this.field_i = new i(this.field_e);
        this.field_a = new i(this.field_e);
        this.field_b = new i(this.field_e);
        this.field_l = new i(this.field_e);
        this.field_k = new i(this.field_e);
        this.field_f = new i(this.field_e);
        this.field_g = new i(this.field_e);
        this.field_j = new i(this.field_e);
        this.field_d = new i(this.field_e);
        this.HA(this.field_nativeid, param0, param1, param2);
    }
}
