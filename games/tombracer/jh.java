/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ge {
    static String field_J;
    static String field_K;

    jh(la param0, int param1) {
        super(param0, param1);
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            this.C(-60);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_J = (String) null;
            return false;
        }
        return false;
    }

    jh(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(int param0, String param1, il param2, kha param3, int param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            if (param0 == 2097152) {
              L1: while (true) {
                if (var7 >= param1.length()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = param1.charAt(var7);
                    if (var8 == 60) {
                      var6 = param3.field_c[0] + (var5_int >> 635819176) + param2.b(param1.substring(0, var7));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 != var6) {
                      param3.field_c[var7] = var6;
                      break L3;
                    } else {
                      L4: {
                        if (var8 != 32) {
                          break L4;
                        } else {
                          var5_int = var5_int + param4;
                          break L4;
                        }
                      }
                      param3.field_c[var7] = (var5_int >> 2026704424) + param3.field_c[0] - (-param2.b(param1.substring(0, 1 + var7)) + param2.a((char) var8));
                      break L3;
                    }
                  }
                  L5: {
                    if (var8 == 62) {
                      var6 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7++;
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
          L6: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("jh.VB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_K = (String) null;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            this.q((byte) 50);
        }
        return 7;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            return true;
        }
        return true;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            this.q((byte) -44);
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ska var5 = null;
        roa var6 = null;
        mfa var7 = null;
        boa var8 = null;
        fsa var9 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, this.field_k, this.field_l);
            var9.h(param1, 0);
            var9.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new ska(param2, param0);
            var6 = ci.a(2, param1 ^ -4);
            var6.a(-43, true);
            var5.a(var6, (byte) 73);
            this.a((byte) 43, var5, param2);
            var9.a((byte) 83, (nv) (var5));
            var7 = rm.field_a;
            var8 = (boa) ((Object) var7.a(7, 100));
            var8.b(param1 + 111, 11);
            var9.a(var5, (byte) 124, var8);
            this.a(var9, 0, var5, 16777130);
            stackIn_1_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("jh.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void D(int param0) {
        field_J = null;
        if (param0 > -89) {
            jh.D(10);
        }
        field_K = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            this.n((byte) 40);
            return true;
        }
        return true;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jh.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-76, 2097152, 2097152);
    }

    static {
        field_K = "The '<%0>' setting needs to be changed.";
        field_J = "GO!";
    }
}
