/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lu {
    private wj field_b;
    static String field_a;
    private wl field_d;
    private kp field_c;

    final void a(int param0) {
        wf var2;
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        this.field_b = null;
        if (param0 == 1) {
          if (!this.field_c.a(true)) {
            var2 = this.field_c.d(268435455);
            L0: while (true) {
              if (var2 != this.field_c.field_e) {
                ((eq) ((Object) var2)).a((byte) -93);
                var2 = var2.field_a;
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
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
        this.field_c = new kp();
        try {
            this.field_d = param0;
            if (this.field_d.field_A) {
                if (!this.field_d.field_u) {
                    return;
                }
                this.field_b = new wj(this.field_d);
                if (this.field_d.field_Hb > 1 && this.field_d.field_i) {
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
