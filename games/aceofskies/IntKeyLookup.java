/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class IntKeyLookup {
    static int field_b;
    static CipherPacketBuffer field_c;
    static boolean field_a;
    private int[] field_d;

    final static char a(byte param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        var2 = param0 & 255;
        if (param1 != 29337) {
          field_b = 43;
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (128 > var2) {
            return (char)var2;
          }
          if (var2 < 160) {
            var3 = te.field_e[-128 + var2];
            if (var3 == 0) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 > var2) {
          return (char)var2;
        }
        if (var2 >= 160) {
          return (char)var2;
        }
        var3Lifetime1 = te.field_e[-128 + var2];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        var2Lifetime1 = var3Lifetime1;
        return (char)var2Lifetime1;
    }

    final static void a(byte param0, int param1, File param2, byte[] param3) throws IOException {
        DataInputStream var4 = null;
        try {
          var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param2)))));
          if (param0 > -64) {
            IntKeyLookup.a(115);
          }
          try {
            var4.readFully(param3, 0, param1);
          } catch (EOFException eOFException) {
          }
          var4.close();
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > 39) {
          return;
        }
        IntKeyLookup.a(-14);
    }

    final int a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!param0) {
          var3 = -1 + (this.field_d.length >> 1);
          var4 = param1 & var3;
          while (true) {
            var5 = this.field_d[var4 + (var4 + 1)];
            if (var5 == -1) {
              return -1;
            }
            if (this.field_d[var4 + var4] == param1) {
              return var5;
            }
            var4 = 1 + var4 & var3;
          }
        }
        field_c = (CipherPacketBuffer) null;
        var3Lifetime1 = -1 + (this.field_d.length >> 1);
        var4Lifetime1 = param1 & var3Lifetime1;
        while (true) {
          var5Lifetime1 = this.field_d[var4Lifetime1 + (var4Lifetime1 + 1)];
          if (var5Lifetime1 == -1) {
            return -1;
          }
          if (this.field_d[var4Lifetime1 + var4Lifetime1] == param1) {
            return var5Lifetime1;
          }
          var4Lifetime1 = 1 + var4Lifetime1 & var3Lifetime1;
        }
    }

    IntKeyLookup(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= (param0.length >> 1) + param0.length) {
            var2_int = var2_int << 1;
          }
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_d[1 + var4 + var4] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("nm.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
