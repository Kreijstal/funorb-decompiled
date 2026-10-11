/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc {
    int field_b;
    int field_c;
    static String field_e;
    int field_a;
    int field_g;
    static String field_i;
    int[][] field_d;
    int field_h;
    int field_f;

    public static void a(int param0) {
        field_e = null;
        int var1 = 112 / ((-60 - param0) / 60);
        field_i = null;
    }

    final static void a(int param0, ce param1, boolean param2, byte param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        RuntimeException var4_ref = null;
        try {
          var4 = ig.field_l;
          synchronized (var4) {
            if (param3 > -61) {
              field_e = (String) null;
            }
            if (ni.field_N != null) {
              nb.field_c.b(ni.field_N);
            }
            kn.field_b = param0;
            ni.field_N = new o(param1);
            ni.field_N.d(kn.field_b * kc.field_b / 64);
            ni.field_N.a(param2);
            ig.field_l.b();
            nb.field_c.c(ni.field_N);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    vc(DataInputStream param0, int param1) throws IOException {
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var6 = null;
        try {
          this.field_a = param0.readUnsignedByte();
          this.field_h = this.field_a << 5;
          this.field_f = param0.readUnsignedByte();
          this.field_g = this.field_f << 5;
          this.field_c = param0.readUnsignedByte();
          this.field_b = this.field_c;
          if (param1 >= 10) {
            this.field_b = param0.readUnsignedByte();
          }
          this.field_d = new int[this.field_a * this.field_f][];
          for (var3_int = 0; this.field_a * this.field_f > var3_int; var3_int += 4) {
            var4 = param0.readByte();
            for (var5 = 0; var5 < 4; var5++) {
              if ((var3_int + var5) < (this.field_a * this.field_f)) {
                if ((var4 & 3) == 0) {
                  this.field_d[var3_int + var5] = null;
                } else {
                  if ((var4 & 3) != 1) {
                    this.field_d[var3_int + var5] = new int[32];
                    var6 = new int[32];
                    bf.a(0, 32, param0, 0, 32, var6, 2147483647);
                  } else {
                    this.field_d[var5 + var3_int] = si.field_v;
                  }
                }
                var4 = var4 >>> 2;
                continue;
              }
              break;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("vc.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = "Reload game";
        field_e = "Passwords must be between 5 and 20 characters long";
    }
}
