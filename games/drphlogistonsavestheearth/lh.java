/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends od {
    static int[] field_n;
    static ok field_l;
    private ta field_o;
    static int field_m;
    static nh field_p;
    private int field_q;

    final int e(byte param0) {
        if (param0 != 121) {
            Object var3 = null;
            ((lh) this).a(-86, 117, (byte[]) null, (byte) -63);
            int fieldTemp$0 = ((lh) this).field_j;
            ((lh) this).field_j = ((lh) this).field_j + 1;
            return 255 & ((lh) this).field_h[fieldTemp$0] - ((lh) this).field_o.b((byte) -57);
        }
        int fieldTemp$1 = ((lh) this).field_j;
        ((lh) this).field_j = ((lh) this).field_j + 1;
        return 255 & ((lh) this).field_h[fieldTemp$1] - ((lh) this).field_o.b((byte) -57);
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            if (param3 <= -114) {
              L1: while (true) {
                if (var5_int >= param0) {
                  break L0;
                } else {
                  int fieldTemp$5 = ((lh) this).field_j;
                  ((lh) this).field_j = ((lh) this).field_j + 1;
                  param2[param1 + var5_int] = (byte)(((lh) this).field_h[fieldTemp$5] + -((lh) this).field_o.b((byte) -115));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("lh.I(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static void a(nh[] param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  var6_int = param0[0].field_z;
                  var7 = param0[2].field_z;
                  var8 = param0[1].field_z;
                  param0[0].b(param4, param5, param3);
                  param0[2].b(param4 + param2 - var7, param5, param3);
                  wj.b(rb.field_e);
                  wj.d(param4 - -var6_int, param5, param4 + (param2 + -var7), param0[1].field_C + param5);
                  var9 = param4 + var6_int;
                  var10 = -var7 + (param4 - -param2);
                  param4 = var9;
                  L2: while (true) {
                    if (var10 <= param4) {
                      wj.a(rb.field_e);
                      break L0;
                    } else {
                      param0[1].b(param4, param5, param3);
                      param4 = param4 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("lh.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 121 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    lh(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int[] param1) {
        try {
            if (param0 > -100) {
                ((lh) this).field_o = null;
            }
            ((lh) this).field_o = new ta(param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "lh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lh(int param0) {
        super(param0);
    }

    final static void b(long param0, byte param1) {
        try {
            int var3 = 0;
            InterruptedException var4 = null;
            Throwable decompiledCaughtException = null;
            var3 = 95 % ((param1 - 54) / 48);
            {
              L0: {
                Thread.sleep(param0);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void o(int param0) {
        ((lh) this).field_j = (((lh) this).field_q + 7) / 8;
        if (param0 <= -107) {
            return;
        }
        field_l = null;
    }

    final void d(byte param0) {
        int var2 = -98 / ((param0 - -11) / 42);
        ((lh) this).field_q = 8 * ((lh) this).field_j;
    }

    final void d(int param0, int param1) {
        if (param1 != -18392) {
            lh.b(2L, (byte) -21);
            int fieldTemp$0 = ((lh) this).field_j;
            ((lh) this).field_j = ((lh) this).field_j + 1;
            ((lh) this).field_h[fieldTemp$0] = (byte)(((lh) this).field_o.b((byte) 127) + param0);
            return;
        }
        int fieldTemp$1 = ((lh) this).field_j;
        ((lh) this).field_j = ((lh) this).field_j + 1;
        ((lh) this).field_h[fieldTemp$1] = (byte)(((lh) this).field_o.b((byte) 127) + param0);
    }

    final int e(int param0, byte param1) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var3 = ((lh) this).field_q >> 3;
        int var4 = 8 - (((lh) this).field_q & 7);
        int var6 = 47 / ((param1 - -33) / 51);
        int var5 = 0;
        ((lh) this).field_q = ((lh) this).field_q + param0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((lh) this).field_h[incrementValue$0] & ji.field_a[var4]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 == param0) {
            var5 = var5 + (((lh) this).field_h[var3] & ji.field_a[var4]);
        } else {
            var5 = var5 + (((lh) this).field_h[var3] >> -param0 + var4 & ji.field_a[param0]);
        }
        return var5;
    }

    public static void p() {
        field_l = null;
        field_p = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[2];
    }
}
