/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ct extends ml {
    static int field_x;
    static java.applet.Applet field_z;
    static hr[] field_A;
    private byte[] field_y;

    ct() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static void a(int param0, ah param1) {
        double var2 = 0.0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (-1 != (param1.field_Q ^ -1)) {
          var2 = vp.field_d[param1.field_N] * (double)gq.field_q[param1.field_Q];
          var2 = var2 + (double)(param1.field_G / 50);
          var2 = var2 * (double)pd.field_p;
          cb.a((int)var2, -1372239541);
          if ((1 << param1.field_Q & qk.field_T) == 0) {
            qk.field_T = qk.field_T | 1 << param1.field_Q;
            bi.field_c = bi.field_c + 1;
            rn.a(Integer.toString((int)var2), param1.field_C >> -1852132440, param1.field_z >> 1911001992, 16777215, 28807);
            if (qk.field_T != -1) {
              L0: {
                if (ps.field_e[13] != bi.field_c) {
                  break L0;
                } else {
                  th.b(24753, 242, 13);
                  break L0;
                }
              }
              L1: {
                if (7 != oh.field_e) {
                  break L1;
                } else {
                  if (0 == an.field_a) {
                    if (-6 == (param1.field_N ^ -1)) {
                      L2: {
                        ei.field_a = ei.field_a + 1;
                        if ((ei.field_a ^ -1) == -5) {
                          th.b(24753, 240, 15);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0 == 6510) {
                        od.a(param1.field_N, (byte) 73);
                        return;
                      } else {
                        ct.b(true);
                        od.a(param1.field_N, (byte) 73);
                        return;
                      }
                    } else {
                      ei.field_a = ei.field_a - 1;
                      if ((ei.field_a ^ -1) == -5) {
                        th.b(24753, 240, 15);
                        break L1;
                      } else {
                        if (param0 == 6510) {
                          od.a(param1.field_N, (byte) 73);
                          return;
                        } else {
                          ct.b(true);
                          od.a(param1.field_N, (byte) 73);
                          return;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 == 6510) {
                od.a(param1.field_N, (byte) 73);
                return;
              } else {
                ct.b(true);
                od.a(param1.field_N, (byte) 73);
                return;
              }
            } else {
              L3: {
                if (7 != oh.field_e) {
                  break L3;
                } else {
                  if (0 == an.field_a) {
                    L4: {
                      if (-6 == param1.field_N) {
                        ei.field_a = ei.field_a + 1;
                        break L4;
                      } else {
                        ei.field_a = ei.field_a - 1;
                        break L4;
                      }
                    }
                    if ((ei.field_a ^ -1) == -5) {
                      th.b(24753, 240, 15);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if (param0 == 6510) {
                od.a(param1.field_N, (byte) 73);
                return;
              } else {
                ct.b(true);
                od.a(param1.field_N, (byte) 73);
                return;
              }
            }
          } else {
            qk.field_T = 0;
            bi.field_c = 1;
            qk.field_T = qk.field_T | 1 << param1.field_Q;
            rn.a(Integer.toString((int)var2), param1.field_C >> -1852132440, param1.field_z >> 1911001992, 16777215, 28807);
            if (qk.field_T != 0) {
              if (ps.field_e[13] == bi.field_c) {
                th.b(24753, 242, 13);
                if (7 != oh.field_e) {
                  if (param0 == 6510) {
                    od.a(param1.field_N, (byte) 73);
                    return;
                  } else {
                    ct.b(true);
                    od.a(param1.field_N, (byte) 73);
                    return;
                  }
                } else {
                  if (0 == an.field_a) {
                    if (-6 == (param1.field_N ^ -1)) {
                      L5: {
                        ei.field_a = ei.field_a + 1;
                        if ((ei.field_a ^ -1) == -5) {
                          th.b(24753, 240, 15);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (param0 == 6510) {
                        od.a(param1.field_N, (byte) 73);
                        return;
                      } else {
                        ct.b(true);
                        od.a(param1.field_N, (byte) 73);
                        return;
                      }
                    } else {
                      L6: {
                        ei.field_a = ei.field_a - 1;
                        if ((ei.field_a ^ -1) == -5) {
                          th.b(24753, 240, 15);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (param0 == 6510) {
                        od.a(param1.field_N, (byte) 73);
                        return;
                      } else {
                        ct.b(true);
                        od.a(param1.field_N, (byte) 73);
                        return;
                      }
                    }
                  } else {
                    if (param0 == 6510) {
                      od.a(param1.field_N, (byte) 73);
                      return;
                    } else {
                      ct.b(true);
                      od.a(param1.field_N, (byte) 73);
                      return;
                    }
                  }
                }
              } else {
                if (7 != oh.field_e) {
                  if (param0 == 6510) {
                    od.a(param1.field_N, (byte) 73);
                    return;
                  } else {
                    ct.b(true);
                    od.a(param1.field_N, (byte) 73);
                    return;
                  }
                } else {
                  if (0 == an.field_a) {
                    if (-6 == (param1.field_N ^ -1)) {
                      L7: {
                        ei.field_a = ei.field_a + 1;
                        if ((ei.field_a ^ -1) == -5) {
                          th.b(24753, 240, 15);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (param0 == 6510) {
                        od.a(param1.field_N, (byte) 73);
                        return;
                      } else {
                        ct.b(true);
                        od.a(param1.field_N, (byte) 73);
                        return;
                      }
                    } else {
                      L8: {
                        ei.field_a = ei.field_a - 1;
                        if ((ei.field_a ^ -1) == -5) {
                          th.b(24753, 240, 15);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (param0 == 6510) {
                        od.a(param1.field_N, (byte) 73);
                        return;
                      } else {
                        ct.b(true);
                        od.a(param1.field_N, (byte) 73);
                        return;
                      }
                    }
                  } else {
                    if (param0 == 6510) {
                      od.a(param1.field_N, (byte) 73);
                      return;
                    } else {
                      ct.b(true);
                      od.a(param1.field_N, (byte) 73);
                      return;
                    }
                  }
                }
              }
            } else {
              if (7 != oh.field_e) {
                if (param0 == 6510) {
                  od.a(param1.field_N, (byte) 73);
                  return;
                } else {
                  ct.b(true);
                  od.a(param1.field_N, (byte) 73);
                  return;
                }
              } else {
                if (0 == an.field_a) {
                  if (-6 == (param1.field_N ^ -1)) {
                    L9: {
                      ei.field_a = ei.field_a + 1;
                      if ((ei.field_a ^ -1) == -5) {
                        th.b(24753, 240, 15);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (param0 == 6510) {
                      od.a(param1.field_N, (byte) 73);
                      return;
                    } else {
                      ct.b(true);
                      od.a(param1.field_N, (byte) 73);
                      return;
                    }
                  } else {
                    L10: {
                      ei.field_a = ei.field_a - 1;
                      if ((ei.field_a ^ -1) == -5) {
                        th.b(24753, 240, 15);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (param0 == 6510) {
                      od.a(param1.field_N, (byte) 73);
                      return;
                    } else {
                      ct.b(true);
                      od.a(param1.field_N, (byte) 73);
                      return;
                    }
                  }
                } else {
                  if (param0 == 6510) {
                    od.a(param1.field_N, (byte) 73);
                    return;
                  } else {
                    ct.b(true);
                    od.a(param1.field_N, (byte) 73);
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (param0 == 6510) {
            od.a(param1.field_N, (byte) 73);
            return;
          } else {
            ct.b(true);
            od.a(param1.field_N, (byte) 73);
            return;
          }
        }
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          return null;
        } else {
          ((ct) this).field_y = new byte[2 * (param0 * param1 * param3)];
          ((ct) this).a(param3, 206, param1, param0);
          return ((ct) this).field_y;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 2 * param1;
        var5 = param0 & 255;
        var4++;
        ((ct) this).field_y[var4] = (byte)-1;
        ((ct) this).field_y[var4] = (byte)(3 * var5 >> -971127963);
        if (param2 != 4096) {
          field_x = 71;
          return;
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        field_z = null;
        if (param0 >= -15) {
            return;
        }
        field_A = null;
    }

    final static void b(boolean param0) {
        aa.field_a = new ah[100];
        sm.a(72);
        bj.field_b = new jn();
        is.field_c = new jn();
        he.field_o = new Random();
        db.field_l = 1;
        in.field_z = 0;
        nd.field_F = 1;
        iw.field_b = 0;
        td.field_m = false;
        if (!param0) {
          return;
        } else {
          ke.a(false);
          oc.field_e = 1000;
          ag.a(0, 8);
          return;
        }
    }

    static {
    }
}
