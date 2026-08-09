/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class joa {
    static int field_a;
    static kn field_c;
    static jea field_d;
    private java.util.zip.Inflater field_b;

    final static qla a(String param0, cn param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        qla stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 52 % ((param3 - 12) / 56);
            var5 = param1.a(param2, (byte) 126, param0);
            if (var5 != null) {
              stackIn_4_0 = new qla(var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("joa.A(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qla) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public joa() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte param0, byte[] param1, uia param2) {
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
                  if (-32 != (param2.field_g[param2.field_h] ^ -1)) {
                    break L1;
                  } else {
                    if (-117 != param2.field_g[1 + param2.field_h]) {
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_b) {
                          break L2;
                        } else {
                          this.field_b = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_b.setInput(param2.field_g, param2.field_h + 10, param2.field_g.length - (10 + (param2.field_h + 8)));
                          this.field_b.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_b.reset();
                        throw new RuntimeException("");
                      }
                      L4: {
                        if (param0 == -34) {
                          break L4;
                        } else {
                          field_d = (jea) null;
                          break L4;
                        }
                      }
                      this.field_b.reset();
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

                stackIn_15_1 = new StringBuilder().append("joa.C(").append(param0).append(',');

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
              throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            long dupTemp$1 = 0L;
            int var2 = 0;
            IOException var3 = null;
            kh var4 = null;
            int stackIn_10_0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (la.field_R == null) {
                la.field_R = kqa.field_a.a(-24818, rsa.field_x, nn.field_b);
                break L0;
              } else {
                break L0;
              }
            }
            var2 = -67 % ((param1 - 67) / 35);
            if (0 != la.field_R.field_b) {
              dupTemp$1 = bva.b((byte) -107);
              mha.field_D = dupTemp$1;
              ue.field_s = dupTemp$1;
              if (la.field_R.field_b == 1) {
                try {
                  L1: {
                    L2: {
                      oba.field_e = new jqa((java.net.Socket) (la.field_R.field_f), kqa.field_a);
                      ql.field_k.field_h = 0;
                      var4 = vc.field_q;
                      km.field_p = sua.field_G;
                      var4.field_h = 0;
                      if (!param0) {
                        stackIn_10_0 = -1;
                        break L2;
                      } else {
                        stackIn_10_0 = -2;
                        break L2;
                      }
                    }
                    vua.field_B = stackIn_10_0;
                    hla.field_xb = stackIn_10_0;
                    ufa.field_c = stackIn_10_0;
                    ea.a((byte) -125, csa.field_g, ql.field_k, vh.field_g, be.field_c);
                    bl.a(-1, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (IOException) (Object) decompiledCaughtException;
                  km.field_p = af.field_g;
                  la.field_R = null;
                  return true;
                }
                la.field_R = null;
                return true;
              } else {
                km.field_p = af.field_g;
                la.field_R = null;
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        String var2;
        field_d = null;
        if (param0) {
          var2 = (String) null;
          joa.a((String) null, (cn) null, (String) null, (byte) 49);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static String a(boolean param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_11_0 = null;
        String stackIn_11_1 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = 58 % ((3 - param1) / 60);
            L1: while (true) {
              if (16 <= var3_int) {
                stackIn_15_0 = "Learn to spell";
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (dra.field_b[var3_int].equalsIgnoreCase(param2)) {
                  L2: {
                    if (param0) {
                      v.b(var3_int, 0);
                      break L2;
                    } else {
                      aoa.a(120, var3_int);
                      break L2;
                    }
                  }
                  L3: {
                    stackIn_10_0 = new StringBuilder().append(param2).append(" set ");

                    if (!param0) {
                      stackIn_11_0 = (StringBuilder) ((Object) stackIn_10_0);
                      stackIn_11_1 = "Off";
                      break L3;
                    } else {
                      stackIn_11_0 = (StringBuilder) ((Object) stackIn_10_0);
                      stackIn_11_1 = "On";
                      break L3;
                    }
                  }

                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("joa.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_1;
        } else {
          return stackIn_15_0;
        }
    }

    private joa(int param0, int param1, int param2) {
    }

    static {
    }
}
