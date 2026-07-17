/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ie {
    static ri[] field_C;
    static int[] field_z;
    static int[] field_B;

    we(int param0, int param1, int param2, int param3, mh param4, pk param5) {
        super(param0, param1, param2, param3, param4, (qm) null);
        try {
            ((we) this).field_y = param5;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "we.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 < -35) {
          L0: {
            if (param3 != 0) {
              break L0;
            } else {
              if (((we) this).field_w == null) {
                break L0;
              } else {
                L1: {
                  ((we) this).field_w.a((pk) this, param1, 5592405, true, param0);
                  if (((we) this).field_q == 0) {
                    break L1;
                  } else {
                    if (((we) this).field_p == 0) {
                      break L1;
                    } else {
                      ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                      ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                      ks.field_x.b((byte) -84);
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          L2: {
            if (((we) this).field_q == 0) {
              break L2;
            } else {
              if (((we) this).field_p == 0) {
                break L2;
              } else {
                ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                ks.field_x.b((byte) -84);
                return;
              }
            }
          }
          return;
        } else {
          we.a((byte) -109);
          if (param3 == 0) {
            if (((we) this).field_w != null) {
              L3: {
                ((we) this).field_w.a((pk) this, param1, 5592405, true, param0);
                if (((we) this).field_q == 0) {
                  break L3;
                } else {
                  if (((we) this).field_p == 0) {
                    break L3;
                  } else {
                    ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                    ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                    ks.field_x.b((byte) -84);
                    return;
                  }
                }
              }
              return;
            } else {
              if (((we) this).field_q != 0) {
                if (((we) this).field_p != 0) {
                  ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                  ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                  ks.field_x.b((byte) -84);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((we) this).field_q != 0) {
              if (((we) this).field_p != 0) {
                ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                ks.field_x.b((byte) -84);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -42) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((we) this).b(param5, -1, param4, param2, param6)) {
                  break L3;
                } else {
                  if (!super.a(param0, -55, param2, param3, param4, param5, param6)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("we.R(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final static boolean g(int param0) {
        if (10 > jv.field_a) {
            return false;
        }
        if (mp.field_a < 13) {
            return false;
        }
        return true;
    }

    public static void e(boolean param0) {
        field_C = null;
        field_B = null;
        field_z = null;
    }

    final void d(boolean param0) {
        ((we) this).field_y.c(param0);
    }

    final static void e(byte param0) {
        qv.field_o = ig.field_a.d(-1);
        int var1 = 0;
        CharSequence var2 = (CharSequence) (Object) qv.field_o;
        tc.field_f = uk.a(-1, var2);
    }

    final static void a(byte param0) {
        if (jv.field_a == 10) {
          ch.a(0);
          jv.field_a = 11;
          if (param0 <= 10) {
            return;
          } else {
            ch.field_h = true;
            return;
          }
        } else {
          if (!au.c(1)) {
            ch.a(0);
            jv.field_a = 11;
            if (param0 <= 10) {
              return;
            } else {
              ch.field_h = true;
              return;
            }
          } else {
            if (param0 <= 10) {
              return;
            } else {
              ch.field_h = true;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[8192];
    }
}
