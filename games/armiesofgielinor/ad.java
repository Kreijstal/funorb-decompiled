/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends tj implements he {
    private ro field_L;
    private ka field_J;
    static gu field_K;
    private String field_G;
    private int field_E;
    private int[] field_F;
    private fw[] field_H;
    static String field_I;

    final fw a(String param0, qo param1, byte param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fw(param0, param1);
            var4.field_k = (kh) ((Object) new nu());
            var5 = this.field_w - 2;
            var6 = -98 / ((24 - param2) / 44);
            this.a(0, this.field_l, 0, 8192, this.field_w + 34);
            var4.a(7, this.field_l - 14, var5, 8192, 30);
            this.a((byte) 10, (kb) (var4));
            stackIn_1_0 = (fw) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ad.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(int param0, int param1) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_E >= param0) {
            return;
        }
        int var4 = -57 % ((44 - param1) / 34);
        fw[] var8 = new fw[param0];
        fw[] var3 = var8;
        int[] var5 = new int[param0];
        for (var6 = 0; var6 < this.field_E; var6++) {
            var8[var6] = this.field_H[var6];
            var5[var6] = this.field_F[var6];
        }
        this.field_H = var3;
        this.field_E = param0;
        this.field_F = var5;
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 != 63) {
            field_I = (String) null;
        }
        field_I = null;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            for (var6_int = 0; this.field_E > var6_int; var6_int++) {
                if (!(this.field_H[var6_int] != param4)) {
                    var7 = this.field_F[var6_int];
                    if (0 != (var7 ^ -1)) {
                        gl.a(123, this.field_F[var6_int]);
                        break;
                    }
                    this.field_L.b(true);
                    break;
                }
            }
            if (param1 != 11) {
                this.field_F = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ad.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    ad(ro param0, ka param1, String param2) {
        super(0, 0, 288, 0, (kh) null);
        int var4_int = 0;
        this.field_E = 0;
        try {
            this.field_G = param2;
            this.field_L = param0;
            this.field_J = param1;
            var4_int = this.field_G != null ? this.field_J.a(this.field_G, 260, this.field_J.field_H) : 0;
            this.a(0, 288, 0, 8192, 22 - -var4_int);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -123, param3);
        this.field_J.a(this.field_G, 14 + param0 - -this.field_B, this.field_p + param1 - -10, -28 + this.field_l, this.field_w, 16777215, -1, 0, 0, this.field_J.field_H);
        if (param2 > -82) {
            ad.a((byte) 73);
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        of var1 = null;
        au var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = (of) ((Object) be.field_u.e((byte) 97));
            L1: while (true) {
              if (var1 == null) {
                var1_ref = (au) ((Object) qc.field_g.e((byte) 89));
                L2: while (true) {
                  if (var1_ref == null) {
                    var2 = -62 % ((param0 - -41) / 60);
                    var1 = (of) ((Object) wl.field_F.e((byte) 115));
                    L3: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L4: {
                          if (0 < var1.field_Rb) {
                            var1.field_Rb = var1.field_Rb - 1;
                            if (var1.field_Rb == 0) {
                              var1.field_Kb = 0;
                              if (!var1.k(0)) {
                                break L4;
                              } else {
                                var1.d(-123);
                                break L4;
                              }
                            } else {
                              var1 = (of) ((Object) wl.field_F.a((byte) 123));
                              continue L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var1 = (of) ((Object) wl.field_F.a((byte) 123));
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (0 < var1_ref.field_Lb) {
                        var1_ref.field_Lb = var1_ref.field_Lb - 1;
                        if (var1_ref.field_Lb == 0) {
                          var1_ref.field_mc = 0;
                          if (var1_ref.k(-7)) {
                            var1_ref.d(106);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref = (au) ((Object) qc.field_g.a((byte) 123));
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (0 < var1.field_Rb) {
                    var1.field_Rb = var1.field_Rb - 1;
                    if (-1 != (var1.field_Rb ^ -1)) {
                      break L6;
                    } else {
                      var1.field_Kb = 0;
                      if (!var1.k(0)) {
                        break L6;
                      } else {
                        var1.d(-126);
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var1 = (of) ((Object) be.field_u.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref2), "ad.E(" + param0 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_E;
            this.b(var4_int + param2, -104);
            this.field_H[var4_int] = this.a(param0, (qo) (this), (byte) 104);
            this.field_F[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ad.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_K = new gu();
    }
}
