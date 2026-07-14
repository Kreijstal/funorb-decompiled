/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi extends df {
    static ih field_C;
    h field_H;
    static int field_L;
    static String field_F;
    static long field_P;
    static qb field_I;
    static ll[] field_M;
    boolean field_G;
    static String field_Q;
    static String field_K;
    static int[] field_N;
    static String field_D;
    static byte[][] field_O;
    static String field_J;
    private int field_S;
    static qb[] field_E;
    static String field_R;

    final static void a(byte param0, String param1) {
        if (param0 < 58) {
            Object var3 = null;
            vi.a((byte) 16, (String) null);
            rj.field_i = param1;
            return;
        }
        rj.field_i = param1;
    }

    private final int i(byte param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 != -52) {
          L0: {
            var3 = null;
            vi.a((byte) -57, (String) null);
            if (!((vi) this).field_G) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this == (Object) (Object) ((vi) this).field_H.g(7213)) {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!((vi) this).field_G) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this == (Object) (Object) ((vi) this).field_H.g(7213)) {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        to.field_m = param3;
        if (param0 != -1) {
            return;
        }
        p.field_c = param2;
        sl.field_T = param1;
    }

    public static void h(byte param0) {
        Object var2 = null;
        if (param0 != 62) {
          var2 = null;
          vi.a((byte) 8, (String) null);
          field_O = null;
          field_Q = null;
          field_K = null;
          field_D = null;
          field_N = null;
          field_R = null;
          field_M = null;
          field_C = null;
          field_I = null;
          field_E = null;
          field_F = null;
          field_J = null;
          return;
        } else {
          field_O = null;
          field_Q = null;
          field_K = null;
          field_D = null;
          field_N = null;
          field_R = null;
          field_M = null;
          field_C = null;
          field_I = null;
          field_E = null;
          field_F = null;
          field_J = null;
          return;
        }
    }

    abstract void a(int param0, byte param1, int param2);

    final void a(int param0, int param1, int param2) {
        ((vi) this).a(param2, -param2 + mf.field_c >> -1717121535, param0, -param0 + gi.field_c >> 852710177, -112);
        if (param1 != 0) {
            ((vi) this).a((byte) -50, 71, 43, -75);
        }
    }

    vi(h param0, int param1, int param2) {
        super(-param1 + gi.field_c >> -1796693151, mf.field_c + -param2 >> -633583295, param1, param2, (pf) null);
        ((vi) this).field_H = param0;
        ((vi) this).field_G = false;
        ((vi) this).field_S = 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (0 != ((vi) this).field_S) {
          if ((((vi) this).field_S ^ -1) > -257) {
            if (null == ed.field_vb) {
              ed.field_vb = new qb(((vi) this).field_v, ((vi) this).field_k);
              if (param0 < -52) {
                fk.a(ed.field_vb, -23095);
                de.b();
                ((vi) this).a(0, (byte) -117, 0);
                this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                oo.c(-15405);
                ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                return;
              } else {
                field_E = null;
                fk.a(ed.field_vb, -23095);
                de.b();
                ((vi) this).a(0, (byte) -117, 0);
                this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                oo.c(-15405);
                ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                return;
              }
            } else {
              if (ed.field_vb.field_q < ((vi) this).field_v) {
                ed.field_vb = new qb(((vi) this).field_v, ((vi) this).field_k);
                if (param0 >= -52) {
                  field_E = null;
                  fk.a(ed.field_vb, -23095);
                  de.b();
                  ((vi) this).a(0, (byte) -117, 0);
                  this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                  oo.c(-15405);
                  ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                  return;
                } else {
                  fk.a(ed.field_vb, -23095);
                  de.b();
                  ((vi) this).a(0, (byte) -117, 0);
                  this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                  oo.c(-15405);
                  ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                  return;
                }
              } else {
                if (((vi) this).field_k > ed.field_vb.field_y) {
                  ed.field_vb = new qb(((vi) this).field_v, ((vi) this).field_k);
                  if (param0 >= -52) {
                    field_E = null;
                    fk.a(ed.field_vb, -23095);
                    de.b();
                    ((vi) this).a(0, (byte) -117, 0);
                    this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                    oo.c(-15405);
                    ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                    return;
                  } else {
                    fk.a(ed.field_vb, -23095);
                    de.b();
                    ((vi) this).a(0, (byte) -117, 0);
                    this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                    oo.c(-15405);
                    ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                    return;
                  }
                } else {
                  if (param0 < -52) {
                    fk.a(ed.field_vb, -23095);
                    de.b();
                    ((vi) this).a(0, (byte) -117, 0);
                    this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                    oo.c(-15405);
                    ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                    return;
                  } else {
                    field_E = null;
                    fk.a(ed.field_vb, -23095);
                    de.b();
                    ((vi) this).a(0, (byte) -117, 0);
                    this.a((byte) -117, -param1 + -((vi) this).field_n, param2, -((vi) this).field_j + -param3);
                    oo.c(-15405);
                    ed.field_vb.c(param1 + ((vi) this).field_n, param3 - -((vi) this).field_j, ((vi) this).field_S);
                    return;
                  }
                }
              }
            }
          } else {
            if (param2 != 0) {
              return;
            } else {
              ((vi) this).a(param1 + ((vi) this).field_n, (byte) -117, param3 - -((vi) this).field_j);
              this.a((byte) -76, param1, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 >= 19) {
          var2 = this.i((byte) -52);
          var3 = -((vi) this).field_S + var2;
          if (var3 <= 0) {
            if (-1 < (var3 ^ -1)) {
              L0: {
                L1: {
                  ((vi) this).field_S = ((vi) this).field_S + (1 + (-16 + var3)) / 16;
                  if (((vi) this).field_S != 0) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      break L1;
                    } else {
                      if (((vi) this).field_G) {
                        break L1;
                      } else {
                        stackOut_33_0 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_34_0 = 0;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              }
              return stackIn_35_0 != 0;
            } else {
              L2: {
                L3: {
                  if (((vi) this).field_S != 0) {
                    break L3;
                  } else {
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (((vi) this).field_G) {
                        break L3;
                      } else {
                        stackOut_27_0 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        break L2;
                      }
                    }
                  }
                }
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L2;
              }
              return stackIn_29_0 != 0;
            }
          } else {
            ((vi) this).field_S = ((vi) this).field_S + (-1 + (8 + var3)) / 8;
            if (-1 < (var3 ^ -1)) {
              ((vi) this).field_S = ((vi) this).field_S + (1 + (-16 + var3)) / 16;
              if (((vi) this).field_S == 0) {
                if (var2 != 0) {
                  return false;
                } else {
                  L4: {
                    if (((vi) this).field_G) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    }
                  }
                  return stackIn_20_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              if (((vi) this).field_S == 0) {
                if (var2 != 0) {
                  return false;
                } else {
                  L5: {
                    if (((vi) this).field_G) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L5;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L5;
                    }
                  }
                  return stackIn_10_0 != 0;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final qm e(int param0) {
        qm var2 = this.e(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (qm) this;
    }

    boolean g(byte param0) {
        if (param0 == 45) {
          ((vi) this).field_S = this.i((byte) -52);
          if (-1 == (((vi) this).field_S ^ -1)) {
            if (((vi) this).field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_F = null;
          ((vi) this).field_S = this.i((byte) -52);
          if (-1 == (((vi) this).field_S ^ -1)) {
            if (((vi) this).field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Unpacking spellbooks";
        field_K = "Unable to add name - system busy";
        field_D = "Only two targets left! Remember to control the velocity of your attack.";
        field_N = new int[]{62};
        field_F = null;
        field_J = "Unpacking music";
        field_C = new ih();
        field_R = "You are offering a rematch.";
    }
}
