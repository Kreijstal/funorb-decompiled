/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;
    static boolean field_c;
    static String field_b;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 >= 14) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param2 = qe.a((byte) 36, '_', param2, "");
                var3 = pc.a(param2, 0);
                if (0 != (param1.indexOf(param2) ^ -1)) {
                  break L3;
                } else {
                  if (0 == (param1.indexOf(var3) ^ -1)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("tf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(boolean param0, byte param1, mg param2, int param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              pj.field_r[0] = og.field_w.nextInt();
              pj.field_r[1] = og.field_w.nextInt();
              pj.field_r[2] = (int)(md.field_m >> 787276256);
              pj.field_r[3] = (int)md.field_m;
              sp.field_c.field_f = 0;
              sp.field_c.a(pj.field_r[0], -16384);
              sp.field_c.a(pj.field_r[1], -16384);
              sp.field_c.a(pj.field_r[2], param1 + -16459);
              sp.field_c.a(pj.field_r[3], -16384);
              lo.a(param1 + -51, sp.field_c);
              sp.field_c.c(-161478600, param3);
              param2.a(sp.field_c, (byte) 124);
              tp.field_f.field_f = 0;
              if (!param0) {
                tp.field_f.a(true, 16);
                break L1;
              } else {
                tp.field_f.a(true, 18);
                break L1;
              }
            }
            L2: {
              tp.field_f.field_f = tp.field_f.field_f + 2;
              var5_int = tp.field_f.field_f;
              tp.field_f.a(tb.field_g, -16384);
              tp.field_f.b(vb.field_m, (byte) 13);
              var6 = 0;
              if (!fj.field_d) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (ag.field_b) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (ld.field_r == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              tp.field_f.a(true, var6);
              var7 = mf.a(le.b((byte) -20), -28697);
              if (param1 == 75) {
                break L6;
              } else {
                field_a = (String) null;
                break L6;
              }
            }
            L7: {
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              tp.field_f.b(var7, (byte) -23);
              if (null == ld.field_r) {
                break L8;
              } else {
                tp.field_f.a(ld.field_r, (byte) -117);
                break L8;
              }
            }
            tg.a(sp.field_c, tp.field_f, gn.field_S, -107, lm.field_j);
            tp.field_f.b(977272835, -var5_int + tp.field_f.field_f);
            ak.a(-1, (byte) -48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -6) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Last Spider";
        field_a = "Type your age in years";
    }
}
