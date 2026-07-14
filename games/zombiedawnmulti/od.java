/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends lm {
    static String field_Cb;
    static String field_zb;
    private boolean field_yb;
    static int field_Db;
    static ja[] field_Fb;
    static String field_Eb;
    static ja[] field_Ab;
    static byte[] field_Gb;
    static String field_Bb;

    od(int param0, int param1, int param2) {
        super(param0, param1, param2, 100352);
        ((od) this).field_yb = false;
        if (-3 != (((od) this).field_D ^ -1)) {
            if ((((od) this).field_D ^ -1) != -5) {
                // if_icmpne L59
            }
        }
        ((od) this).field_lb = 17;
        ((od) this).field_cb = 71680;
    }

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((od) this).field_yb) {
            stackOut_2_0 = 2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0 * 250;
        if (((od) this).field_Q == 0) {
          if (!((od) this).field_yb) {
            var3 = 1;
            if (null != ((od) this).field_nb) {
              L1: {
                var4 = ((od) this).field_nb.e((byte) -112) + -((od) this).e((byte) -112);
                var5 = ((od) this).field_nb.g(1829947600) + -((od) this).g(1829947600);
                if (!((od) this).field_nb.o(124)) {
                  break L1;
                } else {
                  if (var4 * var4 - -(var5 * var5) > 125000) {
                    break L1;
                  } else {
                    if (0 == (((od) this).field_A.field_b.a(((od) this).g(param0 ^ 1829947583), ((od) this).e((byte) -112), -17201, ((od) this).field_nb.e((byte) -112), ((od) this).field_nb.g(1829947600), false, false) ^ -1)) {
                      if (0 == (((od) this).field_A.field_b.a(((od) this).g(1829947600) + -48, ((od) this).e((byte) -112), -17201, ((od) this).field_nb.e((byte) -112), ((od) this).field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                        break L1;
                      } else {
                        boolean discarded$6 = ((od) this).a(false, (pa) (Object) ((od) this).field_nb);
                        return;
                      }
                    } else {
                      boolean discarded$7 = ((od) this).a(false, (pa) (Object) ((od) this).field_nb);
                      return;
                    }
                  }
                }
              }
              ((od) this).field_nb = null;
              ((od) this).a(0, (byte) -89);
              ((od) this).field_N = ((od) this).e((byte) -112);
              ((od) this).field_ab = ((od) this).g(1829947600);
              ((od) this).field_S = true;
              return;
            } else {
              if (((od) this).b(((od) this).field_yb, var2, -32)) {
                if (((od) this).d(false)) {
                  ((od) this).field_yb = true;
                  if (var3 == 0) {
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = null;
                      return;
                    }
                  } else {
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = null;
                      return;
                    }
                  }
                } else {
                  if (((od) this).field_yb) {
                    ((od) this).field_yb = false;
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = null;
                      return;
                    }
                  } else {
                    if (-4 != (((od) this).field_Q ^ -1)) {
                      ((od) this).a(3, (byte) -89);
                      ((od) this).field_S = true;
                      if (param0 == 111) {
                        return;
                      } else {
                        field_zb = null;
                        return;
                      }
                    } else {
                      if (param0 == 111) {
                        return;
                      } else {
                        field_zb = null;
                        return;
                      }
                    }
                  }
                }
              } else {
                ((od) this).field_yb = false;
                ((od) this).field_nb = ((od) this).a(((od) this).field_yb, 250, 5690);
                if (((od) this).field_nb != null) {
                  ((od) this).a(30, (byte) -89);
                  ((od) this).b(((od) this).field_ab, (byte) -61, ((od) this).field_N);
                  ((od) this).l((byte) 111);
                  if (param0 == 111) {
                    return;
                  } else {
                    field_zb = null;
                    return;
                  }
                } else {
                  if (3 == ((od) this).field_Q) {
                    ((od) this).a(0, (byte) -89);
                    ((od) this).field_S = true;
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = null;
                      return;
                    }
                  } else {
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = null;
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var3 = 0;
            if (null != ((od) this).field_nb) {
              L2: {
                L3: {
                  var4 = ((od) this).field_nb.e((byte) -112) + -((od) this).e((byte) -112);
                  var5 = ((od) this).field_nb.g(1829947600) + -((od) this).g(1829947600);
                  if (!((od) this).field_nb.o(124)) {
                    break L3;
                  } else {
                    if (var4 * var4 - -(var5 * var5) > 125000) {
                      break L3;
                    } else {
                      if (0 != (((od) this).field_A.field_b.a(((od) this).g(param0 ^ 1829947583), ((od) this).e((byte) -112), -17201, ((od) this).field_nb.e((byte) -112), ((od) this).field_nb.g(1829947600), false, false) ^ -1)) {
                        boolean discarded$8 = ((od) this).a(false, (pa) (Object) ((od) this).field_nb);
                        break L2;
                      } else {
                        if (0 != (((od) this).field_A.field_b.a(((od) this).g(1829947600) + -48, ((od) this).e((byte) -112), -17201, ((od) this).field_nb.e((byte) -112), ((od) this).field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                          boolean discarded$9 = ((od) this).a(false, (pa) (Object) ((od) this).field_nb);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((od) this).field_nb = null;
                ((od) this).a(0, (byte) -89);
                ((od) this).field_N = ((od) this).e((byte) -112);
                ((od) this).field_ab = ((od) this).g(1829947600);
                ((od) this).field_S = true;
                break L2;
              }
              return;
            } else {
              L4: {
                if (((od) this).b(((od) this).field_yb, var2, -32)) {
                  if (((od) this).d(false)) {
                    ((od) this).field_yb = true;
                    if (var3 == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (param0 == 111) {
                          break L5;
                        } else {
                          field_zb = null;
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    if (!((od) this).field_yb) {
                      if (-4 == (((od) this).field_Q ^ -1)) {
                        if (param0 == 111) {
                          return;
                        } else {
                          field_zb = null;
                          return;
                        }
                      } else {
                        L6: {
                          ((od) this).a(3, (byte) -89);
                          ((od) this).field_S = true;
                          if (param0 == 111) {
                            break L6;
                          } else {
                            field_zb = null;
                            break L6;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        ((od) this).field_yb = false;
                        if (param0 == 111) {
                          break L7;
                        } else {
                          field_zb = null;
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  ((od) this).field_yb = false;
                  ((od) this).field_nb = ((od) this).a(((od) this).field_yb, 250, 5690);
                  if (((od) this).field_nb != null) {
                    ((od) this).a(30, (byte) -89);
                    ((od) this).b(((od) this).field_ab, (byte) -61, ((od) this).field_N);
                    ((od) this).l((byte) 111);
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = null;
                      return;
                    }
                  } else {
                    if (3 == ((od) this).field_Q) {
                      ((od) this).a(0, (byte) -89);
                      ((od) this).field_S = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param0 != 111) {
                field_zb = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          var3 = 0;
          if (null != ((od) this).field_nb) {
            L8: {
              L9: {
                var4 = ((od) this).field_nb.e((byte) -112) + -((od) this).e((byte) -112);
                var5 = ((od) this).field_nb.g(1829947600) + -((od) this).g(1829947600);
                if (!((od) this).field_nb.o(124)) {
                  break L9;
                } else {
                  if (var4 * var4 - -(var5 * var5) > 125000) {
                    break L9;
                  } else {
                    if (0 != (((od) this).field_A.field_b.a(((od) this).g(param0 ^ 1829947583), ((od) this).e((byte) -112), -17201, ((od) this).field_nb.e((byte) -112), ((od) this).field_nb.g(1829947600), false, false) ^ -1)) {
                      boolean discarded$10 = ((od) this).a(false, (pa) (Object) ((od) this).field_nb);
                      break L8;
                    } else {
                      if (0 != (((od) this).field_A.field_b.a(((od) this).g(1829947600) + -48, ((od) this).e((byte) -112), -17201, ((od) this).field_nb.e((byte) -112), ((od) this).field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                        boolean discarded$11 = ((od) this).a(false, (pa) (Object) ((od) this).field_nb);
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              ((od) this).field_nb = null;
              ((od) this).a(0, (byte) -89);
              ((od) this).field_N = ((od) this).e((byte) -112);
              ((od) this).field_ab = ((od) this).g(1829947600);
              ((od) this).field_S = true;
              break L8;
            }
            return;
          } else {
            L10: {
              if (((od) this).b(((od) this).field_yb, var2, -32)) {
                if (((od) this).d(false)) {
                  ((od) this).field_yb = true;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    L11: {
                      if (param0 == 111) {
                        break L11;
                      } else {
                        field_zb = null;
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  if (!((od) this).field_yb) {
                    if (-4 == (((od) this).field_Q ^ -1)) {
                      L12: {
                        if (param0 == 111) {
                          break L12;
                        } else {
                          field_zb = null;
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L13: {
                        ((od) this).a(3, (byte) -89);
                        ((od) this).field_S = true;
                        if (param0 == 111) {
                          break L13;
                        } else {
                          field_zb = null;
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L14: {
                      ((od) this).field_yb = false;
                      if (param0 == 111) {
                        break L14;
                      } else {
                        field_zb = null;
                        break L14;
                      }
                    }
                    return;
                  }
                }
              } else {
                ((od) this).field_yb = false;
                ((od) this).field_nb = ((od) this).a(((od) this).field_yb, 250, 5690);
                if (((od) this).field_nb != null) {
                  L15: {
                    ((od) this).a(30, (byte) -89);
                    ((od) this).b(((od) this).field_ab, (byte) -61, ((od) this).field_N);
                    ((od) this).l((byte) 111);
                    if (param0 == 111) {
                      break L15;
                    } else {
                      field_zb = null;
                      break L15;
                    }
                  }
                  return;
                } else {
                  if (3 == ((od) this).field_Q) {
                    ((od) this).a(0, (byte) -89);
                    ((od) this).field_S = true;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
            if (param0 != 111) {
              field_zb = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void o(byte param0) {
        field_Cb = null;
        field_Eb = null;
        field_Gb = null;
        field_Bb = null;
        field_zb = null;
        if (param0 > -5) {
          return;
        } else {
          field_Ab = null;
          field_Fb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Try changing the '<%0>' setting.";
        field_Db = 0;
        field_zb = "To server list";
        field_Eb = "Breach";
    }
}
