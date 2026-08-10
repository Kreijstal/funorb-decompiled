/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b(0)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  mf.b(((int[]) (this.field_j[2]))[27], ((int[]) (this.field_j[15]))[0], ((int[]) (this.field_j[6]))[30]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_p.a(mh.a(param0 + 1, var4), 1);
              if (this.a(var3_int, (byte) -124)) {
                stackIn_10_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("mf.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
            field_a = (ed) null;
        }
        if (!(this.a(param2, 11315, param1))) {
            return false;
        }
        if (null != this.field_e[param1]) {
            if (!(null == this.field_e[param1][param2])) {
                return true;
            }
        }
        if (!(null == this.field_j[param1])) {
            return true;
        }
        this.c(param1, 14);
        if (null == this.field_j[param1]) {
            return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                      stackIn_12_0 = s.field_B;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("mf.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_p.a(mh.a(param0, var4), 1);
              stackIn_4_0 = this.d(118, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("mf.S(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b(0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var7 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_p.a(mh.a(0, var7), 1);
              if (!this.a(var4_int, (byte) 48)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = 10 / ((-13 - param2) / 52);
                var8 = (CharSequence) ((Object) param0);
                var5 = this.field_g.field_s[var4_int].a(mh.a(0, var8), 1);
                stackIn_9_0 = this.a(true, var4_int, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("mf.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(0)) {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (param0 == -4) {
                  break L1;
                } else {
                  this.a(((byte[]) (this.field_j[3]))[3]);
                  break L1;
                }
              }
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_p.a(mh.a(param0 + 4, var6), 1);
              if (this.a(var4_int, (byte) -113)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_g.field_s[var4_int].a(mh.a(0, var7), 1);
                stackIn_9_0 = this.a(var4_int, (byte) -97, var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("mf.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_9_0;
        }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(0)) {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var8 = (CharSequence) ((Object) param1);
              var5_int = this.field_g.field_p.a(mh.a(0, var8), 1);
              if (this.a(var5_int, (byte) 91)) {
                var6 = -115 / ((1 - param0) / 58);
                var9 = (CharSequence) ((Object) param2);
                var7 = this.field_g.field_s[var5_int].a(mh.a(0, var9), 1);
                stackIn_7_0 = this.a((byte) 75, param3, var7, var5_int);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("mf.BA(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = EscapeVector.field_A;
        if (!this.b(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_j.length) {
              if (-1 != (var2 ^ -1)) {
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
              if (this.field_g.field_i[var4] > 0) {
                var3 = var3 + this.b(3210, var4);
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
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
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
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = EscapeVector.field_A;
            try {
              L0: {
                var13 = (mn) ((Object) je.field_a.a(false));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L1: {
                    var3 = 0;
                    if (param0 == -20157) {
                      break L1;
                    } else {
                      field_f = (String[]) null;
                      break L1;
                    }
                  }
                  var4 = 0;
                  L2: while (true) {
                    if (var17.field_i <= var4) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = param1.field_m;
                        param1.a((byte) 125, var17.field_g);
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var17.field_i) {
                            param1.c(var4, param0 ^ 20130);
                            var17.c((byte) -38);
                            decompiledRegionSelector0 = 2;
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
                                        if (-2 != (var6_int ^ -1)) {
                                          if (-3 != (var6_int ^ -1)) {
                                            break L6;
                                          } else {
                                            var15 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                                            var8 = var15.getModifiers();
                                            param1.f(0, -123);
                                            param1.a((byte) 125, var8);
                                            break L6;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_j[var5]);
                                          param1.f(0, -123);
                                          break L6;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                                        var8 = var26.getInt((Object) null);
                                        param1.f(0, -123);
                                        param1.a((byte) 123, var8);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-4 == (var6_int ^ -1)) {
                                        var28 = (java.lang.reflect.Method) (var17.field_p[var5].field_b);
                                        var25 = var17.field_l[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param1.f(2, -123);
                                                  param1.a((String) (var10), 77);
                                                  break L7;
                                                } else {
                                                  param1.f(4, -123);
                                                  break L7;
                                                }
                                              } else {
                                                param1.f(1, param0 + 20034);
                                                param1.a(((Number) (var10)).longValue(), (byte) -23);
                                                break L7;
                                              }
                                            } else {
                                              param1.f(0, -123);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if ((var6_int ^ -1) != -5) {
                                          break L7;
                                        } else {
                                          var27 = (java.lang.reflect.Method) (var17.field_p[var5].field_b);
                                          var8 = var27.getModifiers();
                                          param1.f(0, param0 ^ 20166);
                                          param1.a((byte) 124, var8);
                                          break L7;
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.f(-10, -123);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.f(-11, param0 + 20034);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.f(-12, -123);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.f(-13, -123);
                                    break L12;
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
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.f(-17, -123);
                                    break L16;
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
                            if ((var13.field_r[var4].field_f ^ -1) != -3) {
                              break L22;
                            } else {
                              var13.field_o[var4] = -5;
                              break L22;
                            }
                          }
                          if (-1 != (var13.field_r[var4].field_f ^ -1)) {
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
                          if (var13.field_p[var4].field_f == 0) {
                            var3 = 1;
                            break L23;
                          } else {
                            var4++;
                            continue L2;
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
                stackIn_68_0 = (RuntimeException) (var2);

                stackIn_68_1 = new StringBuilder().append("mf.W(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackIn_69_2 = "null";
                  break L25;
                } else {
                  stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackIn_69_2 = "{...}";
                  break L25;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
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
            c var2 = (c) null;
            mf.a(84, (c) null);
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, ed param3, int param4) {
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  decompiledRegionSelector0 = 1;
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
                      stackIn_12_0 = 0;
                      break L4;
                    } else {
                      stackIn_12_0 = -var9;
                      break L4;
                    }
                  }
                  L5: {
                    var12 = stackIn_12_0;
                    if (640 < param3.field_s + var9) {
                      stackIn_15_0 = 640 - var9;
                      break L5;
                    } else {
                      stackIn_15_0 = param3.field_s;
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("mf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (this.field_c) {
            this.field_j[param0] = this.field_i.a((byte) -73, param0);
        } else {
            this.field_j[param0] = bk.a(false, this.field_i.a((byte) -47, param0), 9);
        }
        if (param1 != 14) {
            this.field_g = (f) null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(-10 >= (param0 ^ -1))) {
            return false;
        }
        if (param1 != -64) {
            field_m = (ed) null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b(param1)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_p.a(mh.a(param1 + 0, var4), 1);
              stackIn_5_0 = this.b(param1 ^ 3210, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("mf.CA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                ((long[]) (((Object[]) (this.field_j[15]))[4]))[3] = ((long[]) (this.field_j[12]))[2];
                break L1;
              }
            }
            if (!this.a(param0, (byte) -121)) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_s[param0].a(mh.a(0, var5), 1);
              if (this.a(var4_int, 11315, param0)) {
                stackIn_10_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("mf.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized byte[] a(byte param0, int[] param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(param2, 11315, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == this.field_e[param3]) {
                    break L2;
                  } else {
                    if (this.field_e[param3][param2] == null) {
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
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (null == this.field_e[param3]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (this.field_e[param3][param2] == null) {
                    break L3;
                  } else {
                    var7 = fk.a(this.field_e[param3][param2], (byte) -126, false);
                    var5 = var7;
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
                    if (1 != this.field_h) {
                      if (2 == this.field_h) {
                        this.field_e[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      this.field_e[param3][param2] = null;
                      if ((this.field_g.field_e[param3] ^ -1) != -2) {
                        break L4;
                      } else {
                        this.field_e[param3] = null;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (param0 == 75) {
                    break L5;
                  } else {
                    this.a(-120);
                    break L5;
                  }
                }
                stackIn_27_0 = var5;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = var5;

            stackIn_30_1 = new StringBuilder().append("mf.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_10_0);
          } else {
            return (byte[]) ((Object) stackIn_27_0);
          }
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        int var3 = -14 % ((-55 - param1) / 56);
        if (!(this.b(0))) {
            return false;
        }
        if ((param0 ^ -1) <= -1 && param0 < this.field_g.field_e.length && 0 != this.field_g.field_e[param0]) {
            return true;
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
            ((byte[]) (this.field_j[11]))[30] = (byte) 8;
        }
        if (this.field_j[param1] != null) {
            return true;
        }
        this.c(param1, 14);
        if (null != this.field_j[param1]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param1 ^ param1)) {
            return false;
        }
        if ((param2 ^ -1) <= -1 && param0 >= 0 && param2 < this.field_g.field_e.length && param0 < this.field_g.field_e[param2]) {
            return true;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(0)) {
              param0 = param0.toLowerCase();
              if (param1 < -102) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_g.field_p.a(mh.a(0, var4), 1);
                if (var3_int >= 0) {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("mf.R(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final synchronized boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        var5 = EscapeVector.field_A;
        if (!this.b(0)) {
          return false;
        } else {
          L0: {
            if (param0 == -119) {
              break L0;
            } else {
              var6 = (int[]) null;
              this.a((byte) -91, (String) null, (String) (this.field_j[0]), (int[]) null);
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_g.field_d.length) {
              return var2 != 0;
            } else {
              var4 = this.field_g.field_d[var3];
              if (this.field_j[var4] == null) {
                this.c(var4, 14);
                if (null == this.field_j[var4]) {
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
        if (this.field_j[param1] != null) {
            return 100;
        }
        return this.field_i.a(0, param1);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
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
        byte[] var25 = null;
        n var26 = null;
        byte[] var27 = null;
        n var29 = null;
        n var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = EscapeVector.field_A;
        try {
          L0: {
            if (this.a(param3, (byte) 109)) {
              if (null != this.field_j[param3]) {
                L1: {
                  var5_int = this.field_g.field_i[param3];
                  var34 = this.field_g.field_a[param3];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_e[param3] == null) {
                    array$0 = new Object[this.field_g.field_e[param3]];
                    this.field_e[param3] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_e[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var34[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10] != null) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
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
                              if (-1 != (param0[1] ^ -1)) {
                                break L7;
                              } else {
                                if (-1 != (param0[2] ^ -1)) {
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
                          var35 = fk.a(this.field_j[param3], (byte) -116, true);
                          var25 = var35;
                          var9 = var25;
                          var26 = new n(var35);
                          var26.a(5, param0, var26.field_g.length, 6528);
                          break L5;
                        }
                      }
                      var9 = fk.a(this.field_j[param3], (byte) -117, false);
                      break L5;
                    }
                    try {
                      L8: {
                        L9: {
                          if (param1 == -7951) {
                            break L9;
                          } else {
                            this.a((String) (this.field_j[3]), ((int[]) (this.field_j[2]))[1]);
                            break L9;
                          }
                        }
                        var36 = s.a((byte) -26, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_36_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_36_1 = new StringBuilder();

                        if (param0 == null) {
                          stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackIn_37_2 = 0;
                          break L10;
                        } else {
                          stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackIn_37_2 = 1;
                          break L10;
                        }
                      }
                      throw t.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param3 + " " + var9.length + " " + ji.a(255, var9.length, var9) + " " + ji.a(255, -2 + var9.length, var9) + " " + this.field_g.field_l[param3] + " " + this.field_g.field_b);
                    }
                    L11: {
                      if (!this.field_c) {
                        break L11;
                      } else {
                        this.field_j[param3] = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int <= 1) {
                        L13: {
                          if (var6 != null) {
                            var11 = var34[0];
                            break L13;
                          } else {
                            var11 = 0;
                            break L13;
                          }
                        }
                        if (this.field_h != 0) {
                          var7[var11] = var43;
                          break L12;
                        } else {
                          var7[var11] = bk.a(false, var36, 9);
                          break L12;
                        }
                      } else {
                        if (this.field_h != 2) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var31 = new n(var43);
                          var31.field_m = var11;
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var15_int = 0;
                          L14: while (true) {
                            if (var15_int >= var12) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L15: while (true) {
                                if (var5_int <= var16) {
                                  var31.field_m = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L16: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L17: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L18: {
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L18;
                                            } else {
                                              var18 = var17;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (this.field_h == 0) {
                                              var7[var18] = bk.a(false, var40[var17], n.a(param1, -7944));
                                              break L19;
                                            } else {
                                              var7[var18] = var40[var17];
                                              break L19;
                                            }
                                          }
                                          var17++;
                                          continue L17;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L20: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L16;
                                        } else {
                                          var18 = var18 + var31.g(-5053);
                                          qg.a(var43, var16, var40[var19], var39[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L15;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L21: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L14;
                                } else {
                                  var16 = var16 + var31.g(-5053);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var5_int * var12;
                          var29 = new n(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_m = var11;
                          var16 = 0;
                          L22: while (true) {
                            if (var16 >= var12) {
                              if (0 != var14_int) {
                                var44 = new byte[var14_int];
                                var29.field_m = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L23: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = var44;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L24: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L23;
                                      } else {
                                        L25: {
                                          var19 = var19 + var29.g(-5053);
                                          if (var6 != null) {
                                            var21 = var34[var20];
                                            break L25;
                                          } else {
                                            var21 = var20;
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (param2 != var21) {
                                            break L26;
                                          } else {
                                            qg.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L26;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L24;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_55_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L22;
                                } else {
                                  L28: {
                                    var17 = var17 + var29.g(-5053);
                                    if (var6 != null) {
                                      var19 = var34[var18];
                                      break L28;
                                    } else {
                                      var19 = var18;
                                      break L28;
                                    }
                                  }
                                  if (var19 == param2) {
                                    var14_int = var14_int + var17;
                                    var15_int = var19;
                                    var18++;
                                    continue L27;
                                  } else {
                                    var18++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_99_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_102_0 = (RuntimeException) (var5);

            stackIn_102_1 = new StringBuilder().append("mf.T(");

            if (param0 == null) {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "null";
              break L29;
            } else {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "{...}";
              break L29;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_55_0 != 0;
              } else {
                return stackIn_99_0 != 0;
              }
            }
          }
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -97) {
            return (byte[]) null;
        }
        return this.a((byte) 75, (int[]) null, param2, param0);
    }

    mf(ob param0, boolean param1, int param2) {
        this.field_g = null;
        try {
            if (0 > param2 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_c = param1 ? true : false;
            this.field_h = param2;
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        if (null == this.field_g) {
            this.field_g = this.field_i.a(29192);
            if (!(null != this.field_g)) {
                return false;
            }
            this.field_j = new Object[this.field_g.field_k];
            this.field_e = new Object[this.field_g.field_k][];
        }
        return true;
    }

    static {
        field_a = new ed(7, 7);
        field_d = new tk();
        field_f = new String[]{"Retrieval - Hard: complete the asteroid<nbsp>levels", "Retrieval - Hard: complete the baked moon<nbsp>levels", "Retrieval - Hard: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Hard", "Retrieval - Hard:<br>get 25,000<nbsp>points", "Retrieval - Hard:<br>get 100,000<nbsp>points", "Retrieval: complete a level with more than 2500<nbsp>fuel", "Retrieval - Hard: destroy an alien laser gate and complete the<nbsp>level", "Blow yourself up at speed in the mothership's auto-shield<nbsp>area", "Retrieval - Hard: complete all levels in under 30<nbsp>minutes", "Retrieval - Hard: complete all levels in under 20<nbsp>minutes", "Retrieval - Hard: collect all power-ups in one<nbsp>session", "Retrieval - Hard: destroy all possible alien infrastructure in one<nbsp>session", "Retrieval - Hard: complete 'Force Matrix Defence', without using the<nbsp>power-up", "Retrieval - Hard: complete 'Seeker Caves', without using your shield or<nbsp>shooting", "Retrieval - Hard: complete 'High-Security Stronghold', destroying no more than four green<nbsp>pods", "Retrieval - Hard: complete 'Seeker Prison Cell', without using your<nbsp>shield", "Land on one of the attractors in 'Force Matrix<nbsp>Defence' in Retrieval", "Retrieval - Normal: complete the asteroid<nbsp>levels", "Retrieval - Normal: complete the baked moon<nbsp>levels", "Retrieval - Normal: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Normal", "Complete the asteroids stage in Retribution", "Complete the sun-baked moon stage in Retribution", "Complete the icy moon stage on Retribution", "Complete the Retribution level set", "Score 350,000 points in Retribution", "Score 800,000 points in Retribution", "Destroy all alien infrastructure in Retribution", "Complete the Simulator level set", "Complete 'Pinball' on Simulator", "Complete 'Anti-gravity' on Simulator"};
        field_k = new hf();
    }
}
