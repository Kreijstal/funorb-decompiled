/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fe {
    static int field_d;
    static rh field_a;
    static int field_k;
    private static ck field_h;
    static rf field_e;
    static na field_j;
    static int field_f;
    private java.util.zip.Inflater field_i;
    static boolean field_b;
    static int field_g;
    static float field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 122 % ((param0 - -22) / 63);
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final void a(int param0, qc param1, byte[] param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param1.field_j[param1.field_f] != 31) {
                    break L1;
                  } else {
                    if (-117 != param1.field_j[1 + param1.field_f]) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_i != null) {
                          break L2;
                        } else {
                          this.field_i = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          L4: {
                            this.field_i.setInput(param1.field_j, param1.field_f - -10, param1.field_j.length - 8 - (param1.field_f + 10));
                            if (param0 == -1) {
                              break L4;
                            } else {
                              fe.a(76);
                              break L4;
                            }
                          }
                          this.field_i.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_i.reset();
                        throw new RuntimeException("");
                      }
                      this.field_i.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("fe.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0) {
        if (param0 <= 103) {
            return 4;
        }
        return qe.field_a;
    }

    final static ck[] a(int param0) {
        if (param0 != -1) {
          field_c = -1.1302366256713867f;
          return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        } else {
          return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        }
    }

    public fe() {
        this(-1, 1000000, 1000000);
    }

    final static nd a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        nd var7 = null;
        int var8 = 0;
        nd stackIn_3_0 = null;
        nd stackIn_6_0 = null;
        nd stackIn_10_0 = null;
        nd stackIn_13_0 = null;
        nd stackIn_19_0 = null;
        nd stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            if (!param1) {
              var2_int = param0.length();
              if (-1 != (var2_int ^ -1)) {
                if (255 < var2_int) {
                  stackIn_10_0 = hk.field_x;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3 = uj.a('.', true, param0);
                  if ((var3.length ^ -1) <= -3) {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      if (var4.length <= var5) {
                        stackIn_22_0 = mj.a(var3[-1 + var3.length], (byte) -97);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = jk.a(255, var6);
                        if (var7 != null) {
                          stackIn_19_0 = (nd) (var7);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    stackIn_13_0 = pj.field_f;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = pj.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (nd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("fe.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  return stackIn_22_0;
                }
              }
            }
          }
        }
    }

    private fe(int param0, int param1, int param2) {
    }

    static {
        field_d = -1;
        field_f = 7;
        field_h = new ck(15, 0, 1, 0);
    }
}
