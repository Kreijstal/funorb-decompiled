/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uqb extends ksa implements ntb {
    boolean field_f;
    static int field_h;
    int field_e;
    pwa field_d;
    boolean field_g;

    public void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.a(-632, this.field_e, bnb.field_p);
          if (param1 >= -109) {
            return;
          }
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = 59;
          stackIn_5_2 = (this.field_d != null);
          if (!vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            return;
          }
          this.field_d.b(param0, -113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("uqb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, mfa param1, tja param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        tv var7 = null;
        gqa var8 = null;
        bha var9 = null;
        hg var10 = null;
        bha var11 = null;
        try {
          if (param0 >= -111) {
            var7 = (tv) null;
            this.a((byte) 62, (tv) null);
          }
          if (this.field_d != null &&
            this.field_d.field_e != null) {
            var8 = this.field_d.field_e;
            var5 = var8.field_a;
            var9 = param2.field_c[var5];
            if (param1 != null) {
              param1.a(var8.field_b, var5, (byte) -117);
            }
            var9.field_a = true;
            var9.a(param2, var5, -24354, this.field_e);
            iva.a(-6940, "CarouselEvent: Applied join for " + var8.field_b);
          } else {
            if (null != this.field_d &&
              this.field_d.field_d != null) {
              var10 = this.field_d.field_d;
              var5 = var10.field_d;
              var11 = param2.field_c[var5];
              var11.field_a = false;
              var11.a(true, param2, this.field_e, var5);
              iva.a(-6940, "CarouselEvent: Applied leave for player " + var5);
            }
          }
          if (null != this.field_d) {
            return;
          }
          this.a(param1, 0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("uqb.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public boolean a(byte param0, tv param1) {
        uqb var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3 = (uqb) (param1);
          var4 = 72 % ((22 - param0) / 59);
          if (var3.field_e == this.field_e) {
            stackIn_4_0 = (this.field_d != null) ? 0 : 1;
            if (var3.field_d != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (null == this.field_d ||
              !this.field_d.a((byte) 121, var3.field_d))) {
              stackIn_13_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_13_0 = true;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public void a(tv param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        uqb var6 = null;
        try {
          var6 = (uqb) (param0);
          var4 = 0;
          if (this.field_e != var6.field_e) {
            iva.a(-6940, "int tick has changed. before=" + var6.field_e + ", now=" + this.field_e);
            var4 = 1;
          }
          if (param1 > -19) {
            var5 = (faa) null;
            this.b((faa) null, 67);
          }
          if (this.field_d != null &&
            null != var6.field_d) {
            this.field_d.a(var6.field_d, -70);
          }
          stackIn_12_0 = (null != this.field_d) ? 0 : 1;
          if (var6.field_d != null) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_12_0 ^ stackIn_15_1) != 0 ||
            this.field_d != null &&
            this.field_d.a((byte) 108, var6.field_d)) {
            var4 = 1;
            iva.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6.field_d + ", now=" + this.field_d);
          }
          if (var4 == 0) {
            return;
          }
          tfb.a((byte) -78, "This instance of CarouselEvent has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("uqb.F(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int var2 = -71 / ((param0 - 59) / 43);
        return null != this.field_d ? true : false;
    }

    final void a(int param0, int param1) {
        int var3 = -106 % ((-71 - param1) / 44);
        this.field_d = new pwa();
        this.field_d.field_f = new gtb(param0);
    }

    public void b(byte param0, tv param1) {
        uqb var3 = null;
        RuntimeException var3_ref = null;
        uqb var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (uqb) (param1);
          var3 = var4;
          var4.field_e = this.field_e;
          if (param0 < 54) {
            return;
          }
          if (this.field_d == null) {
            var4.field_d = null;
            return;
          }
          if (null == var3.field_d ||
            var3.field_d.getClass() != this.field_d.getClass()) {
            var3.field_d = new pwa();
          }
          this.field_d.b((byte) 121, var3.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("uqb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(mfa param0, int param1, tja param2) {
        try {
          if (param1 != 0) {
            tv var5 = (tv) null;
            this.a((byte) -98, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uqb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        if (param0 <= 21) {
          this.a(52, -95);
          return this.field_g;
        }
        return this.field_g;
    }

    public void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0.i(0, bnb.field_p);
          if (param1) {
            return;
          }
          if (!kv.a(param1, param0)) {
            this.field_d = null;
            return;
          }
          if (this.field_d == null) {
            this.field_d = new pwa();
          }
          this.field_d.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("uqb.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var2 = -72 % ((param0 - 70) / 40);
        return this.field_f;
    }

    uqb() {
        this.field_f = true;
        this.field_g = true;
    }

    static {
        field_h = 0;
    }
}
