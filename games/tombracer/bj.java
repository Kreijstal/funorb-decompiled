/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ci {
    private int field_q;
    private int[] field_o;
    static sla field_p;
    private int field_r;
    private int[] field_m;
    private int field_n;
    static ti[] field_s;

    public bj() {
        super(0, true);
        ((bj) this).field_q = 0;
        ((bj) this).field_r = 2048;
        ((bj) this).field_n = 10;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var15 = ((bj) this).field_i.a((byte) -113, param1);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (param0 == 1) {
            break L0;
          } else {
            this.c(-75);
            break L0;
          }
        }
        L1: {
          if (!((bj) this).field_i.field_d) {
            break L1;
          } else {
            var4 = sj.field_b[param1];
            if (((bj) this).field_q == 0) {
              var15 = var14;
              var5 = 0;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (((bj) this).field_n <= var6) {
                    break L3;
                  } else {
                    if (((bj) this).field_o[var6] <= var4) {
                      if (var4 < ((bj) this).field_o[1 + var6]) {
                        if (var4 < ((bj) this).field_m[var6]) {
                          var5 = 4096;
                          break L3;
                        } else {
                          lua.a(var15, 0, ns.field_g, var5);
                          return var3;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                lua.a(var15, 0, ns.field_g, var5);
                break L1;
              }
            } else {
              var5 = 0;
              L4: while (true) {
                if (ns.field_g <= var5) {
                  break L1;
                } else {
                  L5: {
                    var6 = 0;
                    var7 = 0;
                    var8 = ht.field_Fb[var5];
                    var9 = ((bj) this).field_q;
                    if (var9 != 1) {
                      if (var9 != 2) {
                        if (var9 == 3) {
                          var6 = (var8 - var4 >> 1) + 2048;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        var6 = (var8 - -var4 - 4096 >> 1) + 2048;
                        break L5;
                      }
                    } else {
                      var6 = var8;
                      break L5;
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L6: while (true) {
                    L7: {
                      if (((bj) this).field_n <= var11) {
                        break L7;
                      } else {
                        if (var6 >= ((bj) this).field_o[var11]) {
                          if (((bj) this).field_o[var11 + 1] > var6) {
                            if (((bj) this).field_m[var11] <= var6) {
                              break L7;
                            } else {
                              var7 = 4096;
                              break L7;
                            }
                          } else {
                            var11++;
                            continue L6;
                          }
                        } else {
                          var11++;
                          continue L6;
                        }
                      }
                    }
                    var15 = var14;
                    var15[var5] = var7;
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final void b(byte param0) {
        this.c(param0 ^ -117);
        if (param0 != 116) {
            ((bj) this).field_o = null;
        }
    }

    private final void c(int param0) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        ((bj) this).field_o = new int[((bj) this).field_n - param0];
        ((bj) this).field_m = new int[1 + ((bj) this).field_n];
        int var2 = 0;
        int var3 = 4096 / ((bj) this).field_n;
        int var4 = var3 * ((bj) this).field_r >> 12;
        for (var5 = 0; ((bj) this).field_n > var5; var5++) {
            ((bj) this).field_o[var5] = var2;
            ((bj) this).field_m[var5] = var2 - -var4;
            var2 = var2 + var3;
        }
        ((bj) this).field_o[((bj) this).field_n] = 4096;
        ((bj) this).field_m[((bj) this).field_n] = ((bj) this).field_m[0] + 4096;
    }

    public static void a() {
        field_s = null;
        field_p = null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((bj) this).field_n = param1.h(255);
                break L1;
              } else {
                if (var4_int == 1) {
                  ((bj) this).field_r = param1.d(121);
                  break L1;
                } else {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    ((bj) this).field_q = param1.h(255);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                ((bj) this).field_q = 15;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("bj.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_p = new sla();
        field_s = new ti[255];
        for (var0 = 0; var0 < field_s.length; var0++) {
            field_s[var0] = new ti();
        }
    }
}
