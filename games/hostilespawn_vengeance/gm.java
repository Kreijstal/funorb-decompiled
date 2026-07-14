/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static int field_f;
    static vl field_d;
    private boolean field_b;
    bd[] field_c;
    private int field_i;
    static String[] field_k;
    bd field_a;
    private int field_h;
    static bd field_j;
    static int field_m;
    private int field_l;
    private int field_e;
    private int field_g;

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        od.field_I = ee.field_b;
        if (255 != param3) {
          if ((param3 ^ -1) > -101) {
            wj.field_H = an.a(param3, -10, param1);
            if (param0 == 26991) {
              return;
            } else {
              var6 = null;
              gm.a(58, (String) null, (String[]) null, -3);
              return;
            }
          } else {
            if ((param3 ^ -1) >= -106) {
              wj.field_H = vf.a(param2, true);
              if (param0 == 26991) {
                return;
              } else {
                var6 = null;
                gm.a(58, (String) null, (String[]) null, -3);
                return;
              }
            } else {
              wj.field_H = an.a(param3, -10, param1);
              if (param0 == 26991) {
                return;
              } else {
                var6 = null;
                gm.a(58, (String) null, (String[]) null, -3);
                return;
              }
            }
          }
        } else {
          L0: {
            if ((ia.field_h ^ -1) <= -14) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          wj.field_H = qi.a(stackIn_4_0 != 0, false);
          if (param0 == 26991) {
            return;
          } else {
            var6 = null;
            gm.a(58, (String) null, (String[]) null, -3);
            return;
          }
        }
    }

    final static int a(CharSequence param0, char param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var3 = 0;
        var4 = param0.length();
        if (param2 != 125) {
          L0: {
            var7 = null;
            int discarded$1 = gm.a((CharSequence) null, '7', (byte) 37);
            var5 = 0;
            if (var4 <= var5) {
              break L0;
            } else {
              L1: {
                if (param1 == param0.charAt(var5)) {
                  var3++;
                  break L1;
                } else {
                  var5++;
                  break L1;
                }
              }
              var5++;
              var5++;
              var5++;
              break L0;
            }
          }
          return var3;
        } else {
          var5 = 0;
          L2: while (true) {
            if (var4 <= var5) {
              return var3;
            } else {
              if (param1 == param0.charAt(var5)) {
                var3++;
                var5++;
                continue L2;
              } else {
                var5++;
                var5++;
                continue L2;
              }
            }
          }
        }
    }

    final void b(int param0) {
        ((gm) this).field_g = 0;
        ((gm) this).field_l = -1;
        ((gm) this).field_c = null;
        ((gm) this).field_e = 256;
        ((gm) this).field_i = 0;
        ((gm) this).field_a = null;
        if (param0 < 121) {
          ((gm) this).field_e = 19;
          ((gm) this).field_h = 0;
          return;
        } else {
          ((gm) this).field_h = 0;
          return;
        }
    }

    final gm a(boolean param0, bd[] param1) {
        Object var4 = null;
        if (param0) {
          var4 = null;
          String discarded$2 = gm.a((CharSequence) null, 89, true);
          ((gm) this).field_c = param1;
          return (gm) this;
        } else {
          ((gm) this).field_c = param1;
          return (gm) this;
        }
    }

    final gm a(int param0, boolean param1) {
        ((gm) this).field_i = param0;
        if (!param1) {
            return null;
        }
        return (gm) this;
    }

    final void a(ha param0, int param1, int param2, ag param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        vm stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        vm stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        vm stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        vm stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        vm stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        vm stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        vm stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        vm stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        vm stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        vm stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        vm stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        vm stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        vm stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        vm stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        vm stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        vm stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        vm stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        vm stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        L0: {
          hm.a(param3.field_s, ((gm) this).field_c, false, param3.field_x, param3.field_m + param4, param2 + param3.field_v);
          if (null != ((gm) this).field_a) {
            L1: {
              var6_int = ((gm) this).field_h + (param2 - -param3.field_v);
              if (param0.field_k != 1) {
                break L1;
              } else {
                var6_int = var6_int + (-((gm) this).field_a.field_u + param3.field_s) / 2;
                break L1;
              }
            }
            L2: {
              var7 = ((gm) this).field_g + param4 - -param3.field_m;
              if (-3 != (param0.field_k ^ -1)) {
                break L2;
              } else {
                var6_int = var6_int + (-((gm) this).field_a.field_u + param3.field_s);
                break L2;
              }
            }
            L3: {
              if (param0.field_b == 1) {
                var7 = var7 + (param3.field_x - ((gm) this).field_a.field_r) / 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-3 == (param0.field_b ^ -1)) {
                var7 = var7 + (param3.field_x + -((gm) this).field_a.field_r);
                break L4;
              } else {
                break L4;
              }
            }
            ((gm) this).field_a.e(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= 118) {
          var6 = param0.c(param3, 3);
          if (var6 != null) {
            if (null != param0.field_g) {
              if (((gm) this).field_i < 0) {
                return;
              } else {
                L5: {
                  stackOut_20_0 = param0.field_g;
                  stackOut_20_1 = (String) var6;
                  stackOut_20_2 = param2 + (param3.field_v + param0.field_q);
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  if (2147483647 == ((gm) this).field_h) {
                    stackOut_22_0 = (vm) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    break L5;
                  } else {
                    stackOut_21_0 = (vm) (Object) stackIn_21_0;
                    stackOut_21_1 = (String) (Object) stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = ((gm) this).field_h;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    break L5;
                  }
                }
                L6: {
                  stackOut_23_0 = (vm) (Object) stackIn_23_0;
                  stackOut_23_1 = (String) (Object) stackIn_23_1;
                  stackOut_23_2 = stackIn_23_2 - -stackIn_23_3;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  if (2147483647 != ((gm) this).field_g) {
                    stackOut_25_0 = (vm) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = ((gm) this).field_g;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    break L6;
                  } else {
                    stackOut_24_0 = (vm) (Object) stackIn_24_0;
                    stackOut_24_1 = (String) (Object) stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = 0;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    stackIn_26_3 = stackOut_24_3;
                    break L6;
                  }
                }
                L7: {
                  stackOut_26_0 = (vm) (Object) stackIn_26_0;
                  stackOut_26_1 = (String) (Object) stackIn_26_1;
                  stackOut_26_2 = stackIn_26_2;
                  stackOut_26_3 = stackIn_26_3 + (param0.field_n + param4) + param3.field_m;
                  stackOut_26_4 = -param0.field_p + param3.field_s - param0.field_q;
                  stackOut_26_5 = param3.field_x - (param0.field_n + param0.field_i);
                  stackOut_26_6 = ((gm) this).field_i;
                  stackOut_26_7 = ((gm) this).field_l;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  stackIn_28_4 = stackOut_26_4;
                  stackIn_28_5 = stackOut_26_5;
                  stackIn_28_6 = stackOut_26_6;
                  stackIn_28_7 = stackOut_26_7;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  stackIn_27_3 = stackOut_26_3;
                  stackIn_27_4 = stackOut_26_4;
                  stackIn_27_5 = stackOut_26_5;
                  stackIn_27_6 = stackOut_26_6;
                  stackIn_27_7 = stackOut_26_7;
                  if (2147483647 != (((gm) this).field_e ^ -1)) {
                    stackOut_28_0 = (vm) (Object) stackIn_28_0;
                    stackOut_28_1 = (String) (Object) stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = stackIn_28_3;
                    stackOut_28_4 = stackIn_28_4;
                    stackOut_28_5 = stackIn_28_5;
                    stackOut_28_6 = stackIn_28_6;
                    stackOut_28_7 = stackIn_28_7;
                    stackOut_28_8 = ((gm) this).field_e;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    stackIn_29_3 = stackOut_28_3;
                    stackIn_29_4 = stackOut_28_4;
                    stackIn_29_5 = stackOut_28_5;
                    stackIn_29_6 = stackOut_28_6;
                    stackIn_29_7 = stackOut_28_7;
                    stackIn_29_8 = stackOut_28_8;
                    break L7;
                  } else {
                    stackOut_27_0 = (vm) (Object) stackIn_27_0;
                    stackOut_27_1 = (String) (Object) stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = stackIn_27_3;
                    stackOut_27_4 = stackIn_27_4;
                    stackOut_27_5 = stackIn_27_5;
                    stackOut_27_6 = stackIn_27_6;
                    stackOut_27_7 = stackIn_27_7;
                    stackOut_27_8 = 256;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    stackIn_29_3 = stackOut_27_3;
                    stackIn_29_4 = stackOut_27_4;
                    stackIn_29_5 = stackOut_27_5;
                    stackIn_29_6 = stackOut_27_6;
                    stackIn_29_7 = stackOut_27_7;
                    stackIn_29_8 = stackOut_27_8;
                    break L7;
                  }
                }
                int discarded$1 = ((vm) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param0.field_k, param0.field_b, param0.field_a);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(ag param0, gm param1, byte param2, ha param3, int param4, int param5) {
        if (!((gm) this).field_b) {
          L0: {
            if (-2147483648 != ((gm) this).field_e) {
              param1.field_e = ((gm) this).field_e;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 > 40) {
            if (2147483647 == (((gm) this).field_h ^ -1)) {
              L1: {
                if (null != ((gm) this).field_a) {
                  param1.field_a = ((gm) this).field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((gm) this).field_c != null) {
                  param1.field_c = ((gm) this).field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-1 <= ((gm) this).field_l) {
                  param1.field_l = ((gm) this).field_l;
                  break L3;
                } else {
                  break L3;
                }
              }
              if ((((gm) this).field_g ^ -1) == 2147483647) {
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              } else {
                param1.field_g = ((gm) this).field_g;
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L4: {
                param1.field_h = ((gm) this).field_h;
                if (null != ((gm) this).field_a) {
                  param1.field_a = ((gm) this).field_a;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (((gm) this).field_c != null) {
                  param1.field_c = ((gm) this).field_c;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-1 <= ((gm) this).field_l) {
                  param1.field_l = ((gm) this).field_l;
                  break L6;
                } else {
                  break L6;
                }
              }
              if ((((gm) this).field_g ^ -1) == 2147483647) {
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              } else {
                param1.field_g = ((gm) this).field_g;
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            ((gm) this).field_g = 72;
            if (2147483647 == (((gm) this).field_h ^ -1)) {
              L7: {
                if (null != ((gm) this).field_a) {
                  param1.field_a = ((gm) this).field_a;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (((gm) this).field_c != null) {
                  param1.field_c = ((gm) this).field_c;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (-1 <= ((gm) this).field_l) {
                  param1.field_l = ((gm) this).field_l;
                  break L9;
                } else {
                  break L9;
                }
              }
              if ((((gm) this).field_g ^ -1) == 2147483647) {
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              } else {
                param1.field_g = ((gm) this).field_g;
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L10: {
                param1.field_h = ((gm) this).field_h;
                if (null != ((gm) this).field_a) {
                  param1.field_a = ((gm) this).field_a;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (((gm) this).field_c != null) {
                  param1.field_c = ((gm) this).field_c;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (-1 <= ((gm) this).field_l) {
                  param1.field_l = ((gm) this).field_l;
                  break L12;
                } else {
                  break L12;
                }
              }
              if ((((gm) this).field_g ^ -1) != 2147483647) {
                param1.field_g = ((gm) this).field_g;
                if (-1 <= ((gm) this).field_i) {
                  param1.field_i = ((gm) this).field_i;
                  return;
                } else {
                  return;
                }
              } else {
                if (-1 > ((gm) this).field_i) {
                  return;
                } else {
                  param1.field_i = ((gm) this).field_i;
                  return;
                }
              }
            }
          }
        } else {
          L13: {
            param1.a(param3, 126, param5, param0, param4);
            param1.b(125);
            if (-2147483648 != ((gm) this).field_e) {
              param1.field_e = ((gm) this).field_e;
              break L13;
            } else {
              break L13;
            }
          }
          if (param2 <= 40) {
            ((gm) this).field_g = 72;
            if (2147483647 != (((gm) this).field_h ^ -1)) {
              L14: {
                param1.field_h = ((gm) this).field_h;
                if (null != ((gm) this).field_a) {
                  param1.field_a = ((gm) this).field_a;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (((gm) this).field_c != null) {
                  param1.field_c = ((gm) this).field_c;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-1 <= ((gm) this).field_l) {
                  param1.field_l = ((gm) this).field_l;
                  break L16;
                } else {
                  break L16;
                }
              }
              if ((((gm) this).field_g ^ -1) == 2147483647) {
                if (-1 > ((gm) this).field_i) {
                  return;
                } else {
                  param1.field_i = ((gm) this).field_i;
                  return;
                }
              } else {
                param1.field_g = ((gm) this).field_g;
                if (-1 > ((gm) this).field_i) {
                  return;
                } else {
                  param1.field_i = ((gm) this).field_i;
                  return;
                }
              }
            } else {
              L17: {
                if (null != ((gm) this).field_a) {
                  param1.field_a = ((gm) this).field_a;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((gm) this).field_c != null) {
                  param1.field_c = ((gm) this).field_c;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (-1 <= ((gm) this).field_l) {
                  param1.field_l = ((gm) this).field_l;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if ((((gm) this).field_g ^ -1) == 2147483647) {
                  break L20;
                } else {
                  param1.field_g = ((gm) this).field_g;
                  break L20;
                }
              }
              if (-1 > ((gm) this).field_i) {
                return;
              } else {
                param1.field_i = ((gm) this).field_i;
                return;
              }
            }
          } else {
            L21: {
              if (2147483647 == (((gm) this).field_h ^ -1)) {
                break L21;
              } else {
                param1.field_h = ((gm) this).field_h;
                break L21;
              }
            }
            L22: {
              if (null != ((gm) this).field_a) {
                param1.field_a = ((gm) this).field_a;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (((gm) this).field_c != null) {
                param1.field_c = ((gm) this).field_c;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (-1 <= ((gm) this).field_l) {
                param1.field_l = ((gm) this).field_l;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if ((((gm) this).field_g ^ -1) == 2147483647) {
                break L25;
              } else {
                param1.field_g = ((gm) this).field_g;
                break L25;
              }
            }
            if (-1 > ((gm) this).field_i) {
              return;
            } else {
              param1.field_i = ((gm) this).field_i;
              return;
            }
          }
        }
    }

    final void a(gm param0, byte param1) {
        param0.field_g = ((gm) this).field_g;
        param0.field_b = ((gm) this).field_b;
        param0.field_i = ((gm) this).field_i;
        param0.field_l = ((gm) this).field_l;
        param0.field_e = ((gm) this).field_e;
        param0.field_h = ((gm) this).field_h;
        param0.field_a = ((gm) this).field_a;
        if (param1 != 33) {
          field_m = 89;
          param0.field_c = ((gm) this).field_c;
          return;
        } else {
          param0.field_c = ((gm) this).field_c;
          return;
        }
    }

    final gm a(int param0, int param1) {
        if (param0 != -2147483648) {
            field_f = -11;
            ((gm) this).field_l = param1;
            return (gm) this;
        }
        ((gm) this).field_l = param1;
        return (gm) this;
    }

    public static void a(int param0) {
        field_j = null;
        field_d = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        Object var2 = null;
        String discarded$0 = gm.a((CharSequence) null, 54, false);
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var3 = tb.a(param0, -24224, param2);
        if (var3 == null) {
          var4 = 0;
          if (param1 >= -115) {
            gm.a(-73);
            L0: while (true) {
              if (param0.length() > var4) {
                if (aa.a(param0.charAt(var4), (byte) 108)) {
                  var4++;
                  continue L0;
                } else {
                  return wk.field_e;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (param0.length() > var4) {
                if (aa.a(param0.charAt(var4), (byte) 108)) {
                  var4++;
                  continue L1;
                } else {
                  return wk.field_e;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return var3;
        }
    }

    final gm a(byte param0, int param1) {
        ((gm) this).field_g = param1;
        if (param0 < 23) {
            gm discarded$0 = ((gm) this).a((byte) 13, false);
            return (gm) this;
        }
        return (gm) this;
    }

    final gm b(int param0, int param1) {
        ((gm) this).field_h = param0;
        if (param1 != 16802) {
            gm discarded$0 = ((gm) this).a(107, -107);
            return (gm) this;
        }
        return (gm) this;
    }

    final gm a(byte param0, boolean param1) {
        Object var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((gm) this).field_b = stackIn_3_1 != 0;
        if (param0 > -26) {
          var4 = null;
          int discarded$2 = gm.a((CharSequence) null, '\'', (byte) -41);
          return (gm) this;
        } else {
          return (gm) this;
        }
    }

    gm() {
        ((gm) this).field_b = false;
        ((gm) this).field_i = -2;
        ((gm) this).field_c = null;
        ((gm) this).field_h = -2147483648;
        ((gm) this).field_a = null;
        ((gm) this).field_l = -2;
        ((gm) this).field_e = -2147483648;
        ((gm) this).field_g = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
