/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    private int field_e;
    static ta field_c;
    private al field_b;
    static String[] field_f;
    private al[] field_a;
    static String field_d;
    static int field_g;
    private long field_h;

    final void a(long param0, boolean param1, al param2) {
        al var5 = null;
        try {
          if (null != param2.field_q) {
            param2.a((byte) -105);
          }
          var5 = this.field_a[(int)(param0 & (long)(-1 + this.field_e))];
          param2.field_t = var5;
          if (!param1) {
            al var6 = (al) null;
            this.a(23L, true, (al) null);
          }
          param2.field_q = var5.field_q;
          param2.field_q.field_t = param2;
          param2.field_t.field_q = param2;
          param2.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "om.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        ik.field_N = null;
        cg.field_C = false;
        ce.field_c = null;
        if (param0 == -22126) {
          oe.field_g = null;
          field_f = null;
          return;
        }
        field_g = 40;
        oe.field_g = null;
        field_f = null;
    }

    final al a(int param0, long param1) {
        al var4;
        al var5;
        int var6;
        var6 = MinerDisturbance.field_ab;
        this.field_h = param1;
        var4 = this.field_a[(int)((long)(this.field_e - 1) & param1)];
        this.field_b = var4.field_t;
        if (param0 != -7895) {
          return (al) null;
        }
        while (true) {
          if (var4 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~this.field_b.field_p != ~param1) {
            this.field_b = this.field_b.field_t;
            continue;
          }
          break;
        }
        var5 = this.field_b;
        this.field_b = this.field_b.field_t;
        return var5;
    }

    final static void a(byte param0) {
        tm var2 = null;
        tm var2Lifetime1;
        tm var2Lifetime2;
        tm var2Lifetime3;
        if (param0 <= -89) {
          var2 = (tm) (ok.field_b.b(94));
          if (var2 != null) {
            var2.b((byte) 94);
          }
          var2Lifetime3 = (tm) (ec.field_c.b(117));
          if (var2Lifetime3 != null) {
            var2Lifetime3.b((byte) 94);
          }
          return;
        }
        field_d = (String) null;
        var2Lifetime1 = (tm) (ok.field_b.b(94));
        if (var2Lifetime1 != null) {
          var2Lifetime1.b((byte) 94);
        }
        var2Lifetime2 = (tm) (ec.field_c.b(117));
        if (var2Lifetime2 != null) {
          var2Lifetime2.b((byte) 94);
        }
    }

    final al c(int param0) {
        al var2;
        al var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        if (this.field_b == null) {
          return null;
        }
        var2 = this.field_a[(int)(this.field_h & (long)(this.field_e - param0))];
        while (true) {
          if (this.field_b == var2) {
            this.field_b = null;
            return null;
          }
          if (this.field_b.field_p != this.field_h) {
            this.field_b = this.field_b.field_t;
            continue;
          }
          break;
        }
        var3 = this.field_b;
        this.field_b = this.field_b.field_t;
        return var3;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 == 0) {
          return;
        }
        field_d = (String) null;
    }

    om(int param0) {
        int var2 = 0;
        al dupTemp$1 = null;
        al var3;
        this.field_a = new al[param0];
        this.field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new al();
          var3 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          var3.field_t = var3;
          var3.field_q = var3;
        }
    }

    static {
        field_d = "Crampons: Grants grip on ice.";
    }
}
