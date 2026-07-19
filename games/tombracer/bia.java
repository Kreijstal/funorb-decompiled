/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bia extends fqa {
    static u[] field_J;

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eia var5 = null;
        jma var6 = null;
        int var7 = 0;
        mfa var8 = null;
        cv var9 = null;
        fsa var10 = null;
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
            var10 = new fsa(param2, param0);
            var10.b((byte) -11, this.field_k, this.field_l);
            var10.h(3, param1 ^ param1);
            var10.a(1, (byte) -12, false);
            var10.e(false, param1 + 112);
            var10.b((byte) 17, false);
            var10.a((byte) -3, 6);
            var10.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new eia(param2, param0);
            var5.a(true, 3, (byte) -122);
            var5.a(true, 4, -81);
            var5.a(10, 1, 5, param1 + -2032);
            this.a(var5, (byte) -118);
            var6 = var5.k((byte) -101);
            var7 = 25;
            var6.a(var7, 0, 0, 0, 5, 0);
            var10.a((byte) 83, (nv) (var5));
            var8 = rm.field_a;
            var9 = (cv) ((Object) var8.a(9, 123));
            var9.b(1, (byte) -112);
            var10.a(var5, (byte) 124, var9);
            stackOut_0_0 = (fsa) (var10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("bia.AC(").append(param0).append(',').append(param1).append(',');
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

    final boolean z(int param0) {
        if (param0 != 0) {
            field_J = (u[]) null;
            return false;
        }
        return false;
    }

    bia(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return false;
    }

    final static int a(byte param0, int param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param1 < 0) {
            var2 += 16;
            param1 = param1 >>> 16;
            break L0;
          } else {
            if (65536 > param1) {
              break L0;
            } else {
              var2 += 16;
              param1 = param1 >>> 16;
              if (param0 == 93) {
                L1: {
                  if (256 > param1) {
                    break L1;
                  } else {
                    var2 += 8;
                    param1 = param1 >>> 8;
                    break L1;
                  }
                }
                L2: {
                  if ((param1 ^ -1) <= -17) {
                    var2 += 4;
                    param1 = param1 >>> 4;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-5 < (param1 ^ -1)) {
                    break L3;
                  } else {
                    param1 = param1 >>> 2;
                    var2 += 2;
                    break L3;
                  }
                }
                L4: {
                  if (-2 < (param1 ^ -1)) {
                    break L4;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L4;
                  }
                }
                return var2 - -param1;
              } else {
                L5: {
                  discarded$2 = bia.a((byte) 58, 116);
                  if (256 > param1) {
                    break L5;
                  } else {
                    var2 += 8;
                    param1 = param1 >>> 8;
                    break L5;
                  }
                }
                L6: {
                  if ((param1 ^ -1) <= -17) {
                    var2 += 4;
                    param1 = param1 >>> 4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-5 < (param1 ^ -1)) {
                    break L7;
                  } else {
                    param1 = param1 >>> 2;
                    var2 += 2;
                    break L7;
                  }
                }
                L8: {
                  if (-2 < (param1 ^ -1)) {
                    break L8;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L8;
                  }
                }
                return var2 - -param1;
              }
            }
          }
        }
        if (param0 != 93) {
          L9: {
            discarded$3 = bia.a((byte) 58, 116);
            if (256 > param1) {
              break L9;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L9;
            }
          }
          L10: {
            if ((param1 ^ -1) <= -17) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (-5 < (param1 ^ -1)) {
              break L11;
            } else {
              param1 = param1 >>> 2;
              var2 += 2;
              break L11;
            }
          }
          L12: {
            if (-2 < (param1 ^ -1)) {
              break L12;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L12;
            }
          }
          return var2 - -param1;
        } else {
          L13: {
            if (256 > param1) {
              break L13;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L13;
            }
          }
          L14: {
            if ((param1 ^ -1) <= -17) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (-5 < (param1 ^ -1)) {
              break L15;
            } else {
              param1 = param1 >>> 2;
              var2 += 2;
              break L15;
            }
          }
          L16: {
            if (-2 < (param1 ^ -1)) {
              break L16;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L16;
            }
          }
          return var2 - -param1;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bia.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int t(int param0) {
        fsa discarded$0 = null;
        if (param0 != 8) {
            la var3 = (la) null;
            discarded$0 = this.a(false, -105, (la) null);
            return 7;
        }
        return 7;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    public static void C(int param0) {
        field_J = null;
        if (param0 != 4194304) {
            field_J = (u[]) null;
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            field_J = (u[]) null;
            return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-117, 4194304, 4194304);
    }

    bia(la param0, int param1) {
        super(param0, param1);
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return -38;
        }
        return 3;
    }

    static {
    }
}
