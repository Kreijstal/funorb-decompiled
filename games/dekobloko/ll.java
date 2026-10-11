/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static um field_a;

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (param1 != 0) {
          return;
        }
        if (null == vh.field_h) {
          return;
        }
        var3 = vh.field_h.a((byte) -63, param0);
        if (var3 == 0) {
          return;
        }
        if (var3 != 2) {
          vh.field_h = null;
          of.field_d = -1;
          return;
        }
        if (null == vh.field_h.field_Y) {
          vh.field_h = null;
          of.field_d = -1;
          return;
        }
        if (vh.field_h.field_Y.equals("")) {
          vh.field_h = null;
          of.field_d = -1;
          return;
        }
        if (vh.field_h.field_Y.charAt(0) != 91) {
          var7 = (CharSequence) ((Object) vh.field_h.field_Y);
          var4 = kf.a(var7, (byte) 2);
          var5 = var4;
          var5Lifetime2 = var4;
        } else {
          var4 = vh.field_h.field_Y;
        }
        var5Lifetime1 = null;
        if (of.field_d == 0) {
          var5Lifetime1 = rb.a(param2, param1 + 0, var4);
        }
        if (of.field_d == 1) {
          var5Lifetime1 = md.a(param2, var4, false);
        }
        if (of.field_d == 2) {
          var5Lifetime1 = dd.b(var4, 127, param2);
        }
        if (of.field_d == 3) {
          var5Lifetime1 = sg.a(var4, var4, param2, (byte) 125);
        }
        if (var5Lifetime1 == null) {
          vh.field_h = null;
          of.field_d = -1;
          return;
        }
        var6 = (String) null;
        ca.a(var4, (String) null, (String) (var5Lifetime1), (byte) -37, 2, 0);
        vh.field_h = null;
        of.field_d = -1;
        return;
    }

    final static boolean a(int param0, byte param1) {
        if (param0 < 0) {
          return 0 == (1 + param0) % 4 ? true : false;
        }
        if (param0 < 1582) {
          return param0 % 4 == 0 ? true : false;
        }
        if (param0 % 4 != 0) {
          return false;
        }
        if (param0 % 100 != 0) {
          return true;
        }
        if (0 != param0 % 400) {
          return false;
        }
        if (param1 <= -12) {
          return true;
        }
        field_a = (um) null;
        return true;
    }

    final static ig a(w param0, w param1, ac param2, w param3, int param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        ig stackIn_12_0 = null;
        ig stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ig[] var11 = null;
        int var12 = 0;
        ac var13_ref_ac = null;
        int var13 = 0;
        int var15 = 0;
        me var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = client.field_A ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = null;
            return (ig) (stackIn_3_0);
          }
          if (param2.field_C == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param2.field_C.length;
          }
          var5_int = stackIn_7_0;
          if (null != param2.field_E) {
            stackIn_10_0 = param2.field_E.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          if (param4 != 0) {
            stackIn_12_0 = (ig) null;
            return stackIn_12_0;
          }
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new ig[var7];
          if (null != param2.field_C) {
            for (var12 = 0; param2.field_C.length > var12; var12++) {
              var13_ref_ac = oi.field_a.a(-126, param2.field_C[var12]);
              var8[var12] = var13_ref_ac.field_H;
              var9[var12] = param2.field_G[var12];
              var11[var12] = ll.a(param0, param1, var13_ref_ac, param3, 0);
            }
          }
          if (param2.field_E != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param2.field_E.length > var14; var14++) {
              var15 = param2.field_E[var14];
              if (-1 == var15) {
                var8[var14 + var12Lifetime1] = gk.field_Gb;
                var9[var12Lifetime1 + var14] = param2.field_y[var14];
                var10[var12Lifetime1 + var14] = param2.field_E[var14];
              } else {
                var16 = wj.field_Qb.a(126, var15);
                var8[var14 + var12Lifetime1] = var16.f((byte) -81);
                var9[var12Lifetime1 + var14] = param2.field_y[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param2.field_E[var14];
              }
            }
          }
          stackIn_30_0 = new ig(0L, param0, param3, param1, var11, var20, var8, var21);
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("ll.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 29) {
          field_a = (um) null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
          return;
        }
        f.a(2, param1);
        fc.a(param0 + 6, param1);
    }

    static {
        field_a = new um();
    }
}
