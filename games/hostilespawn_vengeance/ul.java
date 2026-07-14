/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ul extends vd {
    static int field_H;
    private int field_I;
    static bd field_G;
    static java.text.DecimalFormat field_E;
    private gg field_K;
    static String field_M;
    static int field_L;
    static bd[] field_J;
    static boolean field_O;
    static gb field_P;
    static boolean field_N;
    boolean field_F;

    ul(gg param0, int param1, int param2) {
        super(-param1 + mm.field_q >> 1577789121, fb.field_f - param2 >> -1873882175, param1, param2, (nn) null);
        ((ul) this).field_K = param0;
        ((ul) this).field_I = 0;
        ((ul) this).field_F = false;
    }

    abstract void b(int param0, int param1, int param2);

    private final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            boolean discarded$10 = ((ul) this).j(-123);
            if (((ul) this).field_F) {
              if (this == (Object) (Object) ((ul) this).field_K.k(0)) {
                stackOut_11_0 = 256;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (((ul) this).field_F) {
              if (this == (Object) (Object) ((ul) this).field_K.k(0)) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == 65393) {
          var2 = this.a(true);
          var3 = -((ul) this).field_I + var2;
          if (var3 > 0) {
            L0: {
              ((ul) this).field_I = ((ul) this).field_I + (-1 + var3 + 8) / 8;
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                if (-1 != (((ul) this).field_I ^ -1)) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((ul) this).field_F) {
                      break L2;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L1;
            }
            return stackIn_41_0 != 0;
          } else {
            L3: {
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (-1 != (((ul) this).field_I ^ -1)) {
                  break L5;
                } else {
                  if (var2 != 0) {
                    break L5;
                  } else {
                    if (((ul) this).field_F) {
                      break L5;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L4;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          field_O = false;
          var2 = this.a(true);
          var3 = -((ul) this).field_I + var2;
          if (var3 <= 0) {
            L6: {
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L6;
              } else {
                break L6;
              }
            }
            if (-1 == (((ul) this).field_I ^ -1)) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((ul) this).field_F) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L8: {
              ((ul) this).field_I = ((ul) this).field_I + (-1 + var3 + 8) / 8;
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (-1 != (((ul) this).field_I ^ -1)) {
                  break L10;
                } else {
                  if (var2 != 0) {
                    break L10;
                  } else {
                    if (((ul) this).field_F) {
                      break L10;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L9;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L9;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    final ag i(int param0) {
        ag var2 = super.i(param0);
        if (var2 != null) {
            return var2;
        }
        return (ag) this;
    }

    boolean j(int param0) {
        ((ul) this).field_I = this.a(true);
        if (param0 == -15953) {
          if (((ul) this).field_I == 0) {
            if (((ul) this).field_F) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ul) this).a(param0, -param2 + fb.field_f >> -531077887, param1 + -15767, -param0 + mm.field_q >> -1847325791, param2);
        if (param1 != 15767) {
            field_G = null;
        }
    }

    final static ca a(boolean param0, String param1, long param2, String param3, int param4) {
        int var6 = 0;
        var6 = -6 / ((param4 - -59) / 39);
        if (param2 != 0L) {
          if (param0) {
            return (ca) (Object) new vk(param2, param3);
          } else {
            return (ca) (Object) new uh(param2, param3);
          }
        } else {
          if (param1 == null) {
            if (param0) {
              return (ca) (Object) new vk(param2, param3);
            } else {
              return (ca) (Object) new uh(param2, param3);
            }
          } else {
            return (ca) (Object) new la(param1, param3);
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        if (param2 >= 42) {
          if (0 != ((ul) this).field_I) {
            if (((ul) this).field_I >= 256) {
              if (param3 != 0) {
                return;
              } else {
                ((ul) this).b(((ul) this).field_m + param0, -238948511, ((ul) this).field_v + param1);
                super.a(param0, param1, (byte) 49, param3);
                return;
              }
            } else {
              if (q.field_f != null) {
                if (((ul) this).field_s <= q.field_f.field_z) {
                  if (q.field_f.field_A >= ((ul) this).field_x) {
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  } else {
                    q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  }
                } else {
                  q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                  sb.a(q.field_f, -119);
                  si.d();
                  ((ul) this).b(0, -238948511, 0);
                  super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                  eh.b(false);
                  q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                  return;
                }
              } else {
                q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                sb.a(q.field_f, -119);
                si.d();
                ((ul) this).b(0, -238948511, 0);
                super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                eh.b(false);
                q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          ca discarded$1 = ul.a(true, (String) null, 48L, (String) null, -128);
          if (0 != ((ul) this).field_I) {
            if (((ul) this).field_I >= 256) {
              if (param3 != 0) {
                return;
              } else {
                ((ul) this).b(((ul) this).field_m + param0, -238948511, ((ul) this).field_v + param1);
                super.a(param0, param1, (byte) 49, param3);
                return;
              }
            } else {
              if (q.field_f != null) {
                if (((ul) this).field_s <= q.field_f.field_z) {
                  if (q.field_f.field_A >= ((ul) this).field_x) {
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  } else {
                    q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  }
                } else {
                  q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                  sb.a(q.field_f, -119);
                  si.d();
                  ((ul) this).b(0, -238948511, 0);
                  super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                  eh.b(false);
                  q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                  return;
                }
              } else {
                q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                sb.a(q.field_f, -119);
                si.d();
                ((ul) this).b(0, -238948511, 0);
                super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                eh.b(false);
                q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static void e(byte param0) {
        ri.a((byte) 126, true, qi.field_G, fj.field_Sb);
        md.field_i = true;
        if (param0 != -25) {
            field_M = null;
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_E = null;
        field_J = null;
        if (param0 != -1847325791) {
          field_G = null;
          field_G = null;
          field_M = null;
          return;
        } else {
          field_G = null;
          field_M = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Your email address is used to identify this account";
        field_O = false;
    }
}
