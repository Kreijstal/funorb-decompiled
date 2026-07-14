/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static String[] field_b;
    static boolean field_c;
    int field_a;
    static String field_d;

    final static void a(byte param0) {
        if (!ll.field_a) {
          L0: {
            if (null == go.field_k) {
              go.field_k = va.a((byte) -103, 4);
              break L0;
            } else {
              break L0;
            }
          }
          if (go.field_k.field_i) {
            ti.field_z = go.field_k.field_m;
            go.field_k = null;
            if (ll.field_a) {
              ll.field_a = true;
              if (!ik.field_f) {
                L1: {
                  if (null == wn.field_g) {
                    wn.field_g = hi.a(6, -52);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!wn.field_g.field_m) {
                    break L2;
                  } else {
                    L3: {
                      j.a(param0 + -56, wn.field_g.field_l);
                      if (ad.field_a) {
                        tn.a(0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ik.field_f = true;
                    wn.field_g = null;
                    break L2;
                  }
                }
                if (param0 != 0) {
                  field_d = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != 0) {
                  field_d = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              ii.field_c = ii.field_c & (ti.field_z ^ -1);
              ll.field_a = true;
              if (!ik.field_f) {
                L4: {
                  if (null == wn.field_g) {
                    wn.field_g = hi.a(6, -52);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!wn.field_g.field_m) {
                    break L5;
                  } else {
                    L6: {
                      j.a(param0 + -56, wn.field_g.field_l);
                      if (ad.field_a) {
                        tn.a(0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ik.field_f = true;
                    wn.field_g = null;
                    break L5;
                  }
                }
                if (param0 != 0) {
                  field_d = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != 0) {
                  field_d = null;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (!ik.field_f) {
              L7: {
                if (null == wn.field_g) {
                  wn.field_g = hi.a(6, -52);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (!wn.field_g.field_m) {
                  break L8;
                } else {
                  L9: {
                    j.a(param0 + -56, wn.field_g.field_l);
                    if (ad.field_a) {
                      tn.a(0);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ik.field_f = true;
                  wn.field_g = null;
                  break L8;
                }
              }
              if (param0 != 0) {
                field_d = null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 0) {
                field_d = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (!ik.field_f) {
            L10: {
              if (null == wn.field_g) {
                wn.field_g = hi.a(6, -52);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (!wn.field_g.field_m) {
                break L11;
              } else {
                L12: {
                  j.a(param0 + -56, wn.field_g.field_l);
                  if (ad.field_a) {
                    tn.a(0);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                ik.field_f = true;
                wn.field_g = null;
                break L11;
              }
            }
            if (param0 != 0) {
              field_d = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 0) {
              field_d = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -1) {
          return true;
        } else {
          if (param0 != 16616) {
            L0: {
              kb.a(113);
              if (0 == (ka.field_g & 1 << param1)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if (0 == (ka.field_g & 1 << param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static boolean b(int param0) {
        int var1 = 94 % ((param0 - -21) / 54);
        return oi.field_f;
    }

    public static void a(int param0) {
        int var1 = 76 % ((param0 - 71) / 40);
        field_b = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static va a(String param0, byte param1) {
        Object var3 = null;
        if (param1 != -53) {
          var3 = null;
          va discarded$2 = kb.a((String) null, (byte) -81);
          return new va(param0);
        } else {
          return new va(param0);
        }
    }

    kb(int param0) {
        ((kb) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_d = "Major shield";
    }
}
