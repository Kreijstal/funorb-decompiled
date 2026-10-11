/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class whb implements ntb {
    static dja field_c;
    ub field_b;
    static String field_d;
    static int field_a;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 > -110) {
          field_c = (dja) null;
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        whb var6 = null;
        try {
          var6 = (whb) (param0);
          if (param1 >= -19) {
            var5 = (tv) null;
            this.a((tv) null, 37);
          }
          if (null != this.field_b &&
            null != var6.field_b &&
            this.field_b.getClass() == var6.field_b.getClass()) {
            this.field_b.a(var6.field_b, -110);
          }
          var4 = 0;
          stackIn_9_0 = (var6.field_b != null) ? 0 : 1;
          if (null != this.field_b) {
            stackIn_12_1 = 0;
          } else {
            stackIn_12_1 = 1;
          }
          if ((stackIn_9_0 ^ stackIn_12_1) != 0 ||
            this.field_b != null &&
            this.field_b.getClass() != var6.field_b.getClass() ||
            this.field_b != null &&
            this.field_b.a((byte) -45, var6.field_b)) {
            var4 = 1;
            iva.a(-6940, "DebugSendable response has changed. before=" + var6.field_b + ", now=" + this.field_b);
          }
          if (var4 == 0) {
            return;
          }
          tfb.a((byte) -108, "This instance of DebugMessage has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("whb.F(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        whb var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -88 / ((param0 - 22) / 59);
          var3 = (whb) (param1);
          stackIn_3_0 = (null != var3.field_b) ? 0 : 1;
          if (null != this.field_b) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((stackIn_3_0 ^ stackIn_6_1) == 0 && ((this.field_b == null ||
            this.field_b.getClass() == var3.field_b.getClass()) &&
            (this.field_b == null ||
            !this.field_b.a((byte) 93, var3.field_b)))) {
            stackIn_15_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_15_0 = true;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("whb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1) {
            whb.a(80);
          }
          if (!kv.a(param1, param0)) {
            this.field_b = null;
            return;
          }
          if (this.field_b != null) {
            this.field_b.a(param0, false);
            return;
          }
          var3_int = param0.i(0, 1);
          if (var3_int == 0) {
            this.field_b = (ub) ((Object) new mo());
            this.field_b.a(param0, false);
            return;
          }
          if (var3_int != 1) {
            this.field_b.a(param0, false);
            return;
          }
          this.field_b = (ub) ((Object) new af());
          this.field_b.a(param0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("whb.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException runtimeException = null;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -109) {
            return;
          }
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -100;
          stackIn_5_2 = (this.field_b != null);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            if (this.field_b.getClass() == mo.class) {
              param0.a(-632, 0, 1);
            } else {
              if (this.field_b.getClass() == af.class) {
                param0.a(-632, 1, 1);
              }
            }
            this.field_b.b(param0, -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("whb.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        whb var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 <= 54) {
            field_d = (String) null;
          }
          var5 = (whb) (param1);
          if (this.field_b == null) {
            var5.field_b = null;
            return;
          }
          if (null != var5.field_b &&
            var5.field_b.getClass() == this.field_b.getClass()) {
            this.field_b.b((byte) 93, var5.field_b);
            return;
          }
          if (this.field_b.getClass() == mo.class) {
            var5.field_b = (ub) ((Object) new mo());
            this.field_b.b((byte) 93, var5.field_b);
            return;
          }
          if (this.field_b.getClass() != af.class) {
            this.field_b.b((byte) 93, var5.field_b);
            return;
          }
          var5.field_b = (ub) ((Object) new af());
          this.field_b.b((byte) 93, var5.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("whb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_c = (dja) ((Object) new wkb());
        field_d = "Defence";
    }
}
