/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    private on field_a;
    int field_b;

    final static int b(int param0, int param1, int param2) {
        wb discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = hh.field_f;
              if (param1 == 1882601153) {
                break L1;
              } else {
                discarded$2 = wg.a(78, -126, 77);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (bf.field_c.length <= var3_int) {
                  stackOut_13_0 = -1;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  var5 = eb.field_a[var3_int];
                  stackOut_4_0 = var5;
                  stackIn_14_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_5_0 < 0) {
                          break L5;
                        } else {
                          var6 = gt.a((byte) -59, bf.field_c[var3_int], true);
                          var7 = oj.field_a - (var6 >> 1882601153);
                          var4 = var4 + qc.field_a;
                          if (oc.a(var4, (byte) 122, param2, var7 + -dw.field_b, ga.field_h + (ag.field_b << 1607587585), param0, (dw.field_b << 597440705) + var6)) {
                            stackOut_8_0 = var5;
                            stackIn_9_0 = stackOut_8_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var4 = var4 + (qc.field_a + (ag.field_b << -1942197855) - -ga.field_h);
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var4 = var4 + fn.field_t;
                      break L4;
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "wg.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 >= -113) {
          return 84;
        } else {
          L0: {
            if ((param1 ^ -1) <= -1) {
              break L0;
            } else {
              param1 = -param1;
              break L0;
            }
          }
          L1: {
            var2 = 0;
            if (-65536 <= (param1 ^ -1)) {
              break L1;
            } else {
              var2 = var2 | 16;
              param1 = param1 >>> 16;
              break L1;
            }
          }
          L2: {
            if ((param1 ^ -1) >= -256) {
              break L2;
            } else {
              var2 = var2 | 8;
              param1 = param1 >>> 8;
              break L2;
            }
          }
          L3: {
            if (-16 > (param1 ^ -1)) {
              var2 = var2 | 4;
              param1 = param1 >>> 4;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (3 < param1) {
              param1 = param1 >>> 2;
              var2 = var2 | 2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param1 <= 1) {
              break L5;
            } else {
              param1 = param1 >>> 1;
              var2 = var2 | 1;
              break L5;
            }
          }
          return var2;
        }
    }

    protected final void finalize() throws Throwable {
        this.field_a.a(this.field_b, (byte) -96);
        super.finalize();
    }

    wg(on param0, int param1, int param2) {
        try {
            this.field_b = param2;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static wb a(int param0, int param1, int param2) {
        wb var3 = null;
        int var4 = 0;
        int var5 = 0;
        wb var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var6 = new wb(param0, param0);
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (var3.field_C.length <= var4) {
            if (param2 == 3) {
              return var3;
            } else {
              return (wb) null;
            }
          } else {
            var6.field_C[var4] = param1;
            var4++;
            if (var5 == 0) {
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    static {
    }
}
