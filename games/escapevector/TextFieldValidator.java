/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidator implements TextInputListener {
    static String field_i;
    static String field_g;
    static String field_l;
    static String field_m;
    static Sprite field_j;
    static boolean field_h;
    static long field_e;
    private EditableTextWidget field;
    static String field_k;

    final String evaluateMessage(byte guard) {
        int var2 = 91 / ((52 - guard) / 53);
        return this.messageForText((byte) -109, this.field.text);
    }

    public final void onSubmit(boolean guard, EditableTextWidget field) {
        try {
          if (!guard) {
            field_l = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ah.CA(" + guard + ',' + (field != null ? "{...}" : "null") + ')');
        }
    }

    abstract ValidationState validateText(int guard, String text);

    public final boolean isEmpty(int guard) {
        int var2 = -113 % ((41 - guard) / 50);
        if (this.field.text == null) {
          return true;
        }
        if (this.field.text.length() != 0) {
          return false;
        }
        return true;
    }

    public final void onTextChanged(EditableTextWidget field, int guard) {
        if (guard != 0) {
          return;
        }
        try {
          this.markChanged(false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ah.W(" + (field != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final ValidationState evaluateState(int guard) {
        if (guard < -60) {
          return this.validateText(-1, this.field.text);
        }
        TextFieldValidator.releaseStatics(-116);
        return this.validateText(-1, this.field.text);
    }

    abstract String messageForText(byte guard, String text);

    public static void releaseStatics(int guard) {
        field_j = null;
        field_m = null;
        field_g = null;
        field_l = null;
        field_k = null;
        field_i = null;
        if (guard != -16187) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          TextFieldValidator.a((java.awt.Canvas) null, -55);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
          if (QuickChatPhraseCache.field_e == 11) {
            NameAvailabilityResultSupport.loadingRenderHook((byte) 62);
          }
          QuickChatPhraseDefinition.showLoadingProgress(AlternateUsernameCredentials.field_t, DelegatingCanvas.field_e, pb.field_d, (byte) 14);
          SecondaryNodeHashTable.presentRaster(param0, param1, param1 - 1, 0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ah.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    TextFieldValidator(EditableTextWidget param0) {
        try {
          this.field = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        ContactEntry.field_nb = null;
        IterableNodeHashTable.field_f = null;
        SecondaryNodeHashTable.field_i = null;
        ModalStack.field_G = null;
        ModalStack.field_D = false;
        if (param0 != 0) {
          field_e = -59L;
        }
    }

    static {
        field_i = "OK";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_l = "Waiting for graphics";
        field_h = false;
        field_m = "Open in popup window";
        field_k = "Close";
    }
}
