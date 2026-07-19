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
            stackOut_2_0 = (kv) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("bs.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        kv discarded$0 = null;
        field_j = null;
        field_g = null;
        if (param0 < 88) {
            kv var2 = (kv) null;
            discarded$0 = bs.a((kv) null, (byte) -55);
        }
    }

    final static void c(byte param0) {
        kv discarded$1 = null;
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var3 = 0;
        int var4 = 0;
        kv var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        int decompiledRegionSelector0 = 0;
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
                    var13 = sg.field_q;
                    var11 = var13;
                    var6 = var11;
                    var1_array = var6;
                    var17 = vla.field_x.field_m;
                    var3 = 0;
                    L3: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var14 = nga.field_i;
                        var12 = var14;
                        var8 = var12;
                        var1_array = var8;
                        var18 = vla.field_x.field_m;
                        var10 = 0;
                        var3 = var10;
                        L4: while (true) {
                          if ((var10 ^ -1) <= -9) {
                            dma.field_a = true;
                            vla.field_x = null;
                            break L2;
                          } else {
                            var8[var10] = dda.a(var14[var10], var18[var10] ^ -1);
                            var10++;
                            continue L4;
                          }
                        }
                      } else {
                        var6[var3] = mp.a(var13[var3], var17[var3]);
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
                if (param0 <= -106) {
                  break L5;
                } else {
                  var5 = (kv) null;
                  discarded$1 = bs.a((kv) null, (byte) 34);
                  break L5;
                }
              }
              L6: {
                if (!dma.field_a) {
                  break L6;
                } else {
                  of.b(115);
                  dca.d(-122);
                  if (-9 != (iba.field_s ^ -1)) {
                    break L6;
                  } else {
                    if (hs.a(false, nga.field_i)) {
                      break L6;
                    } else {
                      lg.a(true, 0, false);
                      break L6;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "bs.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    bs(long param0, int param1, byte[] param2) {
        try {
            this.field_h = param2;
            this.field_f = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bs.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new wba(3);
        field_j = "Name";
        field_k = 256;
    }
}
