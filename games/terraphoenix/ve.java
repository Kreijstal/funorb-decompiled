/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static boolean field_c;
    static ci field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_a = (ci) null;
        }
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Terraphoenix.field_V;
        try {
          if (param2 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param2 == 1) {
            var10 = param1[param3];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param2;
          var5 = 0;
          for (var6_int = param3; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          if (param0 != -10537) {
            stackIn_18_0 = (String) null;
            return stackIn_18_0;
          }
          for (var7 = param3; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ve.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        wf.field_l = (59 & param1) >> 4;
        if (2 < wf.field_l) {
          wf.field_l = 2;
        }
        di.field_e = 3 & param1 >> 2;
        if (!(param0 >= di.field_e)) {
          di.field_e = 2;
        }
        lb.field_f = param1 & 3;
        if (!(lb.field_f <= 2)) {
          lb.field_f = 2;
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4) {
        int var16 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var17Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        var18 = Terraphoenix.field_V;
        try {
          param2 = param2 + param3;
          param4 = param4 + param0.field_p;
          param3 = param3 - (param0.field_u - 15);
          param3 = param3 + param0.field_v;
          var5_int = l.field_k * param3 + param4;
          var6 = 0;
          var7 = param4;
          var8 = param3;
          var9 = param0.field_t;
          var10 = param0.field_r;
          var11 = l.field_k - var10;
          if (l.field_d > param3) {
            var13 = l.field_d - param3;
            var5_int = var5_int + l.field_k * var13;
            var9 = var9 - var13;
            var8 = var8 + var13;
            param3 = l.field_d;
            var6 = var6 + var10 * var13;
          }
          if (param1 != -5353) {
            return;
          }
          var12 = 0;
          if (param4 < l.field_b) {
            var13Lifetime1 = l.field_b - param4;
            var7 = var7 + var13Lifetime1;
            var6 = var6 + var13Lifetime1;
            param4 = l.field_b;
            var12 = var12 + var13Lifetime1;
            var5_int = var5_int + var13Lifetime1;
            var11 = var11 + var13Lifetime1;
            var10 = var10 - var13Lifetime1;
          }
          if (param3 + var9 > l.field_c) {
            var9 = var9 - (var9 + (param3 - l.field_c));
          }
          if (l.field_f < param4 + var10) {
            var13Lifetime2 = var10 + (param4 - l.field_f);
            var10 = var10 - var13Lifetime2;
            var11 = var11 + var13Lifetime2;
            var12 = var12 + var13Lifetime2;
          }
          if (0 < var10 &&
            var9 > 0) {
            var13Lifetime3 = var7;
            var15 = -(var10 >> 2);
            var10 = -(3 & var10);
            for (var16 = -var9; var16 < 0; var16++) {
              for (var17 = var15; 0 > var17; var17++) {
                incrementValue$2 = var6;
                var6++;
                var14 = param0.field_z[incrementValue$2];
                if (var14 != 0 &&
                  gd.field_a[var7][var8] <= param2) {
                  incrementValue$3 = var7;
                  var7++;
                  gd.field_a[incrementValue$3][var8] = param2;
                  incrementValue$4 = var5_int;
                  var5_int++;
                  l.field_i[incrementValue$4] = var14;
                } else {
                  var7++;
                  var5_int++;
                }
                incrementValue$5 = var6;
                var6++;
                var14Lifetime2 = param0.field_z[incrementValue$5];
                if (0 != var14Lifetime2 &&
                  param2 >= gd.field_a[var7][var8]) {
                  incrementValue$6 = var7;
                  var7++;
                  gd.field_a[incrementValue$6][var8] = param2;
                  incrementValue$7 = var5_int;
                  var5_int++;
                  l.field_i[incrementValue$7] = var14Lifetime2;
                } else {
                  var7++;
                  var5_int++;
                }
                incrementValue$8 = var6;
                var6++;
                var14Lifetime3 = param0.field_z[incrementValue$8];
                if (0 != var14Lifetime3 &&
                  param2 >= gd.field_a[var7][var8]) {
                  incrementValue$9 = var7;
                  var7++;
                  gd.field_a[incrementValue$9][var8] = param2;
                  incrementValue$10 = var5_int;
                  var5_int++;
                  l.field_i[incrementValue$10] = var14Lifetime3;
                } else {
                  var5_int++;
                  var7++;
                }
                incrementValue$11 = var6;
                var6++;
                var14Lifetime4 = param0.field_z[incrementValue$11];
                if (0 != var14Lifetime4 &&
                  param2 >= gd.field_a[var7][var8]) {
                  incrementValue$12 = var7;
                  var7++;
                  gd.field_a[incrementValue$12][var8] = param2;
                  incrementValue$13 = var5_int;
                  var5_int++;
                  l.field_i[incrementValue$13] = var14Lifetime4;
                } else {
                  var7++;
                  var5_int++;
                }
              }
              var7 = var13Lifetime3;
              for (var17Lifetime1 = var10; var17Lifetime1 < 0; var17Lifetime1++) {
                incrementValue$0 = var6;
                var6++;
                var14Lifetime1 = param0.field_z[incrementValue$0];
                if (var14Lifetime1 == 0) {
                  var5_int++;
                } else {
                  incrementValue$1 = var5_int;
                  var5_int++;
                  l.field_i[incrementValue$1] = var14Lifetime1;
                }
              }
              var8++;
              var5_int = var5_int + var11;
              if (var8 >= -15 + (param3 + param0.field_t)) {
                param2++;
              }
              var6 = var6 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_52_0 = var5;
          stackIn_52_1 = new StringBuilder().append("ve.C(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = true;
    }
}
