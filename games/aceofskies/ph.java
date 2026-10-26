/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_f;
    private IntrusiveNode[] field_d;
    private IntrusiveNode field_c;
    private int field_b;
    private IntrusiveNode field_a;
    private int field_e;

    final IntrusiveNode a(boolean param0) {
        if (param0) {
          return (IntrusiveNode) null;
        }
        this.field_e = 0;
        return this.a(0);
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        IntrusiveNode var4 = this.field_d[(int)((long)(this.field_b - 1) & param1)];
        this.field_a = var4.next;
        while (var4 != this.field_a) {
          if (~param1 == ~this.field_a.key) {
            var5 = this.field_a;
            this.field_a = this.field_a.next;
            return var5;
          }
          this.field_a = this.field_a.next;
        }
        if (param0 != 106) {
          String var7 = (String) null;
          ph.a((String) null, 95);
        }
        this.field_a = null;
        return null;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[-1 + var2_int - var4] = param0.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ph.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var4 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        for (var2 = param0; var2 < this.field_b; var2++) {
          var3 = this.field_d[var2];
          while (true) {
            var4 = var3.next;
            if (var3 == var4) {
              break;
            }
            var4.unlink(-123);
          }
        }
        this.field_c = null;
        this.field_a = null;
    }

    final void a(int param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(-123);
          }
          var5 = this.field_d[(int)(param1 & (long)(-1 + this.field_b))];
          param2.next = var5;
          int var6 = -19 / ((param0 - 43) / 54);
          param2.previous = var5.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ph.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_e > param0 &&
          this.field_c != this.field_d[this.field_e - 1]) {
          var2 = this.field_c;
          this.field_c = var2.next;
          return var2;
        }
        do {
          if (this.field_e >= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var2 = this.field_d[fieldTemp$0].next;
        } while (this.field_d[this.field_e - 1] == var2);
        this.field_c = var2.next;
        return var2;
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 <= 67) {
          field_f = (String) null;
        }
    }

    ph(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_e = 0;
        this.field_b = param0;
        this.field_d = new IntrusiveNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_d[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
