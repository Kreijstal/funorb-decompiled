/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ol {
    String field_ob;
    String field_lb;
    static long field_mb;
    static String[] field_nb;
    int field_pb;

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          tg.b(-28, 85);
          field_nb = null;
          return;
        }
        field_nb = null;
    }

    final static AchievementQuery b(int param0, int param1) {
        if (param1 >= 89) {
          AchievementQuery var2 = new AchievementQuery();
          bc.field_b.addLast(-12328, var2);
          km.a(param0, -22);
          return var2;
        }
        return (AchievementQuery) null;
    }

    tg() {
        super(0L, (ol) null);
    }

    final static boolean a(int param0, CharSequence param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 < 51) {
            CharSequence var3 = (CharSequence) null;
            tg.a(-9, (CharSequence) null);
          }
          boolean stackIn_3_0 = PacketBuffer.isValidAccountName(false, param1, 113);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("tg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String i(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (null == ThreeSliceButtonPainter.field_r) {
          return "";
        }
        return ThreeSliceButtonPainter.field_r;
    }

    static {
    }
}
