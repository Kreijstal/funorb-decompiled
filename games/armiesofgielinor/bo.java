/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private int[] field_e;
    private int[] field_f;
    private int[] field_a;
    private int[] field_h;
    static String field_c;
    private int[] field_d;
    static wk field_b;
    static int[] field_g;

    final int a(byte param0, int param1) {
        int var3 = -102 / ((param0 - 44) / 42);
        return ((bo) this).field_d[param1] + (-640 + so.field_b.field_a >> 453533825);
    }

    final int a(int param0, byte param1) {
        if (param1 > -100) {
          field_c = null;
          return ((bo) this).field_h[param0] + (so.field_b.field_g - 480 >> -622903007);
        } else {
          return ((bo) this).field_h[param0] + (so.field_b.field_g - 480 >> -622903007);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 120 / ((param0 - -93) / 33);
        ((bo) this).field_d[param2] = ((bo) this).field_d[param2] + (param1 + -((bo) this).a((byte) -125, param2));
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        ((bo) this).field_a[param6] = param4;
        ((bo) this).field_d[param6] = param0;
        ((bo) this).field_h[param6] = param3;
        ((bo) this).field_f[param6] = param5;
        ((bo) this).field_e[param6] = param1;
        if (param2 != 18) {
            ((bo) this).a(-45, 80, (byte) -101, -37, -18, -104, -117);
        }
    }

    final int b(int param0, int param1) {
        Object var4 = null;
        if (param1 != 29) {
          var4 = null;
          ik discarded$2 = bo.a(-13, (vh) null, 83);
          return (-640 + so.field_b.field_a >> 328354849) - -((bo) this).field_a[param0];
        } else {
          return (-640 + so.field_b.field_a >> 328354849) - -((bo) this).field_a[param0];
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -1) {
          return;
        } else {
          ((bo) this).field_a[param2] = ((bo) this).field_a[param2] + (-((bo) this).b(param2, 29) + param1);
          return;
        }
    }

    final static ik a(int param0, vh param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 == 4368051) {
          var3 = param1.e((byte) -104);
          var4 = uc.field_d[var3][3];
          if (-5 != var4) {
            L0: {
              if (-1 == var4) {
                break L0;
              } else {
                if (-2 != (var4 ^ -1)) {
                  if (-3 != (var4 ^ -1)) {
                    if (8 == var4) {
                      break L0;
                    } else {
                      if (3 == var4) {
                        break L0;
                      } else {
                        if ((var4 ^ -1) == -6) {
                          break L0;
                        } else {
                          if (6 == var4) {
                            break L0;
                          } else {
                            if (7 == var4) {
                              break L0;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (uc.field_d[var3][4] == 5) {
                      if (param0 > -1) {
                        return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                      } else {
                        return (ik) (Object) new al(var3);
                      }
                    } else {
                      return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
                    }
                  }
                } else {
                  if (uc.field_d[var3][4] == 5) {
                    if (param0 > -1) {
                      return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                    } else {
                      return (ik) (Object) new al(var3);
                    }
                  } else {
                    return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
                  }
                }
              }
            }
            if (uc.field_d[var3][4] == 5) {
              if (param0 > -1) {
                return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
              } else {
                return (ik) (Object) new al(var3);
              }
            } else {
              return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
            }
          } else {
            return (ik) (Object) new al(var3);
          }
        } else {
          var6 = null;
          ik discarded$1 = bo.a(-35, (vh) null, 62);
          var3 = param1.e((byte) -104);
          var4 = uc.field_d[var3][3];
          if (-5 != var4) {
            if (-1 != var4) {
              if (-2 != (var4 ^ -1)) {
                if (-3 != (var4 ^ -1)) {
                  if (8 != var4) {
                    L1: {
                      if (3 == var4) {
                        break L1;
                      } else {
                        if ((var4 ^ -1) == -6) {
                          break L1;
                        } else {
                          if (6 == var4) {
                            break L1;
                          } else {
                            if (7 == var4) {
                              break L1;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    }
                    if (uc.field_d[var3][4] == 5) {
                      if (param0 > -1) {
                        return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                      } else {
                        return (ik) (Object) new al(var3);
                      }
                    } else {
                      return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
                    }
                  } else {
                    if (uc.field_d[var3][4] == 5) {
                      if (param0 > -1) {
                        return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                      } else {
                        return (ik) (Object) new al(var3);
                      }
                    } else {
                      return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
                    }
                  }
                } else {
                  if (uc.field_d[var3][4] == 5) {
                    if (param0 > -1) {
                      return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                    } else {
                      return (ik) (Object) new al(var3);
                    }
                  } else {
                    return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
                  }
                }
              } else {
                if (uc.field_d[var3][4] == 5) {
                  if (param0 > -1) {
                    return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                  } else {
                    return (ik) (Object) new al(var3);
                  }
                } else {
                  return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
                }
              }
            } else {
              if (uc.field_d[var3][4] == 5) {
                if (param0 > -1) {
                  return (ik) (Object) new ra(var3, (mn) (Object) new am(param1, param0));
                } else {
                  return (ik) (Object) new al(var3);
                }
              } else {
                return (ik) (Object) new wa(var3, param1.k(param2 ^ 4368051), param1.k(0));
              }
            }
          } else {
            return (ik) (Object) new al(var3);
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 4368051) {
          bo.a(false);
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final int b(int param0, byte param1) {
        int var3 = -53 % ((45 - param1) / 61);
        return ((bo) this).field_f[param0];
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 <= 118) {
          ((bo) this).field_e = null;
          ((bo) this).field_h[param1] = ((bo) this).field_h[param1] + (param0 - ((bo) this).a(param1, (byte) -108));
          return;
        } else {
          ((bo) this).field_h[param1] = ((bo) this).field_h[param1] + (param0 - ((bo) this).a(param1, (byte) -108));
          return;
        }
    }

    final static void a(boolean param0) {
        tp.field_e = new at();
        if (!param0) {
            field_b = null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -6) {
          ((bo) this).b(-40, 11, -54);
          return (so.field_b.field_g - 480 >> 1896245185) - -((bo) this).field_e[param1];
        } else {
          return (so.field_b.field_g - 480 >> 1896245185) - -((bo) this).field_e[param1];
        }
    }

    bo() {
        ((bo) this).field_a = new int[29];
        ((bo) this).field_f = new int[29];
        ((bo) this).field_h = new int[29];
        ((bo) this).field_e = new int[29];
        ((bo) this).field_d = new int[29];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> / <%1> (+<%2>) - Victory in <%3> turns";
        field_g = new int[]{12303291, 740023, 12521488, 8495921, 4368051, 5132314, 10573849};
    }
}
