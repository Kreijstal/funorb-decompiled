/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vv {
    private int field_i;
    private int field_h;
    phb[] field_b;
    phb field_e;
    private int field_g;
    private boolean field_d;
    private int field_f;
    static String field_a;
    static int field_c;
    private int field_j;

    final void a(byte param0, vv param1) {
        param1.field_b = ((vv) this).field_b;
        param1.field_i = ((vv) this).field_i;
        param1.field_h = ((vv) this).field_h;
        param1.field_g = ((vv) this).field_g;
        param1.field_j = ((vv) this).field_j;
        param1.field_f = ((vv) this).field_f;
        int var3 = 52 / ((param0 - 30) / 45);
        param1.field_e = ((vv) this).field_e;
        param1.field_d = ((vv) this).field_d;
    }

    final vv a(int param0, int param1) {
        int var3 = 107 / ((0 - param0) / 45);
        ((vv) this).field_h = param1;
        return (vv) this;
    }

    final void a(uea param0, boolean param1, int param2, shb param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        no stackIn_21_0 = null;
        String stackIn_21_1 = null;
        no stackIn_22_0 = null;
        String stackIn_22_1 = null;
        no stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        no stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        no stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        no stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        no stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        no stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        no stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        no stackOut_20_0 = null;
        String stackOut_20_1 = null;
        no stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        no stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        no stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        no stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        no stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        no stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        no stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        no stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        L0: {
          abb.a(3, param3.field_f, param3.field_h, param4 - -param3.field_r, ((vv) this).field_b, param2 - -param3.field_g);
          if (((vv) this).field_e != null) {
            L1: {
              var6_int = ((vv) this).field_h + (param2 - -param3.field_g);
              if (-2 == (param0.field_c ^ -1)) {
                var6_int = var6_int + (-((vv) this).field_e.field_m + param3.field_h) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = ((vv) this).field_f + (param4 - -param3.field_r);
              if (2 == param0.field_c) {
                var6_int = var6_int + (-((vv) this).field_e.field_m + param3.field_h);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param0.field_n ^ -1) == -2) {
                var7 = var7 + (-((vv) this).field_e.field_n + param3.field_f) / 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0.field_n != 2) {
                break L4;
              } else {
                var7 = var7 + (param3.field_f - ((vv) this).field_e.field_n);
                break L4;
              }
            }
            ((vv) this).field_e.a(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          var6 = param0.b((byte) -110, param3);
          if (var6 != null) {
            if (null == param0.field_d) {
              return;
            } else {
              L5: {
                if (-1 < ((vv) this).field_j) {
                  break L5;
                } else {
                  L6: {
                    stackOut_20_0 = param0.field_d;
                    stackOut_20_1 = (String) var6;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (2147483647 != ((vv) this).field_h) {
                      stackOut_22_0 = (no) (Object) stackIn_22_0;
                      stackOut_22_1 = (String) (Object) stackIn_22_1;
                      stackOut_22_2 = ((vv) this).field_h;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      break L6;
                    } else {
                      stackOut_21_0 = (no) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = 0;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_23_0 = (no) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2 + param0.field_f + (param2 + param3.field_g);
                    stackOut_23_3 = param4;
                    stackOut_23_4 = param3.field_r;
                    stackOut_23_5 = -param0.field_k;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    stackIn_25_4 = stackOut_23_4;
                    stackIn_25_5 = stackOut_23_5;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    stackIn_24_5 = stackOut_23_5;
                    if (-2147483648 != ((vv) this).field_f) {
                      stackOut_25_0 = (no) (Object) stackIn_25_0;
                      stackOut_25_1 = (String) (Object) stackIn_25_1;
                      stackOut_25_2 = stackIn_25_2;
                      stackOut_25_3 = stackIn_25_3;
                      stackOut_25_4 = stackIn_25_4;
                      stackOut_25_5 = stackIn_25_5;
                      stackOut_25_6 = ((vv) this).field_f;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      stackIn_26_3 = stackOut_25_3;
                      stackIn_26_4 = stackOut_25_4;
                      stackIn_26_5 = stackOut_25_5;
                      stackIn_26_6 = stackOut_25_6;
                      break L7;
                    } else {
                      stackOut_24_0 = (no) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = stackIn_24_5;
                      stackOut_24_6 = 0;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackIn_26_3 = stackOut_24_3;
                      stackIn_26_4 = stackOut_24_4;
                      stackIn_26_5 = stackOut_24_5;
                      stackIn_26_6 = stackOut_24_6;
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_26_0 = (no) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3 + (stackIn_26_4 - (stackIn_26_5 + -stackIn_26_6));
                    stackOut_26_4 = param3.field_h + -param0.field_f - param0.field_o;
                    stackOut_26_5 = -param0.field_k + (param3.field_f - param0.field_m);
                    stackOut_26_6 = ((vv) this).field_j;
                    stackOut_26_7 = ((vv) this).field_g;
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
                    if (-2147483648 != ((vv) this).field_i) {
                      stackOut_28_0 = (no) (Object) stackIn_28_0;
                      stackOut_28_1 = (String) (Object) stackIn_28_1;
                      stackOut_28_2 = stackIn_28_2;
                      stackOut_28_3 = stackIn_28_3;
                      stackOut_28_4 = stackIn_28_4;
                      stackOut_28_5 = stackIn_28_5;
                      stackOut_28_6 = stackIn_28_6;
                      stackOut_28_7 = stackIn_28_7;
                      stackOut_28_8 = ((vv) this).field_i;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      stackIn_29_4 = stackOut_28_4;
                      stackIn_29_5 = stackOut_28_5;
                      stackIn_29_6 = stackOut_28_6;
                      stackIn_29_7 = stackOut_28_7;
                      stackIn_29_8 = stackOut_28_8;
                      break L8;
                    } else {
                      stackOut_27_0 = (no) (Object) stackIn_27_0;
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
                      break L8;
                    }
                  }
                  int discarded$1 = ((no) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param0.field_c, param0.field_n, param0.field_h);
                  break L5;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 24358) {
            vv.b(-6);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final void a(vv param0, int param1, shb param2, int param3, int param4, uea param5) {
        if (param4 == -2879) {
          if (!((vv) this).field_d) {
            L0: {
              if (2147483647 != ((vv) this).field_f) {
                param0.field_f = ((vv) this).field_f;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 <= ((vv) this).field_g) {
                param0.field_g = ((vv) this).field_g;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2147483648 != ((vv) this).field_i) {
                param0.field_i = ((vv) this).field_i;
                break L2;
              } else {
                break L2;
              }
            }
            if (null != ((vv) this).field_b) {
              L3: {
                param0.field_b = ((vv) this).field_b;
                if (null != ((vv) this).field_e) {
                  param0.field_e = ((vv) this).field_e;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-2147483648 != ((vv) this).field_h) {
                  param0.field_h = ((vv) this).field_h;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (0 >= (((vv) this).field_j ^ -1)) {
                  param0.field_j = ((vv) this).field_j;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                if (null != ((vv) this).field_e) {
                  param0.field_e = ((vv) this).field_e;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-2147483648 != ((vv) this).field_h) {
                  param0.field_h = ((vv) this).field_h;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (0 >= (((vv) this).field_j ^ -1)) {
                  param0.field_j = ((vv) this).field_j;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            L9: {
              param0.a(param5, false, param1, param2, param3);
              param0.a(param4 ^ -2887);
              if (2147483647 != (((vv) this).field_f ^ -1)) {
                param0.field_f = ((vv) this).field_f;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (-1 <= ((vv) this).field_g) {
                param0.field_g = ((vv) this).field_g;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (-2147483648 != ((vv) this).field_i) {
                param0.field_i = ((vv) this).field_i;
                break L11;
              } else {
                break L11;
              }
            }
            if (null != ((vv) this).field_b) {
              L12: {
                param0.field_b = ((vv) this).field_b;
                if (null != ((vv) this).field_e) {
                  param0.field_e = ((vv) this).field_e;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (-2147483648 != ((vv) this).field_h) {
                  param0.field_h = ((vv) this).field_h;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (0 >= (((vv) this).field_j ^ -1)) {
                  param0.field_j = ((vv) this).field_j;
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            } else {
              L15: {
                if (null != ((vv) this).field_e) {
                  param0.field_e = ((vv) this).field_e;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-2147483648 != ((vv) this).field_h) {
                  param0.field_h = ((vv) this).field_h;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (0 >= ((vv) this).field_j) {
                  param0.field_j = ((vv) this).field_j;
                  break L17;
                } else {
                  break L17;
                }
              }
              return;
            }
          }
        } else {
          ((vv) this).field_f = 100;
          if (((vv) this).field_d) {
            L18: {
              param0.a(param5, false, param1, param2, param3);
              param0.a(param4 ^ -2887);
              if (2147483647 != (((vv) this).field_f ^ -1)) {
                param0.field_f = ((vv) this).field_f;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (-1 <= ((vv) this).field_g) {
                param0.field_g = ((vv) this).field_g;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (-2147483648 != ((vv) this).field_i) {
                param0.field_i = ((vv) this).field_i;
                break L20;
              } else {
                break L20;
              }
            }
            if (null == ((vv) this).field_b) {
              L21: {
                if (null != ((vv) this).field_e) {
                  param0.field_e = ((vv) this).field_e;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (-2147483648 != ((vv) this).field_h) {
                  param0.field_h = ((vv) this).field_h;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (0 >= (((vv) this).field_j ^ -1)) {
                  param0.field_j = ((vv) this).field_j;
                  break L23;
                } else {
                  break L23;
                }
              }
              return;
            } else {
              L24: {
                param0.field_b = ((vv) this).field_b;
                if (null != ((vv) this).field_e) {
                  param0.field_e = ((vv) this).field_e;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (-2147483648 != ((vv) this).field_h) {
                  param0.field_h = ((vv) this).field_h;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (0 >= (((vv) this).field_j ^ -1)) {
                  param0.field_j = ((vv) this).field_j;
                  break L26;
                } else {
                  break L26;
                }
              }
              return;
            }
          } else {
            L27: {
              if (2147483647 != (((vv) this).field_f ^ -1)) {
                param0.field_f = ((vv) this).field_f;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (-1 <= ((vv) this).field_g) {
                param0.field_g = ((vv) this).field_g;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (-2147483648 != ((vv) this).field_i) {
                param0.field_i = ((vv) this).field_i;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (null == ((vv) this).field_b) {
                break L30;
              } else {
                param0.field_b = ((vv) this).field_b;
                break L30;
              }
            }
            L31: {
              if (null != ((vv) this).field_e) {
                param0.field_e = ((vv) this).field_e;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (-2147483648 != ((vv) this).field_h) {
                param0.field_h = ((vv) this).field_h;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (0 >= (((vv) this).field_j ^ -1)) {
                param0.field_j = ((vv) this).field_j;
                break L33;
              } else {
                break L33;
              }
            }
            return;
          }
        }
    }

    final vv b(int param0, int param1) {
        if (param1 != -2147483648) {
            ((vv) this).field_b = null;
            ((vv) this).field_j = param0;
            return (vv) this;
        }
        ((vv) this).field_j = param0;
        return (vv) this;
    }

    final vv a(boolean param0, phb[] param1) {
        if (!param0) {
          vv discarded$2 = ((vv) this).a(77, 70);
          ((vv) this).field_b = param1;
          return (vv) this;
        } else {
          ((vv) this).field_b = param1;
          return (vv) this;
        }
    }

    final vv c(int param0, int param1) {
        ((vv) this).field_g = param0;
        if (param1 != -2147483648) {
            vv discarded$0 = ((vv) this).b(-117, 101);
            return (vv) this;
        }
        return (vv) this;
    }

    final vv b(int param0, boolean param1) {
        Object var4 = null;
        if (param1) {
          var4 = null;
          ((vv) this).a((uea) null, false, 1, (shb) null, -23);
          ((vv) this).field_f = param0;
          return (vv) this;
        } else {
          ((vv) this).field_f = param0;
          return (vv) this;
        }
    }

    final vv a(int param0, boolean param1) {
        ((vv) this).field_d = param1 ? true : false;
        if (param0 > -121) {
            return null;
        }
        return (vv) this;
    }

    final void a(int param0) {
        ((vv) this).field_g = -1;
        if (param0 != 120) {
          vv discarded$2 = ((vv) this).a(-14, 114);
          ((vv) this).field_h = 0;
          ((vv) this).field_f = 0;
          ((vv) this).field_b = null;
          ((vv) this).field_i = 256;
          ((vv) this).field_e = null;
          ((vv) this).field_j = 0;
          return;
        } else {
          ((vv) this).field_h = 0;
          ((vv) this).field_f = 0;
          ((vv) this).field_b = null;
          ((vv) this).field_i = 256;
          ((vv) this).field_e = null;
          ((vv) this).field_j = 0;
          return;
        }
    }

    vv() {
        ((vv) this).field_b = null;
        ((vv) this).field_g = -2;
        ((vv) this).field_d = false;
        ((vv) this).field_i = -2147483648;
        ((vv) this).field_f = -2147483648;
        ((vv) this).field_e = null;
        ((vv) this).field_h = -2147483648;
        ((vv) this).field_j = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Only show lobby chat from my friends";
        field_c = 120;
    }
}
