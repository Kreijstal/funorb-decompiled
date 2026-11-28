/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    static int field_e;
    String[] suggestions;
    int statusCode;
    boolean success;
    String message;
    static String field_h;
    static String field_b;
    boolean field_f;

    final static ClientException wrapClientException(Throwable param0, String param1) {
        ClientException var2 = null;
        if (!(param0 instanceof ClientException)) {
          var2 = new ClientException(param0, param1);
        } else {
          var2 = (ClientException) ((Object) param0);
          var2.context = var2.context + ' ' + param1;
        }
        return var2;
    }

    final static boolean a(int param0) {
        if (param0 != 22084) {
          field_b = (String) null;
          if (AccountNameAvailabilityValidator.field_n < 10) {
            return false;
          }
          if (dk.field_c >= 13) {
            return true;
          }
          return false;
        }
        if (AccountNameAvailabilityValidator.field_n < 10) {
          return false;
        }
        if (dk.field_c >= 13) {
          return true;
        }
        return false;
    }

    final static AccountServiceResult pollAccountNameCheck(byte param0, String param1) {
        RuntimeException var2 = null;
        AccountServiceResult stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        AccountServiceResult stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -126) {
            stackIn_2_0 = (AccountServiceResult) null;
            return stackIn_2_0;
          }
          if (SpriteAnimationPlayer.field_d == DelegatingCanvas.field_f) {
            stackIn_5_0 = null;
            return (AccountServiceResult) (stackIn_5_0);
          }
          if (SpriteAnimationPlayer.field_d == SecondaryNodeDeque.field_b &&
            param1.equals(bf.field_o)) {
            SpriteAnimationPlayer.field_d = sp.field_e;
            stackIn_9_0 = DualLinkNode.field_p;
            return stackIn_9_0;
          }
          SpriteAnimationPlayer.field_d = DelegatingCanvas.field_f;
          bf.field_o = param1;
          DualLinkNode.field_p = null;
          stackIn_11_0 = null;
          return (AccountServiceResult) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("vk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -31) {
          return;
        }
        d.field_f = false;
    }

    public static void clearStaticReferences(byte param0) {
        field_b = null;
        if (param0 != 75) {
          return;
        }
        field_h = null;
    }

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_h = "Type your age in years";
        field_b = "This female demon sports a manic smile and a sadistic look in her wide, wild eyes. She uses her sharp claws to rend flesh and takes pleasure in death.";
    }
}
