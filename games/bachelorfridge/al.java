/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int field_a;
    private Object field_b;

    final hs a(int param0) {
        try {
          hs stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          IllegalAccessException var2 = null;
          java.lang.reflect.InvocationTargetException var2_ref = null;
          Object[] var3 = null;
          if (this.field_b instanceof hs) {
            return (hs) (this.field_b);
          }
          try {
            var3 = (Object[]) null;
            stackIn_3_0 = (hs) (vb.field_n.invoke(this.field_b, (Object[]) null));
            return stackIn_3_0;
          } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IllegalAccessException) (Object) decompiledCaughtException;
          } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
          }
          if (param0 == 0) {
            return null;
          }
          al.a(-107, -17);
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    al(hs param0) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          Throwable decompiledCaughtException = null;
          IllegalAccessException var2 = null;
          java.lang.reflect.InvocationTargetException var2_ref = null;
          InstantiationException var2_ref2 = null;
          RuntimeException var2_ref3 = null;
          try {
            this.field_b = param0;
            if (null == vb.field_g) {
              return;
            }
            lv.field_m[0] = param0;
            try {
              this.field_b = vb.field_g.newInstance(lv.field_m);
              return;
            } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IllegalAccessException) (Object) decompiledCaughtException;
              return;
            } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
              return;
            } catch (java.lang.InstantiationException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref2 = (InstantiationException) (Object) decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var2_ref3;
            stackIn_12_1 = new StringBuilder().append("al.<init>(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 != -18073) {
          return;
        }
        eha.field_s = null;
        baa.field_P = (byte[][]) null;
        fd.field_D = null;
        hk.field_f = null;
        lq.field_A = null;
        fl.field_j = null;
    }

    final static oha a(int param0, int param1) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = BachelorFridge.field_y;
        var2 = -33 % ((param0 - 28) / 58);
        for (var3 = 0; ur.field_e.length > var3; var3++) {
          if (null != ur.field_e[var3] &&
            param1 == ur.field_e[var3].field_j) {
            return ur.field_e[var3];
          }
        }
        return null;
    }

    static {
    }
}
