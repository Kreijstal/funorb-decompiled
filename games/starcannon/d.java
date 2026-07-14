/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    int field_a;
    int field_q;
    static String field_c;
    private int field_k;
    private int field_e;
    private int field_g;
    static String field_m;
    int field_i;
    private int field_f;
    int field_o;
    static hd field_l;
    private int field_j;
    int field_p;
    int field_h;
    static ia field_b;
    static String field_n;
    int field_d;

    final void b(int param0, int param1) {
        int var3 = ((d) this).field_d - -(param0 / 16);
        ki.c(var3, ((d) this).field_q, 5, 0, param1);
        ki.c(var3, ((d) this).field_q, 4, 0, 128);
        ki.c(var3, ((d) this).field_q, 3, 0, 128);
    }

    d(int param0, int param1, int param2, int param3) {
        this(param0 + -3, param1 - 3, 0, 0, 0, param3, param2, 0);
        ((d) this).field_j = 0;
    }

    final d a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        L0: {
          var7 = StarCannon.field_A;
          var2 = 61 % ((param0 - 15) / 43);
          ((d) this).field_f = sh.b(43, 14);
          var6 = ((d) this).field_h;
          if (1 == var6) {
            break L0;
          } else {
            if (var6 != -3) {
              if (var6 == 3) {
                break L0;
              } else {
                if (-1 == var6) {
                  L1: {
                    ((d) this).field_k = ((d) this).field_k + (Math.abs(((d) this).field_j) >> 579500132);
                    ((d) this).field_g = ((d) this).field_g + (Math.abs(((d) this).field_e) >> -1666066268);
                    if ((((d) this).field_g ^ -1) >= -33) {
                      break L1;
                    } else {
                      L2: {
                        if (0 > ((d) this).field_e) {
                          ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> -159360155);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (-1 <= (((d) this).field_e ^ -1)) {
                          break L3;
                        } else {
                          ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> -1988893755);
                          break L3;
                        }
                      }
                      ((d) this).field_g = ((d) this).field_g & 31;
                      break L1;
                    }
                  }
                  L4: {
                    ((d) this).field_p = ((d) this).field_p - 4;
                    if (((d) this).field_k <= 32) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 >= (((d) this).field_j ^ -1)) {
                          break L5;
                        } else {
                          ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 196822597);
                          break L5;
                        }
                      }
                      L6: {
                        if (((d) this).field_j <= 0) {
                          break L6;
                        } else {
                          ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 158820453);
                          break L6;
                        }
                      }
                      ((d) this).field_k = ((d) this).field_k & 31;
                      break L4;
                    }
                  }
                  if (((d) this).field_p <= 0) {
                    return null;
                  } else {
                    return (d) this;
                  }
                } else {
                  if (var6 == 4) {
                    ((d) this).field_q = ((d) this).field_q + 1;
                    if ((((d) this).field_q ^ -1) < -631) {
                      return null;
                    } else {
                      return (d) this;
                    }
                  } else {
                    L7: {
                      L8: {
                        if (5 == var6) {
                          break L8;
                        } else {
                          if (6 == var6) {
                            break L8;
                          } else {
                            L9: {
                              if (var6 != -8) {
                                if (var6 == -9) {
                                  break L9;
                                } else {
                                  if (-10 == var6) {
                                    break L9;
                                  } else {
                                    if (var6 != 10) {
                                      if (-12 != var6) {
                                        if (var6 != 12) {
                                          if (var6 == 14) {
                                            ((d) this).field_p = ((d) this).field_p + 1;
                                            ((d) this).field_d = ((d) this).field_a + tj.field_w;
                                            if ((((d) this).field_p ^ -1) >= -4) {
                                              return (d) this;
                                            } else {
                                              return null;
                                            }
                                          } else {
                                            if (13 == var6) {
                                              ((d) this).field_p = ((d) this).field_p + 1;
                                              if (((d) this).field_p <= 8) {
                                                return (d) this;
                                              } else {
                                                return null;
                                              }
                                            } else {
                                              return (d) this;
                                            }
                                          }
                                        } else {
                                          ((d) this).field_d = tj.field_w + ((d) this).field_a;
                                          ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
                                          L10: while (true) {
                                            if ((((d) this).field_g ^ -1) >= -33) {
                                              L11: {
                                                if ((((d) this).field_i ^ -1) >= -2) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    ((d) this).field_a = ((d) this).field_a - 1;
                                                    ((d) this).field_d = ((d) this).field_d - 1;
                                                    if (2 < ((d) this).field_i) {
                                                      ((d) this).field_d = ((d) this).field_d - 1;
                                                      ((d) this).field_a = ((d) this).field_a - 1;
                                                      var9 = this;
                                                      boolean discarded$6 = v.a(new d((d) var9, 14), -4001);
                                                      ((d) this).field_d = ((d) this).field_d + 1;
                                                      ((d) this).field_a = ((d) this).field_a + 1;
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                  var10 = this;
                                                  boolean discarded$7 = v.a(new d((d) var10, 14), -4001);
                                                  ((d) this).field_d = ((d) this).field_d + 1;
                                                  ((d) this).field_a = ((d) this).field_a + 1;
                                                  break L11;
                                                }
                                              }
                                              L13: {
                                                var11 = this;
                                                boolean discarded$8 = v.a(new d((d) var11, 14), -4001);
                                                if ((((d) this).field_i ^ -1) < -2) {
                                                  L14: {
                                                    ((d) this).field_a = ((d) this).field_a + 1;
                                                    ((d) this).field_d = ((d) this).field_d + 1;
                                                    if (-3 <= (((d) this).field_i ^ -1)) {
                                                      break L14;
                                                    } else {
                                                      ((d) this).field_a = ((d) this).field_a + 1;
                                                      ((d) this).field_d = ((d) this).field_d + 1;
                                                      var12 = this;
                                                      boolean discarded$9 = v.a(new d((d) var12, 14), -4001);
                                                      ((d) this).field_a = ((d) this).field_a - 1;
                                                      ((d) this).field_d = ((d) this).field_d - 1;
                                                      break L14;
                                                    }
                                                  }
                                                  var13 = this;
                                                  boolean discarded$10 = v.a(new d((d) var13, 14), -4001);
                                                  ((d) this).field_d = ((d) this).field_d - 1;
                                                  ((d) this).field_a = ((d) this).field_a - 1;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              if ((((d) this).field_d ^ -1) <= 15) {
                                                if ((((d) this).field_d ^ -1) >= -657) {
                                                  if (-16 <= ((d) this).field_q) {
                                                    if (496 >= ((d) this).field_q) {
                                                      return (d) this;
                                                    } else {
                                                      return null;
                                                    }
                                                  } else {
                                                    return null;
                                                  }
                                                } else {
                                                  return null;
                                                }
                                              } else {
                                                return null;
                                              }
                                            } else {
                                              L15: {
                                                if (0 > ((d) this).field_e) {
                                                  ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 793449733);
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                              L16: {
                                                if ((((d) this).field_e ^ -1) >= -1) {
                                                  break L16;
                                                } else {
                                                  ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> -751467419);
                                                  break L16;
                                                }
                                              }
                                              ((d) this).field_g = ((d) this).field_g & 31;
                                              continue L10;
                                            }
                                          }
                                        }
                                      } else {
                                        L17: {
                                          var8 = this;
                                          boolean discarded$11 = v.a(new d((d) var8, 13), -4001);
                                          var4 = -16;
                                          var3 = -((d) this).field_d + ((d) this).field_a;
                                          var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
                                          if (var5 <= 16) {
                                            break L17;
                                          } else {
                                            ((d) this).field_j = ((d) this).field_j + 96 * var3 / var5;
                                            ((d) this).field_e = ((d) this).field_e + 32 * var4 / var5;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          var5 = (int)Math.sqrt((double)(((d) this).field_j * ((d) this).field_j + ((d) this).field_e * ((d) this).field_e));
                                          if (0 < var5) {
                                            ((d) this).field_j = 512 * ((d) this).field_j / var5;
                                            ((d) this).field_e = ((d) this).field_e * 512 / var5;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          ((d) this).field_k = ((d) this).field_k + Math.abs(((d) this).field_j);
                                          ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
                                          if (-33 <= ((d) this).field_k) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (-1 > ((d) this).field_j) {
                                                ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 1425992005);
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (((d) this).field_j > 0) {
                                                ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 826710693);
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            ((d) this).field_k = ((d) this).field_k & 31;
                                            break L19;
                                          }
                                        }
                                        L22: {
                                          if ((((d) this).field_g ^ -1) >= -33) {
                                            break L22;
                                          } else {
                                            L23: {
                                              if (((d) this).field_e < 0) {
                                                ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 937059813);
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            L24: {
                                              if (0 < ((d) this).field_e) {
                                                ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> -1293129371);
                                                break L24;
                                              } else {
                                                break L24;
                                              }
                                            }
                                            ((d) this).field_g = ((d) this).field_g & 31;
                                            break L22;
                                          }
                                        }
                                        if (((d) this).field_q >= -16) {
                                          if ((((d) this).field_q ^ -1) < -497) {
                                            return null;
                                          } else {
                                            return (d) this;
                                          }
                                        } else {
                                          return null;
                                        }
                                      }
                                    } else {
                                      L25: {
                                        ((d) this).field_k = ((d) this).field_k + Math.abs(((d) this).field_j);
                                        ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
                                        if ((((d) this).field_k ^ -1) < -33) {
                                          L26: {
                                            if (0 <= ((d) this).field_j) {
                                              break L26;
                                            } else {
                                              ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 1027729125);
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (0 < ((d) this).field_j) {
                                              ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 921063205);
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          ((d) this).field_k = ((d) this).field_k & 31;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      L28: {
                                        if (32 < ((d) this).field_g) {
                                          L29: {
                                            if (0 > ((d) this).field_e) {
                                              ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 1433191429);
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            if ((((d) this).field_e ^ -1) >= -1) {
                                              break L30;
                                            } else {
                                              ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> -1547283579);
                                              break L30;
                                            }
                                          }
                                          ((d) this).field_g = 31 & ((d) this).field_g;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      if (((d) this).field_d >= -16) {
                                        if ((((d) this).field_d ^ -1) >= -657) {
                                          if ((((d) this).field_q ^ -1) <= 15) {
                                            if (((d) this).field_q > 496) {
                                              return null;
                                            } else {
                                              return (d) this;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        return null;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            if (-25 <= (((d) this).field_o ^ -1)) {
                              ((d) this).field_p = ((d) this).field_p + 32;
                              if (((d) this).field_i < ((d) this).field_p) {
                                ((d) this).field_o = ((d) this).field_o + 1;
                                ((d) this).field_p = ((d) this).field_p - ((d) this).field_i;
                                break L7;
                              } else {
                                return (d) this;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      if ((((d) this).field_o ^ -1) >= -15) {
                        ((d) this).field_p = ((d) this).field_p + 32;
                        if (((d) this).field_i < ((d) this).field_p) {
                          ((d) this).field_o = ((d) this).field_o + 1;
                          ((d) this).field_p = ((d) this).field_p - ((d) this).field_i;
                          break L7;
                        } else {
                          return (d) this;
                        }
                      } else {
                        return null;
                      }
                    }
                    return (d) this;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L31: {
          ((d) this).field_k = ((d) this).field_k + Math.abs(((d) this).field_j);
          ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
          if (-33 <= (((d) this).field_k ^ -1)) {
            break L31;
          } else {
            L32: {
              if (0 > ((d) this).field_j) {
                ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 1623037093);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if ((((d) this).field_j ^ -1) >= -1) {
                break L33;
              } else {
                ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> -1415621915);
                break L33;
              }
            }
            ((d) this).field_k = ((d) this).field_k & 31;
            break L31;
          }
        }
        L34: {
          if (-33 <= ((d) this).field_g) {
            break L34;
          } else {
            L35: {
              if (-1 <= ((d) this).field_e) {
                break L35;
              } else {
                ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 1265379269);
                break L35;
              }
            }
            L36: {
              if (0 < ((d) this).field_e) {
                ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> 988392357);
                break L36;
              } else {
                break L36;
              }
            }
            ((d) this).field_g = ((d) this).field_g & 31;
            break L34;
          }
        }
        if (-16 <= ((d) this).field_d) {
          if (656 >= ((d) this).field_d) {
            if ((((d) this).field_q ^ -1) <= 15) {
              if ((((d) this).field_q ^ -1) < -497) {
                return null;
              } else {
                return (d) this;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 1, -1 == (param5 ^ -1) ? 256 : 0);
    }

    d(int param0, int param1, int param2) {
        this(param0 + -3, param1 + -3, 0, 0, 0, 5, param2, 0);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = StarCannon.field_A;
          var3 = 32 % ((87 - param1) / 32);
          var6 = ((d) this).field_h;
          if (11 != var6) {
            if (var6 != -14) {
              if (var6 == -15) {
                if (0 != qc.field_d) {
                  var4 = (param0 >> 985756260) + ((d) this).field_d;
                  ki.d(var4, ((d) this).field_q, -(((d) this).field_j >> -282568507) + var4, -(((d) this).field_e >> 1031497893) + ((d) this).field_q, ((d) this).field_o, (-(((d) this).field_p * 255) + 765) / 3);
                  break L0;
                } else {
                  return;
                }
              } else {
                if (-13 != var6) {
                  L1: {
                    if (-2 != var6) {
                      if (-11 != (var6 ^ -1)) {
                        if (var6 == -3) {
                          L2: {
                            var4 = -(((d) this).field_i + -1 << 1311900897) + ((d) this).field_d - -(param0 >> -1050055228);
                            if (((d) this).field_i != 1) {
                              break L2;
                            } else {
                              ki.a(var4, ((d) this).field_q, -(((d) this).field_j / 32) + var4, ((d) this).field_q - ((d) this).field_e / 32, ((d) this).field_o);
                              break L2;
                            }
                          }
                          jg.field_C[4 + (-5 + 5 * ((d) this).field_i)].a(var4 - 3, ((d) this).field_q - 3, ((d) this).field_o);
                          break L0;
                        } else {
                          if (var6 != 3) {
                            if (var6 != 0) {
                              if (var6 != 4) {
                                if (-6 != var6) {
                                  if (-7 != var6) {
                                    if (var6 != 7) {
                                      if (var6 != 8) {
                                        if (9 == var6) {
                                          L3: {
                                            var4 = (param0 >> 1735302084) + ((d) this).field_d;
                                            if (-25 < (((d) this).field_o ^ -1)) {
                                              oh.field_d[((d) this).field_o].b(var4 + -128, -128 + ((d) this).field_q, 256, 256, 255);
                                              break L3;
                                            } else {
                                              break L3;
                                            }
                                          }
                                          return;
                                        } else {
                                          return;
                                        }
                                      } else {
                                        var4 = ((d) this).field_d - -(param0 >> -1907352828);
                                        if (24 > ((d) this).field_o) {
                                          oh.field_d[((d) this).field_o].b(var4 + -96, -96 + ((d) this).field_q, 192, 192, 255);
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    } else {
                                      L4: {
                                        var4 = (param0 >> -1183211644) + ((d) this).field_d;
                                        if (-25 <= ((d) this).field_o) {
                                          break L4;
                                        } else {
                                          oh.field_d[((d) this).field_o].b(var4 + -64, ((d) this).field_q + -64, 128, 128, 255);
                                          break L4;
                                        }
                                      }
                                      return;
                                    }
                                  } else {
                                    var4 = (param0 >> -1536169468) + ((d) this).field_d;
                                    if ((((d) this).field_o ^ -1) <= -15) {
                                      break L0;
                                    } else {
                                      ad.field_z[((d) this).field_o].f(var4 - 16, ((d) this).field_q - 16, 64);
                                      break L0;
                                    }
                                  }
                                } else {
                                  L5: {
                                    var4 = (param0 >> -2088686876) + ((d) this).field_d;
                                    if (14 <= ((d) this).field_o) {
                                      break L5;
                                    } else {
                                      ie.field_B[((d) this).field_o].f(var4 - 16, -16 + ((d) this).field_q, 64);
                                      break L5;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L6: {
                                  var4 = ((d) this).field_d - -(param0 >> -83809243);
                                  if (gd.field_d >= -9) {
                                    ea.field_b[gd.field_d].a(((d) this).field_q, 0, -125, var4, 128);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                if (-10 <= gd.field_d) {
                                  kj.field_y[-9 + gd.field_d].a(((d) this).field_q, 0, -122, var4, 128);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              var4 = (param0 >> 1690208836) + ((d) this).field_d;
                              if (-17 >= (((d) this).field_p ^ -1)) {
                                ki.c(var4, ((d) this).field_q, ((d) this).field_p >> 1610436386, ((d) this).field_o, 128);
                                break L0;
                              } else {
                                ki.c(var4, ((d) this).field_q, ((d) this).field_p >> -1501186910, ((d) this).field_o, ((d) this).field_p << -566569661);
                                break L0;
                              }
                            }
                          } else {
                            L7: {
                              var4 = 0;
                              if (3 != ((d) this).field_h) {
                                break L7;
                              } else {
                                var4 = param0 / 20 + ((d) this).field_d;
                                break L7;
                              }
                            }
                            jg.field_C[4].a(-3 + var4, -3 + ((d) this).field_q, ((d) this).field_o);
                            break L0;
                          }
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  var4 = (param0 >> -619968316) + ((d) this).field_d;
                  var4 = var4 - (((d) this).field_i - 1 << 1779450753);
                  if (((d) this).field_o != 65280) {
                    if (((d) this).field_i > 2) {
                      if (3 == ((d) this).field_i) {
                        ie.field_B[0].f(var4 + -8, ((d) this).field_q - 8, 192);
                        ie.field_B[2].f(-8 + var4, -8 + (((d) this).field_q + 4), 64);
                        ie.field_B[4].f(-8 + var4, 8 + (-8 + ((d) this).field_q), 64);
                        ie.field_B[6].f(var4 + -8, -8 + ((d) this).field_q - -12, 64);
                        ie.field_B[8].f(-8 + var4, 8 + ((d) this).field_q, 64);
                        ie.field_B[10].f(-8 + var4, -8 + ((d) this).field_q - -20, 64);
                        ie.field_B[12].f(var4 + -8, 24 + (-8 + ((d) this).field_q), 64);
                        ie.field_B[14].f(var4 + -8, 20 + ((d) this).field_q, 64);
                        break L0;
                      } else {
                        if (4 != ((d) this).field_i) {
                          jg.field_C[9].a(6 + var4, ((d) this).field_q - 3, ((d) this).field_o);
                          jg.field_C[9].a(12 + var4, -3 + ((d) this).field_q, ((d) this).field_o);
                          break L0;
                        } else {
                          jg.field_C[9].a(-2 + var4, -3 + ((d) this).field_q, ((d) this).field_o);
                          jg.field_C[9].a(4 + var4, -3 + ((d) this).field_q, ((d) this).field_o);
                          break L0;
                        }
                      }
                    } else {
                      jg.field_C[5 * (-1 + ((d) this).field_i) + 4].a(-3 + var4, ((d) this).field_q + -3, ((d) this).field_o);
                      break L0;
                    }
                  } else {
                    ie.field_A[((d) this).field_f].f(var4 + -8, -8 + ((d) this).field_q, 128);
                    break L0;
                  }
                } else {
                  var4 = ((d) this).field_d - -(param0 >> -1501641628);
                  var5 = 1;
                  var6 = ((d) this).field_i;
                  L8: while (true) {
                    if (1 >= var6) {
                      ki.c(var4, ((d) this).field_q, var5 + 2, ((d) this).field_o, 64);
                      ki.c(var4, ((d) this).field_q, var5 - -1, ((d) this).field_o, 64);
                      ki.a(var4, ((d) this).field_q, var4 + -(((d) this).field_j >> -1885282715), ((d) this).field_q - (((d) this).field_e >> -2135846907), 16777215);
                      ki.a(var4 + -1, ((d) this).field_q, var4 - (((d) this).field_j >> -1849311131), -(((d) this).field_e >> 253073669) + ((d) this).field_q, ((d) this).field_o);
                      ki.a(1 + var4, ((d) this).field_q, -(((d) this).field_j >> -1889288475) + var4, -(((d) this).field_e >> -497804763) + ((d) this).field_q, ((d) this).field_o);
                      ki.e(var4, ((d) this).field_q, var5, 16777215);
                      break L0;
                    } else {
                      var5++;
                      var6 = var6 >> 1;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              if (qc.field_d != 0) {
                var4 = ((d) this).field_d - -(param0 >> 1209857764);
                ki.d(var4, ((d) this).field_q, -(((d) this).field_j >> -503785947) + var4, -(((d) this).field_e >> -221030651) + ((d) this).field_q, ((d) this).field_o, 128 * (8 - ((d) this).field_p) / 8);
                break L0;
              } else {
                return;
              }
            }
          } else {
            var4 = (param0 >> 1814014052) + ((d) this).field_d;
            if ((((d) this).field_i ^ -1) == -3) {
              ki.c(var4, ((d) this).field_q, 3, ((d) this).field_o, 64);
              ki.c(var4, ((d) this).field_q, 2, ((d) this).field_o, 64);
              ki.a(var4, ((d) this).field_q, -(((d) this).field_j >> 1624137989) + var4, -(((d) this).field_e >> 931742661) + ((d) this).field_q, 16777215);
              ki.a(var4 + -1, ((d) this).field_q, var4 + -(((d) this).field_j >> 573770053), ((d) this).field_q + -(((d) this).field_e >> 32478469), ((d) this).field_o);
              ki.a(var4 + 1, ((d) this).field_q, -(((d) this).field_j >> 197315333) + var4, -(((d) this).field_e >> 804373989) + ((d) this).field_q, ((d) this).field_o);
              ki.e(var4, ((d) this).field_q, 1, 16777215);
              if (0 == (16 & ((d) this).field_q)) {
                ki.a(var4, -6 + ((d) this).field_q, var4, ((d) this).field_q - -6, ((d) this).field_o);
                ki.a(var4, ((d) this).field_q + -4, var4, ((d) this).field_q - -4, 16777215);
                break L0;
              } else {
                ki.a(var4 + 6, ((d) this).field_q, var4 + -6, ((d) this).field_q, ((d) this).field_o);
                ki.a(var4 - -4, ((d) this).field_q, var4 - 4, ((d) this).field_q, 16777215);
                break L0;
              }
            } else {
              ki.c(var4, ((d) this).field_q, 4, ((d) this).field_o, 64);
              ki.c(var4, ((d) this).field_q, 3, ((d) this).field_o, 64);
              ki.a(var4, ((d) this).field_q, var4 + -(((d) this).field_j >> 1011202757), ((d) this).field_q - (((d) this).field_e >> 2027028581), 16777215);
              ki.a(var4 - 1, ((d) this).field_q, var4 - (((d) this).field_j >> -631908827), ((d) this).field_q + -(((d) this).field_e >> 1351688901), ((d) this).field_o);
              ki.a(var4 - -1, ((d) this).field_q, -(((d) this).field_j >> 654229573) + var4, -(((d) this).field_e >> -1412499675) + ((d) this).field_q, ((d) this).field_o);
              if (0 == (((d) this).field_q & 16)) {
                ki.a(var4 + -8, -8 + ((d) this).field_q, var4 - -8, 8 + ((d) this).field_q, ((d) this).field_o);
                ki.a(var4 - 5, ((d) this).field_q - 5, 5 + var4, 5 + ((d) this).field_q, 16777215);
                ki.e(var4, ((d) this).field_q, 2, 16777215);
                break L0;
              } else {
                ki.a(8 + var4, ((d) this).field_q + -8, -8 + var4, 8 + ((d) this).field_q, ((d) this).field_o);
                ki.a(var4 - -5, -5 + ((d) this).field_q, -5 + var4, 5 + ((d) this).field_q, 16777215);
                ki.e(var4, ((d) this).field_q, 2, 16777215);
                break L0;
              }
            }
          }
        }
    }

    final static Object a(boolean param0, byte param1, byte[] param2) {
        int var3 = 0;
        ij var4 = null;
        if (param2 != null) {
          var3 = 73 % ((58 - param1) / 44);
          if (-137 > (param2.length ^ -1)) {
            var4 = new ij();
            ((kk) (Object) var4).a(-5361, param2);
            return (Object) (Object) var4;
          } else {
            if (!param0) {
              return (Object) (Object) param2;
            } else {
              return (Object) (Object) rg.a((byte) 10, param2);
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_n = null;
        field_m = null;
        field_c = null;
        field_l = null;
        if (param0 != 32) {
            Object var2 = null;
            Object discarded$0 = d.a(false, (byte) -38, (byte[]) null);
        }
    }

    private d(d param0, int param1) {
        ((d) this).field_i = param0.field_i;
        ((d) this).field_a = param0.field_a;
        ((d) this).field_p = 0;
        ((d) this).field_g = param0.field_g;
        ((d) this).field_d = param0.field_d;
        ((d) this).field_k = param0.field_k;
        ((d) this).field_e = param0.field_e;
        ((d) this).field_o = param0.field_o;
        ((d) this).field_h = param1;
        ((d) this).field_q = param0.field_q;
        ((d) this).field_j = param0.field_j;
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((d) this).field_o = param4;
        ((d) this).field_j = param2;
        ((d) this).field_h = param5;
        ((d) this).field_q = param1 - -3;
        ((d) this).field_e = param3;
        ((d) this).field_d = 3 + param0;
        ((d) this).field_i = param6;
        ((d) this).field_p = param7;
        ((d) this).field_g = 0;
        ((d) this).field_k = 0;
        if ((param5 ^ -1) == -12) {
            ((d) this).field_j = ((d) this).field_j + (-16 + sh.b(43, 32));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player Name: ";
        field_m = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_n = "Paragulan homeworld destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
