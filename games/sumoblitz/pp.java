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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 - -param1;
              var6 = param0 + param4;
              if (lk.field_k < param3) {
                stackIn_4_0 = param3;
                break L1;
              } else {
                stackIn_4_0 = lk.field_k;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (lk.field_i >= param0) {
                stackIn_7_0 = lk.field_i;
                break L2;
              } else {
                stackIn_7_0 = param0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= lk.field_j) {
                stackIn_10_0 = lk.field_j;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (lk.field_e <= var6) {
                stackIn_13_0 = lk.field_e;
                break L4;
              } else {
                stackIn_13_0 = var6;
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
                  var12 = 1 - -var10 + -var8 >> -2219903;
                  L6: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
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
                  var12 = -var7 + (1 + var9) >> 220154369;
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
                  var12 = var10 + 1 + -var8 >> -1169820063;
                  L11: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
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
                  var12 = -var7 + (1 - -var9) >> 883457121;
                  L13: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
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
          throw qo.a((Throwable) ((Object) var5), "pp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        du var2 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_b = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_a) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        tg.a(10L, (byte) 107);
                        rd.a((Object) null, this.field_g, -11030);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_c[var1_int];
                          if (var2 != null) {
                            var2.b();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var5 = (String) null;
              ms.a((String) null, (Throwable) ((Object) var1), 0);
              this.field_b = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw pp.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_b = false;
    }

    pp() {
        this.field_c = new du[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_e = new String[]{"Accelerator pad", "Ice pad", "Teleporter pad", "Pinball bouncer", "Attractor", "Repeller", "Spike pad", "Landmine"};
        field_f = "Members";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
