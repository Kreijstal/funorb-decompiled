/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends vpa {
    private int field_t;
    private int field_p;
    private int field_s;
    private iu[] field_o;
    static int field_r;
    static String field_n;
    static String field_q;
    static String field_u;

    final static void b(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = c.field_g;
              var1 = var5;
              if (param0 == -62) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "td.C(" + param0 + ')');
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param0.field_f) {
                if (param0.b((byte) -34)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param0 instanceof rj)) {
                break L2;
              } else {
                param4 = param4 & ((rj) ((Object) param0)).field_y;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackIn_13_0 = this.field_s;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_t;
                  break L3;
                }
              } else {
                stackIn_13_0 = this.field_p;
                break L3;
              }
            }
            var7 = stackIn_13_0;
            if (param2 == 16777215) {
              L4: {
                wca.a(var7, this.field_o, (param0.field_p - this.field_o[0].field_k >> -357096223) + (param0.field_n + param3), 20278, param1 - -param0.field_i, param0.field_m);
                if (param4) {
                  stackIn_18_0 = 16777215;
                  break L4;
                } else {
                  stackIn_18_0 = 7105644;
                  break L4;
                }
              }
              var8 = stackIn_18_0;
              this.field_e.a(param0.field_o, param0.field_i + param1, param0.field_n + (param3 + -2), param0.field_m, param0.field_p, var8, -1, 1, 1, this.field_e.field_w);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("td.B(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public td() {
        this(2188450, 2591221, 9543);
    }

    private td(int param0, int param1, int param2) {
        this.field_p = param2;
        this.field_s = param1;
        this.field_o = nga.field_n;
        this.field_t = param0;
        this.field_e = ft.field_c;
    }

    public static void b(int param0) {
        if (param0 > -112) {
            return;
        }
        field_u = null;
        field_n = null;
        field_q = null;
    }

    static {
        field_r = 0;
        field_n = "Skeletons";
        field_u = "Crumbly blocks";
        field_q = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
