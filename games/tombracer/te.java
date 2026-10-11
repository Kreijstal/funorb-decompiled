/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static int field_b;
    private vna field_a;

    final void a(int param0) {
        if (param0 != -10430) {
          return;
        }
        this.field_a.d(8);
    }

    final void a(uw param0, int param1) {
        kua var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -28255) {
            field_b = 19;
          }
          var3 = (kua) (this.field_a.f(-80));
          while (var3 != null) {
            param0.a((byte) 25, var3.f((byte) 103), var3);
            var3 = (kua) (this.field_a.e(111));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("te.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, vna param1) {
        int var4 = 0;
        vna var5 = null;
        kua var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 23436) {
            var5 = (vna) null;
            this.a(71, (vna) null);
          }
          var6 = (kua) (param1.f(-80));
          while (var6 != null) {
            this.field_a.b((byte) -97, new kua(var6));
            var6 = (kua) (param1.e(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("te.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(la param0, int param1) {
        int var4 = 0;
        kua var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 > -59) {
            this.a(-81);
          }
          var5 = (kua) (this.field_a.f(-80));
          while (var5 != null) {
            var5.a(param0, (byte) -72);
            var5 = (kua) (this.field_a.e(107));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("te.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    te() {
        this.field_a = new vna();
    }

    static {
    }
}
