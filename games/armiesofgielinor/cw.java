/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw {
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var15 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var18 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var6_int = 50 + ic.field_f;
          if (param3 > -116) {
            field_b = (String) null;
          }
          if (null != jf.field_C.field_T) {
            if (jf.field_C.field_q != bv.field_w.field_gb &&
              jf.field_C.field_T.field_O == jf.field_C.field_q) {
              return;
            }
            if (jf.field_C.field_T.field_B > 0) {
              if (!jf.field_C.field_T.field_s &&
                jf.field_C.field_T.field_O == jf.field_C.field_q &&
                !jf.field_C.field_T.h(-13494)) {
                var7 = jf.field_C.field_T.B(3257);
                var8 = jf.field_C.field_T.l((byte) -79);
                var9 = jf.field_C.field_vb.field_n;
                var10 = jf.field_C.field_vb.field_b;
                if (jf.field_C.field_T.o(-28467)) {
                  var9 = jf.field_C.field_T.a(false);
                  var10 = jf.field_C.field_T.D(-65);
                }
                var11 = Math.abs(var9 - param4);
                var12 = Math.abs(var10 - param5);
                if (var11 + var12 <= var7 &&
                  var8 <= var11 + var12) {
                  stackIn_19_0 = (var12 + var11 != 1) ? 0 : 1;
                  var13 = stackIn_19_0;
                  if (var13 == 0) {
                    if ((bv.field_w.b(31, var10, var9, jf.field_C.field_T.field_O) & 2) == 0) {
                      if ((2 & bv.field_w.b(31, param5, param4, jf.field_C.field_T.field_O)) == 0) {
                        stackIn_29_0 = (bv.field_w.field_j.a(var10, param4, var9, jf.field_C.field_T.x(-111), var7, param5, (byte) 62)) ? 1 : 0;
                      } else {
                        stackIn_29_0 = 0;
                      }
                    } else {
                      stackIn_29_0 = 0;
                    }
                  } else {
                    stackIn_29_0 = 0;
                  }
                  var14 = stackIn_29_0;
                  if (var13 != 0 ||
                    var14 != 0) {
                    for (var15 = 1; var15 < 40; var15 += 2) {
                      var16 = Math.abs(-(var15 * 2) + 40);
                      var17 = -20 + (param1 + var15);
                      qn.d(-40 + param2 + var16, var17, -1 - var16 + param2 + 40, var17, 16711680, var6_int);
                    }
                  }
                }
              }
              stackIn_38_0 = (jf.field_C.field_T.field_s) ? 1 : 3;
              var7Lifetime1 = stackIn_38_0;
              var8Lifetime1 = jf.field_C.field_vb.c(27732);
              if ((jf.field_C.field_vb.field_e[param0] & var7Lifetime1) != 0) {
                if (!jf.field_C.field_T.field_s &&
                  jf.field_C.field_vb.field_q[param0] <= var8Lifetime1) {
                  return;
                }
                if (param5 == 0 ||
                  (!(var8Lifetime1 >= jf.field_C.field_vb.field_q[-bv.field_w.field_v + param0]) ||
                  jf.field_C.field_T.field_s) &&
                  (var7Lifetime1 & jf.field_C.field_vb.field_e[param0 - ks.field_y]) == 0) {
                  qn.d(-40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                }
                if (param5 == -1 + ef.field_c ||
                  (!(var8Lifetime1 >= jf.field_C.field_vb.field_q[ks.field_y + param0]) ||
                  jf.field_C.field_T.field_s) &&
                  (jf.field_C.field_vb.field_e[ks.field_y + param0] & var7Lifetime1) == 0) {
                  qn.d(40 + param2, param1, param2, param1 + 20, 16711680, var6_int);
                }
                if (0 == param4 ||
                  (!(jf.field_C.field_vb.field_q[-1 + param0] <= var8Lifetime1) ||
                  jf.field_C.field_T.field_s) &&
                  (var7Lifetime1 & jf.field_C.field_vb.field_e[param0 - 1]) == 0) {
                  qn.d(param2 - 40, param1, param2, 20 + param1, 16711680, var6_int);
                }
                if (param4 != -1 + ks.field_y) {
                  if (var8Lifetime1 >= jf.field_C.field_vb.field_q[1 + param0] &&
                    !jf.field_C.field_T.field_s) {
                    return;
                  }
                  if ((var7Lifetime1 & jf.field_C.field_vb.field_e[param0 + 1]) != 0) {
                    return;
                  }
                }
                qn.d(40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                return;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "cw.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -91) {
          cw.a(-12, 36, -105, 64, -39, -61);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Options";
        field_a = "This unit has an attack range of <%0> to <%1>";
    }
}
