/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class f {
    private int field_c;
    im field_h;
    int field_t;
    kd field_f;
    int field_m;
    int field_g;
    boolean field_k;
    int field_u;
    im field_o;
    int field_s;
    im field_r;
    int field_x;
    boolean field_a;
    private int field_d;
    int field_y;
    private int field_q;
    static hj[] field_w;
    int field_p;
    lb[] field_e;
    im field_b;
    int field_i;
    private boolean field_n;
    int field_l;
    private int field_v;
    static boolean field_j;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -38) {
                break L1;
              } else {
                ((f) this).field_u = -105;
                break L1;
              }
            }
            var5_int = param1 - param0;
            L2: while (true) {
              if (~var5_int < ~(param0 + param1)) {
                break L0;
              } else {
                var6 = param3 - param0;
                L3: while (true) {
                  if (~(param0 + param3) > ~var6) {
                    var5_int++;
                    continue L2;
                  } else {
                    L4: {
                      if (0 > var5_int) {
                        break L4;
                      } else {
                        if (var5_int >= ((f) this).field_f.field_c) {
                          break L4;
                        } else {
                          if (var6 < 0) {
                            break L4;
                          } else {
                            if (var6 >= ((f) this).field_f.field_t) {
                              break L4;
                            } else {
                              ((f) this).field_h.a(-81, (ca) (Object) new me((double)param1, (double)param3, (double)(-param1 + var5_int) * 0.05, (double)(var6 + -param3) * 0.05, 1));
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var5, "f.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((f) this).field_k = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "f.O(" + 0 + 44 + param1 + 41);
        }
    }

    final static int c() {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            stackOut_3_0 = ji.field_c;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "f.A(" + 8 + 41);
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        oj var3_ref_oj = null;
        ca var3_ref_ca = null;
        pd var4_ref_pd = null;
        int var4 = 0;
        pd var5 = null;
        kb var5_ref = null;
        int var5_int = 0;
        oj var5_ref2 = null;
        int var6 = 0;
        int var7_int = 0;
        pd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pd var11 = null;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        if (!((f) this).field_k) {
          L0: {
            if (((f) this).field_f.field_k == 0) {
              this.a(false, -1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            ((f) this).field_i = ((f) this).field_i + 1;
            if (((f) this).field_x % 11 != 0) {
              break L1;
            } else {
              if (((f) this).field_r.c(-3088)) {
                break L1;
              } else {
                if (((f) this).field_x <= 0) {
                  break L1;
                } else {
                  ((f) this).field_g = ((f) this).field_i - -500;
                  break L1;
                }
              }
            }
          }
          L2: {
            if (((f) this).field_y <= 0) {
              break L2;
            } else {
              ((f) this).field_y = ((f) this).field_y - 1;
              break L2;
            }
          }
          L3: {
            if (((f) this).field_f.field_n >= 0) {
              break L3;
            } else {
              ((f) this).field_f.field_n = 0;
              break L3;
            }
          }
          L4: {
            if (((f) this).field_k) {
              break L4;
            } else {
              if (99 != ((f) this).field_x) {
                break L4;
              } else {
                if (((f) this).field_r.c(-3088)) {
                  L5: {
                    if (0 >= ((f) this).field_e[0].field_f) {
                      break L5;
                    } else {
                      if (((f) this).field_m == 0) {
                        L6: {
                          ((f) this).field_d = ((f) this).field_d + 1;
                          if (1 == ((f) this).field_d) {
                            f.a(13, 242, (byte) -25);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (((f) this).field_d == 3) {
                            f.a(14, 241, (byte) -25);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (((f) this).field_d != 9) {
                          break L5;
                        } else {
                          f.a(15, 240, (byte) -25);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  nh.field_b = nh.field_b + ((f) this).field_e[0].field_f;
                  ((f) this).field_e[0].field_d = ((f) this).field_e[0].field_d + ((f) this).field_e[0].field_f;
                  ((f) this).field_e[0].field_f = 0;
                  this.a(false, 0);
                  return;
                } else {
                  break L4;
                }
              }
            }
          }
          L8: {
            L9: {
              if (((f) this).field_m == 1) {
                break L9;
              } else {
                if (2 != ((f) this).field_m) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            if (((f) this).field_e[0].field_d < 1000000) {
              break L8;
            } else {
              f.a(3, 252, (byte) -25);
              break L8;
            }
          }
          L10: {
            L11: {
              if (((f) this).field_m == 4) {
                break L11;
              } else {
                if (((f) this).field_m != 5) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            if (((f) this).field_e[0].field_d >= 1000000) {
              f.a(21, 234, (byte) -25);
              break L10;
            } else {
              break L10;
            }
          }
          L12: {
            ((f) this).field_f.a((byte) 100);
            if (((f) this).field_f.field_r.b(0)) {
              break L12;
            } else {
              var2_int = 0;
              L13: while (true) {
                if (((f) this).field_f.field_r.field_e <= var2_int) {
                  break L12;
                } else {
                  var3 = ((f) this).field_f.field_r.field_g[var2_int].field_a;
                  ((f) this).field_f.field_a[var3] = 25;
                  var2_int++;
                  continue L13;
                }
              }
            }
          }
          L14: {
            L15: {
              if (((f) this).field_k) {
                break L15;
              } else {
                if (~((f) this).field_i > ~((f) this).field_g) {
                  break L15;
                } else {
                  if (99 <= ((f) this).field_x) {
                    break L15;
                  } else {
                    L16: {
                      if (((f) this).field_x % 11 != 0) {
                        break L16;
                      } else {
                        if (!((f) this).field_r.c(param0 + -3186)) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        ((f) this).field_v = (((f) this).field_f.field_k * 2 + 200) * (((f) this).field_x + 1) / 99;
                        if (3 == ((f) this).field_m) {
                          break L18;
                        } else {
                          if (((f) this).field_m != 5) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      ((f) this).field_v = (1 + ((f) this).field_x) * 500 / 99;
                      break L17;
                    }
                    L19: {
                      ((f) this).field_c = 50;
                      if (((f) this).field_x == 0) {
                        ((f) this).field_c = 20;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (1 == ((f) this).field_x) {
                        ((f) this).field_c = 30;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (((f) this).field_x != 2) {
                        break L21;
                      } else {
                        ((f) this).field_c = 40;
                        break L21;
                      }
                    }
                    L22: {
                      if (((f) this).field_x != 3) {
                        break L22;
                      } else {
                        ((f) this).field_c = 45;
                        break L22;
                      }
                    }
                    L23: {
                      L24: {
                        ((f) this).field_c = ((f) this).field_c + ((f) this).field_x / 11 * 2;
                        if (((f) this).field_m == 1) {
                          break L24;
                        } else {
                          if (((f) this).field_m == 2) {
                            break L24;
                          } else {
                            break L23;
                          }
                        }
                      }
                      ((f) this).field_c = ((f) this).field_c - 10;
                      break L23;
                    }
                    L25: {
                      if (((f) this).field_m != 3) {
                        break L25;
                      } else {
                        ((f) this).field_c = ((f) this).field_c * 2;
                        break L25;
                      }
                    }
                    L26: {
                      var2_int = ((f) this).field_c;
                      var3 = 0;
                      var4 = 0;
                      var3 = jc.field_f[((f) this).field_m][((f) this).field_x];
                      if (1 != var3) {
                        break L26;
                      } else {
                        var2_int = var2_int * 3;
                        break L26;
                      }
                    }
                    L27: {
                      if (2 != var3) {
                        break L27;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L27;
                      }
                    }
                    L28: {
                      if (var3 == 3) {
                        var2_int = 2 * var2_int / 3;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (var3 == 4) {
                        var2_int = var2_int * 2 / 3;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (var3 != 5) {
                        break L30;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L30;
                      }
                    }
                    L31: {
                      if (6 != var3) {
                        break L31;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L31;
                      }
                    }
                    L32: {
                      if (7 != var3) {
                        break L32;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L32;
                      }
                    }
                    L33: {
                      if (var3 == 9) {
                        var2_int = var2_int * 2 / 3;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (10 != var3) {
                        break L34;
                      } else {
                        var2_int = var2_int / 8;
                        break L34;
                      }
                    }
                    L35: {
                      if (((f) this).field_x % 11 != 10) {
                        break L35;
                      } else {
                        if (0 < ((f) this).field_x) {
                          var2_int = 1;
                          var4 = 1;
                          int discarded$4 = -11;
                          hf discarded$5 = gk.a(mh.field_a[var3 + 31]);
                          if (var3 == 1) {
                            var2_int = 4;
                            break L35;
                          } else {
                            break L35;
                          }
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      if (0 != ((f) this).field_x % 11) {
                        break L36;
                      } else {
                        if (((f) this).field_x > 0) {
                          L37: {
                            if (((f) this).field_e[0].field_f <= 0) {
                              break L37;
                            } else {
                              if (((f) this).field_m != 0) {
                                break L37;
                              } else {
                                L38: {
                                  ((f) this).field_d = ((f) this).field_d + 1;
                                  if (((f) this).field_d != 1) {
                                    break L38;
                                  } else {
                                    f.a(13, 242, (byte) -25);
                                    break L38;
                                  }
                                }
                                if (3 == ((f) this).field_d) {
                                  f.a(14, 241, (byte) -25);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                          L39: {
                            if (!ok.a(0, false)) {
                              break L39;
                            } else {
                              if (((f) this).field_e[0].field_f <= 0) {
                                break L39;
                              } else {
                                if (jc.field_f[((f) this).field_m][-1 + ((f) this).field_x] == 7) {
                                  f.a(23, 232, (byte) -25);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                            }
                          }
                          df.field_g = df.field_g + ((f) this).field_e[0].field_f * 2;
                          nh.field_b = nh.field_b + ((f) this).field_e[0].field_f;
                          ((f) this).field_e[0].field_d = ((f) this).field_e[0].field_d + ((f) this).field_e[0].field_f;
                          ((f) this).field_e[0].field_f = 0;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L40: {
                      if (1 == ((f) this).field_x) {
                        ((f) this).field_v = ((f) this).field_v + 4;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      if (2 == ((f) this).field_x) {
                        ((f) this).field_v = ((f) this).field_v + 4;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      if (3 == ((f) this).field_x) {
                        ((f) this).field_v = ((f) this).field_v + 4;
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    L43: {
                      if (((f) this).field_x != 33) {
                        break L43;
                      } else {
                        if (((f) this).field_f.field_k == 25) {
                          ((f) this).field_n = true;
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                    }
                    L44: {
                      if (((f) this).field_x != 33) {
                        break L44;
                      } else {
                        if (((f) this).field_f.field_k != 125) {
                          break L44;
                        } else {
                          ((f) this).field_a = true;
                          break L44;
                        }
                      }
                    }
                    L45: {
                      if (((f) this).field_x != 33) {
                        break L45;
                      } else {
                        if (((f) this).field_m != 0) {
                          break L45;
                        } else {
                          f.a(1, 254, (byte) -25);
                          break L45;
                        }
                      }
                    }
                    L46: {
                      if (66 != ((f) this).field_x) {
                        break L46;
                      } else {
                        if (((f) this).field_m != 0) {
                          break L46;
                        } else {
                          f.a(2, 253, (byte) -25);
                          break L46;
                        }
                      }
                    }
                    L47: {
                      if (66 != ((f) this).field_x) {
                        break L47;
                      } else {
                        L48: {
                          if (1 == ((f) this).field_m) {
                            break L48;
                          } else {
                            if (((f) this).field_m != 2) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        f.a(22, 233, (byte) -25);
                        break L47;
                      }
                    }
                    L49: {
                      if (((f) this).field_x != 66) {
                        break L49;
                      } else {
                        if (75 > ((f) this).field_f.field_k) {
                          break L49;
                        } else {
                          if (((f) this).field_m != 0) {
                            break L49;
                          } else {
                            f.a(4, 251, (byte) -25);
                            break L49;
                          }
                        }
                      }
                    }
                    L50: {
                      if (((f) this).field_x != 66) {
                        break L50;
                      } else {
                        if (((f) this).field_f.field_k < 125) {
                          break L50;
                        } else {
                          if (0 == ((f) this).field_m) {
                            f.a(5, 250, (byte) -25);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                      }
                    }
                    L51: {
                      if (66 != ((f) this).field_x) {
                        break L51;
                      } else {
                        if (!((f) this).field_n) {
                          break L51;
                        } else {
                          if (((f) this).field_m != 0) {
                            break L51;
                          } else {
                            f.a(0, 255, (byte) -25);
                            break L51;
                          }
                        }
                      }
                    }
                    L52: {
                      ((f) this).field_x = ((f) this).field_x + 1;
                      ((f) this).field_y = 50;
                      if (((f) this).field_x < 22) {
                        ((f) this).field_v = ((f) this).field_v + (1 + ((f) this).field_x / 11);
                        break L52;
                      } else {
                        ((f) this).field_v = ((f) this).field_v + 2;
                        break L52;
                      }
                    }
                    L53: {
                      ((f) this).field_f.field_n = 1;
                      if (((f) this).field_x % 25 == 24) {
                        var5_int = 0;
                        L54: while (true) {
                          if (((f) this).field_f.field_i <= var5_int) {
                            break L53;
                          } else {
                            ((f) this).field_f.field_v[var5_int] = 0;
                            var5_int++;
                            continue L54;
                          }
                        }
                      } else {
                        break L53;
                      }
                    }
                    var5_int = ((f) this).field_f.field_s.length;
                    var6 = 0;
                    var7_int = 0;
                    L55: while (true) {
                      if (~var2_int >= ~var7_int) {
                        L56: {
                          ((f) this).field_c = ((f) this).field_c + 10;
                          var2_int = 1500;
                          if (((f) this).field_x > 11) {
                            var2_int = 1450;
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        L57: {
                          if (((f) this).field_x <= 22) {
                            break L57;
                          } else {
                            var2_int = 1400;
                            break L57;
                          }
                        }
                        L58: {
                          if (33 >= ((f) this).field_x) {
                            break L58;
                          } else {
                            var2_int = 1350;
                            break L58;
                          }
                        }
                        L59: {
                          if (44 < ((f) this).field_x) {
                            var2_int = 1300;
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L60: {
                          if (((f) this).field_x > 55) {
                            var2_int = 1250;
                            break L60;
                          } else {
                            break L60;
                          }
                        }
                        L61: {
                          if (((f) this).field_x <= 66) {
                            break L61;
                          } else {
                            var2_int = 1200;
                            break L61;
                          }
                        }
                        L62: {
                          if (((f) this).field_x > 88) {
                            var2_int = 1150;
                            break L62;
                          } else {
                            break L62;
                          }
                        }
                        L63: {
                          if (((f) this).field_x >= 99) {
                            break L63;
                          } else {
                            if (jc.field_f[((f) this).field_m][((f) this).field_x] != 0) {
                              break L63;
                            } else {
                              if (((f) this).field_x > 11) {
                                var2_int = var2_int / 2;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        L64: {
                          L65: {
                            if (((f) this).field_m == 1) {
                              break L65;
                            } else {
                              if (((f) this).field_m != 2) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                          var2_int = var2_int * 2;
                          break L64;
                        }
                        ((f) this).field_g = ((f) this).field_g + var2_int;
                        break L14;
                      } else {
                        L66: {
                          L67: {
                            L68: {
                              var6++;
                              if (~var6 > ~((f) this).field_q) {
                                break L68;
                              } else {
                                if (var3 != 1) {
                                  break L67;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            if (var6 < 2) {
                              break L66;
                            } else {
                              if (var4 != 0) {
                                break L66;
                              } else {
                                break L67;
                              }
                            }
                          }
                          var6 = 0;
                          break L66;
                        }
                        L69: {
                          var8 = ((f) this).field_f.field_s[(((f) this).field_x + var6 + -1) % var5_int];
                          var9 = var8 % ((f) this).field_f.field_c;
                          if (var4 == 0) {
                            break L69;
                          } else {
                            if (var3 == 10) {
                              ((f) this).field_v = ((f) this).field_v / 4;
                              break L69;
                            } else {
                              break L69;
                            }
                          }
                        }
                        L70: {
                          var10 = var8 / ((f) this).field_f.field_c;
                          var11 = new pd(var9, var10, (f) this, var3, ((f) this).field_v);
                          ((f) this).field_r.a(param0 ^ -22, (ca) (Object) var11);
                          var11.field_m = 9 * var7_int;
                          var11.field_n = var4 != 0;
                          if (0 == ((f) this).field_x) {
                            var11.field_m = 20 * var7_int;
                            break L70;
                          } else {
                            break L70;
                          }
                        }
                        L71: {
                          if (((f) this).field_x == 1) {
                            var11.field_m = var7_int * 19;
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          if (2 != ((f) this).field_x) {
                            break L72;
                          } else {
                            var11.field_m = 18 * var7_int;
                            break L72;
                          }
                        }
                        L73: {
                          if (((f) this).field_x == 3) {
                            var11.field_m = 17 * var7_int;
                            break L73;
                          } else {
                            break L73;
                          }
                        }
                        L74: {
                          if (((f) this).field_x != 4) {
                            break L74;
                          } else {
                            var11.field_m = 16 * var7_int;
                            break L74;
                          }
                        }
                        L75: {
                          if (((f) this).field_x != 5) {
                            break L75;
                          } else {
                            var11.field_m = var7_int * 15;
                            break L75;
                          }
                        }
                        L76: {
                          if (((f) this).field_x != 6) {
                            break L76;
                          } else {
                            var11.field_m = var7_int * 14;
                            break L76;
                          }
                        }
                        L77: {
                          if (((f) this).field_x != 7) {
                            break L77;
                          } else {
                            var11.field_m = 13 * var7_int;
                            break L77;
                          }
                        }
                        L78: {
                          if (8 != ((f) this).field_x) {
                            break L78;
                          } else {
                            var11.field_m = 12 * var7_int;
                            break L78;
                          }
                        }
                        L79: {
                          if (((f) this).field_x == 9) {
                            var11.field_m = 11 * var7_int;
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        L80: {
                          if (((f) this).field_x != 10) {
                            break L80;
                          } else {
                            var11.field_m = var7_int * 10;
                            break L80;
                          }
                        }
                        L81: {
                          if (var11.field_y == 1) {
                            var11.field_m = var11.field_m / 2;
                            break L81;
                          } else {
                            break L81;
                          }
                        }
                        L82: {
                          if (var4 == 0) {
                            if (25 >= ((f) this).field_x) {
                              break L82;
                            } else {
                              var11.field_o = ((f) this).field_x * var11.field_o / 25;
                              var11.field_l = var11.field_o;
                              break L82;
                            }
                          } else {
                            var11.field_o = var11.field_o * ((f) this).field_c;
                            var11.field_l = var11.field_o;
                            ((f) this).field_e[0].field_f = ((f) this).field_e[0].field_f + (1000 + ((f) this).field_x / 11 * 1000) / var2_int;
                            break L82;
                          }
                        }
                        L83: {
                          if (var11.field_y == 10) {
                            var11.field_m = var11.field_m * 4;
                            break L83;
                          } else {
                            break L83;
                          }
                        }
                        var7_int++;
                        continue L55;
                      }
                    }
                  }
                }
              }
            }
            if (~((f) this).field_g <= ~((f) this).field_i) {
              break L14;
            } else {
              ((f) this).field_g = ((f) this).field_g + 3000;
              break L14;
            }
          }
          var2_int = 0;
          L84: while (true) {
            if (var2_int != 0) {
              var3_ref_oj = (oj) (Object) ((f) this).field_b.b((byte) -112);
              L85: while (true) {
                if (var3_ref_oj == null) {
                  gd.field_c = 0;
                  var3 = 0;
                  var4_ref_pd = (pd) (Object) ((f) this).field_r.b((byte) 114);
                  L86: while (true) {
                    if (var4_ref_pd == null) {
                      L87: {
                        if (var3 == 0) {
                          break L87;
                        } else {
                          var4_ref_pd = (pd) (Object) ((f) this).field_r.b((byte) 115);
                          L88: while (true) {
                            if (null == var4_ref_pd) {
                              break L87;
                            } else {
                              L89: {
                                if (var4_ref_pd.field_m < 0) {
                                  var4_ref_pd.field_m = 0;
                                  break L89;
                                } else {
                                  break L89;
                                }
                              }
                              var4_ref_pd = (pd) (Object) ((f) this).field_r.d(853);
                              continue L88;
                            }
                          }
                        }
                      }
                      L90: {
                        if (gd.field_c < 30) {
                          break L90;
                        } else {
                          f.a(19, 236, (byte) -25);
                          break L90;
                        }
                      }
                      L91: {
                        ((f) this).field_e[0].a(param0 ^ 98);
                        if (param0 == 98) {
                          break L91;
                        } else {
                          ((f) this).field_c = 91;
                          break L91;
                        }
                      }
                      var4 = 0;
                      var5_ref = (kb) (Object) ((f) this).field_o.b((byte) -96);
                      L92: while (true) {
                        if (var5_ref == null) {
                          L93: {
                            if (var4 < 250) {
                              break L93;
                            } else {
                              f.a(18, 237, (byte) -25);
                              break L93;
                            }
                          }
                          ((f) this).a(-1);
                          var5 = (pd) (Object) ((f) this).field_r.d((byte) -122);
                          L94: while (true) {
                            if (null == var5) {
                              var5_ref2 = (oj) (Object) ((f) this).field_b.d((byte) -122);
                              L95: while (true) {
                                if (var5_ref2 == null) {
                                  return;
                                } else {
                                  L96: {
                                    if (200 > var5_ref2.field_g) {
                                      break L96;
                                    } else {
                                      var5_ref2.b(57);
                                      break L96;
                                    }
                                  }
                                  var5_ref2 = (oj) (Object) ((f) this).field_b.b(10708);
                                  continue L95;
                                }
                              }
                            } else {
                              L97: {
                                if (var5.field_o <= 0) {
                                  L98: {
                                    var5.field_o = 0;
                                    if (((f) this).field_f.field_m[var5.field_t]) {
                                      ((f) this).field_f.field_m[var5.field_t] = false;
                                      break L98;
                                    } else {
                                      break L98;
                                    }
                                  }
                                  L99: {
                                    var5.b(57);
                                    if (var5.field_y != 10) {
                                      break L99;
                                    } else {
                                      ((f) this).field_f.field_m[var5.field_t] = true;
                                      var6 = 0;
                                      L100: while (true) {
                                        if (var6 >= 4) {
                                          break L99;
                                        } else {
                                          var7 = new pd(var5.field_u, var5.field_z, (f) this, 11, 10);
                                          var7.field_l = var5.field_l / 4;
                                          var7.field_o = var7.field_l;
                                          ((f) this).field_r.a(param0 + -212, (ca) (Object) var7);
                                          var6++;
                                          continue L100;
                                        }
                                      }
                                    }
                                  }
                                  if (var5.field_y == 11) {
                                    ((f) this).field_f.field_m[var5.field_t] = true;
                                    var6 = 0;
                                    L101: while (true) {
                                      if (var6 >= 4) {
                                        break L97;
                                      } else {
                                        L102: {
                                          var7 = new pd(var5.field_u, var5.field_z, (f) this, 1, 10);
                                          var7.field_l = var5.field_l / 4;
                                          if (var7.field_l == 0) {
                                            var7.field_l = 1;
                                            break L102;
                                          } else {
                                            break L102;
                                          }
                                        }
                                        var7.field_o = var7.field_l;
                                        ((f) this).field_r.a(-104, (ca) (Object) var7);
                                        var6++;
                                        continue L101;
                                      }
                                    }
                                  } else {
                                    break L97;
                                  }
                                } else {
                                  break L97;
                                }
                              }
                              var5 = (pd) (Object) ((f) this).field_r.b(param0 + 10610);
                              continue L94;
                            }
                          }
                        } else {
                          L103: {
                            var5_ref.a((byte) 89);
                            if (var5_ref.field_C != 5) {
                              break L103;
                            } else {
                              var6 = var5_ref.f(param0 ^ 52);
                              var4 = var4 + var6;
                              break L103;
                            }
                          }
                          var5_ref = (kb) (Object) ((f) this).field_o.d(param0 + 755);
                          continue L92;
                        }
                      }
                    } else {
                      L104: {
                        var4_ref_pd.c(1);
                        if (var4_ref_pd.field_m >= -12000) {
                          break L104;
                        } else {
                          f.a(20, 235, (byte) -25);
                          break L104;
                        }
                      }
                      L105: {
                        if (((f) this).field_f.field_o[var4_ref_pd.field_t] == 6) {
                          L106: {
                            L107: {
                              if (!ob.field_F) {
                                break L107;
                              } else {
                                if (2 > va.field_d) {
                                  break L107;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            var5_int = ((f) this).field_f.field_j[var4_ref_pd.field_t];
                            var6 = var5_int % 8;
                            var7_int = (var5_int - var6) / 8;
                            var7_int -= 6;
                            var6 -= 3;
                            ((f) this).field_f.a((byte) -117, ((f) this).field_f.field_c * (-var7_int + 2) + 2 + (-var6 + var4_ref_pd.field_t));
                            var8 = 0;
                            L108: while (true) {
                              if (var8 >= 5) {
                                if (var4_ref_pd.field_y == 8) {
                                  break L106;
                                } else {
                                  ((f) this).field_e[0].field_f = 0;
                                  break L106;
                                }
                              } else {
                                var9 = 0;
                                L109: while (true) {
                                  if (var9 >= 5) {
                                    var8++;
                                    continue L108;
                                  } else {
                                    var10 = (var9 + -var7_int) * ((f) this).field_f.field_c + (var4_ref_pd.field_t + var8) - var6;
                                    ((f) this).field_f.field_o[var10] = 10;
                                    ((f) this).field_f.field_j[var10] = ((f) this).field_f.field_j[var10] + 40;
                                    ((f) this).field_h.a(-83, (ca) (Object) new me((double)(var10 % ((f) this).field_f.field_c), (double)(var10 / ((f) this).field_f.field_c), 1));
                                    var9++;
                                    continue L109;
                                  }
                                }
                              }
                            }
                          }
                          L110: {
                            if (var4_ref_pd.field_y == 8) {
                              break L110;
                            } else {
                              var4_ref_pd.field_o = 0;
                              break L110;
                            }
                          }
                          int discarded$6 = -11;
                          hf discarded$7 = gk.a(mh.field_a[55]);
                          hd.field_j = fd.field_d;
                          wl.field_a = 320;
                          md.field_f = 240;
                          var3 = 1;
                          break L105;
                        } else {
                          break L105;
                        }
                      }
                      var4_ref_pd = (pd) (Object) ((f) this).field_r.d(853);
                      continue L86;
                    }
                  }
                } else {
                  var3_ref_oj.a((byte) 44);
                  var3_ref_oj = (oj) (Object) ((f) this).field_b.d(853);
                  continue L85;
                }
              }
            } else {
              var2_int = 1;
              var3_ref_ca = ((f) this).field_r.field_d.field_e;
              L111: while (true) {
                L112: {
                  if (((f) this).field_r.field_d == var3_ref_ca) {
                    break L112;
                  } else {
                    if (((f) this).field_r.field_d == var3_ref_ca.field_e) {
                      break L112;
                    } else {
                      L113: {
                        L114: {
                          var4_ref_pd = (pd) (Object) var3_ref_ca.field_e;
                          var5 = (pd) (Object) var3_ref_ca;
                          if (~var5.field_z < ~var4_ref_pd.field_z) {
                            break L114;
                          } else {
                            if (~var5.field_u >= ~var4_ref_pd.field_u) {
                              break L113;
                            } else {
                              if (var4_ref_pd.field_z != var5.field_z) {
                                break L113;
                              } else {
                                break L114;
                              }
                            }
                          }
                        }
                        L115: {
                          if (var5.field_y == 4) {
                            break L115;
                          } else {
                            if (var4_ref_pd.field_y != 4) {
                              break L115;
                            } else {
                              break L113;
                            }
                          }
                        }
                        var5.field_e = var4_ref_pd.field_e;
                        var4_ref_pd.field_c = var5.field_c;
                        var4_ref_pd.field_e = (ca) (Object) var5;
                        var5.field_c = (ca) (Object) var4_ref_pd;
                        var5.field_e.field_c = (ca) (Object) var5;
                        var4_ref_pd.field_c.field_e = (ca) (Object) var4_ref_pd;
                        var2_int = 0;
                        break L113;
                      }
                      var3_ref_ca = var3_ref_ca.field_e;
                      continue L111;
                    }
                  }
                }
                continue L84;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        try {
            if (param0 != -4) {
                ((f) this).field_x = 36;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "f.J(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 1 << param0;
            if ((lb.field_g & var3_int) == 0) {
              dm.field_f = dm.field_f | var3_int;
              L1: {
                lb.field_g = lb.field_g | var3_int;
                oj.field_r.a(-74, (ca) (Object) new kg(param0));
                if (!fc.field_d) {
                  pe.field_b.a(-105, (ca) (Object) new ha(param0, param1, bc.field_r, mm.field_C, a.field_r, nh.field_b + -wf.field_c.field_e[0].field_d));
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "f.M(" + param0 + 44 + param1 + 44 + -25 + 41);
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "f.F(" + -69 + 41);
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        kb var2_ref = null;
        km var3_ref_km = null;
        int var3 = 0;
        int var4 = 0;
        kb var4_ref_kb = null;
        kb var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        kb stackIn_14_0 = null;
        kb stackIn_14_1 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_12_0 = null;
        kb stackOut_12_1 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_ref = (kb) (Object) ((f) this).field_o.b((byte) 127);
            L1: while (true) {
              if (var2_ref == null) {
                L2: {
                  if (param0 == -1) {
                    break L2;
                  } else {
                    ((f) this).field_e = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  L4: {
                    if (((f) this).field_f.field_o[var2_ref.field_h * ((f) this).field_f.field_c + var2_ref.field_g] != 7) {
                      break L4;
                    } else {
                      if (-1 == var2_ref.field_C) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var2_ref.field_F <= 0) {
                    L5: {
                      if (null != var2_ref.field_s) {
                        var3_ref_km = new km(((f) this).field_o);
                        var4 = 0;
                        var5 = (kb) (Object) var3_ref_km.d(27935);
                        L6: while (true) {
                          L7: {
                            if (var5 == null) {
                              break L7;
                            } else {
                              L8: {
                                if (var5 == var2_ref) {
                                  break L8;
                                } else {
                                  if (var2_ref.field_s != var5.field_s) {
                                    break L8;
                                  } else {
                                    var4 = 1;
                                    break L7;
                                  }
                                }
                              }
                              var5 = (kb) (Object) var3_ref_km.b(true);
                              continue L6;
                            }
                          }
                          if (var4 != 0) {
                            break L5;
                          } else {
                            var2_ref.field_s.d(param0 ^ -10);
                            var2_ref.field_s.field_C = -1;
                            break L5;
                          }
                        }
                      } else {
                        var3_ref_km = new km(((f) this).field_o);
                        var4_ref_kb = (kb) (Object) var3_ref_km.d(27935);
                        L9: while (true) {
                          if (var4_ref_kb == null) {
                            break L5;
                          } else {
                            L10: {
                              if (var2_ref == var4_ref_kb) {
                                break L10;
                              } else {
                                if (var2_ref != var4_ref_kb.field_s) {
                                  break L10;
                                } else {
                                  var4_ref_kb.d(param0 ^ -10);
                                  var4_ref_kb.field_C = -1;
                                  break L10;
                                }
                              }
                            }
                            var4_ref_kb = (kb) (Object) var3_ref_km.b(true);
                            continue L9;
                          }
                        }
                      }
                    }
                    var2_ref.c(1);
                    var2_ref.field_C = -1;
                    var2_ref.b(57);
                    var3 = -1 + var2_ref.field_g;
                    L11: while (true) {
                      if (~var3 < ~(1 + var2_ref.field_g)) {
                        break L3;
                      } else {
                        var4 = -1 + var2_ref.field_h;
                        L12: while (true) {
                          if (~var4 < ~(var2_ref.field_h - -1)) {
                            var3++;
                            continue L11;
                          } else {
                            L13: {
                              if (((f) this).field_f.field_o[((f) this).field_f.field_c * var4 + var3] == 1) {
                                ((f) this).field_f.field_j[var4 * ((f) this).field_f.field_c + var3] = 0;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var4++;
                            continue L12;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_12_0 = (kb) var2_ref;
                    stackOut_12_1 = (kb) var2_ref;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_0.field_F = stackIn_14_1.field_F - 1;
                    var3 = oj.a((byte) 47, var2_ref.field_C);
                    var4 = 0;
                    L14: while (true) {
                      if (~var4 <= ~var3) {
                        var2_ref.b(0, var2_ref.field_h, var2_ref.field_g);
                        break L3;
                      } else {
                        var5_int = 0;
                        L15: while (true) {
                          if (~var3 >= ~var5_int) {
                            var4++;
                            continue L14;
                          } else {
                            var6 = ((f) this).field_f.field_c * (var2_ref.field_h + var5_int) + var2_ref.field_g + var4;
                            ((f) this).field_f.field_o[var6] = 7;
                            ((f) this).field_f.field_j[var6] = 29;
                            var5_int++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                }
                var2_ref = (kb) (Object) ((f) this).field_o.d(853);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "f.B(" + param0 + 41);
        }
    }

    final static void a(ki param0) {
        hj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2 = new hj(param0.a("", 1, "final_frame.jpg"), (java.awt.Component) (Object) tf.field_f);
            var3 = var2.field_o;
            var4 = var2.field_k;
            h.k(122);
            t.field_j = new hj(var3, var4 * 3 / 4);
            t.field_j.d();
            var2.b(0, 0);
            fd.field_a = new hj(var3, -t.field_j.field_k + var4);
            fd.field_a.d();
            var2.b(0, -t.field_j.field_k);
            fd.field_a.field_u = t.field_j.field_k;
            int discarded$1 = -105;
            oc.g();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("f.H(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -17763 + 41);
        }
    }

    final static wd a(se param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wd stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.h(8, 8);
            if (0 >= var2_int) {
              L1: {
                var3 = eg.a(param0, 26678) ? 1 : 0;
                var4 = eg.a(param0, 26678) ? 1 : 0;
                var5 = new wd();
                var5.field_c = (short)param0.h(16, 8);
                var5.field_R = ca.a(var5.field_R, 16, false, param0);
                var5.field_x = ca.a(var5.field_x, 16, false, param0);
                var5.field_Q = ca.a(var5.field_Q, 16, false, param0);
                var5.field_u = (short)param0.h(16, 8);
                var5.field_M = ca.a(var5.field_M, 16, false, param0);
                var5.field_e = ca.a(var5.field_e, 16, false, param0);
                var5.field_l = ca.a(var5.field_l, 16, false, param0);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_w = (short)param0.h(16, 8);
                  var5.field_K = ca.a(var5.field_K, 16, false, param0);
                  var5.field_H = ca.a(var5.field_H, 16, false, param0);
                  var5.field_G = ca.a(var5.field_G, 16, false, param0);
                  var5.field_q = ca.a(var5.field_q, 16, false, param0);
                  var5.field_y = ca.a(var5.field_y, 16, false, param0);
                  var5.field_i = ca.a(var5.field_i, 16, false, param0);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$3 = param0.h(16, 8);
                  var5.field_n = ca.a(var5.field_n, 16, false, param0);
                  var5.field_B = ca.a(var5.field_B, 16, false, param0);
                  var5.field_h = ca.a(var5.field_h, 16, false, param0);
                  var5.field_s = ca.a(var5.field_s, 16, false, param0);
                  var5.field_a = ca.a(var5.field_a, 16, false, param0);
                  break L2;
                }
              }
              L3: {
                if (eg.a(param0, 26678)) {
                  var5.field_N = ca.a(var5.field_N, 16, false, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!eg.a(param0, 26678)) {
                  break L4;
                } else {
                  int discarded$4 = 20783;
                  int discarded$5 = 16;
                  var5.field_t = aa.a(param0, var5.field_t);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (~var5.field_t.length >= ~var7) {
                      if (0 != var6) {
                        var5.field_m = (byte)(var6 + 1);
                        break L4;
                      } else {
                        var5.field_t = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if (~var6 > ~(var5.field_t[var7] & 255)) {
                          var6 = var5.field_t[var7] & 255;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_29_0 = (wd) var5;
              stackIn_30_0 = stackOut_29_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("f.D(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + 16 + 41);
        }
        return stackIn_30_0;
    }

    final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        kb var2_ref = null;
        me var2_ref2 = null;
        me var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (~((f) this).field_q >= ~var2_int) {
                var2_ref = (kb) (Object) ((f) this).field_o.b((byte) 127);
                L2: while (true) {
                  if (null == var2_ref) {
                    var2_int = -34 / ((param0 - 40) / 60);
                    var3 = (me) (Object) ((f) this).field_h.b((byte) 126);
                    L3: while (true) {
                      if (var3 == null) {
                        var2_ref2 = (me) (Object) ((f) this).field_h.b((byte) -96);
                        L4: while (true) {
                          if (var2_ref2 == null) {
                            break L0;
                          } else {
                            L5: {
                              if (var2_ref2.field_m == -1) {
                                var2_ref2.b(57);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var2_ref2 = (me) (Object) ((f) this).field_h.d(853);
                            continue L4;
                          }
                        }
                      } else {
                        var3.a((byte) 32);
                        var3 = (me) (Object) ((f) this).field_h.d(853);
                        continue L3;
                      }
                    }
                  } else {
                    var2_ref.e(123);
                    var2_ref = (kb) (Object) ((f) this).field_o.d(853);
                    continue L2;
                  }
                }
              } else {
                ((f) this).field_e[var2_int].b((byte) 85);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "f.E(" + param0 + 41);
        }
    }

    final kb a(int param0, int param1) {
        kb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb stackIn_12_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        kb stackOut_11_0 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3 = (kb) (Object) ((f) this).field_o.b((byte) 119);
            var4 = -127 % ((-2 - param1) / 44);
            L1: while (true) {
              if (null == var3) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L2: {
                  var5 = oj.a((byte) 47, var3.field_C);
                  if (var3.field_C != -1) {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var5) {
                        break L2;
                      } else {
                        var7 = 0;
                        L4: while (true) {
                          if (~var5 >= ~var7) {
                            var6++;
                            continue L3;
                          } else {
                            if (~(var7 * ((f) this).field_f.field_c + var6 + var3.field_w) == ~param0) {
                              stackOut_11_0 = (kb) var3;
                              stackIn_12_0 = stackOut_11_0;
                              return stackIn_12_0;
                            } else {
                              var7++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var3 = (kb) (Object) ((f) this).field_o.d(853);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3_ref, "f.K(" + param0 + 44 + param1 + 41);
        }
        return (kb) (Object) stackIn_17_0;
    }

    final static sh a(boolean param0, long param1, String param2, int param3, String param4) {
        RuntimeException var6 = null;
        hh stackIn_8_0 = null;
        ii stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_7_0 = null;
        ii stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != 0L) {
                break L1;
              } else {
                if (param2 == null) {
                  break L1;
                } else {
                  stackOut_7_0 = new hh(param2, param4);
                  stackIn_8_0 = stackOut_7_0;
                  return (sh) (Object) stackIn_8_0;
                }
              }
            }
            stackOut_13_0 = new ii(param1, param4);
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("f.C(").append(0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(17470).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return (sh) (Object) stackIn_14_0;
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var5 = -69 % ((param2 - 42) / 59);
              if (ld.field_e == null) {
                break L1;
              } else {
                if (!ld.field_e.equals((Object) (Object) param0.getParameter("settings"))) {
                  var3 = (Object) (Object) ld.field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var4 = null;
              if (pc.field_ab == null) {
                break L2;
              } else {
                if (pc.field_ab.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) pc.field_ab;
                  break L2;
                }
              }
            }
            int discarded$2 = 72;
            stackOut_12_0 = lj.a((String) var3, param1, -1, (String) var4);
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_14_0 = var3;
            stackOut_14_1 = new StringBuilder().append("f.N(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    final static void a(int param0, ha param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            oa.field_d.a(-114, (ca) (Object) param1);
            int discarded$3 = 4;
            tl.a(-127, param1);
            var3_int = -75;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("f.G(").append(4).append(44);
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + -4 + 41);
        }
    }

    f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        ((f) this).field_t = 0;
        ((f) this).field_u = 0;
        ((f) this).field_d = 0;
        ((f) this).field_a = false;
        ((f) this).field_p = 0;
        ((f) this).field_y = 0;
        ((f) this).field_n = false;
        ((f) this).field_l = 0;
        ((f) this).field_s = 0;
        ((f) this).field_v = 4;
        try {
          L0: {
            ((f) this).field_m = param0;
            ((f) this).field_f = new kd(am.field_d[param0]);
            ((f) this).field_r = new im();
            ((f) this).field_o = new im();
            ((f) this).field_h = new im();
            ((f) this).field_b = new im();
            ((f) this).field_q = 1;
            ((f) this).field_e = new lb[((f) this).field_q];
            var2_int = 0;
            L1: while (true) {
              if (((f) this).field_q <= var2_int) {
                ((f) this).field_g = 3000;
                ((f) this).field_x = 0;
                ((f) this).field_i = 0;
                ((f) this).field_c = 100;
                ((f) this).field_f.field_n = 0;
                ((f) this).field_f.a((byte) 100);
                break L0;
              } else {
                L2: {
                  ((f) this).field_e[var2_int] = new lb((f) this, var2_int);
                  ((f) this).field_e[var2_int].field_j = ((f) this).field_f.field_c / 2;
                  ((f) this).field_e[var2_int].field_c = ((f) this).field_f.field_t / 2;
                  if (var2_int != 0) {
                    break L2;
                  } else {
                    ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j - 4;
                    ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c - 2;
                    break L2;
                  }
                }
                L3: {
                  if (1 == var2_int) {
                    ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j + 2;
                    ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c - 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var2_int != 2) {
                    break L4;
                  } else {
                    ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j - 2;
                    ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c + 2;
                    break L4;
                  }
                }
                L5: {
                  if (3 == var2_int) {
                    ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j + 2;
                    ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c + 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "f.<init>(" + param0 + 41);
        }
    }

    static {
    }
}
