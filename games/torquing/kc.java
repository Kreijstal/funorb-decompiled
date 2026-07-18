/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends am {
    private int[][] field_s;
    static ei field_z;
    private int[] field_y;
    static fn field_x;
    private int[] field_u;
    private short[] field_t;
    static int field_v;
    private int field_w;

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_x = null;
        field_z = null;
    }

    private final int[] b(int param0, int param1) {
        if (param0 < 0) {
            return ((kc) this).field_u;
        }
        if (((kc) this).field_s.length <= param0) {
            return ((kc) this).field_y;
        }
        return ((kc) this).field_s[param0];
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              L1: {
                if (param2 == 0) {
                  ((kc) this).field_w = param0.i((byte) -101);
                  ((kc) this).field_s = new int[param0.i((byte) -101)][2];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= ((kc) this).field_s.length) {
                      break L1;
                    } else {
                      ((kc) this).field_s[var4_int][0] = param0.i(7088);
                      ((kc) this).field_s[var4_int][1] = param0.i(7088);
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("kc.H(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void g() {
        int[] var13 = ((kc) this).field_s[0];
        int[] var11 = var13;
        int[] var9 = var11;
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var2 = var6;
        int[] var14 = ((kc) this).field_s[1];
        int[] var4 = ((kc) this).field_s[((kc) this).field_s.length - 2];
        int[] var5 = ((kc) this).field_s[((kc) this).field_s.length + -1];
        ((kc) this).field_y = new int[]{var4[0] - var5[0] - -var4[0], var4[1] + (-var5[1] + var4[1])};
        ((kc) this).field_u = new int[]{var13[0] + var13[0] - var14[0], var13[1] + -var14[1] + var13[1]};
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        L0: {
          var21 = Torquing.field_u;
          var2 = ((kc) this).field_w;
          if (var2 == 2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 257) {
                break L0;
              } else {
                var4 = var2 << 4;
                var3 = 1;
                L2: while (true) {
                  L3: {
                    if (~(((kc) this).field_s.length - 1) >= ~var3) {
                      break L3;
                    } else {
                      if (((kc) this).field_s[var3][0] <= var4) {
                        var3++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var22 = ((kc) this).field_s[var3 + -1];
                    var34 = ((kc) this).field_s[var3];
                    var7 = this.b(var3 - 2, 257)[1];
                    var8 = var22[1];
                    var9 = var34[1];
                    var10 = this.b(1 + var3, 257)[1];
                    var11 = (var4 - var22[0] << 12) / (var34[0] - var22[0]);
                    var12 = var11 * var11 >> 12;
                    var13 = var8 + -var7 + -var9 + var10;
                    var14 = -var8 + (var7 - var13);
                    var15 = -var7 + var9;
                    var16 = var8;
                    var17 = var12 * (var11 * var13 >> 12) >> 12;
                    var18 = var12 * var14 >> 12;
                    var19 = var15 * var11 >> 12;
                    var20 = var19 + var17 - -var18 - -var16;
                    if (var20 > -32768) {
                      break L4;
                    } else {
                      var20 = -32767;
                      break L4;
                    }
                  }
                  L5: {
                    if (var20 < 32768) {
                      break L5;
                    } else {
                      var20 = 32767;
                      break L5;
                    }
                  }
                  ((kc) this).field_t[var2] = (short)var20;
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            if (1 == var2) {
              var2 = 0;
              L6: while (true) {
                if (var2 >= 257) {
                  break L0;
                } else {
                  var4 = var2 << 4;
                  var3 = 1;
                  L7: while (true) {
                    L8: {
                      if (~(((kc) this).field_s.length - 1) >= ~var3) {
                        break L8;
                      } else {
                        if (~var4 > ~((kc) this).field_s[var3][0]) {
                          break L8;
                        } else {
                          var3++;
                          continue L7;
                        }
                      }
                    }
                    L9: {
                      var24 = ((kc) this).field_s[var3 + -1];
                      var35 = ((kc) this).field_s[var3];
                      var7 = (var4 + -var24[0] << 12) / (var35[0] + -var24[0]);
                      var8 = 4096 - de.field_d[(var7 & 8167) >> 5] >> 1;
                      var9 = -var8 + 4096;
                      var10 = var24[1] * var9 - -(var8 * var35[1]) >> 12;
                      if (var10 > -32768) {
                        break L9;
                      } else {
                        var10 = -32767;
                        break L9;
                      }
                    }
                    L10: {
                      if (var10 < 32768) {
                        break L10;
                      } else {
                        var10 = 32767;
                        break L10;
                      }
                    }
                    ((kc) this).field_t[var2] = (short)var10;
                    var2++;
                    continue L6;
                  }
                }
              }
            } else {
              var2 = 0;
              L11: while (true) {
                if (257 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << 4;
                  var3 = 1;
                  L12: while (true) {
                    L13: {
                      if (~var3 <= ~(-1 + ((kc) this).field_s.length)) {
                        break L13;
                      } else {
                        if (~((kc) this).field_s[var3][0] < ~var4) {
                          break L13;
                        } else {
                          var3++;
                          continue L12;
                        }
                      }
                    }
                    L14: {
                      var26 = ((kc) this).field_s[-1 + var3];
                      var36 = ((kc) this).field_s[var3];
                      var7 = (-var26[0] + var4 << 12) / (-var26[0] + var36[0]);
                      var8 = -var7 + 4096;
                      var9 = var8 * var26[1] - -(var36[1] * var7) >> 12;
                      if (-32768 >= var9) {
                        var9 = -32767;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (32768 > var9) {
                        break L15;
                      } else {
                        var9 = 32767;
                        break L15;
                      }
                    }
                    ((kc) this).field_t[var2] = (short)var9;
                    var2++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = Torquing.field_u;
        if (param0 <= 86) {
            return null;
        }
        int[] var8 = ((kc) this).field_l.a(param1, 25657);
        int[] var3 = var8;
        if (!(!((kc) this).field_l.field_b)) {
            var5 = ((kc) this).b(0, 0, param1);
            for (var6 = 0; var6 < ci.field_c; var6++) {
                var4 = var5[var6] >> 4;
                if (var4 < 0) {
                    var4 = 0;
                }
                if (!(var4 <= 256)) {
                    var4 = 256;
                }
                var8[var6] = ((kc) this).field_t[var4];
            }
        }
        return var8;
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
            var2_int = -83 / ((param0 - 49) / 60);
            stackOut_0_0 = ga.a(false, param1, true, 10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("kc.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public kc() {
        super(1, true);
        ((kc) this).field_t = new short[257];
        ((kc) this).field_w = 0;
    }

    final void a(byte param0) {
        if (((kc) this).field_s == null) {
            ((kc) this).field_s = new int[][]{new int[2], new int[2]};
        }
        if (2 > ((kc) this).field_s.length) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (((kc) this).field_w == 2) {
            int discarded$0 = 69;
            this.g();
        }
        if (param0 <= 123) {
            Object var3 = null;
            kc.a(76, (la) null, (la) null);
        }
        int discarded$1 = 14837;
        ie.a();
        this.a(false);
    }

    final static String[] a(char param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            var10 = (CharSequence) (Object) param1;
            var3_int = fm.a(param2, param0, var10);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param1.substring(var6);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param1.charAt(var8) == param0) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param1.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("kc.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, la param1, la param2) {
        try {
            if (param0 != 1) {
                Object var4 = null;
                String[] discarded$0 = kc.a('', (String) null, -20);
            }
            qm.field_a = param1;
            ae.field_mb = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new ei();
    }
}
