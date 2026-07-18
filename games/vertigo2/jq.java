/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jq {
    static String field_d;
    int field_a;
    static int field_e;
    static er[][] field_c;
    static int field_b;
    int field_g;
    int field_f;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 160) {
          if (32 != param0) {
            if (param0 != 95) {
              if (param0 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static int a(byte param0) {
        return mm.field_a;
    }

    abstract void b(int param0, byte param1, int param2);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        er var6 = null;
        var6 = new er(param3, param4);
        var6.d();
        bi.f(0, 0, param3, param4, 12, 5921370);
        if (param0 <= 57) {
          jq.a(1, 91, 33, -110, -47);
          bi.f(4, 4, -8 + param3, param4 - 8, 8, 0);
          ro.field_g.a(-127);
          bi.g(param1, param2, param1 - -param3, param2 + 40);
          bi.b(param1, param2, param3, param4, 12, 2048068, 150);
          bi.g(param1, 40 + param2, param3 + param1, param2 + param4);
          bi.b(param1, param2, param3, param4, 12, 0, 150);
          bi.g(0, 0, 640, 480);
          var6.e(param1, param2);
          return;
        } else {
          bi.f(4, 4, -8 + param3, param4 - 8, 8, 0);
          ro.field_g.a(-127);
          bi.g(param1, param2, param1 - -param3, param2 + 40);
          bi.b(param1, param2, param3, param4, 12, 2048068, 150);
          bi.g(param1, 40 + param2, param3 + param1, param2 + param4);
          bi.b(param1, param2, param3, param4, 12, 0, 150);
          bi.g(0, 0, 640, 480);
          var6.e(param1, param2);
          return;
        }
    }

    jq(int param0, int param1, int param2) {
        ((jq) this).field_g = param0;
        ((jq) this).field_f = param2;
        ((jq) this).field_a = param1;
    }

    abstract void a(int param0, byte param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please enter your date of birth to enable chat:";
        field_b = 0;
    }
}
