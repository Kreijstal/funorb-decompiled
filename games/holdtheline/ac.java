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
          if (this.field_f >= this.field_i) {
            if (param0 != -1) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = this.field_h[this.field_f];
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
              this.field_f = this.field_f + 1;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, da param3) {
        try {
            eg.a(hk.field_c[param2][param1], 14, true, param3);
            eg.a(on.field_v[param2][param1], 13, true, param3);
            if (param0 >= -87) {
                da var5 = (da) null;
                ac.a(61, 25, -81, (da) null);
            }
            param3.a(91, 2, ha.field_j[param2][param1]);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ac.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private ac() throws Throwable {
        throw new Error();
    }

    private final void a(byte param0, int param1, ic param2) {
        float var4_float = 0.0f;
        try {
            if (param0 != -52) {
                String[] var5 = (String[]) null;
                ac.a((ji) null, (String[]) null, -128, -113);
            }
            var4_float = (float)param1 / 100.0f + (float)(this.field_f - -1);
            if (param1 != 0) {
                this.field_b = param2.field_c + " - " + param1 + "%";
            } else {
                this.field_b = param2.field_g;
            }
            this.field_j = (float)this.field_d * var4_float / (float)(this.field_i - -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ac.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ji param0, String[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            if (!(-5 == (param1.length ^ -1))) {
                throw new IllegalArgumentException();
            }
            var4_int = ka.a((byte) -127, param1[0]);
            var5 = ka.a((byte) -116, param1[param2]);
            var6 = ka.a((byte) 39, param1[2]);
            var7 = ka.a((byte) -120, param1[3]);
            param0.field_g = param0.field_j;
            param0.field_j = new ul(param3, var4_int, var5, var6, var7);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ac.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_g = "(Player 1)";
        field_e = -1;
        field_a = new String[]{null, "<col=2>You must win the Classic championship to qualify.</col>", "<col=2>You must win the Desert championship to qualify.</col>", "<col=2>You must win the Alpine championship to qualify.</col>"};
    }
}
