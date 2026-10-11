/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hkb implements ntb {
    private pe field_a;

    public final void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = 81;
          stackIn_3_2 = (this.field_a != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.field_a.b(param0, -120);
          }
          if (param1 >= -109) {
            this.field_a = (pe) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hkb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -1) {
          hkb.b(36);
        }
        stackIn_7_0 = (ar.field_d) || (fda.e((byte) 103));
        return stackIn_7_0;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        hkb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -104 % ((22 - param0) / 59);
          var4 = (hkb) (param1);
          stackIn_3_0 = (null != this.field_a) ? 0 : 1;
          if (null != var4.field_a) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((stackIn_3_0 ^ stackIn_6_1) == 0 && (this.field_a == null ||
            !this.field_a.a((byte) 96, var4.field_a))) {
            stackIn_12_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_12_0 = true;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hkb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
          hkb.b(29);
        }
        return this.field_a.d(false);
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (kv.a(param1, param0)) {
            if (null == this.field_a) {
              this.field_a = new pe();
            }
            this.field_a.a(param0, false);
          } else {
            this.field_a = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hkb.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        hkb var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 <= 54) {
            return;
          }
          var3 = (hkb) (param1);
          if (null == this.field_a) {
            var3.field_a = null;
          } else {
            if (null == var3.field_a) {
              var3.field_a = new pe();
            }
            this.field_a.b((byte) 108, var3.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("hkb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        tv var5 = null;
        hkb var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var6 = (hkb) (param0);
          if (param1 > -19) {
            var5 = (tv) null;
            this.a((tv) null, 5);
          }
          if (this.field_a != null &&
            var6.field_a != null) {
            this.field_a.a(var6.field_a, -32);
          }
          var4 = 0;
          stackIn_8_0 = (this.field_a != null) ? 0 : 1;
          if (var6.field_a != null) {
            stackIn_11_1 = 0;
          } else {
            stackIn_11_1 = 1;
          }
          if ((stackIn_8_0 ^ stackIn_11_1) != 0 ||
            this.field_a != null &&
            this.field_a.a((byte) 82, var6.field_a)) {
            var4 = 1;
            System.out.println("World saved_state has changed. before=" + var6.field_a + ", now=" + this.field_a);
          }
          if (var4 != 0) {
            System.out.println("This instance of Mission has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("hkb.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, rsb param1, int param2) {
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sg[] var5_ref_sg__ = null;
        int var5 = 0;
        sg[] var6_ref_sg__ = null;
        int var6 = 0;
        sg var8 = null;
        tfa var9 = null;
        int var10 = 0;
        pe var11 = null;
        var10 = VoidHunters.field_G;
        try {
          var11 = param1.field_g;
          if (param0) {
            var5_ref_sg__ = var11.d(1000);
            var6_ref_sg__ = var5_ref_sg__;
            for (var7 = 0; var7 < var6_ref_sg__.length; var7++) {
              var8 = var6_ref_sg__[var7];
              if (var8 != null &&
                var8.o((byte) -117) >= 0 &&
                !var8.l((byte) -10)) {
                if (qv.field_o == 0) {
                  var8.h(17704, 2);
                }
                var9 = param1.a(var8.o((byte) -117), (byte) 59);
                if (null == var9.field_g) {
                  var9.field_g = new sg();
                }
                var8.b((byte) 92, var9.field_g);
                var9.field_g.u(-14);
              }
            }
          }
          var5 = var11.f(24797);
          this.field_a.b((byte) 58, var11);
          var6 = -74 / ((param2 - 66) / 59);
          var11.b(-123, false);
          var11.a(0, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("hkb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    hkb() {
    }

    hkb(pe param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hkb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
