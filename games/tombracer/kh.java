/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends uia {
    static String[][] field_l;
    private int field_i;
    private qea field_n;
    static String field_p;
    static String field_j;
    static String field_m;
    private int field_k;
    static String field_o;

    kh(byte[] param0) {
        super(param0);
    }

    final int j(int param0) {
        if (param0 >= -25) {
            ((kh) this).field_i = 127;
            int fieldTemp$0 = ((kh) this).field_h;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            return 255 & ((kh) this).field_g[fieldTemp$0] + -((kh) this).field_n.b(104);
        }
        int fieldTemp$1 = ((kh) this).field_h;
        ((kh) this).field_h = ((kh) this).field_h + 1;
        return 255 & ((kh) this).field_g[fieldTemp$1] + -((kh) this).field_n.b(104);
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var4 = 9 / ((-85 - param0) / 40);
        param1 = param1 & fca.field_b[param2];
        while (((kh) this).field_k < param2) {
            param2 = param2 - ((kh) this).field_k;
            int fieldTemp$0 = ((kh) this).field_h;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[fieldTemp$0] = (byte)(((kh) this).field_g[fieldTemp$0] + (param1 >>> param2));
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
        }
        if (((kh) this).field_k != param2) {
            ((kh) this).field_k = ((kh) this).field_k - param2;
            ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param1 << ((kh) this).field_k));
        } else {
            int fieldTemp$1 = ((kh) this).field_h;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[fieldTemp$1] = (byte)(((kh) this).field_g[fieldTemp$1] + param1);
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
            return;
        }
    }

    kh(int param0) {
        super(param0);
    }

    final void h(byte param0) {
        ((kh) this).field_i = ((kh) this).field_h * 8;
        int var2 = -117 % ((61 - param0) / 49);
    }

    final void i(int param0) {
        ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
        ((kh) this).field_k = param0;
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((kh) this).field_n = new qea(param1);
              if (param0 == -26185) {
                break L1;
              } else {
                int discarded$2 = ((kh) this).b((byte) -116, 2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kh.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = ((kh) this).field_i >> 3;
        var4 = 8 - (((kh) this).field_i & 7);
        var5 = 0;
        ((kh) this).field_i = ((kh) this).field_i + param1;
        if (param0 != 44) {
          field_m = null;
          L0: while (true) {
            if (var4 >= param1) {
              L1: {
                if (var4 != param1) {
                  var5 = var5 + (((kh) this).field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                  break L1;
                } else {
                  var5 = var5 + (fca.field_b[var4] & ((kh) this).field_g[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((fca.field_b[var4] & ((kh) this).field_g[incrementValue$2]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 >= param1) {
              L3: {
                if (var4 != param1) {
                  var5 = var5 + (((kh) this).field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                  break L3;
                } else {
                  var5 = var5 + (fca.field_b[var4] & ((kh) this).field_g[var3]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((fca.field_b[var4] & ((kh) this).field_g[incrementValue$3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void i(byte param0) {
        ((kh) this).field_h = (((kh) this).field_i + 7) / 8;
        if (param0 == 98) {
            return;
        }
        ((kh) this).k(-21, -101);
    }

    final void j(int param0, int param1) {
        int var3 = 0;
        param0 = param0 & 15;
        if (param1 == 4) {
          var3 = ((kh) this).field_k;
          if (var3 == 4) {
            int fieldTemp$10 = ((kh) this).field_h;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[fieldTemp$10] = (byte)(((kh) this).field_g[fieldTemp$10] + param0);
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
            return;
          } else {
            if (var3 == 3) {
              int fieldTemp$11 = ((kh) this).field_h;
              ((kh) this).field_h = ((kh) this).field_h + 1;
              ((kh) this).field_g[fieldTemp$11] = (byte)(((kh) this).field_g[fieldTemp$11] + (param0 >>> 1));
              ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 7);
              ((kh) this).field_k = 7;
              return;
            } else {
              if (var3 != 2) {
                if (var3 == 1) {
                  int fieldTemp$12 = ((kh) this).field_h;
                  ((kh) this).field_h = ((kh) this).field_h + 1;
                  ((kh) this).field_g[fieldTemp$12] = (byte)(((kh) this).field_g[fieldTemp$12] + (param0 >>> 3));
                  ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 5);
                  ((kh) this).field_k = 5;
                  return;
                } else {
                  if (var3 == 0) {
                    int fieldTemp$13 = ((kh) this).field_h;
                    ((kh) this).field_h = ((kh) this).field_h + 1;
                    ((kh) this).field_g[fieldTemp$13] = (byte)(param0 << 4);
                    ((kh) this).field_k = 4;
                    return;
                  } else {
                    ((kh) this).field_k = ((kh) this).field_k - 4;
                    ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 << ((kh) this).field_k));
                    return;
                  }
                }
              } else {
                int fieldTemp$14 = ((kh) this).field_h;
                ((kh) this).field_h = ((kh) this).field_h + 1;
                ((kh) this).field_g[fieldTemp$14] = (byte)(((kh) this).field_g[fieldTemp$14] + (param0 >>> 2));
                ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 6);
                ((kh) this).field_k = 6;
                return;
              }
            }
          }
        } else {
          field_p = null;
          var3 = ((kh) this).field_k;
          if (var3 == 4) {
            int fieldTemp$15 = ((kh) this).field_h;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[fieldTemp$15] = (byte)(((kh) this).field_g[fieldTemp$15] + param0);
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
            return;
          } else {
            if (var3 == 3) {
              int fieldTemp$16 = ((kh) this).field_h;
              ((kh) this).field_h = ((kh) this).field_h + 1;
              ((kh) this).field_g[fieldTemp$16] = (byte)(((kh) this).field_g[fieldTemp$16] + (param0 >>> 1));
              ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 7);
              ((kh) this).field_k = 7;
              return;
            } else {
              if (var3 != 2) {
                if (var3 == 1) {
                  int fieldTemp$17 = ((kh) this).field_h;
                  ((kh) this).field_h = ((kh) this).field_h + 1;
                  ((kh) this).field_g[fieldTemp$17] = (byte)(((kh) this).field_g[fieldTemp$17] + (param0 >>> 3));
                  ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 5);
                  ((kh) this).field_k = 5;
                  return;
                } else {
                  if (var3 == 0) {
                    int fieldTemp$18 = ((kh) this).field_h;
                    ((kh) this).field_h = ((kh) this).field_h + 1;
                    ((kh) this).field_g[fieldTemp$18] = (byte)(param0 << 4);
                    ((kh) this).field_k = 4;
                    return;
                  } else {
                    ((kh) this).field_k = ((kh) this).field_k - 4;
                    ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 << ((kh) this).field_k));
                    return;
                  }
                }
              } else {
                int fieldTemp$19 = ((kh) this).field_h;
                ((kh) this).field_h = ((kh) this).field_h + 1;
                ((kh) this).field_g[fieldTemp$19] = (byte)(((kh) this).field_g[fieldTemp$19] + (param0 >>> 2));
                ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 6);
                ((kh) this).field_k = 6;
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 80 / ((70 - param1) / 50);
            L1: while (true) {
              if (var5_int >= param3) {
                break L0;
              } else {
                int fieldTemp$5 = ((kh) this).field_h;
                ((kh) this).field_h = ((kh) this).field_h + 1;
                param2[param0 + var5_int] = (byte)(((kh) this).field_g[fieldTemp$5] + -((kh) this).field_n.b(120));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("kh.M(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, kia param1, kea param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != qla.field_f) {
                break L1;
              } else {
                if (la.field_k == param1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kh.I(").append(true).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void k(int param0, int param1) {
        if (param1 != -2988) {
            return;
        }
        int fieldTemp$0 = ((kh) this).field_h;
        ((kh) this).field_h = ((kh) this).field_h + 1;
        ((kh) this).field_g[fieldTemp$0] = (byte)(((kh) this).field_n.b(104) + param0);
    }

    public static void g() {
        field_j = null;
        field_m = null;
        field_l = null;
        field_p = null;
        field_o = null;
    }

    final void k(int param0) {
        if (8 > ((kh) this).field_k) {
            ((kh) this).field_k = 8;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            if (param0 == -1826190686) {
                return;
            }
            field_o = null;
            return;
        }
        if (param0 == -1826190686) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Game";
        field_j = "Close";
        field_m = "Rumour has it these bags o' loot were abandoned by ancient smugglers. Now you can smuggle them out for points.";
        field_o = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
