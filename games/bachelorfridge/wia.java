/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wia {
    static boolean field_e;
    static String field_c;
    boolean field_d;
    static sna field_f;
    int field_j;
    int field_n;
    boolean field_m;
    boolean field_i;
    boolean field_g;
    int field_k;
    aga field_l;
    static vr field_b;
    int field_a;
    int field_h;

    final boolean b(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -113) {
          L0: {
            var3 = null;
            boolean discarded$6 = ((wia) this).a(true, (op) null);
            if ((((wia) this).field_h ^ -1) >= -1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((wia) this).field_h ^ -1) >= -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(int param0) {
        if (param0 == -36) {
          if (6 != ((wia) this).field_n) {
            if (7 != ((wia) this).field_n) {
              if (8 != ((wia) this).field_n) {
                if (-10 != ((wia) this).field_n) {
                  if (-11 != ((wia) this).field_n) {
                    if ((((wia) this).field_n ^ -1) != -12) {
                      if (((wia) this).field_n != -13) {
                        if (((wia) this).field_n != 13) {
                          if (-24 != ((wia) this).field_n) {
                            if ((((wia) this).field_n ^ -1) != -25) {
                              if ((((wia) this).field_n ^ -1) != -26) {
                                if ((((wia) this).field_n ^ -1) != -27) {
                                  if ((((wia) this).field_n ^ -1) == -30) {
                                    return 12;
                                  } else {
                                    return -1;
                                  }
                                } else {
                                  return 27;
                                }
                              } else {
                                return 26;
                              }
                            } else {
                              return 25;
                            }
                          } else {
                            return 24;
                          }
                        } else {
                          return 7;
                        }
                      } else {
                        return 19;
                      }
                    } else {
                      return 6;
                    }
                  } else {
                    return 18;
                  }
                } else {
                  return 5;
                }
              } else {
                return 17;
              }
            } else {
              return 4;
            }
          } else {
            return 16;
          }
        } else {
          return -8;
        }
    }

    final boolean a(int param0, op param1, int param2) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param2 != ((wia) this).field_n) {
          return true;
        } else {
          if (this.a(param1, (byte) 77)) {
            return true;
          } else {
            if (((wia) this).field_m) {
              return true;
            } else {
              if (param0 != -27864) {
                field_f = null;
                if (((wia) this).field_l == null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                L0: {
                  if (((wia) this).field_l != null) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L0;
                  }
                }
                return stackIn_13_0 != 0;
              }
            }
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        L0: {
          if (lb.g((byte) -52)) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        fa.a(param0, param1 + 26412);
        if (param1 != 31) {
          L1: {
            wia.a(true, (byte) 28);
            if (ad.field_i) {
              dg.g(pf.field_n.field_a.field_kb, pf.field_n.field_a.field_rb, pf.field_n.field_a.field_sb, pf.field_n.field_a.field_p);
              pf.field_n.field_a.a(param0, 7802);
              break L1;
            } else {
              break L1;
            }
          }
          hl.a(0, param0);
          return;
        } else {
          L2: {
            if (ad.field_i) {
              dg.g(pf.field_n.field_a.field_kb, pf.field_n.field_a.field_rb, pf.field_n.field_a.field_sb, pf.field_n.field_a.field_p);
              pf.field_n.field_a.a(param0, 7802);
              break L2;
            } else {
              break L2;
            }
          }
          hl.a(0, param0);
          return;
        }
    }

    final int d(int param0) {
        int var2 = 0;
        L0: {
          var2 = ((wia) this).field_n * 77421;
          if (!((wia) this).field_i) {
            break L0;
          } else {
            var2 = var2 ^ 98381;
            break L0;
          }
        }
        L1: {
          if (null != ((wia) this).field_l) {
            var2 = var2 ^ 87 * (((wia) this).field_l.field_D * 71 - -((wia) this).field_l.field_u);
            var2 = var2 << 1446291025 | var2 >>> -2119864625;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 1446291025) {
          L2: {
            field_c = null;
            if (0 == (((wia) this).field_a ^ -1)) {
              break L2;
            } else {
              var2 = var2 ^ 857521 * ((wia) this).field_a;
              var2 = var2 >>> 183847065 | var2 << 1079132807;
              break L2;
            }
          }
          L3: {
            if (!((wia) this).field_m) {
              break L3;
            } else {
              var2 = var2 ^ 56748912;
              break L3;
            }
          }
          var2 = var2 ^ ((wia) this).field_j * 788454;
          return var2;
        } else {
          L4: {
            if (0 == (((wia) this).field_a ^ -1)) {
              break L4;
            } else {
              var2 = var2 ^ 857521 * ((wia) this).field_a;
              var2 = var2 >>> 183847065 | var2 << 1079132807;
              break L4;
            }
          }
          L5: {
            if (!((wia) this).field_m) {
              break L5;
            } else {
              var2 = var2 ^ 56748912;
              break L5;
            }
          }
          var2 = var2 ^ ((wia) this).field_j * 788454;
          return var2;
        }
    }

    private final boolean a(op param0, byte param1) {
        int var3 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        if (((wia) this).a(false, param0)) {
          return true;
        } else {
          if (((wia) this).field_n != 27) {
            if (-36 != (((wia) this).field_n ^ -1)) {
              if (((wia) this).field_n == 37) {
                return true;
              } else {
                if (((wia) this).field_n == 33) {
                  return true;
                } else {
                  var3 = 64 % ((param1 - -4) / 49);
                  if (od.field_w[((wia) this).field_n].field_b) {
                    if (((wia) this).field_m) {
                      if (38 != ((wia) this).field_n) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    L0: {
                      if (38 == ((wia) this).field_n) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L0;
                      }
                    }
                    return stackIn_17_0 != 0;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, rha param2, op param3, int param4) {
        Object var7 = null;
        param2.a((Object) (Object) ("tile: " + od.field_w[((wia) this).field_n].field_a), 4819);
        param2.a(104, 2);
        param2.a((Object) (Object) ("x: " + param1 + " y: " + param4), 4819);
        if (null == ((wia) this).field_l) {
          if (((wia) this).field_a == -1) {
            L0: {
              if (((wia) this).field_m) {
                param2.a((Object) (Object) "powerup present", 4819);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (this.a(param3, (byte) -125)) {
                param2.a((Object) (Object) ("counter: " + ((wia) this).field_j), 4819);
                break L1;
              } else {
                break L1;
              }
            }
            param2.a(-116, -2);
            if (param0 > -88) {
              var7 = null;
              boolean discarded$4 = this.a((op) null, (byte) -107);
              return;
            } else {
              return;
            }
          } else {
            L2: {
              param2.a((Object) (Object) ("object id: " + ((wia) this).field_a), 4819);
              if (((wia) this).field_m) {
                param2.a((Object) (Object) "powerup present", 4819);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.a(param3, (byte) -125)) {
                param2.a((Object) (Object) ("counter: " + ((wia) this).field_j), 4819);
                break L3;
              } else {
                break L3;
              }
            }
            param2.a(-116, -2);
            if (param0 > -88) {
              var7 = null;
              boolean discarded$5 = this.a((op) null, (byte) -107);
              return;
            } else {
              return;
            }
          }
        } else {
          param2.a((Object) (Object) ("occupied: " + ((wia) this).field_l.b(52)), 4819);
          if (((wia) this).field_a != -1) {
            L4: {
              param2.a((Object) (Object) ("object id: " + ((wia) this).field_a), 4819);
              if (((wia) this).field_m) {
                param2.a((Object) (Object) "powerup present", 4819);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (this.a(param3, (byte) -125)) {
                param2.a((Object) (Object) ("counter: " + ((wia) this).field_j), 4819);
                break L5;
              } else {
                break L5;
              }
            }
            param2.a(-116, -2);
            if (param0 <= -88) {
              return;
            } else {
              var7 = null;
              boolean discarded$6 = this.a((op) null, (byte) -107);
              return;
            }
          } else {
            L6: {
              if (((wia) this).field_m) {
                param2.a((Object) (Object) "powerup present", 4819);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.a(param3, (byte) -125)) {
                param2.a((Object) (Object) ("counter: " + ((wia) this).field_j), 4819);
                break L7;
              } else {
                break L7;
              }
            }
            param2.a(-116, -2);
            if (param0 > -88) {
              var7 = null;
              boolean discarded$7 = this.a((op) null, (byte) -107);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 788454) {
            wia.b(-90);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final boolean e(int param0) {
        if (param0 > -24) {
            return false;
        }
        return ju.c(23745, ((wia) this).field_n);
    }

    final boolean c(int param0) {
        Object var3 = null;
        int stackIn_16_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_14_0 = 0;
        if (param0 <= -81) {
          if (-7 != (((wia) this).field_n ^ -1)) {
            if ((((wia) this).field_n ^ -1) != -8) {
              if (8 != ((wia) this).field_n) {
                if (9 != ((wia) this).field_n) {
                  if (10 != ((wia) this).field_n) {
                    if (((wia) this).field_n != 11) {
                      if (12 != ((wia) this).field_n) {
                        if (13 == ((wia) this).field_n) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_34_0 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        return stackIn_36_0 != 0;
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
          } else {
            return true;
          }
        } else {
          var3 = null;
          boolean discarded$1 = ((wia) this).a(false, (op) null);
          if (-7 != (((wia) this).field_n ^ -1)) {
            if ((((wia) this).field_n ^ -1) != -8) {
              if (8 != ((wia) this).field_n) {
                if (9 != ((wia) this).field_n) {
                  if (10 != ((wia) this).field_n) {
                    if (((wia) this).field_n != 11) {
                      if (12 != ((wia) this).field_n) {
                        if (13 == ((wia) this).field_n) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        return stackIn_16_0 != 0;
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
          } else {
            return true;
          }
        }
    }

    final boolean a(byte param0) {
        Object var3 = null;
        if (param0 == -63) {
          if (((wia) this).field_n == 0) {
            if (((wia) this).field_i) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          boolean discarded$3 = this.a((op) null, (byte) -3);
          if (((wia) this).field_n == 0) {
            if (((wia) this).field_i) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(boolean param0, op param1) {
        if (!param0) {
          if (param1.field_E == 2) {
            if (!((wia) this).a((byte) -63)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((wia) this).field_a = -64;
          if (param1.field_E == 2) {
            if (!((wia) this).a((byte) -63)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    wia(int param0) {
        ((wia) this).field_n = param0;
        ((wia) this).field_a = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has entered another game.";
        field_e = true;
    }
}
