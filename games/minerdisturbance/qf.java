/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends pi {
    static ea[][] field_o;
    static String field_r;
    static int field_p;
    static int field_n;
    byte[] field_s;
    static String field_q;

    final static void a(int param0, int param1, ln param2, int param3, int param4, int param5) {
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = MinerDisturbance.field_ab;
          var6 = (param0 - param1 << 425791336) / param2.field_j;
          var7 = (param1 << -329478968) + param2.field_b * var6;
          param5 = param5 + param2.field_b;
          param3 = param3 + param2.field_e;
          var8 = param3 * eh.field_g + param5;
          var9 = param4;
          var10 = param2.field_f;
          var11 = param2.field_a;
          var12 = eh.field_g - var11;
          if (param3 < eh.field_d) {
            var14 = eh.field_d + -param3;
            var9 = var9 + var14 * var11;
            param3 = eh.field_d;
            var10 = var10 - var14;
            var8 = var8 + eh.field_g * var14;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var13 = 0;
          if (param5 < eh.field_a) {
            var14 = eh.field_a + -param5;
            var12 = var12 + var14;
            var11 = var11 - var14;
            var13 = var13 + var14;
            var7 = var7 + var14 * var6;
            var9 = var9 + var14;
            param5 = eh.field_a;
            var8 = var8 + var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param3 + var10 > eh.field_e) {
            var10 = var10 - (-eh.field_e + (var10 + param3));
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (eh.field_k < var11 + param5) {
            var14 = -eh.field_k + param5 + var11;
            var12 = var12 + var14;
            var11 = var11 - var14;
            var13 = var13 + var14;
            break L3;
          } else {
            break L3;
          }
        }
        if (-1 > (var11 ^ -1)) {
          if (var10 <= 0) {
            return;
          } else {
            param3 = -var10;
            L4: while (true) {
              if (0 <= param3) {
                return;
              } else {
                var14 = var7;
                param5 = -var11;
                L5: while (true) {
                  if (0 <= param5) {
                    var8 = var8 + var12;
                    var9 = var9 + var13;
                    param3++;
                    continue L4;
                  } else {
                    var15 = var14 >> 1430211496;
                    var14 = var14 + var6;
                    var16 = 256 - var15;
                    if (var15 >= 0) {
                      var9++;
                      var17 = param2.field_n[255 & param2.field_m[var9]];
                      if (0 != var17) {
                        if (var15 > 255) {
                          eh.field_f[var8] = var17;
                          var8++;
                          param5++;
                          continue L5;
                        } else {
                          var18 = eh.field_f[var8];
                          var19 = 16711935 & var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 2007946504;
                          eh.field_f[var8] = (c.a(16711707, var16 * c.a(var18, 65280) - -(var15 * c.a(65280, var17))) >> -1470954968) + var19;
                          var8++;
                          param5++;
                          continue L5;
                        }
                      } else {
                        var8++;
                        param5++;
                        continue L5;
                      }
                    } else {
                      var9++;
                      var8++;
                      param5++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -28581) {
            return;
        }
        field_o = null;
        field_r = null;
        field_q = null;
    }

    qf(byte[] param0) {
        ((qf) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ea[2][9];
        field_p = 0;
        field_n = 0;
        field_q = "Anon.";
    }
}
