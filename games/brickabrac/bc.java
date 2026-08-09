/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    abstract ko b(byte param0);

    final static boolean a(String param0, String param1, String param2, int param3, byte param4, dk param5, boolean param6) {
        RuntimeException var7 = null;
        qf var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -102) {
                break L1;
              } else {
                bc.a(51);
                break L1;
              }
            }
            if (ik.field_g == ej.field_P) {
              var8 = new qf(mf.field_f, param5);
              mf.field_f.a(-102, var8);
              if (!mq.a((byte) -56)) {
                L2: {
                  td.field_w = param0;
                  ik.field_g = jm.field_f;
                  if (!param6) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
                tf.field_i = stackIn_10_0 != 0;
                fj.field_Qb = param1;
                am.field_cc = param2;
                ni.field_Rb = null;
                vo.field_x = param3;
                return true;
              } else {
                var8.c(true);
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("bc.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static void a(int param0, long param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                Thread.sleep(param1);
                if (param0 == -29869) {
                  break L0;
                } else {
                  field_a = (String) null;
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        CharSequence var2;
        CharSequence var3;
        if (param0 != 27423) {
          bc.a(49, -113L);
          tb.field_cb = jl.field_e.d(-1);
          var2 = (CharSequence) ((Object) tb.field_cb);
          ih.field_d = gb.a(var2, 71);
          return;
        } else {
          tb.field_cb = jl.field_e.d(-1);
          var3 = (CharSequence) ((Object) tb.field_cb);
          ih.field_d = gb.a(var3, 71);
          return;
        }
    }

    abstract byte[] a(int param0, byte param1);

    abstract int a(byte param0, int param1);

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -59) {
            bc.a(-15, -86L);
        }
    }

    static {
        field_d = "You can join this game";
        field_a = "Show chat (<%0> unread messages)";
        field_b = "Game options";
        field_c = "Location";
    }
}
