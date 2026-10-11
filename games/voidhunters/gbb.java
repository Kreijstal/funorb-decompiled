/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gbb extends rqa {
    static int field_o;
    static int field_q;
    static String field_p;

    gbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(159, 62, param0[0].a(106));
          if (param1 > -119) {
            field_q = 105;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gbb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        int var4;
        int stackIn_11_0 = 0;
        int stackIn_46_0 = 0;
        if (param3 != 23) {
          return true;
        }
        if (wga.field_a == null) {
          if (!fva.field_p) {
            if (!uga.field_d &&
              9 != pma.field_o &&
              pma.field_o != 10 &&
              pma.field_o != 11) {
              if (pma.field_o != 80) {
                return false;
              }
              if (!lmb.a(118)) {
                return false;
              }
              fva.field_p = true;
              return true;
            }
            return ic.a(param0, -9307, param1);
          }
          if (!lmb.a(-115)) {
            return false;
          }
          stackIn_46_0 = (!tl.b(param2, param0, -85)) ? 0 : 1;
          var4 = stackIn_46_0;
          if (pma.field_o == 80 ||
            84 == pma.field_o) {
            var4 = 1;
            fva.field_p = false;
          }
        } else {
          if (pma.field_o == 13) {
            wga.field_a = null;
            return true;
          }
          if (!fva.field_p) {
            if (uga.field_d) {
              return ic.a(param0, -9307, param1);
            }
            if (9 == pma.field_o) {
              return ic.a(param0, -9307, param1);
            }
            if (pma.field_o != 10 &&
              pma.field_o != 11) {
              if (pma.field_o != 80) {
                return false;
              }
              if (!lmb.a(118)) {
                return false;
              }
              fva.field_p = true;
              return true;
            }
            return ic.a(param0, -9307, param1);
          }
          if (!lmb.a(-115)) {
            return false;
          }
          stackIn_11_0 = (!tl.b(param2, param0, -85)) ? 0 : 1;
          var4 = stackIn_11_0;
          if (pma.field_o == 80) {
            var4 = 1;
            fva.field_p = false;
          } else {
            if (84 == pma.field_o) {
              var4 = 1;
              fva.field_p = false;
            }
          }
        }
        if (pma.field_o == 13) {
          dr.a(26718);
          var4 = 1;
          fva.field_p = false;
        }
        return var4 != 0;
    }

    final static void a(fh param0, fh param1, byte param2) {
        try {
          if (null != param0.field_d) {
            param0.d((byte) -35);
          }
          param0.field_e = param1.field_e;
          param0.field_d = param1;
          param0.field_d.field_e = param0;
          if (param2 != -68) {
            gbb.a(12, 69, 48, (byte) 94);
          }
          param0.field_e.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gbb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        if (!param0) {
          field_o = 71;
        }
    }

    static {
        field_o = 256;
        field_p = "Only show game chat from my friends";
    }
}
