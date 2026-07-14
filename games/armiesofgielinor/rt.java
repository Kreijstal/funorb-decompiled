/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt extends oj {
    static String field_B;
    private int field_y;
    static int field_D;
    private int field_C;
    static long field_z;

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 > -84) {
          return true;
        } else {
          return ((rt) this).a((byte) -39, param2, param0, true) | ((rt) this).a(((rt) this).field_C, 15, param2, param0, ((rt) this).field_y);
        }
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        var4 = param0.length();
        var5 = param1;
        L0: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param2 == param0.charAt(var5)) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = -56 / ((param0 - 53) / 51);
        return null;
    }

    public static void e(byte param0) {
        if (param0 < 78) {
            int discarded$0 = rt.g(98);
            field_B = null;
            return;
        }
        field_B = null;
    }

    final static boolean a(boolean param0, Class param1) {
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        if (!param0) {
          if (Integer.TYPE != param1) {
            if (Short.TYPE != param1) {
              if (param1 != Long.TYPE) {
                if (Byte.TYPE != param1) {
                  if (Float.TYPE != param1) {
                    if (param1 == Double.TYPE) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 > 102) {
          if (kr.field_y[0] != null) {
            if (2 >= kr.field_y[0].length) {
              return;
            } else {
              var1 = 0;
              L0: while (true) {
                if (kr.field_y[0].length > var1) {
                  if (-26 != (kr.field_y[0][var1] ^ -1)) {
                    var1++;
                    continue L0;
                  } else {
                    kr.field_y[0][var1] = 0;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          rt.e((byte) -63);
          if (kr.field_y[0] != null) {
            if (2 >= kr.field_y[0].length) {
              return;
            } else {
              var1 = 0;
              L1: while (true) {
                if (kr.field_y[0].length > var1) {
                  if (-26 != (kr.field_y[0][var1] ^ -1)) {
                    var1++;
                    continue L1;
                  } else {
                    kr.field_y[0][var1] = 0;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static int g(int param0) {
        if (param0 != 0) {
            return 45;
        }
        return wr.field_L;
    }

    final void a(ha param0, int param1) {
        param0.field_Eb[param0.field_v * ((rt) this).field_w.field_w + ((rt) this).field_w.field_J].field_c = null;
        param0.field_Eb[param0.field_v * ((rt) this).field_C + ((rt) this).field_y].field_c = ((rt) this).field_w;
        param0.field_Eb[param0.field_v * ((rt) this).field_C + ((rt) this).field_y].field_l = false;
        ((rt) this).field_w.field_w = ((rt) this).field_C;
        ((rt) this).field_w.field_I = false;
        if (param1 != -26661) {
          rt.e((byte) -101);
          ((rt) this).field_w.field_Y = ((rt) this).field_w.field_t;
          ((rt) this).field_w.field_J = ((rt) this).field_y;
          ((rt) this).field_w.field_ab = 0;
          ((rt) this).field_w.a((byte) -96);
          ((rt) this).field_w.field_S = false;
          return;
        } else {
          ((rt) this).field_w.field_Y = ((rt) this).field_w.field_t;
          ((rt) this).field_w.field_J = ((rt) this).field_y;
          ((rt) this).field_w.field_ab = 0;
          ((rt) this).field_w.a((byte) -96);
          ((rt) this).field_w.field_S = false;
          return;
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            if (param0) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          ep.a(stackIn_11_0 != 0, param1, param2);
          if (null != ad.field_I) {
            op.a(-110, ad.field_I);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            field_B = null;
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          ep.a(stackIn_4_0 != 0, param1, param2);
          if (null != ad.field_I) {
            op.a(-110, ad.field_I);
            return;
          } else {
            return;
          }
        }
    }

    rt(jd param0, int param1, int param2) {
        ((rt) this).field_w = param0;
        ((rt) this).field_m = 25;
        ((rt) this).field_C = param2;
        ((rt) this).field_y = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Elapsed time";
    }
}
