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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var6_int = 2;
              if (se.field_S != param5) {
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
              if (param5 == w.field_kb) {
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
            L3: {
              if (param4 == 75) {
                break L3;
              } else {
                field_c = (String) null;
                break L3;
              }
            }
            param5.b(param2, param1, param3, param0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("ed.E(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        int var1 = -49 / ((-30 - param0) / 54);
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        mf var3 = null;
        var2 = -33 / ((param0 - 79) / 41);
        ea.field_D.a(1141039778, param1);
        var3 = bc.field_E;
        if (var3 != null) {
          var3.a(ea.field_D.field_pb, ea.field_D.field_E, (byte) -72);
          return;
        } else {
          return;
        }
    }

    final static void a(ji param0, int param1, mi param2, int param3) {
        sh.field_i = param1 * n.a((byte) -74) / 1000;
        if (param3 != 20350) {
            return;
        }
        try {
            wi.a((byte) -51, param0);
            pb.a(param0, -2);
            em.a((byte) -113, param0);
            bg.a(-120);
            bb.a(true);
            gd.field_e = 0 - sh.field_i;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ed.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        wb discarded$2 = null;
        String var2 = null;
        if (v.field_d) {
          qi.field_M = true;
          vk.a(true, 841566312);
          hc.field_d = 0;
          if (param0 <= 101) {
            var2 = (String) null;
            discarded$2 = ed.a((String) null, (byte) -16);
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
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
        Object stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (mc.field_a != null) {
              if (param0 != null) {
                if (param0.length() != 0) {
                  var7 = (CharSequence) ((Object) param0);
                  var2 = kf.a(var7, (byte) 2);
                  var3 = 38 % ((-44 - param1) / 47);
                  if (var2 != null) {
                    var4 = (wb) ((Object) mc.field_a.a(24710, (long)var2.hashCode()));
                    L1: while (true) {
                      if (var4 != null) {
                        var8 = (CharSequence) ((Object) var4.field_Ob);
                        var5 = kf.a(var8, (byte) 2);
                        if (var5.equals(var2)) {
                          stackOut_16_0 = (wb) (var4);
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var4 = (wb) ((Object) mc.field_a.d(-17713));
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            stackOut_19_0 = null;
                            stackIn_20_0 = stackOut_19_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref);
            stackOut_21_1 = new StringBuilder().append("ed.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return (wb) ((Object) stackIn_20_0);
        }
    }

    static {
        field_e = "Name is available";
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_d = null;
    }
}
