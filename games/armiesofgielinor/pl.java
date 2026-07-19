/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends bd {
    static boolean field_A;
    static String field_t;
    static wk[] field_x;
    static String field_z;
    private jd field_u;
    static String[] field_y;
    static String field_C;
    static int[] field_s;
    static wk[] field_D;
    static String field_v;
    private int field_w;

    public static void a(boolean param0) {
        wj discarded$0 = null;
        field_y = null;
        field_s = null;
        field_v = null;
        field_x = null;
        field_C = null;
        field_t = null;
        field_D = null;
        field_z = null;
        if (!param0) {
            discarded$0 = pl.a(-31, -19, 87, -24, -42);
        }
    }

    final void a(int param0, ha param1) {
        RuntimeException var3 = null;
        ha var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_u.field_N ^ -1) == -40) {
                param1.field_l.a((byte) -119, (tc) (new hp(this.field_u)));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 64) {
                break L2;
              } else {
                var4 = (ha) null;
                this.a(10, (ha) null);
                break L2;
              }
            }
            L3: {
              if (34 == this.field_u.field_N) {
                break L3;
              } else {
                if (-8 == (this.field_u.field_N ^ -1)) {
                  break L3;
                } else {
                  if (17 != this.field_u.field_N) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            param1.field_l.a((byte) -119, (tc) (new tr(this.field_u.field_J, this.field_u.field_w, this.field_w)));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("pl.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static wj a(int param0, int param1, int param2, int param3, int param4) {
        wj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = (wj) ((Object) lf.field_c.e((byte) 114));
        L0: while (true) {
          L1: {
            if (var5 == null) {
              break L1;
            } else {
              var8 = var5.field_r;
              var7 = param1;
              if (var6 != 0) {
                if (var7 != var8) {
                  field_s = (int[]) null;
                  return var5;
                } else {
                  return var5;
                }
              } else {
                if (var7 != var8) {
                  var5 = (wj) ((Object) lf.field_c.a((byte) 123));
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var5;
                }
              }
            }
          }
          var5 = new wj();
          var5.field_p = param4;
          var5.field_k = param3;
          var5.field_r = param1;
          lf.field_c.a((byte) -119, (tc) (var5));
          gn.a(param2, var5, 0);
          if (param0 != 34) {
            field_s = (int[]) null;
            return var5;
          } else {
            return var5;
          }
        }
    }

    pl(int param0, jd param1, int param2) {
        try {
            this.field_u = param1;
            this.field_w = param2;
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_t = "Email: ";
        field_y = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_z = "Show tutorial";
        field_s = new int[]{316};
        field_C = "Defeat all enemy units to win this battle.";
        field_v = "Return to lobby";
    }
}
