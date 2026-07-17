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
        int var7 = 0;
        ka var8 = null;
        if (((aka) this).field_C == null) {
            return;
        }
        try {
            int var6_int = 0 % ((-38 - param4) / 47);
            var7 = this.i(-6874);
            var8 = ((aka) this).field_C.a(false, -1, false, (byte) 1);
            gqa.a(var7, -83584144, param1, param2, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aka.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
            return;
        }
        try {
            super.a(123, param1, param2);
            ((aka) this).field_x = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aka.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
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
            if (var5_int != 0) {
              break L0;
            } else {
              if (param1 == 4) {
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
            if (var3 == 0) {
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
        field_A = null;
    }

    final void a(uw param0, int param1) {
        try {
            if (param1 < 82) {
                ((aka) this).field_C = null;
            }
            super.a(param0, 93);
            ((aka) this).field_C = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aka.RA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0, uw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.b(param0 ^ param0, param1);
              var3_int = ((aka) this).field_x;
              if (var3_int == 0) {
                ((aka) this).field_C = new bua(6, 0, 0);
                ((aka) this).field_C.a(1, true, (byte) -121, 1);
                ((aka) this).field_C.a(false, 176);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("aka.WA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static void j(int param0) {
        jo.a(oba.field_f, 0, kua.field_i, rfa.field_C, lma.field_r);
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aka.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
        super.f(param0);
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
                  if (var3 > 5) {
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
            if (var4 != 1) {
              L2: {
                ((aka) this).field_z = 0;
                if (((aka) this).field_y) {
                  break L2;
                } else {
                  if (((aka) this).field_h.j(-1)) {
                    fla discarded$9 = var5.a(new fm(79, ((aka) this).b((byte) -112), ((aka) this).c((byte) 121), ((aka) this).e((byte) -119)), param0 + 4308);
                    ((aka) this).field_y = true;
                    break L2;
                  } else {
                    var12 = (fsa) (Object) ((aka) this).field_h;
                    if (var12 != null) {
                      L3: {
                        var7 = var12.a((byte) 110, var12.H(param0 ^ -4445).e(param0 ^ -13502), var12.H(66).d(param0 ^ -4367), var12.H(-128).a((byte) 55), var12.H(-120).c(-125)) ? 1 : 0;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          if (!((aka) this).field_w) {
                            fla discarded$10 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
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
                    } else {
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
                      fla discarded$11 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
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
                  if (((aka) this).field_w) {
                    ((aka) this).field_w = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((aka) this).field_z == 20) {
                L7: {
                  fla discarded$12 = var5.a(new fm(77, ((aka) this).b((byte) 49), ((aka) this).c((byte) 108), ((aka) this).e((byte) -87)), -58);
                  ((aka) this).field_z = 0;
                  if (((aka) this).field_y) {
                    break L7;
                  } else {
                    if (((aka) this).field_h.j(-1)) {
                      fla discarded$13 = var5.a(new fm(79, ((aka) this).b((byte) -112), ((aka) this).c((byte) 121), ((aka) this).e((byte) -119)), param0 + 4308);
                      ((aka) this).field_y = true;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                var11 = (fsa) (Object) ((aka) this).field_h;
                if (var11 != null) {
                  L8: {
                    var7 = var11.a((byte) 110, var11.H(param0 ^ -4445).e(param0 ^ -13502), var11.H(66).d(param0 ^ -4367), var11.H(-128).a((byte) 55), var11.H(-120).c(-125)) ? 1 : 0;
                    if (var7 == 0) {
                      break L8;
                    } else {
                      if (!((aka) this).field_w) {
                        fla discarded$14 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
                        ((aka) this).field_w = true;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var7 != 0) {
                      break L9;
                    } else {
                      if (!((aka) this).field_w) {
                        break L9;
                      } else {
                        ((aka) this).field_w = false;
                        break L9;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ((aka) this).field_z = ((aka) this).field_z + 1;
                if (!((aka) this).field_y) {
                  L10: {
                    if (((aka) this).field_h.j(-1)) {
                      fla discarded$15 = var5.a(new fm(79, ((aka) this).b((byte) -112), ((aka) this).c((byte) 121), ((aka) this).e((byte) -119)), param0 + 4308);
                      ((aka) this).field_y = true;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var10 = (fsa) (Object) ((aka) this).field_h;
                  if (var10 != null) {
                    var7 = var10.a((byte) 110, var10.H(param0 ^ -4445).e(param0 ^ -13502), var10.H(66).d(param0 ^ -4367), var10.H(-128).a((byte) 55), var10.H(-120).c(-125)) ? 1 : 0;
                    if (var7 != 0) {
                      L11: {
                        if (!((aka) this).field_w) {
                          fla discarded$16 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
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
                    } else {
                      L13: {
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
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  var9 = (fsa) (Object) ((aka) this).field_h;
                  if (var9 != null) {
                    L14: {
                      var7 = var9.a((byte) 110, var9.H(param0 ^ -4445).e(param0 ^ -13502), var9.H(66).d(param0 ^ -4367), var9.H(-128).a((byte) 55), var9.H(-120).c(-125)) ? 1 : 0;
                      if (var7 == 0) {
                        break L14;
                      } else {
                        if (!((aka) this).field_w) {
                          fla discarded$17 = var5.a(new fm(81, ((aka) this).b((byte) 56), ((aka) this).c((byte) 99), ((aka) this).e((byte) -117)), -58);
                          ((aka) this).field_w = true;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var7 != 0) {
                        break L15;
                      } else {
                        if (!((aka) this).field_w) {
                          break L15;
                        } else {
                          ((aka) this).field_w = false;
                          break L15;
                        }
                      }
                    }
                    return;
                  } else {
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
        return dfa.a(-((aka) this).field_h.g(-25787) >> 2, 2048, 85);
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
        try {
            super.a((byte) 98, param1);
            param1.a((byte) -5, ((aka) this).field_x, 4);
            int var3_int = 102 % ((param0 - -8) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aka.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Blade Launcher";
    }
}
