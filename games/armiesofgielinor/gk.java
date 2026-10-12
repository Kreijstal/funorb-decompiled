/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends nl {
    static boolean field_H;
    static String field_L;
    static int field_J;
    static int field_K;
    private NodeDeque field_M;
    static String field_N;
    static String[] field_O;
    static long field_I;
    static String field_P;

    public gk() {
        super(0, 0, te.field_l, ij.field_x, (kh) null, (qo) null);
        this.field_M = new NodeDeque();
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_k != null) {
          this.field_k.a((kb) (this), param0, -80, true, param1);
        }
        NodeIterator var5 = new NodeIterator(this.field_M);
        if (param2 > -82) {
          field_I = -21L;
        }
        kb var6 = (kb) (var5.last(50));
        while (var6 != null) {
          var6.a(this.field_B + param0, this.field_p + param1, (byte) -121, param3);
          var6 = (kb) (var5.previous((byte) -112));
        }
    }

    final wl a(byte param0) {
        NodeIterator var2;
        wl var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = new NodeIterator(this.field_M);
        if (param0 != 89) {
          field_N = (String) null;
        }
        var3 = (wl) (var2.first(param0 - 39));
        while (var3 != null) {
          if (var3.field_L) {
            return var3;
          }
          var3 = (wl) (var2.next(50));
        }
        return null;
    }

    final void j(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          var3.field_L = false;
          var3 = (wl) (var2.next(50));
        }
        this.field_E = null;
        if (param0 >= -85) {
          this.d((byte) 125);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 == this.field_l &&
          this.field_w == param1) {
          return;
        }
        int var4 = (-this.field_l + param0) / 2;
        int var5 = (-this.field_w + param1) / 2;
        NodeIterator var6 = new NodeIterator(this.field_M);
        wl var7 = (wl) (var6.first(50));
        if (param2 != -14) {
          this.a(-19, 39, (byte) 87, 16);
        }
        while (var7 != null) {
          var7.field_p = var7.field_p + var5;
          var7.field_B = var7.field_B + var4;
          var7 = (wl) (var6.next(50));
        }
        this.field_l = param0;
        this.field_w = param1;
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
          rs.field_t = 2;
          qd.field_G = param1;
          var5 = (CharSequence) ((Object) param1);
          wm.field_b = k.a(var5, false);
          hf.field_c = true;
          if (param0 != -23503) {
            gk.a(120, (String) null, 75L);
          }
          dj.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void l(int param0) {
        field_O = null;
        if (param0 < 14) {
          field_L = (String) null;
        }
        field_P = null;
        field_L = null;
        field_N = null;
    }

    final void d(byte param0) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          if (var3.a((byte) -1)) {
            var3.unlink(-116);
          }
          var3 = (wl) (var2.next(50));
        }
        this.field_E = (kb) ((Object) this.a((byte) 89));
        int var4 = 94 / ((param0 - 30) / 60);
    }

    final void k(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        if (param0 != 0) {
          this.field_M = (NodeDeque) null;
        }
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          if (var3.k(122)) {
            var3.unlink(param0 + 37);
          }
          var3 = (wl) (var2.next(param0 ^ 50));
        }
    }

    final void a(kb param0, int param1) {
        wl var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param0 instanceof wl)) {
            throw new IllegalArgumentException();
          }
          var3 = (wl) (param0);
          this.field_M.addFirst(750, var3);
          var3.field_L = true;
          var3.a(11, (kb) (this));
          if (param1 != 0) {
            this.field_M = (NodeDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("gk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final kb a(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          if (var3.field_L) {
            return var3.e((byte) 119);
          }
          var3 = (wl) (var2.next(param0 + 1898));
        }
        if (param0 == -1848) {
          return null;
        }
        field_I = -68L;
        return null;
    }

    static {
        field_N = "First tower";
        field_L = "<%0> and <%1>";
        field_O = new String[]{"zamorak", "saradomin", "guthix"};
        field_P = "Saradomin Strikes Highscores";
    }
}
