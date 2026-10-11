/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpa implements bo {
    private int field_a;
    static jea field_b;
    private int field_c;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_b = (jea) null;
        }
    }

    public final void a(int param0, kh param1) {
        try {
          param1.i(this.field_a, param0 - 200);
          if (param0 != 200) {
            this.field_a = -84;
          }
          param1.i(this.field_c, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qpa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_a = param0;
        int var3 = 28 % ((-35 - param1) / 61);
    }

    public final void a(kh param0, byte param1) {
        try {
          this.field_a = param0.h(255);
          if (param1 != -19) {
            qpa.a(false);
          }
          this.field_c = param0.h(255);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qpa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 7) {
          kh var4 = (kh) null;
          this.a((kh) null, (byte) -41);
          this.field_c = param1;
          return;
        }
        this.field_c = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5 < 123) {
            qpa.a(true);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param2 != 0) {
            if (1 == param2) {
              uw.field_g[param2] = (wv) ((Object) new se(param2, param6, param4, param0, param3, param1));
            } else {
              if (param2 != 2) {
                if (param2 == 3) {
                  uw.field_g[param2] = (wv) ((Object) new pk(param2, param6, param4, param0, param3, param1));
                } else {
                  if (4 != param2 &&
                    param2 != 12) {
                    if (param2 == 5) {
                      uw.field_g[param2] = (wv) ((Object) new qp(param2, param6, param4, param0, param3, param1));
                    } else {
                      if (param2 == 6) {
                        uw.field_g[param2] = (wv) ((Object) new vba(param2, param6, param4, param0, param3, param1));
                      } else {
                        if (param2 == 7) {
                          uw.field_g[param2] = (wv) ((Object) new ow(param2, param6, param4, param0, param3, param1));
                        } else {
                          if (param2 == 8) {
                            uw.field_g[param2] = (wv) ((Object) new jn(param2, param6, param4, param0, param3, param1));
                          } else {
                            if (param2 == 9) {
                              uw.field_g[param2] = (wv) ((Object) new oka(param2, param6, param4, param0, param3, param1));
                            } else {
                              if (param2 == 10) {
                                uw.field_g[param2] = (wv) ((Object) new vv(param2, param6, param4, param0, param3, param1));
                              } else {
                                if ((param2 == 11)) {
                                  uw.field_g[param2] = (wv) ((Object) new rd(param2, param6, param4, param0, param3, param1));
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    uw.field_g[param2] = (wv) ((Object) new epa(param2, param6, param4, param0, param3, param1));
                  }
                }
              } else {
                uw.field_g[param2] = (wv) ((Object) new jn(param2, param6, param4, param0, param3, param1));
              }
            }
          } else {
            uw.field_g[param2] = (wv) ((Object) new sv(param2, param6, param4, param0, param3, param1));
          }
          uw.field_g[param2].field_p = pm.field_h[param2];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_32_0 = var7;
          stackIn_32_1 = new StringBuilder().append("qpa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
    }
}
