/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends IntrusiveNode {
    byte[] field_j;
    int field_i;
    static int field_h;
    long field_g;

    final static void a(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            java.lang.reflect.Method var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                Runtime var2 = Runtime.getRuntime();
                Object[] var4 = (Object[]) null;
                Long var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                ok.field_c = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Throwable var2_ref = decompiledCaughtException;
              }
            }
            if (param0 >= -24) {
              dm.a((byte) 69);
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Exception var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(mf param0, int param1, boolean param2) {
        String stackIn_12_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 0;
          if (param2) {
            field_h = -2;
          }
          while (4 > var3_int) {
            Sprite[] stackIn_6_0 = sl.field_b[param1];
            int stackIn_6_1 = var3_int;
            String stackIn_6_2 = da.field_d[param1];
            mf stackIn_6_3 = (mf) (param0);
            String stackIn_6_4 = "layer" + var3_int;
            boolean stackIn_7_5 = !(param2);
            stackIn_6_0[stackIn_6_1] = fe.a(stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("dm.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(sh.a((byte) 52, param1, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param0 == 4) {
              return;
            }
            field_h = -125;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("dm.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    dm(long param0, int param1, byte[] param2) {
        try {
          this.field_i = param1;
          this.field_j = param2;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dm.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 640;
    }
}
