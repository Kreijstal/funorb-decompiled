/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends jb implements ha, we {
    static int field_i;
    bf field_j;
    static int field_g;
    static ci field_k;
    static String field_h;

    final String d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_5_0 = null;
        if (param0 > 40) {
          try {
            L0: {
              L1: {
                var2_int = ((ri) this).field_j.c(false);
                var3 = ((ri) this).field_j.h(-1);
                var4 = ((ri) this).field_j.i(93);
                var5 = ca.a(13421568);
                if (1890 > var4) {
                  break L1;
                } else {
                  if (var4 > -3 + var5) {
                    break L1;
                  } else {
                    if (!tn.a(var2_int, var3, -25042, var4)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              stackOut_5_0 = oc.a(od.field_X, new String[2], (byte) -59);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L2: {
              var2 = (NumberFormatException) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = 0;
              break L2;
            }
          }
          if (decompiledRegionSelector0 == 0) {
            return oj.field_g;
          } else {
            return (String) (Object) stackIn_9_0;
          }
        } else {
          return null;
        }
    }

    final static void g(int param0) {
        jh.field_e.i(0);
        if (mk.field_e != null) {
          jh.field_e.b((mf) (Object) mk.field_e, (byte) -65);
          if (param0 <= 119) {
            field_h = null;
            return;
          } else {
            return;
          }
        } else {
          mk.field_e = new ch(jh.field_e, qf.field_g);
          jh.field_e.b((mf) (Object) mk.field_e, (byte) -65);
          if (param0 > 119) {
            return;
          } else {
            field_h = null;
            return;
          }
        }
    }

    final mk e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        mk stackIn_5_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        mk stackOut_4_0 = null;
        mk stackOut_10_0 = null;
        mk stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((ri) this).field_j.c(false);
              var3 = ((ri) this).field_j.h(-1);
              var4 = ((ri) this).field_j.i(110);
              var5 = ca.a(13421568);
              if (param0 == 4) {
                break L1;
              } else {
                var6 = null;
                ((ri) this).a((qn) null, -75);
                break L1;
              }
            }
            if (-1891 < (var4 ^ -1)) {
              stackOut_4_0 = qk.field_b;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var4 <= var5 + -3) {
                if (tn.a(var2_int, var3, param0 + -25046, var4)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_10_0 = qk.field_b;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_7_0 = qk.field_b;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return qk.field_b;
        }
        if (decompiledRegionSelector0 == 0) {
          return oa.field_a;
        } else {
          return stackIn_11_0;
        }
    }

    public static void h(int param0) {
        if (param0 != 1) {
            um discarded$0 = ri.a(94, (byte) 26);
            field_k = null;
            field_h = null;
            return;
        }
        field_k = null;
        field_h = null;
    }

    public final boolean b(int param0) {
        if (param0 != 14496) {
            return false;
        }
        return ((ri) this).field_j.h((byte) -123);
    }

    final static void a(int param0, pa param1, int param2) {
        nk var3 = null;
        var3 = qn.field_U;
        var3.f(param2, -106);
        var3.c(2, (byte) -56);
        var3.c(0, (byte) -112);
        if (param0 != -1281) {
          field_g = 45;
          var3.c(param1.field_p, (byte) 78);
          return;
        } else {
          var3.c(param1.field_p, (byte) 78);
          return;
        }
    }

    public final void b(qn param0, int param1) {
        if (param1 != 3) {
            field_i = -5;
        }
    }

    public ri() {
    }

    public final void a(qn param0, int param1) {
        if (param1 != 10999) {
            return;
        }
        ((ri) this).b(true);
    }

    final static um a(int param0, byte param1) {
        if (param1 < 126) {
            return null;
        }
        return ci.a(-17288, param0, 1, false, false, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Exploiting a bug";
    }
}
