/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends r {
    static String[] field_G;
    private IntrusiveDeque field_H;
    static String field_E;
    static boolean field_D;

    final bb n(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        wf var2 = new wf(this.field_H);
        if (param0 != 0) {
          field_E = (String) null;
        }
        bb var3 = (bb) (var2.c(param0 ^ 15));
        while (var3 != null) {
          if (var3.field_G) {
            return var3;
          }
          var3 = (bb) (var2.a(59));
        }
        return null;
    }

    final void p(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        wf var2 = new wf(this.field_H);
        if (param0 != 0) {
          return;
        }
        bb var3 = (bb) (var2.c(15));
        while (var3 != null) {
          if (var3.a((byte) -60)) {
            var3.unlink((byte) -47);
          }
          var3 = (bb) (var2.a(30));
        }
    }

    final void l(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        wf var2 = new wf(this.field_H);
        bb var3 = (bb) (var2.c(15));
        while (var3 != null) {
          var3.field_G = false;
          var3 = (bb) (var2.a(25));
        }
        this.field_C = null;
        if (param0 != 17415) {
          field_D = true;
        }
    }

    final hm j(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        wf var2 = new wf(this.field_H);
        bb var3 = (bb) (var2.c(param0 ^ 15));
        if (param0 != 0) {
          field_G = (String[]) null;
        }
        while (var3 != null) {
          if (var3.field_G) {
            return var3.a(true);
          }
          var3 = (bb) (var2.a(param0 + 36));
        }
        return null;
    }

    final void b(hm param0, int param1) {
        try {
          if (!(param0 instanceof bb)) {
            throw new IllegalArgumentException();
          }
          bb var3 = (bb) (param0);
          this.field_H.addFirst(var3, 8364);
          if (param1 < 36) {
            this.a(-45, (byte) -105, -25, -82);
          }
          var3.field_G = true;
          var3.a(-4659, (hm) (this));
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "tb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        boolean stackIn_6_0 = (km.field_n != null) && (km.field_n.c(124));
        return stackIn_6_0;
    }

    public static void o(int param0) {
        field_G = null;
        field_E = null;
        if (param0 != 0) {
          tb.o(-104);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_s != null) {
          this.field_s.a(param3, param0, -43, (hm) (this), true);
        }
        wf var5 = new wf(this.field_H);
        hm var6 = (hm) (var5.b(-31616));
        if (param1 < 85) {
          this.field_H = (IntrusiveDeque) null;
        }
        while (var6 != null) {
          var6.a(this.field_j + param0, (byte) 124, param2, this.field_k + param3);
          var6 = (hm) (var5.a((byte) 57));
        }
    }

    final void m(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        wf var2 = new wf(this.field_H);
        bb var3 = (bb) (var2.c(15));
        while (var3 != null) {
          if (var3.j(-13907)) {
            var3.unlink((byte) -126);
          }
          var3 = (bb) (var2.a(param0 ^ 91));
        }
        this.field_C = (hm) ((Object) this.n(param0));
    }

    public tb() {
        super(0, 0, dm.field_h, r.field_B, (db) null, (wn) null);
        this.field_H = new IntrusiveDeque();
    }

    static {
        field_E = "Please enter your age in years";
        field_D = false;
    }
}
