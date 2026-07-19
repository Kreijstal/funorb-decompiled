/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends fqa {
    static int[][] field_K;
    static String field_J;

    public static void s(byte param0) {
        field_J = null;
        field_K = (int[][]) null;
        if (param0 != 25) {
            field_K = (int[][]) null;
        }
    }

    final static void b(int param0, int param1) {
        qua var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null != fna.field_j) {
              L1: {
                var2 = fna.field_j[param1];
                if (var2 != null) {
                  break L1;
                } else {
                  paa.a(false, param1);
                  var2 = fna.field_j[param1];
                  break L1;
                }
              }
              L2: {
                L3: {
                  var3 = 32;
                  if ((param1 ^ -1) == -3) {
                    break L3;
                  } else {
                    if (-4 == (param1 ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = var3 << 2;
                break L2;
              }
              im.a(9, true, var2, var3);
              if (param0 == 1) {
                var4 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (16 <= var4) {
                        break L6;
                      } else {
                        v.b(var4, 0);
                        var4++;
                        if (var5 != 0) {
                          break L5;
                        } else {
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if ((param1 ^ -1) == -2) {
                      aoa.a(112, 1);
                      aoa.a(45, 2);
                      aoa.a(param0 ^ 61, 3);
                      aoa.a(61, 4);
                      aoa.a(59, 5);
                      aoa.a(125, 6);
                      aoa.a(param0 ^ 57, 7);
                      aoa.a(122, 8);
                      aoa.a(param0 ^ 125, 13);
                      aoa.a(84, 14);
                      break L5;
                    } else {
                      return;
                    }
                  }
                  aoa.a(105, 15);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "er.TB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_J = (String) null;
            return false;
        }
        return false;
    }

    er(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        wh var5 = null;
        mfa var6 = null;
        boa var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, this.field_k, this.field_l);
            var4.h(param1, 0);
            var4.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new wh(param2, param0);
            var5.a((byte) -8, new mg(new int[]{}));
            var5.b(0, 636);
            this.a(var5, (byte) -107);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (boa) ((Object) var6.a(7, 82));
            var7.b(119, 16);
            var4.a(var5, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("er.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-77, 2097152, 2097152);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_K = (int[][]) null;
            return false;
        }
        return false;
    }

    er(la param0, int param1) {
        super(param0, param1);
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_K = (int[][]) null;
            return 7;
        }
        return 7;
    }

    final static boolean c(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 52) {
          L0: {
            field_K = (int[][]) null;
            if (-1 == (param0 & 52 ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param0 & 52 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            if (param0) {
                kh var4 = (kh) null;
                this.a(false, (kh) null);
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "er.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return true;
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return 59;
        }
        return 3;
    }

    final boolean s(int param0) {
        int discarded$0 = 0;
        if (param0 != -15254) {
            discarded$0 = this.B(-5);
            return false;
        }
        return false;
    }

    static {
        field_J = "Moveable blocks";
    }
}
