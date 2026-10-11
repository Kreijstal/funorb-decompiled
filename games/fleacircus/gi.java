/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gi {
    static byte[] field_c;
    static uc field_b;
    static String[] field_a;
    static sf field_d;

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (ii.a(1, param1)) {
          return true;
        }
        if (param1 != (char)param0 &&
          160 != param1 &&
          32 != param1) {
          if (95 != param1) {
            return false;
          }
          return true;
        }
        return true;
    }

    final static boolean a(int param0, boolean param1) {
        try {
          if (ae.field_a.field_i >= param0) {
            return true;
          }
          if (null == sg.field_h) {
            return false;
          }
          if (!param1) {
            field_d = (sf) null;
          }
          int var2_int = sg.field_h.e(-114);
          if (var2_int > 0) {
            if (!(var2_int <= param0 - ae.field_a.field_i)) {
              var2_int = param0 - ae.field_a.field_i;
            }
            sg.field_h.a(var2_int, ae.field_a.field_k, ae.field_a.field_i, false);
            ug.field_d = lj.a((byte) -128);
            ae.field_a.field_i = ae.field_a.field_i + var2_int;
            if (ae.field_a.field_i < param0) {
              return false;
            }
            ae.field_a.field_i = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              h.b(115) <= 30000L) {
              return false;
            }
            k.c(-28354);
          } catch (IOException iOException) {
            k.c(-28354);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(int param0, byte param1);

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = fleas.field_A ? 1 : 0;
        try {
          if (param5 <= param1) {
            return;
          }
          if (param1 + 1 >= param2) {
            return;
          }
          if (param2 > 5 + param1 &&
            param6 != param4) {
            var7_int = (1 & (param6 & param4)) + ((param6 >> 1) + (param4 >> 1));
            var8 = param1;
            var9 = param4;
            var10 = param6;
            for (var11 = param1; param2 > var11; var11++) {
              var12 = mh.field_y[var11];
              if (!param0) {
                stackIn_24_0 = uj.field_a[var12];
              } else {
                stackIn_24_0 = jl.field_b[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int >= var13) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                mh.field_y[var11] = mh.field_y[var8];
                incrementValue$0 = var8;
                var8++;
                mh.field_y[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            gi.a(param0, param1, var8, param3, param4, param5, var9);
            gi.a(param0, var8, param2, -3300, var10, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param2 - 1; param1 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param1; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = mh.field_y[var8Lifetime1];
              var10Lifetime1 = mh.field_y[1 + var8Lifetime1];
              if (ob.a(param0, var9Lifetime1, true, var10Lifetime1)) {
                mh.field_y[var8Lifetime1] = var10Lifetime1;
                mh.field_y[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var7), "gi.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = param2;
            var7 = param0.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (var9 >= param3) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param3 * var6 + var9;
                if (var10 / param3 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_39_0 = var5;
            return stackIn_39_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("gi.L(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract byte[] b(int param0, boolean param1);

    abstract rf a(int param0);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 < 26) {
          field_b = (uc) null;
        }
        field_b = null;
    }

    static {
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
