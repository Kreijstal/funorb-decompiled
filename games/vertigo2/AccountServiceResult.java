/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    static int field_k;
    static fc field_c;
    int statusCode;
    String[] suggestions;
    String message;
    boolean field_i;
    static String field_g;
    boolean success;
    static Model[] field_d;
    static String field_f;
    static sd field_e;

    public static void clearStaticReferences(int param0) {
        field_g = null;
        field_e = null;
        if (param0 != -81) {
          return;
        }
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static void a(HuffmanCodec param0, byte param1) {
        try {
          ko.field_M = param0;
          if (param1 < 97) {
            HuffmanCodec var3 = (HuffmanCodec) null;
            AccountServiceResult.a((HuffmanCodec) null, (byte) -110);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ch.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        int var4;
        int stackIn_23_0 = 0;
        int stackIn_54_0 = 0;
        if (param1 != 63) {
          return true;
        }
        if (null != IntrusiveDeque.field_b) {
          if (DebouncedFieldValidator.field_f == 13) {
            IntrusiveDeque.field_b = null;
            return true;
          }
          if (!MouseWheelInput.field_a) {
            if (!BufferedSocket.field_a &&
              9 != DebouncedFieldValidator.field_f &&
              DebouncedFieldValidator.field_f != 10 &&
              DebouncedFieldValidator.field_f != 11) {
              if (DebouncedFieldValidator.field_f == 80 &&
                BufferedRandomAccessFile.a(-1)) {
                MouseWheelInput.field_a = true;
                return true;
              }
              return false;
            }
            return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
          }
          if (!BufferedRandomAccessFile.a(-1)) {
            return false;
          }
          stackIn_54_0 = (!NodeHashTableIterator.a(param0, param3, 78)) ? 0 : 1;
          var4 = stackIn_54_0;
          if (DebouncedFieldValidator.field_f == 80 ||
            DebouncedFieldValidator.field_f == 84) {
            MouseWheelInput.field_a = false;
            var4 = 1;
          }
        } else {
          if (!MouseWheelInput.field_a) {
            if (BufferedSocket.field_a) {
              return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
            }
            if (9 == DebouncedFieldValidator.field_f) {
              return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
            }
            if (DebouncedFieldValidator.field_f != 10 &&
              DebouncedFieldValidator.field_f != 11) {
              if (DebouncedFieldValidator.field_f == 80 &&
                BufferedRandomAccessFile.a(-1)) {
                MouseWheelInput.field_a = true;
                return true;
              }
              return false;
            }
            return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
          }
          if (!BufferedRandomAccessFile.a(-1)) {
            return false;
          }
          stackIn_23_0 = (!NodeHashTableIterator.a(param0, param3, 78)) ? 0 : 1;
          var4 = stackIn_23_0;
          if (DebouncedFieldValidator.field_f == 80) {
            MouseWheelInput.field_a = false;
            var4 = 1;
          } else {
            if (DebouncedFieldValidator.field_f == 84) {
              MouseWheelInput.field_a = false;
              var4 = 1;
            }
          }
        }
        if (DebouncedFieldValidator.field_f == 13) {
          SpriteState.h(0);
          var4 = 1;
          MouseWheelInput.field_a = false;
        }
        return var4 != 0;
    }

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_k = 82;
        field_g = "Spectate <%0>'s game";
        field_d = new Model[2];
        field_c = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_f = "If you are not, please change your password to something more obscure!";
    }
}
