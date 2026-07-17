/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ag {
    private pd field_T;
    static String field_M;
    static String field_I;
    private int field_H;
    static oc field_J;
    static String field_K;
    static gk field_O;
    static String field_R;
    static String field_N;
    static String[] field_P;
    static int field_S;
    static int field_Q;
    static String field_L;

    public static void g() {
        field_K = null;
        field_O = null;
        field_N = null;
        field_L = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_I = null;
        field_P = null;
    }

    final String b(boolean param0) {
        if (!(!((mk) this).field_w)) {
            return ((mk) this).field_T.c(26146);
        }
        if (!param0) {
            return null;
        }
        field_N = null;
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            ((mk) this).field_H = ((mk) this).field_H + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mk.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        eh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        super.a((byte) -58, param1, param2, param3);
        if (param0 < -52) {
          if (param2 != 0) {
            return;
          } else {
            var5 = param1 + (((mk) this).field_n - -(((mk) this).field_v >> 1));
            var6 = ((mk) this).field_j + param3 - -(((mk) this).field_k >> 1);
            var8 = ((mk) this).field_T.a(-116);
            if (da.field_f == var8) {
              var16 = qk.field_lb[0];
              var9 = var16.field_n << 1;
              var10 = var16.field_w << 1;
              if (jk.field_o != null) {
                if (jk.field_o.field_q >= var9) {
                  if (var10 <= jk.field_o.field_y) {
                    fk.a(jk.field_o, -23095);
                    de.b();
                    var16.b(112, 144, var16.field_n << 4, var16.field_w << 4, -((mk) this).field_H << 10, 4096);
                    oo.c(-15405);
                    jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                    return;
                  } else {
                    jk.field_o = new qb(var9, var10);
                    fk.a(jk.field_o, -23095);
                    var16.b(112, 144, var16.field_n << 4, var16.field_w << 4, -((mk) this).field_H << 10, 4096);
                    oo.c(-15405);
                    jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                    return;
                  }
                } else {
                  jk.field_o = new qb(var9, var10);
                  fk.a(jk.field_o, -23095);
                  var16.b(112, 144, var16.field_n << 4, var16.field_w << 4, -((mk) this).field_H << 10, 4096);
                  oo.c(-15405);
                  jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                  return;
                }
              } else {
                jk.field_o = new qb(var9, var10);
                fk.a(jk.field_o, -23095);
                var16.b(112, 144, var16.field_n << 4, var16.field_w << 4, -((mk) this).field_H << 10, 4096);
                oo.c(-15405);
                jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                return;
              }
            } else {
              if (var8 != ug.field_c) {
                if (ra.field_k != var8) {
                  if (nn.field_s != var8) {
                    return;
                  } else {
                    var13 = qk.field_lb[1];
                    var13.b(-(var13.field_q >> 1) + var5, -(var13.field_y >> 1) + var6, 256);
                    return;
                  }
                } else {
                  var14 = qk.field_lb[2];
                  var14.b(-(var14.field_q >> 1) + var5, -(var14.field_y >> 1) + var6, 256);
                  return;
                }
              } else {
                var15 = qk.field_lb[0];
                var9 = var15.field_n << 1;
                var10 = var15.field_w << 1;
                if (jk.field_o != null) {
                  if (jk.field_o.field_q >= var9) {
                    if (var10 <= jk.field_o.field_y) {
                      fk.a(jk.field_o, -23095);
                      de.b();
                      var15.b(112, 144, var15.field_n << 4, var15.field_w << 4, -((mk) this).field_H << 10, 4096);
                      oo.c(-15405);
                      jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                      return;
                    } else {
                      jk.field_o = new qb(var9, var10);
                      fk.a(jk.field_o, -23095);
                      var15.b(112, 144, var15.field_n << 4, var15.field_w << 4, -((mk) this).field_H << 10, 4096);
                      oo.c(-15405);
                      jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                      return;
                    }
                  } else {
                    jk.field_o = new qb(var9, var10);
                    fk.a(jk.field_o, -23095);
                    var15.b(112, 144, var15.field_n << 4, var15.field_w << 4, -((mk) this).field_H << 10, 4096);
                    oo.c(-15405);
                    jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                    return;
                  }
                } else {
                  jk.field_o = new qb(var9, var10);
                  fk.a(jk.field_o, -23095);
                  var15.b(112, 144, var15.field_n << 4, var15.field_w << 4, -((mk) this).field_H << 10, 4096);
                  oo.c(-15405);
                  jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mk.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    mk(pd param0) {
        try {
            ((mk) this).field_T = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Decline invitation to <%0>'s game";
        field_K = "You are offering an unrated rematch.";
        field_M = "Minions can only be summoned when the summoning circle is green; you cannot summon over terrain or too far away from yourself.<br>Click to summon your Imps!";
        field_J = new oc();
        field_R = "This spell explodes five seconds after being cast, allowing you to bounce it off the terrain to hit those hard to reach targets. Try destroying one of the three targets in the arena.";
        field_N = "Select the Arcane Arrow spell below.";
        field_P = new String[]{"By rating", "By win percentage"};
        field_Q = 10;
        field_L = "Toggle mouseover help";
    }
}
