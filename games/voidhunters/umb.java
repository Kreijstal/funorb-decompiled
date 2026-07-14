/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class umb extends ksa implements ntb {
    static llb field_d;
    int field_g;
    boolean field_e;
    int field_f;

    public static void a(int param0) {
        if (param0 != 16214) {
            umb.a(-109);
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        umb var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_8_1 = 0;
        boolean stackOut_5_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_7_1 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        L0: {
          var5 = (umb) (Object) param0;
          var4 = 0;
          if (var5.field_f != var5.field_f) {
            iva.a(-6940, "int servertick has changed. before=" + var5.field_f + ", now=" + var5.field_f);
            var4 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var5.field_g == var5.field_g) {
            break L1;
          } else {
            iva.a(-6940, "int statecrc has changed. before=" + var5.field_g + ", now=" + var5.field_g);
            var4 = 1;
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = var5.field_e;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (var5.field_e) {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = stackIn_6_0;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          if ((stackIn_8_0 ? 1 : 0) == stackIn_8_1) {
            var4 = 1;
            iva.a(-6940, "boolean client_should_catchup has changed. ");
            break L3;
          } else {
            break L3;
          }
        }
        if (param1 > -19) {
          L4: {
            ((umb) this).field_e = true;
            if (var4 != 0) {
              tfb.a((byte) -82, "This instance of ServerTick has changed");
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            if (var4 != 0) {
              tfb.a((byte) -82, "This instance of ServerTick has changed");
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((umb) this).field_f, 32);
        param0.a(-632, ((umb) this).field_g, 32);
        if (param1 > -109) {
          field_d = null;
          boolean discarded$4 = vq.a(param0, 43, ((umb) this).field_e);
          return;
        } else {
          boolean discarded$5 = vq.a(param0, 43, ((umb) this).field_e);
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        umb var3 = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var4 = -52 / ((22 - param0) / 59);
        var3 = (umb) (Object) param1;
        if (var3.field_f == var3.field_f) {
          if (var3.field_g != var3.field_g) {
            return true;
          } else {
            L0: {
              stackOut_3_0 = var3.field_e;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var3.field_e) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L0;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L0;
              }
            }
            L1: {
              if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          return true;
        }
    }

    public final void b(byte param0, tv param1) {
        umb var5 = null;
        umb var6 = null;
        var5 = (umb) (Object) param1;
        var6 = var5;
        var6.field_f = var5.field_f;
        if (param0 < 54) {
          return;
        } else {
          var6.field_g = var5.field_g;
          var6.field_e = var5.field_e;
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        ((umb) this).field_f = param0.i(0, 32);
        ((umb) this).field_g = param0.i(0, 32);
        ((umb) this).field_e = kv.a(param1, param0);
        if (param1) {
            Object var4 = null;
            ((umb) this).a((tv) null, 89);
        }
    }

    umb() {
    }

    static {
    }
}
