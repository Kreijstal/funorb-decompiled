/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    private nj[] field_a;
    private d field_e;
    static ki field_d;
    private boolean field_b;
    private bk field_c;

    private final void a(nj[] param0, int param1) {
        if (param1 < 89) {
            Object var4 = null;
            this.a(127, (java.awt.Canvas) null);
        }
        if (param0 != ((ik) this).field_a) {
            if (-1 == (param0.length ^ -1)) {
                throw new IllegalArgumentException();
            }
            ((ik) this).field_a = param0;
            ((ik) this).field_b = false;
        }
    }

    final static int c(int param0) {
        L0: {
          if (param0 == -10517) {
            break L0;
          } else {
            int discarded$2 = ik.c(113);
            break L0;
          }
        }
        L1: {
          if (!oj.a(false)) {
            break L1;
          } else {
            if (null != pu.field_e.e((byte) 54)) {
              return pu.field_e.e((byte) 54).field_r;
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((ik) this).field_e = null;
        }
        return this.a(hk.b(-45), 89);
    }

    public static void b(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
    }

    private final boolean a(java.awt.Canvas param0, int param1) {
        bk var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          L1: {
            var3 = ((ik) this).field_c;
            if (var3 == null) {
              break L1;
            } else {
              if (!((ik) this).field_b) {
                break L1;
              } else {
                if (param0 != var3.field_c) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          this.a(-101, param0);
          break L0;
        }
        L2: {
          var4 = 113 / ((12 - param1) / 52);
          if (((ik) this).field_c == null) {
            break L2;
          } else {
            ((ik) this).field_c.field_g.f((int)(wq.a(-116) + -((ik) this).field_c.field_f));
            break L2;
          }
        }
        L3: {
          L4: {
            if (null == ((ik) this).field_c) {
              break L4;
            } else {
              L5: {
                if (var3 == null) {
                  break L5;
                } else {
                  if (((ik) this).field_c.field_g == var3.field_g) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          stackOut_12_0 = 0;
          stackIn_13_0 = stackOut_12_0;
          break L3;
        }
        return stackIn_13_0 != 0;
    }

    private final void a(int param0, java.awt.Canvas param1) {
        cj var3 = null;
        nj[] var4 = null;
        int var5 = 0;
        nj var6 = null;
        int var7 = 0;
        bk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          var3 = null;
          if (param0 == -101) {
            break L0;
          } else {
            ha discarded$1 = ((ik) this).a(-39);
            break L0;
          }
        }
        var4 = ((ik) this).field_a;
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4.length) {
            return;
          } else {
            var6 = var4[var5];
            if (var6.field_f) {
              L2: {
                var7 = var6.field_c;
                if (var7 != 0) {
                  if (var7 == 5) {
                    if (!sn.field_d.b((byte) 127)) {
                      return;
                    } else {
                      var7 = ig.a("hw3d", true);
                      if (0 != var7) {
                        if (100 <= var7) {
                          var8_int = ig.a("jaclib", true);
                          if (0 != var8_int) {
                            if (-101 <= var8_int) {
                              var9 = ig.a("jaggl", true);
                              if (var9 != -1) {
                                if ((var9 ^ -1) <= -101) {
                                  break L2;
                                } else {
                                  return;
                                }
                              } else {
                                var6.field_f = false;
                                var5++;
                                continue L1;
                              }
                            } else {
                              return;
                            }
                          } else {
                            var6.field_f = false;
                            var5++;
                            continue L1;
                          }
                        } else {
                          return;
                        }
                      } else {
                        var6.field_f = false;
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    if (1 != var7) {
                      if (var7 == 3) {
                        if (sn.field_d.b((byte) 127)) {
                          var7 = ig.a("jaclib", true);
                          if (var7 != -1) {
                            if (var7 < 100) {
                              return;
                            } else {
                              var8_int = ig.a("jagdx", true);
                              if (var8_int != 0) {
                                if (-101 <= var8_int) {
                                  var9 = ig.a("hw3d", true);
                                  if (0 != (var9 ^ -1)) {
                                    if (100 <= var9) {
                                      break L2;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    var6.field_f = false;
                                    var5++;
                                    continue L1;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                var6.field_f = false;
                                var5++;
                                continue L1;
                              }
                            }
                          } else {
                            var6.field_f = false;
                            var5++;
                            continue L1;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (var7 != -3) {
                          throw new IllegalStateException("UT" + var6.field_c);
                        } else {
                          if (sn.field_d.b((byte) 127)) {
                            var7 = ig.a("jaclib", true);
                            if (var7 != -1) {
                              if (100 <= var7) {
                                var8_int = ig.a("sw3d", true);
                                if (0 != (var8_int ^ -1)) {
                                  if (100 <= var8_int) {
                                    break L2;
                                  } else {
                                    return;
                                  }
                                } else {
                                  var6.field_f = false;
                                  var5++;
                                  continue L1;
                                }
                              } else {
                                return;
                              }
                            } else {
                              var6.field_f = false;
                              var5++;
                              continue L1;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      if (!sn.field_d.b((byte) 127)) {
                        return;
                      } else {
                        var7 = ig.a("jaclib", true);
                        if (-1 != var7) {
                          if (100 <= var7) {
                            var8_int = ig.a("jaggl", true);
                            if (var8_int != -1) {
                              if (-101 < (var8_int ^ -1)) {
                                return;
                              } else {
                                break L2;
                              }
                            } else {
                              var6.field_f = false;
                              var5++;
                              continue L1;
                            }
                          } else {
                            return;
                          }
                        } else {
                          var6.field_f = false;
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (null == ((ik) this).field_c) {
                  break L3;
                } else {
                  L4: {
                    if (!((ik) this).field_c.field_d.a(var6, (byte) 95)) {
                      break L4;
                    } else {
                      if (null == ((ik) this).field_c.field_g) {
                        break L4;
                      } else {
                        if (((ik) this).field_c.field_c != param1) {
                          break L4;
                        } else {
                          if (!var6.a(((ik) this).field_c, (byte) -123)) {
                            break L4;
                          } else {
                            ((ik) this).field_b = true;
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (((ik) this).field_c.field_d.field_c != var6.field_c) {
                    break L3;
                  } else {
                    if (((ik) this).field_c.field_g != null) {
                      var3 = ((ik) this).field_c.b(-43);
                      ((ik) this).field_c.field_g.a((byte) -94);
                      ((ik) this).field_c = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var11 = ks.a(var6.field_c, param1, ((ik) this).field_e, true, var6.field_g, ha.field_g);
              if (var11 != null) {
                var8 = new bk(var11, var6, param1);
                if (var6.a(var8, (byte) -36)) {
                  L5: {
                    if (((ik) this).field_c == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var8.field_g != ((ik) this).field_c.field_g) {
                          break L6;
                        } else {
                          if (var8.field_c == ((ik) this).field_c.field_c) {
                            ((ik) this).field_c = var8;
                            ((ik) this).field_b = true;
                            return;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 = ((ik) this).field_c.b(79);
                      ((ik) this).field_c.field_g.a((byte) -109);
                      break L5;
                    }
                  }
                  L7: {
                    if (var8.field_g.c()) {
                      var8.field_g.a(var8.field_g.c(100663296));
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var3 == null) {
                      var8.field_f = wq.a(param0 + 59);
                      break L8;
                    } else {
                      var3.a(var8, 3);
                      break L8;
                    }
                  }
                  ((ik) this).field_b = true;
                  ((ik) this).field_c = var8;
                  return;
                } else {
                  var6.field_f = false;
                  var5++;
                  continue L1;
                }
              } else {
                var6.field_f = false;
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final ha a(int param0) {
        if (param0 >= -89) {
            return null;
        }
        if (((ik) this).field_c == null) {
            return null;
        }
        return ((ik) this).field_c.field_g;
    }

    ik(int param0, int param1, d param2) {
        this(kd.a((byte) -123, param0), vo.b(param1, -1), param2, lt.field_m, ms.b(-16754));
    }

    private ik(ki param0, ki param1, d param2, wi param3, nj[] param4) {
        ((ik) this).field_b = false;
        ha.field_g = param1;
        ((ik) this).field_e = param2;
        sn.field_d = param0;
        ow.a(-18527, param0, param3);
        this.a(param4, 97);
    }

    static {
    }
}
