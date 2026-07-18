/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_b;
    static byte[] field_g;
    static int field_h;
    static String field_d;
    static int field_c;
    static String field_a;
    static String field_i;
    static int field_f;
    static int[] field_j;
    static String field_e;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        field_j = null;
        field_i = null;
        field_g = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param0;
            stackOut_0_0 = ba.field_e.equals((Object) (Object) ni.a(125, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("mc.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 0 + ')');
        }
        return stackIn_1_0;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 == param1) {
            if (!(ni.field_k <= 0)) {
                int fieldTemp$0 = ni.field_k - 1;
                ni.field_k = ni.field_k - 1;
                var2_ref_byte__ = li.field_a[fieldTemp$0];
                li.field_a[ni.field_k] = null;
                return var2_ref_byte__;
            }
        }
        if (5000 == param1) {
            if (!(sg.field_q <= 0)) {
                int fieldTemp$1 = sg.field_q - 1;
                sg.field_q = sg.field_q - 1;
                var2_ref_byte__ = we.field_h[fieldTemp$1];
                we.field_h[sg.field_q] = null;
                return var2_ref_byte__;
            }
        }
        if (param1 == 30000) {
            if (!(pg.field_f <= 0)) {
                int fieldTemp$2 = pg.field_f - 1;
                pg.field_f = pg.field_f - 1;
                var2_ref_byte__ = sj.field_B[fieldTemp$2];
                sj.field_B[pg.field_f] = null;
                return var2_ref_byte__;
            }
        }
        if (null != kc.field_O) {
            for (var2 = 0; ~var2 > ~fl.field_e.length; var2++) {
                if (~fl.field_e[var2] == ~param1) {
                    if (nf.field_i[var2] > 0) {
                        nf.field_i[var2] = nf.field_i[var2] - 1;
                        var3 = kc.field_O[var2][nf.field_i[var2] - 1];
                        kc.field_O[var2][nf.field_i[var2]] = null;
                        return var3;
                    }
                }
            }
        }
        return new byte[param1];
    }

    final static void a(int param0, hl[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  var6_int = param1[0].field_x;
                  var7 = param1[2].field_x;
                  var8 = param1[1].field_x;
                  param1[0].a(param3, param5, param4);
                  param1[2].a(param2 + (param3 + -var7), param5, param4);
                  ki.a(be.field_c);
                  ki.c(var6_int + param3, param5, -var7 + (param3 + param2), param1[1].field_q + param5);
                  var9 = var6_int + param3;
                  var10 = param3 + (param2 + -var7);
                  param3 = var9;
                  L2: while (true) {
                    if (param3 >= var10) {
                      ki.b(be.field_c);
                      break L0;
                    } else {
                      param1[1].a(param3, param5, param4);
                      param3 = param3 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("mc.D(").append(100).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Confirm Password: ";
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = "HELIX LASER - Switches the Nova Ray to use the defensive burst of the helix laser.";
        field_g = new byte[65536];
        field_e = "Close";
        ug.a(field_g, 0, 65536, (byte) -128);
    }
}
