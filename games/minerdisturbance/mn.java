/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends gk {
    static ea field_t;
    static int field_x;
    static String[] field_w;
    static String[] field_u;
    static String field_v;

    private mn(we param0, int param1) {
        super(param0, param1);
    }

    final String a(fe param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 2 / ((0 - param1) / 33);
          stackIn_1_0 = kb.a(param0.field_s.length(), false, '*');
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("mn.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    mn(int param0) {
        this(bn.field_d, param0);
    }

    final static void a(byte param0, float param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == bd.field_e) {
            bd.field_e = new jl(mb.field_b, ic.field_i);
            mb.field_b.b(1, bd.field_e);
          }
          bd.field_e.a(param0 ^ 68, param3, param1, param2);
          eh.d();
          pf.a(0, true);
          if (param0 == -63) {
            return;
          }
          mn.d(122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("mn.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_w = null;
        field_u = null;
        field_v = null;
        if (param0 == 42) {
          field_t = null;
          return;
        }
        String var2 = (String) null;
        mn.a((byte) 86, 0.39803603291511536f, true, (String) null);
        field_t = null;
    }

    static {
        field_w = new String[]{"For the paranoid miner: the Scannox 5001! If there's anything living in the volcano, this will let you see it before it sees you. It will also make spotting ore in boulders easier.", "For the paranoid miner: the Scannox 5001! If there's anything living in the Super Volcano, this will let you see it before it sees you. It will also make spotting ore in boulders easier."};
        field_u = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_v = "Main Menu";
    }
}
