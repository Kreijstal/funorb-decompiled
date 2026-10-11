/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    static String field_d;
    static int[] field_c;
    static ak field_a;
    static jl field_b;

    final static int[] a(int[] param0, int param1) {
        int var7_int = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_59_0 = null;
        int[] stackIn_61_0 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var7Lifetime1;
        int[] var7Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.length;
          if (null == qj.field_a ||
            !(2 * var2_int <= qj.field_a.length)) {
            qj.field_a = new int[var2_int * 2];
            bj.field_b = new int[var2_int * 2];
          }
          ef.field_g = 0;
          var5 = param0[-2 + var2_int];
          var6 = param0[-1 + var2_int];
          for (var7_int = 0; var2_int > var7_int; var7_int += 2) {
            var4 = var6;
            var3 = var5;
            var5 = param0[var7_int];
            var6 = param0[var7_int + 1];
            if (var5 >= t.field_e) {
              if (t.field_e > var3) {
                var8_int = var5;
                var9 = var6;
                var10 = var3;
                var11 = var4;
                fieldTemp$18 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$18] = t.field_e;
                fieldTemp$19 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$19] = (t.field_e - var8_int) * (-var9 + var11) / (var10 - var8_int) + var9;
              }
              fieldTemp$20 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$20] = var5;
              fieldTemp$21 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$21] = var6;
            } else {
              if (var3 >= t.field_e) {
                var8_int = var3;
                var9 = var4;
                var10 = var5;
                var11 = var6;
                fieldTemp$22 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$22] = t.field_e;
                fieldTemp$23 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$23] = (-var9 + var11) * (-var8_int + t.field_e) / (var10 - var8_int) + var9;
              }
            }
          }
          if (param1 == ~ef.field_g) {
            stackIn_17_0 = null;
            return (int[]) (stackIn_17_0);
          }
          var7 = bj.field_b;
          bj.field_b = qj.field_a;
          qj.field_a = var7;
          var2_intLifetime1 = ef.field_g;
          ef.field_g = 0;
          var5Lifetime1 = bj.field_b[-2 + var2_intLifetime1];
          var6Lifetime1 = bj.field_b[-1 + var2_intLifetime1];
          for (var8_intLifetime1 = 0; var2_intLifetime1 > var8_intLifetime1; var8_intLifetime1 += 2) {
            var4Lifetime1 = var6Lifetime1;
            var3Lifetime1 = var5Lifetime1;
            var6Lifetime1 = bj.field_b[var8_intLifetime1 + 1];
            var5Lifetime1 = bj.field_b[var8_intLifetime1];
            if (var5Lifetime1 >= t.field_h) {
              if (var3Lifetime1 < t.field_h) {
                var9Lifetime1 = var3Lifetime1;
                var10Lifetime1 = var4Lifetime1;
                var11Lifetime1 = var5Lifetime1;
                var12 = var6Lifetime1;
                fieldTemp$12 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$12] = t.field_h;
                fieldTemp$13 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$13] = (t.field_h - var9Lifetime1) * (var12 - var10Lifetime1) / (var11Lifetime1 - var9Lifetime1) + var10Lifetime1;
              }
            } else {
              if (var3Lifetime1 >= t.field_h) {
                var9Lifetime1 = var5Lifetime1;
                var10Lifetime1 = var6Lifetime1;
                var11Lifetime1 = var3Lifetime1;
                var12 = var4Lifetime1;
                fieldTemp$14 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$14] = t.field_h;
                fieldTemp$15 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$15] = var10Lifetime1 + (t.field_h - var9Lifetime1) * (-var10Lifetime1 + var12) / (var11Lifetime1 - var9Lifetime1);
              }
              fieldTemp$16 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$16] = var5Lifetime1;
              fieldTemp$17 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$17] = var6Lifetime1;
            }
          }
          if (ef.field_g == 0) {
            stackIn_31_0 = null;
            return (int[]) (stackIn_31_0);
          }
          var7Lifetime1 = bj.field_b;
          bj.field_b = qj.field_a;
          qj.field_a = var7Lifetime1;
          var2_intLifetime2 = ef.field_g;
          ef.field_g = 0;
          var5Lifetime2 = bj.field_b[var2_intLifetime2 - 2];
          var6Lifetime2 = bj.field_b[var2_intLifetime2 - 1];
          for (var8_intLifetime2 = 0; var2_intLifetime2 > var8_intLifetime2; var8_intLifetime2 += 2) {
            var4Lifetime2 = var6Lifetime2;
            var3Lifetime2 = var5Lifetime2;
            var6Lifetime2 = bj.field_b[var8_intLifetime2 + 1];
            var5Lifetime2 = bj.field_b[var8_intLifetime2];
            if (t.field_f > var6Lifetime2) {
              if (var4Lifetime2 >= t.field_f) {
                var9Lifetime2 = var3Lifetime2;
                var10Lifetime2 = var4Lifetime2;
                var11Lifetime2 = var5Lifetime2;
                var12Lifetime1 = var6Lifetime2;
                fieldTemp$6 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$6] = var9Lifetime2 + (t.field_f - var10Lifetime2) * (var11Lifetime2 - var9Lifetime2) / (var12Lifetime1 - var10Lifetime2);
                fieldTemp$7 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$7] = t.field_f;
              }
            } else {
              if (var4Lifetime2 < t.field_f) {
                var9Lifetime2 = var5Lifetime2;
                var10Lifetime2 = var6Lifetime2;
                var11Lifetime2 = var3Lifetime2;
                var12Lifetime1 = var4Lifetime2;
                fieldTemp$8 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$8] = var9Lifetime2 + (-var9Lifetime2 + var11Lifetime2) * (t.field_f - var10Lifetime2) / (var12Lifetime1 - var10Lifetime2);
                fieldTemp$9 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$9] = t.field_f;
              }
              fieldTemp$10 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$10] = var5Lifetime2;
              fieldTemp$11 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$11] = var6Lifetime2;
            }
          }
          if (ef.field_g == 0) {
            stackIn_44_0 = null;
            return (int[]) (stackIn_44_0);
          }
          var7Lifetime2 = bj.field_b;
          bj.field_b = qj.field_a;
          var2_intLifetime3 = ef.field_g;
          qj.field_a = var7Lifetime2;
          ef.field_g = 0;
          var6Lifetime3 = bj.field_b[-1 + var2_intLifetime3];
          var5Lifetime3 = bj.field_b[var2_intLifetime3 - 2];
          for (var8_intLifetime3 = 0; var2_intLifetime3 > var8_intLifetime3; var8_intLifetime3 += 2) {
            var3Lifetime3 = var5Lifetime3;
            var4Lifetime3 = var6Lifetime3;
            var6Lifetime3 = bj.field_b[1 + var8_intLifetime3];
            var5Lifetime3 = bj.field_b[var8_intLifetime3];
            if (var6Lifetime3 >= t.field_a) {
              if (t.field_a > var4Lifetime3) {
                var9Lifetime3 = var3Lifetime3;
                var10Lifetime3 = var4Lifetime3;
                var11Lifetime3 = var5Lifetime3;
                var12Lifetime2 = var6Lifetime3;
                fieldTemp$0 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$0] = var9Lifetime3 + (var11Lifetime3 - var9Lifetime3) * (t.field_a - var10Lifetime3) / (var12Lifetime2 - var10Lifetime3);
                fieldTemp$1 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$1] = t.field_a;
              }
            } else {
              if (t.field_a <= var4Lifetime3) {
                var9Lifetime3 = var5Lifetime3;
                var10Lifetime3 = var6Lifetime3;
                var11Lifetime3 = var3Lifetime3;
                var12Lifetime2 = var4Lifetime3;
                fieldTemp$2 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$2] = (-var10Lifetime3 + t.field_a) * (var11Lifetime3 - var9Lifetime3) / (-var10Lifetime3 + var12Lifetime2) + var9Lifetime3;
                fieldTemp$3 = ef.field_g;
                ef.field_g = ef.field_g + 1;
                qj.field_a[fieldTemp$3] = t.field_a;
              }
              fieldTemp$4 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$4] = var5Lifetime3;
              fieldTemp$5 = ef.field_g;
              ef.field_g = ef.field_g + 1;
              qj.field_a[fieldTemp$5] = var6Lifetime3;
            }
          }
          if (ef.field_g == 0) {
            stackIn_59_0 = null;
            return (int[]) (stackIn_59_0);
          }
          var15 = new int[ef.field_g];
          var14 = var15;
          var8 = var14;
          qb.a(qj.field_a, 0, var15, 0, ef.field_g);
          stackIn_61_0 = var8;
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_64_0 = var2;
          stackIn_64_1 = new StringBuilder().append("ep.D(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            var3 = (String) null;
            ep.a((byte) 64, (String) null);
          }
          if (param1 != null &&
            param1.length() >= cl.field_a) {
            if (param1.length() > gd.field_l) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ep.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = Pixelate.field_H ? 1 : 0;
          try {
            if (pm.field_h != null) {
              pm.field_h.b((byte) 119);
            }
            if (param0 != -26721) {
              return;
            }
            if (fh.field_J != null) {
              fh.field_J.a((byte) -92);
            }
            if (null != rj.field_G) {
              try {
                rj.field_G.a(true);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (ug.field_l != null) {
              for (var1_int = 0; ug.field_l.length > var1_int; var1_int++) {
                if (null != ug.field_l[var1_int]) {
                  try {
                    ug.field_l[var1_int].a(true);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw aa.a((Throwable) ((Object) var1), "ep.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != -2) {
          int[] var2 = (int[]) null;
          ep.a((int[]) null, -67);
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 30022) {
          field_a = (ak) null;
        }
        stackIn_6_0 = (wp.a(-8798)) && ((8 & pa.field_b) == 0);
        return stackIn_6_0;
    }

    static {
        field_d = "Tiles Dropped: ";
    }
}
