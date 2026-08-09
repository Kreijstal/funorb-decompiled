/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends ela {
    static int[] field_p;
    static Object field_o;

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_o = (Object) null;
                break L1;
              }
            }
            stackIn_3_0 = new bfa(qla.a(true, (String) (param0[0].field_d)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ak.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static nh[] a(ha param0, jpa[] param1, int param2) {
        nh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        nh[] var6 = null;
        Object stackIn_3_0 = null;
        nh[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var6 = new nh[param1.length];
                var3 = var6;
                if (param2 <= -54) {
                  break L1;
                } else {
                  field_p = (int[]) null;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var6.length <= var4) {
                  stackIn_10_0 = (nh[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6[var4] = su.a(param1[var4], param0, (byte) 2);
                  var4++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ak.G(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nh[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_10_0;
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 > -19) {
            return;
        }
        field_p = null;
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void g(int param0) {
        int var1;
        int var2;
        var2 = TombRacer.field_G ? 1 : 0;
        nfa.field_p = false;
        if (param0 == 0) {
          sea.field_o = null;
          if (!jf.field_r) {
            var1 = lsa.field_a;
            if (0 < var1) {
              if ((var1 ^ -1) != -2) {
                sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              } else {
                sea.field_o = aga.field_a;
                sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              }
            } else {
              ci.field_l.i((byte) 101);
              wt.a((byte) -117);
              return;
            }
          } else {
            ci.field_l.f(true);
            return;
          }
        } else {
          field_o = (Object) null;
          sea.field_o = null;
          if (!jf.field_r) {
            var1 = lsa.field_a;
            if (0 < var1) {
              if ((var1 ^ -1) != -2) {
                sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              } else {
                sea.field_o = aga.field_a;
                sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              }
            } else {
              ci.field_l.i((byte) 101);
              wt.a((byte) -117);
              return;
            }
          } else {
            ci.field_l.f(true);
            return;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        var2 = 113 / ((-14 - param1) / 40);
        if (qg.field_a.length > param0) {
          if (param0 < 0) {
            return -1;
          } else {
            return qg.field_a[param0].field_a;
          }
        } else {
          return -1;
        }
    }

    static {
    }
}
