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
        ig.a(((qj) this).field_g, param4, (byte) -110, param1, param2, param0);
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
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -100) {
          L0: {
            ta discarded$2 = qj.a(false);
            var2 = param1.f(255);
            if (var2 == 1) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return var3 != 0;
        } else {
          L1: {
            var2 = param1.f(255);
            if (var2 == 1) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    final static boolean a(String param0, int param1) {
        Object var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (param1 < 40) {
          var3 = null;
          boolean discarded$2 = qj.a((String) null, -48);
          var4 = (CharSequence) (Object) param0;
          return wl.field_a.equals((Object) (Object) ta.a(-63, var4));
        } else {
          var5 = (CharSequence) (Object) param0;
          return wl.field_a.equals((Object) (Object) ta.a(-63, var5));
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -2942) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L0: {
              if (param1 < 2048) {
                stackOut_18_0 = sb.field_b[param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = sb.field_b[4096 + -param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param1 ^ -1) > -6145) {
                stackOut_14_0 = -sb.field_b[-4096 + param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -sb.field_b[-param1 + 8192];
                stackIn_15_0 = stackOut_13_0;
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
                stackOut_8_0 = sb.field_b[param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = sb.field_b[4096 + -param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param1 ^ -1) > -6145) {
                stackOut_4_0 = -sb.field_b[-4096 + param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -sb.field_b[-param1 + 8192];
                stackIn_5_0 = stackOut_3_0;
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
            ta stackOut_2_0 = null;
            try {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  ta discarded$2 = qj.a(true);
                  break L0;
                }
              }
              stackOut_2_0 = (ta) Class.forName("nd").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    qj(o[] param0) {
        ((qj) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "WORLD ";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_a = "Jump";
        field_f = "Score";
    }
}
