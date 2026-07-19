/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static ah field_c;
    static String field_f;
    private String field_e;
    private boolean field_d;
    static int field_b;
    static String field_a;

    final String a(byte param0) {
        if (param0 != -41) {
            this.field_d = true;
            return this.field_e;
        }
        return this.field_e;
    }

    final static String a(int param0, byte param1) {
        String discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        char[] var4 = null;
        if (0 > param0) {
          return "--:--";
        } else {
          if (param1 != -61) {
            discarded$1 = io.a(34, (byte) -85);
            var2 = param0 / 50;
            var3 = var2 / 60;
            var2 = var2 % 60;
            var4 = new char[5];
            var4[3] = (char)(var2 / 10 + 48);
            var4[0] = (char)(48 + var3 / 10 % 10);
            var4[1] = (char)(var3 % 10 + 48);
            var4[2] = (char)58;
            var4[4] = (char)(var2 % 10 + 48);
            return new String(var4);
          } else {
            var2 = param0 / 50;
            var3 = var2 / 60;
            var2 = var2 % 60;
            var4 = new char[5];
            var4[3] = (char)(var2 / 10 + 48);
            var4[0] = (char)(48 + var3 / 10 % 10);
            var4[1] = (char)(var3 % 10 + 48);
            var4[2] = (char)58;
            var4[4] = (char)(var2 % 10 + 48);
            return new String(var4);
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -22) {
            field_c = (ah) null;
            return this.field_d;
        }
        return this.field_d;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != 10) {
            field_f = (String) null;
        }
    }

    io(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              this.field_e = param0;
              if (this.field_e != null) {
                break L1;
              } else {
                this.field_e = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((io) (this)).field_d = stackIn_6_1 != 0;
            if (0 == this.field_e.length()) {
              this.field_d = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("io.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    io(String param0) {
        this(param0, false);
    }

    static {
        field_f = "You can also choose to play either <col=1>Practice</col> or <col=1>Demolition</col> games. The course selection in these modes depends on your progress through the <col=1>Championship</col>.<br><br><col=1>Practice</col> mode allows you to try out a course for as many laps as you like, with or without computer-controlled competitors, to help you improve your lap times.<br><br>In <col=1>Demolition</col> mode, use your shields, weaponry and front bumper to damage opponents. Eliminate <col=1>5</col> opponents to win the round.<br><br>";
        field_c = new ah();
        field_b = 0;
        field_a = "Set";
    }
}
