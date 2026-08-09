/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ona extends kna {
    static int field_H;
    private int field_G;
    static String field_F;
    static String field_I;

    public static void A(int param0) {
        field_I = null;
        if (param0 != 7) {
            ona.A(-16);
            field_F = null;
            return;
        }
        field_F = null;
    }

    final fsa a(boolean param0, int param1, la param2) {
        ri var5 = null;
        int var6 = 0;
        int var7_int = 0;
        fsa var9 = null;
        fsa stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        mfa var7 = null;
        nq var8 = null;
        try {
          L0: {
            L1: {
              var9 = new fsa(param2, param0);
              var9.b((byte) -11, this.field_k, this.field_l);
              var9.h(param1, param1 + -3);
              var9.a(1, (byte) -12, true);
              var9.a((byte) -3, 6);
              var9.b((byte) 17, false);
              var9.g(param1 ^ 126, 2);
              var9.a((byte) 83, (nv) (new eq(param2, param0)));
              var5 = new ri(param2, param0);
              var5.a((byte) -35, 8 * this.field_G);
              var6 = 2048;
              var7_int = this.r(12);
              if ((var7_int ^ -1) == -32) {
                var5.a(true, var6);
                break L1;
              } else {
                if (32 == var7_int) {
                  var5.a(true, var6 * 2);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var9.a(var5, 0);
            var7 = rm.field_a;
            var8 = (nq) ((Object) var7.a(16, param1 ^ 107));
            var8.b(param1 ^ 8021, 2);
            var9.a(var5, (byte) 124, var8);
            stackIn_6_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ona.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            kh var3 = (kh) null;
            this.a(true, (kh) null);
            return true;
        }
        return true;
    }

    final static int b(int param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 0) {
          var2 = param1;
          if (1 != var2) {
            if ((var2 ^ -1) != -4) {
              if (-5 != (var2 ^ -1)) {
                if (var2 != 0) {
                  if ((var2 ^ -1) != -8) {
                    if (var2 != 5) {
                      return param1;
                    } else {
                      return 7;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  return 4;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 3;
          }
        } else {
          return -34;
        }
    }

    final void a(la param0, int param1) {
        try {
            super.a(param0, param1);
            this.field_G = -this.field_G;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ona.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -126, dqa.a(true, this.field_G, 5), 5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ona.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    ona(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_G = 4;
        try {
            this.field_G = bla.a(true, 5, param2.b((byte) 44, 5));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ona.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            kh var3 = (kh) null;
            this.a(false, (kh) null);
            return true;
        }
        return true;
    }

    ona(la param0, int param1) {
        super(param0, param1);
        this.field_G = 4;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            la var3 = (la) null;
            this.a(true, -127, (la) null);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-107, 2097152, 2097152);
        this.a((byte) 95, new mka[]{new mka(0, 0, 2097152, 0, 8)});
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_I = (String) null;
            return 7;
        }
        return 7;
    }

    static {
        field_F = "Bloom: ";
        field_I = "Asking to join <%0>'s game...";
    }
}
