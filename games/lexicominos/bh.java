/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends nl {
    private java.nio.ByteBuffer field_d;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        cg var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -95 % ((25 - param0) / 50);
            var3 = (cg) ((Object) ca.field_n.a(true));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                Lexicominos.a(-17800, var3, param1);
                var3 = (cg) ((Object) ca.field_n.f(2));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "bh.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            CharSequence var3 = (CharSequence) null;
            bh.a(true, (CharSequence) null, -76);
        }
        tg.a(param1, true, 114);
    }

    final void a(byte[] param0, boolean param1) {
        try {
            if (!param1) {
                this.field_d = (java.nio.ByteBuffer) null;
            }
            this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_d.position(0);
            this.field_d.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            nl.a(param1, 0, true, -123, rb.field_a, r.field_D, pf.field_o);
            if (param0 == 83) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= pf.field_o) {
                  L2: {
                    nl.a(param1 + param1, param1, false, -93, l.field_G, ve.field_d, pf.field_o - -param1);
                    if (param1 < pf.field_o) {
                      pf.field_o = param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ff.field_a[var2_int - -param1] = var2_int;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "bh.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 <= -68) {
              if (!bb.a(param1, param0, -1)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = 0;
                L1: while (true) {
                  if (param1.length() <= var3_int) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!ee.a(-125, param1.charAt(var3_int))) {
                      stackIn_13_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("bh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final byte[] a(byte param0) {
        byte[] var3 = new byte[this.field_d.capacity()];
        byte[] var2 = var3;
        if (param0 != -121) {
            return (byte[]) null;
        }
        this.field_d.position(0);
        this.field_d.get(var3);
        return var3;
    }

    bh() {
    }

    static {
    }
}
