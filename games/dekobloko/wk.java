/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends fm {
    static String field_k;
    static String field_n;
    static String field_j;
    static String field_g;
    static ji field_q;
    private String field_h;
    static boolean field_i;
    private long field_m;
    static String field_p;
    static ck field_l;
    static String field_o;

    final static void a(byte param0, tj param1) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            param1.b((byte) 111);
            var2 = (tj) ((Object) i.field_b.c((byte) -61));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2.a(-985, param1);
                    stackIn_7_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var2 = (tj) ((Object) i.field_b.d(true));
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_6_0 = param0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              L4: {
                if (stackIn_7_0 > 3) {
                  break L4;
                } else {
                  wk.c(31);
                  break L4;
                }
              }
              L5: {
                if (var2 != null) {
                  break L5;
                } else {
                  i.field_b.a(param1, 2777);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              fm.a((byte) 114, param1, var2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2_ref);
            stackOut_14_1 = new StringBuilder().append("wk.H(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static int b(int param0) {
        if (param0 != 3) {
            field_k = (String) null;
            return -ad.field_a + fb.field_f;
        }
        return -ad.field_a + fb.field_f;
    }

    gh a(int param0) {
        if (param0 != 18) {
            ff var3 = (ff) null;
            wk.a(124, -86, (ff) null);
            return ui.field_t;
        }
        return ui.field_t;
    }

    final static void a(int param0, int param1, ff param2) {
        try {
            if (param0 != 3) {
                field_i = false;
            }
            cd.field_c.a(param2, 2777);
            mc.a(true, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wk.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = client.field_A ? 1 : 0;
            var3 = -84 / ((param0 - 5) / 54);
            var4 = param1;
            if (0 != var4) {
              if (var4 == 1) {
                break L1;
              } else {
                if (var4 != 2) {
                  if (3 == var4) {
                    uf.g(param2, -2093);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var5 == 0) {
                    bl.b(param2, 12618);
                    if (var5 == 0) {
                      break L0;
                    } else {
                      uf.g(param2, -2093);
                      return;
                    }
                  } else {
                    if (3 == var4) {
                      uf.g(param2, -2093);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              if (var5 == 0) {
                da.a(param2, true);
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                if (var4 == 1) {
                  h.a(param2, false);
                  if (var5 == 0) {
                    return;
                  } else {
                    bl.b(param2, 12618);
                    uf.g(param2, -2093);
                    return;
                  }
                } else {
                  if (var4 == 2) {
                    if (var5 != 0) {
                      if (3 == var4) {
                        uf.g(param2, -2093);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      bl.b(param2, 12618);
                      if (var5 == 0) {
                        return;
                      } else {
                        uf.g(param2, -2093);
                        return;
                      }
                    }
                  } else {
                    if (3 != var4) {
                      return;
                    } else {
                      uf.g(param2, -2093);
                      return;
                    }
                  }
                }
              }
            }
          }
          h.a(param2, false);
          if (var5 == 0) {
            break L0;
          } else {
            bl.b(param2, 12618);
            uf.g(param2, -2093);
            return;
          }
        }
    }

    final void a(wl param0, byte param1) {
        param0.a(this.field_m, (byte) 0);
        if (param1 < 34) {
            return;
        }
        try {
            param0.a(this.field_h, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        ff var2 = null;
        field_o = null;
        field_g = null;
        if (param0 != 7751) {
          var2 = (ff) null;
          wk.a(12, -125, (ff) null);
          field_q = null;
          field_p = null;
          field_j = null;
          field_k = null;
          field_l = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_j = null;
          field_k = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    wk(long param0, String param1) {
        try {
            this.field_m = param0;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "<%0> has entered a game.";
        field_n = "Send private message";
        field_o = "Remove name";
        field_k = "Offensive account name";
        field_j = "Searching for an opponent";
        field_p = "Message lobby";
    }
}
