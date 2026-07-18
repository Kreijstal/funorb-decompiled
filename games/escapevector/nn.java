/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    private fl[] field_f;
    static ed[] field_a;
    private int field_d;
    private fl field_b;
    static String[] field_i;
    static String field_e;
    static String field_c;
    private long field_h;
    static hh field_g;

    final void a(long param0, fl param1, int param2) {
        fl var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_i) {
                break L1;
              } else {
                param1.d(-39);
                break L1;
              }
            }
            L2: {
              var5 = ((nn) this).field_f[(int)(param0 & (long)(((nn) this).field_d + -1))];
              param1.field_j = var5;
              param1.field_i = var5.field_i;
              param1.field_i.field_j = param1;
              param1.field_j.field_i = param1;
              param1.field_p = param0;
              if (param2 > 24) {
                break L2;
              } else {
                nn.b((byte) -113);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("nn.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 <= 48) {
            field_g = null;
            field_g = null;
            field_a = null;
            field_i = null;
            field_e = null;
            return;
        }
        field_g = null;
        field_a = null;
        field_i = null;
        field_e = null;
    }

    final fl a(int param0, long param1) {
        fl var4 = null;
        fl var5 = null;
        int var6 = 0;
        fl var7 = null;
        fl var8 = null;
        var6 = EscapeVector.field_A;
        if (param0 <= -4) {
          ((nn) this).field_h = param1;
          var7 = ((nn) this).field_f[(int)(param1 & (long)(((nn) this).field_d - 1))];
          var4 = var7;
          ((nn) this).field_b = var7.field_j;
          L0: while (true) {
            if (var4 == ((nn) this).field_b) {
              ((nn) this).field_b = null;
              return null;
            } else {
              if (~((nn) this).field_b.field_p == ~param1) {
                var5 = ((nn) this).field_b;
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                return var5;
              } else {
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                continue L0;
              }
            }
          }
        } else {
          ((nn) this).field_h = 26L;
          ((nn) this).field_h = param1;
          var8 = ((nn) this).field_f[(int)(param1 & (long)(((nn) this).field_d - 1))];
          var4 = var8;
          ((nn) this).field_b = var8.field_j;
          L1: while (true) {
            if (var4 == ((nn) this).field_b) {
              ((nn) this).field_b = null;
              return null;
            } else {
              if (~((nn) this).field_b.field_p == ~param1) {
                var5 = ((nn) this).field_b;
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                return var5;
              } else {
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param0.getGraphics();
                md.field_D.a(param1, param2 ^ param2, 0, var4);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param0.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("nn.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + 0 + ')');
        }
    }

    final fl a(byte param0) {
        fl var3 = null;
        int var4 = EscapeVector.field_A;
        if (null == ((nn) this).field_b) {
            return null;
        }
        fl var2 = ((nn) this).field_f[(int)((long)(((nn) this).field_d + -1) & ((nn) this).field_h)];
        while (((nn) this).field_b != var2) {
            if (!(((nn) this).field_h != ((nn) this).field_b.field_p)) {
                var3 = ((nn) this).field_b;
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                return var3;
            }
            ((nn) this).field_b = ((nn) this).field_b.field_j;
        }
        if (param0 != -36) {
            fl discarded$0 = ((nn) this).a((byte) 87);
            ((nn) this).field_b = null;
            return null;
        }
        ((nn) this).field_b = null;
        return null;
    }

    nn(int param0) {
        int var2 = 0;
        fl var3 = null;
        ((nn) this).field_f = new fl[param0];
        ((nn) this).field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
            fl dupTemp$0 = new fl();
            var3 = dupTemp$0;
            ((nn) this).field_f[var2] = dupTemp$0;
            var3.field_j = var3;
            var3.field_i = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Power-up is on hill - please land closer";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
