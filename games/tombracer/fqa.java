/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fqa extends kna {
    private f field_G;
    private jma field_H;
    private boolean field_I;
    static String[] field_F;

    final void w(int param0) {
        super.w(-126);
        this.field_G.a(this.o((byte) -57), false);
        if (param0 >= -122) {
            this.field_G = (f) null;
        }
    }

    abstract boolean r(byte param0);

    void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_G.a(param1, 115, this.o((byte) -39));
            if (this.r((byte) 93)) {
                param1.a((byte) -19, !this.field_I ? 0 : 1, 1);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fqa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void x(int param0) {
        super.x(param0);
        if (null == this.field_H) {
          return;
        } else {
          this.field_H.h(1).a(9, this.field_G.a((byte) -103));
          return;
        }
    }

    public static void A(int param0) {
        field_F = null;
        if (param0 != 1) {
            fqa.a(false, 'ￆ');
        }
    }

    abstract int B(int param0);

    final static int[] e(boolean param0) {
        if (!param0) {
            return (int[]) null;
        }
        return new int[8];
    }

    final static boolean a(boolean param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (!q.a(param1, 11955)) {
            if (!param0) {
              if (param1 != 45) {
                if (param1 != 160) {
                  if (32 != param1) {
                    if (param1 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    fqa(la param0, int param1) {
        super(param0, param1);
        try {
            this.field_G = new f(this.B(31609), 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fqa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
            this.field_G = new f(this.B(31609), 0, param0.field_E, param2);
            if (this.r((byte) 93)) {
                this.field_I = (param2.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ut param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_H = param0.k((byte) -77);
            if (param1 < -51) {
              if (!this.r((byte) 93)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.field_I) {
                  this.field_H.b(1, 52);
                  return;
                } else {
                  this.field_H.a(-2, true);
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("fqa.BC(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_F = new String[]{"<%0> was burnt", "<%0> was flamed", "<%0> was immolated", "<%0> was barbecued", "<%0> was carbonised", "<%0> was toasted", "<%0> was roasted", "<%0> was fired", "<%0> was slightly more than well-done", "<%0> felt the burn", "<%0> got a little hot under the collar", "<%0> couldn't take the heat", "<%0> should stay out of the kitchen", "<%0> smelled the napalm"};
    }
}
