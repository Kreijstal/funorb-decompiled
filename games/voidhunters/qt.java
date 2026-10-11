/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt extends rqa {
    static String field_o;

    qt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2) {
        String var4 = null;
        int var3 = ohb.field_o != null ? 1 : 0;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime1Lifetime1;
        if (pma.field_o != 9) {
          if (pma.field_o == 10) {
            if (var3 != 0) {
              return false;
            }
            or.a(0);
            return true;
          }
          if (pma.field_o == 11) {
            if (!cha.field_o) {
              if (param1 == 2) {
                return false;
              }
              return false;
            }
            if (2 != gi.field_a) {
              if (gi.field_a != 2) {
                if (var3 != 0) {
                  return false;
                }
                if (!jpa.b(param1 + 5)) {
                  return true;
                }
                var4 = (String) null;
                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              if (!jpa.b(param1 + 5)) {
                return true;
              }
              var4 = (String) null;
              va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
              return true;
            }
            if (ira.a(hb.field_b, cwa.field_b, 41)) {
              if (gi.field_a != 2) {
                if (var3 == 0) {
                  if (jpa.b(param1 + 5)) {
                    var4Lifetime2 = (String) null;
                    va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                  }
                  return true;
                }
                return false;
              }
              if (jpa.b(param1 + 5)) {
                var4Lifetime2 = (String) null;
                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              return true;
            }
            return false;
          }
          if (param1 != 2) {
            return false;
          }
          return false;
        }
        if (!jeb.a(abb.field_a, wrb.field_p, itb.field_p, rea.field_d, (byte) -93)) {
          if (pma.field_o == 10) {
            if (var3 != 0) {
              return false;
            }
            or.a(0);
            return true;
          }
          if (pma.field_o == 11) {
            if (!cha.field_o) {
              if (param1 != 2) {
                return false;
              }
              return false;
            }
            if (2 != gi.field_a) {
              if (gi.field_a != 2) {
                if (var3 == 0) {
                  if (jpa.b(param1 + 5)) {
                    var4Lifetime1 = (String) null;
                    va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                  }
                  return true;
                }
                return false;
              }
              if (jpa.b(param1 + 5)) {
                var4Lifetime1 = (String) null;
                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              return true;
            }
            if (ira.a(hb.field_b, cwa.field_b, 41)) {
              if (gi.field_a != 2) {
                if (var3 == 0) {
                  if (jpa.b(param1 + 5)) {
                    var4Lifetime1Lifetime1 = (String) null;
                    va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                  }
                  return true;
                }
                return false;
              }
              if (jpa.b(param1 + 5)) {
                var4Lifetime1Lifetime1 = (String) null;
                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              return true;
            }
            return false;
          }
          if (param1 != 2) {
            return false;
          }
          return false;
        }
        if (abb.field_a != 2 &&
          var3 != 0) {
          return false;
        }
        return fia.a(wrb.field_p, abb.field_a, (byte) 123, itb.field_p, rea.field_d);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        phb[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (phb[]) null;
            qt.a((phb[]) null, 64, 92, -41, -29, false);
          }
          si.a(50, 62, param0[0].a(48));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qt.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 <= 119) {
          field_o = (String) null;
        }
    }

    final static void a(phb[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param0 != null &&
            param3 > 0) {
            var6_int = param0[0].field_m;
            var7 = param0[2].field_m;
            var8 = param0[1].field_m;
            param0[0].e(param4, param2, param1);
            param0[2].e(param3 + param4 - var7, param2, param1);
            dma.a(ola.field_o);
            dma.g(var6_int + param4, param2, param3 + (param4 - var7), param2 + param0[1].field_n);
            if (!param5) {
              qt.a(27, -59, -55);
            }
            var9 = var6_int + param4;
            var10 = -var7 + (param4 + param3);
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param0[1].e(param4, param2, param1);
            }
            dma.b(ola.field_o);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("qt.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_o = "Grappling hook";
    }
}
