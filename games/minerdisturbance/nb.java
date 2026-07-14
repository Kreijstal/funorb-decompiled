/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[][] field_g;
    private int field_b;
    static ea[] field_a;
    private int field_h;
    static int field_f;
    private boolean field_l;
    private int field_k;
    private int field_c;
    ea field_e;
    static ml[] field_i;
    private int field_j;
    ea[] field_d;

    final static void a(byte param0, int param1) {
        int var4 = MinerDisturbance.field_ab;
        wb var5 = (wb) (Object) hj.field_k.b(102);
        while (var5 != null) {
            ab.a(-20680, param1, var5);
            var5 = (wb) (Object) hj.field_k.b((byte) 56);
        }
        int var3 = -120 % ((14 - param0) / 44);
        lc var6 = (lc) (Object) sj.field_g.b(77);
        while (var6 != null) {
            lc.a((byte) 126, param1, var6);
            var6 = (lc) (Object) sj.field_g.b((byte) 56);
        }
    }

    final nb b(int param0, boolean param1) {
        ((nb) this).field_j = param0;
        if (!param1) {
            return null;
        }
        return (nb) this;
    }

    final void a(int param0, fe param1, on param2, int param3, int param4) {
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        we stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        we stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        we stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        we stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        we stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        we stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        we stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        we stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        we stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        we stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        we stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        we stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        we stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        we stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        we stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        we stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        we stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        we stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        L0: {
          g.a(param1.field_t + param3, param1.field_q, param0 - -param1.field_u, param1.field_v, (byte) 55, ((nb) this).field_d);
          if (null != ((nb) this).field_e) {
            L1: {
              var6 = param1.field_u + (param0 + ((nb) this).field_c);
              var7_int = ((nb) this).field_k + (param1.field_t + param3);
              if (param2.field_j != 1) {
                break L1;
              } else {
                var6 = var6 + (param1.field_v + -((nb) this).field_e.field_x) / 2;
                break L1;
              }
            }
            L2: {
              if (param2.field_d == 1) {
                var7_int = var7_int + (-((nb) this).field_e.field_A + param1.field_q) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (2 == param2.field_j) {
                var6 = var6 + (-((nb) this).field_e.field_x + param1.field_v);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (2 == param2.field_d) {
                var7_int = var7_int + (-((nb) this).field_e.field_A + param1.field_q);
                break L4;
              } else {
                break L4;
              }
            }
            ((nb) this).field_e.f(var6, var7_int);
            break L0;
          } else {
            break L0;
          }
        }
        var6 = -22 / ((param4 - -35) / 61);
        var7 = param2.a(param1, (byte) -115);
        if (var7 != null) {
          if (param2.field_k == null) {
            return;
          } else {
            L5: {
              if (-1 < (((nb) this).field_h ^ -1)) {
                break L5;
              } else {
                L6: {
                  stackOut_18_0 = param2.field_k;
                  stackOut_18_1 = (String) var7;
                  stackOut_18_2 = param1.field_u + param0 - -param2.field_n;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (-2147483648 != ((nb) this).field_c) {
                    stackOut_20_0 = (we) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = ((nb) this).field_c;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    break L6;
                  } else {
                    stackOut_19_0 = (we) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    break L6;
                  }
                }
                L7: {
                  stackOut_21_0 = (we) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2 + stackIn_21_3;
                  stackOut_21_3 = param1.field_t + param3;
                  stackOut_21_4 = param2.field_c;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  stackIn_22_4 = stackOut_21_4;
                  if (-2147483648 == ((nb) this).field_k) {
                    stackOut_23_0 = (we) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = stackIn_23_4;
                    stackOut_23_5 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    stackIn_24_5 = stackOut_23_5;
                    break L7;
                  } else {
                    stackOut_22_0 = (we) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = stackIn_22_4;
                    stackOut_22_5 = ((nb) this).field_k;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    break L7;
                  }
                }
                L8: {
                  stackOut_24_0 = (we) (Object) stackIn_24_0;
                  stackOut_24_1 = (String) (Object) stackIn_24_1;
                  stackOut_24_2 = stackIn_24_2;
                  stackOut_24_3 = stackIn_24_3 + (stackIn_24_4 + stackIn_24_5);
                  stackOut_24_4 = -param2.field_i + (param1.field_v + -param2.field_n);
                  stackOut_24_5 = param1.field_q + -param2.field_c - param2.field_l;
                  stackOut_24_6 = ((nb) this).field_h;
                  stackOut_24_7 = ((nb) this).field_j;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_26_5 = stackOut_24_5;
                  stackIn_26_6 = stackOut_24_6;
                  stackIn_26_7 = stackOut_24_7;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  stackIn_25_5 = stackOut_24_5;
                  stackIn_25_6 = stackOut_24_6;
                  stackIn_25_7 = stackOut_24_7;
                  if (2147483647 == (((nb) this).field_b ^ -1)) {
                    stackOut_26_0 = (we) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = 256;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    stackIn_27_8 = stackOut_26_8;
                    break L8;
                  } else {
                    stackOut_25_0 = (we) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = stackIn_25_5;
                    stackOut_25_6 = stackIn_25_6;
                    stackOut_25_7 = stackIn_25_7;
                    stackOut_25_8 = ((nb) this).field_b;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_27_8 = stackOut_25_8;
                    break L8;
                  }
                }
                int discarded$1 = ((we) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param2.field_j, param2.field_d, param2.field_e);
                break L5;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final nb a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != -13903) {
          L0: {
            nb discarded$13 = ((nb) this).a(-40, (byte) 105);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((nb) this).field_l = stackIn_8_1 != 0;
          return (nb) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((nb) this).field_l = stackIn_4_1 != 0;
          return (nb) this;
        }
    }

    final nb a(ea[] param0, int param1) {
        ((nb) this).field_d = param0;
        if (param1 != 7392) {
            nb discarded$0 = ((nb) this).b(64, false);
            return (nb) this;
        }
        return (nb) this;
    }

    final void a(nb param0, byte param1) {
        param0.field_c = ((nb) this).field_c;
        param0.field_h = ((nb) this).field_h;
        param0.field_k = ((nb) this).field_k;
        param0.field_l = ((nb) this).field_l;
        int var3 = -79 % ((-91 - param1) / 32);
        param0.field_b = ((nb) this).field_b;
        param0.field_d = ((nb) this).field_d;
        param0.field_e = ((nb) this).field_e;
        param0.field_j = ((nb) this).field_j;
    }

    final nb a(int param0, byte param1) {
        if (param1 >= -32) {
            return null;
        }
        ((nb) this).field_k = param0;
        return (nb) this;
    }

    final nb b(int param0, byte param1) {
        if (param1 != -93) {
            return null;
        }
        ((nb) this).field_c = param0;
        return (nb) this;
    }

    final void b(int param0) {
        ((nb) this).field_j = param0;
        ((nb) this).field_b = 256;
        ((nb) this).field_k = 0;
        ((nb) this).field_c = 0;
        ((nb) this).field_e = null;
        ((nb) this).field_h = 0;
        ((nb) this).field_d = null;
    }

    final void a(int param0, fe param1, on param2, nb param3, int param4, int param5) {
        if (!((nb) this).field_l) {
          if (param0 == 14097) {
            if (((nb) this).field_k == -2147483648) {
              L0: {
                if (-1 <= ((nb) this).field_h) {
                  param3.field_h = ((nb) this).field_h;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (null != ((nb) this).field_d) {
                  param3.field_d = ((nb) this).field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (null != ((nb) this).field_e) {
                L2: {
                  param3.field_e = ((nb) this).field_e;
                  if (2147483647 != (((nb) this).field_b ^ -1)) {
                    param3.field_b = ((nb) this).field_b;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  if (2147483647 != (((nb) this).field_b ^ -1)) {
                    param3.field_b = ((nb) this).field_b;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              L8: {
                param3.field_k = ((nb) this).field_k;
                if (-1 <= ((nb) this).field_h) {
                  param3.field_h = ((nb) this).field_h;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (null != ((nb) this).field_d) {
                  param3.field_d = ((nb) this).field_d;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (null != ((nb) this).field_e) {
                L10: {
                  param3.field_e = ((nb) this).field_e;
                  if (2147483647 != (((nb) this).field_b ^ -1)) {
                    param3.field_b = ((nb) this).field_b;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              } else {
                L13: {
                  if (2147483647 != (((nb) this).field_b ^ -1)) {
                    param3.field_b = ((nb) this).field_b;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            }
          } else {
            ((nb) this).field_d = null;
            if (((nb) this).field_k == -2147483648) {
              L16: {
                if (-1 <= ((nb) this).field_h) {
                  param3.field_h = ((nb) this).field_h;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (null != ((nb) this).field_d) {
                  param3.field_d = ((nb) this).field_d;
                  break L17;
                } else {
                  break L17;
                }
              }
              if (null != ((nb) this).field_e) {
                L18: {
                  param3.field_e = ((nb) this).field_e;
                  if (2147483647 != (((nb) this).field_b ^ -1)) {
                    param3.field_b = ((nb) this).field_b;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                return;
              } else {
                L21: {
                  if (2147483647 != ((nb) this).field_b) {
                    param3.field_b = ((nb) this).field_b;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return;
              }
            } else {
              L24: {
                param3.field_k = ((nb) this).field_k;
                if (-1 <= ((nb) this).field_h) {
                  param3.field_h = ((nb) this).field_h;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (null != ((nb) this).field_d) {
                  param3.field_d = ((nb) this).field_d;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (null == ((nb) this).field_e) {
                  break L26;
                } else {
                  param3.field_e = ((nb) this).field_e;
                  break L26;
                }
              }
              L27: {
                if (2147483647 != (((nb) this).field_b ^ -1)) {
                  param3.field_b = ((nb) this).field_b;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (((nb) this).field_j <= 0) {
                  param3.field_j = ((nb) this).field_j;
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                if (2147483647 != ((nb) this).field_c) {
                  param3.field_c = ((nb) this).field_c;
                  break L29;
                } else {
                  break L29;
                }
              }
              return;
            }
          }
        } else {
          param3.a(param5, param1, param2, param4, param0 + -14206);
          param3.b(param0 ^ -14098);
          if (param0 != 14097) {
            ((nb) this).field_d = null;
            if (((nb) this).field_k != -2147483648) {
              L30: {
                param3.field_k = ((nb) this).field_k;
                if (-1 <= ((nb) this).field_h) {
                  param3.field_h = ((nb) this).field_h;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (null != ((nb) this).field_d) {
                  param3.field_d = ((nb) this).field_d;
                  break L31;
                } else {
                  break L31;
                }
              }
              if (null != ((nb) this).field_e) {
                L32: {
                  param3.field_e = ((nb) this).field_e;
                  if (2147483647 != (((nb) this).field_b ^ -1)) {
                    param3.field_b = ((nb) this).field_b;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                return;
              } else {
                L35: {
                  if (2147483647 != ((nb) this).field_b) {
                    param3.field_b = ((nb) this).field_b;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (((nb) this).field_j <= 0) {
                    param3.field_j = ((nb) this).field_j;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (2147483647 != ((nb) this).field_c) {
                    param3.field_c = ((nb) this).field_c;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                return;
              }
            } else {
              L38: {
                if (-1 <= ((nb) this).field_h) {
                  param3.field_h = ((nb) this).field_h;
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (null != ((nb) this).field_d) {
                  param3.field_d = ((nb) this).field_d;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (null == ((nb) this).field_e) {
                  break L40;
                } else {
                  param3.field_e = ((nb) this).field_e;
                  break L40;
                }
              }
              L41: {
                if (2147483647 != (((nb) this).field_b ^ -1)) {
                  param3.field_b = ((nb) this).field_b;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (((nb) this).field_j <= 0) {
                  param3.field_j = ((nb) this).field_j;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (2147483647 != ((nb) this).field_c) {
                  param3.field_c = ((nb) this).field_c;
                  break L43;
                } else {
                  break L43;
                }
              }
              return;
            }
          } else {
            L44: {
              if (((nb) this).field_k == -2147483648) {
                break L44;
              } else {
                param3.field_k = ((nb) this).field_k;
                break L44;
              }
            }
            L45: {
              if (-1 <= ((nb) this).field_h) {
                param3.field_h = ((nb) this).field_h;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (null != ((nb) this).field_d) {
                param3.field_d = ((nb) this).field_d;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (null == ((nb) this).field_e) {
                break L47;
              } else {
                param3.field_e = ((nb) this).field_e;
                break L47;
              }
            }
            L48: {
              if (2147483647 != (((nb) this).field_b ^ -1)) {
                param3.field_b = ((nb) this).field_b;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (((nb) this).field_j <= 0) {
                param3.field_j = ((nb) this).field_j;
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              if (2147483647 != ((nb) this).field_c) {
                param3.field_c = ((nb) this).field_c;
                break L50;
              } else {
                break L50;
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        if (param0 != 19) {
            nb.a((byte) -93, 97);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final nb a(int param0, int param1) {
        ((nb) this).field_h = param1;
        if (param0 <= 63) {
            nb.a((byte) 61, -107);
            return (nb) this;
        }
        return (nb) this;
    }

    nb() {
        ((nb) this).field_l = false;
        ((nb) this).field_b = -2147483648;
        ((nb) this).field_e = null;
        ((nb) this).field_h = -2;
        ((nb) this).field_k = -2147483648;
        ((nb) this).field_c = -2147483648;
        ((nb) this).field_j = -2;
        ((nb) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[][]{new int[15], new int[20]};
        field_f = 0;
    }
}
