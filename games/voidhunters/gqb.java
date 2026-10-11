/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqb implements ntb {
    int field_c;
    static String field_b;
    static int field_a;

    public final void a(tv param0, int param1) {
        gqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (gqb) (param0);
          var4 = 0;
          if (param1 >= -19) {
            field_b = (String) null;
          }
          if (this.field_c != var3.field_c) {
            System.out.println("int cooldown has changed. before=" + var3.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of TimedSpecialOrderBehaviour has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("gqb.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        gqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -108 / ((param0 - 22) / 59);
          var3 = (gqb) (param1);
          stackIn_3_0 = (var3.field_c != this.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("gqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        gqb var5 = null;
        gqb var6 = null;
        if (param0 < 54) {
          return;
        }
        try {
          var5 = (gqb) (param1);
          var6 = var5;
          var6.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            gqb.a(55);
          }
          param0.a(-632, this.field_c, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static sg a(boolean param0) {
        sg var9 = new sg();
        ml var2 = new ml(0);
        ml var4 = new ml(14);
        var2.a(1, 0, var4);
        ml var5 = new ml(12);
        var5.field_a = new aqa();
        var5.a((byte) -82, 8);
        var5.field_a.a(true, 1024);
        var2.a(1, 1, var5);
        ml var6 = new ml(12);
        var6.field_a = new aqa();
        var6.a((byte) -64, 4);
        var6.field_a.a(true, 1024);
        var2.a(1, 2, var6);
        ml var7 = new ml(12);
        var7.field_a = new aqa();
        var7.a((byte) -113, 2);
        var7.field_a.a(true, 1024);
        var2.a(1, 3, var7);
        ml var8 = new ml(12);
        if (!param0) {
          var8.field_a = new aqa();
          var8.a((byte) -92, 1);
          var8.field_a.a(true, 1024);
          var2.a(1, 4, var8);
          var9.field_k = var2;
          var9.e((byte) 119);
          return var9;
        }
        field_a = 66;
        var8.field_a = new aqa();
        var8.a((byte) -92, 1);
        var8.field_a.a(true, 1024);
        var2.a(1, 4, var8);
        var9.field_k = var2;
        var9.e((byte) 119);
        return var9;
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.field_c = 57;
          }
          this.field_c = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 121) {
          gqb.a(-50);
        }
    }

    static {
        field_b = "Create a free Account";
        field_a = 0;
    }
}
