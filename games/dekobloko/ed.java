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
        try {
            var6_int = 2;
            if (se.field_S == param5) {
                var6_int = 1;
            }
            param5.b(param2, param1 + -var6_int, param3 + -var6_int, 0, -1);
            param5.b(param2, -var6_int + param1, param3, 0, -1);
            param5.b(param2, param1 + -var6_int, param3 + var6_int, 0, -1);
            param5.b(param2, param1, param3 - var6_int, 0, -1);
            param5.b(param2, param1, var6_int + param3, 0, -1);
            param5.b(param2, param1 - -var6_int, param3 + -var6_int, 0, -1);
            param5.b(param2, var6_int + param1, param3, 0, -1);
            param5.b(param2, param1 + var6_int, param3 + var6_int, 0, -1);
            if (!(param5 != w.field_kb)) {
                param5.b(param2, 1 + param1, param3 + -var6_int, 0, -1);
                param5.b(param2, param1 - 1, -var6_int + param3, 0, -1);
                param5.b(param2, param1 + var6_int, param3 + -1, 0, -1);
                param5.b(param2, -var6_int + param1, -1 + param3, 0, -1);
                param5.b(param2, var6_int + param1, 1 + param3, 0, -1);
                param5.b(param2, param1 - var6_int, 1 + param3, 0, -1);
                param5.b(param2, param1 - -1, var6_int + param3, 0, -1);
                param5.b(param2, param1 - 1, var6_int + param3, 0, -1);
            }
            if (param4 != 75) {
                field_c = (String) null;
            }
            param5.b(param2, param1, param3, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ed.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
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
        int var2;
        mf var3;
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
        String var2;
        if (v.field_d) {
          qi.field_M = true;
          vk.a(true, 841566312);
          hc.field_d = 0;
          if (param0 <= 101) {
            var2 = (String) null;
            ed.a((String) null, (byte) -16);
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                          stackIn_17_0 = (wb) (var4);
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var4 = (wb) ((Object) mc.field_a.d(-17713));
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            stackIn_20_0 = null;
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
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("ed.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
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
