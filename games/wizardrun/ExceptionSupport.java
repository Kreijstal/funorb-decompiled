/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ExceptionSupport {
    static AccountConnectionState field_b;
    static IntrusiveDeque field_a;
    static Sprite[] field_c;

    final static ClientException wrapException(Throwable param0, String param1) {
        ClientException var2 = null;
        if (!(param0 instanceof ClientException)) {
          var2 = new ClientException(param0, param1);
        } else {
          var2 = (ClientException) ((Object) param0);
          var2.field_b = var2.field_b + ' ' + param1;
        }
        return var2;
    }

    final static boolean ensurePacketPayload(int param0) {
        if (param0 < 20) {
          return true;
        }
        if (DelegatingCanvas.field_c == -1) {
          if (!ConfirmedEmailValidator.ensureAccountResponseBytes(1, -28266)) {
            return false;
          }
          DelegatingCanvas.field_c = AccountCreationForm.field_N.readUnsignedByte(255);
          AccountCreationForm.field_N.position = 0;
        }
        if (DelegatingCanvas.field_c == -2) {
          if (ConfirmedEmailValidator.ensureAccountResponseBytes(2, -28266)) {
            DelegatingCanvas.field_c = AccountCreationForm.field_N.readUnsignedShort(-14477);
            AccountCreationForm.field_N.position = 0;
            return ConfirmedEmailValidator.ensureAccountResponseBytes(DelegatingCanvas.field_c, -28266);
          }
          return false;
        }
        return ConfirmedEmailValidator.ensureAccountResponseBytes(DelegatingCanvas.field_c, -28266);
    }

    public static void releaseStatics(int param0) {
        if (param0 == 1) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        String var2 = (String) null;
        ExceptionSupport.wrapException((Throwable) null, (String) null);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void initializeAccountUi(int param0) {
        ValidationIndicator.field_H = SpriteButtonPainter.getDefaultWidgetTheme(4);
        GameShell.field_A = new DialogLayer();
        if (param0 <= -26) {
          WeightedLruCache.showLoginDialog(true, true, 117);
          return;
        }
        field_b = (AccountConnectionState) null;
        WeightedLruCache.showLoginDialog(true, true, 117);
    }

    static {
        field_b = new AccountConnectionState();
    }
}
