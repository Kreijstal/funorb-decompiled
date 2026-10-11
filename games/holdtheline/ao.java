/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static int[] field_d;
    static int field_a;
    static ud field_c;
    static fg field_f;
    static String field_e;
    static int field_b;

    final static boolean a(java.applet.Applet param0, boolean param1) {
        try {
          int var5 = 0;
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          var7 = HoldTheLine.field_D;
          try {
            if (kd.field_d) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (eo.a(21896, "getcookies", param0));
              var4 = fl.a(var3, (byte) -125, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
              if (param1) {
                ao.a(-7);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref;
            stackIn_22_1 = new StringBuilder().append("ao.D(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_c = null;
        if (param0 != 0) {
          field_d = (int[]) null;
        }
        field_d = null;
    }

    final static ei a(ei param0, byte param1, boolean param2, ei param3) {
        ei stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ei var5 = null;
        ei var6 = null;
        ei var7 = null;
        ei var8 = null;
        int var11 = 0;
        wd var12 = null;
        ei var13 = null;
        ei var14 = null;
        ha var15 = null;
        ei var16 = null;
        Object var17 = null;
        ha var17_ref = null;
        ei var18 = null;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        var17 = null;
        var11 = HoldTheLine.field_D;
        try {
          var5 = new ei();
          var6 = new ei();
          var7 = new ei();
          ul.a(param3, true, var7, 0, param3, var6);
          ul.a(param3, true, var7, 1, param0, var6);
          ul.a(param0, true, var7, 2, param0, var6);
          var6.a(false);
          var7.a(false);
          for (var4_int = 0; var6.field_e > var4_int; var4_int++) {
            ((ha) (var6.field_b[var4_int])).field_q = var4_int;
          }
          for (var4_intLifetime1 = 0; var4_intLifetime1 < var7.field_e; var4_intLifetime1++) {
            ((ha) (var7.field_b[var4_intLifetime1])).field_q = var4_intLifetime1;
          }
          var13 = new ei();
          kj.field_r = false;
          var8 = bb.a(0, param0, 0.0f, param3, true, (byte) -59, var7, var6);
          if (var8.field_e >= 1 &&
            qh.a((byte) -63, var8)) {
            var13.a(var8, (byte) 6);
          }
          if (!kj.field_r) {
            var14 = bb.a(var6.field_e - 1, param0, (float)param3.field_e, param3, false, (byte) -46, var7, var6);
            if (1 <= var14.field_e &&
              qh.a((byte) -63, var8)) {
              var13.a(var14, (byte) 6);
            }
          }
          for (var4_intLifetime2 = -1 + var6.field_e; var4_intLifetime2 >= 0; var4_intLifetime2--) {
            var15 = (ha) (var6.field_b[var4_intLifetime2]);
            if (!var15.field_l) {
              var15.field_l = true;
              var15.field_s.field_l = true;
              var16 = bb.a((-1 + (var4_intLifetime2 + var6.field_e)) % var6.field_e, param0, var15.field_m, param3, false, (byte) -81, var7, var6);
              if (var16.field_e >= 1 &&
                qh.a((byte) -63, var16)) {
                var13.a(var16, (byte) 6);
              }
            }
          }
          var4_intLifetime3 = 0;
          if (param1 != 21) {
            var12 = (wd) null;
            ao.a(0.2928012013435364f, false, (wd) null, -0.7333778142929077f);
          }
          while (var4_intLifetime3 < var7.field_e - 1) {
            var17_ref = (ha) (var7.field_b[var4_intLifetime3]);
            if (!var17_ref.field_l) {
              var17_ref.field_l = true;
              var17_ref.field_s.field_l = true;
              var18 = bb.a((var4_intLifetime3 + 1) % var7.field_e, param0, var17_ref.field_m, param3, true, (byte) -94, var7, var6);
              if (1 <= var18.field_e &&
                qh.a((byte) -63, var18)) {
                var13.a(var18, (byte) 6);
              }
            }
            var4_intLifetime3++;
          }
          var4_intLifetime4 = 0;
          while (var13.field_e > var4_intLifetime4) {
            var13.field_b[var4_intLifetime4] = mk.a((ei) (var13.field_b[var4_intLifetime4]), (byte) -127);
            if (((ei) (var13.field_b[var4_intLifetime4])).field_e != 0) {
              var4_intLifetime4++;
              continue;
            }
            var13.a(true, var4_intLifetime4);
          }
          stackIn_42_0 = var13;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("ao.C(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final static wd a(float param0, boolean param1, wd param2, float param3) {
        RuntimeException var4 = null;
        wd var5 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var5 = (wd) null;
            ao.a(1.1313912868499756f, true, (wd) null, -1.3016173839569092f);
          }
          stackIn_3_0 = wc.a(param2, param0, param3, (byte) -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ao.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = fc.a(-6, 5, 4);
        field_e = "Names should contain a maximum of 12 characters";
    }
}
