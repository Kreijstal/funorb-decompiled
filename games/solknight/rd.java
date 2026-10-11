/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static qf field_b;
    static String field_a;

    final static boolean b(int param0) {
        if (param0 != 6144) {
          field_b = (qf) null;
          return true;
        }
        return true;
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -30) {
          if (4096 > param1) {
            if (param1 >= 2048) {
              stackIn_19_0 = -db.field_m[param1 - 2048];
            } else {
              stackIn_19_0 = db.field_m[2048 - param1];
            }
            return stackIn_19_0;
          }
          if (6144 > param1) {
            stackIn_15_0 = -db.field_m[-param1 + 6144];
          } else {
            stackIn_15_0 = db.field_m[-6144 + param1];
          }
          return stackIn_15_0;
        }
        field_b = (qf) null;
        if (4096 > param1) {
          if (param1 >= 2048) {
            stackIn_9_0 = -db.field_m[param1 - 2048];
          } else {
            stackIn_9_0 = db.field_m[2048 - param1];
          }
          return stackIn_9_0;
        }
        if (6144 > param1) {
          stackIn_5_0 = -db.field_m[-param1 + 6144];
        } else {
          stackIn_5_0 = db.field_m[-6144 + param1];
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 85) {
          rd.a((byte) 52, -77);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = new qf();
        field_a = "Waiting for sound effects";
    }
}
