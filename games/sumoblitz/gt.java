/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

class gt extends ur implements ai {
    static jh field_gb;
    static int field_ab;
    private boolean field_cb;
    static da field_db;
    static String field_hb;
    static boolean field_bb;
    private pq field_ib;
    private boolean field_kb;
    private boolean field_fb;
    private vn field_jb;
    private boolean field_eb;

    final static void a(int param0, java.applet.Applet param1) {
        Object var3 = null;
        if (param0 != -1540) {
          var3 = null;
          gt.a(-115, (java.applet.Applet) null);
          ie.a(-118, "", param1);
          of.a(param0 + 9732, param1);
          return;
        } else {
          ie.a(-118, "", param1);
          of.a(param0 + 9732, param1);
          return;
        }
    }

    final void n(int param0) {
        if (param0 == -7) {
          if (((gt) this).field_D) {
            ((gt) this).field_D = false;
            if (!((gt) this).field_cb) {
              if (!((gt) this).field_fb) {
                return;
              } else {
                bv.a(-363927231);
                return;
              }
            } else {
              ag.a(0);
              return;
            }
          } else {
            return;
          }
        } else {
          ((gt) this).field_kb = true;
          if (((gt) this).field_D) {
            ((gt) this).field_D = false;
            if (!((gt) this).field_cb) {
              if (!((gt) this).field_fb) {
                return;
              } else {
                bv.a(-363927231);
                return;
              }
            } else {
              ag.a(0);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void l(int param0) {
        field_hb = null;
        field_db = null;
        int var1 = 57 / ((param0 - 70) / 48);
        field_gb = null;
    }

    final static int a(byte param0, String param1, boolean param2) {
        if (param0 > -2) {
            return -68;
        }
        if (param2) {
            return ns.field_a.a(param1);
        }
        return qq.field_R.a(param1);
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        var3 = ji.a(param1, (byte) 66);
        if (param2 >= 46) {
          if (0 == (param0.indexOf(param1) ^ -1)) {
            if (param0.indexOf(var3) == -1) {
              if (!param0.startsWith(param1)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param1)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_hb = null;
          if (0 == (param0.indexOf(param1) ^ -1)) {
            if (param0.indexOf(var3) == -1) {
              if (!param0.startsWith(param1)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param1)) {
                    if (!param0.endsWith(var3)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void e(boolean param0) {
        lc var2 = null;
        lc stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        lc stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        ((gt) this).field_ib.b(2121792, 4210752, 55);
        if (param0) {
          return;
        } else {
          var2 = new lc((gt) this, ((gt) this).field_jb, fh.field_j);
          stackOut_1_0 = (lc) var2;
          stackOut_1_1 = id.field_m;
          stackOut_1_2 = 15;
          stackOut_1_3 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          stackIn_3_2 = stackOut_1_2;
          stackIn_3_3 = stackOut_1_3;
          ((lc) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
          ((gt) this).b((byte) -121, (pk) (Object) var2);
          return;
        }
    }

    public void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param1 == 710) {
          if (((gt) this).field_eb) {
            rd.a(3, -82);
            ((gt) this).n(-7);
            return;
          } else {
            cn.a("tochangedisplayname.ws", ra.c(param1 + -708), (byte) -103);
            return;
          }
        } else {
          field_db = null;
          if (((gt) this).field_eb) {
            rd.a(3, -82);
            ((gt) this).n(-7);
            return;
          } else {
            cn.a("tochangedisplayname.ws", ra.c(param1 + -708), (byte) -103);
            return;
          }
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        Object var6 = null;
        if (13 == param3) {
          ((gt) this).n(-7);
          return true;
        } else {
          if (param2 < 9) {
            var6 = null;
            int discarded$2 = gt.a((byte) 20, (String) null, false);
            return super.a(param0, param1, (byte) 51, param3);
          } else {
            return super.a(param0, param1, (byte) 51, param3);
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            if (qk.field_O != null) {
                // if_icmpgt L31
                // if_acmpne L23
            } else {
                as.field_v.field_p = 0;
                return;
            }
            if (-1 == (as.field_v.field_p ^ -1)) {
                if ((rj.field_a - -10000L ^ -1L) > (wq.a(param0 + -14) ^ -1L)) {
                    as.field_v.g(param1, 8);
                }
            }
            if (as.field_v.field_p > param0) {
                try {
                    qk.field_O.a(0, -2, as.field_v.field_n, as.field_v.field_p);
                    rj.field_a = wq.a(-21);
                } catch (IOException iOException) {
                    kk.a((byte) -115);
                }
                as.field_v.field_p = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void m(int param0) {
        ib.d(1);
        if (qn.field_f == null) {
          rq.a(false);
          jm.b(28679);
          if (param0 != 0) {
            L0: {
              field_gb = null;
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L0;
              } else {
                break L0;
              }
            }
            kk.a((byte) -127);
            return;
          } else {
            L1: {
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L1;
              } else {
                break L1;
              }
            }
            kk.a((byte) -127);
            return;
          }
        } else {
          wr.a(true, qn.field_f);
          rq.a(false);
          jm.b(28679);
          if (param0 == 0) {
            L2: {
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L2;
              } else {
                break L2;
              }
            }
            kk.a((byte) -127);
            return;
          } else {
            L3: {
              field_gb = null;
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L3;
              } else {
                break L3;
              }
            }
            kk.a((byte) -127);
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        lc var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        lc stackIn_12_0 = null;
        lc stackIn_13_0 = null;
        lc stackIn_14_0 = null;
        String stackIn_14_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        lc stackOut_11_0 = null;
        lc stackOut_13_0 = null;
        String stackOut_13_1 = null;
        lc stackOut_12_0 = null;
        String stackOut_12_1 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (((gt) this).field_kb) {
          return;
        } else {
          L0: {
            ((gt) this).field_kb = true;
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param1 != 256) {
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
          ((gt) this).field_eb = stackIn_6_1 != 0;
          if (param2 == 21089) {
            ((gt) this).field_ib.b(8405024, 4210752, param2 ^ 20995);
            var6 = new lc((gt) this, ((gt) this).field_jb, param0);
            if (5 == param1) {
              var6.a(vf.field_e, 11, true);
              var6.a(of.field_k, 17, true);
              if ((param1 ^ -1) == -4) {
                var6.a(lq.field_c, 7, true);
                ((gt) this).b((byte) -97, (pk) (Object) var6);
                return;
              } else {
                if (param1 != -5) {
                  if (-7 != param1) {
                    if ((param1 ^ -1) == -10) {
                      wp discarded$3 = var6.a(pl.field_s, (byte) -123, (qm) this);
                      ((gt) this).b((byte) -97, (pk) (Object) var6);
                      return;
                    } else {
                      ((gt) this).b((byte) -97, (pk) (Object) var6);
                      return;
                    }
                  } else {
                    var6.a(eq.field_w, 9, true);
                    ((gt) this).b((byte) -97, (pk) (Object) var6);
                    return;
                  }
                } else {
                  var6.a(ch.field_e, 8, true);
                  ((gt) this).b((byte) -97, (pk) (Object) var6);
                  return;
                }
              }
            } else {
              L1: {
                if (param1 != 256) {
                  L2: {
                    stackOut_11_0 = (lc) var6;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (((gt) this).field_cb) {
                      stackOut_13_0 = (lc) (Object) stackIn_13_0;
                      stackOut_13_1 = ii.field_b;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L2;
                    } else {
                      stackOut_12_0 = (lc) (Object) stackIn_12_0;
                      stackOut_12_1 = cq.field_c;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L2;
                    }
                  }
                  ((lc) (Object) stackIn_14_0).a(stackIn_14_1, -1, true);
                  break L1;
                } else {
                  wp discarded$4 = var6.a(ii.field_b, (byte) -123, (qm) this);
                  break L1;
                }
              }
              if ((param1 ^ -1) == -4) {
                var6.a(lq.field_c, 7, true);
                ((gt) this).b((byte) -97, (pk) (Object) var6);
                return;
              } else {
                if (param1 != -5) {
                  if (-7 != param1) {
                    if ((param1 ^ -1) == -10) {
                      wp discarded$5 = var6.a(pl.field_s, (byte) -123, (qm) this);
                      ((gt) this).b((byte) -97, (pk) (Object) var6);
                      return;
                    } else {
                      ((gt) this).b((byte) -97, (pk) (Object) var6);
                      return;
                    }
                  } else {
                    var6.a(eq.field_w, 9, true);
                    ((gt) this).b((byte) -97, (pk) (Object) var6);
                    return;
                  }
                } else {
                  var6.a(ch.field_e, 8, true);
                  ((gt) this).b((byte) -97, (pk) (Object) var6);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    gt(dg param0, vn param1, String param2, boolean param3, boolean param4) {
        super(param0, (pk) (Object) new lc((gt) null, param1, param2), 77, 10, 10);
        ((gt) this).field_fb = param4 ? true : false;
        ((gt) this).field_eb = false;
        ((gt) this).field_jb = param1;
        ((gt) this).field_cb = param3 ? true : false;
        ((gt) this).field_kb = false;
        ((gt) this).field_ib = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
        ((gt) this).field_ib.field_J = true;
        ((gt) this).a((pk) (Object) ((gt) this).field_ib, 78);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = 0;
        field_hb = "Loading music";
    }
}
