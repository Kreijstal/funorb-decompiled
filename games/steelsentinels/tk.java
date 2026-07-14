/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends ia {
    private jf field_o;
    static String field_q;
    static String field_r;
    static String field_s;
    static wk[] field_t;
    static ak field_p;
    static String field_n;

    final String a(int param0, String param1) {
        Object var4 = null;
        tl var5 = null;
        tl var6 = null;
        if (param0 == 100) {
          if (!(((tk) this).field_o instanceof qn)) {
            if (!param1.equals((Object) (Object) ((tk) this).field_o.field_y)) {
              return hh.field_h;
            } else {
              return null;
            }
          } else {
            var6 = ((qn) (Object) ((tk) this).field_o).a(false);
            if (var6 != null) {
              if (var6.a((byte) 21) == vf.field_b) {
                if (param1.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                  return var6.a(true);
                } else {
                  return hh.field_h;
                }
              } else {
                return var6.a(true);
              }
            } else {
              if (!param1.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                return hh.field_h;
              } else {
                return null;
              }
            }
          }
        } else {
          var4 = null;
          vd discarded$1 = ((tk) this).a((String) null, -43);
          if (((tk) this).field_o instanceof qn) {
            var5 = ((qn) (Object) ((tk) this).field_o).a(false);
            if (var5 != null) {
              if (var5.a((byte) 21) == vf.field_b) {
                if (!param1.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                  return hh.field_h;
                } else {
                  return var5.a(true);
                }
              } else {
                return var5.a(true);
              }
            } else {
              if (!param1.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                return hh.field_h;
              } else {
                return null;
              }
            }
          } else {
            if (!param1.equals((Object) (Object) ((tk) this).field_o.field_y)) {
              return hh.field_h;
            } else {
              return null;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, wk param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -param3 + (param7 + param6.field_D) - -param8;
        var10 = param6.field_D + param7 + (param8 + param2);
        var11 = (param6.field_F >> -1855884895) + param0 + param6.field_H;
        pb.h(var9, 0, var10, var11 + param4);
        param6.a(-1 + param7, param0 - 1, param1);
        param6.a(param7 - 1, 1 + param0, param1);
        pb.a(ti.field_n);
        pb.h(1 + var9, 0, 1 + var10, param4 + var11);
        param6.a(param7 - -1, param0 + -1, param1);
        param6.a(param7 + 1, 1 + param0, param1);
        pb.a(ti.field_n);
        if (param5 != -30456) {
          tk.f((byte) -117);
          var9 = param6.field_A + param6.field_D + (param7 + (-param8 + -param2));
          var10 = param6.field_A + param6.field_D + param7 - (param8 - -param3);
          pb.h(var9, -param4 + var11, var10, 480);
          param6.a(param7 - 1, param0 + -1, param1);
          param6.a(param7 + -1, 1 + param0, param1);
          pb.a(ti.field_n);
          pb.h(1 + var9, var11 - param4, 1 + var10, 480);
          param6.a(1 + param7, -1 + param0, param1);
          param6.a(param7 - -1, param0 - -1, param1);
          pb.a(ti.field_n);
          return;
        } else {
          var9 = param6.field_A + param6.field_D + (param7 + (-param8 + -param2));
          var10 = param6.field_A + param6.field_D + param7 - (param8 - -param3);
          pb.h(var9, -param4 + var11, var10, 480);
          param6.a(param7 - 1, param0 + -1, param1);
          param6.a(param7 + -1, 1 + param0, param1);
          pb.a(ti.field_n);
          pb.h(1 + var9, var11 - param4, 1 + var10, 480);
          param6.a(1 + param7, -1 + param0, param1);
          param6.a(param7 - -1, param0 - -1, param1);
          pb.a(ti.field_n);
          return;
        }
    }

    tk(jf param0, jf param1) {
        super(param0);
        ((tk) this).field_o = param1;
    }

    final static void f(byte param0) {
        aj var1 = null;
        var1 = (aj) (Object) ff.field_qb.c(-6533);
        if (var1 != null) {
          pb.a(var1.field_q, var1.field_z, var1.field_w);
          if (param0 <= 96) {
            field_t = null;
            pb.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
            var1.field_q = null;
            sl.field_b.a(3, (ck) (Object) var1);
            return;
          } else {
            pb.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
            var1.field_q = null;
            sl.field_b.a(3, (ck) (Object) var1);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_p = null;
        field_r = null;
        field_s = null;
        field_q = null;
        field_n = null;
        if (param0 >= -105) {
            field_n = null;
        }
    }

    final vd a(String param0, int param1) {
        tl var4 = null;
        tl var5 = null;
        vd stackIn_5_0 = null;
        vd stackIn_10_0 = null;
        vd stackIn_17_0 = null;
        vd stackIn_22_0 = null;
        vd stackIn_27_0 = null;
        vd stackIn_33_0 = null;
        vd stackOut_32_0 = null;
        vd stackOut_31_0 = null;
        vd stackOut_26_0 = null;
        vd stackOut_25_0 = null;
        vd stackOut_21_0 = null;
        vd stackOut_20_0 = null;
        vd stackOut_16_0 = null;
        vd stackOut_15_0 = null;
        vd stackOut_9_0 = null;
        vd stackOut_8_0 = null;
        vd stackOut_4_0 = null;
        vd stackOut_3_0 = null;
        if (param1 == -1) {
          if (((tk) this).field_o instanceof qn) {
            var5 = ((qn) (Object) ((tk) this).field_o).a(false);
            if (var5 != null) {
              if (var5.a((byte) 21) == vf.field_b) {
                L0: {
                  if (!param0.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                    stackOut_32_0 = fa.field_d;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = vf.field_b;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return stackIn_33_0;
              } else {
                return fa.field_d;
              }
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                  stackOut_26_0 = fa.field_d;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = vf.field_b;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                stackOut_21_0 = fa.field_d;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = vf.field_b;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          tk.e((byte) 84);
          if (((tk) this).field_o instanceof qn) {
            var4 = ((qn) (Object) ((tk) this).field_o).a(false);
            if (var4 != null) {
              if (var4.a((byte) 21) != vf.field_b) {
                return fa.field_d;
              } else {
                L3: {
                  if (!param0.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                    stackOut_16_0 = fa.field_d;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = vf.field_b;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                return stackIn_17_0;
              }
            } else {
              L4: {
                if (!param0.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                  stackOut_9_0 = fa.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = vf.field_b;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (!param0.equals((Object) (Object) ((tk) this).field_o.field_y)) {
                stackOut_4_0 = fa.field_d;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = vf.field_b;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void e(byte param0) {
        if (param0 < 22) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Firing arc";
        field_q = "Inviting <%0>";
        field_r = "<%0> might change the options - wait and see.";
        field_n = "Create a free Account";
    }
}
