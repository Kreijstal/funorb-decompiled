/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ob {
    static String field_q;
    static nq field_p;
    static int field_r;
    private int field_n;
    static in field_m;
    private mh field_o;

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = ((sl) this).field_n >> 3;
        if (param0 > 76) {
          var4 = -(7 & ((sl) this).field_n) + 8;
          var5 = 0;
          ((sl) this).field_n = ((sl) this).field_n + param1;
          L0: while (true) {
            if (var4 >= param1) {
              L1: {
                if (var4 == param1) {
                  var5 = var5 + (rq.field_j[var4] & ((sl) this).field_h[var3]);
                  break L1;
                } else {
                  var5 = var5 + (((sl) this).field_h[var3] >> var4 - param1 & rq.field_j[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((((sl) this).field_h[incrementValue$2] & rq.field_j[var4]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((sl) this).i((byte) 45);
          var4 = -(7 & ((sl) this).field_n) + 8;
          var5 = 0;
          ((sl) this).field_n = ((sl) this).field_n + param1;
          L2: while (true) {
            if (var4 >= param1) {
              L3: {
                if (var4 == param1) {
                  var5 = var5 + (rq.field_j[var4] & ((sl) this).field_h[var3]);
                  break L3;
                } else {
                  var5 = var5 + (((sl) this).field_h[var3] >> var4 - param1 & rq.field_j[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((((sl) this).field_h[incrementValue$3] & rq.field_j[var4]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = ((sl) this).field_j;
        ((sl) this).field_j = ((sl) this).field_j + 1;
        ((sl) this).field_h[fieldTemp$0] = (byte)(((sl) this).field_o.d(13) + param0);
        if (param1 != 255) {
            field_r = -37;
        }
    }

    sl(byte[] param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param0 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((sl) this).field_j;
                ((sl) this).field_j = ((sl) this).field_j + 1;
                param3[param2 + var5_int] = (byte)(((sl) this).field_h[fieldTemp$5] + -((sl) this).field_o.d(13));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("sl.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static e j(byte param0) {
        return new e(of.a((byte) 42), bo.q(-108));
    }

    public static void l(int param0) {
        field_q = null;
        field_p = null;
        field_m = null;
    }

    sl(int param0) {
        super(param0);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                if (param2 > 33) {
                  break L0;
                } else {
                  field_p = null;
                  break L0;
                }
              }
              try {
                L1: {
                  var3 = new java.net.URL(param1.getCodeBase(), param0);
                  var3 = jg.a(param1, false, var3);
                  ue.a(param1, true, var3.toString(), -102);
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("sl.C(");
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
              L3: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
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
              throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static lp a(int param0, int param1, fs param2, int param3) {
        RuntimeException var4 = null;
        uc var5 = null;
        ff var6 = null;
        qk var7 = null;
        lp var8 = null;
        lp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        lp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var8 = new lp(0, 0, 182, kb.field_y.field_o - -4);
              var5 = new uc(0, var8.field_i / 2 - 3, param3, 6, 0, param2.field_k);
              var8.a((vd) (Object) var5, 8);
              if (param1 == -30577) {
                break L1;
              } else {
                field_r = 123;
                break L1;
              }
            }
            var6 = new ff(-(param2.field_v.field_o / 2) + param3, -(param2.field_v.field_p / 2) + var8.field_i / 2, param2.field_v);
            var8.a((vd) (Object) var6, 8);
            var7 = new qk(-(param2.field_v.field_o / 2) + param3, var8.field_i / 2 + -(rs.field_Cb.field_J / 2), param2.field_v.field_o, rs.field_Cb.field_J, Integer.toString(param0));
            var8.a((vd) (Object) var7, 8);
            stackOut_2_0 = (lp) var8;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("sl.L(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int[] param0, byte param1) {
        try {
            int var3_int = 31 / ((param1 - 45) / 58);
            ((sl) this).field_o = new mh(param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sl.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int h(byte param0) {
        if (param0 != 126) {
          return -76;
        } else {
          int fieldTemp$2 = ((sl) this).field_j;
          ((sl) this).field_j = ((sl) this).field_j + 1;
          return ((sl) this).field_h[fieldTemp$2] + -((sl) this).field_o.d(13) & 255;
        }
    }

    final void m(int param0) {
        if (param0 > -16) {
          ((sl) this).h(53, 123);
          ((sl) this).field_n = ((sl) this).field_j * 8;
          return;
        } else {
          ((sl) this).field_n = ((sl) this).field_j * 8;
          return;
        }
    }

    final static void a(int param0, vm param1) {
        if (param1 == null) {
            return;
        }
        try {
            mr.field_h = param1;
            ua.field_f.field_M.a(param0);
            ua.field_f.a(4, (qr) (Object) mr.field_h);
            dp.field_t = true;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sl.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void i(byte param0) {
        ((sl) this).field_j = (7 + ((sl) this).field_n) / 8;
        int var2 = 126 / ((param0 - 50) / 63);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
