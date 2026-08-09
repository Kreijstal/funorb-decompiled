/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class an {
    static int[] field_a;
    static int field_f;
    static boolean field_d;
    private RandomAccessFile field_e;
    static String field_g;
    static int field_h;
    private long field_c;
    private long field_b;

    final int b(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = 17 / ((param0 - -73) / 36);
              var6 = this.field_e.read(param2, param3, param1);
              if (var6 <= 0) {
                break L1;
              } else {
                this.field_b = this.field_b + (long)var6;
                break L1;
              }
            }
            stackIn_3_0 = var6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("an.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
            field_d = false;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        rj.field_c = 1000000000L / (long)param1;
        int var2 = 31 % ((param0 - 76) / 38);
    }

    final static pe a(byte param0, String param1) {
        int var2_int = 0;
        String var3 = null;
        pe var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        pe stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (null != tc.field_o) {
              L1: {
                var2_int = -65 / ((-21 - param0) / 63);
                var7 = (CharSequence) ((Object) param1);
                var3 = cl.a(-95, var7);
                if (var3 != null) {
                  break L1;
                } else {
                  var3 = param1;
                  break L1;
                }
              }
              var4 = (pe) ((Object) tc.field_o.a(-7895, (long)var3.hashCode()));
              L2: while (true) {
                if (var4 != null) {
                  L3: {
                    var8 = (CharSequence) ((Object) var4.field_ob);
                    var5 = cl.a(-95, var8);
                    if (var5 == null) {
                      var5 = var4.field_ob;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var5.equals(var3)) {
                    stackIn_15_0 = (pe) (var4);
                    break L0;
                  } else {
                    var4 = (pe) ((Object) tc.field_o.c(1));
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("an.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_15_0;
    }

    final long a(byte param0) throws IOException {
        if (param0 <= 48) {
            return -46L;
        }
        return this.field_e.length();
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_e == null)) {
            System.out.println("");
            this.b(-121);
        }
    }

    final static boolean c(int param0) {
        if (param0 == 0) {
          if (ij.field_o != null) {
            if (!ij.field_o.d(-127)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_f = -6;
          if (ij.field_o != null) {
            if (!ij.field_o.d(-127)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_e.seek(param1);
        if (param0 != 0) {
            return;
        }
        this.field_b = param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if ((this.field_b + (long)param1 ^ -1L) < (this.field_c ^ -1L)) {
            this.field_e.seek(this.field_c);
            this.field_e.write(1);
            throw new EOFException();
        }
        if (param3 <= 79) {
            return;
        }
        try {
            this.field_e.write(param2, param0, param1);
            this.field_b = this.field_b + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "an.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    an(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
                param0.delete();
            }
            this.field_e = new RandomAccessFile(param0, param1);
            this.field_c = param2;
            this.field_b = 0L;
            var5_int = this.field_e.read();
            if (0 != (var5_int ^ -1) && !param1.equals("r")) {
                this.field_e.seek(0L);
                this.field_e.write(var5_int);
            }
            this.field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "an.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(int param0) throws IOException {
        String var3;
        L0: {
          if (this.field_e != null) {
            this.field_e.close();
            this.field_e = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -98) {
          var3 = (String) null;
          an.a((byte) 1, (String) null);
          return;
        } else {
          return;
        }
    }

    static {
        field_d = false;
        field_g = "ESCAPED: <times> 2";
    }
}
