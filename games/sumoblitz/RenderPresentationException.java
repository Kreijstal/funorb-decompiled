/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderPresentationException extends Exception {
    static QuickChatCommand field_e;
    static String[] field_b;
    static String menuText;
    static DialogLayer field_a;
    static int field_d;

    public RenderPresentationException() {
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return TextureCombineSource.field_a == 1 ? true : false;
        }
        field_b = (String[]) null;
        return TextureCombineSource.field_a == 1 ? true : false;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 1) {
          field_a = null;
          field_e = null;
          menuText = null;
          field_b = null;
          return;
        }
        menuText = (String) null;
        field_a = null;
        field_e = null;
        menuText = null;
        field_b = null;
    }

    final static SocketConnector a(String param0, int param1, boolean param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ProxySocketConnector();
          if (!param2) {
            field_b = (String[]) null;
          }
          ((SocketConnector) ((Object) var3)).field_b = param0;
          ((SocketConnector) ((Object) var3)).field_d = param1;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("rf.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = new QuickChatCommand(8, 0, 4, 1);
        menuText = "Menu";
        field_b = new String[255];
    }
}
