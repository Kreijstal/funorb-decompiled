/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends ck implements gl {
    static long field_h;
    static String field_g;
    private ba field_i;

    public static void c(int param0) {
        field_g = null;
        if (param0 != 24562) {
            al.c(52);
        }
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -8) {
          if (((al) this).field_i.field_h != null) {
            if (((al) this).field_i.field_h.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_h = 36L;
          if (((al) this).field_i.field_h == null) {
            return true;
          } else {
            L0: {
              if (((al) this).field_i.field_h.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void a(byte param0, ba param1) {
        try {
            int var3_int = 79 % (param0 / 33);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "al.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(ba param0, byte param1) {
        RuntimeException var3 = null;
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
              if (param1 <= 81) {
                vf discarded$2 = ((al) this).b(-77);
                ((al) this).d((byte) 92);
                break L1;
              } else {
                ((al) this).d((byte) 92);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("al.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    abstract String a(String param0, byte param1);

    final vf b(int param0) {
        if (param0 != -1) {
          field_h = 47L;
          return ((al) this).b(((al) this).field_i.field_h, (byte) 54);
        } else {
          return ((al) this).b(((al) this).field_i.field_h, (byte) 54);
        }
    }

    abstract vf b(String param0, byte param1);

    al(ba param0) {
        try {
            ((al) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(int param0) {
        if (param0 != 8335) {
          vf discarded$2 = ((al) this).b(103);
          return ((al) this).a(((al) this).field_i.field_h, (byte) -114);
        } else {
          return ((al) this).a(((al) this).field_i.field_h, (byte) -114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
