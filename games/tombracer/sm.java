/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends nv implements ut {
    private int field_p;
    private int field_n;
    private boolean field_s;
    private jma field_q;
    private boolean field_t;
    static jea field_r;
    static String field_o;

    final void k(int param0) {
        L0: {
          if (((sm) this).field_q.f((byte) -56)) {
            ((sm) this).c(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 5418) {
          ((sm) this).b(-64, 64);
          ((sm) this).field_t = this.r(param0 + -5416);
          ((sm) this).field_q.a((byte) -14, ((sm) this).field_t);
          return;
        } else {
          ((sm) this).field_t = this.r(param0 + -5416);
          ((sm) this).field_q.a((byte) -14, ((sm) this).field_t);
          return;
        }
    }

    private final boolean r(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hca var6 = null;
        hca var7 = null;
        hca var8 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (!((sm) this).field_s) {
          L0: {
            var8 = ((sm) this).b(true).u(-98);
            stackOut_16_0 = this;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if (var8.u((byte) 127) != 1) {
              stackOut_18_0 = this;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L0;
            } else {
              stackOut_17_0 = this;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L0;
            }
          }
          L1: {
            ((sm) this).field_n = stackIn_19_1;
            var3 = var8.d(3) - ((sm) this).field_g.d(3);
            var4 = var8.e(param0 ^ 9650) + -((sm) this).field_g.e(9648);
            var5 = 262144;
            if (ua.a(var3, param0 ^ -122) > ((sm) this).field_g.c(-120) / param0 + var8.c(-59) / 2 + var5) {
              break L1;
            } else {
              if (ua.a(var4, -121) > var5 + ((sm) this).field_g.a((byte) 55) / 2 + var8.a((byte) 55) / 2) {
                break L1;
              } else {
                if (((sm) this).field_p <= ((sm) this).field_n) {
                  if (((sm) this).field_s) {
                    var8.J(0);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          }
          ((sm) this).field_n = 0;
          return false;
        } else {
          if (!((sm) this).field_t) {
            L2: {
              var7 = ((sm) this).b(true).u(-98);
              var6 = var7;
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var7.u((byte) 127) != 1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((sm) this).field_n = stackIn_6_1;
            var3 = var7.d(3) - ((sm) this).field_g.d(3);
            var4 = var7.e(param0 ^ 9650) + -((sm) this).field_g.e(9648);
            var5 = 262144;
            if (ua.a(var3, param0 ^ -122) <= ((sm) this).field_g.c(-120) / param0 + var7.c(-59) / 2 + var5) {
              if (ua.a(var4, -121) <= var5 + ((sm) this).field_g.a((byte) 55) / 2 + var7.a((byte) 55) / 2) {
                if (((sm) this).field_p <= ((sm) this).field_n) {
                  if (!((sm) this).field_s) {
                    return true;
                  } else {
                    var7.J(0);
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                ((sm) this).field_n = 0;
                return false;
              }
            } else {
              ((sm) this).field_n = 0;
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final void a(boolean param0, fsa param1) {
        if (!param0) {
            return;
        }
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sm.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            ((sm) this).field_p = 106;
            return ((sm) this).field_n;
        }
        return ((sm) this).field_n;
    }

    public static void l(int param0) {
        field_o = null;
        field_r = null;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            int discarded$0 = ((sm) this).a(97, 98);
            return 7820595;
        }
        return 7820595;
    }

    public final jma k(byte param0) {
        if (param0 > -67) {
            return null;
        }
        return ((sm) this).field_q;
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 2) {
          if (!o.a(-1, param2, param1)) {
            if (vua.e(param1, param2, 13650)) {
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
          boolean discarded$7 = sm.a(52, -115, -20);
          if (o.a(-1, param2, param1)) {
            return true;
          } else {
            L0: {
              if (!vua.e(param1, param2, 13650)) {
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

    sm(la param0, boolean param1) {
        super(param0, param1);
        ((sm) this).field_s = true;
        ((sm) this).field_p = 1;
        try {
            ((sm) this).field_q = new jma(15);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final int b(int param0) {
        int var2 = 44 / ((-46 - param0) / 45);
        return ((sm) this).field_p;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return -8;
        }
        return ((sm) this).field_q.a(77, param0);
    }

    final void b(int param0, int param1) {
        ((sm) this).field_p = param1;
        if (param0 != 0) {
            boolean discarded$0 = sm.a(8, -65, -15);
        }
    }

    final void g(int param0) {
        super.g(param0);
        ((sm) this).field_q.a((byte) 48, ((sm) this).h((byte) 109));
    }

    sm(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((sm) this).field_s = true;
        ((sm) this).field_p = 1;
        try {
            if (16 < param0.field_E) {
                ((sm) this).field_p = 1;
            } else {
                ((sm) this).field_p = param1.b((byte) 44, 3);
            }
            ((sm) this).field_q = new jma(15, param0, param1);
            ((sm) this).field_s = 1 == param1.b((byte) 44, 1) ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((sm) this).b(82);
            return 32;
        }
        return 32;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            ((sm) this).field_q.a(((sm) this).h((byte) 111), (byte) 108, param1);
            param1.a((byte) -127, ((sm) this).field_s ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sm.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            ((sm) this).field_p = -8;
            return 11162931;
        }
        return 11162931;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Back";
    }
}
