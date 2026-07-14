/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    private ic[] field_h;
    float field_j;
    static String[] field_a;
    String field_b;
    private int field_i;
    static uf field_c;
    static String field_g;
    private int field_f;
    private int field_d;
    static int field_e;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -3646) {
            ac.b(-56);
            field_c = null;
            field_g = null;
            return;
        }
        field_c = null;
        field_g = null;
    }

    final boolean a(int param0) {
        int var3 = 0;
        ic var4 = null;
        var3 = HoldTheLine.field_D;
        L0: while (true) {
          if (((ac) this).field_f >= ((ac) this).field_i) {
            if (param0 != -1) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = ((ac) this).field_h[((ac) this).field_f];
            if (!var4.field_e.b((byte) -85)) {
              this.a((byte) -52, 0, var4);
              return false;
            } else {
              L1: {
                if (0 > var4.field_b) {
                  break L1;
                } else {
                  if (!var4.field_e.d(var4.field_b, -124)) {
                    this.a((byte) -52, var4.field_e.a(108, var4.field_b), var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_a == null) {
                  break L2;
                } else {
                  if (var4.field_e.b(var4.field_a, -104)) {
                    break L2;
                  } else {
                    this.a((byte) -52, var4.field_e.a(var4.field_a, 0), var4);
                    return false;
                  }
                }
              }
              L3: {
                if ((var4.field_b ^ -1) <= -1) {
                  break L3;
                } else {
                  if (var4.field_a != null) {
                    break L3;
                  } else {
                    if (null == var4.field_c) {
                      break L3;
                    } else {
                      if (!var4.field_e.a((byte) -52)) {
                        this.a((byte) -52, var4.field_e.a(param0 + 1), var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((ac) this).field_f = ((ac) this).field_f + 1;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, da param3) {
        Object var5 = null;
        eg.a(hk.field_c[param2][param1], 14, true, param3);
        eg.a(on.field_v[param2][param1], 13, true, param3);
        if (param0 >= -87) {
          var5 = null;
          ac.a(61, 25, -81, (da) null);
          param3.a(91, 2, ha.field_j[param2][param1]);
          return;
        } else {
          param3.a(91, 2, ha.field_j[param2][param1]);
          return;
        }
    }

    private ac() throws Throwable {
        throw new Error();
    }

    private final void a(byte param0, int param1, ic param2) {
        float var4 = 0.0f;
        Object var5 = null;
        if (param0 == -52) {
          var4 = (float)param1 / 100.0f + (float)(((ac) this).field_f - -1);
          if (param1 != 0) {
            ((ac) this).field_b = param2.field_c + " - " + param1 + "%";
            ((ac) this).field_j = (float)((ac) this).field_d * var4 / (float)(((ac) this).field_i - -1);
            return;
          } else {
            ((ac) this).field_b = param2.field_g;
            ((ac) this).field_j = (float)((ac) this).field_d * var4 / (float)(((ac) this).field_i - -1);
            return;
          }
        } else {
          var5 = null;
          ac.a((ji) null, (String[]) null, -128, -113);
          var4 = (float)param1 / 100.0f + (float)(((ac) this).field_f - -1);
          if (param1 != 0) {
            ((ac) this).field_b = param2.field_c + " - " + param1 + "%";
            ((ac) this).field_j = (float)((ac) this).field_d * var4 / (float)(((ac) this).field_i - -1);
            return;
          } else {
            ((ac) this).field_b = param2.field_g;
            ((ac) this).field_j = (float)((ac) this).field_d * var4 / (float)(((ac) this).field_i - -1);
            return;
          }
        }
    }

    final static void a(ji param0, String[] param1, int param2, int param3) {
        if (!(-5 == (param1.length ^ -1))) {
            throw new IllegalArgumentException();
        }
        int var4 = ka.a((byte) -127, param1[0]);
        int var5 = ka.a((byte) -116, param1[param2]);
        int var6 = ka.a((byte) 39, param1[2]);
        int var7 = ka.a((byte) -120, param1[3]);
        param0.field_g = param0.field_j;
        param0.field_j = new ul(param3, var4, var5, var6, var7);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "(Player 1)";
        field_e = -1;
        field_a = new String[]{null, "<col=2>You must win the Classic championship to qualify.</col>", "<col=2>You must win the Desert championship to qualify.</col>", "<col=2>You must win the Alpine championship to qualify.</col>"};
    }
}
