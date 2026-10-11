/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static int field_c;
    static char[] field_d;
    static int field_e;
    static String field_b;
    static boolean field_a;

    final static boolean a(char param0, byte param1) {
        if (param1 != -55) {
          return false;
        }
        if (param0 >= 65) {
          if (90 >= param0) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (122 >= param0) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (122 < param0) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 376) {
          field_c = -1;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Torquing.field_u;
        try {
          if (param0 < 0) {
            ra.a((byte) 101);
          }
          if (im.l(169)) {
            w.field_G.a(true, ha.field_e, oe.field_a, false);
            w.field_G.g((byte) -107);
            while (np.a((byte) -13)) {
              w.field_G.a(e.field_f, 24454, m.field_t);
            }
            return;
          }
          if (dg.field_i != null &&
            dg.field_i.field_b) {
            ug.a(-116);
            w.field_G.a(new i(w.field_G, bl.field_b), (byte) 100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "ra.D(" + param0 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 != 252) {
          ra.a('ﾷ', -121);
          if (param0 == 160) {
            return true;
          }
          if (32 == param0) {
            return true;
          }
          if (param0 == 95) {
            return true;
          }
          if (45 != param0) {
            return false;
          }
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (32 == param0) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (45 != param0) {
          return false;
        }
        return true;
    }

    static {
        field_d = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        ei discarded$0 = new ei();
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = false;
    }
}
