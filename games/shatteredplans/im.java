/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static jq field_c;
    static String field_a;
    static int[] field_b;

    public static void a(int param0) {
        if (param0 != -27153) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (!param0) {
          L0: {
            field_a = null;
            if (ol.a(-128)) {
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
          kq.a((byte) -57, param1);
          ms.b(20975);
          return;
        } else {
          L1: {
            if (ol.a(-128)) {
              param1 = false;
              break L1;
            } else {
              break L1;
            }
          }
          kq.a((byte) -57, param1);
          ms.b(20975);
          return;
        }
    }

    final static void a(fs param0, ob param1, int param2) {
        Object var4 = null;
        ob stackIn_1_0 = null;
        ob stackIn_2_0 = null;
        ob stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ob stackOut_0_0 = null;
        ob stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ob stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = (ob) param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0 == null) {
            stackOut_2_0 = (ob) (Object) stackIn_2_0;
            stackOut_2_1 = -1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ob) (Object) stackIn_1_0;
            stackOut_1_1 = param0.field_x;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ob) (Object) stackIn_3_0).c(stackIn_3_1, (byte) -97);
        if (param2 != 9555) {
          var4 = null;
          im.a((fs) null, (ob) null, -30);
          return;
        } else {
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 75 % ((52 - param1) / 51);
        return nn.a(-105, param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Withdraw request to join <%0>'s game";
        field_c = new jq();
    }
}
