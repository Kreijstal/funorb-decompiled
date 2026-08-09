/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends k {
    private vb field_p;
    private vb field_k;
    static String field_m;
    static mh field_n;
    static jp[] field_l;
    static String field_q;
    static int[] field_o;

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_o = null;
        field_l = null;
        field_q = null;
        field_n = null;
        field_m = null;
    }

    final static void e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -77) {
          L0: {
            field_m = (String) null;
            um.field_e = false;
            if (jl.field_e.l(255) != 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          qo.field_I = stackIn_8_0 != 0;
          return;
        } else {
          L1: {
            um.field_e = false;
            if (jl.field_e.l(255) != 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          qo.field_I = stackIn_4_0 != 0;
          return;
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
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
              if (param0 == 0) {
                break L1;
              } else {
                g.b(true);
                break L1;
              }
            }
            L2: {
              var3 = this.field_k.field_A.toLowerCase();
              var4 = param1.toLowerCase();
              if (-1 <= (var3.length() ^ -1)) {
                break L2;
              } else {
                if (var4.length() <= 0) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 < var3.length() - 1) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (var4.indexOf(var6) < 0) {
                        if (var4.indexOf(var7) < 0) {
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_14_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("g.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void a(pn param0, int param1, byte param2) {
        try {
            qa.field_t.a(param0, (byte) 3);
            kp.a(param1, (byte) -99, param0);
            int var3_int = -88 % ((param2 - -37) / 48);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "g.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_p.field_A.toLowerCase();
            var4 = param1.toLowerCase();
            var5 = -62 % ((-16 - param0) / 50);
            if (-1 != (var4.length() ^ -1)) {
              var6 = var4;
              if (pp.a(var6, true)) {
                stackIn_6_0 = sc.field_a;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (ab.a(var6, 0)) {
                  stackIn_10_0 = fk.field_c;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (gp.a((byte) 65, var6)) {
                    stackIn_14_0 = eq.field_i;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (this.b(0, param1)) {
                      stackIn_18_0 = ni.field_Tb;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (var7.length() <= 0) {
                        stackIn_33_0 = l.field_k;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        if (q.a(var6, 0, var7)) {
                          stackIn_23_0 = fd.field_b;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ll.a(var6, (byte) 125, var7)) {
                            stackIn_27_0 = ij.field_f;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (ep.a(var6, (byte) 73, var7)) {
                              stackIn_31_0 = fd.field_b;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              return sc.field_a;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("g.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L1;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0;
                    } else {
                      return stackIn_33_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    g(vb param0, vb param1, vb param2) {
        super(param0);
        try {
            this.field_p = param1;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final qh a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qh stackIn_4_0 = null;
        qh stackIn_8_0 = null;
        qh stackIn_11_0 = null;
        qh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 106) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            var3 = this.field_p.field_A.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              if (!ab.a((byte) -120, var4, var3)) {
                stackIn_8_0 = lp.field_xb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.b(0, param0)) {
                  stackIn_13_0 = ae.field_c;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = lp.field_xb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = lp.field_xb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("g.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    static {
        field_m = null;
        field_q = "Members";
        field_o = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19};
    }
}
