/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends qg {
    int field_A;
    static String field_C;
    static int[] field_F;
    static String field_D;
    static String[] field_B;
    static int field_E;

    final static void a(String param0, byte param1) {
        System.out.println("Error: " + sb.a(param0, "%0a", "\n", 127));
        if (param1 < 105) {
            String var3 = (String) null;
            n.a((String) null, (byte) 75);
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_C = null;
        field_B = null;
        field_D = null;
        if (param0 != -89) {
            n.d((byte) -100);
        }
    }

    final static nc b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        nc var8 = null;
        int var9 = 0;
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_11_0 = null;
        nc stackIn_17_0 = null;
        nc stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_6_0 = null;
        nc stackOut_10_0 = null;
        nc stackOut_19_0 = null;
        nc stackOut_16_0 = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_6_0 = dj.field_f;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = rh.a('.', param0, -68);
                var4 = 17 % ((param1 - -44) / 33);
                if (2 > var3.length) {
                  stackOut_10_0 = ec.field_j;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3;
                  var6 = 0;
                  L1: while (true) {
                    if (var5.length <= var6) {
                      stackOut_19_0 = eb.a(-3124, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var7 = var5[var6];
                      var8 = sj.a(var7, (byte) 8);
                      if (var8 != null) {
                        stackOut_16_0 = (nc) (var8);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = ec.field_j;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("n.C(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    n(lk param0) {
        super(param0.field_o, param0.field_i, param0.field_h, param0.field_q, (ci) null, (pl) null);
        try {
            param0.a(this.field_q, 0, this.field_h, 0, true);
            this.field_A = 256;
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public n() {
        super(0, 0, 0, 0, (ci) null, (pl) null);
        this.field_A = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == (param3 ^ -1))) {
            return;
        }
        if (!(this.field_y != null)) {
            return;
        }
        if (this.field_A == 0) {
            return;
        }
        if (!(-257 != (this.field_A ^ -1))) {
            this.field_y.a(param0 + this.field_o, param1 + this.field_i, -1, param3);
            return;
        }
        kc var6 = new kc(this.field_y.field_h, this.field_y.field_q);
        dl.a(-27, var6);
        this.field_y.a(0, 0, param2 + 0, param3);
        gg.a(14756);
        var6.e(param0 - -this.field_o, param1 + this.field_i, this.field_A);
    }

    static {
        field_F = new int[8192];
        field_D = "Highscores";
        field_C = "Checking";
        field_E = 2;
        field_B = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
