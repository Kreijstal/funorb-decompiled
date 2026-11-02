/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_k;
    static fc field_c;
    int field_h;
    String[] field_b;
    String field_j;
    boolean field_i;
    static String field_g;
    boolean field_a;
    static Model[] field_d;
    static String field_f;
    static sd field_e;

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        if (param0 != -81) {
          return;
        }
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static void a(ke param0, byte param1) {
        try {
          ko.field_M = param0;
          if (param1 < 97) {
            ke var3 = (ke) null;
            ch.a((ke) null, (byte) -110);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ch.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          if (de.field_f == 13) {
            IntrusiveDeque.field_b = null;
            return true;
          }
          if (!MouseWheelInput.field_a) {
            if (!BufferedSocket.field_a &&
              9 != de.field_f &&
              de.field_f != 10 &&
              de.field_f != 11) {
              if (de.field_f == 80 &&
                im.a(-1)) {
                MouseWheelInput.field_a = true;
                return true;
              }
              return false;
            }
            return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
          }
          if (!im.a(-1)) {
            return false;
          }
          stackIn_54_0 = (!NodeHashTableIterator.a(param0, param3, 78)) ? 0 : 1;
          var4 = stackIn_54_0;
          if (de.field_f == 80 ||
            de.field_f == 84) {
            MouseWheelInput.field_a = false;
            var4 = 1;
          }
        } else {
          if (!MouseWheelInput.field_a) {
            if (BufferedSocket.field_a) {
              return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
            }
            if (9 == de.field_f) {
              return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
            }
            if (de.field_f != 10 &&
              de.field_f != 11) {
              if (de.field_f == 80 &&
                im.a(-1)) {
                MouseWheelInput.field_a = true;
                return true;
              }
              return false;
            }
            return SecondaryNodeDequeIterator.a(param1 ^ 31066, param0, param2);
          }
          if (!im.a(-1)) {
            return false;
          }
          stackIn_23_0 = (!NodeHashTableIterator.a(param0, param3, 78)) ? 0 : 1;
          var4 = stackIn_23_0;
          if (de.field_f == 80) {
            MouseWheelInput.field_a = false;
            var4 = 1;
          } else {
            if (de.field_f == 84) {
              MouseWheelInput.field_a = false;
              var4 = 1;
            }
          }
        }
        if (de.field_f == 13) {
          SpriteState.h(0);
          var4 = 1;
          MouseWheelInput.field_a = false;
        }
        return var4 != 0;
    }

    ch(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        field_k = 82;
        field_g = "Spectate <%0>'s game";
        field_d = new Model[2];
        field_c = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_f = "If you are not, please change your password to something more obscure!";
    }
}
