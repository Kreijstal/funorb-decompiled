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
        if (this.field_C == null) {
            return;
        }
        try {
            int var6_int = 0 % ((-38 - param4) / 47);
            var7 = this.i(-6874);
            var8 = this.field_C.a(false, -1, false, (byte) 1);
            gqa.a(var7, -83584144, param1, param2, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aka.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
            return;
        }
        try {
            super.a(123, param1, param2);
            this.field_x = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aka.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        fla discarded$3 = null;
        fla discarded$4 = null;
        fla discarded$5 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        w var5 = null;
        nta var6 = null;
        super.a((byte) 51, param1);
        if (null != this.field_C) {
          L0: {
            var4 = 2 / ((7 - param0) / 36);
            var3 = 0;
            var5_int = this.field_x;
            if (-1 != (var5_int ^ -1)) {
              break L0;
            } else {
              if ((param1 ^ -1) == -5) {
                return;
              } else {
                this.field_C.a(6, -23308, 1);
                var3 = -1;
                this.field_C.a(1, true, (byte) -101, 3);
                break L0;
              }
            }
          }
          L1: {
            if (-1 == (var3 ^ -1)) {
              break L1;
            } else {
              var5_int = this.i(-6874);
              var6 = new nta(this.b((byte) 40), this.c((byte) 123), this.e((byte) -96), this.field_C, var5_int, var3);
              var6.a((byte) -113, this.field_h.f((byte) -109).j((byte) -118), this.k((byte) -99));
              break L1;
            }
          }
          var5 = (w) ((Object) this.field_h.f((byte) -99).field_G);
          if (var5 == null) {
            return;
          } else {
            if (param1 != 3) {
              if (param1 == 2) {
                discarded$3 = var5.a(new fm(80, this.b((byte) 90), this.c((byte) 94), this.e((byte) -108)), -58);
                return;
              } else {
                return;
              }
            } else {
              discarded$4 = var5.a(new fm(78, this.b((byte) 71), this.c((byte) 106), this.e((byte) -91)), -58);
              if (TombRacer.field_G) {
                if (param1 != 2) {
                  return;
                } else {
                  discarded$5 = var5.a(new fm(80, this.b((byte) 90), this.c((byte) 94), this.e((byte) -108)), -58);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void o(byte param0) {
        if (param0 <= 80) {
            field_A = (String) null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    final void a(uw param0, int param1) {
        try {
            if (param1 < 82) {
                this.field_C = (bua) null;
            }
            super.a(param0, 93);
            this.field_C = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aka.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
              var3_int = this.field_x;
              if (var3_int == 0) {
                this.field_C = new bua(6, 0, 0);
                this.field_C.a(1, true, (byte) -121, 1);
                this.field_C.a(false, 176);
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
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("aka.WA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void j(int param0) {
        if (param0 != 28191) {
            return;
        }
        jo.a(oba.field_f, 0, kua.field_i, rfa.field_C, lma.field_r);
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aka.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    aka(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_w = false;
        this.field_z = 0;
        this.field_y = false;
    }

    public final void f(int param0) {
        fla discarded$14 = null;
        fla discarded$15 = null;
        fla discarded$16 = null;
        fla discarded$17 = null;
        fla discarded$18 = null;
        fla discarded$19 = null;
        fla discarded$20 = null;
        fla discarded$21 = null;
        fla discarded$22 = null;
        fla discarded$23 = null;
        fla discarded$24 = null;
        fla discarded$25 = null;
        fla discarded$26 = null;
        fla discarded$27 = null;
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
        fsa var14 = null;
        fsa var15 = null;
        Object var16 = null;
        fsa var16_ref = null;
        Object var17 = null;
        fsa var17_ref = null;
        var16 = null;
        var17 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        super.f(param0 ^ 0);
        if (null == this.field_C) {
          return;
        } else {
          L0: {
            var2 = this.a(true) ? 1 : 0;
            var3 = this.b(false);
            var4 = 1;
            var5_int = this.field_x;
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
              this.field_C.a(1, false, (byte) -114, var4);
              break L0;
            }
          }
          this.field_C.a(param0 ^ param0);
          var5 = (w) ((Object) this.field_h.f((byte) -79).field_G);
          if (var5 != null) {
            if ((var4 ^ -1) != -2) {
              L2: {
                this.field_z = 0;
                if (this.field_y) {
                  break L2;
                } else {
                  if (this.field_h.j(-1)) {
                    discarded$14 = var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
                    this.field_y = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var13 = (fsa) ((Object) this.field_h);
              if (var13 == null) {
                return;
              } else {
                L3: {
                  var7 = var13.a((byte) 110, var13.H(param0 ^ -4445).e(param0 ^ -13502), var13.H(66).d(param0 ^ -4367), var13.H(-128).a((byte) 55), var13.H(-120).c(-125)) ? 1 : 0;
                  if (var7 == 0) {
                    break L3;
                  } else {
                    if (!this.field_w) {
                      discarded$15 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                      this.field_w = true;
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
                    if (!this.field_w) {
                      break L4;
                    } else {
                      this.field_w = false;
                      break L4;
                    }
                  }
                }
                return;
              }
            } else {
              if (-21 == (this.field_z ^ -1)) {
                discarded$16 = var5.a(new fm(77, this.b((byte) 49), this.c((byte) 108), this.e((byte) -87)), -58);
                this.field_z = 0;
                if (var8 == 0) {
                  L5: {
                    if (this.field_y) {
                      break L5;
                    } else {
                      if (this.field_h.j(-1)) {
                        discarded$17 = var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
                        this.field_y = true;
                        break L5;
                      } else {
                        var16_ref = (fsa) ((Object) this.field_h);
                        if (var16_ref != null) {
                          L6: {
                            var7 = var16_ref.a((byte) 110, var16_ref.H(param0 ^ -4445).e(param0 ^ -13502), var16_ref.H(66).d(param0 ^ -4367), var16_ref.H(-128).a((byte) 55), var16_ref.H(-120).c(-125)) ? 1 : 0;
                            if (var7 == 0) {
                              break L6;
                            } else {
                              if (!this.field_w) {
                                discarded$18 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                                this.field_w = true;
                                break L6;
                              } else {
                                L7: {
                                  if (var7 != 0) {
                                    break L7;
                                  } else {
                                    if (!this.field_w) {
                                      break L7;
                                    } else {
                                      this.field_w = false;
                                      break L7;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                          if (var7 == 0) {
                            if (this.field_w) {
                              this.field_w = false;
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
                      }
                    }
                  }
                  var17_ref = (fsa) ((Object) this.field_h);
                  if (var17_ref != null) {
                    L8: {
                      var7 = var17_ref.a((byte) 110, var17_ref.H(param0 ^ -4445).e(param0 ^ -13502), var17_ref.H(66).d(param0 ^ -4367), var17_ref.H(-128).a((byte) 55), var17_ref.H(-120).c(-125)) ? 1 : 0;
                      if (var7 == 0) {
                        break L8;
                      } else {
                        if (!this.field_w) {
                          discarded$19 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                          this.field_w = true;
                          break L8;
                        } else {
                          L9: {
                            if (var7 != 0) {
                              break L9;
                            } else {
                              if (!this.field_w) {
                                break L9;
                              } else {
                                this.field_w = false;
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L10: {
                      if (var7 != 0) {
                        break L10;
                      } else {
                        if (!this.field_w) {
                          break L10;
                        } else {
                          this.field_w = false;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L11: {
                    this.field_z = 0;
                    if (this.field_y) {
                      break L11;
                    } else {
                      if (this.field_h.j(-1)) {
                        discarded$20 = var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
                        this.field_y = true;
                        break L11;
                      } else {
                        var14 = (fsa) ((Object) this.field_h);
                        if (var14 == null) {
                          return;
                        } else {
                          L12: {
                            var7 = var14.a((byte) 110, var14.H(param0 ^ -4445).e(param0 ^ -13502), var14.H(66).d(param0 ^ -4367), var14.H(-128).a((byte) 55), var14.H(-120).c(-125)) ? 1 : 0;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              if (!this.field_w) {
                                discarded$21 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                                this.field_w = true;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (var7 != 0) {
                              break L13;
                            } else {
                              if (!this.field_w) {
                                break L13;
                              } else {
                                this.field_w = false;
                                break L13;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  var15 = (fsa) ((Object) this.field_h);
                  if (var15 != null) {
                    L14: {
                      var7 = var15.a((byte) 110, var15.H(param0 ^ -4445).e(param0 ^ -13502), var15.H(66).d(param0 ^ -4367), var15.H(-128).a((byte) 55), var15.H(-120).c(-125)) ? 1 : 0;
                      if (var7 == 0) {
                        break L14;
                      } else {
                        if (!this.field_w) {
                          discarded$22 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                          this.field_w = true;
                          break L14;
                        } else {
                          L15: {
                            if (var7 != 0) {
                              break L15;
                            } else {
                              if (!this.field_w) {
                                break L15;
                              } else {
                                this.field_w = false;
                                break L15;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (var7 == 0) {
                      if (!this.field_w) {
                        return;
                      } else {
                        this.field_w = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                this.field_z = this.field_z + 1;
                if (var8 != 0) {
                  L16: {
                    discarded$23 = var5.a(new fm(77, this.b((byte) 49), this.c((byte) 108), this.e((byte) -87)), -58);
                    this.field_z = 0;
                    if (var8 == 0) {
                      break L16;
                    } else {
                      this.field_z = 0;
                      break L16;
                    }
                  }
                  if (!this.field_y) {
                    L17: {
                      if (this.field_h.j(-1)) {
                        discarded$24 = var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
                        this.field_y = true;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    var12 = (fsa) ((Object) this.field_h);
                    if (var12 == null) {
                      return;
                    } else {
                      L18: {
                        var7 = var12.a((byte) 110, var12.H(param0 ^ -4445).e(param0 ^ -13502), var12.H(66).d(param0 ^ -4367), var12.H(-128).a((byte) 55), var12.H(-120).c(-125)) ? 1 : 0;
                        if (var7 == 0) {
                          break L18;
                        } else {
                          if (!this.field_w) {
                            discarded$25 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                            this.field_w = true;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var7 != 0) {
                          break L19;
                        } else {
                          if (!this.field_w) {
                            break L19;
                          } else {
                            this.field_w = false;
                            break L19;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    var11 = (fsa) ((Object) this.field_h);
                    if (var11 == null) {
                      return;
                    } else {
                      L20: {
                        var7 = var11.a((byte) 110, var11.H(param0 ^ -4445).e(param0 ^ -13502), var11.H(66).d(param0 ^ -4367), var11.H(-128).a((byte) 55), var11.H(-120).c(-125)) ? 1 : 0;
                        if (var7 == 0) {
                          if (var7 != 0) {
                            break L20;
                          } else {
                            if (!this.field_w) {
                              break L20;
                            } else {
                              this.field_w = false;
                              break L20;
                            }
                          }
                        } else {
                          if (var7 != 0) {
                            break L20;
                          } else {
                            if (!this.field_w) {
                              break L20;
                            } else {
                              this.field_w = false;
                              break L20;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L21: {
                    if (this.field_y) {
                      break L21;
                    } else {
                      if (this.field_h.j(-1)) {
                        discarded$26 = var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
                        this.field_y = true;
                        break L21;
                      } else {
                        var9 = (fsa) ((Object) this.field_h);
                        if (var9 == null) {
                          return;
                        } else {
                          L22: {
                            var7 = var9.a((byte) 110, var9.H(param0 ^ -4445).e(param0 ^ -13502), var9.H(66).d(param0 ^ -4367), var9.H(-128).a((byte) 55), var9.H(-120).c(-125)) ? 1 : 0;
                            if (var7 == 0) {
                              if (var7 != 0) {
                                break L22;
                              } else {
                                if (!this.field_w) {
                                  break L22;
                                } else {
                                  this.field_w = false;
                                  break L22;
                                }
                              }
                            } else {
                              if (var7 != 0) {
                                break L22;
                              } else {
                                if (!this.field_w) {
                                  break L22;
                                } else {
                                  this.field_w = false;
                                  break L22;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  var10 = (fsa) ((Object) this.field_h);
                  if (var10 != null) {
                    L23: {
                      var7 = var10.a((byte) 110, var10.H(param0 ^ -4445).e(param0 ^ -13502), var10.H(66).d(param0 ^ -4367), var10.H(-128).a((byte) 55), var10.H(-120).c(-125)) ? 1 : 0;
                      if (var7 == 0) {
                        break L23;
                      } else {
                        if (!this.field_w) {
                          discarded$27 = var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                          this.field_w = true;
                          break L23;
                        } else {
                          L24: {
                            if (var7 != 0) {
                              break L24;
                            } else {
                              if (!this.field_w) {
                                break L24;
                              } else {
                                this.field_w = false;
                                break L24;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (var7 == 0) {
                      if (this.field_w) {
                        this.field_w = false;
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
          return dfa.a(-this.field_h.g(param0 + -18913) >> 744888546, 2048, param0 ^ -6797);
        }
    }

    final void b(int param0, int param1) {
        this.field_x = param1;
        if (param0 < 28) {
            this.field_z = -120;
        }
    }

    aka(int param0) {
        super(param0);
        this.field_w = false;
        this.field_z = 0;
        this.field_y = false;
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 98, param1);
            param1.a((byte) -5, this.field_x, 4);
            int var3_int = 102 % ((param0 - -8) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_A = "Blade Launcher";
    }
}
