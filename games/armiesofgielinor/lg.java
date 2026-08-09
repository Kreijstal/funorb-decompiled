/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lg {
    private java.util.zip.Inflater field_a;
    static int[][] field_b;
    static me field_e;
    static String field_c;
    static int field_d;

    final static void a(int param0, kl param1) {
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            if (param0 != 32381) {
                String var5 = (String) null;
                lg.a((String) null, (byte) 32);
            }
            var2 = new wk(param1.a("", 49, "final_frame.jpg"), (java.awt.Component) ((Object) si.field_b));
            var3 = var2.field_y;
            var4 = var2.field_v;
            rq.a((byte) -56);
            wd.field_k = new wk(var3, 3 * var4 / 4);
            wd.field_k.b();
            var2.f(0, 0);
            vt.field_k = new wk(var3, var4 + -wd.field_k.field_v);
            vt.field_k.b();
            var2.f(0, -wd.field_k.field_v);
            vt.field_k.field_z = wd.field_k.field_v;
            rf.b(-18862);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public lg() {
        this(-1, 1000000, 1000000);
    }

    final static hl a(String param0, byte param1) {
        String var2 = null;
        hl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        hl stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (nh.field_K != null) {
              if (param0 != null) {
                if (0 != param0.length()) {
                  L1: {
                    var6 = (CharSequence) ((Object) param0);
                    var2 = k.a(var6, false);
                    if (param1 == -34) {
                      break L1;
                    } else {
                      lg.a((byte) 5);
                      break L1;
                    }
                  }
                  if (var2 != null) {
                    var3 = (hl) ((Object) nh.field_K.a((byte) -27, (long)var2.hashCode()));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Mb);
                        var4 = k.a(var7, false);
                        if (var4.equals(var2)) {
                          stackIn_19_0 = (hl) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (hl) ((Object) nh.field_K.d(-348));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  stackIn_7_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("lg.D(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl) ((Object) stackIn_7_0);
        } else {
          return stackIn_19_0;
        }
    }

    private lg(int param0, int param1, int param2) {
    }

    final void a(byte param0, vh param1, byte[] param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (-32 != (param1.field_o[param1.field_q] ^ -1)) {
                    break L1;
                  } else {
                    if (-117 == param1.field_o[param1.field_q + 1]) {
                      L2: {
                        if (null != this.field_a) {
                          break L2;
                        } else {
                          this.field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_a.setInput(param1.field_o, param1.field_q + 10, param1.field_o.length + (-10 + -param1.field_q + -8));
                          this.field_a.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_a.reset();
                        throw new RuntimeException("");
                      }
                      this.field_a.reset();
                      if (param0 == -71) {
                        break L0;
                      } else {
                        this.field_a = (java.util.zip.Inflater) null;
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var4);

                stackIn_14_1 = new StringBuilder().append("lg.C(").append(param0).append(',');

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
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param2 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -40) {
              if (param1) {
                stackIn_7_0 = ir.field_h.a(param0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = sc.field_b.a(param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -71;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lg.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(byte param0) {
        String var2;
        field_e = null;
        field_b = (int[][]) null;
        if (param0 < 78) {
          var2 = (String) null;
          lg.a((String) null, (byte) 37);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        field_e = new me(9, 0, 4, 1);
        field_c = "Skip battles: ";
    }
}
