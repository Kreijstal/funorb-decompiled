/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_c;
    String field_o;
    static String field_j;
    static int[] field_f;
    int field_l;
    int field_r;
    int field_n;
    static String[] field_e;
    static nm field_k;
    static int field_g;
    int field_m;
    static String field_b;
    static mm field_p;
    static String field_a;
    int field_d;
    static String field_q;
    static w field_i;
    static int field_h;

    public static void a(byte param0) {
        field_k = null;
        field_p = null;
        field_i = null;
        if (param0 < 78) {
          return;
        } else {
          field_c = null;
          field_f = null;
          field_j = null;
          field_a = null;
          field_q = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        int fieldTemp$2 = 0;
        uf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1 = we.field_b;
            L1: while (true) {
              L2: {
                L3: {
                  if (!sc.c((byte) -104)) {
                    break L3;
                  } else {
                    var1.f(8, -4);
                    fieldTemp$2 = var1.field_n + 1;
                    var1.field_n = var1.field_n + 1;
                    var2 = fieldTemp$2;
                    ba.a(-32141, var1);
                    we.field_b.b(var1.field_n - var2, true);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -91) {
                  break L2;
                } else {
                  ec.a(-123);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "ec.A(" + param0 + ')');
        }
    }

    ec(int param0, String param1, mm param2) {
        try {
            this.field_d = param0;
            this.field_o = param1;
            this.field_n = param2.a(this.field_o) + 46;
            this.field_r = 30;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ec.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ec(int param0) {
        this.field_r = 30;
        this.field_d = param0;
    }

    static {
        field_c = "(1 player wants to join)";
        field_j = "Only show private chat from my friends and opponents";
        field_f = new int[8192];
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_a = "Spectate <%0>'s game";
        field_b = "You cannot join this game - it is in progress";
        field_q = "Go Back";
    }
}
