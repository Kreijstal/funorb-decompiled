/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareModelVertexStream {
    static String field_d;
    boolean field_b;
    static UiComponent field_g;
    VertexStreamBuffer field_e;
    static String[] bladeDeathMessages;
    boolean field_h;
    static int field_f;
    VertexStreamBuffer field_a;

    final void release(int param0) {
        if (null != this.field_a) {
          this.field_a.close(12574);
          this.field_h = false;
          if (param0 != -5941) {
            this.field_a = (VertexStreamBuffer) null;
            return;
          }
          return;
        }
        this.field_h = false;
        if (param0 == -5941) {
          return;
        }
        this.field_a = (VertexStreamBuffer) null;
    }

    final static SocketConnector createProxyConnector(String param0, int param1, boolean param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var4 = (String) null;
            HardwareModelVertexStream.createProxyConnector((String) null, -41, false);
          }
          var3 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var3)).port = param1;
          ((SocketConnector) ((Object) var3)).host = param0;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("hg.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 != 16440) {
          bladeDeathMessages = (String[]) null;
          if (!this.field_h) {
            return false;
          }
          if (!this.field_b) {
            return true;
          }
          return false;
        }
        if (!this.field_h) {
          return false;
        }
        if (!this.field_b) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 13648) {
          field_g = (UiComponent) null;
          bladeDeathMessages = null;
          return;
        }
        bladeDeathMessages = null;
    }

    HardwareModelVertexStream(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    static {
        field_d = "Fireball Launcher";
        bladeDeathMessages = new String[]{"<%0> got a bouncing blade in the face", "<%0> had a very close shave", "<%0> didn't predict the sawblade's trajectory", "<%0> wonders where these endless ceremonial sawblades come from", "<%0> found their body was not blade-proof", "<%0> played catch with a rather sharp flying disc"};
    }
}
