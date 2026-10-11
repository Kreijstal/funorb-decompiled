/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static java.awt.Font field_a;
    static ka field_b;
    static int[][][] field_c;

    final static int[] b(int param0, int param1, int param2) {
        if (param1 != 7429) {
          hh.b(-62, -101, 108);
        }
        int var3 = ai.a(true, param0);
        int var4 = lc.b(-88, param0);
        int var5 = ai.a(true, param2);
        int var6 = lc.b(-116, param2);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 == 2) {
          if (kc.field_s == null ||
            !(param2 <= kc.field_s.length)) {
            kc.field_s = new int[2 * param2];
          }
          if (null == bg.field_Q ||
            !(param2 <= bg.field_Q.length)) {
            bg.field_Q = new int[param2 * 2];
          }
          if (rk.field_p == null ||
            !(rk.field_p.length >= param2)) {
            rk.field_p = new int[2 * param2];
          }
          if (null != ea.field_a &&
            ea.field_a.length >= param2) {
            if (cb.field_e == null) {
              cb.field_e = new int[param2 * 2];
              if (bj.field_b == null ||
                !(param2 <= bj.field_b.length)) {
                bj.field_b = new int[param2 * 2];
              }
              if (null == hi.field_G ||
                !(param1 + param2 <= hi.field_G.length)) {
                hi.field_G = new int[(param1 + param2) * 2];
              }
              if (null == qa.field_i ||
                !(qa.field_i.length >= param2)) {
                qa.field_i = new boolean[param2 * 2];
              }
            } else {
              if (param2 > cb.field_e.length) {
                cb.field_e = new int[param2 * 2];
                if (bj.field_b == null ||
                  !(param2 <= bj.field_b.length)) {
                  bj.field_b = new int[param2 * 2];
                }
                if (null == hi.field_G ||
                  !(param1 + param2 <= hi.field_G.length)) {
                  hi.field_G = new int[(param1 + param2) * 2];
                }
                if (null == qa.field_i ||
                  !(qa.field_i.length >= param2)) {
                  qa.field_i = new boolean[param2 * 2];
                }
              } else {
                if (bj.field_b == null ||
                  !(param2 <= bj.field_b.length)) {
                  bj.field_b = new int[param2 * 2];
                }
                if (null == hi.field_G) {
                  hi.field_G = new int[(param1 + param2) * 2];
                  if (null == qa.field_i ||
                    !(qa.field_i.length >= param2)) {
                    qa.field_i = new boolean[param2 * 2];
                  }
                } else {
                  if (param1 + param2 > hi.field_G.length) {
                    hi.field_G = new int[(param1 + param2) * 2];
                    if (null == qa.field_i ||
                      !(qa.field_i.length >= param2)) {
                      qa.field_i = new boolean[param2 * 2];
                    }
                  } else {
                    if (null == qa.field_i) {
                      qa.field_i = new boolean[param2 * 2];
                    } else {
                      if (qa.field_i.length < param2) {
                        qa.field_i = new boolean[param2 * 2];
                      }
                    }
                  }
                }
              }
            }
            bb.field_c = 0;
            ia.field_q = -2147483648;
            v.field_Z = -2147483648;
            ol.field_d = 2147483647;
            pi.field_e = 2147483647;
            return;
          }
          ea.field_a = new int[param2 * 2];
          if (cb.field_e == null ||
            !(param2 <= cb.field_e.length)) {
            cb.field_e = new int[param2 * 2];
          }
          if (bj.field_b == null ||
            !(param2 <= bj.field_b.length)) {
            bj.field_b = new int[param2 * 2];
          }
          if (null == hi.field_G ||
            !(param1 + param2 <= hi.field_G.length)) {
            hi.field_G = new int[(param1 + param2) * 2];
          }
          if (null == qa.field_i ||
            !(qa.field_i.length >= param2)) {
            qa.field_i = new boolean[param2 * 2];
          }
        } else {
          field_b = (ka) null;
          if (kc.field_s == null ||
            !(param2 <= kc.field_s.length)) {
            kc.field_s = new int[2 * param2];
          }
          if (null == bg.field_Q) {
            bg.field_Q = new int[param2 * 2];
            if (rk.field_p == null ||
              !(rk.field_p.length >= param2)) {
              rk.field_p = new int[2 * param2];
            }
            if (null != ea.field_a &&
              ea.field_a.length >= param2) {
              if (cb.field_e == null) {
                cb.field_e = new int[param2 * 2];
                if (bj.field_b == null ||
                  !(param2 <= bj.field_b.length)) {
                  bj.field_b = new int[param2 * 2];
                }
                if (null == hi.field_G ||
                  !(param1 + param2 <= hi.field_G.length)) {
                  hi.field_G = new int[(param1 + param2) * 2];
                }
                if (null == qa.field_i ||
                  !(qa.field_i.length >= param2)) {
                  qa.field_i = new boolean[param2 * 2];
                }
              } else {
                if (param2 > cb.field_e.length) {
                  cb.field_e = new int[param2 * 2];
                  if (bj.field_b == null ||
                    !(param2 <= bj.field_b.length)) {
                    bj.field_b = new int[param2 * 2];
                  }
                  if (null == hi.field_G ||
                    !(param1 + param2 <= hi.field_G.length)) {
                    hi.field_G = new int[(param1 + param2) * 2];
                  }
                  if (null == qa.field_i ||
                    !(qa.field_i.length >= param2)) {
                    qa.field_i = new boolean[param2 * 2];
                  }
                } else {
                  if (bj.field_b == null ||
                    !(param2 <= bj.field_b.length)) {
                    bj.field_b = new int[param2 * 2];
                  }
                  if (null == hi.field_G) {
                    hi.field_G = new int[(param1 + param2) * 2];
                    if (null == qa.field_i ||
                      !(qa.field_i.length >= param2)) {
                      qa.field_i = new boolean[param2 * 2];
                    }
                  } else {
                    if (param1 + param2 > hi.field_G.length) {
                      hi.field_G = new int[(param1 + param2) * 2];
                      if (null == qa.field_i ||
                        !(qa.field_i.length >= param2)) {
                        qa.field_i = new boolean[param2 * 2];
                      }
                    } else {
                      if (null == qa.field_i) {
                        qa.field_i = new boolean[param2 * 2];
                      } else {
                        if (qa.field_i.length < param2) {
                          qa.field_i = new boolean[param2 * 2];
                        }
                      }
                    }
                  }
                }
              }
              bb.field_c = 0;
              ia.field_q = -2147483648;
              v.field_Z = -2147483648;
              ol.field_d = 2147483647;
              pi.field_e = 2147483647;
              return;
            }
            ea.field_a = new int[param2 * 2];
            if (cb.field_e == null ||
              !(param2 <= cb.field_e.length)) {
              cb.field_e = new int[param2 * 2];
            }
            if (bj.field_b == null ||
              !(param2 <= bj.field_b.length)) {
              bj.field_b = new int[param2 * 2];
            }
            if (null == hi.field_G ||
              !(param1 + param2 <= hi.field_G.length)) {
              hi.field_G = new int[(param1 + param2) * 2];
            }
            if (null == qa.field_i ||
              !(qa.field_i.length >= param2)) {
              qa.field_i = new boolean[param2 * 2];
            }
          } else {
            if (param2 > bg.field_Q.length) {
              bg.field_Q = new int[param2 * 2];
            }
            if (rk.field_p == null ||
              !(rk.field_p.length >= param2)) {
              rk.field_p = new int[2 * param2];
            }
            if (null != ea.field_a &&
              ea.field_a.length >= param2) {
              if (cb.field_e == null) {
                cb.field_e = new int[param2 * 2];
                if (bj.field_b == null ||
                  !(param2 <= bj.field_b.length)) {
                  bj.field_b = new int[param2 * 2];
                }
                if (null == hi.field_G) {
                  hi.field_G = new int[(param1 + param2) * 2];
                  if (null == qa.field_i ||
                    !(qa.field_i.length >= param2)) {
                    qa.field_i = new boolean[param2 * 2];
                  }
                } else {
                  if (param1 + param2 > hi.field_G.length) {
                    hi.field_G = new int[(param1 + param2) * 2];
                    if (null == qa.field_i ||
                      !(qa.field_i.length >= param2)) {
                      qa.field_i = new boolean[param2 * 2];
                    }
                  } else {
                    if (null == qa.field_i) {
                      qa.field_i = new boolean[param2 * 2];
                    } else {
                      if (qa.field_i.length < param2) {
                        qa.field_i = new boolean[param2 * 2];
                      }
                    }
                  }
                }
              } else {
                if (param2 > cb.field_e.length) {
                  cb.field_e = new int[param2 * 2];
                  if (bj.field_b == null ||
                    !(param2 <= bj.field_b.length)) {
                    bj.field_b = new int[param2 * 2];
                  }
                  if (null == hi.field_G ||
                    !(param1 + param2 <= hi.field_G.length)) {
                    hi.field_G = new int[(param1 + param2) * 2];
                  }
                } else {
                  if (bj.field_b == null ||
                    !(param2 <= bj.field_b.length)) {
                    bj.field_b = new int[param2 * 2];
                  }
                  if (null == hi.field_G) {
                    hi.field_G = new int[(param1 + param2) * 2];
                  } else {
                    if (param1 + param2 > hi.field_G.length) {
                      hi.field_G = new int[(param1 + param2) * 2];
                    }
                  }
                }
                if (null == qa.field_i) {
                  qa.field_i = new boolean[param2 * 2];
                } else {
                  if (qa.field_i.length < param2) {
                    qa.field_i = new boolean[param2 * 2];
                  }
                }
              }
              bb.field_c = 0;
              ia.field_q = -2147483648;
              v.field_Z = -2147483648;
              ol.field_d = 2147483647;
              pi.field_e = 2147483647;
              return;
            }
            ea.field_a = new int[param2 * 2];
            if (cb.field_e == null ||
              !(param2 <= cb.field_e.length)) {
              cb.field_e = new int[param2 * 2];
            }
            if (bj.field_b == null ||
              !(param2 <= bj.field_b.length)) {
              bj.field_b = new int[param2 * 2];
            }
            if (null == hi.field_G ||
              !(param1 + param2 <= hi.field_G.length)) {
              hi.field_G = new int[(param1 + param2) * 2];
            }
            if (null != qa.field_i &&
              qa.field_i.length >= param2) {
              bb.field_c = 0;
              ia.field_q = -2147483648;
              v.field_Z = -2147483648;
              ol.field_d = 2147483647;
              pi.field_e = 2147483647;
              return;
            }
            qa.field_i = new boolean[param2 * 2];
          }
        }
        bb.field_c = 0;
        ia.field_q = -2147483648;
        v.field_Z = -2147483648;
        ol.field_d = 2147483647;
        pi.field_e = 2147483647;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 65 / ((param0 - 28) / 44);
        field_a = null;
        field_c = (int[][][]) null;
    }

    static {
    }
}
