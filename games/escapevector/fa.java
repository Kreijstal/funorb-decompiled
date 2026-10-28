/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    private vb field_d;
    private int field_g;
    private int field_a;
    static boolean[] field_c;
    private qm field_b;
    static String field_f;
    static String field_e;

    private final void a(long param0, int param1) {
        if (param1 == 0) {
          sh var4 = (sh) (this.field_b.a(-2678, param0));
          this.a(var4, (byte) 20);
          return;
        }
        this.a(52L, 125);
        sh var4Lifetime1 = (sh) (this.field_b.a(-2678, param0));
        this.a(var4Lifetime1, (byte) 20);
    }

    private final void a(long param0, Object param1, int param2, int param3) {
        int var7 = EscapeVector.obfuscationControl;
        if (param2 > this.field_a) {
          throw new IllegalStateException();
        }
        this.a(param0, 0);
        this.field_g = this.field_g - param2;
        while (this.field_g < 0) {
          sh var6 = (sh) (this.field_d.a((byte) 102));
          this.a(var6, (byte) -113);
        }
        if (param3 != 11261) {
          return;
        }
        try {
          vk var6_ref = new vk(param1, param2);
          this.field_b.a(param0, (byte) -106, var6_ref);
          this.field_d.a(false, var6_ref);
          ((sh) ((Object) var6_ref)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(Object param0, long param1, byte param2) {
        if (param2 <= 53) {
          return;
        }
        try {
          this.a(param1, param0, 1, 11261);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (!param0) {
          field_e = (String) null;
        }
    }

    private final void a(sh param0, byte param1) {
        String stackIn_7_2 = null;
        try {
          int var3_int = 38 / ((param1 + 70) / 38);
          if (param0 == null) {
            return;
          }
          param0.unlink((byte) -94);
          param0.unlinkSecondary(117);
          this.field_g = this.field_g + param0.field_q;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("fa.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final Object a(long param0, byte param1) {
        sh var7 = (sh) (this.field_b.a(-2678, param0));
        if (var7 == null) {
          return null;
        }
        if (param1 != -54) {
          return (Object) null;
        }
        Object var5 = var7.e((byte) 97);
        if (var5 == null) {
          var7.unlink((byte) -85);
          var7.unlinkSecondary(-58);
          this.field_g = this.field_g + var7.field_q;
          return null;
        }
        if (!var7.d((byte) 120)) {
          this.field_d.a(false, var7);
          var7.secondaryKey = 0L;
          return var5;
        }
        vk var6 = new vk(var5, var7.field_q);
        this.field_b.a(var7.key, (byte) -106, var6);
        this.field_d.a(false, var6);
        ((sh) ((Object) var6)).secondaryKey = 0L;
        var7.unlink((byte) -123);
        var7.unlinkSecondary(param1 ^ 25);
        return var5;
    }

    final static ih a(int param0, ResourceArchive param1, int param2, ResourceArchive param3, int param4) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param0 != 1) {
            fa.a(true);
          }
          if (uc.a(param3, 121, param2, param4)) {
            ih stackIn_6_0 = qa.a(16826, param1.a(param2, (byte) -97, param4));
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (ih) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("fa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new boolean[7];
        field_f = "Return to Pause Menu";
        field_e = "WARNING: HIGH GRAVITY";
    }
}
