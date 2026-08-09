/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements db {
    static uk field_b;
    static lk field_a;
    static ed[] field_c;
    static java.security.SecureRandom field_d;
    static String[] field_e;

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param1 <= -37) {
                break L1;
              } else {
                ae.a(45L, (byte) -21);
                break L1;
              }
            }
            var5 = param3;
            L2: while (true) {
              if (var5 >= param2) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = al.field_a[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 680910440;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ae.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(long param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            if (param1 == 118) {
              try {
                L0: {
                  Thread.sleep(param0);
                  break L0;
                }
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var3 = (InterruptedException) (Object) decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0) {
        af.field_e.a((byte) 12);
        if (param0 != -1021831775) {
            field_b = (uk) null;
        }
        if (!od.field_j.d(-3994)) {
            return un.f(param0 + 1021831755);
        }
        return 0;
    }

    final static te[] a(String param0, String param1, byte param2, mf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        te[] stackIn_2_0 = null;
        te[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -45) {
              var4_int = param3.b(-1, param0);
              var5 = param3.a(var4_int, param1, true);
              stackIn_4_0 = bl.a(var5, 255, param3, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (te[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ae.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 1) {
            ae.a(-128);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ed var8 = null;
        hm var9 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -14) {
                break L1;
              } else {
                var9 = (hm) null;
                this.a(-95, 88, 12, (hm) null, false);
                break L1;
              }
            }
            L2: {
              var6_int = param0 + param3.field_k;
              var7 = param1 + param3.field_j;
              mn.a(-27951, var6_int, var7, param3.field_g, param3.field_x);
              var8 = ul.field_E[1];
              if (!(param3 instanceof hc)) {
                break L2;
              } else {
                if (!((hc) ((Object) param3)).field_z) {
                  break L2;
                } else {
                  var8.c((-var8.field_A + param3.field_g >> -1021831775) + 1 + var6_int, var7 - (-1 - (param3.field_x - var8.field_z >> -1905179359)), 256);
                  break L2;
                }
              }
            }
            L3: {
              if (!param3.h(0)) {
                break L3;
              } else {
                ic.a(false, param3.field_g + -4, 2 + var6_int, -4 + param3.field_x, 2 + var7);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("ae.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = new ed[30];
        field_b = new uk();
        field_e = new String[]{"Congratulations on your success so far.<delay><br><br>We have just received intelligence on two types of alien defence.", "These blue cylinders will repel your ship.", "These green pods will shoot energy balls at any unidentified ship within range of their sensors."};
    }
}
