/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ge extends kna {
    private boolean field_I;
    static String field_G;
    private int field_F;
    private int field_H;

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.field_F = -66;
            return true;
        }
        return true;
    }

    void a(boolean param0, kh param1) {
        try {
            if (param0) {
                la var4 = (la) null;
                this.a((byte) -1, (mra) null, (la) null);
            }
            super.a(param0, param1);
            if (this.A(-1)) {
                param1.a((byte) 124, this.field_F, 4);
                if (!this.B(-23309)) {
                    return;
                }
                if (!(!this.C(128))) {
                    param1.a((byte) 14, !this.field_I ? 0 : 1, 1);
                }
                if (!this.field_I) {
                    param1.a((byte) 104, this.field_H, 4);
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ge.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean A(int param0);

    abstract boolean B(int param0);

    ge(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
            if (!this.A(-1)) {
                return;
            }
            this.field_F = param2.b((byte) 44, 4);
            if (this.B(-23309)) {
                if (this.C(128)) {
                    this.field_I = (param2.b((byte) 44, 1) ^ -1) == -2 ? true : false;
                }
                if (this.field_I) {
                    return;
                }
                this.field_H = param2.b((byte) 44, 4);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void r(byte param0) {
        if (param0 <= 92) {
            return;
        }
        field_G = null;
    }

    ge(la param0, int param1) {
        super(param0, param1);
    }

    final void a(fsa param0, int param1, nv param2, int param3) {
        mfa var5 = null;
        gaa var6 = null;
        try {
            var5 = rm.field_a;
            var6 = (gaa) ((Object) var5.a(5, 87));
            var6.a(true, param3);
            var6.b(1, 96);
            var6.a(16, 120);
            var6.a(param1, 0, 1, false);
            param0.a(param2, (byte) 124, var6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ge.CC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(byte param0, mra param1, la param2) {
        RuntimeException var4 = null;
        qea var5 = null;
        roa var6 = null;
        int var7 = 0;
        mg var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 43) {
              if (this.A(param0 + -44)) {
                L1: {
                  var8 = ln.b(this.field_F, 23688);
                  if (!this.B(-23309)) {
                    break L1;
                  } else {
                    L2: {
                      if (!this.field_I) {
                        break L2;
                      } else {
                        var5 = param2.q(-85);
                        this.field_H = var5.a(16, param0 + -43);
                        if (param1 instanceof ska) {
                          var6 = ((ska) ((Object) param1)).l(-2);
                          if (var6 == null) {
                            break L2;
                          } else {
                            var7 = var6.a(true);
                            if (-1 > (var7 ^ -1)) {
                              var6.b(var5.a(var7, 0), false);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          var8.a(false, this.field_H * var8.a((byte) -94) / 16);
                          param1.a(102, var8);
                          return;
                        }
                      }
                    }
                    var8.a(false, this.field_H * var8.a((byte) -94) / 16);
                    break L1;
                  }
                }
                param1.a(102, var8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ge.DC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean s(byte param0) {
        if (param0 < 64) {
            kh var3 = (kh) null;
            this.a(true, (kh) null);
            return this.field_I;
        }
        return this.field_I;
    }

    abstract boolean C(int param0);

    final boolean a(int param0) {
        if (param0 != 6) {
            return false;
        }
        return true;
    }

    static {
        field_G = "Report abuse";
    }
}
