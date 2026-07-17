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
            stackOut_11_1 = new StringBuilder().append("mf.P(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (!this.a(param2, 11315, param1)) {
          return false;
        } else {
          L1: {
            if (null == ((mf) this).field_e[param1]) {
              break L1;
            } else {
              if (null != ((mf) this).field_e[param1][param2]) {
                return true;
              } else {
                break L1;
              }
            }
          }
          if (null != ((mf) this).field_j[param1]) {
            return true;
          } else {
            this.c(param1, 14);
            if (null == ((mf) this).field_j[param1]) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var3 = cf.a(param1, 81, param2);
            if (var3 == null) {
              var4 = 0;
              if (param0) {
                L1: while (true) {
                  if (var4 < param2.length()) {
                    if (!fn.a(param2.charAt(var4), (byte) -124)) {
                      stackOut_11_0 = s.field_B;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      var4++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        stackOut_14_0 = null;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (String) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("mf.AA(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return (String) (Object) stackIn_15_0;
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
            stackOut_5_1 = new StringBuilder().append("mf.S(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
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
            stackOut_10_1 = new StringBuilder().append("mf.E(").append(param0).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
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
            stackOut_8_1 = new StringBuilder().append("mf.BA(").append(param0).append(44);
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_7_0;
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
        var5 = EscapeVector.field_A;
        if (!((mf) this).b(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= ((mf) this).field_j.length) {
                  break L2;
                } else {
                  stackOut_5_0 = ((mf) this).field_g.field_i[var4];
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 <= 0) {
                        break L3;
                      } else {
                        var3 = var3 + ((mf) this).b(3210, var4);
                        var2 += 100;
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
              stackOut_9_0 = -1;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            if (stackIn_10_0 != ~var2) {
              if (param0 >= -27) {
                return 107;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              return 100;
            }
          }
        }
    }

    final static void a(int param0, c param1) {
        try {
            RuntimeException var2 = null;
            mn var2_ref = null;
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
            java.lang.reflect.Field var7 = null;
            int var8_int = 0;
            byte[][] var8 = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            mn var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Method var17 = null;
            int stackIn_29_0 = 0;
            int stackIn_71_0 = 0;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            String stackIn_76_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_28_0 = 0;
            int stackOut_70_0 = 0;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            String stackOut_75_2 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            var16 = null;
            var12 = EscapeVector.field_A;
            try {
              L0: {
                var13 = (mn) (Object) je.field_a.a(false);
                var2_ref = var13;
                if (var2_ref == null) {
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
                    L3: {
                      L4: {
                        if (~var2_ref.field_i >= ~var4) {
                          break L4;
                        } else {
                          if (var12 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (null != var13.field_r[var4]) {
                                L6: {
                                  if (var13.field_r[var4].field_f != 2) {
                                    break L6;
                                  } else {
                                    var13.field_o[var4] = -5;
                                    break L6;
                                  }
                                }
                                if (var13.field_r[var4].field_f != 0) {
                                  break L5;
                                } else {
                                  var3 = 1;
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (null != var13.field_p[var4]) {
                                L8: {
                                  if (2 == var13.field_p[var4].field_f) {
                                    var13.field_o[var4] = -6;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                if (var13.field_p[var4].field_f != 0) {
                                  break L7;
                                } else {
                                  var3 = 1;
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            var4++;
                            if (var12 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var3 != 0) {
                        break L3;
                      } else {
                        var4 = param1.field_m;
                        param1.a((byte) 125, var2_ref.field_g);
                        var5 = 0;
                        L9: while (true) {
                          L10: {
                            L11: {
                              if (~var5 <= ~var2_ref.field_i) {
                                break L11;
                              } else {
                                stackOut_28_0 = 0;
                                stackIn_71_0 = stackOut_28_0;
                                stackIn_29_0 = stackOut_28_0;
                                if (var12 != 0) {
                                  break L10;
                                } else {
                                  L12: {
                                    L13: {
                                      if (stackIn_29_0 != var13.field_o[var5]) {
                                        param1.f(var13.field_o[var5], -123);
                                        if (var12 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    try {
                                      L14: {
                                        L15: {
                                          L16: {
                                            var6_int = var13.field_m[var5];
                                            if (var6_int != 0) {
                                              break L16;
                                            } else {
                                              var7 = (java.lang.reflect.Field) var13.field_r[var5].field_b;
                                              var8_int = var7.getInt((Object) null);
                                              param1.f(0, -123);
                                              param1.a((byte) 123, var8_int);
                                              if (var12 == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (var6_int != 1) {
                                              break L17;
                                            } else {
                                              var14 = (java.lang.reflect.Field) var13.field_r[var5].field_b;
                                              var7 = var14;
                                              var14.setInt((Object) null, var13.field_j[var5]);
                                              param1.f(0, -123);
                                              if (var12 == 0) {
                                                break L15;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          if (var6_int != 2) {
                                            break L15;
                                          } else {
                                            var15 = (java.lang.reflect.Field) var13.field_r[var5].field_b;
                                            var8_int = var15.getModifiers();
                                            param1.f(0, -123);
                                            param1.a((byte) 125, var8_int);
                                            break L15;
                                          }
                                        }
                                        L18: {
                                          L19: {
                                            L20: {
                                              if (var6_int == 3) {
                                                break L20;
                                              } else {
                                                if (var6_int != 4) {
                                                  break L19;
                                                } else {
                                                  var17 = (java.lang.reflect.Method) var13.field_p[var5].field_b;
                                                  var8_int = var17.getModifiers();
                                                  param1.f(0, param0 ^ 20166);
                                                  param1.a((byte) 124, var8_int);
                                                  if (var12 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                            var17 = (java.lang.reflect.Method) var13.field_p[var5].field_b;
                                            var8 = var13.field_l[var5];
                                            var9 = new Object[var8.length];
                                            var10_int = 0;
                                            L21: while (true) {
                                              L22: {
                                                if (~var10_int <= ~var8.length) {
                                                  break L22;
                                                } else {
                                                  var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var8[var10_int]));
                                                  var9[var10_int] = var11.readObject();
                                                  var10_int++;
                                                  if (var12 != 0) {
                                                    break L19;
                                                  } else {
                                                    if (var12 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                              }
                                              L23: {
                                                var10 = var17.invoke((Object) null, var9);
                                                if (var10 != null) {
                                                  break L23;
                                                } else {
                                                  param1.f(0, -123);
                                                  if (var12 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              L24: {
                                                if (!(var10 instanceof Number)) {
                                                  break L24;
                                                } else {
                                                  param1.f(1, param0 + 20034);
                                                  param1.a(((Number) var10).longValue(), (byte) -23);
                                                  if (var12 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              L25: {
                                                if (var10 instanceof String) {
                                                  break L25;
                                                } else {
                                                  param1.f(4, -123);
                                                  if (var12 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              param1.f(2, -123);
                                              param1.a((String) var10, 77);
                                              break L18;
                                            }
                                          }
                                          break L18;
                                        }
                                        break L14;
                                      }
                                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                      decompiledCaughtException = decompiledCaughtParameter4;
                                      L30: {
                                        var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                        param1.f(-14, -123);
                                        break L30;
                                      }
                                    } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                      decompiledCaughtException = decompiledCaughtParameter5;
                                      L31: {
                                        var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                        param1.f(-15, -123);
                                        break L31;
                                      }
                                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                      decompiledCaughtException = decompiledCaughtParameter6;
                                      L32: {
                                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                        param1.f(-16, -123);
                                        break L32;
                                      }
                                    } catch (java.io.IOException decompiledCaughtParameter8) {
                                      decompiledCaughtException = decompiledCaughtParameter8;
                                      L34: {
                                        var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                        param1.f(-18, -123);
                                        break L34;
                                      }
                                    } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                      decompiledCaughtException = decompiledCaughtParameter9;
                                      L35: {
                                        var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                        param1.f(-19, -123);
                                        break L35;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter10) {
                                      decompiledCaughtException = decompiledCaughtParameter10;
                                      L36: {
                                        var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                        param1.f(-20, -123);
                                        break L36;
                                      }
                                    } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                      decompiledCaughtException = decompiledCaughtParameter11;
                                      L37: {
                                        var6_ref11 = decompiledCaughtException;
                                        param1.f(-21, param0 ^ 20166);
                                        break L37;
                                      }
                                    }
                                    break L12;
                                  }
                                  var5++;
                                  if (var12 == 0) {
                                    continue L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            stackOut_70_0 = param1.c(var4, param0 ^ 20130);
                            stackIn_71_0 = stackOut_70_0;
                            break L10;
                          }
                          var2_ref.c((byte) -38);
                          break L0;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L38: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_73_0 = (RuntimeException) var2;
                stackOut_73_1 = new StringBuilder().append("mf.W(").append(param0).append(44);
                stackIn_75_0 = stackOut_73_0;
                stackIn_75_1 = stackOut_73_1;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                if (param1 == null) {
                  stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                  stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                  stackOut_75_2 = "null";
                  stackIn_76_0 = stackOut_75_0;
                  stackIn_76_1 = stackOut_75_1;
                  stackIn_76_2 = stackOut_75_2;
                  break L38;
                } else {
                  stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                  stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                  stackOut_74_2 = "{...}";
                  stackIn_76_0 = stackOut_74_0;
                  stackIn_76_1 = stackOut_74_1;
                  stackIn_76_2 = stackOut_74_2;
                  break L38;
                }
              }
              throw t.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 41);
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
        mf.a(84, (c) null);
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, ed param3, int param4) {
        RuntimeException var5 = null;
        Random var5_ref = null;
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
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            if (param4 <= -87) {
              var5_ref = new Random();
              param1 = param1 + param3.field_q;
              param0 = param0 + param3.field_v;
              var6 = 0;
              L1: while (true) {
                stackOut_4_0 = var6;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_5_0 >= param3.field_x) {
                      break L3;
                    } else {
                      var7 = var5_ref.nextGaussian();
                      if (var16 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L4: {
                          if (var7 > -64.0) {
                            break L4;
                          } else {
                            var7 = -64.0;
                            break L4;
                          }
                        }
                        L5: {
                          if (var7 < 64.0) {
                            break L5;
                          } else {
                            var7 = 64.0;
                            break L5;
                          }
                        }
                        L6: {
                          var9 = (int)((double)param2 * var7) + param1;
                          var10 = param3.field_s * var6;
                          var11 = (var6 + param0) * 640 - -var9;
                          if (0 <= var9) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L6;
                          } else {
                            stackOut_12_0 = -var9;
                            stackIn_14_0 = stackOut_12_0;
                            break L6;
                          }
                        }
                        L7: {
                          var12 = stackIn_14_0;
                          if (640 < param3.field_s + var9) {
                            stackOut_16_0 = 640 - var9;
                            stackIn_17_0 = stackOut_16_0;
                            break L7;
                          } else {
                            stackOut_15_0 = param3.field_s;
                            stackIn_17_0 = stackOut_15_0;
                            break L7;
                          }
                        }
                        var13 = stackIn_17_0;
                        var14 = var12;
                        L8: while (true) {
                          if (var14 >= var13) {
                            var6++;
                            if (var16 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            var15 = param3.field_B[var14 + var10];
                            stackOut_19_0 = var15;
                            stackIn_5_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var16 != 0) {
                              continue L2;
                            } else {
                              L9: {
                                if (stackIn_20_0 != 0) {
                                  em.field_i[var14 + var11] = var15;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var14++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("mf.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw t.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param4 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final synchronized void c(int param0, int param1) {
        L0: {
          L1: {
            if (!((mf) this).field_c) {
              break L1;
            } else {
              ((mf) this).field_j[param0] = (Object) (Object) ((mf) this).field_i.a((byte) -73, param0);
              if (EscapeVector.field_A == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((mf) this).field_j[param0] = bk.a(false, ((mf) this).field_i.a((byte) -47, param0), 9);
          break L0;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 < 9) {
          return false;
        } else {
          L0: {
            if (param1 == -64) {
              break L0;
            } else {
              field_m = null;
              break L0;
            }
          }
          if (14 <= param0) {
            return false;
          } else {
            return true;
          }
        }
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
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
            stackOut_11_1 = new StringBuilder().append("mf.K(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized byte[] a(byte param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                    L5: {
                      if (1 != ((mf) this).field_h) {
                        break L5;
                      } else {
                        ((mf) this).field_e[param3][param2] = null;
                        if (((mf) this).field_g.field_e[param3] != 1) {
                          break L4;
                        } else {
                          ((mf) this).field_e[param3] = null;
                          if (EscapeVector.field_A == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (2 == ((mf) this).field_h) {
                      ((mf) this).field_e[param3] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (param0 == 75) {
                    break L6;
                  } else {
                    int discarded$1 = ((mf) this).a(-120);
                    break L6;
                  }
                }
                stackOut_27_0 = var5;
                stackIn_28_0 = stackOut_27_0;
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
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_29_0 = var5;
            stackOut_29_1 = new StringBuilder().append("mf.J(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_28_0;
    }

    private final synchronized boolean a(int param0, byte param1) {
        int var3 = 0;
        var3 = -14 % ((-55 - param1) / 56);
        if (!((mf) this).b(0)) {
          return false;
        } else {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param0 >= ((mf) this).field_g.field_e.length) {
                break L0;
              } else {
                if (0 == ((mf) this).field_g.field_e[param0]) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
          }
          if (uj.field_d) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        }
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param1, (byte) 33)) {
          return false;
        } else {
          L0: {
            if (param0 >= 81) {
              break L0;
            } else {
              ((byte[]) ((mf) this).field_j[11])[30] = (byte) 8;
              break L0;
            }
          }
          if (((mf) this).field_j[param1] == null) {
            this.c(param1, 14);
            if (null != ((mf) this).field_j[param1]) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((mf) this).b(param1 ^ param1)) {
          L0: {
            if (param2 < 0) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param2 >= ((mf) this).field_g.field_e.length) {
                  break L0;
                } else {
                  if (param0 >= ((mf) this).field_g.field_e[param2]) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (uj.field_d) {
            throw new IllegalArgumentException(param2 + " " + param0);
          } else {
            return false;
          }
        } else {
          return false;
        }
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        var5 = EscapeVector.field_A;
        if (!((mf) this).b(0)) {
          return false;
        } else {
          L0: {
            if (param0 == -119) {
              break L0;
            } else {
              byte[] discarded$2 = ((mf) this).a((byte) -91, (String) null, (String) ((mf) this).field_j[0], (int[]) null);
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 < ((mf) this).field_g.field_d.length) {
              stackOut_8_0 = ((mf) this).field_g.field_d[var3];
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (var5 == 0) {
                var4 = stackIn_10_0;
                if (((mf) this).field_j[var4] == null) {
                  L2: {
                    this.c(var4, 14);
                    if (null != ((mf) this).field_j[var4]) {
                      break L2;
                    } else {
                      var2 = 0;
                      break L2;
                    }
                  }
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                return stackIn_9_0 != 0;
              }
            } else {
              return var2 != 0;
            }
          }
        }
    }

    final synchronized int b(int param0, int param1) {
        L0: {
          if (param0 == 3210) {
            break L0;
          } else {
            mf.c(69);
            break L0;
          }
        }
        if (this.a(param1, (byte) 48)) {
          if (((mf) this).field_j[param1] != null) {
            return 100;
          } else {
            return ((mf) this).field_i.a(0, param1);
          }
        } else {
          return 0;
        }
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        n var10 = null;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        n var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_23_0 = 0;
        int[] stackIn_25_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_126_0 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_12_0 = null;
        int stackOut_22_0 = 0;
        int[] stackOut_24_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_59_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        var22 = EscapeVector.field_A;
        try {
          L0: {
            if (this.a(param3, (byte) 109)) {
              if (null != ((mf) this).field_j[param3]) {
                L1: {
                  var5_int = ((mf) this).field_g.field_i[param3];
                  var6 = ((mf) this).field_g.field_a[param3];
                  if (((mf) this).field_e[param3] == null) {
                    ((mf) this).field_e[param3] = new Object[((mf) this).field_g.field_e[param3]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((mf) this).field_e[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var9_int >= var5_int) {
                        break L4;
                      } else {
                        stackOut_12_0 = (int[]) var6;
                        stackIn_25_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_13_0 == null) {
                                break L6;
                              } else {
                                var10_int = var6[var9_int];
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var9_int;
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] != null) {
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
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    } else {
                      stackOut_24_0 = (int[]) param0;
                      stackIn_25_0 = stackOut_24_0;
                      break L3;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_25_0 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (0 != param0[0]) {
                            break L10;
                          } else {
                            if (-1 != param0[1]) {
                              break L10;
                            } else {
                              if (-1 != param0[2]) {
                                break L10;
                              } else {
                                if (param0[3] == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = fk.a(((mf) this).field_j[param3], (byte) -116, true);
                        var10 = new n(var9_array);
                        var10.a(5, param0, var10.field_g.length, 6528);
                        break L8;
                      }
                    }
                    var9_array = fk.a(((mf) this).field_j[param3], (byte) -117, false);
                    break L8;
                  }
                  try {
                    L11: {
                      L12: {
                        if (param1 == -7951) {
                          break L12;
                        } else {
                          int discarded$1 = ((mf) this).a((String) ((mf) this).field_j[3], ((int[]) ((mf) this).field_j[2])[1]);
                          break L12;
                        }
                      }
                      var23 = s.a((byte) -26, var9_array);
                      var10_array = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_37_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_37_1 = new StringBuilder();
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (param0 == null) {
                        stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                        stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                        stackOut_39_2 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        break L13;
                      } else {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        break L13;
                      }
                    }
                    throw t.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + " " + param3 + " " + param0.length + " " + ji.a(255, param0.length, var9_array) + " " + ji.a(255, -2 + param0.length, var9_array) + " " + ((mf) this).field_g.field_l[param3] + " " + ((mf) this).field_g.field_b);
                  }
                  L14: {
                    if (!((mf) this).field_c) {
                      break L14;
                    } else {
                      ((mf) this).field_j[param3] = null;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var5_int <= 1) {
                          break L17;
                        } else {
                          L18: {
                            if (((mf) this).field_h != 2) {
                              break L18;
                            } else {
                              var11 = var23.length;
                              var11--;
                              var12 = 255 & var23[var11];
                              var11 = var11 - 4 * var5_int * var12;
                              var13 = new n(var10_array);
                              var14_int = 0;
                              var15_int = 0;
                              var13.field_m = var11;
                              var16 = 0;
                              L19: while (true) {
                                L20: {
                                  if (var16 >= var12) {
                                    stackOut_59_0 = 0;
                                    stackIn_60_0 = stackOut_59_0;
                                    break L20;
                                  } else {
                                    var17 = 0;
                                    stackOut_47_0 = 0;
                                    stackIn_60_0 = stackOut_47_0;
                                    stackIn_48_0 = stackOut_47_0;
                                    if (var22 != 0) {
                                      break L20;
                                    } else {
                                      var18 = stackIn_48_0;
                                      L21: while (true) {
                                        L22: {
                                          if (var5_int <= var18) {
                                            var16++;
                                            break L22;
                                          } else {
                                            var17 = var17 + var13.g(-5053);
                                            if (var22 != 0) {
                                              break L22;
                                            } else {
                                              L23: {
                                                L24: {
                                                  if (var6 != null) {
                                                    break L24;
                                                  } else {
                                                    var19 = var18;
                                                    if (var22 == 0) {
                                                      break L23;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                var19 = var6[var18];
                                                break L23;
                                              }
                                              L25: {
                                                if (var19 != param2) {
                                                  break L25;
                                                } else {
                                                  var14_int = var14_int + var17;
                                                  var15_int = var19;
                                                  break L25;
                                                }
                                              }
                                              var18++;
                                              continue L21;
                                            }
                                          }
                                        }
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                                if (stackIn_60_0 != var14_int) {
                                  var16_ref_byte__ = new byte[var14_int];
                                  var13.field_m = var11;
                                  var14_int = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L26: while (true) {
                                    if (var12 <= var18) {
                                      var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                      if (var22 == 0) {
                                        break L16;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      var19 = 0;
                                      stackOut_65_0 = 0;
                                      stackIn_126_0 = stackOut_65_0;
                                      stackIn_66_0 = stackOut_65_0;
                                      if (var22 != 0) {
                                        break L15;
                                      } else {
                                        var20 = stackIn_66_0;
                                        L27: while (true) {
                                          L28: {
                                            if (var5_int <= var20) {
                                              var18++;
                                              break L28;
                                            } else {
                                              var19 = var19 + var13.g(-5053);
                                              if (var22 != 0) {
                                                break L28;
                                              } else {
                                                L29: {
                                                  L30: {
                                                    if (var6 != null) {
                                                      break L30;
                                                    } else {
                                                      var21 = var20;
                                                      if (var22 == 0) {
                                                        break L29;
                                                      } else {
                                                        break L30;
                                                      }
                                                    }
                                                  }
                                                  var21 = var6[var20];
                                                  break L29;
                                                }
                                                L31: {
                                                  if (param2 != var21) {
                                                    break L31;
                                                  } else {
                                                    qg.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                                    var14_int = var14_int + var19;
                                                    break L31;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                continue L27;
                                              }
                                            }
                                          }
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  stackOut_61_0 = 1;
                                  stackIn_62_0 = stackOut_61_0;
                                  return stackIn_62_0 != 0;
                                }
                              }
                            }
                          }
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var13 = new n(var10_array);
                          var13.field_m = var11;
                          var14 = new int[var5_int];
                          var15_int = 0;
                          L32: while (true) {
                            L33: {
                              if (var15_int >= var12) {
                                stackOut_88_0 = var5_int;
                                stackIn_89_0 = stackOut_88_0;
                                break L33;
                              } else {
                                var16 = 0;
                                stackOut_80_0 = 0;
                                stackIn_89_0 = stackOut_80_0;
                                stackIn_81_0 = stackOut_80_0;
                                if (var22 != 0) {
                                  break L33;
                                } else {
                                  var17 = stackIn_81_0;
                                  L34: while (true) {
                                    L35: {
                                      if (var17 >= var5_int) {
                                        var15_int++;
                                        break L35;
                                      } else {
                                        var16 = var16 + var13.g(-5053);
                                        var14[var17] = var14[var17] + var16;
                                        var17++;
                                        if (var22 != 0) {
                                          break L35;
                                        } else {
                                          continue L34;
                                        }
                                      }
                                    }
                                    continue L32;
                                  }
                                }
                              }
                            }
                            var15 = new byte[stackIn_89_0][];
                            var16 = 0;
                            L36: while (true) {
                              L37: {
                                if (var5_int <= var16) {
                                  var13.field_m = var11;
                                  var16 = 0;
                                  break L37;
                                } else {
                                  var15[var16] = new byte[var14[var16]];
                                  var14[var16] = 0;
                                  var16++;
                                  if (var22 != 0) {
                                    break L37;
                                  } else {
                                    continue L36;
                                  }
                                }
                              }
                              var17 = 0;
                              L38: while (true) {
                                L39: {
                                  if (var17 >= var12) {
                                    stackOut_105_0 = 0;
                                    stackIn_106_0 = stackOut_105_0;
                                    break L39;
                                  } else {
                                    var18 = 0;
                                    stackOut_97_0 = 0;
                                    stackIn_106_0 = stackOut_97_0;
                                    stackIn_98_0 = stackOut_97_0;
                                    if (var22 != 0) {
                                      break L39;
                                    } else {
                                      var19 = stackIn_98_0;
                                      L40: while (true) {
                                        L41: {
                                          if (var5_int <= var19) {
                                            var17++;
                                            break L41;
                                          } else {
                                            var18 = var18 + var13.g(-5053);
                                            qg.a(var23, var16, var15[var19], var14[var19], var18);
                                            var16 = var16 + var18;
                                            var14[var19] = var14[var19] + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L41;
                                            } else {
                                              continue L40;
                                            }
                                          }
                                        }
                                        continue L38;
                                      }
                                    }
                                  }
                                }
                                var17 = stackIn_106_0;
                                L42: while (true) {
                                  if (var5_int <= var17) {
                                    if (var22 == 0) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    if (var22 != 0) {
                                      break L16;
                                    } else {
                                      L43: {
                                        L44: {
                                          if (var6 != null) {
                                            break L44;
                                          } else {
                                            var18 = var17;
                                            if (var22 == 0) {
                                              break L43;
                                            } else {
                                              break L44;
                                            }
                                          }
                                        }
                                        var18 = var6[var17];
                                        break L43;
                                      }
                                      L45: {
                                        L46: {
                                          if (((mf) this).field_h == 0) {
                                            break L46;
                                          } else {
                                            var7[var18] = (Object) (Object) var15[var17];
                                            if (var22 == 0) {
                                              break L45;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        var7[var18] = bk.a(false, var15[var17], n.a(param1, -7944));
                                        break L45;
                                      }
                                      var17++;
                                      continue L42;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L47: {
                        L48: {
                          if (var6 != null) {
                            break L48;
                          } else {
                            var11 = 0;
                            if (var22 == 0) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        var11 = var6[0];
                        break L47;
                      }
                      L49: {
                        if (((mf) this).field_h != 0) {
                          break L49;
                        } else {
                          var7[var11] = bk.a(false, var23, 9);
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L49;
                          }
                        }
                      }
                      var7[var11] = (Object) (Object) var23;
                      return true;
                    }
                    stackOut_125_0 = 1;
                    stackIn_126_0 = stackOut_125_0;
                    break L15;
                  }
                  break L0;
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
          L50: {
            var5 = decompiledCaughtException;
            stackOut_127_0 = (RuntimeException) var5;
            stackOut_127_1 = new StringBuilder().append("mf.T(");
            stackIn_129_0 = stackOut_127_0;
            stackIn_129_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param0 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L50;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_130_0 = stackOut_128_0;
              stackIn_130_1 = stackOut_128_1;
              stackIn_130_2 = stackOut_128_2;
              break L50;
            }
          }
          throw t.a((Throwable) (Object) stackIn_130_0, stackIn_130_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_126_0 != 0;
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
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        if (null != ((mf) this).field_g) {
            return true;
        }
        ((mf) this).field_g = ((mf) this).field_i.a(29192);
        if (!(null != ((mf) this).field_g)) {
            return false;
        }
        ((mf) this).field_j = new Object[((mf) this).field_g.field_k];
        ((mf) this).field_e = new Object[((mf) this).field_g.field_k][];
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
