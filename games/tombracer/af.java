/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static fta field_g;
    private od field_c;
    private int field_e;
    private od[] field_d;
    private long field_h;
    static cn field_b;
    private od field_a;
    private int field_f;

    final static dh[] a(int param0, fia param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        dh[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        dh var7 = null;
        int var8 = 0;
        naa var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        dh[] stackIn_3_0 = null;
        dh[] stackIn_9_0 = null;
        dh[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        dh[] stackOut_13_0 = null;
        dh[] stackOut_8_0 = null;
        dh[] stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1.a((byte) 69)) {
              var9 = param1.a(-111);
              L1: while (true) {
                if (var9.field_b != 0) {
                  if (2 != var9.field_b) {
                    var13 = (int[]) var9.field_f;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var3 = var10;
                    var4 = new dh[var13.length >> 2];
                    var6 = 63 / (param0 / 46);
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_13_0 = (dh[]) var4;
                        stackIn_14_0 = stackOut_13_0;
                        break L0;
                      } else {
                        var7 = new dh();
                        var4[var5] = var7;
                        var7.field_a = var3[var5 << 2];
                        var7.field_c = var3[1 + (var5 << 2)];
                        var7.field_d = var3[2 + (var5 << 2)];
                        var7.field_b = var3[(var5 << 2) - -3];
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_8_0 = new dh[]{};
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  vja.a(0, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new dh[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("af.D(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final void a(int param0, od param1, long param2) {
        od var5 = null;
        try {
            if (param1.field_f != null) {
                param1.c(-7975);
            }
            var5 = ((af) this).field_d[(int)((long)(param0 + ((af) this).field_e) & param2)];
            param1.field_f = var5.field_f;
            param1.field_g = var5;
            param1.field_f.field_g = param1;
            param1.field_j = param2;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "af.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 <= 72) {
            af.a(-28);
            field_g = null;
            field_b = null;
            return;
        }
        field_g = null;
        field_b = null;
    }

    final od a(byte param0) {
        int var3 = 0;
        od var4 = null;
        od var5 = null;
        od var29 = null;
        od var57 = null;
        od var58 = null;
        od var59 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (((af) this).field_f <= 0) {
          if (param0 != -112) {
            ((af) this).a(55, (od) null, 93L);
            L0: while (true) {
              if (((af) this).field_f < ((af) this).field_e) {
                int fieldTemp$4 = ((af) this).field_f;
                ((af) this).field_f = ((af) this).field_f + 1;
                var4 = ((af) this).field_d[fieldTemp$4].field_g;
                var59 = var4;
                if (var4 == ((af) this).field_d[((af) this).field_f + -1]) {
                  continue L0;
                } else {
                  ((af) this).field_a = var59.field_g;
                  return var59;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (((af) this).field_f < ((af) this).field_e) {
                int fieldTemp$5 = ((af) this).field_f;
                ((af) this).field_f = ((af) this).field_f + 1;
                var4 = ((af) this).field_d[fieldTemp$5].field_g;
                var58 = var4;
                if (var4 == ((af) this).field_d[((af) this).field_f + -1]) {
                  continue L1;
                } else {
                  ((af) this).field_a = var58.field_g;
                  return var58;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (((af) this).field_a != ((af) this).field_d[-1 + ((af) this).field_f]) {
            var57 = ((af) this).field_a;
            ((af) this).field_a = var57.field_g;
            return var57;
          } else {
            if (param0 != -112) {
              ((af) this).a(55, (od) null, 93L);
              L2: while (true) {
                if (((af) this).field_f < ((af) this).field_e) {
                  int fieldTemp$6 = ((af) this).field_f;
                  ((af) this).field_f = ((af) this).field_f + 1;
                  var4 = ((af) this).field_d[fieldTemp$6].field_g;
                  var29 = var4;
                  if (var4 == ((af) this).field_d[((af) this).field_f + -1]) {
                    continue L2;
                  } else {
                    ((af) this).field_a = var29.field_g;
                    return var29;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L3: while (true) {
                if (((af) this).field_f < ((af) this).field_e) {
                  int fieldTemp$7 = ((af) this).field_f;
                  ((af) this).field_f = ((af) this).field_f + 1;
                  var4 = ((af) this).field_d[fieldTemp$7].field_g;
                  var5 = var4;
                  if (var4 == ((af) this).field_d[((af) this).field_f + -1]) {
                    continue L3;
                  } else {
                    ((af) this).field_a = var5.field_g;
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    final od b(int param0) {
        int var2 = -55 % ((-40 - param0) / 47);
        ((af) this).field_f = 0;
        return ((af) this).a((byte) -112);
    }

    final od a(int param0, long param1) {
        od var4 = null;
        od var5 = null;
        int var6 = 0;
        od var7 = null;
        od var8 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= -104) {
          ((af) this).field_h = param1;
          var7 = ((af) this).field_d[(int)(param1 & (long)(-1 + ((af) this).field_e))];
          var4 = var7;
          ((af) this).field_c = var7.field_g;
          L0: while (true) {
            if (((af) this).field_c == var4) {
              ((af) this).field_c = null;
              return null;
            } else {
              if (((af) this).field_c.field_j != param1) {
                ((af) this).field_c = ((af) this).field_c.field_g;
                continue L0;
              } else {
                var5 = ((af) this).field_c;
                ((af) this).field_c = ((af) this).field_c.field_g;
                return var5;
              }
            }
          }
        } else {
          ((af) this).field_f = 105;
          ((af) this).field_h = param1;
          var8 = ((af) this).field_d[(int)(param1 & (long)(-1 + ((af) this).field_e))];
          var4 = var8;
          ((af) this).field_c = var8.field_g;
          L1: while (true) {
            if (((af) this).field_c == var4) {
              ((af) this).field_c = null;
              return null;
            } else {
              if (((af) this).field_c.field_j != param1) {
                ((af) this).field_c = ((af) this).field_c.field_g;
                continue L1;
              } else {
                var5 = ((af) this).field_c;
                ((af) this).field_c = ((af) this).field_c.field_g;
                return var5;
              }
            }
          }
        }
    }

    final od b(byte param0) {
        od var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 13) {
            return null;
        }
        if (null == ((af) this).field_c) {
            return null;
        }
        od var2 = ((af) this).field_d[(int)(((af) this).field_h & (long)(-1 + ((af) this).field_e))];
        while (var2 != ((af) this).field_c) {
            if (!(~((af) this).field_c.field_j != ~((af) this).field_h)) {
                var3 = ((af) this).field_c;
                ((af) this).field_c = ((af) this).field_c.field_g;
                return var3;
            }
            ((af) this).field_c = ((af) this).field_c.field_g;
        }
        ((af) this).field_c = null;
        return null;
    }

    af(int param0) {
        int var2 = 0;
        od var3 = null;
        ((af) this).field_f = 0;
        ((af) this).field_e = param0;
        ((af) this).field_d = new od[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            od dupTemp$2 = new od();
            var3 = dupTemp$2;
            ((af) this).field_d[var2] = dupTemp$2;
            var3.field_f = var3;
            var3.field_g = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new fta();
    }
}
