/*
 * Decompiled by CFR-JS 0.4.0.
 */
class br {
    br field_b;
    br field_d;
    static int field_a;
    long field_e;
    static cj field_c;

    final void a(boolean param0) {
        if (((br) this).field_b != null) {
          ((br) this).field_b.field_d = ((br) this).field_d;
          ((br) this).field_d.field_b = ((br) this).field_b;
          if (!param0) {
            int discarded$2 = br.a(false, 40, -48, -58);
            ((br) this).field_b = null;
            ((br) this).field_d = null;
            return;
          } else {
            ((br) this).field_b = null;
            ((br) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != 4) {
            return true;
        }
        if (((br) this).field_b != null) {
            return true;
        }
        return false;
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param1 + param2 - -param3 <= oo.field_l) {
          return param2 + param1;
        } else {
          if (-1 < (-param3 + param1 ^ -1)) {
            if (!param0) {
              int discarded$2 = br.a(false, -49, -96, 42);
              return oo.field_l + -param3;
            } else {
              return oo.field_l + -param3;
            }
          } else {
            return param1 + -param3;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (!(!cr.a((byte) 27))) {
            param0 = false;
        }
        gg.a(124, param0);
        hq.b((byte) 117);
        if (param1 != 2) {
            field_a = -119;
            return;
        }
    }

    final static void a(int param0, byte[] param1, int param2, int param3) {
        param1[param0 * 4] = (byte)(param3 >>> -1308782312);
        if (param2 >= -71) {
          return;
        } else {
          param1[param0 * 4 + 1] = (byte)(param3 >>> -484208720);
          param1[4 * param0 + 2] = (byte)(param3 >>> -1156451000);
          param1[3 + 4 * param0] = (byte)param3;
          return;
        }
    }

    public static void b(byte param0) {
        if (param0 != 48) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 250;
    }
}
