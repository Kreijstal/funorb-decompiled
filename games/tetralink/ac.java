/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static boolean field_e;
    static ma field_a;
    static int[] field_b;
    static String field_d;
    static oh field_c;

    final static boolean a(byte param0, char param1) {
        if (param0 < -90) {
          if (param1 < 65) {
            if (param1 >= 97) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          ac.a(107, -51, false, 107);
          if (param1 >= 65) {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param1 >= 97) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 == -19403) {
          if (fn.field_R >= 10) {
            if (13 > vd.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ac.a((byte) 73, '~');
          if (fn.field_R >= 10) {
            if (13 > vd.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        L0: {
          hd.field_v = 0;
          ed.field_O = param0;
          pf.field_d = param3;
          if (qb.a(ed.field_O, (byte) 114)) {
            var4 = 0;
            kk.field_X[ed.field_O].b(param2, var4, -1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 > -64) {
          return;
        } else {
          L1: {
            if (ed.field_O != -4) {
              break L1;
            } else {
              cl.field_g = 2;
              im.field_e = 3.1415927410125732f;
              ok.field_d = 84.0f;
              break L1;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -88) {
            return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, byte[] param1, int param2, bh param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var7_int = k.a(false, param2);
              var9 = -127 / ((param0 - 47) / 35);
              if (null == re.field_R) {
                re.field_R = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var10 = 0;
            L2: while (true) {
              if (4 <= var10) {
                L3: {
                  L4: {
                    if (null == ug.field_hb) {
                      break L4;
                    } else {
                      if (var7_int <= ug.field_hb.field_u.length) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ug.field_hb = new bh(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    ug.field_hb.field_t = 0;
                    ug.field_hb.a(param4, 128, param1, param2);
                    ug.field_hb.b((byte) -71, var7_int);
                    ug.field_hb.a(10830, var14);
                    if (null == ce.field_f) {
                      break L6;
                    } else {
                      if (100 <= ce.field_f.field_u.length) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ce.field_f = new bh(100);
                  break L5;
                }
                ce.field_f.field_t = 0;
                ce.field_f.a(10, false);
                var12 = 0;
                var10 = var12;
                L7: while (true) {
                  if (4 <= var12) {
                    ce.field_f.b(param2, false);
                    ce.field_f.a(param5, param6, -25035);
                    param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                    param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                    break L0;
                  } else {
                    ce.field_f.d(var14[var12], (byte) -124);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                var8[var10] = re.field_R.nextInt();
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("ac.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), stackIn_32_2 + ')');
        }
    }

    static {
        field_d = "This password contains repeated characters, and would be easy to guess";
    }
}
