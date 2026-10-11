/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class da {
    static long field_c;
    static String field_i;
    private java.util.zip.Inflater field_d;
    static String field_f;
    static cj field_h;
    static int field_a;
    static volatile int field_e;
    static byte[] field_b;
    static String field_g;

    public static void a(byte param0) {
        int var1 = -54 % ((param0 + 24) / 59);
        field_b = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_f = null;
    }

    final void a(byte[] param0, k param1, int param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 <= 26) {
              return;
            }
            if (param1.field_m[param1.field_j] == 31 &&
              param1.field_m[1 + param1.field_j] == -117) {
              if (null == this.field_d) {
                this.field_d = new java.util.zip.Inflater(true);
              }
              try {
                this.field_d.setInput(param1.field_m, 10 + param1.field_j, -8 - param1.field_j + (-10 + param1.field_m.length));
                this.field_d.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_d.reset();
                throw new RuntimeException("");
              }
              this.field_d.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("da.A(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int param0) {
        if (param0 != 8) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static void b(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            if (null != i.field_a) {
              i.field_a.f(31);
            }
            if (null != rn.field_d) {
              rn.field_d.a((byte) 77);
            }
            if (param0 != -8) {
              field_g = (String) null;
            }
            if (null != hc.field_b) {
              try {
                hc.field_b.a((byte) -106);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null == rl.field_r) {
              return;
            }
            for (var1_int = 0; rl.field_r.length > var1_int; var1_int++) {
              if (rl.field_r[var1_int] != null) {
                try {
                  rl.field_r[var1_int].a((byte) -125);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw fa.a((Throwable) ((Object) var1_ref), "da.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static n a(int param0, int param1, byte[] param2) {
        n var3 = null;
        RuntimeException var3_ref = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -44) {
            field_c = 35L;
          }
          var3 = new n(param2);
          nq.field_s.a(var3, false);
          ih.a(var3, 1, param1);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("da.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public da() {
        this(-1, 1000000, 1000000);
    }

    final static ri[] a(String param0, ul param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ri[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 19) {
            da.a((byte) -85);
          }
          var4_int = param1.a(param3, (byte) -65);
          var5 = param1.a(param0, var4_int, param2 ^ -20);
          stackIn_3_0 = pf.a(var4_int, param1, -75, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("da.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static ja a(int param0, String param1) {
        ef var2 = null;
        RuntimeException var2_ref = null;
        ja var3 = null;
        int var4 = 0;
        ja stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = pb.field_e;
          var3 = new ja(var2.a(param1), 27);
          var3.a();
          var2.b(param1, var3.field_x / 2, 17, 16777215, -1);
          var4 = -13 % ((param0 + 44) / 43);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("da.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private da(int param0, int param1, int param2) {
    }

    static {
        field_e = -1;
        field_f = "Fastest";
        field_i = "Email (Login):";
        field_b = new byte[]{(byte)4};
        field_g = "Fool the fools!";
    }
}
