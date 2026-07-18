/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int field_g;
    static String field_c;
    private boolean field_f;
    static tp[] field_i;
    static ta field_l;
    private int field_h;
    private int[] field_k;
    static vm field_j;
    static th field_m;
    private int field_b;
    static int field_a;
    static String field_d;
    static jp field_e;
    static String field_n;

    public static void a(boolean param0) {
        field_j = null;
        field_d = null;
        field_m = null;
        field_n = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, String param1, byte param2, int param3, int param4, String param5) {
        pi var9 = null;
        int var8 = 0;
        try {
            var9 = k.field_h;
            pi var6 = var9;
            int var7 = -44 / ((-59 - param2) / 38);
            var9.e(-13413, param4);
            var9.field_l = var9.field_l + 1;
            var8 = var9.field_l;
            var9.a(86, param3);
            if (!(param3 != 2)) {
                var9.a(param1, -1);
            }
            if (param5 != null) {
                int discarded$1 = md.a(26152, param5, (wq) (Object) var9);
            } else {
                var9.b((byte) 123, param0);
            }
            var9.d((byte) 116, var9.field_l - var8);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "c.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param1 >= 0) {
          if (((c) this).field_h >= param1) {
            if (param1 == ((c) this).field_h) {
              ((c) this).field_h = ((c) this).field_h - 1;
              if (param0 == 46) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              pm.a(((c) this).field_k, 1 + param1, ((c) this).field_k, param1, -param1 + ((c) this).field_h);
              ((c) this).field_h = ((c) this).field_h - 1;
              if (param0 == 46) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, byte param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (!param3) {
          if (lb.field_c == kp.field_a) {
            L0: {
              if (lb.field_d == fo.field_i) {
                break L0;
              } else {
                if (lb.field_d != kc.field_q.field_f) {
                  break L0;
                } else {
                  if (lb.field_c != kc.field_q.field_g) {
                    break L0;
                  } else {
                    if (o.field_e != null) {
                      kj.a(true, false);
                      break L0;
                    } else {
                      if (null != nl.field_f) {
                        kj.a(true, true);
                        break L0;
                      } else {
                        cg.b(31);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            if (param3) {
              L1: {
                qh.field_f = id.field_Pb;
                pq.a(-128, param3);
                if (ml.field_b <= 0) {
                  break L1;
                } else {
                  na.a(param8, param3, -94, param2);
                  break L1;
                }
              }
              L2: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (hc.field_c) {
                if (o.field_e.field_jc > o.field_e.field_cc) {
                  fo.field_b.field_Qb.field_Mb = null;
                  vn.field_A.field_eb = true;
                  ka.a(param4, fo.field_b, param2, param0, -108);
                  um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
                  ka.a(param4, vp.field_u, param2, param0, 121);
                  an.field_h = an.field_h + 1;
                  return;
                } else {
                  fo.field_b.field_Qb.field_Mb = wg.field_d;
                  vn.field_A.field_eb = false;
                  jh.a(true, fo.field_b.field_Rb);
                  um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
                  ka.a(param4, vp.field_u, param2, param0, 121);
                  an.field_h = an.field_h + 1;
                  return;
                }
              } else {
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
                ka.a(param4, vp.field_u, param2, param0, 121);
                an.field_h = an.field_h + 1;
                return;
              }
            } else {
              L4: {
                qh.field_f = (kp.field_a - 640) / 2;
                pq.a(-128, param3);
                if (ml.field_b <= 0) {
                  break L4;
                } else {
                  na.a(param8, param3, -94, param2);
                  break L4;
                }
              }
              L5: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  if (!hc.field_c) {
                    break L8;
                  } else {
                    if (o.field_e.field_jc <= o.field_e.field_cc) {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                break L7;
              }
              um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
              ka.a(param4, vp.field_u, param2, param0, 121);
              an.field_h = an.field_h + 1;
              return;
            }
          } else {
            L9: {
              if (lb.field_d != kc.field_q.field_f) {
                break L9;
              } else {
                if (lb.field_c != kc.field_q.field_g) {
                  break L9;
                } else {
                  if (o.field_e != null) {
                    kj.a(true, false);
                    break L9;
                  } else {
                    if (null != nl.field_f) {
                      kj.a(true, true);
                      break L9;
                    } else {
                      cg.b(31);
                      break L9;
                    }
                  }
                }
              }
            }
            if (!param3) {
              L10: {
                qh.field_f = (kp.field_a - 640) / 2;
                pq.a(-128, param3);
                if (ml.field_b <= 0) {
                  break L10;
                } else {
                  na.a(param8, param3, -94, param2);
                  break L10;
                }
              }
              L11: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                L14: {
                  if (!hc.field_c) {
                    break L14;
                  } else {
                    if (o.field_e.field_jc <= o.field_e.field_cc) {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                break L13;
              }
              um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
              ka.a(param4, vp.field_u, param2, param0, 121);
              an.field_h = an.field_h + 1;
              return;
            } else {
              L15: {
                qh.field_f = id.field_Pb;
                pq.a(-128, param3);
                if (ml.field_b <= 0) {
                  break L15;
                } else {
                  na.a(param8, param3, -94, param2);
                  break L15;
                }
              }
              L16: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                L19: {
                  if (!hc.field_c) {
                    break L19;
                  } else {
                    if (o.field_e.field_jc <= o.field_e.field_cc) {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                break L18;
              }
              um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
              ka.a(param4, vp.field_u, param2, param0, 121);
              an.field_h = an.field_h + 1;
              return;
            }
          }
        } else {
          L20: {
            qh.field_f = id.field_Pb;
            pq.a(-128, param3);
            if (ml.field_b <= 0) {
              break L20;
            } else {
              na.a(param8, param3, -94, param2);
              break L20;
            }
          }
          L21: {
            ke.field_e.field_S = 1;
            ke.field_e.field_V = vo.field_C.field_V;
            if (0 < pe.field_j) {
              n.a(param2, param8, param3, (byte) -76);
              break L21;
            } else {
              break L21;
            }
          }
          L22: {
            if (eg.field_m > 0) {
              nh.a(true, param3, param8, param2, param7);
              break L22;
            } else {
              break L22;
            }
          }
          L23: {
            L24: {
              if (!hc.field_c) {
                break L24;
              } else {
                if (o.field_e.field_jc <= o.field_e.field_cc) {
                  fo.field_b.field_Qb.field_Mb = wg.field_d;
                  vn.field_A.field_eb = false;
                  jh.a(true, fo.field_b.field_Rb);
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            fo.field_b.field_Qb.field_Mb = null;
            vn.field_A.field_eb = true;
            ka.a(param4, fo.field_b, param2, param0, -108);
            break L23;
          }
          um.a(param6, param9, param4, param0, param2, 16777215, (byte) -114);
          ka.a(param4, vp.field_u, param2, param0, 121);
          an.field_h = an.field_h + 1;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wq param4) {
        try {
            param4.a(33, 12);
            param4.b((byte) 115, 17);
            param4.b((byte) 120, param0);
            param4.b((byte) 107, param2);
            param4.a(5, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "c.H(" + param0 + ',' + 12 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = ((c) this).field_k.length;
        L0: while (true) {
          if (param1 < var3) {
            return var3;
          } else {
            if (!((c) this).field_f) {
              var3 = var3 + ((c) this).field_b;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((c) this).field_b;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(1, param0)];
        var3 = var4;
        pm.a(((c) this).field_k, 0, var4, 0, ((c) this).field_k.length);
        ((c) this).field_k = var4;
        if (param1 == -7877) {
          return;
        } else {
          ((c) this).field_k = null;
          return;
        }
    }

    private c() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (((c) this).field_h < param2) {
            ((c) this).field_h = param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 >= ((c) this).field_k.length) {
          this.a(param2, -7877);
          ((c) this).field_k[param2] = param0;
          return;
        } else {
          ((c) this).field_k[param2] = param0;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
          this.a(-78, -117);
          this.a(param1, 0, 1 + ((c) this).field_h);
          return;
        } else {
          this.a(param1, 0, 1 + ((c) this).field_h);
          return;
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            return -51;
        }
        return 1 + ((c) this).field_h;
    }

    final int a(int param0, byte param1) {
        if (((c) this).field_h >= param0) {
          if (param1 != 64) {
            field_c = null;
            return ((c) this).field_k[param0];
          } else {
            return ((c) this).field_k[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 250;
        field_d = "Create";
        field_c = "Accept";
        field_n = "Real-life threats";
        field_m = new th(7, 0, 1, 1);
    }
}
