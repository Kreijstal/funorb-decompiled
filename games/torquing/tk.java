/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk extends lg {
    private long field_E;
    private int field_C;
    private int field_I;
    private boolean field_F;
    private int field_D;
    private long field_H;
    private boolean field_J;
    private int field_G;

    private final void f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 2 / ((param0 - 58) / 50);
        if (!(((tk) this).field_G == ((tk) this).field_C)) {
            var3 = ((tk) this).field_G <= ((tk) this).field_C ? ((tk) this).field_G : ((tk) this).field_C;
            var4 = ((tk) this).field_C < ((tk) this).field_G ? ((tk) this).field_G : ((tk) this).field_C;
            ((tk) this).field_G = var3;
            ((tk) this).field_C = var3;
            ((tk) this).field_m = ((tk) this).field_m.substring(0, var3) + ((tk) this).field_m.substring(var4, ((tk) this).field_m.length());
            ((tk) this).l(121);
        }
    }

    private final void j(int param0) {
        if (param0 < 59) {
            ((tk) this).i((byte) 122);
        }
        if (((tk) this).field_t instanceof wm) {
            ((wm) (Object) ((tk) this).field_t).a((tk) this, (byte) -124);
        }
    }

    private final void a(boolean param0) {
        uj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fe var9 = null;
        var8 = Torquing.field_u;
        if (!((tk) this).field_J) {
          ((tk) this).field_j = 0;
          ((tk) this).field_v = 0;
          return;
        } else {
          if (((tk) this).field_q instanceof fe) {
            var9 = (fe) (Object) ((tk) this).field_q;
            var3 = var9.b((byte) 105, (gm) this);
            var4 = var3.a(param0);
            var5 = var9.b((gm) this, -1);
            var6 = var9.a(false) >> -607291775;
            if (var4 < -var6 + var5) {
              ((tk) this).field_v = 0;
              ((tk) this).field_j = 0;
              return;
            } else {
              L0: {
                var7 = ((tk) this).field_j + var3.a(((tk) this).field_G, (byte) -126);
                if (var7 > var5 + -var6) {
                  ((tk) this).field_j = ((tk) this).field_j - (-var5 + var6) - var7;
                  break L0;
                } else {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    ((tk) this).field_j = ((tk) this).field_j + var6 + -var7;
                    break L0;
                  }
                }
              }
              L1: {
                if (-1 <= (((tk) this).field_j ^ -1)) {
                  if (((tk) this).field_j < var6 + -var5) {
                    ((tk) this).field_j = var6 + -var5;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((tk) this).field_j = 0;
                  break L1;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = Torquing.field_u;
          if (param1 < 0) {
            break L0;
          } else {
            if (param3 < be.field_f) {
              if (param8 >= 113) {
                L1: {
                  if (0 <= param0) {
                    break L1;
                  } else {
                    if (param4 >= 0) {
                      break L1;
                    } else {
                      if (0 <= param7) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L2: {
                  if (be.field_p > param0) {
                    break L2;
                  } else {
                    if (be.field_p > param4) {
                      break L2;
                    } else {
                      if (be.field_p > param7) {
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L3: {
                  L4: {
                    var14 = -param3 + param1;
                    if (param3 != param5) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (param1 != param3) {
                            break L6;
                          } else {
                            var10 = param4 << 8450896;
                            var11 = 0;
                            var12 = 0;
                            var9 = param0 << 460012624;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var15 = -param5 + param1;
                          if (param0 < param4) {
                            break L7;
                          } else {
                            var11 = (param7 - param4 << 961557744) / var15;
                            var12 = (param7 - param0 << -236656752) / var14;
                            var10 = param0 << -1712140560;
                            var9 = param4 << 860385008;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var10 = param4 << 1383135312;
                        var12 = (param7 - param4 << 1927786832) / var15;
                        var9 = param0 << -1664006000;
                        var11 = (param7 - param0 << -157038608) / var14;
                        break L5;
                      }
                      L8: {
                        if (param3 >= 0) {
                          break L8;
                        } else {
                          param3 = Math.min(-param3, param5 - param3);
                          var9 = var9 + param3 * var11;
                          var10 = var10 + var12 * param3;
                          param3 = 0;
                          break L8;
                        }
                      }
                      var13 = 0;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      var10 = param0 << -285005520;
                      var9 = param0 << -285005520;
                      var15 = -param3 + param5;
                      var11 = (-param0 + param4 << -1838223984) / var15;
                      var12 = (-param0 + param7 << -1546429328) / var14;
                      if (var12 > var11) {
                        break L10;
                      } else {
                        var16 = var11;
                        var11 = var12;
                        var12 = var16;
                        var13 = 1;
                        if (0 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var13 = 0;
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (param3 >= 0) {
                        break L12;
                      } else {
                        L13: {
                          if (0 > param5) {
                            break L13;
                          } else {
                            param3 = -param3;
                            var9 = var9 + var11 * param3;
                            var10 = var10 + var12 * param3;
                            param3 = 0;
                            if (0 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param3 = param5 + -param3;
                        var9 = var9 + var11 * param3;
                        var10 = var10 + var12 * param3;
                        param3 = param5;
                        if (0 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var16 = be.field_n[param3];
                    L14: while (true) {
                      if (param3 >= param5) {
                        break L11;
                      } else {
                        L15: {
                          var17 = var9 >> 1982585264;
                          if ((be.field_p ^ -1) >= (var17 ^ -1)) {
                            break L15;
                          } else {
                            L16: {
                              var18 = -(var9 >> -610765008) + (var10 >> -599745488);
                              if (0 != var18) {
                                break L16;
                              } else {
                                if (var17 < 0) {
                                  break L15;
                                } else {
                                  if (var17 >= be.field_p) {
                                    break L15;
                                  } else {
                                    tm.a(var18, var17 - -var16, -104, param6, param2);
                                    if (0 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                            L17: {
                              if (be.field_p > var17 - -var18) {
                                break L17;
                              } else {
                                var18 = -1 + (be.field_p - var17);
                                break L17;
                              }
                            }
                            L18: {
                              if (var17 >= 0) {
                                break L18;
                              } else {
                                tm.a(var18 - -var17, var16, -114, param6, param2);
                                if (0 == 0) {
                                  break L15;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            tm.a(var18, var16 + var17, -98, param6, param2);
                            break L15;
                          }
                        }
                        param3++;
                        if (be.field_f > param3) {
                          var9 = var9 + var11;
                          var16 = var16 + ph.field_j;
                          var10 = var10 + var12;
                          if (0 == 0) {
                            continue L14;
                          } else {
                            break L11;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L19: {
                    var16 = -param5 + param1;
                    if (0 != var16) {
                      break L19;
                    } else {
                      var12 = 0;
                      var11 = 0;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L19;
                      }
                    }
                  }
                  L20: {
                    L21: {
                      var17 = param7 << 1460410320;
                      if (var13 == 0) {
                        break L21;
                      } else {
                        var10 = param4 << -1843624688;
                        if (0 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var9 = param4 << -1353075280;
                    break L20;
                  }
                  var12 = (var17 - var10) / var16;
                  var11 = (-var9 + var17) / var16;
                  break L3;
                }
                L22: {
                  if (param3 < 0) {
                    param3 = -param3;
                    var9 = var9 + param3 * var11;
                    var10 = var10 + param3 * var12;
                    param3 = 0;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                var15 = be.field_n[param3];
                if (param1 > param3) {
                  L23: {
                    var16 = var9 >> 485434512;
                    if (be.field_p <= var16) {
                      break L23;
                    } else {
                      L24: {
                        var17 = (var10 >> -2009257072) - (var9 >> -1961568048);
                        if (0 == var17) {
                          break L24;
                        } else {
                          L25: {
                            if (var17 + var16 < be.field_p) {
                              break L25;
                            } else {
                              var17 = be.field_p + -var16 + -1;
                              break L25;
                            }
                          }
                          L26: {
                            if (0 <= var16) {
                              break L26;
                            } else {
                              tm.a(var17 + var16, var15, -123, param6, param2);
                              if (0 == 0) {
                                break L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                          tm.a(var17, var16 + var15, -114, param6, param2);
                          if (0 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      if (var16 < 0) {
                        break L23;
                      } else {
                        if (var16 >= be.field_p) {
                          break L23;
                        } else {
                          tm.a(var17, var16 - -var15, -98, param6, param2);
                          break L23;
                        }
                      }
                    }
                  }
                  param3++;
                  if (param3 >= be.field_f) {
                    return;
                  } else {
                    var9 = var9 + var11;
                    var10 = var10 + var12;
                    var15 = var15 + ph.field_j;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        if (!(param1 != null)) {
            param1 = "";
        }
        if (!param2) {
            ((tk) this).field_F = false;
        }
        ((tk) this).field_m = param1;
        int var4 = param1.length();
        if (((tk) this).field_I != -1) {
            if (!(var4 <= ((tk) this).field_I)) {
                ((tk) this).field_m = ((tk) this).field_m.substring(0, ((tk) this).field_I);
            }
        }
        int dupTemp$0 = ((tk) this).field_m.length();
        ((tk) this).field_C = dupTemp$0;
        ((tk) this).field_G = dupTemp$0;
        if (!param0) {
            ((tk) this).l(-120);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Torquing.field_u;
          ph.b(param1, param0, 1 + param3, 10000536);
          ph.b(param1, param0 - -param2, 1 + param3, 12105912);
          var5 = 1;
          var6 = param2;
          if (var5 + param0 >= ph.field_c) {
            break L0;
          } else {
            var5 = -param0 + ph.field_c;
            break L0;
          }
        }
        L1: {
          if (param0 - -var6 <= ph.field_h) {
            break L1;
          } else {
            var6 = -param0 + ph.field_h;
            break L1;
          }
        }
        if (param4) {
          return;
        } else {
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param2);
              var9 = var8 << -1416118936 | var8 << -1092572368 | var8;
              ph.field_e[param1 + ph.field_j * (param0 + var7)] = var9;
              ph.field_e[param3 + param1 + (param0 - -var7) * ph.field_j] = var9;
              var7++;
              continue L2;
            }
          }
        }
    }

    tk(String param0, ca param1, int param2) {
        super(param0, param1);
        ((tk) this).field_E = 0L;
        ((tk) this).field_F = false;
        ((tk) this).field_D = -1;
        ((tk) this).field_q = ah.field_c.field_g;
        ((tk) this).field_I = param2;
        ((tk) this).a(true, param0, true);
        ((tk) this).field_J = true;
        ((tk) this).field_H = km.b(-1);
    }

    private final String n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 1) {
          return null;
        } else {
          L0: {
            if (((tk) this).field_G <= ((tk) this).field_C) {
              stackOut_3_0 = ((tk) this).field_G;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((tk) this).field_C;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (((tk) this).field_C < ((tk) this).field_G) {
              stackOut_6_0 = ((tk) this).field_G;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((tk) this).field_C;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((tk) this).field_m.substring(var2, var3);
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        var2 = ((tk) this).field_m.length();
        if (var2 == ((tk) this).field_G) {
          return ((tk) this).field_G;
        } else {
          var3 = ((tk) this).field_G + 1;
          L0: while (true) {
            L1: {
              if (var2 <= var3) {
                break L1;
              } else {
                if (((tk) this).field_m.charAt(var3 + -1) == 32) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            if (param0 <= 45) {
              return 26;
            } else {
              return var3;
            }
          }
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        fe var7 = null;
        int var6 = 0;
        super.a(124, param1, param2, param3);
        this.a(true);
        if (-2 == (((tk) this).field_l ^ -1)) {
            if (!(!(((tk) this).field_q instanceof fe))) {
                var7 = (fe) (Object) ((tk) this).field_q;
                var6 = var7.a(k.field_e, -1, (gm) this, n.field_t, param2, param3);
                if ((var6 ^ -1) != 0) {
                    if (((tk) this).field_F) {
                        if (((tk) this).field_D > var6) {
                            if (((tk) this).field_C < var6) {
                                var6 = ((tk) this).field_D;
                            }
                        }
                    }
                    ((tk) this).field_G = var6;
                }
            }
            ((tk) this).field_H = km.b(-1);
        }
        int var5 = -127 / ((-28 - param0) / 43);
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        ((tk) this).field_H = km.b(-1);
        if (param2 == 60) {
          return false;
        } else {
          if (62 != param2) {
            L0: {
              if (param2 < 32) {
                break L0;
              } else {
                if (param2 <= 126) {
                  L1: {
                    if (((tk) this).field_G == ((tk) this).field_C) {
                      break L1;
                    } else {
                      this.f((byte) 127);
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if ((((tk) this).field_I ^ -1) == 0) {
                        break L3;
                      } else {
                        if (((tk) this).field_m.length() < ((tk) this).field_I) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if ((((tk) this).field_G ^ -1) > (((tk) this).field_m.length() ^ -1)) {
                        ((tk) this).field_m = ((tk) this).field_m.substring(0, ((tk) this).field_G) + param2 + ((tk) this).field_m.substring(((tk) this).field_G, ((tk) this).field_m.length());
                        ((tk) this).field_G = ((tk) this).field_G + 1;
                        ((tk) this).field_C = ((tk) this).field_G;
                        break L4;
                      } else {
                        ((tk) this).field_m = ((tk) this).field_m + param2;
                        int dupTemp$1 = ((tk) this).field_m.length();
                        ((tk) this).field_G = dupTemp$1;
                        ((tk) this).field_C = dupTemp$1;
                        break L4;
                      }
                    }
                    ((tk) this).l(106);
                    break L2;
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
            L5: {
              if ((param0 ^ -1) != -86) {
                if (-102 == (param0 ^ -1)) {
                  if ((((tk) this).field_G ^ -1) == (((tk) this).field_C ^ -1)) {
                    if ((((tk) this).field_G ^ -1) > (((tk) this).field_m.length() ^ -1)) {
                      ((tk) this).field_C = ((tk) this).field_G + 1;
                      this.f((byte) -1);
                      return true;
                    } else {
                      break L5;
                    }
                  } else {
                    this.f((byte) 119);
                    return true;
                  }
                } else {
                  if (param0 == 13) {
                    ((tk) this).i((byte) 88);
                    return true;
                  } else {
                    if (param0 == 96) {
                      if (((tk) this).field_G <= 0) {
                        break L5;
                      } else {
                        L6: {
                          stackOut_37_0 = this;
                          stackOut_37_1 = -84;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          if (!i.field_P[82]) {
                            stackOut_39_0 = this;
                            stackOut_39_1 = stackIn_39_1;
                            stackOut_39_2 = ((tk) this).field_G - 1;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            stackIn_40_2 = stackOut_39_2;
                            break L6;
                          } else {
                            stackOut_38_0 = this;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = this.g((byte) -127);
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_40_2 = stackOut_38_2;
                            break L6;
                          }
                        }
                        this.a((byte) stackIn_40_1, stackIn_40_2);
                        return true;
                      }
                    } else {
                      if ((param0 ^ -1) != -98) {
                        if (-103 != (param0 ^ -1)) {
                          if ((param0 ^ -1) != -104) {
                            if (84 != param0) {
                              L7: {
                                if (!i.field_P[82]) {
                                  break L7;
                                } else {
                                  if (param0 != 65) {
                                    break L7;
                                  } else {
                                    this.m(-1);
                                    return true;
                                  }
                                }
                              }
                              L8: {
                                if (!i.field_P[82]) {
                                  break L8;
                                } else {
                                  if ((param0 ^ -1) != -67) {
                                    break L8;
                                  } else {
                                    this.h((byte) 102);
                                    return true;
                                  }
                                }
                              }
                              if (!i.field_P[82]) {
                                break L5;
                              } else {
                                if (param0 != 67) {
                                  break L5;
                                } else {
                                  this.k(-121);
                                  return true;
                                }
                              }
                            } else {
                              this.j(123);
                              return true;
                            }
                          } else {
                            this.a((byte) -78, ((tk) this).field_m.length());
                            return true;
                          }
                        } else {
                          this.a((byte) -62, 0);
                          return true;
                        }
                      } else {
                        if ((((tk) this).field_G ^ -1) <= (((tk) this).field_m.length() ^ -1)) {
                          break L5;
                        } else {
                          L9: {
                            stackOut_17_0 = this;
                            stackOut_17_1 = -49;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if (!i.field_P[82]) {
                              stackOut_19_0 = this;
                              stackOut_19_1 = stackIn_19_1;
                              stackOut_19_2 = ((tk) this).field_G + 1;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              stackIn_20_2 = stackOut_19_2;
                              break L9;
                            } else {
                              stackOut_18_0 = this;
                              stackOut_18_1 = stackIn_18_1;
                              stackOut_18_2 = this.a((byte) 74);
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_20_1 = stackOut_18_1;
                              stackIn_20_2 = stackOut_18_2;
                              break L9;
                            }
                          }
                          this.a((byte) stackIn_20_1, stackIn_20_2);
                          return true;
                        }
                      }
                    }
                  }
                }
              } else {
                if (((tk) this).field_G != ((tk) this).field_C) {
                  this.f((byte) 125);
                  return true;
                } else {
                  if (-1 <= (((tk) this).field_G ^ -1)) {
                    break L5;
                  } else {
                    ((tk) this).field_C = ((tk) this).field_G + -1;
                    this.f((byte) -106);
                    return true;
                  }
                }
              }
            }
            var5 = -27 / ((param3 - -33) / 57);
            return false;
          } else {
            return false;
          }
        }
    }

    private final void h(byte param0) {
        try {
            String var2 = null;
            if (param0 < 91) {
              return;
            } else {
              L0: {
                var2 = this.n(1);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.n(1)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        fe var9 = null;
        long var6 = 0L;
        if (param1 >= -7) {
            Object var8 = null;
            tk.a(-25, -56, 58, 91, 83, 87, (int[]) null, 74, (byte) 44);
        }
        if (null != ((tk) this).field_q) {
            if (!(-1 != (param0 ^ -1))) {
                ((tk) this).field_q.a(114, param2, param3, ((tk) this).field_x, (gm) this);
                if (((tk) this).field_q instanceof fe) {
                    var9 = (fe) (Object) ((tk) this).field_q;
                    if (!(((tk) this).field_G == ((tk) this).field_C)) {
                        var9.a(param3, ((tk) this).field_G, ((tk) this).field_C, -1419356520, param2, (gm) this);
                    }
                    var6 = km.b(-1);
                    if (!((-((tk) this).field_H + var6) % 1000L >= 500L)) {
                        var9.a(param3, (gm) this, ((tk) this).field_G, false, param2);
                    }
                }
            }
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 > -25) {
            return;
        }
        ((tk) this).field_G = param1;
        if (!i.field_P[81]) {
            ((tk) this).field_C = ((tk) this).field_G;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          if (super.a(param0, param1, param2, param3, param4, param5, (byte) 70)) {
            if (!(((tk) this).field_q instanceof fe)) {
              break L0;
            } else {
              L1: {
                var8_int = ((fe) (Object) ((tk) this).field_q).a(k.field_e, -1, (gm) this, n.field_t, param2, param1);
                stackOut_3_0 = this;
                stackOut_3_1 = -94;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if ((var8_int ^ -1) != 0) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = var8_int;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  break L1;
                }
              }
              L2: {
                this.a((byte) stackIn_6_1, stackIn_6_2);
                var8 = km.b(-1);
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (-251L >= (-((tk) this).field_E + var8 ^ -1L)) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                ((tk) this).field_F = stackIn_9_1 != 0;
                if (!((tk) this).field_F) {
                  break L3;
                } else {
                  L4: {
                    ((tk) this).field_C = this.g((byte) -122);
                    ((tk) this).field_G = this.a((byte) 88);
                    if (((tk) this).field_G <= 0) {
                      break L4;
                    } else {
                      if (((tk) this).field_m.charAt(-1 + ((tk) this).field_G) == 32) {
                        ((tk) this).field_G = ((tk) this).field_G - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((tk) this).field_D = ((tk) this).field_G;
                  break L3;
                }
              }
              ((tk) this).field_E = var8;
              return true;
            }
          } else {
            break L0;
          }
        }
        if (param6 < 5) {
          ((tk) this).field_D = -86;
          return false;
        } else {
          return false;
        }
    }

    final void i(byte param0) {
        if (param0 <= 45) {
            ((tk) this).field_I = -75;
        }
        ((tk) this).field_m = "";
        ((tk) this).field_C = 0;
        ((tk) this).field_G = 0;
        ((tk) this).l(-102);
    }

    private final void m(int param0) {
        this.h((byte) 111);
        if (param0 != -1) {
            return;
        }
        this.f((byte) 120);
    }

    void l(int param0) {
        int var2 = -107 % ((param0 - -17) / 63);
        if (!(!(((tk) this).field_t instanceof wm))) {
            ((wm) (Object) ((tk) this).field_t).a(88, (tk) this);
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (-1 != ((tk) this).field_I) {
          var3 = ((tk) this).field_I + -((tk) this).field_m.length();
          if (var3 >= 0) {
            return;
          } else {
            L0: {
              param1 = param1.substring(0, var3);
              if (((tk) this).field_G == ((tk) this).field_m.length()) {
                ((tk) this).field_m = ((tk) this).field_m + param1;
                break L0;
              } else {
                ((tk) this).field_m = ((tk) this).field_m.substring(0, ((tk) this).field_G) + param1 + ((tk) this).field_m.substring(((tk) this).field_G, ((tk) this).field_m.length());
                break L0;
              }
            }
            L1: {
              ((tk) this).field_G = ((tk) this).field_G + param1.length();
              ((tk) this).field_C = ((tk) this).field_G;
              ((tk) this).l(param0 ^ -97);
              if (param0 == 0) {
                break L1;
              } else {
                ((tk) this).field_C = -100;
                break L1;
              }
            }
            return;
          }
        } else {
          L2: {
            if (((tk) this).field_G == ((tk) this).field_m.length()) {
              ((tk) this).field_m = ((tk) this).field_m + param1;
              break L2;
            } else {
              ((tk) this).field_m = ((tk) this).field_m.substring(0, ((tk) this).field_G) + param1 + ((tk) this).field_m.substring(((tk) this).field_G, ((tk) this).field_m.length());
              break L2;
            }
          }
          L3: {
            ((tk) this).field_G = ((tk) this).field_G + param1.length();
            ((tk) this).field_C = ((tk) this).field_G;
            ((tk) this).l(param0 ^ -97);
            if (param0 == 0) {
              break L3;
            } else {
              ((tk) this).field_C = -100;
              break L3;
            }
          }
          return;
        }
    }

    private final void k(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                var3 = -109 / ((46 - param0) / 51);
                this.f((byte) -30);
                this.a(0, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        if (((tk) this).field_G == 0) {
          return ((tk) this).field_G;
        } else {
          var2 = ((tk) this).field_G + -1;
          L0: while (true) {
            L1: {
              if (-1 <= (var2 ^ -1)) {
                break L1;
              } else {
                if (((tk) this).field_m.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 <= -121) {
                break L2;
              } else {
                this.m(52);
                break L2;
              }
            }
            return var2;
          }
        }
    }

    static {
    }
}
