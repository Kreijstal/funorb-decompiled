/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ij extends lc implements tsa {
    private boolean field_W;
    private static String[] field_Z;
    private boolean field_bb;
    private il field_ab;
    private boolean field_V;
    private boolean field_Y;
    private rk field_cb;
    private static String[] field_db;
    static nh field_X;

    public void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param4 > 44) {
          if (!((ij) this).field_Y) {
            jc.a("tochangedisplayname.ws", di.a(72), (byte) -68);
            return;
          } else {
            jsa.a(false, 3);
            ((ij) this).i((byte) -124);
            return;
          }
        } else {
          ((ij) this).field_cb = null;
          if (!((ij) this).field_Y) {
            jc.a("tochangedisplayname.ws", di.a(72), (byte) -68);
            return;
          } else {
            jsa.a(false, 3);
            ((ij) this).i((byte) -124);
            return;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!param3) {
            field_X = null;
            if (!(13 != param2)) {
                ((ij) this).i((byte) -115);
                return true;
            }
            return super.a(param0, param1, param2, true);
        }
        if (!(13 != param2)) {
            ((ij) this).i((byte) -115);
            return true;
        }
        return super.a(param0, param1, param2, true);
    }

    final void f(boolean param0) {
        sr var2 = null;
        ((ij) this).field_cb.a(param0, 4210752, 2121792);
        if (!param0) {
          ((ij) this).field_Y = false;
          var2 = new sr((ij) this, ((ij) this).field_ab, fua.field_e);
          var2.a(sra.field_i, 15, -127);
          ((ij) this).a(101, (ae) (Object) var2);
          return;
        } else {
          var2 = new sr((ij) this, ((ij) this).field_ab, fua.field_e);
          var2.a(sra.field_i, 15, -127);
          ((ij) this).a(101, (ae) (Object) var2);
          return;
        }
    }

    final static void j(byte param0) {
        if (ej.field_a == null) {
          L0: {
            if (null != ena.field_p) {
              ena.field_p.f(12936);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 >= -97) {
            return;
          } else {
            jr.b((byte) -106);
            return;
          }
        } else {
          L1: {
            ej.field_a.h(-1);
            if (null != ena.field_p) {
              ena.field_p.f(12936);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 >= -97) {
            return;
          } else {
            jr.b((byte) -106);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_db = null;
        field_Z = null;
        field_X = null;
        if (param0 != 7707) {
            ij.a(12, -99, 63, -9, 57, 8);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 6) {
          ij.a(-35, -13, -25, -10, -41, -25);
          tga.field_a.c(fm.a(false, param4), param0, param2, param3, param5 + -22977, param1);
          return;
        } else {
          tga.field_a.c(fm.a(false, param4), param0, param2, param3, param5 + -22977, param1);
          return;
        }
    }

    ij(jta param0, il param1, String param2, boolean param3, boolean param4) {
        super(param0, (ae) (Object) new sr((ij) null, param1, param2), 77, 10, 10);
        ((ij) this).field_ab = param1;
        ((ij) this).field_bb = param4 ? true : false;
        ((ij) this).field_W = false;
        ((ij) this).field_Y = false;
        ((ij) this).field_V = param3 ? true : false;
        ((ij) this).field_cb = new rk(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ij) this).field_cb.field_D = true;
        ((ij) this).a((ae) (Object) ((ij) this).field_cb, -1);
    }

    final void a(int param0, byte param1, String param2) {
        sr var4 = null;
        int var5 = 0;
        Object var6 = null;
        sr var7 = null;
        sr var8 = null;
        sr var9 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        sr stackIn_10_0 = null;
        sr stackIn_11_0 = null;
        sr stackIn_12_0 = null;
        String stackIn_12_1 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        sr stackIn_57_0 = null;
        sr stackIn_58_0 = null;
        sr stackIn_59_0 = null;
        String stackIn_59_1 = null;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        sr stackOut_56_0 = null;
        sr stackOut_58_0 = null;
        String stackOut_58_1 = null;
        sr stackOut_57_0 = null;
        String stackOut_57_1 = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        sr stackOut_9_0 = null;
        sr stackOut_11_0 = null;
        String stackOut_11_1 = null;
        sr stackOut_10_0 = null;
        String stackOut_10_1 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (((ij) this).field_W) {
          return;
        } else {
          if (param1 < 39) {
            L0: {
              var6 = null;
              boolean discarded$9 = ((ij) this).a('F', (ae) null, 118, true);
              ((ij) this).field_W = true;
              stackOut_51_0 = this;
              stackIn_53_0 = stackOut_51_0;
              stackIn_52_0 = stackOut_51_0;
              if (param0 != 256) {
                stackOut_53_0 = this;
                stackOut_53_1 = 0;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                break L0;
              } else {
                stackOut_52_0 = this;
                stackOut_52_1 = 1;
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                break L0;
              }
            }
            ((ij) this).field_Y = stackIn_54_1 != 0;
            ((ij) this).field_cb.a(true, 4210752, 8405024);
            var9 = new sr((ij) this, ((ij) this).field_ab, param2);
            var7 = var9;
            var4 = var9;
            if (param0 == 5) {
              var9.a(sba.field_n, 11, 61);
              var9.a(nj.field_q, 17, 36);
              if (3 == param0) {
                var9.a(tca.field_M, 7, 28);
                ((ij) this).a(95, (ae) (Object) var9);
                return;
              } else {
                if (param0 != 4) {
                  if ((param0 ^ -1) != -7) {
                    if ((param0 ^ -1) == -10) {
                      rj discarded$10 = var9.a(epa.field_q, (byte) -102, (qc) this);
                      ((ij) this).a(95, (ae) (Object) var9);
                      return;
                    } else {
                      ((ij) this).a(95, (ae) (Object) var9);
                      return;
                    }
                  } else {
                    var9.a(vf.field_a, 9, -65);
                    ((ij) this).a(95, (ae) (Object) var9);
                    return;
                  }
                } else {
                  var9.a(bg.field_p, 8, -83);
                  ((ij) this).a(95, (ae) (Object) var9);
                  return;
                }
              }
            } else {
              if (param0 == 256) {
                rj discarded$11 = var9.a(nga.field_q, (byte) -102, (qc) this);
                if (3 == param0) {
                  var9.a(tca.field_M, 7, 28);
                  ((ij) this).a(95, (ae) (Object) var9);
                  return;
                } else {
                  if (param0 != 4) {
                    if ((param0 ^ -1) != -7) {
                      if ((param0 ^ -1) == -10) {
                        rj discarded$12 = var9.a(epa.field_q, (byte) -102, (qc) this);
                        ((ij) this).a(95, (ae) (Object) var9);
                        return;
                      } else {
                        ((ij) this).a(95, (ae) (Object) var9);
                        return;
                      }
                    } else {
                      var9.a(vf.field_a, 9, -65);
                      ((ij) this).a(95, (ae) (Object) var9);
                      return;
                    }
                  } else {
                    var9.a(bg.field_p, 8, -83);
                    ((ij) this).a(95, (ae) (Object) var9);
                    return;
                  }
                }
              } else {
                L1: {
                  stackOut_56_0 = (sr) var9;
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_57_0 = stackOut_56_0;
                  if (((ij) this).field_V) {
                    stackOut_58_0 = (sr) (Object) stackIn_58_0;
                    stackOut_58_1 = nga.field_q;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    break L1;
                  } else {
                    stackOut_57_0 = (sr) (Object) stackIn_57_0;
                    stackOut_57_1 = sm.field_o;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    break L1;
                  }
                }
                ((sr) (Object) stackIn_59_0).a(stackIn_59_1, -1, 78);
                if (3 == param0) {
                  var9.a(tca.field_M, 7, 28);
                  ((ij) this).a(95, (ae) (Object) var9);
                  return;
                } else {
                  if (param0 != 4) {
                    if ((param0 ^ -1) != -7) {
                      if ((param0 ^ -1) == -10) {
                        rj discarded$13 = var9.a(epa.field_q, (byte) -102, (qc) this);
                        ((ij) this).a(95, (ae) (Object) var9);
                        return;
                      } else {
                        ((ij) this).a(95, (ae) (Object) var9);
                        return;
                      }
                    } else {
                      var9.a(vf.field_a, 9, -65);
                      ((ij) this).a(95, (ae) (Object) var9);
                      return;
                    }
                  } else {
                    var9.a(bg.field_p, 8, -83);
                    ((ij) this).a(95, (ae) (Object) var9);
                    return;
                  }
                }
              }
            }
          } else {
            L2: {
              ((ij) this).field_W = true;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param0 != 256) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((ij) this).field_Y = stackIn_7_1 != 0;
            ((ij) this).field_cb.a(true, 4210752, 8405024);
            var8 = new sr((ij) this, ((ij) this).field_ab, param2);
            var7 = var8;
            var4 = var8;
            if (param0 == 5) {
              var8.a(sba.field_n, 11, 61);
              var8.a(nj.field_q, 17, 36);
              if (3 == param0) {
                var8.a(tca.field_M, 7, 28);
                ((ij) this).a(95, (ae) (Object) var8);
                return;
              } else {
                if (param0 != 4) {
                  if ((param0 ^ -1) != -7) {
                    if ((param0 ^ -1) == -10) {
                      rj discarded$14 = var8.a(epa.field_q, (byte) -102, (qc) this);
                      ((ij) this).a(95, (ae) (Object) var8);
                      return;
                    } else {
                      ((ij) this).a(95, (ae) (Object) var8);
                      return;
                    }
                  } else {
                    var8.a(vf.field_a, 9, -65);
                    ((ij) this).a(95, (ae) (Object) var8);
                    return;
                  }
                } else {
                  var8.a(bg.field_p, 8, -83);
                  ((ij) this).a(95, (ae) (Object) var8);
                  return;
                }
              }
            } else {
              if (param0 == 256) {
                rj discarded$15 = var8.a(nga.field_q, (byte) -102, (qc) this);
                if (3 == param0) {
                  var8.a(tca.field_M, 7, 28);
                  ((ij) this).a(95, (ae) (Object) var8);
                  return;
                } else {
                  if (param0 != 4) {
                    if ((param0 ^ -1) != -7) {
                      if ((param0 ^ -1) == -10) {
                        rj discarded$16 = var8.a(epa.field_q, (byte) -102, (qc) this);
                        ((ij) this).a(95, (ae) (Object) var8);
                        return;
                      } else {
                        ((ij) this).a(95, (ae) (Object) var8);
                        return;
                      }
                    } else {
                      var8.a(vf.field_a, 9, -65);
                      ((ij) this).a(95, (ae) (Object) var8);
                      return;
                    }
                  } else {
                    var8.a(bg.field_p, 8, -83);
                    ((ij) this).a(95, (ae) (Object) var8);
                    return;
                  }
                }
              } else {
                L3: {
                  stackOut_9_0 = (sr) var8;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((ij) this).field_V) {
                    stackOut_11_0 = (sr) (Object) stackIn_11_0;
                    stackOut_11_1 = nga.field_q;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L3;
                  } else {
                    stackOut_10_0 = (sr) (Object) stackIn_10_0;
                    stackOut_10_1 = sm.field_o;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L3;
                  }
                }
                ((sr) (Object) stackIn_12_0).a(stackIn_12_1, -1, 78);
                if (3 == param0) {
                  var8.a(tca.field_M, 7, 28);
                  ((ij) this).a(95, (ae) (Object) var8);
                  return;
                } else {
                  if (param0 != 4) {
                    if ((param0 ^ -1) != -7) {
                      if ((param0 ^ -1) == -10) {
                        rj discarded$17 = var8.a(epa.field_q, (byte) -102, (qc) this);
                        ((ij) this).a(95, (ae) (Object) var8);
                        return;
                      } else {
                        ((ij) this).a(95, (ae) (Object) var8);
                        return;
                      }
                    } else {
                      var8.a(vf.field_a, 9, -65);
                      ((ij) this).a(95, (ae) (Object) var8);
                      return;
                    }
                  } else {
                    var8.a(bg.field_p, 8, -83);
                    ((ij) this).a(95, (ae) (Object) var8);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void i(byte param0) {
        int var2 = 0;
        if (((ij) this).field_B) {
          var2 = -25 / ((-69 - param0) / 37);
          ((ij) this).field_B = false;
          if (!((ij) this).field_V) {
            if (!((ij) this).field_bb) {
              return;
            } else {
              vg.q(30497);
              return;
            }
          } else {
            kla.a((byte) -72);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new String[6];
        field_db[4] = "Pulse (Fast)";
        field_db[2] = "Flicker (Fast)";
        field_Z = new String[3];
        field_db[1] = "Glow";
        field_db[0] = "Flat";
        field_db[3] = "Flicker (Slow)";
        field_db[5] = "Pulse (Slow)";
        field_Z[0] = "Shallow";
        field_Z[1] = "Medium";
        field_Z[2] = "Deep";
    }
}
