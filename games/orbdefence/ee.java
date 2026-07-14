/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ee {
    private boolean field_a;
    static java.util.zip.CRC32 field_f;
    static String[] field_d;
    private String field_e;
    static fj[] field_b;
    static int[] field_g;
    static String field_c;

    ee(String param0) {
        this(param0, false);
    }

    final boolean b(int param0) {
        if (param0 > -97) {
            field_g = null;
            return ((ee) this).field_a;
        }
        return ((ee) this).field_a;
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        vc var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param0 <= (param2 ^ -1)) {
          var4 = param3;
          var5 = new vc();
          var5.a(100);
          var5.a((byte) 48, var4, (long)(param1 * 8));
          var6 = new byte[64];
          var5.a(var6, (byte) 87, 0);
          return var6;
        } else {
          var8 = new byte[param1];
          var4 = var8;
          var5_int = 0;
          L0: while (true) {
            if (param1 <= var5_int) {
              var5 = new vc();
              var5.a(100);
              var5.a((byte) 48, var4, (long)(param1 * 8));
              var6 = new byte[64];
              var5.a(var6, (byte) 87, 0);
              return var6;
            } else {
              var8[var5_int] = param3[param2 + var5_int];
              var5_int++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0) {
        if (!rl.a((byte) 109)) {
            return;
        }
        gb.a(true, param0, false);
    }

    final String a(boolean param0) {
        if (!param0) {
            String discarded$0 = ((ee) this).a(true);
            return ((ee) this).field_e;
        }
        return ((ee) this).field_e;
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        if (param0 < 96) {
            return;
        }
        field_d = null;
        field_f = null;
        field_c = null;
    }

    ee(String param0, boolean param1) {
        ((ee) this).field_e = param0;
        if (((ee) this).field_e == null) {
            ((ee) this).field_e = "";
        }
        ((ee) this).field_a = param1 ? true : false;
        if (((ee) this).field_e.length() == 0) {
            ((ee) this).field_a = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = "Connection timed out. Please try using a different server.";
        field_g = new int[8192];
        field_f = new java.util.zip.CRC32();
    }
}
