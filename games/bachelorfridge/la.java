/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends bca {
    static vr field_s;
    static int field_r;
    int field_t;
    int field_q;

    final static void a(int param0, pia param1) {
        int var2 = 0;
        int var3 = 0;
        lo.field_b = param1;
        if (param0 == 3) {
          var2 = 1000;
          var3 = 6 + (lo.field_b.field_B + lo.field_b.field_F);
          if (1 == (var3 & 1)) {
            var3++;
            sca.field_a = new kv(var2, var3);
            ap.field_c = new kv(var2, var3);
            return;
          } else {
            sca.field_a = new kv(var2, var3);
            ap.field_c = new kv(var2, var3);
            return;
          }
        } else {
          la.d(-39);
          var2 = 1000;
          var3 = 6 + (lo.field_b.field_B + lo.field_b.field_F);
          if (1 != (var3 & 1)) {
            sca.field_a = new kv(var2, var3);
            ap.field_c = new kv(var2, var3);
            return;
          } else {
            var3++;
            sca.field_a = new kv(var2, var3);
            ap.field_c = new kv(var2, var3);
            return;
          }
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != 2) {
            Object var2 = null;
            la.a(109, (pia) null);
        }
    }

    la(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        aga discarded$12 = ((la) this).field_l.a(78, param0);
        ((la) this).field_p = !param0.e(((la) this).field_q, ((la) this).field_t, -11066) ? true : false;
        int var3 = -82 % ((param1 - 12) / 35);
        if (!(((la) this).field_p)) {
            param0.b((byte) 103, 35, ((la) this).field_q, ((la) this).field_t);
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (-1 <= (dm.field_f ^ -1)) {
          if (bp.e(param1 ^ -29917)) {
            L0: {
              var2 = 0;
              if (qt.field_l != null) {
                break L0;
              } else {
                if (ai.field_e) {
                  tfa.a(var2, param1 ^ 3, param0);
                  break L0;
                } else {
                  if (param1 == 2) {
                    return;
                  } else {
                    field_r = -88;
                    return;
                  }
                }
              }
            }
            if (param1 == 2) {
              return;
            } else {
              field_r = -88;
              return;
            }
          } else {
            L1: {
              var2 = 1;
              if (qt.field_l != null) {
                break L1;
              } else {
                if (ai.field_e) {
                  tfa.a(var2, param1 ^ 3, param0);
                  break L1;
                } else {
                  if (param1 == 2) {
                    return;
                  } else {
                    field_r = -88;
                    return;
                  }
                }
              }
            }
            if (param1 == 2) {
              return;
            } else {
              field_r = -88;
              return;
            }
          }
        } else {
          if (null != qt.field_l) {
            kga.field_c = qt.field_l.c((byte) -91);
            fga.a(2, (byte) -2);
            if (kga.field_c != null) {
              nl.a((java.awt.Canvas) (Object) kga.field_c, (byte) 92);
              var2 = 2;
              if (qt.field_l == null) {
                L2: {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              } else {
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              }
            } else {
              var2 = 3;
              if (qt.field_l == null) {
                L3: {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              } else {
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              }
            }
          } else {
            kga.field_c = mfa.a(true, 640, 0, 480, ju.field_r, 0);
            if (kga.field_c != null) {
              L4: {
                nl.a((java.awt.Canvas) (Object) kga.field_c, (byte) 92);
                var2 = 2;
                if (qt.field_l != null) {
                  break L4;
                } else {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L4;
                  } else {
                    if (param1 != 2) {
                      field_r = -88;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param1 != 2) {
                field_r = -88;
                return;
              } else {
                return;
              }
            } else {
              L5: {
                var2 = 3;
                if (qt.field_l != null) {
                  break L5;
                } else {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L5;
                  } else {
                    if (param1 != 2) {
                      field_r = -88;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param1 != 2) {
                field_r = -88;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, lu param1) {
        lu stackIn_2_0 = null;
        lu stackIn_3_0 = null;
        lu stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        lu stackIn_6_0 = null;
        lu stackIn_7_0 = null;
        lu stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        lu stackOut_5_0 = null;
        lu stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        lu stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        lu stackOut_1_0 = null;
        lu stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        lu stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        this.a((byte) -48, param1);
        param1.d(((la) this).field_q, 0);
        if (param0 >= -12) {
          L0: {
            ((la) this).field_t = -45;
            param1.d(((la) this).field_t, 0);
            stackOut_5_0 = (lu) param1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!((la) this).field_p) {
              stackOut_7_0 = (lu) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (lu) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((lu) (Object) stackIn_8_0).d(stackIn_8_1, 0);
          return;
        } else {
          L1: {
            param1.d(((la) this).field_t, 0);
            stackOut_1_0 = (lu) param1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!((la) this).field_p) {
              stackOut_3_0 = (lu) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (lu) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((lu) (Object) stackIn_4_0).d(stackIn_4_1, 0);
          return;
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
          field_s = null;
          return (at) (Object) new dca(param1, (la) this, ((la) this).field_p);
        } else {
          return (at) (Object) new dca(param1, (la) this, ((la) this).field_p);
        }
    }

    la(lu param0) {
        super(param0);
        ((la) this).field_k = param0.e((byte) 100);
        ((la) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((la) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((la) this).field_q = param0.b(16711935);
        ((la) this).field_t = param0.b(16711935);
        ((la) this).field_p = 1 == param0.b(16711935) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
    }
}
