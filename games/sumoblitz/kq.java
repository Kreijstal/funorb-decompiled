/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kq extends hf implements ai {
    static ri[] field_S;
    static String field_Q;
    static String field_R;
    static ri field_T;
    static String field_O;
    private wp field_U;
    private wp field_P;

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 710) {
              break L0;
            } else {
              this.field_P = (wp) null;
              break L0;
            }
          }
          if (param2 == this.field_U) {
            bf.a(0);
            this.e(false);
            return;
          } else {
            if (this.field_P == param2) {
              this.e(false);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("kq.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kq(dg param0) {
        super(param0, 200, 130);
        pk var2 = null;
        try {
            var2 = new pk(ms.field_c, (qm) null);
            var2.field_r = 0;
            var2.field_v = 50;
            var2.field_p = 80;
            var2.field_q = this.field_q;
            var2.field_w = (mh) ((Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var2, 60);
            if (vs.b((byte) 9)) {
                this.field_U = this.a(25566, (qm) (this), pp.field_f);
            }
            this.field_P = this.a(25566, (qm) (this), jh.field_I);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(int param0) {
        File var2;
        field_S = null;
        field_Q = null;
        field_R = null;
        if (param0 != 50) {
          var2 = (File) null;
          kq.a(85, (File) null, (byte) 19);
          field_T = null;
          field_O = null;
          return;
        } else {
          field_T = null;
          field_O = null;
          return;
        }
    }

    final static byte[] a(int param0, File param1, byte param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            byte[] var4 = null;
            byte[] stackIn_3_0 = null;
            Object stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = new byte[param0];
                      var3 = var4;
                      nt.a(var4, 7039, param1, param0);
                      if (param2 > 41) {
                        break L2;
                      } else {
                        field_Q = (String) null;
                        break L2;
                      }
                    }
                    stackIn_3_0 = (byte[]) (var4);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = (IOException) (Object) decompiledCaughtException;
                  stackIn_5_0 = null;
                  return (byte[]) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("kq.V(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(boolean param0) {
        if (!this.field_D) {
            return;
        }
        this.field_D = param0 ? true : false;
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new wp(param2, param1);
            if (param0 == 25566) {
              var4.field_w = (mh) ((Object) new ue());
              var5 = -6 + this.field_p;
              this.field_p = this.field_p + 38;
              var4.a(param0 + -25442, 15, var5, 30, -14 + (this.field_q + -16));
              this.a(var4, 90);
              this.c(false);
              stackIn_4_0 = (wp) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("kq.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void l(int param0) {
        ag.b(param0 ^ param0);
    }

    final static int a(int param0, mi param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == jq.field_a) {
              stackIn_12_0 = 5890;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (fv.field_y == param1) {
                stackIn_10_0 = 34167;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (ta.field_a != param1) {
                  if (mm.field_h == param1) {
                    stackIn_8_0 = 34166;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L1: {
                      if (param0 > 59) {
                        break L1;
                      } else {
                        field_S = (ri[]) null;
                        break L1;
                      }
                    }
                    throw new IllegalArgumentException();
                  }
                } else {
                  stackIn_4_0 = 34168;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("kq.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param3 ^ -1) != -99) {
              if (param2 >= 9) {
                if ((param3 ^ -1) == -100) {
                  this.field_P.a((pk) (this), (byte) 61);
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_13_0 = super.a(param0, param1, (byte) 69, param3);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if (null == this.field_U) {
                this.field_P.a((pk) (this), (byte) 61);
                stackIn_4_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_U.a((pk) (this), (byte) 61);
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("kq.KA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    static {
        field_O = "You have 1 unread message!";
        field_R = "Player";
        field_Q = "Try again";
    }
}
