/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    static String[] field_c;
    wd field_o;
    static kg field_b;
    static int field_k;
    wd field_j;
    wd field_g;
    wd field_n;
    int field_l;
    kg field_i;
    long field_h;
    volatile int field_a;
    byte field_d;
    kg field_m;
    volatile int field_e;
    tn field_f;

    final boolean c(int param0) {
        int var2 = -97 % ((31 - param0) / 58);
        return (this.a(-28475) ^ -1) <= -21 ? true : false;
    }

    final int a(int param0) {
        int discarded$2 = 0;
        if (param0 != -28475) {
          discarded$2 = this.c((byte) -99);
          return this.field_o.b(true) + this.field_j.b(true);
        } else {
          return this.field_o.b(true) + this.field_j.b(true);
        }
    }

    public static void b(byte param0) {
        if (param0 != -88) {
            jf.a(97, -16, 45);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final tn a(int param0, boolean param1, int param2, int param3, byte param4) {
        nf[] discarded$1 = null;
        long var6 = 0L;
        tn var8 = null;
        tn stackIn_1_0 = null;
        tn stackIn_2_0 = null;
        tn stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        tn stackOut_0_0 = null;
        tn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        tn stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param3 + ((long)param0 << -1911606496);
          var8 = new tn();
          stackOut_0_0 = (tn) (var8);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (tn) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (tn) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_t = stackIn_3_1 != 0;
        var8.field_r = var6;
        var8.field_z = param4;
        if (param2 == -1911606496) {
          if (!param1) {
            if (this.c((byte) -5) >= 20) {
              throw new RuntimeException();
            } else {
              this.field_g.a(var8, (byte) -22);
              return var8;
            }
          } else {
            if (-21 >= (this.a(-28475) ^ -1)) {
              throw new RuntimeException();
            } else {
              this.field_o.a(var8, (byte) -118);
              return var8;
            }
          }
        } else {
          discarded$1 = jf.a(-99, (byte) -57);
          if (!param1) {
            if (this.c((byte) -5) >= 20) {
              throw new RuntimeException();
            } else {
              this.field_g.a(var8, (byte) -22);
              return var8;
            }
          } else {
            if (-21 >= (this.a(-28475) ^ -1)) {
              throw new RuntimeException();
            } else {
              this.field_o.a(var8, (byte) -118);
              return var8;
            }
          }
        }
    }

    abstract void a(boolean param0);

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -123) {
          L0: {
            this.field_n = (wd) null;
            if (-21 < (this.c((byte) -5) ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.c((byte) -5) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(kg param0, java.math.BigInteger param1, kg param2, int param3, java.math.BigInteger param4) {
        try {
            id.a(param2, param1, 44, param3, param0.field_m, param4, param0.field_n);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jf.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static e a(byte param0, int param1) {
        e[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        e[] var5 = null;
        var4 = Confined.field_J ? 1 : 0;
        var5 = ah.l(20253);
        var2 = var5;
        if (param0 > 123) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param1 != var5[var3].field_e) {
                var3++;
                continue L0;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          return (e) null;
        }
    }

    abstract boolean a(byte param0);

    final int c(byte param0) {
        if (param0 != -5) {
          this.field_h = -5L;
          return this.field_g.b(true) - -this.field_n.b(true);
        } else {
          return this.field_g.b(true) - -this.field_n.b(true);
        }
    }

    abstract void a(boolean param0, Object param1, byte param2);

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        if (0 > tg.field_H) {
          return;
        } else {
          L0: {
            var3 = param1 + -135;
            var4 = -35 + param2;
            var5 = param0;
            if ((tg.field_H ^ -1) <= -76) {
              break L0;
            } else {
              var5 = (tg.field_H << -379549464) / 75;
              break L0;
            }
          }
          L1: {
            if (tg.field_H > 200) {
              var5 = (-tg.field_H + 250 << 1818274440) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          vm.a(mi.field_a, -8409);
          ti.b();
          fn.d();
          of.a(false);
          if ((var5 ^ -1) <= -257) {
            ib.b(false);
            if (-151 >= (tg.field_H ^ -1)) {
              ad.field_b.a(var3 - -15, var4 - -10, var5);
              var6 = tg.field_H + -125;
              if ((var6 ^ -1) < -1) {
                if (50 > var6) {
                  if ((var6 ^ -1) <= -21) {
                    if (var6 >= 30) {
                      L2: {
                        var7 = (-var6 + 50) * 256 / 20;
                        bg.field_c.c(var3, var4, var7);
                        var6 = tg.field_H - 140;
                        if ((var6 ^ -1) >= -1) {
                          break L2;
                        } else {
                          L3: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L3;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L3;
                            }
                          }
                          ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        bg.field_c.c(var3, var4, 256);
                        var6 = tg.field_H - 140;
                        if ((var6 ^ -1) >= -1) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L5;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L5;
                            }
                          }
                          ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      var7 = var6 * 256 / 20;
                      bg.field_c.c(var3, var4, var7);
                      var6 = tg.field_H - 140;
                      if ((var6 ^ -1) >= -1) {
                        break L6;
                      } else {
                        L7: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L7;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L7;
                          }
                        }
                        ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    var6 = tg.field_H - 140;
                    if ((var6 ^ -1) >= -1) {
                      break L8;
                    } else {
                      L9: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L9;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L9;
                        }
                      }
                      ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = tg.field_H - 140;
                  if ((var6 ^ -1) >= -1) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L11;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L11;
                      }
                    }
                    ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                    break L10;
                  }
                }
                return;
              }
            } else {
              mi.field_a.b(var3, var4);
              var6 = tg.field_H + -125;
              if ((var6 ^ -1) < -1) {
                if (50 > var6) {
                  if ((var6 ^ -1) <= -21) {
                    if (var6 >= 30) {
                      L12: {
                        var7 = (-var6 + 50) * 256 / 20;
                        bg.field_c.c(var3, var4, var7);
                        var6 = tg.field_H - 140;
                        if ((var6 ^ -1) >= -1) {
                          break L12;
                        } else {
                          L13: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L13;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L13;
                            }
                          }
                          ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        bg.field_c.c(var3, var4, 256);
                        var6 = tg.field_H - 140;
                        if ((var6 ^ -1) >= -1) {
                          break L14;
                        } else {
                          L15: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L15;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L15;
                            }
                          }
                          ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var7 = var6 * 256 / 20;
                      bg.field_c.c(var3, var4, var7);
                      var6 = tg.field_H - 140;
                      if ((var6 ^ -1) >= -1) {
                        break L16;
                      } else {
                        L17: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L17;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L17;
                          }
                        }
                        ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    var6 = tg.field_H - 140;
                    if ((var6 ^ -1) >= -1) {
                      break L18;
                    } else {
                      L19: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L19;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L19;
                        }
                      }
                      ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = tg.field_H - 140;
                  if ((var6 ^ -1) >= -1) {
                    break L20;
                  } else {
                    L21: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L21;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L21;
                      }
                    }
                    ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              fn.b(0, 0, fn.field_g, fn.field_l, 0, -var5 + 256);
              ib.b(false);
              if (-151 >= (tg.field_H ^ -1)) {
                ad.field_b.a(var3 - -15, var4 - -10, var5);
                break L22;
              } else {
                mi.field_a.b(var3, var4);
                break L22;
              }
            }
            var6 = tg.field_H + -125;
            if ((var6 ^ -1) < -1) {
              if (50 <= var6) {
                L23: {
                  var6 = tg.field_H - 140;
                  if ((var6 ^ -1) >= -1) {
                    break L23;
                  } else {
                    L24: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L24;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L24;
                      }
                    }
                    ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                    break L23;
                  }
                }
                return;
              } else {
                L25: {
                  if ((var6 ^ -1) <= -21) {
                    if (var6 < 30) {
                      bg.field_c.c(var3, var4, 256);
                      break L25;
                    } else {
                      var7 = (-var6 + 50) * 256 / 20;
                      bg.field_c.c(var3, var4, var7);
                      break L25;
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    bg.field_c.c(var3, var4, var7);
                    break L25;
                  }
                }
                L26: {
                  var6 = tg.field_H - 140;
                  if ((var6 ^ -1) >= -1) {
                    break L26;
                  } else {
                    L27: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L27;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L27;
                      }
                    }
                    ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                    break L26;
                  }
                }
                return;
              }
            } else {
              L28: {
                var6 = tg.field_H - 140;
                if ((var6 ^ -1) >= -1) {
                  break L28;
                } else {
                  L29: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L29;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L29;
                    }
                  }
                  ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 1302332904);
                  break L28;
                }
              }
              return;
            }
          }
        }
    }

    final static nf[] a(int param0, byte param1) {
        nf[] var2 = null;
        nf[] var3 = null;
        var3 = new nf[9];
        var2 = var3;
        if (param1 < 2) {
          return (nf[]) null;
        } else {
          var3[4] = wm.a(64, true, param0);
          return var2;
        }
    }

    abstract void d(int param0);

    jf() {
        this.field_o = new wd();
        this.field_j = new wd();
        this.field_g = new wd();
        this.field_n = new wd();
        this.field_i = new kg(6);
        this.field_d = (byte) 0;
        this.field_a = 0;
        this.field_e = 0;
        this.field_m = new kg(10);
    }

    static {
        field_c = new String[]{"Pwn a Level<nbsp>3 boss", "Defeat the second boss", "Defeat the third boss", "Defeat the fourth boss", "Defeat the fifth boss", "Defeat the head of the FunOrb team", "Complete the game in hard mode", "Get five wing pods during Levels 13 to<nbsp>16", "Get five wing pods during Levels 9 to<nbsp>12", "Get five wing pods by Level<nbsp>8", "Die in a nuclear explosion", "Blow up every alien in the first level", "Blow up every alien in the first two levels", "Defeat one of the first three bosses without letting any of its pilots escape", "Don't let a boss ram you (and don't hit the tunnel)", "Nuke a rock field", "Finish the game with four nuclear missiles", "Reach Level<nbsp>20 using only missiles", "Complete the game using only missiles and lightning", "Lose your shield on Level<nbsp>13 or later and survive"};
    }
}
