/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sd extends cn {
    static String field_v;
    static int field_s;
    static bd field_w;
    static bd field_t;
    static boolean field_u;

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param1 != 0) {
            field_v = (String) null;
          }
          try {
            a.a(bn.c(param1 - 1), new Object[]{new Integer(param0)}, "resizing", -13730);
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_v = null;
        if (param0 != -822203935) {
          java.awt.Frame var2 = (java.awt.Frame) null;
          sd.a((fd) null, -34, (java.awt.Frame) null);
        }
        field_t = null;
        field_w = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 != 2) {
            field_u = true;
          }
          var3_int = 0;
          var4 = s.field_g;
          while (var3_int < hf.field_d.length) {
            var5 = jf.field_b[var3_int];
            if (0 <= var5) {
              var6 = wb.a(111, true, hf.field_d[var3_int]);
              var7 = -(var6 >> 1) + wk.field_c;
              var4 = var4 + cl.field_l;
              if (uk.a(-jd.field_l + var7, param2, var6 + (jd.field_l << 1), var4, 124, param1, (ab.field_b << 1) + eh.field_d)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (eh.field_d + cl.field_l + (ab.field_b << 1));
            } else {
              var4 = var4 + kb.field_d;
            }
            var3_int++;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "sd.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sd(int param0) {
        this(jd.field_s, param0);
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        try {
          if (param4) {
            ij.a(param3.field_x, param3.field_s, param3.field_m + param0, param3.field_v + param1, false);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "sd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    sd(vm param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_y, -1, 2147483647, false);
    }

    final static void a(fd param0, int param1, java.awt.Frame param2) {
        kk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        java.awt.Frame var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(7, param2);
            while (var3.field_f == 0) {
              vj.a(10L, (byte) -49);
            }
            if (var3.field_f != 1) {
              vj.a(100L, (byte) -49);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          param2.dispose();
          if (param1 >= -98) {
            var5 = (java.awt.Frame) null;
            sd.a((fd) null, 120, (java.awt.Frame) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("sd.GA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_v = "Loading sound effects";
    }
}
