/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static String field_h;
    private int[] field_a;
    private int field_d;
    private int[] field_i;
    private int field_e;
    private int field_g;
    static int[] field_f;
    static int field_c;
    private int field_b;

    final int b(byte param0) {
        int var2 = 102 / ((2 - param0) / 62);
        if (((aq) this).field_e == 0) {
            this.a(256);
            ((aq) this).field_e = 256;
        }
        int fieldTemp$0 = ((aq) this).field_e - 1;
        ((aq) this).field_e = ((aq) this).field_e - 1;
        return ((aq) this).field_a[fieldTemp$0];
    }

    final static int a(int param0, int param1, ml param2) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = (param2.l(param0, 59) ^ 1 << param0 - 1) + -(1 << param0 - 1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("aq.D(").append(param0).append(',').append(-30273).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String c(int param0) {
        int var1 = -55;
        return ek.field_M;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        var6 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var9 = -1640531527;
        var5 = -1640531527;
        var3 = -1640531527;
        var7 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(256);
                    ((aq) this).field_e = 256;
                    return;
                  } else {
                    var4 = var4 + ((aq) this).field_i[1 + var2];
                    var3 = var3 + ((aq) this).field_i[var2];
                    var8 = var8 + ((aq) this).field_i[5 + var2];
                    var10 = var10 + ((aq) this).field_i[var2 - -7];
                    var7 = var7 + ((aq) this).field_i[var2 + 4];
                    var9 = var9 + ((aq) this).field_i[var2 + 6];
                    var5 = var5 + ((aq) this).field_i[var2 - -2];
                    var6 = var6 + ((aq) this).field_i[3 + var2];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 16;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((aq) this).field_i[var2] = var3;
                    ((aq) this).field_i[var2 - -1] = var4;
                    ((aq) this).field_i[var2 + 2] = var5;
                    ((aq) this).field_i[3 + var2] = var6;
                    ((aq) this).field_i[var2 + 4] = var7;
                    ((aq) this).field_i[var2 + 5] = var8;
                    ((aq) this).field_i[6 + var2] = var9;
                    ((aq) this).field_i[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((aq) this).field_a[var2];
                var4 = var4 + ((aq) this).field_a[1 + var2];
                var10 = var10 + ((aq) this).field_a[var2 - -7];
                var6 = var6 + ((aq) this).field_a[var2 + 3];
                var8 = var8 + ((aq) this).field_a[5 + var2];
                var9 = var9 + ((aq) this).field_a[var2 + 6];
                var5 = var5 + ((aq) this).field_a[var2 + 2];
                var7 = var7 + ((aq) this).field_a[var2 - -4];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 16;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 10;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((aq) this).field_i[var2] = var3;
                ((aq) this).field_i[var2 - -1] = var4;
                ((aq) this).field_i[2 + var2] = var5;
                ((aq) this).field_i[3 + var2] = var6;
                ((aq) this).field_i[var2 - -4] = var7;
                ((aq) this).field_i[var2 - -5] = var8;
                ((aq) this).field_i[6 + var2] = var9;
                ((aq) this).field_i[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    final static String a(String param0, int param1) {
        RuntimeException var2 = null;
        lk[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        Object var10 = null;
        lk[] var11 = null;
        int stackIn_8_0 = 0;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var11 = w.a(param0, (byte) -21);
              var2_array = var11;
              if (param1 >= 103) {
                break L1;
              } else {
                var10 = null;
                String discarded$7 = aq.a((String) null, -9);
                break L1;
              }
            }
            var3 = new StringBuilder();
            var4 = 0;
            L2: while (true) {
              if (var11.length <= var4) {
                stackOut_20_0 = var3.toString();
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L3: {
                  var5 = var11[var4];
                  var6 = var5.field_f;
                  if (var4 != var11.length - 1) {
                    stackOut_7_0 = var2_array[var4 + 1].field_f;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = param0.length();
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  var8 = param0.substring(var6, var7);
                  if (rb.field_Mb == var5.field_k) {
                    StringBuilder discarded$8 = var3.append("<col=66ffff>").append(var8).append("</col>");
                    break L4;
                  } else {
                    if (var5.field_k != v.field_d) {
                      if (vu.field_Ab != var5.field_k) {
                        if (pv.field_H == var5.field_k) {
                          StringBuilder discarded$9 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                          break L4;
                        } else {
                          if (var5.field_k != ra.field_N) {
                            StringBuilder discarded$10 = var3.append(var8);
                            break L4;
                          } else {
                            StringBuilder discarded$11 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                            break L4;
                          }
                        }
                      } else {
                        StringBuilder discarded$12 = var3.append("<col=ffff99>").append(var8).append("</col>");
                        break L4;
                      }
                    } else {
                      StringBuilder discarded$13 = var3.append("<col=33bbff>").append(var8).append("</col>");
                      break L4;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("aq.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    public static void b(int param0) {
        field_f = null;
        field_h = null;
    }

    final static int a(boolean param0) {
        return (int)jr.field_Gb;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        int fieldTemp$3 = ((aq) this).field_b + 1;
        ((aq) this).field_b = ((aq) this).field_b + 1;
        ((aq) this).field_d = ((aq) this).field_d + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((aq) this).field_i[var2];
              if ((2 & var2) == 0) {
                if ((1 & var2) == 0) {
                  ((aq) this).field_g = ((aq) this).field_g ^ ((aq) this).field_g << 13;
                  break L1;
                } else {
                  ((aq) this).field_g = ((aq) this).field_g ^ ((aq) this).field_g >>> 6;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((aq) this).field_g = ((aq) this).field_g ^ ((aq) this).field_g >>> 16;
                  break L1;
                } else {
                  ((aq) this).field_g = ((aq) this).field_g ^ ((aq) this).field_g << 2;
                  break L1;
                }
              }
            }
            ((aq) this).field_g = ((aq) this).field_g + ((aq) this).field_i[var2 + 128 & 255];
            int dupTemp$4 = ((aq) this).field_d + ((aq) this).field_g + ((aq) this).field_i[qj.b(255, var3 >> 2)];
            var4 = dupTemp$4;
            ((aq) this).field_i[var2] = dupTemp$4;
            int dupTemp$5 = ((aq) this).field_i[qj.b(var4 >> 8 >> 2, 255)] - -var3;
            ((aq) this).field_d = dupTemp$5;
            ((aq) this).field_a[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final static void c(byte param0) {
        cb.field_d.a((lq) (Object) sk.field_d);
        nm.field_k = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    aq(int[] param0) {
        int var2_int = 0;
        try {
            ((aq) this).field_i = new int[256];
            ((aq) this).field_a = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((aq) this).field_a[var2_int] = param0[var2_int];
            }
            this.a((byte) -113);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "aq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_c = 5;
    }
}
