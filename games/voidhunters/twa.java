/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class twa implements ntb {
    int field_a;
    static String[] field_b;

    public final void b(faa param0, int param1) {
        RuntimeException runtimeException = null;
        tv var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.a(-632, this.field_a, 32);
              if (param1 < -109) {
                break L1;
              } else {
                var4 = (tv) null;
                this.a((byte) 94, (tv) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("twa.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = (twa) ((Object) param0);
              if (param1 < -19) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            L2: {
              var4 = 0;
              if (var3.field_a == this.field_a) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int choice has changed. before=" + var3.field_a + ", now=" + this.field_a);
                break L2;
              }
            }
            if (var4 != 0) {
              System.out.println("This instance of SpawnChoice has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("twa.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        twa var5 = null;
        twa var6 = null;
        try {
            var5 = (twa) ((Object) param1);
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
        if (param0 <= 25) {
          field_b = (String[]) null;
          tla.field_c = true;
          vu.field_xb = true;
          klb.field_r.g((byte) -17);
          fa.a(ega.field_p, -122, false);
          return;
        } else {
          tla.field_c = true;
          vu.field_xb = true;
          klb.field_r.g((byte) -17);
          fa.a(ega.field_p, -122, false);
          return;
        }
    }

    twa() {
    }

    public final boolean a(byte param0, tv param1) {
        twa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = 36 % ((22 - param0) / 59);
              var3 = (twa) ((Object) param1);
              if (this.field_a == var3.field_a) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("twa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    twa(int param0) {
        this.field_a = param0;
    }

    static {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
