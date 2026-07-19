/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends kb {
    private String field_g;
    static String field_e;
    static String field_f;
    private String field_d;
    static int field_c;

    public static void b(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
            ng var2 = (ng) null;
            a.a((byte) 42, (ng) null);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            if (!(param0 > ig.field_a.field_h)) {
                return true;
            }
            if (null == jc.field_b) {
                return false;
            }
            int var2_int = jc.field_b.d(param1 + -16791);
            if (param1 != 10343) {
                return false;
            }
            if (!((var2_int ^ -1) >= -1)) {
                if (param0 - ig.field_a.field_h < var2_int) {
                    var2_int = param0 + -ig.field_a.field_h;
                }
                jc.field_b.a(ig.field_a.field_j, (byte) -109, var2_int, ig.field_a.field_h);
                ta.field_e = rf.c(0);
                ig.field_a.field_h = ig.field_a.field_h + var2_int;
                if (param0 > ig.field_a.field_h) {
                    return false;
                }
                ig.field_a.field_h = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if ((var2_int ^ -1) <= -1) {
                    if (vl.b(-91) <= 30000L) {
                        return false;
                    }
                }
                ck.b((byte) -120);
            } catch (IOException iOException) {
                ck.b((byte) -86);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        if (null == og.field_c) {
            return "";
        }
        return og.field_c;
    }

    final bj a(byte param0) {
        if (param0 != 45) {
            return (bj) null;
        }
        return jf.field_M;
    }

    final static int c(boolean param0) {
        if (!param0) {
            field_c = -69;
            return cg.field_l;
        }
        return cg.field_l;
    }

    final static void a(byte param0, ng param1) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bd var4 = null;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = new int[param1.b(2)];
              var2 = var6;
              var3 = 0;
              if (param0 <= -88) {
                break L1;
              } else {
                a.b(false);
                break L1;
              }
            }
            var4 = (bd) ((Object) param1.a(true));
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    incrementValue$6 = var3;
                    var3++;
                    var6[incrementValue$6] = var4.field_h;
                    var4 = (bd) ((Object) param1.f(2));
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var3 = 0;
                dd.a(var6, -23588);
                break L3;
              }
              var4 = (bd) ((Object) param1.a(true));
              L5: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  incrementValue$7 = var3;
                  var3++;
                  var4.field_h = var6[incrementValue$7];
                  var4 = (bd) ((Object) param1.f(2));
                  if (var5 == 0) {
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("a.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    a(String param0, String param1) {
        try {
            this.field_d = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(wf param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a((byte) -38, this.field_d);
              param0.a(0, this.field_g);
              if (param1 == 7895) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("a.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Back";
        field_f = "Just play";
    }
}
