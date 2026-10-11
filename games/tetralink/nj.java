/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static hl[] field_f;
    static int field_d;
    static String field_e;
    static String field_c;
    static int[] field_h;
    static int field_g;
    static String[] field_a;
    static ji field_b;

    final static boolean a(int param0, int param1, int param2, int param3) {
        boolean decompiledFrameRemainder0 = true;
        if (null == hd.field_s) {
          if (mm.field_y != null &&
            mm.field_y.h(5)) {
            mm.field_y = null;
            gg.c((byte) 43);
            return true;
          }
        } else {
          if (hd.field_s.a(-1)) {
            gg.c((byte) 43);
            return true;
          }
          if ((mm.field_y == null) &&
            (decompiledFrameRemainder0 = (param0 != 15780))) {
            field_h = (int[]) null;
            if (b.a(0)) {
              return true;
            }
            if (!ld.b(param3, param0 ^ -1885068379, param1, param2)) {
              return false;
            }
            return true;
          }
          if ((decompiledFrameRemainder0) &&
            (mm.field_y.h(5))) {
            mm.field_y = null;
            gg.c((byte) 43);
            return true;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (param0 != 15780)) {
          field_h = (int[]) null;
        }
        if (b.a(0)) {
          return true;
        }
        if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
          return true;
        }
        return false;
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = vi.field_a;
        synchronized (var1) {
          if (dh.field_m == bb.field_e) {
            return false;
          }
          dg.field_e = af.field_e[dh.field_m];
          tb.field_m = fm.field_c[dh.field_m];
          if (param0 != 28) {
            field_g = -102;
          }
          dh.field_m = dh.field_m + 1 & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static void a(String param0, byte param1, String param2, int param3, int param4) {
        in.field_g.field_Hb = in.field_g.field_Hb + ba.field_L.field_Hb;
        if (param1 != -48) {
          return;
        }
        try {
          in.field_g.field_N = param3;
          in.field_g.field_O = param2;
          in.field_g.field_jb = param0;
          ba.field_L.field_M = ba.field_L.field_M + ba.field_L.field_Hb;
          ba.field_L.field_Hb = param4;
          in.field_g.field_Hb = in.field_g.field_Hb - ba.field_L.field_Hb;
          ba.field_L.field_M = ba.field_L.field_M - ba.field_L.field_Hb;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_h = null;
        field_b = null;
        if (param0 > 93) {
          field_f = null;
          field_a = null;
          field_c = null;
          return;
        }
        String var2 = (String) null;
        nj.a((String) null, (byte) -11, (String) null, -21, -123);
        field_f = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_c = "Who can join";
        field_a = new String[255];
    }
}
