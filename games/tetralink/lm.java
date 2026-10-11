/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    int field_k;
    static int[] field_f;
    static int field_g;
    int field_c;
    int field_j;
    int field_a;
    int field_b;
    static String field_l;
    byte[] field_d;
    int field_i;
    byte[] field_e;
    int field_h;

    final static void a(int param0, int param1, byte param2) {
        if (null == go.field_b ||
          !(go.field_b.length >= param1)) {
          go.field_b = new int[2 * param1];
        }
        if (null == lb.field_P) {
          lb.field_P = new int[param1 * 2];
          if (ac.field_b == null) {
            ac.field_b = new int[2 * param1];
            if (ai.field_g == null ||
              !(param1 <= ai.field_g.length)) {
              ai.field_g = new int[param1 * 2];
            }
            if (null == gl.field_n ||
              !(gl.field_n.length >= param1)) {
              gl.field_n = new int[2 * param1];
            }
            if (null == fe.field_b ||
              !(param1 <= fe.field_b.length)) {
              fe.field_b = new int[2 * param1];
            }
            if (qd.field_W == null ||
              !(param0 + param1 <= qd.field_W.length)) {
              qd.field_W = new int[2 * (param0 + param1)];
            }
            if (uk.field_w == null ||
              !(uk.field_w.length >= param1)) {
              uk.field_w = new boolean[2 * param1];
            }
          } else {
            if (param1 <= ac.field_b.length) {
              if (ai.field_g == null ||
                !(param1 <= ai.field_g.length)) {
                ai.field_g = new int[param1 * 2];
              }
              if (null == gl.field_n ||
                !(gl.field_n.length >= param1)) {
                gl.field_n = new int[2 * param1];
              }
              if (null == fe.field_b ||
                !(param1 <= fe.field_b.length)) {
                fe.field_b = new int[2 * param1];
              }
              if (qd.field_W == null ||
                !(param0 + param1 <= qd.field_W.length)) {
                qd.field_W = new int[2 * (param0 + param1)];
              }
              if (uk.field_w == null ||
                !(uk.field_w.length >= param1)) {
                uk.field_w = new boolean[2 * param1];
              }
            } else {
              ac.field_b = new int[2 * param1];
              if (ai.field_g == null ||
                !(param1 <= ai.field_g.length)) {
                ai.field_g = new int[param1 * 2];
              }
              if (null == gl.field_n) {
                gl.field_n = new int[2 * param1];
                if (null == fe.field_b ||
                  !(param1 <= fe.field_b.length)) {
                  fe.field_b = new int[2 * param1];
                }
                if (qd.field_W == null ||
                  !(param0 + param1 <= qd.field_W.length)) {
                  qd.field_W = new int[2 * (param0 + param1)];
                }
                if (uk.field_w == null ||
                  !(uk.field_w.length >= param1)) {
                  uk.field_w = new boolean[2 * param1];
                }
              } else {
                if (gl.field_n.length >= param1) {
                  if (null == fe.field_b ||
                    !(param1 <= fe.field_b.length)) {
                    fe.field_b = new int[2 * param1];
                  }
                  if (qd.field_W == null ||
                    !(param0 + param1 <= qd.field_W.length)) {
                    qd.field_W = new int[2 * (param0 + param1)];
                  }
                  if (uk.field_w == null ||
                    !(uk.field_w.length >= param1)) {
                    uk.field_w = new boolean[2 * param1];
                  }
                } else {
                  gl.field_n = new int[2 * param1];
                  if (null == fe.field_b ||
                    !(param1 <= fe.field_b.length)) {
                    fe.field_b = new int[2 * param1];
                  }
                  if (qd.field_W == null ||
                    !(param0 + param1 <= qd.field_W.length)) {
                    qd.field_W = new int[2 * (param0 + param1)];
                  }
                  if (uk.field_w == null ||
                    !(uk.field_w.length >= param1)) {
                    uk.field_w = new boolean[2 * param1];
                  }
                }
              }
            }
          }
        } else {
          if (lb.field_P.length < param1) {
            lb.field_P = new int[param1 * 2];
            if (ac.field_b == null ||
              !(param1 <= ac.field_b.length)) {
              ac.field_b = new int[2 * param1];
            }
            if (ai.field_g == null ||
              !(param1 <= ai.field_g.length)) {
              ai.field_g = new int[param1 * 2];
            }
            if (null == gl.field_n ||
              !(gl.field_n.length >= param1)) {
              gl.field_n = new int[2 * param1];
            }
            if (null == fe.field_b ||
              !(param1 <= fe.field_b.length)) {
              fe.field_b = new int[2 * param1];
            }
            if (qd.field_W == null ||
              !(param0 + param1 <= qd.field_W.length)) {
              qd.field_W = new int[2 * (param0 + param1)];
            }
            if (uk.field_w == null ||
              !(uk.field_w.length >= param1)) {
              uk.field_w = new boolean[2 * param1];
            }
          } else {
            if (ac.field_b == null) {
              ac.field_b = new int[2 * param1];
              if (ai.field_g == null ||
                !(param1 <= ai.field_g.length)) {
                ai.field_g = new int[param1 * 2];
              }
              if (null == gl.field_n) {
                gl.field_n = new int[2 * param1];
                if (null == fe.field_b ||
                  !(param1 <= fe.field_b.length)) {
                  fe.field_b = new int[2 * param1];
                }
                if (qd.field_W == null ||
                  !(param0 + param1 <= qd.field_W.length)) {
                  qd.field_W = new int[2 * (param0 + param1)];
                }
                if (uk.field_w == null ||
                  !(uk.field_w.length >= param1)) {
                  uk.field_w = new boolean[2 * param1];
                }
              } else {
                if (gl.field_n.length >= param1) {
                  if (null == fe.field_b ||
                    !(param1 <= fe.field_b.length)) {
                    fe.field_b = new int[2 * param1];
                  }
                  if (qd.field_W == null ||
                    !(param0 + param1 <= qd.field_W.length)) {
                    qd.field_W = new int[2 * (param0 + param1)];
                  }
                  if (uk.field_w == null ||
                    !(uk.field_w.length >= param1)) {
                    uk.field_w = new boolean[2 * param1];
                  }
                } else {
                  gl.field_n = new int[2 * param1];
                  if (null == fe.field_b ||
                    !(param1 <= fe.field_b.length)) {
                    fe.field_b = new int[2 * param1];
                  }
                  if (qd.field_W == null ||
                    !(param0 + param1 <= qd.field_W.length)) {
                    qd.field_W = new int[2 * (param0 + param1)];
                  }
                  if (uk.field_w == null ||
                    !(uk.field_w.length >= param1)) {
                    uk.field_w = new boolean[2 * param1];
                  }
                }
              }
            } else {
              if (param1 <= ac.field_b.length) {
                if (ai.field_g == null ||
                  !(param1 <= ai.field_g.length)) {
                  ai.field_g = new int[param1 * 2];
                }
                if (null == gl.field_n) {
                  gl.field_n = new int[2 * param1];
                  if (null == fe.field_b ||
                    !(param1 <= fe.field_b.length)) {
                    fe.field_b = new int[2 * param1];
                  }
                  if (qd.field_W == null ||
                    !(param0 + param1 <= qd.field_W.length)) {
                    qd.field_W = new int[2 * (param0 + param1)];
                  }
                  if (uk.field_w == null ||
                    !(uk.field_w.length >= param1)) {
                    uk.field_w = new boolean[2 * param1];
                  }
                } else {
                  if (gl.field_n.length >= param1) {
                    if (null == fe.field_b ||
                      !(param1 <= fe.field_b.length)) {
                      fe.field_b = new int[2 * param1];
                    }
                    if (qd.field_W == null ||
                      !(param0 + param1 <= qd.field_W.length)) {
                      qd.field_W = new int[2 * (param0 + param1)];
                    }
                    if (uk.field_w == null ||
                      !(uk.field_w.length >= param1)) {
                      uk.field_w = new boolean[2 * param1];
                    }
                  } else {
                    gl.field_n = new int[2 * param1];
                    if (null == fe.field_b ||
                      !(param1 <= fe.field_b.length)) {
                      fe.field_b = new int[2 * param1];
                    }
                    if (qd.field_W == null ||
                      !(param0 + param1 <= qd.field_W.length)) {
                      qd.field_W = new int[2 * (param0 + param1)];
                    }
                    if (uk.field_w == null ||
                      !(uk.field_w.length >= param1)) {
                      uk.field_w = new boolean[2 * param1];
                    }
                  }
                }
              } else {
                ac.field_b = new int[2 * param1];
                if (ai.field_g == null ||
                  !(param1 <= ai.field_g.length)) {
                  ai.field_g = new int[param1 * 2];
                }
                if (null == gl.field_n) {
                  gl.field_n = new int[2 * param1];
                  if (null == fe.field_b ||
                    !(param1 <= fe.field_b.length)) {
                    fe.field_b = new int[2 * param1];
                  }
                  if (qd.field_W == null ||
                    !(param0 + param1 <= qd.field_W.length)) {
                    qd.field_W = new int[2 * (param0 + param1)];
                  }
                  if (uk.field_w == null ||
                    !(uk.field_w.length >= param1)) {
                    uk.field_w = new boolean[2 * param1];
                  }
                } else {
                  if (gl.field_n.length >= param1) {
                    if (null == fe.field_b ||
                      !(param1 <= fe.field_b.length)) {
                      fe.field_b = new int[2 * param1];
                    }
                    if (qd.field_W == null ||
                      !(param0 + param1 <= qd.field_W.length)) {
                      qd.field_W = new int[2 * (param0 + param1)];
                    }
                    if (uk.field_w == null ||
                      !(uk.field_w.length >= param1)) {
                      uk.field_w = new boolean[2 * param1];
                    }
                  } else {
                    gl.field_n = new int[2 * param1];
                    if (null == fe.field_b ||
                      !(param1 <= fe.field_b.length)) {
                      fe.field_b = new int[2 * param1];
                    }
                    if (qd.field_W == null ||
                      !(param0 + param1 <= qd.field_W.length)) {
                      qd.field_W = new int[2 * (param0 + param1)];
                    }
                    if (uk.field_w == null ||
                      !(uk.field_w.length >= param1)) {
                      uk.field_w = new boolean[2 * param1];
                    }
                  }
                }
              }
            }
          }
        }
        nd.field_Mb = 0;
        ai.field_h = 2147483647;
        if (param2 != 71) {
          return;
        }
        mh.field_d = 2147483647;
        eh.field_s = -2147483648;
        va.field_z = -2147483648;
    }

    public static void a(int param0) {
        if (param0 != 2) {
          field_l = (String) null;
          field_l = null;
          field_f = null;
          return;
        }
        field_l = null;
        field_f = null;
    }

    static {
        field_l = "Return to game";
    }
}
