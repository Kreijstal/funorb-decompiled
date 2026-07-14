/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends wda {
    private gea field_q;
    static String field_o;
    private mg field_s;
    private int field_u;
    private int field_r;
    private boolean field_p;
    private ir field_t;

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        fsa var5 = null;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] var10 = null;
        int[][] var12 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        if (((lo) this).field_q.a(-4075)) {
          return;
        } else {
          var14 = ((lo) this).field_q.c(125);
          var12 = var14;
          var10 = var12;
          var8 = var10;
          var7 = var8;
          var15 = var7;
          if (((lo) this).field_r >= var14.length) {
            ((lo) this).field_r = 0;
            if (((lo) this).field_q.a((byte) 21)) {
              ((lo) this).field_j = true;
              ((lo) this).field_s.d(0);
              if (!((lo) this).field_s.c(0)) {
                return;
              } else {
                var3 = var7[((lo) this).field_r][0] - -((lo) this).d((byte) -115);
                var4 = var7[((lo) this).field_r][1] + ((lo) this).a(false);
                ((lo) this).field_t.field_f = var3;
                ((lo) this).field_t.field_d = var4;
                if (((lo) this).field_p) {
                  if (-1 < var15.length) {
                    ((lo) this).field_r = ((lo) this).c(true).q(73).a(var15.length, 0);
                    ((lo) this).field_n.a((byte) 54, ((lo) this).field_t);
                    var5 = ((lo) this).field_n.r(0);
                    if (!((lo) this).field_n.f((byte) -70).a((ffa) (Object) ((lo) this).field_n, ((lo) this).field_n.a((byte) 55), 2, ((lo) this).field_n.g(true), ((lo) this).field_t.field_d, ((lo) this).field_t.field_f, false, (gma) (Object) var5, ((lo) this).field_n.c(-110))) {
                      ((lo) this).c(true).field_u.a((ffa) (Object) ((lo) this).field_n, (byte) 98);
                      ((lo) this).field_n.b(437453352, var4, var3);
                      ((lo) this).c(true).field_u.b((ffa) (Object) ((lo) this).field_n, 7073);
                      var6 = 98 / ((-69 - param0) / 42);
                      if ((((lo) this).field_u ^ -1) < -1) {
                        ((lo) this).field_n.n(((lo) this).field_u, -112);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((lo) this).field_n.a((byte) 54, ((lo) this).field_t);
                    var5 = ((lo) this).field_n.r(0);
                    if (!((lo) this).field_n.f((byte) -70).a((ffa) (Object) ((lo) this).field_n, ((lo) this).field_n.a((byte) 55), 2, ((lo) this).field_n.g(true), ((lo) this).field_t.field_d, ((lo) this).field_t.field_f, false, (gma) (Object) var5, ((lo) this).field_n.c(-110))) {
                      ((lo) this).c(true).field_u.a((ffa) (Object) ((lo) this).field_n, (byte) 98);
                      ((lo) this).field_n.b(437453352, var4, var3);
                      ((lo) this).c(true).field_u.b((ffa) (Object) ((lo) this).field_n, 7073);
                      var6 = 98 / ((-69 - param0) / 42);
                      if ((((lo) this).field_u ^ -1) < -1) {
                        ((lo) this).field_n.n(((lo) this).field_u, -112);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  ((lo) this).field_r = ((lo) this).field_r + 1;
                  ((lo) this).field_n.a((byte) 54, ((lo) this).field_t);
                  var5 = ((lo) this).field_n.r(0);
                  if (!((lo) this).field_n.f((byte) -70).a((ffa) (Object) ((lo) this).field_n, ((lo) this).field_n.a((byte) 55), 2, ((lo) this).field_n.g(true), ((lo) this).field_t.field_d, ((lo) this).field_t.field_f, false, (gma) (Object) var5, ((lo) this).field_n.c(-110))) {
                    ((lo) this).c(true).field_u.a((ffa) (Object) ((lo) this).field_n, (byte) 98);
                    ((lo) this).field_n.b(437453352, var4, var3);
                    ((lo) this).c(true).field_u.b((ffa) (Object) ((lo) this).field_n, 7073);
                    var6 = 98 / ((-69 - param0) / 42);
                    if (((lo) this).field_u < -1) {
                      ((lo) this).field_n.n(((lo) this).field_u, -112);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              ((lo) this).field_s.d(0);
              if (!((lo) this).field_s.c(0)) {
                return;
              } else {
                L0: {
                  var3 = var7[((lo) this).field_r][0] - -((lo) this).d((byte) -115);
                  var4 = var7[((lo) this).field_r][1] + ((lo) this).a(false);
                  ((lo) this).field_t.field_f = var3;
                  ((lo) this).field_t.field_d = var4;
                  if (((lo) this).field_p) {
                    if (-1 > (var15.length ^ -1)) {
                      ((lo) this).field_r = ((lo) this).c(true).q(73).a(var15.length, 0);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((lo) this).field_r = ((lo) this).field_r + 1;
                    break L0;
                  }
                }
                ((lo) this).field_n.a((byte) 54, ((lo) this).field_t);
                var5 = ((lo) this).field_n.r(0);
                if (!((lo) this).field_n.f((byte) -70).a((ffa) (Object) ((lo) this).field_n, ((lo) this).field_n.a((byte) 55), 2, ((lo) this).field_n.g(true), ((lo) this).field_t.field_d, ((lo) this).field_t.field_f, false, (gma) (Object) var5, ((lo) this).field_n.c(-110))) {
                  ((lo) this).c(true).field_u.a((ffa) (Object) ((lo) this).field_n, (byte) 98);
                  ((lo) this).field_n.b(437453352, var4, var3);
                  ((lo) this).c(true).field_u.b((ffa) (Object) ((lo) this).field_n, 7073);
                  var6 = 98 / ((-69 - param0) / 42);
                  if ((((lo) this).field_u ^ -1) >= -1) {
                    return;
                  } else {
                    ((lo) this).field_n.n(((lo) this).field_u, -112);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((lo) this).field_s.d(0);
            if (!((lo) this).field_s.c(0)) {
              return;
            } else {
              L1: {
                var3 = var7[((lo) this).field_r][0] - -((lo) this).d((byte) -115);
                var4 = var7[((lo) this).field_r][1] + ((lo) this).a(false);
                ((lo) this).field_t.field_f = var3;
                ((lo) this).field_t.field_d = var4;
                if (((lo) this).field_p) {
                  if (-1 > (var15.length ^ -1)) {
                    ((lo) this).field_r = ((lo) this).c(true).q(73).a(var15.length, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((lo) this).field_r = ((lo) this).field_r + 1;
                  break L1;
                }
              }
              ((lo) this).field_n.a((byte) 54, ((lo) this).field_t);
              var5 = ((lo) this).field_n.r(0);
              if (!((lo) this).field_n.f((byte) -70).a((ffa) (Object) ((lo) this).field_n, ((lo) this).field_n.a((byte) 55), 2, ((lo) this).field_n.g(true), ((lo) this).field_t.field_d, ((lo) this).field_t.field_f, false, (gma) (Object) var5, ((lo) this).field_n.c(-110))) {
                ((lo) this).c(true).field_u.a((ffa) (Object) ((lo) this).field_n, (byte) 98);
                ((lo) this).field_n.b(437453352, var4, var3);
                ((lo) this).c(true).field_u.b((ffa) (Object) ((lo) this).field_n, 7073);
                var6 = 98 / ((-69 - param0) / 42);
                if ((((lo) this).field_u ^ -1) >= -1) {
                  return;
                } else {
                  ((lo) this).field_n.n(((lo) this).field_u, -112);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    lo(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((lo) this).field_s = new mg();
        ((lo) this).field_u = 0;
        ((lo) this).field_p = false;
        ((lo) this).field_t = new ir();
        ((lo) this).field_q = new gea(param0.field_E, param1);
        if ((param0.field_E ^ -1) > -12) {
            ((lo) this).field_q.a(1 == param1.b((byte) 44, 1) ? true : false, 1);
        }
        ((lo) this).field_s = new mg(param0.field_E, param1);
        if (11 <= param0.field_E) {
            ((lo) this).field_p = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
            ((lo) this).field_u = param1.b((byte) 44, 8);
        }
    }

    final void a(kh param0, byte param1) {
        Object var4 = null;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        if (param1 > -78) {
          L0: {
            var4 = null;
            ((lo) this).a((kh) null, (byte) 17);
            super.a(param0, (byte) -110);
            ((lo) this).field_q.a(param0, 0);
            ((lo) this).field_s.a(15637, param0);
            stackOut_5_0 = (kh) param0;
            stackOut_5_1 = -126;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (!((lo) this).field_p) {
              stackOut_7_0 = (kh) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (kh) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          ((kh) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, 1);
          param0.a((byte) -127, ((lo) this).field_u, 8);
          return;
        } else {
          L1: {
            super.a(param0, (byte) -110);
            ((lo) this).field_q.a(param0, 0);
            ((lo) this).field_s.a(15637, param0);
            stackOut_1_0 = (kh) param0;
            stackOut_1_1 = -126;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (!((lo) this).field_p) {
              stackOut_3_0 = (kh) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = (kh) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
          param0.a((byte) -127, ((lo) this).field_u, 8);
          return;
        }
    }

    final void c(byte param0) {
        if (param0 >= -116) {
          ((lo) this).field_s = null;
          super.c((byte) -118);
          ((lo) this).field_q.a(true);
          return;
        } else {
          super.c((byte) -118);
          ((lo) this).field_q.a(true);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (pka.field_b <= param3) {
          if (ss.field_c >= param0) {
            if (param4 < gca.field_d) {
              if (1 != param1) {
                pua.a(-78, param3, param4, param2, param1, param6, param0);
                if (!param5) {
                  lo.a(69, -19, 4, 24, 126, false, -104);
                  return;
                } else {
                  return;
                }
              } else {
                nl.a(param6, param3, param4, param2, param0, 14375);
                if (!param5) {
                  lo.a(69, -19, 4, 24, 126, false, -104);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (hc.field_h >= param2) {
                if (1 == param1) {
                  tia.a(param2, param4, param0, param6, param3, false);
                  if (!param5) {
                    lo.a(69, -19, 4, 24, 126, false, -104);
                    return;
                  } else {
                    return;
                  }
                } else {
                  wd.a(param1, param0, param6, param4, param3, (byte) 27, param2);
                  if (!param5) {
                    lo.a(69, -19, 4, 24, 126, false, -104);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L0: {
                  if (1 != param1) {
                    pua.a(-78, param3, param4, param2, param1, param6, param0);
                    break L0;
                  } else {
                    nl.a(param6, param3, param4, param2, param0, 14375);
                    break L0;
                  }
                }
                if (!param5) {
                  lo.a(69, -19, 4, 24, 126, false, -104);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (1 != param1) {
              pua.a(-78, param3, param4, param2, param1, param6, param0);
              if (param5) {
                return;
              } else {
                lo.a(69, -19, 4, 24, 126, false, -104);
                return;
              }
            } else {
              nl.a(param6, param3, param4, param2, param0, 14375);
              if (param5) {
                return;
              } else {
                lo.a(69, -19, 4, 24, 126, false, -104);
                return;
              }
            }
          }
        } else {
          if (1 == param1) {
            L1: {
              nl.a(param6, param3, param4, param2, param0, 14375);
              if (param5) {
                break L1;
              } else {
                lo.a(69, -19, 4, 24, 126, false, -104);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              pua.a(-78, param3, param4, param2, param1, param6, param0);
              if (param5) {
                break L2;
              } else {
                lo.a(69, -19, 4, 24, 126, false, -104);
                break L2;
              }
            }
            return;
          }
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            return -102;
        }
        return 15;
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != 1) {
            lo.e(-61);
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((lo) this).a((kh) null, (byte) 116);
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 120, param1, ((lo) this).field_r);
        if (param0 != 0) {
            return -59;
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Security";
    }
}
