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
        if (!(null == param0.field_b)) {
            param0.b((byte) 111);
        }
        param0.field_b = param2.field_b;
        param0.field_e = param2;
        param0.field_b.field_e = param0;
        int var3 = 73 / ((-34 - param1) / 43);
        param0.field_e.field_b = param0;
    }

    final void a(int param0, wq param1) {
        Object var4 = null;
        super.a(123, param1);
        ((il) this).field_u = param1.l(255) << 629775560;
        ((il) this).field_C = param1.l(255);
        ((il) this).field_E = param1.i(65280);
        if (param0 <= 89) {
          var4 = null;
          il.a((nm) null, 19, (nm) null);
          ((il) this).field_w = param1.i(65280);
          ((il) this).field_y = param1.i(65280);
          return;
        } else {
          ((il) this).field_w = param1.i(65280);
          ((il) this).field_y = param1.i(65280);
          return;
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
                ((il) this).field_v = (((il) this).field_y * sa.a(((il) this).field_E + ((il) this).field_l * ((il) this).field_w, param0 ^ 2081174780) >> -1849271312) + 16000;
                if (-533 == (((il) this).field_l ^ -1)) {
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
                    if (-565 != (((il) this).field_l ^ -1)) {
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
                      if (-565 != (((il) this).field_l ^ -1)) {
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      } else {
                        ((il) this).b((byte) 111);
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      }
                    } else {
                      if (-565 == (((il) this).field_l ^ -1)) {
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
              if ((((il) this).field_l ^ -1) == -33) {
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
                ((il) this).field_v = (((il) this).field_y * sa.a(((il) this).field_E + ((il) this).field_l * ((il) this).field_w, param0 ^ 2081174780) >> -1849271312) + 16000;
                if (-533 != (((il) this).field_l ^ -1)) {
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
                    if (-565 == (((il) this).field_l ^ -1)) {
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
                      if (-565 == (((il) this).field_l ^ -1)) {
                        ((il) this).b((byte) 111);
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      } else {
                        ((il) this).field_l = ((il) this).field_l + 1;
                        return;
                      }
                    } else {
                      L0: {
                        if (-565 != (((il) this).field_l ^ -1)) {
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
                if ((((il) this).field_l ^ -1) != -33) {
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
              ((il) this).field_v = (((il) this).field_y * sa.a(((il) this).field_E + ((il) this).field_l * ((il) this).field_w, param0 ^ 2081174780) >> -1849271312) + 16000;
              if (-533 != (((il) this).field_l ^ -1)) {
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
                    if (-565 != (((il) this).field_l ^ -1)) {
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
              if ((((il) this).field_l ^ -1) != -33) {
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

    final static void a(ie param0, tg param1, int param2, int param3, int param4, int param5, java.awt.Component param6, boolean param7) {
        tj.a(param2, param7, 10);
        eo.field_f = tj.a(param1, param6, 0, param4);
        jk.field_w = tj.a(param1, param6, 1, param3);
        ob.field_J = new ra();
        af.field_u = param5 * param3 / param2;
        jk.field_w.b((qd) (Object) ob.field_J);
        m.field_f = param0;
        m.field_f.a(ul.field_p, false);
        eo.field_f.b((qd) (Object) m.field_f);
    }

    public static void c(int param0) {
        if (param0 <= 122) {
            return;
        }
        field_A = null;
        field_D = null;
        field_B = null;
    }

    il(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(byte param0, int param1) {
        if (param0 != 86) {
            boolean discarded$0 = il.e((byte) -105);
            wp.a(param0 ^ 87, param1);
            return;
        }
        wp.a(param0 ^ 87, param1);
    }

    final static void a(int param0, jp param1, jp param2, int param3, int param4, jp param5, int param6, int param7, int param8, int param9, jp param10, int param11) {
        param2.d(param9 + ((-param2.field_x + param11) / 2 + (param0 * 5 >> -146611824)), param8);
        param5.c((10 * param0 >> 920868816) + ((-param5.field_x + param11) / 2 + param9 + -(87 / param3)), -(80 / param3) + (-param5.field_z + 480 + (param6 + param8)));
        param1.c(-(5 / param3) + ((param0 * 20 >> 752742192) + ((param11 - param1.field_x) / 2 + param9)), -param1.field_z + (480 + param6 + param8));
        og.a(-121, 16, 0, param10, 16777215, -(5 / param3) + ((param0 * 2 >> 647611568) + ((param11 + -param10.field_x) / param4 + param9)), 480 + (param8 + param6 - param10.field_z));
    }

    final int a(int param0, StringBuilder param1) {
        int var3 = 0;
        Object var4 = null;
        if (param0 <= 79) {
          L0: {
            var4 = null;
            il.a((ie) null, (tg) null, 83, 59, 15, -106, (java.awt.Component) null, true);
            var3 = super.a(120, param1) ^ -72674834;
            if (param1 != null) {
              StringBuilder discarded$6 = param1.append(((il) this).field_j + " " + ((il) this).field_m + " ");
              StringBuilder discarded$7 = param1.append(((il) this).field_E + " " + ((il) this).field_l + " ");
              StringBuilder discarded$8 = param1.append("\n");
              break L0;
            } else {
              break L0;
            }
          }
          var3 = var3 ^ 97 * ((il) this).field_C - -9269 << -2081170685;
          var3 = var3 ^ 39185 + 47 * ((il) this).field_v << -1030865523;
          var3 = var3 ^ ((il) this).field_E * 17 + 31 << -1064075646;
          var3 = var3 ^ 30 + 19 * ((il) this).field_w << 1199390358;
          var3 = var3 ^ 27 * ((il) this).field_y + 21554 << 102788970;
          return var3;
        } else {
          L1: {
            var3 = super.a(120, param1) ^ -72674834;
            if (param1 != null) {
              StringBuilder discarded$9 = param1.append(((il) this).field_j + " " + ((il) this).field_m + " ");
              StringBuilder discarded$10 = param1.append(((il) this).field_E + " " + ((il) this).field_l + " ");
              StringBuilder discarded$11 = param1.append("\n");
              break L1;
            } else {
              break L1;
            }
          }
          var3 = var3 ^ 97 * ((il) this).field_C - -9269 << -2081170685;
          var3 = var3 ^ 39185 + 47 * ((il) this).field_v << -1030865523;
          var3 = var3 ^ ((il) this).field_E * 17 + 31 << -1064075646;
          var3 = var3 ^ 30 + 19 * ((il) this).field_w << 1199390358;
          var3 = var3 ^ 27 * ((il) this).field_y + 21554 << 102788970;
          return var3;
        }
    }

    final static boolean e(byte param0) {
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0;
        int stackOut_6_0;
        int stackOut_3_0;
        int stackOut_2_0;
        if (param0 >= -77) {
          L0: {
            var2 = null;
            il.a(-62, (jp) null, (jp) null, 105, -38, (jp) null, 49, -61, 61, -69, (jp) null, 126);
            if (-251 <= ld.field_t) {
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
            if (-251 >= ld.field_t) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
        field_z = -1;
        field_A = "Show chat";
    }
}
