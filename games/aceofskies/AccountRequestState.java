/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRequestState {
    static int[] field_c;
    static fn field_a;
    static String loadingMessage;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int roundUpToMultipleOfEight(int param0, int param1) {
        int var2 = 0;
        if ((7 & param0) != 0) {
          var2 = -(param0 & 7) + 8;
        }
        int var4 = 94 % ((51 - param1) / 33);
        int var3 = var2 + param0;
        return var3;
    }

    final static void a(byte param0) {
        if (param0 != -2) {
          loadingMessage = (String) null;
          if (224 <= gn.field_a) {
            rt.b(256, (byte) -106);
            return;
          }
          int var1 = gn.field_a % 32;
          rt.b(-var1 + (32 + gn.field_a), (byte) -116);
          return;
        }
        if (224 <= gn.field_a) {
          rt.b(256, (byte) -106);
          return;
        }
        int var1Lifetime1 = gn.field_a % 32;
        rt.b(-var1Lifetime1 + (32 + gn.field_a), (byte) -116);
    }

    final static AccountServiceResult createAccountErrorResult(int param0, int param1, String param2) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 32) {
            AccountRequestState.a((byte) 54);
          }
          AccountServiceResult var3 = new AccountServiceResult(false);
          var3.statusCode = param0;
          var3.message = param2;
          AccountServiceResult stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dq.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        loadingMessage = null;
        field_a = null;
        field_c = null;
        if (param0 < 119) {
          String var2 = (String) null;
          AccountRequestState.createAccountErrorResult(-37, 70, (String) null);
        }
    }

    static {
        field_a = null;
        field_c = new int[8192];
    }
}
