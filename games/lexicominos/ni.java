/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_e;
    static sc field_b;
    static int[] field_a;
    static String field_d;
    static String field_c;

    final static String a(byte param0, byte[] param1) {
        if (param0 != -55) {
          field_a = null;
          return dc.a(param1.length, param1, (byte) 16, 0);
        } else {
          return dc.a(param1.length, param1, (byte) 16, 0);
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        Object var2 = null;
        L0: {
          var1 = "";
          if (eb.field_b != null) {
            var1 = eb.field_b.e((byte) -74);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          L1: {
            var2 = null;
            boolean discarded$6 = ni.a((byte) -127, (String) null, (String) null);
            if (var1.length() == 0) {
              var1 = a.a(-1);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = ld.field_G;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (var1.length() == 0) {
              var1 = a.a(-1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var1.length() == 0) {
              var1 = ld.field_G;
              break L4;
            } else {
              break L4;
            }
          }
          return var1;
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = ne.a('_', "", param2, (byte) -127);
        var3 = ci.a(param2, (byte) -79);
        if (param0 == 120) {
          if ((param1.indexOf(param2) ^ -1) == 0) {
            if (param1.indexOf(var3) != -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var4 = null;
          String discarded$4 = ni.a((byte) -19, (byte[]) null);
          if ((param1.indexOf(param2) ^ -1) != 0) {
            return true;
          } else {
            L0: {
              if (param1.indexOf(var3) == -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 65) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 65 % ((param0 - -77) / 47);
        il.field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new sc();
        field_d = "Loading music";
        field_c = "Achieved";
    }
}
