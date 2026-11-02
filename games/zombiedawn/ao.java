/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends WorldObject {
    static String field_G;
    static int field_J;
    private PcmSampleStream field_K;
    private int field_E;
    static String field_I;
    private String field_D;
    private PcmSampleStream field_H;
    static op field_F;

    final static HumanFactory a(String[] args, int param1) {
        HumanFactory var2 = null;
        RuntimeException var2_ref = null;
        HumanFactory stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new HumanFactory(false);
          var2.field_g = args;
          if (param1 > -76) {
            field_F = (op) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ao.D(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_I = null;
        int var1 = -63 % ((-43 - param0) / 34);
        field_G = null;
        field_F = null;
    }

    ao(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, 0);
        this.field_K = null;
        this.field_H = null;
        this.field_D = Integer.toString(param2);
        this.field_E = 255;
        if (!param3) {
          this.field_K = kh.a(55, false);
        }
    }

    final void a(byte param0, Camera param1) {
        int var5 = 0;
        int var3_int = param1.worldToScreenX(this.getX(true), (byte) -94);
        int var4 = param1.worldToScreenY(this.getY(237239984), 0);
        if (param0 >= -76) {
          return;
        }
        try {
          sg.field_jb.b(this.field_D, var3_int, var4, 3, -1, this.field_E);
          if (this.field_K != null) {
            if (this.field_K.l()) {
              this.field_H = null;
              this.field_K = null;
              return;
            }
            var5 = pj.a(var4, 47, var3_int);
            this.field_K.h(var5);
            if (this.field_H == null) {
              return;
            }
            this.field_H.h(var5);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ao.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(int param0) {
        if (this.field_E <= 0) {
          this.unlink(-27598);
          if (param0 < 95) {
            this.field_H = (PcmSampleStream) null;
            return;
          }
          return;
        }
        this.field_x = this.field_x - 131072;
        this.field_E = this.field_E - 7;
        if (this.field_E >= 0) {
          if (param0 < 95) {
            this.field_H = (PcmSampleStream) null;
            return;
          }
          return;
        }
        this.field_E = 0;
        if (param0 >= 95) {
          return;
        }
        this.field_H = (PcmSampleStream) null;
    }

    static {
        field_G = "Names can only contain letters, numbers, spaces and underscores";
        field_I = "Waiting for sound effects";
        field_J = -1;
    }
}
