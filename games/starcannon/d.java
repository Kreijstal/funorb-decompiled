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
          L1: {
            var7 = StarCannon.field_A;
            var2 = 61 % ((param0 - 15) / 43);
            ((d) this).field_f = sh.b(43, 14);
            var6 = ((d) this).field_h;
            if (1 == var6) {
              break L1;
            } else {
              if (var6 != 2) {
                if (var6 == 3) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    L2: {
                      ((d) this).field_k = ((d) this).field_k + (Math.abs(((d) this).field_j) >> 4);
                      ((d) this).field_g = ((d) this).field_g + (Math.abs(((d) this).field_e) >> 4);
                      if (((d) this).field_g <= 32) {
                        break L2;
                      } else {
                        L3: {
                          if (0 > ((d) this).field_e) {
                            ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 5);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (((d) this).field_e <= 0) {
                            break L4;
                          } else {
                            ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> 5);
                            break L4;
                          }
                        }
                        ((d) this).field_g = ((d) this).field_g & 31;
                        break L2;
                      }
                    }
                    L5: {
                      ((d) this).field_p = ((d) this).field_p - 4;
                      if (((d) this).field_k <= 32) {
                        break L5;
                      } else {
                        L6: {
                          if (((d) this).field_j >= 0) {
                            break L6;
                          } else {
                            ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 5);
                            break L6;
                          }
                        }
                        L7: {
                          if (((d) this).field_j <= 0) {
                            break L7;
                          } else {
                            ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 5);
                            break L7;
                          }
                        }
                        ((d) this).field_k = ((d) this).field_k & 31;
                        break L5;
                      }
                    }
                    if (((d) this).field_p > 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var6 == 4) {
                      ((d) this).field_q = ((d) this).field_q + 1;
                      if (((d) this).field_q <= 630) {
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      L8: {
                        if (5 == var6) {
                          break L8;
                        } else {
                          if (6 == var6) {
                            break L8;
                          } else {
                            L9: {
                              if (var6 != 7) {
                                if (var6 == 8) {
                                  break L9;
                                } else {
                                  if (var6 == 9) {
                                    break L9;
                                  } else {
                                    if (var6 != 10) {
                                      if (var6 != 11) {
                                        if (var6 != 12) {
                                          if (var6 == 14) {
                                            ((d) this).field_p = ((d) this).field_p + 1;
                                            ((d) this).field_d = ((d) this).field_a + tj.field_w;
                                            if (((d) this).field_p <= 3) {
                                              break L0;
                                            } else {
                                              return null;
                                            }
                                          } else {
                                            if (13 != var6) {
                                              break L0;
                                            } else {
                                              ((d) this).field_p = ((d) this).field_p + 1;
                                              if (((d) this).field_p <= 8) {
                                                break L0;
                                              } else {
                                                return null;
                                              }
                                            }
                                          }
                                        } else {
                                          ((d) this).field_d = tj.field_w + ((d) this).field_a;
                                          ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
                                          L10: while (true) {
                                            if (((d) this).field_g <= 32) {
                                              L11: {
                                                if (((d) this).field_i <= 1) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    ((d) this).field_a = ((d) this).field_a - 1;
                                                    ((d) this).field_d = ((d) this).field_d - 1;
                                                    if (2 < ((d) this).field_i) {
                                                      ((d) this).field_d = ((d) this).field_d - 1;
                                                      ((d) this).field_a = ((d) this).field_a - 1;
                                                      var9 = this;
                                                      int discarded$12 = -4001;
                                                      boolean discarded$13 = v.a(new d((d) var9, 14));
                                                      ((d) this).field_d = ((d) this).field_d + 1;
                                                      ((d) this).field_a = ((d) this).field_a + 1;
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                  var10 = this;
                                                  int discarded$14 = -4001;
                                                  boolean discarded$15 = v.a(new d((d) var10, 14));
                                                  ((d) this).field_d = ((d) this).field_d + 1;
                                                  ((d) this).field_a = ((d) this).field_a + 1;
                                                  break L11;
                                                }
                                              }
                                              L13: {
                                                var11 = this;
                                                int discarded$16 = -4001;
                                                boolean discarded$17 = v.a(new d((d) var11, 14));
                                                if (((d) this).field_i > 1) {
                                                  L14: {
                                                    ((d) this).field_a = ((d) this).field_a + 1;
                                                    ((d) this).field_d = ((d) this).field_d + 1;
                                                    if (((d) this).field_i <= 2) {
                                                      break L14;
                                                    } else {
                                                      ((d) this).field_a = ((d) this).field_a + 1;
                                                      ((d) this).field_d = ((d) this).field_d + 1;
                                                      var12 = this;
                                                      int discarded$18 = -4001;
                                                      boolean discarded$19 = v.a(new d((d) var12, 14));
                                                      ((d) this).field_a = ((d) this).field_a - 1;
                                                      ((d) this).field_d = ((d) this).field_d - 1;
                                                      break L14;
                                                    }
                                                  }
                                                  var13 = this;
                                                  int discarded$20 = -4001;
                                                  boolean discarded$21 = v.a(new d((d) var13, 14));
                                                  ((d) this).field_d = ((d) this).field_d - 1;
                                                  ((d) this).field_a = ((d) this).field_a - 1;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              if (((d) this).field_d >= -16) {
                                                if (((d) this).field_d <= 656) {
                                                  if (-16 <= ((d) this).field_q) {
                                                    if (496 >= ((d) this).field_q) {
                                                      break L0;
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
                                                  ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 5);
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                              L16: {
                                                if (((d) this).field_e <= 0) {
                                                  break L16;
                                                } else {
                                                  ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> 5);
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
                                          int discarded$22 = -4001;
                                          boolean discarded$23 = v.a(new d((d) var8, 13));
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
                                          if (((d) this).field_k <= 32) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (((d) this).field_j < 0) {
                                                ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 5);
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (((d) this).field_j > 0) {
                                                ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 5);
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
                                          if (((d) this).field_g <= 32) {
                                            break L22;
                                          } else {
                                            L23: {
                                              if (((d) this).field_e < 0) {
                                                ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 5);
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            L24: {
                                              if (0 < ((d) this).field_e) {
                                                ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> 5);
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
                                          if (((d) this).field_q <= 496) {
                                            break L0;
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      }
                                    } else {
                                      L25: {
                                        ((d) this).field_k = ((d) this).field_k + Math.abs(((d) this).field_j);
                                        ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
                                        if (((d) this).field_k > 32) {
                                          L26: {
                                            if (0 <= ((d) this).field_j) {
                                              break L26;
                                            } else {
                                              ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 5);
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (0 < ((d) this).field_j) {
                                              ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 5);
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
                                              ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 5);
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            if (((d) this).field_e <= 0) {
                                              break L30;
                                            } else {
                                              ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> 5);
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
                                        if (((d) this).field_d <= 656) {
                                          if (((d) this).field_q >= -16) {
                                            if (((d) this).field_q <= 496) {
                                              break L0;
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
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            if (((d) this).field_o <= 24) {
                              ((d) this).field_p = ((d) this).field_p + 32;
                              if (~((d) this).field_i <= ~((d) this).field_p) {
                                break L0;
                              } else {
                                ((d) this).field_o = ((d) this).field_o + 1;
                                ((d) this).field_p = ((d) this).field_p - ((d) this).field_i;
                                break L0;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      if (((d) this).field_o <= 14) {
                        ((d) this).field_p = ((d) this).field_p + 32;
                        if (((d) this).field_i >= ((d) this).field_p) {
                          break L0;
                        } else {
                          ((d) this).field_o = ((d) this).field_o + 1;
                          ((d) this).field_p = ((d) this).field_p - ((d) this).field_i;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
          }
          L31: {
            ((d) this).field_k = ((d) this).field_k + Math.abs(((d) this).field_j);
            ((d) this).field_g = ((d) this).field_g + Math.abs(((d) this).field_e);
            if (((d) this).field_k <= 32) {
              break L31;
            } else {
              L32: {
                if (0 > ((d) this).field_j) {
                  ((d) this).field_d = ((d) this).field_d - (((d) this).field_k >> 5);
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (((d) this).field_j <= 0) {
                  break L33;
                } else {
                  ((d) this).field_d = ((d) this).field_d + (((d) this).field_k >> 5);
                  break L33;
                }
              }
              ((d) this).field_k = ((d) this).field_k & 31;
              break L31;
            }
          }
          L34: {
            if (((d) this).field_g <= 32) {
              break L34;
            } else {
              L35: {
                if (((d) this).field_e >= 0) {
                  break L35;
                } else {
                  ((d) this).field_q = ((d) this).field_q - (((d) this).field_g >> 5);
                  break L35;
                }
              }
              L36: {
                if (0 < ((d) this).field_e) {
                  ((d) this).field_q = ((d) this).field_q + (((d) this).field_g >> 5);
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
              if (((d) this).field_q >= -16) {
                if (((d) this).field_q <= 496) {
                  break L0;
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
        }
        return (d) this;
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 1, param5 == 0 ? 256 : 0);
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
            if (var6 != 13) {
              if (var6 == 14) {
                if (0 != qc.field_d) {
                  var4 = (param0 >> 4) + ((d) this).field_d;
                  ki.d(var4, ((d) this).field_q, -(((d) this).field_j >> 5) + var4, -(((d) this).field_e >> 5) + ((d) this).field_q, ((d) this).field_o, (-(((d) this).field_p * 255) + 765) / 3);
                  break L0;
                } else {
                  return;
                }
              } else {
                if (var6 != 12) {
                  L1: {
                    if (var6 != 1) {
                      if (var6 != 10) {
                        if (var6 == 2) {
                          L2: {
                            var4 = -(((d) this).field_i + -1 << 1) + ((d) this).field_d - -(param0 >> 4);
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
                                if (var6 == 5) {
                                  var4 = (param0 >> 4) + ((d) this).field_d;
                                  if (14 <= ((d) this).field_o) {
                                    break L0;
                                  } else {
                                    ie.field_B[((d) this).field_o].f(var4 - 16, -16 + ((d) this).field_q, 64);
                                    break L0;
                                  }
                                } else {
                                  if (var6 != 6) {
                                    if (var6 == 7) {
                                      var4 = (param0 >> 4) + ((d) this).field_d;
                                      if (((d) this).field_o >= 24) {
                                        break L0;
                                      } else {
                                        oh.field_d[((d) this).field_o].b(var4 + -64, ((d) this).field_q + -64, 128, 128, 255);
                                        break L0;
                                      }
                                    } else {
                                      if (var6 != 8) {
                                        if (9 != var6) {
                                          break L0;
                                        } else {
                                          var4 = (param0 >> 4) + ((d) this).field_d;
                                          if (((d) this).field_o < 24) {
                                            oh.field_d[((d) this).field_o].b(var4 + -128, -128 + ((d) this).field_q, 256, 256, 255);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var4 = ((d) this).field_d - -(param0 >> 4);
                                        if (24 > ((d) this).field_o) {
                                          oh.field_d[((d) this).field_o].b(var4 + -96, -96 + ((d) this).field_q, 192, 192, 255);
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    var4 = (param0 >> 4) + ((d) this).field_d;
                                    if (((d) this).field_o >= 14) {
                                      break L0;
                                    } else {
                                      ad.field_z[((d) this).field_o].f(var4 - 16, ((d) this).field_q - 16, 64);
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                L3: {
                                  var4 = ((d) this).field_d - -(param0 >> 5);
                                  if (gd.field_d <= 8) {
                                    ea.field_b[gd.field_d].a(((d) this).field_q, 0, -125, var4, 128);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                if (gd.field_d >= 9) {
                                  kj.field_y[-9 + gd.field_d].a(((d) this).field_q, 0, -122, var4, 128);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              var4 = (param0 >> 4) + ((d) this).field_d;
                              if (((d) this).field_p >= 16) {
                                ki.c(var4, ((d) this).field_q, ((d) this).field_p >> 2, ((d) this).field_o, 128);
                                break L0;
                              } else {
                                ki.c(var4, ((d) this).field_q, ((d) this).field_p >> 2, ((d) this).field_o, ((d) this).field_p << 3);
                                break L0;
                              }
                            }
                          } else {
                            L4: {
                              var4 = 0;
                              if (3 != ((d) this).field_h) {
                                break L4;
                              } else {
                                var4 = param0 / 20 + ((d) this).field_d;
                                break L4;
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
                  var4 = (param0 >> 4) + ((d) this).field_d;
                  var4 = var4 - (((d) this).field_i - 1 << 1);
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
                  var4 = ((d) this).field_d - -(param0 >> 4);
                  var5 = 1;
                  var6 = ((d) this).field_i;
                  L5: while (true) {
                    if (1 >= var6) {
                      ki.c(var4, ((d) this).field_q, var5 + 2, ((d) this).field_o, 64);
                      ki.c(var4, ((d) this).field_q, var5 - -1, ((d) this).field_o, 64);
                      ki.a(var4, ((d) this).field_q, var4 + -(((d) this).field_j >> 5), ((d) this).field_q - (((d) this).field_e >> 5), 16777215);
                      ki.a(var4 + -1, ((d) this).field_q, var4 - (((d) this).field_j >> 5), -(((d) this).field_e >> 5) + ((d) this).field_q, ((d) this).field_o);
                      ki.a(1 + var4, ((d) this).field_q, -(((d) this).field_j >> 5) + var4, -(((d) this).field_e >> 5) + ((d) this).field_q, ((d) this).field_o);
                      ki.e(var4, ((d) this).field_q, var5, 16777215);
                      break L0;
                    } else {
                      var5++;
                      var6 = var6 >> 1;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              if (qc.field_d != 0) {
                var4 = ((d) this).field_d - -(param0 >> 4);
                ki.d(var4, ((d) this).field_q, -(((d) this).field_j >> 5) + var4, -(((d) this).field_e >> 5) + ((d) this).field_q, ((d) this).field_o, 128 * (8 - ((d) this).field_p) / 8);
                break L0;
              } else {
                return;
              }
            }
          } else {
            var4 = (param0 >> 4) + ((d) this).field_d;
            if (((d) this).field_i == 2) {
              ki.c(var4, ((d) this).field_q, 3, ((d) this).field_o, 64);
              ki.c(var4, ((d) this).field_q, 2, ((d) this).field_o, 64);
              ki.a(var4, ((d) this).field_q, -(((d) this).field_j >> 5) + var4, -(((d) this).field_e >> 5) + ((d) this).field_q, 16777215);
              ki.a(var4 + -1, ((d) this).field_q, var4 + -(((d) this).field_j >> 5), ((d) this).field_q + -(((d) this).field_e >> 5), ((d) this).field_o);
              ki.a(var4 + 1, ((d) this).field_q, -(((d) this).field_j >> 5) + var4, -(((d) this).field_e >> 5) + ((d) this).field_q, ((d) this).field_o);
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
              L6: {
                ki.c(var4, ((d) this).field_q, 4, ((d) this).field_o, 64);
                ki.c(var4, ((d) this).field_q, 3, ((d) this).field_o, 64);
                ki.a(var4, ((d) this).field_q, var4 + -(((d) this).field_j >> 5), ((d) this).field_q - (((d) this).field_e >> 5), 16777215);
                ki.a(var4 - 1, ((d) this).field_q, var4 - (((d) this).field_j >> 5), ((d) this).field_q + -(((d) this).field_e >> 5), ((d) this).field_o);
                ki.a(var4 - -1, ((d) this).field_q, -(((d) this).field_j >> 5) + var4, -(((d) this).field_e >> 5) + ((d) this).field_q, ((d) this).field_o);
                if (0 == (((d) this).field_q & 16)) {
                  ki.a(var4 + -8, -8 + ((d) this).field_q, var4 - -8, 8 + ((d) this).field_q, ((d) this).field_o);
                  ki.a(var4 - 5, ((d) this).field_q - 5, 5 + var4, 5 + ((d) this).field_q, 16777215);
                  break L6;
                } else {
                  ki.a(8 + var4, ((d) this).field_q + -8, -8 + var4, 8 + ((d) this).field_q, ((d) this).field_o);
                  ki.a(var4 - -5, -5 + ((d) this).field_q, -5 + var4, 5 + ((d) this).field_q, 16777215);
                  break L6;
                }
              }
              ki.e(var4, ((d) this).field_q, 2, 16777215);
              break L0;
            }
          }
        }
    }

    final static Object a(boolean param0, byte param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ij var4 = null;
        ij stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_5_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 != null) {
              var3_int = 73 % ((58 - param1) / 44);
              if (param2.length > 136) {
                var4 = new ij();
                ((kk) (Object) var4).a(-5361, param2);
                stackOut_5_0 = (ij) var4;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) param2;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("d.A(").append(0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return (Object) (Object) stackIn_6_0;
    }

    public static void a() {
        field_b = null;
        field_n = null;
        field_m = null;
        field_c = null;
        field_l = null;
    }

    private d(d param0, int param1) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "d.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
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
        if (param5 == 11) {
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
