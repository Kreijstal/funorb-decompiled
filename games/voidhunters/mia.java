/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mia implements Runnable {
    volatile boolean field_c;
    static boolean[] field_a;
    volatile vka[] field_b;
    eab field_d;
    volatile boolean field_e;

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_a = null;
        if (param0 != -11954) {
            discarded$0 = mia.a('', false);
        }
    }

    final static void a(int param0, int param1, int param2) {
        faa var4 = null;
        mm var6 = null;
        mm var7 = null;
        if (param1 == paa.field_q) {
          if (param2 < 42) {
            field_a = (boolean[]) null;
            return;
          } else {
            return;
          }
        } else {
          var6 = (mm) ((Object) ks.field_r.a(-1, (long)paa.field_q));
          var7 = var6;
          if (var7 == null) {
            paa.field_q = param1;
            var4 = dpa.field_p;
            var4.h(24335, param0);
            var4.c(0, 3);
            var4.c(0, 11);
            var4.a(param1, true);
            if (param2 >= 42) {
              return;
            } else {
              field_a = (boolean[]) null;
              return;
            }
          } else {
            var7.field_Ib = null;
            paa.field_q = param1;
            var4 = dpa.field_p;
            var4.h(24335, param0);
            var4.c(0, 3);
            var4.c(0, 11);
            var4.a(param1, true);
            if (param2 >= 42) {
              return;
            } else {
              field_a = (boolean[]) null;
              return;
            }
          }
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        vka var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        this.field_c = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_e) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        gdb.b(-106, 10L);
                        var5 = (Object) null;
                        ts.a((byte) 97, this.field_d, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_b[var1_int];
                          if (var2 == null) {
                            break L4;
                          } else {
                            var2.h();
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
              var6 = (String) null;
              gna.a((Throwable) ((Object) var1), (String) null, 0);
              this.field_c = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_c = false;
          throw mia.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_c = false;
    }

    final static boolean a(char param0, boolean param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param1) {
              L1: {
                if (param0 <= 0) {
                  break L1;
                } else {
                  if (param0 < 128) {
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param0 < 160) {
                  break L2;
                } else {
                  if (param0 > 255) {
                    break L2;
                  } else {
                    return true;
                  }
                }
              }
              L3: {
                if (param0 != 0) {
                  var6 = tu.field_c;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var6.length <= var3) {
                      break L3;
                    } else {
                      var4 = var6[var3];
                      if (var4 == param0) {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "mia.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    mia() {
        this.field_b = new vka[2];
        this.field_e = false;
        this.field_c = false;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
