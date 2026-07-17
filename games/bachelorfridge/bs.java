/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends bw {
    long field_f;
    int field_i;
    byte[] field_h;
    static wba field_g;
    static String field_j;
    static int field_k;

    final static kv a(kv param0, byte param1) {
        kv var2 = null;
        RuntimeException var2_ref = null;
        kv stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 112) {
                break L1;
              } else {
                bs.a(-13);
                break L1;
              }
            }
            var2 = new kv(param0.field_n, param0.field_o);
            var2.b();
            param0.c(0, 0, 65793);
            hga.field_U.a((byte) 14);
            stackOut_2_0 = (kv) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("bs.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        if (param0 < 88) {
            Object var2 = null;
            kv discarded$0 = bs.a((kv) null, (byte) -55);
        }
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (!dma.field_a) {
              L1: {
                if (dma.field_a) {
                  break L1;
                } else {
                  if (null == vla.field_x) {
                    vla.field_x = cn.a((byte) -68, 4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (dma.field_a) {
                  break L2;
                } else {
                  if (vla.field_x.field_j) {
                    var18 = sg.field_q;
                    var14 = var18;
                    var12 = var14;
                    var10 = var12;
                    var5 = var10;
                    var1_array = var5;
                    var19 = vla.field_x.field_m;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= 8) {
                        var20 = nga.field_i;
                        var16 = var20;
                        var13 = var16;
                        var11 = var13;
                        var7 = var11;
                        var1_array = var7;
                        var21 = vla.field_x.field_m;
                        var9 = 0;
                        var3 = var9;
                        L4: while (true) {
                          if (var9 >= 8) {
                            dma.field_a = true;
                            vla.field_x = null;
                            break L2;
                          } else {
                            var7[var9] = dda.a(var20[var9], ~var21[var9]);
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var5[var3] = mp.a(var18[var3], var19[var3]);
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                L6: {
                  if (!dma.field_a) {
                    break L6;
                  } else {
                    of.b(115);
                    dca.d(-122);
                    if (iba.field_s != 8) {
                      break L6;
                    } else {
                      if (hs.a(false, nga.field_i)) {
                        break L6;
                      } else {
                        lg.a(true, 0, false);
                        break L5;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "bs.A(" + -117 + 41);
        }
    }

    bs(long param0, int param1, byte[] param2) {
        try {
            ((bs) this).field_h = param2;
            ((bs) this).field_f = param0;
            ((bs) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bs.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new wba(3);
        field_j = "Name";
        field_k = 256;
    }
}
