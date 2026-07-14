/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ff {
    static byte[][] field_s;
    static int field_u;
    static di field_r;
    static int field_v;
    static String field_w;
    private si field_t;
    private si[] field_x;

    final si a(int param0, int param1) {
        if (param0 >= -93) {
            return null;
        }
        ((rd) this).field_x[param1] = new si();
        return new si();
    }

    final void a(byte param0, dm[] param1) {
        si[] var3 = null;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        Object var7 = null;
        si[] var8 = null;
        L0: {
          var6 = Geoblox.field_C;
          if (param0 == 124) {
            break L0;
          } else {
            var7 = null;
            ((rd) this).a(-125, -66, 53, true, (el) null);
            break L0;
          }
        }
        var8 = ((rd) this).field_x;
        var3 = var8;
        var4 = 0;
        L1: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_a = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void a(boolean param0, rd param1, boolean param2) {
        int var4 = 0;
        si var5 = null;
        si var6 = null;
        int var7 = 0;
        si stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        si stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        si stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        si stackIn_8_2 = null;
        si stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        si stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        si stackOut_7_2 = null;
        si stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        si stackOut_6_2 = null;
        L0: {
          var7 = Geoblox.field_C;
          super.a((ff) (Object) param1, param0);
          if (param2) {
            var4 = 0;
            L1: while (true) {
              if (6 <= var4) {
                break L0;
              } else {
                var5 = ((rd) this).field_x[var4];
                if (var5 == null) {
                  param1.field_x[var4] = null;
                  var4++;
                  continue L1;
                } else {
                  L2: {
                    var6 = param1.field_x[var4];
                    stackOut_5_0 = (si) var5;
                    stackOut_5_1 = 2;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var6 == null) {
                      param1.field_x[var4] = new si();
                      stackOut_7_0 = (si) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = new si();
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L2;
                    } else {
                      stackOut_6_0 = (si) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (si) var6;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  ((si) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2);
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            sf.a((Object[]) (Object) ((rd) this).field_x, 0, (Object[]) (Object) param1.field_x, 0, 6);
            break L0;
          }
        }
    }

    final void a(int param0, dm param1) {
        si[] var3 = null;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        si[] var7 = null;
        var6 = Geoblox.field_C;
        var7 = ((rd) this).field_x;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_l = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void c(int param0) {
        if (param0 != 520) {
            Object var2 = null;
            rd.a(38, (String) null);
        }
        kd.field_e.f(10936);
        if (!(null != vg.field_i)) {
            vg.field_i = new rl(kd.field_e, ff.field_d);
        }
        kd.field_e.a(false, (el) (Object) vg.field_i);
    }

    final static void b(int param0) {
        oe.field_P[45] = 26;
        oe.field_P[44] = 71;
        oe.field_P[520] = 59;
        oe.field_P[222] = 58;
        oe.field_P[192] = param0;
        oe.field_P[46] = 72;
        oe.field_P[47] = 73;
        oe.field_P[92] = 74;
        oe.field_P[91] = 42;
        oe.field_P[93] = 43;
        oe.field_P[61] = 27;
        oe.field_P[59] = 57;
    }

    public rd() {
        ((rd) this).field_x = new si[6];
        ((rd) this).field_t = new si();
        ((rd) this).field_x[0] = new si();
        si var1 = new si();
        var1.a((byte) -3);
    }

    public static void a(byte param0) {
        int var1 = -71 / ((32 - param0) / 50);
        field_r = null;
        field_s = null;
        field_w = null;
    }

    final void a(dm[] param0, int param1, byte param2) {
        int var4 = param1;
        if (!(((rd) this).field_x[var4] != null)) {
            ((rd) this).field_x[var4] = new si();
        }
        ((rd) this).field_x[param1].field_a = param0;
        if (param2 <= 38) {
            field_r = null;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        si var7 = null;
        si var9 = null;
        hk var10 = null;
        si var11 = null;
        si var12 = null;
        si var13 = null;
        si var14 = null;
        el stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        el stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof hk)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (el) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (el) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (hk) (Object) stackIn_3_0;
          uh.a(param4.field_m + param2, param4.field_v + param0, -14045, param4.field_h + (param2 - -param4.field_m), param4.field_r + (param0 - -param4.field_v));
          if (var10 != null) {
            param3 = param3 & var10.field_D;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((rd) this).field_x[0];
          if (param1 < -5) {
            break L2;
          } else {
            field_s = null;
            break L2;
          }
        }
        L3: {
          ((rd) this).field_t.a((byte) -28);
          var7.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
          if (var10 == null) {
            break L3;
          } else {
            L4: {
              if (!var10.field_y) {
                break L4;
              } else {
                var11 = ((rd) this).field_x[1];
                if (var11 == null) {
                  break L4;
                } else {
                  var11.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                  break L4;
                }
              }
            }
            if (!var10.field_l) {
              break L3;
            } else {
              L5: {
                var12 = ((rd) this).field_x[3];
                if (var10.field_f == 0) {
                  break L5;
                } else {
                  if (var12 == null) {
                    break L5;
                  } else {
                    var12.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                    break L3;
                  }
                }
              }
              var9 = ((rd) this).field_x[2];
              if (var9 == null) {
                break L3;
              } else {
                var9.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                break L3;
              }
            }
          }
        }
        L6: {
          if (param4.e((byte) 54)) {
            var13 = ((rd) this).field_x[5];
            if (var13 == null) {
              break L6;
            } else {
              var13.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (!param3) {
            var14 = ((rd) this).field_x[4];
            if (var14 != null) {
              var14.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((rd) this).field_t.a((rd) this, param0, param2, param4, 0);
        id.a(true);
    }

    final static void a(int param0, String param1) {
        if (param0 > -116) {
            return;
        }
        fl.field_b = param1;
    }

    rd(rd param0, boolean param1) {
        this();
        param0.a(true, (rd) this, param1);
    }

    final static dm[] a(int param0, int param1, int param2, rh param3) {
        if (param1 >= -61) {
            field_s = null;
        }
        if (!mf.a(param2, param0, 114, param3)) {
            return null;
        }
        return hj.a(104);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new byte[250][];
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
