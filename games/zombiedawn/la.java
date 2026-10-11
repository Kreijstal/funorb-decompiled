/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_e;
    volatile boolean field_a;
    static int[] field_b;
    static vn[] field_c;
    static uh field_d;

    public static void c(int param0) {
        if (param0 < 39) {
          dj var2 = (dj) null;
          la.a((dj) null, 13, (dj) null, (byte) 28, -8);
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        u[] var1 = null;
        u var3 = null;
        int var4 = 0;
        u[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          var5 = ij.field_L;
          var1 = var5;
          if (param0 < 17) {
            la.a((byte) 114);
          }
          for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.c(-23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "la.G(" + param0 + ')');
        }
    }

    final void a(ec param0, byte param1) {
        try {
          jb.a(113, this.field_e, param0);
          if (param1 <= 112) {
            java.awt.Graphics var4 = (java.awt.Graphics) null;
            this.paint((java.awt.Graphics) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "la.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int b(int param0) {
        if (param0 != 0) {
          field_d = (uh) null;
          return ae.field_a;
        }
        return ae.field_a;
    }

    public final void update(java.awt.Graphics param0) {
    }

    la() {
    }

    final static void a(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (param0 < 57) {
            field_b = (int[]) null;
          }
          if (null != ce.field_t) {
            try {
              ce.field_t.a(0, 0L);
              ce.field_t.a(122, fj.field_g.field_h, fj.field_g.field_j, 24);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              fj.field_g.field_j = fj.field_g.field_j + 24;
              return;
            }
          }
          fj.field_g.field_j = fj.field_g.field_j + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_a = true;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "la.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static oi a(dj param0, int param1, dj param2, byte param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        oi stackIn_5_0 = null;
        oi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ph.a(param4, 31043, param1, param2)) {
            stackIn_2_0 = null;
            return (oi) (stackIn_2_0);
          }
          if (param3 <= -96) {
            stackIn_7_0 = kk.a(-16491, param0.a((byte) 51, param4, param1));
            return stackIn_7_0;
          }
          stackIn_5_0 = (oi) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("la.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static vk a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vk var5 = null;
        vk stackIn_4_0 = null;
        vk stackIn_8_0 = null;
        vk stackIn_11_0 = null;
        vk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = bg.field_l;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = be.a(var3, (byte) -65);
            if (var5 != null) {
              stackIn_11_0 = var5;
              return stackIn_11_0;
            }
            if (param1 > -57) {
              field_d = (uh) null;
            }
            stackIn_15_0 = of.a(var4, 8947848);
            return stackIn_15_0;
          }
          stackIn_4_0 = qd.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("la.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
    }
}
