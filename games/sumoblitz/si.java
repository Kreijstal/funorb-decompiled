/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si extends nn {
    private java.nio.ByteBuffer field_b;
    static int field_c;
    static hr field_e;
    static hr field_d;

    final static int c(int param0, int param1) {
        byte[] discarded$1 = null;
        int var2 = 0;
        File var3 = null;
        if (-1 != (param0 ^ -1)) {
          if (-1 > (param0 ^ -1)) {
            L0: {
              var2 = 1;
              if (65535 >= param0) {
                break L0;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              }
            }
            L1: {
              if (-256 <= (param0 ^ -1)) {
                break L1;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) < -16) {
                var2 += 4;
                param0 = param0 >> 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-4 > (param0 ^ -1)) {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((param0 ^ -1) >= -2) {
                break L4;
              } else {
                var2++;
                param0 = param0 >> 1;
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if (65535 < (param0 ^ -1)) {
                param0 = param0 >> 16;
                var2 += 16;
                break L5;
              } else {
                break L5;
              }
            }
            if (param1 == 1) {
              L6: {
                if (param0 < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-16 <= param0) {
                  break L7;
                } else {
                  param0 = param0 >> 4;
                  var2 += 4;
                  break L7;
                }
              }
              L8: {
                if (-4 > param0) {
                  param0 = param0 >> 2;
                  var2 += 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0 < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                var3 = (File) null;
                discarded$1 = si.a((File) null, (byte) 38);
                if (param0 < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-16 <= param0) {
                  break L11;
                } else {
                  param0 = param0 >> 4;
                  var2 += 4;
                  break L11;
                }
              }
              L12: {
                if (-4 > param0) {
                  param0 = param0 >> 2;
                  var2 += 2;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param0 < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    final void a(byte[] param0, int param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            int var3_int = -124 % ((param1 - -47) / 62);
            this.field_b = java.nio.ByteBuffer.allocateDirect(param0.length);
            discarded$0 = this.field_b.position(0);
            discarded$1 = this.field_b.put(param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "si.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(File param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -1 % ((39 - param1) / 49);
            stackOut_0_0 = kq.a((int)param0.length(), param0, (byte) 103);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("si.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    si() {
    }

    final byte[] a(int param0, int param1, int param2) {
        java.nio.Buffer discarded$8 = null;
        java.nio.ByteBuffer discarded$9 = null;
        java.nio.Buffer discarded$10 = null;
        java.nio.ByteBuffer discarded$11 = null;
        byte[] var4 = null;
        java.applet.Applet var5 = null;
        byte[] var6 = null;
        if (param2 != 15747) {
          var5 = (java.applet.Applet) null;
          si.a((java.applet.Applet) null, (byte) 104);
          var6 = new byte[param1];
          var4 = var6;
          discarded$8 = this.field_b.position(param0);
          discarded$9 = this.field_b.get(var6, 0, param1);
          return var6;
        } else {
          var6 = new byte[param1];
          var4 = var6;
          discarded$10 = this.field_b.position(param0);
          discarded$11 = this.field_b.get(var6, 0, param1);
          return var6;
        }
    }

    public static void b(int param0) {
        int var1 = -2 / ((param0 - 65) / 43);
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        kd.field_a[param5] = param4;
        if (param3 != 2) {
            return;
        }
        try {
            za.field_l[param5] = param2;
            nj.field_d[param5] = param6;
            pj.field_k[param5] = param0;
            rh.field_s[param5] = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "si.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if (-1L != (vo.a(var3, 7441) ^ -1L)) {
                  L2: {
                    if (param1 <= -42) {
                      break L2;
                    } else {
                      field_c = -99;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("si.M(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte[] a(boolean param0) {
        byte[] discarded$23 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_b.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$21 = this.field_b.position(0);
        java.nio.ByteBuffer discarded$22 = this.field_b.get(var3);
        if (param0) {
          discarded$23 = this.a(false);
          return var3;
        } else {
          return var3;
        }
    }

    static {
        field_c = 0;
    }
}
