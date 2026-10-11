/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String field_a;
    static String field_b;
    static String field_c;
    static boolean field_d;
    static ji field_e;

    final static void a(int param0, int param1, int param2, byte param3) {
        if (param0 != 0) {
          if (1 != param0) {
            if (2 == param0 &&
              param2 != wl.field_o) {
              wl.field_o = param2;
              rg.field_c = true;
              mf.a((byte) 120, param1);
            }
          } else {
            if (wh.field_d == param2) {
              if (2 == param0 &&
                param2 != wl.field_o) {
                wl.field_o = param2;
                rg.field_c = true;
                mf.a((byte) 120, param1);
              }
            } else {
              rg.field_c = true;
              wh.field_d = param2;
              mf.a((byte) 108, param1);
              if (2 == param0) {
                if (param2 == wl.field_o) {
                  if (param3 <= 67) {
                    field_d = false;
                  }
                  return;
                }
                wl.field_o = param2;
                rg.field_c = true;
                mf.a((byte) 120, param1);
              }
            }
          }
        } else {
          if (qk.field_i != param2) {
            rg.field_c = true;
            qk.field_i = param2;
            mf.a((byte) 125, param1);
          }
          if (1 == param0 &&
            wh.field_d != param2) {
            rg.field_c = true;
            wh.field_d = param2;
            mf.a((byte) 108, param1);
          }
          if (2 == param0 &&
            param2 != wl.field_o) {
            wl.field_o = param2;
            rg.field_c = true;
            mf.a((byte) 120, param1);
          }
        }
        if (param3 > 67) {
          return;
        }
        field_d = false;
    }

    final static int[] a(int[] param0, int[] param1, byte param2) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (param2 < 76) {
            var6 = (int[]) null;
            eg.a((int[]) null, (int[]) null, (byte) -36);
          }
          var7 = new int[8];
          var3 = var7;
          for (var4 = 0; var4 < 8; var4++) {
            var7[var4] = lb.a(param1[var4], param0[var4]);
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("eg.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ie a(byte param0) {
        if (param0 != 63) {
          eg.a((byte) 127);
          return (ie) ((Object) new dn());
        }
        return (ie) ((Object) new dn());
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 10140) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_a = "Playing";
        field_b = "Game";
        field_c = "Email (Login):";
        field_d = false;
    }
}
