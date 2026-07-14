/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private nc field_b;
    private gg field_a;

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param1 == 66) {
          if (0 >= ob.field_l) {
            if (!il.b(507)) {
              var2 = 1;
              if (null == fc.field_l) {
                if (!sf.field_j) {
                  return;
                } else {
                  hc.a(param0, true, var2);
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 0;
              if (null == fc.field_l) {
                if (!sf.field_j) {
                  return;
                } else {
                  hc.a(param0, true, var2);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (null == fc.field_l) {
              dj.field_k = g.a(480, 0, wh.field_c, 640, (byte) -81, 0);
              if (null != dj.field_k) {
                var2 = 2;
                th.a((byte) -50, (java.awt.Canvas) (Object) dj.field_k);
                if (null != fc.field_l) {
                  return;
                } else {
                  L0: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (null != fc.field_l) {
                  return;
                } else {
                  L1: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                }
              }
            } else {
              dj.field_k = fc.field_l.b(false);
              jh.a(2, param1 + 1);
              if (null != dj.field_k) {
                var2 = 2;
                th.a((byte) -50, (java.awt.Canvas) (Object) dj.field_k);
                if (null != fc.field_l) {
                  return;
                } else {
                  L2: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (null != fc.field_l) {
                  return;
                } else {
                  L3: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final gg a(gg param0, int param1) {
        gg var3 = null;
        if (param1 <= 108) {
            ck.a(false, (byte) -115);
            if (param0 == null) {
                var3 = ((ck) this).field_b.field_e.field_a;
            } else {
                var3 = param0;
            }
            if (!(((ck) this).field_b.field_e != var3)) {
                ((ck) this).field_a = null;
                return null;
            }
            ((ck) this).field_a = var3.field_a;
            return var3;
        }
        if (param0 == null) {
            var3 = ((ck) this).field_b.field_e.field_a;
        } else {
            var3 = param0;
        }
        if (!(((ck) this).field_b.field_e != var3)) {
            ((ck) this).field_a = null;
            return null;
        }
        ((ck) this).field_a = var3.field_a;
        return var3;
    }

    final gg a(byte param0) {
        int var2 = 0;
        gg var3 = null;
        var2 = -121 % ((param0 - 30) / 44);
        var3 = ((ck) this).field_b.field_e.field_d;
        if (var3 == ((ck) this).field_b.field_e) {
          ((ck) this).field_a = null;
          return null;
        } else {
          ((ck) this).field_a = var3.field_d;
          return var3;
        }
    }

    final gg b(int param0) {
        gg var2 = null;
        var2 = ((ck) this).field_a;
        if (var2 != ((ck) this).field_b.field_e) {
          ((ck) this).field_a = var2.field_a;
          if (param0 != 640) {
            gg discarded$2 = ((ck) this).c(19);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ck) this).field_a = null;
          return null;
        }
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((ck) this).field_b.field_e.field_d;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (var3 == ((ck) this).field_b.field_e) {
          ((ck) this).field_a = null;
          return null;
        } else {
          ((ck) this).field_a = var3.field_d;
          if (param0 != 26229) {
            ((ck) this).field_a = null;
            return var3;
          } else {
            return var3;
          }
        }
    }

    final gg a(int param0) {
        gg var2 = null;
        if (param0 != -25119) {
            ((ck) this).field_b = null;
            var2 = ((ck) this).field_b.field_e.field_a;
            if (!(((ck) this).field_b.field_e != var2)) {
                ((ck) this).field_a = null;
                return null;
            }
            ((ck) this).field_a = var2.field_a;
            return var2;
        }
        var2 = ((ck) this).field_b.field_e.field_a;
        if (!(((ck) this).field_b.field_e != var2)) {
            ((ck) this).field_a = null;
            return null;
        }
        ((ck) this).field_a = var2.field_a;
        return var2;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param1) {
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$6 = ck.a('=', true);
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    ck(nc param0) {
        ((ck) this).field_b = param0;
    }

    final gg c(int param0) {
        gg var2 = null;
        var2 = ((ck) this).field_a;
        if (((ck) this).field_b.field_e == var2) {
          ((ck) this).field_a = null;
          return null;
        } else {
          if (param0 <= 111) {
            return null;
          } else {
            ((ck) this).field_a = var2.field_d;
            return var2;
          }
        }
    }

    static {
    }
}
