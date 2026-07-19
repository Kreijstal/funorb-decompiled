/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj extends ug {
    private boolean field_nb;
    private String field_mb;
    static String field_hb;
    private boolean field_jb;
    private String field_ib;
    static int[] field_lb;
    private ib field_kb;

    public static void h(byte param0) {
        in discarded$0 = null;
        field_lb = null;
        if (param0 >= -64) {
            discarded$0 = jj.a((byte) -108, true);
            field_hb = null;
            return;
        }
        field_hb = null;
    }

    jj(sh param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_ib = param1;
            if (this.field_ib != null) {
                var3_int = fd.field_k.b(this.field_ib, 260, fd.field_k.field_C);
                this.a(-68, var3_int + 150, 300);
            }
            this.field_kb = new ib(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb.field_N = true;
            this.field_jb = false;
            this.field_nb = false;
            this.b(this.field_kb, 10);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static in a(byte param0, boolean param1) {
        int var2 = -100 / ((param0 - 80) / 42);
        in var3 = new in(true);
        var3.field_i = param1 ? true : false;
        return var3;
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -57) {
                break L1;
              } else {
                field_lb = (int[]) null;
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = this.field_nb;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param1) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
              L3: {
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!param1) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L3;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L3;
                }
              }
              L4: {
                ((jj) (this)).field_nb = stackIn_10_1 != 0;
                if (this.field_nb) {
                  this.field_kb.a(8405024, false, 4210752);
                  this.field_kb.field_N = true;
                  break L4;
                } else {
                  this.field_kb.a(2113632, false, 4210752);
                  if (!this.field_jb) {
                    break L4;
                  } else {
                    this.field_kb.field_N = false;
                    break L4;
                  }
                }
              }
              this.field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
              this.field_mb = param3;
              break L0;
            } else {
              this.field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
              this.field_mb = param3;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("jj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2 = 0;
            int var3_int = 0;
            IOException var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            if (e.field_c.field_n < param0) {
              if (null != kl.field_G) {
                var2 = -103 % ((param1 - -39) / 37);
                try {
                  L0: {
                    var3_int = kl.field_G.c((byte) -79);
                    if (0 < var3_int) {
                      L1: {
                        if (-e.field_c.field_n + param0 >= var3_int) {
                          break L1;
                        } else {
                          var3_int = param0 + -e.field_c.field_n;
                          break L1;
                        }
                      }
                      kl.field_G.a(e.field_c.field_m, -77, var3_int, e.field_c.field_n);
                      m.field_b = ri.a(-3);
                      e.field_c.field_n = e.field_c.field_n + var3_int;
                      if (param0 > e.field_c.field_n) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        e.field_c.field_n = 0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      if (0 > var3_int) {
                        dc.d(125);
                        return false;
                      } else {
                        if ((la.h(118) ^ -1L) >= -30001L) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          dc.d(125);
                          return false;
                        }
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (IOException) (Object) decompiledCaughtException;
                  dc.d(111);
                  return false;
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, byte param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        super.b(param0, (byte) -112, param2);
        fd.field_k.b(this.field_mb, param0 - -(this.field_F >> 252509569), param2 - -103, 16777215, -1);
        if (param1 >= -58) {
          L0: {
            this.field_ib = (String) null;
            if (this.field_ib != null) {
              fn.b(20 + param0, param2 - -120 + -7, 260, 8421504);
              discarded$2 = fd.field_k.a(this.field_ib, param0 - -20, param2 - -128, 260, 100, 16777215, -1, 1, 0, fd.field_k.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_ib != null) {
              fn.b(20 + param0, param2 - -120 + -7, 260, 8421504);
              discarded$3 = fd.field_k.a(this.field_ib, param0 - -20, param2 - -128, 260, 100, 16777215, -1, 1, 0, fd.field_k.field_C);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void i(byte param0) {
        int var2 = -38 % ((67 - param0) / 57);
        this.field_kb.field_N = false;
        this.field_jb = true;
    }

    static {
        field_hb = "Passwords must be between 5 and 20 letters and numbers";
    }
}
