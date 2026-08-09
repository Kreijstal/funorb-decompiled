/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends me {
    static int field_l;
    private rg field_j;
    static volatile int field_k;

    final static boolean g(int param0) {
        ba var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        ba var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ba) ((Object) wg.field_f.a((byte) -95));
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0 == -5591) {
                  break L1;
                } else {
                  field_k = -92;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var1.field_p <= var2) {
                    break L3;
                  } else {
                    L4: {
                      if (var4.field_m[var2] == null) {
                        break L4;
                      } else {
                        if (var4.field_m[var2].field_c == 0) {
                          stackIn_12_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null != var4.field_o[var2]) {
                        if (-1 != (var4.field_o[var2].field_c ^ -1)) {
                          break L5;
                        } else {
                          stackIn_17_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_20_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "cg.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    cg(rg param0, rg param1) {
        super(param0);
        try {
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        int var1 = 118 / ((68 - param0) / 37);
        pg.a(0);
    }

    final rc a(int param0, String param1) {
        wa var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rc stackIn_7_0 = null;
        rc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 95) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(41, (String) null);
                break L1;
              }
            }
            L2: {
              if (this.field_j instanceof ie) {
                var3 = ((ie) ((Object) this.field_j)).a((byte) 113);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.a(27835) == hi.field_b) {
                    break L2;
                  } else {
                    stackIn_7_0 = ec.field_d;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1.equals(this.field_j.field_k)) {
                stackIn_11_0 = ec.field_d;
                break L3;
              } else {
                stackIn_11_0 = hi.field_b;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("cg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static ci a(byte param0, int param1) {
        if (param0 != -82) {
          field_k = 79;
          return mh.a(-26159, false, true, false, 1, param1);
        } else {
          return mh.a(-26159, false, true, false, 1, param1);
        }
    }

    final String b(int param0, String param1) {
        wa var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_j instanceof ie) {
                var3 = ((ie) ((Object) this.field_j)).a((byte) 94);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a(param0 ^ -27836) != hi.field_b) {
                      break L2;
                    } else {
                      if (param1.equals(this.field_j.field_k)) {
                        break L2;
                      } else {
                        stackIn_6_0 = gl.field_C;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_8_0 = var3.c(param0 + 30524);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            if (param0 == -1) {
              if (!param1.equals(this.field_j.field_k)) {
                stackIn_15_0 = gl.field_C;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_11_0 = (String) null;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("cg.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    static {
        field_k = 0;
    }
}
