/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends ana {
    static sna field_v;
    static int field_w;
    private sm field_x;

    public static void e(byte param0) {
        if (param0 < 53) {
          vq.a((byte) 89, false);
          field_v = null;
          return;
        }
        field_v = null;
    }

    final static void a(byte param0, boolean param1) {
        ut.field_m.a(param1, param0 + 1537025669);
        if (param0 != -64) {
          vq.e((byte) -127);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -60) {
            stackIn_4_0 = dj.a(false, -15437, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var2Lifetime1;
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (100 != this.field_l) {
          fieldTemp$0 = this.field_l - 1;
          this.field_l = this.field_l - 1;
          if (fieldTemp$0 < 0) {
            this.b(false);
            var2 = -79 / ((71 - param0) / 47);
            return true;
          }
          if (75 == this.field_l) {
            this.c(false);
          }
          return false;
        }
        wf.a(53, (byte) 126);
        fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$1 < 0) {
          this.b(false);
          var2Lifetime1 = -79 / ((71 - param0) / 47);
          return true;
        }
        if (75 != this.field_l) {
          return false;
        }
        this.c(false);
        return false;
    }

    private final void c(boolean param0) {
        Object var3;
        iv var3_ref;
        int var5;
        aga var7;
        ad var8;
        aga var9;
        ad var10;
        iv var3_refLifetime1;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (!param0) {
          var9 = this.field_x.field_l.a(25, this.field_q.field_h);
          if (var9.i(-97)) {
            return;
          }
          var3_ref = (iv) (this.field_x.field_o.b((byte) 90));
          al.a(118, this.field_x.field_k);
          while (var3_ref != null) {
            var3_ref.a(var9, this.field_q.field_h, 12);
            var10 = var3_ref.field_h.a(-27449, this.field_q);
            this.a(27799, new taa(this.field_q, var10));
            this.a(27799, new cb(var10, 6));
            this.a(27799, new wn(var10, kna.field_g[5], 24831));
            var3_ref = (iv) (this.field_x.field_o.c(0));
          }
          return;
        }
        this.field_x = (sm) null;
        var7 = this.field_x.field_l.a(25, this.field_q.field_h);
        if (var7.i(-97)) {
          return;
        }
        var3_refLifetime1 = (iv) (this.field_x.field_o.b((byte) 90));
        al.a(118, this.field_x.field_k);
        while (var3_refLifetime1 != null) {
          var3_refLifetime1.a(var7, this.field_q.field_h, 12);
          var8 = var3_refLifetime1.field_h.a(-27449, this.field_q);
          this.a(27799, new taa(this.field_q, var8));
          this.a(27799, new cb(var8, 6));
          this.a(27799, new wn(var8, kna.field_g[5], 24831));
          var3_refLifetime1 = (iv) (this.field_x.field_o.c(0));
        }
        return;
    }

    vq(gj param0, sm param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(boolean param0) {
        if (param0) {
          field_w = 77;
        }
    }

    static {
    }
}
