/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lu {
    private wj field_b;
    static String field_a;
    private wl field_d;
    private IntrusiveDeque field_c;

    final void a(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_b = null;
        if (param0 != 1) {
          return;
        }
        if (this.field_c.isEmpty(true)) {
          return;
        }
        var2 = this.field_c.first(268435455);
        while (var2 != this.field_c.sentinel) {
          ((eq) (var2)).a((byte) -93);
          var2 = var2.next;
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
          lu.a((byte) 61);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 != 1) {
          return false;
        }
        return this.field_b != null ? true : false;
    }

    lu(wl param0) {
        this.field_c = new IntrusiveDeque();
        try {
          this.field_d = param0;
          if (this.field_d.field_A) {
            if (!this.field_d.field_u) {
              return;
            }
            this.field_b = new wj(this.field_d);
            if (this.field_d.field_Hb > 1 &&
              this.field_d.field_i) {
              if (!this.field_d.field_Nb) {
                return;
              }
              this.field_b = new wj(this.field_d);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "lu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "To server list";
    }
}
