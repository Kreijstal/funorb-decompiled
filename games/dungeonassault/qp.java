/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qp {
    static String field_c;
    private RandomAccessFile field_g;
    static String field_e;
    static cn field_a;
    private long field_d;
    private long field_b;
    static String[] field_f;

    final void a(int param0) throws IOException {
        if (this.field_g != null) {
            this.field_g.close();
            this.field_g = null;
        }
        if (param0 != 0) {
            this.field_g = (RandomAccessFile) null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        cn discarded$0 = null;
        try {
            if ((this.field_b + (long)param3 ^ -1L) < (this.field_d ^ -1L)) {
                this.field_g.seek(this.field_d);
                this.field_g.write(1);
                throw new EOFException();
            }
            this.field_g.write(param2, param0, param3);
            if (param1 < 36) {
                discarded$0 = qp.a(true);
            }
            this.field_b = this.field_b + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "qp.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static cn a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        var5 = DungeonAssault.field_K;
        var6 = new cn(20, 20);
        jh.a(var6);
        gf.b(0, 0, 20, 20, 16711680);
        gf.f(10, 10, 6, 0);
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -21) {
              var2 = 0;
              var3 = 0;
              L1: while (true) {
                if (20 <= var3) {
                  jh.b();
                  return var6;
                } else {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= 20) {
                      var3++;
                      continue L1;
                    } else {
                      if (((-10 + var3) * (var3 - 10) + (var4 - 10) * (var4 + -10) ^ -1) < -101) {
                        var6.field_B[var2] = 0;
                        var2++;
                        var4++;
                        continue L2;
                      } else {
                        var2++;
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              gf.b(-var2 + 18, var2, 4, 16711680);
              var2++;
              continue L0;
            }
          }
        } else {
          return (cn) null;
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 <= 46) {
            return -31L;
        }
        return this.field_g.length();
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 18) {
            this.field_g = (RandomAccessFile) null;
        }
        this.field_g.seek(param0);
        this.field_b = param0;
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == -11274) {
              L1: {
                var5_int = this.field_g.read(param3, param0, param2);
                if (var5_int <= 0) {
                  break L1;
                } else {
                  this.field_b = this.field_b + (long)var5_int;
                  break L1;
                }
              }
              stackOut_5_0 = var5_int;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 73;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void b(byte param0) {
        cn discarded$0 = null;
        field_a = null;
        if (param0 != 56) {
            discarded$0 = qp.a(false);
        }
        field_c = null;
        field_f = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (!(null == this.field_g)) {
            System.out.println("");
            this.a(0);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        if (param0 != -24) {
            field_c = (String) null;
        }
        if ((param1 ^ -1) != 0) {
            bf.field_f[param1].a(param2);
        } else {
            tb.a(param2, 1);
        }
    }

    qp(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                discarded$0 = param0.delete();
            }
            this.field_g = new RandomAccessFile(param0, param1);
            this.field_d = param2;
            this.field_b = 0L;
            var5_int = this.field_g.read();
            if (0 != (var5_int ^ -1)) {
                if (!param1.equals("r")) {
                    this.field_g.seek(0L);
                    this.field_g.write(var5_int);
                }
            }
            this.field_g.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "to return to the normal view.";
        field_c = "Create a free Account";
        field_f = new String[]{"Fire Immunity", "A creature of the lower planes, the <%0> cannot be harmed by any form of fire - such as that of a dragon."};
    }
}
