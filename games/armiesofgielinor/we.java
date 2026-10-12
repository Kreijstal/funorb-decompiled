/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static je[] field_g;
    int field_d;
    String field_j;
    static String field_h;
    static byte[] field_a;
    String field_b;
    ResourceArchive field_c;
    static je field_f;
    static String field_i;
    String field_e;

    public static void a(byte param0) {
        if (param0 == 120) {
          field_g = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_a = null;
          return;
        }
        we.a(2, (byte) 125);
        field_g = null;
        field_f = null;
        field_h = null;
        field_i = null;
        field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static AnimationFrameSet a(int param0, boolean param1) {
        fd var2;
        int var3;
        NodeDeque stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        if (null == bk.field_e) {
          return null;
        }
        stackIn_5_0 = bk.field_e;
        stackIn_6_1 = (param1) ? false : true;
        if (((NodeDeque) (Object) stackIn_5_0).size(stackIn_6_1) == 0) {
          return null;
        }
        if (!param1) {
          return (AnimationFrameSet) null;
        }
        var2 = (fd) (bk.field_e.first((byte) 109));
        while (var2 != null) {
          var3 = var2.field_k;
          if (var3 == param0) {
            return var2.field_p;
          }
          var2 = (fd) (bk.field_e.next((byte) 123));
        }
        return null;
    }

    final static te a(int param0, int param1, sn param2) {
        RuntimeException var3 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 100) {
            stackIn_4_0 = MapTile.a(param0 - 145, aa.a(param2, 100, param1));
            return stackIn_4_0;
          }
          stackIn_2_0 = (te) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("we.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (param0 > -115) {
          return 'ﾍ';
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 < 160) {
          var3 = ou.field_a[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        return (char)var2;
    }

    private we() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new byte[]{(byte)65, (byte)79, (byte)71, (byte)2};
        field_h = "Toughest unit";
        field_i = "Suggested names: ";
    }
}
