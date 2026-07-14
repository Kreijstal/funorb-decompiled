/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ak field_a;
    static oi field_b;
    static String field_c;

    final static void a(java.awt.Canvas param0, boolean param1) {
        oc.a((byte) -38, (java.awt.Component) (Object) param0);
        if (!param1) {
            return;
        }
        rm.a((java.awt.Component) (Object) param0, (byte) 38);
        if (ji.field_b != null) {
            ji.field_b.a((java.awt.Component) (Object) param0, true);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = EscapeVector.field_A;
        if (!param4) {
          rc.a(-25);
          if (param7 <= param5) {
            if (param5 >= param2) {
              if (param2 > param7) {
                ha.a(param0, param2, param7, param6, param1, 120, param3, param5, em.field_i);
                return;
              } else {
                ha.a(param6, param7, param2, param0, param1, 66, param3, param5, em.field_i);
                return;
              }
            } else {
              ha.a(param1, param5, param7, param6, param0, 42, param3, param2, em.field_i);
              return;
            }
          } else {
            if (param2 <= param7) {
              if (param5 >= param2) {
                ha.a(param1, param5, param2, param0, param6, 127, param3, param7, em.field_i);
                return;
              } else {
                ha.a(param0, param2, param5, param1, param6, 38, param3, param7, em.field_i);
                return;
              }
            } else {
              ha.a(param6, param7, param5, param1, param0, 41, param3, param2, em.field_i);
              return;
            }
          }
        } else {
          if (param7 <= param5) {
            if (param5 >= param2) {
              if (param2 > param7) {
                ha.a(param0, param2, param7, param6, param1, 120, param3, param5, em.field_i);
                return;
              } else {
                ha.a(param6, param7, param2, param0, param1, 66, param3, param5, em.field_i);
                return;
              }
            } else {
              ha.a(param1, param5, param7, param6, param0, 42, param3, param2, em.field_i);
              return;
            }
          } else {
            if (param2 <= param7) {
              if (param5 >= param2) {
                ha.a(param1, param5, param2, param0, param6, 127, param3, param7, em.field_i);
                return;
              } else {
                ha.a(param0, param2, param5, param1, param6, 38, param3, param7, em.field_i);
                return;
              }
            } else {
              ha.a(param6, param7, param5, param1, param0, 41, param3, param2, em.field_i);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -49153) {
          field_b = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static fn a(int param0, byte param1, fn param2, fn param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = param3.field_c;
          var5 = param3.field_b;
          if (param0 == 16384) {
            var5 = param2.field_c;
            var4 = param3.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-32769 == (param0 ^ -1)) {
            var4 = param2.field_c;
            var5 = param2.field_b;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((param0 ^ -1) == -49153) {
            var5 = param3.field_c;
            var4 = param2.field_b;
            break L2;
          } else {
            break L2;
          }
        }
        if (param1 <= 119) {
          field_b = null;
          return new fn(var4, var5);
        } else {
          return new fn(var4, var5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Out of shield!";
    }
}
