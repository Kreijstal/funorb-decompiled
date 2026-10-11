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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_o = (Object) null;
          }
          stackIn_3_0 = new bfa(qla.a(true, (String) (param0[0].field_d)));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ak.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static nh[] a(ha param0, jpa[] param1, int param2) {
        int var4 = 0;
        nh[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        nh[] var6 = null;
        Object stackIn_3_0 = null;
        nh[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (nh[]) (stackIn_3_0);
          }
          var6 = new nh[param1.length];
          var3 = var6;
          if (param2 > -54) {
            field_p = (int[]) null;
          }
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = su.a(param1[var4], param0, (byte) 2);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ak.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
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
          if (jf.field_r) {
            ci.field_l.f(true);
            return;
          }
          var1 = lsa.field_a;
          if (0 < var1) {
            if (var1 != 1) {
              sea.field_o = gl.$cfr$intArgs$a$53ce4ab4c593(100, nw.field_s, new String[]{Integer.toString(var1)});
            } else {
              sea.field_o = aga.field_a;
            }
            sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
          }
          ci.field_l.i((byte) 101);
          wt.a((byte) -117);
          return;
        }
        field_o = (Object) null;
        sea.field_o = null;
        if (jf.field_r) {
          ci.field_l.f(true);
        } else {
          var1 = lsa.field_a;
          if (0 < var1) {
            if (var1 != 1) {
              sea.field_o = gl.$cfr$intArgs$a$53ce4ab4c593(100, nw.field_s, new String[]{Integer.toString(var1)});
            } else {
              sea.field_o = aga.field_a;
            }
            sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
          }
          ci.field_l.i((byte) 101);
          wt.a((byte) -117);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 113 / ((-14 - param1) / 40);
        if (qg.field_a.length <= param0) {
          return -1;
        }
        if (param0 >= 0) {
          return qg.field_a[param0].field_a;
        }
        return -1;
    }

    static {
    }
}
