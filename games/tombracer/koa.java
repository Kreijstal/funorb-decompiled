/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa {
    static ka[] field_b;
    static String field_d;
    private int field_e;
    private lj[] field_f;
    private dha[] field_a;
    static String field_c;

    final static int b(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
        return qf.field_i;
    }

    private final void a() {
        int var2 = 0;
        int var3_int = 0;
        lj[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (((koa) this).field_f.length <= var3_int) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                L2: {
                  var3 = new lj[((koa) this).field_f.length + -var2];
                  if (var3.length > 0) {
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((koa) this).field_f.length) {
                        break L2;
                      } else {
                        if (null != ((koa) this).field_f[var5]) {
                          if (!((koa) this).field_f[var5].n(31974).b(59)) {
                            int incrementValue$1 = var4;
                            var4++;
                            var3[incrementValue$1] = ((koa) this).field_f[var5];
                            var5++;
                            continue L3;
                          } else {
                            var5++;
                            continue L3;
                          }
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                ((koa) this).field_f = var3;
                break L1;
              }
            }
            return;
          } else {
            if (null != ((koa) this).field_f[var3_int]) {
              if (!((koa) this).field_f[var3_int].n(31974).b(59)) {
                var3_int++;
                continue L0;
              } else {
                var2++;
                var3_int++;
                continue L0;
              }
            } else {
              var2++;
              var3_int++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, lj[] param1) {
        try {
            if (param0 != 9) {
                ((koa) this).field_f = null;
            }
            ((koa) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "koa.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, ew param1, kh param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            int discarded$4 = -12;
            this.a();
            int discarded$5 = 22972;
            param2.a((byte) 43, ((koa) this).field_f.length, iia.d(((koa) this).field_e));
            var4_int = 0;
            L1: while (true) {
              if (((koa) this).field_f.length <= var4_int) {
                L2: {
                  if (param0 == 30489) {
                    break L2;
                  } else {
                    ((koa) this).field_a = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (((koa) this).field_f[var4_int].h((byte) 114) == param1) {
                    param2.a((byte) 70, 1, 1);
                    param2.a((byte) 61, ((koa) this).field_f[var4_int].i((byte) 84).field_d, 8);
                    break L3;
                  } else {
                    param2.a((byte) -126, 0, 1);
                    param2.a((byte) -127, ((koa) this).field_f[var4_int].n(31974).field_d, 8);
                    break L3;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("koa.A(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(ew param0, int param1) {
        int var3_int = 0;
        dha var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(((koa) this).field_a != null)) {
            return;
        }
        try {
            ((koa) this).field_f = new lj[((koa) this).field_a.length];
            for (var3_int = 0; ((koa) this).field_a.length > var3_int; var3_int++) {
                var4 = ((koa) this).field_a[var3_int];
                ((koa) this).field_f[var3_int] = param0.a(28672, var4.field_a, var4.field_b);
            }
            ((koa) this).field_a = null;
            if (param1 != 8) {
                field_b = null;
            }
            int discarded$0 = -12;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "koa.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final lj[] c(int param0) {
        if (param0 != 1) {
            field_c = null;
        }
        return ((koa) this).field_f;
    }

    koa(int param0, int param1) {
        ((koa) this).field_e = param0;
        ((koa) this).field_f = new lj[]{};
    }

    koa(int param0, int param1, int param2, kh param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        dha[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        dha stackIn_5_2 = null;
        dha stackIn_5_3 = null;
        dha[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        dha stackIn_6_2 = null;
        dha stackIn_6_3 = null;
        dha[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        dha stackIn_7_2 = null;
        dha stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        dha[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        dha stackOut_4_2 = null;
        dha stackOut_4_3 = null;
        dha[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        dha stackOut_6_2 = null;
        dha stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        dha[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        dha stackOut_5_2 = null;
        dha stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((koa) this).field_e = param0;
            int discarded$2 = 22972;
            var5_int = param3.b((byte) 44, iia.d(param0));
            ((koa) this).field_f = new lj[var5_int];
            ((koa) this).field_a = new dha[var5_int];
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_int) {
                break L0;
              } else {
                L2: {
                  if (param2 <= 9) {
                    ((koa) this).field_a[var6] = new dha(false, param3.b((byte) 44, 8));
                    break L2;
                  } else {
                    L3: {
                      stackOut_4_0 = ((koa) this).field_a;
                      stackOut_4_1 = var6;
                      stackOut_4_2 = null;
                      stackOut_4_3 = null;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      stackIn_5_3 = stackOut_4_3;
                      if (param3.b((byte) 44, 1) != 1) {
                        stackOut_6_0 = (dha[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = null;
                        stackOut_6_3 = null;
                        stackOut_6_4 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        stackIn_7_4 = stackOut_6_4;
                        break L3;
                      } else {
                        stackOut_5_0 = (dha[]) (Object) stackIn_5_0;
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = null;
                        stackOut_5_3 = null;
                        stackOut_5_4 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_7_4 = stackOut_5_4;
                        break L3;
                      }
                    }
                    stackIn_7_0[stackIn_7_1] = new dha(stackIn_7_4 != 0, param3.b((byte) 44, 8));
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("koa.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "These trigger-happy dart totems are ready to shoot their mouths off. And yours. Best dart past them quickly.";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
