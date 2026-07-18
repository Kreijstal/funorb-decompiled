/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends i {
    static int[] field_L;
    private mf field_H;
    static String field_G;
    static byte[][] field_O;
    static em field_N;
    static boolean field_K;
    static long field_I;
    static hd field_P;
    static int field_J;
    static String field_M;
    static ut field_Q;

    final static void a(int param0, String param1, boolean param2) {
        int var3_int = 0;
        if (la.a(100)) {
            return;
        }
        if (uv.field_f) {
            return;
        }
        try {
            bg.field_r = param1;
            or.field_d.b(54, (byte) 89);
            int fieldTemp$0 = or.field_d.field_n + 1;
            or.field_d.field_n = or.field_d.field_n + 1;
            var3_int = fieldTemp$0;
            or.field_d.a(param1, (byte) -127);
            or.field_d.a(102, param0);
            or.field_d.c(62, -var3_int + or.field_d.field_n);
            ri.field_t = 500;
            uv.field_f = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1) {
        super.a(70, param1);
        if (param0 >= 60) {
          if (param1 == 0) {
            if (((pq) this).field_H.field_Fb != -1) {
              if (!tu.field_E.a((byte) 95, tu.field_E.field_q[((pq) this).field_H.field_Fb])) {
                oj.b(-121, tu.field_E.field_q[((pq) this).field_H.field_Fb]);
                ((pq) this).field_H.c(true);
                return;
              } else {
                ((pq) this).field_H.c(true);
                return;
              }
            } else {
              ((pq) this).field_H.c(true);
              return;
            }
          } else {
            ((pq) this).field_H.c(true);
            return;
          }
        } else {
          field_M = null;
          if (param1 == 0) {
            if (((pq) this).field_H.field_Fb != -1) {
              if (!tu.field_E.a((byte) 95, tu.field_E.field_q[((pq) this).field_H.field_Fb])) {
                oj.b(-121, tu.field_E.field_q[((pq) this).field_H.field_Fb]);
                ((pq) this).field_H.c(true);
                return;
              } else {
                ((pq) this).field_H.c(true);
                return;
              }
            } else {
              ((pq) this).field_H.c(true);
              return;
            }
          } else {
            ((pq) this).field_H.c(true);
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 < 75) {
            pq.g(1);
            return 346;
        }
        return 346;
    }

    final static int b(int param0, int param1) {
        Object var3 = null;
        param1 = (1431655765 & param1) + ((-1431655765 & param1) >>> 1);
        param1 = (858993459 & param1) - -(1932735283 & param1 >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (param0 != 170) {
          var3 = null;
          pq.a(12, (String) null, false);
          return 255 & param1;
        } else {
          return 255 & param1;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (param0 >= -11) {
          L0: {
            field_J = -68;
            super.a((byte) -119, param1, param2);
            ((pq) this).field_H.field_J = 35 + param2 + 20;
            ((pq) this).field_H.field_s = 20 + param1;
            ((pq) this).field_H.a(101, false);
            ((pq) this).field_H.k((byte) 84);
            if (-1 == ((pq) this).field_H.field_Fb) {
              break L0;
            } else {
              tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]].a(param2 + 140, 23, param1 - -320);
              if (tu.field_E.a((byte) -102, tu.field_E.field_q[((pq) this).field_H.field_Fb])) {
                pb.field_C.d(iw.field_j, 315 + param1, 245 + param2, 16777215, -1);
                break L0;
              } else {
                if (cq.e(15137)) {
                  if (np.h((byte) 5)) {
                    if (((pq) this).field_H.field_Fb != -1) {
                      if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) != 0) {
                        int discarded$22 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                        return;
                      } else {
                        int discarded$23 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                        return;
                      }
                    } else {
                      int discarded$24 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                      return;
                    }
                  } else {
                    int discarded$25 = pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
                    return;
                  }
                } else {
                  L1: {
                    L2: {
                      if (((pq) this).field_H.field_Fb == -1) {
                        break L2;
                      } else {
                        if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) == 0) {
                          int discarded$26 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    int discarded$27 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                    break L1;
                  }
                  return;
                }
              }
            }
          }
          if (!cq.e(15137)) {
            if (((pq) this).field_H.field_Fb != -1) {
              if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) == 0) {
                int discarded$28 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                return;
              } else {
                int discarded$29 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                return;
              }
            } else {
              int discarded$30 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
              return;
            }
          } else {
            if (np.h((byte) 5)) {
              if (((pq) this).field_H.field_Fb != -1) {
                if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) != 0) {
                  int discarded$31 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                  return;
                } else {
                  int discarded$32 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                  return;
                }
              } else {
                int discarded$33 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                return;
              }
            } else {
              int discarded$34 = pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
              return;
            }
          }
        } else {
          L3: {
            super.a((byte) -119, param1, param2);
            ((pq) this).field_H.field_J = 35 + param2 + 20;
            ((pq) this).field_H.field_s = 20 + param1;
            ((pq) this).field_H.a(101, false);
            ((pq) this).field_H.k((byte) 84);
            if (-1 == ((pq) this).field_H.field_Fb) {
              break L3;
            } else {
              tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]].a(param2 + 140, 23, param1 - -320);
              if (tu.field_E.a((byte) -102, tu.field_E.field_q[((pq) this).field_H.field_Fb])) {
                pb.field_C.d(iw.field_j, 315 + param1, 245 + param2, 16777215, -1);
                break L3;
              } else {
                L4: {
                  L5: {
                    if (!cq.e(15137)) {
                      break L5;
                    } else {
                      if (!np.h((byte) 5)) {
                        int discarded$35 = pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (((pq) this).field_H.field_Fb == -1) {
                      break L6;
                    } else {
                      if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) == 0) {
                        int discarded$36 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  int discarded$37 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                  break L4;
                }
                return;
              }
            }
          }
          if (!cq.e(15137)) {
            if (((pq) this).field_H.field_Fb != -1) {
              if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) != 0) {
                int discarded$38 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                return;
              } else {
                int discarded$39 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                return;
              }
            } else {
              int discarded$40 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
              return;
            }
          } else {
            if (np.h((byte) 5)) {
              L7: {
                L8: {
                  if (((pq) this).field_H.field_Fb == -1) {
                    break L8;
                  } else {
                    if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) == 0) {
                      int discarded$41 = pb.field_C.a(la.field_f, param1 + 170, 210 + (param2 - -35), 300, 40, 16777215, -1, 1, 1, 0);
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                int discarded$42 = pb.field_C.a(qa.field_G, 170 + param1, 210 + param2 - -35, 300, 40, 16729156, -1, 1, 1, 0);
                break L7;
              }
              return;
            } else {
              int discarded$43 = pb.field_C.a("Sorry, Moderators can't auction people...", param1 + 170, 210 + param2 + 35, 300, 40, 16777215, -1, 1, 1, 0);
              return;
            }
          }
        }
    }

    pq() {
        super(11);
        ((pq) this).field_H = new mf(tu.field_E);
    }

    final static void g(byte param0) {
        if (!(nb.field_f)) {
            throw new IllegalStateException();
        }
        aw.field_H = true;
        hm.a(false, -112);
        vj.field_c = 0;
    }

    public static void g(int param0) {
        field_N = null;
        field_L = null;
        field_O = null;
        if (param0 != -14948) {
          int discarded$2 = pq.b(19, 71);
          field_P = null;
          field_M = null;
          field_G = null;
          field_Q = null;
          return;
        } else {
          field_P = null;
          field_M = null;
          field_G = null;
          field_Q = null;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (1 == ((pq) this).field_n) {
          ((pq) this).field_H.b(param0 ^ param0, param1);
          ((pq) this).field_H.a(param0 + 45);
          if (((pq) this).field_H.field_Fb != -1) {
            if (!tu.field_E.a((byte) 90, tu.field_E.field_q[((pq) this).field_H.field_Fb])) {
              if (gp.a(tu.field_E.field_i[tu.field_E.field_q[((pq) this).field_H.field_Fb]], -576054046) != 0) {
                ((pq) this).field_i[0].field_lb = true;
                if (cq.e(15137)) {
                  if (!np.h((byte) -128)) {
                    ((pq) this).field_i[0].field_lb = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((pq) this).field_i[0].field_lb = false;
                if (cq.e(15137)) {
                  if (!np.h((byte) -128)) {
                    ((pq) this).field_i[0].field_lb = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((pq) this).field_i[0].field_lb = false;
              if (cq.e(15137)) {
                if (!np.h((byte) -128)) {
                  ((pq) this).field_i[0].field_lb = false;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((pq) this).field_i[0].field_lb = false;
            if (cq.e(15137)) {
              if (np.h((byte) -128)) {
                return;
              } else {
                ((pq) this).field_i[0].field_lb = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            int discarded$0 = ((pq) this).a((byte) 85);
            return 470;
        }
        return 470;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "No spectators";
        field_I = 0L;
        field_L = new int[]{0, 1200, 2300, 3300, 4000, 4300, 4400, 4300, 4100, 3940, 3900, 3980, 4096};
        field_K = false;
        field_J = 0;
        field_M = "Strong stagger";
    }
}
