/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends em {
    static String field_K;
    sb field_G;
    static int field_J;
    static String field_E;
    static String field_H;
    int field_D;
    byte field_I;

    final byte[] c(byte param0) {
        Object var3 = null;
        if (param0 == -115) {
          if (!((ee) this).field_C) {
            if (((ee) this).field_G.field_o < ((ee) this).field_G.field_u.length + -((ee) this).field_I) {
              throw new RuntimeException();
            } else {
              return ((ee) this).field_G.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          var3 = null;
          ee.a((String) null, (String[]) null, (byte) -97, -80);
          if (!((ee) this).field_C) {
            if (((ee) this).field_G.field_o < ((ee) this).field_G.field_u.length + -((ee) this).field_I) {
              throw new RuntimeException();
            } else {
              return ((ee) this).field_G.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final int f(int param0) {
        if (null == ((ee) this).field_G) {
          return 0;
        } else {
          if (param0 != 100) {
            return -24;
          } else {
            return ((ee) this).field_G.field_o * 100 / (-((ee) this).field_I + ((ee) this).field_G.field_u.length);
          }
        }
    }

    public static void h(int param0) {
        field_H = null;
        if (param0 != 256) {
            field_K = null;
            field_E = null;
            field_K = null;
            return;
        }
        field_E = null;
        field_K = null;
    }

    final static void i(int param0) {
        int var1 = ma.o(-14933);
        int var2 = ei.n(param0 ^ param0);
        rb.field_e.a(var2 - -(rf.field_b << 1027286305), lj.field_p + -rf.field_b, var1 - -(pm.field_c << 1067089121), 26202, cg.field_o - pm.field_c);
        ik.n(-107);
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = MinerDisturbance.field_ab;
        if (param2 == -98) {
          ic.field_l = kd.field_p;
          if (-256 != (param3 ^ -1)) {
            if (100 <= param3) {
              if ((param3 ^ -1) < -106) {
                vk.field_g = ij.a(param3, param0, true);
                return;
              } else {
                vk.field_g = rh.a(124, param1);
                return;
              }
            } else {
              vk.field_g = ij.a(param3, param0, true);
              return;
            }
          } else {
            L0: {
              if ((me.field_j ^ -1) <= -14) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L0;
              }
            }
            vk.field_g = hn.a(stackIn_18_0 != 0, (byte) 105);
            return;
          }
        } else {
          L1: {
            field_E = null;
            ic.field_l = kd.field_p;
            if (-256 != (param3 ^ -1)) {
              if (100 > param3) {
                vk.field_g = ij.a(param3, param0, true);
                break L1;
              } else {
                if ((param3 ^ -1) < -106) {
                  vk.field_g = ij.a(param3, param0, true);
                  return;
                } else {
                  vk.field_g = rh.a(124, param1);
                  return;
                }
              }
            } else {
              L2: {
                if ((me.field_j ^ -1) <= -14) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L2;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L2;
                }
              }
              vk.field_g = hn.a(stackIn_5_0 != 0, (byte) 105);
              break L1;
            }
          }
          return;
        }
    }

    final static boolean e(byte param0) {
        int var1 = 0;
        Object var2 = null;
        tc var2_ref = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = null;
        var3 = MinerDisturbance.field_ab;
        if (53 != lj.field_t) {
          if (fn.field_o) {
            if ((lj.field_t ^ -1) != -14) {
              L0: {
                var1 = 0;
                if (!qd.field_O[86]) {
                  L1: {
                    if (qd.field_O[86]) {
                      break L1;
                    } else {
                      if (!qd.field_O[82]) {
                        break L1;
                      } else {
                        var1 = 1;
                        var2_ref = (tc) (Object) ii.field_b.b(103);
                        L2: while (true) {
                          if (var2_ref == null) {
                            if (param0 == 75) {
                              return false;
                            } else {
                              field_J = -10;
                              return false;
                            }
                          } else {
                            L3: {
                              if (var1 != var2_ref.field_q) {
                                break L3;
                              } else {
                                if (var2_ref.field_w == lj.field_t) {
                                  var2_ref.field_u.a(false);
                                  fn.field_o = false;
                                  return true;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var2_ref = (tc) (Object) ii.field_b.b((byte) 56);
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  if (!qd.field_O[86]) {
                    break L0;
                  } else {
                    if (qd.field_O[82]) {
                      break L0;
                    } else {
                      var1 = 2;
                      var2_ref = (tc) (Object) ii.field_b.b(103);
                      L4: while (true) {
                        if (var2_ref == null) {
                          if (param0 == 75) {
                            return false;
                          } else {
                            field_J = -10;
                            return false;
                          }
                        } else {
                          L5: {
                            if (var1 != var2_ref.field_q) {
                              break L5;
                            } else {
                              if (var2_ref.field_w == lj.field_t) {
                                var2_ref.field_u.a(false);
                                fn.field_o = false;
                                return true;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var2_ref = (tc) (Object) ii.field_b.b((byte) 56);
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  if (qd.field_O[82]) {
                    var1 = 3;
                    break L0;
                  } else {
                    if (!qd.field_O[86]) {
                      if (qd.field_O[82]) {
                        var1 = 1;
                        var2_ref = (tc) (Object) ii.field_b.b(103);
                        L6: while (true) {
                          if (var2_ref == null) {
                            if (param0 == 75) {
                              return false;
                            } else {
                              field_J = -10;
                              return false;
                            }
                          } else {
                            L7: {
                              if (var1 != var2_ref.field_q) {
                                break L7;
                              } else {
                                if (var2_ref.field_w == lj.field_t) {
                                  var2_ref.field_u.a(false);
                                  fn.field_o = false;
                                  return true;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var2_ref = (tc) (Object) ii.field_b.b((byte) 56);
                            continue L6;
                          }
                        }
                      } else {
                        L8: {
                          if (!qd.field_O[86]) {
                            var2_ref = (tc) (Object) ii.field_b.b(103);
                            break L8;
                          } else {
                            if (qd.field_O[82]) {
                              var2_ref = (tc) (Object) ii.field_b.b(103);
                              break L8;
                            } else {
                              var1 = 2;
                              var2_ref = (tc) (Object) ii.field_b.b(103);
                              break L8;
                            }
                          }
                        }
                        L9: while (true) {
                          if (var2_ref == null) {
                            if (param0 != 75) {
                              field_J = -10;
                              return false;
                            } else {
                              return false;
                            }
                          } else {
                            L10: {
                              if (var1 != var2_ref.field_q) {
                                break L10;
                              } else {
                                if (var2_ref.field_w == lj.field_t) {
                                  var2_ref.field_u.a(false);
                                  fn.field_o = false;
                                  return true;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var2_ref = (tc) (Object) ii.field_b.b((byte) 56);
                            continue L9;
                          }
                        }
                      }
                    } else {
                      L11: {
                        if (!qd.field_O[86]) {
                          var2_ref = (tc) (Object) ii.field_b.b(103);
                          break L11;
                        } else {
                          if (qd.field_O[82]) {
                            var2_ref = (tc) (Object) ii.field_b.b(103);
                            break L11;
                          } else {
                            var1 = 2;
                            var2_ref = (tc) (Object) ii.field_b.b(103);
                            break L11;
                          }
                        }
                      }
                      L12: while (true) {
                        if (var2_ref == null) {
                          if (param0 != 75) {
                            field_J = -10;
                            return false;
                          } else {
                            return false;
                          }
                        } else {
                          L13: {
                            if (var1 != var2_ref.field_q) {
                              break L13;
                            } else {
                              if (var2_ref.field_w == lj.field_t) {
                                var2_ref.field_u.a(false);
                                fn.field_o = false;
                                return true;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var2_ref = (tc) (Object) ii.field_b.b((byte) 56);
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
              var2_ref = (tc) (Object) ii.field_b.b(103);
              L14: while (true) {
                if (var2_ref == null) {
                  if (param0 == 75) {
                    return false;
                  } else {
                    field_J = -10;
                    return false;
                  }
                } else {
                  L15: {
                    if (var1 != var2_ref.field_q) {
                      break L15;
                    } else {
                      if (var2_ref.field_w == lj.field_t) {
                        var2_ref.field_u.a(false);
                        fn.field_o = false;
                        return true;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var2_ref = (tc) (Object) ii.field_b.b((byte) 56);
                  continue L14;
                }
              }
            } else {
              fn.field_o = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          L16: {
            if (fn.field_o) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L16;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L16;
            }
          }
          fn.field_o = stackIn_4_0 != 0;
          return true;
        }
    }

    ee() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Discard";
        field_J = 256;
        field_H = "Reset Tips";
        field_K = "Return to game";
    }
}
