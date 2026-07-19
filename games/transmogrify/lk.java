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
        long var1 = 0L;
        if (param0 == 0) {
          var1 = System.currentTimeMillis();
          if ((var1 ^ -1L) > (cl.field_y ^ -1L)) {
            vl.field_B = vl.field_B + (cl.field_y - var1);
            cl.field_y = var1;
            return var1 + vl.field_B;
          } else {
            cl.field_y = var1;
            return var1 + vl.field_B;
          }
        } else {
          field_b = (fe) null;
          var1 = System.currentTimeMillis();
          if ((var1 ^ -1L) <= (cl.field_y ^ -1L)) {
            cl.field_y = var1;
            return var1 + vl.field_B;
          } else {
            vl.field_B = vl.field_B + (cl.field_y - var1);
            cl.field_y = var1;
            return var1 + vl.field_B;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 >= -15) {
            field_c = false;
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == hi.field_e) {
          if (param0) {
            field_d = (int[]) null;
            return;
          } else {
            return;
          }
        } else {
          var1 = hi.field_e;
          synchronized (var1) {
            L0: {
              hi.field_e = null;
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              field_d = (int[]) null;
              break L1;
            }
          }
          return;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int discarded$1 = 0;
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
        byte[] stackIn_7_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_21_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              var3 = -27 % ((param0 - 13) / 43);
              var10 = new oa(param1);
              var4 = var10.d((byte) 57);
              var5 = var10.c((byte) -126);
              if ((var5 ^ -1) > -1) {
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
                if (-1 != (var4 ^ -1)) {
                  L3: {
                    var6 = var10.c((byte) -116);
                    if (var6 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (ll.field_R == 0) {
                          break L4;
                        } else {
                          if (ll.field_R >= var6) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var14 = new byte[var6];
                          var12 = var14;
                          var7 = var12;
                          if (-2 == (var4 ^ -1)) {
                            break L6;
                          } else {
                            var8 = je.field_d;
                            synchronized (var8) {
                              L7: {
                                je.field_d.a(var10, -115, var14);
                                break L7;
                              }
                            }
                            if (!Transmogrify.field_A) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        discarded$1 = gf.a(var14, var6, param1, var5, 9);
                        break L5;
                      }
                      stackOut_21_0 = (byte[]) (var7);
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var13 = new byte[var5];
                  var11 = var13;
                  var6_ref_byte__ = var11;
                  var10.a(var5, 2, var13, 0);
                  stackOut_6_0 = (byte[]) (var6_ref_byte__);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("lk.E(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_22_0;
        }
    }

    final static ti a(boolean param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        ti var4 = null;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var1 = wk.field_b[0] * ql.field_b[0];
        var2 = re.field_K[0];
        var3 = new int[var1];
        if (!param0) {
          return (ti) null;
        } else {
          var4_int = 0;
          L0: while (true) {
            L1: {
              if (var4_int >= var1) {
                break L1;
              } else {
                var3[var4_int] = rg.field_D[vg.c(255, (int) var2[var4_int])];
                var4_int++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = new ti(pj.field_y, ll.field_U, gj.field_j[0], re.field_a[0], ql.field_b[0], wk.field_b[0], var3);
            wd.d(126);
            return var4;
          }
        }
    }

    static {
        field_c = false;
        field_e = new int[]{396, 396, 396, 396, 336, 336, 396};
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
