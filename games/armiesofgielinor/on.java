/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class on extends tc {
    static String field_p;
    int[] field_m;
    static String field_k;
    int field_l;
    static String field_o;
    static int field_n;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        if (param0 != -7) {
          on.a(-36);
        }
    }

    final static void a(ha param0, int param1, boolean param2, Random param3) {
        int var4_int = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          for (var4_int = 0; var4_int < param0.field_db * param0.field_v / 3; var4_int++) {
            boolean decompiledFrameRemainder0 = true;
            var5 = 1 + ns.a(false, param0.field_v - 2, param3);
            var6 = ns.a(param2, param0.field_db - 2, param3) + 1;
            var7 = var6 * param0.field_v + var5;
            if (param0.field_Eb[var7].field_h == 0 &&
              null == param0.field_Eb[var7].field_c) {
              if (param0.field_Eb[1 + var7].field_h != param1 &&
                param1 != param0.field_Eb[-1 + var7].field_h &&
                param0.field_Eb[param0.field_v + var7].field_h != param1 &&
                param1 != param0.field_Eb[var7 - param0.field_v].field_h) {
                var8 = ns.a(false, 100, param3);
                if (var8 < 20) {
                  param0.field_Eb[var7].field_h = 3;
                } else {
                  if (40 > var8) {
                    param0.field_Eb[var7].field_h = 5;
                  } else {
                    if (50 > var8) {
                      param0.field_Eb[var7].field_h = 2;
                    } else {
                      if ((!(70 <= var8)) &&
                        (!(param1 <= -1))) {
                        param0.field_Eb[var7].field_h = param1;
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ns.a(false, 100, param3) >= 40) {
                  var8Lifetime1 = ns.a(param2, 100, param3);
                  if (var8Lifetime1 >= 20) {
                    if (var8Lifetime1 < 40) {
                      param0.field_Eb[var7].field_h = 5;
                    } else {
                      if (var8Lifetime1 >= 50) {
                        if (var8Lifetime1 < 70 &&
                          param1 > -1) {
                          param0.field_Eb[var7].field_h = param1;
                        }
                      } else {
                        param0.field_Eb[var7].field_h = 2;
                      }
                    }
                  } else {
                    param0.field_Eb[var7].field_h = 3;
                  }
                } else {
                  param0.field_Eb[var7].field_h = param1;
                }
              }
            }
          }
          if (param2) {
            field_o = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_36_0 = var4;
          stackIn_36_1 = new StringBuilder().append("on.A(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    private on() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Melee";
        field_p = "Village";
        field_o = "Slow";
    }
}
