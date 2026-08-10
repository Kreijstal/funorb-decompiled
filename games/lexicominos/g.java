/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends tj {
    private rl field_l;
    static int field_n;
    static wg field_m;
    static int field_o;

    final sc a(int param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        sc stackIn_2_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (!(this.field_l instanceof nd)) {
                  break L1;
                } else {
                  var3 = ((nd) ((Object) this.field_l)).a((byte) -106);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.b((byte) 124) != rh.field_p) {
                      stackIn_8_0 = ni.field_b;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (!param1.equals(this.field_l.field_u)) {
                  stackIn_12_0 = ni.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = rh.field_p;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (sc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("g.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 != -17779) {
            g.f(98);
        }
    }

    final static boolean f(int param0) {
        if (param0 != 256) {
            field_m = (wg) null;
        }
        return gf.a(0, kk.c(param0 ^ -14303));
    }

    final String a(byte param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_l instanceof nd)) {
                break L1;
              } else {
                var3 = ((nd) ((Object) this.field_l)).a((byte) 125);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b((byte) 122) != rh.field_p) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_l.field_u)) {
                        stackIn_6_0 = re.field_cb;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_8_0 = var3.a((byte) 82);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (param0 == -126) {
                break L3;
              } else {
                var4 = (String) null;
                this.a(-64, (String) null);
                break L3;
              }
            }
            if (!param1.equals(this.field_l.field_u)) {
              stackIn_14_0 = re.field_cb;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("g.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        cc[] var2 = null;
        cc var2_ref = null;
        int var3 = 0;
        cc var4 = null;
        int var5 = 0;
        cc[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            oc.field_e = param0;
            var6 = th.field_o;
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.length) {
                L2: {
                  if (param1 > 49) {
                    break L2;
                  } else {
                    field_m = (wg) null;
                    break L2;
                  }
                }
                L3: {
                  var2_ref = th.field_o[9];
                  if (!var2_ref.a(false)) {
                    var2_ref.c(0);
                    wj.field_j.a(var2_ref);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = var6[var3];
                  var2_ref = var4;
                  var2_ref = var4;
                  if (var4 == null) {
                    break L4;
                  } else {
                    var4.f(param0 * 128 / 256);
                    break L4;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref2), "g.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        sj var4 = null;
        nc var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = (nc) ((Object) ok.field_b.a(true));
              if (param1 < -38) {
                break L1;
              } else {
                field_m = (wg) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5 == null) {
                var4 = (sj) ((Object) il.field_b.a(true));
                L3: while (true) {
                  if (var4 == null) {
                    break L0;
                  } else {
                    uh.a(var4, (byte) -123, param0);
                    var4 = (sj) ((Object) il.field_b.f(2));
                    continue L3;
                  }
                }
              } else {
                ga.a(var5, param0, 74);
                var5 = (nc) ((Object) ok.field_b.f(2));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "g.K(" + param0 + ',' + param1 + ')');
        }
    }

    g(rl param0, rl param1) {
        super(param0);
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 5;
    }
}
