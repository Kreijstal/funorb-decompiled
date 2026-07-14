/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dca extends ana {
    static int field_v;
    private boolean field_z;
    private boolean field_x;
    private la field_w;
    static java.awt.Canvas field_y;

    dca(gj param0, la param1, boolean param2) {
        super(param0, (bca) (Object) param1);
        ((dca) this).field_z = false;
        ((dca) this).field_x = param2 ? true : false;
        ((dca) this).field_w = param1;
    }

    public static void e(byte param0) {
        field_y = null;
        if (param0 != -87) {
            Object var2 = null;
            pp discarded$0 = dca.a((byte) 46, (lu) null);
        }
    }

    private final void f(byte param0) {
        if (param0 != 68) {
            ((dca) this).field_z = false;
        }
    }

    final boolean c(byte param0) {
        int var2_int = 0;
        te var2 = null;
        if (!((dca) this).field_x) {
          if (((dca) this).field_m.a((byte) -106)) {
            return false;
          } else {
            ((dca) this).field_l = ((dca) this).field_l - 1;
            if ((((dca) this).field_l - 1 ^ -1) <= -1) {
              L0: {
                if (((dca) this).field_z) {
                  break L0;
                } else {
                  ((dca) this).field_w.field_l.a(-27449, ((dca) this).field_q).b(-1, 7);
                  var2 = new te(((dca) this).field_q, ((dca) this).field_w.field_q, ((dca) this).field_w.field_t);
                  ((kj) (Object) var2).a(0);
                  ((dca) this).field_z = true;
                  break L0;
                }
              }
              return false;
            } else {
              var2_int = -97 % ((71 - param0) / 47);
              this.f((byte) 68);
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static pp a(byte param0, lu param1) {
        int var2 = 0;
        if (param0 == 102) {
          var2 = param1.b(16711935);
          if (1 != var2) {
            if ((var2 ^ -1) != -3) {
              if ((var2 ^ -1) != -4) {
                if (4 != var2) {
                  if (5 != var2) {
                    if (6 != var2) {
                      if ((var2 ^ -1) != -8) {
                        if (var2 != -9) {
                          if (-10 != var2) {
                            if (10 != var2) {
                              if (var2 != -12) {
                                if (12 != var2) {
                                  if (var2 != 13) {
                                    if (14 != var2) {
                                      if (-16 != var2) {
                                        if (16 != var2) {
                                          return null;
                                        } else {
                                          return ta.a(59, param1);
                                        }
                                      } else {
                                        return df.b(param1, 85);
                                      }
                                    } else {
                                      return oda.a(-127, param1);
                                    }
                                  } else {
                                    return wb.a(param1, -45);
                                  }
                                } else {
                                  return iba.b((byte) -121, param1);
                                }
                              } else {
                                return bea.a(-1547040176, param1);
                              }
                            } else {
                              return eo.a(param1, -4479);
                            }
                          } else {
                            return ie.a(param1, false);
                          }
                        } else {
                          return aba.a(param1, param0 + -93);
                        }
                      } else {
                        return ur.a(param1, (byte) 120);
                      }
                    } else {
                      return rk.a(1, param1);
                    }
                  } else {
                    return gs.a(true, param1);
                  }
                } else {
                  return im.a(-22833, param1);
                }
              } else {
                return hba.a(-30, param1);
              }
            } else {
              return vha.b(param1, -119);
            }
          } else {
            return n.a(param1, -127);
          }
        } else {
          field_v = 111;
          var2 = param1.b(16711935);
          if (1 != var2) {
            if ((var2 ^ -1) != -3) {
              if ((var2 ^ -1) != -4) {
                if (4 != var2) {
                  if (5 != var2) {
                    if (6 != var2) {
                      if ((var2 ^ -1) != -8) {
                        if (var2 != -9) {
                          if (-10 != var2) {
                            if (10 != var2) {
                              if (var2 != -12) {
                                if (12 != var2) {
                                  if (var2 != 13) {
                                    if (14 != var2) {
                                      if (-16 != var2) {
                                        if (16 == var2) {
                                          return ta.a(59, param1);
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        return df.b(param1, 85);
                                      }
                                    } else {
                                      return oda.a(-127, param1);
                                    }
                                  } else {
                                    return wb.a(param1, -45);
                                  }
                                } else {
                                  return iba.b((byte) -121, param1);
                                }
                              } else {
                                return bea.a(-1547040176, param1);
                              }
                            } else {
                              return eo.a(param1, -4479);
                            }
                          } else {
                            return ie.a(param1, false);
                          }
                        } else {
                          return aba.a(param1, param0 + -93);
                        }
                      } else {
                        return ur.a(param1, (byte) 120);
                      }
                    } else {
                      return rk.a(1, param1);
                    }
                  } else {
                    return gs.a(true, param1);
                  }
                } else {
                  return im.a(-22833, param1);
                }
              } else {
                return hba.a(-30, param1);
              }
            } else {
              return vha.b(param1, -119);
            }
          } else {
            return n.a(param1, -127);
          }
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        var1 = -78 % ((param0 - 6) / 53);
        if (!ng.a((byte) -24)) {
          fma.a(1, true, wi.field_o);
          fma.a(2, true, gm.field_j);
          fma.a(4, true, fm.field_g);
          return;
        } else {
          return;
        }
    }

    static {
    }
}
