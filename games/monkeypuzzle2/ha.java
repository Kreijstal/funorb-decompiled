/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class ha extends pc implements ql {
    static li field_Z;
    static ad field_fb;
    private boolean field_eb;
    static long field_ab;
    private jh field_gb;
    private boolean field_cb;
    private boolean field_hb;
    private boolean field_bb;
    static boolean field_db;
    private ta field_ib;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (param2 == 13) {
          ((ha) this).g((byte) -75);
          return true;
        } else {
          var5 = -44 / ((param3 - 37) / 50);
          return super.a(param0, param1, param2, 120);
        }
    }

    public void a(int param0, int param1, int param2, int param3, t param4) {
        Object var7 = null;
        if (param3 == 7) {
          if (!((ha) this).field_bb) {
            k.a(ii.a(false), (byte) -31, "tochangedisplayname.ws");
            return;
          } else {
            qh.a(3, true);
            ((ha) this).g((byte) -75);
            return;
          }
        } else {
          var7 = null;
          ((ha) this).a(59, (String) null, -95);
          if (!((ha) this).field_bb) {
            k.a(ii.a(false), (byte) -31, "tochangedisplayname.ws");
            return;
          } else {
            qh.a(3, true);
            ((ha) this).g((byte) -75);
            return;
          }
        }
    }

    final static float a(byte param0, float param1) {
        if (param0 != 51) {
          float discarded$2 = ha.a((byte) 30, 0.09005918353796005f);
          return vh.field_H[(int)((double)(32768.0f * param1) / 3.141592653589793) & 65535];
        } else {
          return vh.field_H[(int)((double)(32768.0f * param1) / 3.141592653589793) & 65535];
        }
    }

    final static String a(byte param0, long param1) {
        ec.field_b.setTime(new Date(param1));
        int var3 = ec.field_b.get(7);
        int var4 = ec.field_b.get(5);
        int var5 = ec.field_b.get(2);
        int var6 = ec.field_b.get(1);
        int var7 = -5 % ((param0 - -46) / 62);
        int var8 = ec.field_b.get(11);
        int var9 = ec.field_b.get(12);
        int var10 = ec.field_b.get(13);
        return jk.field_y[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + uc.field_f[var5] + "-" + var6 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    final static void a(int param0, int param1, int param2, int param3, le[] param4, le[] param5, int param6, int param7, int param8, int param9, ta param10) {
        cf.a((byte) 66);
        int var11 = -74 / ((68 - param1) / 47);
    }

    public static void f(byte param0) {
        if (param0 > -39) {
            field_db = true;
            field_Z = null;
            field_fb = null;
            return;
        }
        field_Z = null;
        field_fb = null;
    }

    ha(kj param0, ta param1, String param2, boolean param3, boolean param4) {
        super(param0, (we) (Object) new sk((ha) null, param1, param2), 77, 10, 10);
        ((ha) this).field_hb = param3 ? true : false;
        ((ha) this).field_bb = false;
        ((ha) this).field_ib = param1;
        ((ha) this).field_cb = false;
        ((ha) this).field_eb = param4 ? true : false;
        ((ha) this).field_gb = new jh(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ha) this).field_gb.field_G = true;
        ((ha) this).b((byte) -104, (we) (Object) ((ha) this).field_gb);
    }

    final void g(byte param0) {
        if (!((ha) this).field_z) {
          return;
        } else {
          ((ha) this).field_z = false;
          if (((ha) this).field_hb) {
            vb.a((byte) 28);
            if (param0 == -75) {
              return;
            } else {
              field_fb = null;
              return;
            }
          } else {
            if (!((ha) this).field_eb) {
              if (param0 != -75) {
                field_fb = null;
                return;
              } else {
                return;
              }
            } else {
              nc.a(1);
              if (param0 == -75) {
                return;
              } else {
                field_fb = null;
                return;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        sk var4 = null;
        int var5 = 0;
        sk var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        sk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        sk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        sk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        String stackIn_11_3 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        sk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        sk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_10_3 = null;
        sk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        String stackOut_9_3 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((ha) this).field_cb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param2 != 256) {
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
          ((ha) this).field_bb = stackIn_6_1 != 0;
          ((ha) this).field_cb = true;
          ((ha) this).field_gb.a((byte) -115, 8405024, 4210752);
          var6 = new sk((ha) this, ((ha) this).field_ib, param1);
          var4 = var6;
          if (param2 == -6) {
            var6.a((byte) -116, 11, wc.field_g);
            var6.a((byte) 102, 17, vh.field_L);
            if (param2 != 3) {
              if (4 != param2) {
                if (param2 == -7) {
                  var6.a((byte) 108, 9, uf.field_k);
                  if (param0 == -10) {
                    ((ha) this).c((byte) 108, (we) (Object) var6);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (-10 == param2) {
                    t discarded$4 = var6.a(0, (of) this, qa.field_b);
                    if (param0 == -10) {
                      ((ha) this).c((byte) 108, (we) (Object) var6);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 != -10) {
                      return;
                    } else {
                      ((ha) this).c((byte) 108, (we) (Object) var6);
                      return;
                    }
                  }
                }
              } else {
                var6.a((byte) -51, 8, ub.field_d);
                if (param0 != -10) {
                  return;
                } else {
                  ((ha) this).c((byte) 108, (we) (Object) var6);
                  return;
                }
              }
            } else {
              var6.a((byte) -27, 7, fc.field_m);
              if (param0 != -10) {
                return;
              } else {
                ((ha) this).c((byte) 108, (we) (Object) var6);
                return;
              }
            }
          } else {
            if (-257 == param2) {
              t discarded$5 = var6.a(0, (of) this, qd.field_c);
              if (param2 != 3) {
                if (4 != param2) {
                  if (param2 == -7) {
                    var6.a((byte) 108, 9, uf.field_k);
                    if (param0 != -10) {
                      return;
                    } else {
                      ((ha) this).c((byte) 108, (we) (Object) var6);
                      return;
                    }
                  } else {
                    if (-10 == param2) {
                      t discarded$6 = var6.a(0, (of) this, qa.field_b);
                      if (param0 != -10) {
                        return;
                      } else {
                        ((ha) this).c((byte) 108, (we) (Object) var6);
                        return;
                      }
                    } else {
                      if (param0 != -10) {
                        return;
                      } else {
                        ((ha) this).c((byte) 108, (we) (Object) var6);
                        return;
                      }
                    }
                  }
                } else {
                  var6.a((byte) -51, 8, ub.field_d);
                  if (param0 != -10) {
                    return;
                  } else {
                    ((ha) this).c((byte) 108, (we) (Object) var6);
                    return;
                  }
                }
              } else {
                var6.a((byte) -27, 7, fc.field_m);
                if (param0 != -10) {
                  return;
                } else {
                  ((ha) this).c((byte) 108, (we) (Object) var6);
                  return;
                }
              }
            } else {
              L1: {
                stackOut_8_0 = (sk) var6;
                stackOut_8_1 = 92;
                stackOut_8_2 = -1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                if (((ha) this).field_hb) {
                  stackOut_10_0 = (sk) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = qd.field_c;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  break L1;
                } else {
                  stackOut_9_0 = (sk) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = nf.field_E;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  break L1;
                }
              }
              ((sk) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2, stackIn_11_3);
              if (param2 != 3) {
                if (4 != param2) {
                  if (param2 == -7) {
                    var6.a((byte) 108, 9, uf.field_k);
                    if (param0 == -10) {
                      ((ha) this).c((byte) 108, (we) (Object) var6);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (-10 != param2) {
                      if (param0 == -10) {
                        ((ha) this).c((byte) 108, (we) (Object) var6);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      t discarded$7 = var6.a(0, (of) this, qa.field_b);
                      if (param0 == -10) {
                        ((ha) this).c((byte) 108, (we) (Object) var6);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  var6.a((byte) -51, 8, ub.field_d);
                  if (param0 == -10) {
                    ((ha) this).c((byte) 108, (we) (Object) var6);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var6.a((byte) -27, 7, fc.field_m);
                if (param0 == -10) {
                  ((ha) this).c((byte) 108, (we) (Object) var6);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void q(int param0) {
        ((ha) this).field_gb.a((byte) -115, 2121792, 4210752);
        sk var2 = new sk((ha) this, ((ha) this).field_ib, sg.field_h);
        int var3 = 123 % ((11 - param0) / 43);
        var2.a((byte) -10, 15, a.field_d);
        ((ha) this).c((byte) 50, (we) (Object) var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = null;
        field_db = true;
    }
}
