/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn {
    static String field_a;
    static int field_b;
    static String field_d;
    static boolean field_c;

    final static String c(int param0) {
        ed discarded$11 = null;
        String var1 = null;
        L0: {
          var1 = "";
          if (di.field_D == null) {
            break L0;
          } else {
            var1 = di.field_D.a((byte) 117);
            break L0;
          }
        }
        if (param0 <= 74) {
          L1: {
            discarded$11 = hn.a(true, (byte) 38);
            if (var1.length() == 0) {
              var1 = cb.a((byte) -98);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var1.length() != 0) {
              break L2;
            } else {
              var1 = bm.field_r;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (var1.length() == 0) {
              var1 = cb.a((byte) -98);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var1.length() != 0) {
              break L4;
            } else {
              var1 = bm.field_r;
              break L4;
            }
          }
          return var1;
        }
    }

    abstract ec b(int param0);

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            field_c = false;
        }
    }

    abstract void a(sb param0, byte param1);

    final static ed a(boolean param0, byte param1) {
        ed var2 = null;
        ed stackIn_2_0 = null;
        ed stackIn_3_0 = null;
        ed stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ed stackOut_1_0 = null;
        ed stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ed stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != 105) {
          return (ed) null;
        } else {
          L0: {
            var2 = new ed(true);
            stackOut_1_0 = (ed) (var2);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (ed) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (ed) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          stackIn_4_0.field_i = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static void a(byte param0) {
        ed discarded$0 = null;
        ti.field_J = kj.field_a.a(false);
        CharSequence var2 = (CharSequence) ((Object) ti.field_J);
        in.field_b = cl.a(-95, var2);
        if (param0 > -22) {
            discarded$0 = hn.a(true, (byte) 100);
        }
    }

    static {
        field_a = "Rock blaster: Gun that fires explosives. Does not work underwater.";
        field_d = "Please check if address is correct";
        field_c = false;
    }
}
