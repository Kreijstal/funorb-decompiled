/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vm {
    static int field_l;
    private qn field_m;
    private qn field_n;

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -9316) {
              var6 = this.field_n.field_v.toLowerCase();
              var4 = param0.toLowerCase();
              if (-1 != (var4.length() ^ -1)) {
                var5 = var4;
                if (!gl.a(0, var5)) {
                  if (ah.a(var5, (byte) -29)) {
                    stackIn_12_0 = q.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (pd.a(var5, (byte) 90)) {
                      stackIn_16_0 = de.field_b;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (this.b((byte) -108, param0)) {
                        stackIn_20_0 = ek.field_e;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (0 < var6.length()) {
                          if (ml.a(var6, var5, 0)) {
                            stackIn_27_0 = ab.field_t;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (!ma.a(var6, param1 ^ -9279, var5)) {
                              if (oc.a(var5, -125, var6)) {
                                stackIn_34_0 = ab.field_t;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                return kg.field_T;
                              }
                            } else {
                              stackIn_30_0 = bi.field_e;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_23_0 = ao.field_f;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_8_0 = kg.field_T;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("je.D(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L1;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0;
                      } else {
                        return stackIn_34_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static hl d(boolean param0) {
        if (param0) {
          L0: {
            je.d(false);
            if (ic.field_e == null) {
              ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
              break L0;
            } else {
              break L0;
            }
          }
          return ic.field_e;
        } else {
          L1: {
            if (ic.field_e == null) {
              ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
              break L1;
            } else {
              break L1;
            }
          }
          return ic.field_e;
        }
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -22) {
              L1: {
                var3 = this.field_m.field_v.toLowerCase();
                var4 = param1.toLowerCase();
                if ((var3.length() ^ -1) >= -1) {
                  break L1;
                } else {
                  if ((var4.length() ^ -1) >= -1) {
                    break L1;
                  } else {
                    var5 = var3.lastIndexOf("@");
                    if (0 > var5) {
                      break L1;
                    } else {
                      if (var5 < var3.length() - 1) {
                        var6 = var3.substring(0, var5);
                        var7 = var3.substring(var5 - -1);
                        if ((var4.indexOf(var6) ^ -1) <= -1) {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L2: {
                            if (var4.indexOf(var7) >= 0) {
                              stackIn_15_0 = 1;
                              break L2;
                            } else {
                              stackIn_15_0 = 0;
                              break L2;
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_17_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("je.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final mk a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        mk stackIn_3_0 = null;
        mk stackIn_7_0 = null;
        mk stackIn_10_0 = null;
        mk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_n.field_v.toLowerCase();
            var5 = -15 % ((-49 - param0) / 62);
            var4 = param1.toLowerCase();
            if (-1 == (var4.length() ^ -1)) {
              stackIn_3_0 = qk.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!g.a(83, var3, var4)) {
                stackIn_7_0 = qk.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.b((byte) -94, param1)) {
                  stackIn_12_0 = oa.field_a;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = qk.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("je.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static boolean h(int param0) {
        if (param0 == 30065) {
          if ((il.field_a ^ -1) <= -21) {
            if (vd.p(-101)) {
              if (-1 > (gm.field_d ^ -1)) {
                if (tb.a((byte) 61)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    je(qn param0, qn param1, qn param2) {
        super(param0);
        try {
            this.field_n = param1;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0;
    }
}
