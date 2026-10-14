/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterator {
    static boolean field_j;
    static UiComponent field_a;
    private ji field_e;
    private int field_d;
    static tq field_g;
    private IntrusiveNode field_h;
    private IntrusiveNode field_k;
    static UiComponent[] field_i;
    static RgbSprite[] field_f;
    static String[] field_b;
    static RgbSprite field_c;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void b(int param0) {
        this.field_d = 1;
        this.field_h = this.field_e.field_d[0].next;
        if (param0 > -71) {
          return;
        }
        this.field_k = null;
    }

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (this.field_h != this.field_e.field_d[this.field_d - 1]) {
          return true;
        }
        while (this.field_e.field_c > this.field_d) {
          fieldTemp$0 = this.field_e.field_d;
          fieldTemp$1 = this.field_d;
          this.field_d = this.field_d + 1;
          if (fieldTemp$0[fieldTemp$1].next != this.field_e.field_d[this.field_d - 1]) {
            this.field_h = this.field_e.field_d[this.field_d - 1].next;
            return true;
          }
          this.field_h = this.field_e.field_d[this.field_d - 1];
        }
        return false;
    }

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (this.field_h != this.field_e.field_d[-1 + this.field_d]) {
          var1 = this.field_h;
          this.field_h = var1.next;
          this.field_k = var1;
          return var1;
        }
        do {
          if (this.field_d >= this.field_e.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_e.field_d;
          fieldTemp$1 = this.field_d;
          this.field_d = this.field_d + 1;
          var1 = fieldTemp$0[fieldTemp$1].next;
        } while (this.field_e.field_d[this.field_d - 1] == var1);
        this.field_h = var1.next;
        this.field_k = var1;
        return var1;
    }

    final static boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        if (param0) {
          field_g = (tq) null;
        }
        stackIn_6_0 = (null != eq.gameTransport) && (MenuButton.field_i == rf.field_b);
        return stackIn_6_0;
    }

    final static int getChatMessageColor(int obfuscationGuard, ChatMessage message) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = cn.field_d;
          if (message.channel != 2) {
            if (message.channel != 4) {
              if (~message.senderId != ~Widget.field_p) {
                var2_intLifetime1 = r.field_C[message.channel];
              } else {
                var2_intLifetime1 = BackgroundScene.field_i[message.channel];
              }
            } else {
              var2_intLifetime1 = r.field_C[message.channel];
            }
          } else {
            if (!message.systemMessage) {
              if (message.messageKeyHigh16 == 0 &&
                message.messageKeyLow24 == 0) {
                var2_intLifetime1 = BackgroundScene.field_i[message.channel];
              } else {
                var2_intLifetime1 = r.field_C[message.channel];
              }
            } else {
              var2_intLifetime1 = cn.field_d;
            }
          }
          if (obfuscationGuard == -31126) {
            stackIn_18_0 = var2_intLifetime1;
            return stackIn_18_0;
          }
          stackIn_16_0 = -27;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ik.F(").append(obfuscationGuard).append(',');
          if (message == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void remove() {
        if (this.field_k == null) {
          throw new IllegalStateException();
        }
        this.field_k.unlink((byte) 111);
        this.field_k = null;
    }

    final static boolean a(int param0) {
        bg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bg var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = (bg) (ResourceArchive.field_i.first(-78));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          var3 = -90 / ((param0 + 28) / 50);
          while (var2 < var1.field_s) {
            if (var5.field_j[var2] != null &&
              0 == var5.field_j[var2].status) {
              return false;
            }
            if (var5.field_l[var2] != null &&
              var5.field_l[var2].status == 0) {
              return false;
            }
            var2++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "ik.C(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -8) {
          return;
        }
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static boolean isNameSeparator(byte obfuscationGuard, char character) {
        boolean stackIn_9_0 = false;
        if (obfuscationGuard != -9) {
          ik.isNameSeparator((byte) -124, 'V');
        }
        stackIn_9_0 = (character == 160) || (character == 32) || (character == 95) || (character == 45);
        return stackIn_9_0;
    }

    ik(ji param0) {
        this.field_k = null;
        try {
          this.field_e = param0;
          this.b(-101);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = false;
    }
}
