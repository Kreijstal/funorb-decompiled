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
        wq var2 = null;
        field_j = null;
        field_d = null;
        field_m = null;
        field_n = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_c = null;
        if (param0) {
          return;
        } else {
          var2 = (wq) null;
          c.a(6, -63, 125, -38, (wq) null);
          return;
        }
    }

    final static void a(int param0, String param1, byte param2, int param3, int param4, String param5) {
        pi var9 = null;
        int var8 = 0;
        int discarded$1 = 0;
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
                discarded$1 = md.a(26152, param5, var9);
            } else {
                var9.b((byte) 123, param0);
            }
            var9.d((byte) 116, var9.field_l - var8);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "c.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if ((param1 ^ -1) <= -1) {
          if (this.field_h >= param1) {
            if (param1 == this.field_h) {
              this.field_h = this.field_h - 1;
              if (param0 == 46) {
                return;
              } else {
                field_c = (String) null;
                return;
              }
            } else {
              pm.a(this.field_k, 1 + param1, this.field_k, param1, -param1 + this.field_h);
              this.field_h = this.field_h - 1;
              if (param0 == 46) {
                return;
              } else {
                field_c = (String) null;
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
              L4: {
                L5: {
                  if (!hc.field_c) {
                    break L5;
                  } else {
                    if (o.field_e.field_jc <= o.field_e.field_cc) {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                break L4;
              }
              L6: {
                um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                ka.a(param4, vp.field_u, param2, param0, 121);
                if (param5 > 6) {
                  break L6;
                } else {
                  field_g = -90;
                  break L6;
                }
              }
              an.field_h = an.field_h + 1;
              return;
            } else {
              qh.field_f = (kp.field_a - 640) / 2;
              L7: {
                pq.a(-128, param3);
                if (ml.field_b <= 0) {
                  break L7;
                } else {
                  na.a(param8, param3, -94, param2);
                  break L7;
                }
              }
              L8: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L9;
                } else {
                  break L9;
                }
              }
              if (hc.field_c) {
                if (o.field_e.field_jc > o.field_e.field_cc) {
                  L10: {
                    fo.field_b.field_Qb.field_Mb = null;
                    vn.field_A.field_eb = true;
                    ka.a(param4, fo.field_b, param2, param0, -108);
                    um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                    ka.a(param4, vp.field_u, param2, param0, 121);
                    if (param5 > 6) {
                      break L10;
                    } else {
                      field_g = -90;
                      break L10;
                    }
                  }
                  an.field_h = an.field_h + 1;
                  return;
                } else {
                  L11: {
                    fo.field_b.field_Qb.field_Mb = wg.field_d;
                    vn.field_A.field_eb = false;
                    jh.a(true, fo.field_b.field_Rb);
                    um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                    ka.a(param4, vp.field_u, param2, param0, 121);
                    if (param5 > 6) {
                      break L11;
                    } else {
                      field_g = -90;
                      break L11;
                    }
                  }
                  an.field_h = an.field_h + 1;
                  return;
                }
              } else {
                L12: {
                  fo.field_b.field_Qb.field_Mb = null;
                  vn.field_A.field_eb = true;
                  ka.a(param4, fo.field_b, param2, param0, -108);
                  um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                  ka.a(param4, vp.field_u, param2, param0, 121);
                  if (param5 > 6) {
                    break L12;
                  } else {
                    field_g = -90;
                    break L12;
                  }
                }
                an.field_h = an.field_h + 1;
                return;
              }
            }
          } else {
            L13: {
              if (lb.field_d != kc.field_q.field_f) {
                break L13;
              } else {
                if (lb.field_c != kc.field_q.field_g) {
                  break L13;
                } else {
                  if (o.field_e != null) {
                    kj.a(true, false);
                    break L13;
                  } else {
                    if (null != nl.field_f) {
                      kj.a(true, true);
                      break L13;
                    } else {
                      cg.b(31);
                      break L13;
                    }
                  }
                }
              }
            }
            if (param3) {
              L14: {
                qh.field_f = id.field_Pb;
                pq.a(-128, param3);
                if (ml.field_b <= 0) {
                  break L14;
                } else {
                  na.a(param8, param3, -94, param2);
                  break L14;
                }
              }
              L15: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                L18: {
                  if (!hc.field_c) {
                    break L18;
                  } else {
                    if (o.field_e.field_jc <= o.field_e.field_cc) {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                break L17;
              }
              L19: {
                um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                ka.a(param4, vp.field_u, param2, param0, 121);
                if (param5 > 6) {
                  break L19;
                } else {
                  field_g = -90;
                  break L19;
                }
              }
              an.field_h = an.field_h + 1;
              return;
            } else {
              qh.field_f = (kp.field_a - 640) / 2;
              pq.a(-128, param3);
              if (ml.field_b <= 0) {
                L20: {
                  ke.field_e.field_S = 1;
                  ke.field_e.field_V = vo.field_C.field_V;
                  if (0 < pe.field_j) {
                    n.a(param2, param8, param3, (byte) -76);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (eg.field_m > 0) {
                    nh.a(true, param3, param8, param2, param7);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                if (hc.field_c) {
                  if (o.field_e.field_jc > o.field_e.field_cc) {
                    L22: {
                      fo.field_b.field_Qb.field_Mb = null;
                      vn.field_A.field_eb = true;
                      ka.a(param4, fo.field_b, param2, param0, -108);
                      um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                      ka.a(param4, vp.field_u, param2, param0, 121);
                      if (param5 > 6) {
                        break L22;
                      } else {
                        field_g = -90;
                        break L22;
                      }
                    }
                    an.field_h = an.field_h + 1;
                    return;
                  } else {
                    L23: {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                      ka.a(param4, vp.field_u, param2, param0, 121);
                      if (param5 > 6) {
                        break L23;
                      } else {
                        field_g = -90;
                        break L23;
                      }
                    }
                    an.field_h = an.field_h + 1;
                    return;
                  }
                } else {
                  L24: {
                    fo.field_b.field_Qb.field_Mb = null;
                    vn.field_A.field_eb = true;
                    ka.a(param4, fo.field_b, param2, param0, -108);
                    um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                    ka.a(param4, vp.field_u, param2, param0, 121);
                    if (param5 > 6) {
                      break L24;
                    } else {
                      field_g = -90;
                      break L24;
                    }
                  }
                  an.field_h = an.field_h + 1;
                  return;
                }
              } else {
                L25: {
                  na.a(param8, param3, -94, param2);
                  ke.field_e.field_S = 1;
                  ke.field_e.field_V = vo.field_C.field_V;
                  if (0 < pe.field_j) {
                    n.a(param2, param8, param3, (byte) -76);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (eg.field_m > 0) {
                    nh.a(true, param3, param8, param2, param7);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  L28: {
                    if (!hc.field_c) {
                      break L28;
                    } else {
                      if (o.field_e.field_jc <= o.field_e.field_cc) {
                        fo.field_b.field_Qb.field_Mb = wg.field_d;
                        vn.field_A.field_eb = false;
                        jh.a(true, fo.field_b.field_Rb);
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  fo.field_b.field_Qb.field_Mb = null;
                  vn.field_A.field_eb = true;
                  ka.a(param4, fo.field_b, param2, param0, -108);
                  break L27;
                }
                L29: {
                  um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                  ka.a(param4, vp.field_u, param2, param0, 121);
                  if (param5 > 6) {
                    break L29;
                  } else {
                    field_g = -90;
                    break L29;
                  }
                }
                an.field_h = an.field_h + 1;
                return;
              }
            }
          }
        } else {
          if (param3) {
            L30: {
              qh.field_f = id.field_Pb;
              pq.a(-128, param3);
              if (ml.field_b <= 0) {
                break L30;
              } else {
                na.a(param8, param3, -94, param2);
                break L30;
              }
            }
            L31: {
              ke.field_e.field_S = 1;
              ke.field_e.field_V = vo.field_C.field_V;
              if (0 < pe.field_j) {
                n.a(param2, param8, param3, (byte) -76);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (eg.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              L34: {
                if (!hc.field_c) {
                  break L34;
                } else {
                  if (o.field_e.field_jc <= o.field_e.field_cc) {
                    fo.field_b.field_Qb.field_Mb = wg.field_d;
                    vn.field_A.field_eb = false;
                    jh.a(true, fo.field_b.field_Rb);
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              fo.field_b.field_Qb.field_Mb = null;
              vn.field_A.field_eb = true;
              ka.a(param4, fo.field_b, param2, param0, -108);
              break L33;
            }
            L35: {
              um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
              ka.a(param4, vp.field_u, param2, param0, 121);
              if (param5 > 6) {
                break L35;
              } else {
                field_g = -90;
                break L35;
              }
            }
            an.field_h = an.field_h + 1;
            return;
          } else {
            qh.field_f = (kp.field_a - 640) / 2;
            pq.a(-128, param3);
            if (ml.field_b <= 0) {
              L36: {
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L37;
                } else {
                  break L37;
                }
              }
              if (hc.field_c) {
                if (o.field_e.field_jc > o.field_e.field_cc) {
                  L38: {
                    fo.field_b.field_Qb.field_Mb = null;
                    vn.field_A.field_eb = true;
                    ka.a(param4, fo.field_b, param2, param0, -108);
                    um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                    ka.a(param4, vp.field_u, param2, param0, 121);
                    if (param5 > 6) {
                      break L38;
                    } else {
                      field_g = -90;
                      break L38;
                    }
                  }
                  an.field_h = an.field_h + 1;
                  return;
                } else {
                  L39: {
                    fo.field_b.field_Qb.field_Mb = wg.field_d;
                    vn.field_A.field_eb = false;
                    jh.a(true, fo.field_b.field_Rb);
                    um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                    ka.a(param4, vp.field_u, param2, param0, 121);
                    if (param5 > 6) {
                      break L39;
                    } else {
                      field_g = -90;
                      break L39;
                    }
                  }
                  an.field_h = an.field_h + 1;
                  return;
                }
              } else {
                L40: {
                  fo.field_b.field_Qb.field_Mb = null;
                  vn.field_A.field_eb = true;
                  ka.a(param4, fo.field_b, param2, param0, -108);
                  um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                  ka.a(param4, vp.field_u, param2, param0, 121);
                  if (param5 > 6) {
                    break L40;
                  } else {
                    field_g = -90;
                    break L40;
                  }
                }
                an.field_h = an.field_h + 1;
                return;
              }
            } else {
              L41: {
                na.a(param8, param3, -94, param2);
                ke.field_e.field_S = 1;
                ke.field_e.field_V = vo.field_C.field_V;
                if (0 < pe.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (eg.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                L44: {
                  if (!hc.field_c) {
                    break L44;
                  } else {
                    if (o.field_e.field_jc <= o.field_e.field_cc) {
                      fo.field_b.field_Qb.field_Mb = wg.field_d;
                      vn.field_A.field_eb = false;
                      jh.a(true, fo.field_b.field_Rb);
                      break L43;
                    } else {
                      break L44;
                    }
                  }
                }
                fo.field_b.field_Qb.field_Mb = null;
                vn.field_A.field_eb = true;
                ka.a(param4, fo.field_b, param2, param0, -108);
                break L43;
              }
              L45: {
                um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
                ka.a(param4, vp.field_u, param2, param0, 121);
                if (param5 > 6) {
                  break L45;
                } else {
                  field_g = -90;
                  break L45;
                }
              }
              an.field_h = an.field_h + 1;
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wq param4) {
        try {
            param4.a(33, param1);
            param4.b((byte) 115, 17);
            param4.b((byte) 120, param0);
            param4.b((byte) 107, param2);
            param4.a(5, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "c.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = this.field_k.length;
        if (param0 == 1) {
          L0: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (!this.field_f) {
                var3 = var3 + this.field_b;
                continue L0;
              } else {
                if (var3 != 0) {
                  var3 = var3 * this.field_b;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -35;
        }
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(1, param0)];
        var3 = var4;
        pm.a(this.field_k, 0, var4, 0, this.field_k.length);
        this.field_k = var4;
        if (param1 == -7877) {
          return;
        } else {
          this.field_k = (int[]) null;
          return;
        }
    }

    private c() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (this.field_h < param2) {
            this.field_h = param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 0) {
          if (param2 >= this.field_k.length) {
            this.a(param2, -7877);
            this.field_k[param2] = param0;
            return;
          } else {
            this.field_k[param2] = param0;
            return;
          }
        } else {
          field_g = 55;
          if (param2 < this.field_k.length) {
            this.field_k[param2] = param0;
            return;
          } else {
            this.a(param2, -7877);
            this.field_k[param2] = param0;
            return;
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
          this.a(-78, -117);
          this.a(param1, 0, 1 + this.field_h);
          return;
        } else {
          this.a(param1, 0, 1 + this.field_h);
          return;
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            return -51;
        }
        return 1 + this.field_h;
    }

    final int a(int param0, byte param1) {
        if (this.field_h >= param0) {
          if (param1 != 64) {
            field_c = (String) null;
            return this.field_k[param0];
          } else {
            return this.field_k[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    static {
        field_g = 250;
        field_d = "Create";
        field_c = "Accept";
        field_n = "Real-life threats";
        field_m = new th(7, 0, 1, 1);
    }
}
