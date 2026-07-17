/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends no {
    static int[] field_D;
    private int field_C;
    int field_w;
    int field_E;
    static int field_z;
    static String field_A;
    static int[] field_B;
    private int field_x;
    int field_y;
    int field_v;

    final static void a(nm param0, int param1, nm param2) {
        try {
            if (!(null == param0.field_b)) {
                param0.b((byte) 111);
            }
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            int var3_int = 73 / ((-34 - param1) / 43);
            param0.field_e.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "il.O(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, wq param1) {
        try {
            super.a(123, param1);
            ((il) this).field_u = param1.l(255) << 8;
            ((il) this).field_C = param1.l(255);
            ((il) this).field_E = param1.i(65280);
            if (param0 <= 89) {
                Object var4 = null;
                il.a((nm) null, 19, (nm) null);
            }
            ((il) this).field_w = param1.i(65280);
            ((il) this).field_y = param1.i(65280);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "il.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void d(int param0) {
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        ((il) this).field_m = ((il) this).field_m + ((il) this).field_o;
        if (param0 != -2081170685) {
          ((il) this).field_C = 106;
          ((il) this).field_j = ((il) this).field_j + ((il) this).field_k;
          if (-6144 > ((il) this).field_m) {
            ((il) this).field_m = ((il) this).field_m + 129024;
            if (((il) this).field_C != 0) {
              if (((il) this).field_C == 1) {
                ((il) this).field_v = (((il) this).field_y * sa.a(((il) this).field_E + ((il) this).field_l * ((il) this).field_w, param0 ^ 2081174780) >> 16) + 16000;
                if (((il) this).field_l == 532) {
                  ((il) this).field_C = 2;
                  ((il) this).field_x = ((il) this).field_v / 32;
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                } else {
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                }
              } else {
                if (((il) this).field_C == 2) {
                  if (((il) this).field_x < ((il) this).field_v) {
                    ((il) this).field_v = ((il) this).field_v - ((il) this).field_x;
                    if (((il) this).field_l != 564) {
                      ((il) this).field_l = ((il) this).field_l + 1;
                      return;
                    } else {
                      ((il) this).b((byte) 111);
                      ((il) this).field_l = ((il) this).field_l + 1;
                      return;
                    }
                  } else {
                    if (((il) this).field_x / 2 < ((il) this).field_v) {
                      ((il) this).field_v = ((il) this).field_v * 4 / 5;
                      if (((il) this).field_l != 564) {
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      } else {
                        ((il) this).b((byte) 111);
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      }
                    } else {
                      if (((il) this).field_l == 564) {
                        ((il) this).b((byte) 111);
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      } else {
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      }
                    }
                  }
                } else {
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                }
              }
            } else {
              if (((il) this).field_l == 32) {
                ((il) this).field_C = 1;
                ((il) this).field_v = ((il) this).field_v + 500;
                ((il) this).field_l = ((il) this).field_l + 1;
                return;
              } else {
                ((il) this).field_v = ((il) this).field_v + 500;
                ((il) this).field_l = ((il) this).field_l + 1;
                return;
              }
            }
          } else {
            if (((il) this).field_C != 0) {
              if (((il) this).field_C == 1) {
                ((il) this).field_v = (((il) this).field_y * sa.a(((il) this).field_E + ((il) this).field_l * ((il) this).field_w, param0 ^ 2081174780) >> 16) + 16000;
                if (((il) this).field_l != 532) {
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                } else {
                  ((il) this).field_C = 2;
                  ((il) this).field_x = ((il) this).field_v / 32;
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                }
              } else {
                if (((il) this).field_C == 2) {
                  if (((il) this).field_x < ((il) this).field_v) {
                    ((il) this).field_v = ((il) this).field_v - ((il) this).field_x;
                    if (((il) this).field_l == 564) {
                      ((il) this).b((byte) 111);
                      ((il) this).field_l = ((il) this).field_l + 1;
                      return;
                    } else {
                      ((il) this).field_l = ((il) this).field_l + 1;
                      return;
                    }
                  } else {
                    if (((il) this).field_x / 2 < ((il) this).field_v) {
                      ((il) this).field_v = ((il) this).field_v * 4 / 5;
                      if (((il) this).field_l == 564) {
                        ((il) this).b((byte) 111);
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      } else {
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      }
                    } else {
                      L0: {
                        if (((il) this).field_l != 564) {
                          break L0;
                        } else {
                          ((il) this).b((byte) 111);
                          break L0;
                        }
                      }
                      ((il) this).field_l = ((il) this).field_l + 1;
                      return;
                    }
                  }
                } else {
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                }
              }
            } else {
              L1: {
                if (((il) this).field_l != 32) {
                  break L1;
                } else {
                  ((il) this).field_C = 1;
                  break L1;
                }
              }
              ((il) this).field_v = ((il) this).field_v + 500;
              ((il) this).field_l = ((il) this).field_l + 1;
              return;
            }
          }
        } else {
          L2: {
            ((il) this).field_j = ((il) this).field_j + ((il) this).field_k;
            if (-6144 <= ((il) this).field_m) {
              break L2;
            } else {
              ((il) this).field_m = ((il) this).field_m + 129024;
              break L2;
            }
          }
          if (((il) this).field_C != 0) {
            if (((il) this).field_C == 1) {
              ((il) this).field_v = (((il) this).field_y * sa.a(((il) this).field_E + ((il) this).field_l * ((il) this).field_w, param0 ^ 2081174780) >> 16) + 16000;
              if (((il) this).field_l != 532) {
                ((il) this).field_l = ((il) this).field_l + 1;
                return;
              } else {
                ((il) this).field_C = 2;
                ((il) this).field_x = ((il) this).field_v / 32;
                ((il) this).field_l = ((il) this).field_l + 1;
                return;
              }
            } else {
              if (((il) this).field_C == 2) {
                if (((il) this).field_x >= ((il) this).field_v) {
                  if (((il) this).field_x / 2 >= ((il) this).field_v) {
                    L3: {
                      if (-565 != ((il) this).field_l) {
                        break L3;
                      } else {
                        ((il) this).b((byte) 111);
                        break L3;
                      }
                    }
                    ((il) this).field_l = ((il) this).field_l + 1;
                    return;
                  } else {
                    L4: {
                      ((il) this).field_v = ((il) this).field_v * 4 / 5;
                      if (-565 != ((il) this).field_l) {
                        break L4;
                      } else {
                        ((il) this).b((byte) 111);
                        break L4;
                      }
                    }
                    ((il) this).field_l = ((il) this).field_l + 1;
                    return;
                  }
                } else {
                  L5: {
                    ((il) this).field_v = ((il) this).field_v - ((il) this).field_x;
                    if (((il) this).field_l != 564) {
                      break L5;
                    } else {
                      ((il) this).b((byte) 111);
                      break L5;
                    }
                  }
                  ((il) this).field_l = ((il) this).field_l + 1;
                  return;
                }
              } else {
                ((il) this).field_l = ((il) this).field_l + 1;
                return;
              }
            }
          } else {
            L6: {
              if (((il) this).field_l != 32) {
                break L6;
              } else {
                ((il) this).field_C = 1;
                break L6;
              }
            }
            ((il) this).field_v = ((il) this).field_v + 500;
            ((il) this).field_l = ((il) this).field_l + 1;
            return;
          }
        }
    }

    final static void a(ie param0, tg param1, int param2, int param3, int param4, int param5, java.awt.Component param6) {
        try {
            tj.a(param2, true, 10);
            eo.field_f = tj.a(param1, param6, 0, param4);
            jk.field_w = tj.a(param1, param6, 1, param3);
            ob.field_J = new ra();
            af.field_u = param5 * param3 / param2;
            jk.field_w.b((qd) (Object) ob.field_J);
            m.field_f = param0;
            m.field_f.a(ul.field_p, false);
            eo.field_f.b((qd) (Object) m.field_f);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "il.D(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    public static void c() {
        field_A = null;
        field_D = null;
        field_B = null;
    }

    il(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(byte param0, int param1) {
        wp.a(1, param1);
    }

    final static void a(int param0, jp param1, jp param2, int param3, int param4, jp param5, int param6, int param7, int param8, int param9, jp param10, int param11) {
        RuntimeException var12 = null;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            param2.d(param9 + ((-param2.field_x + param11) / 2 + (param0 * 5 >> 16)), param8);
            param5.c((10 * param0 >> 16) + ((-param5.field_x + param11) / 2 + param9 + -(87 / param3)), -(80 / param3) + (-param5.field_z + 480 + (param6 + param8)));
            param1.c(-(5 / param3) + ((param0 * 20 >> 16) + ((param11 - param1.field_x) / 2 + param9)), -param1.field_z + (480 + param6 + param8));
            og.a(-121, 16, 0, param10, 16777215, -(5 / param3) + ((param0 * 2 >> 16) + ((param11 + -param10.field_x) / param4 + param9)), 480 + (param8 + param6 - param10.field_z));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var12 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var12;
            stackOut_2_1 = new StringBuilder().append("il.E(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param10 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param11 + 41);
        }
    }

    final int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 > 79) {
                break L1;
              } else {
                int discarded$4 = 1;
                il.a((ie) null, (tg) null, 83, 59, 15, -106, (java.awt.Component) null);
                break L1;
              }
            }
            L2: {
              var3_int = super.a(120, param1) ^ -72674834;
              if (param1 != null) {
                StringBuilder discarded$5 = param1.append(((il) this).field_j + " " + ((il) this).field_m + " ");
                StringBuilder discarded$6 = param1.append(((il) this).field_E + " " + ((il) this).field_l + " ");
                StringBuilder discarded$7 = param1.append("\n");
                break L2;
              } else {
                break L2;
              }
            }
            var3_int = var3_int ^ 97 * ((il) this).field_C - -9269 << 3;
            var3_int = var3_int ^ 39185 + 47 * ((il) this).field_v << 13;
            var3_int = var3_int ^ ((il) this).field_E * 17 + 31 << 2;
            var3_int = var3_int ^ 30 + 19 * ((il) this).field_w << 22;
            var3_int = var3_int ^ 27 * ((il) this).field_y + 21554 << 10;
            stackOut_5_0 = var3_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("il.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static boolean e(byte param0) {
        if (param0 >= -77) {
            Object var2 = null;
            il.a(-62, (jp) null, (jp) null, 105, -38, (jp) null, 49, -61, 61, -69, (jp) null, 126);
            return ld.field_t > 250 ? true : false;
        }
        return ld.field_t > 250 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
        field_z = -1;
        field_A = "Show chat";
    }
}
