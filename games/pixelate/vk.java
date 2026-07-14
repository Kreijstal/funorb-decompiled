/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class vk extends hb implements vo {
    private oc field_rb;
    private boolean field_ob;
    private boolean field_vb;
    private boolean field_nb;
    static String field_qb;
    static String field_sb;
    static ak field_mb;
    static tf[] field_tb;
    private jl field_wb;
    static int[] field_ub;
    private boolean field_pb;

    public void a(qm param0, int param1, int param2, int param3, int param4) {
        if (param2 == 11) {
          if (((vk) this).field_nb) {
            te.a(3, -2671);
            ((vk) this).p(-83);
            return;
          } else {
            ae.a((byte) 71, ao.a(13867), "tochangedisplayname.ws");
            return;
          }
        } else {
          field_ub = null;
          if (((vk) this).field_nb) {
            te.a(3, -2671);
            ((vk) this).p(-83);
            return;
          } else {
            ae.a((byte) 71, ao.a(13867), "tochangedisplayname.ws");
            return;
          }
        }
    }

    public static void g(byte param0) {
        field_sb = null;
        field_mb = null;
        field_ub = null;
        field_qb = null;
        if (param0 <= 123) {
          field_qb = null;
          field_tb = null;
          return;
        } else {
          field_tb = null;
          return;
        }
    }

    vk(kn param0, jl param1, String param2, boolean param3, boolean param4) {
        super(param0, (ng) (Object) new vl((vk) null, param1, param2), 77, 10, 10);
        ((vk) this).field_pb = param3 ? true : false;
        ((vk) this).field_ob = param4 ? true : false;
        ((vk) this).field_nb = false;
        ((vk) this).field_wb = param1;
        ((vk) this).field_vb = false;
        ((vk) this).field_rb = new oc(13, 50, 274, 30, 15, 2113632, 4210752);
        ((vk) this).field_rb.field_Y = true;
        ((vk) this).b((ng) (Object) ((vk) this).field_rb, 80);
    }

    final void p(int param0) {
        Object var3 = null;
        if (!((vk) this).field_N) {
          return;
        } else {
          ((vk) this).field_N = false;
          if (param0 <= -80) {
            if (!((vk) this).field_pb) {
              if (!((vk) this).field_ob) {
                return;
              } else {
                a.l(20700);
                return;
              }
            } else {
              m.a((byte) -102);
              return;
            }
          } else {
            var3 = null;
            ((vk) this).a((qm) null, -114, -9, 49, 73);
            if (!((vk) this).field_pb) {
              if (!((vk) this).field_ob) {
                return;
              } else {
                a.l(20700);
                return;
              }
            } else {
              m.a((byte) -102);
              return;
            }
          }
        }
    }

    final static void n(int param0) {
        int var2 = 0;
        var2 = Pixelate.field_H ? 1 : 0;
        if (-1 > oo.field_b) {
          L0: {
            oo.field_b = oo.field_b - 1;
            if ((oo.field_b ^ -1) < -1) {
              c.m(124);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 > 76) {
            L1: {
              if (0 < vn.field_g) {
                cm.b(vn.field_g, 4740);
                break L1;
              } else {
                break L1;
              }
            }
            if (h.field_W > 0) {
              cm.b(h.field_W, 4740);
              return;
            } else {
              return;
            }
          } else {
            L2: {
              field_ub = null;
              if (0 < vn.field_g) {
                cm.b(vn.field_g, 4740);
                break L2;
              } else {
                break L2;
              }
            }
            if (h.field_W > 0) {
              cm.b(h.field_W, 4740);
              return;
            } else {
              return;
            }
          }
        } else {
          if (-1 < vn.field_g) {
            L3: {
              vn.field_g = vn.field_g - 1;
              if ((oo.field_b ^ -1) < -1) {
                c.m(124);
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 > 76) {
              L4: {
                if (0 < vn.field_g) {
                  cm.b(vn.field_g, 4740);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (h.field_W > 0) {
                cm.b(h.field_W, 4740);
                return;
              } else {
                return;
              }
            } else {
              L5: {
                field_ub = null;
                if (0 < vn.field_g) {
                  cm.b(vn.field_g, 4740);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (h.field_W <= 0) {
                  break L6;
                } else {
                  cm.b(h.field_W, 4740);
                  break L6;
                }
              }
              return;
            }
          } else {
            if (0 < h.field_W) {
              L7: {
                h.field_W = h.field_W - 1;
                if ((oo.field_b ^ -1) < -1) {
                  c.m(124);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (param0 <= 76) {
                L8: {
                  field_ub = null;
                  if (0 < vn.field_g) {
                    cm.b(vn.field_g, 4740);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (h.field_W > 0) {
                  cm.b(h.field_W, 4740);
                  return;
                } else {
                  return;
                }
              } else {
                L9: {
                  if (0 < vn.field_g) {
                    cm.b(vn.field_g, 4740);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (h.field_W > 0) {
                  cm.b(h.field_W, 4740);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L10: {
                if ((oo.field_b ^ -1) < -1) {
                  c.m(124);
                  break L10;
                } else {
                  break L10;
                }
              }
              if (param0 <= 76) {
                L11: {
                  field_ub = null;
                  if (0 < vn.field_g) {
                    cm.b(vn.field_g, 4740);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (h.field_W <= 0) {
                  return;
                } else {
                  cm.b(h.field_W, 4740);
                  return;
                }
              } else {
                L12: {
                  if (0 < vn.field_g) {
                    cm.b(vn.field_g, 4740);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (h.field_W <= 0) {
                    break L13;
                  } else {
                    cm.b(h.field_W, 4740);
                    break L13;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void o(int param0) {
        ((vk) this).field_rb.a((byte) 125, param0, 4210752);
        vl var2 = new vl((vk) this, ((vk) this).field_wb, hq.field_D);
        var2.a(15, -1, sk.field_b);
        ((vk) this).c((ng) (Object) var2, -118);
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        vl var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vl stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        vl stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        vl stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        String stackIn_25_3 = null;
        vl stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        vl stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        vl stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        String stackIn_56_3 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vl stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        vl stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        String stackOut_55_3 = null;
        vl stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        String stackOut_54_3 = null;
        vl stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        vl stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        String stackOut_24_3 = null;
        vl stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        String stackOut_23_3 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        if (((vk) this).field_vb) {
          return;
        } else {
          L0: {
            ((vk) this).field_vb = true;
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (-257 != (param0 ^ -1)) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          ((vk) this).field_nb = stackIn_6_1 != 0;
          ((vk) this).field_rb.a((byte) 103, 8405024, 4210752);
          var6 = new vl((vk) this, ((vk) this).field_wb, param2);
          if (param1 != 5804) {
            vk.n(117);
            if (5 == param0) {
              var6.a(11, -1, jj.field_c);
              var6.a(17, -1, mk.field_e);
              if ((param0 ^ -1) == -4) {
                var6.a(7, param1 + -5805, gd.field_d);
                ((vk) this).c((ng) (Object) var6, -124);
                return;
              } else {
                if (param0 != 4) {
                  if (param0 == 6) {
                    var6.a(9, -1, ho.field_d);
                    ((vk) this).c((ng) (Object) var6, -124);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      qm discarded$8 = var6.a(1707, (fn) this, ue.field_q);
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    } else {
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    }
                  }
                } else {
                  var6.a(8, -1, oc.field_X);
                  ((vk) this).c((ng) (Object) var6, -124);
                  return;
                }
              }
            } else {
              if (-257 == (param0 ^ -1)) {
                qm discarded$9 = var6.a(1707, (fn) this, bo.field_k);
                if ((param0 ^ -1) == -4) {
                  var6.a(7, param1 + -5805, gd.field_d);
                  ((vk) this).c((ng) (Object) var6, -124);
                  return;
                } else {
                  if (param0 != 4) {
                    if (param0 == 6) {
                      var6.a(9, -1, ho.field_d);
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        qm discarded$10 = var6.a(1707, (fn) this, ue.field_q);
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      } else {
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      }
                    }
                  } else {
                    var6.a(8, -1, oc.field_X);
                    ((vk) this).c((ng) (Object) var6, -124);
                    return;
                  }
                }
              } else {
                L1: {
                  stackOut_53_0 = (vl) var6;
                  stackOut_53_1 = -1;
                  stackOut_53_2 = -1;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  if (!((vk) this).field_pb) {
                    stackOut_55_0 = (vl) (Object) stackIn_55_0;
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = stackIn_55_2;
                    stackOut_55_3 = bo.field_f;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    stackIn_56_3 = stackOut_55_3;
                    break L1;
                  } else {
                    stackOut_54_0 = (vl) (Object) stackIn_54_0;
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = stackIn_54_2;
                    stackOut_54_3 = bo.field_k;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_56_2 = stackOut_54_2;
                    stackIn_56_3 = stackOut_54_3;
                    break L1;
                  }
                }
                ((vl) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_56_3);
                if ((param0 ^ -1) == -4) {
                  var6.a(7, param1 + -5805, gd.field_d);
                  ((vk) this).c((ng) (Object) var6, -124);
                  return;
                } else {
                  if (param0 != 4) {
                    if (param0 == 6) {
                      var6.a(9, -1, ho.field_d);
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        qm discarded$11 = var6.a(1707, (fn) this, ue.field_q);
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      } else {
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      }
                    }
                  } else {
                    var6.a(8, -1, oc.field_X);
                    ((vk) this).c((ng) (Object) var6, -124);
                    return;
                  }
                }
              }
            }
          } else {
            if (5 == param0) {
              var6.a(11, -1, jj.field_c);
              var6.a(17, -1, mk.field_e);
              if ((param0 ^ -1) == -4) {
                var6.a(7, param1 + -5805, gd.field_d);
                ((vk) this).c((ng) (Object) var6, -124);
                return;
              } else {
                if (param0 != 4) {
                  if (param0 == 6) {
                    var6.a(9, -1, ho.field_d);
                    ((vk) this).c((ng) (Object) var6, -124);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      qm discarded$12 = var6.a(1707, (fn) this, ue.field_q);
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    } else {
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    }
                  }
                } else {
                  var6.a(8, -1, oc.field_X);
                  ((vk) this).c((ng) (Object) var6, -124);
                  return;
                }
              }
            } else {
              if (-257 != (param0 ^ -1)) {
                L2: {
                  stackOut_22_0 = (vl) var6;
                  stackOut_22_1 = -1;
                  stackOut_22_2 = -1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  if (!((vk) this).field_pb) {
                    stackOut_24_0 = (vl) (Object) stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = bo.field_f;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    break L2;
                  } else {
                    stackOut_23_0 = (vl) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = bo.field_k;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    break L2;
                  }
                }
                ((vl) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, stackIn_25_3);
                if ((param0 ^ -1) == -4) {
                  var6.a(7, param1 + -5805, gd.field_d);
                  ((vk) this).c((ng) (Object) var6, -124);
                  return;
                } else {
                  if (param0 != 4) {
                    if (param0 == 6) {
                      var6.a(9, -1, ho.field_d);
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        qm discarded$13 = var6.a(1707, (fn) this, ue.field_q);
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      } else {
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      }
                    }
                  } else {
                    var6.a(8, -1, oc.field_X);
                    ((vk) this).c((ng) (Object) var6, -124);
                    return;
                  }
                }
              } else {
                qm discarded$14 = var6.a(1707, (fn) this, bo.field_k);
                if ((param0 ^ -1) == -4) {
                  var6.a(7, param1 + -5805, gd.field_d);
                  ((vk) this).c((ng) (Object) var6, -124);
                  return;
                } else {
                  if (param0 != 4) {
                    if (param0 == 6) {
                      var6.a(9, -1, ho.field_d);
                      ((vk) this).c((ng) (Object) var6, -124);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        qm discarded$15 = var6.a(1707, (fn) this, ue.field_q);
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      } else {
                        ((vk) this).c((ng) (Object) var6, -124);
                        return;
                      }
                    }
                  } else {
                    var6.a(8, -1, oc.field_X);
                    ((vk) this).c((ng) (Object) var6, -124);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        if (-14 == (param0 ^ -1)) {
          ((vk) this).p(-126);
          return true;
        } else {
          if (param1 != 3) {
            return true;
          } else {
            return super.a(param0, 3, param2, param3);
          }
        }
    }

    final static ha a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ha var5 = null;
            i var5_ref = null;
            int var6 = 0;
            ha stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            ha stackOut_0_0 = null;
            try {
              var4 = Class.forName("me");
              var6 = 32 / ((param1 - 70) / 45);
              var5 = (ha) var4.newInstance();
              var5.a(param3, param2, param0, (byte) -100);
              stackOut_0_0 = (ha) var5;
              stackIn_1_0 = stackOut_0_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_1_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_qb = "Password: ";
        field_ub = new int[8192];
    }
}
