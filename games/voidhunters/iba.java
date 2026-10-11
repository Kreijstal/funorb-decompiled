/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iba extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -72);
          }
          stackIn_3_0 = new nc(nda.field_q);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("iba.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(no param0, int param1, byte param2, int param3, phb[] param4, boolean param5, String param6, int param7, int param8, boolean param9, int param10, phb[] param11, int param12, int param13, int param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        phb[] var16 = null;
        try {
          qma.a(param0, ag.field_p, fda.field_o, param13, param12, param14, param10, param3, param0, skb.field_o, param14, param8, new bc(param11), mb.field_j, eqa.field_o, eh.field_p, param2 + 29, param1, new bc(param4), param10);
          k.a(param7, param9, param6, param5, (byte) 25);
          if (param2 != -115) {
            var16 = (phb[]) null;
            iba.a((no) null, 4, (byte) 70, -69, (phb[]) null, true, (String) null, -82, -63, false, -29, (phb[]) null, -73, 82, -95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("iba.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final static tsa a(int param0, qab param1) {
        int fieldTemp$6 = 0;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$8 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tsa stackIn_3_0 = null;
        int stackIn_16_0 = 0;
        tsa stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          fieldTemp$6 = param1.field_b - 1;
          param1.field_b = param1.field_b - 1;
          var2_int = fieldTemp$6;
          var3 = new StringBuilder();
          var4 = param1.a(-76);
          if (param0 < 10) {
            stackIn_3_0 = (tsa) null;
            return stackIn_3_0;
          }
          discarded$7 = var3.append((char) var4);
          var5 = 0;
          while (!param1.a((byte) -126)) {
            var6 = param1.a(-82);
            if (var5 != 0) {
              var5 = 0;
              discarded$9 = var3.append((char) var6);
              continue;
            }
            if (var6 != 92) {
              discarded$8 = var3.append((char) var6);
            } else {
              var5 = 1;
            }
            if (var4 != var6) {
              continue;
            }
            break;
          }
          if (34 != var4) {
            stackIn_16_0 = ek.field_o;
          } else {
            stackIn_16_0 = dla.field_d;
          }
          var6Lifetime1 = stackIn_16_0;
          stackIn_17_0 = new tsa(var6Lifetime1, var2_int, var3.toString());
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("iba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    iba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
