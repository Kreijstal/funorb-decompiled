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
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var7 = c.field_g;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 != -62) {
          field_q = null;
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            }
          }
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          if (!param0.field_f) {
            if (param0.b((byte) -34)) {
              L1: {
                var6 = 1;
                if (!(param0 instanceof rj)) {
                  break L1;
                } else {
                  param4 = param4 & ((rj) (Object) param0).field_y;
                  break L1;
                }
              }
              L2: {
                if (param4) {
                  if (var6 != 0) {
                    stackOut_10_0 = ((td) this).field_s;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((td) this).field_t;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                } else {
                  stackOut_7_0 = ((td) this).field_p;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
              var7 = stackIn_11_0;
              if (param2 != 16777215) {
                return;
              } else {
                L3: {
                  wca.a(var7, ((td) this).field_o, (param0.field_p - ((td) this).field_o[0].field_k >> -357096223) + (param0.field_n + param3), 20278, param1 - -param0.field_i, param0.field_m);
                  if (param4) {
                    stackOut_14_0 = 16777215;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 7105644;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                var8 = stackIn_15_0;
                int discarded$2 = ((td) this).field_e.a(param0.field_o, param0.field_i + param1, param0.field_n + (param3 + -2), param0.field_m, param0.field_p, var8, -1, 1, 1, ((td) this).field_e.field_w);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_18_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_18_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_18_0;
          if (!(param0 instanceof rj)) {
            break L4;
          } else {
            param4 = param4 & ((rj) (Object) param0).field_y;
            break L4;
          }
        }
        L5: {
          if (param4) {
            if (var6 != 0) {
              stackOut_24_0 = ((td) this).field_s;
              stackIn_25_0 = stackOut_24_0;
              break L5;
            } else {
              stackOut_23_0 = ((td) this).field_t;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            }
          } else {
            stackOut_21_0 = ((td) this).field_p;
            stackIn_25_0 = stackOut_21_0;
            break L5;
          }
        }
        var7 = stackIn_25_0;
        if (param2 != 16777215) {
          return;
        } else {
          L6: {
            wca.a(var7, ((td) this).field_o, (param0.field_p - ((td) this).field_o[0].field_k >> -357096223) + (param0.field_n + param3), 20278, param1 - -param0.field_i, param0.field_m);
            if (param4) {
              stackOut_28_0 = 16777215;
              stackIn_29_0 = stackOut_28_0;
              break L6;
            } else {
              stackOut_27_0 = 7105644;
              stackIn_29_0 = stackOut_27_0;
              break L6;
            }
          }
          var8 = stackIn_29_0;
          int discarded$3 = ((td) this).field_e.a(param0.field_o, param0.field_i + param1, param0.field_n + (param3 + -2), param0.field_m, param0.field_p, var8, -1, 1, 1, ((td) this).field_e.field_w);
          return;
        }
    }

    public td() {
        this(2188450, 2591221, 9543);
    }

    private td(int param0, int param1, int param2) {
        ((td) this).field_p = param2;
        ((td) this).field_s = param1;
        ((td) this).field_o = nga.field_n;
        ((td) this).field_t = param0;
        ((td) this).field_e = ft.field_c;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
        field_n = "Skeletons";
        field_u = "Crumbly blocks";
        field_q = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
