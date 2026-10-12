/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends lu {
    static int field_B;
    static int field_A;
    static RgbSprite field_y;
    static og[] field_w;
    static volatile boolean field_z;
    static String field_x;
    static boolean field_C;

    final String d(int param0, Widget param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            ol.b((byte) 38);
          }
          stackIn_3_0 = no.a('*', true, param1.field_v.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ol.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    ol(int param0) {
        this(ArmiesOfGielinor.field_J, param0);
    }

    public static void b(byte param0) {
        field_y = null;
        if (param0 <= 30) {
          ol.b((byte) -13);
          field_x = null;
          field_w = null;
          return;
        }
        field_x = null;
        field_w = null;
    }

    private ol(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    static {
        field_A = 5;
        field_x = "Please select options in the following rows:  ";
        field_z = true;
    }
}
