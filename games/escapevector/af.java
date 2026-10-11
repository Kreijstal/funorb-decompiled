/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_b;
    static String field_f;
    volatile boolean field_c;
    static String field_g;
    static te[] field_a;
    java.awt.Frame field_d;
    static int field_h;
    static sk field_e;

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_c = true;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "af.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (bk.field_r != null) {
          bk.field_r.a((byte) -118);
        }
        if (param0 != 0) {
          af.a((byte) -8);
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 >= 37) {
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_a = (te[]) null;
        field_g = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(byte param0, lk param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        try {
          if (param1.field_k == null) {
            return;
          }
          if (param0 != -61) {
            return;
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (null != param1.field_k.peekEvent()) {
              en.a((byte) -15, 1L);
              continue;
            }
            break;
          }
          try {
            if (param2 == null) {
              return;
            }
            param1.field_k.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("af.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(lk param0, boolean param1) {
        try {
          af.a(param0, this.field_d, false);
          if (!param1) {
            field_e = (sk) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "af.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    af() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int var6;
        int var7;
        vi.field_e[jf.field_J] = param4;
        cd.field_q[jf.field_J] = jf.field_J;
        fl.field_k[jf.field_J] = param5;
        if (param5 < vl.field_e) {
          pg.field_d = param5;
        }
        if (oa.field_t >= param5) {
          pc.field_c[jf.field_J] = param1;
          if (param0 == 1) {
            mi.field_k[jf.field_J] = param2;
            tm.field_fb[jf.field_J] = param3;
            var6 = param3 + param2 + param1;
            if (var6 != 0) {
              stackIn_48_0 = param1 * 1000 / var6;
            } else {
              stackIn_48_0 = 0;
            }
            var7 = stackIn_48_0;
            th.field_v[jf.field_J] = var7;
            jf.field_J = jf.field_J + 1;
            if (var7 < pg.field_d) {
              pg.field_d = var7;
            }
            if (pl.field_r < var7) {
              pl.field_r = var7;
            }
            return;
          }
          af.a(-7, 8, -13, 15, -127, 46);
          mi.field_k[jf.field_J] = param2;
          tm.field_fb[jf.field_J] = param3;
          var6 = param3 + param2 + param1;
          if (var6 != 0) {
            stackIn_35_0 = param1 * 1000 / var6;
          } else {
            stackIn_35_0 = 0;
          }
          var7 = stackIn_35_0;
        } else {
          pl.field_r = param5;
          pc.field_c[jf.field_J] = param1;
          if (param0 == 1) {
            mi.field_k[jf.field_J] = param2;
            tm.field_fb[jf.field_J] = param3;
            var6 = param3 + param2 + param1;
            if (var6 != 0) {
              stackIn_8_0 = param1 * 1000 / var6;
            } else {
              stackIn_8_0 = 0;
            }
            var7 = stackIn_8_0;
          } else {
            af.a(-7, 8, -13, 15, -127, 46);
            mi.field_k[jf.field_J] = param2;
            tm.field_fb[jf.field_J] = param3;
            var6 = param3 + param2 + param1;
            if (var6 != 0) {
              stackIn_21_0 = param1 * 1000 / var6;
            } else {
              stackIn_21_0 = 0;
            }
            var7 = stackIn_21_0;
          }
        }
        th.field_v[jf.field_J] = var7;
        jf.field_J = jf.field_J + 1;
        if (var7 < pg.field_d) {
          pg.field_d = var7;
        }
        if (pl.field_r < var7) {
          pl.field_r = var7;
        }
    }

    final static void a(lk param0, java.awt.Frame param1, boolean param2) {
        la var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = EscapeVector.field_A;
        try {
          while (true) {
            var3 = param0.a((byte) 45, param1);
            while (var3.field_f == 0) {
              en.a((byte) 93, 10L);
            }
            if (var3.field_f != 1) {
              en.a((byte) -10, 100L);
              continue;
            }
            break;
          }
          param1.setVisible(param2);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("af.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = "Crate location";
        field_f = "Rock busters: ";
        field_g = "Five rock busters";
        field_h = 20;
    }
}
