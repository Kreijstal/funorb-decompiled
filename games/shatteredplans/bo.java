/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends jl implements bp {
    private kg field_X;
    static String field_Y;

    public static void p(int param0) {
        field_Y = null;
        if (param0 != 0) {
            field_Y = null;
        }
    }

    bo(tc param0, ih param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        vg var6 = null;
        String var7 = null;
        vg var8 = null;
        String var9 = null;
        vg var10 = null;
        vg var11 = null;
        var3 = null;
        if (eo.field_Z != param1) {
          if (param1 != bg.field_f) {
            L0: {
              if (param1 != pe.field_E) {
                break L0;
              } else {
                ((bo) this).field_n = ((bo) this).field_n + 30;
                var3 = sc.field_p;
                break L0;
              }
            }
            var11 = new vg(var3, (ko) null);
            var11.field_q = 50;
            var11.field_x = ((bo) this).field_x;
            var11.field_m = 0;
            var11.field_n = 80;
            var11.field_p = (iq) (Object) new o(mf.field_x, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((bo) this).b((byte) -49, var11);
            ((bo) this).field_X = this.a((ko) this, nf.field_i, 0);
          } else {
            var7 = lp.field_z;
            var3 = var7;
            var3 = var7;
            ((bo) this).field_n = ((bo) this).field_n + 10;
            if (cb.c((byte) 58)) {
              ((bo) this).field_n = ((bo) this).field_n + 20;
              var9 = rm.field_c;
              var3 = var9;
              var3 = var9;
              var10 = new vg(var9, (ko) null);
              var10.field_q = 50;
              var10.field_x = ((bo) this).field_x;
              var10.field_m = 0;
              var10.field_n = 80;
              var10.field_p = (iq) (Object) new o(mf.field_x, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((bo) this).b((byte) -49, var10);
              ((bo) this).field_X = this.a((ko) this, nf.field_i, 0);
            } else {
              var8 = new vg(var7, (ko) null);
              var8.field_q = 50;
              var8.field_x = ((bo) this).field_x;
              var8.field_m = 0;
              var8.field_n = 80;
              var8.field_p = (iq) (Object) new o(mf.field_x, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((bo) this).b((byte) -49, var8);
              ((bo) this).field_X = this.a((ko) this, nf.field_i, 0);
            }
          }
        } else {
          var5 = ne.field_n;
          var6 = new vg(var5, (ko) null);
          var6.field_q = 50;
          var6.field_x = ((bo) this).field_x;
          var6.field_m = 0;
          var6.field_n = 80;
          var6.field_p = (iq) (Object) new o(mf.field_x, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((bo) this).b((byte) -49, var6);
          ((bo) this).field_X = this.a((ko) this, nf.field_i, 0);
        }
    }

    final static void r(int param0) {
        sl.a(param0 ^ param0, of.field_b);
    }

    final static boolean q(int param0) {
        int var1 = -98 / ((param0 - -33) / 63);
        return !wh.field_a.b(14) ? true : false;
    }

    private final kg a(ko param0, String param1, int param2) {
        kg var4 = null;
        int var5 = 0;
        var4 = new kg(param1, param0);
        var4.field_p = (iq) (Object) new qp();
        var5 = -6 + ((bo) this).field_n;
        ((bo) this).field_n = ((bo) this).field_n + 38;
        if (param2 != 0) {
          bo.p(-92);
          var4.a(var5, 30, (byte) 126, 15, ((bo) this).field_x - 14 + -16);
          ((bo) this).b((byte) -50, (vg) (Object) var4);
          ((bo) this).d((byte) 90);
          return var4;
        } else {
          var4.a(var5, 30, (byte) 126, 15, ((bo) this).field_x - 14 + -16);
          ((bo) this).b((byte) -50, (vg) (Object) var4);
          ((bo) this).d((byte) 90);
          return var4;
        }
    }

    private final void f(boolean param0) {
        if (!param0) {
            return;
        }
        if (!((bo) this).field_E) {
            return;
        }
        ((bo) this).field_E = false;
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.c(1, (byte) -76);
        var2.c(param1, (byte) -97);
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        if (param0 != ((bo) this).field_X) {
          if (param1 != 6) {
            this.f(true);
            return;
          } else {
            return;
          }
        } else {
          this.f(true);
          if (param1 == 6) {
            return;
          } else {
            this.f(true);
            return;
          }
        }
    }

    final static vm a(int[] param0, byte param1, qr param2, qr param3, qr param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        vm[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        dp var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ShatteredPlansClient.field_F ? 1 : 0;
                    var5 = param0.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new vm[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 < -106) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (vm) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        var10_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 <= var10_int) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var11 = dh.field_c.a((byte) 47, param0[var10_int]);
                        var6[var10_int] = var11.f(80);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 9: {
                    return new vm(0L, param3, param4, param2, var8, param0, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
