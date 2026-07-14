/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends cq implements go {
    static ia field_j;
    static boolean field_i;

    public final void a(ke param0, int param1) {
        this.a(param0, param1);
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 34069) {
                  break L0;
                } else {
                  qp.a(-52);
                  break L0;
                }
              }
              var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1_ref != null) {
                try {
                  var2_ref = Runtime.getRuntime();
                  var4 = (Object[]) null;
                  var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                  ki.field_g = 1 + (int)(var3.longValue() / 1048576L);
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
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
        this.a(param0);
    }

    qp(jc param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, lc.field_g, la.field_h, 6 * param1 * param1, param2);
        int var5 = 0;
        int var7 = 0;
        ((qp) this).field_g.a((jj) this, -9135);
        if (!param2) {
          var7 = 0;
          var5 = var7;
          L0: while (true) {
            if (6 > var7) {
              jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, ((qp) this).a(false), param1, param1, 0, gq.a(((qp) this).field_h, -29824), ((qp) this).field_g.field_Bc, param3[var7], 0);
              var7++;
              continue L0;
            } else {
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (6 > var5) {
              ((qp) this).a((byte) -110, param1, param1, param3[var5], 34069 + var5);
              var5++;
              continue L1;
            } else {
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_j = new ia();
    }
}
