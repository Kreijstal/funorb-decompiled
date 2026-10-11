/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bha implements ntb {
    boolean field_a;

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bha var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -73 % ((param0 - 22) / 59);
          var4 = (bha) (param1);
          stackIn_3_0 = (this.field_a) ? 0 : 1;
          if (var4.field_a) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          stackIn_9_0 = (stackIn_3_0 != stackIn_6_1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(boolean param0, tja param1, int param2, int param3) {
        try {
          if (!param0) {
            tja var6 = (tja) null;
            this.a(true, (tja) null, -49, 117);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bha.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void a(tv param0, int param1) {
        bha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -19) {
            this.field_a = true;
          }
          var3 = (bha) (param0);
          var4 = 0;
          stackIn_4_0 = this.field_a;
          if (var3.field_a) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            var4 = 1;
            iva.a(-6940, "boolean connected has changed. before=" + var3.field_a + ", now=" + this.field_a);
          }
          if (var4 == 0) {
            return;
          }
          tfb.a((byte) -73, "This instance of CarouselPlayerInfo has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bha.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(faa param0, boolean param1) {
        try {
          this.field_a = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(tja param0, int param1, int param2, int param3) {
        try {
          if (param2 != -24354) {
            this.field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bha.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
          vq.a(param0, -82, this.field_a);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void b(byte param0, tv param1) {
        bha var5 = null;
        bha var6 = null;
        if (param0 <= 54) {
          return;
        }
        try {
          var5 = (bha) (param1);
          var6 = var5;
          var6.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
