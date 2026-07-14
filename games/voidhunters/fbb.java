/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fbb {
    private jjb field_e;
    static int[] field_f;
    private qg[] field_d;
    private int field_c;
    static int field_i;
    private int field_g;
    private int field_a;
    la field_b;
    private qfa field_h;
    static int[] field_j;

    final static boolean b(int param0, int param1) {
        if (param1 == 15923) {
          if (param0 > 3) {
            if (hab.field_g[param0].field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_j = null;
        if (param0) {
            boolean discarded$0 = fbb.b(-82, 83);
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 != 8) {
          ((fbb) this).a(false, false, 71, -110, 65, -25);
          return ((fbb) this).field_d[param1].b(-90);
        } else {
          return ((fbb) this).field_d[param1].b(-90);
        }
    }

    final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        L0: {
          param0 = param0 & ((fbb) this).field_h.e();
          if (param0) {
            break L0;
          } else {
            if (-5 != (param4 ^ -1)) {
              if (8 != param4) {
                if ((param4 ^ -1) == -10) {
                  L1: {
                    if (4 == param4) {
                      param5 = param2;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  param4 = 2;
                  break L0;
                } else {
                  L2: {
                    if (param4 == 0) {
                      break L2;
                    } else {
                      if (!param1) {
                        break L2;
                      } else {
                        param4 = param4 | -2147483648;
                        break L2;
                      }
                    }
                  }
                  if (param3 < -104) {
                    if (((fbb) this).field_g == param4) {
                      if (((fbb) this).field_g != 0) {
                        ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
                        if (param2 == ((fbb) this).field_a) {
                          if (((fbb) this).field_c != param5) {
                            ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                            ((fbb) this).field_c = param5;
                            ((fbb) this).field_a = param2;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                          ((fbb) this).field_c = param5;
                          ((fbb) this).field_a = param2;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L3: {
                        if (((fbb) this).field_g == 0) {
                          break L3;
                        } else {
                          ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                          break L3;
                        }
                      }
                      L4: {
                        if (param4 != 0) {
                          ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                          ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                          ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((fbb) this).field_a = param2;
                      ((fbb) this).field_g = param4;
                      ((fbb) this).field_c = param5;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L5: {
                  if (4 == param4) {
                    param5 = param2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  param4 = 2;
                  if (param4 == 0) {
                    break L6;
                  } else {
                    if (!param1) {
                      break L6;
                    } else {
                      param4 = param4 | -2147483648;
                      break L6;
                    }
                  }
                }
                if (param3 < -104) {
                  if (((fbb) this).field_g == param4) {
                    if (((fbb) this).field_g != 0) {
                      ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
                      if (param2 == ((fbb) this).field_a) {
                        if (((fbb) this).field_c != param5) {
                          ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                          ((fbb) this).field_c = param5;
                          ((fbb) this).field_a = param2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                        ((fbb) this).field_c = param5;
                        ((fbb) this).field_a = param2;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((fbb) this).field_g != 0) {
                      L7: {
                        ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                        if (param4 != 0) {
                          ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                          ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                          ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((fbb) this).field_a = param2;
                      ((fbb) this).field_g = param4;
                      ((fbb) this).field_c = param5;
                      return;
                    } else {
                      L8: {
                        if (param4 != 0) {
                          ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                          ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                          ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ((fbb) this).field_a = param2;
                      ((fbb) this).field_g = param4;
                      ((fbb) this).field_c = param5;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L9: {
                if (4 == param4) {
                  param5 = param2;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                param4 = 2;
                if (param4 == 0) {
                  break L10;
                } else {
                  if (!param1) {
                    break L10;
                  } else {
                    param4 = param4 | -2147483648;
                    break L10;
                  }
                }
              }
              if (param3 < -104) {
                if (((fbb) this).field_g == param4) {
                  if (((fbb) this).field_g != 0) {
                    ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
                    if (param2 == ((fbb) this).field_a) {
                      if (((fbb) this).field_c != param5) {
                        ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                        ((fbb) this).field_c = param5;
                        ((fbb) this).field_a = param2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                      ((fbb) this).field_c = param5;
                      ((fbb) this).field_a = param2;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (((fbb) this).field_g != 0) {
                    L11: {
                      ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                      if (param4 != 0) {
                        ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                        ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                        ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((fbb) this).field_a = param2;
                    ((fbb) this).field_g = param4;
                    ((fbb) this).field_c = param5;
                    return;
                  } else {
                    L12: {
                      if (param4 != 0) {
                        ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                        ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                        ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    ((fbb) this).field_a = param2;
                    ((fbb) this).field_g = param4;
                    ((fbb) this).field_c = param5;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        L13: {
          if (param4 == 0) {
            break L13;
          } else {
            if (!param1) {
              break L13;
            } else {
              param4 = param4 | -2147483648;
              break L13;
            }
          }
        }
        if (param3 < -104) {
          if (((fbb) this).field_g == param4) {
            if (((fbb) this).field_g != 0) {
              ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
              if (param2 == ((fbb) this).field_a) {
                if (((fbb) this).field_c == param5) {
                  return;
                } else {
                  ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                  ((fbb) this).field_c = param5;
                  ((fbb) this).field_a = param2;
                  return;
                }
              } else {
                ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                ((fbb) this).field_c = param5;
                ((fbb) this).field_a = param2;
                return;
              }
            } else {
              return;
            }
          } else {
            if (((fbb) this).field_g == 0) {
              L14: {
                if (param4 != 0) {
                  ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                  ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                  ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                  break L14;
                } else {
                  break L14;
                }
              }
              ((fbb) this).field_a = param2;
              ((fbb) this).field_g = param4;
              ((fbb) this).field_c = param5;
              return;
            } else {
              L15: {
                ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                if (param4 != 0) {
                  ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                  ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                  ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                  break L15;
                } else {
                  break L15;
                }
              }
              ((fbb) this).field_a = param2;
              ((fbb) this).field_g = param4;
              ((fbb) this).field_c = param5;
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(pib param0, int param1, int param2) {
        int var4 = 0;
        if (((fbb) this).field_g == 0) {
          return false;
        } else {
          var4 = -72 % ((param1 - -71) / 53);
          ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(param2, (byte) 125, param0);
          return true;
        }
    }

    fbb(qfa param0) {
        L0: {
          ((fbb) this).field_c = 0;
          ((fbb) this).field_a = 0;
          ((fbb) this).field_g = 0;
          ((fbb) this).field_h = param0;
          ((fbb) this).field_e = new jjb(param0);
          ((fbb) this).field_d = new qg[10];
          ((fbb) this).field_d[1] = (qg) (Object) new kv(param0);
          ((fbb) this).field_d[2] = (qg) (Object) new uga(param0, ((fbb) this).field_e);
          ((fbb) this).field_d[4] = (qg) (Object) new ssb(param0, ((fbb) this).field_e);
          ((fbb) this).field_d[5] = (qg) (Object) new iib(param0, ((fbb) this).field_e);
          ((fbb) this).field_d[6] = (qg) (Object) new ku(param0);
          ((fbb) this).field_d[7] = (qg) (Object) new uob(param0);
          ((fbb) this).field_b = new la(param0);
          ((fbb) this).field_d[3] = (qg) (Object) new la(param0);
          ((fbb) this).field_d[8] = (qg) (Object) new ti(param0, ((fbb) this).field_e);
          ((fbb) this).field_d[9] = (qg) (Object) new mw(param0, ((fbb) this).field_e);
          if (((fbb) this).field_d[8].b(-113)) {
            break L0;
          } else {
            ((fbb) this).field_d[8] = ((fbb) this).field_d[4];
            break L0;
          }
        }
        L1: {
          if (((fbb) this).field_d[9].b(-110)) {
            break L1;
          } else {
            ((fbb) this).field_d[9] = ((fbb) this).field_d[8];
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[109];
    }
}
