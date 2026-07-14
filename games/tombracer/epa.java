/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class epa extends wv {
    static int[] field_r;
    static String field_q;

    final int e(int param0, int param1) {
        if (param1 < 121) {
            return -92;
        }
        if (!(5 <= param0)) {
            return 100;
        }
        return cq.field_d.field_k + cq.field_d.field_w;
    }

    epa(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void d(int param0) {
        if (param0 != 2) {
            epa.d(10);
            field_q = null;
            field_r = null;
            return;
        }
        field_q = null;
        field_r = null;
    }

    final int g(int param0, int param1) {
        if (!((param0 ^ -1) <= -4)) {
            return -cq.field_d.field_w + ((epa) this).field_n;
        }
        if (param1 != 30) {
            field_r = null;
            if (!(param0 >= 5)) {
                return ((epa) this).field_n - -((epa) this).e(0, 125) - cq.field_d.field_w;
            }
            return ((param0 ^ -1) < -5 ? 30 : -1 + ((epa) this).field_m.length == param0 ? 60 : 30) + -cq.field_d.field_w + (((epa) this).field_n + (-2 + param0) * ((epa) this).field_i);
        }
        if (!(param0 >= 5)) {
            return ((epa) this).field_n - -((epa) this).e(0, 125) - cq.field_d.field_w;
        }
        return ((param0 ^ -1) < -5 ? 30 : -1 + ((epa) this).field_m.length == param0 ? 60 : 30) + -cq.field_d.field_w + (((epa) this).field_n + (-2 + param0) * ((epa) this).field_i);
    }

    final static void a(int param0, byte param1, String param2) {
        int var3 = 0;
        if (param1 == -84) {
          L0: {
            gj.field_r = false;
            nfa.field_p = false;
            if (ci.field_l == null) {
              break L0;
            } else {
              if (!ci.field_l.field_B) {
                break L0;
              } else {
                L1: {
                  var3 = 1;
                  if ((param0 ^ -1) != -9) {
                    break L1;
                  } else {
                    L2: {
                      if (jf.field_r) {
                        param2 = nda.field_d;
                        break L2;
                      } else {
                        param2 = ria.field_n;
                        break L2;
                      }
                    }
                    param0 = 2;
                    vn.field_b.a(jo.field_E, 123);
                    break L1;
                  }
                }
                L3: {
                  if (param0 == 10) {
                    ka.a((byte) -33);
                    var3 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var3 != 0) {
                    L5: {
                      if (gj.field_r) {
                        param2 = gl.a((byte) 94, nka.field_a, new String[1]);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (bga.field_d) {
                        param2 = mj.field_K;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ci.field_l.a(param0, (byte) 94, param2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((param0 ^ -1) == -257) {
                  break L0;
                } else {
                  if (10 != param0) {
                    if (jf.field_r) {
                      break L0;
                    } else {
                      vn.field_b.a((byte) -92);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          field_q = null;
          gj.field_r = false;
          nfa.field_p = false;
          if (ci.field_l != null) {
            if (ci.field_l.field_B) {
              L7: {
                var3 = 1;
                if ((param0 ^ -1) != -9) {
                  break L7;
                } else {
                  L8: {
                    if (jf.field_r) {
                      param2 = nda.field_d;
                      break L8;
                    } else {
                      param2 = ria.field_n;
                      break L8;
                    }
                  }
                  param0 = 2;
                  vn.field_b.a(jo.field_E, 123);
                  break L7;
                }
              }
              L9: {
                if (param0 == 10) {
                  ka.a((byte) -33);
                  var3 = 0;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var3 != 0) {
                  L11: {
                    if (gj.field_r) {
                      param2 = gl.a((byte) 94, nka.field_a, new String[1]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (bga.field_d) {
                      param2 = mj.field_K;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ci.field_l.a(param0, (byte) 94, param2);
                  break L10;
                } else {
                  break L10;
                }
              }
              L13: {
                if ((param0 ^ -1) == -257) {
                  break L13;
                } else {
                  if (10 != param0) {
                    if (jf.field_r) {
                      break L13;
                    } else {
                      vn.field_b.a((byte) -92);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static en d(byte param0) {
        if (param0 != -91) {
            epa.d(15);
            return kva.field_n;
        }
        return kva.field_n;
    }

    final int a(int param0, byte param1) {
        if (param1 == -48) {
          if (-1 == (param0 ^ -1)) {
            return -110 + ((epa) this).field_f;
          } else {
            if (param0 != 1) {
              if (2 == param0) {
                return ((epa) this).field_f - -60;
              } else {
                if (3 == param0) {
                  return -80 + ((epa) this).field_f;
                } else {
                  if (4 != param0) {
                    if (param0 != 6) {
                      if (7 == param0) {
                        return ((epa) this).field_f - 10;
                      } else {
                        return ((epa) this).field_f;
                      }
                    } else {
                      return ((epa) this).field_f - 10;
                    }
                  } else {
                    return ((epa) this).field_f - -30;
                  }
                }
              }
            } else {
              return ((epa) this).field_f + -25;
            }
          }
        } else {
          field_r = null;
          if (-1 == (param0 ^ -1)) {
            return -110 + ((epa) this).field_f;
          } else {
            if (param0 != 1) {
              if (2 == param0) {
                return ((epa) this).field_f - -60;
              } else {
                if (3 == param0) {
                  return -80 + ((epa) this).field_f;
                } else {
                  if (4 != param0) {
                    if (param0 != 6) {
                      if (7 == param0) {
                        return ((epa) this).field_f - 10;
                      } else {
                        return ((epa) this).field_f;
                      }
                    } else {
                      return ((epa) this).field_f - 10;
                    }
                  } else {
                    return ((epa) this).field_f - -30;
                  }
                }
              }
            } else {
              return ((epa) this).field_f + -25;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        if (-1 == (param1 ^ -1)) {
          return ((epa) this).field_g + -80;
        } else {
          if ((param1 ^ -1) != -2) {
            if (param0 >= 111) {
              if ((param1 ^ -1) != -3) {
                if (param1 != 3) {
                  if (4 == param1) {
                    return ((epa) this).field_g - -60;
                  } else {
                    if (param1 != 6) {
                      if (-8 == (param1 ^ -1)) {
                        return ((epa) this).field_g + -10;
                      } else {
                        return ((epa) this).field_g;
                      }
                    } else {
                      return ((epa) this).field_g + -10;
                    }
                  }
                } else {
                  return -50 + ((epa) this).field_g;
                }
              } else {
                return 90 + ((epa) this).field_g;
              }
            } else {
              return -91;
            }
          } else {
            return 5 + ((epa) this).field_g;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Change display name";
        field_r = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
