/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn implements Runnable {
    rk field_f;
    static int field_d;
    volatile boolean field_e;
    volatile boolean field_a;
    static long[] field_b;
    volatile tk[] field_c;

    final static byte[] a(byte[] param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        rb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_20_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var9 = new rb(param0);
              var3 = var9.g(-123);
              var4 = var9.a((byte) 113);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (0 == kk.field_K) {
                    break L2;
                  } else {
                    if (var4 > kk.field_K) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == 0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(0, 7186, var4, var17);
                  stackOut_22_0 = (byte[]) var5;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.a((byte) 110);
                    if (var5_int < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (kk.field_K == 0) {
                          break L4;
                        } else {
                          if (var5_int > kk.field_K) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 == 1) {
                          int discarded$2 = 9;
                          int discarded$3 = on.a(var6, var5_int, param0, var4);
                          break L5;
                        } else {
                          var7 = (Object) (Object) vg.field_h;
                          synchronized (var7) {
                            L6: {
                              vg.field_h.a(var16, 10, var9);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("pn.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 0 + ')');
        }
        return stackIn_23_0;
    }

    public static void a() {
        field_b = null;
    }

    public final void run() {
        int var1_int = 0;
        tk var2 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ((pn) this).field_e = true;
        try {
            while (!((pn) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((pn) this).field_c[var1_int];
                    if (var2 != null) {
                        var2.h();
                    }
                }
                int discarded$0 = 0;
                wf.a(10L);
                rb.a(5, (Object) null, ((pn) this).field_f);
            }
        } catch (Exception exception) {
            Object var5 = null;
            v.a((String) null, (byte) -52, (Throwable) (Object) exception);
        } finally {
            ((pn) this).field_e = false;
        }
    }

    final static ak a(Throwable param0, String param1) {
        ak var2 = null;
        if (!(param0 instanceof ak)) {
            var2 = new ak(param0, param1);
        } else {
            var2 = (ak) (Object) param0;
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    final static void a(oc param0) {
        try {
            ci.field_j.a(77, (wf) (Object) param0);
            ac.a(4, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "pn.A(" + (param0 != null ? "{...}" : "null") + ',' + -117 + ',' + 4 + ')');
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = gi.field_i[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= gi.field_i.length) {
                break L0;
              } else {
                var3 = gi.field_i[var2];
                au.a(jr.field_n, var2 << 4, jr.field_n, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "pn.C(" + true + ')');
        }
    }

    pn() {
        ((pn) this).field_c = new tk[2];
        ((pn) this).field_a = false;
        ((pn) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = new long[32];
    }
}
