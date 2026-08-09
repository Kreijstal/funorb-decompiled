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
            L0: {
              if (-2049 >= (param1 ^ -1)) {
                stackIn_19_0 = -db.field_m[param1 - 2048];
                break L0;
              } else {
                stackIn_19_0 = db.field_m[2048 + -param1];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (6144 > param1) {
                stackIn_15_0 = -db.field_m[-param1 + 6144];
                break L1;
              } else {
                stackIn_15_0 = db.field_m[-6144 + param1];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = (qf) null;
          if (4096 > param1) {
            L2: {
              if (-2049 >= (param1 ^ -1)) {
                stackIn_9_0 = -db.field_m[param1 - 2048];
                break L2;
              } else {
                stackIn_9_0 = db.field_m[2048 + -param1];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (6144 > param1) {
                stackIn_5_0 = -db.field_m[-param1 + 6144];
                break L3;
              } else {
                stackIn_5_0 = db.field_m[-6144 + param1];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
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
