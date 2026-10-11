/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qw {
    static int field_b;
    static String field_c;
    static hr[] field_a;

    final static boolean a(int param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0 != 57) {
          field_c = (String) null;
          if (param1 < 48) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (122 < param1) {
              return false;
            }
            return true;
          }
          if (57 >= param1) {
            return true;
          }
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_28_0;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 < param1) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_64_0;
        }
        if (57 >= param1) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (122 < param1) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (122 >= param1);
        return stackIn_50_0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -116) {
          return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        if (param0 != 35) {
          field_b = 62;
          if (!so.a((byte) 101)) {
            return;
          }
          ou.a(false, 4, (byte) -24);
          return;
        }
        if (!so.a((byte) 101)) {
          return;
        }
        ou.a(false, 4, (byte) -24);
    }

    final static void a(int param0, ah param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        ah var7 = null;
        int var3Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 < 57) {
            return;
          }
          if (param1.field_Q == 0) {
            return;
          }
          if (jc.b(true) > 20) {
            return;
          }
          var2_int = fi.a(2, he.field_o, (byte) -96);
          if (1 == var2_int) {
            var3 = param1.field_Q + 1;
            if (6 <= var3) {
              var3 = 5;
            }
            var6 = uj.a(var3, 26 + fi.a(588, ki.field_b, (byte) -96) << 8, param1.field_N, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 8);
            oc.a(var6, false);
            return;
          }
          var3Lifetime1 = param1.field_N;
          var4 = var3Lifetime1;
          if (var4 == 4) {
            var3Lifetime1 = 0;
          } else {
            if (0 == var4) {
              var3Lifetime1 = 5;
            } else {
              if (var4 != 5) {
                if (var4 == 1) {
                  var3Lifetime1 = 2;
                } else {
                  if (2 == var4) {
                    var3Lifetime1 = 6;
                  }
                }
              } else {
                var3Lifetime1 = 1;
              }
            }
          }
          if (var3Lifetime1 >= 7) {
            var3Lifetime1 = 6;
          }
          var7 = uj.a(param1.field_Q, 26 + fi.a(588, ki.field_b, (byte) -96) << 8, var3Lifetime1, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 8);
          oc.a(var7, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("qw.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_c = "Passwords must be between 5 and 20 letters and numbers";
    }
}
