/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo extends li implements dr {
    static int[] field_d;
    private bm field_c;

    final static uc a(byte param0, int param1, int param2, int param3, int param4) {
        uc var5 = null;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var5 = (uc) (Object) nh.field_g.d(268435455);
        L0: while (true) {
          if (var5 != null) {
            if (param4 != var5.field_n) {
              var5 = (uc) (Object) nh.field_g.b((byte) 103);
              continue L0;
            } else {
              return var5;
            }
          } else {
            var5 = new uc();
            var5.field_n = param4;
            var5.field_j = 10;
            var5.field_m = 1;
            nh.field_g.a(81, (wf) (Object) var5);
            ag.a(3, 5, var5);
            return var5;
          }
        }
    }

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 26921) {
          if (null != ((vo) this).field_c.field_f) {
            if (((vo) this).field_c.field_f.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_d = null;
          if (null == ((vo) this).field_c.field_f) {
            return true;
          } else {
            L0: {
              if (((vo) this).field_c.field_f.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void b(bm param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              if (param1 == -40) {
                break L1;
              } else {
                var4 = null;
                ((vo) this).a((bm) null, -56);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vo.V(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public final void a(bm param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              ((vo) this).a((byte) 97);
              if (param1 == -6525) {
                break L1;
              } else {
                var4 = null;
                ((vo) this).b((bm) null, -98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vo.W(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final String b(int param0) {
        Object var3 = null;
        if (param0 != 8192) {
          var3 = null;
          String discarded$2 = ((vo) this).a((String) null, (byte) -68);
          return ((vo) this).a(((vo) this).field_c.field_f, (byte) 72);
        } else {
          return ((vo) this).a(((vo) this).field_c.field_f, (byte) 72);
        }
    }

    abstract String a(String param0, byte param1);

    final pt c(int param0) {
        if (param0 != 0) {
          boolean discarded$2 = ((vo) this).a(83);
          return ((vo) this).a(((vo) this).field_c.field_f, param0 + 8192);
        } else {
          return ((vo) this).a(((vo) this).field_c.field_f, param0 + 8192);
        }
    }

    abstract pt a(String param0, int param1);

    vo(bm param0) {
        try {
            ((vo) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vo.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void d(int param0) {
        if (param0 != 14695) {
            vo.d(89);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
