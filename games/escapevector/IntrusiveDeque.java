/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static LoginStage field_a;
    IntrusiveNode sentinel;
    private IntrusiveNode cursor;
    static String field_h;
    static IntrusiveDeque field_f;
    static char[] field_c;
    static String field_e;
    static String field_b;

    final IntrusiveNode removeLast(int guard) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          return null;
        }
        var2.unlink((byte) -120);
        if (guard == -8980) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final boolean isEmpty(int guard) {
        if (guard <= -93) {
          return this.sentinel == this.sentinel.next ? true : false;
        }
        this.size((byte) -39);
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final void clear(byte guard) {
        int var3 = EscapeVector.obfuscationControl;
        while (true) {
          IntrusiveNode var2_ref_hg = this.sentinel.next;
          if (var2_ref_hg != this.sentinel) {
            var2_ref_hg.unlink((byte) -46);
            continue;
          }
          break;
        }
        int var2 = -116 % ((53 - guard) / 46);
        this.cursor = null;
        return;
    }

    final IntrusiveNode removeFirst(int guard) {
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          return null;
        }
        if (guard == -20245) {
          var2.unlink((byte) -119);
          return var2;
        }
        field_f = (IntrusiveDeque) null;
        var2.unlink((byte) -119);
        return var2;
    }

    final IntrusiveNode first(boolean guard) {
        if (guard) {
          this.isEmpty(-119);
          IntrusiveNode var2 = this.sentinel.next;
          if (this.sentinel != var2) {
            this.cursor = var2.next;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        IntrusiveNode var2Lifetime1 = this.sentinel.next;
        if (this.sentinel != var2Lifetime1) {
          this.cursor = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.cursor = null;
        return null;
    }

    public static void releaseStatics(boolean guard) {
        field_e = null;
        if (!guard) {
          return;
        }
        field_f = null;
        field_h = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final void addFirst(IntrusiveNode node, int guard) {
        try {
          if (null != node.previous) {
            node.unlink((byte) -67);
          }
          node.next = this.sentinel.next;
          node.previous = this.sentinel;
          node.previous.next = node;
          if (guard != 8364) {
            this.clear((byte) 45);
          }
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cn.D(" + (node != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final int size(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (guard > 12) {
          int var2 = 0;
          IntrusiveNode var3 = this.sentinel.next;
          while (this.sentinel != var3) {
            var2++;
            var3 = var3.next;
          }
          return var2;
        }
        return -109;
    }

    final IntrusiveNode next(byte guard) {
        if (guard != 70) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        return var2;
    }

    final void addLast(int guard, IntrusiveNode node) {
        try {
          if (node.previous != null) {
            node.unlink((byte) -25);
          }
          node.previous = this.sentinel.previous;
          node.next = this.sentinel;
          if (guard != -12328) {
            this.removeFirst(50);
          }
          node.previous.next = node;
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cn.A(" + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    static {
        field_a = new LoginStage();
        field_c = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_e = "Log in / Create account";
        field_b = "This password contains your Player Name, and would be easy to guess";
        field_f = new IntrusiveDeque();
    }
}
