/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_a;
    static String field_b;
    static int field_c;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        if (param1 == -18340) {
          var4 = param0.length();
          param0.setLength(param2);
          var5 = var4;
          L0: while (true) {
            if (param2 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param3);
              var5++;
              continue L0;
            }
          }
        } else {
          field_c = 105;
          var4 = param0.length();
          param0.setLength(param2);
          var5 = var4;
          L1: while (true) {
            if (param2 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param3);
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -1) {
            Object var2 = null;
            StringBuilder discarded$0 = gi.a((StringBuilder) null, -34, -45, '￰');
        }
    }

    final static pe a(ml param0, int param1, int param2) {
        if (param1 != 100) {
            return null;
        }
        return tm.a(jh.a(param0, 100, param2), param1 + -172);
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        wh var4 = null;
        if (param0 != null) {
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof wh)) {
              if (param2 >= -123) {
                return null;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var4 = (wh) param0;
              return var4.b(94);
            }
          } else {
            var3 = (byte[]) param0;
            if (param1) {
              return va.a(var3, 0);
            } else {
              return var3;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
