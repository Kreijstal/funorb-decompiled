/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends ma {
    static int field_u;
    static String field_p;
    static ba field_n;
    int field_s;
    int field_v;
    static int field_o;
    int field_l;
    static vh field_w;
    int field_t;
    int field_m;
    int field_r;
    int[] field_q;

    final static void a(uf param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        qe var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_92_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var6 = param0.field_I.j(param1 + 16848);
        var7 = var6;
        if (param1 == -16813) {
          L0: {
            var3 = param0.i(-1) ? 1 : 0;
            if ((hq.field_c & param0.field_L) != 0) {
              if (var3 != 0) {
                var4 = 1;
                if ((hq.field_c & param0.field_L) == 0) {
                  L1: {
                    L2: {
                      var5 = 1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        if (var7.c(true)) {
                          rb.a(nr.a(new String[1], -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        if (!var7.a(-110)) {
                          break L3;
                        } else {
                          rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                          break L1;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      if (var7.c((byte) 91)) {
                        rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
                  L4: {
                    if (var3 != 0) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L4;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      var5 = stackIn_33_0;
                      if (var4 == 0) {
                        break L6;
                      } else {
                        if (var7.c(true)) {
                          rb.a(nr.a(new String[1], -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        if (!var7.a(-110)) {
                          break L7;
                        } else {
                          rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                          break L5;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L5;
                    } else {
                      if (var7.c((byte) 91)) {
                        rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  return;
                }
              } else {
                stackOut_28_0 = 0;
                stackIn_58_0 = stackOut_28_0;
                break L0;
              }
            } else {
              stackOut_26_0 = 1;
              stackIn_58_0 = stackOut_26_0;
              break L0;
            }
          }
          L8: {
            var4 = stackIn_58_0;
            if ((hq.field_c & param0.field_L) != 0) {
              if (var3 == 0) {
                var5 = 1;
                if (var4 != 0) {
                  if (!var7.c(true)) {
                    if (var4 != 0) {
                      if (!var7.a(-110)) {
                        if (var5 != 0) {
                          if (!var7.c((byte) 91)) {
                            return;
                          } else {
                            rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                        return;
                      }
                    } else {
                      if (var5 != 0) {
                        if (!var7.c((byte) 91)) {
                          return;
                        } else {
                          rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    rb.a(nr.a(new String[1], -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
                    return;
                  }
                } else {
                  L9: {
                    if (var4 == 0) {
                      break L9;
                    } else {
                      if (!var7.a(-110)) {
                        break L9;
                      } else {
                        rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                        return;
                      }
                    }
                  }
                  if (var5 != 0) {
                    if (!var7.c((byte) 91)) {
                      return;
                    } else {
                      rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                stackOut_61_0 = 0;
                stackIn_92_0 = stackOut_61_0;
                break L8;
              }
            } else {
              stackOut_59_0 = 1;
              stackIn_92_0 = stackOut_59_0;
              break L8;
            }
          }
          var5 = stackIn_92_0;
          if (var4 == 0) {
            L10: {
              if (var4 == 0) {
                break L10;
              } else {
                if (!var7.a(-110)) {
                  break L10;
                } else {
                  rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                  return;
                }
              }
            }
            if (var5 != 0) {
              if (!var7.c((byte) 91)) {
                return;
              } else {
                rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                return;
              }
            } else {
              return;
            }
          } else {
            if (!var7.c(true)) {
              if (!var7.a(-110)) {
                if (var5 != 0) {
                  if (var7.c((byte) 91)) {
                    rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                return;
              }
            } else {
              rb.a(nr.a(new String[1], -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
              return;
            }
          }
        } else {
          L11: {
            field_w = null;
            var3 = param0.i(-1) ? 1 : 0;
            if ((hq.field_c & param0.field_L) != 0) {
              if (var3 != 0) {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L11;
              } else {
                stackOut_4_0 = 0;
                stackIn_7_0 = stackOut_4_0;
                break L11;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_7_0 = stackOut_2_0;
              break L11;
            }
          }
          L12: {
            var4 = stackIn_7_0;
            if ((hq.field_c & param0.field_L) != 0) {
              if (var3 == 0) {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L12;
              } else {
                stackOut_10_0 = 0;
                stackIn_13_0 = stackOut_10_0;
                break L12;
              }
            } else {
              stackOut_8_0 = 1;
              stackIn_13_0 = stackOut_8_0;
              break L12;
            }
          }
          L13: {
            L14: {
              var5 = stackIn_13_0;
              if (var4 == 0) {
                break L14;
              } else {
                if (var7.c(true)) {
                  rb.a(nr.a(new String[1], -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (var4 == 0) {
                break L15;
              } else {
                if (!var7.a(-110)) {
                  break L15;
                } else {
                  rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                  break L13;
                }
              }
            }
            if (var5 == 0) {
              break L13;
            } else {
              if (var7.c((byte) 91)) {
                rb.a(nr.a(new String[1], -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                break L13;
              } else {
                break L13;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        ((tn) this).field_t = param2;
        ((tn) this).field_l = param1;
        ((tn) this).field_m = param5;
        ((tn) this).field_v = param0;
        ((tn) this).field_s = param7;
        ((tn) this).field_r = param3;
        ((tn) this).field_q = param6;
        if (param4 > -42) {
            Object var10 = null;
            ((tn) this).a(-126, -20, -108, -2, -31, -56, (int[]) null, -107);
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_w = null;
        if (param0 <= 4) {
            return;
        }
        field_n = null;
    }

    tn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Cannot put the cue there! Try raising it.";
        field_u = 0;
    }
}
