/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends di {
    private lb field_o;
    static k field_n;
    static boolean[] field_m;

    final ud a(int param0, String param1) {
        eh var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ud stackIn_6_0 = null;
        ud stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_o instanceof wk) {
                var3 = ((wk) ((Object) this.field_o)).a((byte) -109);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a((byte) -120) != TrackController.field_G) {
                    stackIn_6_0 = ef.field_b;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -106) {
                break L2;
              } else {
                var4 = (String) null;
                this.a(124, (String) null);
                break L2;
              }
            }
            L3: {
              if (!param1.equals(this.field_o.field_s)) {
                stackIn_12_0 = ef.field_b;
                break L3;
              } else {
                stackIn_12_0 = TrackController.field_G;
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
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ni.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_12_0;
        }
    }

    final String a(String param0, int param1) {
        eh var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_o instanceof wk) {
                var3 = ((wk) ((Object) this.field_o)).a((byte) -100);
                if (var3 != null) {
                  L2: {
                    if (var3.a((byte) 107) != TrackController.field_G) {
                      break L2;
                    } else {
                      if (!param0.equals(this.field_o.field_s)) {
                        stackIn_8_0 = rb.field_c;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_10_0 = var3.c(15914);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 == 426) {
                break L3;
              } else {
                this.field_o = (lb) null;
                break L3;
              }
            }
            if (!param0.equals(this.field_o.field_s)) {
              stackIn_16_0 = rb.field_c;
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
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ni.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    ni(lb param0, lb param1) {
        super(param0);
        try {
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_m = null;
        if (param0 != 112) {
            field_m = (boolean[]) null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            try {
              L0: {
                L1: {
                  if (param0 <= -115) {
                    break L1;
                  } else {
                    field_m = (boolean[]) null;
                    break L1;
                  }
                }
                sj.a(gd.b((byte) 77), new Object[]{new Integer(param1)}, 7648, "resizing");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = new boolean[112];
    }
}
