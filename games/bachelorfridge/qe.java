/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private int field_n;
    private int field_e;
    private int field_f;
    private int field_s;
    private int field_a;
    private int field_m;
    private int field_i;
    private int field_g;
    private float field_c;
    private ila field_j;
    private int field_h;
    private boolean field_k;
    static boolean field_l;
    private int field_b;
    private int field_t;
    private int field_u;
    static String field_d;
    private int field_p;
    private int field_r;
    private int field_o;
    static int[] field_q;

    final kg c(byte param0) {
        ((qe) this).field_t = nn.field_b;
        ((qe) this).field_f = dda.field_j;
        ((qe) this).field_j.a(((qe) this).field_b, (byte) 19, ((qe) this).field_m);
        daa.field_vb = false;
        kg var2 = mfa.a(true, ((qe) this).field_m, 0, ((qe) this).field_b, ju.field_r, 0);
        if (!(var2 != null)) {
            ((qe) this).a(true);
        }
        int var3 = -24 / ((param0 - -30) / 54);
        return var2;
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
            return;
        }
        ((qe) this).field_e = param2;
        ((qe) this).field_i = param1;
    }

    final boolean b(int param0) {
        if (param0 == -8455) {
          if (((qe) this).field_g <= aja.field_o) {
            if (-1 >= dm.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((qe) this).a(true);
          if (((qe) this).field_g <= aja.field_o) {
            if (-1 <= dm.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_q = null;
        int var1 = 101 / ((param0 - 34) / 50);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = ((qe) this).field_i;
        var3 = ((qe) this).field_e;
        if (!((qe) this).b(-8455)) {
          ((qe) this).field_k = false;
          return;
        } else {
          if (param0 == 33) {
            L0: {
              if (((qe) this).field_o >= var2) {
                if (var2 < ((qe) this).field_n) {
                  var2 = ((qe) this).field_n;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var2 = ((qe) this).field_o;
                break L0;
              }
            }
            L1: {
              if (((qe) this).field_u < var3) {
                var3 = ((qe) this).field_u;
                break L1;
              } else {
                if (((qe) this).field_r > var3) {
                  var3 = ((qe) this).field_r;
                  if (0.0f < ((qe) this).field_c) {
                    var4 = (int)(0.5f + (float)var3 * ((qe) this).field_c);
                    if (var4 > var2) {
                      var3 = (int)((float)var2 / ((qe) this).field_c);
                      if (var2 != dda.field_j) {
                        L2: {
                          ((qe) this).field_j.a(var3, (byte) 19, var2);
                          if (-1 > (((qe) this).field_i ^ -1)) {
                            qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        return;
                      } else {
                        if (var3 != nn.field_b) {
                          L3: {
                            ((qe) this).field_j.a(var3, (byte) 19, var2);
                            if (-1 > (((qe) this).field_i ^ -1)) {
                              qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          return;
                        } else {
                          L4: {
                            if (-1 > (((qe) this).field_i ^ -1)) {
                              qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      if (var4 < var2) {
                        var2 = var4;
                        if (var2 != dda.field_j) {
                          L5: {
                            ((qe) this).field_j.a(var3, (byte) 19, var2);
                            if (-1 > (((qe) this).field_i ^ -1)) {
                              qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          return;
                        } else {
                          if (var3 != nn.field_b) {
                            L6: {
                              ((qe) this).field_j.a(var3, (byte) 19, var2);
                              if (-1 > (((qe) this).field_i ^ -1)) {
                                qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            return;
                          } else {
                            L7: {
                              if (-1 > (((qe) this).field_i ^ -1)) {
                                qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        if (var2 == dda.field_j) {
                          if (var3 == nn.field_b) {
                            L8: {
                              if (-1 < ((qe) this).field_i) {
                                qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            return;
                          } else {
                            L9: {
                              ((qe) this).field_j.a(var3, (byte) 19, var2);
                              if (-1 > ((qe) this).field_i) {
                                qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            return;
                          }
                        } else {
                          L10: {
                            ((qe) this).field_j.a(var3, (byte) 19, var2);
                            if (-1 > (((qe) this).field_i ^ -1)) {
                              qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          return;
                        }
                      }
                    }
                  } else {
                    L11: {
                      if (var2 != dda.field_j) {
                        ((qe) this).field_j.a(var3, (byte) 19, var2);
                        break L11;
                      } else {
                        if (var3 != nn.field_b) {
                          L12: {
                            ((qe) this).field_j.a(var3, (byte) 19, var2);
                            if (-1 > ((qe) this).field_i) {
                              qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          return;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      if (-1 > (((qe) this).field_i ^ -1)) {
                        qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            L14: {
              if (0.0f >= ((qe) this).field_c) {
                break L14;
              } else {
                var4 = (int)(0.5f + (float)var3 * ((qe) this).field_c);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((qe) this).field_c);
                  break L14;
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                    if (var2 != dda.field_j) {
                      L15: {
                        ((qe) this).field_j.a(var3, (byte) 19, var2);
                        if (-1 > (((qe) this).field_i ^ -1)) {
                          qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      return;
                    } else {
                      if (var3 != nn.field_b) {
                        L16: {
                          ((qe) this).field_j.a(var3, (byte) 19, var2);
                          if (-1 > (((qe) this).field_i ^ -1)) {
                            qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        return;
                      } else {
                        L17: {
                          if (-1 > (((qe) this).field_i ^ -1)) {
                            qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (var2 != dda.field_j) {
                      L18: {
                        ((qe) this).field_j.a(var3, (byte) 19, var2);
                        if (-1 > (((qe) this).field_i ^ -1)) {
                          qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      return;
                    } else {
                      if (var3 != nn.field_b) {
                        L19: {
                          ((qe) this).field_j.a(var3, (byte) 19, var2);
                          if (-1 > (((qe) this).field_i ^ -1)) {
                            qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return;
                      } else {
                        L20: {
                          if (-1 > (((qe) this).field_i ^ -1)) {
                            qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (var2 != dda.field_j) {
              L21: {
                ((qe) this).field_j.a(var3, (byte) 19, var2);
                if (-1 > (((qe) this).field_i ^ -1)) {
                  qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                  break L21;
                } else {
                  break L21;
                }
              }
              return;
            } else {
              if (var3 != nn.field_b) {
                L22: {
                  ((qe) this).field_j.a(var3, (byte) 19, var2);
                  if (-1 > (((qe) this).field_i ^ -1)) {
                    qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return;
              } else {
                L23: {
                  if (-1 > (((qe) this).field_i ^ -1)) {
                    qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          ((qe) this).field_m = 31;
          ((qe) this).field_j.a(((qe) this).field_t, (byte) 19, ((qe) this).field_f);
          return;
        } else {
          ((qe) this).field_j.a(((qe) this).field_t, (byte) 19, ((qe) this).field_f);
          return;
        }
    }

    final void b(byte param0) {
        if (null == kga.field_c) {
          L0: {
            if (-1 <= (dm.field_f ^ -1)) {
              ((qe) this).field_k = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((qe) this).field_k) {
            ((qe) this).field_p = ((qe) this).field_p - 1;
            if (0 >= ((qe) this).field_p - 1) {
              ((qe) this).field_p = ((qe) this).field_a;
              if (aja.field_o < ((qe) this).field_g) {
                ((qe) this).field_k = false;
                return;
              } else {
                if (param0 != 106) {
                  boolean discarded$1 = ((qe) this).b(70);
                  this.a(param0 + -73);
                  return;
                } else {
                  this.a(param0 + -73);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            if (dda.field_j >= ((qe) this).field_i) {
              if (0 < ((qe) this).field_i) {
                qw.field_d = 0;
                if (dda.field_j == ((qe) this).field_h) {
                  if (((qe) this).field_s != nn.field_b) {
                    ((qe) this).field_j.a(((qe) this).field_s, (byte) 19, ((qe) this).field_h);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((qe) this).field_j.a(((qe) this).field_s, (byte) 19, ((qe) this).field_h);
                  return;
                }
              } else {
                if (dda.field_j == ((qe) this).field_h) {
                  if (((qe) this).field_s != nn.field_b) {
                    ((qe) this).field_j.a(((qe) this).field_s, (byte) 19, ((qe) this).field_h);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((qe) this).field_j.a(((qe) this).field_s, (byte) 19, ((qe) this).field_h);
                  return;
                }
              }
            } else {
              qw.field_d = (((qe) this).field_i - dda.field_j) / 2;
              if (dda.field_j == ((qe) this).field_h) {
                if (((qe) this).field_s == nn.field_b) {
                  return;
                } else {
                  ((qe) this).field_j.a(((qe) this).field_s, (byte) 19, ((qe) this).field_h);
                  return;
                }
              } else {
                ((qe) this).field_j.a(((qe) this).field_s, (byte) 19, ((qe) this).field_h);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private qe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Service unavailable";
        field_q = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9, 12, 16, 17, 18, 19, 28, 29, 31, 32, 33, 34, 35, 36, 37, 39, 40, 44, 51, 52, 53, 8};
    }
}
