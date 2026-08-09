/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements kh {
    static je field_g;
    private ka field_b;
    private int field_e;
    static String field_h;
    static sn[][] field_d;
    private int field_c;
    static dg field_f;
    static String field_a;

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 >= -9) {
          field_g = (je) null;
          field_f = null;
          field_d = (sn[][]) null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_d = (sn[][]) null;
          field_g = null;
          return;
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 <= -79) {
              L1: {
                L2: {
                  if (param0.field_t) {
                    break L2;
                  } else {
                    if (param0.a(false)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 2188450;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 3249872;
                break L1;
              }
              L3: {
                var6_int = stackIn_7_0;
                this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_v + "</u>", param0.field_B + param1, param0.field_p + param4, param0.field_l, param0.field_w, var6_int, -1, this.field_e, this.field_c, this.field_b.field_H - -this.field_b.field_L);
                if (!param0.a(false)) {
                  break L3;
                } else {
                  L4: {
                    var7 = this.field_b.a(param0.field_v);
                    var8 = this.field_b.field_H + this.field_b.field_L;
                    var9 = param1 - -param0.field_B;
                    if (-3 == (this.field_e ^ -1)) {
                      var9 = var9 + (-var7 + param0.field_l);
                      break L4;
                    } else {
                      if ((this.field_e ^ -1) == -2) {
                        var9 = var9 + (param0.field_l - var7 >> -237831007);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var10 = param4 + param0.field_p;
                    if (-3 == (this.field_c ^ -1)) {
                      var10 = var10 + (param0.field_w + -var8);
                      break L5;
                    } else {
                      if (this.field_c != 1) {
                        break L5;
                      } else {
                        var10 = var10 + (param0.field_w - var8 >> 1595299585);
                        break L5;
                      }
                    }
                  }
                  na.c(4 + var7, -2 + var9, -70, var8, 2 + var10);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("td.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0;
        if ((var2 ^ -1) != -60) {
          if (-54 != (var2 ^ -1)) {
            if (var2 != 43) {
              if (var2 != 63) {
                if (-59 != (var2 ^ -1)) {
                  if (param1 > -40) {
                    return -5;
                  } else {
                    return -1;
                  }
                } else {
                  return 1;
                }
              } else {
                return 0;
              }
            } else {
              return 4;
            }
          } else {
            return 3;
          }
        } else {
          return 2;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        rn.a(3, (String) null, param0, param1);
        if (param2 <= 4) {
            td.a(46, (byte) -104);
        }
    }

    public td() {
        this.field_b = ArmiesOfGielinor.field_J;
        this.field_e = 1;
        this.field_c = 1;
    }

    td(ka param0, int param1, int param2) {
        try {
            this.field_b = param0;
            this.field_c = param2;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = "This unit has ingested a cloning catalyst and will leave behind a perfect replica when it next moves.";
        field_a = "<%0>-<%1>";
    }
}
