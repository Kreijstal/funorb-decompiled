/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    private sg field_h;
    private boolean field_a;
    static volatile boolean field_i;
    private int field_c;
    static String field_j;
    private rb field_e;
    static Random field_b;
    private Object[][] field_g;
    private Object[] field_d;
    static int field_f;

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (this.b((byte) 127)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_h.field_e.a(l.a(var6, param2 + -44), (byte) -113);
              if (this.a(var4_int, true)) {
                if (param2 == -1) {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_h.field_q[var4_int].a(l.a(var7, -84), (byte) 90);
                  stackOut_9_0 = this.a((byte) 118, var5, var4_int);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = (byte[]) null;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ki.P(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static an c(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 80) {
            discarded$0 = ki.b(62);
        }
        if (!(nw.field_e != hm.field_a)) {
            throw new IllegalStateException();
        }
        if (!(st.field_z != nw.field_e)) {
            nw.field_e = hm.field_a;
            return eg.field_l;
        }
        return null;
    }

    final byte[] a(byte param0, int param1, int param2) {
        byte[] discarded$0 = null;
        if (param0 <= 84) {
            discarded$0 = this.c(-101, 72);
        }
        return this.a(param2, 104, (int[]) null, param1);
    }

    final int a(int param0, String param1) {
        an discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (this.b((byte) 127)) {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  discarded$2 = ki.c(((byte[]) (this.field_d[9]))[0]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_h.field_e.a(l.a(var4, param0 ^ -66), (byte) 109);
              if (this.a(var3_int, true)) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ki.T(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean b(byte param0) {
        if (param0 != 127) {
            return true;
        }
        if (this.field_h != null) {
            return true;
        }
        this.field_h = this.field_e.b((byte) -111);
        if (!(null != this.field_h)) {
            return false;
        }
        this.field_g = new Object[this.field_h.field_d][];
        this.field_d = new Object[this.field_h.field_d];
        return true;
    }

    final int a(int param0, String param1, byte param2) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 >= 125) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = this.a(-98, (String) null, (byte) -65);
                break L1;
              }
            }
            if (this.a(param0, true)) {
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_h.field_q[param0].a(l.a(var6, -115), (byte) 105);
              if (this.a(param0, var4_int, (byte) -79)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ki.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b((byte) 127)) {
              param1 = param1.toLowerCase();
              var3_int = -43 / ((-28 - param0) / 53);
              var5 = (CharSequence) ((Object) param1);
              var4 = this.field_h.field_e.a(l.a(var5, -108), (byte) -72);
              if (var4 < 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ki.I(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final synchronized boolean b(byte param0, int param1) {
        byte[] discarded$2 = null;
        if (this.a(param1, true)) {
          if (null != this.field_d[param1]) {
            return true;
          } else {
            L0: {
              this.b(param1, 89);
              if (param0 == -110) {
                break L0;
              } else {
                discarded$2 = this.a((String) null, (String) (this.field_d[6]), -2);
                break L0;
              }
            }
            if (this.field_d[param1] == null) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] c(int param0, int param1) {
        if (param0 != -14296) {
            this.field_d = (Object[]) null;
        }
        if (!this.b((byte) 127)) {
            return null;
        }
        if (this.field_h.field_r.length == 1) {
            return this.a((byte) 108, param1, 0);
        }
        if (!this.a(param1, true)) {
            return null;
        }
        if (!(1 != this.field_h.field_r[param1])) {
            return this.a((byte) 111, 0, param1);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        int var3 = 0;
        if (!this.a(param0, true)) {
          return 0;
        } else {
          if (null != this.field_d[param0]) {
            return 100;
          } else {
            var3 = 81 % ((param1 - -11) / 36);
            return this.field_e.a(param0, 0);
          }
        }
    }

    final byte[] a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_5_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 > 108) {
              var3_int = this.a(0, "");
              if (-1 != var3_int) {
                stackOut_5_0 = this.a(param1, "", -1);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_7_0 = this.a("", param1, -1);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ki.H(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static boolean b(int param0) {
        an discarded$2 = null;
        L0: {
          if (param0 == 6) {
            break L0;
          } else {
            discarded$2 = ki.c((byte) 84);
            break L0;
          }
        }
        L1: {
          if (null != km.field_o) {
            break L1;
          } else {
            km.field_o = gd.a((byte) -82, 6);
            break L1;
          }
        }
        if (km.field_o.field_o) {
          ah.field_g = km.field_o.field_m;
          km.field_o = null;
          if (ah.field_g == null) {
            return true;
          } else {
            kf.a((byte) 111);
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (this.b((byte) 127)) {
              param0 = param0.toLowerCase();
              if (param1 == 100) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_h.field_e.a(l.a(var4, -116), (byte) 124);
                stackOut_6_0 = this.b((byte) -110, var3_int);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ki.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized boolean a(int param0, boolean param1, int param2) {
        boolean discarded$2 = false;
        String var5 = null;
        if (!this.a(param0, param2, (byte) -79)) {
          return false;
        } else {
          L0: {
            if (this.field_g[param0] == null) {
              break L0;
            } else {
              if (null == this.field_g[param0][param2]) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (null == this.field_d[param0]) {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = this.b((byte) 11, (String) null);
                break L1;
              }
            }
            this.b(param0, 84);
            if (null != this.field_d[param0]) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final int a(byte param0, int param1) {
        boolean discarded$0 = false;
        if (!(this.a(param1, true))) {
            return 0;
        }
        if (param0 != -65) {
            discarded$0 = this.b((byte) 97, -83);
        }
        return this.field_h.field_r[param1];
    }

    final int b(boolean param0) {
        int discarded$2 = 0;
        if (!this.b((byte) 127)) {
          return -1;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              discarded$2 = this.a((String) (this.field_d[2]), ((byte[]) (this.field_d[4]))[1]);
              break L0;
            }
          }
          return this.field_h.field_r.length;
        }
    }

    private final synchronized void b(int param0, int param1) {
        L0: {
          if (param1 > 19) {
            break L0;
          } else {
            this.field_d = (Object[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_a) {
              break L2;
            } else {
              this.field_d[param0] = this.field_e.a(param0, false);
              if (!Sumoblitz.field_L) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_d[param0] = aj.a((byte) -121, this.field_e.a(param0, false), false);
          break L1;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        fs var26 = null;
        byte[] var27 = null;
        fs var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        fs var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_15_0 = null;
        int[] stackIn_15_1 = null;
        int stackIn_25_0 = 0;
        Object stackIn_27_0 = null;
        int[] stackIn_27_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_59_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_132_0 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_14_0 = null;
        int[] stackOut_14_1 = null;
        int stackOut_24_0 = 0;
        Object stackOut_26_0 = null;
        int[] stackOut_26_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_66_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_131_0 = 0;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.a(param3, true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_d[param3] == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_h.field_m[param3];
                  var34 = this.field_h.field_s[param3];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_g[param3]) {
                    array$2 = new Object[this.field_h.field_r[param3]];
                    this.field_g[param3] = array$2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_g[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var9_int >= var5_int) {
                        break L4;
                      } else {
                        stackOut_14_0 = null;
                        stackOut_14_1 = (int[]) (var6);
                        stackIn_27_0 = stackOut_14_0;
                        stackIn_27_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_15_0 == stackIn_15_1) {
                                break L6;
                              } else {
                                var10 = var34[var9_int];
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10 = var9_int;
                            break L5;
                          }
                          L7: {
                            if (null != var7[var10]) {
                              break L7;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var9_int++;
                          continue L2;
                        }
                      }
                    }
                    if (var8 != 0) {
                      stackOut_24_0 = 1;
                      stackIn_25_0 = stackOut_24_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackOut_26_0 = null;
                      stackOut_26_1 = (int[]) (param1);
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L3;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_27_0 == stackIn_27_1) {
                        break L9;
                      } else {
                        L10: {
                          if (param1[0] != 0) {
                            break L10;
                          } else {
                            if (0 != param1[1]) {
                              break L10;
                            } else {
                              if (param1[2] != 0) {
                                break L10;
                              } else {
                                if (0 != param1[3]) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var35 = ab.a(true, this.field_d[param3], 0);
                        var25 = var35;
                        var9_array = var25;
                        var26 = new fs(var35);
                        var26.a(var26.field_n.length, (byte) 127, 5, param1);
                        break L8;
                      }
                    }
                    var9_array = ab.a(false, this.field_d[param3], 0);
                    break L8;
                  }
                  try {
                    L11: {
                      var36 = nd.a(-1, var9_array);
                      var27 = var36;
                      var23 = var27;
                      var43 = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_37_0 = (RuntimeException) (var11_ref_RuntimeException);
                      stackOut_37_1 = new StringBuilder();
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (param1 == null) {
                        stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                        stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                        stackOut_39_2 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        break L12;
                      } else {
                        stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                        stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                        stackOut_38_2 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        break L12;
                      }
                    }
                    throw qo.a((Throwable) ((Object) stackIn_40_0), (stackIn_40_2 != 0) + " " + param3 + " " + param1.length + " " + am.a(param1.length, var9_array, (byte) 56) + " " + am.a(param1.length + -2, var9_array, (byte) -103) + " " + this.field_h.field_b[param3] + " " + this.field_h.field_p);
                  }
                  L13: {
                    if (param0 <= -76) {
                      break L13;
                    } else {
                      this.field_g = (Object[][]) (this.field_d[33]);
                      break L13;
                    }
                  }
                  L14: {
                    if (this.field_a) {
                      this.field_d[param3] = null;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if ((var5_int ^ -1) < -2) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (var6 != null) {
                                break L19;
                              } else {
                                var11 = 0;
                                if (var22 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var11 = var34[0];
                            break L18;
                          }
                          L20: {
                            L21: {
                              if (0 == this.field_c) {
                                break L21;
                              } else {
                                var7[var11] = var36;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = aj.a((byte) -119, var36, false);
                            break L20;
                          }
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L22: {
                        if (2 == this.field_c) {
                          break L22;
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * (var12 * var5_int);
                          var29 = new fs(var43);
                          var38 = new int[var5_int];
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var29.field_p = var11;
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              if (var15 >= var12) {
                                stackOut_66_0 = var5_int;
                                stackIn_67_0 = stackOut_66_0;
                                break L24;
                              } else {
                                var16 = 0;
                                stackOut_58_0 = 0;
                                stackIn_67_0 = stackOut_58_0;
                                stackIn_59_0 = stackOut_58_0;
                                if (var22 != 0) {
                                  break L24;
                                } else {
                                  var17 = stackIn_59_0;
                                  L25: while (true) {
                                    L26: {
                                      if (var17 >= var5_int) {
                                        var15++;
                                        break L26;
                                      } else {
                                        var16 = var16 + var29.c(true);
                                        var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                        var17++;
                                        if (var22 != 0) {
                                          break L26;
                                        } else {
                                          continue L25;
                                        }
                                      }
                                    }
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var39 = new byte[stackIn_67_0][];
                            var31 = var39;
                            var15_ref_byte____ = var31;
                            var16 = 0;
                            L27: while (true) {
                              L28: {
                                if (var5_int <= var16) {
                                  var29.field_p = var11;
                                  var16 = 0;
                                  break L28;
                                } else {
                                  array$3 = new byte[var38[var16]];
                                  var15_ref_byte____[var16] = array$3;
                                  var38[var16] = 0;
                                  var16++;
                                  if (var22 != 0) {
                                    break L28;
                                  } else {
                                    continue L27;
                                  }
                                }
                              }
                              var17 = 0;
                              L29: while (true) {
                                L30: {
                                  if (var17 >= var12) {
                                    stackOut_83_0 = 0;
                                    stackIn_84_0 = stackOut_83_0;
                                    break L30;
                                  } else {
                                    var18 = 0;
                                    stackOut_75_0 = 0;
                                    stackIn_84_0 = stackOut_75_0;
                                    stackIn_76_0 = stackOut_75_0;
                                    if (var22 != 0) {
                                      break L30;
                                    } else {
                                      var19 = stackIn_76_0;
                                      L31: while (true) {
                                        L32: {
                                          if (var19 >= var5_int) {
                                            var17++;
                                            break L32;
                                          } else {
                                            var18 = var18 + var29.c(true);
                                            la.a(var36, var16, var39[var19], var38[var19], var18);
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var16 = var16 + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L32;
                                            } else {
                                              continue L31;
                                            }
                                          }
                                        }
                                        continue L29;
                                      }
                                    }
                                  }
                                }
                                var17 = stackIn_84_0;
                                L33: while (true) {
                                  if (var17 >= var5_int) {
                                    if (var22 == 0) {
                                      break L16;
                                    } else {
                                      break L22;
                                    }
                                  } else {
                                    if (var22 != 0) {
                                      break L16;
                                    } else {
                                      L34: {
                                        L35: {
                                          if (var6 == null) {
                                            break L35;
                                          } else {
                                            var18 = var34[var17];
                                            if (var22 == 0) {
                                              break L34;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        var18 = var17;
                                        break L34;
                                      }
                                      L36: {
                                        L37: {
                                          if (this.field_c == 0) {
                                            break L37;
                                          } else {
                                            var7[var18] = var39[var17];
                                            if (var22 == 0) {
                                              break L36;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        var7[var18] = aj.a((byte) -119, var39[var17], false);
                                        break L36;
                                      }
                                      var17++;
                                      continue L33;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var36.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var12 * var5_int);
                      var32 = new fs(var43);
                      var14 = 0;
                      var32.field_p = var11;
                      var15 = 0;
                      var16 = 0;
                      L38: while (true) {
                        L39: {
                          if (var12 <= var16) {
                            stackOut_111_0 = -1;
                            stackIn_112_0 = stackOut_111_0;
                            break L39;
                          } else {
                            var17 = 0;
                            stackOut_98_0 = 0;
                            stackIn_112_0 = stackOut_98_0;
                            stackIn_99_0 = stackOut_98_0;
                            if (var22 != 0) {
                              break L39;
                            } else {
                              var18 = stackIn_99_0;
                              L40: while (true) {
                                L41: {
                                  if (var5_int <= var18) {
                                    var16++;
                                    break L41;
                                  } else {
                                    var17 = var17 + var32.c(true);
                                    if (var22 != 0) {
                                      break L41;
                                    } else {
                                      L42: {
                                        L43: {
                                          if (var6 == null) {
                                            break L43;
                                          } else {
                                            var19 = var34[var18];
                                            if (var22 == 0) {
                                              break L42;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        var19 = var18;
                                        break L42;
                                      }
                                      L44: {
                                        if (param2 == var19) {
                                          var14 = var14 + var17;
                                          var15 = var19;
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      var18++;
                                      continue L40;
                                    }
                                  }
                                }
                                continue L38;
                              }
                            }
                          }
                        }
                        if (stackIn_112_0 == (var14 ^ -1)) {
                          stackOut_114_0 = 1;
                          stackIn_115_0 = stackOut_114_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var44 = new byte[var14];
                          var14 = 0;
                          var32.field_p = var11;
                          var17 = 0;
                          var18 = 0;
                          L45: while (true) {
                            if (var18 >= var12) {
                              var7[var15] = var44;
                              break L16;
                            } else {
                              var19 = 0;
                              stackOut_118_0 = 0;
                              stackIn_132_0 = stackOut_118_0;
                              stackIn_119_0 = stackOut_118_0;
                              if (var22 != 0) {
                                break L15;
                              } else {
                                var20 = stackIn_119_0;
                                L46: while (true) {
                                  L47: {
                                    if (var20 >= var5_int) {
                                      var18++;
                                      break L47;
                                    } else {
                                      var19 = var19 + var32.c(true);
                                      if (var22 != 0) {
                                        break L47;
                                      } else {
                                        L48: {
                                          L49: {
                                            if (var6 != null) {
                                              break L49;
                                            } else {
                                              var21 = var20;
                                              if (var22 == 0) {
                                                break L48;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                          var21 = var34[var20];
                                          break L48;
                                        }
                                        L50: {
                                          if (param2 != var21) {
                                            break L50;
                                          } else {
                                            la.a(var43, var17, var44, var14, var19);
                                            var14 = var14 + var19;
                                            break L50;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L46;
                                      }
                                    }
                                  }
                                  continue L45;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_131_0 = 1;
                    stackIn_132_0 = stackOut_131_0;
                    break L15;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L51: {
            var5 = decompiledCaughtException;
            stackOut_133_0 = (RuntimeException) (var5);
            stackOut_133_1 = new StringBuilder().append("ki.EA(").append(param0).append(',');
            stackIn_135_0 = stackOut_133_0;
            stackIn_135_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param1 == null) {
              stackOut_135_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "null";
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              stackIn_136_2 = stackOut_135_2;
              break L51;
            } else {
              stackOut_134_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackOut_134_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackOut_134_2 = "{...}";
              stackIn_136_0 = stackOut_134_0;
              stackIn_136_1 = stackOut_134_1;
              stackIn_136_2 = stackOut_134_2;
              break L51;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_136_0), stackIn_136_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_115_0 != 0;
              } else {
                return stackIn_132_0 != 0;
              }
            }
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        L0: {
          if (param2 == -79) {
            break L0;
          } else {
            field_i = true;
            break L0;
          }
        }
        if (this.b((byte) 127)) {
          L1: {
            if ((param0 ^ -1) > -1) {
              break L1;
            } else {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (param0 >= this.field_h.field_r.length) {
                  break L1;
                } else {
                  if (param1 >= this.field_h.field_r[param0]) {
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (!jg.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        } else {
          return false;
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (this.b((byte) 127)) {
              param0 = param0.toLowerCase();
              if (param1 == 33) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_h.field_e.a(l.a(var4, param1 ^ -101), (byte) 103);
                stackOut_6_0 = this.a(var3_int, (byte) 79);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 123;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ki.BA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
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

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var5_int = 83 / ((param1 - 45) / 38);
            if (this.a(param0, param3, (byte) -79)) {
              L1: {
                L2: {
                  var6 = null;
                  if (null == this.field_g[param0]) {
                    break L2;
                  } else {
                    if (this.field_g[param0][param3] != null) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(-126, param2, param3, param0)) {
                  break L1;
                } else {
                  this.b(param0, 124);
                  if (this.a(-93, param2, param3, param0)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_g[param0] != null) {
                L3: {
                  if (null != this.field_g[param0][param3]) {
                    var8 = ab.a(false, this.field_g[param0][param3], 0);
                    var6 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 != null) {
                    L5: {
                      if (-2 == (this.field_c ^ -1)) {
                        break L5;
                      } else {
                        if (-3 == (this.field_c ^ -1)) {
                          this.field_g[param0] = null;
                          if (!Sumoblitz.field_L) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_g[param0][param3] = null;
                    if ((this.field_h.field_r[param0] ^ -1) == -2) {
                      this.field_g[param0] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_26_0 = var6;
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("ki.B(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return (byte[]) ((Object) stackIn_27_0);
        }
    }

    final synchronized int[] a(int param0, int param1) {
        an discarded$1 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_11_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_10_0 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.a(param0, true)) {
          return null;
        } else {
          L0: {
            var3 = this.field_h.field_s[param0];
            if (param1 == -25915) {
              break L0;
            } else {
              discarded$1 = ki.c((byte) 102);
              break L0;
            }
          }
          L1: {
            L2: {
              if (var3 == null) {
                var6 = new int[this.field_h.field_m[param0]];
                var3 = var6;
                var4 = 0;
                L3: while (true) {
                  if (var4 >= var6.length) {
                    break L2;
                  } else {
                    stackOut_7_0 = (int[]) (var6);
                    stackIn_11_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      stackIn_8_0[var4] = var4;
                      var4++;
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_10_0 = (int[]) (var3);
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          return stackIn_11_0;
        }
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.b((byte) 127)) {
          return false;
        } else {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= this.field_h.field_f.length) {
                  break L2;
                } else {
                  stackOut_3_0 = this.field_h.field_f[var3];
                  stackIn_10_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      var4 = stackIn_4_0;
                      if (null != this.field_d[var4]) {
                        break L3;
                      } else {
                        this.b(var4, 99);
                        if (null == this.field_d[var4]) {
                          var2 = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = var2;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.b((byte) 127)) {
          return 0;
        } else {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= this.field_d.length) {
                  break L2;
                } else {
                  stackOut_5_0 = this.field_h.field_m[var4];
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 <= 0) {
                        break L3;
                      } else {
                        var2 += 100;
                        var3 = var3 + this.a(var4, (byte) 50);
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            if (stackIn_10_0 == var2) {
              return 100;
            } else {
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        }
    }

    final boolean b(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (this.b((byte) 127)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_h.field_e.a(l.a(var6, -124), (byte) 100);
              if (var4_int >= 0) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_h.field_q[var4_int].a(l.a(var7, -115), (byte) -83);
                if (param2 < (var5 ^ -1)) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ki.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 35) {
            discarded$0 = ki.b(91);
        }
        field_b = null;
        field_j = null;
    }

    ki(rb param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_h = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -3) {
                  L2: {
                    this.field_c = param2;
                    this.field_e = param0;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ki) (this)).field_a = stackIn_7_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ki.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1) {
        if (!this.b((byte) 127)) {
          return false;
        } else {
          L0: {
            if (param1) {
              break L0;
            } else {
              field_j = (String) (this.field_d[5]);
              break L0;
            }
          }
          L1: {
            if (param0 < 0) {
              break L1;
            } else {
              if (this.field_h.field_r.length <= param0) {
                break L1;
              } else {
                if (this.field_h.field_r[param0] == 0) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
          }
          if (!jg.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (this.b((byte) 127)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_h.field_e.a(l.a(var6, -103), (byte) -78);
              if (!this.a(var4_int, true)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == -1158) {
                  var7 = (CharSequence) ((Object) param2);
                  var5 = this.field_h.field_q[var4_int].a(l.a(var7, -41), (byte) -25);
                  stackOut_10_0 = this.a(var4_int, false, var5);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("ki.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    static {
        field_i = false;
        field_j = "Fullscreen";
        field_b = new Random();
        field_f = 1;
    }
}
