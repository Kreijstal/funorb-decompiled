/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends cq implements go {
    static ia field_j;
    static boolean field_i;

    public final void a(ke param0, int param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qp.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 34069) {
              qp.a(-52);
            }
            java.lang.reflect.Method var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 == null) {
              return;
            }
            try {
              Runtime var2 = Runtime.getRuntime();
              Object[] var4 = (Object[]) null;
              Long var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              ki.field_g = 1 + (int)(var3.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Exception var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          qp.b(true);
          field_j = null;
          return;
        }
        field_j = null;
    }

    public final void a(byte param0) {
        super.a(param0);
    }

    qp(jc param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, lc.field_g, la.field_h, 6 * param1 * param1, param2);
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        try {
          this.field_g.a((jj) (this), -9135);
          if (param2) {
            for (int var5_int = 0; 6 > var5_int; var5_int++) {
              this.a((byte) -110, param1, param1, param3[var5_int], 34069 + var5_int);
            }
            return;
          }
          int var7 = 0;
          int var5_intLifetime1 = var7;
          while (6 > var7) {
            jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, this.a(false), param1, param1, 0, gq.a(this.field_h, -29824), this.field_g.field_Bc, param3[var7], 0);
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("qp.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_i = false;
        field_j = new ia();
    }
}
