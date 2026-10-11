/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea {
    static fp field_c;
    static String field_f;
    private od field_d;
    private ji field_e;
    private vj field_a;
    private int field_b;

    public static void a(byte param0) {
        if (param0 < -92) {
          field_f = null;
          field_c = null;
          return;
        }
        qia var2 = (qia) null;
        pea.a((qia) null, -115);
        field_f = null;
        field_c = null;
    }

    final od a(int param0, long param1) {
        if (param0 != 0) {
          return (od) null;
        }
        od var4 = (od) (this.field_e.a((byte) -104, param1));
        if (var4 == null) {
          return var4;
        }
        this.field_a.a(var4, (byte) -75);
        return var4;
    }

    final static vb a(qia param0, int param1) {
        vb var2 = null;
        RuntimeException var2_ref = null;
        vb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new vb(param0, param0);
          tna.field_e.b((byte) -68, var2);
          if (param1 != 1) {
            pea.a((byte) -106);
          }
          kva.field_n.a(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("pea.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(od param0, byte param1, long param2) {
        od var5 = null;
        if (param1 <= 6) {
          return;
        }
        try {
          if (0 != this.field_b) {
            this.field_b = this.field_b - 1;
          } else {
            var5 = this.field_a.c((byte) 127);
            var5.p(36);
            var5.c(-7975);
            if (this.field_d == var5) {
              var5 = this.field_a.c((byte) 124);
              var5.p(75);
              var5.c(-7975);
            }
          }
          this.field_e.a(param2, 126, param0);
          this.field_a.a(param0, (byte) -77);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    pea(int param0) {
        int var2 = 0;
        this.field_d = new od();
        this.field_a = new vj();
        this.field_b = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_e = new ji(var2);
    }

    static {
        field_f = "Hide lobby chat";
        field_c = new fp();
    }
}
