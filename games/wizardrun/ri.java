/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    private long field_e;
    static boolean field_b;
    private long field_d;
    private RandomAccessFile field_c;
    static int field_a;

    final void a(long param0, byte param1) throws IOException {
        String var5;
        if (param1 != -24) {
          var5 = (String) null;
          ri.a((byte) -93, (String) null);
          this.field_c.seek(param0);
          this.field_d = param0;
          return;
        } else {
          this.field_c.seek(param0);
          this.field_d = param0;
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        try {
            if ((this.field_e ^ -1L) > (this.field_d + (long)param0 ^ -1L)) {
                this.field_c.seek(this.field_e);
                this.field_c.write(1);
                throw new EOFException();
            }
            this.field_c.write(param1, param3, param0);
            if (!param2) {
                this.field_c = (RandomAccessFile) null;
            }
            this.field_d = this.field_d + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ri.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 4836) {
              L1: {
                var5_int = this.field_c.read(param0, param2, param3);
                if (var5_int > 0) {
                  this.field_d = this.field_d + (long)var5_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = var5_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -82;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ri.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final long b(int param0) throws IOException {
        if (param0 != 0) {
            ri.c(97);
            return this.field_c.length();
        }
        return this.field_c.length();
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param1.length() <= var2_int) {
                if (param0 == -56) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = (String) null;
                  ri.a((byte) -90, (String) null);
                  return false;
                }
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (f.a((char) var3, true)) {
                    break L2;
                  } else {
                    if (vl.a((char) var3, -5717)) {
                      break L2;
                    } else {
                      stackIn_6_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ri.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_c) {
            System.out.println("");
            this.a(-1);
        }
    }

    final void a(int param0) throws IOException {
        if (null == this.field_c) {
          if (param0 != -1) {
            this.field_d = 71L;
            return;
          } else {
            return;
          }
        } else {
          this.field_c.close();
          this.field_c = null;
          if (param0 == -1) {
            return;
          } else {
            this.field_d = 71L;
            return;
          }
        }
    }

    ri(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                param0.delete();
            }
            this.field_c = new RandomAccessFile(param0, param1);
            this.field_e = param2;
            this.field_d = 0L;
            var5_int = this.field_c.read();
            if ((var5_int ^ -1) != 0 && !param1.equals("r")) {
                this.field_c.seek(0L);
                this.field_c.write(var5_int);
            }
            this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(nj param0, int param1, byte param2) {
        mg var3 = null;
        try {
            if (param2 != 121) {
                String var4 = (String) null;
                ri.a((byte) -79, (String) null);
            }
            var3 = n.field_b;
            var3.c((byte) 113, param1);
            var3.b((byte) 11, 5);
            var3.b((byte) 11, 0);
            var3.b(-1947079288, param0.field_l);
            var3.b((byte) 11, param0.field_j);
            var3.b((byte) 11, param0.field_o);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ri.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 < 18) {
            return false;
        }
        return ib.a((byte) 46, jg.f(1));
    }

    static {
    }
}
