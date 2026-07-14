/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    static pc[] field_a;
    static boolean field_b;

    final static void a(int param0, vk param1) {
        int var2 = 0;
        ei var3 = null;
        int var4 = 0;
        ei var5 = null;
        ei var6 = null;
        ei var7 = null;
        var4 = HoldTheLine.field_D;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param1.field_c.field_e) {
            L1: {
              if (param0 == 29824) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= param1.field_t.field_e) {
                var2 = 0;
                L3: while (true) {
                  if (param1.field_t.field_e <= var2) {
                    L4: {
                      if (-4 != (param1.field_p ^ -1)) {
                        break L4;
                      } else {
                        jg.a(wg.field_c, param1.field_e, (byte) 95);
                        break L4;
                      }
                    }
                    return;
                  } else {
                    var7 = (ei) param1.field_t.field_b[var2];
                    jg.a((rd) (Object) new ce(7, 20.0f), var7, (byte) 41);
                    var2++;
                    continue L3;
                  }
                }
              } else {
                var6 = (ei) param1.field_t.field_b[var2];
                jg.a((rd) (Object) new pj(7, 20.0f), var6, (byte) 82);
                var2++;
                continue L2;
              }
            }
          } else {
            var5 = (ei) param1.field_c.field_b[var2];
            var3 = var5;
            if (-1 == (param1.field_p ^ -1)) {
              jg.a(ri.field_c, var5, (byte) 92);
              var2++;
              continue L0;
            } else {
              if (param1.field_p == -3) {
                jg.a(vh.field_f, var5, (byte) 18);
                var2++;
                continue L0;
              } else {
                if (-4 != param1.field_p) {
                  jg.a((rd) (Object) new kj(7, 13941600), var5, (byte) 42);
                  var2++;
                  continue L0;
                } else {
                  jg.a((rd) (Object) new kj(4, 12566272), var5, (byte) 118);
                  var2++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 17310) {
            field_b = false;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, in param4, int param5, qm param6, in param7, qm param8) {
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        var9 = -param8.field_h + param6.field_h;
        var10 = -param8.field_f + param6.field_f;
        var11 = Math.abs(param4.field_j * param7.field_j + param7.field_g * param4.field_g);
        var12 = Math.abs(-(param7.field_j * param4.field_g) + param7.field_g * param4.field_j);
        var13 = var12;
        var14 = var11;
        var15 = param7.field_j * (float)var9 + (float)var10 * param7.field_g;
        var16 = -((float)var10 * param7.field_j) + param7.field_g * (float)var9;
        var17 = (float)var9 * param4.field_j + (float)var10 * param4.field_g;
        var18 = -((float)var10 * param4.field_j) + param4.field_g * (float)var9;
        le.field_s[0] = (float)(-param2) + (-((float)param1 * var13) - var11 * (float)param3 + Math.abs(var15));
        if (le.field_s[0] > 0.0f) {
          return false;
        } else {
          le.field_s[1] = (float)(-param5) + (Math.abs(var16) - (var12 * (float)param3 + var14 * (float)param1));
          if (le.field_s[1] <= 0.0f) {
            le.field_s[2] = Math.abs(var17) - (var11 * (float)param2 + (float)param5 * var12) - (float)param3;
            if (0.0f < le.field_s[2]) {
              return false;
            } else {
              le.field_s[3] = (float)(-param1) + (Math.abs(var18) - (var14 * (float)param5 + var13 * (float)param2));
              if (le.field_s[3] <= (float)param0) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new pc[14];
        field_b = false;
    }
}
