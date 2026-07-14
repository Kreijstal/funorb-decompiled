/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends nf {
    private boolean field_S;
    private boolean field_R;
    private String field_P;
    private jh field_Q;
    private String field_T;
    static int[] field_O;

    final void c(boolean param0) {
        ((ul) this).field_S = param0 ? true : false;
        ((ul) this).field_Q.field_G = false;
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        Object var6 = null;
        int stackIn_3_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (((ul) this).field_R ? 1 : 0)) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param0) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          ((ul) this).field_R = stackIn_11_1 != 0;
          if (((ul) this).field_R) {
            ((ul) this).field_Q.a((byte) -115, 8405024, 4210752);
            ((ul) this).field_Q.field_G = true;
            if (param2 != 4210752) {
              var6 = null;
              ((ul) this).a(true, (String) null, 19, -0.34645962715148926f);
              ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
              ((ul) this).field_T = param1;
              return;
            } else {
              ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
              ((ul) this).field_T = param1;
              return;
            }
          } else {
            ((ul) this).field_Q.a((byte) -115, 2113632, 4210752);
            if (!((ul) this).field_S) {
              if (param2 != 4210752) {
                var6 = null;
                ((ul) this).a(true, (String) null, 19, -0.34645962715148926f);
                ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
                ((ul) this).field_T = param1;
                return;
              } else {
                ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
                ((ul) this).field_T = param1;
                return;
              }
            } else {
              ((ul) this).field_Q.field_G = false;
              if (param2 == 4210752) {
                ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
                ((ul) this).field_T = param1;
                return;
              } else {
                var6 = null;
                ((ul) this).a(true, (String) null, 19, -0.34645962715148926f);
                ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
                ((ul) this).field_T = param1;
                return;
              }
            }
          }
        } else {
          if (param2 == 4210752) {
            ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
            ((ul) this).field_T = param1;
            return;
          } else {
            var6 = null;
            ((ul) this).a(true, (String) null, 19, -0.34645962715148926f);
            ((ul) this).field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
            ((ul) this).field_T = param1;
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, param2);
        pj.field_c.a(((ul) this).field_T, param1 - -(((ul) this).field_l >> -1036633151), param2 + 103, 16777215, -1);
        if (null == ((ul) this).field_P) {
          if (param0) {
            ((ul) this).field_R = true;
            return;
          } else {
            return;
          }
        } else {
          ge.a(20 + param1, 113 + param2, 260, 8421504);
          int discarded$34 = pj.field_c.a(((ul) this).field_P, param1 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, pj.field_c.field_C);
          if (!param0) {
            return;
          } else {
            ((ul) this).field_R = true;
            return;
          }
        }
    }

    public static void q(int param0) {
        if (param0 >= -34) {
            return;
        }
        field_O = null;
    }

    ul(kj param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ul) this).field_P = param1;
        if (((ul) this).field_P != null) {
            var3 = pj.field_c.a(((ul) this).field_P, 260, pj.field_c.field_C);
            ((ul) this).a(150 - -var3, (byte) 110, 300);
        }
        ((ul) this).field_Q = new jh(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ul) this).field_R = false;
        ((ul) this).field_S = false;
        ((ul) this).field_Q.field_G = true;
        ((ul) this).b((byte) -28, (we) (Object) ((ul) this).field_Q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[20];
    }
}
