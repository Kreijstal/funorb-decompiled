/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_a;
    private int field_d;
    static volatile int field_b;
    private int field_c;

    final static void a(String[] args, String param1, int param2, int param3) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          ui.field_b = TriangleMesh.field_y;
          if (param3 == 255) {
            boolean stackIn_5_0 = !(gf.field_a >= 13);
            co.field_a = fc.a(stackIn_5_0, (byte) -79);
            mb.a((String[]) null, param2 + 105);
          } else if (param3 >= 100 &&
            param3 <= 105) {
            String[] var4 = args;
            mb.a(var4, 4);
            co.field_a = BufferedRandomAccessFile.a(args, (byte) -63);
          } else {
            co.field_a = bm.a(param1, param3, param2 ^ -97);
          }
          if (param2 == -101) {
            return;
          }
          field_b = 26;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var4_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("jk.A(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 14714) {
          this.field_a = 40;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 1 << param2;
        if (0 == (this.field_a & var4)) {
          return;
        }
        if (param1 != this.field_d) {
          return;
        }
        GameplaySession var5 = BoundedRandomAccessFile.activeSession;
        int var6 = -69 / ((19 - param0) / 47);
        if (var5 == null) {
          return;
        }
        this.a(param1, param2, 14714);
        var5.awardAchievement(param2, false, this.field_c, this.field_c ^ 255);
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 != -6) {
            field_b = 86;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    jk(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_a = param1;
        this.field_c = param2;
    }

    static {
        field_b = -1;
    }
}
