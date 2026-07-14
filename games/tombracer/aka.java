/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aka extends cda {
    static String field_A;
    private int field_z;
    private bua field_C;
    private int field_x;
    private boolean field_w;
    static float field_B;
    private boolean field_y;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        ka var8 = null;
        if (((aka) this).field_C == null) {
          return;
        } else {
          var6 = 0 % ((-38 - param4) / 47);
          var7 = this.i(-6874);
          var8 = ((aka) this).field_C.a(false, -1, false, (byte) 1);
          gqa.a(var7, -83584144, param1, param2, var8, param3);
          return;
        }
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
            return;
        }
        super.a(123, param1, param2);
        ((aka) this).field_x = param2.b((byte) 44, 4);
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        w var5 = null;
        nta var6 = null;
        super.a((byte) 51, param1);
        if (null != ((aka) this).field_C) {
          L0: {
            var4 = 2 / ((7 - param0) / 36);
            var3 = 0;
            var5_int = ((aka) this).field_x;
            if (-1 != (var5_int ^ -1)) {
              break L0;
            } else {
              if ((param1 ^ -1) == -5) {
                return;
              } else {
                ((aka) this).field_C.a(6, -23308, 1);
                var3 = -1;
                ((aka) this).field_C.a(1, true, (byte) -101, 3);
                break L0;
              }
            }
          }
          L1: {
            if (-1 == (var3 ^ -1)) {
              break L1;
            } else {
              var5_int = this.i(-6874);
              var6 = new nta(((aka) this).b((byte) 40), ((aka) this).c((byte) 123), ((aka) this).e((byte) -96), ((aka) this).field_C, var5_int, var3);
              var6.a((byte) -113, ((aka) this).field_h.f((byte) -109).j((byte) -118), ((aka) this).k((byte) -99));
              break L1;
            }
          }
          var5 = (w) (Object) ((aka) this).field_h.f((byte) -99).field_G;
          if (var5 == null) {
            return;
          } else {
            if (param1 != 3) {
              if (param1 == 2) {
                fla discarded$2 = var5.a(new fm(80, ((aka) this).b((byte) 90), ((aka) this).c((byte) 94), ((aka) this).e((byte) -108)), -58);
                return;
              } else {
                return;
              }
            } else {
              fla discarded$3 = var5.a(new fm(78, ((aka) this).b((byte) 71), ((aka) this).c((byte) 106), ((aka) this).e((byte) -91)), -58);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void o(byte param0) {
        if (param0 <= 80) {
            field_A = null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    final void a(uw param0, int param1) {
        if (param1 < 82) {
          ((aka) this).field_C = null;
          super.a(param0, 93);
          ((aka) this).field_C = null;
          return;
        } else {
          super.a(param0, 93);
          ((aka) this).field_C = null;
          return;
        }
    }

    final void b(int param0, uw param1) {
        super.b(param0 ^ param0, param1);
        int var3 = ((aka) this).field_x;
        if (!(var3 != 0)) {
            ((aka) this).field_C = new bua(6, 0, 0);
            ((aka) this).field_C.a(1, true, (byte) -121, 1);
            ((aka) this).field_C.a(false, 176);
        }
    }

    final static void j(int param0) {
        if (param0 != 28191) {
            return;
        }
        jo.a(oba.field_f, 0, kua.field_i, rfa.field_C, lma.field_r);
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
    }

    aka(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((aka) this).field_w = false;
        ((aka) this).field_z = 0;
        ((aka) this).field_y = false;
    }

    public final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        w var5 = null;
        int var7 = 0;
        int var8 = 0;
        fsa var9 = null;
        fsa var10 = null;
        fsa var11 = null;
        fsa var12 = null;
        fsa var13 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        super.f(param0 ^ 0);
        if (null == ((aka) this).field_C) {
          return;
        } else {
          L0: {
            var2 = ((aka) this).a(true) ? 1 : 0;
            var3 = ((aka) this).b(false);
            var4 = 1;
            var5_int = ((aka) this).field_x;
            if (0 != var5_int) {
              break L0;
            } else {
              L1: {
                if (var2 != 0) {
                  break L1;
                } else {
                  if (-6 > (var3 ^ -1)) {
                    var4 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              ((aka) this).field_C.a(1, false, (byte) -114, var4);
              break L0;
            }
          }
          ((aka) this).field_C.a(param0 ^ param0);
          var5 = (w) (Object) ((aka) this).field_h.f((byte) -79).field_G;
          if (var5 != null) {
            if (var4 != -2) {
              L2: {
                ((aka) this).field_z = 0;
                if (((aka) this).field_y) {
                  break L2;
                } else {
                  if (((aka) this).field_h.j(-1)) {
                    fla discarded$7 = var5.a(new fm(79, ((aka) this).b((byte) -112), ((aka) this).c((byte) 121), ((aka) this).e((byte) -119)), param0 + 4308);
                    ((aka) this).field_y = true;
                    break L2;
                  } else {
                    var12 = (fsa) (Object) ((aka) this).field_h;
                    if (var12 == null) {
                      return;
                    } else {
                      L3: {
                        var7 = var12.a((byte) 110, var12.H(param0 ^ -4445).e(param0 ^ -13502), var12.H(66).d(param0 ^ -4367), var12.H(-128).a((byte) 55), var12.H(-120).c(-125)) ? 1 : 0;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          if (!((aka) this).field_w) {
                            fla discarded$8 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
                            ((aka) this).field_w = true;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (var7 != 0) {
                          break L4;
                        } else {
                          if (!((aka) this).field_w) {
                            break L4;
                          } else {
                            ((aka) this).field_w = false;
                            break L4;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              var13 = (fsa) (Object) ((aka) this).field_h;
              if (var13 != null) {
                L5: {
                  var7 = var13.a((byte) 110, var13.H(param0 ^ -4445).e(param0 ^ -13502), var13.H(66).d(param0 ^ -4367), var13.H(-128).a((byte) 55), var13.H(-120).c(-125)) ? 1 : 0;
                  if (var7 == 0) {
                    break L5;
                  } else {
                    if (!((aka) this).field_w) {
                      fla discarded$9 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
                      ((aka) this).field_w = true;
                      break L5;
                    } else {
                      L6: {
                        if (var7 != 0) {
                          break L6;
                        } else {
                          if (!((aka) this).field_w) {
                            break L6;
                          } else {
                            ((aka) this).field_w = false;
                            break L6;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (var7 == 0) {
                  if (!((aka) this).field_w) {
                    return;
                  } else {
                    ((aka) this).field_w = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (-21 == ((aka) this).field_z) {
                L7: {
                  fla discarded$10 = var5.a(new fm(77, ((aka) this).b((byte) 49), ((aka) this).c((byte) 108), ((aka) this).e((byte) -87)), -58);
                  ((aka) this).field_z = 0;
                  if (((aka) this).field_y) {
                    break L7;
                  } else {
                    if (((aka) this).field_h.j(-1)) {
                      fla discarded$11 = var5.a(new fm(79, ((aka) this).b((byte) -112), ((aka) this).c((byte) 121), ((aka) this).e((byte) -119)), param0 + 4308);
                      ((aka) this).field_y = true;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                var11 = (fsa) (Object) ((aka) this).field_h;
                if (var11 == null) {
                  return;
                } else {
                  L8: {
                    var7 = var11.a((byte) 110, var11.H(param0 ^ -4445).e(param0 ^ -13502), var11.H(66).d(param0 ^ -4367), var11.H(-128).a((byte) 55), var11.H(-120).c(-125)) ? 1 : 0;
                    if (var7 == 0) {
                      if (var7 != 0) {
                        break L8;
                      } else {
                        if (!((aka) this).field_w) {
                          break L8;
                        } else {
                          ((aka) this).field_w = false;
                          break L8;
                        }
                      }
                    } else {
                      if (var7 != 0) {
                        break L8;
                      } else {
                        if (!((aka) this).field_w) {
                          break L8;
                        } else {
                          ((aka) this).field_w = false;
                          break L8;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                ((aka) this).field_z = ((aka) this).field_z + 1;
                if (!((aka) this).field_y) {
                  L9: {
                    if (((aka) this).field_h.j(-1)) {
                      fla discarded$12 = var5.a(new fm(79, ((aka) this).b((byte) -112), ((aka) this).c((byte) 121), ((aka) this).e((byte) -119)), param0 + 4308);
                      ((aka) this).field_y = true;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var10 = (fsa) (Object) ((aka) this).field_h;
                  if (var10 != null) {
                    var7 = var10.a((byte) 110, var10.H(param0 ^ -4445).e(param0 ^ -13502), var10.H(66).d(param0 ^ -4367), var10.H(-128).a((byte) 55), var10.H(-120).c(-125)) ? 1 : 0;
                    if (var7 == 0) {
                      L10: {
                        if (!((aka) this).field_w) {
                          break L10;
                        } else {
                          ((aka) this).field_w = false;
                          break L10;
                        }
                      }
                      return;
                    } else {
                      L11: {
                        if (!((aka) this).field_w) {
                          fla discarded$13 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
                          ((aka) this).field_w = true;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (var7 != 0) {
                          break L12;
                        } else {
                          if (!((aka) this).field_w) {
                            break L12;
                          } else {
                            ((aka) this).field_w = false;
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  var9 = (fsa) (Object) ((aka) this).field_h;
                  if (var9 == null) {
                    return;
                  } else {
                    L13: {
                      var7 = var9.a((byte) 110, var9.H(param0 ^ -4445).e(param0 ^ -13502), var9.H(66).d(param0 ^ -4367), var9.H(-128).a((byte) 55), var9.H(-120).c(-125)) ? 1 : 0;
                      if (var7 == 0) {
                        if (var7 != 0) {
                          break L13;
                        } else {
                          if (!((aka) this).field_w) {
                            break L13;
                          } else {
                            ((aka) this).field_w = false;
                            break L13;
                          }
                        }
                      } else {
                        if (var7 != 0) {
                          break L13;
                        } else {
                          if (!((aka) this).field_w) {
                            break L13;
                          } else {
                            ((aka) this).field_w = false;
                            break L13;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final int i(int param0) {
        if (param0 != -6874) {
          return -83;
        } else {
          return dfa.a(-((aka) this).field_h.g(param0 + -18913) >> 744888546, 2048, param0 ^ -6797);
        }
    }

    final void b(int param0, int param1) {
        ((aka) this).field_x = param1;
        if (param0 < 28) {
            ((aka) this).field_z = -120;
        }
    }

    aka(int param0) {
        super(param0);
        ((aka) this).field_w = false;
        ((aka) this).field_z = 0;
        ((aka) this).field_y = false;
    }

    final void a(byte param0, kh param1) {
        super.a((byte) 98, param1);
        param1.a((byte) -5, ((aka) this).field_x, 4);
        int var3 = 102 % ((param0 - -8) / 40);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Blade Launcher";
    }
}
