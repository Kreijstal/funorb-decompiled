/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bh {
    static String field_h;
    static String field_c;
    static ck[][] field_d;
    static String field_j;
    static String field_f;
    bh field_a;
    bh field_b;
    static int field_m;
    static String[] field_e;
    static int field_g;
    long field_i;
    static um field_l;
    static int field_k;

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (param0 > 34) {
              break L0;
            } else {
              field_l = null;
              break L0;
            }
          }
          if (((bh) this).field_a == null) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          } else {
            stackOut_8_0 = 1;
            stackIn_9_0 = stackOut_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "bh.EB(" + param0 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        fa var2 = null;
        bh var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          if (param1 <= -116) {
            var2 = (fa) (Object) sa.field_C.c((byte) -114);
            L0: while (true) {
              L1: {
                L2: {
                  if (null == var2) {
                    break L2;
                  } else {
                    w.a(124, param0, var2);
                    var2 = (fa) (Object) sa.field_C.d(true);
                    if (var3 != 0) {
                      break L1;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var2_ref = c.field_r.c((byte) 99);
                break L1;
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var2_ref) {
                      break L5;
                    } else {
                      ad.a(-1, param0);
                      var2_ref = c.field_r.d(true);
                      if (var3 != 0) {
                        break L4;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L3;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "bh.CB(" + param0 + 44 + param1 + 41);
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (((bh) this).field_a == null) {
            return;
          } else {
            L0: {
              ((bh) this).field_a.field_b = ((bh) this).field_b;
              ((bh) this).field_b.field_a = ((bh) this).field_a;
              if (param0 >= 100) {
                break L0;
              } else {
                field_k = -105;
                break L0;
              }
            }
            ((bh) this).field_a = null;
            ((bh) this).field_b = null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "bh.AB(" + param0 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              try {
                L0: {
                  if (param0 <= -98) {
                    break L0;
                  } else {
                    bh.a(-55, (java.applet.Applet) null);
                    break L0;
                  }
                }
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("bh.VA(").append(param0).append(44);
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L1;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L1;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_d = null;
            field_c = null;
            field_h = null;
            if (param0 == 25189) {
              break L0;
            } else {
              bh.b(-88);
              break L0;
            }
          }
          field_l = null;
          field_e = null;
          field_j = null;
          field_f = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "bh.DB(" + param0 + 41);
        }
    }

    final static int a(int param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              break L0;
            } else {
              field_h = null;
              break L0;
            }
          }
          stackOut_3_0 = s.a(true, 4, param0, param2);
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("bh.BB(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_k = -96;
            break L0;
          }
        }
        var4_int = param1.indexOf(param3);
        L1: while (true) {
          L2: {
            L3: {
              if (0 == (var4_int ^ -1)) {
                break L3;
              } else {
                param1 = param1.substring(0, var4_int) + param2 + param1.substring(param3.length() + var4_int);
                stackOut_5_0 = (String) param1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  var4_int = ((String) (Object) stackIn_6_0).indexOf(param3, param2.length() + var4_int);
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_7_0 = (String) param1;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          }
          return stackIn_8_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is <%0>'s RuneScape clan if they have one.";
        field_j = "RuneScape clan";
        field_d = new ck[8][];
        field_f = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_e = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = 0;
        field_c = "You can ask to join this game";
        field_k = -1;
        field_l = new um();
    }
}
