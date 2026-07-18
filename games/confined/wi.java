/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    private int field_t;
    static int field_c;
    private int field_j;
    static String field_q;
    static String field_b;
    private int field_k;
    private int field_g;
    private int field_s;
    private boolean field_n;
    private int field_u;
    private int field_a;
    private float field_d;
    private int field_f;
    private int field_m;
    private int field_r;
    private int field_l;
    private int field_i;
    private bb field_e;
    private int field_o;
    private int field_p;
    private int field_h;

    final void a(int param0, byte param1, int param2) {
        ((wi) this).field_u = param2;
        ((wi) this).field_h = param0;
        if (param1 <= 26) {
            ((wi) this).d((byte) 84);
        }
    }

    final static String c(int param0) {
        int var1 = -102 % ((-82 - param0) / 41);
        if (oe.field_Q == wh.field_fb) {
            return kc.field_n;
        }
        return hm.field_gb;
    }

    final static void a(int param0, int param1) {
        rk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -39) {
                break L1;
              } else {
                wi.a(41, 111);
                break L1;
              }
            }
            var4 = (sf) (Object) sm.field_y.a(-128);
            L2: while (true) {
              if (var4 == null) {
                var2 = ra.field_d.a(107);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    fm.a(-87, param0);
                    var2 = ra.field_d.d(2123);
                    continue L3;
                  }
                }
              } else {
                nh.a(var4, 0, param0);
                var4 = (sf) (Object) sm.field_y.d(2123);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2_ref, "wi.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b() {
        field_b = null;
        field_q = null;
    }

    final void d(byte param0) {
        if (dn.field_d != null) {
          return;
        } else {
          L0: {
            if (sg.field_x > 0) {
              break L0;
            } else {
              ((wi) this).field_n = false;
              break L0;
            }
          }
          if (!((wi) this).field_n) {
            L1: {
              if (((wi) this).field_h <= wm.field_ab) {
                if (((wi) this).field_h <= 0) {
                  break L1;
                } else {
                  ei.field_kb = 0;
                  break L1;
                }
              } else {
                ei.field_kb = (-wm.field_ab + ((wi) this).field_h) / 2;
                break L1;
              }
            }
            L2: {
              if (wm.field_ab != ((wi) this).field_t) {
                ((wi) this).field_e.a(((wi) this).field_t, ((wi) this).field_r, 1099);
                break L2;
              } else {
                if (im.field_b == ((wi) this).field_r) {
                  return;
                } else {
                  ((wi) this).field_e.a(((wi) this).field_t, ((wi) this).field_r, 1099);
                  break L2;
                }
              }
            }
            return;
          } else {
            int fieldTemp$2 = ((wi) this).field_l - 1;
            ((wi) this).field_l = ((wi) this).field_l - 1;
            if (fieldTemp$2 > 0) {
              return;
            } else {
              ((wi) this).field_l = ((wi) this).field_i;
              if (pi.field_H < ((wi) this).field_m) {
                ((wi) this).field_n = false;
                return;
              } else {
                L3: {
                  int discarded$3 = -128;
                  this.c();
                  if (param0 == -44) {
                    break L3;
                  } else {
                    ((wi) this).field_p = 19;
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -112) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((wi) this).field_m > pi.field_H) {
              break L2;
            } else {
              if (0 >= sg.field_x) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a() {
        dg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        dg var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (dg) (Object) af.field_cb.a(-115);
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_r) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L2: {
                    if (var4.field_m[var2] != null) {
                      if (var4.field_m[var2].field_g != 0) {
                        break L2;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_q[var2] != null) {
                      if (var4.field_q[var2].field_g != 0) {
                        break L3;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "wi.F(" + false + ')');
        }
        return stackIn_20_0 != 0;
    }

    final gj a(int param0) {
        ((wi) this).field_o = wm.field_ab;
        ((wi) this).field_p = im.field_b;
        ((wi) this).field_e.a(((wi) this).field_a, ((wi) this).field_k, param0 ^ 21837);
        ac.field_a = false;
        if (param0 != 20742) {
            ((wi) this).field_a = 67;
        }
        gj var2 = id.a(2401, ki.field_d, ((wi) this).field_a, 0, 0, ((wi) this).field_k);
        if (!(var2 != null)) {
            ((wi) this).a((byte) -105);
        }
        return var2;
    }

    final void a(byte param0) {
        ((wi) this).field_e.a(((wi) this).field_o, ((wi) this).field_p, 1099);
        if (param0 > -82) {
            field_c = 71;
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        var2 = ((wi) this).field_h;
        var3 = ((wi) this).field_u;
        if (((wi) this).b(-116)) {
          L0: {
            if (((wi) this).field_g >= var2) {
              if (var2 >= ((wi) this).field_s) {
                break L0;
              } else {
                var2 = ((wi) this).field_s;
                break L0;
              }
            } else {
              var2 = ((wi) this).field_g;
              break L0;
            }
          }
          L1: {
            if (((wi) this).field_f < var3) {
              var3 = ((wi) this).field_f;
              break L1;
            } else {
              if (((wi) this).field_j <= var3) {
                break L1;
              } else {
                var3 = ((wi) this).field_j;
                break L1;
              }
            }
          }
          L2: {
            if (((wi) this).field_d <= 0.0f) {
              break L2;
            } else {
              var4 = (int)((float)var3 * ((wi) this).field_d + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((wi) this).field_d);
                break L2;
              } else {
                if (var4 >= var2) {
                  break L2;
                } else {
                  var2 = var4;
                  break L2;
                }
              }
            }
          }
          L3: {
            if (var2 != wm.field_ab) {
              ((wi) this).field_e.a(var2, var3, 1099);
              break L3;
            } else {
              if (im.field_b == var3) {
                break L3;
              } else {
                ((wi) this).field_e.a(var2, var3, 1099);
                break L3;
              }
            }
          }
          L4: {
            if (((wi) this).field_h <= 0) {
              break L4;
            } else {
              ei.field_kb = (-wm.field_ab + ((wi) this).field_h) / 2;
              break L4;
            }
          }
          return;
        } else {
          ((wi) this).field_n = false;
          return;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = "Lightning cannon";
    }
}
