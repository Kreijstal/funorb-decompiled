/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.lang.String;

final class mf {
    private ob field_i;
    private boolean field_c;
    static ed field_a;
    private int field_h;
    private Object[][] field_e;
    private f field_g;
    private Object[] field_j;
    static tk field_d;
    static int[] field_l;
    static String field_b;
    static String[] field_f;
    static hf field_k;
    static ed field_m;

    final static int b(int param0, int param1, int param2) {
        if (param2 != -2) {
            return 21;
        }
        return ni.a(param0, param1, false, ka.field_b);
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!((mf) this).b(0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  int discarded$2 = mf.b(((int[]) ((mf) this).field_j[2])[27], ((int[]) ((mf) this).field_j[15])[0], ((int[]) ((mf) this).field_j[6])[30]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((mf) this).field_g.field_p.a(mh.a(param0 + 1, var4), 1);
              if (this.a(var3_int, (byte) -124)) {
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mf.P(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
            field_a = null;
        }
        if (!(this.a(param2, 11315, param1))) {
            return false;
        }
        if (null != ((mf) this).field_e[param1]) {
            if (!(null == ((mf) this).field_e[param1][param2])) {
                return true;
            }
        }
        if (!(null == ((mf) this).field_j[param1])) {
            return true;
        }
        this.c(param1, 14);
        if (null == ((mf) this).field_j[param1]) {
            return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = EscapeVector.field_A;
        try {
          var3 = cf.a(false, 81, param2);
          if (var3 == null) {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (!fn.a(param2.charAt(var4), (byte) -124)) {
                  stackOut_10_0 = s.field_B;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("mf.AA(").append(true).append(',').append(false).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((mf) this).b(0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((mf) this).field_g.field_p.a(mh.a(param0, var4), 1);
              stackOut_3_0 = ((mf) this).d(118, var3_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mf.S(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_8_0 = false;
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
            if (!((mf) this).b(0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var7 = (CharSequence) (Object) param1;
              var4_int = ((mf) this).field_g.field_p.a(mh.a(0, var7), 1);
              if (!this.a(var4_int, (byte) 48)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var6 = 10 / ((-13 - param2) / 52);
                var8 = (CharSequence) (Object) param0;
                var5 = ((mf) this).field_g.field_s[var4_int].a(mh.a(0, var8), 1);
                stackOut_8_0 = ((mf) this).a(true, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("mf.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
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
            if (((mf) this).b(0)) {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (param0 == -4) {
                  break L1;
                } else {
                  boolean discarded$2 = ((mf) this).a(((byte[]) ((mf) this).field_j[3])[3]);
                  break L1;
                }
              }
              var6 = (CharSequence) (Object) param2;
              var4_int = ((mf) this).field_g.field_p.a(mh.a(param0 + 4, var6), 1);
              if (this.a(var4_int, (byte) -113)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((mf) this).field_g.field_s[var4_int].a(mh.a(0, var7), 1);
                stackOut_8_0 = ((mf) this).a(var4_int, (byte) -97, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("mf.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final byte[] a(byte param0, String param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        CharSequence var9 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (((mf) this).b(0)) {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var8 = (CharSequence) (Object) param1;
              var5_int = ((mf) this).field_g.field_p.a(mh.a(0, var8), 1);
              if (this.a(var5_int, (byte) 91)) {
                var6 = -115 / ((1 - param0) / 58);
                var9 = (CharSequence) (Object) param2;
                var7 = ((mf) this).field_g.field_s[var5_int].a(mh.a(0, var9), 1);
                stackOut_6_0 = this.a((byte) 75, param3, var7, var5_int);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("mf.BA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        if (!((mf) this).b(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((mf) this).field_j.length) {
              if (var2 != 0) {
                if (param0 < -27) {
                  var4 = 100 * var3 / var2;
                  return var4;
                } else {
                  return 107;
                }
              } else {
                return 100;
              }
            } else {
              if (((mf) this).field_g.field_i[var4] > 0) {
                var3 = var3 + ((mf) this).b(3210, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, c param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            mn var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            mn var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            String stackIn_68_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = EscapeVector.field_A;
            try {
              L0: {
                var13 = (mn) (Object) je.field_a.a(false);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  L1: {
                    var3 = 0;
                    if (param0 == -20157) {
                      break L1;
                    } else {
                      field_f = null;
                      break L1;
                    }
                  }
                  var4 = 0;
                  L2: while (true) {
                    if (~var17.field_i >= ~var4) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param1.field_m;
                        param1.a((byte) 125, var17.field_g);
                        var5 = 0;
                        L3: while (true) {
                          if (~var5 <= ~var17.field_i) {
                            int discarded$1 = param1.c(var4, param0 ^ 20130);
                            var17.c((byte) -38);
                            break L0;
                          } else {
                            L4: {
                              if (0 != var17.field_o[var5]) {
                                param1.f(var17.field_o[var5], -123);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_m[var5];
                                      if (var6_int != 0) {
                                        if (var6_int != 1) {
                                          if (var6_int != 2) {
                                            break L6;
                                          } else {
                                            var15 = (java.lang.reflect.Field) var17.field_r[var5].field_b;
                                            var8 = var15.getModifiers();
                                            param1.f(0, -123);
                                            param1.a((byte) 125, var8);
                                            break L6;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) var17.field_r[var5].field_b;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_j[var5]);
                                          param1.f(0, -123);
                                          break L6;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) var17.field_r[var5].field_b;
                                        var8 = var26.getInt((Object) null);
                                        param1.f(0, -123);
                                        param1.a((byte) 123, var8);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) var17.field_p[var5].field_b;
                                        var25 = var17.field_l[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (~var10_int <= ~var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param1.f(2, -123);
                                                  param1.a((String) var10, 77);
                                                  break L7;
                                                } else {
                                                  param1.f(4, -123);
                                                  break L7;
                                                }
                                              } else {
                                                param1.f(1, param0 + 20034);
                                                param1.a(((Number) var10).longValue(), (byte) -23);
                                                break L7;
                                              }
                                            } else {
                                              param1.f(0, -123);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (var6_int != 4) {
                                          break L7;
                                        } else {
                                          var27 = (java.lang.reflect.Method) var17.field_p[var5].field_b;
                                          var8 = var27.getModifiers();
                                          param1.f(0, param0 ^ 20166);
                                          param1.a((byte) 124, var8);
                                          break L7;
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.f(-14, -123);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.f(-15, -123);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.f(-16, -123);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.f(-18, -123);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.f(-19, -123);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.f(-20, -123);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.f(-21, param0 ^ 20166);
                                    break L20;
                                  }
                                }
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (null != var13.field_r[var4]) {
                          L22: {
                            if (var13.field_r[var4].field_f != 2) {
                              break L22;
                            } else {
                              var13.field_o[var4] = -5;
                              break L22;
                            }
                          }
                          if (var13.field_r[var4].field_f != 0) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      L23: {
                        if (null != var13.field_p[var4]) {
                          L24: {
                            if (2 == var13.field_p[var4].field_f) {
                              var13.field_o[var4] = -6;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          if (var13.field_p[var4].field_f != 0) {
                            break L23;
                          } else {
                            var3 = 1;
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_65_0 = (RuntimeException) var2;
                stackOut_65_1 = new StringBuilder().append("mf.W(").append(param0).append(',');
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param1 == null) {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "null";
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  stackIn_68_2 = stackOut_67_2;
                  break L25;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  break L25;
                }
              }
              throw t.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 <= 119) {
            Object var2 = null;
            mf.a(84, (c) null);
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, ed param3, int param4) {
        RuntimeException var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Random var17 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            if (param4 <= -87) {
              var17 = new Random();
              param1 = param1 + param3.field_q;
              param0 = param0 + param3.field_v;
              var6 = 0;
              L1: while (true) {
                if (var6 >= param3.field_x) {
                  break L0;
                } else {
                  L2: {
                    var7 = var17.nextGaussian();
                    if (var7 > -64.0) {
                      break L2;
                    } else {
                      var7 = -64.0;
                      break L2;
                    }
                  }
                  L3: {
                    if (var7 < 64.0) {
                      break L3;
                    } else {
                      var7 = 64.0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = (int)((double)param2 * var7) + param1;
                    var10 = param3.field_s * var6;
                    var11 = (var6 + param0) * 640 - -var9;
                    if (0 <= var9) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = -var9;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  }
                  L5: {
                    var12 = stackIn_12_0;
                    if (640 < param3.field_s + var9) {
                      stackOut_14_0 = 640 - var9;
                      stackIn_15_0 = stackOut_14_0;
                      break L5;
                    } else {
                      stackOut_13_0 = param3.field_s;
                      stackIn_15_0 = stackOut_13_0;
                      break L5;
                    }
                  }
                  var13 = stackIn_15_0;
                  var14 = var12;
                  L6: while (true) {
                    if (var14 >= var13) {
                      var6++;
                      continue L1;
                    } else {
                      L7: {
                        var15 = param3.field_B[var14 + var10];
                        if (var15 != 0) {
                          em.field_i[var14 + var11] = var15;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("mf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param4 + ')');
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (((mf) this).field_c) {
            ((mf) this).field_j[param0] = (Object) (Object) ((mf) this).field_i.a((byte) -73, param0);
        } else {
            ((mf) this).field_j[param0] = bk.a(false, ((mf) this).field_i.a((byte) -47, param0), 9);
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(param0 >= 9)) {
            return false;
        }
        if (14 <= param0) {
            return false;
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!((mf) this).b(param1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((mf) this).field_g.field_p.a(mh.a(param1, var4), 1);
              stackOut_4_0 = ((mf) this).b(param1 ^ 3210, var3_int);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("mf.CA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                ((long[]) ((Object[]) ((mf) this).field_j[15])[4])[3] = ((long[]) ((mf) this).field_j[12])[2];
                break L1;
              }
            }
            if (!this.a(param0, (byte) -121)) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4_int = ((mf) this).field_g.field_s[param0].a(mh.a(0, var5), 1);
              if (this.a(var4_int, 11315, param0)) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized byte[] a(byte param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (this.a(param2, 11315, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((mf) this).field_e[param3]) {
                    break L2;
                  } else {
                    if (((mf) this).field_e[param3][param2] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!this.a(param1, -7951, param2, param3)) {
                  this.c(param3, 14);
                  if (this.a(param1, -7951, param2, param3)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((mf) this).field_e[param3]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((mf) this).field_e[param3][param2] == null) {
                    break L3;
                  } else {
                    var7 = fk.a(((mf) this).field_e[param3][param2], (byte) -126, false);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (1 != ((mf) this).field_h) {
                      if (2 == ((mf) this).field_h) {
                        ((mf) this).field_e[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      ((mf) this).field_e[param3][param2] = null;
                      if (((mf) this).field_g.field_e[param3] != 1) {
                        break L4;
                      } else {
                        ((mf) this).field_e[param3] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_24_0 = var5;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_26_0 = var5;
            stackOut_26_1 = new StringBuilder().append("mf.J(").append(75).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_25_0;
    }

    private final synchronized boolean a(int param0, byte param1) {
        int var3 = -14 % ((-55 - param1) / 56);
        if (!(((mf) this).b(0))) {
            return false;
        }
        if (param0 >= 0) {
            if (param0 < ((mf) this).field_g.field_e.length) {
                if (0 != ((mf) this).field_g.field_e[param0]) {
                    return true;
                }
            }
        }
        if (uj.field_d) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!(this.a(param1, (byte) 33))) {
            return false;
        }
        if (param0 < 81) {
            ((byte[]) ((mf) this).field_j[11])[30] = (byte) 8;
        }
        if (((mf) this).field_j[param1] != null) {
            return true;
        }
        this.c(param1, 14);
        if (null != ((mf) this).field_j[param1]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!((mf) this).b(0)) {
            return false;
        }
        if (param2 >= 0) {
            if (param0 >= 0) {
                if (param2 < ((mf) this).field_g.field_e.length) {
                    if (param0 < ((mf) this).field_g.field_e[param2]) {
                        return true;
                    }
                }
            }
        }
        if (uj.field_d) {
            throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((mf) this).b(0)) {
              param0 = param0.toLowerCase();
              if (param1 < -102) {
                var4 = (CharSequence) (Object) param0;
                var3_int = ((mf) this).field_g.field_p.a(mh.a(0, var4), 1);
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mf.R(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = EscapeVector.field_A;
        if (!((mf) this).b(0)) {
          return false;
        } else {
          L0: {
            if (param0 == -119) {
              break L0;
            } else {
              var6 = null;
              byte[] discarded$2 = ((mf) this).a((byte) -91, (String) null, (String) ((mf) this).field_j[0], (int[]) null);
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((mf) this).field_g.field_d.length) {
              return var2 != 0;
            } else {
              var4 = ((mf) this).field_g.field_d[var3];
              if (((mf) this).field_j[var4] == null) {
                this.c(var4, 14);
                if (null == ((mf) this).field_j[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final synchronized int b(int param0, int param1) {
        if (param0 != 3210) {
            mf.c(69);
        }
        if (!this.a(param1, (byte) 48)) {
            return 0;
        }
        if (((mf) this).field_j[param1] != null) {
            return 100;
        }
        return ((mf) this).field_i.a(0, param1);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        n var26 = null;
        byte[] var27 = null;
        n var29 = null;
        n var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var42 = null;
        byte[] var45 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        int[] var50 = null;
        byte[] var51 = null;
        Object var52 = null;
        byte[] var52_array = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        int[] var56 = null;
        byte[][] var57 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_97_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_52_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var22 = EscapeVector.field_A;
        try {
          L0: {
            if (this.a(param3, (byte) 109)) {
              if (null != ((mf) this).field_j[param3]) {
                L1: {
                  var5_int = ((mf) this).field_g.field_i[param3];
                  var50 = ((mf) this).field_g.field_a[param3];
                  var42 = var50;
                  var34 = var42;
                  var24 = var34;
                  var6 = var24;
                  if (((mf) this).field_e[param3] == null) {
                    ((mf) this).field_e[param3] = new Object[((mf) this).field_g.field_e[param3]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((mf) this).field_e[param3];
                var8 = 1;
                var9 = 0;
                L2: while (true) {
                  L3: {
                    if (var9 >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9;
                          break L4;
                        } else {
                          var10 = var50[var9];
                          break L4;
                        }
                      }
                      if (var7[var10] != null) {
                        var9++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param0[0]) {
                              break L7;
                            } else {
                              if (-1 != param0[1]) {
                                break L7;
                              } else {
                                if (-1 != param0[2]) {
                                  break L7;
                                } else {
                                  if (param0[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var51 = fk.a(((mf) this).field_j[param3], (byte) -116, true);
                          var26 = new n(var51);
                          var26.a(5, param0, var26.field_g.length, 6528);
                          var52_array = var51;
                          break L5;
                        }
                      }
                      var52_array = fk.a(((mf) this).field_j[param3], (byte) -117, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var53 = s.a((byte) -26, var52_array);
                        var45 = var53;
                        var37 = var45;
                        var27 = var37;
                        var23 = var27;
                        var54 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_32_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_32_1 = new StringBuilder();
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param0 == null) {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          break L9;
                        } else {
                          stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                          stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                          stackOut_33_2 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          break L9;
                        }
                      }
                      throw t.a((Throwable) (Object) stackIn_35_0, (stackIn_35_2 != 0) + " " + param3 + " " + param0.length + " " + ji.a(255, param0.length, var52_array) + " " + ji.a(255, -2 + param0.length, var52_array) + " " + ((mf) this).field_g.field_l[param3] + " " + ((mf) this).field_g.field_b);
                    }
                    L10: {
                      if (!((mf) this).field_c) {
                        break L10;
                      } else {
                        ((mf) this).field_j[param3] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int <= 1) {
                        L12: {
                          if (var6 != null) {
                            var11 = var50[0];
                            break L12;
                          } else {
                            var11 = 0;
                            break L12;
                          }
                        }
                        if (((mf) this).field_h != 0) {
                          var7[var11] = (Object) (Object) var54;
                          break L11;
                        } else {
                          var7[var11] = bk.a(false, var53, 9);
                          break L11;
                        }
                      } else {
                        if (((mf) this).field_h != 2) {
                          var11 = var53.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var31 = new n(var54);
                          var31.field_m = var11;
                          var56 = new int[var5_int];
                          var48 = var56;
                          var40 = var48;
                          var32 = var40;
                          var14 = var32;
                          var15_int = 0;
                          L13: while (true) {
                            if (var15_int >= var12) {
                              var57 = new byte[var5_int][];
                              var49 = var57;
                              var41 = var49;
                              var33 = var41;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var5_int <= var16) {
                                  var31.field_m = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L17: {
                                            if (var6 != null) {
                                              var18 = var50[var17];
                                              break L17;
                                            } else {
                                              var18 = var17;
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (((mf) this).field_h == 0) {
                                              var7[var18] = bk.a(false, var57[var17], n.a(-7951, -7944));
                                              break L18;
                                            } else {
                                              var7[var18] = (Object) (Object) var57[var17];
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.g(-5053);
                                          qg.a(var54, var16, var57[var19], var56[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var56[var16]];
                                  var56[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.g(-5053);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var53.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var5_int * var12;
                          var29 = new n(var54);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_m = var11;
                          var16 = 0;
                          L21: while (true) {
                            if (var16 >= var12) {
                              if (0 != var14_int) {
                                var55 = new byte[var14_int];
                                var29.field_m = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = (Object) (Object) var55;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.g(-5053);
                                          if (var6 != null) {
                                            var21 = var50[var20];
                                            break L24;
                                          } else {
                                            var21 = var20;
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (param2 != var21) {
                                            break L25;
                                          } else {
                                            qg.a(var54, var17, var55, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_52_0 = 1;
                                stackIn_53_0 = stackOut_52_0;
                                return stackIn_53_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var29.g(-5053);
                                    if (var6 != null) {
                                      var19 = var50[var18];
                                      break L27;
                                    } else {
                                      var19 = var18;
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (var19 != param2) {
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var18++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_96_0 = 1;
                    stackIn_97_0 = stackOut_96_0;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var5;
            stackOut_98_1 = new StringBuilder().append("mf.T(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L29;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L29;
            }
          }
          throw t.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + -7951 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_97_0 != 0;
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -97) {
            return null;
        }
        return this.a((byte) 75, (int[]) null, param2, param0);
    }

    mf(ob param0, boolean param1, int param2) {
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
        ((mf) this).field_g = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
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
                  ((mf) this).field_c = stackIn_7_1 != 0;
                  ((mf) this).field_h = param2;
                  ((mf) this).field_i = param0;
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
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("mf.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        if (null == ((mf) this).field_g) {
            ((mf) this).field_g = ((mf) this).field_i.a(29192);
            if (!(null != ((mf) this).field_g)) {
                return false;
            }
            ((mf) this).field_j = new Object[((mf) this).field_g.field_k];
            ((mf) this).field_e = new Object[((mf) this).field_g.field_k][];
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ed(7, 7);
        field_d = new tk();
        field_f = new String[]{"Retrieval - Hard: complete the asteroid<nbsp>levels", "Retrieval - Hard: complete the baked moon<nbsp>levels", "Retrieval - Hard: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Hard", "Retrieval - Hard:<br>get 25,000<nbsp>points", "Retrieval - Hard:<br>get 100,000<nbsp>points", "Retrieval: complete a level with more than 2500<nbsp>fuel", "Retrieval - Hard: destroy an alien laser gate and complete the<nbsp>level", "Blow yourself up at speed in the mothership's auto-shield<nbsp>area", "Retrieval - Hard: complete all levels in under 30<nbsp>minutes", "Retrieval - Hard: complete all levels in under 20<nbsp>minutes", "Retrieval - Hard: collect all power-ups in one<nbsp>session", "Retrieval - Hard: destroy all possible alien infrastructure in one<nbsp>session", "Retrieval - Hard: complete 'Force Matrix Defence', without using the<nbsp>power-up", "Retrieval - Hard: complete 'Seeker Caves', without using your shield or<nbsp>shooting", "Retrieval - Hard: complete 'High-Security Stronghold', destroying no more than four green<nbsp>pods", "Retrieval - Hard: complete 'Seeker Prison Cell', without using your<nbsp>shield", "Land on one of the attractors in 'Force Matrix<nbsp>Defence' in Retrieval", "Retrieval - Normal: complete the asteroid<nbsp>levels", "Retrieval - Normal: complete the baked moon<nbsp>levels", "Retrieval - Normal: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Normal", "Complete the asteroids stage in Retribution", "Complete the sun-baked moon stage in Retribution", "Complete the icy moon stage on Retribution", "Complete the Retribution level set", "Score 350,000 points in Retribution", "Score 800,000 points in Retribution", "Destroy all alien infrastructure in Retribution", "Complete the Simulator level set", "Complete 'Pinball' on Simulator", "Complete 'Anti-gravity' on Simulator"};
        field_k = new hf();
    }
}
