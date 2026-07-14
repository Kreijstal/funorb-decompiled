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
        int var6 = 0;
        L0: {
          var6 = 2;
          if ((Object) (Object) se.field_S != (Object) (Object) param5) {
            break L0;
          } else {
            var6 = 1;
            break L0;
          }
        }
        L1: {
          param5.b(param2, param1 + -var6, param3 + -var6, 0, -1);
          param5.b(param2, -var6 + param1, param3, 0, -1);
          param5.b(param2, param1 + -var6, param3 + var6, 0, -1);
          param5.b(param2, param1, param3 - var6, 0, -1);
          param5.b(param2, param1, var6 + param3, 0, -1);
          param5.b(param2, param1 - -var6, param3 + -var6, 0, -1);
          param5.b(param2, var6 + param1, param3, 0, -1);
          param5.b(param2, param1 + var6, param3 + var6, 0, -1);
          if ((Object) (Object) param5 == (Object) (Object) w.field_kb) {
            param5.b(param2, 1 + param1, param3 + -var6, 0, -1);
            param5.b(param2, param1 - 1, -var6 + param3, 0, -1);
            param5.b(param2, param1 + var6, param3 + -1, 0, -1);
            param5.b(param2, -var6 + param1, -1 + param3, 0, -1);
            param5.b(param2, var6 + param1, 1 + param3, 0, -1);
            param5.b(param2, param1 - var6, 1 + param3, 0, -1);
            param5.b(param2, param1 - -1, var6 + param3, 0, -1);
            param5.b(param2, param1 - 1, var6 + param3, 0, -1);
            break L1;
          } else {
            break L1;
          }
        }
        if (param4 == 75) {
          param5.b(param2, param1, param3, param0, -1);
          return;
        } else {
          field_c = null;
          param5.b(param2, param1, param3, param0, -1);
          return;
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
        } else {
          wi.a((byte) -51, param0);
          pb.a(param0, -2);
          em.a((byte) -113, param0);
          bg.a(-120);
          bb.a(true);
          gd.field_e = 0 - sh.field_i;
          return;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        if (v.field_d) {
          qi.field_M = true;
          vk.a(true, 841566312);
          hc.field_d = 0;
          if (param0 <= 101) {
            var2 = null;
            wb discarded$2 = ed.a((String) null, (byte) -16);
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
        int var3 = 0;
        wb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = client.field_A ? 1 : 0;
        if (mc.field_a != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var7 = (CharSequence) (Object) param0;
              var2 = kf.a(var7, (byte) 2);
              var3 = 38 % ((-44 - param1) / 47);
              if (var2 != null) {
                var4 = (wb) (Object) mc.field_a.a(24710, (long)var2.hashCode());
                L0: while (true) {
                  if (var4 != null) {
                    var8 = (CharSequence) (Object) var4.field_Ob;
                    var5 = kf.a(var8, (byte) 2);
                    if (var5.equals((Object) (Object) var2)) {
                      return var4;
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
