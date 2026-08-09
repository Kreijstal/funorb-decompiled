/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static ji field_e;
    static String field_c;
    static String field_b;
    static String field_f;
    static String field_a;
    static int field_d;
    private o[] field_g;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1) {
            return;
        }
        ig.a(this.field_g, param4, (byte) -110, param1, param2, param0);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -6145) {
            return;
        }
        field_e = null;
        field_b = null;
        field_f = null;
    }

    final static boolean a(byte param0, va param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -100) {
                break L1;
              } else {
                qj.a(false);
                break L1;
              }
            }
            L2: {
              var2_int = param1.f(255);
              if (var2_int == 1) {
                stackIn_5_0 = 1;
                break L2;
              } else {
                stackIn_5_0 = 0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("qj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 40) {
                break L1;
              } else {
                var3 = (String) null;
                qj.a((String) null, -48);
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            stackIn_3_0 = wl.field_a.equals(ta.a(-63, var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qj.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0 == -2942) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L0: {
              if (param1 < 2048) {
                stackIn_19_0 = sb.field_b[param1];
                break L0;
              } else {
                stackIn_19_0 = sb.field_b[4096 + -param1];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param1 ^ -1) > -6145) {
                stackIn_15_0 = -sb.field_b[-4096 + param1];
                break L1;
              } else {
                stackIn_15_0 = -sb.field_b[-param1 + 8192];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          qj.a(42);
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L2: {
              if (param1 < 2048) {
                stackIn_9_0 = sb.field_b[param1];
                break L2;
              } else {
                stackIn_9_0 = sb.field_b[4096 + -param1];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param1 ^ -1) > -6145) {
                stackIn_5_0 = -sb.field_b[-4096 + param1];
                break L3;
              } else {
                stackIn_5_0 = -sb.field_b[-param1 + 8192];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static ta a(boolean param0) {
        try {
            Throwable var1 = null;
            ta stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    qj.a(true);
                    break L1;
                  }
                }
                stackIn_3_0 = (ta) (Class.forName("nd").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qj(o[] param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "WORLD ";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_a = "Jump";
        field_f = "Score";
    }
}
