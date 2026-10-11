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
          field_g = (int[]) null;
          return this.field_a;
        }
        return this.field_a;
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        vc var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 > ~param2) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; param1 > var5_int; var5_int++) {
              var8[var5_int] = param3[param2 + var5_int];
            }
          } else {
            var4 = param3;
          }
          var5 = new vc();
          var5.a(100);
          var5.a((byte) 48, var4, (long)(param1 * 8));
          var6 = new byte[64];
          var5.a(var6, (byte) 87, 0);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ee.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
          this.a(true);
          return this.field_e;
        }
        return this.field_e;
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
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          if (this.field_e == null) {
            this.field_e = "";
          }
          stackIn_6_1 = (param1);
          this.field_a = stackIn_6_1;
          if (this.field_e.length() != 0) {
            return;
          }
          this.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ee.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = "Connection timed out. Please try using a different server.";
        field_g = new int[8192];
        field_f = new java.util.zip.CRC32();
    }
}
