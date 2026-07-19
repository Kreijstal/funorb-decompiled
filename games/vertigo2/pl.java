/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends jq {
    static String field_p;
    static er field_h;
    private int field_m;
    static int field_q;
    static boolean field_i;
    static int field_n;
    private int field_l;
    private int field_o;
    static String field_j;
    private int field_k;

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
            return;
        }
        field_h = null;
        field_p = null;
    }

    final void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param1 < 26) {
          return;
        } else {
          var4 = param0 * this.field_k >> -1335335092;
          var5 = param0 * this.field_l >> -1460049908;
          var6 = param2 * this.field_m >> -1681249076;
          var7 = param2 * this.field_o >> -399806132;
          eh.a(var4, var7, var6, this.field_a, 16711680, this.field_f, this.field_g, var5);
          return;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        al.field_t = 0;
        pq.field_f = null;
        fn.field_y = null;
        var2 = rf.field_l;
        if (param0 == 11) {
          rf.field_l = md.field_D;
          kb.field_e.field_m = kb.field_e.field_m + 1;
          md.field_D = var2;
          if (-52 == (param1 ^ -1)) {
            L0: {
              kb.field_e.field_j = 2;
              if (-3 < (kb.field_e.field_m ^ -1)) {
                break L0;
              } else {
                if (param1 != 51) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            L1: {
              if ((kb.field_e.field_m ^ -1) > -3) {
                break L1;
              } else {
                if (50 != param1) {
                  break L1;
                } else {
                  return 5;
                }
              }
            }
            if ((kb.field_e.field_m ^ -1) <= -5) {
              return 1;
            } else {
              return -1;
            }
          } else {
            if (-51 == (param1 ^ -1)) {
              L2: {
                kb.field_e.field_j = 5;
                if (-3 < (kb.field_e.field_m ^ -1)) {
                  break L2;
                } else {
                  if (param1 != 51) {
                    break L2;
                  } else {
                    return 2;
                  }
                }
              }
              L3: {
                if ((kb.field_e.field_m ^ -1) > -3) {
                  break L3;
                } else {
                  if (50 != param1) {
                    break L3;
                  } else {
                    return 5;
                  }
                }
              }
              if ((kb.field_e.field_m ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            } else {
              L4: {
                kb.field_e.field_j = 1;
                if (-3 < (kb.field_e.field_m ^ -1)) {
                  break L4;
                } else {
                  if (param1 != 51) {
                    break L4;
                  } else {
                    return 2;
                  }
                }
              }
              L5: {
                if ((kb.field_e.field_m ^ -1) > -3) {
                  break L5;
                } else {
                  if (50 != param1) {
                    break L5;
                  } else {
                    return 5;
                  }
                }
              }
              if ((kb.field_e.field_m ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        } else {
          field_j = (String) null;
          rf.field_l = md.field_D;
          kb.field_e.field_m = kb.field_e.field_m + 1;
          md.field_D = var2;
          if (-52 == (param1 ^ -1)) {
            kb.field_e.field_j = 2;
            if (-3 >= (kb.field_e.field_m ^ -1)) {
              if (param1 != 51) {
                L6: {
                  if ((kb.field_e.field_m ^ -1) > -3) {
                    break L6;
                  } else {
                    if (50 != param1) {
                      break L6;
                    } else {
                      return 5;
                    }
                  }
                }
                if ((kb.field_e.field_m ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 2;
              }
            } else {
              L7: {
                if ((kb.field_e.field_m ^ -1) > -3) {
                  break L7;
                } else {
                  if (50 != param1) {
                    break L7;
                  } else {
                    return 5;
                  }
                }
              }
              if ((kb.field_e.field_m ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            }
          } else {
            if (-51 == (param1 ^ -1)) {
              kb.field_e.field_j = 5;
              if (-3 >= (kb.field_e.field_m ^ -1)) {
                if (param1 != 51) {
                  L8: {
                    if ((kb.field_e.field_m ^ -1) > -3) {
                      break L8;
                    } else {
                      if (50 != param1) {
                        break L8;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if ((kb.field_e.field_m ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              } else {
                L9: {
                  if ((kb.field_e.field_m ^ -1) > -3) {
                    break L9;
                  } else {
                    if (50 != param1) {
                      break L9;
                    } else {
                      return 5;
                    }
                  }
                }
                if ((kb.field_e.field_m ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              kb.field_e.field_j = 1;
              if (-3 >= (kb.field_e.field_m ^ -1)) {
                if (param1 != 51) {
                  L10: {
                    if ((kb.field_e.field_m ^ -1) > -3) {
                      break L10;
                    } else {
                      if (50 != param1) {
                        break L10;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if ((kb.field_e.field_m ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              } else {
                if ((kb.field_e.field_m ^ -1) <= -3) {
                  if (50 != param1) {
                    if ((kb.field_e.field_m ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if ((kb.field_e.field_m ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param2 * this.field_k >> 932938668;
        var5 = param2 * this.field_l >> 1816589100;
        if (param1 >= -31) {
          return;
        } else {
          var6 = param0 * this.field_m >> -610924788;
          var7 = this.field_o * param0 >> 131271180;
          bm.a(var7, var6, this.field_g, (byte) 116, var5, var4);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param2 != 45) {
            discarded$0 = pl.a((byte) -97, -32);
        }
    }

    pl(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_m = param1;
        this.field_o = param3;
        this.field_l = param2;
        this.field_k = param0;
    }

    static {
        field_j = "Orb points: ";
        field_p = "More suggestions";
        field_h = new er(270, 70);
    }
}
