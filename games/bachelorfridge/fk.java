/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends bca {
    int field_q;
    static kv field_s;
    static String field_t;
    int field_r;

    fk(int param0, nq param1, int param2, int param3) {
        super(param0, param1);
        ((fk) this).field_q = param2;
        ((fk) this).field_r = param3;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new aka(param1, (fk) this);
    }

    final static void d(int param0) {
        gk.field_d = 0;
        int var1 = -62 / ((58 - param0) / 51);
        bb.h(0);
    }

    final void a(op param0, int param1) {
        ((fk) this).a(param0, (byte) -2);
        aga var3 = ((fk) this).field_l.a(40, param0);
        var3.j(-113);
        int var4 = -119 / ((param1 - 12) / 35);
        var3.field_A = false;
    }

    fk(lu param0) {
        super(param0);
        ((fk) this).field_k = param0.e((byte) 74);
        ((fk) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((fk) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((fk) this).field_q = param0.b(16711935);
        ((fk) this).field_r = param0.b(16711935);
    }

    final static void c(int param0, int param1) {
        bw var2 = null;
        int var3 = 0;
        bga var4 = null;
        var3 = BachelorFridge.field_y;
        var4 = (bga) (Object) on.field_r.b((byte) 90);
        L0: while (true) {
          if (var4 == null) {
            var2 = us.field_e.b((byte) 90);
            if (param0 > -12) {
              fk.d((byte) -20);
              L1: while (true) {
                if (var2 != null) {
                  qna.b(param1, 0);
                  var2 = us.field_e.c(0);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              L2: while (true) {
                if (var2 != null) {
                  qna.b(param1, 0);
                  var2 = us.field_e.c(0);
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            nha.a(param1, var4, (byte) -85);
            var4 = (bga) (Object) on.field_r.c(0);
            continue L0;
          }
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
          return;
        } else {
          this.a((byte) -52, param1);
          param1.d(((fk) this).field_q, 0);
          param1.d(((fk) this).field_r, 0);
          return;
        }
    }

    public static void e(byte param0) {
        int var1 = 105 / ((param0 - -54) / 37);
        field_t = null;
        field_s = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 > 76) {
          L0: {
            if (-1 != param1) {
              break L0;
            } else {
              if (param3 != fb.field_p) {
                fb.field_p = param3;
                wia.field_e = true;
                ei.a(4, param2);
                break L0;
              } else {
                if (1 == param1) {
                  if (ri.field_c != param3) {
                    ri.field_c = param3;
                    wia.field_e = true;
                    ei.a(4, param2);
                    if ((param1 ^ -1) == -3) {
                      if (param3 == fj.field_g) {
                        return;
                      } else {
                        wia.field_e = true;
                        fj.field_g = param3;
                        ei.a(4, param2);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if ((param1 ^ -1) == -3) {
                      if (param3 == fj.field_g) {
                        return;
                      } else {
                        wia.field_e = true;
                        fj.field_g = param3;
                        ei.a(4, param2);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if ((param1 ^ -1) == -3) {
                    if (param3 == fj.field_g) {
                      return;
                    } else {
                      wia.field_e = true;
                      fj.field_g = param3;
                      ei.a(4, param2);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L1: {
            if (1 != param1) {
              break L1;
            } else {
              if (ri.field_c == param3) {
                break L1;
              } else {
                ri.field_c = param3;
                wia.field_e = true;
                ei.a(4, param2);
                if ((param1 ^ -1) == -3) {
                  if (param3 == fj.field_g) {
                    return;
                  } else {
                    wia.field_e = true;
                    fj.field_g = param3;
                    ei.a(4, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if ((param1 ^ -1) == -3) {
            if (param3 == fj.field_g) {
              return;
            } else {
              wia.field_e = true;
              fj.field_g = param3;
              ei.a(4, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          fk.d((byte) 22);
          if (-1 == (param1 ^ -1)) {
            L2: {
              if (param3 != fb.field_p) {
                fb.field_p = param3;
                wia.field_e = true;
                ei.a(4, param2);
                break L2;
              } else {
                break L2;
              }
            }
            if (1 == param1) {
              if (ri.field_c == param3) {
                if (param1 == -3) {
                  if (param3 == fj.field_g) {
                    return;
                  } else {
                    wia.field_e = true;
                    fj.field_g = param3;
                    ei.a(4, param2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ri.field_c = param3;
                wia.field_e = true;
                ei.a(4, param2);
                if ((param1 ^ -1) == -3) {
                  if (param3 != fj.field_g) {
                    wia.field_e = true;
                    fj.field_g = param3;
                    ei.a(4, param2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if ((param1 ^ -1) == -3) {
                if (param3 == fj.field_g) {
                  return;
                } else {
                  wia.field_e = true;
                  fj.field_g = param3;
                  ei.a(4, param2);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L3: {
              if (1 != param1) {
                break L3;
              } else {
                if (ri.field_c == param3) {
                  break L3;
                } else {
                  ri.field_c = param3;
                  wia.field_e = true;
                  ei.a(4, param2);
                  if ((param1 ^ -1) != -3) {
                    return;
                  } else {
                    L4: {
                      if (param3 == fj.field_g) {
                        break L4;
                      } else {
                        wia.field_e = true;
                        fj.field_g = param3;
                        ei.a(4, param2);
                        break L4;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if ((param1 ^ -1) == -3) {
              if (param3 != fj.field_g) {
                wia.field_e = true;
                fj.field_g = param3;
                ei.a(4, param2);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void d(byte param0) {
        dg.field_j = mm.field_D;
        dg.field_k = eia.field_d;
        int var1 = -34 % ((-63 - param0) / 42);
        dg.field_h = tq.field_r;
        dg.field_f = jf.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Close";
    }
}
