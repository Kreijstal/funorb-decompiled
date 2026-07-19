/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends pm implements kh {
    static bd field_Z;
    private j field_ab;
    static ki[] field_bb;
    private int field_Y;
    static String field_cb;

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            super.a(param0 + 0, param1, param2, param3);
            if (param0 != -5407) {
                field_cb = (String) null;
            }
            this.field_Y = -this.field_y + bd.field_g + -param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "on.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void l(int param0) {
        jh discarded$0 = null;
        field_bb = null;
        field_cb = null;
        field_Z = null;
        if (param0 != 29829) {
            discarded$0 = on.c(true, 18);
        }
    }

    final static jh c(boolean param0, int param1) {
        qa stackIn_4_0 = null;
        qa stackIn_8_0 = null;
        qa stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        qa stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0) {
          L0: {
            on.l(47);
            if (null != af.field_h) {
              stackOut_7_0 = af.field_h.a((long)param1, -22877);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (qa) ((Object) stackOut_6_0);
              break L0;
            }
          }
          return (jh) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null != af.field_h) {
              stackOut_3_0 = af.field_h.a((long)param1, -22877);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (qa) ((Object) stackOut_2_0);
              break L1;
            }
          }
          return (jh) ((Object) stackIn_4_0);
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param1) {
          if (!param2) {
            if (!param3) {
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            } else {
              var4++;
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            }
          } else {
            var4 += 2;
            if (!param3) {
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            } else {
              var4++;
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            }
          }
        } else {
          var4 += 4;
          if (param2) {
            var4 += 2;
            if (param3) {
              var4++;
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            } else {
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            }
          } else {
            if (param3) {
              var4++;
              if (param0) {
                return we.field_n[var4];
              } else {
                field_cb = (String) null;
                return we.field_n[var4];
              }
            } else {
              if (!param0) {
                field_cb = (String) null;
                return we.field_n[var4];
              } else {
                return we.field_n[var4];
              }
            }
          }
        }
    }

    public final j a(byte param0) {
        int var2 = -13 / ((0 - param0) / 43);
        return this.field_ab;
    }

    on(String param0, bj param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, j param1) {
        j discarded$2 = null;
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
              this.field_ab = param1;
              if (param0 == -27) {
                break L1;
              } else {
                discarded$2 = this.a((byte) -17);
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
            stackOut_3_1 = new StringBuilder().append("on.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        if (param1 == -18924) {
          param0 = param0 & 8191;
          if (-4097 >= (param0 ^ -1)) {
            L0: {
              if (6144 <= param0) {
                stackOut_18_0 = -h.field_K[8192 - param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -h.field_K[-4096 + param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param0 ^ -1) <= -2049) {
                stackOut_14_0 = h.field_K[4096 + -param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = h.field_K[param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_cb = (String) null;
          param0 = param0 & 8191;
          if (-4097 >= (param0 ^ -1)) {
            L2: {
              if (6144 <= param0) {
                stackOut_8_0 = -h.field_K[8192 - param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -h.field_K[-4096 + param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param0 ^ -1) <= -2049) {
                stackOut_4_0 = h.field_K[4096 + -param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = h.field_K[param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void j(int param0) {
        super.j(param0);
        if (!(null == this.field_ab)) {
            this.field_ab.a(-1306);
        }
    }

    final String d(byte param0) {
        int var2 = 0;
        if (this.field_l) {
          if (this.field_x == null) {
            return null;
          } else {
            aj.a(bo.field_d, bd.field_g - this.field_Y - -this.field_n, (byte) -76);
            var2 = 30 % ((param0 - 53) / 57);
            return this.field_x;
          }
        } else {
          return null;
        }
    }

    final static void j(byte param0) {
        String discarded$2 = null;
        ai.field_b = -1;
        if (param0 <= 43) {
          discarded$2 = on.a(true, true, false, true);
          se.field_E = 0;
          io.field_g = false;
          w.field_m = 0;
          return;
        } else {
          se.field_E = 0;
          io.field_g = false;
          w.field_m = 0;
          return;
        }
    }

    static {
        field_Z = new bd();
        field_cb = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
