/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp implements Runnable {
    volatile du[] field_c;
    volatile boolean field_b;
    static String field_f;
    static String[] field_e;
    wi field_g;
    volatile boolean field_a;
    static gm field_d;
    static int field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 - -param1;
              var6 = param0 + param4;
              if (lk.field_k < param3) {
                stackOut_3_0 = param3;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = lk.field_k;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (lk.field_i >= param0) {
                stackOut_6_0 = lk.field_i;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= lk.field_j) {
                stackOut_9_0 = lk.field_j;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (lk.field_e <= var6) {
                stackOut_12_0 = lk.field_e;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (lk.field_k > param3) {
                break L5;
              } else {
                if (lk.field_j > param3) {
                  var11 = param3 + var8 * lk.field_b;
                  var12 = 1 - -var10 + -var8 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 = var11 + lk.field_b * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (param2 == -13181) {
                break L7;
              } else {
                pp.a(5, 111, 100, -88, -57);
                break L7;
              }
            }
            L8: {
              if (lk.field_i > param0) {
                break L8;
              } else {
                if (var6 < lk.field_e) {
                  var11 = param0 * lk.field_b - -var7;
                  var12 = -var7 + (1 + var9) >> 1;
                  L9: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L8;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (lk.field_k > var5_int) {
                break L10;
              } else {
                if (var5_int >= lk.field_j) {
                  break L10;
                } else {
                  var11 = var5_int + lk.field_b * ((1 & var5_int + -param3) + var8);
                  var12 = var10 + 1 + -var8 >> 1;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 = var11 + 2 * lk.field_b;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (lk.field_i > param0) {
                break L12;
              } else {
                if (lk.field_e <= var6) {
                  break L12;
                } else {
                  var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                  var12 = -var7 + (1 - -var9) >> 1;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var5, "pp.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2) {
            pp.a(-25);
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        du var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        ((pp) this).field_b = true;
        try {
          L0: while (true) {
            if (((pp) this).field_a) {
              ((pp) this).field_b = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  tg.a(10L, (byte) 107);
                  rd.a((Object) null, ((pp) this).field_g, -11030);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((pp) this).field_c[var1_int];
                    if (var2 != null) {
                      var2.b();
                      var1_int++;
                      break L2;
                    } else {
                      var1_int++;
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
          var5 = null;
          ms.a((String) null, (Throwable) (Object) var1, 0);
          ((pp) this).field_b = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((pp) this).field_b = false;
          throw pp.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    pp() {
        ((pp) this).field_c = new du[2];
        ((pp) this).field_a = false;
        ((pp) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Accelerator pad", "Ice pad", "Teleporter pad", "Pinball bouncer", "Attractor", "Repeller", "Spike pad", "Landmine"};
        field_f = "Members";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
