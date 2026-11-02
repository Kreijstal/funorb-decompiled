/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    private int field_j;
    private int field_i;
    static kg field_c;
    private IntrusiveNode[] field_e;
    private IntrusiveNode field_f;
    static cj field_a;
    static int field_g;
    static int[] field_d;
    static int field_h;
    private IntrusiveNode field_b;

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -107) {
          field_g = 123;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void a(boolean param0) {
        if (ok.a(param0)) {
          return;
        }
        if (null == fj.field_E) {
          fj.field_E = WeightedObjectCache.a(4, -128);
        }
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != 30) {
            cg.b((byte) -92);
          }
          try {
            if (!PlatformTaskDispatcher.field_f.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("cg.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 111) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_j))];
        this.field_b = var4.previous;
        while (this.field_b != var4) {
          if (~this.field_b.key == ~param1) {
            var5 = this.field_b;
            this.field_b = this.field_b.previous;
            return var5;
          }
          this.field_b = this.field_b.previous;
        }
        this.field_b = null;
        return null;
    }

    final void a(IntrusiveNode param0, long param1, byte param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.next) {
            param0.unlink(-19822);
          }
          var5 = this.field_e[(int)(param1 & (long)(-1 + this.field_j))];
          if (param2 != -36) {
            this.a((byte) -88);
          }
          param0.previous = var5;
          param0.next = var5.next;
          param0.next.previous = param0;
          param0.key = param1;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "cg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        this.field_i = param0;
        return this.a((byte) -55);
    }

    final IntrusiveNode a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        IntrusiveNode var9;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (0 >= this.field_i) {
          do {
            if (this.field_i >= this.field_j) {
              if (param0 == -55) {
                return null;
              }
              field_d = (int[]) null;
              return null;
            }
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            var4 = this.field_e[fieldTemp$1].previous;
            var5 = var4;
          } while (var4 == this.field_e[-1 + this.field_i]);
          this.field_f = var5.previous;
          return var5;
        }
        if (this.field_e[-1 + this.field_i] != this.field_f) {
          var9 = this.field_f;
          this.field_f = var9.previous;
          return var9;
        }
        do {
          if (this.field_i >= this.field_j) {
            if (param0 == -55) {
              return null;
            }
            field_d = (int[]) null;
            return null;
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          var4 = this.field_e[fieldTemp$0].previous;
          var6 = var4;
        } while (var4 == this.field_e[-1 + this.field_i]);
        this.field_f = var6.previous;
        return var6;
    }

    cg(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_i = 0;
        this.field_j = param0;
        this.field_e = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_c = new kg();
        field_d = new int[4];
    }
}
