/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends lh {
    int[] field_m;
    boolean field_p;
    static String field_k;
    static sf field_n;
    int field_i;
    static int field_j;
    static String field_l;
    static String[] field_o;

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = hi.field_k;
            return stackIn_3_0;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = uk.a(53, param0);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!r.a(var4.charAt(0), param2 - 4) &&
                !r.a(var4.charAt(-1 + var4.length()), -43)) {
                if (param2 != 124) {
                  stackIn_21_0 = (String) null;
                  return stackIn_21_0;
                }
                var5 = 0;
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (!r.a((char) var7, -122)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (2 <= var5 &&
                    !param1) {
                    stackIn_31_0 = wf.field_e;
                    return stackIn_31_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_36_0 = ha.field_m;
                return stackIn_36_0;
              }
              stackIn_18_0 = ha.field_m;
              return stackIn_18_0;
            }
            stackIn_13_0 = hi.field_k;
            return stackIn_13_0;
          }
          stackIn_8_0 = hi.field_k;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("fi.B(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static n a(rh param0, rh param1, String param2, String param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.a(param2, (byte) -100);
          if (param4 != 82) {
            var7 = (String) null;
            fi.a((rh) null, (rh) null, (String) null, (String) null, (byte) 26);
          }
          var6 = param0.a(param3, (byte) -15, var5_int);
          stackIn_3_0 = dl.a(var6, 2, var5_int, param1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("fi.C(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_k = null;
        field_l = null;
        if (param0 != -2) {
          fi.a(38);
        }
    }

    fi() {
    }

    static {
        field_k = "<%0>Green Switches:<%1> Causes all the recessed walls to slide out, and become normal wall blocks. Warning! Fleas standing in the way are crushed and die!";
        field_l = "Level complete!";
        field_o = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
