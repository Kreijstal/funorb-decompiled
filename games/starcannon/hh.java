/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hh {
    static int field_a;
    static vi field_d;
    static hl[] field_b;
    static int field_c;

    abstract s b(byte param0);

    abstract void a(byte param0, rb param1);

    final static oe a(int param0, int param1, String param2) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        fl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 80) {
            field_a = 32;
          }
          var3 = new fl();
          ((oe) ((Object) var3)).field_d = param1;
          ((oe) ((Object) var3)).field_c = param2;
          stackIn_3_0 = var3;
          return (oe) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("hh.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, hl param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        hl var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = StarCannon.field_A;
        try {
          if (ki.field_l > param0) {
            param7 = param7 - (ki.field_l - param0);
            param0 = ki.field_l;
          }
          if (ki.field_e > param1) {
            param3 = param3 - (ki.field_e - param1);
            param1 = ki.field_e;
          }
          if (param7 + param0 > ki.field_g) {
            param7 = ki.field_g - param0;
          }
          if (ki.field_i < param3 + param1) {
            param3 = -param1 + ki.field_i;
          }
          if (param7 > 0 &&
            param3 > 0) {
            var21 = param6.c();
            var30 = ki.field_a;
            var10 = ki.field_j;
            var11 = ki.field_f;
            var29 = new int[4];
            ki.a(var29);
            param6.e();
            ki.c(var29[0], var29[1], var29[2], var29[3]);
            var13 = param6.field_u * param1 + param0;
            var14 = param6.field_u - param7;
            var25 = var21.field_B;
            var22 = var25;
            var15 = var22;
            for (var16 = param1; var16 < param1 + param3; var16++) {
              for (var17 = param0; var17 < param7 + param0; var17++) {
                var18 = var25[var13];
                if (0 != var18) {
                  if (0 < var17 &&
                    0 == var15[var13 - 1]) {
                    ki.e(var17, var16, param2, param5);
                  } else {
                    if (var16 > 0 &&
                      var15[var13 - param6.field_u] == 0) {
                      ki.e(var17, var16, param2, param5);
                    } else {
                      if (var17 < param6.field_u - 1 &&
                        var15[1 + var13] == 0) {
                        ki.e(var17, var16, param2, param5);
                      } else {
                        if (var16 < param6.field_v - 1 &&
                          var15[var13 + param6.field_u] == 0) {
                          ki.e(var17, var16, param2, param5);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.e(-param6.field_w, -param6.field_y);
            ki.a(var30, var10, var11);
            ki.b(var29);
            if (param4) {
              field_a = 19;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_44_0 = var8;
          stackIn_44_1 = new StringBuilder().append("hh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -22) {
          hl var2 = (hl) null;
          hh.a(-84, 78, -115, 23, true, 78, (hl) null, -53);
        }
    }

    static {
        field_a = -1;
    }
}
