/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends cm {
    static String field_V;
    static String field_Z;
    static String[][] field_Q;
    private boolean field_W;
    static String field_T;
    private String field_U;
    private boolean field_X;
    private String field_S;
    static String field_R;
    private ou field_Y;

    final void a(String param0, float param1, int param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (((oj) this).field_W == param3) {
          ((oj) this).field_U = param0;
          if (param2 != 9255) {
            return;
          } else {
            ((oj) this).field_Y.field_C = (int)(param1 / 100.0f * 65536.0f);
            return;
          }
        } else {
          L0: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param3) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((oj) this).field_W = stackIn_4_1 != 0;
          if (((oj) this).field_W) {
            ((oj) this).field_Y.a((byte) 21, 4210752, 8405024);
            ((oj) this).field_Y.field_w = true;
            ((oj) this).field_U = param0;
            if (param2 != 9255) {
              return;
            } else {
              ((oj) this).field_Y.field_C = (int)(param1 / 100.0f * 65536.0f);
              return;
            }
          } else {
            ((oj) this).field_Y.a((byte) 21, 4210752, 2113632);
            if (((oj) this).field_X) {
              ((oj) this).field_Y.field_w = false;
              ((oj) this).field_U = param0;
              if (param2 != 9255) {
                return;
              } else {
                ((oj) this).field_Y.field_C = (int)(param1 / 100.0f * 65536.0f);
                return;
              }
            } else {
              ((oj) this).field_U = param0;
              if (param2 != 9255) {
                return;
              } else {
                ((oj) this).field_Y.field_C = (int)(param1 / 100.0f * 65536.0f);
                return;
              }
            }
          }
        }
    }

    final void p(int param0) {
        ((oj) this).field_Y.field_w = false;
        if (param0 != -120) {
            return;
        }
        ((oj) this).field_X = true;
    }

    public static void j(byte param0) {
        int var1 = 25 / ((-15 - param0) / 39);
        field_Q = null;
        field_R = null;
        field_V = null;
        field_T = null;
        field_Z = null;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        super.a(param0, (byte) -128, param2);
        fj.field_b.d(((oj) this).field_U, (((oj) this).field_n >> 1646799425) + param0, param2 - -103, 16777215, -1);
        var4 = 80 / ((-55 - param1) / 45);
        if (((oj) this).field_S != null) {
          on.f(param0 + 20, -7 + (param2 - -120), 260, 8421504);
          int discarded$2 = fj.field_b.a(((oj) this).field_S, param0 - -20, 120 + (param2 - -8), 260, 100, 16777215, -1, 1, 0, fj.field_b.field_G);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, vc param1) {
        np.field_Jb.a((gn) (Object) new hk(param1, 19), 3);
        int var2 = -76 / ((49 - param0) / 61);
    }

    oj(se param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((oj) this).field_S = param1;
        if (((oj) this).field_S != null) {
            var3 = fj.field_b.c(((oj) this).field_S, 260, fj.field_b.field_G);
            ((oj) this).a((byte) 110, var3 + 150, 300);
        }
        ((oj) this).field_Y = new ou(13, 50, 274, 30, 15, 2113632, 4210752);
        ((oj) this).field_X = false;
        ((oj) this).field_W = false;
        ((oj) this).field_Y.field_w = true;
        ((oj) this).a(-120, (fd) (Object) ((oj) this).field_Y);
    }

    final static void b(int param0, int param1) {
        int var2 = 51 / ((param0 - -28) / 58);
        np.field_Jb.a((gn) (Object) new pw(param1), 3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "initial credits: <%0>";
        field_V = "Try changing the '<%0>' setting.";
        field_T = "Min Price";
        field_R = "Full";
    }
}
