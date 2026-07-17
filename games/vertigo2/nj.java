/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_e;
    static String field_f;
    static int[] field_a;
    li field_h;
    static String[] field_i;
    static np field_b;
    static String field_c;
    static int field_d;
    private li field_g;

    final li b(byte param0) {
        li var2 = null;
        if (param0 == -43) {
          var2 = ((nj) this).field_h.field_c;
          if (var2 == ((nj) this).field_h) {
            return null;
          } else {
            var2.c(2);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(li param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0.field_a != null) {
                param0.c(2);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_c = ((nj) this).field_h;
            param0.field_a = ((nj) this).field_h.field_a;
            param0.field_a.field_c = param0;
            param0.field_c.field_a = param0;
            if (!param1) {
              break L0;
            } else {
              ((nj) this).field_h = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("nj.F(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final static int a(String param0, int param1, ed param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3_int = param2.field_u;
            var5 = (CharSequence) (Object) param0;
            int discarded$2 = -711;
            var4 = bo.a(var5);
            param2.a(var4.length, (byte) -73);
            param2.field_u = param2.field_u + ko.field_M.a(0, -56, param2.field_p, param2.field_u, var4.length, var4);
            stackOut_0_0 = param2.field_u - var3_int;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("nj.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(7937).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final void c(int param0) {
        li var2 = null;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        L0: while (true) {
          var2 = ((nj) this).field_h.field_c;
          if (var2 == ((nj) this).field_h) {
            if (param0 != 0) {
              ((nj) this).field_g = null;
              ((nj) this).field_g = null;
              return;
            } else {
              ((nj) this).field_g = null;
              return;
            }
          } else {
            var2.c(param0 + 2);
            continue L0;
          }
        }
    }

    final li b(boolean param0) {
        li var2 = null;
        if (!param0) {
          var2 = ((nj) this).field_g;
          if (var2 == ((nj) this).field_h) {
            ((nj) this).field_g = null;
            return null;
          } else {
            ((nj) this).field_g = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_b = null;
        field_c = null;
        field_i = null;
    }

    final int c(boolean param0) {
        int var2 = 0;
        li var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = ((nj) this).field_h.field_c;
        if (param0) {
          L0: while (true) {
            if (((nj) this).field_h == var3) {
              return var2;
            } else {
              var3 = var3.field_c;
              var2++;
              continue L0;
            }
          }
        } else {
          field_e = -23;
          L1: while (true) {
            if (((nj) this).field_h == var3) {
              return var2;
            } else {
              var3 = var3.field_c;
              var2++;
              continue L1;
            }
          }
        }
    }

    final li a(byte param0) {
        if (param0 != 100) {
            return null;
        }
        li var2 = ((nj) this).field_h.field_c;
        if (!(((nj) this).field_h != var2)) {
            ((nj) this).field_g = null;
            return null;
        }
        ((nj) this).field_g = var2.field_c;
        return var2;
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_f = null;
            if (((nj) this).field_h.field_c != ((nj) this).field_h) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((nj) this).field_h.field_c != ((nj) this).field_h) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final li b(int param0) {
        li var2 = null;
        var2 = ((nj) this).field_g;
        if (((nj) this).field_h == var2) {
          ((nj) this).field_g = null;
          return null;
        } else {
          ((nj) this).field_g = var2.field_c;
          if (param0 < 23) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final li c(byte param0) {
        if (param0 >= -1) {
            return null;
        }
        li var2 = ((nj) this).field_h.field_a;
        if (!(((nj) this).field_h != var2)) {
            ((nj) this).field_g = null;
            return null;
        }
        ((nj) this).field_g = var2.field_a;
        return var2;
    }

    final void a(li param0, byte param1) {
        try {
            if (param1 != 27) {
                li discarded$0 = ((nj) this).d((byte) 69);
            }
            if (null != param0.field_a) {
                param0.c(2);
            }
            param0.field_c = ((nj) this).field_h.field_c;
            param0.field_a = ((nj) this).field_h;
            param0.field_a.field_c = param0;
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "nj.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final li d(byte param0) {
        li var2 = null;
        var2 = ((nj) this).field_h.field_a;
        if (((nj) this).field_h != var2) {
          var2.c(2);
          if (param0 != 92) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final li b(li param0, byte param1) {
        li var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        li stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_6_0 = null;
        Object stackOut_4_0 = null;
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
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((nj) this).field_h.field_c;
                break L1;
              }
            }
            if (((nj) this).field_h != var3) {
              ((nj) this).field_g = var3.field_c;
              var4 = -76 / ((54 - param1) / 55);
              stackOut_6_0 = (li) var3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((nj) this).field_g = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (li) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("nj.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    public nj() {
        ((nj) this).field_h = new li();
        ((nj) this).field_h.field_a = ((nj) this).field_h;
        ((nj) this).field_h.field_c = ((nj) this).field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Complete levels 1 to 10", "Achieve gold medal times in time trial mode across levels 1 to 10", "Complete levels 11 to 20", "Achieve gold medal times in time trial mode across levels 11 to 20", "Complete levels 21 to 30", "Achieve gold medal times in time trial mode across levels 21 to 30", "Complete levels 31 to 40", "Achieve gold medal times in time trial mode across levels 31 to 40", "Complete levels 41 to 50", "Achieve gold medal times in time trial mode across all levels", "Complete 15 levels in Co-op mode in one sitting", "Achieve a Rating of 1500 in Paint-off mode", "Win a Rated Paint-off round while in possession of the skull during Halloween"};
        field_f = "Passwords must be between 5 and 20 characters long";
        field_c = "ESC - cancel private message";
        field_a = new int[8192];
    }
}
