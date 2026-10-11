/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et implements ntb {
    int field_a;
    static aba field_c;
    int field_b;

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        et var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (et) (param0);
          var4 = 0;
          if (param1 >= -19) {
            var5 = (faa) null;
            this.a((faa) null, true);
          }
          if (this.field_a != var6.field_a) {
            System.out.println("int value has changed. before=" + var6.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (this.field_b != var6.field_b) {
            System.out.println("int label has changed. before=" + var6.field_b + ", now=" + this.field_b);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionVariable has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("et.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static short[] a(faa param0, int param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] var9 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          if (param2 != 24) {
            var9 = (short[]) null;
            et.a((faa) null, 91, -12, (short[]) null);
          }
          var4_int = param0.i(0, param1);
          if (var4_int == 0) {
            return null;
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param0.i(param2 - 24, 4);
          var6 = (short)param0.i(0, 16);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)(var6 + param0.i(0, var5));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("et.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 109 % ((param0 - 66) / 57);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_a, 32);
          param0.a(-632, this.field_b, 32);
          if (param1 > -109) {
            asb var4 = (asb) null;
            et.a((asb) null, (asb) null, -60, false);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "et.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        et var6 = null;
        et var7 = null;
        try {
          var6 = (et) (param1);
          var7 = var6;
          if (param0 < 54) {
            faa var4 = (faa) null;
            this.b((faa) null, 104);
          }
          var7.field_a = this.field_a;
          var7.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "et.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(asb param0, asb param1, int param2, boolean param3) {
        try {
          qu.a(qc.field_q, 0, cwa.field_c, ef.field_y, mla.field_q, pva.field_d, iga.field_o, param3, vlb.field_a, gjb.field_p, asb.field_a, cab.field_o);
          pmb.field_o = wjb.a(param0, true, "lobby", "chatfilter");
          fqb.field_o[2] = gpa.field_f;
          fqb.field_o[0] = iv.field_p;
          fqb.field_o[1] = pp.field_q;
          bj.a((byte) -35, param1, rh.field_o);
          if (param2 != 2874) {
            et.a((byte) -66);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "et.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_a = param0.i(0, 32);
          this.field_b = param0.i(0, 32);
          if (param1) {
            this.field_b = -94;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "et.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        et var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -51 % ((22 - param0) / 59);
          var4 = (et) (param1);
          stackIn_5_0 = (this.field_a != var4.field_a) || (var4.field_b != this.field_b);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("et.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_c = new aba();
    }
}
