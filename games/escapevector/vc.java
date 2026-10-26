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
        try {
          field_e = null;
          int var1_int = 112 / ((-60 - param0) / 60);
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vc.A(" + param0 + ')');
        }
    }

    final static void a(int param0, ce param1, boolean param2, byte param3) {
        try {
          String stackIn_16_2 = null;
          try {
            Object var4 = ig.field_l;
            synchronized (var4) {
              if (param3 > -61) {
                field_e = (String) null;
              }
              if (ni.field_N != null) {
                nb.field_c.b((il) ((Object) ni.field_N));
              }
              kn.field_b = param0;
              ni.field_N = new o(param1);
              ni.field_N.d(kn.field_b * kc.field_b / 64);
              ni.field_N.a(param2);
              ig.field_l.b();
              nb.field_c.c((il) ((Object) ni.field_N));
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            RuntimeException var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_15_0 = var4_ref;
            StringBuilder stackIn_15_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vc(DataInputStream param0, int param1) throws IOException {
        String stackIn_30_2 = null;
        int var7 = EscapeVector.field_A;
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
          int var3_int = 0;
          L1: while (true) {
            int stackIn_5_0 = this.field_a * this.field_f;
            int stackIn_5_1 = var3_int;
            if (stackIn_5_0 > stackIn_5_1) {
              int var4 = param0.readByte();
              if (var7 != 0) {
                return;
              }
              int var5 = 0;
              while (var5 < 4) {
                stackIn_5_0 = ~(var3_int + var5);
                stackIn_5_1 = ~(this.field_a * this.field_f);
                if (stackIn_5_0 > stackIn_5_1) {
                  if ((var4 & 3) == 0) {
                    this.field_d[var3_int + var5] = null;
                  } else if ((var4 & 3) == 1) {
                    this.field_d[var5 + var3_int] = si.field_v;
                  } else {
                    int[] array$0 = new int[32];
                    this.field_d[var3_int + var5] = array$0;
                    int[] var6 = array$0;
                    bf.a(0, 32, param0, 0, 32, var6, 2147483647);
                  }
                  var4 = var4 >>> 2;
                  var5++;
                  continue;
                }
                break;
              }
              var3_int += 4;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_29_0 = var3;
          StringBuilder stackIn_29_1 = new StringBuilder().append("vc.<init>(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = "Reload game";
        field_e = "Passwords must be between 5 and 20 characters long";
    }
}
