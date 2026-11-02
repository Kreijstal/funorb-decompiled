/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oi {
    int field_k;
    static String field_g;
    int field_b;
    int field_h;
    int field_d;
    int field_j;
    int field_f;
    static Sprite field_e;
    static int field_m;
    static PlatformTaskDispatcher field_l;
    static int field_c;
    static String field_i;
    static int[] field_n;
    static BitmapFont field_a;

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (PlatformTaskDispatcher.field_l.startsWith("win") &&
              in.a(18, param1)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              if (param0 < -36) {
                return;
              }
              oi.a(90);
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              fk.a(-41, (Throwable) null, "MGR1: " + param1);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("oi.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1);

    final static void a(byte param0, int param1) {
        BitPacketBuffer var2 = nd.field_Lb;
        if (param0 == 126) {
          var2.writeCipheredByte(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        }
        field_n = (int[]) null;
        var2.writeCipheredByte(param1, (byte) -92);
        var2.a(1, false);
        var2.a(3, false);
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = null;
        field_n = null;
        if (param0 >= -22) {
          field_c = -30;
        }
    }

    final static ClientException a(Throwable param0, String param1) {
        ClientException var2 = null;
        if (!(param0 instanceof ClientException)) {
          var2 = new ClientException(param0, param1);
        } else {
          var2 = (ClientException) ((Object) param0);
          var2.field_d = var2.field_d + ' ' + param1;
        }
        return var2;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_g = "to keep fullscreen or";
        field_e = new Sprite(270, 70);
        field_i = "You are offering an unrated rematch.";
        field_n = new int[256];
    }
}
