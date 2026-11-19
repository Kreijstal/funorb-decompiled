/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedServerPacket extends IntrusiveNode {
    static String field_i;
    static int field_n;
    long deliveryTime;
    static int field_m;
    static int[] field_o;
    static AsyncRequest field_k;
    byte[] payload;
    int opcode;

    public static void releaseStatics(int param0) {
        if (param0 == 24944) {
          field_k = null;
          field_i = null;
          field_o = null;
          return;
        }
        field_n = -61;
        field_k = null;
        field_i = null;
        field_o = null;
    }

    final static FullscreenFocusCanvas createFullscreenCanvas(int param0, int param1, int param2, int param3, int param4, PlatformTaskDispatcher param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        java.awt.Frame var8 = null;
        FullscreenFocusCanvas stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = GameApplet.createFullscreenFrame(param3, param1, param0, param5, param2, param4);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new FullscreenFocusCanvas();
          var7.field_c = var8;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param1, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    DelayedServerPacket(long param0, int param1, byte[] param2) {
        try {
          this.deliveryTime = param0;
          this.payload = param2;
          this.opcode = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "hb.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = 0;
        field_m = 20;
        field_i = "Create your own free Jagex account";
        field_o = new int[8192];
    }
}
