/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String[] field_a;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= g.field_o &&
            param1.length() <= oc.field_c) {
            if (param0 == 107) {
              return false;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ph.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(hh.field_M);
          param0.removeMouseMotionListener(hh.field_M);
          param0.removeFocusListener(hh.field_M);
          bb.field_I = 0;
          int var2_int = 102 / ((param1 - 71) / 52);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ph.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 35) {
          java.awt.Component var2 = (java.awt.Component) null;
          ph.a((java.awt.Component) null, 91);
        }
    }

    final static void a(int param0, byte param1, int param2, wh param3) {
        try {
          wh.field_f = param0;
          int var4_int = 10 / ((69 - param1) / 55);
          id.field_v = param2;
          ki.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ph.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          mc.field_l > 0) {
          fieldTemp$3 = mc.field_l - 1;
          mc.field_l = mc.field_l - 1;
          var2_ref_byte__ = m.field_a[fieldTemp$3];
          m.field_a[mc.field_l] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          re.field_Z > 0) {
          fieldTemp$4 = re.field_Z - 1;
          re.field_Z = re.field_Z - 1;
          var2_ref_byte__Lifetime1 = rb.field_c[fieldTemp$4];
          rb.field_c[re.field_Z] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 == 30000 &&
          0 < li.field_S) {
          fieldTemp$5 = li.field_S - 1;
          li.field_S = li.field_S - 1;
          var2_ref_byte__Lifetime2 = gj.field_s[fieldTemp$5];
          gj.field_s[li.field_S] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != vg.field_a) {
          for (var2 = 0; var2 < ui.field_D.length; var2++) {
            if (ui.field_D[var2] == param1 &&
              0 < d.field_e[var2]) {
              dupTemp$6 = d.field_e[var2] - 1;
              arrayValue$7 = vg.field_a[var2];
              d.field_e[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              vg.field_a[var2][d.field_e[var2]] = null;
              return var3;
            }
          }
        }
        if (param0 >= -30) {
          field_b = -125;
        }
        return new byte[param1];
    }

    static {
        field_a = new String[255];
    }
}
