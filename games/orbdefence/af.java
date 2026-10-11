/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class af {
    private int[] field_a;

    final static void a(int param0) {
        try {
          int var1_int = 0;
          int var3 = OrbDefence.field_D ? 1 : 0;
          try {
            if (kg.field_h != null) {
              kg.field_h.c(1);
            }
            if (wj.field_o != null) {
              wj.field_o.a(-31973);
            }
            if (vg.field_q != null) {
              try {
                vg.field_q.a((byte) -120);
              } catch (IOException iOException) {
              }
            }
            if (ok.field_a != null) {
              for (var1_int = 0; ok.field_a.length > var1_int; var1_int++) {
                if (ok.field_a[var1_int] != null) {
                  try {
                    ok.field_a[var1_int].a((byte) 63);
                  } catch (IOException var2_ref) {
                  }
                }
              }
            }
            var1_int = 91 % ((param0 + 74) / 37);
          } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "af.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    af(int[] param0) {
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
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (this.field_a[var4 + var4 + 1] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("af.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static hj a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        hj var6 = new hj(param0, param0);
        hj var3 = var6;
        for (var4 = 0; var4 < var3.field_v.length; var4++) {
          var6.field_v[var4] = param2;
        }
        if (param1 > -21) {
          return (hj) null;
        }
        return var3;
    }

    final static boolean a(mg param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var4 = (CharSequence) null;
            af.a(true, (CharSequence) null, 82, -108);
          }
          var2_int = param0.b((byte) 90);
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("af.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(boolean param0, CharSequence param1, int param2, int param3) {
        int var9 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 76 % ((param2 + 75) / 35);
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            for (var9 = 0; var8 > var9; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param1.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var5 = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param0))) {
                if (48 <= var10 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  90 >= var10) {
                  var10 -= 55;
                } else if (97 <= var10 &&
                  var10 <= 122) {
                  var10 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param3 <= var10) {
                  throw new NumberFormatException();
                }
                if (var5 != 0) {
                  var10 = -var10;
                }
                var11 = var7 * param3 + var10;
                if (var7 != var11 / param3) {
                  throw new NumberFormatException();
                }
                var6 = 1;
                var7 = var11;
              }
            }
            if (var6 == 0) {
              throw new NumberFormatException();
            }
            stackIn_40_0 = var7;
            return stackIn_40_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("af.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        if (param1 >= -56) {
          af.a(63, (byte) -86, 25);
        }
        var3 = (this.field_a.length >> 1) - 1;
        var4 = var3 & param0;
        while (true) {
          var5 = this.field_a[var4 + var4 + 1];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_a[var4 + var4] == param0) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    static {
    }
}
