/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends kd {
    static int field_h;
    static java.math.BigInteger field_d;
    private String field_e;
    private String field_c;
    static int field_g;
    static int field_f;

    final static java.awt.Frame a(uf param0, int param1, int param2, int param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ji[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ji[] var10 = null;
        ce var11 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.b(-4)) {
              L1: {
                if (param1 != 0) {
                  break L1;
                } else {
                  var10 = rf.a(param0, false);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_25_0 = null;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (var10[var8].field_f == param5) {
                          if (var10[var8].field_c == param4) {
                            L3: {
                              if (-1 == (param2 ^ -1)) {
                                break L3;
                              } else {
                                if (param2 == var10[var8].field_g) {
                                  break L3;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            L4: {
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param1 < var10[var8].field_b) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var7_int = 1;
                              param1 = var10[var8].field_b;
                              break L4;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L6: {
                var11 = param0.a(86, param1, param2, param5, param4);
                if (param3 > 85) {
                  break L6;
                } else {
                  sc.a(-111);
                  break L6;
                }
              }
              L7: while (true) {
                if (-1 != (var11.field_f ^ -1)) {
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    if (-3 == (var11.field_f ^ -1)) {
                      sg.a(var7, (byte) -105, param0);
                      stackIn_36_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  wl.a(10L, false);
                  continue L7;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("sc.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_25_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_32_0);
              } else {
                return (java.awt.Frame) ((Object) stackIn_36_0);
              }
            }
          }
        }
    }

    final void a(byte param0, be param1) {
        try {
            if (param0 != -6) {
                field_g = 54;
            }
            param1.b(this.field_c, param0 + 132);
            param1.a(this.field_e, 27933);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "sc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 255) {
            field_d = (java.math.BigInteger) null;
        }
        field_d = null;
    }

    final static int a(int param0, int param1) {
        param0 = (param0 & 1431655765) + ((param0 & -1431655765) >>> -608814431);
        param0 = (858993459 & param0) - -(param0 >>> -1887489278 & 858993459);
        param0 = (param0 >>> -1395663420) + param0 & 252645135;
        if (param1 != -1) {
            sc.a(-83);
        }
        param0 = param0 + (param0 >>> -43772216);
        param0 = param0 + (param0 >>> -1525667952);
        return param0 & 255;
    }

    final nh a(boolean param0) {
        if (param0) {
            return (nh) null;
        }
        return nd.field_M;
    }

    sc(String param0, String param1) {
        try {
            this.field_e = param1;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 0;
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
