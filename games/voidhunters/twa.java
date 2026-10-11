/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class twa implements ntb {
    int field_a;
    static String[] field_b;

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_a, 32);
          if (param1 >= -109) {
            tv var4 = (tv) null;
            this.a((byte) 94, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "twa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 32) {
          twa.a(-98);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            twa.b(40);
          }
          this.field_a = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "twa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        twa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (twa) (param0);
          if (param1 >= -19) {
            field_b = (String[]) null;
          }
          var4 = 0;
          if (var3.field_a != this.field_a) {
            var4 = 1;
            System.out.println("int choice has changed. before=" + var3.field_a + ", now=" + this.field_a);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SpawnChoice has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("twa.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        twa var5 = null;
        twa var6 = null;
        try {
          var5 = (twa) (param1);
          var6 = var5;
          if (param0 <= 54) {
            this.field_a = 85;
          }
          var6.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "twa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        lba.a(-1);
        if (param0 > 25) {
          tla.field_c = true;
          vu.field_xb = true;
          klb.field_r.g((byte) -17);
          fa.a(ega.field_p, -122, false);
          return;
        }
        field_b = (String[]) null;
        tla.field_c = true;
        vu.field_xb = true;
        klb.field_r.g((byte) -17);
        fa.a(ega.field_p, -122, false);
    }

    twa() {
    }

    public final boolean a(byte param0, tv param1) {
        twa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 36 % ((22 - param0) / 59);
          var3 = (twa) (param1);
          stackIn_3_0 = (this.field_a != var3.field_a);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("twa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    twa(int param0) {
        this.field_a = param0;
    }

    static {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
