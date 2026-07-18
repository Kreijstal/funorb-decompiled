/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] field_d;
    static boolean field_c;
    static fe field_b;
    static int[] field_e;
    static String field_a;

    final synchronized static long a(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        long var1 = System.currentTimeMillis();
        if (~var1 > ~cl.field_y) {
            vl.field_B = vl.field_B + (cl.field_y - var1);
        }
        cl.field_y = var1;
        return var1 + vl.field_B;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == hi.field_e) {
            break L0;
          } else {
            var1 = (Object) (Object) hi.field_e;
            synchronized (var1) {
              L1: {
                hi.field_e = null;
                break L1;
              }
            }
            break L0;
          }
        }
        field_d = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        oa var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var3 = -27 % ((param0 - 13) / 43);
              var10 = new oa(param1);
              var4 = var10.d((byte) 57);
              var5 = var10.c((byte) -126);
              if (var5 < 0) {
                break L1;
              } else {
                L2: {
                  if (ll.field_R == 0) {
                    break L2;
                  } else {
                    if (ll.field_R < var5) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var4 != 0) {
                  L3: {
                    var6 = var10.c((byte) -116);
                    if (var6 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (ll.field_R == 0) {
                          break L4;
                        } else {
                          if (~ll.field_R <= ~var6) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var18 = new byte[var6];
                        var16 = var18;
                        var14 = var16;
                        var12 = var14;
                        var7 = var12;
                        if (var4 == 1) {
                          int discarded$1 = gf.a(var18, var6, param1, var5, 9);
                          break L5;
                        } else {
                          var8 = (Object) (Object) je.field_d;
                          synchronized (var8) {
                            L6: {
                              je.field_d.a(var10, -115, var18);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var7;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var17 = new byte[var5];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var6_ref_byte__ = var11;
                  var10.a(var5, 2, var17, 0);
                  stackOut_6_0 = (byte[]) var6_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("lk.E(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final static ti a(boolean param0) {
        int var4_int = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var1 = wk.field_b[0] * ql.field_b[0];
        byte[] var2 = re.field_K[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = rg.field_D[vg.c(255, (int) var2[var4_int])];
        }
        ti var4 = new ti(pj.field_y, ll.field_U, gj.field_j[0], re.field_a[0], ql.field_b[0], wk.field_b[0], var3);
        wd.d(126);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = new int[]{396, 396, 396, 396, 336, 336, 396};
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
