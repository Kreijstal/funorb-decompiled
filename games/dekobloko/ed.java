/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed {
    static String[] field_b;
    static String field_e;
    static Calendar field_a;
    static String field_d;
    static int field_f;
    static int field_g;
    static String field_c;

    final static void a(int param0, int param1, String param2, int param3, byte param4, mm param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var6_int = 2;
              if ((Object) (Object) se.field_S != (Object) (Object) param5) {
                break L1;
              } else {
                var6_int = 1;
                break L1;
              }
            }
            L2: {
              param5.b(param2, param1 + -var6_int, param3 + -var6_int, 0, -1);
              param5.b(param2, -var6_int + param1, param3, 0, -1);
              param5.b(param2, param1 + -var6_int, param3 + var6_int, 0, -1);
              param5.b(param2, param1, param3 - var6_int, 0, -1);
              param5.b(param2, param1, var6_int + param3, 0, -1);
              param5.b(param2, param1 - -var6_int, param3 + -var6_int, 0, -1);
              param5.b(param2, var6_int + param1, param3, 0, -1);
              param5.b(param2, param1 + var6_int, param3 + var6_int, 0, -1);
              if ((Object) (Object) param5 == (Object) (Object) w.field_kb) {
                param5.b(param2, 1 + param1, param3 + -var6_int, 0, -1);
                param5.b(param2, param1 - 1, -var6_int + param3, 0, -1);
                param5.b(param2, param1 + var6_int, param3 + -1, 0, -1);
                param5.b(param2, -var6_int + param1, -1 + param3, 0, -1);
                param5.b(param2, var6_int + param1, 1 + param3, 0, -1);
                param5.b(param2, param1 - var6_int, 1 + param3, 0, -1);
                param5.b(param2, param1 - -1, var6_int + param3, 0, -1);
                param5.b(param2, param1 - 1, var6_int + param3, 0, -1);
                break L2;
              } else {
                break L2;
              }
            }
            param5.b(param2, param1, param3, param0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("ed.E(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param3).append(44).append(75).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    public static void b() {
        field_d = null;
        field_b = null;
        int var1 = -49;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        mf var3 = null;
        var2 = -33;
        ea.field_D.a(1141039778, param1);
        var3 = bc.field_E;
        if (var3 != null) {
          var3.a(ea.field_D.field_pb, ea.field_D.field_E, (byte) -72);
          return;
        } else {
          return;
        }
    }

    final static void a(ji param0, int param1, mi param2) {
        sh.field_i = param1 * n.a((byte) -74) / 1000;
        try {
            wi.a((byte) -51, param0);
            int discarded$0 = -2;
            pb.a(param0);
            em.a((byte) -113, param0);
            bg.a(-120);
            bb.a(true);
            gd.field_e = 0 - sh.field_i;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ed.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + 20350 + 41);
        }
    }

    final static void a() {
        if (!v.field_d) {
            throw new IllegalStateException();
        }
        qi.field_M = true;
        int discarded$0 = 841566312;
        vk.a(true);
        hc.field_d = 0;
    }

    final static wb a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        wb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        wb stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (mc.field_a != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var7 = (CharSequence) (Object) param0;
                int discarded$4 = 2;
                var2 = kf.a(var7);
                var3 = 38 % ((-44 - param1) / 47);
                if (var2 != null) {
                  var4 = (wb) (Object) mc.field_a.a(24710, (long)var2.hashCode());
                  L0: while (true) {
                    if (var4 != null) {
                      var8 = (CharSequence) (Object) var4.field_Ob;
                      int discarded$5 = 2;
                      var5 = kf.a(var8);
                      if (var5.equals((Object) (Object) var2)) {
                        stackOut_16_0 = (wb) var4;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var4 = (wb) (Object) mc.field_a.d(-17713);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("ed.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Name is available";
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_d = null;
    }
}
